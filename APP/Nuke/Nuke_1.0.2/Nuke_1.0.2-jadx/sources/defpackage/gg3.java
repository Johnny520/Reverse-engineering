package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gg3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yo2 a(yo2 yo2Var, i51 i51Var) {
        yo2Var.getClass();
        i51Var.getClass();
        if (!t11.l(yo2Var.c(), bp2.g)) {
            return yo2Var.f() ? a(yo2Var.j(0), i51Var) : yo2Var;
        }
        tp0.w(yo2Var);
        return yo2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!e(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !e(b3) && !e(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        s.j("Invalid UTF-8");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (e(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || e(b3)))) {
            s.j("Invalid UTF-8");
        } else {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            s.j("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (e(b2)) {
            s.j("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean e(byte b) {
        return b > -65;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final fg3 f(u21 u21Var, yo2 yo2Var) {
        yo2Var.getClass();
        s11 s11VarC = yo2Var.c();
        if (s11VarC instanceof x12) {
            return fg3.m;
        }
        if (t11.l(s11VarC, yv2.h)) {
            return fg3.k;
        }
        if (!t11.l(s11VarC, yv2.i)) {
            return fg3.j;
        }
        yo2 yo2VarA = a(yo2Var.j(0), u21Var.b);
        s11 s11VarC2 = yo2VarA.c();
        if ((s11VarC2 instanceof f32) || t11.l(s11VarC2, cp2.g)) {
            return fg3.l;
        }
        throw p7.c(yo2VarA);
    }
}
