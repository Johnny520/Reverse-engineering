package p330w9;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PowerManager;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p099h.Hchat.crash.RunnableC1436e;
import p099h.Hchat.hooks.items.keepalive.WeChatKeepAliveService;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: w9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4689a {

    /* JADX INFO: renamed from: a */
    public static PowerManager.WakeLock f15659a;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f15660b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f15661c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m9197a(Context context, Context context2) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3 = C3967n.f12976a;
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        Context applicationContext2 = null;
        if (context2 == null) {
            try {
                c3959f = context.createPackageContext("h.Hchat", 2);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            context2 = (Context) c3959f;
        }
        if (context2 != null && (applicationContext2 = context2.getApplicationContext()) == null) {
            applicationContext2 = context2;
        }
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_wechat_keep_alive_config");
        if (!sharedPreferencesM8640c.getBoolean("wechat_keep_alive_enable", false)) {
            m9200d();
            if (applicationContext2 != null) {
                try {
                    int i9 = WeChatKeepAliveService.f4779k;
                    Context applicationContext3 = applicationContext2.getApplicationContext();
                    if (applicationContext3 != null) {
                        applicationContext2 = applicationContext3;
                    }
                    applicationContext2.stopService(new Intent(applicationContext2, (Class<?>) WeChatKeepAliveService.class));
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (sharedPreferencesM8640c.getBoolean("wechat_keep_alive_wake_lock", true)) {
            PowerManager.WakeLock wakeLock = f15659a;
            if (wakeLock == null || !wakeLock.isHeld()) {
                try {
                    Object systemService = context.getSystemService("power");
                    systemService.getClass();
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "Hchat:WeChatKeepAlive");
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    wakeLockNewWakeLock.acquire();
                    f15659a = wakeLockNewWakeLock;
                    c3959f2 = c3959f3;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f2);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:KeepAlive] 获取 WakeLock 失败: ", thM8182b.getMessage(), thM8182b);
                }
            }
        } else {
            m9200d();
        }
        if (sharedPreferencesM8640c.getBoolean("wechat_keep_alive_foreground_service", true)) {
            if (applicationContext2 != null) {
                boolean z9 = sharedPreferencesM8640c.getBoolean("wechat_keep_alive_watchdog", false);
                boolean z10 = sharedPreferencesM8640c.getBoolean("wechat_keep_alive_network_heartbeat", false);
                try {
                    int i10 = WeChatKeepAliveService.f4779k;
                    Context applicationContext4 = applicationContext2.getApplicationContext();
                    if (applicationContext4 != null) {
                        applicationContext2 = applicationContext4;
                    }
                    Intent intent = new Intent(applicationContext2, (Class<?>) WeChatKeepAliveService.class);
                    intent.putExtra("h.Hchat.extra.WATCHDOG", z9);
                    intent.putExtra("h.Hchat.extra.NETWORK_HEARTBEAT", z10);
                    applicationContext2.startForegroundService(intent);
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f3);
                if (thM8182b2 != null) {
                    AbstractC0921a.m2261x("[Hchat:KeepAlive] 启动前台服务失败: ", thM8182b2.getMessage(), thM8182b2);
                }
            } else {
                AbstractC1184v0.m3203m("[Hchat:KeepAlive] 模块 Context 不可用，跳过前台服务");
            }
        } else if (applicationContext2 != null) {
            try {
                int i11 = WeChatKeepAliveService.f4779k;
                Context applicationContext5 = applicationContext2.getApplicationContext();
                if (applicationContext5 != null) {
                    applicationContext2 = applicationContext5;
                }
                applicationContext2.stopService(new Intent(applicationContext2, (Class<?>) WeChatKeepAliveService.class));
            } catch (Throwable unused2) {
            }
        }
        if (sharedPreferencesM8640c.getBoolean("wechat_keep_alive_root_doze_whitelist", false) && !f15660b) {
            f15660b = true;
            Thread thread = new Thread(new RunnableC1436e(7));
            thread.setName("Hchat-KeepAlive-RootWhitelist");
            thread.setDaemon(true);
            thread.start();
        }
        if (!sharedPreferencesM8640c.getBoolean("wechat_keep_alive_root_app_ops", false) || f15661c) {
            return;
        }
        f15661c = true;
        Thread thread2 = new Thread(new RunnableC1436e(6));
        thread2.setName("Hchat-KeepAlive-RootAppOps");
        thread2.setDaemon(true);
        thread2.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m9198b(Context context) {
        Object c3959f;
        try {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            boolean z9 = false;
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations("com.tencent.mm")) {
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
    /* JADX INFO: renamed from: c */
    public static boolean m9199c() {
        Object c3959f;
        try {
            boolean z9 = true;
            if (new ProcessBuilder("sh", "-c", "pidof com.tencent.mm").redirectErrorStream(true).start().waitFor() != 0) {
                z9 = false;
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m9200d() {
        Object c3959f;
        try {
            PowerManager.WakeLock wakeLock = f15659a;
            if (wakeLock == null) {
                c3959f = null;
            } else {
                if (!wakeLock.isHeld()) {
                    wakeLock = null;
                }
                if (wakeLock != null) {
                    wakeLock.release();
                    c3959f = C3967n.f12976a;
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:KeepAlive] 释放 WakeLock 失败: ", thM8182b.getMessage(), thM8182b);
        }
        f15659a = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m9201e(String str) {
        Object c3959f;
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("su", "-c", str);
            boolean z9 = true;
            if (processBuilder.redirectErrorStream(true).start().waitFor() != 0) {
                z9 = false;
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
}
