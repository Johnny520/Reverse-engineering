package p015p;

import android.util.Log;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import fun.box001.shared.hook.XHooker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: p.j */
/* JADX INFO: loaded from: classes.dex */
final class C0221j extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f840a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ XHooker.HookCallback f841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0221j(AtomicReference atomicReference, XHooker.HookCallback hookCallback) {
        super(10000);
        this.f840a = atomicReference;
        this.f841b = hookCallback;
    }

    protected final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0220i c0220i = new C0220i(this, methodHookParam);
        c0220i.method = methodHookParam.method;
        c0220i.obj = methodHookParam.thisObject;
        c0220i.args = methodHookParam.args;
        try {
            this.f841b.onInvoke(c0220i);
        } catch (Throwable th) {
            XposedBridge.log("[FunBox]" + Log.getStackTraceString(th));
        }
    }
}
