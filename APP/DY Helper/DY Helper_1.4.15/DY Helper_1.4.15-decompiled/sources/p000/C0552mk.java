package p000;

/* JADX INFO: renamed from: mk */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0552mk {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7186;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7187;

    /* JADX INFO: renamed from: γ */
    public final boolean f7188;

    /* JADX INFO: renamed from: δ */
    public final boolean f7189;

    /* JADX INFO: renamed from: ε */
    public final boolean f7190;

    public C0552mk(java.lang.String r1, boolean r2, boolean r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f7186 = r1
            r0.f7187 = r4
            r0.f7188 = r2
            r0.f7189 = r3
            r0.f7190 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L36
        L3:
            boolean r0 = r3 instanceof p000.C0552mk
            if (r0 != 0) goto L8
            goto L34
        L8:
            mk r3 = (p000.C0552mk) r3
            java.lang.String r0 = r2.f7186
            java.lang.String r1 = r3.f7186
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L34
        L15:
            java.lang.String r0 = r2.f7187
            java.lang.String r1 = r3.f7187
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L34
        L20:
            boolean r0 = r2.f7188
            boolean r1 = r3.f7188
            if (r0 == r1) goto L27
            goto L34
        L27:
            boolean r0 = r2.f7189
            boolean r1 = r3.f7189
            if (r0 == r1) goto L2e
            goto L34
        L2e:
            boolean r2 = r2.f7190
            boolean r3 = r3.f7190
            if (r2 == r3) goto L36
        L34:
            r2 = 0
            return r2
        L36:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7186
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7187
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f7188
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f7189
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f7190
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ", supportsVisibility="
            java.lang.String r2 = "CommentControlMenuControl(id="
            java.lang.String r3 = r5.f7186
            java.lang.String r4 = r5.f7187
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", supportsAlpha="
            java.lang.String r2 = ", supportsColor="
            boolean r3 = r5.f7188
            boolean r4 = r5.f7189
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r5 = r5.f7190
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
