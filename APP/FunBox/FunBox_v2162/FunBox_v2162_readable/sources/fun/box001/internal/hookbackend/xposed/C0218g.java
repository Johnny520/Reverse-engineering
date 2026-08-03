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

    C0218g(C0219h c0219h, XC_MethodHook.MethodHookParam methodHookParam) {
        this.f835b = c0219h;
        this.f834a = methodHookParam;
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
    public final void setResult(Object obj) {
        this.f834a.setResult(obj);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setThrowable(Throwable th) {
        this.f834a.setThrowable(th);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void unhook() {
        ((XC_MethodHook.Unhook) this.f835b.f836a.get()).unhook();
    }
}
