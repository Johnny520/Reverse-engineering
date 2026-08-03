package p047d7;

import p005a5.C0016a;
import p034c7.EnumC0411g;
import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: d7.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730m extends AbstractC0724g {

    /* JADX INFO: renamed from: t */
    public C0725h f2172t;

    /* JADX INFO: renamed from: u */
    public C0721d f2173u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: X */
    public final long mo1905X() {
        C0725h c0725h = this.f2172t;
        if (c0725h != null) {
            return c0725h.m1927N(8);
        }
        if (!m1913g0()) {
            return m1927N(m1911d0());
        }
        return AbstractC2331a.m5540t(this.f12076k, m1909b0() + this.f2159o + 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: Y */
    public final long mo1906Y() {
        C0725h c0725h = this.f2172t;
        return c0725h != null ? c0725h.m1927N(4) : super.mo1906Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: e0 */
    public final long mo1912e0() {
        C0725h c0725h = this.f2172t;
        if (c0725h != null) {
            return c0725h.m1927N(12);
        }
        if (!m1913g0()) {
            return m1927N(this.f2160p + 16);
        }
        return AbstractC2331a.m5540t(this.f12076k, m1909b0() + this.f2159o + 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: l0 */
    public final void mo1914l0(long j3) {
        C0725h c0725h = this.f2172t;
        if (c0725h == null) {
            super.mo1914l0(j3);
        } else {
            c0725h.m1930Q(4, j3);
            super.mo1914l0(0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m1918n0(C0721d c0721d) {
        this.f2173u = c0721d;
        C0016a c0016a = this.f2161q;
        int i9 = c0016a.f55h;
        AbstractC0724g abstractC0724g = (AbstractC0724g) c0016a.f56i;
        if (this.f2163s == 0) {
            this.f2163s = c0721d.f2163s;
        }
        if (mo1906Y() == 0) {
            mo1914l0(c0721d.mo1906Y());
        }
        if (mo1912e0() == 0) {
            m1921q0(c0721d.mo1912e0());
        }
        if (mo1905X() == 0) {
            m1919o0(c0721d.mo1905X());
        }
        if (abstractC0724g.m1928O(i9) == 0) {
            C0016a c0016a2 = c0721d.f2161q;
            int iM1928O = ((AbstractC0724g) c0016a2.f56i).m1928O(c0016a2.f55h);
            if (iM1928O == abstractC0724g.m1928O(i9)) {
                return;
            }
            boolean zM203g = c0016a.m203g();
            abstractC0724g.m1931R(i9, iM1928O);
            if (zM203g != c0016a.m203g()) {
                abstractC0724g.mo1900j0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public final void m1919o0(long j3) {
        C0725h c0725h = this.f2172t;
        if (c0725h == null) {
            m1920p0(j3);
        } else {
            c0725h.m1930Q(8, j3);
            m1920p0(0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public final void m1920p0(long j3) {
        if (!mo1899h0() && !AbstractC0724g.m1903i0(j3)) {
            m1930Q(m1911d0(), j3);
            return;
        }
        int iM1907Z = m1907Z();
        int i9 = this.f2159o;
        if (iM1907Z < 20) {
            m7715M(m1909b0() + i9 + 20, false);
            m1931R(this.f2160p + 22, 20);
        }
        AbstractC2331a.m5534D(this.f12076k, m1911d0(), -1);
        int iM1909b0 = m1909b0() + i9;
        byte[] bArr = this.f12076k;
        int i10 = iM1909b0 + 16;
        if (i10 > bArr.length) {
            return;
        }
        for (int i11 = iM1909b0 + 8; i11 < i10; i11++) {
            bArr[i11] = (byte) (255 & j3);
            j3 >>>= 8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public final void m1921q0(long j3) {
        C0725h c0725h = this.f2172t;
        if (c0725h == null) {
            m1922r0(j3);
        } else {
            c0725h.m1930Q(12, j3);
            m1922r0(0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public final void m1922r0(long j3) {
        boolean zMo1899h0 = mo1899h0();
        int i9 = this.f2160p;
        if (!zMo1899h0 && !AbstractC0724g.m1903i0(j3)) {
            m1930Q(i9 + 16, j3);
            return;
        }
        int iM1907Z = m1907Z();
        int i10 = this.f2159o;
        if (iM1907Z < 20) {
            m7715M(m1909b0() + i10 + 20, false);
            m1931R(i9 + 22, 20);
        }
        AbstractC2331a.m5534D(this.f12076k, i9 + 16, -1);
        int iM1909b0 = m1909b0() + i10;
        byte[] bArr = this.f12076k;
        int i11 = iM1909b0 + 16;
        if (i11 > bArr.length) {
            return;
        }
        for (int i12 = iM1909b0 + 8; i12 < i11; i12++) {
            bArr[i12] = (byte) (255 & j3);
            j3 >>>= 8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public final void m1923s0() {
        C0725h c0725h = this.f2172t;
        C0016a c0016a = this.f2161q;
        AbstractC0724g abstractC0724g = (AbstractC0724g) c0016a.f56i;
        if (!AbstractC2331a.m5538q(abstractC0724g.f12076k, c0016a.f55h, 3)) {
            this.f2172t = null;
            if (c0725h != null) {
                super.mo1914l0(c0725h.m1927N(4));
                m1922r0(c0725h.m1927N(12));
                m1920p0(c0725h.m1927N(8));
                return;
            }
            return;
        }
        if (c0725h == null) {
            C0725h c0725h2 = new C0725h(16, EnumC0411g.DATA_DESCRIPTOR, 0);
            if (c0725h2.mo5551p() >= 4) {
                AbstractC2331a.m5534D(c0725h2.f12076k, 0, 134695760);
            }
            c0725h2.m1930Q(12, mo1912e0());
            c0725h2.m1930Q(8, mo1905X());
            c0725h2.m1930Q(4, mo1906Y());
            this.f2172t = c0725h2;
            super.mo1914l0(0L);
            m1920p0(0L);
            m1922r0(0L);
        }
    }
}
