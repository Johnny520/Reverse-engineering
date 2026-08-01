package p000;

/* JADX INFO: renamed from: ee */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0245ee {

    /* JADX INFO: renamed from: α */
    public p000.InterfaceC1031yr f3514;

    /* JADX INFO: renamed from: β */
    public p000.np0 f3515;

    /* JADX INFO: renamed from: γ */
    public p000.InterfaceC0209de f3516;

    /* JADX INFO: renamed from: δ */
    public long f3517;

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.C0245ee
            if (r0 != 0) goto L8
            goto L31
        L8:
            ee r3 = (p000.C0245ee) r3
            yr r0 = r2.f3514
            yr r1 = r3.f3514
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            np0 r0 = r2.f3515
            np0 r1 = r3.f3515
            if (r0 == r1) goto L1c
            goto L31
        L1c:
            de r0 = r2.f3516
            de r1 = r3.f3516
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            long r0 = r2.f3517
            long r2 = r3.f3517
            boolean r2 = p000.jw1.m2997(r0, r2)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            yr r0 = r3.f3514
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            np0 r1 = r3.f3515
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            de r0 = r3.f3516
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.f3517
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DrawParams(density="
            r0.<init>(r1)
            yr r1 = r3.f3514
            r0.append(r1)
            java.lang.String r1 = ", layoutDirection="
            r0.append(r1)
            np0 r1 = r3.f3515
            r0.append(r1)
            java.lang.String r1 = ", canvas="
            r0.append(r1)
            de r1 = r3.f3516
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.f3517
            java.lang.String r3 = p000.jw1.m2999(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
