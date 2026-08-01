package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zd1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f13047;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f13048;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f13049;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer f13050;

    /* JADX INFO: renamed from: ε */
    public final java.util.List f13051;

    /* JADX INFO: renamed from: ζ */
    public final long f13052;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f13053;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Integer f13054;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Integer f13055;

    /* JADX INFO: renamed from: κ */
    public final java.lang.Integer f13056;

    /* JADX INFO: renamed from: λ */
    public final java.lang.Integer f13057;

    /* JADX INFO: renamed from: μ */
    public final java.lang.Boolean f13058;

    public zd1(java.lang.String r1, java.lang.Integer r2, java.lang.String r3, java.lang.Integer r4, java.util.List r5, long r6, java.lang.String r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Boolean r13) {
            r0 = this;
            r0.<init>()
            r0.f13047 = r1
            r0.f13048 = r2
            r0.f13049 = r3
            r0.f13050 = r4
            r0.f13051 = r5
            r0.f13052 = r6
            r0.f13053 = r8
            r0.f13054 = r9
            r0.f13055 = r10
            r0.f13056 = r11
            r0.f13057 = r12
            r0.f13058 = r13
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.zd1 m7121(p000.zd1 r14, java.util.List r15, java.lang.String r16, int r17) {
            java.lang.String r1 = r14.f13047
            java.lang.Integer r2 = r14.f13048
            java.lang.String r3 = r14.f13049
            java.lang.Integer r4 = r14.f13050
            long r6 = r14.f13052
            r0 = r17 & 64
            if (r0 == 0) goto L12
            java.lang.String r0 = r14.f13053
            r8 = r0
            goto L14
        L12:
            r8 = r16
        L14:
            java.lang.Integer r9 = r14.f13054
            java.lang.Integer r10 = r14.f13055
            java.lang.Integer r11 = r14.f13056
            java.lang.Integer r12 = r14.f13057
            java.lang.Boolean r13 = r14.f13058
            r14.getClass()
            zd1 r0 = new zd1
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L91
        L4:
            boolean r0 = r5 instanceof p000.zd1
            if (r0 != 0) goto La
            goto L8f
        La:
            zd1 r5 = (p000.zd1) r5
            java.lang.String r0 = r4.f13047
            java.lang.String r1 = r5.f13047
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L18
            goto L8f
        L18:
            java.lang.Integer r0 = r4.f13048
            java.lang.Integer r1 = r5.f13048
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L24
            goto L8f
        L24:
            java.lang.String r0 = r4.f13049
            java.lang.String r1 = r5.f13049
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2f
            goto L8f
        L2f:
            java.lang.Integer r0 = r4.f13050
            java.lang.Integer r1 = r5.f13050
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L3a
            goto L8f
        L3a:
            java.util.List r0 = r4.f13051
            java.util.List r1 = r5.f13051
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45
            goto L8f
        L45:
            long r0 = r4.f13052
            long r2 = r5.f13052
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4e
            goto L8f
        L4e:
            java.lang.String r0 = r4.f13053
            java.lang.String r1 = r5.f13053
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L59
            goto L8f
        L59:
            java.lang.Integer r0 = r4.f13054
            java.lang.Integer r1 = r5.f13054
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L64
            goto L8f
        L64:
            java.lang.Integer r0 = r4.f13055
            java.lang.Integer r1 = r5.f13055
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L6f
            goto L8f
        L6f:
            java.lang.Integer r0 = r4.f13056
            java.lang.Integer r1 = r5.f13056
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L7a
            goto L8f
        L7a:
            java.lang.Integer r0 = r4.f13057
            java.lang.Integer r1 = r5.f13057
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L85
            goto L8f
        L85:
            java.lang.Boolean r4 = r4.f13058
            java.lang.Boolean r5 = r5.f13058
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L91
        L8f:
            r4 = 0
            return r4
        L91:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.f13047
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            java.lang.Integer r3 = r5.f13048
            if (r3 != 0) goto L14
            r3 = r0
            goto L18
        L14:
            int r3 = r3.hashCode()
        L18:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.String r3 = r5.f13049
            if (r3 != 0) goto L20
            r3 = r0
            goto L24
        L20:
            int r3 = r3.hashCode()
        L24:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.Integer r3 = r5.f13050
            if (r3 != 0) goto L2c
            r3 = r0
            goto L30
        L2c:
            int r3 = r3.hashCode()
        L30:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.util.List r3 = r5.f13051
            int r1 = p000.a12.m16(r3, r1, r2)
            long r3 = r5.f13052
            int r1 = p000.lz1.m3677(r1, r2, r3)
            java.lang.String r3 = r5.f13053
            if (r3 != 0) goto L44
            r3 = r0
            goto L48
        L44:
            int r3 = r3.hashCode()
        L48:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.Integer r3 = r5.f13054
            if (r3 != 0) goto L50
            r3 = r0
            goto L54
        L50:
            int r3 = r3.hashCode()
        L54:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.Integer r3 = r5.f13055
            if (r3 != 0) goto L5c
            r3 = r0
            goto L60
        L5c:
            int r3 = r3.hashCode()
        L60:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.Integer r3 = r5.f13056
            if (r3 != 0) goto L68
            r3 = r0
            goto L6c
        L68:
            int r3 = r3.hashCode()
        L6c:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.Integer r3 = r5.f13057
            if (r3 != 0) goto L74
            r3 = r0
            goto L78
        L74:
            int r3 = r3.hashCode()
        L78:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.Boolean r5 = r5.f13058
            if (r5 != 0) goto L7f
            goto L83
        L7f:
            int r0 = r5.hashCode()
        L83:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PetElfCampSnapshot(name="
            r0.<init>(r1)
            java.lang.String r1 = r3.f13047
            r0.append(r1)
            java.lang.String r1 = ", level="
            r0.append(r1)
            java.lang.Integer r1 = r3.f13048
            r0.append(r1)
            java.lang.String r1 = ", experience="
            r0.append(r1)
            java.lang.String r1 = r3.f13049
            r0.append(r1)
            java.lang.String r1 = ", wateringTimes="
            r0.append(r1)
            java.lang.Integer r1 = r3.f13050
            r0.append(r1)
            java.lang.String r1 = ", plots="
            r0.append(r1)
            java.util.List r1 = r3.f13051
            r0.append(r1)
            java.lang.String r1 = ", capturedAtMillis="
            r0.append(r1)
            long r1 = r3.f13052
            r0.append(r1)
            java.lang.String r1 = ", coin="
            r0.append(r1)
            java.lang.String r1 = r3.f13053
            r0.append(r1)
            java.lang.String r1 = ", lastSeedId="
            r0.append(r1)
            java.lang.Integer r1 = r3.f13054
            r0.append(r1)
            java.lang.String r1 = ", bagLastSeedId="
            r0.append(r1)
            java.lang.Integer r1 = r3.f13055
            r0.append(r1)
            java.lang.String r1 = ", doubleIncomeRemainingTimes="
            r0.append(r1)
            java.lang.Integer r1 = r3.f13056
            r0.append(r1)
            java.lang.String r1 = ", visitorCount="
            r0.append(r1)
            java.lang.Integer r1 = r3.f13057
            r0.append(r1)
            java.lang.String r1 = ", needReset="
            r0.append(r1)
            java.lang.Boolean r3 = r3.f13058
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList m7122() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r4 = r4.f13051
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.next()
            r2 = r1
            lc1 r2 = (p000.lc1) r2
            mc1 r2 = r2.f6546
            mc1 r3 = p000.mc1.f7070
            if (r2 != r3) goto Lb
            r0.add(r1)
            goto Lb
        L22:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList m7123() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r4 = r4.f13051
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.next()
            r2 = r1
            lc1 r2 = (p000.lc1) r2
            mc1 r2 = r2.f6546
            mc1 r3 = p000.mc1.f7069
            if (r2 != r3) goto Lb
            r0.add(r1)
            goto Lb
        L22:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer m7124() {
            r0 = this;
            java.lang.Integer r0 = r0.f13048
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList m7125() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r4 = r4.f13051
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.next()
            r2 = r1
            lc1 r2 = (p000.lc1) r2
            mc1 r2 = r2.f6546
            mc1 r3 = p000.mc1.f7068
            if (r2 != r3) goto Lb
            r0.add(r1)
            goto Lb
        L22:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList m7126() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r4 = r4.f13051
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.next()
            r2 = r1
            lc1 r2 = (p000.lc1) r2
            mc1 r2 = r2.f6546
            mc1 r3 = p000.mc1.f7071
            if (r2 != r3) goto Lb
            r0.add(r1)
            goto Lb
        L22:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.Long m7127() {
            r2 = this;
            java.util.ArrayList r2 = r2.m7122()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            lc1 r1 = (p000.lc1) r1
            java.lang.Long r1 = r1.f6549
            if (r1 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L21:
            java.lang.Comparable r2 = p000.AbstractC0984xh.m6649(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList m7128() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r4 = r4.f13051
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r4.next()
            r2 = r1
            lc1 r2 = (p000.lc1) r2
            mc1 r2 = r2.f6546
            mc1 r3 = p000.mc1.f7070
            if (r2 == r3) goto L22
            mc1 r3 = p000.mc1.f7071
            if (r2 != r3) goto Lb
        L22:
            r0.add(r1)
            goto Lb
        L26:
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public final java.util.List m7129() {
            r0 = this;
            java.util.List r0 = r0.f13051
            return r0
    }
}
