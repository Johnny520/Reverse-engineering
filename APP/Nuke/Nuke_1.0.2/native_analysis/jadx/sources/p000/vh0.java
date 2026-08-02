package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vh0 implements jb2 {

    /* JADX INFO: renamed from: a */
    public final ib2 f11964a;

    public vh0(Throwable th) {
        this.f11964a = new ib2(this, th, 2);
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: a */
    public final jb2 mo979a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: c */
    public final ib2 mo980c() {
        return this.f11964a;
    }

    @Override // p000.jb2
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: d */
    public final t52 mo981d() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: e */
    public final boolean mo982e() {
        return false;
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: g */
    public final ib2 mo983g() {
        return this.f11964a;
    }
}
