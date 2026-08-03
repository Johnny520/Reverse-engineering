package p100h0;

import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p020b5.C0192k;
import p057e1.C0808c;
import p085fg.InterfaceC1231l;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p190n2.C2865a;
import p190n2.C2883r;
import p190n2.C2884s;
import p190n2.InterfaceC2872g;
import p280t2.EnumC4094j;
import p308v1.InterfaceC4428t;
import p321w.AbstractC4634s;
import p321w.C4618m1;

/* JADX INFO: renamed from: h0.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1549s0 {

    /* JADX INFO: renamed from: a */
    public final C1926g f5165a;

    /* JADX INFO: renamed from: b */
    public final long f5166b;

    /* JADX INFO: renamed from: c */
    public final C1935k0 f5167c;

    /* JADX INFO: renamed from: d */
    public final C0192k f5168d;

    /* JADX INFO: renamed from: e */
    public final C1529j1 f5169e;

    /* JADX INFO: renamed from: f */
    public long f5170f;

    /* JADX INFO: renamed from: g */
    public final C1926g f5171g;

    /* JADX INFO: renamed from: h */
    public final C2884s f5172h;

    /* JADX INFO: renamed from: i */
    public final C4618m1 f5173i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1549s0(C2884s c2884s, C0192k c0192k, C4618m1 c4618m1, C1529j1 c1529j1) {
        C1926g c1926g = c2884s.f9316a;
        long j3 = c2884s.f9317b;
        C1935k0 c1935k0 = c4618m1 != null ? c4618m1.f15293a : null;
        this.f5165a = c1926g;
        this.f5166b = j3;
        this.f5167c = c1935k0;
        this.f5168d = c0192k;
        this.f5169e = c1529j1;
        this.f5170f = j3;
        this.f5171g = c1926g;
        this.f5172h = c2884s;
        this.f5173i = c4618m1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final List m4050a(InterfaceC1231l interfaceC1231l) {
        if (!C1939m0.m4813c(this.f5170f)) {
            return AbstractC0000a.m101y0(new C2865a(HttpUrl.FRAGMENT_ENCODE_SET, 0), new C2883r(C1939m0.m4816f(this.f5170f), C1939m0.m4816f(this.f5170f)));
        }
        InterfaceC2872g interfaceC2872g = (InterfaceC2872g) interfaceC1231l.invoke(this);
        if (interfaceC2872g != null) {
            return AbstractC0000a.m99x0(interfaceC2872g);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Integer m4051b() {
        C1935k0 c1935k0 = this.f5167c;
        if (c1935k0 == null) {
            return null;
        }
        C1942o c1942o = c1935k0.f6562b;
        int iM4815e = C1939m0.m4815e(this.f5170f);
        C0192k c0192k = this.f5168d;
        c0192k.m859l(iM4815e);
        int iM4826c = c1942o.m4826c(c1942o.m4827d(iM4815e), true);
        c0192k.m861n(iM4826c);
        return Integer.valueOf(iM4826c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Integer m4052c() {
        C1935k0 c1935k0 = this.f5167c;
        if (c1935k0 == null) {
            return null;
        }
        int iM4816f = C1939m0.m4816f(this.f5170f);
        C0192k c0192k = this.f5168d;
        c0192k.m859l(iM4816f);
        int iM4807g = c1935k0.m4807g(c1935k0.f6562b.m4827d(iM4816f));
        c0192k.m861n(iM4807g);
        return Integer.valueOf(iM4807g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Integer m4053d() {
        int length;
        C1935k0 c1935k0 = this.f5167c;
        if (c1935k0 == null) {
            return null;
        }
        int iM4067r = m4067r();
        while (true) {
            C1926g c1926g = this.f5165a;
            if (iM4067r < c1926g.f6529h.length()) {
                int length2 = this.f5171g.f6529h.length() - 1;
                if (iM4067r <= length2) {
                    length2 = iM4067r;
                }
                long jM4810j = c1935k0.m4810j(length2);
                int i9 = C1939m0.f6574c;
                int i10 = (int) (jM4810j & 4294967295L);
                if (i10 > iM4067r) {
                    this.f5168d.m861n(i10);
                    length = i10;
                    break;
                }
                iM4067r++;
            } else {
                length = c1926g.f6529h.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Integer m4054e() {
        int i9;
        C1935k0 c1935k0 = this.f5167c;
        if (c1935k0 == null) {
            return null;
        }
        int iM4067r = m4067r();
        while (true) {
            if (iM4067r <= 0) {
                i9 = 0;
                break;
            }
            int length = this.f5171g.f6529h.length() - 1;
            if (iM4067r <= length) {
                length = iM4067r;
            }
            long jM4810j = c1935k0.m4810j(length);
            int i10 = C1939m0.f6574c;
            int i11 = (int) (jM4810j >> 32);
            if (i11 < iM4067r) {
                this.f5168d.m861n(i11);
                i9 = i11;
                break;
            }
            iM4067r--;
        }
        return Integer.valueOf(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m4055f() {
        C1935k0 c1935k0 = this.f5167c;
        return (c1935k0 != null ? c1935k0.m4808h(m4067r()) : null) != EnumC4094j.f13555h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m4056g(C1935k0 c1935k0, int i9) {
        int iM4067r = m4067r();
        C1529j1 c1529j1 = this.f5169e;
        if (c1529j1.f5103a == null) {
            c1529j1.f5103a = Float.valueOf(c1935k0.m4803c(iM4067r).f2416a);
        }
        C1942o c1942o = c1935k0.f6562b;
        int iM4827d = c1942o.m4827d(iM4067r) + i9;
        if (iM4827d < 0) {
            return 0;
        }
        if (iM4827d >= c1942o.f6588f) {
            return this.f5171g.f6529h.length();
        }
        float fM4825b = c1942o.m4825b(iM4827d) - 1;
        Float f3 = c1529j1.f5103a;
        f3.getClass();
        float fFloatValue = f3.floatValue();
        if ((m4055f() && fFloatValue >= c1935k0.m4806f(iM4827d)) || (!m4055f() && fFloatValue <= c1935k0.m4805e(iM4827d))) {
            return c1942o.m4826c(iM4827d, true);
        }
        int iM4830g = c1942o.m4830g((((long) Float.floatToRawIntBits(fM4825b)) & 4294967295L) | (Float.floatToRawIntBits(f3.floatValue()) << 32));
        this.f5168d.m861n(iM4830g);
        return iM4830g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4057h(C4618m1 c4618m1, int i9) {
        C0808c c0808cMo8866k0;
        InterfaceC4428t interfaceC4428t = c4618m1.f15294b;
        C1935k0 c1935k0 = c4618m1.f15293a;
        if (interfaceC4428t == null) {
            c0808cMo8866k0 = C0808c.f2415e;
        } else {
            InterfaceC4428t interfaceC4428t2 = c4618m1.f15295c;
            c0808cMo8866k0 = interfaceC4428t2 != null ? interfaceC4428t2.mo8866k0(interfaceC4428t, true) : null;
            if (c0808cMo8866k0 == null) {
            }
        }
        long j3 = this.f5172h.f9317b;
        int i10 = C1939m0.f6574c;
        int i11 = (int) (j3 & 4294967295L);
        C0192k c0192k = this.f5168d;
        c0192k.m859l(i11);
        C0808c c0808cM4803c = c1935k0.m4803c(i11);
        float f3 = c0808cM4803c.f2416a;
        int iM4830g = c1935k0.f6562b.m4830g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c0808cMo8866k0.m2047c() & 4294967295L)) * i9) + c0808cM4803c.f2417b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        c0192k.m861n(iM4830g);
        return iM4830g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4058i() {
        C1529j1 c1529j1 = this.f5169e;
        c1529j1.f5103a = null;
        C1926g c1926g = this.f5171g;
        if (c1926g.f6529h.length() > 0) {
            if (m4055f()) {
                m4060k();
                return;
            }
            c1529j1.f5103a = null;
            if (c1926g.f6529h.length() > 0) {
                String str = c1926g.f6529h;
                long j3 = this.f5170f;
                int i9 = C1939m0.f6574c;
                int iM9074q = AbstractC4634s.m9074q((int) (j3 & 4294967295L), str);
                if (iM9074q != -1) {
                    m4066q(iM9074q, iM9074q);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4059j() {
        this.f5169e.f5103a = null;
        C1926g c1926g = this.f5171g;
        String str = c1926g.f6529h;
        String str2 = c1926g.f6529h;
        if (str.length() > 0) {
            int iM9075r = AbstractC4634s.m9075r(str2, C1939m0.m4815e(this.f5170f));
            if (iM9075r == C1939m0.m4815e(this.f5170f) && iM9075r != str2.length()) {
                iM9075r = AbstractC4634s.m9075r(str2, iM9075r + 1);
            }
            m4066q(iM9075r, iM9075r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4060k() {
        this.f5169e.f5103a = null;
        C1926g c1926g = this.f5171g;
        if (c1926g.f6529h.length() > 0) {
            String str = c1926g.f6529h;
            long j3 = this.f5170f;
            int i9 = C1939m0.f6574c;
            int iM9077t = AbstractC4634s.m9077t((int) (j3 & 4294967295L), str);
            if (iM9077t != -1) {
                m4066q(iM9077t, iM9077t);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m4061l() {
        this.f5169e.f5103a = null;
        C1926g c1926g = this.f5171g;
        String str = c1926g.f6529h;
        String str2 = c1926g.f6529h;
        if (str.length() > 0) {
            int iM9076s = AbstractC4634s.m9076s(str2, C1939m0.m4816f(this.f5170f));
            if (iM9076s == C1939m0.m4816f(this.f5170f) && iM9076s != 0) {
                iM9076s = AbstractC4634s.m9076s(str2, iM9076s - 1);
            }
            m4066q(iM9076s, iM9076s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4062m() {
        C1529j1 c1529j1 = this.f5169e;
        c1529j1.f5103a = null;
        C1926g c1926g = this.f5171g;
        if (c1926g.f6529h.length() > 0) {
            if (!m4055f()) {
                m4060k();
                return;
            }
            c1529j1.f5103a = null;
            if (c1926g.f6529h.length() > 0) {
                String str = c1926g.f6529h;
                long j3 = this.f5170f;
                int i9 = C1939m0.f6574c;
                int iM9074q = AbstractC4634s.m9074q((int) (j3 & 4294967295L), str);
                if (iM9074q != -1) {
                    m4066q(iM9074q, iM9074q);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4063n() {
        Integer numM4051b;
        this.f5169e.f5103a = null;
        if (this.f5171g.f6529h.length() <= 0 || (numM4051b = m4051b()) == null) {
            return;
        }
        int iIntValue = numM4051b.intValue();
        m4066q(iIntValue, iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m4064o() {
        Integer numM4052c;
        this.f5169e.f5103a = null;
        if (this.f5171g.f6529h.length() <= 0 || (numM4052c = m4052c()) == null) {
            return;
        }
        int iIntValue = numM4052c.intValue();
        m4066q(iIntValue, iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m4065p() {
        if (this.f5171g.f6529h.length() > 0) {
            int i9 = C1939m0.f6574c;
            this.f5170f = AbstractC1923e0.m4784b((int) (this.f5166b >> 32), (int) (this.f5170f & 4294967295L));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m4066q(int i9, int i10) {
        this.f5170f = AbstractC1923e0.m4784b(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final int m4067r() {
        long j3 = this.f5170f;
        int i9 = C1939m0.f6574c;
        int i10 = (int) (j3 & 4294967295L);
        this.f5168d.m859l(i10);
        return i10;
    }
}
