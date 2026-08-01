package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class xa0 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final float f12088;

    /* JADX INFO: renamed from: β */
    public final long f12089;

    /* JADX INFO: renamed from: γ */
    public final p000.iv1 f12090;

    /* JADX INFO: renamed from: δ */
    public final long f12091;

    /* JADX INFO: renamed from: ε */
    public final long f12092;

    public xa0(float r1, long r2, p000.iv1 r4, long r5, long r7) {
            r0 = this;
            r0.<init>()
            r0.f12088 = r1
            r0.f12089 = r2
            r0.f12090 = r4
            r0.f12091 = r5
            r0.f12092 = r7
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            goto L89
        L4:
            boolean r0 = r7 instanceof p000.xa0
            r1 = 0
            if (r0 != 0) goto Lb
            goto L88
        Lb:
            xa0 r7 = (p000.xa0) r7
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = java.lang.Float.compare(r0, r0)
            if (r2 == 0) goto L17
            goto L88
        L17:
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L1f
            goto L88
        L1f:
            float r0 = r6.f12088
            float r2 = r7.f12088
            int r0 = java.lang.Float.compare(r0, r2)
            if (r0 == 0) goto L2a
            goto L88
        L2a:
            r0 = 0
            int r2 = java.lang.Float.compare(r0, r0)
            if (r2 == 0) goto L32
            goto L88
        L32:
            int r2 = java.lang.Float.compare(r0, r0)
            if (r2 == 0) goto L39
            goto L88
        L39:
            int r2 = java.lang.Float.compare(r0, r0)
            if (r2 == 0) goto L40
            goto L88
        L40:
            int r2 = java.lang.Float.compare(r0, r0)
            if (r2 == 0) goto L47
            goto L88
        L47:
            int r2 = java.lang.Float.compare(r0, r0)
            if (r2 == 0) goto L4e
            goto L88
        L4e:
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L55
            goto L88
        L55:
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L5e
            goto L88
        L5e:
            long r2 = r7.f12089
            int r0 = p000.r52.f9267
            long r4 = r6.f12089
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L8b
            iv1 r0 = r6.f12090
            iv1 r2 = r7.f12090
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L73
            goto L88
        L73:
            long r2 = r6.f12091
            long r4 = r7.f12091
            boolean r0 = p000.C0114ci.m1192(r2, r4)
            if (r0 != 0) goto L7e
            goto L88
        L7e:
            long r2 = r6.f12092
            long r6 = r7.f12092
            boolean r6 = p000.C0114ci.m1192(r2, r6)
            if (r6 != 0) goto L89
        L88:
            return r1
        L89:
            r6 = 1
            return r6
        L8b:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = java.lang.Float.hashCode(r0)
            r2 = 31
            int r1 = r1 * r2
            int r0 = p000.lz1.m3676(r0, r1, r2)
            float r1 = r5.f12088
            int r0 = p000.lz1.m3676(r1, r0, r2)
            r1 = 0
            int r0 = p000.lz1.m3676(r1, r0, r2)
            int r0 = p000.lz1.m3676(r1, r0, r2)
            int r0 = p000.lz1.m3676(r1, r0, r2)
            int r0 = p000.lz1.m3676(r1, r0, r2)
            int r0 = p000.lz1.m3676(r1, r0, r2)
            int r0 = p000.lz1.m3676(r1, r0, r2)
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = p000.lz1.m3676(r1, r0, r2)
            int r1 = p000.r52.f9267
            long r3 = r5.f12089
            int r0 = p000.lz1.m3677(r0, r2, r3)
            iv1 r1 = r5.f12090
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            r0 = 1
            r3 = 961(0x3c1, float:1.347E-42)
            int r0 = p000.lz1.m3678(r1, r3, r0)
            int r1 = p000.C0114ci.f2126
            long r3 = r5.f12091
            int r0 = p000.lz1.m3677(r0, r2, r3)
            long r3 = r5.f12092
            int r5 = p000.lz1.m3677(r0, r2, r3)
            r0 = 0
            int r5 = p000.a12.m14(r0, r5, r2)
            r0 = 3
            int r5 = p000.a12.m14(r0, r5, r2)
            return r5
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha="
            r0.<init>(r1)
            float r1 = r4.f12088
            r0.append(r1)
            java.lang.String r1 = ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin="
            r0.append(r1)
            int r1 = p000.r52.f9267
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TransformOrigin(packedValue="
            r1.<init>(r2)
            long r2 = r4.f12089
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            iv1 r1 = r4.f12090
            r0.append(r1)
            java.lang.String r1 = ", clip=true, renderEffect=null, ambientShadowColor="
            r0.append(r1)
            long r1 = r4.f12091
            java.lang.String r1 = p000.C0114ci.m1198(r1)
            r0.append(r1)
            java.lang.String r1 = ", spotShadowColor="
            r0.append(r1)
            long r1 = r4.f12092
            java.lang.String r4 = p000.C0114ci.m1198(r1)
            r0.append(r4)
            java.lang.String r4 = ", compositingStrategy=CompositingStrategy(value=0), blendMode="
            r0.append(r4)
            r4 = 3
            java.lang.String r4 = p000.AbstractC0978xb.m6601(r4)
            r0.append(r4)
            java.lang.String r4 = ", colorFilter=null)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r3 = this;
            gw1 r0 = new gw1
            r0.<init>()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f4490 = r1
            r0.f4491 = r1
            float r1 = r3.f12088
            r0.f4492 = r1
            r1 = 1090519040(0x41000000, float:8.0)
            r0.f4493 = r1
            long r1 = r3.f12089
            r0.f4494 = r1
            iv1 r1 = r3.f12090
            r0.f4495 = r1
            r1 = 1
            r0.f4485 = r1
            long r1 = r3.f12091
            r0.f4486 = r1
            long r1 = r3.f12092
            r0.f4487 = r1
            r3 = 3
            r0.f4488 = r3
            b0 r3 = new b0
            r1 = 21
            r3.<init>(r1, r0)
            r0.f4489 = r3
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r4) {
            r3 = this;
            gw1 r4 = (p000.gw1) r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.f4490 = r0
            r4.f4491 = r0
            float r0 = r3.f12088
            r4.f4492 = r0
            r0 = 1090519040(0x41000000, float:8.0)
            r4.f4493 = r0
            long r0 = r3.f12089
            r4.f4494 = r0
            iv1 r0 = r3.f12090
            r4.f4495 = r0
            r0 = 1
            r4.f4485 = r0
            long r1 = r3.f12091
            r4.f4486 = r1
            long r1 = r3.f12092
            r4.f4487 = r1
            r3 = 3
            r4.f4488 = r3
            b0 r3 = r4.f4489
            q01 r1 = r4.f8771
            boolean r1 = r1.f8784
            if (r1 != 0) goto L2f
            goto L3b
        L2f:
            r1 = 2
            q31 r4 = p000.h62.m2443(r4, r1)
            q31 r4 = r4.f8840
            if (r4 == 0) goto L3b
            r4.m4758(r3, r0)
        L3b:
            return
    }
}
