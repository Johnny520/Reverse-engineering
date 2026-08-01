package p000;

/* JADX INFO: renamed from: d3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0198d3 extends android.text.TextPaint {

    /* JADX INFO: renamed from: α */
    public p000.C0709q2 f2868;

    /* JADX INFO: renamed from: β */
    public p000.c32 f2869;

    /* JADX INFO: renamed from: γ */
    public int f2870;

    /* JADX INFO: renamed from: δ */
    public p000.fv1 f2871;

    /* JADX INFO: renamed from: ε */
    public p000.C0114ci f2872;

    /* JADX INFO: renamed from: ζ */
    public p000.kn0 f2873;

    /* JADX INFO: renamed from: η */
    public p000.C0296fs f2874;

    /* JADX INFO: renamed from: θ */
    public p000.jw1 f2875;

    /* JADX INFO: renamed from: ι */
    public p000.kn0 f2876;

    /* JADX INFO: renamed from: α */
    public final p000.C0709q2 m1640() {
            r1 = this;
            q2 r0 = r1.f2868
            if (r0 == 0) goto L5
            return r0
        L5:
            q2 r0 = new q2
            r0.<init>(r1)
            r1.f2868 = r0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m1641(int r2) {
            r1 = this;
            int r0 = r1.f2870
            if (r2 != r0) goto L5
            return
        L5:
            q2 r0 = r1.m1640()
            r0.m4713(r2)
            r1.f2870 = r2
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m1642(p000.kn0 r6, long r7, float r9) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f2874 = r0
            r5.f2873 = r0
            r5.f2875 = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof p000.px1
            if (r1 == 0) goto L1d
            px1 r6 = (p000.px1) r6
            long r6 = r6.f8755
            long r6 = p000.e81.m1882(r6, r9)
            r5.m1643(r6)
            return
        L1d:
            boolean r1 = r6 instanceof p000.AbstractC0682pc
            if (r1 == 0) goto L74
            kn0 r1 = r5.f2873
            boolean r1 = p000.ln0.m3626(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            jw1 r1 = r5.f2875
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f5615
            boolean r1 = p000.jw1.m2997(r3, r7)
        L36:
            if (r1 != 0) goto L5b
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L5b
            r5.f2873 = r6
            jw1 r1 = new jw1
            r1.<init>(r7)
            r5.f2875 = r1
            η r1 = new η
            r1.<init>(r6, r7)
            m6 r6 = p000.gx1.f4502
            fs r6 = new fs
            r6.<init>(r1)
            r5.f2874 = r6
        L5b:
            q2 r6 = r5.m1640()
            fs r7 = r5.f2874
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L6b
        L6a:
            r7 = r0
        L6b:
            r6.m4715(r7)
            r5.f2872 = r0
            p000.AbstractC0978xb.m6577(r5, r9)
            return
        L74:
            p000.C1080.m7272()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m1643(long r5) {
            r4 = this;
            ci r0 = r4.f2872
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            long r2 = r0.f2127
            boolean r0 = p000.C0114ci.m1192(r2, r5)
        Ld:
            if (r0 != 0) goto L30
            r2 = 16
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            r1 = 1
        L16:
            if (r1 == 0) goto L30
            ci r0 = new ci
            r0.<init>(r5)
            r4.f2872 = r0
            int r5 = p000.kn0.m3355(r5)
            r4.setColor(r5)
            r5 = 0
            r4.f2874 = r5
            r4.f2873 = r5
            r4.f2875 = r5
            r4.setShader(r5)
        L30:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m1644(p000.kn0 r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L6d
        L3:
            kn0 r0 = r2.f2876
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L6d
            r2.f2876 = r3
            t30 r0 = p000.t30.f10165
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            return
        L1b:
            boolean r0 = r3 instanceof p000.y02
            if (r0 == 0) goto L6a
            q2 r0 = r2.m1640()
            r1 = 1
            r0.m4716(r1)
            q2 r0 = r2.m1640()
            y02 r3 = (p000.y02) r3
            float r3 = r3.f12420
            java.lang.Object r0 = r0.f8800
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setStrokeWidth(r3)
            q2 r3 = r2.m1640()
            java.lang.Object r3 = r3.f8800
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r0 = 1082130432(0x40800000, float:4.0)
            r3.setStrokeMiter(r0)
            q2 r3 = r2.m1640()
            java.lang.Object r3 = r3.f8800
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            r3.setStrokeJoin(r0)
            q2 r3 = r2.m1640()
            java.lang.Object r3 = r3.f8800
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            r3.setStrokeCap(r0)
            q2 r2 = r2.m1640()
            java.lang.Object r2 = r2.f8800
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            r3 = 0
            r2.setPathEffect(r3)
            return
        L6a:
            p000.C1080.m7272()
        L6d:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m1645(p000.fv1 r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L47
        L3:
            fv1 r0 = r5.f2871
            boolean r0 = p000.ln0.m3626(r0, r6)
            if (r0 != 0) goto L47
            r5.f2871 = r6
            fv1 r0 = p000.fv1.f4142
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L19
            r5.clearShadowLayer()
            return
        L19:
            fv1 r6 = r5.f2871
            float r0 = r6.f4145
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L23
            r0 = 1
        L23:
            long r1 = r6.f4144
            r6 = 32
            long r1 = r1 >> r6
            int r6 = (int) r1
            float r6 = java.lang.Float.intBitsToFloat(r6)
            fv1 r1 = r5.f2871
            long r1 = r1.f4144
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            fv1 r2 = r5.f2871
            long r2 = r2.f4143
            int r2 = p000.kn0.m3355(r2)
            r5.setShadowLayer(r0, r6, r1, r2)
        L47:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m1646(p000.c32 r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L27
        L3:
            c32 r0 = r3.f2869
            boolean r0 = p000.ln0.m3626(r0, r4)
            if (r0 != 0) goto L27
            r3.f2869 = r4
            int r4 = r4.f1960
            r0 = r4 | 1
            r1 = 0
            r2 = 1
            if (r0 != r4) goto L17
            r4 = r2
            goto L18
        L17:
            r4 = r1
        L18:
            r3.setUnderlineText(r4)
            c32 r4 = r3.f2869
            int r4 = r4.f1960
            r0 = r4 | 2
            if (r0 != r4) goto L24
            r1 = r2
        L24:
            r3.setStrikeThruText(r1)
        L27:
            return
    }
}
