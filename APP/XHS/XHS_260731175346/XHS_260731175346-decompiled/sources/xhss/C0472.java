package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛵᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0472 extends android.view.View {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f1699;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f1700;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.graphics.Paint f1701;

    public C0472(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.f1699 = r2
            r0.f1700 = r3
            r0.<init>(r1)
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r2 = -73934028769349(0xffffbcc1e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setColor(r2)
            r2 = 1108344832(0x42100000, float:36.0)
            r1.setTextSize(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            r0.f1701 = r1
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -73976978442309(0xffffbcb7e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r2)
            super.onDraw(r18)
            java.lang.String r2 = r0.f1699
            java.lang.String r3 = r0.f1700
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.List r2 = xhss.AbstractC0086.m245(r2)
            android.graphics.Paint r3 = r0.f1701
            float r4 = r3.getFontSpacing()
            java.util.Iterator r5 = r2.iterator()
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lbe
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            float r6 = r3.measureText(r6)
        L35:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            float r7 = r3.measureText(r7)
            float r6 = java.lang.Math.max(r6, r7)
            goto L35
        L4a:
            int r5 = r0.getWidth()
            int r7 = r0.getWidth()
            int r7 = r7 * r5
            int r5 = r0.getHeight()
            int r8 = r0.getHeight()
            int r8 = r8 * r5
            int r8 = r8 + r7
            double r7 = (double) r8
            double r7 = java.lang.Math.sqrt(r7)
            float r5 = (float) r7
            r7 = 1128792064(0x43480000, float:200.0)
            float r6 = r6 + r7
            r7 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 * r4
            int r8 = r0.getWidth()
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r9
            int r10 = r1.save()
            r11 = -1041235968(0xffffffffc1f00000, float:-30.0)
            r1.rotate(r11, r8, r0)
            float r0 = -r5
            r8 = r0
        L82:
            float r11 = r5 * r9
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 >= 0) goto Lba
            r12 = r0
        L89:
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 >= 0) goto Lb8
            java.util.Iterator r13 = r2.iterator()     // Catch: java.lang.Throwable -> Lab
            r14 = 0
        L92:
            boolean r15 = r13.hasNext()     // Catch: java.lang.Throwable -> Lab
            if (r15 == 0) goto Lb2
            java.lang.Object r15 = r13.next()     // Catch: java.lang.Throwable -> Lab
            int r16 = r14 + 1
            if (r14 < 0) goto Lad
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> Lab
            float r14 = (float) r14     // Catch: java.lang.Throwable -> Lab
            float r14 = r14 * r4
            float r14 = r14 + r8
            r1.drawText(r15, r12, r14, r3)     // Catch: java.lang.Throwable -> Lab
            r14 = r16
            goto L92
        Lab:
            r0 = move-exception
            goto Lb4
        Lad:
            xhss.AbstractC0086.m244()     // Catch: java.lang.Throwable -> Lab
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Lab
        Lb2:
            float r12 = r12 + r6
            goto L89
        Lb4:
            r1.restoreToCount(r10)
            throw r0
        Lb8:
            float r8 = r8 + r7
            goto L82
        Lba:
            r1.restoreToCount(r10)
            return
        Lbe:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
