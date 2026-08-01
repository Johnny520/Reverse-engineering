package com.p001mr.elaris;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class Prefs {
    public static final String DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR = "Download/QQ";
    public static final String DEFAULT_PIC_SUMMARY = "[图片]";
    public static final String KEY_CONFIG_VERSION = "config_version";
    public static final String KEY_DONE_PREFIX = "clock_in_done_";
    public static final String KEY_DOWNLOAD_DIRECT_WRITE_DIR = "direct_download_write_dir";
    public static final String KEY_KEEP_FIRE_DONE_PREFIX = "keep_fire_done_";
    public static final String PACKAGE_NAME = "com.mr.elaris";
    public static final String PREFS_NAME = "settings";
    public static final String REPEATER_MODE_DOUBLE = "double";
    public static final String REPEATER_MODE_SINGLE = "single";
    public static final String KEY_UNREAD_FULL_COUNT = "eq_unread_full_count";
    public static final String KEY_HOME_PULL_GUARD = "eq_home_pull_guard";
    public static final String KEY_EMOTION_AS_PIC = "emotion_as_pic";
    public static final String KEY_MEDIA_CLICK_TO_LOAD = "media_click_to_load";
    public static final String KEY_ORIGINAL_IMAGE_DEFAULT = "original_image_default";
    public static final String KEY_FLASH_PIC_AS_IMAGE = "flash_pic_as_image";
    public static final String KEY_PIC_SUMMARY_ENABLED = "pic_summary_enabled";
    public static final String KEY_DEFAULT_BUBBLE = "default_bubble";
    public static final String KEY_DEFAULT_FONT = "default_font";
    public static final String KEY_BLOCK_AVATAR_PENDANT = "block_avatar_pendant";
    public static final String KEY_BLOCK_PROFILE_CARD_DECOR = "block_profile_card_decor";
    public static final String KEY_BLOCK_QQ_SHOW = "block_qq_show";
    public static final String KEY_NOTICE_BLOCK_AT_ALL = "notice_block_at_all";
    public static final String KEY_NOTICE_BLOCK_GROUP_TODO = "notice_block_group_todo";
    public static final String KEY_MESSAGE_RECALL_GUARD = "eq_message_guard";
    public static final String KEY_CHAT_MESSAGE_CORNER_TIME = "chat_message_corner_time";
    public static final String KEY_HIDE_OFFICIAL_CENTER_TIME = "hide_official_center_time";
    public static final String KEY_SELF_MESSAGE_LEFT_SIDE = "self_message_left_side";
    public static final String KEY_ALLOW_FORBID_CARD = "allow_forbid_card";
    public static final String KEY_BLOCK_ANNOYING_POPUPS = "block_annoying_popups";
    public static final String KEY_CLEAN_EMOJI_PANEL_ENTRIES = "clean_emoji_panel_entries";
    public static final String KEY_FAVORITE_EMOTICON_BATCH_SEND = "favorite_emoticon_batch_send";
    public static final String KEY_CLOUD_STICKER_PANEL = "cloud_sticker_panel";
    public static final String KEY_VOICE_MESSAGE_ACTIONS = "voice_message_actions";
    public static final String KEY_EXTERNAL_BROWSER = "external_browser";
    public static final String KEY_UNBLOCK_RISK_WEB = "unblock_risk_web";
    public static final String KEY_CHAT_EDGE_GUARD = "eq_chat_edge_guard";
    public static final String KEY_DISABLE_REPLY_AUTO_AT = "disable_reply_auto_at";
    public static final String KEY_QR_GALLERY_GATE = "eq_qr_gallery_gate";
    public static final String KEY_QR_CONFIRM_FAST = "eq_qr_confirm_fast";
    public static final String KEY_FORCE_TABLET_MODE = "force_tablet_mode";
    public static final String KEY_HIDE_AIO_INPUT_CAMERA_ENTRIES = "hide_aio_input_camera_entries";
    public static final String KEY_AIO_INPUT_BAR_ENABLED = "aio_input_bar_enabled";
    public static final String KEY_AIO_INPUT_BAR_MIGRATED = "aio_input_bar_migrated";
    public static final String KEY_ALBUM_VIDEO_BUBBLE = "album_video_bubble";
    public static final String KEY_WEB_KERNEL_FALLBACK = "eq_web_kernel_fallback";
    public static final String KEY_BLOCK_HOST_HOT_UPDATE = "block_host_hot_update";
    public static final String KEY_RENAME_APK_FILE = "rename_apk_file";
    public static final String KEY_DOWNLOAD_DIRECT_WRITE = "direct_download_write";
    public static final String KEY_LEGACY_GROUP_FILE_LAYOUT = "legacy_group_file_layout";
    public static final String KEY_CLOCK_IN_ENABLED = "enable_auto_clock_in";
    public static final String KEY_KEEP_FIRE_ENABLED = "keep_fire_enabled";
    public static final String KEY_MESSAGE_REPEATER = "message_repeater";
    public static final String KEY_MESSAGE_REPEATER_LONG_PRESS_MENU = "message_repeater_long_press_menu";
    public static final String KEY_MESSAGE_REPEATER_HIDE_BUTTON = "message_repeater_hide_button";
    public static final String KEY_DEBUG_LOG = "debug_log";
    public static final String KEY_GROUP_ADMIN_AVATAR_MENU = "group_admin_avatar_menu";
    public static final String[] BOOLEAN_KEYS = {KEY_UNREAD_FULL_COUNT, KEY_HOME_PULL_GUARD, KEY_EMOTION_AS_PIC, KEY_MEDIA_CLICK_TO_LOAD, KEY_ORIGINAL_IMAGE_DEFAULT, KEY_FLASH_PIC_AS_IMAGE, KEY_PIC_SUMMARY_ENABLED, KEY_DEFAULT_BUBBLE, KEY_DEFAULT_FONT, KEY_BLOCK_AVATAR_PENDANT, KEY_BLOCK_PROFILE_CARD_DECOR, KEY_BLOCK_QQ_SHOW, KEY_NOTICE_BLOCK_AT_ALL, KEY_NOTICE_BLOCK_GROUP_TODO, KEY_MESSAGE_RECALL_GUARD, KEY_CHAT_MESSAGE_CORNER_TIME, KEY_HIDE_OFFICIAL_CENTER_TIME, KEY_SELF_MESSAGE_LEFT_SIDE, KEY_ALLOW_FORBID_CARD, KEY_BLOCK_ANNOYING_POPUPS, KEY_CLEAN_EMOJI_PANEL_ENTRIES, KEY_FAVORITE_EMOTICON_BATCH_SEND, KEY_CLOUD_STICKER_PANEL, KEY_VOICE_MESSAGE_ACTIONS, KEY_EXTERNAL_BROWSER, KEY_UNBLOCK_RISK_WEB, KEY_CHAT_EDGE_GUARD, KEY_DISABLE_REPLY_AUTO_AT, KEY_QR_GALLERY_GATE, KEY_QR_CONFIRM_FAST, KEY_FORCE_TABLET_MODE, KEY_HIDE_AIO_INPUT_CAMERA_ENTRIES, KEY_AIO_INPUT_BAR_ENABLED, KEY_AIO_INPUT_BAR_MIGRATED, KEY_ALBUM_VIDEO_BUBBLE, KEY_WEB_KERNEL_FALLBACK, KEY_BLOCK_HOST_HOT_UPDATE, KEY_RENAME_APK_FILE, KEY_DOWNLOAD_DIRECT_WRITE, KEY_LEGACY_GROUP_FILE_LAYOUT, KEY_CLOCK_IN_ENABLED, KEY_KEEP_FIRE_ENABLED, KEY_MESSAGE_REPEATER, KEY_MESSAGE_REPEATER_LONG_PRESS_MENU, KEY_MESSAGE_REPEATER_HIDE_BUTTON, KEY_DEBUG_LOG, KEY_GROUP_ADMIN_AVATAR_MENU};
    public static final String KEY_PIC_SUMMARY_TEXT = "pic_summary_text";
    public static final String KEY_UI_THEME_MODE = "ui_theme_mode";
    public static final String KEY_CHAT_MESSAGE_CORNER_TIME_COLOR = "chat_message_corner_time_color";
    public static final String KEY_CHAT_MESSAGE_CORNER_TIME_FORMAT = "chat_message_corner_time_format";
    public static final String KEY_CLOCK_IN_GROUPS = "clock_in_groups";
    public static final String KEY_KEEP_FIRE_GROUPS = "keep_fire_groups";
    public static final String KEY_KEEP_FIRE_MESSAGE = "keep_fire_message";
    public static final String KEY_KEEP_FIRE_TIME = "keep_fire_time";
    public static final String KEY_KEEP_FIRE_LAST_SENT_DAY = "keep_fire_last_sent_day";
    public static final String KEY_MESSAGE_REPEATER_ICON_PATH = "message_repeater_icon_path";
    public static final String KEY_MESSAGE_REPEATER_MODE = "message_repeater_mode";
    public static final String KEY_AIO_INPUT_BAR_HIDDEN_IDS = "aio_input_bar_hidden_ids";
    public static final String[] STRING_KEYS = {KEY_PIC_SUMMARY_TEXT, KEY_UI_THEME_MODE, KEY_CHAT_MESSAGE_CORNER_TIME_COLOR, KEY_CHAT_MESSAGE_CORNER_TIME_FORMAT, KEY_CLOCK_IN_GROUPS, KEY_KEEP_FIRE_GROUPS, KEY_KEEP_FIRE_MESSAGE, KEY_KEEP_FIRE_TIME, KEY_KEEP_FIRE_LAST_SENT_DAY, KEY_MESSAGE_REPEATER_ICON_PATH, KEY_MESSAGE_REPEATER_MODE, KEY_AIO_INPUT_BAR_HIDDEN_IDS};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Prefs() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean defaultBoolean(String str) {
        return KEY_MESSAGE_REPEATER_LONG_PRESS_MENU.equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String defaultString(String str) {
        return KEY_PIC_SUMMARY_TEXT.equals(str) ? DEFAULT_PIC_SUMMARY : KEY_UI_THEME_MODE.equals(str) ? "system" : KEY_CHAT_MESSAGE_CORNER_TIME_FORMAT.equals(str) ? "ah:mm" : KEY_MESSAGE_REPEATER_MODE.equals(str) ? REPEATER_MODE_SINGLE : KEY_DOWNLOAD_DIRECT_WRITE_DIR.equals(str) ? DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR : KEY_KEEP_FIRE_TIME.equals(str) ? "00:00" : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SharedPreferences.Editor putBoolean(SharedPreferences.Editor editor, String str, boolean z) {
        if (editor == null) {
            return null;
        }
        editor.putBoolean(str, z);
        return editor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SharedPreferences.Editor putString(SharedPreferences.Editor editor, String str, String str2) {
        if (editor == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        editor.putString(str, str2);
        return editor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean readBoolean(SharedPreferences sharedPreferences, String str, boolean z) {
        if (sharedPreferences != null && str != null) {
            try {
                if (sharedPreferences.contains(str)) {
                    return sharedPreferences.getBoolean(str, z);
                }
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String readString(SharedPreferences sharedPreferences, String str, String str2) {
        if (sharedPreferences != null && str != null) {
            try {
                if (sharedPreferences.contains(str)) {
                    return sharedPreferences.getString(str, str2);
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    public static boolean readBoolean(SharedPreferences sharedPreferences, String str) {
        return readBoolean(sharedPreferences, str, defaultBoolean(str));
    }

    public static String readString(SharedPreferences sharedPreferences, String str) {
        return readString(sharedPreferences, str, defaultString(str));
    }
}
