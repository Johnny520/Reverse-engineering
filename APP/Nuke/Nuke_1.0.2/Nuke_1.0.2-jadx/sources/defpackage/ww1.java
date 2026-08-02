package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ww1 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        q13[] q13VarArr = p13.b;
        a = p13.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final vw1 a(vw1 vw1Var, int i, int i2, long j, n03 n03Var, k02 k02Var, ya1 ya1Var, int i3, int i4, d13 d13Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        n03 n03Var2 = n03Var;
        k02 k02Var2 = k02Var;
        ya1 ya1Var2 = ya1Var;
        int i7 = i3;
        int i8 = i4;
        d13 d13Var2 = d13Var;
        if (i5 == 0 || i5 == vw1Var.a) {
            q13[] q13VarArr = p13.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (p13.a(j3, vw1Var.c)) {
                }
            }
            if ((n03Var2 == null || n03Var2.equals(vw1Var.d)) && ((i6 == 0 || i6 == vw1Var.b) && ((k02Var2 == null || k02Var2.equals(vw1Var.e)) && ((ya1Var2 == null || ya1Var2.equals(vw1Var.f)) && ((i7 == 0 || i7 == vw1Var.g) && ((i8 == 0 || i8 == vw1Var.h) && (d13Var2 == null || d13Var2.equals(vw1Var.i)))))))) {
                return vw1Var;
            }
        } else {
            j2 = 0;
        }
        q13[] q13VarArr2 = p13.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = vw1Var.c;
        }
        if (n03Var2 == null) {
            n03Var2 = vw1Var.d;
        }
        if (i5 == 0) {
            i5 = vw1Var.a;
        }
        if (i6 == 0) {
            i6 = vw1Var.b;
        }
        k02 k02Var3 = vw1Var.e;
        if (k02Var3 != null && k02Var2 == null) {
            k02Var2 = k02Var3;
        }
        if (ya1Var2 == null) {
            ya1Var2 = vw1Var.f;
        }
        if (i7 == 0) {
            i7 = vw1Var.g;
        }
        if (i8 == 0) {
            i8 = vw1Var.h;
        }
        if (d13Var2 == null) {
            d13Var2 = vw1Var.i;
        }
        return new vw1(i5, i6, j3, n03Var2, k02Var2, ya1Var2, i7, i8, d13Var2);
    }
}
