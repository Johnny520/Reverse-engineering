package p000;

/* JADX INFO: renamed from: hf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0357hf {

    /* JADX INFO: renamed from: α */
    public java.lang.ref.WeakReference f4710;

    /* JADX INFO: renamed from: β */
    public int f4711;

    /* JADX INFO: renamed from: γ */
    public float f4712;

    /* JADX INFO: renamed from: δ */
    public long f4713;

    /* JADX INFO: renamed from: ε */
    public int f4714;

    /* JADX INFO: renamed from: ζ */
    public long f4715;

    /* JADX INFO: renamed from: η */
    public java.util.List f4716;

    /* JADX INFO: renamed from: θ */
    public long f4717;

    public C0357hf() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f4710 = r0
            r0 = -1
            r3.f4711 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f4712 = r0
            r0 = 0
            r3.f4713 = r0
            r2 = 0
            r3.f4714 = r2
            r3.f4715 = r0
            jz r0 = p000.C0450jz.f5672
            r3.f4716 = r0
            r0 = -1
            r3.f4717 = r0
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L55
        L3:
            boolean r0 = r5 instanceof p000.C0357hf
            if (r0 != 0) goto L8
            goto L53
        L8:
            hf r5 = (p000.C0357hf) r5
            java.lang.ref.WeakReference r0 = r4.f4710
            java.lang.ref.WeakReference r1 = r5.f4710
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L53
        L15:
            int r0 = r4.f4711
            int r1 = r5.f4711
            if (r0 == r1) goto L1c
            goto L53
        L1c:
            float r0 = r4.f4712
            float r1 = r5.f4712
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L27
            goto L53
        L27:
            long r0 = r4.f4713
            long r2 = r5.f4713
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L30
            goto L53
        L30:
            int r0 = r4.f4714
            int r1 = r5.f4714
            if (r0 == r1) goto L37
            goto L53
        L37:
            long r0 = r4.f4715
            long r2 = r5.f4715
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L40
            goto L53
        L40:
            java.util.List r0 = r4.f4716
            java.util.List r1 = r5.f4716
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L53
        L4b:
            long r0 = r4.f4717
            long r4 = r5.f4717
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L55
        L53:
            r4 = 0
            return r4
        L55:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f4710
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f4711
            int r0 = p000.a12.m14(r2, r0, r1)
            float r2 = r4.f4712
            int r0 = p000.lz1.m3676(r2, r0, r1)
            long r2 = r4.f4713
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r2 = r4.f4714
            int r0 = p000.a12.m14(r2, r0, r1)
            long r2 = r4.f4715
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.util.List r2 = r4.f4716
            int r0 = p000.a12.m16(r2, r0, r1)
            long r1 = r4.f4717
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r12 = this;
            java.lang.ref.WeakReference r0 = r12.f4710
            int r1 = r12.f4711
            float r2 = r12.f4712
            long r3 = r12.f4713
            int r5 = r12.f4714
            long r6 = r12.f4715
            java.util.List r8 = r12.f4716
            long r9 = r12.f4717
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r11 = "SeekBarState(awemeRef="
            r12.<init>(r11)
            r12.append(r0)
            java.lang.String r0 = ", lastIndex="
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = ", progressRatio="
            r12.append(r0)
            r12.append(r2)
            java.lang.String r0 = ", lastCheckAt="
            r12.append(r0)
            r12.append(r3)
            java.lang.String r0 = ", resolveAttempts="
            r12.append(r0)
            r12.append(r5)
            java.lang.String r0 = ", nextResolveAt="
            r12.append(r0)
            r12.append(r6)
            java.lang.String r0 = ", cachedSegments="
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = ", cachedDurationMs="
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = ")"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            return r12
    }
}
