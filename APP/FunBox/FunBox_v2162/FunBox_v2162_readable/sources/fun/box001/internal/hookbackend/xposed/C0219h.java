package fun.box001.internal.hookbackend.xposed;

import android.util.Log;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import fun.box001.shared.hook.XHooker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: p.h */
/* JADX INFO: loaded from: classes.dex */
final class C0219h extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f836a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ XHooker.HookCallback f837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0219h(AtomicReference atomicReference, XHooker.HookCallback hookCallback) {
        super(10000);
        this.f836a = atomicReference;
        this.f837b = hookCallback;
    }

    protected final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0218g c0218g = new C0218g(this, methodHookParam);
        c0218g.method = methodHookParam.method;
        c0218g.obj = methodHookParam.thisObject;
        c0218g.args = methodHookParam.args;
        try {
            this.f837b.onInvoke(c0218g);
        } catch (Throwable th) {
            XposedBridge.log("[FunBox]" + Log.getStackTraceString(th));
        }
    }
}
