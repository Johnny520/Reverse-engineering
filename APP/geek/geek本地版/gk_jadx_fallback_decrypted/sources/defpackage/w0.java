package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends android.graphics.drawable.Drawable {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public w0() {
            r2 = this;
            r0 = 1
            r2.a = r0
            r2.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r1 = -1
            r0.setColor(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            r1 = 1084227584(0x40a00000, float:5.0)
            r0.setStrokeWidth(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            r0.setStrokeJoin(r1)
            r2.b = r0
            return
    }

    public w0(androidx.appcompat.widget.ActionBarContainer r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    private final void a(int r1) {
            r0 = this;
            return
    }

    private final void b(int r1) {
            r0 = this;
            return
    }

    private final void c(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }

    private final void d(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r13) {
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L50;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "ZGKg9PPy\n"
            java.lang.String r1 = "BwPOgpKB8oI=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r13)
            android.graphics.Rect r0 = r12.getBounds()
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r1 = r12.getBounds()
            int r1 = r1.height()
            float r1 = (float) r1
            r2 = 1049582633(0x3e8f5c29, float:0.28)
            float r4 = r0 * r2
            r2 = 1057300152(0x3f051eb8, float:0.52)
            float r5 = r1 * r2
            r2 = 1054951342(0x3ee147ae, float:0.44)
            float r6 = r0 * r2
            r2 = 1059984507(0x3f2e147b, float:0.68)
            float r7 = r1 * r2
            java.lang.Object r2 = r12.b
            r8 = r2
            android.graphics.Paint r8 = (android.graphics.Paint) r8
            r3 = r13
            r3.drawLine(r4, r5, r6, r7, r8)
            r13 = 1061158912(0x3f400000, float:0.75)
            float r9 = r0 * r13
            r13 = 1051931443(0x3eb33333, float:0.35)
            float r10 = r1 * r13
            r11 = r8
            r8 = r7
            r7 = r6
            r6 = r3
            r6.drawLine(r7, r8, r9, r10, r11)
            return
        L50:
            r3 = r13
            java.lang.Object r13 = r12.b
            androidx.appcompat.widget.ActionBarContainer r13 = (androidx.appcompat.widget.ActionBarContainer) r13
            boolean r0 = r13.g
            if (r0 == 0) goto L61
            android.graphics.drawable.Drawable r13 = r13.f
            if (r13 == 0) goto L73
            r13.draw(r3)
            goto L73
        L61:
            android.graphics.drawable.Drawable r0 = r13.d
            if (r0 == 0) goto L68
            r0.draw(r3)
        L68:
            android.graphics.drawable.Drawable r0 = r13.e
            if (r0 == 0) goto L73
            boolean r13 = r13.h
            if (r13 == 0) goto L73
            r0.draw(r3)
        L73:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = -3
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.getOutline(r3)
            return
        L9:
            java.lang.Object r0 = r2.b
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            boolean r1 = r0.g
            if (r1 == 0) goto L1b
            android.graphics.drawable.Drawable r1 = r0.f
            if (r1 == 0) goto L22
            android.graphics.drawable.Drawable r0 = r0.d
            r0.getOutline(r3)
            goto L22
        L1b:
            android.graphics.drawable.Drawable r0 = r0.d
            if (r0 == 0) goto L22
            r0.getOutline(r3)
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            int r1 = r0.a
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            int r1 = r0.a
            return
    }
}
