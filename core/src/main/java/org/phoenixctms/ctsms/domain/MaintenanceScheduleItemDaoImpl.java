// Generated by: hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.phoenixctms.ctsms.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.phoenixctms.ctsms.adapt.ReminderEntityAdapter;
import org.phoenixctms.ctsms.query.CriteriaUtil;
import org.phoenixctms.ctsms.query.SubCriteriaMap;
import org.phoenixctms.ctsms.util.L10nUtil;
import org.phoenixctms.ctsms.util.L10nUtil.Locales;
import org.phoenixctms.ctsms.vo.InventoryOutVO;
import org.phoenixctms.ctsms.vo.MaintenanceScheduleItemInVO;
import org.phoenixctms.ctsms.vo.MaintenanceScheduleItemOutVO;
import org.phoenixctms.ctsms.vo.MaintenanceTypeVO;
import org.phoenixctms.ctsms.vo.PSFVO;
import org.phoenixctms.ctsms.vo.StaffOutVO;
import org.phoenixctms.ctsms.vo.UserOutVO;
import org.phoenixctms.ctsms.vo.VariablePeriodVO;

/**
 * @see MaintenanceScheduleItem
 */
public class MaintenanceScheduleItemDaoImpl
		extends MaintenanceScheduleItemDaoBase {

	private org.hibernate.Criteria createMaintenanceItemCriteria() {
		org.hibernate.Criteria maintenanceItemCriteria = this.getSession().createCriteria(MaintenanceScheduleItem.class);
		return maintenanceItemCriteria;
	}

	@Override
	protected Collection<MaintenanceScheduleItem> handleFindByCompanyContact(
			Long companyContactId, PSFVO psf) throws Exception {
		Criteria maintenanceItemCriteria = createMaintenanceItemCriteria();
		SubCriteriaMap criteriaMap = new SubCriteriaMap(MaintenanceScheduleItem.class, maintenanceItemCriteria);
		if (companyContactId != null) {
			maintenanceItemCriteria.add(Restrictions.eq("companyContact.id", companyContactId.longValue()));
		}
		CriteriaUtil.applyPSFVO(criteriaMap, psf);
		return maintenanceItemCriteria.list();
	}

	/**
	 * @throws Exception
	 * @inheritDoc
	 */
	@Override
	protected Collection<MaintenanceScheduleItem> handleFindByInventoryActive(Long inventoryId, Boolean active, PSFVO psf) throws Exception {
		Criteria maintenanceItemCriteria = createMaintenanceItemCriteria();
		SubCriteriaMap criteriaMap = new SubCriteriaMap(MaintenanceScheduleItem.class, maintenanceItemCriteria);
		if (inventoryId != null) {
			maintenanceItemCriteria.add(Restrictions.eq("inventory.id", inventoryId.longValue()));
		}
		if (active != null) {
			maintenanceItemCriteria.add(Restrictions.eq("active", active.booleanValue()));
		}
		CriteriaUtil.applyPSFVO(criteriaMap, psf);
		return maintenanceItemCriteria.list();
	}

	@Override
	protected Collection<MaintenanceScheduleItem> handleFindByResponsiblePerson(
			Long responsiblePersonId, PSFVO psf) throws Exception {
		Criteria maintenanceItemCriteria = createMaintenanceItemCriteria();
		SubCriteriaMap criteriaMap = new SubCriteriaMap(MaintenanceScheduleItem.class, maintenanceItemCriteria);
		if (responsiblePersonId != null) {
			maintenanceItemCriteria.add(Restrictions.eq("responsiblePerson.id", responsiblePersonId.longValue()));
		}
		CriteriaUtil.applyPSFVO(criteriaMap, psf);
		return maintenanceItemCriteria.list();
	}

	@Override
	protected Collection<MaintenanceScheduleItem> handleFindMaintenanceInterval(
			Long inventoryId, Long departmentId,
			Long inventoryCategoryId, Long responsiblePersonId,
			Boolean reminder, Timestamp from, Timestamp to) throws Exception {
		Criteria maintenanceItemCriteria = createMaintenanceItemCriteria();
		if (inventoryId != null || departmentId != null || inventoryCategoryId != null) {
			Criteria inventoryCriteria = maintenanceItemCriteria.createCriteria("inventory", CriteriaSpecification.INNER_JOIN);
			if (inventoryId != null) {
				inventoryCriteria.add(Restrictions.idEq(inventoryId.longValue()));
			}
			if (departmentId != null) {
				inventoryCriteria.add(Restrictions.eq("department.id", departmentId.longValue()));
			}
			if (inventoryCategoryId != null) {
				inventoryCriteria.add(Restrictions.eq("category.id", inventoryCategoryId.longValue()));
			}
		}
		if (responsiblePersonId != null) {
			maintenanceItemCriteria.add(Restrictions.eq("responsiblePerson.id", responsiblePersonId.longValue()));
		}
		maintenanceItemCriteria.add(Restrictions.eq("active", true)); // performance only...
		return CriteriaUtil.listEvents(maintenanceItemCriteria, from, to, reminder);
	}

	@Override
	protected Collection<MaintenanceScheduleItem> handleFindMaintenanceSchedule(
			Date today, Long inventoryId, Long departmentId,
			Long inventoryCategoryId, Long responsiblePersonId,
			Boolean reminder, boolean includeAlreadyPassed, PSFVO psf) throws Exception {
		Criteria maintenanceItemCriteria = createMaintenanceItemCriteria();
		SubCriteriaMap criteriaMap = new SubCriteriaMap(MaintenanceScheduleItem.class, maintenanceItemCriteria);
		if (inventoryId != null) {
			maintenanceItemCriteria.add(Restrictions.eq("inventory.id", inventoryId));
		}
		if (departmentId != null) {
			criteriaMap.createCriteria("inventory").add(Restrictions.eq("department.id", departmentId));
		}
		if (inventoryCategoryId != null) {
			criteriaMap.createCriteria("inventory").add(Restrictions.eq("category.id", inventoryCategoryId));
		}
		if (responsiblePersonId != null) {
			maintenanceItemCriteria.add(Restrictions.eq("responsiblePerson.id", responsiblePersonId));
		}
		maintenanceItemCriteria.add(Restrictions.eq("active", true)); // performance only...
		if (psf != null) {
			PSFVO sorterFilter = new PSFVO();
			sorterFilter.setFilters(psf.getFilters());
			sorterFilter.setSortField(psf.getSortField());
			sorterFilter.setSortOrder(psf.getSortOrder());
			CriteriaUtil.applyPSFVO(criteriaMap, sorterFilter);
		}
		ArrayList<MaintenanceScheduleItem> resultSet = CriteriaUtil.listReminders(maintenanceItemCriteria, today, reminder, includeAlreadyPassed, null, null);
		return CriteriaUtil.applyPVO(resultSet, psf, false); // no dupes by default
	}

	@Override
	protected long handleGetCount(Long inventoryId, Boolean active) throws Exception {
		Criteria maintenanceItemCriteria = createMaintenanceItemCriteria();
		if (inventoryId != null) {
			maintenanceItemCriteria.add(Restrictions.eq("inventory.id", inventoryId.longValue()));
		}
		if (active != null) {
			maintenanceItemCriteria.add(Restrictions.eq("active", active.booleanValue()));
		}
		return (Long) maintenanceItemCriteria.setProjection(Projections.rowCount()).uniqueResult();
	}

	/**
	 * Retrieves the entity object that is associated with the specified value object
	 * from the object store. If no such entity object exists in the object store,
	 * a new, blank entity is created
	 */
	private MaintenanceScheduleItem loadMaintenanceScheduleItemFromMaintenanceScheduleItemInVO(MaintenanceScheduleItemInVO maintenanceScheduleItemInVO) {
		MaintenanceScheduleItem maintenanceScheduleItem = null;
		Long id = maintenanceScheduleItemInVO.getId();
		if (id != null) {
			maintenanceScheduleItem = this.load(id);
		}
		if (maintenanceScheduleItem == null) {
			maintenanceScheduleItem = MaintenanceScheduleItem.Factory.newInstance();
		}
		return maintenanceScheduleItem;
	}

	/**
	 * Retrieves the entity object that is associated with the specified value object
	 * from the object store. If no such entity object exists in the object store,
	 * a new, blank entity is created
	 */
	private MaintenanceScheduleItem loadMaintenanceScheduleItemFromMaintenanceScheduleItemOutVO(MaintenanceScheduleItemOutVO maintenanceScheduleItemOutVO) {
		MaintenanceScheduleItem maintenanceScheduleItem = this.load(maintenanceScheduleItemOutVO.getId());
		if (maintenanceScheduleItem == null) {
			maintenanceScheduleItem = MaintenanceScheduleItem.Factory.newInstance();
		}
		return maintenanceScheduleItem;
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public MaintenanceScheduleItem maintenanceScheduleItemInVOToEntity(MaintenanceScheduleItemInVO maintenanceScheduleItemInVO) {
		MaintenanceScheduleItem entity = this.loadMaintenanceScheduleItemFromMaintenanceScheduleItemInVO(maintenanceScheduleItemInVO);
		this.maintenanceScheduleItemInVOToEntity(maintenanceScheduleItemInVO, entity, true);
		return entity;
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public void maintenanceScheduleItemInVOToEntity(
			MaintenanceScheduleItemInVO source,
			MaintenanceScheduleItem target,
			boolean copyIfNull) {
		super.maintenanceScheduleItemInVOToEntity(source, target, copyIfNull);
		Long companyContactId = source.getCompanyContactId();
		Long responsiblePersonId = source.getResponsiblePersonId();
		Long inventoryId = source.getInventoryId();
		Long typeId = source.getTypeId();
		if (companyContactId != null) {
			Staff companyContact = this.getStaffDao().load(companyContactId);
			target.setCompanyContact(companyContact);
			companyContact.addCompanyContactMaintenanceItems(target);
		} else if (copyIfNull) {
			Staff companyContact = target.getCompanyContact();
			target.setCompanyContact(null);
			if (companyContact != null) {
				companyContact.removeCompanyContactMaintenanceItems(target);
			}
		}
		if (responsiblePersonId != null) {
			Staff responsiblePerson = this.getStaffDao().load(responsiblePersonId);
			target.setResponsiblePerson(responsiblePerson);
			responsiblePerson.addResponsiblePersonMaintenanceItems(target);
		} else if (copyIfNull) {
			Staff responsiblePerson = target.getResponsiblePerson();
			target.setResponsiblePerson(null);
			if (responsiblePerson != null) {
				responsiblePerson.removeResponsiblePersonMaintenanceItems(target);
			}
		}
		if (inventoryId != null) {
			Inventory inventory = this.getInventoryDao().load(inventoryId);
			target.setInventory(inventory);
			inventory.addMaintenanceScheduleItems(target);
		} else if (copyIfNull) {
			Inventory inventory = target.getInventory();
			target.setInventory(null);
			if (inventory != null) {
				inventory.removeMaintenanceScheduleItems(target);
			}
		}
		if (typeId != null) {
			target.setType(this.getMaintenanceTypeDao().load(typeId));
		} else if (copyIfNull) {
			target.setType(null);
		}
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public MaintenanceScheduleItem maintenanceScheduleItemOutVOToEntity(MaintenanceScheduleItemOutVO maintenanceScheduleItemOutVO) {
		MaintenanceScheduleItem entity = this.loadMaintenanceScheduleItemFromMaintenanceScheduleItemOutVO(maintenanceScheduleItemOutVO);
		this.maintenanceScheduleItemOutVOToEntity(maintenanceScheduleItemOutVO, entity, true);
		return entity;
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public void maintenanceScheduleItemOutVOToEntity(
			MaintenanceScheduleItemOutVO source,
			MaintenanceScheduleItem target,
			boolean copyIfNull) {
		super.maintenanceScheduleItemOutVOToEntity(source, target, copyIfNull);
		StaffOutVO companyContactVO = source.getCompanyContact();
		StaffOutVO responsiblePersonVO = source.getResponsiblePerson();
		InventoryOutVO inventoryVO = source.getInventory();
		MaintenanceTypeVO typeVO = source.getType();
		UserOutVO modifiedUserVO = source.getModifiedUser();
		VariablePeriodVO recurrencePeriodVO = source.getRecurrencePeriod();
		VariablePeriodVO reminderPeriodVO = source.getReminderPeriod();
		if (companyContactVO != null) {
			Staff companyContact = this.getStaffDao().staffOutVOToEntity(companyContactVO);
			target.setCompanyContact(companyContact);
			companyContact.addCompanyContactMaintenanceItems(target);
		} else if (copyIfNull) {
			Staff companyContact = target.getCompanyContact();
			target.setCompanyContact(null);
			if (companyContact != null) {
				companyContact.removeCompanyContactMaintenanceItems(target);
			}
		}
		if (responsiblePersonVO != null) {
			Staff responsiblePerson = this.getStaffDao().staffOutVOToEntity(responsiblePersonVO);
			target.setResponsiblePerson(responsiblePerson);
			responsiblePerson.addResponsiblePersonMaintenanceItems(target);
		} else if (copyIfNull) {
			Staff responsiblePerson = target.getResponsiblePerson();
			target.setResponsiblePerson(null);
			if (responsiblePerson != null) {
				responsiblePerson.removeResponsiblePersonMaintenanceItems(target);
			}
		}
		if (inventoryVO != null) {
			Inventory inventory = this.getInventoryDao().inventoryOutVOToEntity(inventoryVO);
			target.setInventory(inventory);
			inventory.addMaintenanceScheduleItems(target);
		} else if (copyIfNull) {
			Inventory inventory = target.getInventory();
			target.setInventory(null);
			if (inventory != null) {
				inventory.removeMaintenanceScheduleItems(target);
			}
		}
		if (typeVO != null) {
			target.setType(this.getMaintenanceTypeDao().maintenanceTypeVOToEntity(typeVO));
		} else if (copyIfNull) {
			target.setType(null);
		}
		if (modifiedUserVO != null) {
			target.setModifiedUser(this.getUserDao().userOutVOToEntity(modifiedUserVO));
		} else if (copyIfNull) {
			target.setModifiedUser(null);
		}
		if (recurrencePeriodVO != null) {
			target.setRecurrencePeriod(recurrencePeriodVO.getPeriod());
		} else if (copyIfNull) {
			target.setRecurrencePeriod(null);
		}
		if (reminderPeriodVO != null) {
			target.setReminderPeriod(reminderPeriodVO.getPeriod());
		} else if (copyIfNull) {
			target.setReminderPeriod(null);
		}
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public MaintenanceScheduleItemInVO toMaintenanceScheduleItemInVO(final MaintenanceScheduleItem entity) {
		return super.toMaintenanceScheduleItemInVO(entity);
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public void toMaintenanceScheduleItemInVO(
			MaintenanceScheduleItem source,
			MaintenanceScheduleItemInVO target) {
		super.toMaintenanceScheduleItemInVO(source, target);
		Staff companyContact = source.getCompanyContact();
		Staff responsiblePerson = source.getResponsiblePerson();
		Inventory inventory = source.getInventory();
		MaintenanceType type = source.getType();
		if (companyContact != null) {
			target.setCompanyContactId(companyContact.getId());
		}
		if (responsiblePerson != null) {
			target.setResponsiblePersonId(responsiblePerson.getId());
		}
		if (inventory != null) {
			target.setInventoryId(inventory.getId());
		}
		if (type != null) {
			target.setTypeId(type.getId());
		}
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public MaintenanceScheduleItemOutVO toMaintenanceScheduleItemOutVO(final MaintenanceScheduleItem entity) {
		return super.toMaintenanceScheduleItemOutVO(entity);
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public void toMaintenanceScheduleItemOutVO(
			MaintenanceScheduleItem source,
			MaintenanceScheduleItemOutVO target) {
		super.toMaintenanceScheduleItemOutVO(source, target);
		Staff companyContact = source.getCompanyContact();
		Staff responsiblePerson = source.getResponsiblePerson();
		Inventory inventory = source.getInventory();
		MaintenanceType type = source.getType();
		User modifiedUser = source.getModifiedUser();
		if (companyContact != null) {
			target.setCompanyContact(this.getStaffDao().toStaffOutVO(companyContact));
		}
		if (responsiblePerson != null) {
			target.setResponsiblePerson(this.getStaffDao().toStaffOutVO(responsiblePerson));
		}
		if (inventory != null) {
			target.setInventory(this.getInventoryDao().toInventoryOutVO(inventory));
		}
		if (type != null) {
			target.setType(this.getMaintenanceTypeDao().toMaintenanceTypeVO(type));
		}
		if (modifiedUser != null) {
			target.setModifiedUser(this.getUserDao().toUserOutVO(modifiedUser));
		}
		target.setRecurrencePeriod(L10nUtil.createVariablePeriodVO(Locales.USER, source.getRecurrencePeriod()));
		target.setReminderPeriod(L10nUtil.createVariablePeriodVO(Locales.USER, source.getReminderPeriod()));
		ReminderEntityAdapter reminderItem = ReminderEntityAdapter.getInstance(source);
		Date today = new Date();
		if (target.getReminderStart() == null) {
			target.setReminderStart(reminderItem.getReminderStart(today, false, null, null));
		}
		if (target.getNextRecurrence() == null) {
			target.setNextRecurrence(reminderItem.getNextRecurrence(today, false));
		}
	}
}