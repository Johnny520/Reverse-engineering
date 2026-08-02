package p000;

/* JADX INFO: renamed from: wa */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0840wa implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12438h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f12439i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f12440j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f12441k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f12442l;

    public /* synthetic */ C0840wa(xm0 xm0Var, boolean z, C0122d9 c0122d9, C0095cl c0095cl) {
        this.f12440j = xm0Var;
        this.f12439i = z;
        this.f12441k = c0122d9;
        this.f12442l = c0095cl;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f12438h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f12442l;
        Object obj3 = this.f12441k;
        Object obj4 = this.f12440j;
        boolean z = this.f12439i;
        switch (i) {
            case 0:
                C0122d9 c0122d9 = (C0122d9) obj3;
                C0095cl c0095cl = (C0095cl) obj2;
                t61 t61Var = (t61) obj;
                t61Var.m5125a();
                C0702sp c0702sp = t61Var.f10581h;
                if (((Boolean) ((xm0) obj4).mo6a()).booleanValue()) {
                    if (z) {
                        long jMo3278a0 = c0702sp.mo3278a0();
                        C0043b5 c0043b5 = c0702sp.f10257i;
                        long jM434u = c0043b5.m434u();
                        c0043b5.m430q().mo1522l();
                        try {
                            ((C0485n4) c0043b5.f562i).m3234A(-1.0f, 1.0f, jMo3278a0);
                            c0702sp.m4903e(c0122d9, c0095cl);
                        } finally {
                            vi0.m5699r(c0043b5, jM434u);
                        }
                    } else {
                        c0702sp.m4903e(c0122d9, c0095cl);
                    }
                }
                return a83Var;
            default:
                ca2 ca2Var = (ca2) obj;
                ca2Var.getClass();
                ca2Var.m719c(((Number) ((gu2) obj4).getValue()).floatValue());
                ca2Var.m726k(((Number) ((gu2) obj3).getValue()).floatValue());
                ca2Var.m727l(((Number) ((gu2) obj2).getValue()).floatValue());
                ca2Var.m731r(rb3.m4426a(0.82f, z ? 1.0f : 0.0f));
                return a83Var;
        }
    }

    public /* synthetic */ C0840wa(boolean z, gu2 gu2Var, gu2 gu2Var2, gu2 gu2Var3) {
        this.f12439i = z;
        this.f12440j = gu2Var;
        this.f12441k = gu2Var2;
        this.f12442l = gu2Var3;
    }
}
