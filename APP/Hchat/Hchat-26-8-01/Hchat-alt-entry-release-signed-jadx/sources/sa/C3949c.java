package sa;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import p049d9.AbstractC0754o;
import p080fb.AbstractC1184v0;
import p261rb.RunnableC3791g;

/* JADX INFO: renamed from: sa.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3949c {

    /* JADX INFO: renamed from: a */
    public final Context f12950a;

    /* JADX INFO: renamed from: b */
    public final String f12951b;

    /* JADX INFO: renamed from: c */
    public final String f12952c;

    /* JADX INFO: renamed from: d */
    public final String f12953d;

    /* JADX INFO: renamed from: e */
    public final Handler f12954e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public volatile long f12955f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3949c(Context context, String str, String str2, String str3) {
        this.f12950a = context;
        this.f12951b = TextUtils.isEmpty(str) ? "[Hchat:RedPacketNotifier]" : str;
        this.f12952c = TextUtils.isEmpty(str2) ? "Hchat_redpacket_notify_manual_v2" : str2;
        this.f12953d = TextUtils.isEmpty(str3) ? "Hchat 红包提醒" : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PendingIntent m8171a(int i9, String str, String str2) {
        Intent launchIntentForPackage;
        Intent intent;
        long jCurrentTimeMillis;
        int iHashCode;
        long jCurrentTimeMillis2;
        Context context = this.f12950a;
        try {
            launchIntentForPackage = new Intent();
            try {
                launchIntentForPackage.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
                launchIntentForPackage.addFlags(872415232);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage == null) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(872415232);
                }
            } catch (Throwable unused3) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            intent = null;
        } else {
            try {
                intent = new Intent();
                try {
                    intent.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.ui.chatting.ChattingUI"));
                    intent.putExtra("Chat_User", str);
                    intent.putExtra("Chat_Mode", 1);
                    intent.putExtra("finish_direct", true);
                    intent.addFlags(603979776);
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
                intent = null;
            }
        }
        Intent[] intentArr = (launchIntentForPackage == null || intent == null) ? intent != null ? new Intent[]{intent} : launchIntentForPackage != null ? new Intent[]{launchIntentForPackage} : null : new Intent[]{launchIntentForPackage, intent};
        if (intentArr == null || intentArr.length == 0) {
            return null;
        }
        try {
        } catch (Throwable unused6) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (!TextUtils.isEmpty(str2)) {
            iHashCode = str2.hashCode();
        } else {
            if (TextUtils.isEmpty(str)) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
                jCurrentTimeMillis = ((jCurrentTimeMillis2 & 1048575) << 1) | 1275068416 | ((long) (i9 == 0 ? 0 : 1));
                return PendingIntent.getActivities(context, (int) (jCurrentTimeMillis & 2147483647L), intentArr, 201326592);
            }
            iHashCode = str.hashCode();
        }
        jCurrentTimeMillis2 = iHashCode;
        jCurrentTimeMillis = ((jCurrentTimeMillis2 & 1048575) << 1) | 1275068416 | ((long) (i9 == 0 ? 0 : 1));
        return PendingIntent.getActivities(context, (int) (jCurrentTimeMillis & 2147483647L), intentArr, 201326592);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8172b(String str, String str2, String str3, String str4, String str5, int i9, boolean z9, boolean z10, boolean z11, boolean z12, String str6) {
        NotificationManager notificationManager;
        long jCurrentTimeMillis;
        Uri defaultUri;
        int i10 = 1;
        if (z10) {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    this.f12954e.post(new RunnableC3791g(this, i10, str3));
                }
            } catch (Throwable th2) {
                AbstractC1184v0.m3204n(this.f12951b + " 通知失败: " + th2.getMessage(), th2);
                return;
            }
        }
        if (z9 && (notificationManager = (NotificationManager) this.f12950a.getSystemService("notification")) != null) {
            if (!notificationManager.areNotificationsEnabled()) {
                AbstractC1184v0.m3203m(this.f12951b + " 通知失败: 微信通知权限已关闭");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f12952c);
            sb2.append("_v");
            sb2.append(z12 ? "1" : "0");
            String string = sb2.toString();
            NotificationChannel notificationChannel = new NotificationChannel(string, this.f12953d, 4);
            notificationChannel.enableVibration(z12);
            notificationChannel.setVibrationPattern(z12 ? new long[]{0, 180, 80, 180} : null);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(string);
            if (notificationChannel2 != null && notificationChannel2.getImportance() == 0) {
                AbstractC1184v0.m3203m(this.f12951b + " 通知失败: " + this.f12953d + "通知渠道已关闭");
                return;
            }
            int i11 = this.f12950a.getApplicationInfo().icon;
            if (i11 == 0) {
                i11 = R.drawable.ic_dialog_info;
            }
            Notification.Builder builder = new Notification.Builder(this.f12950a, string);
            PendingIntent pendingIntentM8171a = m8171a(i9, str4, str5);
            int i12 = 2;
            builder.setSmallIcon(i11).setContentTitle(str).setContentText(str2).setTicker(str2).setWhen(System.currentTimeMillis()).setShowWhen(true).setAutoCancel(true).setPriority(1).setDefaults(z12 ? 2 : 0);
            if (pendingIntentM8171a != null) {
                builder.setContentIntent(pendingIntentM8171a);
            }
            Bitmap bitmapM1949f = AbstractC0754o.m1949f(this.f12950a, str4);
            if (bitmapM1949f != null) {
                builder.setLargeIcon(bitmapM1949f);
            }
            try {
                jCurrentTimeMillis = ((((long) i9) & 63) << 20) | (((TextUtils.isEmpty(str5) ? System.currentTimeMillis() : str5.hashCode()) & 1023) << 10) | 1258291200 | (System.currentTimeMillis() & 1048575);
            } catch (Throwable unused) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            notificationManager.notify((int) (jCurrentTimeMillis & 2147483647L), builder.build());
            if (z11) {
                try {
                    if (TextUtils.isEmpty(str6)) {
                        defaultUri = RingtoneManager.getDefaultUri(2);
                    } else {
                        String strTrim = str6.trim();
                        defaultUri = strTrim.contains("://") ? Uri.parse(strTrim) : Uri.fromFile(new File(strTrim));
                    }
                } catch (Throwable unused2) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                }
                if (defaultUri == null) {
                    return;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - this.f12955f < 1200) {
                    return;
                }
                this.f12955f = jCurrentTimeMillis2;
                this.f12954e.post(new RunnableC3791g(this, i12, defaultUri));
            }
        }
    }
}
