package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hv extends r21 implements n60 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g0(u00 u00Var) throws Throwable {
        Object obj;
        do {
            obj = r21.h.get(this);
            if (!(obj instanceof cy0)) {
                if (obj instanceof ov) {
                    throw ((ov) obj).a;
                }
                return eu.e0(obj);
            }
        } while (c0(obj) < 0);
        o21 o21Var = new o21(gf1.z(u00Var), this);
        o21Var.u();
        o21Var.x(new hp(1, xe1.H(this, true, new fa0(2, o21Var))));
        return o21Var.t();
    }
}
