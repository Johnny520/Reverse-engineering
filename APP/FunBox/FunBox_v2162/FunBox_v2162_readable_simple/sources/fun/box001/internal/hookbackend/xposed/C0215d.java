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

    C0215d(boolean[] r1, Object[] r2, ArrayList r3, XHooker.HookCallback r4, Throwable[] r5) {
        this.f822a = r1;
        this.f823b = r2;
        this.f824c = r3;
        this.f825d = r4;
        this.f826e = r5;
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
    public final void setResult(Object r4) {
        this.f822a[0] = true;
        this.f823b[0] = r4;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void setThrowable(Throwable r4) {
        this.f822a[0] = true;
        this.f826e[0] = r4;
    }

    @Override // fun.box001.shared.hook.XHooker.HookParam
    public final void unhook() {
        this.f824c.remove(this.f825d);
    }
}
