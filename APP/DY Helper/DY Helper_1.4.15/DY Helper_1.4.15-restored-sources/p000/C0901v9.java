package p000;

/* JADX INFO: renamed from: v9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0901v9 {

    /* JADX INFO: renamed from: α */
    public final boolean f11181;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f11182;

    /* JADX INFO: renamed from: γ */
    public final p000.C0864u9 f11183;

    public C0901v9(boolean r1, java.lang.String r2, p000.C0864u9 r3) {
            r0 = this;
            r0.<init>()
            r0.f11181 = r1
            r0.f11182 = r2
            r0.f11183 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.C0901v9
            if (r0 != 0) goto L8
            goto L26
        L8:
            v9 r3 = (p000.C0901v9) r3
            boolean r0 = r2.f11181
            boolean r1 = r3.f11181
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f11182
            java.lang.String r1 = r3.f11182
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            u9 r2 = r2.f11183
            u9 r3 = r3.f11183
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f11181
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f11182
            int r0 = p000.a12.m15(r0, r1, r2)
            u9 r3 = r3.f11183
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CheckResult(found="
            r0.<init>(r1)
            boolean r1 = r2.f11181
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.f11182
            r0.append(r1)
            java.lang.String r1 = ", userInfo="
            r0.append(r1)
            u9 r2 = r2.f11183
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
