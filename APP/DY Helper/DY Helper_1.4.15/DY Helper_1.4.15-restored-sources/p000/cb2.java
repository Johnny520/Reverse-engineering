package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cb2 {

    /* JADX INFO: renamed from: α */
    public final java.io.File f2057;

    /* JADX INFO: renamed from: β */
    public final long f2058;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f2059;

    public cb2(java.io.File r1, long r2, java.util.List r4) {
            r0 = this;
            r0.<init>()
            r0.f2057 = r1
            r0.f2058 = r2
            r0.f2059 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2a
        L3:
            boolean r0 = r5 instanceof p000.cb2
            if (r0 != 0) goto L8
            goto L28
        L8:
            cb2 r5 = (p000.cb2) r5
            java.io.File r0 = r4.f2057
            java.io.File r1 = r5.f2057
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L28
        L15:
            long r0 = r4.f2058
            long r2 = r5.f2058
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L28
        L1e:
            java.util.List r4 = r4.f2059
            java.util.List r5 = r5.f2059
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2a
        L28:
            r4 = 0
            return r4
        L2a:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.io.File r0 = r4.f2057
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f2058
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.util.List r4 = r4.f2059
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VoiceReplacement(file="
            r0.<init>(r1)
            java.io.File r1 = r3.f2057
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            long r1 = r3.f2058
            r0.append(r1)
            java.lang.String r1 = ", wave="
            r0.append(r1)
            java.util.List r3 = r3.f2059
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
