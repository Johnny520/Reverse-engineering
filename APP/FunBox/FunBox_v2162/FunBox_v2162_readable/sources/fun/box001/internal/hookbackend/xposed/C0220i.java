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

    C0220i(C0221j c0221j, XC_MethodHook.MethodHookParam methodHookParam) {
        this.f839b = c0221j;
        this.f838a = methodHookParam;
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
    public final void setResult(Object obj) {
        this.f838a.setResult(obj);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setThrowable(Throwable th) {
        this.f838a.setThrowable(th);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void unhook() {
        ((XC_MethodHook.Unhook) this.f839b.f840a.get()).unhook();
    }
}
