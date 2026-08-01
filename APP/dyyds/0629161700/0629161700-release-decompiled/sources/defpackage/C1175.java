package defpackage;

/* JADX INFO: renamed from: ᛶᲇᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1175 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.Paint f5302;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public float f5303;

    public C1175(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            r0 = -519991975124526(0xfffe2711ef0961d2, double:NaN)
            r0 = -520030629830190(0xfffe2708ef0961d2, double:NaN)
            r8.<init>()
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}
            java.util.List r9 = defpackage.AbstractC0425.m1186(r9)
            android.graphics.Paint r10 = new android.graphics.Paint
            r0 = 1
            r10.<init>(r0)
            r1 = -520064989568558(0xfffe2700ef0961d2, double:NaN)
            java.lang.String r1 = "#33000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r10.setColor(r1)
            r1 = 1108344832(0x42100000, float:36.0)
            r10.setTextSize(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r10.setStyle(r1)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r0)
            r1.setFilterBitmap(r0)
            r8.f5302 = r1
            android.graphics.Paint$FontMetrics r1 = r10.getFontMetrics()
            float r2 = r10.getFontSpacing()
            java.util.Iterator r3 = r9.iterator()
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld7
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            float r4 = r10.measureText(r4)
        L61:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            float r5 = r10.measureText(r5)
            float r4 = java.lang.Math.max(r4, r5)
            goto L61
        L76:
            r3 = 1128792064(0x43480000, float:200.0)
            float r4 = r4 + r3
            double r3 = (double) r4
            double r3 = java.lang.Math.ceil(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            if (r3 >= r0) goto L83
            r3 = r0
        L83:
            r4 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r2
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            if (r4 >= r0) goto L90
            goto L91
        L90:
            r0 = r4
        L91:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r0, r4)
            r3 = -520253968129582(0xfffe26d4ef0961d2, double:NaN)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            float r1 = r1.ascent
            float r1 = -r1
            java.util.Iterator r9 = r9.iterator()
            r4 = 0
        Lac:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r9.next()
            int r6 = r4 + 1
            if (r4 < 0) goto Lc5
            java.lang.String r5 = (java.lang.String) r5
            float r4 = (float) r4
            float r4 = r4 * r2
            float r4 = r4 + r1
            r7 = 0
            r3.drawText(r5, r7, r4, r10)
            r4 = r6
            goto Lac
        Lc5:
            defpackage.AbstractC0425.m1196()
            r8 = 0
            throw r8
        Lca:
            android.graphics.Paint r8 = r8.f5302
            android.graphics.BitmapShader r9 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.REPEAT
            r9.<init>(r0, r10, r10)
            r8.setShader(r9)
            return
        Ld7:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            r0 = -520159478849070(0xfffe26eaef0961d2, double:NaN)
            android.graphics.Rect r0 = r10.getBounds()
            r1 = -520189543620142(0xfffe26e3ef0961d2, double:NaN)
            int r1 = r0.width()
            if (r1 <= 0) goto L5c
            int r1 = r0.height()
            if (r1 > 0) goto L21
            goto L5c
        L21:
            float r1 = r0.exactCenterX()
            float r2 = r0.exactCenterY()
            int r3 = r11.save()
            r4 = -1041235968(0xffffffffc1f00000, float:-30.0)
            r11.rotate(r4, r1, r2)
            int r1 = r0.left     // Catch: java.lang.Throwable -> L55
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L55
            float r2 = r10.f5303     // Catch: java.lang.Throwable -> L55
            float r5 = r1 - r2
            int r1 = r0.top     // Catch: java.lang.Throwable -> L55
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L55
            float r6 = r1 - r2
            int r1 = r0.right     // Catch: java.lang.Throwable -> L55
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L55
            float r7 = r1 + r2
            int r0 = r0.bottom     // Catch: java.lang.Throwable -> L55
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L55
            float r8 = r0 + r2
            android.graphics.Paint r9 = r10.f5302     // Catch: java.lang.Throwable -> L55
            r4 = r11
            r4.drawRect(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L52
            r4.restoreToCount(r3)
            return
        L52:
            r0 = move-exception
        L53:
            r10 = r0
            goto L58
        L55:
            r0 = move-exception
            r4 = r11
            goto L53
        L58:
            r4.restoreToCount(r3)
            throw r10
        L5c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r3) {
            r2 = this;
            r0 = -520129414077998(0xfffe26f1ef0961d2, double:NaN)
            super.onBoundsChange(r3)
            int r0 = r3.width()
            float r0 = (float) r0
            int r3 = r3.height()
            float r3 = (float) r3
            float r0 = r0 * r0
            float r3 = r3 * r3
            float r3 = r3 + r0
            double r0 = (double) r3
            double r0 = java.lang.Math.sqrt(r0)
            float r3 = (float) r0
            r2.f5303 = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f5302
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f5302
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2286(android.view.View r3) {
            r2 = this;
            r0 = -520107939241518(0xfffe26f6ef0961d2, double:NaN)
            int r0 = r3.getWidth()
            int r3 = r3.getHeight()
            r1 = 0
            r2.setBounds(r1, r1, r0, r3)
            r2.invalidateSelf()
            return
    }
}
