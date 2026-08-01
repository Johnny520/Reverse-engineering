package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z70 extends y70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0511n6 f5556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a80 f5557b;

    public z70(a80 a80Var, C0511n6 c0511n6) {
        this.f5557b = a80Var;
        this.f5556a = c0511n6;
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: e */
    public final void mo1670e(x70 x70Var) {
        ((ArrayList) this.f5556a.getOrDefault(this.f5557b.f51b, null)).remove(x70Var);
        x70Var.m2651u(this);
    }
}
