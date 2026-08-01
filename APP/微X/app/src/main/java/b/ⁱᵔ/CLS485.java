// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Notification.Action.Builder;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.Builder;
import android.app.Notification.MessagingStyle.Message;
import android.app.Notification.MessagingStyle;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Person.Builder;
import android.app.Person;
import android.app.RemoteInput.Builder;
import android.app.RemoteInput;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS30;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS777;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS485 {
    public static final class CLS484 {
        public final int FLD4732;
        public final Notification.Builder FLD4733;

        public CLS484(int v, Notification.Builder notification$Builder0) {
            this.FLD4732 = v;
            this.FLD4733 = notification$Builder0;
        }
    }

    public final HashMap FLD4734;
    public final HashMap FLD4735;
    public final HashMap FLD4736;
    public final ArrayList FLD4737;
    public final HashMap FLD4738;
    public boolean FLD4739;
    public final HashMap FLD4740;

    // 此方法包含解密的字符串
    public CLS485() {
        this.FLD4737 = new ArrayList();
        this.FLD4736 = new HashMap();
        this.FLD4740 = new HashMap();
        this.FLD4738 = new HashMap();
        this.FLD4735 = new HashMap();
        this.FLD4734 = new HashMap();
        CLS777 ᐧʾ0 = new CLS777(2, this);
        CLS21.FLD76.MTH828("show_sf_notification", ((CLS35)ᐧʾ0));
    }

    // 此方法包含解密的字符串
    public static void MTH6710(Notification.Builder notification$Builder0, int v, long v1, String s) {
        int v3;
        Context context0;
        int v2 = Build.VERSION.SDK_INT;
        if(v2 < 20) {
            return;
        }
        RemoteInput remoteInput0 = new RemoteInput.Builder("wx_direct_reply").setLabel(CLS27.MTH889("comment")).build();
        Intent intent0 = new Intent("wx_notification_direct_reply");
        intent0.putExtra("notification_id", v);
        intent0.putExtra("snsId", v1);
        intent0.putExtra("notification_tag", s);
        if(v2 >= 0x1F) {
            context0 = CLS27.MTH900();
            v3 = 0xA000000;
        }
        else {
            context0 = CLS27.MTH900();
            v3 = 0x8000000;
        }
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, v, intent0, v3);
        if(pendingIntent0 == null) {
            return;
        }
        notification$Builder0.addAction(new Notification.Action.Builder(0x108008E, CLS27.MTH889("comment"), pendingIntent0).addRemoteInput(remoteInput0).build());
    }

    // 此方法包含解密的字符串
    public final void MTH6711(Intent intent0, Bitmap bitmap0, String s, String s1, String s2, String s3) {
        try {
            Context context0 = CLS27.MTH900();
            if(bitmap0 == null) {
                bitmap0 = CLS404.MTH5887();
            }
            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap0).setSmallIcon(CLS485.MTH6745()).setContentTitle(s1).setContentText(s2).setAutoCancel(false);
            if(CLS390.MTH5615(context0)) {
                CLS485.MTH6726(context0, s3);
                notification$Builder0.setChannelId(CLS485.MTH6736(("wx_" + s3)));
            }
            HashMap hashMap0 = this.FLD4734;
            if(!hashMap0.containsKey(s)) {
                hashMap0.put(s, ((int)(CLS485.MTH6728() + 1)));
            }
            int v = (int)(((Integer)hashMap0.get(s)));
            notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, v, intent0, 0x8000000) : PendingIntent.getActivity(context0, v, intent0, 0xC000000)));
            CLS485.MTH6722(notification$Builder0, s3);
            Notification notification0 = notification$Builder0.build();
            notification0.flags = 17;
            notification0.ledOnMS = 200;
            notification0.ledOffMS = 1100;
            notification0.ledARGB = 0xFFFFFF00;
            CLS485.MTH6732(s3, notification0);
            CLS485.MTH6714(s3, notification0);
            CLS485.MTH6741(notification0, v);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6712(String s, Notification.Builder notification$Builder0, int v) {
        Context context0;
        int v1 = Build.VERSION.SDK_INT;
        int v2 = 0x8000000;
        if(v1 >= 20) {
            RemoteInput remoteInput0 = new RemoteInput.Builder("wx_direct_reply").setLabel(CLS27.MTH889("reply")).build();
            Intent intent0 = new Intent("wx_notification_direct_reply");
            intent0.putExtra("talkerCount", 1);
            intent0.putExtra("nofification_type", "new_msg_nofification");
            intent0.putExtra("Main_User", s);
            intent0.putExtra("Intro_Is_Muti_Talker", false);
            intent0.putExtra("Intro_Bottle_unread_count", 0);
            intent0.putExtra("MainUI_User_Last_Msg_Type", 1);
            intent0.putExtra("notification_id", v);
            if(v1 >= 0x1F) {
                context0 = CLS27.MTH900();
                v2 = 0xA000000;
            }
            else {
                context0 = CLS27.MTH900();
            }
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, v, intent0, v2);
            if(pendingIntent0 != null) {
                notification$Builder0.addAction(new Notification.Action.Builder(0x108008E, CLS27.MTH889("reply"), pendingIntent0).addRemoteInput(remoteInput0).build());
            }
        }
        else if(v1 >= 16) {
            Intent intent1 = CLS485.MTH6731(s);
            PendingIntent pendingIntent1 = PendingIntent.getActivity(CLS27.MTH900(), v, intent1, 0x8000000);
            if(pendingIntent1 == null) {
                return;
            }
            notification$Builder0.addAction(0x108008E, CLS27.MTH889("reply"), pendingIntent1);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH6713(String s, String s1, String s2, ArrayList arrayList0, Bitmap bitmap0, long v, Intent intent0) {
        int v2;
        try {
            Context context0 = CLS27.MTH900();
            if(CLS485.MTH6730("moments")) {
                return;
            }
            Bitmap bitmap1 = bitmap0 == null ? CLS404.MTH5887() : bitmap0;
            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap1).setSmallIcon(CLS485.MTH6745()).setContentTitle(s1).setContentText(s2).setAutoCancel(true);
            if(CLS390.MTH5615(context0)) {
                CLS485.MTH6726(context0, "moments");
                notification$Builder0.setChannelId(CLS485.MTH6736("wx_moments"));
            }
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 24) {
                String s3 = CLS27.MTH884();
                if(TextUtils.isEmpty(s3)) {
                    s3 = CLS27.MTH889("TabLabelMe");
                }
                Notification.MessagingStyle notification$MessagingStyle0 = v1 < 28 ? new Notification.MessagingStyle(s3) : new Notification.MessagingStyle(CLS485.MTH6718(s3, CLS27.MTH904()));
                notification$MessagingStyle0.setConversationTitle(s1);
                String s4 = CLS371.FLD3470.MTH5311(s);
                if(v1 >= 28) {
                    Person person0 = CLS485.MTH6718(s4, s);
                    if(!TextUtils.isEmpty(s2)) {
                        notification$MessagingStyle0.addMessage(s2, System.currentTimeMillis(), person0);
                    }
                    if(arrayList0 != null) {
                        for(Object object0: arrayList0) {
                            String s5 = CLS31.MTH992(CLS66.MTH1395(((String)object0)));
                            notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message("", System.currentTimeMillis(), person0).setData("image/*", CLS66.MTH1491(CLS27.MTH900(), new File(s5))));
                        }
                    }
                }
                else if(arrayList0 != null) {
                    notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message(s2, System.currentTimeMillis(), s4));
                    for(Object object1: arrayList0) {
                        String s6 = CLS31.MTH992(CLS66.MTH1395(((String)object1)));
                        notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message("", System.currentTimeMillis(), s4).setData("image/*", CLS66.MTH1491(CLS27.MTH900(), new File(s6))));
                    }
                }
                else if(!TextUtils.isEmpty(s2)) {
                    notification$MessagingStyle0.addMessage(s2, System.currentTimeMillis(), s4);
                }
                notification$Builder0.setStyle(notification$MessagingStyle0);
            }
            else if(!TextUtils.isEmpty(s2)) {
                notification$Builder0.setContentText(s2);
            }
            HashMap hashMap0 = this.FLD4735;
            if(hashMap0.containsKey(s + v)) {
                v2 = (int)(((Integer)hashMap0.get(s + v)));
            }
            else {
                int v3 = CLS485.MTH6728();
                hashMap0.put(s + v, v3);
                v2 = v3;
            }
            if(v != 0L) {
                CLS485.MTH6710(notification$Builder0, v2, v, s + v);
            }
            notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, v2, intent0, 0x8000000) : PendingIntent.getActivity(context0, v2, intent0, 0xC000000)));
            CLS485.MTH6722(notification$Builder0, "moments");
            Notification notification0 = notification$Builder0.build();
            notification0.flags = 17;
            notification0.ledOnMS = 300;
            notification0.ledOffMS = 1000;
            notification0.ledARGB = 0xFFFF0000;
            CLS485.MTH6748("moments", notification0);
            CLS485.MTH6724("moments", notification0);
            CLS485.MTH6741(notification0, v2);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6714(String s, Notification notification0) {
        CLS29 ˎᵢ0 = CLS27.MTH895();
        if(!CLS182.MTH3480(4101216451509932853L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            return;
        }
        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
        stringBuilder0.append("rp_sound_uri");
        Uri uri0 = CLS485.MTH6734(stringBuilder0.toString());
        if(uri0 != null) {
            notification0.sound = uri0;
            return;
        }
        notification0.defaults |= 1;
    }

    // 此方法包含解密的字符串
    public final void MTH6715(String s, String s1, Bitmap bitmap0, Intent intent0, String s2, Bitmap bitmap1) {
        try {
            Context context0 = CLS27.MTH900();
            if(bitmap1 == null) {
                bitmap1 = CLS404.MTH5887();
            }
            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap1).setSmallIcon(CLS485.MTH6745()).setContentTitle(s1).setAutoCancel(true);
            if(bitmap0 == null) {
                notification$Builder0.setContentText(s2);
            }
            else {
                notification$Builder0.setStyle(new Notification.BigPictureStyle().bigPicture(bitmap0).setSummaryText(s2));
            }
            if(CLS390.MTH5615(context0)) {
                CLS485.MTH6726(context0, "msg_recall");
                notification$Builder0.setChannelId(CLS485.MTH6736("wx_msg_recall"));
            }
            intent0.setClassName(CLS390.MTH5619(context0), CLS27.MTH897("ChattingUI"));
            this.MTH6742(notification$Builder0, intent0, CLS485.MTH6728(), s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6716(Context context0, String s) {
        if(Build.VERSION.SDK_INT < 26) {
            return;
        }
        if(!CLS485.MTH6739(context0, s)) {
            return;
        }
        try {
            NotificationManager notificationManager0 = (NotificationManager)CLS27.MTH900().getSystemService("notification");
            if(notificationManager0 == null) {
                return;
            }
            notificationManager0.deleteNotificationChannel(CLS485.MTH6736(s));
            CLS485.MTH6735(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH6717(String s, String s1, String s2, String s3, Bitmap bitmap0, String s4, Intent intent0) {
        Notification.MessagingStyle.Message notification$MessagingStyle$Message0;
        String s13;
        try {
            Context context0 = CLS27.MTH900();
            CLS29 ˎᵢ0 = CLS27.MTH895();
            Bitmap bitmap1 = bitmap0 == null ? CLS404.MTH5887() : bitmap0;
            String s5 = ˎᵢ0.MTH938("notif_" + s + "_notification_enable", false) ? "notif_" + s : "custom";
            if(CLS485.MTH6730(s5)) {
                return;
            }
            boolean z = CLS426.MTH6126(s);
            String s6 = CLS502.MTH6923((z ? CLS426.MTH6116(s, s1) : CLS371.FLD3470.MTH5311(s)));
            CLS371 ʻ0 = CLS371.FLD3470;
            int v = ʻ0.MTH5375(s);
            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap1).setSmallIcon(CLS485.MTH6745()).setNumber(v).setAutoCancel(true);
            if(CLS390.MTH5615(context0)) {
                String s7 = !s5.equals("custom") || !z ? s5 : s5 + "_chatroom";
                CLS485.MTH6726(context0, s7);
                notification$Builder0.setChannelId(CLS485.MTH6736(("wx_" + s7)));
            }
            int v1 = Build.VERSION.SDK_INT;
            if(v1 < 24 || CLS27.MTH895().MTH938(s5 + "_oldstyle", false)) {
                notification$Builder0.setContentTitle(s2 + " [" + (v + 1) + "]");
                if(!TextUtils.isEmpty(s4)) {
                    Bitmap bitmap2 = CLS518.MTH7061(s4);
                    notification$Builder0.setStyle(new Notification.BigPictureStyle().bigPicture(bitmap2).setSummaryText(s3));
                }
                else if(!TextUtils.isEmpty(s3)) {
                    if(!z) {
                        s13 = s3;
                    }
                    else if(TextUtils.isEmpty(s6)) {
                        s13 = CLS502.MTH6923(s3);
                    }
                    else {
                        s13 = s6 + ": " + CLS502.MTH6923(s3);
                    }
                    notification$Builder0.setContentText(s13);
                }
            }
            else {
                notification$Builder0.setContentTitle(s2);
                String s8 = CLS27.MTH884();
                if(TextUtils.isEmpty(s8)) {
                    s8 = CLS27.MTH889("TabLabelMe");
                }
                Notification.MessagingStyle notification$MessagingStyle0 = v1 < 28 ? new Notification.MessagingStyle(s8) : new Notification.MessagingStyle(CLS485.MTH6718(s8, CLS27.MTH904()));
                notification$MessagingStyle0.setConversationTitle(CLS502.MTH6923(ʻ0.MTH5316(s)));
                if(v > 1) {
                    ArrayList arrayList0 = CLS404.MTH5902(v, s);
                    if(!arrayList0.isEmpty()) {
                        for(Object object0: arrayList0) {
                            ContentValues contentValues0 = (ContentValues)object0;
                            String s9 = contentValues0.containsKey("content") ? contentValues0.getAsString("content") : null;
                            long v2 = (long)contentValues0.getAsLong("createTime");
                            int v3 = (int)contentValues0.getAsInteger("isSend");
                            if(Build.VERSION.SDK_INT >= 28) {
                                Person person0 = v3 == 0 ? CLS485.MTH6737(CLS502.MTH6923(contentValues0.getAsString("senderNickname")), contentValues0.getAsString("sender"), bitmap0) : null;
                                if(contentValues0.containsKey("imagePath")) {
                                    String s10 = contentValues0.getAsString("imagePath");
                                    if(CLS31.MTH1024(s10)) {
                                        notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message(CLS502.MTH6923(s9), v2, person0).setData("image/*", CLS66.MTH1491(CLS27.MTH900(), new File(s10))));
                                        continue;
                                    }
                                    else {
                                        notification$MessagingStyle$Message0 = new Notification.MessagingStyle.Message(CLS502.MTH6923(s9), v2, person0);
                                        goto label_44;
                                    }
                                    goto label_42;
                                }
                                else {
                                label_42:
                                    if(TextUtils.isEmpty(s9)) {
                                        continue;
                                    }
                                    notification$MessagingStyle$Message0 = new Notification.MessagingStyle.Message(CLS502.MTH6923(s9), v2, person0);
                                }
                            label_44:
                                notification$MessagingStyle0.addMessage(notification$MessagingStyle$Message0);
                            }
                            else {
                                String s11 = v3 == 0 ? CLS502.MTH6923(contentValues0.getAsString("senderNickname")) : null;
                                if(contentValues0.containsKey("imagePath")) {
                                    String s12 = contentValues0.getAsString("imagePath");
                                    if(CLS31.MTH1024(s12)) {
                                        notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message(CLS502.MTH6923(s9), v2, s11).setData("image/*", CLS66.MTH1491(CLS27.MTH900(), new File(s12))));
                                        continue;
                                    }
                                }
                                else if(TextUtils.isEmpty(s9)) {
                                    continue;
                                }
                                notification$MessagingStyle0.addMessage(CLS502.MTH6923(s9), v2, s11);
                            }
                        }
                    }
                }
                if(Build.VERSION.SDK_INT >= 28) {
                    Person person1 = CLS485.MTH6737(s6, s1, bitmap0);
                    if(CLS31.MTH1024(s4)) {
                        notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message(CLS502.MTH6923(s3), System.currentTimeMillis(), person1).setData("image/*", CLS66.MTH1491(CLS27.MTH900(), new File(s4))));
                    }
                    else if(!TextUtils.isEmpty(s3)) {
                        notification$MessagingStyle0.addMessage(CLS502.MTH6923(s3), System.currentTimeMillis(), person1);
                    }
                }
                else if(CLS31.MTH1024(s4)) {
                    notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message(CLS502.MTH6923(s3), System.currentTimeMillis(), s6).setData("image/*", CLS66.MTH1491(CLS27.MTH900(), new File(s4))));
                }
                else if(!TextUtils.isEmpty(s3)) {
                    notification$MessagingStyle0.addMessage(CLS502.MTH6923(s3), System.currentTimeMillis(), s6);
                }
                notification$Builder0.setStyle(notification$MessagingStyle0);
            }
            ArrayList arrayList1 = this.FLD4737;
            if(!arrayList1.contains(s)) {
                arrayList1.add(s);
            }
            int v4 = arrayList1.indexOf(s);
            CLS485.MTH6712(s, notification$Builder0, v4);
            notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, v4, intent0, 0x8000000) : PendingIntent.getActivity(context0, v4, intent0, 0xC000000)));
            CLS485.MTH6722(notification$Builder0, s5);
            Notification notification0 = notification$Builder0.build();
            notification0.flags = 17;
            notification0.ledOnMS = 300;
            notification0.ledOffMS = 1000;
            notification0.ledARGB = 0xFF00FF00;
            if(!s5.equals("custom") || !z || !ˎᵢ0.MTH938("chatroom_vibrate_disable", false)) {
                CLS485.MTH6748(s5, notification0);
            }
            if(!s5.equals("custom") || !z || !ˎᵢ0.MTH938("chatroom_ringtone_disable", false)) {
                CLS485.MTH6724(s5, notification0);
            }
            CLS485.MTH6741(notification0, v4);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static Person MTH6718(String s, String s1) {
        Person.Builder person$Builder0 = new Person.Builder();
        person$Builder0.setName(s);
        Bitmap bitmap0 = CLS372.MTH5411(s1);
        if(bitmap0 != null) {
            person$Builder0.setIcon(Icon.createWithBitmap(bitmap0));
        }
        return person$Builder0.build();
    }

    // 此方法包含解密的字符串
    public final void MTH6719(Intent intent0, Bitmap bitmap0, String s, String s1, String s2, String s3) {
        try {
            Context context0 = CLS27.MTH900();
            if(bitmap0 == null) {
                bitmap0 = CLS404.MTH5887();
            }
            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap0).setContentTitle(s).setContentText(s1).setSmallIcon(CLS485.MTH6745()).setAutoCancel(false);
            if(CLS390.MTH5615(context0)) {
                String s4 = CLS502.MTH6943(s2, new String[]{"transfer_money_", "red_packet_notif_only_"}) ? s2 : "rp_" + s2;
                CLS485.MTH6726(context0, s4);
                notification$Builder0.setChannelId(CLS485.MTH6736(("wx_" + s4)));
            }
            int v = CLS485.MTH6728();
            ArrayList arrayList0 = this.FLD4740.containsKey(s3) ? ((ArrayList)this.FLD4740.get(s3)) : new ArrayList();
            arrayList0.add(v);
            this.FLD4740.put(s3, arrayList0);
            notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, v, intent0, 0x8000000) : PendingIntent.getActivity(context0, v, intent0, 0xC000000)));
            CLS30.MTH950(notification$Builder0);
            Notification notification0 = notification$Builder0.build();
            notification0.flags = 17;
            notification0.ledOnMS = 200;
            notification0.ledOffMS = 1100;
            notification0.ledARGB = 0xFFFFFF00;
            CLS485.MTH6732(s2, notification0);
            CLS485.MTH6714(s2, notification0);
            CLS485.MTH6741(notification0, v);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static Intent MTH6720() {
        Intent intent0 = new Intent();
        intent0.setClassName(CLS390.MTH5619(CLS27.MTH900()), CLS27.MTH897("ImageGalleryUI"));
        return intent0;
    }

    // 此方法包含解密的字符串
    public static void MTH6721(Context context0, String s) {
        if(Build.VERSION.SDK_INT >= 26) {
            try {
                Intent intent0 = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent0.putExtra("android.provider.extra.APP_PACKAGE", CLS390.MTH5619(context0));
                intent0.putExtra("android.provider.extra.CHANNEL_ID", CLS485.MTH6736(s));
                context0.startActivity(intent0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public static void MTH6722(Notification.Builder notification$Builder0, String s) {
        CLS29 ˎᵢ0 = CLS27.MTH895();
        if(CLS182.MTH3480(4101217374927901493L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            CLS30.MTH950(notification$Builder0);
            return;
        }
        CLS30.MTH955(notification$Builder0);
    }

    // 此方法包含解密的字符串
    public final void MTH6723(String s, String s1, String s2, Bitmap bitmap0) {
        try {
            Context context0 = CLS27.MTH900();
            if(bitmap0 == null) {
                bitmap0 = CLS404.MTH5887();
            }
            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap0).setSmallIcon(CLS485.MTH6745()).setContentTitle(s1).setAutoCancel(true);
            if(CLS390.MTH5615(context0)) {
                CLS485.MTH6726(context0, "msg_recall");
                notification$Builder0.setChannelId(CLS485.MTH6736("wx_msg_recall"));
            }
            if(!TextUtils.isEmpty(s2)) {
                notification$Builder0.setContentText(s2);
            }
            this.MTH6742(notification$Builder0, CLS485.MTH6731(s), CLS485.MTH6728(), s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6724(String s, Notification notification0) {
        if(!CLS34.MTH1078(0x38EA72FC2B3CD335L, s, CLS27.MTH895(), false)) {
            return;
        }
        Uri uri0 = CLS485.MTH6734((s + "_ringtone"));
        if(uri0 != null) {
            notification0.sound = uri0;
            return;
        }
        notification0.defaults |= 1;
    }

    public static void MTH6725(CLS484 ᐧﾞ$ˆٴ0, String s, int v) {
        ᐧﾞ$ˆٴ0.FLD4733.setProgress(100, v, false);
        ᐧﾞ$ˆٴ0.FLD4733.setContentText(s);
        CLS485.MTH6741(ᐧﾞ$ˆٴ0.FLD4733.build(), ᐧﾞ$ˆٴ0.FLD4732);
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static void MTH6726(Context context0, String s) {
        String s5;
        boolean z1;
        boolean z;
        if(!CLS390.MTH5615(context0)) {
            return;
        }
        String s1 = CLS182.MTH3484(0x38EA73FD2B3CD335L, new StringBuilder(), s);
        if(CLS485.MTH6739(context0, s1)) {
            return;
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        String s2 = CLS27.MTH889("appname");
        String s3 = "";
        JSONObject jSONObject0 = new JSONObject();
        try {
            int v = 4;
            switch(s) {
                case "_secret": {
                    s2 = s2 + " (" + CLS27.MTH889("secret_notif") + ")";
                    s3 = CLS27.MTH889("secret_notification");
                    jSONObject0.put("light", 0xFF00FF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "at": {
                    s2 = s2 + " (" + CLS27.MTH889("at_notif") + ")";
                    s3 = CLS27.MTH889("at_notification_enable");
                    jSONObject0.put("light", 0xFF00FF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "comment_recall": {
                    s2 = s2 + " (" + CLS27.MTH889("comment_recall_notification") + ")";
                    s3 = CLS27.MTH889("customize_comment_recall_notification");
                    jSONObject0.put("light", 0xFF00FF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "custom": {
                    s2 = s2 + " (" + CLS27.MTH889("chat_notif") + ")";
                    s3 = CLS27.MTH889("replace_wechat_notification");
                    jSONObject0.put("light", 0xFF00FF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "custom_chatroom": {
                    s2 = s2 + " (" + CLS27.MTH889("chat_group_notif") + ")";
                    String s6 = CLS27.MTH889("replace_wechat_notification");
                    jSONObject0.put("light", 0xFF00FF00);
                    z = ˎᵢ0.MTH938("chatroom_vibrate_disable", false);
                    z1 = ˎᵢ0.MTH938("chatroom_ringtone_disable", false);
                    s5 = s;
                    s = "custom";
                    s3 = s6;
                    break;
                }
                case "keyword": {
                    s2 = s2 + " (" + CLS27.MTH889("keyword_notification") + ")";
                    s3 = CLS27.MTH889("keyword_notification");
                    jSONObject0.put("light", 0xFF00FF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "mass_send": {
                    s2 = s2 + " (" + CLS27.MTH889("mass_send") + ")";
                    s3 = CLS27.MTH889("mass_send");
                label_67:
                    jSONObject0.put("light", 0xFF00FF00);
                    s5 = s;
                    z = true;
                    z1 = true;
                    break;
                }
                case "moments": {
                    s2 = s2 + " (" + CLS27.MTH889("moments_notification") + ")";
                    s3 = CLS27.MTH889("moments_notification");
                    jSONObject0.put("light", 0xFFFF0000);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "msg_recall": {
                    s2 = s2 + " (" + CLS27.MTH889("recall_notification") + ")";
                    s3 = CLS27.MTH889("customize_recall_notification");
                    jSONObject0.put("light", 0xFF00FF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "new_comment": {
                    s2 = s2 + " (" + CLS27.MTH889("new_comment_notification") + ")";
                    s3 = CLS27.MTH889("customize_new_comment_notification");
                    jSONObject0.put("light", 0xFF00FF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "progress": {
                    s2 = s2 + " (" + CLS27.MTH889("progress_notif") + ")";
                    s3 = CLS27.MTH889("progress_notif");
                    goto label_67;
                }
                case "red_packet_notif_only_": {
                    s2 = s2 + " (" + CLS27.MTH889("rp_notif") + ")";
                    s3 = CLS27.MTH889("red_packet_notif_only_enable");
                    jSONObject0.put("light", 0xFFFFFF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "rpamount_": {
                    s2 = s2 + " (" + CLS27.MTH889("total_amount_notification_enable") + ")";
                    s3 = CLS27.MTH889("total_amount_notification_enable");
                    jSONObject0.put("light", 0xFFFFFF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                case "transfer_money_": {
                    s2 = s2 + " (" + CLS27.MTH889("tm_notif") + ")";
                    s3 = CLS27.MTH889("transfer_money_notification_enable");
                    jSONObject0.put("light", 0xFFFFFF00);
                    s5 = s;
                    z = false;
                    z1 = false;
                    break;
                }
                default: {
                    if(s.startsWith("notif_")) {
                        String s4 = s.substring(s.indexOf("_") + 1).trim();
                        if(s4.endsWith("_")) {
                            s4 = s4.substring(0, s4.length() - 1);
                        }
                        s2 = s2 + " (" + CLS27.MTH889("personal_notif") + ") [" + CLS371.FLD3470.MTH5316(s4) + "]";
                        s3 = CLS27.MTH889("personal_notification");
                        jSONObject0.put("light", 0xFF00FF00);
                        s5 = s;
                        z = false;
                        z1 = false;
                        break;
                    }
                    else if(s.startsWith("rp_")) {
                        s5 = s.substring(s.indexOf("_") + 1).trim();
                        s2 = s2 + " (" + CLS27.MTH889("rp_notif2") + ")";
                        if(!TextUtils.isEmpty(s5)) {
                            s2 = s2 + "[" + CLS371.FLD3470.MTH5316((s.endsWith("_") ? s5.substring(0, s5.length() - 1) : s5)) + "]";
                        }
                        jSONObject0.put("light", 0xFFFFFF00);
                    }
                    else {
                        s5 = s;
                    }
                    z = false;
                    z1 = false;
                    break;
                }
            }
            String s7 = "";
            jSONObject0.put("channelId", CLS485.MTH6736(s1));
            jSONObject0.put("name", s2);
            jSONObject0.put("description", s3);
            if(!z1) {
                if(!s.startsWith("rp_")) {
                    if(ˎᵢ0.MTH938(s + "_ringtone_enable", false)) {
                        s7 = ˎᵢ0.MTH925(s + "_ringtone", "");
                    }
                }
                else if(ˎᵢ0.MTH938(s5 + "rp_sound", false)) {
                    s7 = ˎᵢ0.MTH925(s5 + "rp_sound_uri", "");
                }
                if(!TextUtils.isEmpty(s7)) {
                    jSONObject0.put("sound", s7);
                }
            }
            if(!z && (ˎᵢ0.MTH938(s + "_vibrate_enable", false) || s.startsWith("rp_") && ˎᵢ0.MTH938(s5 + "rp_vibrate", false))) {
                JSONArray jSONArray0 = new JSONArray();
                jSONArray0.put(300);
                jSONArray0.put(200);
                jSONArray0.put(300);
                jSONArray0.put(200);
                jSONObject0.put("vibration", jSONArray0);
            }
            if(!ˎᵢ0.MTH938(s + "_headsup_enable", false) && !s.startsWith("rp_")) {
                v = 3;
            }
            jSONObject0.put("importance", v);
            CLS485.MTH6747(jSONObject0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6727(String s, String s1, Notification.Builder notification$Builder0, int v) {
        int v1;
        Context context0;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        File file0 = new File(s);
        if(!CLS31.MTH1001(file0)) {
            return;
        }
        Intent intent0 = new Intent();
        intent0.setAction("android.intent.action.SEND");
        intent0.putExtra("android.intent.extra.STREAM", CLS66.MTH1491(CLS27.MTH900(), file0));
        intent0.setType(s1);
        if(Build.VERSION.SDK_INT >= 23) {
            context0 = CLS27.MTH900();
            v1 = 0xC000000;
        }
        else {
            context0 = CLS27.MTH900();
            v1 = 0x8000000;
        }
        PendingIntent pendingIntent0 = PendingIntent.getActivity(context0, v, intent0, v1);
        if(pendingIntent0 == null) {
            return;
        }
        CLS30.MTH952(notification$Builder0, CLS27.MTH889("share"), pendingIntent0);
    }

    public static int MTH6728() {
        return (int)(System.currentTimeMillis() & 0xFFFFFFFL);
    }

    // 此方法包含解密的字符串
    public static Intent MTH6729(String s) {
        Intent intent0 = new Intent();
        intent0.setClassName(CLS390.MTH5619(CLS27.MTH900()), CLS27.MTH897("ChattingUI"));
        intent0.putExtra("Chat_Mode", 1);
        intent0.putExtra("Chat_User", s);
        return intent0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH6730(String s) {
        CLS29 ˎᵢ0 = CLS27.MTH895();
        if(!CLS182.MTH3480(0x38EA72B82B3CD335L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            return false;
        }
        String s1 = ˎᵢ0.MTH925(CLS182.MTH3475(4101217164474503989L, CLS182.MTH3483(s)), "23:0");
        String s2 = ˎᵢ0.MTH925(CLS182.MTH3475(0x38EA73602B3CD335L, CLS182.MTH3483(s)), "8:0");
        String[] arr_s = s1.split(":");
        String[] arr_s1 = s2.split(":");
        int v = Integer.parseInt(arr_s1[0]);
        int v1 = Integer.parseInt(arr_s1[1]);
        int v2 = Integer.parseInt(arr_s[0]);
        int v3 = Integer.parseInt(arr_s[1]);
        Calendar calendar0 = Calendar.getInstance();
        calendar0.set(11, v2);
        calendar0.set(12, v3);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        long v4 = calendar0.getTimeInMillis();
        calendar0.add(11, Math.abs(v - v2) % 24);
        calendar0.set(12, v1);
        long v5 = System.currentTimeMillis();
        return v5 >= v4 && v5 <= calendar0.getTimeInMillis();
    }

    // 此方法包含解密的字符串
    public static Intent MTH6731(String s) {
        Intent intent0 = new Intent();
        intent0.setClassName(CLS390.MTH5619(CLS27.MTH900()), CLS27.MTH897("LauncherUI"));
        intent0.putExtra("talkerCount", 1);
        intent0.putExtra("nofification_type", "new_msg_nofification");
        intent0.putExtra("Main_User", s);
        intent0.putExtra("Intro_Is_Muti_Talker", false);
        intent0.putExtra("Intro_Bottle_unread_count", 0);
        intent0.putExtra("MainUI_User_Last_Msg_Type", 1);
        return intent0;
    }

    public static void MTH6732(String s, Notification notification0) {
        CLS29 ˎᵢ0 = CLS27.MTH895();
        if(CLS182.MTH3480(4101216404265292597L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            notification0.vibrate = new long[]{300L, 200L, 300L, 200L};
        }
    }

    // 此方法包含解密的字符串
    public final void MTH6733(int v) {
        if(!this.FLD4739) {
            return;
        }
        try {
            ((NotificationManager)CLS27.MTH900().getSystemService("notification")).cancel(v);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static Uri MTH6734(String s) {
        String s1 = CLS27.MTH895().MTH925(s, "");
        if(TextUtils.isEmpty(s1)) {
            return null;
        }
        if(!s1.startsWith("content://") && (!s1.startsWith("file://") || CLS390.MTH5620(CLS27.MTH900()) >= 24)) {
            Uri uri0 = Uri.parse(s1);
            String s2 = CLS31.MTH969(CLS27.MTH900(), uri0);
            if(!TextUtils.isEmpty(s2)) {
                Uri uri1 = CLS66.MTH1491(CLS27.MTH900(), new File(s2));
                if(uri1 != null) {
                    CLS27.MTH895().MTH922(uri1.toString(), s);
                    return uri1;
                }
            }
            return null;
        }
        return Uri.parse(s1);
    }

    // 此方法包含解密的字符串
    public static void MTH6735(String s) {
        try {
            JSONObject jSONObject0 = CLS27.MTH895().MTH924("notification_channel", new JSONObject());
            jSONObject0.put(s, "#" + Long.toHexString(System.currentTimeMillis()));
            CLS27.MTH895().MTH922(jSONObject0, "notification_channel");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH6736(String s) {
        String s1;
        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
        try {
            s1 = CLS27.MTH895().MTH924("notification_channel", new JSONObject()).optString(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            s1 = "";
        }
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    public static Person MTH6737(String s, String s1, Bitmap bitmap0) {
        Person.Builder person$Builder0 = new Person.Builder();
        person$Builder0.setName(s);
        Bitmap bitmap1 = CLS66.MTH1372(s1);
        if(bitmap1 == null) {
            bitmap1 = CLS66.MTH1488(s1);
        }
        if(bitmap1 != null) {
            bitmap0 = bitmap1;
        }
        person$Builder0.setIcon(Icon.createWithBitmap(bitmap0));
        return person$Builder0.build();
    }

    // 此方法包含解密的字符串
    public final void MTH6738(String s, String s1, Bitmap bitmap0, Intent intent0, String s2, Bitmap bitmap1, String s3) {
        try {
            Context context0 = CLS27.MTH900();
            if(bitmap1 == null) {
                bitmap1 = CLS404.MTH5887();
            }
            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap1).setSmallIcon(CLS485.MTH6745()).setContentTitle(s1).setAutoCancel(true);
            if(bitmap0 == null) {
                notification$Builder0.setContentText(s2);
            }
            else {
                notification$Builder0.setStyle(new Notification.BigPictureStyle().bigPicture(bitmap0).setSummaryText(s2));
            }
            if(CLS390.MTH5615(context0)) {
                CLS485.MTH6726(context0, "msg_recall");
                notification$Builder0.setChannelId(CLS485.MTH6736("wx_msg_recall"));
            }
            int v = CLS485.MTH6728();
            if(!TextUtils.isEmpty(s3)) {
                if(!s3.contains("image")) {
                    CLS485.MTH6727(s3, "video/mp4", notification$Builder0, v);
                }
                else if(!TextUtils.isEmpty(s3) && s3.endsWith("jpg")) {
                    CLS485.MTH6727(s3, "image/jpeg", notification$Builder0, v);
                }
            }
            CLS485.MTH6712(s, notification$Builder0, v);
            intent0.setClassName(CLS390.MTH5619(context0), CLS27.MTH897("ImageGalleryUI"));
            this.MTH6742(notification$Builder0, intent0, v, s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH6739(Context context0, String s) {
        if(CLS390.MTH5615(context0)) {
            NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService("notification");
            return (notificationManager0 == null ? null : notificationManager0.getNotificationChannel(CLS485.MTH6736(s))) != null;
        }
        return false;
    }

    public final void MTH6740(String s) {
        ArrayList arrayList0 = this.FLD4737;
        if(!arrayList0.isEmpty()) {
            this.MTH6733(arrayList0.indexOf(s));
        }
        HashMap hashMap0 = this.FLD4736;
        if(hashMap0.containsKey(s)) {
            for(Object object0: ((ArrayList)hashMap0.get(s))) {
                this.MTH6733(((int)(((Integer)object0))));
            }
            hashMap0.remove(s);
        }
        HashMap hashMap1 = this.FLD4740;
        if(hashMap1.containsKey(s)) {
            for(Object object1: ((ArrayList)hashMap1.get(s))) {
                this.MTH6733(((int)(((Integer)object1))));
            }
            hashMap1.remove(s);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6741(Notification notification0, int v) {
        ((NotificationManager)CLS27.MTH900().getSystemService("notification")).notify(v, notification0);
    }

    // 此方法包含解密的字符串
    public final void MTH6742(Notification.Builder notification$Builder0, Intent intent0, int v, String s) {
        int v1;
        Context context0;
        if(Build.VERSION.SDK_INT >= 23) {
            context0 = CLS27.MTH900();
            v1 = 0xC000000;
        }
        else {
            context0 = CLS27.MTH900();
            v1 = 0x8000000;
        }
        notification$Builder0.setContentIntent(PendingIntent.getActivity(context0, v, intent0, v1));
        if(CLS485.MTH6730("msg_recall")) {
            return;
        }
        CLS485.MTH6722(notification$Builder0, "msg_recall");
        Notification notification0 = notification$Builder0.build();
        notification0.flags = 17;
        notification0.ledOnMS = 300;
        notification0.ledOffMS = 1000;
        notification0.ledARGB = 0xFF00FF00;
        CLS485.MTH6748("msg_recall", notification0);
        CLS485.MTH6724("msg_recall", notification0);
        CLS485.MTH6741(notification0, v);
        ArrayList arrayList0 = this.FLD4736.containsKey(s) ? ((ArrayList)this.FLD4736.get(s)) : new ArrayList();
        arrayList0.add(v);
        this.FLD4736.put(s, arrayList0);
    }

    // 此方法包含解密的字符串
    public static Intent MTH6743() {
        Intent intent0 = new Intent();
        intent0.setClassName(CLS390.MTH5619(CLS27.MTH900()), CLS27.MTH897("SnsTimeLineUI"));
        return intent0;
    }

    // 此方法包含解密的字符串
    public final void MTH6744(Intent intent0, Bitmap bitmap0, String s, String s1, String s2, String s3) {
        int v4;
        try {
            if(!TextUtils.isEmpty(s2) && !CLS485.MTH6730(s3)) {
                String s4 = CLS371.FLD3470.MTH5311(s);
                Context context0 = CLS27.MTH900();
                Bitmap bitmap1 = bitmap0 == null ? CLS404.MTH5887() : bitmap0;
                Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap1).setSmallIcon(CLS485.MTH6745()).setContentTitle(s1).setAutoCancel(true);
                if(CLS390.MTH5615(context0)) {
                    CLS485.MTH6726(context0, s3);
                    notification$Builder0.setChannelId(CLS485.MTH6736(("wx_" + s3)));
                }
                int v = Build.VERSION.SDK_INT;
                if(v >= 24) {
                    String s5 = CLS27.MTH884();
                    if(TextUtils.isEmpty(s5)) {
                        s5 = CLS27.MTH889("TabLabelMe");
                    }
                    Notification.MessagingStyle notification$MessagingStyle0 = v < 28 ? new Notification.MessagingStyle(s5) : new Notification.MessagingStyle(CLS485.MTH6718(s5, CLS27.MTH904()));
                    notification$MessagingStyle0.setConversationTitle(s1);
                    if("new_comment".equals(s3)) {
                        String s6 = intent0.getStringExtra("INTENT_SNSID");
                        long v1 = Long.parseLong(s6.substring(s6.lastIndexOf("_") + 1));
                        CLS396.FLD3775.getClass();
                        ArrayList arrayList0 = CLS396.MTH5751(v1);
                        if(arrayList0.size() > 2) {
                            for(int v2 = 0; v2 < Math.min(arrayList0.size() - 1, 5); ++v2) {
                                ContentValues contentValues0 = (ContentValues)arrayList0.get(v2);
                                String s7 = contentValues0.getAsString("nickname");
                                String s8 = contentValues0.getAsString("username");
                                String s9 = contentValues0.getAsString("content");
                                long v3 = (long)(((int)contentValues0.getAsInteger("createTime")) * 1000);
                                if(Build.VERSION.SDK_INT >= 28) {
                                    Person person0 = s8.equals(CLS27.MTH904()) ? null : CLS485.MTH6718(s7, s8);
                                    if(!TextUtils.isEmpty(s2)) {
                                        notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message(s9, v3, person0));
                                    }
                                }
                                else if(!TextUtils.isEmpty(s2)) {
                                    notification$MessagingStyle0.addMessage(new Notification.MessagingStyle.Message(s9, v3, s7));
                                }
                            }
                        }
                    }
                    if(Build.VERSION.SDK_INT < 28) {
                        if(!TextUtils.isEmpty(s2)) {
                            notification$MessagingStyle0.addMessage(s2, System.currentTimeMillis(), s4);
                        }
                    }
                    else if(!TextUtils.isEmpty(s2)) {
                        notification$MessagingStyle0.addMessage(s2, System.currentTimeMillis(), CLS485.MTH6718(s4, s));
                    }
                    notification$Builder0.setStyle(notification$MessagingStyle0);
                }
                else if(!TextUtils.isEmpty(s2)) {
                    notification$Builder0.setContentText(s2);
                }
                HashMap hashMap0 = this.FLD4738;
                if("new_comment".equals(s3)) {
                    String s10 = intent0.getStringExtra("INTENT_SNSID");
                    if(hashMap0.containsKey(s10)) {
                        v4 = (int)(((Integer)hashMap0.get(s10)));
                    }
                    else {
                        int v5 = CLS485.MTH6728();
                        hashMap0.put(s10, v5);
                        v4 = v5;
                    }
                    CLS485.MTH6710(notification$Builder0, v4, Long.parseLong(s10.substring(s10.lastIndexOf("_") + 1)), s10);
                }
                else {
                    int v6 = CLS485.MTH6728();
                    hashMap0.put(Long.toHexString(System.currentTimeMillis()), v6);
                    v4 = v6;
                }
                notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, v4, intent0, 0x8000000) : PendingIntent.getActivity(context0, v4, intent0, 0xC000000)));
                CLS485.MTH6722(notification$Builder0, s3);
                Notification notification0 = notification$Builder0.build();
                notification0.flags = 17;
                notification0.ledOnMS = 300;
                notification0.ledOffMS = 1000;
                notification0.ledARGB = 0xFF00FF00;
                CLS485.MTH6748(s3, notification0);
                CLS485.MTH6724(s3, notification0);
                CLS485.MTH6741(notification0, v4);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static int MTH6745() {
        int v;
        if(CLS27.MTH890("notification_icon_gray") && CLS27.MTH890("notification_icon")) {
            v = CLS27.MTH903(0, CLS370.MTH5289((Build.VERSION.SDK_INT >= 19 ? 4101121558502495029L : 4101121481193083701L)));
            return v == -1 ? 0x108009B : v;
        }
        Class class0 = CLS27.MTH894("iconClass");
        if(class0 != null) {
            try {
                v = (int)(((Integer)CLS166.MTH3192(class0, CLS27.MTH897("iconMethod"), new Object[0])));
                return v == -1 ? 0x108009B : v;
            }
            catch(Throwable unused_ex) {
                try {
                    if(CLS66.FLD211 == null) {
                        CLS66.FLD211 = CLS164.MTH3173(class0, null, Integer.TYPE, new Object[0]);
                    }
                    Method method0 = CLS66.FLD211;
                    if(method0 != null) {
                        v = (int)(((Integer)CLS164.MTH3178(null, method0, new Object[0])));
                        return v == -1 ? 0x108009B : v;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        return 0x108009B;
    }

    // 此方法包含解密的字符串
    public static CLS484 MTH6746(String s, String s1, String s2) {
        Notification.Builder notification$Builder0 = new Notification.Builder(CLS27.MTH900()).setLargeIcon(CLS404.MTH5887()).setSmallIcon(CLS485.MTH6745()).setContentTitle(s1).setContentText(s2);
        Context context0 = CLS27.MTH900();
        if(CLS390.MTH5615(context0)) {
            CLS485.MTH6726(context0, s);
            notification$Builder0.setChannelId(CLS485.MTH6736(("wx_" + s)));
        }
        notification$Builder0.setProgress(100, 0, false);
        int v = CLS485.MTH6728();
        CLS485.MTH6741(notification$Builder0.build(), v);
        return new CLS484(v, notification$Builder0);
    }

    // 此方法包含解密的字符串
    public static void MTH6747(JSONObject jSONObject0) {
        if(Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            NotificationManager notificationManager0 = (NotificationManager)CLS27.MTH900().getSystemService("notification");
            if(notificationManager0 == null) {
                return;
            }
            NotificationChannel notificationChannel0 = new NotificationChannel(jSONObject0.getString("channelId"), jSONObject0.getString("name"), jSONObject0.getInt("importance"));
            notificationChannel0.setDescription(jSONObject0.getString("description"));
            if(jSONObject0.has("light")) {
                notificationChannel0.enableLights(true);
                notificationChannel0.setLightColor(jSONObject0.getInt("light"));
            }
            if(jSONObject0.has("vibration")) {
                notificationChannel0.enableVibration(true);
                JSONArray jSONArray0 = jSONObject0.getJSONArray("vibration");
                long[] arr_v = new long[jSONArray0.length()];
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arr_v[v] = jSONArray0.getLong(v);
                }
                notificationChannel0.setVibrationPattern(arr_v);
            }
            else {
                notificationChannel0.setVibrationPattern(new long[]{0L});
            }
            notificationChannel0.enableVibration(true);
            if(jSONObject0.has("sound")) {
                AudioAttributes audioAttributes0 = new AudioAttributes.Builder().setUsage(5).setContentType(2).build();
                notificationChannel0.setSound(Uri.parse(jSONObject0.getString("sound")), audioAttributes0);
            }
            else {
                notificationChannel0.setSound(null, null);
            }
            notificationManager0.createNotificationChannel(notificationChannel0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH6748(String s, Notification notification0) {
        if(CLS34.MTH1078(0x38EA72EC2B3CD335L, s, CLS27.MTH895(), false)) {
            notification0.vibrate = new long[]{300L, 200L, 300L, 200L};
        }
    }
}

