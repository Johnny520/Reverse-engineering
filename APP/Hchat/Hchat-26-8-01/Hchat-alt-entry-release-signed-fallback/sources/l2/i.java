package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public android.graphics.Paint.FontMetricsInt f7772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7775j;

    public final android.graphics.Paint.FontMetricsInt a() {
            r1 = this;
            android.graphics.Paint$FontMetricsInt r0 = r1.f7772g
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "fontMetrics"
            gg.l.g(r0)
            r0 = 0
            throw r0
    }

    public final int b() {
            r1 = this;
            boolean r0 = r1.f7775j
            if (r0 != 0) goto L9
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            o2.a.b(r0)
        L9:
            int r0 = r1.f7774i
            return r0
    }

    public final int c() {
            r1 = this;
            boolean r0 = r1.f7775j
            if (r0 != 0) goto L9
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            o2.a.b(r0)
        L9:
            int r0 = r1.f7773h
            return r0
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r1, java.lang.CharSequence r2, int r3, int r4, float r5, int r6, int r7, int r8, android.graphics.Paint r9) {
            r0 = this;
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r1, java.lang.CharSequence r2, int r3, int r4, android.graphics.Paint.FontMetricsInt r5) {
            r0 = this;
            r2 = 1
            r0.f7775j = r2
            r1.getTextSize()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            r0.f7772g = r1
            android.graphics.Paint$FontMetricsInt r1 = r0.a()
            int r1 = r1.descent
            android.graphics.Paint$FontMetricsInt r2 = r0.a()
            int r2 = r2.ascent
            if (r1 <= r2) goto L1b
            goto L20
        L1b:
            java.lang.String r1 = "Invalid fontMetrics: line height can not be negative."
            o2.a.a(r1)
        L20:
            r1 = 0
            double r2 = (double) r1
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            r0.f7773h = r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            r0.f7774i = r1
            if (r5 == 0) goto L79
            android.graphics.Paint$FontMetricsInt r1 = r0.a()
            int r1 = r1.ascent
            r5.ascent = r1
            android.graphics.Paint$FontMetricsInt r1 = r0.a()
            int r1 = r1.descent
            r5.descent = r1
            android.graphics.Paint$FontMetricsInt r1 = r0.a()
            int r1 = r1.leading
            r5.leading = r1
            int r1 = r5.ascent
            int r2 = r0.b()
            int r2 = -r2
            if (r1 <= r2) goto L5d
            int r1 = r0.b()
            int r1 = -r1
            r5.ascent = r1
        L5d:
            android.graphics.Paint$FontMetricsInt r1 = r0.a()
            int r1 = r1.top
            int r2 = r5.ascent
            int r1 = java.lang.Math.min(r1, r2)
            r5.top = r1
            android.graphics.Paint$FontMetricsInt r1 = r0.a()
            int r1 = r1.bottom
            int r2 = r5.descent
            int r1 = java.lang.Math.max(r1, r2)
            r5.bottom = r1
        L79:
            int r1 = r0.c()
            return r1
    }
}
