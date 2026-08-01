package p000;

/* JADX INFO: renamed from: gk */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0325gk {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Field f4388;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Field f4389;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Field f4390;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Field f4391;

    /* JADX INFO: renamed from: ε */
    public final java.lang.reflect.Field f4392;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.reflect.Field f4393;

    /* JADX INFO: renamed from: η */
    public final java.lang.reflect.Field f4394;

    /* JADX INFO: renamed from: θ */
    public final java.lang.reflect.Field f4395;

    /* JADX INFO: renamed from: ι */
    public final java.lang.reflect.Field f4396;

    public C0325gk(java.lang.reflect.Field r3, java.lang.reflect.Field r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6, java.lang.reflect.Field r7, java.lang.reflect.Field r8, java.lang.reflect.Field r9, java.lang.reflect.Field r10, java.lang.reflect.Field r11, int r12) {
            r2 = this;
            r0 = r12 & 8
            r1 = 0
            if (r0 == 0) goto L6
            r6 = r1
        L6:
            r0 = r12 & 16
            if (r0 == 0) goto Lb
            r7 = r1
        Lb:
            r0 = r12 & 32
            if (r0 == 0) goto L10
            r8 = r1
        L10:
            r0 = r12 & 64
            if (r0 == 0) goto L15
            r9 = r1
        L15:
            r0 = r12 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L1a
            r10 = r1
        L1a:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L1f
            r11 = r1
        L1f:
            r2.<init>()
            r2.f4388 = r3
            r2.f4389 = r4
            r2.f4390 = r5
            r2.f4391 = r6
            r2.f4392 = r7
            r2.f4393 = r8
            r2.f4394 = r9
            r2.f4395 = r10
            r2.f4396 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0325gk
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gk r5 = (p000.C0325gk) r5
            java.lang.reflect.Field r1 = r4.f4388
            java.lang.reflect.Field r3 = r5.f4388
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.Field r1 = r4.f4389
            java.lang.reflect.Field r3 = r5.f4389
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.reflect.Field r1 = r4.f4390
            java.lang.reflect.Field r3 = r5.f4390
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.reflect.Field r1 = r4.f4391
            java.lang.reflect.Field r3 = r5.f4391
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.reflect.Field r1 = r4.f4392
            java.lang.reflect.Field r3 = r5.f4392
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.reflect.Field r1 = r4.f4393
            java.lang.reflect.Field r3 = r5.f4393
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.reflect.Field r1 = r4.f4394
            java.lang.reflect.Field r3 = r5.f4394
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.reflect.Field r1 = r4.f4395
            java.lang.reflect.Field r3 = r5.f4395
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.reflect.Field r4 = r4.f4396
            java.lang.reflect.Field r5 = r5.f4396
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L6f
            return r2
        L6f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.reflect.Field r1 = r3.f4388
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f4389
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f4390
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f4391
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f4392
            if (r2 != 0) goto L3a
            r2 = r0
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f4393
            if (r2 != 0) goto L47
            r2 = r0
            goto L4b
        L47:
            int r2 = r2.hashCode()
        L4b:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f4394
            if (r2 != 0) goto L54
            r2 = r0
            goto L58
        L54:
            int r2 = r2.hashCode()
        L58:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f4395
            if (r2 != 0) goto L61
            r2 = r0
            goto L65
        L61:
            int r2 = r2.hashCode()
        L65:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r3 = r3.f4396
            if (r3 != 0) goto L6d
            goto L71
        L6d:
            int r0 = r3.hashCode()
        L71:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HolderFields(avatar="
            r0.<init>(r1)
            java.lang.reflect.Field r1 = r5.f4388
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.reflect.Field r1 = r5.f4389
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            java.lang.String r1 = ", reply="
            java.lang.String r2 = ", time="
            java.lang.reflect.Field r3 = r5.f4390
            java.lang.reflect.Field r4 = r5.f4391
            p000.lz1.m3672(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", likeArea="
            java.lang.String r2 = ", likeIcon="
            java.lang.reflect.Field r3 = r5.f4392
            java.lang.reflect.Field r4 = r5.f4393
            p000.lz1.m3672(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", likeCount="
            java.lang.String r2 = ", delegate="
            java.lang.reflect.Field r3 = r5.f4394
            java.lang.reflect.Field r4 = r5.f4395
            p000.lz1.m3672(r0, r3, r1, r4, r2)
            java.lang.reflect.Field r5 = r5.f4396
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
