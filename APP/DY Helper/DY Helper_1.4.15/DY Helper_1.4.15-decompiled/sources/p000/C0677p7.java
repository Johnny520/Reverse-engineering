package p000;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0677p7 {

    /* JADX INFO: renamed from: α */
    public final long f8439;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f8440;

    /* JADX INFO: renamed from: γ */
    public final boolean f8441;

    /* JADX INFO: renamed from: δ */
    public p000.EnumC0539m7 f8442;

    /* JADX INFO: renamed from: ε */
    public p000.C0632oq f8443;

    /* JADX INFO: renamed from: ζ */
    public p000.RunnableC1090 f8444;

    /* JADX INFO: renamed from: η */
    public boolean f8445;

    /* JADX INFO: renamed from: θ */
    public boolean f8446;

    public C0677p7(long r1, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f8439 = r1
            r0.f8440 = r3
            r0.f8441 = r4
            r1 = 0
            r0.f8442 = r1
            r0.f8443 = r1
            r0.f8444 = r1
            r1 = 0
            r0.f8445 = r1
            r0.f8446 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L51
        L3:
            boolean r0 = r5 instanceof p000.C0677p7
            if (r0 != 0) goto L8
            goto L4f
        L8:
            p7 r5 = (p000.C0677p7) r5
            long r0 = r4.f8439
            long r2 = r5.f8439
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L4f
        L13:
            java.lang.String r0 = r4.f8440
            java.lang.String r1 = r5.f8440
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1e
            goto L4f
        L1e:
            boolean r0 = r4.f8441
            boolean r1 = r5.f8441
            if (r0 == r1) goto L25
            goto L4f
        L25:
            m7 r0 = r4.f8442
            m7 r1 = r5.f8442
            if (r0 == r1) goto L2c
            goto L4f
        L2c:
            oq r0 = r4.f8443
            oq r1 = r5.f8443
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L37
            goto L4f
        L37:
            ν r0 = r4.f8444
            ν r1 = r5.f8444
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L42
            goto L4f
        L42:
            boolean r0 = r4.f8445
            boolean r1 = r5.f8445
            if (r0 == r1) goto L49
            goto L4f
        L49:
            boolean r4 = r4.f8446
            boolean r5 = r5.f8446
            if (r4 == r5) goto L51
        L4f:
            r4 = 0
            return r4
        L51:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f8439
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f8440
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            boolean r3 = r4.f8441
            int r0 = p000.lz1.m3678(r0, r1, r3)
            m7 r3 = r4.f8442
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            oq r3 = r4.f8443
            if (r3 != 0) goto L2e
            r3 = r2
            goto L32
        L2e:
            int r3 = r3.hashCode()
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            ν r3 = r4.f8444
            if (r3 != 0) goto L39
            goto L3d
        L39:
            int r2 = r3.hashCode()
        L3d:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r4.f8445
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r4 = r4.f8446
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r8 = this;
            m7 r0 = r8.f8442
            oq r1 = r8.f8443
            ν r2 = r8.f8444
            boolean r3 = r8.f8445
            boolean r4 = r8.f8446
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ActiveSelection(generation="
            r5.<init>(r6)
            long r6 = r8.f8439
            r5.append(r6)
            java.lang.String r6 = ", awemeId="
            r5.append(r6)
            java.lang.String r6 = r8.f8440
            r5.append(r6)
            java.lang.String r6 = ", articleMode="
            r5.append(r6)
            boolean r8 = r8.f8441
            r5.append(r8)
            java.lang.String r8 = ", kind="
            r5.append(r8)
            r5.append(r0)
            java.lang.String r8 = ", resolveRequest="
            r5.append(r8)
            r5.append(r1)
            java.lang.String r8 = ", pendingRunnable="
            r5.append(r8)
            r5.append(r2)
            java.lang.String r8 = ", cancelledByTouch="
            r5.append(r8)
            r5.append(r3)
            java.lang.String r8 = ", consumed="
            r5.append(r8)
            r5.append(r4)
            java.lang.String r8 = ")"
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            return r8
    }
}
