package p063e9;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import ba.C0223c;
import ba.C0226f;
import ch.C0570e;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p024b9.C0219e;
import p025bc.AbstractC0255e;
import p036c9.C0417a2;
import p036c9.ThreadFactoryC0478q;
import p049d9.AbstractC0754o;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p092g4.AbstractC1341a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatFileMsg;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatQuoteMsg;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.api.model.WeChatTransferMsg;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1624a;
import p115hh.C1730o;
import p115hh.C1731p;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p153k8.C2343g;
import p153k8.C2351o;
import p153k8.C2355s;
import p167l8.C2529d;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import p366ya.AbstractC6019i;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: e9.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0846q {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2580a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2581b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f2582c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public static final ExecutorService f2583d = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(3));

    /* JADX INFO: renamed from: e */
    public static final ExecutorService f2584e = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(4));

    /* JADX INFO: renamed from: f */
    public static final Handler f2585f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f2586g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f2587h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public static final ConcurrentHashMap f2588i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f2589j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public static final ConcurrentHashMap f2590k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public static final ThreadLocal f2591l = new ThreadLocal();

    /* JADX INFO: renamed from: m */
    public static volatile String f2592m;

    /* JADX INFO: renamed from: n */
    public static volatile long f2593n;

    /* JADX INFO: renamed from: o */
    public static volatile SharedPreferences f2594o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m2115A(C0832c c0832c, String str) {
        Object c3959f;
        boolean z9 = false;
        if (c0832c.f2524o) {
            return false;
        }
        try {
            C1624a c1624aConversations = WeChatApis.conversations();
            if (c1624aConversations != null && c1624aConversations.m4145e(str)) {
                z9 = true;
            }
            c3959f = Boolean.valueOf(z9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2116a(Context context, int i9, String str, boolean z9) {
        Object c3959f;
        Object c3959f2;
        String str2;
        StatusBarNotification statusBarNotification;
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            try {
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                activeNotifications.getClass();
                int length = activeNotifications.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        statusBarNotification = null;
                        break;
                    }
                    statusBarNotification = activeNotifications[i10];
                    if (statusBarNotification.getTag() == null && statusBarNotification.getId() == i9) {
                        break;
                    } else {
                        i10++;
                    }
                }
                c3959f = statusBarNotification != null ? statusBarNotification.getNotification() : null;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Notification notification = (Notification) (c3959f instanceof C3959f ? null : c3959f);
            if (notification == null) {
                if (z9) {
                    notificationManager.cancel(i9);
                    return;
                }
                return;
            }
            long jNanoTime = System.nanoTime();
            try {
                Notification.Builder onlyAlertOnce = Notification.Builder.recoverBuilder(context, notification).setOnlyAlertOnce(true);
                if (z9) {
                    str2 = "已回复：" + str;
                } else {
                    str2 = "发送失败，请重试";
                }
                Notification.Builder contentText = onlyAlertOnce.setContentText(str2);
                Bundle bundle = new Bundle(notification.extras);
                bundle.putLong("hchat_custom_notification_reply_completion_token", jNanoTime);
                Notification.Builder extras = contentText.setExtras(bundle);
                extras.getClass();
                if (z9) {
                    extras.setRemoteInputHistory(new CharSequence[]{str});
                }
                notificationManager.notify(i9, extras.build());
                c3959f2 = C3967n.f12976a;
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f2);
            if (thM8182b == null) {
                if (z9) {
                    f2585f.postDelayed(new RunnableC0835f(notificationManager, i9, jNanoTime), 1200L);
                }
            } else {
                AbstractC1184v0.m3204n("[Hchat:CustomNotification] 快捷回复通知状态更新失败: " + i9, thM8182b);
                if (z9) {
                    notificationManager.cancel(i9);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2117b(Object obj, Context context) {
        Notification notification;
        C0832c c0832cM2150a;
        if (obj == null) {
            return;
        }
        C0848s c0848s = new C0848s(context);
        boolean zM2151b = c0848s.m2151b("custom_notification_enable");
        boolean z9 = AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("enable", false) && AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("scope_notifications", true);
        boolean z10 = AbstractC4302b.m8640c(context, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false);
        if (zM2151b || z9 || z10) {
            String strM2138w = m2138w(obj, "h", "userName", "username", "talker", "talkerUserName");
            String[] strArr = {"f", "notification", "mNotification"};
            int i9 = 0;
            while (true) {
                if (i9 >= 3) {
                    Iterator<T> it = KavaReflector.declaredFields(obj.getClass()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Field field = (Field) it.next();
                        if (Notification.class.isAssignableFrom(field.getType())) {
                            Object field2 = KavaReflector.readField(field, obj);
                            Notification notification2 = field2 instanceof Notification ? (Notification) field2 : null;
                            if (notification2 != null) {
                                notification = notification2;
                                break;
                            }
                        }
                    }
                } else {
                    Object field3 = KavaReflector.readField(obj, strArr[i9]);
                    notification = field3 instanceof Notification ? (Notification) field3 : null;
                    if (notification != null) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            boolean z11 = zM2151b || z10;
            long jM2137v = z11 ? m2137v(obj, "i", "msgId") : 0L;
            if (AbstractC3149m.m6721t0(strM2138w) || notification == null) {
                return;
            }
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            if (zM2151b || z9 || z10) {
                notification.extras.putString("hchat_custom_notification_talker", strM2138w);
            }
            if (z11 && jM2137v > 0) {
                notification.extras.putLong("hchat_custom_notification_native_msg_svr_id", jM2137v);
            }
            if (zM2151b && (c0832cM2150a = c0848s.m2150a(strM2138w)) != null && c0832cM2150a.f2515f) {
                notification.extras.putString("hchat_custom_notification_talker", strM2138w);
                int iM2136u = m2136u(obj, "m", "j");
                if (iM2136u > 0) {
                    notification.extras.putInt("hchat_custom_notification_unread_count", iM2136u);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m2118c(String str, long j3, long j4, String str2, boolean z9) {
        Object c3959f;
        WeChatMessage weChatMessageM5663e;
        C2343g c2343gM6844q = AbstractC3199a.m6844q();
        if (c2343gM6844q == null) {
            return false;
        }
        if (z9) {
            Long lValueOf = Long.valueOf(j3);
            if (j3 <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                lValueOf = lValueOf;
            } else {
                Long lValueOf2 = Long.valueOf(j4);
                if (j4 <= 0) {
                    lValueOf2 = null;
                }
                if (lValueOf2 != null) {
                    long jLongValue = lValueOf2.longValue();
                    try {
                        C2355s c2355sMessageStore = WeChatApis.messageStore();
                        c3959f = (c2355sMessageStore == null || (weChatMessageM5663e = c2355sMessageStore.m5663e(jLongValue, str)) == null) ? null : Long.valueOf(weChatMessageM5663e.msgId);
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = null;
                    }
                    Long l10 = (Long) c3959f;
                    if (l10 != null) {
                        lValueOf = l10.longValue() > 0 ? l10 : null;
                        if (lValueOf != null) {
                            jLongValue = lValueOf.longValue();
                        }
                    }
                    lValueOf = Long.valueOf(jLongValue);
                }
            }
            if (lValueOf != null && c2343gM6844q.m5598u(lValueOf.longValue(), str, str2)) {
                return true;
            }
        }
        return c2343gM6844q.m5601x(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2119d(Context context, String str) {
        Object c3959f;
        boolean z9;
        Bundle bundle;
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null) {
            return 0;
        }
        try {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            activeNotifications.getClass();
            int i9 = 0;
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                Notification notification = statusBarNotification.getNotification();
                if (notification == null || (bundle = notification.extras) == null) {
                    z9 = false;
                } else {
                    z9 = true;
                    if (bundle.getBoolean("hchat_custom_notification", false)) {
                        Bundle bundle2 = notification.extras;
                        if (AbstractC1416l.m3825a(bundle2 != null ? bundle2.getString("hchat_custom_notification_talker") : null, str)) {
                        }
                    }
                }
                if (z9) {
                    i9++;
                }
            }
            c3959f = Integer.valueOf(i9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = 0;
        }
        return ((Number) c3959f).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C0841l m2120e(Context context, C0832c c0832c, C2351o c2351o) {
        String strM9264h;
        String strConcat;
        String str = c2351o.f7714b;
        WeChatMessage weChatMessage = c2351o.f7723k;
        String str2 = c0832c.f2511b;
        String str3 = c0832c.f2512c;
        String strM3595k = AbstractC1341a.m3595k(str2);
        if (AbstractC3149m.m6721t0(strM3595k)) {
            strM3595k = AbstractC3149m.m6721t0(str3) ? str2 : str3;
        }
        strM9264h = "[收到一条新消息]";
        if (c0832c.f2523n) {
            String strBodyContent = weChatMessage != null ? weChatMessage.bodyContent() : null;
            String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (strBodyContent == null) {
                strBodyContent = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(strBodyContent)) {
                strBodyContent = c2351o.f7717e;
            }
            String strM6839l = AbstractC3199a.m6839l(strBodyContent, strBodyContent);
            if (WeChatSnsPost.TYPE_TEXT.equals(str)) {
                int iM6719r0 = AbstractC3149m.m6719r0(strM6839l, ":\n", 0, false, 6);
                if (iM6719r0 > 0) {
                    strM6839l = strM6839l.substring(iM6719r0 + 2);
                }
                strConcat = m2140y(strM6839l);
            } else if (c2351o.m5624k()) {
                strConcat = "[图片]";
            } else if (c2351o.m5634u()) {
                strConcat = "[语音]";
            } else if (c2351o.m5633t()) {
                strConcat = "[视频]";
            } else if (c2351o.m5621h()) {
                strConcat = "[表情]";
            } else if (c2351o.m5626m()) {
                strConcat = m2134s(strM6839l);
                if (AbstractC3149m.m6721t0(strConcat)) {
                    strConcat = "[位置]";
                }
            } else if ("red_packet".equals(str)) {
                strConcat = "[红包]";
            } else if ("transfer".equals(str) || (weChatMessage != null && weChatMessage.isTransfer())) {
                WeChatTransferMsg transferMsg = c2351o.f7728p;
                if (transferMsg == null) {
                    transferMsg = weChatMessage != null ? weChatMessage.getTransferMsg() : null;
                }
                String str5 = transferMsg != null ? transferMsg.description : null;
                if (str5 == null) {
                    str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String strM2140y = m2140y(str5);
                strConcat = !AbstractC3149m.m6721t0(strM2140y) ? "[转账] ".concat(strM2140y) : "[转账]";
            } else if (c2351o.m5629p()) {
                WeChatQuoteMsg quoteMsg = weChatMessage != null ? weChatMessage.getQuoteMsg() : null;
                String str6 = quoteMsg != null ? quoteMsg.title : null;
                if (str6 == null) {
                    str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String strM2140y2 = m2140y(str6);
                String str7 = quoteMsg != null ? quoteMsg.content : null;
                if (str7 == null) {
                    str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String strM2140y3 = m2140y(str7);
                if (!AbstractC3149m.m6721t0(strM2140y2) && !AbstractC3149m.m6721t0(strM2140y3)) {
                    strConcat = AbstractC0255e.m1021j("[引用] ", strM2140y2, " | ", strM2140y3);
                } else if (!AbstractC3149m.m6721t0(strM2140y2)) {
                    strConcat = "[引用] ".concat(strM2140y2);
                } else if (AbstractC3149m.m6721t0(strM2140y3)) {
                    strConcat = m2134s(strM6839l);
                    if (AbstractC3149m.m6721t0(strConcat)) {
                        strConcat = "[引用]";
                    }
                } else {
                    strConcat = "[引用] ".concat(strM2140y3);
                }
            } else if (c2351o.m5622i()) {
                WeChatFileMsg fileMsg = weChatMessage != null ? weChatMessage.getFileMsg() : null;
                String str8 = fileMsg != null ? fileMsg.title : null;
                if (str8 == null) {
                    str8 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(str8)) {
                    String str9 = fileMsg != null ? fileMsg.fileName : null;
                    str8 = str9 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str9;
                }
                String strM2140y4 = m2140y(str8);
                strConcat = !AbstractC3149m.m6721t0(strM2140y4) ? "[文件] ".concat(strM2140y4) : "[文件]";
            } else {
                strConcat = (c2351o.m5625l() || "music".equals(str) || (weChatMessage != null && weChatMessage.isMusic()) || "note".equals(str) || ((weChatMessage != null && weChatMessage.isNote()) || c2351o.m5631r() || "video_number_video".equals(str) || (weChatMessage != null && weChatMessage.isVideoNumberVideo()))) ? m2134s(strM6839l) : (weChatMessage == null || !weChatMessage.isVoipVideo()) ? (weChatMessage == null || !weChatMessage.isVoipVoice()) ? c2351o.m5635v() ? "[通话]" : c2351o.m5619f() ? m2134s(strM6839l) : m2134s(strM6839l) : "[语音通话]" : "[视频通话]";
            }
            strM9264h = AbstractC3149m.m6721t0(strConcat) ? "[收到一条新消息]" : strConcat;
            if (c0832c.f2513d) {
                String strM5616c = c2351o.f7716d;
                if (AbstractC3149m.m6721t0(strM5616c)) {
                    strM5616c = c2351o.m5616c();
                }
                strM5616c.getClass();
                if (!AbstractC3149m.m6721t0(strM5616c)) {
                    C1368i c1368iM9259c = AbstractC4855en.m9259c();
                    String strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(str2, strM5616c) : null;
                    if (strM3731t != null) {
                        str4 = strM3731t;
                    }
                }
                String strM3595k2 = AbstractC1341a.m3595k(str2);
                if (AbstractC3149m.m6721t0(strM3595k2)) {
                    if (AbstractC3149m.m6721t0(str3)) {
                        str3 = str2;
                    }
                    strM3595k = str3;
                } else {
                    strM3595k = strM3595k2;
                }
                if (!AbstractC3149m.m6721t0(str4)) {
                    strM9264h = AbstractC4855en.m9264h(str4, ": ", strM9264h);
                }
            }
        }
        String str10 = strM3595k;
        String str11 = strM9264h;
        int iM2119d = m2119d(context, str2) + 1;
        Bitmap bitmapM2131p = m2131p(context, str2);
        long createTime = weChatMessage != null ? weChatMessage.getCreateTime() : 0L;
        Long lValueOf = createTime > 0 ? Long.valueOf(createTime) : null;
        return new C0841l(str10, str11, iM2119d, bitmapM2131p, lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis(), weChatMessage != null ? weChatMessage.getMsgId() : 0L, weChatMessage != null ? weChatMessage.msgSvrId : 0L, null, 128);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m2121f(Object[] objArr) {
        Object obj;
        Object field;
        int length = objArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                obj = null;
                break;
            }
            obj = objArr[i9];
            if (m2128m(obj)) {
                break;
            }
            i9++;
        }
        if (obj != null) {
            return obj;
        }
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                for (Field field2 : m2125j(obj2.getClass())) {
                    Class<?> type = field2.getType();
                    if (!type.isPrimitive() && !type.isEnum() && !type.equals(String.class) && !Number.class.isAssignableFrom(type) && !type.equals(Boolean.TYPE) && (field = KavaReflector.readField(field2, obj2)) != null && m2128m(field)) {
                        return field;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m2122g(String... strArr) {
        String str;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str = null;
                break;
            }
            str = strArr[i9];
            if (!(str == null || AbstractC3149m.m6721t0(str))) {
                break;
            }
            i9++;
        }
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:21:0x003c, B:23:0x0050, B:25:0x0056, B:33:0x0094, B:37:0x00a1, B:42:0x00bc, B:53:0x00d6, B:54:0x00d9, B:36:0x009d, B:32:0x0084, B:51:0x00d4, B:39:0x00b0, B:41:0x00b9, B:49:0x00d0, B:50:0x00d3), top: B:63:0x003c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:21:0x003c, B:23:0x0050, B:25:0x0056, B:33:0x0094, B:37:0x00a1, B:42:0x00bc, B:53:0x00d6, B:54:0x00d9, B:36:0x009d, B:32:0x0084, B:51:0x00d4, B:39:0x00b0, B:41:0x00b9, B:49:0x00d0, B:50:0x00d3), top: B:63:0x003c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2123h(Context context, String str) {
        Object c3959f;
        Object c3959f2;
        String strConcat;
        InputStream inputStreamOpenInputStream;
        String strDecode;
        context.getClass();
        str.getClass();
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zM6721t0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            c3959f = Uri.parse(str);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Uri uri = (Uri) c3959f;
        if (uri == null) {
            return str;
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            str2 = scheme;
        }
        if (!str2.equalsIgnoreCase("content")) {
            return str;
        }
        try {
            File file = new File(context.getExternalFilesDir(null), "custom_notification_ringtones");
            file.mkdirs();
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null || (strDecode = Uri.decode(lastPathSegment)) == null) {
                strConcat = "ringtone_" + System.currentTimeMillis();
                if (AbstractC3149m.m6710i0(strConcat, '.')) {
                    strConcat = strConcat.concat(".mp3");
                }
                File file2 = new File(file, strConcat);
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                        try {
                            AbstractC1341a.m3594j(inputStreamOpenInputStream, fileOutputStream);
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            String string = Uri.fromFile(file2).toString();
                            string.getClass();
                            c3959f2 = string;
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    c3959f2 = str;
                }
            } else {
                String strM6697L0 = AbstractC3149m.m6697L0(strDecode, '/', strDecode);
                String strM6697L02 = AbstractC3149m.m6697L0(strM6697L0, ':', strM6697L0);
                Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|\\s]+");
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(strM6697L02).replaceAll("_");
                strReplaceAll.getClass();
                strConcat = AbstractC3149m.m6721t0(strReplaceAll) ? null : strReplaceAll;
                if (strConcat != null) {
                }
                if (AbstractC3149m.m6710i0(strConcat, '.')) {
                }
                File file22 = new File(file, strConcat);
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                }
            }
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        Object obj = str;
        if (!(c3959f2 instanceof C3959f)) {
            obj = c3959f2;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:226:0x0226 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x00e7 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [sf.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public static void m2124i(C3742g c3742g) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        c3742g.getClass();
        if (f2580a.compareAndSet(false, true)) {
            AbstractC6019i.m10780a(c3742g);
            Object obj = C4173t.f13710g;
            f2594o = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_custom_notification_method_cache");
            List listM2133r = m2133r(c3742g, "native_notification_processor", "in sample Notify: needSound: %B, needShake: %B, msgContent: ==, msgType: %d, talker: %s, customNotify: %s, isRevokeMessage:%b", new C0837h(0));
            Iterator it = listM2133r.iterator();
            while (it.hasNext()) {
                C3744i.f12154b.m7763b((Method) it.next(), new C0417a2(c3742g, 2));
            }
            List listM2133r2 = m2133r(c3742g, "native_notification_cleanup", "needRemoveNotificationId:%s", new C0837h(1));
            if (listM2133r.isEmpty() || listM2133r2.isEmpty()) {
                AbstractC1184v0.m3203m("[Hchat:CustomNotification] 未定位微信隐藏内容通知清理链路");
            } else {
                Iterator it2 = listM2133r.iterator();
                while (it2.hasNext()) {
                    C3744i.f12154b.m7763b((Method) it2.next(), new C0417a2(c3742g, 3));
                }
                Iterator it3 = listM2133r2.iterator();
                while (it3.hasNext()) {
                    C3744i.f12154b.m7763b((Method) it3.next(), new C0226f(13));
                }
            }
            C0828b c0828b = C0828b.f2478a;
            SharedPreferences sharedPreferencesM8640c = f2594o;
            if (sharedPreferencesM8640c == null) {
                sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_custom_notification_method_cache");
                f2594o = sharedPreferencesM8640c;
            }
            String strM2091g = C0828b.m2091g(c3742g.f12143a, c3742g.f12145c);
            List listM2090f = C0828b.m2090f(sharedPreferencesM8640c, strM2091g, c3742g.f12145c, "native_notification_builder");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM2090f) {
                if (m2129n((Method) obj2)) {
                    arrayList.add(obj2);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            Class<?> cls = null;
            List<Method> list = arrayList;
            if (zIsEmpty) {
                list = null;
            }
            if (list == null) {
                List listM101y0 = AbstractC0000a.m101y0("com.tencent.mm.booter.notification.e0", "com.tencent.mm.booter.notification.w");
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = listM101y0.iterator();
                while (it4.hasNext()) {
                    Class<?> clsLoadClass = KavaReflector.loadClass((String) it4.next(), c3742g.f12145c);
                    if (clsLoadClass != null) {
                        arrayList2.add(clsLoadClass);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    List<Method> listDeclaredMethods = KavaReflector.declaredMethods((Class) it5.next());
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listDeclaredMethods) {
                        if (m2129n((Method) obj3)) {
                            arrayList4.add(obj3);
                        }
                    }
                    AbstractC4171r.m8432h1(arrayList3, arrayList4);
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    if (hashSet.add(((Method) obj4).toGenericString())) {
                        arrayList5.add(obj4);
                    }
                }
                if (arrayList5.isEmpty()) {
                    try {
                        DexKitBridge dexKitBridge = c3742g.f12146d;
                        C0570e c0570e = new C0570e();
                        C1253k c1253k = new C1253k();
                        C1253k.m3367u0(c1253k, AbstractC0000a.m99x0("MicroMsg.Notification.AppMsg.Handle"));
                        c0570e.f1764h = c1253k;
                        C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = c1731pFindMethod.iterator();
                        while (it6.hasNext()) {
                            try {
                                c3959f3 = ((C1730o) it6.next()).m4350r(c3742g.f12145c);
                            } catch (Throwable th2) {
                                c3959f3 = new C3959f(th2);
                            }
                            if (c3959f3 instanceof C3959f) {
                                c3959f3 = null;
                            }
                            Method method = (Method) c3959f3;
                            if (method != null) {
                                arrayList6.add(method);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj5 : arrayList6) {
                            if (m2129n((Method) obj5)) {
                                arrayList7.add(obj5);
                            }
                        }
                        HashSet hashSet2 = new HashSet();
                        c3959f2 = new ArrayList();
                        for (Object obj6 : arrayList7) {
                            if (hashSet2.add(((Method) obj6).toGenericString())) {
                                c3959f2.add(obj6);
                            }
                        }
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f2);
                    Object obj7 = c3959f2;
                    if (thM8182b != null) {
                        AbstractC0921a.m2261x("[Hchat:CustomNotification] 定位微信原生通知构建方法失败: ", thM8182b.getMessage(), thM8182b);
                        obj7 = obj;
                    }
                    list = (List) obj7;
                    if (list.isEmpty()) {
                        try {
                            SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
                            if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                                editorEdit.clear().putString("cache.key", strM2091g);
                            }
                            editorEdit.remove("native_notification_builder").apply();
                        } catch (Throwable unused) {
                        }
                    } else {
                        c0828b.m2097j(sharedPreferencesM8640c, strM2091g, "native_notification_builder", list);
                    }
                } else {
                    c0828b.m2097j(sharedPreferencesM8640c, strM2091g, "native_notification_builder", arrayList5);
                    list = arrayList5;
                }
            }
            for (Method method2 : list) {
                C3744i.f12154b.m7763b(method2, new C0219e(method2, 6));
            }
            Class<?> clsLoadClass2 = KavaReflector.loadClass("com.tencent.mm.booter.notification.NotificationItem", c3742g.f12145c);
            if (clsLoadClass2 != null) {
                cls = clsLoadClass2;
                break;
            }
            try {
                c3959f = c3742g.f12150h.findClassesByStrings("id: ", "userName: ", "unreadCount:");
            } catch (Throwable th4) {
                c3959f = new C3959f(th4);
            }
            if (!(c3959f instanceof C3959f)) {
                obj = c3959f;
            }
            for (String str : (List) obj) {
                if (!AbstractC1416l.m3825a(str, "com.tencent.mm.booter.notification.NotificationItem")) {
                    str.getClass();
                    if (AbstractC3156t.m6733W(str, ".NotificationItem", false) || AbstractC3149m.m6709h0(str, "com.tencent.mm.booter.notification", false)) {
                    }
                }
                clsLoadClass2 = KavaReflector.loadClass(str, c3742g.f12145c);
                if (clsLoadClass2 != null) {
                    cls = clsLoadClass2;
                    break;
                }
            }
            if (cls != null) {
                Set setHookAllConstructors = XposedBridge.hookAllConstructors(cls, new C0417a2(c3742g, 5));
                if (setHookAllConstructors != null) {
                    Iterator it7 = setHookAllConstructors.iterator();
                    while (it7.hasNext()) {
                        C3744i.f12154b.m7762a((XC_MethodHook.Unhook) it7.next());
                    }
                }
                for (Method method3 : KavaReflector.declaredMethods(cls)) {
                    Class<?>[] parameterTypes = method3.getParameterTypes();
                    if (parameterTypes != null && parameterTypes.length == 1 && Context.class.isAssignableFrom(parameterTypes[0])) {
                        C3744i.f12154b.m7763b(method3, new C0417a2(c3742g, 4));
                    }
                }
            }
            Method[] declaredMethods = NotificationManager.class.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method4 : declaredMethods) {
                Class<?>[] parameterTypes2 = method4.getParameterTypes();
                if (parameterTypes2 != null && AbstractC1416l.m3825a(method4.getName(), "notify") && parameterTypes2.length != 0) {
                    if (parameterTypes2.length == 0) {
                        C2104o.m5287l("Array is empty.");
                        return;
                    } else if (AbstractC1416l.m3825a(parameterTypes2[parameterTypes2.length - 1], Notification.class)) {
                        C3744i.f12154b.m7763b(method4, new C0417a2(c3742g, 6));
                    }
                }
            }
            Context context = c3742g.f12143a;
            AtomicBoolean atomicBoolean = f2581b;
            if (atomicBoolean.compareAndSet(false, true)) {
                C0845p c0845p = new C0845p();
                IntentFilter intentFilter = new IntentFilter("h.Hchat.action.CUSTOM_NOTIFICATION_REPLY");
                intentFilter.addAction("h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ");
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(c0845p, intentFilter, 4);
                    } else {
                        context.registerReceiver(c0845p, intentFilter);
                    }
                } catch (Throwable th5) {
                    atomicBoolean.set(false);
                    AbstractC0921a.m2261x("[Hchat:CustomNotification] 注册通知动作广播失败: ", th5.getMessage(), th5);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static List m2125j(Class cls) {
        ConcurrentHashMap concurrentHashMap = f2589j;
        Object obj = concurrentHashMap.get(cls);
        Object obj2 = obj;
        if (obj == null) {
            ArrayList arrayList = new ArrayList();
            for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listDeclaredFields) {
                    if (!KavaReflector.isStatic((Field) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                AbstractC4171r.m8432h1(arrayList, arrayList2);
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj2 = arrayList;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (List) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m2126k(C0832c c0832c) {
        if (!c0832c.f2525p) {
            return false;
        }
        Set set = C0848s.f2595b;
        int iM2148g = C0847r.m2148g(c0832c.f2526q);
        int iM2148g2 = C0847r.m2148g(c0832c.f2527r);
        if (iM2148g < 0 || iM2148g2 < 0) {
            return false;
        }
        if (iM2148g == iM2148g2) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        int i9 = calendar.get(13) + (calendar.get(12) * 60) + (calendar.get(11) * 3600);
        return iM2148g < iM2148g2 ? iM2148g <= i9 && i9 < iM2148g2 : i9 >= iM2148g || i9 < iM2148g2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m2127l(Class[] clsArr) {
        if (clsArr.length >= 15 && Notification.class.isAssignableFrom(clsArr[0])) {
            Class cls = clsArr[1];
            Class cls2 = Integer.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(clsArr[2], cls2) && PendingIntent.class.isAssignableFrom(clsArr[3]) && AbstractC1416l.m3825a(clsArr[4], String.class) && AbstractC1416l.m3825a(clsArr[5], String.class) && AbstractC1416l.m3825a(clsArr[6], String.class) && Bitmap.class.isAssignableFrom(clsArr[7]) && AbstractC1416l.m3825a(clsArr[14], String.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m2128m(Object obj) {
        boolean z9 = false;
        if (obj == null) {
            return false;
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = f2590k;
        Object obj2 = concurrentHashMap.get(cls);
        if (obj2 == null) {
            if (KavaReflector.findFieldRecursive(obj.getClass(), "field_msgSvrId") != null && KavaReflector.findFieldRecursive(obj.getClass(), "field_talker") != null && KavaReflector.findFieldRecursive(obj.getClass(), "field_content") != null) {
                z9 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z9);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, boolValueOf);
            obj2 = objPutIfAbsent == null ? boolValueOf : objPutIfAbsent;
        }
        return ((Boolean) obj2).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m2129n(Method method) {
        if (!AbstractC1416l.m3825a(method.getReturnType(), Notification.class)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return m2127l(parameterTypes) || m2130o(parameterTypes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m2130o(Class[] clsArr) {
        if (clsArr.length == 1 && !Notification.class.isAssignableFrom(clsArr[0])) {
            List<Field> listDeclaredFields = KavaReflector.declaredFields(clsArr[0]);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listDeclaredFields) {
                if (AbstractC1416l.m3825a(((Field) obj).getType(), String.class)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Field) it.next()).getName());
            }
            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
            if (!listDeclaredFields.isEmpty()) {
                Iterator<T> it2 = listDeclaredFields.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Notification.class.isAssignableFrom(((Field) it2.next()).getType())) {
                        Set setM8355W = AbstractC4156d0.m8355W("e", "f", "g", "o");
                        if (!(setM8355W instanceof Collection) || !setM8355W.isEmpty()) {
                            Iterator it3 = setM8355W.iterator();
                            while (it3.hasNext()) {
                                if (!setM8412U1.contains((String) it3.next())) {
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:0: B:42:0x0088->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m2131p(Context context, String str) {
        Object c3959f;
        Object objDecodeFile;
        Bitmap bitmap;
        InputStream inputStream;
        Bitmap bitmapM1948e;
        Bitmap bitmap2 = null;
        if (AbstractC3149m.m6721t0(str)) {
            return null;
        }
        if (AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("enable", false) && AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("scope_notifications", true) && (bitmapM1948e = AbstractC0754o.m1948e(context, str)) != null) {
            return bitmapM1948e;
        }
        ConcurrentHashMap concurrentHashMap = f2586g;
        if (concurrentHashMap.containsKey(str)) {
            return (Bitmap) concurrentHashMap.get(str);
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String strM3724m = c1368iM9259c != null ? c1368iM9259c.m3724m(str, true) : null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (strM3724m == null) {
            strM3724m = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM3724m2 = c1368iM9259c != null ? c1368iM9259c.m3724m(str, false) : null;
        if (strM3724m2 != null) {
            str2 = strM3724m2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!AbstractC3149m.m6721t0(strM3724m)) {
            linkedHashSet.add(strM3724m);
        }
        if (!AbstractC3149m.m6721t0(str2)) {
            linkedHashSet.add(str2);
        }
        String strM2132q = m2132q(str, false);
        if (strM2132q != null) {
            linkedHashSet.add(strM2132q);
        }
        String strM2132q2 = m2132q(str, true);
        if (strM2132q2 != null) {
            linkedHashSet.add(strM2132q2);
        }
        Iterator it = AbstractC4166m.m8407P1(linkedHashSet).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            try {
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            try {
                if (!AbstractC3156t.m6740d0(str3, "http://", false) && !AbstractC3156t.m6740d0(str3, "https://", false)) {
                    File file = new File(str3);
                    if (!file.exists()) {
                        file = null;
                    }
                    objDecodeFile = file != null ? BitmapFactory.decodeFile(file.getAbsolutePath()) : null;
                    if (objDecodeFile instanceof C3959f) {
                        objDecodeFile = null;
                    }
                    bitmap = (Bitmap) objDecodeFile;
                    if (bitmap == null) {
                        bitmap2 = bitmap;
                        break;
                    }
                }
                c3959f = BitmapFactory.decodeStream(inputStream);
                AbstractC2043a.m5035i(inputStream, null);
                objDecodeFile = c3959f;
                if (objDecodeFile instanceof C3959f) {
                }
                bitmap = (Bitmap) objDecodeFile;
                if (bitmap == null) {
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC2043a.m5035i(inputStream, th3);
                    throw th4;
                }
            }
            URLConnection uRLConnectionOpenConnection = new URL(str3).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(3000);
            uRLConnectionOpenConnection.setReadTimeout(3000);
            inputStream = uRLConnectionOpenConnection.getInputStream();
        }
        concurrentHashMap.put(str, bitmap2);
        return bitmap2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2132q(String str, boolean z9) {
        Object c3959f;
        Object c3959f2;
        File parentFile;
        String absolutePath = f2592m;
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
                f2592m = absolutePath;
                if (absolutePath == null) {
                    return null;
                }
            } else {
                absolutePath = null;
                f2592m = absolutePath;
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
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x00eb */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [sf.f] */
    /* JADX INFO: renamed from: r */
    public static List m2133r(C3742g c3742g, String str, String str2, InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        Object c3959f2;
        C0828b c0828b = C0828b.f2478a;
        SharedPreferences sharedPreferencesM8640c = f2594o;
        if (sharedPreferencesM8640c == null) {
            sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_custom_notification_method_cache");
            f2594o = sharedPreferencesM8640c;
        }
        String strM2091g = C0828b.m2091g(c3742g.f12143a, c3742g.f12145c);
        List listM2090f = C0828b.m2090f(sharedPreferencesM8640c, strM2091g, c3742g.f12145c, str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (((Boolean) interfaceC1231l.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return arrayList;
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC0000a.m99x0(str2));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(c3742g.f12145c);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList2.add(method);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((Boolean) interfaceC1231l.invoke(obj2)).booleanValue()) {
                    arrayList3.add(obj2);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (hashSet.add(((Method) obj3).toGenericString())) {
                    c3959f.add(obj3);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj4 = c3959f;
        if (thM8182b != null) {
            AbstractC0921a.m2260w("[Hchat:CustomNotification] 定位微信通知方法失败 anchor=", str2, ": ", thM8182b.getMessage(), thM8182b);
            obj4 = C4173t.f13710g;
        }
        List list = (List) obj4;
        if (list.isEmpty()) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
                if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit.clear().putString("cache.key", strM2091g);
                }
                editorEdit.remove(str).apply();
            } catch (Throwable unused) {
            }
        } else {
            c0828b.m2097j(sharedPreferencesM8640c, strM2091g, str, list);
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m2134s(String str) {
        int iM6719r0 = AbstractC3149m.m6719r0(str, ":\n", 0, false, 6);
        if (iM6719r0 > 0) {
            str = str.substring(iM6719r0 + 2);
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        WeChatMessage.Companion.getClass();
        String strM2140y = m2140y(m2122g(C2529d.m5949o(string, "title"), C2529d.m5949o(string, "des"), C2529d.m5949o(string, "description"), C2529d.m5949o(string, "content")));
        return !AbstractC3149m.m6721t0(strM2140y) ? strM2140y : AbstractC3156t.m6740d0(string, "<", false) ? "[收到一条新消息]" : m2140y(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static String m2135t(Notification notification, String str) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        String string = (bundle == null || (charSequence = bundle.getCharSequence(str)) == null) ? null : charSequence.toString();
        return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static int m2136u(Object obj, String... strArr) {
        for (String str : strArr) {
            Object field = KavaReflector.readField(obj, str);
            Number number = field instanceof Number ? (Number) field : null;
            if (number != null) {
                return number.intValue();
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static long m2137v(Object obj, String... strArr) {
        for (String str : strArr) {
            Object field = KavaReflector.readField(obj, str);
            Number number = field instanceof Number ? (Number) field : null;
            if (number != null) {
                return number.longValue();
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m2138w(Object obj, String... strArr) {
        String string;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i9 >= length) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Object field = KavaReflector.readField(obj, strArr[i9]);
            String string2 = (field == null || (string = field.toString()) == null) ? null : AbstractC3149m.m6703R0(string).toString();
            if (string2 != null) {
                str = string2;
            }
            if (!AbstractC3149m.m6721t0(str)) {
                return str;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m2139x(Object obj, String str) {
        Object field = KavaReflector.readField(obj, str);
        String str2 = field instanceof String ? (String) field : null;
        String string = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
        return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static String m2140y(String str) {
        String strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&lt;", "<", false), "&gt;", ">", false), "&amp;", "&", false), "&quot;", "\"", false), "&#39;", "'", false);
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM6737a0).replaceAll(" ");
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:232:0x015d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015a A[Catch: all -> 0x0153, TryCatch #1 {all -> 0x0153, blocks: (B:50:0x0122, B:52:0x0126, B:54:0x012e, B:56:0x0132, B:58:0x013b, B:60:0x0145, B:63:0x014e, B:69:0x015a, B:70:0x015d, B:71:0x0163, B:80:0x018d, B:82:0x0191, B:84:0x0197, B:74:0x0173, B:75:0x0179, B:77:0x017f), top: B:211:0x0122 }] */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2141z(Context context, C0832c c0832c, C0841l c0841l) {
        int i9;
        NotificationManager notificationManager;
        String str;
        Object c3959f;
        Object c3959f2;
        Notification notification;
        Bundle bundle;
        Object c3959f3;
        Object c3959f4;
        Object c3959f5;
        StatusBarNotification[] activeNotifications;
        ArrayList arrayList;
        Comparable comparable;
        int i10;
        Integer numValueOf;
        Bundle bundle2;
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager2 = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager2 != null) {
            String str2 = c0832c.f2518i ? "1" : "0";
            String str3 = c0832c.f2517h ? "1" : "0";
            int iHashCode = c0832c.f2528s.hashCode();
            StringBuilder sbM1027p = AbstractC0255e.m1027p("Hchat_custom_notification_s", str2, "_v", str3, "_");
            sbM1027p.append(iHashCode);
            String string = sbM1027p.toString();
            try {
                List<NotificationChannel> notificationChannels = notificationManager2.getNotificationChannels();
                if (notificationChannels != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = notificationChannels.iterator();
                    while (it.hasNext()) {
                        String id2 = ((NotificationChannel) it.next()).getId();
                        if (id2 == null || !AbstractC3156t.m6740d0(id2, "Hchat_custom_notification_", false)) {
                            id2 = null;
                        }
                        if (id2 != null) {
                            arrayList2.add(id2);
                        }
                    }
                    if (arrayList2.size() > 100) {
                        Iterator it2 = AbstractC4166m.m8403L1(arrayList2.size() - 100, arrayList2).iterator();
                        while (it2.hasNext()) {
                            notificationManager2.deleteNotificationChannel((String) it2.next());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            NotificationChannel notificationChannel = new NotificationChannel(string, "Hchat 自定义通知", 4);
            notificationChannel.enableVibration(c0832c.f2517h);
            notificationChannel.setVibrationPattern(c0832c.f2517h ? new long[]{0, 250, 250, 250} : new long[]{0});
            notificationChannel.setSound(null, null);
            notificationManager2.createNotificationChannel(notificationChannel);
            Notification.Builder builder = new Notification.Builder(context, string);
            boolean z9 = c0832c.f2522m;
            String str4 = c0832c.f2511b;
            int iHashCode2 = z9 ? (str4.hashCode() & 16777215) | 1258291200 : (int) ((((((long) str4.hashCode()) & 1023) << 20) | 1241513984 | (((long) f2582c.updateAndGet(new C0223c(3))) & 1048575)) & 2147483647L);
            boolean z10 = c0832c.f2522m;
            int iMax = c0841l.f2558c;
            if (z10) {
                String str5 = c0832c.f2511b;
                try {
                    activeNotifications = notificationManager2.getActiveNotifications();
                    activeNotifications.getClass();
                    arrayList = new ArrayList();
                    i9 = 2;
                } catch (Throwable th2) {
                    th = th2;
                    i9 = 2;
                }
                try {
                    int length = activeNotifications.length;
                    int i11 = 0;
                    while (i11 < length) {
                        Notification notification2 = activeNotifications[i11].getNotification();
                        if (notification2 == null || (bundle2 = notification2.extras) == null) {
                            i10 = length;
                        } else {
                            i10 = length;
                            if (bundle2.getBoolean("hchat_custom_notification", false) && AbstractC1416l.m3825a(bundle2.getString("hchat_custom_notification_talker"), str5)) {
                                int i12 = bundle2.getInt("hchat_custom_notification_unread_count", 0);
                                if (i12 < 1) {
                                    i12 = 1;
                                }
                                numValueOf = Integer.valueOf(i12);
                            }
                            if (numValueOf == null) {
                                arrayList.add(numValueOf);
                            }
                            i11++;
                            length = i10;
                        }
                        numValueOf = null;
                        if (numValueOf == null) {
                        }
                        i11++;
                        length = i10;
                    }
                    int size = arrayList.size();
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        comparable = (Comparable) it3.next();
                        while (it3.hasNext()) {
                            Comparable comparable2 = (Comparable) it3.next();
                            if (comparable.compareTo(comparable2) < 0) {
                                comparable = comparable2;
                            }
                        }
                    } else {
                        comparable = null;
                    }
                    Integer num = (Integer) comparable;
                    c3959f5 = Integer.valueOf(Math.max(size, num != null ? num.intValue() : 0));
                } catch (Throwable th3) {
                    th = th3;
                    c3959f5 = new C3959f(th);
                }
                if (c3959f5 instanceof C3959f) {
                    c3959f5 = 0;
                }
                iMax = Math.max(iMax, ((Number) c3959f5).intValue() + 1);
            } else {
                i9 = 2;
            }
            int i13 = context.getApplicationInfo().icon;
            Integer numValueOf2 = Integer.valueOf(i13);
            if (i13 == 0) {
                numValueOf2 = null;
            }
            int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : R.drawable.stat_notify_chat;
            String str6 = c0841l.f2557b;
            if (iMax > 1) {
                Pattern patternCompile = Pattern.compile("^\\[\\d+条].*");
                patternCompile.getClass();
                if (!patternCompile.matcher(str6).matches()) {
                    str6 = "[" + iMax + "条]" + str6;
                }
            }
            PendingIntent activities = c0841l.f2563h;
            if (activities != null) {
                notificationManager = notificationManager2;
                str = "hchat_custom_notification_unread_count";
            } else {
                String str7 = c0832c.f2511b;
                ArrayList arrayList3 = new ArrayList();
                Intent intent = new Intent();
                notificationManager = notificationManager2;
                str = "hchat_custom_notification_unread_count";
                intent.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
                intent.addFlags(872415232);
                arrayList3.add(intent);
                if (!AbstractC3149m.m6721t0(str7)) {
                    Intent intent2 = new Intent();
                    intent2.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.ui.chatting.ChattingUI"));
                    intent2.putExtra("Chat_User", str7);
                    intent2.putExtra("Chat_Mode", 1);
                    intent2.putExtra("finish_direct", true);
                    intent2.addFlags(603979776);
                    arrayList3.add(intent2);
                }
                activities = arrayList3.isEmpty() ? null : PendingIntent.getActivities(context, iHashCode2, (Intent[]) arrayList3.toArray(new Intent[0]), 201326592);
            }
            Notification.Builder contentIntent = builder.setSmallIcon(iIntValue).setContentTitle(c0841l.f2556a).setContentText(str6).setTicker(str6).setNumber(iMax).setWhen(c0841l.f2560e).setShowWhen(true).setAutoCancel(true).setOnlyAlertOnce(false).setCategory("msg").setPriority(1).setContentIntent(activities);
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("hchat_custom_notification", true);
            bundle3.putString("hchat_custom_notification_talker", c0832c.f2511b);
            bundle3.putInt(str, iMax);
            contentIntent.setExtras(bundle3);
            Bitmap bitmap = c0841l.f2559d;
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            }
            if (c0832c.f2519j) {
                String str8 = c0832c.f2511b;
                try {
                    Intent intent3 = new Intent("h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ");
                    intent3.setPackage(context.getPackageName());
                    intent3.putExtra("hchat_custom_notification_talker", str8);
                    intent3.putExtra("hchat_custom_notification_id", iHashCode2);
                    c3959f4 = new Notification.Action.Builder(R.drawable.ic_menu_view, "已读", PendingIntent.getBroadcast(context, iHashCode2, intent3, 201326592)).build();
                } catch (Throwable th4) {
                    c3959f4 = new C3959f(th4);
                }
                if (c3959f4 instanceof C3959f) {
                    c3959f4 = null;
                }
                Notification.Action action = (Notification.Action) c3959f4;
                if (action != null) {
                    builder.addAction(action);
                }
            }
            if (c0832c.f2520k) {
                String str9 = c0832c.f2511b;
                long j3 = c0841l.f2561f;
                long j4 = c0841l.f2562g;
                boolean z11 = c0832c.f2521l;
                try {
                    RemoteInput remoteInputBuild = new RemoteInput.Builder("hchat_reply_text").setLabel("输入回复内容...").setAllowFreeFormInput(true).build();
                    remoteInputBuild.getClass();
                    Intent intent4 = new Intent("h.Hchat.action.CUSTOM_NOTIFICATION_REPLY");
                    intent4.setPackage(context.getPackageName());
                    intent4.addFlags(268435456);
                    intent4.putExtra("hchat_custom_notification_talker", str9);
                    intent4.putExtra("hchat_custom_notification_id", iHashCode2);
                    intent4.putExtra("hchat_custom_notification_reply_msg_id", j3);
                    intent4.putExtra("hchat_custom_notification_native_msg_svr_id", j4);
                    intent4.putExtra("hchat_custom_notification_quote_quick_reply", z11);
                    int i14 = Build.VERSION.SDK_INT;
                    Notification.Action.Builder builderAddRemoteInput = new Notification.Action.Builder(R.drawable.ic_menu_send, "快捷回复", PendingIntent.getBroadcast(context, iHashCode2, intent4, i14 >= 31 ? 167772160 : 134217728)).addRemoteInput(remoteInputBuild);
                    builderAddRemoteInput.getClass();
                    builderAddRemoteInput.setAllowGeneratedReplies(true);
                    if (i14 >= 28) {
                        builderAddRemoteInput.setSemanticAction(1);
                    }
                    c3959f3 = builderAddRemoteInput.build();
                } catch (Throwable th5) {
                    c3959f3 = new C3959f(th5);
                }
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = null;
                }
                Notification.Action action2 = (Notification.Action) c3959f3;
                if (action2 != null) {
                    builder.addAction(action2);
                }
            }
            NotificationManager notificationManager3 = notificationManager;
            notificationManager3.notify(iHashCode2, builder.build());
            if (c0832c.f2522m) {
                String str10 = c0832c.f2511b;
                try {
                    StatusBarNotification[] activeNotifications2 = notificationManager3.getActiveNotifications();
                    activeNotifications2.getClass();
                    for (StatusBarNotification statusBarNotification : activeNotifications2) {
                        if ((statusBarNotification.getId() != iHashCode2 || statusBarNotification.getTag() != null) && (notification = statusBarNotification.getNotification()) != null && (bundle = notification.extras) != null) {
                            if (bundle.getBoolean("hchat_custom_notification", false) && AbstractC1416l.m3825a(bundle.getString("hchat_custom_notification_talker"), str10)) {
                                if (statusBarNotification.getTag() == null) {
                                    notificationManager3.cancel(statusBarNotification.getId());
                                } else {
                                    notificationManager3.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                                }
                            }
                        }
                    }
                    c3959f2 = C3967n.f12976a;
                } catch (Throwable th6) {
                    c3959f2 = new C3959f(th6);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f2);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:CustomNotification] 合并会话通知清理失败: ", str10, thM8182b);
                }
            }
            if (c0832c.f2518i) {
                String str11 = c0832c.f2528s;
                try {
                    c3959f = AbstractC3149m.m6721t0(str11) ? RingtoneManager.getDefaultUri(i9) : Uri.parse(str11);
                } catch (Throwable th7) {
                    c3959f = new C3959f(th7);
                }
                Uri uri = (Uri) (c3959f instanceof C3959f ? null : c3959f);
                if (uri == null) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - f2593n < 1200) {
                    return;
                }
                f2593n = jCurrentTimeMillis;
                f2585f.post(new RunnableC0834e(context, uri, 0));
            }
        }
    }
}
