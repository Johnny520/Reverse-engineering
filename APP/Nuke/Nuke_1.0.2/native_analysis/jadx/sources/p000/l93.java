package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l93 {

    /* JADX INFO: renamed from: a */
    public static final C0394ko f5995a = new C0394ko(0, 0, ts1.f10946a);

    /* JADX INFO: renamed from: a */
    public static final q33 m2887a(wb3 wb3Var, C0690sd c0690sd) {
        q33 q33VarMo5445a = wb3Var.mo5445a(c0690sd);
        int length = c0690sd.f10051i.length();
        C0690sd c0690sd2 = q33VarMo5445a.f8721a;
        us1 us1Var = q33VarMo5445a.f8722b;
        int length2 = c0690sd2.f10051i.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            m2888b(us1Var.mo2451p(i), length2, i);
        }
        m2888b(us1Var.mo2451p(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            m2889c(us1Var.mo2449n(i2), length, i2);
        }
        m2889c(us1Var.mo2449n(length2), length, length2);
        return new q33(c0690sd2, new C0394ko(c0690sd.f10051i.length(), c0690sd2.f10051i.length(), us1Var));
    }

    /* JADX INFO: renamed from: b */
    public static final void m2888b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM2212k = hk1.m2212k("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, i, " -> ", " is not in range of transformed text [0, ");
        sbM2212k.append(i2);
        sbM2212k.append(']');
        nz0.m3458c(sbM2212k.toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m2889c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM2212k = hk1.m2212k("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, i, " -> ", " is not in range of original text [0, ");
        sbM2212k.append(i2);
        sbM2212k.append(']');
        nz0.m3458c(sbM2212k.toString());
    }
}
