package p000;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0203d8 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f2937;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f2938;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f2939;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f2940;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f2941;

    /* JADX INFO: renamed from: ζ */
    public final int f2942;

    /* JADX INFO: renamed from: η */
    public final int f2943;

    /* JADX INFO: renamed from: θ */
    public final int f2944;

    /* JADX INFO: renamed from: ι */
    public final int f2945;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f2946;

    /* JADX INFO: renamed from: λ */
    public final long f2947;

    public C0203d8(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, int r9, java.lang.String r10, long r11) {
            r0 = this;
            r0.<init>()
            r0.f2937 = r1
            r0.f2938 = r2
            r0.f2939 = r3
            r0.f2940 = r4
            r0.f2941 = r5
            r0.f2942 = r6
            r0.f2943 = r7
            r0.f2944 = r8
            r0.f2945 = r9
            r0.f2946 = r10
            r0.f2947 = r11
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L74
        L4:
            boolean r0 = r3 instanceof p000.C0203d8
            if (r0 != 0) goto La
            goto L72
        La:
            d8 r3 = (p000.C0203d8) r3
            java.lang.String r0 = r2.f2937
            java.lang.String r1 = r3.f2937
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L72
        L17:
            java.lang.String r0 = r2.f2938
            java.lang.String r1 = r3.f2938
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L22
            goto L72
        L22:
            java.lang.String r0 = r2.f2939
            java.lang.String r1 = r3.f2939
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2d
            goto L72
        L2d:
            java.lang.String r0 = r2.f2940
            java.lang.String r1 = r3.f2940
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L38
            goto L72
        L38:
            java.lang.String r0 = r2.f2941
            java.lang.String r1 = r3.f2941
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L43
            goto L72
        L43:
            int r0 = r2.f2942
            int r1 = r3.f2942
            if (r0 == r1) goto L4a
            goto L72
        L4a:
            int r0 = r2.f2943
            int r1 = r3.f2943
            if (r0 == r1) goto L51
            goto L72
        L51:
            int r0 = r2.f2944
            int r1 = r3.f2944
            if (r0 == r1) goto L58
            goto L72
        L58:
            int r0 = r2.f2945
            int r1 = r3.f2945
            if (r0 == r1) goto L5f
            goto L72
        L5f:
            java.lang.String r0 = r2.f2946
            java.lang.String r1 = r3.f2946
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L6a
            goto L72
        L6a:
            long r0 = r2.f2947
            long r2 = r3.f2947
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
            java.lang.String r0 = r4.f2937
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f2938
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f2939
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f2940
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f2941
            if (r3 != 0) goto L34
            r3 = r2
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f2942
            int r0 = p000.a12.m14(r3, r0, r1)
            int r3 = r4.f2943
            int r0 = p000.a12.m14(r3, r0, r1)
            int r3 = r4.f2944
            int r0 = p000.a12.m14(r3, r0, r1)
            int r3 = r4.f2945
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.String r3 = r4.f2946
            if (r3 != 0) goto L57
            goto L5b
        L57:
            int r2 = r3.hashCode()
        L5b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r1 = r4.f2947
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", uniqueId="
            java.lang.String r1 = ", uid="
            java.lang.String r2 = "Snapshot(nickname="
            java.lang.String r3 = r5.f2937
            java.lang.String r4 = r5.f2938
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", secUid="
            java.lang.String r2 = ", signature="
            java.lang.String r3 = r5.f2939
            java.lang.String r4 = r5.f2940
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f2941
            r0.append(r1)
            java.lang.String r1 = ", followerCount="
            r0.append(r1)
            int r1 = r5.f2942
            r0.append(r1)
            java.lang.String r1 = ", followingCount="
            r0.append(r1)
            java.lang.String r1 = ", awemeCount="
            java.lang.String r2 = ", verificationType="
            int r3 = r5.f2943
            int r4 = r5.f2944
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", ipLocation="
            java.lang.String r2 = ", liveStatus="
            int r3 = r5.f2945
            java.lang.String r4 = r5.f2946
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            long r1 = r5.f2947
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
