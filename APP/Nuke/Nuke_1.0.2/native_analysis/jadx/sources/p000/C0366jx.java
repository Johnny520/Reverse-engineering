package p000;

/* JADX INFO: renamed from: jx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0366jx extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5250i = 0;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0440lx f5251j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0045b7 f5252k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ mn0 f5253l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0366jx(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, C0440lx c0440lx, mn0 mn0Var) {
        super(2);
        this.f5252k = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f5251j = c0440lx;
        this.f5253l = mn0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f5250i;
        a83 a83Var = a83.f116a;
        mn0 mn0Var = this.f5253l;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f5252k;
        C0440lx c0440lx = this.f5251j;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Number) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    go0Var.m1966W(866651995);
                    AbstractC0441ly.m2986a(viewTreeObserverOnGlobalLayoutListenerC0045b7, c0440lx.f6358k, mn0Var, go0Var, 0);
                    go0Var.m1994p(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                c0440lx.m2980a(viewTreeObserverOnGlobalLayoutListenerC0045b7, mn0Var, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0366jx(C0440lx c0440lx, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, mn0 mn0Var, int i) {
        super(2);
        this.f5251j = c0440lx;
        this.f5252k = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f5253l = mn0Var;
    }
}
