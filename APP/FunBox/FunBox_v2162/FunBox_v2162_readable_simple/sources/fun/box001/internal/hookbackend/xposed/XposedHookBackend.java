package fun.box001.internal.hookbackend.xposed;

import de.robv.android.xposed.XposedBridge;
import fun.box001.shared.hook.XHooker;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: p.k */
/* JADX INFO: loaded from: classes.dex */
public final class XposedHookBackend extends XHooker {
    @Override // fun.box001.shared.hook.XHooker
    protected final void decompile0(Member r7) {
        Method r0 = XposedBridge.class.getMethod("deoptimizeMethod", new Class[]{Member.class});     // Catch: Exception -> L4
        r0.setAccessible(true);     // Catch: Exception -> L4
        r0.invoke(null, new Object[]{r7});     // Catch: Exception -> L4
        return;
    L5:
        throw new IllegalStateException("decompile0 not implemented");
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void hookAfterImpl(Member r3, XHooker.HookCallback r4) {
        AtomicReference r0 = new AtomicReference();
        r0.set(XposedBridge.hookMethod(r3, new C0221j(r0, r4)));
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void hookBeforeImpl(Member r3, XHooker.HookCallback r4) {
        AtomicReference r0 = new AtomicReference();
        r0.set(XposedBridge.hookMethod(r3, new C0219h(r0, r4)));
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final Object invokeImpl(Member r1, Object r2, Object[] r3) {
        return XposedBridge.invokeOriginalMethod(r1, r2, r3);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void logImpl(String r3) {
        XposedBridge.log("[FunBox]" + r3);
    }
}
