package fun.box001.internal.hookbackend.xposed;

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

    C0221j(AtomicReference r1, XHooker.HookCallback r2) {
        this.f840a = r1;
        this.f841b = r2;
        super(10000);
    }

    protected final void afterHookedMethod(XC_MethodHook.MethodHookParam r3) {
        C0220i r0 = new C0220i(this, r3);
        r0.method = r3.method;
        r0.obj = r3.thisObject;
        r0.args = r3.args;
        this.f841b.onInvoke(r0);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        XposedBridge.log("[FunBox]" + Log.getStackTraceString(th));
    }
}
