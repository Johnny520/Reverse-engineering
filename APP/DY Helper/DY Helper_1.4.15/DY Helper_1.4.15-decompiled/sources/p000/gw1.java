package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gw1 extends p000.q01 implements p000.qp0, p000.zr1 {

    /* JADX INFO: renamed from: Α */
    public boolean f4485;

    /* JADX INFO: renamed from: Β */
    public long f4486;

    /* JADX INFO: renamed from: Γ */
    public long f4487;

    /* JADX INFO: renamed from: Δ */
    public int f4488;

    /* JADX INFO: renamed from: Ε */
    public p000.C0060b0 f4489;

    /* JADX INFO: renamed from: τ */
    public float f4490;

    /* JADX INFO: renamed from: υ */
    public float f4491;

    /* JADX INFO: renamed from: φ */
    public float f4492;

    /* JADX INFO: renamed from: χ */
    public float f4493;

    /* JADX INFO: renamed from: ψ */
    public long f4494;

    /* JADX INFO: renamed from: ω */
    public p000.iv1 f4495;

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SimpleGraphicsLayerModifier(scaleX="
            r0.<init>(r1)
            float r1 = r5.f4490
            r0.append(r1)
            java.lang.String r1 = ", scaleY="
            r0.append(r1)
            float r1 = r5.f4491
            r0.append(r1)
            java.lang.String r1 = ", alpha = "
            r0.append(r1)
            float r1 = r5.f4492
            r0.append(r1)
            java.lang.String r1 = ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance="
            r0.append(r1)
            float r1 = r5.f4493
            r0.append(r1)
            java.lang.String r1 = ", transformOrigin="
            r0.append(r1)
            long r1 = r5.f4494
            int r3 = p000.r52.f9267
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TransformOrigin(packedValue="
            r3.<init>(r4)
            r3.append(r1)
            r1 = 41
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            iv1 r1 = r5.f4495
            r0.append(r1)
            java.lang.String r1 = ", clip="
            r0.append(r1)
            boolean r1 = r5.f4485
            r0.append(r1)
            java.lang.String r1 = ", renderEffect=null, ambientShadowColor="
            r0.append(r1)
            long r1 = r5.f4486
            java.lang.String r1 = p000.C0114ci.m1198(r1)
            r0.append(r1)
            java.lang.String r1 = ", spotShadowColor="
            r0.append(r1)
            long r1 = r5.f4487
            java.lang.String r1 = p000.C0114ci.m1198(r1)
            r0.append(r1)
            java.lang.String r1 = ", compositingStrategy=CompositingStrategy(value=0), blendMode="
            r0.append(r1)
            int r5 = r5.f4488
            java.lang.String r5 = p000.AbstractC0978xb.m6601(r5)
            r0.append(r5)
            java.lang.String r5 = ", colorFilter=null)"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r3, p000.kx0 r4, long r5) {
            r2 = this;
            ch1 r4 = r4.mo2146(r5)
            int r5 = r4.f2115
            int r6 = r4.f2116
            i3 r0 = new i3
            r1 = 4
            r0.<init>(r4, r1, r2)
            kz r2 = p000.C0493kz.f6332
            qx0 r2 = r3.mo1612(r5, r6, r2, r0)
            return r2
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: Ω */
    public final void mo600(p000.js1 r2) {
            r1 = this;
            boolean r0 = r1.f4485
            if (r0 != 0) goto L5
            return
        L5:
            iv1 r1 = r1.f4495
            p000.hs1.m2529(r2, r1)
            return
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: γ */
    public final boolean mo2339() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ф */
    public final boolean mo1140() {
            r0 = this;
            r0 = 0
            return r0
    }
}
