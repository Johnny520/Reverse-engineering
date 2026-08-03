package p015p;

import de.robv.android.xposed.XposedBridge;
import fun.box001.shared.hook.XHooker;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: p.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0222k extends XHooker {
    @Override // fun.box001.shared.hook.XHooker
    protected final void decompile0(Member member) {
        try {
            Method method = XposedBridge.class.getMethod("deoptimizeMethod", Member.class);
            method.setAccessible(true);
            method.invoke(null, member);
        } catch (Exception unused) {
            throw new IllegalStateException("decompile0 not implemented");
        }
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void hookAfterImpl(Member member, XHooker.HookCallback hookCallback) {
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(XposedBridge.hookMethod(member, new C0221j(atomicReference, hookCallback)));
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void hookBeforeImpl(Member member, XHooker.HookCallback hookCallback) {
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(XposedBridge.hookMethod(member, new C0219h(atomicReference, hookCallback)));
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final Object invokeImpl(Member member, Object obj, Object[] objArr) {
        return XposedBridge.invokeOriginalMethod(member, obj, objArr);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void logImpl(String str) {
        XposedBridge.log("[FunBox]" + str);
    }
}
