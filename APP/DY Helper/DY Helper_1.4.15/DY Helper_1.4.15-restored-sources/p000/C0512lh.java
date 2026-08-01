package p000;

/* JADX INFO: renamed from: lh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0512lh {

    /* JADX INFO: renamed from: α */
    public final long f6631;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f6632;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f6633;

    /* JADX INFO: renamed from: δ */
    public final boolean f6634;

    public C0512lh(long r1, java.lang.String r3, java.lang.Long r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f6631 = r1
            r0.f6632 = r3
            r0.f6633 = r4
            r0.f6634 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L31
        L3:
            boolean r0 = r5 instanceof p000.C0512lh
            if (r0 != 0) goto L8
            goto L2f
        L8:
            lh r5 = (p000.C0512lh) r5
            long r0 = r4.f6631
            long r2 = r5.f6631
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L2f
        L13:
            java.lang.String r0 = r4.f6632
            java.lang.String r1 = r5.f6632
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L2f
        L1e:
            java.lang.Long r0 = r4.f6633
            java.lang.Long r1 = r5.f6633
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L29
            goto L2f
        L29:
            boolean r4 = r4.f6634
            boolean r5 = r5.f6634
            if (r4 == r5) goto L31
        L2f:
            r4 = 0
            return r4
        L31:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f6631
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f6632
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.Long r2 = r3.f6633
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r3 = r3.f6634
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PauseCandidate(sequence="
            r0.<init>(r1)
            long r1 = r3.f6631
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r1 = r3.f6632
            r0.append(r1)
            java.lang.String r1 = ", selectionGeneration="
            r0.append(r1)
            java.lang.Long r1 = r3.f6633
            r0.append(r1)
            java.lang.String r1 = ", userInitiatedByTap="
            r0.append(r1)
            boolean r3 = r3.f6634
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
