package p000;

/* JADX INFO: renamed from: y6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0952y6 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7547d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f7548e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f7549f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f7550g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f7551h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0952y6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f7547d = i;
        this.f7548e = obj;
        this.f7549f = obj2;
        this.f7550g = obj3;
        this.f7551h = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    @Override // p000.InterfaceC0742sw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.f7547d;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f7551h;
        Object obj3 = this.f7550g;
        Object obj4 = this.f7549f;
        Object obj5 = this.f7548e;
        switch (i) {
            case 0:
                C0045b7 c0045b7 = (C0045b7) obj5;
                C0879w7 c0879w7 = (C0879w7) obj4;
                InterfaceC0742sw interfaceC0742sw = (InterfaceC0742sw) obj3;
                vt0 vt0Var = (vt0) obj2;
                C0793u7 c0793u7 = (C0793u7) obj;
                z60.m5430Q(c0793u7, c0045b7.f432c);
                gp0 gp0Var = c0793u7.f6150e;
                Object objM320a = C0045b7.m320a(c0045b7, gp0Var.getValue());
                if (!p30.m3002l(objM320a, gp0Var.getValue())) {
                    c0045b7.f432c.f7016e.setValue(objM320a);
                    c0879w7.f7016e.setValue(objM320a);
                    if (interfaceC0742sw != null) {
                        interfaceC0742sw.invoke(c0045b7);
                    }
                    c0793u7.m4285a();
                    vt0Var.f6825d = true;
                } else if (interfaceC0742sw != null) {
                    interfaceC0742sw.invoke(c0045b7);
                }
                return na1Var;
            case 1:
                d80 d80Var = (d80) obj5;
                d80Var.f991c = new d50((n70) obj4, (x41) obj3, (cs0) obj2);
                return new C0379k4(3, d80Var);
            default:
                wt0 wt0Var = (wt0) obj5;
                C0215fn c0215fn = (C0215fn) obj4;
                jz0 jz0Var = (jz0) obj3;
                hg0 hg0Var = (hg0) obj2;
                C0793u7 c0793u72 = (C0793u7) obj;
                float fFloatValue = ((Number) c0793u72.f6150e.getValue()).floatValue() - wt0Var.f7189d;
                if (r60.m3403e(fFloatValue)) {
                    if (((Boolean) hg0Var.invoke(Float.valueOf(wt0Var.f7189d))).booleanValue()) {
                        c0793u72.m4285a();
                    }
                } else if (r60.m3403e(fFloatValue - c0215fn.m1166c(jz0Var, fFloatValue))) {
                    wt0Var.f7189d += fFloatValue;
                    if (((Boolean) hg0Var.invoke(Float.valueOf(wt0Var.f7189d))).booleanValue()) {
                    }
                } else {
                    c0793u72.m4285a();
                }
                return na1Var;
        }
    }
}
