package p000;

/* JADX INFO: renamed from: qg */
/* JADX INFO: loaded from: classes.dex */
public final class C2416qg extends AbstractRunnableC2459rg {

    /* JADX INFO: renamed from: c */
    public final C0523M6 f8474c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC2545tg f8475d;

    public C2416qg(AbstractC2545tg abstractC2545tg, long j, C0523M6 c0523m6) {
        this.f8475d = abstractC2545tg;
        this.f8666a = j;
        this.f8667b = -1;
        this.f8474c = c0523m6;
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
