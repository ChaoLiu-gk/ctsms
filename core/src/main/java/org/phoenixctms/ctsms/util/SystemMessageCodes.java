package org.phoenixctms.ctsms.util;

public interface SystemMessageCodes {

	public final static String INVENTORY_CREATED = "inventory_created";
	public final static String INVENTORY_UPDATED = "inventory_updated";
	public final static String INVENTORY_DELETED = "inventory_deleted";
	public final static String INVENTORY_DELETED_BOOKING_DELETED = "inventory_deleted_booking_deleted";
	public final static String INVENTORY_DELETED_MAINTENANCE_ITEM_DELETED = "inventory_deleted_maintenance_item_deleted";
	public final static String INVENTORY_DELETED_STATUS_ENTRY_DELETED = "inventory_deleted_status_entry_deleted";
	public final static String INVENTORY_DELETED_PARENT_REMOVED = "inventory_deleted_parent_removed";
	public final static String INVENTORY_DELETED_OWNERSHIP_REMOVED = "inventory_deleted_ownership_removed";
	public final static String INVENTORY_MARKED_FOR_DELETION = "inventory_marked_for_deletion";
	public static final String INVENTORY_BOOKING_CREATED = "inventory_booking_created";
	public static final String INVENTORY_BOOKING_UPDATED = "inventory_booking_updated";
	public static final String INVENTORY_BOOKING_DELETED = "inventory_booking_deleted";
	public static final String INVENTORY_TAG_VALUE_CREATED = "inventory_tag_value_created";
	public static final String INVENTORY_TAG_VALUE_UPDATED = "inventory_tag_value_updated";
	public static final String INVENTORY_TAG_VALUE_DELETED = "inventory_tag_value_deleted";
	public static final String INVENTORY_STATUS_ENTRY_CREATED = "inventory_status_entry_created";
	public static final String INVENTORY_STATUS_ENTRY_UPDATED = "inventory_status_entry_updated";
	public static final String INVENTORY_STATUS_ENTRY_DELETED = "inventory_status_entry_deleted";
	public static final String MAINTENANCE_SCHEDULE_ITEM_CREATED = "maintenance_schedule_item_created";
	public static final String MAINTENANCE_SCHEDULE_ITEM_UPDATED = "maintenance_schedule_item_updated";
	public static final String MAINTENANCE_SCHEDULE_ITEM_DELETED = "maintenance_schedule_item_deleted";
	public static final String MAINTENANCE_SCHEDULE_ITEM_DISMISSED_SET = "maintenance_schedule_item_dismissed_set";
	public static final String MAINTENANCE_SCHEDULE_ITEM_DISMISSED_UNSET = "maintenance_schedule_item_dismissed_unset";
	public final static String COURSE_CREATED = "course_created";
	public final static String COURSE_UPDATED = "course_updated";
	public final static String COURSE_DELETED = "course_deleted";
	public final static String COURSE_DELETED_PARTICIPATION_DELETED = "course_deleted_participation_deleted";
	public final static String COURSE_DELETED_LECTURER_DELETED = "course_deleted_lecturer_deleted";
	// public final static String COURSE_DELETED_RENEWAL_REMOVED = "course_deleted_renewal_removed";
	public final static String COURSE_DELETED_PRECEDING_COURSE_REMOVED = "course_deleted_preceding_course_removed";
	public final static String COURSE_DELETED_BOOKING_UPDATED = "course_deleted_booking_updated";
	public final static String COURSE_DELETED_INSTITUTION_COURSE_REMOVED = "course_deleted_institution_course_removed";
	public final static String COURSE_DELETED_TRIAL_REMOVED = "course_deleted_trial_removed";
	public final static String COURSE_MARKED_FOR_DELETION = "course_marked_for_deletion";
	public final static String COURSE_PARTICIPATION_STATUS_ENTRY_CREATED = "course_participation_status_entry_created";
	public final static String COURSE_PARTICIPATION_STATUS_ENTRY_UPDATED = "course_participation_status_entry_updated";
	public final static String COURSE_PARTICIPATION_STATUS_ENTRY_DELETED = "course_participation_status_entry_deleted";
	public final static String COURSE_PARTICIPANT_LIST_RENDERED = "course_participant_list_rendered";
	public final static String LECTURER_CREATED = "lecturer_created";
	public final static String LECTURER_UPDATED = "lecturer_updated";
	public final static String LECTURER_DELETED = "lecturer_deleted";
	public final static String STAFF_CREATED = "staff_created";
	public final static String STAFF_UPDATED = "staff_updated";
	public final static String STAFF_DELETED = "staff_deleted";
	public final static String STAFF_MARKED_FOR_DELETION = "staff_marked_for_deletion";
	public final static String STAFF_IMAGE_CREATED = "staff_image_created";
	public final static String STAFF_IMAGE_UPDATED = "staff_image_updated";
	public final static String STAFF_IMAGE_CLEARED = "staff_image_cleared";
	public final static String STAFF_DELETED_BOOKING_DELETED = "staff_deleted_booking_deleted";
	public final static String STAFF_DELETED_COURSE_UPDATED = "staff_deleted_course_updated";
	public final static String STAFF_DELETED_CV_POSITION_UPDATED = "staff_deleted_cv_position_updated";
	public final static String STAFF_DELETED_DUTY_ROSTER_TURN_UPDATED = "staff_deleted_duty_roster_turn_updated";
	public final static String STAFF_DELETED_INVENTORY_UPDATED = "staff_deleted_inventory_updated";
	public final static String STAFF_DELETED_LECTURER_DELETED = "staff_deleted_lecturer_deleted";
	public final static String STAFF_DELETED_MAINTENANCE_ITEM_UPDATED = "staff_deleted_maintenance_item_updated";
	public final static String STAFF_DELETED_PARENT_REMOVED = "staff_deleted_parent_removed";
	public final static String STAFF_DELETED_PARTICIPATION_DELETED = "staff_deleted_participation_deleted";
	public final static String STAFF_DELETED_TEAM_MEMBER_DELETED = "staff_deleted_team_member_deleted";
	public final static String STAFF_DELETED_USER_UPDATED = "staff_deleted_user_updated";
	public final static String STAFF_DELETED_INVENTORY_STATUS_DELETED = "staff_deleted_inventory_status_deleted";
	public final static String STAFF_DELETED_INVENTORY_STATUS_UPDATED = "staff_deleted_inventory_status_updated";
	public final static String STAFF_DELETED_PROBAND_UPDATED = "staff_deleted_proband_updated";
	public final static String STAFF_TAG_VALUE_CREATED = "staff_tag_value_created";
	public final static String STAFF_TAG_VALUE_UPDATED = "staff_tag_value_updated";
	public final static String STAFF_TAG_VALUE_DELETED = "staff_tag_value_deleted";
	public final static String STAFF_STATUS_ENTRY_CREATED = "staff_status_entry_created";
	public final static String STAFF_STATUS_ENTRY_UPDATED = "staff_status_entry_updated";
	public final static String STAFF_STATUS_ENTRY_DELETED = "staff_status_entry_deleted";
	public final static String STAFF_CONTACT_DETAIL_VALUE_CREATED = "staff_contact_detail_value_created";
	public final static String STAFF_CONTACT_DETAIL_VALUE_UPDATED = "staff_contact_detail_value_updated";
	public final static String STAFF_CONTACT_DETAIL_VALUE_DELETED = "staff_contact_detail_value_deleted";
	public final static String STAFF_ADDRESS_CREATED = "staff_address_created";
	public final static String STAFF_ADDRESS_UPDATED = "staff_address_updated";
	public final static String STAFF_ADDRESS_DELETED = "staff_address_deleted";
	public final static String DUTY_ROSTER_TURN_CREATED = "duty_roster_turn_created";
	public final static String DUTY_ROSTER_TURN_UPDATED = "duty_roster_turn_updated";
	public final static String DUTY_ROSTER_TURN_DELETED = "duty_roster_turn_deleted";
	public final static String CV_POSITION_CREATED = "cv_position_created";
	public final static String CV_POSITION_UPDATED = "cv_position_updated";
	public final static String CV_POSITION_DELETED = "cv_position_deleted";
	public final static String CV_PDF_RENDERED = "cv_pdf_rendered";
	public final static String TRIAL_CREATED = "trial_created";
	public final static String TRIAL_UPDATED = "trial_updated";
	public final static String TRIAL_DELETED = "trial_deleted";
	public final static String TRIAL_DELETED_BOOKING_UPDATED = "trial_deleted_booking_updated";
	public final static String TRIAL_DELETED_DUTY_ROSTER_TURN_UPDATED = "trial_deleted_duty_roster_turn_updated";
	public final static String TRIAL_DELETED_TRIAL_MEMBERSHIP_DELETED = "trial_deleted_trial_membership_deleted";
	public final static String TRIAL_DELETED_COURSE_UPDATED = "trial_deleted_course_updated";
	public final static String TRIAL_DELETED_MASS_MAIL_UPDATED = "trial_deleted_mass_mail_updated";
	public final static String TRIAL_DELETED_MASS_MAIL_RECIPIENT_UPDATED = "trial_deleted_mass_mail_recipient_updated";
	public final static String TRIAL_MARKED_FOR_DELETION = "trial_marked_for_deletion";
	public final static String TRIAL_DELETED_MONEY_TRANSFER_UPDATED = "trial_deleted_money_transfer_updated";
	public static final String TRIAL_TAG_VALUE_CREATED = "trial_tag_value_created";
	public static final String TRIAL_TAG_VALUE_UPDATED = "trial_tag_value_updated";
	public static final String TRIAL_TAG_VALUE_DELETED = "trial_tag_value_deleted";
	public final static String TEAM_MEMBER_CREATED = "team_member_created";
	public final static String TEAM_MEMBER_UPDATED = "team_member_updated";
	public final static String TEAM_MEMBER_DELETED = "team_member_deleted";
	public static final String TIMELINE_EVENT_CREATED = "timeline_event_created";
	public static final String TIMELINE_EVENT_UPDATED = "timeline_event_updated";
	public static final String TIMELINE_EVENT_DELETED = "timeline_event_deleted";
	public static final String TIMELINE_EVENT_DISMISSED_SET = "timeline_event_dismissed_set";
	public static final String TIMELINE_EVENT_DISMISSED_UNSET = "timeline_event_dismissed_unset";
	public final static String PROBAND_GROUP_CREATED = "proband_group_created";
	public final static String PROBAND_GROUP_UPDATED = "proband_group_updated";
	public final static String PROBAND_GROUP_DELETED = "proband_group_deleted";
	public final static String PROBAND_GROUP_DELETED_VISIT_SCHEDULE_ITEM_DELETED = "proband_group_deleted_visit_schedule_item_deleted";
	public final static String PROBAND_GROUP_DELETED_ECRF_UPDATED = "proband_group_deleted_ecrf_updated";
	public final static String PROBAND_GROUP_DELETED_PROBAND_LIST_ENTRY_UPDATED = "proband_group_deleted_proband_list_entry_updated";
	public final static String VISIT_CREATED = "visit_created";
	public final static String VISIT_UPDATED = "visit_updated";
	public final static String VISIT_DELETED = "visit_deleted";
	public final static String VISIT_DELETED_VISIT_SCHEDULE_ITEM_DELETED = "visit_deleted_visit_schedule_item_deleted";
	public final static String VISIT_DELETED_ECRF_UPDATED = "visit_deleted_ecrf_updated";
	public final static String VISIT_SCHEDULE_ITEM_CREATED = "visit_schedule_item_created";
	public final static String VISIT_SCHEDULE_ITEM_UPDATED = "visit_schedule_item_updated";
	public final static String VISIT_SCHEDULE_ITEM_DELETED = "visit_schedule_item_deleted";
	public final static String VISIT_SCHEDULE_EXPORTED = "visit_schedule_exported";
	public final static String TRAVEL_EXPENSES_VISIT_SCHEDULE_EXPORTED = "travel_expenses_visit_schedule_exported";
	public final static String TEAM_MEMBERS_EXPORTED = "team_members_exported";
	public final static String AUDIT_TRAIL_EXPORTED = "audit_trail_exported";
	public final static String REIMBURSEMENTS_EXPORTED = "reimbursements_exported";
	public final static String INVENTORY_BOOKINGS_EXPORTED = "inventory_bookings_exported";
	public final static String PROBAND_LIST_ENTRY_TAG_CREATED = "proband_list_entry_tag_created";
	public final static String PROBAND_LIST_ENTRY_TAG_UPDATED = "proband_list_entry_tag_updated";
	public final static String PROBAND_LIST_ENTRY_TAG_DELETED = "proband_list_entry_tag_deleted";
	public final static String INQUIRY_CREATED = "inquiry_created";
	public final static String INQUIRY_UPDATED = "inquiry_updated";
	public final static String INQUIRY_DELETED = "inquiry_deleted";
	public final static String INQUIRY_MARKED_FOR_DELETION = "inquiry_marked_for_deletion";
	public final static String ECRF_CREATED = "ecrf_created";
	public final static String ECRF_UPDATED = "ecrf_updated";
	public final static String ECRF_DELETED = "ecrf_deleted";
	public final static String ECRF_CLONED = "ecrf_cloned";
	public final static String ECRF_MARKED_FOR_DELETION = "ecrf_marked_for_deletion";
	public final static String ECRF_FIELD_CREATED = "ecrf_field_created";
	public final static String ECRF_FIELD_UPDATED = "ecrf_field_updated";
	public final static String ECRF_FIELD_DELETED = "ecrf_field_deleted";
	public final static String ECRF_FIELD_CLONED = "ecrf_field_cloned";
	public final static String ECRF_FIELD_MARKED_FOR_DELETION = "ecrf_field_marked_for_deletion";
	public final static String ECRF_STATUS_ENTRY_CREATED = "ecrf_status_entry_created";
	public final static String ECRF_STATUS_ENTRY_UPDATED = "ecrf_status_entry_updated";
	public final static String ECRF_VALIDATED = "ecrf_validated";
	public final static String ECRF_PDF_RENDERED = "ecrf_pdf_rendered";
	public final static String ECRFS_PDF_RENDERED = "ecrfs_pdf_rendered";
	public final static String INQUIRY_PDF_RENDERED = "inquiry_pdf_rendered";
	public final static String INQUIRIES_PDF_RENDERED = "inquiries_pdf_rendered";
	public final static String INQUIRIES_SIGNUP_PDF_RENDERED = "inquiries_signup_pdf_rendered";
	public final static String PROBAND_LIST_ENTRY_TAG_PDF_RENDERED = "proband_list_entry_tag_pdf_rendered";
	public final static String PROBAND_LIST_ENTRY_TAGS_PDF_RENDERED = "proband_list_entry_tags_pdf_rendered";
	public final static String PROBAND_LIST_ENTRY_CREATED = "proband_list_entry_created";
	public final static String PROBAND_LIST_ENTRY_UPDATED = "proband_list_entry_updated";
	public final static String PROBAND_LIST_ENTRY_DELETED = "proband_list_entry_deleted";
	public final static String PROBAND_LIST_ENTRY_RANDOMIZED_AND_CREATED = "proband_list_entry_randomized_and_created";
	public final static String PROBAND_LIST_ENTRY_RANDOMIZED_AND_UPDATED = "proband_list_entry_randomized_and_updated";
	public final static String PROBAND_LIST_ENTRIES_SHUFFLED_AND_CREATED = "proband_list_entries_shuffled_and_created";
	public final static String RANDOMIZATION_LIST_GENERATED = "randomization_list_generated";
	public final static String PROBAND_LIST_ENTRIES_CREATED = "proband_list_entries_created";
	public final static String PROBAND_LIST_ENTRIES_SHUFFLED_AND_DELETED = "proband_list_entries_shuffled_and_deleted";
	public final static String PROBAND_LIST_ENTRIES_DELETED = "proband_list_entries_deleted";
	public final static String PROBAND_LIST_STATUS_ENTRY_CREATED = "proband_list_status_entry_created";
	public final static String PROBAND_LIST_STATUS_ENTRY_DELETED = "proband_list_status_entry_deleted";
	public final static String PROBAND_LIST_ENTRY_TAG_VALUE_CREATED = "proband_list_entry_tag_value_created";
	public final static String PROBAND_LIST_ENTRY_TAG_VALUE_UPDATED = "proband_list_entry_tag_value_updated";
	public final static String PROBAND_LIST_ENTRY_TAG_VALUE_DELETED = "proband_list_entry_tag_value_deleted";
	public final static String STRATIFICATION_RANDOMIZATION_LIST_CREATED = "stratification_randomization_list_created";
	public final static String STRATIFICATION_RANDOMIZATION_LIST_UPDATED = "stratification_randomization_list_updated";
	public final static String STRATIFICATION_RANDOMIZATION_LIST_DELETED = "stratification_randomization_list_deleted";
	public final static String PROBAND_LIST_EXPORTED = "proband_list_exported";
	public final static String INQUIRY_MOVED_TO_FIRST_POSITION = "inquiry_moved_to_first_position";
	public final static String INQUIRY_MOVED_UP = "inquiry_moved_up";
	public final static String INQUIRY_MOVED_DOWN = "inquiry_moved_down";
	public final static String INQUIRY_MOVED_TO_LAST_POSITION = "inquiry_moved_to_last_position";
	public final static String INQUIRY_POSITION_NORMALIZED = "inquiry_position_normalized";
	public final static String INQUIRY_POSITION_ROTATED_DOWN = "inquiry_position_rotated_down";
	public final static String INQUIRY_POSITION_ROTATED_UP = "inquiry_position_rotated_up";
	public final static String INQUIRY_POSITIONS_NORMALIZED = "inquiry_positions_normalized";
	public final static String INQUIRY_POSITIONS_ROTATED_DOWN = "inquiry_positions_rotated_down";
	public final static String INQUIRY_POSITIONS_ROTATED_UP = "inquiry_positions_rotated_up";
	public final static String PROBAND_LIST_ENTRY_MOVED_TO_FIRST_POSITION = "proband_list_entry_moved_to_first_position";
	public final static String PROBAND_LIST_ENTRY_MOVED_UP = "proband_list_entry_moved_up";
	public final static String PROBAND_LIST_ENTRY_MOVED_DOWN = "proband_list_entry_moved_down";
	public final static String PROBAND_LIST_ENTRY_MOVED_TO_LAST_POSITION = "proband_list_entry_moved_to_last_position";
	public final static String PROBAND_LIST_ENTRY_POSITION_NORMALIZED = "proband_list_entry_position_normalized";
	public final static String PROBAND_LIST_ENTRY_POSITION_ROTATED_DOWN = "proband_list_entry_position_rotated_down";
	public final static String PROBAND_LIST_ENTRY_POSITION_ROTATED_UP = "proband_list_entry_position_rotated_up";
	public final static String PROBAND_LIST_ENTRY_POSITIONS_NORMALIZED = "proband_list_entry_positions_normalized";
	public final static String PROBAND_LIST_ENTRY_POSITIONS_ROTATED_DOWN = "proband_list_entry_positions_rotated_down";
	public final static String PROBAND_LIST_ENTRY_POSITIONS_ROTATED_UP = "proband_list_entry_positions_rotated_up";
	public final static String ECRF_MOVED_TO_FIRST_POSITION = "ecrf_moved_to_first_position";
	public final static String ECRF_MOVED_UP = "ecrf_moved_up";
	public final static String ECRF_MOVED_DOWN = "ecrf_moved_down";
	public final static String ECRF_MOVED_TO_LAST_POSITION = "ecrf_moved_to_last_position";
	public final static String ECRF_POSITION_NORMALIZED = "ecrf_position_normalized";
	public final static String ECRF_POSITION_ROTATED_DOWN = "ecrf_position_rotated_down";
	public final static String ECRF_POSITION_ROTATED_UP = "ecrf_position_rotated_up";
	public final static String ECRF_POSITIONS_NORMALIZED = "ecrf_positions_normalized";
	public final static String ECRF_POSITIONS_ROTATED_DOWN = "ecrf_positions_rotated_down";
	public final static String ECRF_POSITIONS_ROTATED_UP = "ecrf_positions_rotated_up";
	public final static String ECRF_FIELD_MOVED_TO_FIRST_POSITION = "ecrf_field_moved_to_first_position";
	public final static String ECRF_FIELD_MOVED_UP = "ecrf_field_moved_up";
	public final static String ECRF_FIELD_MOVED_DOWN = "ecrf_field_moved_down";
	public final static String ECRF_FIELD_MOVED_TO_LAST_POSITION = "ecrf_field_moved_to_last_position";
	public final static String ECRF_FIELD_POSITION_NORMALIZED = "ecrf_field_position_normalized";
	public final static String ECRF_FIELD_POSITION_ROTATED_DOWN = "ecrf_field_position_rotated_down";
	public final static String ECRF_FIELD_POSITION_ROTATED_UP = "ecrf_field_position_rotated_up";
	public final static String ECRF_FIELD_POSITIONS_NORMALIZED = "ecrf_field_positions_normalized";
	public final static String ECRF_FIELD_POSITIONS_ROTATED_DOWN = "ecrf_field_positions_rotated_down";
	public final static String ECRF_FIELD_POSITIONS_ROTATED_UP = "ecrf_field_positions_rotated_up";
	public final static String PROBAND_LIST_ENTRY_TAG_MOVED_TO_FIRST_POSITION = "proband_list_entry_tag_moved_to_first_position";
	public final static String PROBAND_LIST_ENTRY_TAG_MOVED_UP = "proband_list_entry_tag_moved_up";
	public final static String PROBAND_LIST_ENTRY_TAG_MOVED_DOWN = "proband_list_entry_tag_moved_down";
	public final static String PROBAND_LIST_ENTRY_TAG_MOVED_TO_LAST_POSITION = "proband_list_entry_tag_moved_to_last_position";
	public final static String PROBAND_LIST_ENTRY_TAG_POSITION_NORMALIZED = "proband_list_entry_tag_position_normalized";
	public final static String PROBAND_LIST_ENTRY_TAG_POSITION_ROTATED_DOWN = "proband_list_entry_tag_position_rotated_down";
	public final static String PROBAND_LIST_ENTRY_TAG_POSITION_ROTATED_UP = "proband_list_entry_tag_position_rotated_up";
	public final static String PROBAND_LIST_ENTRY_TAG_POSITIONS_NORMALIZED = "proband_list_entry_tag_positions_normalized";
	public final static String PROBAND_LIST_ENTRY_TAG_POSITIONS_ROTATED_DOWN = "proband_list_entry_tag_positions_rotated_down";
	public final static String PROBAND_LIST_ENTRY_TAG_POSITIONS_ROTATED_UP = "proband_list_entry_tag_positions_rotated_up";
	public final static String PROBAND_CREATED = "proband_created";
	public final static String PROBAND_UPDATED = "proband_updated";
	public final static String PROBAND_DELETED = "proband_deleted";
	public final static String PROBAND_DELETED_PARENT_REMOVED = "proband_deleted_parent_removed";
	public final static String PROBAND_DELETED_PATIENT_REMOVED = "proband_deleted_patient_removed";
	public final static String PROBAND_DELETED_MASS_MAIL_RECIPIENT_UPDATED = "proband_deleted_mass_mail_recipient_updated";
	public final static String PROBAND_DELETED_MASS_MAIL_RECIPIENT_DELETED = "proband_deleted_mass_mail_recipient_deleted";
	public final static String PROBAND_IMAGE_CREATED = "proband_image_created";
	public final static String PROBAND_IMAGE_UPDATED = "proband_image_updated";
	public final static String PROBAND_IMAGE_CLEARED = "proband_image_cleared";
	public final static String PROBAND_DELETED_BOOKING_UPDATED = "proband_deleted_booking_updated";
	public final static String PROBAND_MARKED_FOR_DELETION = "proband_marked_for_deletion";
	public final static String PROBAND_DELETED_MONEY_TRANSFER_DELETED = "proband_deleted_money_transfer_deleted";
	public final static String PROBAND_TAG_VALUE_CREATED = "proband_tag_value_created";
	public final static String PROBAND_TAG_VALUE_UPDATED = "proband_tag_value_updated";
	public final static String PROBAND_TAG_VALUE_DELETED = "proband_tag_value_deleted";
	public final static String PROBAND_STATUS_ENTRY_CREATED = "proband_status_entry_created";
	public final static String PROBAND_STATUS_ENTRY_UPDATED = "proband_status_entry_updated";
	public final static String PROBAND_STATUS_ENTRY_DELETED = "proband_status_entry_deleted";
	public final static String DIAGNOSIS_CREATED = "diagnosis_created";
	public final static String DIAGNOSIS_UPDATED = "diagnosis_updated";
	public final static String DIAGNOSIS_DELETED = "diagnosis_deleted";
	public final static String DIAGNOSIS_DELETED_MEDICATION_UPDATED = "diagnosis_deleted_medication_updated";
	public final static String PROCEDURE_DELETED_MEDICATION_UPDATED = "procedure_deleted_medication_updated";
	public final static String MEDICATION_CREATED = "medication_created";
	public final static String MEDICATION_UPDATED = "medication_updated";
	public final static String MEDICATION_DELETED = "medication_deleted";
	public final static String PROCEDURE_CREATED = "procedure_created";
	public final static String PROCEDURE_UPDATED = "procedure_updated";
	public final static String PROCEDURE_DELETED = "procedure_deleted";
	public final static String PROBAND_CONTACT_DETAIL_VALUE_CREATED = "proband_contact_detail_value_created";
	public final static String PROBAND_CONTACT_DETAIL_VALUE_UPDATED = "proband_contact_detail_value_updated";
	public final static String PROBAND_CONTACT_DETAIL_VALUE_DELETED = "proband_contact_detail_value_deleted";
	public final static String PROBAND_ADDRESS_CREATED = "proband_address_created";
	public final static String PROBAND_ADDRESS_UPDATED = "proband_address_updated";
	public final static String PROBAND_ADDRESS_DELETED = "proband_address_deleted";
	public final static String BANK_ACCOUNT_CREATED = "bank_account_created";
	public final static String BANK_ACCOUNT_UPDATED = "bank_account_updated";
	public final static String BANK_ACCOUNT_DELETED = "bank_account_deleted";
	public final static String BANK_ACCOUNT_DELETED_MONEY_TRANSFER_DELETED = "bank_account_deleted_money_transfer_deleted";
	public final static String MONEY_TRANSFER_CREATED = "money_transfer_created";
	public final static String MONEY_TRANSFER_UPDATED = "money_transfer_updated";
	public final static String MONEY_TRANSFER_DELETED = "money_transfer_deleted";
	public final static String MONEY_TRANSFER_PAID_SET = "money_transfer_paid_set";
	public final static String MONEY_TRANSFER_PAID_UNSET = "money_transfer_paid_unset";
	public final static String PROBAND_ADDRESS_WIRE_TRANSFER_UNSET = "proband_address_wire_transfer_unset";
	public final static String PROBAND_ADDRESS_WIRE_TRANSFER_SET = "proband_address_wire_transfer_set";
	public final static String PRIVACY_CONSENT_STATUS_TYPE_UPDATED = "privacy_consent_status_type_updated";
	public final static String PROBAND_CATEGORY_UPDATED = "proband_category_updated";
	public final static String PROBAND_AUTO_DELETE_DEADLINE_RESET = "proband_auto_delete_deadline_reset";
	public final static String INQUIRY_VALUE_CREATED = "inquiry_value_created";
	public final static String INQUIRY_VALUE_UPDATED = "inquiry_value_updated";
	public final static String INQUIRY_VALUE_DELETED = "inquiry_value_deleted";
	public final static String ECRF_FIELD_VALUE_CREATED = "ecrf_field_value_created";
	public final static String ECRF_FIELD_VALUE_UPDATED = "ecrf_field_value_updated";
	public final static String ECRF_FIELD_VALUE_DELETED = "ecrf_field_value_deleted";
	public final static String ECRF_FIELD_VALUES_CLEARED = "ecrf_field_values_cleared";
	public final static String ECRF_FIELD_STATUS_ENTRY_CREATED = "ecrf_field_status_entry_created";
	// public final static String ECRF_FIELD_STATUS_ENTRY_UPDATED = "ecrf_field_status_entry_updated";
	public final static String ECRF_FIELD_STATUS_ENTRY_DELETED = "ecrf_field_status_entry_deleted";
	public final static String INPUT_FIELD_CREATED = "input_field_created";
	public final static String INPUT_FIELD_UPDATED = "input_field_updated";
	public final static String INPUT_FIELD_DELETED = "input_field_deleted";
	public final static String INPUT_FIELD_DELETED_STRATIFICATION_RANDOMIZATION_LIST_DELETED = "input_field_deleted_stratification_randomization_list_deleted";
	public final static String INPUT_FIELD_CLONED = "input_field_cloned";
	public final static String INPUT_FIELD_MARKED_FOR_DELETION = "input_field_marked_for_deletion";
	public final static String SELECTION_SET_VALUE_CREATED = "selection_set_value_created";
	public final static String SELECTION_SET_VALUE_UPDATED = "selection_set_value_updated";
	public final static String SELECTION_SET_VALUE_DELETED = "selection_set_value_deleted";
	public final static String SELECTION_SET_VALUE_DELETED_STRATIFICATION_RANDOMIZATION_LIST_DELETED = "selection_set_value_deleted_stratification_randomization_list_deleted";
	public final static String SELECTION_SET_VALUE_CLONED = "selection_set_value_cloned";
	public final static String SELECTION_SET_VALUE_MARKED_FOR_DELETION = "selection_set_value_marked_for_deletion";
	public final static String USER_CREATED = "user_created";
	public final static String USER_UPDATED = "user_updated";
	public final static String USER_SETTINGS_UPDATED = "user_settings_updated";
	public final static String USER_DATA_TABLE_COLUMNS_UPDATED = "user_data_table_columns_updated";
	public final static String USER_DATA_TABLE_COLUMNS_CLEARED = "user_data_table_columns_cleared";
	public final static String USER_DELETED = "user_deleted";
	public final static String USER_MARKED_FOR_DELETION = "user_marked_for_deletion";
	public final static String USER_DELETED_IDENTITY_REMOVED = "user_deleted_identity_removed";
	public final static String LOCALE_UPDATED = "locale_updated";
	public final static String THEME_UPDATED = "theme_updated";
	public final static String TIME_ZONE_UPDATED = "time_zone_updated";
	public final static String SHOW_TOOLTIPS_UPDATED = "show_tooltips_updated";
	public static final String USER_PERMISSION_PROFILE_CREATED = "user_permission_profile_created";
	public static final String USER_PERMISSION_PROFILE_UPDATED = "user_permission_profile_updated";
	public final static String CRITERIA_CREATED = "criteria_created";
	public final static String CRITERIA_UPDATED = "criteria_updated";
	public final static String CRITERIA_DELETED = "criteria_deleted";
	public final static String CRITERIA_MARKED_FOR_DELETION = "criteria_marked_for_deletion";
	public final static String SEARCH_PERFORMED = "search_performed";
	public final static String SEARCH_FILTERED = "search_filtered";
	public final static String SEARCH_EXPORTED = "search_exported";
	public final static String SEARCH_COURSE_PARTICIPANT_LIST_EXPORTED = "search_course_participant_list_exported";
	public final static String SEARCH_CV_EXPORTED = "search_cv_exported";
	public static final String SEARCH_PROBAND_LETTER_EXPORTED = "search_proband_letter_exported";
	public final static String FILE_CREATED = "file_created";
	public final static String FILE_UPDATED = "file_updated";
	public final static String FILE_DELETED = "file_deleted";
	public final static String AGGREGATED_PDF_FILES_EXPORTED = "aggregated_pdf_files_exported";
	public final static String HYPERLINK_CREATED = "hyperlink_created";
	public final static String HYPERLINK_UPDATED = "hyperlink_updated";
	public final static String HYPERLINK_DELETED = "hyperlink_deleted";
	public final static String JOURNAL_EXPORTED = "journal_exported";
	public final static String ECRF_JOURNAL_EXPORTED = "ecrf_journal_exported";
	public final static String DEPARTMENT_PASSWORD_CHANGED = "department_password_changed";
	public final static String FAILED_LOGON = "failed_logon";
	public final static String SUCCESSFUL_LOGON = "successful_logon";
	public final static String PASSWORD_CREATED = "password_created";
	public final static String LOCAL_PASSWORD_CREATED = "local_password_created";
	public static final String PROBAND_LETTER_PDF_RENDERED = "proband_letter_pdf_rendered";
	public static final String COURSE_CERTIFICATE_PDF_RENDERED = "course_certificate_pdf_rendered";
	public static final String COURSE_CERTIFICATES_PDF_RENDERED = "course_certificates_pdf_rendered";
	public static final String PROBAND_ADDRESS_PROBAND_LETTER_PDF_RENDERED = "proband_address_proband_letter_pdf_rendered";
	public static final String REIMBURSEMENTS_PDF_RENDERED = "reimbursements_pdf_rendered";
	public static final String REIMBURSEMENTS_PDF_NO_TRIAL_RENDERED = "reimbursements_pdf_no_trial_rendered";
	public static final String MASS_MAIL_CREATED = "mass_mail_created";
	public static final String MASS_MAIL_UPDATED = "mass_mail_updated";
	public static final String MASS_MAIL_DELETED = "mass_mail_deleted";
	public static final String MASS_MAIL_DELETED_RECIPIENT_DELETED = "mass_mail_deleted_recipient_deleted";
	public static final String MASS_MAIL_DELETED_TRIAL_REMOVED = "mass_mail_deleted_trial_removed";
	public static final String MASS_MAIL_MARKED_FOR_DELETION = "mass_mail_marked_for_deletion";
	public static final String MASS_MAIL_RECIPIENT_CREATED = "mass_mail_recipient_created";
	public static final String MASS_MAIL_RECIPIENT_DELETED = "mass_mail_recipient_deleted";
	public static final String MASS_MAIL_RECIPIENTS_CREATED = "mass_mail_recipients_created";
	public static final String MASS_MAIL_RECIPIENTS_DELETED = "mass_mail_recipients_deleted";
	public static final String MASS_MAIL_LOCKED = "mass_mail_locked";
	public static final String MASS_MAIL_RECIPIENT_RESET = "mass_mail_recipient_reset";
}