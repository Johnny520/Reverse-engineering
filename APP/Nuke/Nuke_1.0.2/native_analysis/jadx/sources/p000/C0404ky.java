package p000;

/* JADX INFO: renamed from: ky */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0404ky extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5843i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ mn0 f5844j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5845k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f5846l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404ky(bg3 bg3Var, C0440lx c0440lx, mn0 mn0Var) {
        super(2);
        this.f5843i = 2;
        this.f5845k = bg3Var;
        this.f5846l = c0440lx;
        this.f5844j = mn0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f5843i;
        a83 a83Var = a83.f116a;
        mn0 mn0Var = this.f5844j;
        Object obj3 = this.f5846l;
        Object obj4 = this.f5845k;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0441ly.m2986a((zv1) obj4, (C0953z8) obj3, mn0Var, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                rp0.m4530P((hw2) obj4, (uh1) obj3, mn0Var, (InterfaceC0596px) obj, pp0.m3902N(9));
                break;
            default:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Number) obj2).intValue();
                bg3 bg3Var = (bg3) obj4;
                int i3 = 0;
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = bg3Var.f848h;
                    boolean zM1984h = go0Var.m1984h(bg3Var);
                    Object objM1956L = go0Var.m1956L();
                    t00 t00Var = null;
                    C0160eb c0160eb = C0520nx.f7360a;
                    if (zM1984h || objM1956L == c0160eb) {
                        objM1956L = new ag3(bg3Var, t00Var, i3);
                        go0Var.m1981f0(objM1956L);
                    }
                    AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L, viewTreeObserverOnGlobalLayoutListenerC0045b7);
                    boolean zM1984h2 = go0Var.m1984h(bg3Var);
                    Object objM1956L2 = go0Var.m1956L();
                    if (zM1984h2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new ag3(bg3Var, t00Var, i2);
                        go0Var.m1981f0(objM1956L2);
                    }
                    AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L2, viewTreeObserverOnGlobalLayoutListenerC0045b7);
                    ((C0440lx) obj3).m2980a(viewTreeObserverOnGlobalLayoutListenerC0045b7, mn0Var, go0Var, 0);
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0404ky(Object obj, Object obj2, mn0 mn0Var, int i, int i2) {
        super(2);
        this.f5843i = i2;
        this.f5845k = obj;
        this.f5846l = obj2;
        this.f5844j = mn0Var;
    }
}
