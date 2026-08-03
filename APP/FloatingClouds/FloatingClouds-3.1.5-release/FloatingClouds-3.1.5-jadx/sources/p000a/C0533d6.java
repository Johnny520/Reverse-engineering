package p000a;

import android.os.Bundle;
import io.github.libxposed.api.XposedInterface;
import java.util.Arrays;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.d6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0533d6 implements IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        XposedInterface.HookHandle hookHandleM2206a;
        C0631i9.m1482e(c0173j8, "session");
        try {
            hookHandleM2206a = C0173J8.m463a(c0173j8, "android.app.Activity", "onCreate", new Class[]{Bundle.class}, new C0586g2(15));
        } catch (Throwable th) {
            hookHandleM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(hookHandleM2206a);
        if (thM2189a != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"hook Activity.onCreate for blockEnterChat fail", thM2189a}, 2));
        }
        C0173J8.m463a(c0173j8, "com.tencent.mm.ui.chatting.ChattingUIProxy", "onEnterBegin", new Class[0], new C0830t(this, c0173j8, 2));
    }
}
