package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k41 implements w41 {

    /* JADX INFO: renamed from: a */
    public static final k41 f5332a = new k41();

    /* JADX INFO: renamed from: b */
    public static final ap2 f5333b = up0.m5545j("kotlinx.serialization.json.JsonPrimitive", f32.f2770o, new yo2[0]);

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        cv2 cv2VarM4479o = rg3.m4479o(y40Var);
        j31 j31VarM904r0 = cv2VarM4479o.m904r0();
        if (j31VarM904r0 instanceof i41) {
            return (i41) j31VarM904r0;
        }
        throw new h31(AbstractC0570p7.m3783s(-1, "Unexpected JSON element, expected JsonPrimitive, had " + d72.m967a(j31VarM904r0.getClass()), null, null, cv2VarM4479o.m906s0().f11072a.f2761h ? AbstractC0570p7.m3749E(j31VarM904r0.toString(), -1).toString() : null));
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        i41 i41Var = (i41) obj;
        i41Var.getClass();
        rg3.m4477m(ve0Var);
        if (i41Var instanceof z31) {
            ve0Var.mo1180e(b41.f552a, z31.INSTANCE);
        } else {
            ve0Var.mo1180e(x31.f12795a, (w31) i41Var);
        }
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return f5333b;
    }
}
