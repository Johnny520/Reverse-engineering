package p000;

/* JADX INFO: renamed from: io */
/* JADX INFO: loaded from: classes.dex */
public final class C0341io extends AbstractC0123cq implements InterfaceC0713sm {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0381jo f2459b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RunnableC0282h1 f2460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0341io(C0381jo c0381jo, RunnableC0282h1 runnableC0282h1) {
        super(1);
        this.f2459b = c0381jo;
        this.f2460c = runnableC0282h1;
    }

    @Override // p000.InterfaceC0713sm
    /* JADX INFO: renamed from: f */
    public final Object mo96f(Object obj) {
        this.f2459b.f2651c.removeCallbacks(this.f2460c);
        return C0819vh.f4855n;
    }
}
