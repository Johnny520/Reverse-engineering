package p000;

/* JADX INFO: renamed from: B9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0053B9 extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: c */
    public static final C0053B9 f116c;

    /* JADX INFO: renamed from: d */
    public static final C0053B9 f117d;

    /* JADX INFO: renamed from: e */
    public static final C0053B9 f118e;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f119b;

    static {
        int i = 1;
        f116c = new C0053B9(i, 0);
        f117d = new C0053B9(i, 1);
        f118e = new C0053B9(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0053B9(int i, int i2) {
        super(i);
        this.f119b = i2;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        switch (this.f119b) {
            case 0:
                return ((C0096C9) obj).m144g().f249a;
            case 1:
                return AbstractC0235Fd.m481d((String) obj);
            default:
                return AbstractC0235Fd.m480c((Class) obj);
        }
    }
}
