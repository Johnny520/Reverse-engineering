// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS576;
import b.ˆٴ.CLS66;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CLS727 implements CLS35 {
    public final int FLD889;
    public final CLS725 FLD890;

    public CLS727(CLS725 ˏˈ0, int v) {
        this.FLD889 = v;
        this.FLD890 = ˏˈ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        String s15;
        CLS725 ˏˈ0 = this.FLD890;
        switch(this.FLD889) {
            case 0: {
                Object object0 = null;
                ˏˈ0.getClass();
                Object object1 = arr_object[0];
                try {
                    Field field0 = object1.getClass().getDeclaredField("thisObject");
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object0 = field0.get(object1);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS412.MTH6009(((Activity)object0)).equals(CLS27.MTH897("SnsMsgUI"))) {
                    CLS485 ᐧﾞ1 = ˏˈ0.MTH2410();
                    HashMap hashMap0 = ᐧﾞ1.FLD4738;
                    for(Object object2: hashMap0.values()) {
                        ᐧﾞ1.MTH6733(((int)(((Integer)object2))));
                    }
                    hashMap0.clear();
                }
                return;
            }
            case 1: {
                ˏˈ0.getClass();
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                String s3 = (String)arr_object[3];
                String s4 = (String)arr_object[4];
                int v = (int)(((Integer)arr_object[5]));
                CLS21 ʾᵢ0 = CLS21.FLD76;
                if(!ʾᵢ0.MTH830("isHidden", new Object[]{s3})) {
                    if(ʾᵢ0.MTH830("isBlocked", new Object[]{s3, s4, v})) {
                        ᵔʾ0.MTH3207(null);
                        return;
                    }
                    try {
                        ˏˈ0.MTH2411(ᵔʾ0, s3, s4, v);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                return;
            }
            case 2: {
                CLS139 ﹶʼ0 = ˏˈ0.FLD1447;
                if(!ﹶʼ0.FLD1410) {
                    Object object3 = arr_object[0];
                    String s5 = (String)arr_object[2];
                    ContentValues contentValues0 = (ContentValues)arr_object[3];
                    CLS371 ʻ0 = ˏˈ0.FLD1444;
                    CLS29 ˎᵢ1 = ˏˈ0.FLD1445;
                    if("snscomment".equalsIgnoreCase(s5) && ˎᵢ1.MTH938("new_comment_notification_enable", false)) {
                        String s6 = contentValues0.getAsString("talker");
                        String s7 = CLS27.MTH889("new_comment");
                        if(Build.VERSION.SDK_INT < 24) {
                            s7 = ʻ0.MTH5311(s6) + " " + s7;
                        }
                        Bitmap bitmap1 = CLS372.MTH5411(s6);
                        String s8 = CLS27.MTH889("no_content");
                        if(!CLS27.MTH901() && ˎᵢ1.MTH938("show_comment_content_enable", true)) {
                            Class class0 = CLS27.MTH894("commentClass");
                            if(class0 != null) {
                                s8 = (String)CLS182.MTH3492(0x38ECDBF32B3CD335L, CLS66.MTH1381(class0, contentValues0.getAsByteArray("curActionBuf")));
                            }
                        }
                        Intent intent0 = new Intent();
                        intent0.setClassName(CLS390.MTH5619(CLS27.MTH900()), CLS27.MTH897("SnsMsgUI"));
                        intent0.putExtra("INTENT_SNSID", "sns_table_" + contentValues0.getAsString("snsID"));
                        intent0.putExtra("INTENT_FROMSUI", true);
                        intent0.putExtra("INTENT_FROMSUI_COMMENTID", contentValues0.getAsLong("commentSvrID"));
                        ˏˈ0.MTH2410().MTH6744(intent0, bitmap1, s6, s7, s8, "new_comment");
                    }
                    CLS500 ᵢﹶ0 = ﹶʼ0.FLD1438;
                    if("message".equalsIgnoreCase(s5) && ˎᵢ1.MTH938("keyword_notification_enable", false) && ᵢﹶ0.MTH6895("keyword_notification") && CLS182.MTH3474(4101891040548279093L, contentValues0) == 1) {
                        int v1 = CLS182.MTH3474(4101891062023115573L, contentValues0);
                        if(v1 != 1) {
                            String s9 = contentValues0.getAsString("talker");
                            String s10 = contentValues0.getAsString("content");
                            if(!CLS21.FLD76.MTH830("isBlocked", new Object[]{s9, s10, 1}) && !CLS502.MTH6934(ˎᵢ1.MTH925("keyword_notif_excl", ""), new String[]{s9}) && !CLS21.FLD76.MTH830("isHidden", new Object[]{s9})) {
                                if(ˏˈ0.FLD883 == null) {
                                    String s11 = ˎᵢ1.MTH925("keyword_notif_keyword_text", "");
                                    if(!TextUtils.isEmpty(s11)) {
                                        ˏˈ0.FLD883 = Pattern.compile(s11, 2);
                                    }
                                }
                                Pattern pattern0 = ˏˈ0.FLD883;
                                if(pattern0 != null) {
                                    Matcher matcher0 = pattern0.matcher(s10);
                                    if(matcher0.find()) {
                                        String s12 = matcher0.group(0);
                                        if(!TextUtils.isEmpty(s12)) {
                                            String s13 = CLS426.MTH6106(v1, s10, s9).replaceAll(s12, "<b><font color=\'#FFB900\'>" + s12 + "</font></b>");
                                            if(CLS426.MTH6126(s9)) {
                                                String s14 = CLS426.MTH6109(s10);
                                                s15 = ʻ0.MTH5311(s9) + " (" + CLS613.MTH1971(CLS66.MTH1452(s9, s14)) + ")";
                                            }
                                            else {
                                                s15 = ʻ0.MTH5311(s9);
                                            }
                                            CLS485 ᐧﾞ2 = ˏˈ0.MTH2410();
                                            String s16 = CLS27.MTH889("keyword_notification") + " " + s15;
                                            Spanned spanned0 = Html.fromHtml(s13);
                                            Bitmap bitmap2 = CLS372.MTH5411(s9);
                                            ˏˈ0.MTH2410().getClass();
                                            Intent intent1 = CLS485.MTH6731(s9);
                                            ᐧﾞ2.getClass();
                                            try {
                                                Context context0 = CLS27.MTH900();
                                                if(bitmap2 == null) {
                                                    bitmap2 = CLS404.MTH5887();
                                                }
                                                Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap2).setContentTitle(s16).setSmallIcon(CLS485.MTH6745()).setAutoCancel(false);
                                                if(CLS390.MTH5615(context0)) {
                                                    CLS485.MTH6726(context0, "keyword");
                                                    notification$Builder0.setChannelId(CLS485.MTH6736("wx_keyword"));
                                                }
                                                if(!TextUtils.isEmpty(spanned0)) {
                                                    notification$Builder0.setContentText(spanned0);
                                                }
                                                int v2 = CLS485.MTH6728();
                                                notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, v2, intent1, 0x8000000) : PendingIntent.getActivity(context0, v2, intent1, 0xC000000)));
                                                CLS485.MTH6722(notification$Builder0, "keyword");
                                                Notification notification0 = notification$Builder0.build();
                                                notification0.flags = 17;
                                                notification0.ledOnMS = 300;
                                                notification0.ledOffMS = 1000;
                                                notification0.ledARGB = 0xFF00FF00;
                                                CLS485.MTH6724("keyword", notification0);
                                                CLS485.MTH6748("keyword", notification0);
                                                CLS485.MTH6741(notification0, v2);
                                            }
                                            catch(Throwable throwable0) {
                                                CLS27.MTH893(throwable0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if("snsinfo".equalsIgnoreCase(s5) && !contentValues0.containsKey("rowid") && contentValues0.containsKey("userName")) {
                        String s17 = contentValues0.getAsString("userName");
                        boolean z = s17.equals(CLS27.MTH904());
                        if((!contentValues0.containsKey("snsId") || CLS34.MTH1080(4101893467204801333L, contentValues0) != 0L) && !z && !CLS481.MTH6686(86400000L, contentValues0) && ˎᵢ1.MTH938("moments_notification_enable", false) && (ˎᵢ1.MTH938("timeline_sync_enable", false) || ˎᵢ1.MTH938("moments_forward_enable", CLS412.MTH6002()) && ᵢﹶ0.MTH6897()) && (!ˎᵢ1.MTH938("notif_moments_selected", false) || CLS502.MTH6934(ˎᵢ1.MTH925("notif_moments_selected_list", ""), new String[]{s17}))) {
                            long v3 = CLS34.MTH1080(4101894025550549813L, contentValues0);
                            int v4 = CLS182.MTH3474(4101894051320353589L, contentValues0);
                            String s18 = contentValues0.getAsString("userName");
                            if(CLS21.FLD76.MTH830("isHidden", new Object[]{s18})) {
                                String s19 = CLS27.MTH889("moments_notification_text");
                                CLS485 ᐧﾞ3 = ˏˈ0.MTH2410();
                                Bitmap bitmap3 = CLS372.MTH5411(s18);
                                ˏˈ0.MTH2410().getClass();
                                ᐧﾞ3.MTH6713(s18, String.format(s19, ""), "", null, bitmap3, v3, CLS485.MTH6743());
                                return;
                            }
                            CLS859 ﹳי0 = new CLS859(ˏˈ0, s18, String.format(CLS27.MTH889("moments_notification_text"), ʻ0.MTH5311(s18)), CLS66.MTH1424(contentValues0.getAsByteArray("content")), v3);
                            long v5 = CLS396.FLD3775.MTH5756(String.valueOf(v3));
                            if(v4 == 1) {
                                CLS466.MTH6534(((CLS6)new CLS576(((CLS12)ﹳי0), 8)), CLS66.MTH1508(("sns_table_" + v5)));
                                return;
                            }
                            if(v4 == 15) {
                                if(CLS613.MTH1965(CLS27.MTH900())) {
                                    if(ˎᵢ1.MTH938("moment_wifi_autoplay", !CLS412.MTH6002())) {
                                        goto label_146;
                                    }
                                }
                                else if(ˎᵢ1.MTH938("moment_data_autoplay", !CLS412.MTH6002())) {
                                label_146:
                                    CLS650 ʽᴵ0 = new CLS650(0, ((CLS12)ﹳי0), "sns_table_" + v5);
                                    CLS40.FLD157.MTH1123(((CLS39)ʽᴵ0), 10000L);
                                    return;
                                }
                            }
                            ﹳי0.MTH791(null);
                        }
                    }
                }
                return;
            }
            case 3: {
                boolean z1 = ˏˈ0.FLD1447.FLD1438.MTH6895("keyword_notification");
                CLS29 ˎᵢ2 = ˏˈ0.FLD1445;
                if(z1) {
                    String s20 = ˎᵢ2.MTH925("keyword_notif_keyword_text", "");
                    if(!TextUtils.isEmpty(s20)) {
                        ˏˈ0.FLD883 = Pattern.compile(s20, 2);
                    }
                }
                if(ˎᵢ2.MTH938("custom_notification_enable", false)) {
                    String s21 = ˎᵢ2.MTH925("custom_keyword_excl_text", "");
                    if(!TextUtils.isEmpty(s21)) {
                        ˏˈ0.FLD882 = Pattern.compile(s21, 2);
                    }
                }
                return;
            }
            default: {
                ˏˈ0.getClass();
                CLS29 ˎᵢ0 = ˏˈ0.FLD1445;
                if(ˎᵢ0.MTH938("moments_notification_enable", false) && !ˎᵢ0.MTH938("timeline_sync_enable", false) && (!ˎᵢ0.MTH938("moments_forward_enable", CLS412.MTH6002()) || !ˏˈ0.FLD1447.FLD1438.MTH6897())) {
                    String s = (String)arr_object[0];
                    if(!ˎᵢ0.MTH938("notif_moments_selected", false) || CLS502.MTH6934(ˎᵢ0.MTH925("notif_moments_selected_list", ""), new String[]{s})) {
                        String s1 = ˏˈ0.FLD1444.MTH5311(s);
                        if(CLS21.FLD76.MTH830("isHidden", new Object[]{s})) {
                            s1 = "";
                        }
                        String s2 = CLS27.MTH889("moments_notification_text");
                        CLS485 ᐧﾞ0 = ˏˈ0.MTH2410();
                        Bitmap bitmap0 = CLS372.MTH5411(s);
                        ˏˈ0.MTH2410().getClass();
                        ᐧﾞ0.MTH6713(s, String.format(s2, s1), "", null, bitmap0, 0L, CLS485.MTH6743());
                    }
                }
            }
        }
    }
}

