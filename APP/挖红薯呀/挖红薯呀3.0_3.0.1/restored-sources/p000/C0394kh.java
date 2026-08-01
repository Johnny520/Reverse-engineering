package p000;

/* JADX INFO: renamed from: kh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0394kh implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3145d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3146e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3147f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f3148g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3149h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0394kh(C0474mh c0474mh, Object obj, Object obj2, int i) {
        this.f3145d = 0;
        this.f3149h = c0474mh;
        this.f3146e = obj;
        this.f3148g = obj2;
        this.f3147f = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3145d;
        int i2 = this.f3147f;
        Object obj3 = this.f3146e;
        Object obj4 = this.f3148g;
        na1 na1Var = na1.f4229a;
        Object obj5 = this.f3149h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0474mh) obj5).m2594e(obj3, obj4, (InterfaceC0356ji) obj, j50.m1649A(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM1649A = j50.m1649A(1);
                v50.m4399c((o70) obj5, this.f3146e, this.f3147f, this.f3148g, (InterfaceC0356ji) obj, iM1649A);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((f90) obj4).mo1070e(obj3, (C0474mh) obj5, (InterfaceC0356ji) obj, j50.m1649A(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((yw0) obj4).mo1070e(obj3, (C0474mh) obj5, (InterfaceC0356ji) obj, j50.m1649A(i2 | 1));
                break;
        }
        return na1Var;
    }

    public /* synthetic */ C0394kh(o70 o70Var, Object obj, int i, Object obj2, int i2) {
        this.f3145d = 1;
        this.f3149h = o70Var;
        this.f3146e = obj;
        this.f3147f = i;
        this.f3148g = obj2;
    }

    public /* synthetic */ C0394kh(ww0 ww0Var, Object obj, C0474mh c0474mh, int i, int i2) {
        this.f3145d = i2;
        this.f3148g = ww0Var;
        this.f3146e = obj;
        this.f3149h = c0474mh;
        this.f3147f = i;
    }
}
