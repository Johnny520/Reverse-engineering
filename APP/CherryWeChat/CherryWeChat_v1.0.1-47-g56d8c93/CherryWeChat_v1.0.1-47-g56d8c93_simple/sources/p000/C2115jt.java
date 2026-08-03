package p000;

/* JADX INFO: renamed from: jt */
/* JADX INFO: loaded from: classes.dex */
public final class C2115jt extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7435b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2335ot f7436c;

    public /* synthetic */ C2115jt(C2335ot r1, int r2) {
        this.f7435b = r2;
        this.f7436c = r1;
        super(0);
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f7435b) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f7436c.m4742b();
        return C0829TC.f2620a;
    L6:
        this.f7436c.m4741a();
        return C0829TC.f2620a;
    L8:
        this.f7436c.m4742b();
        return C0829TC.f2620a;
    }
}
