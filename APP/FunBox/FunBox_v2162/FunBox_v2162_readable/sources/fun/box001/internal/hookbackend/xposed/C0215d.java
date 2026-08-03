package fun.box001.internal.hookbackend.xposed;

import fun.box001.shared.hook.XHooker;
import java.util.ArrayList;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: loaded from: classes.dex */
final class C0215d extends XHooker.HookParam {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean[] f822a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object[] f823b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ArrayList f824c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ XHooker.HookCallback f825d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Throwable[] f826e;

    C0215d(boolean[] zArr, Object[] objArr, ArrayList arrayList, XHooker.HookCallback hookCallback, Throwable[] thArr) {
        this.f822a = zArr;
        this.f823b = objArr;
        this.f824c = arrayList;
        this.f825d = hookCallback;
        this.f826e = thArr;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final Object getResult() {
        return null;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final Throwable getThrowable() {
        return null;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setResult(Object obj) {
        this.f822a[0] = true;
        this.f823b[0] = obj;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setThrowable(Throwable th) {
        this.f822a[0] = true;
        this.f826e[0] = th;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void unhook() {
        this.f824c.remove(this.f825d);
    }
}
