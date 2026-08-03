package p009E0;

/* JADX INFO: renamed from: E0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0167A extends AbstractC0171b {

    /* JADX INFO: renamed from: c */
    public int f363c;

    /* JADX INFO: renamed from: d */
    public int f364d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0168B f365e;

    public C0167A(C0168B r2) {
        this.f365e = r2;
        this.f363c = r2.mo516a();
        this.f364d = r2.f368c;
    }

    @Override // p009E0.AbstractC0171b
    /* JADX INFO: renamed from: a */
    public final void mo515a() {
        int r02 = this.f363c;
        if (r02 != 0) goto L5;
        this.f382a = 2;
        return;
    L5:
        C0168B r1 = this.f365e;
        Object[] r2 = r1.f366a;
        int r3 = this.f364d;
        this.f383b = r2[r3];
        this.f382a = 1;
        this.f364d = (r3 + 1) % r1.f367b;
        this.f363c = r02 - 1;
    }
}
