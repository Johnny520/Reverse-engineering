package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j30 extends defpackage.o30 {
    public final defpackage.l30 c;

    public j30(defpackage.l30 r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // defpackage.o30
    public final void a(android.graphics.Matrix r23, defpackage.d30 r24, int r25, android.graphics.Canvas r26) {
            r22 = this;
            r0 = r24
            r1 = r25
            r2 = r22
            r3 = r26
            l30 r4 = r2.c
            float r5 = r4.f
            float r6 = r4.g
            android.graphics.RectF r7 = new android.graphics.RectF
            float r8 = r4.b
            float r9 = r4.c
            float r10 = r4.d
            float r4 = r4.e
            r7.<init>(r8, r9, r10, r4)
            android.graphics.Paint r8 = r0.b
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r10 = 1
            r11 = 0
            if (r9 >= 0) goto L26
            r9 = r10
            goto L27
        L26:
            r9 = r11
        L27:
            android.graphics.Path r12 = r0.g
            r13 = 3
            r14 = 2
            int[] r19 = defpackage.d30.k
            if (r9 == 0) goto L40
            r19[r11] = r11
            int r11 = r0.f
            r19[r10] = r11
            int r11 = r0.e
            r19[r14] = r11
            int r11 = r0.d
            r19[r13] = r11
            r16 = r4
            goto L69
        L40:
            r12.rewind()
            float r15 = r7.centerX()
            r16 = r4
            float r4 = r7.centerY()
            r12.moveTo(r15, r4)
            r12.arcTo(r7, r5, r6)
            r12.close()
            int r4 = -r1
            float r4 = (float) r4
            r7.inset(r4, r4)
            r19[r11] = r11
            int r4 = r0.d
            r19[r10] = r4
            int r4 = r0.e
            r19[r14] = r4
            int r4 = r0.f
            r19[r13] = r4
        L69:
            float r4 = r7.width()
            r11 = 1073741824(0x40000000, float:2.0)
            float r18 = r4 / r11
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 > 0) goto L76
            return
        L76:
            float r1 = (float) r1
            float r1 = r1 / r18
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 - r1
            float r13 = r4 - r1
            float r13 = r13 / r11
            float r13 = r13 + r1
            float[] r20 = defpackage.d30.l
            r20[r10] = r1
            r20[r14] = r13
            android.graphics.RadialGradient r15 = new android.graphics.RadialGradient
            float r16 = r7.centerX()
            float r17 = r7.centerY()
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.CLAMP
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r8.setShader(r15)
            r3.save()
            r1 = r23
            r3.concat(r1)
            float r1 = r7.height()
            float r10 = r7.width()
            float r1 = r1 / r10
            r3.scale(r4, r1)
            if (r9 != 0) goto Lb9
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r3.clipPath(r12, r1)
            android.graphics.Paint r0 = r0.h
            r3.drawPath(r12, r0)
        Lb9:
            r4 = r7
            r7 = 1
            r3.drawArc(r4, r5, r6, r7, r8)
            r26.restore()
            return
    }
}
