package p346x9;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import ba.C0223c;
import gg.AbstractC1416l;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p024b9.RunnableC0217c;
import p025bc.AbstractC0255e;
import p036c9.ThreadFactoryC0478q;
import p049d9.AbstractC0754o;
import p063e9.RunnableC0834e;
import p065eb.RunnableC0900w;
import p068eh.AbstractC0921a;
import p092g4.AbstractC1341a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatQuoteMsg;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p153k8.C2351o;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p222p.AbstractC3199a;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: x9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5737d {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f23377a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public static final Handler f23378b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public static final ExecutorService f23379c = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(29));

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f23380d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static volatile String f23381e;

    /* JADX INFO: renamed from: f */
    public static volatile long f23382f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m10417a(String str) {
        if (AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM10429m = m10429m(m10430n(m10428l(1, str, "(?is)<appmsg\\b[^>]*>(.*?)</appmsg>"), "type"));
        return AbstractC3149m.m6721t0(strM10429m) ? m10429m(m10430n(str, "type")) : strM10429m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m10418b(String str, String str2, String str3, String str4, String str5, String str6) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "%keyword%", str2, false), "%sender%", str3, false), "%wxid%", str4, false), "%content%", str5, false), "%type%", str6, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m10419c(Context context, C2351o c2351o) {
        C5738e c5738e = new C5738e(context);
        if (c5738e.m10431a("keyword_notify_enable", false) && !c2351o.m5630q()) {
            String strM5617d = c2351o.f7715c;
            if (AbstractC3149m.m6721t0(strM5617d)) {
                strM5617d = c2351o.m5617d();
            }
            String str = strM5617d;
            str.getClass();
            if (AbstractC3149m.m6721t0(str) || !c5738e.m10435e(str)) {
                return;
            }
            if (c5738e.m10431a("keyword_notify_quiet", false)) {
                int iM10427k = m10427k(c5738e.m10432b("keyword_notify_quiet_start", "22:00:00"));
                int iM10427k2 = m10427k(c5738e.m10432b("keyword_notify_quiet_end", "08:00:00"));
                if (iM10427k >= 0 && iM10427k2 >= 0) {
                    if (iM10427k == iM10427k2) {
                        return;
                    }
                    Calendar calendar = Calendar.getInstance();
                    int i9 = calendar.get(13) + (calendar.get(12) * 60) + (calendar.get(11) * 3600);
                    if (iM10427k < iM10427k2) {
                        if (iM10427k <= i9 && i9 < iM10427k2) {
                            return;
                        }
                    } else if (i9 >= iM10427k || i9 < iM10427k2) {
                        return;
                    }
                }
            }
            f23379c.execute(new RunnableC0217c(context, c5738e, c2351o, str, 25));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m10420d(Context context, final C5738e c5738e, C2351o c2351o, String str) {
        String strM3595k;
        String str2;
        final String str3;
        String str4;
        final Context context2;
        String strM3731t;
        final String str5 = str;
        boolean z9 = c2351o.f7720h;
        String str6 = c2351o.f7717e;
        final boolean z10 = z9 || c2351o.m5623j() || AbstractC3156t.m6733W(str5, "@chatroom", false) || AbstractC3156t.m6733W(str5, "@im.chatroom", false);
        String strM5614a = AbstractC3149m.m6721t0(str6) ? c2351o.m5614a() : str6;
        strM5614a.getClass();
        String strM10426j = m10426j(c2351o, strM5614a);
        if (AbstractC3149m.m6721t0(strM10426j)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String strM10423g = m10423g(c5738e, c2351o, z10, strM5614a, strM10426j);
        if (strM10423g != null) {
            arrayList.add(strM10423g);
        }
        String str7 = "@所有人";
        if (z10 && c5738e.m10431a("keyword_notify_at_all", true) && c2351o.m5627n()) {
            arrayList.add("@所有人");
        }
        String str8 = "群公告";
        if (z10 && c5738e.m10431a("keyword_notify_at_all", true) && c2351o.m5618e()) {
            arrayList.add("群公告");
        }
        String str9 = "@我";
        if (z10 && c5738e.m10431a("keyword_notify_at_me", true) && c2351o.m5620g()) {
            arrayList.add("@我");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String strM9264h = c2351o.f7716d;
        if (AbstractC3149m.m6721t0(strM9264h)) {
            strM9264h = c2351o.m5616c();
        }
        String str10 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (z10) {
            strM9264h.getClass();
            if (AbstractC3149m.m6721t0(strM9264h) || AbstractC3156t.m6733W(strM9264h, "@chatroom", false) || AbstractC3156t.m6733W(strM9264h, "@im.chatroom", false)) {
                Pattern patternCompile = Pattern.compile("^([A-Za-z0-9_\\-]+?):\\n");
                patternCompile.getClass();
                String string = AbstractC3149m.m6703R0(str6).toString();
                string.getClass();
                Matcher matcher = patternCompile.matcher(string);
                matcher.getClass();
                C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, string);
                String str11 = c3145iM238b != null ? (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a()) : null;
                strM9264h = str11 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str11;
                if (AbstractC3149m.m6721t0(strM9264h)) {
                }
            }
        } else if (AbstractC3149m.m6721t0(strM9264h)) {
            strM9264h = str5;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (z10) {
            String strM3595k2 = AbstractC1341a.m3595k(str5);
            if (AbstractC3149m.m6721t0(strM3595k2)) {
                strM3595k2 = str5;
            }
            if (AbstractC3149m.m6721t0(strM9264h) || strM9264h.equals(str5)) {
                strM3731t = "未知成员";
            } else {
                strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(str5, strM9264h) : null;
                if (strM3731t == null) {
                    strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(strM3731t)) {
                    String strM3729r = c1368iM9259c != null ? c1368iM9259c.m3729r(strM9264h) : null;
                    strM3731t = strM3729r == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3729r;
                }
                if (AbstractC3149m.m6721t0(strM3731t)) {
                    strM3731t = strM9264h;
                }
            }
            strM3595k = AbstractC4855en.m9264h(strM3595k2, " | ", strM3731t);
        } else {
            strM3595k = AbstractC1341a.m3595k(str5);
            if (AbstractC3149m.m6721t0(strM3595k)) {
                strM3595k = AbstractC1341a.m3595k(strM9264h);
            }
            if (AbstractC3149m.m6721t0(strM3595k)) {
                strM3595k = AbstractC3149m.m6721t0(strM9264h) ? AbstractC3149m.m6721t0(str5) ? "未知来源" : str5 : strM9264h;
            }
        }
        if (z10 && !AbstractC3149m.m6721t0(strM9264h)) {
            strM9264h = AbstractC4855en.m9264h(str5, "|", strM9264h);
        } else if (AbstractC3149m.m6721t0(strM9264h)) {
            strM9264h = str5;
        }
        for (String str12 : AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList))) {
            String str13 = z10 ? "群消息" : "好友";
            int iHashCode = str12.hashCode();
            EnumC5736c enumC5736c = iHashCode != 27089 ? iHashCode != 26915537 ? EnumC5736c.AT_ALL : EnumC5736c.AT_ALL : !str12.equals(str9) ? EnumC5736c.KEYWORD : EnumC5736c.AT_ME;
            String strM10432b = c5738e.m10432b(enumC5736c.f23369g, str10);
            if (AbstractC3149m.m6721t0(strM10432b)) {
                strM10432b = enumC5736c.f23375m;
            }
            String str14 = str9;
            String str15 = str8;
            String str16 = strM3595k;
            final String strM10418b = m10418b(strM10432b, str12, str16, strM9264h, strM10426j, str13);
            String strM10432b2 = c5738e.m10432b(enumC5736c.f23370h, str10);
            if (AbstractC3149m.m6721t0(strM10432b2)) {
                strM10432b2 = "%content%";
            }
            final String strM10418b2 = m10418b(strM10432b2, str12, str16, strM9264h, strM10426j, str13);
            String strM10432b3 = c5738e.m10432b(enumC5736c.f23371i, str10);
            if (AbstractC3149m.m6721t0(strM10432b3)) {
                strM10432b3 = enumC5736c.f23376n;
            }
            String strM10418b3 = m10418b(strM10432b3, str12, str16, strM9264h, strM10426j, str13);
            boolean zM10431a = c5738e.m10431a("keyword_notify_system", true);
            Handler handler = f23378b;
            if (zM10431a) {
                final EnumC5736c enumC5736c2 = enumC5736c;
                str2 = str10;
                str3 = str12;
                str4 = str7;
                context2 = context;
                handler.post(new Runnable() { // from class: x9.a
                    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, GOTO]}, finally: {[CONST, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
                    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, INVOKE]}, finally: {[CONST, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
                    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST]}, finally: {[CONST, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                    /* JADX WARN: Code restructure failed: missing block: B:133:0x0320, code lost:
                    
                        r5.put(r4, r12);
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        Bitmap bitmapM1948e;
                        Object c3959f;
                        Object c3959f2;
                        Context context3 = context2;
                        C5738e c5738e2 = c5738e;
                        EnumC5736c enumC5736c3 = enumC5736c2;
                        String str17 = str5;
                        String str18 = strM10418b;
                        String str19 = strM10418b2;
                        String str20 = str3;
                        boolean z11 = z10;
                        AtomicInteger atomicInteger = AbstractC5737d.f23377a;
                        Object systemService = context3.getSystemService("notification");
                        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                        if (notificationManager != null) {
                            boolean zM10431a2 = c5738e2.m10431a(enumC5736c3.f23372j, c5738e2.m10431a("keyword_notify_sound", true));
                            boolean zM10431a3 = c5738e2.m10431a(enumC5736c3.f23373k, c5738e2.m10431a("keyword_notify_vibrate", true));
                            String str21 = enumC5736c3.f23374l;
                            String str22 = HttpUrl.FRAGMENT_ENCODE_SET;
                            String strM10432b4 = c5738e2.m10432b(str21, c5738e2.m10432b("keyword_notify_ringtone", HttpUrl.FRAGMENT_ENCODE_SET));
                            String str23 = zM10431a2 ? "1" : "0";
                            String str24 = zM10431a3 ? "1" : "0";
                            int iHashCode2 = strM10432b4.hashCode();
                            StringBuilder sbM1027p = AbstractC0255e.m1027p("Hchat_keyword_notification_s", str23, "_v", str24, "_");
                            sbM1027p.append(iHashCode2);
                            String string2 = sbM1027p.toString();
                            try {
                                List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
                                if (notificationChannels != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it = notificationChannels.iterator();
                                    while (it.hasNext()) {
                                        String id2 = ((NotificationChannel) it.next()).getId();
                                        if (id2 == null || !AbstractC3156t.m6740d0(id2, "Hchat_keyword_notification_", false)) {
                                            id2 = null;
                                        }
                                        if (id2 != null) {
                                            arrayList2.add(id2);
                                        }
                                    }
                                    if (arrayList2.size() > 60) {
                                        Iterator it2 = AbstractC4166m.m8403L1(arrayList2.size() - 60, arrayList2).iterator();
                                        while (it2.hasNext()) {
                                            notificationManager.deleteNotificationChannel((String) it2.next());
                                        }
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            NotificationChannel notificationChannel = new NotificationChannel(string2, "Hchat 关键词通知", 4);
                            notificationChannel.enableVibration(zM10431a3);
                            notificationChannel.setVibrationPattern(zM10431a3 ? new long[]{0, 250, 250, 250} : new long[]{0});
                            notificationChannel.setSound(null, null);
                            notificationManager.createNotificationChannel(notificationChannel);
                            Notification.Builder builder = new Notification.Builder(context3, string2);
                            int iHashCode3 = (int) ((((((long) str17.hashCode()) & 255) << 20) | 1358954496 | (((long) AbstractC5737d.f23377a.updateAndGet(new C0223c(5))) & 1048575)) & 2147483647L);
                            int i9 = context3.getApplicationInfo().icon;
                            Integer numValueOf = Integer.valueOf(i9);
                            if (i9 == 0) {
                                numValueOf = null;
                            }
                            Notification.Builder style = builder.setSmallIcon(numValueOf != null ? numValueOf.intValue() : R.drawable.stat_notify_chat).setContentTitle(AbstractC5737d.m10421e(str18, str20)).setContentText(AbstractC5737d.m10421e(str19, str20)).setTicker(str19).setWhen(System.currentTimeMillis()).setShowWhen(true).setAutoCancel(true).setOnlyAlertOnce(false).setCategory("msg").setPriority(1).setSubText(z11 ? "群消息" : "好友消息").setStyle(new Notification.BigTextStyle().bigText(AbstractC5737d.m10421e(str19, str20)).setBigContentTitle(AbstractC5737d.m10421e(str18, str20)));
                            ArrayList arrayList3 = new ArrayList();
                            Intent intent = new Intent();
                            String packageName = context3.getPackageName();
                            intent.setComponent(new ComponentName(packageName, "com.tencent.mm.ui.LauncherUI"));
                            intent.addFlags(872415232);
                            arrayList3.add(intent);
                            if (!AbstractC3149m.m6721t0(str17)) {
                                Intent intent2 = new Intent();
                                packageName = context3.getPackageName();
                                intent2.setComponent(new ComponentName(packageName, "com.tencent.mm.ui.chatting.ChattingUI"));
                                intent2.putExtra("Chat_User", str17);
                                intent2.putExtra("Chat_Mode", 1);
                                intent2.putExtra("finish_direct", true);
                                intent2.addFlags(603979776);
                                arrayList3.add(intent2);
                            }
                            Notification.Builder contentIntent = style.setContentIntent(arrayList3.isEmpty() ? null : PendingIntent.getActivities(context3, iHashCode3, (Intent[]) arrayList3.toArray(new Intent[0]), 201326592));
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("hchat_keyword_notification", true);
                            bundle.putString("talker", str17);
                            contentIntent.setExtras(bundle);
                            ConcurrentHashMap concurrentHashMap = AbstractC5737d.f23380d;
                            if (AbstractC3149m.m6721t0(str17)) {
                                packageName = null;
                                bitmapM1948e = null;
                            } else if (!AbstractC4302b.m8640c(context3, "Hchat_custom_friend_avatar_config").getBoolean("enable", false) || !AbstractC4302b.m8640c(context3, "Hchat_custom_friend_avatar_config").getBoolean("scope_notifications", true) || (bitmapM1948e = AbstractC0754o.m1948e(context3, str17)) == null) {
                                if (!concurrentHashMap.containsKey(str17)) {
                                    C1368i c1368iM9259c2 = AbstractC4855en.m9259c();
                                    String strM3724m = c1368iM9259c2 != null ? c1368iM9259c2.m3724m(str17, true) : null;
                                    if (strM3724m == null) {
                                        strM3724m = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    String strM3724m2 = c1368iM9259c2 != null ? c1368iM9259c2.m3724m(str17, false) : null;
                                    if (strM3724m2 != null) {
                                        str22 = strM3724m2;
                                    }
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    if (!AbstractC3149m.m6721t0(strM3724m)) {
                                        linkedHashSet.add(strM3724m);
                                    }
                                    if (!AbstractC3149m.m6721t0(str22)) {
                                        linkedHashSet.add(str22);
                                    }
                                    String strM10425i = AbstractC5737d.m10425i(str17, false);
                                    if (strM10425i != null) {
                                        linkedHashSet.add(strM10425i);
                                    }
                                    String strM10425i2 = AbstractC5737d.m10425i(str17, true);
                                    if (strM10425i2 != null) {
                                        linkedHashSet.add(strM10425i2);
                                    }
                                    Iterator it3 = AbstractC4166m.m8407P1(linkedHashSet).iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            packageName = null;
                                            bitmapM1948e = null;
                                            break;
                                        }
                                        String str25 = (String) it3.next();
                                        try {
                                            if (AbstractC3156t.m6740d0(str25, "http://", false) || AbstractC3156t.m6740d0(str25, "https://", false)) {
                                                URLConnection uRLConnectionOpenConnection = new URL(str25).openConnection();
                                                uRLConnectionOpenConnection.setConnectTimeout(3000);
                                                uRLConnectionOpenConnection.setReadTimeout(3000);
                                                InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                                                try {
                                                    c3959f = BitmapFactory.decodeStream(inputStream);
                                                    packageName = null;
                                                    try {
                                                        AbstractC2043a.m5035i(inputStream, null);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c3959f = new C3959f(th);
                                                    }
                                                } finally {
                                                }
                                            } else {
                                                File file = new File(str25);
                                                if (!file.exists()) {
                                                    file = null;
                                                }
                                                if (file != null) {
                                                    c3959f = BitmapFactory.decodeFile(file.getAbsolutePath());
                                                    packageName = null;
                                                } else {
                                                    packageName = null;
                                                    c3959f = null;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            packageName = null;
                                        }
                                        if (c3959f instanceof C3959f) {
                                            c3959f = packageName;
                                        }
                                        bitmapM1948e = (Bitmap) c3959f;
                                        if (bitmapM1948e != null) {
                                            break;
                                        }
                                    }
                                } else {
                                    bitmapM1948e = (Bitmap) concurrentHashMap.get(str17);
                                    packageName = null;
                                }
                            } else {
                                packageName = null;
                            }
                            if (bitmapM1948e != null) {
                                builder.setLargeIcon(bitmapM1948e);
                            }
                            notificationManager.notify(iHashCode3, builder.build());
                            if (zM10431a2) {
                                try {
                                    c3959f2 = AbstractC3149m.m6721t0(strM10432b4) ? RingtoneManager.getDefaultUri(2) : Uri.parse(strM10432b4);
                                } catch (Throwable th4) {
                                    c3959f2 = new C3959f(th4);
                                }
                                Uri uri = (Uri) (c3959f2 instanceof C3959f ? packageName : c3959f2);
                                if (uri == null) {
                                    return;
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - AbstractC5737d.f23382f < 1200) {
                                    return;
                                }
                                AbstractC5737d.f23382f = jCurrentTimeMillis;
                                AbstractC5737d.f23378b.post(new RunnableC0834e(context3, uri, 1));
                            }
                        }
                    }
                });
            } else {
                str2 = str10;
                str3 = str12;
                str4 = str7;
                context2 = context;
            }
            if (c5738e.m10431a("keyword_notify_toast", true)) {
                handler.post(new RunnableC0900w(context2, strM10418b3, 7));
            }
            try {
                AbstractC4302b.m8640c(context2, "Hchat_keyword_notification_config").edit().putLong("keyword_notify_last_time", System.currentTimeMillis()).putString("keyword_notify_last_keyword", str3).apply();
            } catch (Throwable unused) {
            }
            str5 = str;
            str7 = str4;
            strM3595k = str16;
            str9 = str14;
            str8 = str15;
            str10 = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static CharSequence m10421e(String str, String str2) {
        Object c3959f;
        if (AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2)) {
            return str;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int length = 0;
            while (true) {
                int iM6719r0 = AbstractC3149m.m6719r0(str, str2, length, false, 4);
                if (iM6719r0 < 0) {
                    break;
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF9800")), iM6719r0, str2.length() + iM6719r0, 33);
                length = iM6719r0 + str2.length();
            }
            c3959f = spannableStringBuilder;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = str;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (CharSequence) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m10422f(String str) {
        if (!AbstractC3149m.m6721t0(str)) {
            String string = AbstractC3149m.m6703R0(str).toString();
            if (!AbstractC3156t.m6740d0(string, "<?xml", false) && !AbstractC3156t.m6740d0(string, "<", false) && !AbstractC3149m.m6709h0(string, "<msg", false) && !AbstractC3149m.m6709h0(string, "<appmsg", false) && !AbstractC4156d0.m8355W("[动画表情]", "[表情]", "[图片]", "[语音]", "[视频]", "[文件]", "[链接]").contains(string)) {
                Pattern.compile("^(\\[[^\\[\\]\\s]{1,20}\\])+$").getClass();
                return !r0.matcher(string).matches();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10423g(C5738e c5738e, C2351o c2351o, boolean z9, String str, String str2) {
        Object c3959f;
        boolean zBooleanValue;
        boolean zM3825a;
        WeChatMessage weChatMessage = c2351o.f7723k;
        if (z9 ? c5738e.m10431a("keyword_notify_any_group", false) : c5738e.m10431a("keyword_notify_any_private", false)) {
            if (c2351o.m5621h()) {
                zM3825a = false;
                if (zM3825a) {
                    return "任意关键词";
                }
            } else {
                zM3825a = true;
                if (c2351o.m5624k() || c2351o.m5634u() || c2351o.m5633t() || c2351o.m5619f() || c2351o.m5622i() || c2351o.m5625l() || c2351o.m5626m() || c2351o.m5631r() || c2351o.m5628o() || c2351o.m5632s() || c2351o.m5635v()) {
                    if (c2351o.m5629p()) {
                        if (!c2351o.m5629p()) {
                            String string = AbstractC3149m.m6703R0(str).toString();
                            if (!WeChatSnsPost.TYPE_TEXT.equals(c2351o.f7714b) || !m10422f(string)) {
                                if ((weChatMessage != null ? weChatMessage.getType() : 0) != 1 || !m10422f(string)) {
                                    zM3825a = AbstractC1416l.m3825a(m10417a(string), "57");
                                }
                            }
                        }
                    }
                    if (zM3825a) {
                    }
                } else if (!(weChatMessage != null && weChatMessage.isVoipVoice())) {
                    if (weChatMessage != null && weChatMessage.isVoipVideo()) {
                    }
                    if (!c2351o.m5629p()) {
                    }
                    if (zM3825a) {
                    }
                }
            }
        }
        for (C5739f c5739f : c5738e.m10433c()) {
            String str3 = c5739f.f23384a;
            if (!AbstractC3149m.m6721t0(str3)) {
                if (c5739f.f23385b) {
                    try {
                        c3959f = Boolean.valueOf(Pattern.compile("\\b" + Pattern.quote(str3) + "\\b", 2).matcher(str2).find());
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Object objValueOf = Boolean.valueOf(AbstractC3149m.m6709h0(str2, str3, false));
                    if (c3959f instanceof C3959f) {
                        c3959f = objValueOf;
                    }
                    zBooleanValue = ((Boolean) c3959f).booleanValue();
                } else {
                    zBooleanValue = AbstractC3149m.m6709h0(str2, str3, false);
                }
                if (zBooleanValue) {
                    return str3;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m10424h(WeChatMessage weChatMessage) {
        if (weChatMessage.isQuote()) {
            return "quote";
        }
        if (weChatMessage.isImage()) {
            return WeChatSnsPost.TYPE_IMAGE;
        }
        if (weChatMessage.isVoice()) {
            return "voice";
        }
        if (weChatMessage.isVideo()) {
            return WeChatSnsPost.TYPE_VIDEO;
        }
        if (weChatMessage.isEmoji()) {
            return "emoji";
        }
        if (weChatMessage.isFile()) {
            return "file";
        }
        if (weChatMessage.isLink()) {
            return "link";
        }
        if (weChatMessage.isPat()) {
            return "pat";
        }
        if (weChatMessage.isSystem()) {
            return "system";
        }
        if (weChatMessage.isVoip()) {
            return "voip";
        }
        int i9 = weChatMessage.type;
        return i9 == 1 ? WeChatSnsPost.TYPE_TEXT : i9 == 49 ? "app" : WeChatSnsPost.TYPE_UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10425i(String str, boolean z9) {
        Object c3959f;
        Object c3959f2;
        File parentFile;
        String absolutePath = f23381e;
        if (absolutePath == null) {
            WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
            if (weChatDatabaseApiDatabase != null) {
                try {
                    c3959f2 = weChatDatabaseApiDatabase.query("PRAGMA database_list", null);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                Object obj = C4173t.f13710g;
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = obj;
                }
                Iterator it = ((List) c3959f2).iterator();
                while (it.hasNext()) {
                    Object obj2 = ((Map) it.next()).get("file");
                    String string = obj2 != null ? obj2.toString() : null;
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!AbstractC3149m.m6721t0(string) && (parentFile = new File(string).getParentFile()) != null) {
                        File file = new File(parentFile, "avatar");
                        if (file.isDirectory() || parentFile.isDirectory()) {
                            absolutePath = file.getAbsolutePath();
                            break;
                        }
                    }
                }
                absolutePath = null;
                f23381e = absolutePath;
                if (absolutePath == null) {
                    return null;
                }
            } else {
                absolutePath = null;
                f23381e = absolutePath;
                if (absolutePath == null) {
                }
            }
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                AbstractC0000a.m96w(16);
                String string2 = Integer.toString((b10 >>> 4) & 15, 16);
                string2.getClass();
                sb2.append(string2);
                AbstractC0000a.m96w(16);
                String string3 = Integer.toString(b10 & 15, 16);
                string3.getClass();
                sb2.append(string3);
            }
            c3959f = sb2.toString();
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        String str2 = (String) c3959f;
        if (str2 == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(AbstractC3149m.m6706U0(absolutePath, '/'));
        sb3.append('/');
        sb3.append(str2.substring(0, 2));
        sb3.append('/');
        sb3.append(str2.substring(2, 4));
        sb3.append("/user_");
        if (z9) {
            sb3.append("hd_");
        }
        String strM2255r = AbstractC0921a.m2255r(sb3, str2, ".png");
        if (new File(strM2255r).exists()) {
            return strM2255r;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m10426j(C2351o c2351o, String str) {
        WeChatMessage weChatMessage = c2351o.f7723k;
        if (c2351o.m5624k()) {
            return "[图片]";
        }
        WeChatQuoteMsg quoteMsg = weChatMessage != null ? weChatMessage.getQuoteMsg() : null;
        if (quoteMsg != null) {
            String strM10429m = m10429m(quoteMsg.title);
            String strM10429m2 = m10429m(quoteMsg.content);
            if (!AbstractC3149m.m6721t0(strM10429m) && !AbstractC3149m.m6721t0(strM10429m2)) {
                return AbstractC4855en.m9264h(strM10429m, " | 引用: ", strM10429m2);
            }
            if (!AbstractC3149m.m6721t0(strM10429m)) {
                return strM10429m;
            }
            if (!AbstractC3149m.m6721t0(strM10429m2)) {
                return strM10429m2;
            }
        } else {
            String strBodyContent = weChatMessage != null ? weChatMessage.bodyContent() : null;
            if (strBodyContent == null) {
                strBodyContent = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3149m.m6721t0(strBodyContent)) {
                str = strBodyContent;
            }
            String string = AbstractC3149m.m6703R0(str).toString();
            if (!AbstractC3149m.m6721t0(string)) {
                if (!AbstractC3156t.m6740d0(string, "<?xml", false) && !AbstractC3149m.m6709h0(string, "<msg", true) && !AbstractC3149m.m6709h0(string, "<appmsg", true)) {
                    Pattern patternCompile = Pattern.compile("^[A-Za-z0-9_\\-]+:\\n");
                    patternCompile.getClass();
                    String strReplaceAll = patternCompile.matcher(string).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
                    strReplaceAll.getClass();
                    return AbstractC3149m.m6703R0(strReplaceAll).toString();
                }
                if (!AbstractC1416l.m3825a(m10417a(string), "57")) {
                    String strM10429m3 = m10429m(m10430n(string, "title"));
                    return AbstractC3149m.m6721t0(strM10429m3) ? m10429m(m10430n(string, "content")) : strM10429m3;
                }
                String strM10429m4 = m10429m(m10430n(string, "title"));
                String strM10429m5 = m10429m(m10430n(m10428l(1, string, "(?is)<refermsg>(.*?)</refermsg>"), "content"));
                if (!AbstractC3149m.m6721t0(strM10429m4) && !AbstractC3149m.m6721t0(strM10429m5)) {
                    return AbstractC4855en.m9264h(strM10429m4, " | 引用: ", strM10429m5);
                }
                if (!AbstractC3149m.m6721t0(strM10429m4)) {
                    return strM10429m4;
                }
                if (!AbstractC3149m.m6721t0(strM10429m5)) {
                    return strM10429m5;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m10427k(String str) {
        Integer numM6741e0;
        Integer numM6741e02;
        Integer numM6741e03;
        List listM6692G0 = AbstractC3149m.m6692G0(AbstractC3149m.m6703R0(str).toString(), new String[]{":"});
        int size = listM6692G0.size();
        if (2 > size || size >= 4) {
            return -1;
        }
        int iIntValue = 0;
        String str2 = (String) AbstractC4166m.m8425w1(0, listM6692G0);
        if (str2 == null || (numM6741e0 = AbstractC3156t.m6741e0(10, str2)) == null) {
            return -1;
        }
        int iIntValue2 = numM6741e0.intValue();
        String str3 = (String) AbstractC4166m.m8425w1(1, listM6692G0);
        int iIntValue3 = (str3 == null || (numM6741e03 = AbstractC3156t.m6741e0(10, str3)) == null) ? 0 : numM6741e03.intValue();
        String str4 = (String) AbstractC4166m.m8425w1(2, listM6692G0);
        if (str4 != null && (numM6741e02 = AbstractC3156t.m6741e0(10, str4)) != null) {
            iIntValue = numM6741e02.intValue();
        }
        if (iIntValue2 < 0 || iIntValue2 >= 24 || iIntValue3 < 0 || iIntValue3 >= 60 || iIntValue < 0 || iIntValue >= 60) {
            return -1;
        }
        return AbstractC3199a.m6834g(iIntValue3, 60, iIntValue2 * 3600, iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10428l(int i9, String str, String str2) {
        Object c3959f;
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zM6721t0 || AbstractC3149m.m6721t0(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            Matcher matcher = Pattern.compile(str2, 34).matcher(str);
            if (!matcher.find() || matcher.groupCount() < i9) {
                c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                c3959f = matcher.group(i9);
                if (c3959f == null) {
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m10429m(String str) {
        if (AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM5161h = AbstractC2091b.m5161h("(?is)<[^>]+>", AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&lt;", "<", false), "&gt;", ">", false), "&amp;", "&", false), "&quot;", "\"", false), "&apos;", "'", false), "&#10;", "\n", false), "&#13;", "\r", false), " ");
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM5161h).replaceAll(" ");
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m10430n(String str, String str2) {
        if (AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM1022k = AbstractC0255e.m1022k("(?is)<", Pattern.quote(str2), ">(?:<!\\[CDATA\\[(.*?)\\]\\]>|(.*?))</", Pattern.quote(str2), ">");
        String strM10428l = m10428l(1, str, strM1022k);
        return AbstractC3149m.m6721t0(strM10428l) ? m10428l(2, str, strM1022k) : strM10428l;
    }
}
