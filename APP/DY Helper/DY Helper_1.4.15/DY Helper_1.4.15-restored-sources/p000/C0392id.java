package p000;

/* JADX INFO: renamed from: id */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0392id {

    /* JADX INFO: renamed from: α */
    public final long f5003;

    /* JADX INFO: renamed from: β */
    public final p000.EnumC0683pd f5004;

    /* JADX INFO: renamed from: γ */
    public final p000.zd1 f5005;

    /* JADX INFO: renamed from: δ */
    public final long f5006;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Long f5007;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Long f5008;

    /* JADX INFO: renamed from: η */
    public final java.lang.Long f5009;

    /* JADX INFO: renamed from: θ */
    public final java.util.Set f5010;

    /* JADX INFO: renamed from: ι */
    public final p000.EnumC0619od f5011;

    public /* synthetic */ C0392id(long r15, p000.EnumC0683pd r17, p000.zd1 r18, long r19, java.lang.Long r21, java.lang.Long r22, int r23) {
            r14 = this;
            r0 = r23 & 16
            r1 = 0
            if (r0 == 0) goto Lf
            if (r18 == 0) goto Lc
            java.lang.Long r0 = r18.m7127()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r9 = r0
            goto L11
        Lf:
            r9 = r21
        L11:
            r0 = r23 & 32
            if (r0 == 0) goto L17
            r10 = r1
            goto L19
        L17:
            r10 = r22
        L19:
            nz r12 = p000.C0604nz.f7825
            r11 = 0
            r13 = 0
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r2.<init>(r3, r5, r6, r7, r9, r10, r11, r12, r13)
            return
    }

    public C0392id(long r1, p000.EnumC0683pd r3, p000.zd1 r4, long r5, java.lang.Long r7, java.lang.Long r8, java.lang.Long r9, java.util.Set r10, p000.EnumC0619od r11) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f5003 = r1
            r0.f5004 = r3
            r0.f5005 = r4
            r0.f5006 = r5
            r0.f5007 = r7
            r0.f5008 = r8
            r0.f5009 = r9
            r0.f5010 = r10
            r0.f5011 = r11
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0392id m2740(p000.C0392id r12, p000.zd1 r13, int r14) {
            long r1 = r12.f5003
            r0 = r14 & 2
            if (r0 == 0) goto La
            pd r0 = r12.f5004
        L8:
            r3 = r0
            goto Ld
        La:
            pd r0 = p000.EnumC0683pd.f8505
            goto L8
        Ld:
            r14 = r14 & 4
            if (r14 == 0) goto L13
            zd1 r13 = r12.f5005
        L13:
            r4 = r13
            long r5 = r12.f5006
            java.lang.Long r7 = r12.f5007
            java.lang.Long r8 = r12.f5008
            java.lang.Long r9 = r12.f5009
            java.util.Set r10 = r12.f5010
            od r11 = r12.f5011
            r12.getClass()
            r3.getClass()
            r10.getClass()
            id r0 = new id
            r0.<init>(r1, r3, r4, r5, r7, r8, r9, r10, r11)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.C0392id
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            id r8 = (p000.C0392id) r8
            long r3 = r7.f5003
            long r5 = r8.f5003
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            pd r1 = r7.f5004
            pd r3 = r8.f5004
            if (r1 == r3) goto L1c
            return r2
        L1c:
            zd1 r1 = r7.f5005
            zd1 r3 = r8.f5005
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L27
            return r2
        L27:
            long r3 = r7.f5006
            long r5 = r8.f5006
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L30
            return r2
        L30:
            java.lang.Long r1 = r7.f5007
            java.lang.Long r3 = r8.f5007
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            java.lang.Long r1 = r7.f5008
            java.lang.Long r3 = r8.f5008
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L46
            return r2
        L46:
            java.lang.Long r1 = r7.f5009
            java.lang.Long r3 = r8.f5009
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.util.Set r1 = r7.f5010
            java.util.Set r3 = r8.f5010
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            od r7 = r7.f5011
            od r8 = r8.f5011
            if (r7 == r8) goto L63
            return r2
        L63:
            return r0
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.f5003
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            pd r2 = r5.f5004
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            zd1 r3 = r5.f5005
            if (r3 != 0) goto L18
            r3 = r0
            goto L1c
        L18:
            int r3 = r3.hashCode()
        L1c:
            int r2 = r2 + r3
            int r2 = r2 * r1
            long r3 = r5.f5006
            int r2 = p000.lz1.m3677(r2, r1, r3)
            java.lang.Long r3 = r5.f5007
            if (r3 != 0) goto L2a
            r3 = r0
            goto L2e
        L2a:
            int r3 = r3.hashCode()
        L2e:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.Long r3 = r5.f5008
            if (r3 != 0) goto L36
            r3 = r0
            goto L3a
        L36:
            int r3 = r3.hashCode()
        L3a:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.Long r3 = r5.f5009
            if (r3 != 0) goto L42
            r3 = r0
            goto L46
        L42:
            int r3 = r3.hashCode()
        L46:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.util.Set r3 = r5.f5010
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            int r3 = r3 * r1
            od r5 = r5.f5011
            if (r5 != 0) goto L55
            goto L59
        L55:
            int r0 = r5.hashCode()
        L59:
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CachedCampState(conversationShortId="
            r0.<init>(r1)
            long r1 = r3.f5003
            r0.append(r1)
            java.lang.String r1 = ", availability="
            r0.append(r1)
            pd r1 = r3.f5004
            r0.append(r1)
            java.lang.String r1 = ", snapshot="
            r0.append(r1)
            zd1 r1 = r3.f5005
            r0.append(r1)
            java.lang.String r1 = ", updatedAtMillis="
            r0.append(r1)
            long r1 = r3.f5006
            r0.append(r1)
            java.lang.String r1 = ", nextMatureAtMillis="
            r0.append(r1)
            java.lang.Long r1 = r3.f5007
            r0.append(r1)
            java.lang.String r1 = ", nextWaterAtMillis="
            r0.append(r1)
            java.lang.Long r1 = r3.f5008
            r0.append(r1)
            java.lang.String r1 = ", nextRefreshAtMillis="
            r0.append(r1)
            java.lang.Long r1 = r3.f5009
            r0.append(r1)
            java.lang.String r1 = ", pendingRefreshPlotUuids="
            r0.append(r1)
            java.util.Set r1 = r3.f5010
            r0.append(r1)
            java.lang.String r1 = ", pendingRefreshAfterAction="
            r0.append(r1)
            od r3 = r3.f5011
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final p000.EnumC0683pd m2741() {
            r0 = this;
            pd r0 = r0.f5004
            return r0
    }
}
