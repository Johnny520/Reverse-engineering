package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zn1 implements java.io.Closeable {

    /* JADX INFO: renamed from: ε */
    public final p000.C0384i5 f13197;

    /* JADX INFO: renamed from: ζ */
    public final p000.zj1 f13198;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f13199;

    /* JADX INFO: renamed from: θ */
    public final int f13200;

    /* JADX INFO: renamed from: ι */
    public final p000.qc0 f13201;

    /* JADX INFO: renamed from: κ */
    public final p000.vc0 f13202;

    /* JADX INFO: renamed from: λ */
    public final p000.bo1 f13203;

    /* JADX INFO: renamed from: μ */
    public final p000.lx1 f13204;

    /* JADX INFO: renamed from: ν */
    public final p000.zn1 f13205;

    /* JADX INFO: renamed from: ξ */
    public final p000.zn1 f13206;

    /* JADX INFO: renamed from: ο */
    public final p000.zn1 f13207;

    /* JADX INFO: renamed from: π */
    public final long f13208;

    /* JADX INFO: renamed from: ρ */
    public final long f13209;

    /* JADX INFO: renamed from: σ */
    public final p000.C1076zz f13210;

    /* JADX INFO: renamed from: τ */
    public final p000.p52 f13211;

    /* JADX INFO: renamed from: υ */
    public final boolean f13212;

    public zn1(p000.C0384i5 r1, p000.zj1 r2, java.lang.String r3, int r4, p000.qc0 r5, p000.vc0 r6, p000.bo1 r7, p000.lx1 r8, p000.zn1 r9, p000.zn1 r10, p000.zn1 r11, long r12, long r14, p000.C1076zz r16, p000.p52 r17) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r7.getClass()
            r17.getClass()
            r0.<init>()
            r0.f13197 = r1
            r0.f13198 = r2
            r0.f13199 = r3
            r0.f13200 = r4
            r0.f13201 = r5
            r0.f13202 = r6
            r0.f13203 = r7
            r0.f13204 = r8
            r0.f13205 = r9
            r0.f13206 = r10
            r0.f13207 = r11
            r0.f13208 = r12
            r0.f13209 = r14
            r1 = r16
            r0.f13210 = r1
            r1 = r17
            r0.f13211 = r1
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r1 > r4) goto L3e
            r1 = 300(0x12c, float:4.2E-43)
            if (r4 >= r1) goto L3e
            r2 = 1
        L3e:
            r0.f13212 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            bo1 r0 = r0.f13203
            r0.close()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response{protocol="
            r0.<init>(r1)
            zj1 r1 = r2.f13198
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            int r1 = r2.f13200
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.f13199
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            i5 r2 = r2.f13197
            java.lang.Object r2 = r2.f4914
            og0 r2 = (p000.og0) r2
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final p000.yn1 m7206() {
            r3 = this;
            yn1 r0 = new yn1
            r0.<init>()
            r1 = -1
            r0.f12693 = r1
            ao1 r1 = p000.bo1.f1795
            r0.f12697 = r1
            zz1 r1 = p000.p52.f8428
            r0.f12705 = r1
            i5 r1 = r3.f13197
            r0.f12691 = r1
            zj1 r1 = r3.f13198
            r0.f12692 = r1
            int r1 = r3.f13200
            r0.f12693 = r1
            java.lang.String r1 = r3.f13199
            r0.f12694 = r1
            qc0 r1 = r3.f13201
            r0.f12695 = r1
            vc0 r1 = r3.f13202
            uc0 r1 = r1.m6170()
            r0.f12696 = r1
            bo1 r1 = r3.f13203
            r0.f12697 = r1
            lx1 r1 = r3.f13204
            r0.f12698 = r1
            zn1 r1 = r3.f13205
            r0.f12699 = r1
            zn1 r1 = r3.f13206
            r0.f12700 = r1
            zn1 r1 = r3.f13207
            r0.f12701 = r1
            long r1 = r3.f13208
            r0.f12702 = r1
            long r1 = r3.f13209
            r0.f12703 = r1
            zz r1 = r3.f13210
            r0.f12704 = r1
            p52 r3 = r3.f13211
            r0.f12705 = r3
            return r0
    }
}
