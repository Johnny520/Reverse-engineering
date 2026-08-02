package p000;

import java.text.BreakIterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pz2 {

    /* JADX INFO: renamed from: a */
    public final C0690sd f8649a;

    /* JADX INFO: renamed from: b */
    public final long f8650b;

    /* JADX INFO: renamed from: c */
    public final y03 f8651c;

    /* JADX INFO: renamed from: d */
    public final us1 f8652d;

    /* JADX INFO: renamed from: e */
    public final e13 f8653e;

    /* JADX INFO: renamed from: f */
    public long f8654f;

    /* JADX INFO: renamed from: g */
    public final C0690sd f8655g;

    /* JADX INFO: renamed from: h */
    public final k03 f8656h;

    /* JADX INFO: renamed from: i */
    public final z03 f8657i;

    public pz2(k03 k03Var, us1 us1Var, z03 z03Var, e13 e13Var) {
        C0690sd c0690sd = k03Var.f5296a;
        long j = k03Var.f5297b;
        y03 y03Var = z03Var != null ? z03Var.f13697a : null;
        this.f8649a = c0690sd;
        this.f8650b = j;
        this.f8651c = y03Var;
        this.f8652d = us1Var;
        this.f8653e = e13Var;
        this.f8654f = j;
        this.f8655g = c0690sd;
        this.f8656h = k03Var;
        this.f8657i = z03Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m4022a(in0 in0Var) {
        if (!f13.m1494c(this.f8654f)) {
            return AbstractC0179eu.m1435P(new C0180ev("", 0), new mp2(f13.m1497f(this.f8654f), f13.m1497f(this.f8654f)));
        }
        rd0 rd0Var = (rd0) in0Var.mo5j(this);
        if (rd0Var != null) {
            return AbstractC0179eu.m1434O(rd0Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m4023b() {
        y03 y03Var = this.f8651c;
        if (y03Var == null) {
            return null;
        }
        lj1 lj1Var = y03Var.f13267b;
        int iM1496e = f13.m1496e(this.f8654f);
        us1 us1Var = this.f8652d;
        return Integer.valueOf(us1Var.mo2449n(lj1Var.m2916c(lj1Var.m2917d(us1Var.mo2451p(iM1496e)), true)));
    }

    /* JADX INFO: renamed from: c */
    public final Integer m4024c() {
        y03 y03Var = this.f8651c;
        if (y03Var == null) {
            return null;
        }
        int iM1497f = f13.m1497f(this.f8654f);
        us1 us1Var = this.f8652d;
        return Integer.valueOf(us1Var.mo2449n(y03Var.m6206f(y03Var.f13267b.m2917d(us1Var.mo2451p(iM1497f)))));
    }

    /* JADX INFO: renamed from: d */
    public final Integer m4025d() {
        int length;
        y03 y03Var = this.f8651c;
        if (y03Var == null) {
            return null;
        }
        int iM4039r = m4039r();
        while (true) {
            C0690sd c0690sd = this.f8649a;
            if (iM4039r < c0690sd.f10051i.length()) {
                int length2 = this.f8655g.f10051i.length() - 1;
                if (iM4039r <= length2) {
                    length2 = iM4039r;
                }
                long jM6209i = y03Var.m6209i(length2);
                int i = f13.f2738c;
                int i2 = (int) (jM6209i & 4294967295L);
                if (i2 > iM4039r) {
                    length = this.f8652d.mo2449n(i2);
                    break;
                }
                iM4039r++;
            } else {
                length = c0690sd.f10051i.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: e */
    public final Integer m4026e() {
        int iMo2449n;
        y03 y03Var = this.f8651c;
        if (y03Var == null) {
            return null;
        }
        int iM4039r = m4039r();
        while (true) {
            if (iM4039r <= 0) {
                iMo2449n = 0;
                break;
            }
            int length = this.f8655g.f10051i.length() - 1;
            if (iM4039r <= length) {
                length = iM4039r;
            }
            long jM6209i = y03Var.m6209i(length);
            int i = f13.f2738c;
            int i2 = (int) (jM6209i >> 32);
            if (i2 < iM4039r) {
                iMo2449n = this.f8652d.mo2449n(i2);
                break;
            }
            iM4039r--;
        }
        return Integer.valueOf(iMo2449n);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4027f() {
        y03 y03Var = this.f8651c;
        return (y03Var != null ? y03Var.m6207g(m4039r()) : null) != c92.f1252i;
    }

    /* JADX INFO: renamed from: g */
    public final int m4028g(y03 y03Var, int i) {
        int iM4039r = m4039r();
        e13 e13Var = this.f8653e;
        if (e13Var.f2295a == null) {
            e13Var.f2295a = Float.valueOf(y03Var.m6203c(iM4039r).f7536a);
        }
        lj1 lj1Var = y03Var.f13267b;
        int iM2917d = lj1Var.m2917d(iM4039r) + i;
        if (iM2917d < 0) {
            return 0;
        }
        if (iM2917d >= lj1Var.f6151f) {
            return this.f8655g.f10051i.length();
        }
        float fM2915b = lj1Var.m2915b(iM2917d) - 1.0f;
        Float f = e13Var.f2295a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((m4027f() && fFloatValue >= y03Var.m6205e(iM2917d)) || (!m4027f() && fFloatValue <= y03Var.m6204d(iM2917d))) {
            return lj1Var.m2916c(iM2917d, true);
        }
        return this.f8652d.mo2449n(lj1Var.m2920g((((long) Float.floatToRawIntBits(fM2915b)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4029h(z03 z03Var, int i) {
        o62 o62VarMo644J;
        c61 c61Var = z03Var.f13698b;
        y03 y03Var = z03Var.f13697a;
        if (c61Var == null) {
            o62VarMo644J = o62.f7535e;
        } else {
            c61 c61Var2 = z03Var.f13699c;
            o62VarMo644J = c61Var2 != null ? c61Var2.mo644J(c61Var, true) : null;
            if (o62VarMo644J == null) {
            }
        }
        long j = this.f8656h.f5297b;
        int i2 = f13.f2738c;
        us1 us1Var = this.f8652d;
        o62 o62VarM6203c = y03Var.m6203c(us1Var.mo2451p((int) (j & 4294967295L)));
        float f = o62VarM6203c.f7536a;
        return us1Var.mo2449n(y03Var.f13267b.m2920g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (o62VarMo644J.m3515c() & 4294967295L)) * i) + o62VarM6203c.f7537b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    /* JADX INFO: renamed from: i */
    public final void m4030i() {
        e13 e13Var = this.f8653e;
        e13Var.f2295a = null;
        C0690sd c0690sd = this.f8655g;
        if (c0690sd.f10051i.length() > 0) {
            if (m4027f()) {
                m4032k();
                return;
            }
            e13Var.f2295a = null;
            if (c0690sd.f10051i.length() > 0) {
                String str = c0690sd.f10051i;
                long j = this.f8654f;
                int i = f13.f2738c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j & 4294967295L));
                if (iFollowing != -1) {
                    m4038q(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4031j() {
        this.f8653e.f2295a = null;
        C0690sd c0690sd = this.f8655g;
        String str = c0690sd.f10051i;
        String str2 = c0690sd.f10051i;
        if (str.length() > 0) {
            int iM1646u = fg1.m1646u(str2, f13.m1496e(this.f8654f));
            if (iM1646u == f13.m1496e(this.f8654f) && iM1646u != str2.length()) {
                iM1646u = fg1.m1646u(str2, iM1646u + 1);
            }
            m4038q(iM1646u, iM1646u);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4032k() {
        this.f8653e.f2295a = null;
        C0690sd c0690sd = this.f8655g;
        if (c0690sd.f10051i.length() > 0) {
            String str = c0690sd.f10051i;
            long j = this.f8654f;
            int i = f13.f2738c;
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iPreceding = characterInstance.preceding((int) (j & 4294967295L));
            if (iPreceding != -1) {
                m4038q(iPreceding, iPreceding);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4033l() {
        this.f8653e.f2295a = null;
        C0690sd c0690sd = this.f8655g;
        String str = c0690sd.f10051i;
        String str2 = c0690sd.f10051i;
        if (str.length() > 0) {
            int iM1647v = fg1.m1647v(str2, f13.m1497f(this.f8654f));
            if (iM1647v == f13.m1497f(this.f8654f) && iM1647v != 0) {
                iM1647v = fg1.m1647v(str2, iM1647v - 1);
            }
            m4038q(iM1647v, iM1647v);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4034m() {
        e13 e13Var = this.f8653e;
        e13Var.f2295a = null;
        C0690sd c0690sd = this.f8655g;
        if (c0690sd.f10051i.length() > 0) {
            if (!m4027f()) {
                m4032k();
                return;
            }
            e13Var.f2295a = null;
            if (c0690sd.f10051i.length() > 0) {
                String str = c0690sd.f10051i;
                long j = this.f8654f;
                int i = f13.f2738c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j & 4294967295L));
                if (iFollowing != -1) {
                    m4038q(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4035n() {
        Integer numM4023b;
        this.f8653e.f2295a = null;
        if (this.f8655g.f10051i.length() <= 0 || (numM4023b = m4023b()) == null) {
            return;
        }
        int iIntValue = numM4023b.intValue();
        m4038q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: o */
    public final void m4036o() {
        Integer numM4024c;
        this.f8653e.f2295a = null;
        if (this.f8655g.f10051i.length() <= 0 || (numM4024c = m4024c()) == null) {
            return;
        }
        int iIntValue = numM4024c.intValue();
        m4038q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: p */
    public final void m4037p() {
        if (this.f8655g.f10051i.length() > 0) {
            int i = f13.f2738c;
            this.f8654f = fg1.m1636i((int) (this.f8650b >> 32), (int) (this.f8654f & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m4038q(int i, int i2) {
        this.f8654f = fg1.m1636i(i, i2);
    }

    /* JADX INFO: renamed from: r */
    public final int m4039r() {
        long j = this.f8654f;
        int i = f13.f2738c;
        return this.f8652d.mo2451p((int) (j & 4294967295L));
    }
}
