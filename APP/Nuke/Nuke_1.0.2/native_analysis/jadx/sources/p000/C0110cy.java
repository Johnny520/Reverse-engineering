package p000;

import java.util.List;

/* JADX INFO: renamed from: cy */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0110cy implements jv1, y10 {

    /* JADX INFO: renamed from: i */
    public static final C0953z8 f1773i = new C0953z8(12);

    /* JADX INFO: renamed from: h */
    public final go0 f1774h;

    public C0110cy(go0 go0Var) {
        this.f1774h = go0Var;
    }

    @Override // p000.jv1
    /* JADX INFO: renamed from: f */
    public final List mo912f(Integer num) {
        return this.f1774h.m1949E();
    }

    @Override // p000.y10
    public final z10 getKey() {
        return f1773i;
    }

    @Override // p000.jv1
    /* JADX INFO: renamed from: i */
    public final boolean mo913i() {
        return this.f1774h.f3597C;
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: k */
    public final /* bridge */ a20 mo14k(a20 a20Var) {
        return xe1.m6120f0(this, a20Var);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: o */
    public final /* bridge */ y10 mo15o(z10 z10Var) {
        return xe1.m6144u(this, z10Var);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: r */
    public final Object mo16r(mn0 mn0Var, Object obj) {
        return mn0Var.mo12g(obj, this);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: u */
    public final /* bridge */ a20 mo17u(z10 z10Var) {
        return xe1.m6105W(this, z10Var);
    }
}
