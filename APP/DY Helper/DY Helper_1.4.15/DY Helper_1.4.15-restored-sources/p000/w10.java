package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w10 {

    /* JADX INFO: renamed from: α */
    public final java.lang.ref.WeakReference f11514;

    /* JADX INFO: renamed from: β */
    public final float f11515;

    /* JADX INFO: renamed from: γ */
    public final float f11516;

    /* JADX INFO: renamed from: δ */
    public final long f11517;

    /* JADX INFO: renamed from: ε */
    public final long f11518;

    public w10(java.lang.ref.WeakReference r1, float r2, float r3, long r4, long r6) {
            r0 = this;
            r0.<init>()
            r0.f11514 = r1
            r0.f11515 = r2
            r0.f11516 = r3
            r0.f11517 = r4
            r0.f11518 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3e
        L3:
            boolean r0 = r5 instanceof p000.w10
            if (r0 != 0) goto L8
            goto L3c
        L8:
            w10 r5 = (p000.w10) r5
            java.lang.ref.WeakReference r0 = r4.f11514
            java.lang.ref.WeakReference r1 = r5.f11514
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            float r0 = r4.f11515
            float r1 = r5.f11515
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L3c
        L20:
            float r0 = r4.f11516
            float r1 = r5.f11516
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L2b
            goto L3c
        L2b:
            long r0 = r4.f11517
            long r2 = r5.f11517
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            goto L3c
        L34:
            long r0 = r4.f11518
            long r4 = r5.f11518
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L3e
        L3c:
            r4 = 0
            return r4
        L3e:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f11514
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float r2 = r4.f11515
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r4.f11516
            int r0 = p000.lz1.m3676(r2, r0, r1)
            long r2 = r4.f11517
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r1 = r4.f11518
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HostTouch(activityRef="
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = r3.f11514
            r0.append(r1)
            java.lang.String r1 = ", rawX="
            r0.append(r1)
            float r1 = r3.f11515
            r0.append(r1)
            java.lang.String r1 = ", rawY="
            r0.append(r1)
            float r1 = r3.f11516
            r0.append(r1)
            java.lang.String r1 = ", eventTime="
            r0.append(r1)
            long r1 = r3.f11517
            r0.append(r1)
            java.lang.String r1 = ", recordedAt="
            r0.append(r1)
            long r1 = r3.f11518
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
