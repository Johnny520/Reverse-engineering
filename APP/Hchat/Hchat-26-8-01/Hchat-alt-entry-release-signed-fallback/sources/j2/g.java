package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b8.c f6691a = null;

    static {
            b8.c r0 = new b8.c
            r1 = 4
            r0.<init>(r1)
            j2.g.f6691a = r0
            return
    }

    public static android.text.StaticLayout a(java.lang.CharSequence r1, android.text.TextPaint r2, int r3, int r4, android.text.TextDirectionHeuristic r5, android.text.Layout.Alignment r6, int r7, android.text.TextUtils.TruncateAt r8, int r9, int r10, boolean r11, int r12, int r13, int r14, int r15) {
            if (r4 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "invalid start value"
            o2.a.a(r0)
        L8:
            int r0 = r1.length()
            if (r4 < 0) goto L11
            if (r4 > r0) goto L11
            goto L16
        L11:
            java.lang.String r0 = "invalid end value"
            o2.a.a(r0)
        L16:
            if (r7 < 0) goto L19
            goto L1e
        L19:
            java.lang.String r0 = "invalid maxLines value"
            o2.a.a(r0)
        L1e:
            if (r3 < 0) goto L21
            goto L26
        L21:
            java.lang.String r0 = "invalid width value"
            o2.a.a(r0)
        L26:
            if (r9 < 0) goto L29
            goto L2e
        L29:
            java.lang.String r0 = "invalid ellipsizedWidth value"
            o2.a.a(r0)
        L2e:
            r0 = 0
            android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r1, r0, r4, r2, r3)
            r1.setTextDirection(r5)
            r1.setAlignment(r6)
            r1.setMaxLines(r7)
            r1.setEllipsize(r8)
            r1.setEllipsizedWidth(r9)
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setLineSpacing(r2, r3)
            r1.setIncludePad(r11)
            r1.setBreakStrategy(r12)
            r1.setHyphenationFrequency(r15)
            r2 = 0
            r1.setIndents(r2, r2)
            r1.setJustificationMode(r10)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L61
            h3.c.f(r1)
        L61:
            r3 = 33
            if (r2 < r3) goto L78
            android.graphics.text.LineBreakConfig$Builder r3 = ai.a.f()
            android.graphics.text.LineBreakConfig$Builder r3 = ai.a.g(r3, r13)
            android.graphics.text.LineBreakConfig$Builder r3 = ai.a.C(r3, r14)
            android.graphics.text.LineBreakConfig r3 = ai.a.h(r3)
            ai.a.x(r1, r3)
        L78:
            r3 = 35
            if (r2 < r3) goto L7f
            j2.h.a(r1)
        L7f:
            android.text.StaticLayout r1 = r1.build()
            return r1
    }

    public static final android.graphics.Rect b(android.text.TextPaint r16, java.lang.CharSequence r17, int r18, int r19) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r1 instanceof android.text.Spanned
            if (r4 == 0) goto L7e
            r4 = r1
            android.text.Spanned r4 = (android.text.Spanned) r4
            int r6 = r2 + (-1)
            java.lang.Class<android.text.style.MetricAffectingSpan> r7 = android.text.style.MetricAffectingSpan.class
            int r6 = r4.nextSpanTransition(r6, r3, r7)
            if (r6 == r3) goto L7e
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.text.TextPaint r9 = new android.text.TextPaint
            r9.<init>()
        L28:
            if (r2 >= r3) goto L7d
            int r10 = r4.nextSpanTransition(r2, r3, r7)
            java.lang.Object[] r11 = r4.getSpans(r2, r10, r7)
            android.text.style.MetricAffectingSpan[] r11 = (android.text.style.MetricAffectingSpan[]) r11
            r9.set(r0)
            int r12 = r11.length
            r13 = 0
        L39:
            if (r13 >= r12) goto L4d
            r14 = r11[r13]
            int r15 = r4.getSpanStart(r14)
            int r5 = r4.getSpanEnd(r14)
            if (r15 == r5) goto L4a
            r14.updateMeasureState(r9)
        L4a:
            int r13 = r13 + 1
            goto L39
        L4d:
            int r5 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r5 < r11) goto L57
            j2.b.l(r9, r1, r2, r10, r8)
            goto L5e
        L57:
            java.lang.String r5 = r1.toString()
            r9.getTextBounds(r5, r2, r10, r8)
        L5e:
            int r2 = r6.right
            int r5 = r8.width()
            int r5 = r5 + r2
            r6.right = r5
            int r2 = r6.top
            int r5 = r8.top
            int r2 = java.lang.Math.min(r2, r5)
            r6.top = r2
            int r2 = r6.bottom
            int r5 = r8.bottom
            int r2 = java.lang.Math.max(r2, r5)
            r6.bottom = r2
            r2 = r10
            goto L28
        L7d:
            return r6
        L7e:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            int r5 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r5 < r11) goto L8d
            j2.b.l(r0, r1, r2, r3, r4)
            return r4
        L8d:
            java.lang.String r1 = r1.toString()
            r0.getTextBounds(r1, r2, r3, r4)
            return r4
    }

    public static final float c(int r2, int r3, float[] r4) {
            r0 = 2
            r1 = 1
            int r2 = p.a.z(r2, r3, r0, r1)
            r2 = r4[r2]
            return r2
    }

    public static final int d(android.text.Layout r2, int r3, boolean r4) {
            if (r3 > 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.CharSequence r0 = r2.getText()
            int r0 = r0.length()
            if (r3 < r0) goto L15
            int r2 = r2.getLineCount()
            int r2 = r2 + (-1)
            return r2
        L15:
            int r0 = r2.getLineForOffset(r3)
            int r1 = r2.getLineStart(r0)
            int r2 = r2.getLineEnd(r0)
            if (r1 == r3) goto L26
            if (r2 == r3) goto L26
            goto L2f
        L26:
            if (r1 != r3) goto L2d
            if (r4 == 0) goto L2f
            int r0 = r0 + (-1)
            return r0
        L2d:
            if (r4 == 0) goto L30
        L2f:
            return r0
        L30:
            int r0 = r0 + 1
            return r0
    }

    public static final int e(j2.k r19, android.text.Layout r20, be.k r21, int r22, android.graphics.RectF r23, k2.d r24, b0.t r25, boolean r26) {
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            int r7 = r1.getLineTop(r3)
            int r8 = r1.getLineBottom(r3)
            int r9 = r1.getLineStart(r3)
            int r1 = r1.getLineEnd(r3)
            if (r9 != r1) goto L23
        L20:
            r10 = -1
            goto L2c5
        L23:
            int r1 = r1 - r9
            int r1 = r1 * 2
            float[] r11 = new float[r1]
            android.text.Layout r12 = r0.f6700f
            int r13 = r12.getLineStart(r3)
            int r14 = r0.f(r3)
            int r15 = r14 - r13
            int r15 = r15 * 2
            if (r1 < r15) goto L39
            goto L3e
        L39:
            java.lang.String r1 = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2"
            o2.a.a(r1)
        L3e:
            e2.g r1 = new e2.g
            r1.<init>(r0)
            int r0 = r12.getParagraphDirection(r3)
            r15 = 0
            r10 = 1
            if (r0 != r10) goto L4d
            r0 = r10
            goto L4e
        L4d:
            r0 = r15
        L4e:
            r16 = r15
        L50:
            if (r13 >= r14) goto La7
            boolean r17 = r12.isRtlCharAt(r13)
            if (r0 == 0) goto L67
            if (r17 != 0) goto L67
            float r17 = r1.a(r13, r15, r15, r10)
            int r15 = r13 + 1
            float r15 = r1.a(r15, r10, r10, r10)
            r18 = r0
            goto L99
        L67:
            if (r0 == 0) goto L7d
            if (r17 == 0) goto L7d
            r15 = 0
            float r17 = r1.a(r13, r15, r15, r15)
            r18 = r0
            int r0 = r13 + 1
            float r0 = r1.a(r0, r10, r10, r15)
            r15 = r17
            r17 = r0
            goto L99
        L7d:
            r18 = r0
            r15 = 0
            if (r17 == 0) goto L8e
            float r0 = r1.a(r13, r15, r15, r10)
            int r15 = r13 + 1
            float r17 = r1.a(r15, r10, r10, r10)
        L8c:
            r15 = r0
            goto L99
        L8e:
            float r17 = r1.a(r13, r15, r15, r15)
            int r0 = r13 + 1
            float r0 = r1.a(r0, r10, r10, r15)
            goto L8c
        L99:
            r11[r16] = r17
            int r0 = r16 + 1
            r11[r0] = r15
            int r16 = r16 + 2
            int r13 = r13 + 1
            r0 = r18
            r15 = 0
            goto L50
        La7:
            java.lang.Object r0 = r2.f813b
            android.text.Layout r0 = (android.text.Layout) r0
            int r1 = r0.getLineStart(r3)
            int r3 = r0.getLineEnd(r3)
            r15 = 0
            int r12 = r2.j(r1, r15)
            int r13 = r2.k(r12)
            int r14 = r1 - r13
            int r13 = r3 - r13
            java.text.Bidi r2 = r2.e(r12)
            if (r2 == 0) goto Lf9
            java.text.Bidi r2 = r2.createLineBidi(r14, r13)
            if (r2 != 0) goto Lcd
            goto Lf9
        Lcd:
            int r0 = r2.getRunCount()
            j2.e[] r3 = new j2.e[r0]
            r15 = 0
        Ld4:
            if (r15 >= r0) goto L106
            j2.e r12 = new j2.e
            int r13 = r2.getRunStart(r15)
            int r13 = r13 + r1
            int r14 = r2.getRunLimit(r15)
            int r14 = r14 + r1
            int r16 = r2.getRunLevel(r15)
            r21 = r0
            int r0 = r16 % 2
            if (r0 != r10) goto Lee
            r0 = r10
            goto Lef
        Lee:
            r0 = 0
        Lef:
            r12.<init>(r13, r14, r0)
            r3[r15] = r12
            int r15 = r15 + 1
            r0 = r21
            goto Ld4
        Lf9:
            j2.e r2 = new j2.e
            boolean r0 = r0.isRtlCharAt(r1)
            r2.<init>(r1, r3, r0)
            j2.e[] r3 = new j2.e[]{r2}
        L106:
            if (r26 == 0) goto L10d
            lg.d r0 = tf.l.A0(r3)
            goto L117
        L10d:
            int r0 = r3.length
            int r0 = r0 - r10
            lg.b r1 = new lg.b
            r2 = -1
            r15 = 0
            r1.<init>(r0, r15, r2)
            r0 = r1
        L117:
            int r1 = r0.f8042g
            int r2 = r0.f8043h
            int r0 = r0.f8044i
            if (r0 <= 0) goto L121
            if (r1 <= r2) goto L125
        L121:
            if (r0 >= 0) goto L20
            if (r2 > r1) goto L20
        L125:
            r12 = r3[r1]
            boolean r13 = r12.f6682c
            int r14 = r12.f6680a
            int r12 = r12.f6681b
            if (r13 == 0) goto L137
            int r15 = r12 + (-1)
            int r15 = r15 - r9
            int r15 = r15 * 2
            r15 = r11[r15]
            goto L13d
        L137:
            int r15 = r14 - r9
            int r15 = r15 * 2
            r15 = r11[r15]
        L13d:
            if (r13 == 0) goto L144
            float r16 = c(r14, r9, r11)
            goto L14a
        L144:
            int r10 = r12 + (-1)
            float r16 = c(r10, r9, r11)
        L14a:
            float r10 = r4.left
            r17 = r0
            if (r26 == 0) goto L204
            int r18 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r18 < 0) goto L1a2
            float r0 = r4.right
            int r18 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r18 > 0) goto L1a2
            if (r13 != 0) goto L160
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L166
        L160:
            if (r13 == 0) goto L168
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L168
        L166:
            r0 = r14
            goto L19b
        L168:
            r0 = r12
            r10 = r14
        L16a:
            int r15 = r0 - r10
            r22 = r0
            r0 = 1
            if (r15 <= r0) goto L195
            int r0 = r22 + r10
            int r0 = r0 / 2
            int r15 = r0 - r9
            int r15 = r15 * 2
            r15 = r11[r15]
            r16 = r0
            if (r13 != 0) goto L185
            float r0 = r4.left
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 > 0) goto L18d
        L185:
            if (r13 == 0) goto L190
            float r0 = r4.right
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L190
        L18d:
            r0 = r16
            goto L16a
        L190:
            r0 = r22
            r10 = r16
            goto L16a
        L195:
            if (r13 == 0) goto L19a
            r0 = r22
            goto L19b
        L19a:
            r0 = r10
        L19b:
            int r0 = r5.h(r0)
            r10 = -1
            if (r0 != r10) goto L1a7
        L1a2:
            r18 = r3
        L1a4:
            r14 = -1
            goto L2b7
        L1a7:
            int r10 = r5.g(r0)
            if (r10 < r12) goto L1ae
            goto L1a2
        L1ae:
            if (r10 >= r14) goto L1b1
            goto L1b2
        L1b1:
            r14 = r10
        L1b2:
            if (r0 <= r12) goto L1b5
            r0 = r12
        L1b5:
            android.graphics.RectF r10 = new android.graphics.RectF
            float r15 = (float) r7
            r22 = r0
            float r0 = (float) r8
            r18 = r3
            r3 = 0
            r10.<init>(r3, r15, r3, r0)
            r0 = r22
        L1c3:
            if (r13 == 0) goto L1cd
            int r3 = r0 + (-1)
            int r3 = r3 - r9
            int r3 = r3 * 2
            r3 = r11[r3]
            goto L1d3
        L1cd:
            int r3 = r14 - r9
            int r3 = r3 * 2
            r3 = r11[r3]
        L1d3:
            r10.left = r3
            if (r13 == 0) goto L1dc
            float r0 = c(r14, r9, r11)
            goto L1e2
        L1dc:
            int r0 = r0 + (-1)
            float r0 = c(r0, r9, r11)
        L1e2:
            r10.right = r0
            java.lang.Object r0 = r6.invoke(r10, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f2
            goto L2b7
        L1f2:
            int r14 = r5.b(r14)
            r0 = -1
            if (r14 == r0) goto L1a4
            if (r14 < r12) goto L1fc
            goto L1a4
        L1fc:
            int r0 = r5.h(r14)
            if (r0 <= r12) goto L1c3
            r0 = r12
            goto L1c3
        L204:
            r18 = r3
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 < 0) goto L25a
            float r0 = r4.right
            int r3 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r3 > 0) goto L25a
            if (r13 != 0) goto L216
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 >= 0) goto L21c
        L216:
            if (r13 == 0) goto L220
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 > 0) goto L220
        L21c:
            int r0 = r12 + (-1)
        L21e:
            r15 = 1
            goto L252
        L220:
            r0 = r12
            r3 = r14
        L222:
            int r10 = r0 - r3
            r15 = 1
            if (r10 <= r15) goto L249
            int r10 = r0 + r3
            int r10 = r10 / 2
            int r15 = r10 - r9
            int r15 = r15 * 2
            r15 = r11[r15]
            r22 = r0
            if (r13 != 0) goto L23b
            float r0 = r4.right
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 > 0) goto L243
        L23b:
            if (r13 == 0) goto L245
            float r0 = r4.left
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L245
        L243:
            r0 = r10
            goto L222
        L245:
            r0 = r22
            r3 = r10
            goto L222
        L249:
            r22 = r0
            if (r13 == 0) goto L250
            r0 = r22
            goto L21e
        L250:
            r0 = r3
            goto L21e
        L252:
            int r0 = r0 + r15
            int r0 = r5.g(r0)
            r10 = -1
            if (r0 != r10) goto L25c
        L25a:
            r12 = -1
            goto L2b6
        L25c:
            int r3 = r5.h(r0)
            if (r3 > r14) goto L263
            goto L25a
        L263:
            if (r0 >= r14) goto L266
            r0 = r14
        L266:
            if (r3 <= r12) goto L269
            goto L26a
        L269:
            r12 = r3
        L26a:
            android.graphics.RectF r3 = new android.graphics.RectF
            float r10 = (float) r7
            float r15 = (float) r8
            r22 = r0
            r0 = 0
            r3.<init>(r0, r10, r0, r15)
            r0 = r22
        L276:
            if (r13 == 0) goto L280
            int r10 = r12 + (-1)
            int r10 = r10 - r9
            int r10 = r10 * 2
            r10 = r11[r10]
            goto L286
        L280:
            int r10 = r0 - r9
            int r10 = r10 * 2
            r10 = r11[r10]
        L286:
            r3.left = r10
            if (r13 == 0) goto L28f
            float r0 = c(r0, r9, r11)
            goto L295
        L28f:
            int r0 = r12 + (-1)
            float r0 = c(r0, r9, r11)
        L295:
            r3.right = r0
            java.lang.Object r0 = r6.invoke(r3, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2a4
            goto L2b6
        L2a4:
            int r12 = r5.c(r12)
            r10 = -1
            if (r12 == r10) goto L25a
            if (r12 > r14) goto L2ae
            goto L25a
        L2ae:
            int r0 = r5.g(r12)
            if (r0 >= r14) goto L276
            r0 = r14
            goto L276
        L2b6:
            r14 = r12
        L2b7:
            if (r14 < 0) goto L2ba
            return r14
        L2ba:
            if (r1 == r2) goto L20
            int r1 = r1 + r17
            r0 = r17
            r3 = r18
            r10 = 1
            goto L125
        L2c5:
            return r10
    }

    public static final boolean f(android.text.Spanned r2, java.lang.Class r3) {
            r0 = -1
            int r1 = r2.length()
            int r3 = r2.nextSpanTransition(r0, r1, r3)
            int r2 = r2.length()
            if (r3 == r2) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }
}
