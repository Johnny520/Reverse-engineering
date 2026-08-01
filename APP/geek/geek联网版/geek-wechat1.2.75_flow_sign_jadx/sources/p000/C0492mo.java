package p000;

/* JADX INFO: renamed from: mo */
/* JADX INFO: loaded from: classes.dex */
public final class C0492mo extends AbstractC0270gq implements InterfaceC0786um {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0529no f3161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RunnableC0282h1 f3162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0492mo(C0529no c0529no, RunnableC0282h1 runnableC0282h1) {
        super(1);
        this.f3161b = c0529no;
        this.f3162c = runnableC0282h1;
    }

    @Override // p000.InterfaceC0786um
    /* JADX INFO: renamed from: f */
    public final Object mo26f(Object obj) {
        this.f3161b.f3324c.removeCallbacks(this.f3162c);
        return C0893xh.f5258n;
    }
}
