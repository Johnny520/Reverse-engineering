package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: ε */
    public android.graphics.Paint.FontMetricsInt f3940;

    /* JADX INFO: renamed from: ζ */
    public int f3941;

    /* JADX INFO: renamed from: η */
    public int f3942;

    /* JADX INFO: renamed from: θ */
    public boolean f3943;

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r1, java.lang.CharSequence r2, int r3, int r4, float r5, int r6, int r7, int r8, android.graphics.Paint r9) {
            r0 = this;
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r1, java.lang.CharSequence r2, int r3, int r4, android.graphics.Paint.FontMetricsInt r5) {
            r0 = this;
            r2 = 1
            r0.f3943 = r2
            r1.getTextSize()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            r0.f3940 = r1
            android.graphics.Paint$FontMetricsInt r1 = r0.m2107()
            int r1 = r1.descent
            android.graphics.Paint$FontMetricsInt r2 = r0.m2107()
            int r2 = r2.ascent
            if (r1 <= r2) goto L1b
            goto L20
        L1b:
            java.lang.String r1 = "Invalid fontMetrics: line height can not be negative."
            p000.bm0.m982(r1)
        L20:
            r1 = 0
            double r2 = (double) r1
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            r0.f3941 = r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            r0.f3942 = r1
            if (r5 == 0) goto L79
            android.graphics.Paint$FontMetricsInt r1 = r0.m2107()
            int r1 = r1.ascent
            r5.ascent = r1
            android.graphics.Paint$FontMetricsInt r1 = r0.m2107()
            int r1 = r1.descent
            r5.descent = r1
            android.graphics.Paint$FontMetricsInt r1 = r0.m2107()
            int r1 = r1.leading
            r5.leading = r1
            int r1 = r5.ascent
            int r2 = r0.m2108()
            int r2 = -r2
            if (r1 <= r2) goto L5d
            int r1 = r0.m2108()
            int r1 = -r1
            r5.ascent = r1
        L5d:
            android.graphics.Paint$FontMetricsInt r1 = r0.m2107()
            int r1 = r1.top
            int r2 = r5.ascent
            int r1 = java.lang.Math.min(r1, r2)
            r5.top = r1
            android.graphics.Paint$FontMetricsInt r1 = r0.m2107()
            int r1 = r1.bottom
            int r2 = r5.descent
            int r1 = java.lang.Math.max(r1, r2)
            r5.bottom = r1
        L79:
            int r0 = r0.m2109()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final android.graphics.Paint.FontMetricsInt m2107() {
            r0 = this;
            android.graphics.Paint$FontMetricsInt r0 = r0.f3940
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "fontMetrics"
            p000.ln0.m3650(r0)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: β */
    public final int m2108() {
            r1 = this;
            boolean r0 = r1.f3943
            if (r0 != 0) goto L9
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            p000.bm0.m983(r0)
        L9:
            int r1 = r1.f3942
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final int m2109() {
            r1 = this;
            boolean r0 = r1.f3943
            if (r0 != 0) goto L9
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            p000.bm0.m983(r0)
        L9:
            int r1 = r1.f3941
            return r1
    }
}
