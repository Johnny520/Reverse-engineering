package p000a;

/* JADX INFO: renamed from: a.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0926y0 extends AbstractC0859u9 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0417X1 f3536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0926y0(AbstractC0417X1 abstractC0417X1, int i) {
        super(0);
        this.f3535b = i;
        this.f3536c = abstractC0417X1;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        switch (this.f3535b) {
            case 0:
                return new C0420X4(((C0907x0) this.f3536c).f3509b);
            case 1:
                return new C0420X4(((C0492b3) this.f3536c).f1827c);
            default:
                return new C0570f5(((C0690lb) this.f3536c).f2557d);
        }
    }
}
