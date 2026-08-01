package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class th0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f10373;

    /* JADX INFO: renamed from: β */
    public final int f10374;

    /* JADX INFO: renamed from: γ */
    public final long f10375;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f10376;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f10377;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f10378;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f10379;

    /* JADX INFO: renamed from: θ */
    public final long f10380;

    public th0(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9) {
            r0 = this;
            r0.<init>()
            r0.f10373 = r1
            r0.f10374 = r2
            r0.f10375 = r3
            r0.f10376 = r5
            r0.f10377 = r6
            r0.f10378 = r7
            r0.f10379 = r8
            r0.f10380 = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L5b
        L3:
            boolean r0 = r5 instanceof p000.th0
            if (r0 != 0) goto L8
            goto L59
        L8:
            th0 r5 = (p000.th0) r5
            java.lang.String r0 = r4.f10373
            java.lang.String r1 = r5.f10373
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L59
        L15:
            int r0 = r4.f10374
            int r1 = r5.f10374
            if (r0 == r1) goto L1c
            goto L59
        L1c:
            long r0 = r4.f10375
            long r2 = r5.f10375
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L25
            goto L59
        L25:
            java.lang.String r0 = r4.f10376
            java.lang.String r1 = r5.f10376
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L59
        L30:
            java.lang.String r0 = r4.f10377
            java.lang.String r1 = r5.f10377
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L59
        L3b:
            java.lang.String r0 = r4.f10378
            java.lang.String r1 = r5.f10378
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L59
        L46:
            java.lang.String r0 = r4.f10379
            java.lang.String r1 = r5.f10379
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L51
            goto L59
        L51:
            long r0 = r4.f10380
            long r4 = r5.f10380
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L5b
        L59:
            r4 = 0
            return r4
        L5b:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f10373
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f10374
            int r0 = p000.a12.m14(r2, r0, r1)
            long r2 = r4.f10375
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r2 = r4.f10376
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f10377
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f10378
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f10379
            int r0 = p000.a12.m15(r0, r1, r2)
            long r1 = r4.f10380
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", conversationType="
            java.lang.String r1 = ", otherUid="
            int r2 = r5.f10374
            java.lang.String r3 = "Entry(conversationId="
            java.lang.String r4 = r5.f10373
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4135(r2, r3, r4, r0, r1)
            long r1 = r5.f10375
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.f10376
            r0.append(r1)
            java.lang.String r1 = ", subtitle="
            java.lang.String r2 = ", stableKey="
            java.lang.String r3 = r5.f10377
            java.lang.String r4 = r5.f10378
            p000.AbstractC0602nx.m4119(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", searchText="
            r0.append(r1)
            java.lang.String r1 = r5.f10379
            r0.append(r1)
            java.lang.String r1 = ", updateAt="
            r0.append(r1)
            long r1 = r5.f10380
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m5712() {
            r5 = this;
            r0 = 0
            long r2 = r5.f10375
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            st r1 = p000.C0810st.f10010
            java.lang.String r1 = p000.C0810st.m5555(r2)
            if (r1 == 0) goto L17
            boolean r4 = p000.q02.m4671(r1)
            if (r4 != 0) goto L17
            return r1
        L17:
            java.lang.String r1 = r5.f10376
            boolean r4 = p000.q02.m4671(r1)
            if (r4 == 0) goto L34
            if (r0 <= 0) goto L28
            java.lang.String r5 = "UID: "
            java.lang.String r5 = p000.AbstractC0602nx.m4126(r2, r5)
            return r5
        L28:
            java.lang.String r5 = r5.f10373
            boolean r0 = p000.q02.m4671(r5)
            if (r0 != 0) goto L31
            return r5
        L31:
            java.lang.String r5 = "未知会话"
            return r5
        L34:
            return r1
    }
}
