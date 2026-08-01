package defpackage;

/* JADX INFO: renamed from: ᛳᛶᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0497 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.graphics.Matrix f2470;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.graphics.Path f2471;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f2472;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.Paint f2473;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f2474;

    public C0497(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.f2471 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f2470 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.f2473 = r0
            r1 = 1
            r0.setAntiAlias(r1)
            r1 = 1711538371(0x660400c3, float:1.558416E23)
            int r1 = defpackage.AbstractC1171.m2265(r3, r1)
            r0.setColor(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.content.res.Resources r3 = r3.getResources()
            r0 = 1711734870(0x66070056, float:1.5938142E23)
            int r0 = r3.getDimensionPixelOffset(r0)
            r2.f2474 = r0
            r0 = 1711734869(0x66070055, float:1.593814E23)
            int r3 = r3.getDimensionPixelOffset(r0)
            r2.f2472 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m1267(android.graphics.Path r8, float r9, float r10, float r11, float r12, float r13) {
            float r1 = r9 - r11
            float r2 = r10 - r11
            float r3 = r9 + r11
            float r4 = r10 + r11
            r7 = 0
            r0 = r8
            r5 = r12
            r6 = r13
            r0.arcTo(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.Path r0 = r1.f2471
            android.graphics.Paint r1 = r1.f2473
            r2.drawPath(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r1) {
            r0 = this;
            android.graphics.Path r0 = r0.f2471
            r1.setConvexPath(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r5) {
            r4 = this;
            int r0 = r4.getLayoutDirection()
            int r1 = r4.f2474
            int r4 = r4.f2472
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L10
            r5.set(r4, r2, r1, r2)
            goto L13
        L10:
            r5.set(r1, r2, r4, r2)
        L13:
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            r0.m1268()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r1) {
            r0 = this;
            r0.m1268()
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1268() {
            r11 = this;
            android.graphics.Path r0 = r11.f2471
            r0.reset()
            android.graphics.Rect r6 = r11.getBounds()
            int r1 = r6.width()
            float r1 = (float) r1
            int r2 = r6.height()
            float r2 = (float) r2
            r7 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r7
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.sqrt(r3)
            float r8 = (float) r3
            float r9 = r8 * r2
            float r3 = r2 + r9
            float r10 = java.lang.Math.max(r3, r1)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r1 = r2
            r3 = r1
            m1267(r0, r1, r2, r3, r4, r5)
            float r1 = r10 - r9
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = 1110704128(0x42340000, float:45.0)
            r3 = r2
            m1267(r0, r1, r2, r3, r4, r5)
            r9 = r1
            r1 = 1084227584(0x40a00000, float:5.0)
            float r3 = r2 / r1
            float r8 = r8 * r3
            float r1 = r10 - r8
            r4 = -1036779520(0xffffffffc2340000, float:-45.0)
            r5 = 1119092736(0x42b40000, float:90.0)
            m1267(r0, r1, r2, r3, r4, r5)
            r4 = 1110704128(0x42340000, float:45.0)
            r5 = 1110704128(0x42340000, float:45.0)
            r3 = r2
            r1 = r9
            m1267(r0, r1, r2, r3, r4, r5)
            r0.close()
            int r1 = r11.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L5b
            goto L5c
        L5b:
            r2 = 0
        L5c:
            android.graphics.Matrix r11 = r11.f2470
            if (r2 == 0) goto L6a
            float r10 = r10 / r7
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.setScale(r2, r3, r10, r1)
            goto L6d
        L6a:
            r11.reset()
        L6d:
            int r1 = r6.left
            float r1 = (float) r1
            int r2 = r6.top
            float r2 = (float) r2
            r11.postTranslate(r1, r2)
            r0.transform(r11)
            return
    }
}
