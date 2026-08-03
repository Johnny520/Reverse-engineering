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
import p042W0.AbstractC0425j;
import p049b0.C0551a;
import p049b0.C0569s;
import p054e0.C0769c;

/* JADX INFO: renamed from: f0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0820c0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2976a = null;

    static {
        f2976a = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m2127a(Context r7, ClassLoader r8, String r9) {
        if (f2976a.compareAndSet(false, true) == true) goto L5;
        m2130d("core hooks already installed, skip (" + r9 + ")");
        return;
    L5:
        Context r02 = r7.getApplicationContext();
        if (r02 == null) goto L9;
        r7 = r02;
    L9:
        m2130d("install core hooks via " + r9);
        String r03 = "alive=" + System.currentTimeMillis() + "\nreason=" + r9 + "\npid=" + Process.myPid() + "\n";
        Iterator r3 = AbstractC0040p.m82F("/sdcard/Android/media/com.tencent.mm/OKK/hook_alive.txt").iterator();
    L11:
        if (r3.hasNext() == false) goto L21;
        File r5 = new File((String) r3.next());     // Catch: Throwable -> L16
        File r4 = r5.getParentFile();     // Catch: Throwable -> L16
        if (r4 == null) goto L18;
        r4.mkdirs();     // Catch: Throwable -> L16
    L18:
        AbstractC0270k.m694k0(r5, r03);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L11
    L21:
        C0769c.f2728a.clear();
        C0769c.f2731d.clear();
        C0769c.f2729b.set(0);
        C0769c.f2730c.set(0);
        ModuleLog.INSTANCE.bootstrap();     // Catch: Throwable -> L24
    L26:
        ModuleLog r04 = ModuleLog.INSTANCE;
        r04.m1813i("开始加载核心 Hook · " + r9);
        String r92 = AbstractC0805P.f2920a;
        AtomicBoolean r32 = AbstractC0814Z.f2956a;
        AbstractC0307g.m703e(r8, "cl");
        Context r33 = r7.getApplicationContext();
        if (r33 != null) goto L29;
        r33 = r7;
    L29:
        AbstractC0814Z.f2957b = r33;
        AbstractC0814Z.f2958c = r8;
        AbstractC0814Z.f2959d = r92;
        ConcurrentHashMap r34 = C0769c.f2728a;
        C0769c.m1962b("WeChatVersion", new C0840s(2, r7));
        C0769c.m1962b("SettingsEntry", new C0811W(r8, r7));
        C0769c.m1962b("CompatCheckUi", new C0811W(r7, r8, 11));
        C0569s r82 = C0569s.f1683h;
        if (r82 != null) goto L32;
        r82 = AbstractC0358S.m882d0(r7);
    L32:
        String r72 = AbstractC0358S.m912u(r7, r82, r92);
        C0551a r83 = AbstractC0358S.m862L();
        boolean r93 = AbstractC0358S.m869S(r72);
        r04.m1813i("适配指纹 needPopup=" + r93 + " shown=" + AbstractC0358S.m864N() + " fp=" + r72);
        if (r93 == true) goto L38;
        if (r83 == null) goto L38;
        if (AbstractC0307g.m699a(r83.f1638a, r72) == false) goto L38;
        m2130d("silent install from cache " + r83.m1361e());
        AbstractC0358S.f729i = false;
        AbstractC0358S.f728h = false;
        AbstractC0814Z.m2123a("cache");
    L41:
        C0769c.m1966f();
        m2130d("bootstrap finished " + C0769c.m1969i());
        return;
    L38:
        if (r83 == null) goto L40;
        m2130d("install stale cache before interactive scan " + r83.m1361e());
        AbstractC0814Z.m2123a("stale-cache");
        r04.m1813i("已先按旧缓存恢复功能，稍后可更新 DEX 缓存");
    L40:
        m2130d("defer features for interactive scan fp=".concat(r72));
        AbstractC0358S.f729i = true;
        AbstractC0358S.f728h = true;
        r04.m1813i("将在主界面弹出适配检查（重装/首次）");
    L24:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L26
    }

    /* JADX INFO: renamed from: b */
    public static void m2128b(String r3, String r4, boolean r5, ClassLoader r6, String r7) {
        if (r7 == null) goto L8;
        if (AbstractC0425j.m1013R0(r7) == true) goto L8;
        AbstractC0805P.f2920a = r7;
    L8:
        if (r3.equals(ModernHookEntry.WECHAT_PACKAGE) == false) goto L10;
        m2130d("seen wechat source=libxposed process=" + r4 + " firstApp=" + r5);
    L10:
        int r1 = 0;
        if (r3.equals(ModernHookEntry.WECHAT_PACKAGE) == true) goto L14;
    L12:
        r5 = false;
    L18:
        if (r5 == true) goto L20;
        return;
    L20:
        m2130d("handlePackage accepted: " + r4 + " source=libxposed");
        Object r32 = AbstractC0358S.m906r(r6, "com.tencent.tinker.loader.app.TinkerApplication");     // Catch: Throwable -> L23
    L26:
        if ((r32 instanceof C0140f) == false) goto L28;
        r32 = null;
    L28:
        Class r33 = (Class) r32;
        if (r33 != null) goto L31;
        m2130d("TinkerApplication not found; waiting for Application.onCreate");
    L32:
        Iterator r34 = AbstractC0182m.m556h0(new String[]{"com.tencent.mm.app.Application", "android.app.Application"}).iterator();
    L34:
        if (r34.hasNext() == false) goto L40;
        String r42 = (String) r34.next();
        Object[] r72 = {new C0818b0(r6, r42, 0)};     // Catch: Throwable -> L38
        AbstractC0307g.m703e(r42, "className");     // Catch: Throwable -> L38
        AbstractC0358S.m904q(AbstractC0358S.m906r(r6, r42), "onCreate", Arrays.copyOf(r72, 1));     // Catch: Throwable -> L38
        m2130d("hooked " + r42 + ".onCreate");     // Catch: Throwable -> L38
        r1 = r1 + 1;
    L38:
        th = move-exception;
        m2130d("skip " + r42 + ".onCreate: " + th.getMessage());
        goto L34
    L40:
        if (r1 != 0) goto L52;
        m2130d("WARNING: failed to hook Application.onCreate");
        return;
    L52:
        return;
    L31:
        m2130d("Tinker startup hooks installed: " + (m2129c(r33, r6, "Context,long,long", new C0816a0(1, r33)) + m2129c(r33, r6, "Context", new C0816a0(0, r33))));
    L23:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
        goto L26
    L14:
        if (r4.equals(ModernHookEntry.WECHAT_PACKAGE) == false) goto L17;
        r5 = true;
        goto L18
    L17:
        if (AbstractC0425j.m1013R0(r4) == false) goto L12;
        goto L12
    }

    /* JADX INFO: renamed from: c */
    public static int m2129c(Class r3, ClassLoader r4, String r5, InterfaceC0286l r6) {
        r6.invoke(new C0818b0(r4, r5, 1));     // Catch: Throwable -> L5
        m2130d("hooked " + r3.getName() + ".onBaseContextAttached(" + r5 + ")");     // Catch: Throwable -> L5
        return 1;
    L5:
        th = move-exception;
        m2130d("skip Tinker.onBaseContextAttached(" + r5 + "): " + th.getMessage());
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static void m2130d(String r2) {
        AbstractC0762d.m1954d("[OKK-Loader] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
