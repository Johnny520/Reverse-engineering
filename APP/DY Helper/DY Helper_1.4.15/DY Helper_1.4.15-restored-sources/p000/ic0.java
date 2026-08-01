package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ic0 {

    /* JADX INFO: renamed from: α */
    public final long f4993;

    /* JADX INFO: renamed from: β */
    public final long f4994;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f4995;

    /* JADX INFO: renamed from: δ */
    public final p000.uw0 f4996;

    /* JADX INFO: renamed from: ε */
    public final long f4997;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f4998;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f4999;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f5000;

    public ic0(long r1, long r3, java.lang.String r5, p000.uw0 r6, long r7, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.f4993 = r1
            r0.f4994 = r3
            r0.f4995 = r5
            r0.f4996 = r6
            r0.f4997 = r7
            r0.f4998 = r9
            r0.f4999 = r10
            r0.f5000 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L5d
        L3:
            boolean r0 = r5 instanceof p000.ic0
            if (r0 != 0) goto L8
            goto L5b
        L8:
            ic0 r5 = (p000.ic0) r5
            long r0 = r4.f4993
            long r2 = r5.f4993
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L5b
        L13:
            long r0 = r4.f4994
            long r2 = r5.f4994
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            goto L5b
        L1c:
            java.lang.String r0 = r4.f4995
            java.lang.String r1 = r5.f4995
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L5b
        L27:
            uw0 r0 = r4.f4996
            uw0 r1 = r5.f4996
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L5b
        L32:
            long r0 = r4.f4997
            long r2 = r5.f4997
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            goto L5b
        L3b:
            java.lang.String r0 = r4.f4998
            java.lang.String r1 = r5.f4998
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5b
        L46:
            java.lang.String r0 = r4.f4999
            java.lang.String r1 = r5.f4999
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L51
            goto L5b
        L51:
            java.lang.String r4 = r4.f5000
            java.lang.String r5 = r5.f5000
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L5d
        L5b:
            r4 = 0
            return r4
        L5d:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.f4993
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r5.f4994
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r2 = r5.f4995
            int r0 = p000.a12.m15(r0, r1, r2)
            uw0 r2 = r5.f4996
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f4997
            int r0 = p000.lz1.m3677(r2, r1, r3)
            java.lang.String r2 = r5.f4998
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r5.f4999
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r5 = r5.f5000
            int r5 = r5.hashCode()
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GroupApplyRequest(applyId="
            r0.<init>(r1)
            long r1 = r4.f4993
            r0.append(r1)
            java.lang.String r1 = ", userId="
            r0.append(r1)
            long r1 = r4.f4994
            r0.append(r1)
            java.lang.String r1 = ", secUid="
            r0.append(r1)
            java.lang.String r1 = r4.f4995
            r0.append(r1)
            java.lang.String r1 = ", group="
            r0.append(r1)
            uw0 r1 = r4.f4996
            r0.append(r1)
            java.lang.String r1 = ", createdAtMillis="
            r0.append(r1)
            long r1 = r4.f4997
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r1 = r4.f4998
            r0.append(r1)
            java.lang.String r1 = ", auditAnswer="
            java.lang.String r2 = ", auditQuestion="
            java.lang.String r3 = r4.f4999
            java.lang.String r4 = r4.f5000
            p000.AbstractC0602nx.m4119(r0, r1, r3, r2, r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
