// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS81;
import b.ˈˊ.CLS99;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS856;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1279;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS425;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS442;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS507;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public final class CLS220 implements AdapterView.OnItemLongClickListener {
    public final int FLD2158;
    public final Object FLD2159;
    public final Activity FLD2160;

    public CLS220(int v, Activity activity0, Object object0) {
        this.FLD2158 = v;
        this.FLD2159 = object0;
        this.FLD2160 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        long v2;
        Activity activity1;
        JSONObject jSONObject0 = null;
        Activity activity0 = this.FLD2160;
        Object object0 = this.FLD2159;
        switch(this.FLD2158) {
            case 0: {
                String s7 = (String)((CLS1112)object0).FLD2459.getItem(v);
                for(Object object1: ((CLS1112)object0).FLD2482) {
                    JSONObject jSONObject1 = (JSONObject)object1;
                    try {
                        if(!s7.equals(jSONObject1.getString("n"))) {
                            continue;
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                        continue;
                    }
                    jSONObject0 = jSONObject1;
                    if(true) {
                        break;
                    }
                }
                CLS71 ˆٴ0 = new CLS71(activity0, s7);
                ˆٴ0.MTH1572("delete", ((CLS3)new CLS702(((CLS1112)object0), activity0, s7, 6)));
                ˆٴ0.MTH1572("apply", ((CLS3)new CLS950(((CLS1112)object0), jSONObject0, 0)));
                ˆٴ0.MTH1573();
                return true;
            }
            case 1: {
                CLS99 ﾞᵎ0 = (CLS99)((CLS1078)object0).FLD2317.getItem(v);
                if(ﾞᵎ0 != null) {
                    CLS71 ˆٴ1 = new CLS71(activity0, ﾞᵎ0.FLD491);
                    ˆٴ1.MTH1572("delete", ((CLS3)new CLS702(((CLS1078)object0), activity0, ﾞᵎ0, 9)));
                    ˆٴ1.MTH1572("execute", ((CLS3)new CLS1274(((CLS1078)object0), ﾞᵎ0, 19)));
                    ˆٴ1.MTH1573();
                }
                return true;
            }
            case 2: {
                String s8 = (String)((CLS1062)object0).FLD2278.getItem(v);
                CLS81 יᐧ0 = (CLS81)((CLS1062)object0).FLD2277.get(s8);
                CLS71 ˆٴ2 = new CLS71(activity0, יᐧ0.FLD307);
                ˆٴ2.MTH1572("edit_title", ((CLS3)new CLS1020(((CLS1062)object0), activity0, יᐧ0, 0)));
                ˆٴ2.MTH1572("delete", ((CLS3)new CLS1020(((CLS1062)object0), activity0, יᐧ0, 1)));
                ˆٴ2.MTH1572("tags", ((CLS3)new CLS1020(((CLS1062)object0), activity0, יᐧ0, 2)));
                ˆٴ2.MTH1573();
                return true;
            }
            case 3: {
                CLS442 ˎᵢ1 = (CLS442)object0;
                ˎᵢ1.getClass();
                try {
                    ContentValues contentValues0 = (ContentValues)ˎᵢ1.FLD4218.getItem(v);
                    if(!contentValues0.getAsString("content").equals("|wx_prev_dir|") && (contentValues0.containsKey("img") || contentValues0.containsKey("vid") || contentValues0.containsKey("mp3") || contentValues0.containsKey("gif"))) {
                        if(contentValues0.containsKey("img")) {
                            CLS462.MTH6489(ˎᵢ1.MTH6227(), contentValues0.getAsString("img"));
                            return true;
                        }
                        boolean z = false;
                        if(contentValues0.containsKey("vid")) {
                            z = true;
                            activity1 = ˎᵢ1.MTH6227();
                            v2 = 4101324650326053685L;
                        }
                        else if(contentValues0.containsKey("mp3")) {
                            z = true;
                            activity1 = ˎᵢ1.MTH6227();
                            v2 = 4101324684685792053L;
                        }
                        if(z) {
                            CLS462.MTH6486(activity1, contentValues0.getAsString(CLS370.MTH5289(v2)));
                            return true;
                        }
                        if(contentValues0.containsKey("gif")) {
                            CLS462.MTH6487(ˎᵢ1.MTH6227(), contentValues0.getAsString("gif"));
                            return true;
                        }
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return true;
            }
            case 4: {
                CLS507 ﹳˊ0 = (CLS507)object0;
                ﹳˊ0.getClass();
                try {
                    ContentValues contentValues1 = (ContentValues)ﹳˊ0.FLD4996.getItem(v);
                    if(!contentValues1.getAsString("content").equals("|wx_prev_dir|")) {
                        CLS71 ˆٴ3 = new CLS71(activity0, new File(contentValues1.getAsString("path")).getName());
                        if(contentValues1.containsKey("img") || contentValues1.containsKey("vid") || contentValues1.containsKey("mp3") || contentValues1.containsKey("gif")) {
                            ˆٴ3.MTH1572("preview", ((CLS3)new CLS1274(ﹳˊ0, contentValues1, 21)));
                        }
                        ˆٴ3.MTH1573();
                        return true;
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return true;
            }
            case 5: {
                String s9 = (String)((CLS369)object0).getItem(v);
                CLS71 ˆٴ4 = new CLS71(activity0, null);
                ˆٴ4.MTH1572("delete", ((CLS3)new CLS856(activity0, s9, 2)));
                ˆٴ4.MTH1572("modify", ((CLS3)new CLS856(activity0, s9, 3)));
                ˆٴ4.MTH1572("move_to", ((CLS3)new CLS856(activity0, s9)));
                ˆٴ4.MTH1573();
                return true;
            }
            case 6: {
                ContentValues contentValues2 = (ContentValues)((ArrayList)object0).get(v);
                if(contentValues2 != null) {
                    Intent intent0 = new Intent();
                    intent0.putExtra("INTENT_FROMGALLERY", false);
                    intent0.putExtra("INTENT_TALKER", contentValues2.getAsString("userName"));
                    intent0.putExtra("INTENT_SNS_LOCAL_ID", "sns_table_" + contentValues2.getAsInteger("id"));
                    if(!CLS66.MTH1450("sns", ".ui.SnsCommentDetailUI", intent0)) {
                        intent0.setClassName(activity0, CLS27.MTH897("SnsCommentDetailUI"));
                        activity0.startActivity(intent0);
                    }
                }
                return true;
            }
            default: {
                CLS425 ˊﹳ0 = (CLS425)object0;
                String s = ˊﹳ0.FLD4088;
                CLS29 ˎᵢ0 = ˊﹳ0.FLD4090;
                if(!ˊﹳ0.FLD4101 && !ˊﹳ0.FLD4093) {
                    try {
                        if(((CLS78)ˊﹳ0.FLD4096.getItem(v)) != null && false) {
                            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                            if(!CLS404.MTH5909("")) {
                                linkedHashMap0.put(CLS27.MTH889("delete_message"), "delete");
                                if(ˎᵢ0.MTH938("blacklist_enable", CLS412.MTH6002())) {
                                    linkedHashMap0.put(CLS27.MTH889("auto_block_chat"), "block");
                                }
                                if(ˊﹳ0.FLD4096.MTH5045("")) {
                                    s1 = CLS27.MTH889("set_as_read");
                                    s2 = "set_as_read";
                                }
                                else {
                                    s1 = CLS27.MTH889("set_as_unread");
                                    s2 = "set_as_unread";
                                }
                                linkedHashMap0.put(s1, s2);
                                if(ˊﹳ0.FLD4096.FLD3287.contains("")) {
                                    s3 = CLS27.MTH889("remove_sticky_top");
                                    s4 = "remove_sticky_top";
                                }
                                else {
                                    s3 = CLS27.MTH889("sticky_top");
                                    s4 = "sticky_top";
                                }
                                linkedHashMap0.put(s3, s4);
                                if(ˊﹳ0.FLD4096.FLD3292.contains("")) {
                                    s5 = CLS27.MTH889("remove_sticky_bottom");
                                    s6 = "remove_sticky_bottom";
                                }
                                else {
                                    s5 = CLS27.MTH889("sticky_bottom");
                                    s6 = "sticky_bottom";
                                }
                                linkedHashMap0.put(s5, s6);
                                if(CLS426.MTH6126("") && ˎᵢ0.MTH938("chatroom_tags", false)) {
                                    linkedHashMap0.put(CLS27.MTH889("add_to_chatroom_tags"), "add_to_chatroom_tags");
                                }
                                if(ˎᵢ0.MTH938("moments_shortcut", CLS412.MTH6002()) && !CLS372.MTH5410("") && !CLS426.MTH6126("") && !CLS372.MTH5400("")) {
                                    linkedHashMap0.put(CLS27.MTH889("moments"), "moments");
                                }
                                if(ˎᵢ0.MTH938("delete_contact_shortcut", false) && !CLS372.MTH5410("") && !CLS372.MTH5400("")) {
                                    linkedHashMap0.put((CLS426.MTH6126("") ? CLS27.MTH889("leave_chatroom") : CLS27.MTH889("delete_contact2")), "delete_contact");
                                }
                                if(CLS27.MTH902("invite_member_shortcut") && ˎᵢ0.MTH938("invite_member_shortcut_enable", ˎᵢ0.MTH938("room_manangement_enable", CLS412.MTH6002())) && !CLS426.MTH6126("") && !CLS372.MTH5400("") && !CLS372.MTH5410("") && !CLS372.MTH5406("") && !"".equals(CLS27.MTH904())) {
                                    linkedHashMap0.put(CLS27.MTH889("invite_member"), "invite_member");
                                }
                                if(ˎᵢ0.MTH938("remark_contact_shortcut", CLS412.MTH6002()) && !CLS372.MTH5410("") && !CLS372.MTH5400("") && !CLS426.MTH6126("")) {
                                    linkedHashMap0.put(CLS27.MTH889("remark"), "remark");
                                }
                                if(ˎᵢ0.MTH938("mute_shortcut", false) && !CLS372.MTH5410("") && !CLS372.MTH5400("")) {
                                    linkedHashMap0.put(CLS27.MTH889((CLS372.MTH5396("") ? "unmute" : "mute")), "toggle_mute");
                                }
                                if(ˎᵢ0.MTH938("set_star_contact_shortcut", CLS412.MTH6002()) && !CLS372.MTH5410("") && !CLS372.MTH5400("")) {
                                    linkedHashMap0.put(CLS27.MTH889((CLS66.MTH1392("") ? "unset_star_contact" : "set_star_contact")), "toggle_star_contact");
                                }
                            }
                            if(s.startsWith("wx__c_")) {
                                linkedHashMap0.put(CLS27.MTH889("move_out"), "move_out");
                            }
                            if(!CLS404.MTH5909("") || s.startsWith("wx__c_")) {
                                linkedHashMap0.put(CLS27.MTH889("move_to"), "move_to");
                            }
                            if(!linkedHashMap0.isEmpty()) {
                                CLS523.MTH7159(activity0, "", linkedHashMap0, ((CLS7)new CLS1279(ˊﹳ0, activity0, "", 9)));
                                return true;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return true;
            }
        }
    }
}

