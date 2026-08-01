package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e52 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3412;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3413;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f3414;

    /* JADX INFO: renamed from: δ */
    public final int f3415;

    /* JADX INFO: renamed from: ε */
    public final p000.f52 f3416;

    /* JADX INFO: renamed from: ζ */
    public final long f3417;

    /* JADX INFO: renamed from: η */
    public final long f3418;

    public e52(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, p000.f52 r5, long r6, long r8) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f3412 = r1
            r0.f3413 = r2
            r0.f3414 = r3
            r0.f3415 = r4
            r0.f3416 = r5
            r0.f3417 = r6
            r0.f3418 = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L4c
        L3:
            boolean r0 = r5 instanceof p000.e52
            if (r0 != 0) goto L8
            goto L4a
        L8:
            e52 r5 = (p000.e52) r5
            java.lang.String r0 = r4.f3412
            java.lang.String r1 = r5.f3412
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4a
        L15:
            java.lang.String r0 = r4.f3413
            java.lang.String r1 = r5.f3413
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L4a
        L20:
            java.lang.String r0 = r4.f3414
            java.lang.String r1 = r5.f3414
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L4a
        L2b:
            int r0 = r4.f3415
            int r1 = r5.f3415
            if (r0 == r1) goto L32
            goto L4a
        L32:
            f52 r0 = r4.f3416
            f52 r1 = r5.f3416
            if (r0 == r1) goto L39
            goto L4a
        L39:
            long r0 = r4.f3417
            long r2 = r5.f3417
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L42
            goto L4a
        L42:
            long r0 = r4.f3418
            long r4 = r5.f3418
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L4c
        L4a:
            r4 = 0
            return r4
        L4c:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f3412
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r5.f3413
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r5.f3414
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r5.f3415
            int r0 = p000.a12.m14(r2, r0, r1)
            f52 r2 = r5.f3416
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f3417
            int r0 = p000.lz1.m3677(r2, r1, r3)
            long r1 = r5.f3418
            int r5 = java.lang.Long.hashCode(r1)
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", content="
            java.lang.String r2 = "NoticeRecord(key="
            java.lang.String r3 = r5.f3412
            java.lang.String r4 = r5.f3413
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f3414
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            int r1 = r5.f3415
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            f52 r1 = r5.f3416
            r0.append(r1)
            java.lang.String r1 = ", createdAt="
            r0.append(r1)
            long r1 = r5.f3417
            r0.append(r1)
            java.lang.String r1 = ", updatedAt="
            r0.append(r1)
            long r1 = r5.f3418
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
