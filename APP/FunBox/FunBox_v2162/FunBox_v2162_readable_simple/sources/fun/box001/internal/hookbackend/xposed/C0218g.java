package fun.box001.internal.hookbackend.xposed;

import de.robv.android.xposed.XC_MethodHook;
import fun.box001.shared.hook.XHooker;

/* JADX INFO: renamed from: p.g */
/* JADX INFO: loaded from: classes.dex */
final class C0218g extends XHooker.HookParam {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ XC_MethodHook.MethodHookParam f834a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0219h f835b;

    C0218g(C0219h r1, XC_MethodHook.MethodHookParam r2) {
        this.f835b = r1;
        this.f834a = r2;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final Object getResult() {
        return this.f834a.getResult();
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final Throwable getThrowable() {
        return this.f834a.getThrowable();
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setResult(Object r2) {
        this.f834a.setResult(r2);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setThrowable(Throwable r2) {
        this.f834a.setThrowable(r2);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void unhook() {
        ((XC_MethodHook.Unhook) this.f835b.f836a.get()).unhook();
    }
}
