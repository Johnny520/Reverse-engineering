package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y00 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f12408;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12409;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f12410;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f12411;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f12412;

    /* JADX INFO: renamed from: ζ */
    public final int f12413;

    /* JADX INFO: renamed from: η */
    public final int f12414;

    /* JADX INFO: renamed from: θ */
    public final int f12415;

    /* JADX INFO: renamed from: ι */
    public final int f12416;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f12417;

    /* JADX INFO: renamed from: λ */
    public final long f12418;

    public y00(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, int r9, java.lang.String r10, long r11) {
            r0 = this;
            r0.<init>()
            r0.f12408 = r1
            r0.f12409 = r2
            r0.f12410 = r3
            r0.f12411 = r4
            r0.f12412 = r5
            r0.f12413 = r6
            r0.f12414 = r7
            r0.f12415 = r8
            r0.f12416 = r9
            r0.f12417 = r10
            r0.f12418 = r11
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L74
        L4:
            boolean r0 = r3 instanceof p000.y00
            if (r0 != 0) goto La
            goto L72
        La:
            y00 r3 = (p000.y00) r3
            java.lang.String r0 = r2.f12408
            java.lang.String r1 = r3.f12408
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L72
        L17:
            java.lang.String r0 = r2.f12409
            java.lang.String r1 = r3.f12409
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L22
            goto L72
        L22:
            java.lang.String r0 = r2.f12410
            java.lang.String r1 = r3.f12410
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2d
            goto L72
        L2d:
            java.lang.String r0 = r2.f12411
            java.lang.String r1 = r3.f12411
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L38
            goto L72
        L38:
            java.lang.String r0 = r2.f12412
            java.lang.String r1 = r3.f12412
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L43
            goto L72
        L43:
            int r0 = r2.f12413
            int r1 = r3.f12413
            if (r0 == r1) goto L4a
            goto L72
        L4a:
            int r0 = r2.f12414
            int r1 = r3.f12414
            if (r0 == r1) goto L51
            goto L72
        L51:
            int r0 = r2.f12415
            int r1 = r3.f12415
            if (r0 == r1) goto L58
            goto L72
        L58:
            int r0 = r2.f12416
            int r1 = r3.f12416
            if (r0 == r1) goto L5f
            goto L72
        L5f:
            java.lang.String r0 = r2.f12417
            java.lang.String r1 = r3.f12417
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L6a
            goto L72
        L6a:
            long r0 = r2.f12418
            long r2 = r3.f12418
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L74
        L72:
            r2 = 0
            return r2
        L74:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f12408
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f12409
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f12410
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f12411
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f12412
            if (r3 != 0) goto L34
            r3 = r2
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f12413
            int r0 = p000.a12.m14(r3, r0, r1)
            int r3 = r4.f12414
            int r0 = p000.a12.m14(r3, r0, r1)
            int r3 = r4.f12415
            int r0 = p000.a12.m14(r3, r0, r1)
            int r3 = r4.f12416
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.String r3 = r4.f12417
            if (r3 != 0) goto L57
            goto L5b
        L57:
            int r2 = r3.hashCode()
        L5b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r1 = r4.f12418
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", uniqueId="
            java.lang.String r1 = ", uid="
            java.lang.String r2 = "AuthorData(nickname="
            java.lang.String r3 = r5.f12408
            java.lang.String r4 = r5.f12409
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", secUid="
            java.lang.String r2 = ", signature="
            java.lang.String r3 = r5.f12410
            java.lang.String r4 = r5.f12411
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f12412
            r0.append(r1)
            java.lang.String r1 = ", followerCount="
            r0.append(r1)
            int r1 = r5.f12413
            r0.append(r1)
            java.lang.String r1 = ", followingCount="
            r0.append(r1)
            java.lang.String r1 = ", awemeCount="
            java.lang.String r2 = ", verificationType="
            int r3 = r5.f12414
            int r4 = r5.f12415
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", ipLocation="
            java.lang.String r2 = ", liveStatus="
            int r3 = r5.f12416
            java.lang.String r4 = r5.f12417
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            long r1 = r5.f12418
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final int m6803() {
            r0 = this;
            int r0 = r0.f12415
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final int m6804() {
            r0 = this;
            int r0 = r0.f12413
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final int m6805() {
            r0 = this;
            int r0 = r0.f12414
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.String m6806() {
            r0 = this;
            java.lang.String r0 = r0.f12417
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final long m6807() {
            r2 = this;
            long r0 = r2.f12418
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String m6808() {
            r0 = this;
            java.lang.String r0 = r0.f12408
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.String m6809() {
            r0 = this;
            java.lang.String r0 = r0.f12412
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final java.lang.String m6810() {
            r0 = this;
            java.lang.String r0 = r0.f12409
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public final int m6811() {
            r0 = this;
            int r0 = r0.f12416
            return r0
    }
}
