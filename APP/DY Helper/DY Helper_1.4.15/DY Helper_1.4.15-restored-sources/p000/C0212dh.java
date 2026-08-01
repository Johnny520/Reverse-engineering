package p000;

/* JADX INFO: renamed from: dh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0212dh {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3157;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3158;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f3159;

    public C0212dh(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f3157 = r1
            r0.f3158 = r2
            r0.f3159 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.C0212dh
            if (r0 != 0) goto L8
            goto L2a
        L8:
            dh r3 = (p000.C0212dh) r3
            java.lang.String r0 = r2.f3157
            java.lang.String r1 = r3.f3157
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f3158
            java.lang.String r1 = r3.f3158
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r2 = r2.f3159
            java.lang.String r3 = r3.f3159
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3157
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3158
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f3159
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", displayName="
            java.lang.String r1 = ", callbackReason="
            java.lang.String r2 = "RegisterTarget(className="
            java.lang.String r3 = r5.f3157
            java.lang.String r4 = r5.f3158
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f3159
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
