package p000;

/* JADX INFO: renamed from: l4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0418l4 extends c50 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3337d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3338e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3339f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0904ww f3340g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0418l4(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, C0753t6 c0753t6, InterfaceC0904ww interfaceC0904ww) {
        super(2);
        this.f3337d = 0;
        this.f3338e = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        this.f3339f = c0753t6;
        this.f3340g = interfaceC0904ww;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3337d;
        na1 na1Var = na1.f4229a;
        InterfaceC0904ww interfaceC0904ww = this.f3340g;
        Object obj3 = this.f3339f;
        Object obj4 = this.f3338e;
        switch (i) {
            case 0:
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0616pi.m3085R();
                } else {
                    AbstractC0131dj.m715a((ViewTreeObserverOnGlobalLayoutListenerC0875w3) obj4, (C0753t6) obj3, interfaceC0904ww, c0616pi, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC0307i4.m1529e((InterfaceC0298hw) obj4, (C0932xn) obj3, (C0474mh) interfaceC0904ww, (InterfaceC0356ji) obj, j50.m1649A(385));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC0131dj.m715a((dn0) obj4, (C0753t6) obj3, interfaceC0904ww, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
        }
        return na1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0418l4(Object obj, Object obj2, InterfaceC0904ww interfaceC0904ww, int i, int i2) {
        super(2);
        this.f3337d = i2;
        this.f3338e = obj;
        this.f3339f = obj2;
        this.f3340g = interfaceC0904ww;
    }
}
