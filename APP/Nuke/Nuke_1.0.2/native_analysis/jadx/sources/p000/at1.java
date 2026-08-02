package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class at1 extends u92 {

    /* JADX INFO: renamed from: j */
    public final u92 f383j;

    /* JADX INFO: renamed from: k */
    public final o52 f384k;

    /* JADX INFO: renamed from: l */
    public IOException f385l;

    public at1(u92 u92Var) {
        this.f383j = u92Var;
        this.f384k = new o52(new zs1(this, u92Var.mo275g()));
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: c */
    public final long mo273c() {
        return this.f383j.mo273c();
    }

    @Override // p000.u92, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f383j.close();
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: e */
    public final vf1 mo274e() {
        return this.f383j.mo274e();
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: g */
    public final InterfaceC0549on mo275g() {
        return this.f384k;
    }
}
