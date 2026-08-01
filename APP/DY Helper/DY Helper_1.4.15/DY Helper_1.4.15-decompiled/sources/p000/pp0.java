package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pp0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.CharSequence f8641;

    /* JADX INFO: renamed from: β */
    public final android.text.TextPaint f8642;

    /* JADX INFO: renamed from: γ */
    public final int f8643;

    /* JADX INFO: renamed from: δ */
    public float f8644;

    /* JADX INFO: renamed from: ε */
    public float f8645;

    /* JADX INFO: renamed from: ζ */
    public android.text.BoringLayout.Metrics f8646;

    /* JADX INFO: renamed from: η */
    public boolean f8647;

    /* JADX INFO: renamed from: θ */
    public java.lang.CharSequence f8648;

    public pp0(java.lang.CharSequence r1, android.text.TextPaint r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f8641 = r1
            r0.f8642 = r2
            r0.f8643 = r3
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f8644 = r1
            r0.f8645 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final android.text.BoringLayout.Metrics m4563() {
            r5 = this;
            boolean r0 = r5.f8647
            if (r0 != 0) goto L30
            int r0 = r5.f8643
            android.text.TextDirectionHeuristic r0 = p000.n32.m3950(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            java.lang.CharSequence r3 = r5.f8641
            android.text.TextPaint r4 = r5.f8642
            if (r1 < r2) goto L19
            android.text.BoringLayout$Metrics r0 = p000.AbstractC1124.m7325(r3, r4, r0)
            goto L2b
        L19:
            r1 = 0
            int r2 = r3.length()
            boolean r0 = r0.isRtl(r3, r1, r2)
            r1 = 0
            if (r0 != 0) goto L2a
            android.text.BoringLayout$Metrics r0 = android.text.BoringLayout.isBoring(r3, r4, r1)
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r5.f8646 = r0
            r0 = 1
            r5.f8647 = r0
        L30:
            android.text.BoringLayout$Metrics r5 = r5.f8646
            return r5
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.CharSequence m4564() {
            r7 = this;
            java.lang.CharSequence r0 = r7.f8648
            if (r0 != 0) goto L44
            java.lang.CharSequence r0 = r7.f8641
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L41
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r2 = android.text.style.CharacterStyle.class
            boolean r3 = p000.v71.m6039(r1, r2)
            if (r3 != 0) goto L16
            goto L41
        L16:
            int r3 = r0.length()
            r4 = 0
            java.lang.Object[] r1 = r1.getSpans(r4, r3, r2)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            if (r1 == 0) goto L41
            int r2 = r1.length
            if (r2 != 0) goto L27
            goto L41
        L27:
            int r2 = r1.length
            r3 = 0
        L29:
            if (r4 >= r2) goto L3e
            r5 = r1[r4]
            boolean r6 = r5 instanceof android.text.style.MetricAffectingSpan
            if (r6 != 0) goto L3b
            if (r3 != 0) goto L38
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
        L38:
            r3.removeSpan(r5)
        L3b:
            int r4 = r4 + 1
            goto L29
        L3e:
            if (r3 == 0) goto L41
            r0 = r3
        L41:
            r7.f8648 = r0
            return r0
        L44:
            r0.getClass()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final float m4565() {
            r6 = this;
            float r0 = r6.f8644
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r6 = r6.f8644
            return r6
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.m4563()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f8642
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.m4564()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.m4564()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f8641
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<wq0> r4 = p000.wq0.class
            boolean r4 = p000.v71.m6039(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<vq0> r4 = p000.vq0.class
            boolean r2 = p000.v71.m6039(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f8644 = r0
            return r0
    }
}
