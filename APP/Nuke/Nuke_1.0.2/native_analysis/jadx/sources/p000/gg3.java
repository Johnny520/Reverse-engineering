package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gg3 {
    /* JADX INFO: renamed from: a */
    public static final yo2 m1910a(yo2 yo2Var, i51 i51Var) {
        yo2Var.getClass();
        i51Var.getClass();
        if (!t11.m5086l(yo2Var.mo251c(), bp2.f982g)) {
            return yo2Var.mo362f() ? m1910a(yo2Var.mo256j(0), i51Var) : yo2Var;
        }
        tp0.m5373w(yo2Var);
        return yo2Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m1911b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m1914e(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m1914e(b3) && !m1914e(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        C0676s.m4651j("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: c */
    public static void m1912c(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m1914e(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m1914e(b3)))) {
            C0676s.m4651j("Invalid UTF-8");
        } else {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1913d(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            C0676s.m4651j("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (m1914e(b2)) {
            C0676s.m4651j("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1914e(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: f */
    public static final fg3 m1915f(u21 u21Var, yo2 yo2Var) {
        yo2Var.getClass();
        s11 s11VarMo251c = yo2Var.mo251c();
        if (s11VarMo251c instanceof x12) {
            return fg3.f2993m;
        }
        if (t11.m5086l(s11VarMo251c, yv2.f13633h)) {
            return fg3.f2991k;
        }
        if (!t11.m5086l(s11VarMo251c, yv2.f13634i)) {
            return fg3.f2990j;
        }
        yo2 yo2VarM1910a = m1910a(yo2Var.mo256j(0), u21Var.f11073b);
        s11 s11VarMo251c2 = yo2VarM1910a.mo251c();
        if ((s11VarMo251c2 instanceof f32) || t11.m5086l(s11VarMo251c2, cp2.f1664g)) {
            return fg3.f2992l;
        }
        throw AbstractC0570p7.m3767c(yo2VarM1910a);
    }
}
