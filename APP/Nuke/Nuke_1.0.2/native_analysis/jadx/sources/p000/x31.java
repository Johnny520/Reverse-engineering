package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x31 implements w41 {

    /* JADX INFO: renamed from: a */
    public static final x31 f12795a = new x31();

    /* JADX INFO: renamed from: b */
    public static final g32 f12796b;

    static {
        f32 f32Var = f32.f2770o;
        if (pv2.m4006s0("kotlinx.serialization.json.JsonLiteral")) {
            C0676s.m4651j("Blank serial names are prohibited");
            return;
        }
        Iterator it = ((re1) h32.f3811a.values()).iterator();
        while (((ne1) it).hasNext()) {
            w41 w41Var = (w41) ((ne1) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(w41Var.mo168e().mo250b())) {
                C0676s.m4651j(qv2.m4289S("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + d72.m967a(w41Var.getClass()).m591c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        f12796b = new g32("kotlinx.serialization.json.JsonLiteral", f32Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        cv2 cv2VarM4479o = rg3.m4479o(y40Var);
        j31 j31VarM904r0 = cv2VarM4479o.m904r0();
        if (j31VarM904r0 instanceof w31) {
            return (w31) j31VarM904r0;
        }
        throw new h31(AbstractC0570p7.m3783s(-1, "Unexpected JSON element, expected JsonLiteral, had " + d72.m967a(j31VarM904r0.getClass()), null, null, cv2VarM4479o.m906s0().f11072a.f2761h ? AbstractC0570p7.m3749E(j31VarM904r0.toString(), -1).toString() : null));
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        w31 w31Var = (w31) obj;
        w31Var.getClass();
        String str = w31Var.f12293i;
        rg3.m4477m(ve0Var);
        if (w31Var.f12292h) {
            ve0Var.mo1191p(str);
            return;
        }
        Long lM6014f0 = wv2.m6014f0(str);
        if (lM6014f0 != null) {
            ve0Var.mo1189n(lM6014f0.longValue());
            return;
        }
        i73 i73VarM4436c = rd3.m4436c(str);
        if (i73VarM4436c != null) {
            ve0Var.mo1186k(m73.f6504b).mo1189n(i73VarM4436c.f4479h);
            return;
        }
        Double dM5802V = vv2.m5802V(str);
        if (dM5802V != null) {
            ve0Var.mo1181f(dM5802V.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            ve0Var.mo1185j(bool.booleanValue());
        } else {
            ve0Var.mo1191p(str);
        }
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return f12796b;
    }
}
