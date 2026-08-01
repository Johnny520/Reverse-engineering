// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS30;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS79;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS528;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS767 implements CLS37 {
    public final int FLD1053;
    public final CLS794 FLD1054;

    public CLS767(CLS794 ᴵʽ0, int v) {
        this.FLD1053 = v;
        this.FLD1054 = ᴵʽ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        String s10;
        CLS794 ᴵʽ0 = this.FLD1054;
        switch(this.FLD1053) {
            case 0: {
                ᴵʽ0.getClass();
                ContentValues contentValues0 = (ContentValues)arr_object[0];
                ᴵʽ0.MTH2705(contentValues0);
                if(!CLS412.MTH6002()) {
                    ᴵʽ0.MTH2696(contentValues0);
                }
                if(ᴵʽ0.MTH2682(contentValues0)) {
                    return true;
                }
                String s3 = contentValues0.getAsString("talker");
                if(contentValues0.containsKey("atuserlist")) {
                    String s4 = contentValues0.getAsString("content");
                    String s5 = contentValues0.getAsString("atuserlist");
                    if(!TextUtils.isEmpty(s5) && (CLS502.MTH6934(s5, new String[]{CLS27.MTH904()}) || CLS502.MTH6934(s5, new String[]{"@all"}))) {
                        CLS29 ˎᵢ1 = ᴵʽ0.FLD1445;
                        if(ˎᵢ1.MTH938("at_notification_enable", false)) {
                            String s6 = CLS426.MTH6106(0, s4, s3);
                            if(!TextUtils.isEmpty(s6)) {
                                String s7 = contentValues0.containsKey("nickname") ? contentValues0.getAsString("nickname") : "";
                                String s8 = contentValues0.containsKey("pushcontent") ? contentValues0.getAsString("pushcontent") : "";
                                int v1 = CLS182.MTH3474(0x38EC83002B3CD335L, contentValues0);
                                CLS371 ʻ0 = ᴵʽ0.FLD1444;
                                if(v1 == 49) {
                                    HashMap hashMap0 = CLS392.MTH5633(s6, "msg");
                                    s6 = hashMap0.containsKey(".msg.appmsg.textannouncement") ? ((String)hashMap0.get(".msg.appmsg.textannouncement")) : "";
                                    String s9 = (String)hashMap0.get(".msg.fromusername");
                                    s10 = String.format(CLS27.MTH889("at_notification"), ʻ0.MTH5316(s3), CLS66.MTH1452(s3, s9));
                                }
                                else if(TextUtils.isEmpty(s7) || TextUtils.isEmpty(s8)) {
                                    String s11 = CLS426.MTH6124(1, 0, s3, s4);
                                    s10 = String.format(CLS27.MTH889("at_notification"), ʻ0.MTH5316(s3), CLS66.MTH1452(s3, s11));
                                }
                                else {
                                    s10 = CLS34.MTH1079(4101798385218802485L, CLS182.MTH3483(s7), s8, 4101798393808737077L);
                                }
                                CLS412.MTH6014(((CLS140)ᴵʽ0).MTH3042(), s10 + s6);
                                if(ˎᵢ1.MTH938("at_notification_en", false)) {
                                    Bitmap bitmap0 = CLS372.MTH5411(s3);
                                    CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
                                    ((CLS485)CLS40.FLD157.MTH1118(CLS485.class)).getClass();
                                    Intent intent0 = CLS485.MTH6731(s3);
                                    ᐧﾞ0.getClass();
                                    try {
                                        Context context0 = CLS27.MTH900();
                                        if(bitmap0 == null) {
                                            bitmap0 = CLS404.MTH5887();
                                        }
                                        Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap0).setContentTitle(s10).setSmallIcon(CLS485.MTH6745()).setAutoCancel(false);
                                        if(!TextUtils.isEmpty(s6)) {
                                            notification$Builder0.setContentText(s6);
                                        }
                                        if(CLS390.MTH5615(context0)) {
                                            CLS485.MTH6726(context0, "at");
                                            notification$Builder0.setChannelId(CLS485.MTH6736("wx_at"));
                                        }
                                        int v2 = CLS485.MTH6728();
                                        notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, v2, intent0, 0x8000000) : PendingIntent.getActivity(context0, v2, intent0, 0xC000000)));
                                        CLS30.MTH955(notification$Builder0);
                                        Notification notification0 = notification$Builder0.build();
                                        notification0.flags = 17;
                                        notification0.ledOnMS = 300;
                                        notification0.ledOffMS = 1000;
                                        notification0.ledARGB = 0xFF00FF00;
                                        CLS485.MTH6741(notification0, v2);
                                    }
                                    catch(Throwable throwable0) {
                                        CLS27.MTH893(throwable0);
                                    }
                                }
                            }
                        }
                        Object object2 = arr_object[1];
                        String s12 = (String)arr_object[2];
                        if(ˎᵢ1.MTH938("prevent_at_enable", false)) {
                            String s13 = ˎᵢ1.MTH925("prevent_at_include", "");
                            if(TextUtils.isEmpty(s13) || CLS502.MTH6934(s13, new String[]{s3})) {
                                String s14 = ˎᵢ1.MTH925("prevent_at_exclude", "");
                                if((TextUtils.isEmpty(s14) || !CLS502.MTH6934(s14, new String[]{s3})) && !TextUtils.isEmpty(s12)) {
                                    String s15 = CLS502.MTH6934(s12, new String[]{"announcement@all"}) ? s12.replace("announcement@all", "") : s12.replaceAll(CLS27.MTH904(), "");
                                    CLS166.MTH3198(object2, CLS27.MTH897("dataFieldMsgSource"), s15);
                                }
                            }
                        }
                    }
                }
                return null;
            }
            case 1: {
                return ᴵʽ0.FLD1159;
            }
            case 2: {
                if(!ᴵʽ0.FLD1447.FLD1407.MTH5947("_config_chatroom")) {
                    CLS29 ˎᵢ2 = ᴵʽ0.FLD1445;
                    if(ˎᵢ2.MTH938("room_manangement_enable", false)) {
                        Object object3 = arr_object[0];
                        int v3 = CLS166.MTH3181(object3, "field_isSend");
                        String s16 = (String)CLS166.MTH3194(object3, "field_talker");
                        if(v3 != 1 && CLS426.MTH6126(s16)) {
                            String s17 = CLS426.MTH6124(CLS166.MTH3181(object3, "field_type"), v3, s16, ((String)CLS166.MTH3194(object3, "field_content")));
                            String s18 = ᴵʽ0.FLD1444.MTH5343(s16);
                            if(!TextUtils.isEmpty(s17) && !s17.equals(CLS27.MTH904()) && !s17.equals(s18) && CLS426.MTH6128(s16) && CLS182.MTH3480(4101841111553463093L, CLS182.MTH3483(s16), ˎᵢ2, false)) {
                                CLS528 ʽי0 = new CLS528();
                                ʽי0.FLD5167 = "10";
                                ʽי0.FLD5165 = "chatroom_management";
                                ʽי0.FLD5166 = "icons_filled_group_detail";
                                return Pair.create(CLS27.MTH889("chatroom_management"), "");
                            }
                        }
                    }
                }
                return null;
            }
            case 3: {
                if(!ᴵʽ0.FLD1447.FLD1407.MTH5947("_config_chatroom") && ᴵʽ0.FLD1445.MTH938("mod_cmd_enable", false)) {
                    Object object4 = arr_object[0];
                    int v4 = CLS166.MTH3181(object4, "field_isSend");
                    String s19 = (String)CLS166.MTH3194(object4, "field_talker");
                    if(v4 != 1 && CLS426.MTH6126(s19)) {
                        String s20 = CLS426.MTH6124(CLS166.MTH3181(object4, "field_type"), v4, s19, ((String)CLS166.MTH3194(object4, "field_content")));
                        String s21 = ᴵʽ0.FLD1444.MTH5343(s19);
                        if(!TextUtils.isEmpty(s20) && !s20.equals(CLS27.MTH904()) && !s20.equals(s21) && !CLS426.MTH6128(s19)) {
                            CLS528 ʽי1 = new CLS528();
                            ʽי1.FLD5167 = "9";
                            ʽי1.FLD5165 = "send_mod_cmd";
                            ʽי1.FLD5166 = "icons_filled_grouptool";
                            return Pair.create(CLS27.MTH889("send_mod_cmd"), "");
                        }
                    }
                }
                return null;
            }
            case 4: {
                ᴵʽ0.getClass();
                return ᴵʽ0.FLD1445.MTH938("chatroom_tags", false) ? Pair.create(CLS27.MTH889("chatroom_tags"), "config_chatroomtag") : null;
            }
            case 5: {
                ᴵʽ0.getClass();
                return ᴵʽ0.FLD1445.MTH938("mass_announce_shortcut", true) ? Pair.create(CLS27.MTH889("mass_announce"), "mass_announce_shortcut") : null;
            }
            case 6: {
                ᴵʽ0.getClass();
                return ᴵʽ0.FLD1445.MTH938("chatroom_tags", false) ? Pair.create(CLS27.MTH889("chatroom_tags"), "chatroom_tags") : null;
            }
            case 7: {
                return !ᴵʽ0.FLD1447.FLD1407.MTH5947("_config_chatroom") && (ᴵʽ0.FLD1445.MTH938("room_manangement_enable", false) && CLS426.MTH6126(((String)arr_object[0]))) ? Pair.create(CLS27.MTH889("chatroom_management"), "chatroom_management") : null;
            }
            case 8: {
                ᴵʽ0.getClass();
                return ᴵʽ0.FLD1445.MTH938("chatroom_custom_at_enable", false) && CLS426.MTH6126(((String)arr_object[0])) ? Pair.create(CLS27.MTH889("at_multi"), "at_multi") : null;
            }
            case 9: {
                ᴵʽ0.getClass();
                boolean z = CLS412.MTH6002();
                boolean z1 = ᴵʽ0.FLD1445.MTH938("room_manangement_enable", z);
                if(ᴵʽ0.FLD1445.MTH938("invite_member_shortcut_enable", z1)) {
                    String s22 = (String)arr_object[0];
                    if(!CLS426.MTH6126(s22) && !CLS372.MTH5400(s22) && !CLS372.MTH5410(s22) && !CLS372.MTH5406(s22) && !CLS404.MTH5909(s22) && !s22.equals(CLS27.MTH904())) {
                        return Pair.create(CLS27.MTH889("invite_member"), "invite_member");
                    }
                }
                return null;
            }
            case 10: {
                ᴵʽ0.getClass();
                return ᴵʽ0.FLD1445.MTH938("pat_all_enable", false) && CLS426.MTH6126(((String)arr_object[0])) ? Pair.create(CLS27.MTH889("pat_all"), "pat_all") : null;
            }
            case 11: {
                if(ᴵʽ0.FLD1447.FLD1438.MTH6895("auto_friendreq")) {
                    boolean z2 = CLS412.MTH6002();
                    if(ᴵʽ0.FLD1445.MTH938("contact_chatroom_enable2", z2)) {
                        return Pair.create(CLS27.MTH889("send_friend_req"), "chatroom_friend_req");
                    }
                }
                return null;
            }
            case 12: {
                ᴵʽ0.getClass();
                return ᴵʽ0.FLD1445.MTH938("room_manangement_enable", false) ? Pair.create(CLS27.MTH889("chatroom_management"), "room_management") : null;
            }
            case 13: {
                ᴵʽ0.getClass();
                return ᴵʽ0.FLD1445.MTH938("chatroom_tags", false) ? Pair.create(CLS27.MTH889("add_to_chatroom_tags"), "add_to_chatroom_tags") : null;
            }
            case 14: {
                return ᴵʽ0.FLD1447.FLD1438.MTH6895("chatroom_send_multi_invites") ? Pair.create(CLS27.MTH889("chatroom_send_multi_invites"), "send_invites") : null;
            }
            default: {
                ᴵʽ0.getClass();
                if(ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
                    String s = (String)arr_object[0];
                    CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
                    ˎᵢ0.getClass();
                    ArrayList arrayList0 = new ArrayList();
                    String[] arr_s = CLS502.MTH6941(ˎᵢ0.MTH1624());
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s1 = arr_s[v];
                        if(s1.startsWith("wx__c_")) {
                            arrayList0.add(s1);
                        }
                    }
                    if(!arrayList0.isEmpty()) {
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object0: arrayList0) {
                            String s2 = (String)object0;
                            if(ˎᵢ0.MTH1655(s2).contains(s)) {
                                arrayList1.add(s2);
                            }
                        }
                        if(arrayList1.isEmpty()) {
                            return Pair.create(CLS27.MTH889("chatcontainer"), "chatcontainer");
                        }
                        StringBuilder stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(CLS27.MTH889("chatcontainer"));
                        stringBuilder0.append(": ");
                        for(Object object1: arrayList1) {
                            stringBuilder0.append(ˎᵢ0.MTH1625(((String)object1)));
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.deleteCharAt(stringBuilder0.lastIndexOf(","));
                        return Pair.create(stringBuilder0.toString().trim(), "chatcontainer_actions#" + TextUtils.join(",", arrayList1));
                    }
                }
                return null;
            }
        }
    }
}

