package p000;

/* JADX INFO: renamed from: bp */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0085bp {

    /* JADX INFO: renamed from: α */
    public final int f1796;

    /* JADX INFO: renamed from: β */
    public final long f1797;

    /* JADX INFO: renamed from: γ */
    public final p000.EnumC0183cp f1798;

    /* JADX INFO: renamed from: δ */
    public final p000.y21 f1799;

    public C0085bp(int r1, long r2, p000.EnumC0183cp r4, p000.y21 r5) {
            r0 = this;
            r0.<init>()
            r0.f1796 = r1
            r0.f1797 = r2
            r0.f1798 = r4
            r0.f1799 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2d
        L3:
            boolean r0 = r5 instanceof p000.C0085bp
            if (r0 != 0) goto L8
            goto L2b
        L8:
            bp r5 = (p000.C0085bp) r5
            int r0 = r4.f1796
            int r1 = r5.f1796
            if (r0 == r1) goto L11
            goto L2b
        L11:
            long r0 = r4.f1797
            long r2 = r5.f1797
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            goto L2b
        L1a:
            cp r0 = r4.f1798
            cp r1 = r5.f1798
            if (r0 == r1) goto L21
            goto L2b
        L21:
            y21 r4 = r4.f1799
            y21 r5 = r5.f1799
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L2d
        L2b:
            r4 = 0
            return r4
        L2d:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f1796
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f1797
            int r0 = p000.lz1.m3677(r0, r1, r2)
            cp r2 = r4.f1798
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            y21 r4 = r4.f1799
            if (r4 != 0) goto L1d
            r4 = 0
            goto L21
        L1d:
            int r4 = r4.hashCode()
        L21:
            int r2 = r2 + r4
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentCaptureEvent(id="
            r0.<init>(r1)
            int r1 = r3.f1796
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.f1797
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            cp r1 = r3.f1798
            r0.append(r1)
            java.lang.String r1 = ", structureCompat="
            r0.append(r1)
            y21 r3 = r3.f1799
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
