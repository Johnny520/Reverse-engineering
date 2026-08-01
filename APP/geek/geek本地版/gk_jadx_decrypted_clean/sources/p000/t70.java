package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t70 extends s70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0511n6 f4521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u70 f4522b;

    public t70(u70 u70Var, C0511n6 c0511n6) {
        this.f4522b = u70Var;
        this.f4521a = c0511n6;
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: e */
    public final void mo1431e(r70 r70Var) {
        ((ArrayList) this.f4521a.getOrDefault(this.f4522b.f4680b, null)).remove(r70Var);
        r70Var.m2273u(this);
    }
}
