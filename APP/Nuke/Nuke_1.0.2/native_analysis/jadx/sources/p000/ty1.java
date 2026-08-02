package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 implements a82 {

    /* JADX INFO: renamed from: h */
    public final Set f11001h;

    /* JADX INFO: renamed from: i */
    public final zk1 f11002i = new zk1(new lo0[16]);

    public ty1(Set set) {
        this.f11001h = set;
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
        zk1 zk1Var = this.f11002i;
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            a82 a82Var = ((lo0) objArr[i2]).f6226a;
            this.f11001h.remove(a82Var);
            a82Var.mo109a();
        }
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: d */
    public final void mo110d() {
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: f */
    public final void mo111f() {
    }
}
