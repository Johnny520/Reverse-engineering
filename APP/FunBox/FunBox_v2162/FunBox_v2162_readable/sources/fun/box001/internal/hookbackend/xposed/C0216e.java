package fun.box001.internal.hookbackend.xposed;

import fun.box001.shared.hook.XHooker;
import java.util.ArrayList;

/* JADX INFO: renamed from: p.e */
/* JADX INFO: loaded from: classes.dex */
final class C0216e extends XHooker.HookParam {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object[] f827a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ArrayList f828b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ XHooker.HookCallback f829c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Throwable[] f830d;

    C0216e(Object[] objArr, ArrayList arrayList, XHooker.HookCallback hookCallback, Throwable[] thArr) {
        this.f827a = objArr;
        this.f828b = arrayList;
        this.f829c = hookCallback;
        this.f830d = thArr;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final Object getResult() {
        return this.f827a[0];
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final Throwable getThrowable() {
        return this.f830d[0];
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setResult(Object obj) {
        this.f827a[0] = obj;
        setThrowable(null);
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setThrowable(Throwable th) {
        this.f830d[0] = th;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void unhook() {
        this.f828b.remove(this.f829c);
    }
}
