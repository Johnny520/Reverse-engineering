package p000;

/* JADX INFO: renamed from: B9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0053B9 extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: c */
    public static final C0053B9 f116c = null;

    /* JADX INFO: renamed from: d */
    public static final C0053B9 f117d = null;

    /* JADX INFO: renamed from: e */
    public static final C0053B9 f118e = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f119b;

    static {
        int r1 = 1;
        f116c = new C0053B9(r1, 0);
        f117d = new C0053B9(r1, 1);
        f118e = new C0053B9(r1, 2);
    }

    public /* synthetic */ C0053B9(int r1, int r2) {
        this.f119b = r2;
        super(r1);
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r2) {
        switch(this.f119b) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return AbstractC0235Fd.m480c((Class) r2);
    L7:
        return AbstractC0235Fd.m481d((String) r2);
    L9:
        return ((C0096C9) r2).m144g().f249a;
    }
}
