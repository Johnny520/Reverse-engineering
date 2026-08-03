package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f6683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.text.TextPaint f6684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.text.BoringLayout.Metrics f6688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f6690h;

    public f(java.lang.CharSequence r1, android.text.TextPaint r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f6683a = r1
            r0.f6684b = r2
            r0.f6685c = r3
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f6686d = r1
            r0.f6687e = r1
            return
    }

    public final android.text.BoringLayout.Metrics a() {
            r5 = this;
            boolean r0 = r5.f6689g
            if (r0 != 0) goto L30
            int r0 = r5.f6685c
            android.text.TextDirectionHeuristic r0 = j2.l.b(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            java.lang.CharSequence r3 = r5.f6683a
            android.text.TextPaint r4 = r5.f6684b
            if (r1 < r2) goto L19
            android.text.BoringLayout$Metrics r0 = ai.a.i(r3, r4, r0)
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
            r5.f6688f = r0
            r0 = 1
            r5.f6689g = r0
        L30:
            android.text.BoringLayout$Metrics r0 = r5.f6688f
            return r0
    }

    public final java.lang.CharSequence b() {
            r7 = this;
            java.lang.CharSequence r0 = r7.f6690h
            if (r0 != 0) goto L44
            java.lang.CharSequence r0 = r7.f6683a
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L41
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r2 = android.text.style.CharacterStyle.class
            boolean r3 = j2.g.f(r1, r2)
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
            r7.f6690h = r0
            return r0
        L44:
            r0.getClass()
            return r0
    }

    public final float c() {
            r6 = this;
            float r0 = r6.f6686d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f6686d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f6684b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.b()
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
            java.lang.CharSequence r2 = r6.f6683a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<l2.f> r4 = l2.f.class
            boolean r4 = j2.g.f(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<l2.e> r4 = l2.e.class
            boolean r2 = j2.g.f(r2, r4)
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
            r6.f6686d = r0
            return r0
    }
}
