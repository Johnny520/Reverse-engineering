package p000a;

import java.util.Arrays;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0624i2 implements IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        C0631i9.m1482e(c0173j8, "session");
        try {
            C0637if c0637if = C0637if.f2311a;
            ClassLoader classLoader = c0173j8.f608a;
            c0637if.getClass();
            C0637if.m1488b(classLoader, c0173j8);
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"[BlockHotUpdate] diagnose FAILED", thM2189a}, 2));
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] diagnostic Part DONE"}, 1));
    }
}
