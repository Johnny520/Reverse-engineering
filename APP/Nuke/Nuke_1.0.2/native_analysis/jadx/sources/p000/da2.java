package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class da2 implements jb2 {

    /* JADX INFO: renamed from: a */
    public final t52 f1949a;

    public da2(t52 t52Var) {
        t52Var.getClass();
        this.f1949a = t52Var;
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: a */
    public final jb2 mo979a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: c */
    public final ib2 mo980c() {
        throw new IllegalStateException("already connected");
    }

    @Override // p000.jb2
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: d */
    public final t52 mo981d() {
        return this.f1949a;
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: e */
    public final boolean mo982e() {
        return true;
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: g */
    public final ib2 mo983g() {
        throw new IllegalStateException("already connected");
    }
}
