package p000;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Trace;
import android.text.Spanned;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g60 {

    /* JADX INFO: renamed from: a */
    public static r00 f1869a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0951y5 m1202a(String str, s71 s71Var, long j, C1009zm c1009zm, InterfaceC0369jv interfaceC0369jv, int i) {
        C0294hs c0294hs = C0294hs.f2354d;
        return new C0951y5(new C0080c6(str, s71Var, c0294hs, c0294hs, interfaceC0369jv, c1009zm), i, 1, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m1203b(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final od0 m1204c(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new od0(matcher, charSequence);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m1205d(wq0 wq0Var, boolean z, C0190ez[] c0190ezArr, float f) {
        float f2 = Float.NaN;
        for (C0190ez c0190ez : c0190ezArr) {
            float fMo5021d = wq0Var.mo5021d(c0190ez);
            if (Float.isNaN(f2)) {
                f2 = fMo5021d;
            } else if (z == (fMo5021d > f2)) {
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m1206e(tg0 tg0Var, int i) {
        if (tg0Var.f6001b == 0 || !(tg0Var.m4199b(0) == i || tg0Var.m4199b(tg0Var.f6001b - 1) == i)) {
            int i2 = tg0Var.f6001b;
            tg0Var.m4198a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iM4199b = tg0Var.m4199b(i3);
                if (i <= iM4199b) {
                    break;
                }
                tg0Var.m4201d(i2, iM4199b);
                i2 = i3;
            }
            tg0Var.m4201d(i2, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m1207f(qc1 qc1Var, kx0 kx0Var, s90 s90Var) {
        AutoCloseable autoCloseable;
        kx0Var.getClass();
        s90Var.getClass();
        rc1 rc1Var = qc1Var.f5119a;
        if (rc1Var != null) {
            synchronized (rc1Var.f5353a) {
                autoCloseable = (AutoCloseable) rc1Var.f5354b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        ex0 ex0Var = (ex0) autoCloseable;
        if (ex0Var == null || ex0Var.f1544f) {
            return;
        }
        ex0Var.m975d(s90Var, kx0Var);
        r90 r90Var = ((z90) s90Var).f7841c;
        if (r90Var == r90.f5333e || r90Var.compareTo(r90.f5335g) >= 0) {
            kx0Var.m1963d();
        } else {
            s90Var.mo4014a(new C0251gm(s90Var, kx0Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m1208g(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final int m1209h(long j, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static oh0 m1210i() {
        return new gp0(na1.f4229a, C0496n2.f4133M);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final float m1211j(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final int m1212k(int i, o70 o70Var, Object obj) {
        int iMo2795e;
        return (obj == null || o70Var.mo2791a() == 0 || (i < o70Var.mo2791a() && obj.equals(o70Var.mo2793c(i))) || (iMo2795e = o70Var.mo2795e(obj)) == -1) ? i : iMo2795e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final nz0 m1213l(Object obj) {
        if (obj != AbstractC0398kl.f3199j) {
            return (nz0) obj;
        }
        C0921xc.m5134o("Does not contain segment");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final boolean m1214m(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final boolean m1215n(Object obj) {
        return obj == AbstractC0398kl.f3199j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m1216o(float f, float f2, C0118d6 c0118d6) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        C0118d6 c0118d6M1030a = AbstractC0198f6.m1030a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            AbstractC0198f6.m1031b("Invalid rectangle, make sure no value is NaN");
        }
        if (c0118d6M1030a.f974b == null) {
            c0118d6M1030a.f974b = new RectF();
        }
        RectF rectF = c0118d6M1030a.f974b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = c0118d6M1030a.f973a;
        RectF rectF2 = c0118d6M1030a.f974b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        C0118d6 c0118d6M1030a2 = AbstractC0198f6.m1030a();
        c0118d6M1030a2.m637d(c0118d6, c0118d6M1030a, 1);
        boolean zIsEmpty = c0118d6M1030a2.f973a.isEmpty();
        c0118d6M1030a2.m638e();
        c0118d6M1030a.m638e();
        return !zIsEmpty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m1217p(b60 b60Var) {
        if (b60Var.f413l == null) {
            return false;
        }
        b60 b60VarM315v = b60Var.m315v();
        return (b60VarM315v != null ? b60VarM315v.f413l : null) == null || b60Var.f396J.f1593b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final boolean m1218q(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final long m1219r(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : C0207ff.m1093b(C0207ff.m1095d(j) * f, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final Object m1220s(gy0 gy0Var, gy0 gy0Var2, InterfaceC0904ww interfaceC0904ww) throws Throwable {
        Object c0688rg;
        Object objM1627T;
        try {
            s91.m4048m(2, interfaceC0904ww);
            c0688rg = interfaceC0904ww.invoke(gy0Var2, gy0Var);
        } catch (Throwable th) {
            c0688rg = new C0688rg(th, false);
        }
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (c0688rg == enumC1007zk || (objM1627T = gy0Var.m1627T(c0688rg)) == s91.f5711m) {
            return enumC1007zk;
        }
        if (objM1627T instanceof C0688rg) {
            throw ((C0688rg) objM1627T).f5416a;
        }
        return s91.m4034U(objM1627T);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final int m1221t(tg0 tg0Var) {
        int iM4199b;
        int i = tg0Var.f6001b;
        int iM4199b2 = tg0Var.m4199b(0);
        while (tg0Var.f6001b != 0 && tg0Var.m4199b(0) == iM4199b2) {
            int i2 = tg0Var.f6001b;
            if (i2 == 0) {
                throw new NoSuchElementException("IntList is empty.");
            }
            tg0Var.m4201d(0, tg0Var.f6000a[i2 - 1]);
            tg0Var.m4200c(tg0Var.f6001b - 1);
            int i3 = tg0Var.f6001b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iM4199b3 = tg0Var.m4199b(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iM4199b4 = tg0Var.m4199b(i7);
                if (i6 >= i3 || (iM4199b = tg0Var.m4199b(i6)) <= iM4199b4) {
                    if (iM4199b4 > iM4199b3) {
                        tg0Var.m4201d(i5, iM4199b4);
                        tg0Var.m4201d(i7, iM4199b3);
                        i5 = i7;
                    }
                } else if (iM4199b > iM4199b3) {
                    tg0Var.m4201d(i5, iM4199b);
                    tg0Var.m4201d(i6, iM4199b3);
                    i5 = i6;
                }
            }
        }
        return iM4199b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final o31 m1222u(eg0 eg0Var, InterfaceC0356ji interfaceC0356ji) {
        dg0 dg0Var = (dg0) ((C0616pi) interfaceC0356ji).m3112j(qd0.f5125a);
        int iOrdinal = eg0Var.ordinal();
        if (iOrdinal == 0) {
            dg0Var.getClass();
            o31 o31Var = dg0.f1098b;
            o31Var.getClass();
            return o31Var;
        }
        if (iOrdinal == 1) {
            dg0Var.getClass();
            o31 o31Var2 = dg0.f1099c;
            o31Var2.getClass();
            return o31Var2;
        }
        if (iOrdinal == 2) {
            dg0Var.getClass();
            o31 o31Var3 = dg0.f1100d;
            o31Var3.getClass();
            return o31Var3;
        }
        if (iOrdinal == 3) {
            dg0Var.getClass();
            o31 o31Var4 = dg0.f1101e;
            o31Var4.getClass();
            return o31Var4;
        }
        if (iOrdinal == 4) {
            dg0Var.getClass();
            o31 o31Var5 = dg0.f1102f;
            o31Var5.getClass();
            return o31Var5;
        }
        if (iOrdinal != 5) {
            C0921xc.m5129j();
            return null;
        }
        dg0Var.getClass();
        o31 o31Var6 = dg0.f1103g;
        o31Var6.getClass();
        return o31Var6;
    }
}
