package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends defpackage.kz {
    public final android.graphics.Paint a;
    public final java.util.List b;

    public o8() {
            r2 = this;
            r2.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.a = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r2.b = r1
            r1 = 1084227584(0x40a00000, float:5.0)
            r0.setStrokeWidth(r1)
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            r0.setColor(r1)
            return
    }

    @Override // defpackage.kz
    public final void b(android.graphics.Canvas r11, androidx.recyclerview.widget.RecyclerView r12) {
            r10 = this;
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131165421(0x7f0700ed, float:1.7945059E38)
            float r0 = r0.getDimension(r1)
            android.graphics.Paint r6 = r10.a
            r6.setStrokeWidth(r0)
            java.util.List r0 = r10.b
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lef
            java.lang.Object r1 = r0.next()
            bq r1 = (defpackage.bq) r1
            r1.getClass()
            java.lang.ThreadLocal r1 = defpackage.ib.a
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            float r1 = r1 - r2
            r3 = -65281(0xffffffffffff00ff, float:NaN)
            int r4 = android.graphics.Color.alpha(r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            r5 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            int r7 = android.graphics.Color.alpha(r5)
            float r7 = (float) r7
            float r7 = r7 * r2
            float r7 = r7 + r4
            int r4 = android.graphics.Color.red(r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r8 = android.graphics.Color.red(r5)
            float r8 = (float) r8
            float r8 = r8 * r2
            float r8 = r8 + r4
            int r4 = android.graphics.Color.green(r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r9 = android.graphics.Color.green(r5)
            float r9 = (float) r9
            float r9 = r9 * r2
            float r9 = r9 + r4
            int r3 = android.graphics.Color.blue(r3)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r1 = android.graphics.Color.blue(r5)
            float r1 = (float) r1
            float r1 = r1 * r2
            float r1 = r1 + r3
            int r2 = (int) r7
            int r3 = (int) r8
            int r4 = (int) r9
            int r1 = (int) r1
            int r1 = android.graphics.Color.argb(r2, r3, r4, r1)
            r6.setColor(r1)
            nz r1 = r12.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
            boolean r1 = r1.y0()
            r2 = 0
            if (r1 == 0) goto Lb4
            nz r1 = r12.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
            p8 r1 = r1.p
            int r3 = r1.b
            switch(r3) {
                case 0: goto L90;
                default: goto L8a;
            }
        L8a:
            com.google.android.material.carousel.CarouselLayoutManager r1 = r1.c
            int r2 = r1.E()
        L90:
            float r3 = (float) r2
            nz r1 = r12.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
            p8 r1 = r1.p
            int r2 = r1.b
            switch(r2) {
                case 0: goto La8;
                default: goto L9e;
            }
        L9e:
            com.google.android.material.carousel.CarouselLayoutManager r1 = r1.c
            int r2 = r1.o
            int r1 = r1.B()
            int r2 = r2 - r1
            goto Lac
        La8:
            com.google.android.material.carousel.CarouselLayoutManager r1 = r1.c
            int r2 = r1.o
        Lac:
            float r5 = (float) r2
            r2 = 0
            r4 = 0
            r1 = r11
            r1.drawLine(r2, r3, r4, r5, r6)
            goto Lec
        Lb4:
            r1 = r11
            nz r11 = r12.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r11 = (com.google.android.material.carousel.CarouselLayoutManager) r11
            p8 r11 = r11.p
            int r3 = r11.b
            switch(r3) {
                case 0: goto Lc3;
                default: goto Lc2;
            }
        Lc2:
            goto Lc9
        Lc3:
            com.google.android.material.carousel.CarouselLayoutManager r11 = r11.c
            int r2 = r11.C()
        Lc9:
            float r2 = (float) r2
            nz r11 = r12.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r11 = (com.google.android.material.carousel.CarouselLayoutManager) r11
            p8 r11 = r11.p
            int r3 = r11.b
            switch(r3) {
                case 0: goto Ldc;
                default: goto Ld7;
            }
        Ld7:
            com.google.android.material.carousel.CarouselLayoutManager r11 = r11.c
            int r11 = r11.n
            goto Le6
        Ldc:
            com.google.android.material.carousel.CarouselLayoutManager r11 = r11.c
            int r3 = r11.n
            int r11 = r11.D()
            int r11 = r3 - r11
        Le6:
            float r4 = (float) r11
            r5 = 0
            r3 = 0
            r1.drawLine(r2, r3, r4, r5, r6)
        Lec:
            r11 = r1
            goto L16
        Lef:
            return
    }
}
