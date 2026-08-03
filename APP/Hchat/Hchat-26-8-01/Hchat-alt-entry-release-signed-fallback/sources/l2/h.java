package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f7764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7771r;

    public h(float r1, int r2, boolean r3, boolean r4, float r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f7760g = r1
            r0.f7761h = r2
            r0.f7762i = r3
            r0.f7763j = r4
            r0.f7764k = r5
            r0.f7765l = r6
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f7766m = r1
            r0.f7767n = r1
            r0.f7768o = r1
            r0.f7769p = r1
            r1 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L25
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L25
            goto L2b
        L25:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L2c
        L2b:
            return
        L2c:
            java.lang.String r1 = "topRatio should be in [0..1] range or -1"
            o2.a.b(r1)
            return
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence r8, int r9, int r10, int r11, int r12, android.graphics.Paint.FontMetricsInt r13) {
            r7 = this;
            int r8 = r13.descent
            int r11 = r13.ascent
            int r12 = r8 - r11
            if (r12 > 0) goto L9
            goto L29
        L9:
            r12 = 0
            r0 = 1
            if (r9 != 0) goto Lf
            r9 = r0
            goto L10
        Lf:
            r9 = r12
        L10:
            int r1 = r7.f7761h
            if (r10 != r1) goto L16
            r10 = r0
            goto L17
        L16:
            r10 = r12
        L17:
            r1 = 2
            int r2 = r7.f7765l
            boolean r3 = r7.f7763j
            boolean r4 = r7.f7762i
            if (r9 == 0) goto L2a
            if (r10 == 0) goto L2a
            if (r4 == 0) goto L2a
            if (r3 == 0) goto L2a
            if (r2 != r1) goto L29
            goto L2a
        L29:
            return
        L2a:
            int r5 = r7.f7766m
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r6) goto Lc8
            int r8 = r8 - r11
            float r11 = r7.f7760g
            double r5 = (double) r11
            double r5 = java.lang.Math.ceil(r5)
            float r11 = (float) r5
            int r11 = (int) r11
            int r8 = r11 - r8
            if (r2 != r0) goto L52
            if (r8 > 0) goto L52
            int r8 = r13.ascent
            r7.f7767n = r8
            int r11 = r13.descent
            r7.f7768o = r11
            r7.f7766m = r8
            r7.f7769p = r11
            r7.f7770q = r12
            r7.f7771r = r12
            goto Lc8
        L52:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r7.f7764k
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L69
            int r0 = r13.ascent
            float r0 = (float) r0
            float r0 = java.lang.Math.abs(r0)
            int r5 = r13.descent
            int r6 = r13.ascent
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r0 / r5
        L69:
            if (r8 > 0) goto L75
            float r0 = (float) r8
            float r0 = r0 * r5
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
        L72:
            float r0 = (float) r5
            int r0 = (int) r0
            goto L80
        L75:
            float r0 = (float) r8
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r5
            float r6 = r6 * r0
            double r5 = (double) r6
            double r5 = java.lang.Math.ceil(r5)
            goto L72
        L80:
            int r5 = r13.descent
            int r0 = r0 + r5
            r7.f7768o = r0
            int r11 = r0 - r11
            r7.f7767n = r11
            if (r2 != 0) goto L8c
            goto L8e
        L8c:
            if (r8 < 0) goto La2
        L8e:
            if (r4 == 0) goto L92
            int r11 = r13.ascent
        L92:
            r7.f7766m = r11
            if (r3 == 0) goto L97
            r0 = r5
        L97:
            r7.f7769p = r0
            int r8 = r13.ascent
            int r8 = r8 - r11
            r7.f7770q = r8
            int r0 = r0 - r5
            r7.f7771r = r0
            goto Lc8
        La2:
            if (r2 != r1) goto Lc8
            int r8 = r13.ascent
            if (r4 == 0) goto Lad
            int r8 = java.lang.Math.max(r8, r11)
            goto Lb1
        Lad:
            int r8 = java.lang.Math.min(r8, r11)
        Lb1:
            r7.f7766m = r8
            int r8 = r13.descent
            int r11 = r7.f7768o
            if (r3 == 0) goto Lbe
            int r8 = java.lang.Math.min(r8, r11)
            goto Lc2
        Lbe:
            int r8 = java.lang.Math.max(r8, r11)
        Lc2:
            r7.f7769p = r8
            r7.f7770q = r12
            r7.f7771r = r12
        Lc8:
            if (r9 == 0) goto Lcd
            int r8 = r7.f7766m
            goto Lcf
        Lcd:
            int r8 = r7.f7767n
        Lcf:
            r13.ascent = r8
            if (r10 == 0) goto Ld6
            int r8 = r7.f7769p
            goto Ld8
        Ld6:
            int r8 = r7.f7768o
        Ld8:
            r13.descent = r8
            return
    }
}
