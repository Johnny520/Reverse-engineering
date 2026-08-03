package lb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f7959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f7960c;

    public d(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r3.f7958a = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.uiMode
            r4 = r4 & 48
            r2 = 32
            if (r4 != r2) goto L27
            r4 = -1
            goto L2d
        L27:
            r4 = 51
            int r4 = android.graphics.Color.rgb(r4, r4, r4)
        L2d:
            r0.setColor(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r4)
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r4)
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            r0.setStrokeJoin(r4)
            r3.f7959b = r0
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r1)
            int r0 = r0.getColor()
            r4.setColor(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r4.setTypeface(r0)
            r3.f7960c = r4
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r6) {
            r5 = this;
            r6.getClass()
            android.graphics.Rect r0 = r5.getBounds()
            r0.getClass()
            int r1 = r0.width()
            int r2 = r0.height()
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L1d
            return
        L1d:
            float r2 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            r3 = 1070386381(0x3fcccccd, float:1.6)
            float r4 = r5.f7958a
            float r4 = r4 * r3
            r3 = 1032134328(0x3d851eb8, float:0.065)
            float r3 = r3 * r1
            float r3 = java.lang.Math.max(r4, r3)
            android.graphics.Paint r4 = r5.f7959b
            r4.setStrokeWidth(r3)
            r3 = 1052938076(0x3ec28f5c, float:0.38)
            float r3 = r3 * r1
            r6.drawCircle(r2, r0, r3, r4)
            r3 = 1051595899(0x3eae147b, float:0.34)
            float r1 = r1 * r3
            android.graphics.Paint r3 = r5.f7960c
            r3.setTextSize(r1)
            android.graphics.Paint$FontMetrics r1 = r3.getFontMetrics()
            float r4 = r1.ascent
            float r1 = r1.descent
            float r4 = r4 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r1
            float r0 = r0 - r4
            java.lang.String r1 = "+1"
            r6.drawText(r1, r2, r0, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r2 = this;
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r2.f7958a
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r2 = this;
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r2.f7958a
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f7959b
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.f7960c
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f7959b
            r0.setColorFilter(r2)
            android.graphics.Paint r0 = r1.f7960c
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }
}
