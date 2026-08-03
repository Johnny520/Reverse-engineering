package p056f0;

import android.content.Context;
import android.os.Process;
import com.abc.core.hooks.ModuleLog;
import com.abc.loader.ModernHookEntry;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0182m;
import p026N0.AbstractC0270k;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p049b0.C0551a;
import p049b0.C0569s;
import p054e0.C0769c;

/* JADX INFO: renamed from: f0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0820c0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2976a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final void m2127a(Context context, ClassLoader classLoader, String str) {
        if (!f2976a.compareAndSet(false, true)) {
            m2130d("core hooks already installed, skip (" + str + ")");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        m2130d("install core hooks via " + str);
        String str2 = "alive=" + System.currentTimeMillis() + "\nreason=" + str + "\npid=" + Process.myPid() + "\n";
        Iterator it = AbstractC0040p.m82F("/sdcard/Android/media/com.tencent.mm/OKK/hook_alive.txt").iterator();
        while (it.hasNext()) {
            try {
                File file = new File((String) it.next());
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                AbstractC0270k.m693j0(file, str2, AbstractC0416a.f921a);
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
        C0769c.f2728a.clear();
        C0769c.f2731d.clear();
        C0769c.f2729b.set(0);
        C0769c.f2730c.set(0);
        try {
            ModuleLog.INSTANCE.bootstrap();
        } catch (Throwable th2) {
            AbstractC0040p.m116u(th2);
        }
        ModuleLog moduleLog = ModuleLog.INSTANCE;
        moduleLog.m1813i("开始加载核心 Hook · " + str);
        String str3 = AbstractC0805P.f2920a;
        AtomicBoolean atomicBoolean = AbstractC0814Z.f2956a;
        AbstractC0307g.m703e(classLoader, "cl");
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            applicationContext2 = context;
        }
        AbstractC0814Z.f2957b = applicationContext2;
        AbstractC0814Z.f2958c = classLoader;
        AbstractC0814Z.f2959d = str3;
        ConcurrentHashMap concurrentHashMap = C0769c.f2728a;
        C0769c.m1962b("WeChatVersion", new C0840s(2, context));
        C0769c.m1962b("SettingsEntry", new C0811W(classLoader, context));
        C0769c.m1962b("CompatCheckUi", new C0811W(context, classLoader, 11));
        C0569s c0569sM882d0 = C0569s.f1683h;
        if (c0569sM882d0 == null) {
            c0569sM882d0 = AbstractC0358S.m882d0(context);
        }
        String strM912u = AbstractC0358S.m912u(context, c0569sM882d0, str3);
        C0551a c0551aM862L = AbstractC0358S.m862L();
        boolean zM869S = AbstractC0358S.m869S(strM912u);
        moduleLog.m1813i("适配指纹 needPopup=" + zM869S + " shown=" + AbstractC0358S.m864N() + " fp=" + strM912u);
        if (zM869S || c0551aM862L == null || !AbstractC0307g.m699a(c0551aM862L.f1638a, strM912u)) {
            if (c0551aM862L != null) {
                m2130d("install stale cache before interactive scan " + c0551aM862L.m1361e());
                AbstractC0814Z.m2123a("stale-cache");
                moduleLog.m1813i("已先按旧缓存恢复功能，稍后可更新 DEX 缓存");
            }
            m2130d("defer features for interactive scan fp=".concat(strM912u));
            AbstractC0358S.f729i = true;
            AbstractC0358S.f728h = true;
            moduleLog.m1813i("将在主界面弹出适配检查（重装/首次）");
        } else {
            m2130d("silent install from cache " + c0551aM862L.m1361e());
            AbstractC0358S.f729i = false;
            AbstractC0358S.f728h = false;
            AbstractC0814Z.m2123a("cache");
        }
        C0769c.m1966f();
        m2130d("bootstrap finished " + C0769c.m1969i());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2128b(String str, String str2, boolean z2, ClassLoader classLoader, String str3) {
        Object objM116u;
        if (str3 != null && !AbstractC0425j.m1013R0(str3)) {
            AbstractC0805P.f2920a = str3;
        }
        if (str.equals(ModernHookEntry.WECHAT_PACKAGE)) {
            m2130d("seen wechat source=libxposed process=" + str2 + " firstApp=" + z2);
        }
        int i2 = 0;
        if (str.equals(ModernHookEntry.WECHAT_PACKAGE)) {
            if (str2.equals(ModernHookEntry.WECHAT_PACKAGE)) {
                z2 = true;
            } else if (!AbstractC0425j.m1013R0(str2)) {
                z2 = false;
            }
        }
        if (z2) {
            m2130d("handlePackage accepted: " + str2 + " source=libxposed");
            try {
                objM116u = AbstractC0358S.m906r(classLoader, "com.tencent.tinker.loader.app.TinkerApplication");
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            Class cls = (Class) objM116u;
            if (cls == null) {
                m2130d("TinkerApplication not found; waiting for Application.onCreate");
            } else {
                m2130d("Tinker startup hooks installed: " + (m2129c(cls, classLoader, "Context,long,long", new C0816a0(1, cls)) + m2129c(cls, classLoader, "Context", new C0816a0(0, cls))));
            }
            for (String str4 : AbstractC0182m.m556h0("com.tencent.mm.app.Application", "android.app.Application")) {
                try {
                    Object[] objArr = {new C0818b0(classLoader, str4, 0)};
                    AbstractC0307g.m703e(str4, "className");
                    AbstractC0358S.m904q(AbstractC0358S.m906r(classLoader, str4), "onCreate", Arrays.copyOf(objArr, 1));
                    m2130d("hooked " + str4 + ".onCreate");
                    i2++;
                } catch (Throwable th2) {
                    m2130d("skip " + str4 + ".onCreate: " + th2.getMessage());
                }
            }
            if (i2 == 0) {
                m2130d("WARNING: failed to hook Application.onCreate");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m2129c(Class cls, ClassLoader classLoader, String str, InterfaceC0286l interfaceC0286l) {
        try {
            interfaceC0286l.invoke(new C0818b0(classLoader, str, 1));
            m2130d("hooked " + cls.getName() + ".onBaseContextAttached(" + str + ")");
            return 1;
        } catch (Throwable th) {
            m2130d("skip Tinker.onBaseContextAttached(" + str + "): " + th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2130d(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-Loader] " + str);
        } catch (Throwable unused) {
        }
    }
}
