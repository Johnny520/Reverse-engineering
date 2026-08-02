package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x31 implements w41 {
    public static final x31 a = new x31();
    public static final g32 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f32 f32Var = f32.o;
        if (pv2.s0("kotlinx.serialization.json.JsonLiteral")) {
            s.j("Blank serial names are prohibited");
            return;
        }
        Iterator it = ((re1) h32.a.values()).iterator();
        while (((ne1) it).hasNext()) {
            w41 w41Var = (w41) ((ne1) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(w41Var.e().b())) {
                s.j(qv2.S("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + d72.a(w41Var.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        b = new g32("kotlinx.serialization.json.JsonLiteral", f32Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        cv2 cv2VarO = rg3.o(y40Var);
        j31 j31VarR0 = cv2VarO.r0();
        if (j31VarR0 instanceof w31) {
            return (w31) j31VarR0;
        }
        throw new h31(p7.s(-1, "Unexpected JSON element, expected JsonLiteral, had " + d72.a(j31VarR0.getClass()), null, null, cv2VarO.s0().a.h ? p7.E(j31VarR0.toString(), -1).toString() : null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        w31 w31Var = (w31) obj;
        w31Var.getClass();
        String str = w31Var.i;
        rg3.m(ve0Var);
        if (w31Var.h) {
            ve0Var.p(str);
            return;
        }
        Long lF0 = wv2.f0(str);
        if (lF0 != null) {
            ve0Var.n(lF0.longValue());
            return;
        }
        i73 i73VarC = rd3.c(str);
        if (i73VarC != null) {
            ve0Var.k(m73.b).n(i73VarC.h);
            return;
        }
        Double dV = vv2.V(str);
        if (dV != null) {
            ve0Var.f(dV.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            ve0Var.j(bool.booleanValue());
        } else {
            ve0Var.p(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return b;
    }
}
