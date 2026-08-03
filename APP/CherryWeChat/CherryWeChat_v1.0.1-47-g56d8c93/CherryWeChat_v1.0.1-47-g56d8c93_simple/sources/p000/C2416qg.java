package p000;

/* JADX INFO: renamed from: qg */
/* JADX INFO: loaded from: classes.dex */
public final class C2416qg extends AbstractRunnableC2459rg {

    /* JADX INFO: renamed from: c */
    public final C0523M6 f8474c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC2545tg f8475d;

    public C2416qg(AbstractC2545tg r1, long r2, C0523M6 r4) {
        this.f8475d = r1;
        this.f8666a = r2;
        this.f8667b = -1;
        this.f8474c = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8474c.m1022r(this.f8475d);
    }

    @Override // p000.AbstractRunnableC2459rg
    public final String toString() {
        return super.toString() + this.f8474c;
    }
}
