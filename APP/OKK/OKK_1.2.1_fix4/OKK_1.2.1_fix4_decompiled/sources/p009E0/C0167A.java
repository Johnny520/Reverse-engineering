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

    public C0167A(C0168B c0168b) {
        this.f365e = c0168b;
        this.f363c = c0168b.mo516a();
        this.f364d = c0168b.f368c;
    }

    @Override // p009E0.AbstractC0171b
    /* JADX INFO: renamed from: a */
    public final void mo515a() {
        int i2 = this.f363c;
        if (i2 == 0) {
            this.f382a = 2;
            return;
        }
        C0168B c0168b = this.f365e;
        Object[] objArr = c0168b.f366a;
        int i3 = this.f364d;
        this.f383b = objArr[i3];
        this.f382a = 1;
        this.f364d = (i3 + 1) % c0168b.f367b;
        this.f363c = i2 - 1;
    }
}
