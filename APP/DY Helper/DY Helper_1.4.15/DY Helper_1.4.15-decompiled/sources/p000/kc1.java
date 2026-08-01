package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kc1 {

    /* JADX INFO: renamed from: α */
    public final int f5850;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f5851;

    /* JADX INFO: renamed from: γ */
    public final int f5852;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f5853;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Boolean f5854;

    public kc1(int r1, java.lang.Integer r2, int r3, java.lang.String r4, java.lang.Boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f5850 = r1
            r0.f5851 = r2
            r0.f5852 = r3
            r0.f5853 = r4
            r0.f5854 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.kc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kc1 r5 = (p000.kc1) r5
            int r1 = r4.f5850
            int r3 = r5.f5850
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r1 = r4.f5851
            java.lang.Integer r3 = r5.f5851
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            int r1 = r4.f5852
            int r3 = r5.f5852
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r1 = r4.f5853
            java.lang.String r3 = r5.f5853
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            java.lang.Boolean r4 = r4.f5854
            java.lang.Boolean r5 = r5.f5854
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L3b
            return r2
        L3b:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f5850
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r4.f5851
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f5852
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.String r3 = r4.f5853
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Boolean r4 = r4.f5854
            if (r4 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r4.hashCode()
        L31:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "re9806d2a562fc056"
            r0.<init>(r1)
            int r1 = r2.f5850
            r0.append(r1)
            java.lang.Integer r1 = r2.f5851
            r0.append(r1)
            int r1 = r2.f5852
            r0.append(r1)
            java.lang.String r1 = r2.f5853
            r0.append(r1)
            java.lang.Boolean r2 = r2.f5854
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final boolean m3186() {
            r1 = this;
            r0 = 27438(0x6b2e, float:3.8449E-41)
            int r1 = r1.f5852
            int[] r1 = new int[]{r1}
            boolean r1 = com.example.dyhelper.core.protection.ProtectionNativeBridge.m1316(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final boolean m3187() {
            r3 = this;
            java.lang.Integer r0 = r3.f5851
            if (r0 == 0) goto L9
            int r0 = r0.intValue()
            goto Lb
        L9:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        Lb:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r2 = r3.f5854
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto L17
            r1 = 0
            goto L24
        L17:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto L21
            r1 = 1
            goto L24
        L21:
            if (r2 != 0) goto L33
            r1 = -1
        L24:
            int r2 = r3.f5850
            int r3 = r3.f5852
            int[] r3 = new int[]{r2, r0, r3, r1}
            r0 = 17617(0x44d1, float:2.4687E-41)
            boolean r3 = com.example.dyhelper.core.protection.ProtectionNativeBridge.m1316(r0, r3)
            return r3
        L33:
            p000.C1080.m7272()
            r3 = 0
            return r3
    }
}
