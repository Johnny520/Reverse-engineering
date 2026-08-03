package p000;

/* JADX INFO: renamed from: jt */
/* JADX INFO: loaded from: classes.dex */
public final class C2115jt extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7435b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2335ot f7436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2115jt(C2335ot c2335ot, int i) {
        super(0);
        this.f7435b = i;
        this.f7436c = c2335ot;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f7435b) {
            case 0:
                this.f7436c.m4742b();
                break;
            case 1:
                this.f7436c.m4741a();
                break;
            default:
                this.f7436c.m4742b();
                break;
        }
        return C0829TC.f2620a;
    }
}
