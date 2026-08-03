package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f10669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f10670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10671c;

    public a(int r3, int r4) {
            r2 = this;
            r2.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r2.f10669a = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r2.f10670b = r1
            r2.f10671c = r4
            r0.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r3)
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r0.setStrokeJoin(r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            android.graphics.Rect r0 = r10.getBounds()
            int r1 = r0.width()
            int r2 = r0.height()
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L17
            return
        L17:
            int r2 = r0.left
            float r2 = (float) r2
            int r3 = r0.width()
            float r3 = (float) r3
            float r3 = r3 - r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r3 = r3 + r2
            int r2 = r0.top
            float r2 = (float) r2
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 - r1
            float r0 = r0 / r4
            float r0 = r0 + r2
            r2 = 1029785518(0x3d6147ae, float:0.055)
            float r2 = r2 * r1
            float r2 = java.lang.Math.max(r4, r2)
            android.graphics.Paint r9 = r10.f10669a
            r9.setStrokeWidth(r2)
            r2 = 1043878380(0x3e3851ec, float:0.18)
            float r2 = r2 * r1
            float r4 = r3 + r2
            float r2 = r2 + r0
            r5 = 1062333317(0x3f51eb85, float:0.82)
            float r5 = r5 * r1
            float r6 = r3 + r5
            float r5 = r5 + r0
            android.graphics.RectF r7 = r10.f10670b
            r7.set(r4, r2, r6, r5)
            int r2 = r10.f10671c
            r4 = 2
            if (r2 != r4) goto L58
            r11.drawOval(r7, r9)
            goto L5f
        L58:
            r2 = 1041194025(0x3e0f5c29, float:0.14)
            float r2 = r2 * r1
            r11.drawRoundRect(r7, r2, r2, r9)
        L5f:
            r2 = 1052938076(0x3ec28f5c, float:0.38)
            float r2 = r2 * r1
            float r5 = r2 + r3
            r2 = 1058977874(0x3f1eb852, float:0.62)
            float r2 = r2 * r1
            float r2 = r2 + r3
            r3 = 1051931443(0x3eb33333, float:0.35)
            float r3 = r3 * r1
            float r6 = r3 + r0
            r3 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r1
            float r3 = r3 + r0
            r4 = 1059481190(0x3f266666, float:0.65)
            float r1 = r1 * r4
            float r8 = r1 + r0
            r7 = r5
            r4 = r11
            r4.drawLine(r5, r6, r7, r8, r9)
            r11 = r5
            r7 = r2
            r5 = r2
            r4.drawLine(r5, r6, r7, r8, r9)
            r8 = r3
            r6 = r3
            r7 = r5
            r5 = r11
            r4.drawLine(r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            r0 = 96
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r1 = this;
            r0 = 96
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
            android.graphics.Paint r0 = r1.f10669a
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f10669a
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }
}
