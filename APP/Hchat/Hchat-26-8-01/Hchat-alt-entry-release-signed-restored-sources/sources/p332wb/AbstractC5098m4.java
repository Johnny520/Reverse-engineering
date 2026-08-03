package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import tf.AbstractC4166m;
import tf.C4175v;

/* JADX INFO: renamed from: wb.m4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5098m4 {

    /* JADX INFO: renamed from: a */
    public static final List f18835a = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC0000a.m101y0("Hchat_miuix_ui", "Hchat_call_media_limit_config", "Hchat_fake_location_config", "Hchat_finder_media_download", "Hchat_extra_config", "Hchat_status_text_limit_config", "Hchat_edit_message_config", "Hchat_disable_hot_update_config", "Hchat_remove_moments_ads_config", "Hchat_moments_auto_comment_config", "Hchat_moments_auto_like_config", "Hchat_moments_auto_forward_config", "Hchat_moments_auto_refresh_config", "Hchat_moments_bottom_detail_config", "Hchat_moments_post_notification_config", "Hchat_moments_fake_interaction_config", "Hchat_profile_id_config", "settings_entry", "floating_shortcut_menu", "Hchat_quick_mark_read_config", "Hchat_custom_notification", "Hchat_conversation_groups", "Hchat_auto_reply_config", "Hchat_message_affix_config", "Hchat_auto_original_image_config", "Hchat_auto_view_original_config", "Hchat_block_at_all_notification_config", "Hchat_keyword_notification_config", "Hchat_text_speech_config", "Hchat_text_voice_config", "Hchat_zombie_check_config", "Hchat_wechat_keep_alive_config", "Hchat_quote_delete_clear_config", "Hchat_chat_time_style_config", "Hchat_emoji_save_config", "Hchat_swipe_quote_config", "Hchat_audio_transform_config", "Hchat_fake_voice_duration_config", "Hchat_message_bubble_config", "Hchat_message_text_color_config", "Hchat_hide_chat_avatar_config", "Hchat_hide_chat_menu_config", "Hchat_quick_contact_edit_config", "Hchat_round_avatar_config", "Hchat_custom_friend_avatar_config", "Hchat_message_block_config", "Hchat_group_leave_monitor_config", "Hchat_group_rename_monitor_config", "Hchat_multi_recall_config", "Hchat_voice_forward_config", "Hchat_fake_scan_camera_config", "Hchat_redpacket_config", "Hchat_anti_recall_config", "Hchat_protobuf_packet_config", "Hchat_script_plugin_config", "Hchat_wechat_tablet_config", "Hchat_transfer_config", "Hchat_fake_wallet_balance_config", "Hchat_member_title_config", "Hchat_real_name_tail_config", "Hchat_group_nickname_color_config")));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static boolean m9728a(SharedPreferences.Editor editor, String str, JSONObject jSONObject) {
        Set<String> set;
        try {
            String strOptString = jSONObject.optString("type");
            if (strOptString != null) {
                switch (strOptString.hashCode()) {
                    case -1572742348:
                        if (strOptString.equals("string_set")) {
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("value");
                            if (jSONArrayOptJSONArray == null) {
                                set = C4175v.f13712g;
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                int length = jSONArrayOptJSONArray.length();
                                for (int i9 = 0; i9 < length; i9++) {
                                    linkedHashSet.add(jSONArrayOptJSONArray.optString(i9, HttpUrl.FRAGMENT_ENCODE_SET));
                                }
                                set = linkedHashSet;
                            }
                            editor.putStringSet(str, set);
                            return true;
                        }
                        break;
                        break;
                    case -891985903:
                        if (strOptString.equals("string")) {
                            editor.putString(str, jSONObject.optString("value", HttpUrl.FRAGMENT_ENCODE_SET));
                            return true;
                        }
                        break;
                        break;
                    case 104431:
                        if (strOptString.equals("int")) {
                            editor.putInt(str, jSONObject.optInt("value"));
                            return true;
                        }
                        break;
                        break;
                    case 3327612:
                        if (strOptString.equals("long")) {
                            editor.putLong(str, jSONObject.optLong("value"));
                            return true;
                        }
                        break;
                        break;
                    case 64711720:
                        if (strOptString.equals("boolean")) {
                            editor.putBoolean(str, jSONObject.optBoolean("value"));
                            return true;
                        }
                        break;
                        break;
                    case 97526364:
                        if (strOptString.equals("float")) {
                            editor.putFloat(str, (float) jSONObject.optDouble("value"));
                            return true;
                        }
                        break;
                        break;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static JSONObject m9729b(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (obj instanceof Boolean) {
            jSONObject.put("type", "boolean");
            jSONObject.put("value", ((Boolean) obj).booleanValue());
            return jSONObject;
        }
        if (obj instanceof Integer) {
            jSONObject.put("type", "int");
            jSONObject.put("value", ((Number) obj).intValue());
            return jSONObject;
        }
        if (obj instanceof Long) {
            jSONObject.put("type", "long");
            jSONObject.put("value", ((Number) obj).longValue());
            return jSONObject;
        }
        if (obj instanceof Float) {
            jSONObject.put("type", "float");
            jSONObject.put("value", ((Number) obj).floatValue());
            return jSONObject;
        }
        if (obj instanceof String) {
            jSONObject.put("type", "string");
            jSONObject.put("value", obj);
            return jSONObject;
        }
        if (!(obj instanceof Set)) {
            return null;
        }
        jSONObject.put("type", "string_set");
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put("value", jSONArray);
        return jSONObject;
    }
}
