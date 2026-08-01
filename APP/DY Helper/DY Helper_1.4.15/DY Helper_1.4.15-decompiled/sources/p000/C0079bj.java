package p000;

/* JADX INFO: renamed from: bj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0079bj {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f1732;

    /* JADX INFO: renamed from: β */
    public final boolean f1733;

    /* JADX INFO: renamed from: γ */
    public final long f1734;

    public C0079bj(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.<init>()
            r2.f1732 = r3
            r2.f1733 = r4
            r2.f1734 = r0
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L26
        L3:
            boolean r0 = r3 instanceof p000.C0079bj
            if (r0 != 0) goto L8
            goto L24
        L8:
            bj r3 = (p000.C0079bj) r3
            java.lang.String r0 = r2.f1732
            java.lang.String r1 = r3.f1732
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L24
        L15:
            boolean r0 = r2.f1733
            boolean r1 = r3.f1733
            if (r0 == r1) goto L1c
            goto L24
        L1c:
            long r0 = r2.f1734
            long r2 = r3.f1734
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L26
        L24:
            r2 = 0
            return r2
        L26:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f1732
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f1733
            int r0 = p000.lz1.m3678(r0, r1, r2)
            long r1 = r3.f1734
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AudioEntry(url="
            r0.<init>(r1)
            java.lang.String r1 = r3.f1732
            r0.append(r1)
            java.lang.String r1 = ", isCdn="
            r0.append(r1)
            boolean r1 = r3.f1733
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.f1734
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final boolean m965() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f1734
            long r0 = r0 - r2
            r2 = 600000(0x927c0, double:2.964394E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            r4 = 1
            return r4
        L10:
            r4 = 0
            return r4
    }
}
