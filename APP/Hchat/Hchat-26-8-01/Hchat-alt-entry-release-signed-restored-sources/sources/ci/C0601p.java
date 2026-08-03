package ci;

import p000a.AbstractC0000a;
import p015b0.C0136d0;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p144k.InterfaceC2185k1;
import p174m.C2633n2;
import p174m.C2637o2;
import p249qg.InterfaceC3596r0;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p293u2.C4247q;
import p339x1.InterfaceC5612i;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: ci.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0601p implements InterfaceC2185k1 {

    /* JADX INFO: renamed from: a */
    public float f1884a;

    /* JADX INFO: renamed from: b */
    public float f1885b;

    /* JADX INFO: renamed from: c */
    public C0605r f1886c;

    /* JADX INFO: renamed from: d */
    public float f1887d;

    /* JADX INFO: renamed from: e */
    public float f1888e;

    /* JADX INFO: renamed from: f */
    public float f1889f;

    /* JADX INFO: renamed from: g */
    public float f1890g;

    /* JADX INFO: renamed from: j */
    public InterfaceC3596r0 f1893j;

    /* JADX INFO: renamed from: k */
    public InterfaceC3596r0 f1894k;

    /* JADX INFO: renamed from: l */
    public C0603q f1895l;

    /* JADX INFO: renamed from: m */
    public C0605r f1896m;

    /* JADX INFO: renamed from: n */
    public C0605r f1897n;

    /* JADX INFO: renamed from: h */
    public final C0602p0 f1891h = new C0602p0();

    /* JADX INFO: renamed from: i */
    public final C0602p0 f1892i = new C0602p0();

    /* JADX INFO: renamed from: o */
    public final C0607s f1898o = new C0607s(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p144k.InterfaceC2185k1
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1615a(long j3, C2633n2 c2633n2, AbstractC6038c abstractC6038c) {
        C0595m c0595m;
        long jM59d;
        long jM59d2;
        if (abstractC6038c instanceof C0595m) {
            c0595m = (C0595m) abstractC6038c;
            int i9 = c0595m.f1866j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0595m.f1866j = i9 - Integer.MIN_VALUE;
            } else {
                c0595m = new C0595m(this, abstractC6038c);
            }
        }
        Object objInvokeSuspend = c0595m.f1864h;
        int i10 = c0595m.f1866j;
        C3967n c3967n = C3967n.f12976a;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objInvokeSuspend);
            boolean z9 = Math.abs(this.f1885b) > 1.0f;
            boolean z10 = Math.abs(this.f1884a) > 1.0f;
            C0605r c0605r = this.f1896m;
            if (c0605r != null) {
                c0605r.invoke();
            }
            InterfaceC3596r0 interfaceC3596r0 = this.f1894k;
            if (interfaceC3596r0 != null) {
                interfaceC3596r0.mo7485a(null);
            }
            InterfaceC3596r0 interfaceC3596r02 = this.f1893j;
            if (interfaceC3596r02 != null) {
                interfaceC3596r02.mo7485a(null);
            }
            if (!z9 || C4247q.m8545c(j3) == 0.0f) {
                jM59d = j3;
            } else if (Math.signum(C4247q.m8545c(j3)) == Math.signum(this.f1885b)) {
                m1624j(C4247q.m8545c(j3));
                jM59d = AbstractC0000a.m59d(C4247q.m8544b(j3), 0.0f);
            } else {
                m1624j(C4247q.m8545c(j3));
                jM59d = AbstractC0000a.m59d(C4247q.m8544b(j3), C4247q.m8545c(j3) / 2.13333f);
            }
            if (!z10 || C4247q.m8544b(j3) == 0.0f) {
                jM59d2 = jM59d;
            } else if (Math.signum(C4247q.m8544b(j3)) == Math.signum(this.f1884a)) {
                m1623i(C4247q.m8544b(j3));
                jM59d2 = AbstractC0000a.m59d(0.0f, C4247q.m8545c(jM59d));
            } else {
                m1623i(C4247q.m8544b(j3));
                jM59d2 = AbstractC0000a.m59d(C4247q.m8544b(j3) / 2.13333f, C4247q.m8545c(jM59d));
            }
            c0595m.f1863g = jM59d2;
            c0595m.f1866j = 1;
            c2633n2.getClass();
            C2633n2 c2633n22 = new C2633n2(c2633n2.f8570k, c0595m);
            c2633n22.f8569j = jM59d2;
            objInvokeSuspend = c2633n22.invokeSuspend(c3967n);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objInvokeSuspend == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jM59d2 = c0595m.f1863g;
            AbstractC1089i.m2732I0(objInvokeSuspend);
        }
        long jM8546d = C4247q.m8546d(jM59d2, ((C4247q) objInvokeSuspend).f13927a);
        m1624j(C4247q.m8545c(jM8546d) / 1.53333f);
        m1623i(C4247q.m8544b(jM8546d) / 1.53333f);
        m1625k();
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2185k1
    /* JADX INFO: renamed from: b */
    public final long mo1616b(long j3, int i9, C0136d0 c0136d0) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        c0136d0.getClass();
        C2637o2 c2637o2 = (C2637o2) c0136d0.f355h;
        if (i9 != 1) {
            C0807b c0807b = new C0807b(c2637o2.m6090c(c2637o2.f8598k, j3, c2637o2.f8597j));
            m1625k();
            return c0807b.f2414a;
        }
        C0605r c0605r = this.f1896m;
        if (c0605r != null) {
            c0605r.invoke();
        }
        InterfaceC3596r0 interfaceC3596r0 = this.f1894k;
        if (interfaceC3596r0 != null) {
            interfaceC3596r0.mo7485a(null);
        }
        InterfaceC3596r0 interfaceC3596r02 = this.f1893j;
        if (interfaceC3596r02 != null) {
            interfaceC3596r02.mo7485a(null);
        }
        int i10 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
        if (Math.abs(this.f1885b) <= 1.0f || Float.intBitsToFloat(i10) == 0.0f || Math.signum(Float.intBitsToFloat(i10)) == Math.signum(this.f1888e)) {
            fIntBitsToFloat = 0.0f;
        } else {
            float fIntBitsToFloat4 = Math.abs(this.f1888e) <= Math.abs(Float.intBitsToFloat(i10)) ? -this.f1888e : Float.intBitsToFloat(i10);
            if (Math.abs(this.f1888e) <= Math.abs(Float.intBitsToFloat(i10))) {
                m1622h(0.0f);
                this.f1888e = 0.0f;
                float f3 = fIntBitsToFloat4;
                fIntBitsToFloat3 = Float.intBitsToFloat(i10) - fIntBitsToFloat4;
                fIntBitsToFloat = f3;
            } else {
                m1620f(fIntBitsToFloat4);
                fIntBitsToFloat = Float.intBitsToFloat(i10);
                fIntBitsToFloat3 = 0.0f;
            }
        }
        int i11 = (int) (j3 >> 32);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i11);
        if (Math.abs(this.f1884a) <= 1.0f || Float.intBitsToFloat(i11) == 0.0f || Math.signum(Float.intBitsToFloat(i11)) == Math.signum(this.f1887d)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            float fIntBitsToFloat6 = Math.abs(this.f1887d) <= Math.abs(Float.intBitsToFloat(i11)) ? -this.f1887d : Float.intBitsToFloat(i11);
            if (Math.abs(this.f1887d) <= Math.abs(Float.intBitsToFloat(i11))) {
                m1621g(0.0f);
                this.f1887d = 0.0f;
                float f10 = fIntBitsToFloat6;
                fIntBitsToFloat5 = Float.intBitsToFloat(i11) - fIntBitsToFloat6;
                fIntBitsToFloat2 = f10;
            } else {
                m1619e(fIntBitsToFloat6);
                fIntBitsToFloat2 = Float.intBitsToFloat(i11);
                fIntBitsToFloat5 = 0.0f;
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        long j4 = new C0807b(c2637o2.m6090c(c2637o2.f8598k, jFloatToRawIntBits, c2637o2.f8597j)).f2414a;
        long jM2041d = C0807b.m2041d(jFloatToRawIntBits, j4);
        int i12 = (int) (jM2041d & 4294967295L);
        if (Float.intBitsToFloat(i12) != 0.0f) {
            m1620f(Float.intBitsToFloat(i12));
        }
        int i13 = (int) (jM2041d >> 32);
        if (Float.intBitsToFloat(i13) != 0.0f) {
            m1619e(Float.intBitsToFloat(i13));
        }
        m1625k();
        return (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j4 >> 32)) + fIntBitsToFloat2) + (Float.intBitsToFloat(i13) == 0.0f ? 0.0f : Float.intBitsToFloat(i13)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) + fIntBitsToFloat + (Float.intBitsToFloat(i12) != 0.0f ? Float.intBitsToFloat(i12) : 0.0f))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2185k1
    /* JADX INFO: renamed from: c */
    public final InterfaceC5612i mo1617c() {
        return this.f1898o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2185k1
    /* JADX INFO: renamed from: d */
    public final boolean mo1618d() {
        return Math.abs(this.f1884a) > 1.0f || Math.abs(this.f1885b) > 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1619e(float f3) {
        if (f3 == 0.0f) {
            return;
        }
        float f10 = this.f1890g;
        if (f10 == 0.0f) {
            return;
        }
        float f11 = this.f1887d + f3;
        this.f1887d = f11;
        float fM7907q = AbstractC3754e0.m7907q(f11, -f10, f10);
        this.f1887d = fM7907q;
        float fMin = Math.min(Math.abs(fM7907q) / this.f1890g, 1.0f);
        float fSignum = Math.signum(this.f1887d);
        float f12 = this.f1890g;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m1621g(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f12))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1620f(float f3) {
        if (f3 == 0.0f) {
            return;
        }
        float f10 = this.f1889f;
        if (f10 == 0.0f) {
            return;
        }
        float f11 = this.f1888e + f3;
        this.f1888e = f11;
        float fM7907q = AbstractC3754e0.m7907q(f11, -f10, f10);
        this.f1888e = fM7907q;
        float fMin = Math.min(Math.abs(fM7907q) / this.f1889f, 1.0f);
        float fSignum = Math.signum(this.f1888e);
        float f12 = this.f1889f;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m1622h(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f12))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1621g(float f3) {
        if (this.f1884a == f3) {
            return;
        }
        this.f1884a = f3;
        C0605r c0605r = this.f1886c;
        if (c0605r != null) {
            c0605r.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1622h(float f3) {
        if (this.f1885b == f3) {
            return;
        }
        this.f1885b = f3;
        C0605r c0605r = this.f1886c;
        if (c0605r != null) {
            c0605r.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m1623i(float f3) {
        if (Math.abs(this.f1884a) <= 1.0f && f3 == 0.0f) {
            m1621g(0.0f);
            this.f1887d = 0.0f;
            return;
        }
        InterfaceC3596r0 interfaceC3596r0 = this.f1893j;
        InterfaceC3596r0 interfaceC3596r02 = null;
        Object[] objArr = 0;
        if (interfaceC3596r0 != null) {
            interfaceC3596r0.mo7485a(null);
        }
        C0603q c0603q = this.f1895l;
        if (c0603q != null) {
            interfaceC3596r02 = (InterfaceC3596r0) c0603q.invoke(new C0599o(this, f3, objArr == true ? 1 : 0, 0));
        }
        this.f1893j = interfaceC3596r02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m1624j(float f3) {
        if (Math.abs(this.f1885b) <= 1.0f && f3 == 0.0f) {
            m1622h(0.0f);
            this.f1888e = 0.0f;
            return;
        }
        InterfaceC3596r0 interfaceC3596r0 = this.f1894k;
        InterfaceC3596r0 interfaceC3596r02 = null;
        Object[] objArr = 0;
        if (interfaceC3596r0 != null) {
            interfaceC3596r0.mo7485a(null);
        }
        C0603q c0603q = this.f1895l;
        if (c0603q != null) {
            interfaceC3596r02 = (InterfaceC3596r0) c0603q.invoke(new C0599o(this, f3, objArr == true ? 1 : 0, 1));
        }
        this.f1894k = interfaceC3596r02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1625k() {
        C0614z c0614z;
        boolean zMo1618d;
        C0605r c0605r = this.f1897n;
        if (c0605r == null || (c0614z = (C0614z) c0605r.invoke()) == null || c0614z.m1630a() == (zMo1618d = mo1618d())) {
            return;
        }
        c0614z.m1631b(zMo1618d);
    }
}
