package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xi0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f12180;

    /* JADX INFO: renamed from: β */
    public final long f12181;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f12182;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f12183;

    /* JADX INFO: renamed from: ε */
    public final p000.nj0 f12184;

    /* JADX INFO: renamed from: ζ */
    public final boolean f12185;

    /* JADX INFO: renamed from: η */
    public final long f12186;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f12187;

    public xi0(java.lang.String r1, long r2, java.lang.String r4, java.lang.String r5, p000.nj0 r6, boolean r7, long r8, java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.f12180 = r1
            r0.f12181 = r2
            r0.f12182 = r4
            r0.f12183 = r5
            r0.f12184 = r6
            r0.f12185 = r7
            r0.f12186 = r8
            r0.f12187 = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L57
        L3:
            boolean r0 = r5 instanceof p000.xi0
            if (r0 != 0) goto L8
            goto L55
        L8:
            xi0 r5 = (p000.xi0) r5
            java.lang.String r0 = r4.f12180
            java.lang.String r1 = r5.f12180
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L55
        L15:
            long r0 = r4.f12181
            long r2 = r5.f12181
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L55
        L1e:
            java.lang.String r0 = r4.f12182
            java.lang.String r1 = r5.f12182
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L55
        L29:
            java.lang.String r0 = r4.f12183
            java.lang.String r1 = r5.f12183
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            goto L55
        L34:
            nj0 r0 = r4.f12184
            nj0 r1 = r5.f12184
            if (r0 == r1) goto L3b
            goto L55
        L3b:
            boolean r0 = r4.f12185
            boolean r1 = r5.f12185
            if (r0 == r1) goto L42
            goto L55
        L42:
            long r0 = r4.f12186
            long r2 = r5.f12186
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4b
            goto L55
        L4b:
            java.lang.String r4 = r4.f12187
            java.lang.String r5 = r5.f12187
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L57
        L55:
            r4 = 0
            return r4
        L57:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f12180
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f12181
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r2 = r4.f12182
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f12183
            int r0 = p000.a12.m15(r0, r1, r2)
            nj0 r2 = r4.f12184
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.f12185
            int r0 = p000.lz1.m3678(r2, r1, r0)
            long r2 = r4.f12186
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r4 = r4.f12187
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "IMConversationDeleteItem(conversationId="
            java.lang.String r1 = ", otherUid="
            java.lang.String r2 = r5.f12180
            long r3 = r5.f12181
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r2, r3, r1)
            java.lang.String r1 = ", displayName="
            java.lang.String r2 = ", fallbackTitle="
            java.lang.String r3 = r5.f12182
            java.lang.String r4 = r5.f12183
            p000.AbstractC0602nx.m4119(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", relation="
            r0.append(r1)
            nj0 r1 = r5.f12184
            r0.append(r1)
            java.lang.String r1 = ", isStranger="
            r0.append(r1)
            boolean r1 = r5.f12185
            r0.append(r1)
            java.lang.String r1 = ", updateAt="
            java.lang.String r2 = ", searchText="
            long r3 = r5.f12186
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f12187
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final boolean m6673() {
            r1 = this;
            java.lang.String r0 = r1.f12182
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L13
            java.lang.String r1 = r1.f12183
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m6674() {
            r2 = this;
            java.lang.String r0 = r2.f12182
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L13
            java.lang.String r2 = r2.f12183
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L12
            java.lang.String r2 = "名称解析中"
        L12:
            return r2
        L13:
            return r0
    }
}
