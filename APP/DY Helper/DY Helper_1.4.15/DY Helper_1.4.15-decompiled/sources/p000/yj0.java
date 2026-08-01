package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yj0 {

    /* JADX INFO: renamed from: α */
    public final boolean f12646;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12647;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Throwable f12648;

    public yj0(boolean r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.f12646 = r1
            r0.f12647 = r2
            r0.f12648 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.yj0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            yj0 r5 = (p000.yj0) r5
            boolean r1 = r4.f12646
            boolean r3 = r5.f12646
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f12647
            java.lang.String r3 = r5.f12647
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.Throwable r4 = r4.f12648
            java.lang.Throwable r5 = r5.f12648
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f12646
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f12647
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.Throwable r3 = r3.f12648
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
            java.lang.String r1 = "MarkReadResult(success="
            r0.<init>(r1)
            boolean r1 = r2.f12646
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.f12647
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f12648
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
