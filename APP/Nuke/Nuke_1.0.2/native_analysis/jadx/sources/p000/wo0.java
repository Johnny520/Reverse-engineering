package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo0 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12597h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f12598i;

    public /* synthetic */ wo0(in0 in0Var, int i) {
        this.f12597h = i;
        this.f12598i = in0Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f12597h;
        in0 in0Var = this.f12598i;
        switch (i) {
            case 0:
                d43 d43Var = (d43) obj;
                if (!(d43Var instanceof vo0)) {
                    C0676s.m4653l("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) in0Var.mo5j(((vo0) d43Var).f12087v);
                bool.getClass();
                return bool;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                in0Var.mo5j(l31.m2793a(bool2));
                return a83.f116a;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                in0Var.mo5j(l31.m2793a(bool3));
                return a83.f116a;
            case 3:
                jf2 jf2Var = (jf2) obj;
                jf2Var.getClass();
                in0Var.mo5j(jf2Var.f5016a);
                return a83.f116a;
            case 4:
                vr2 vr2Var = (vr2) in0Var.mo5j((bs2) obj);
                synchronized (ds2.f2181c) {
                    ds2.f2182d = ds2.f2182d.m588e(vr2Var.mo79g());
                }
                return vr2Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return in0Var.mo5j(l);
        }
    }
}
