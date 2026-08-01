package p000;

/* JADX INFO: renamed from: qd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0720qd {

    /* JADX INFO: renamed from: α */
    public final boolean f8963;

    /* JADX INFO: renamed from: β */
    public final boolean f8964;

    /* JADX INFO: renamed from: γ */
    public final boolean f8965;

    /* JADX INFO: renamed from: δ */
    public final p000.EnumC0831td f8966;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Integer f8967;

    /* JADX INFO: renamed from: ζ */
    public final int f8968;

    public C0720qd(boolean r1, boolean r2, boolean r3, p000.EnumC0831td r4, java.lang.Integer r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f8963 = r1
            r0.f8964 = r2
            r0.f8965 = r3
            r0.f8966 = r4
            r0.f8967 = r5
            r0.f8968 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0720qd
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qd r5 = (p000.C0720qd) r5
            boolean r1 = r4.f8963
            boolean r3 = r5.f8963
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r4.f8964
            boolean r3 = r5.f8964
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r4.f8965
            boolean r3 = r5.f8965
            if (r1 == r3) goto L21
            return r2
        L21:
            td r1 = r4.f8966
            td r3 = r5.f8966
            if (r1 == r3) goto L28
            return r2
        L28:
            java.lang.Integer r1 = r4.f8967
            java.lang.Integer r3 = r5.f8967
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L33
            return r2
        L33:
            int r4 = r4.f8968
            int r5 = r5.f8968
            if (r4 == r5) goto L3a
            return r2
        L3a:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.f8963
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.f8964
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f8965
            int r0 = p000.lz1.m3678(r0, r1, r2)
            r2 = 0
            td r3 = r4.f8966
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f8967
            if (r3 != 0) goto L27
            goto L2b
        L27:
            int r2 = r3.hashCode()
        L2b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r4 = r4.f8968
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CampGlobalRules(harvest="
            r0.<init>(r1)
            boolean r1 = r2.f8963
            r0.append(r1)
            java.lang.String r1 = ", plant="
            r0.append(r1)
            boolean r1 = r2.f8964
            r0.append(r1)
            java.lang.String r1 = ", water="
            r0.append(r1)
            boolean r1 = r2.f8965
            r0.append(r1)
            java.lang.String r1 = ", plantSeedMode="
            r0.append(r1)
            td r1 = r2.f8966
            r0.append(r1)
            java.lang.String r1 = ", plantSeedId="
            r0.append(r1)
            java.lang.Integer r1 = r2.f8967
            r0.append(r1)
            java.lang.String r1 = ", smartSeedMaxPrice="
            r0.append(r1)
            int r2 = r2.f8968
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final p000.EnumC0831td m4863() {
            r2 = this;
            td r0 = r2.f8966
            td r1 = p000.EnumC0831td.f10318
            if (r0 != r1) goto L7
            return r1
        L7:
            td r1 = p000.EnumC0831td.f10319
            if (r0 != r1) goto L16
            java.lang.Integer r2 = r2.f8967
            if (r2 == 0) goto L16
            int r2 = r2.intValue()
            if (r2 <= 0) goto L16
            return r1
        L16:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final boolean m4864(p000.EnumC0619od r2) {
            r1 = this;
            r2.getClass()
            int r2 = r2.ordinal()
            if (r2 == 0) goto L1a
            r0 = 1
            if (r2 == r0) goto L17
            r0 = 2
            if (r2 != r0) goto L12
            boolean r1 = r1.f8965
            return r1
        L12:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L17:
            boolean r1 = r1.f8964
            return r1
        L1a:
            boolean r1 = r1.f8963
            return r1
    }
}
