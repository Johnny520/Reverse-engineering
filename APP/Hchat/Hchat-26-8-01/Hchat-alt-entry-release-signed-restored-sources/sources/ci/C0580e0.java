package ci;

import gg.AbstractC1416l;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p036c9.C0446i;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p253r1.C3647d;
import p253r1.C3652i;
import p253r1.InterfaceC3644a;
import p259r9.AbstractC3754e0;
import p293u2.C4238h;
import p293u2.C4247q;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5651v;
import p352xf.EnumC5799a;
import p357y1.AbstractC5888h1;
import p357y1.C5944v1;
import p357y1.InterfaceC5917o2;
import p370yf.AbstractC6038c;
import sh.AbstractC4013h0;
import tf.C4174u;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0580e0 extends AbstractC5615j implements InterfaceC5609h, InterfaceC5651v, InterfaceC3644a {

    /* JADX INFO: renamed from: A */
    public C3560e1 f1793A;

    /* JADX INFO: renamed from: C */
    public float f1795C;

    /* JADX INFO: renamed from: D */
    public float f1796D;

    /* JADX INFO: renamed from: E */
    public float f1797E;

    /* JADX INFO: renamed from: F */
    public InterfaceC4233c f1798F;

    /* JADX INFO: renamed from: G */
    public InterfaceC5917o2 f1799G;

    /* JADX INFO: renamed from: w */
    public boolean f1800w = true;

    /* JADX INFO: renamed from: x */
    public boolean f1801x = true;

    /* JADX INFO: renamed from: y */
    public final C3647d f1802y = new C3647d();

    /* JADX INFO: renamed from: z */
    public final C0602p0 f1803z = new C0602p0();

    /* JADX INFO: renamed from: B */
    public final float f1794B = 1.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1580M(long j3, InterfaceC5557c interfaceC5557c) {
        C0578d0 c0578d0;
        long j4;
        if (interfaceC5557c instanceof C0578d0) {
            c0578d0 = (C0578d0) interfaceC5557c;
            int i9 = c0578d0.f1786j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0578d0.f1786j = i9 - Integer.MIN_VALUE;
            } else {
                c0578d0 = new C0578d0(this, (AbstractC6038c) interfaceC5557c);
            }
        }
        Object objM7628c = c0578d0.f1784h;
        int i10 = c0578d0.f1786j;
        float f3 = this.f1794B;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objM7628c);
            j4 = 0;
            if (!this.f23801t) {
                return new C4247q(0L);
            }
            boolean z9 = Math.abs(this.f1795C) > f3;
            if (m1585o1().m1630a() != z9) {
                m1585o1().m1631b(z9);
            }
            if (AbstractC5618k.m10152h(this, AbstractC4013h0.f13138a) != null) {
                C0086a.m445d();
                return null;
            }
            C3560e1 c3560e1 = this.f1793A;
            if (c3560e1 != null) {
                c3560e1.mo7485a(null);
            }
            if (this.f1801x) {
                c0578d0.f1783g = j3;
                c0578d0.f1786j = 2;
                objM7628c = this.f1802y.m7628c(j3, c0578d0);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM7628c == enumC5799a) {
                    return enumC5799a;
                }
            }
            long jM8546d = C4247q.m8546d(j3, j4);
            float fM8545c = !this.f1800w ? C4247q.m8545c(jM8546d) : C4247q.m8544b(jM8546d);
            if (Math.abs(this.f1795C) > f3) {
                return new C4247q(j4);
            }
            if (Math.signum(fM8545c) == Math.signum(this.f1795C)) {
                m1588r1(fM8545c);
                return new C4247q(C4247q.m8547e(j4, this.f1800w ? AbstractC0000a.m59d(0.0f, C4247q.m8545c(jM8546d)) : AbstractC0000a.m59d(C4247q.m8544b(jM8546d), 0.0f)));
            }
            m1588r1(fM8545c);
            return new C4247q(C4247q.m8547e(j4, this.f1800w ? AbstractC0000a.m59d(0.0f, C4247q.m8545c(jM8546d) / 2.13333f) : AbstractC0000a.m59d(C4247q.m8544b(jM8546d) / 2.13333f, 0.0f)));
        }
        if (i10 == 1) {
            AbstractC1089i.m2732I0(objM7628c);
            return objM7628c;
        }
        if (i10 != 2) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j3 = c0578d0.f1783g;
        AbstractC1089i.m2732I0(objM7628c);
        j4 = ((C4247q) objM7628c).f13927a;
        long jM8546d2 = C4247q.m8546d(j3, j4);
        if (!this.f1800w) {
        }
        if (Math.abs(this.f1795C) > f3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: M0 */
    public final long mo1581M0(long j3, long j4, int i9) {
        long j5;
        long jM7627b = 0;
        if (!this.f23801t) {
            return 0L;
        }
        boolean z9 = Math.abs(this.f1795C) > this.f1794B;
        if (m1585o1().m1630a() != z9) {
            m1585o1().m1631b(z9);
        }
        if (AbstractC5618k.m10152h(this, AbstractC4013h0.f13138a) != null) {
            C0086a.m445d();
            return 0L;
        }
        if (i9 != 1) {
            return this.f1802y.m7627b(j3, j4, i9);
        }
        C3560e1 c3560e1 = this.f1793A;
        if (c3560e1 != null) {
            c3560e1.mo7485a(null);
        }
        if (this.f1801x) {
            j5 = j4;
            jM7627b = this.f1802y.m7627b(j3, j5, i9);
        } else {
            j5 = j4;
        }
        long jM2041d = C0807b.m2041d(j5, jM7627b);
        m1584n1(Float.intBitsToFloat((int) (this.f1800w ? jM2041d & 4294967295L : jM2041d >> 32)));
        if (this.f1800w) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM7627b >> 32));
            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7627b & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        m1589s1();
        m10122k1(new C3652i(this, this.f1802y));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        m1586p1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: f0 */
    public final long mo1582f0(int i9, long j3) {
        if (!this.f23801t) {
            return 0L;
        }
        float fAbs = Math.abs(this.f1795C);
        float f3 = this.f1794B;
        boolean z9 = fAbs > f3;
        if (m1585o1().m1630a() != z9) {
            m1585o1().m1631b(z9);
        }
        if (AbstractC5618k.m10152h(this, AbstractC4013h0.f13138a) != null) {
            C0086a.m445d();
            return 0L;
        }
        C3647d c3647d = this.f1802y;
        if (i9 != 1) {
            return c3647d.m7629d(i9, j3);
        }
        C3560e1 c3560e1 = this.f1793A;
        if (c3560e1 != null) {
            c3560e1.mo7485a(null);
        }
        long jM7629d = this.f1801x ? c3647d.m7629d(i9, j3) : 0L;
        long jM2041d = C0807b.m2041d(j3, jM7629d);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f1800w ? jM2041d & 4294967295L : jM2041d >> 32));
        if (Math.abs(this.f1795C) <= f3 || Math.signum(fIntBitsToFloat) == Math.signum(this.f1796D)) {
            return jM7629d;
        }
        if (Math.signum(fIntBitsToFloat) == Math.signum(this.f1796D)) {
            m1584n1(fIntBitsToFloat);
            if (this.f1800w) {
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7629d >> 32)))) << 32);
            }
            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7629d & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)))) << 32);
        }
        float f10 = Math.abs(this.f1796D) <= Math.abs(fIntBitsToFloat) ? -this.f1796D : fIntBitsToFloat;
        if (Math.abs(this.f1796D) <= Math.abs(fIntBitsToFloat)) {
            m1586p1();
        } else {
            m1584n1(f10);
        }
        if (this.f1800w) {
            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7629d >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7629d & 4294967295L)) + f10)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7629d & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7629d >> 32)) + f10)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        interfaceC4409m0.getClass();
        m1589s1();
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C0446i(abstractC4377b1Mo8831Q, 8, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1583m0(long j3, long j4, AbstractC6038c abstractC6038c) {
        C0576c0 c0576c0;
        long j5;
        if (abstractC6038c instanceof C0576c0) {
            c0576c0 = (C0576c0) abstractC6038c;
            int i9 = c0576c0.f1774j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0576c0.f1774j = i9 - Integer.MIN_VALUE;
            } else {
                c0576c0 = new C0576c0(this, abstractC6038c);
            }
        }
        C0576c0 c0576c02 = c0576c0;
        Object objM7626a = c0576c02.f1772h;
        int i10 = c0576c02.f1774j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objM7626a);
            j5 = 0;
            if (!this.f23801t) {
                return new C4247q(0L);
            }
            boolean z9 = Math.abs(this.f1795C) > this.f1794B;
            if (m1585o1().m1630a() != z9) {
                m1585o1().m1631b(z9);
            }
            if (AbstractC5618k.m10152h(this, AbstractC4013h0.f13138a) != null) {
                C0086a.m445d();
                return null;
            }
            C3560e1 c3560e1 = this.f1793A;
            if (c3560e1 != null) {
                c3560e1.mo7485a(null);
            }
            if (!this.f1801x) {
                long jM8546d = C4247q.m8546d(j4, j5);
                float fM8545c = (!this.f1800w ? C4247q.m8545c(jM8546d) : C4247q.m8544b(jM8546d)) / 1.53333f;
                m1588r1(fM8545c);
                return new C4247q(C4247q.m8547e(j5, !this.f1800w ? AbstractC0000a.m59d(0.0f, fM8545c) : AbstractC0000a.m59d(fM8545c, 0.0f)));
            }
            c0576c02.f1771g = j4;
            c0576c02.f1774j = 2;
            objM7626a = this.f1802y.m7626a(j3, j4, c0576c02);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM7626a == enumC5799a) {
                return enumC5799a;
            }
            j4 = j4;
        } else {
            if (i10 == 1) {
                AbstractC1089i.m2732I0(objM7626a);
                return objM7626a;
            }
            if (i10 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = c0576c02.f1771g;
            AbstractC1089i.m2732I0(objM7626a);
        }
        j5 = ((C4247q) objM7626a).f13927a;
        long jM8546d2 = C4247q.m8546d(j4, j5);
        float fM8545c2 = (!this.f1800w ? C4247q.m8545c(jM8546d2) : C4247q.m8544b(jM8546d2)) / 1.53333f;
        m1588r1(fM8545c2);
        return new C4247q(C4247q.m8547e(j5, !this.f1800w ? AbstractC0000a.m59d(0.0f, fM8545c2) : AbstractC0000a.m59d(fM8545c2, 0.0f)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final void m1584n1(float f3) {
        if (f3 == 0.0f) {
            return;
        }
        float f10 = this.f1796D + f3;
        this.f1796D = f10;
        float f11 = this.f1797E;
        float fM7907q = AbstractC3754e0.m7907q(f10, -f11, f11);
        this.f1796D = fM7907q;
        float fMin = Math.min(Math.abs(fM7907q) / this.f1797E, 1.0f);
        float f12 = this.f1797E;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m1587q1(Math.signum(this.f1796D) * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f12))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final C0614z m1585o1() {
        return (C0614z) AbstractC5618k.m10152h(this, AbstractC0574b0.f1767a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public final void m1586p1() {
        m1587q1(0.0f);
        this.f1796D = 0.0f;
        if (this.f23801t) {
            m1585o1().m1631b(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public final void m1587q1(float f3) {
        if (this.f1795C == f3) {
            return;
        }
        this.f1795C = f3;
        if (this.f23801t) {
            AbstractC5618k.m10167w(this).m10022U(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r1 */
    public final void m1588r1(float f3) {
        if (Math.abs(this.f1795C) <= this.f1794B && f3 == 0.0f) {
            m1586p1();
            return;
        }
        C3560e1 c3560e1 = this.f1793A;
        InterfaceC5557c interfaceC5557c = null;
        if (c3560e1 != null) {
            c3560e1.mo7485a(null);
        }
        this.f1793A = AbstractC3603v.m7563q(m10550Y0(), null, new C0599o(this, f3, interfaceC5557c, 2), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s1 */
    public final void m1589s1() {
        InterfaceC4233c interfaceC4233c = (InterfaceC4233c) AbstractC5618k.m10152h(this, AbstractC5888h1.f23926h);
        InterfaceC5917o2 interfaceC5917o2 = (InterfaceC5917o2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23939u);
        if (AbstractC1416l.m3825a(interfaceC4233c, this.f1798F) && AbstractC1416l.m3825a(interfaceC5917o2, this.f1799G)) {
            return;
        }
        this.f1798F = interfaceC4233c;
        this.f1799G = interfaceC5917o2;
        this.f1797E = this.f1800w ? interfaceC4233c.mo1601x0(C4238h.m8523a(((C5944v1) interfaceC5917o2).m10670a())) : interfaceC4233c.mo1601x0(C4238h.m8524b(((C5944v1) interfaceC5917o2).m10670a()));
    }
}
