package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ov0 extends p000.qv0 {

    /* JADX INFO: renamed from: α */
    public final android.content.Context f8269;

    /* JADX INFO: renamed from: β */
    public final java.lang.ClassLoader f8270;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object f8271;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f8272;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f8273;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f8274;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f8275;

    public ov0(android.content.Context r1, java.lang.ClassLoader r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.String r7) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f8269 = r1
            r0.f8270 = r2
            r0.f8271 = r3
            r0.f8272 = r4
            r0.f8273 = r5
            r0.f8274 = r6
            r0.f8275 = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ov0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ov0 r5 = (p000.ov0) r5
            android.content.Context r1 = r4.f8269
            android.content.Context r3 = r5.f8269
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.ClassLoader r1 = r4.f8270
            java.lang.ClassLoader r3 = r5.f8270
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Object r1 = r4.f8271
            java.lang.Object r3 = r5.f8271
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.f8272
            java.lang.Object r3 = r5.f8272
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Object r1 = r4.f8273
            java.lang.Object r3 = r5.f8273
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.Object r1 = r4.f8274
            java.lang.Object r3 = r5.f8274
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r4 = r4.f8275
            java.lang.String r5 = r5.f8275
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L59
            return r2
        L59:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.f8269
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.ClassLoader r2 = r3.f8270
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r3.f8271
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f8272
            if (r2 != 0) goto L25
            r2 = r0
            goto L29
        L25:
            int r2 = r2.hashCode()
        L29:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f8273
            if (r2 != 0) goto L32
            r2 = r0
            goto L36
        L32:
            int r2 = r2.hashCode()
        L36:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f8274
            if (r2 != 0) goto L3f
            r2 = r0
            goto L43
        L3f:
            int r2 = r2.hashCode()
        L43:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r3 = r3.f8275
            if (r3 != 0) goto L4b
            goto L4f
        L4b:
            int r0 = r3.hashCode()
        L4f:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Comment(hostContext="
            r0.<init>(r1)
            android.content.Context r1 = r2.f8269
            r0.append(r1)
            java.lang.String r1 = ", classLoader="
            r0.append(r1)
            java.lang.ClassLoader r1 = r2.f8270
            r0.append(r1)
            java.lang.String r1 = ", actionParams="
            r0.append(r1)
            java.lang.Object r1 = r2.f8271
            r0.append(r1)
            java.lang.String r1 = ", listenerProvider="
            r0.append(r1)
            java.lang.Object r1 = r2.f8272
            r0.append(r1)
            java.lang.String r1 = ", comment="
            r0.append(r1)
            java.lang.Object r1 = r2.f8273
            r0.append(r1)
            java.lang.String r1 = ", dialogFragment="
            r0.append(r1)
            java.lang.Object r1 = r2.f8274
            r0.append(r1)
            java.lang.String r1 = ", enterFrom="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f8275
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }

    @Override // p000.qv0
    /* JADX INFO: renamed from: α */
    public final android.content.Context mo4297() {
            r0 = this;
            android.content.Context r0 = r0.f8269
            return r0
    }
}
