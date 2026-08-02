package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l93 {
    public static final ko a = new ko(0, 0, ts1.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final q33 a(wb3 wb3Var, sd sdVar) {
        q33 q33VarA = wb3Var.a(sdVar);
        int length = sdVar.i.length();
        sd sdVar2 = q33VarA.a;
        us1 us1Var = q33VarA.b;
        int length2 = sdVar2.i.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(us1Var.p(i), length2, i);
        }
        b(us1Var.p(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(us1Var.n(i2), length, i2);
        }
        c(us1Var.n(length2), length, length2);
        return new q33(sdVar2, new ko(sdVar.i.length(), sdVar2.i.length(), us1Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbK = hk1.k("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, i, " -> ", " is not in range of transformed text [0, ");
        sbK.append(i2);
        sbK.append(']');
        nz0.c(sbK.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbK = hk1.k("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, i, " -> ", " is not in range of original text [0, ");
        sbK.append(i2);
        sbK.append(']');
        nz0.c(sbK.toString());
    }
}
