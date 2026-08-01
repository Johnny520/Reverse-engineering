package p000;

/* JADX INFO: renamed from: ks */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0486ks {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f6098;

    /* JADX INFO: renamed from: β */
    public final long f6099;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f6100;

    public C0486ks(long r1, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f6098 = r3
            r0.f6099 = r1
            r0.f6100 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2a
        L3:
            boolean r0 = r5 instanceof p000.C0486ks
            if (r0 != 0) goto L8
            goto L28
        L8:
            ks r5 = (p000.C0486ks) r5
            java.lang.String r0 = r4.f6098
            java.lang.String r1 = r5.f6098
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L28
        L15:
            long r0 = r4.f6099
            long r2 = r5.f6099
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L28
        L1e:
            java.lang.String r4 = r4.f6100
            java.lang.String r5 = r5.f6100
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
            java.lang.String r0 = r4.f6098
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f6099
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r4 = r4.f6100
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "HostVersionInfo(packageName="
            java.lang.String r1 = ", versionCode="
            java.lang.String r2 = r5.f6098
            long r3 = r5.f6099
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r2, r3, r1)
            java.lang.String r1 = ", versionName="
            java.lang.String r2 = ")"
            java.lang.String r5 = r5.f6100
            java.lang.String r5 = p000.AbstractC0602nx.m4133(r0, r1, r5, r2)
            return r5
    }
}
