package fun.box001.internal.hookbackend.xposed;

import de.robv.android.xposed.XC_MethodHook;
import fun.box001.shared.hook.XHooker;

/* JADX INFO: renamed from: p.i */
/* JADX INFO: loaded from: classes.dex */
final class C0220i extends XHooker.HookParam {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ XC_MethodHook.MethodHookParam f838a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0221j f839b;

    C0220i(C0221j r1, XC_MethodHook.MethodHookParam r2) {
        this.f839b = r1;
        this.f838a = r2;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final Object getResult() {
        return this.f838a.getResult();
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final Throwable getThrowable() {
        return this.f838a.getThrowable();
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setResult(Object r2) {
        this.f838a.setResult(r2);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setThrowable(Throwable r2) {
        this.f838a.setThrowable(r2);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void unhook() {
        ((XC_MethodHook.Unhook) this.f839b.f840a.get()).unhook();
    }
}
