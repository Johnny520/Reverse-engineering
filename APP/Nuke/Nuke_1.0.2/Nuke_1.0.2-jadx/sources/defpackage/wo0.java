package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo0 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ in0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ wo0(in0 in0Var, int i) {
        this.h = i;
        this.i = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        in0 in0Var = this.i;
        switch (i) {
            case 0:
                d43 d43Var = (d43) obj;
                if (!(d43Var instanceof vo0)) {
                    s.l("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) in0Var.j(((vo0) d43Var).v);
                bool.getClass();
                return bool;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                in0Var.j(l31.a(bool2));
                return a83.a;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                in0Var.j(l31.a(bool3));
                return a83.a;
            case 3:
                jf2 jf2Var = (jf2) obj;
                jf2Var.getClass();
                in0Var.j(jf2Var.a);
                return a83.a;
            case 4:
                vr2 vr2Var = (vr2) in0Var.j((bs2) obj);
                synchronized (ds2.c) {
                    ds2.d = ds2.d.e(vr2Var.g());
                }
                return vr2Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return in0Var.j(l);
        }
    }
}
