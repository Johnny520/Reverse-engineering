package p000;

/* JADX INFO: renamed from: cs */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0186cs {

    /* JADX INFO: renamed from: α */
    public final long f2732;

    /* JADX INFO: renamed from: β */
    public final long f2733;

    public C0186cs(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f2732 = r1
            r0.f2733 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1d
        L3:
            boolean r0 = r5 instanceof p000.C0186cs
            if (r0 != 0) goto L8
            goto L1f
        L8:
            cs r5 = (p000.C0186cs) r5
            long r0 = r5.f2732
            long r2 = r4.f2732
            boolean r0 = p000.bn0.m985(r2, r0)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            long r0 = r4.f2733
            long r4 = r5.f2733
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L1f
        L1d:
            r4 = 1
            return r4
        L1f:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f2732
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f2733
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }
}
