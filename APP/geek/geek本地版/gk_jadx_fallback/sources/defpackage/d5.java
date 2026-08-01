package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d5 {
    public final android.widget.TextView a;
    public defpackage.y60 b;
    public defpackage.y60 c;
    public defpackage.y60 d;
    public defpackage.y60 e;
    public defpackage.y60 f;
    public defpackage.y60 g;
    public defpackage.y60 h;
    public final defpackage.n5 i;
    public int j;
    public int k;
    public android.graphics.Typeface l;
    public boolean m;

    public d5(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j = r0
            r0 = -1
            r1.k = r0
            r1.a = r2
            n5 r0 = new n5
            r0.<init>(r2)
            r1.i = r0
            return
    }

    public static defpackage.y60 c(android.content.Context r1, defpackage.u3 r2, int r3) {
            monitor-enter(r2)
            w00 r0 = r2.a     // Catch: java.lang.Throwable -> L17
            android.content.res.ColorStateList r1 = r0.f(r1, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            if (r1 == 0) goto L15
            y60 r2 = new y60
            r2.<init>()
            r3 = 1
            r2.d = r3
            r2.a = r1
            return r2
        L15:
            r1 = 0
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public static void h(android.view.inputmethod.EditorInfo r10, android.view.inputmethod.InputConnection r11, android.widget.TextView r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lc1
            if (r11 == 0) goto Lc1
            java.lang.CharSequence r11 = r12.getText()
            if (r0 < r1) goto L12
            defpackage.wh.a(r10, r11)
            return
        L12:
            r11.getClass()
            if (r0 < r1) goto L1b
            defpackage.wh.a(r10, r11)
            return
        L1b:
            int r12 = r10.initialSelStart
            int r0 = r10.initialSelEnd
            if (r12 <= r0) goto L23
            r1 = r0
            goto L24
        L23:
            r1 = r12
        L24:
            if (r12 <= r0) goto L27
            goto L28
        L27:
            r12 = r0
        L28:
            int r0 = r11.length()
            r2 = 0
            r3 = 0
            if (r1 < 0) goto Lbe
            if (r12 <= r0) goto L34
            goto Lbe
        L34:
            int r4 = r10.inputType
            r4 = r4 & 4095(0xfff, float:5.738E-42)
            r5 = 129(0x81, float:1.81E-43)
            if (r4 == r5) goto Lba
            r5 = 225(0xe1, float:3.15E-43)
            if (r4 == r5) goto Lba
            r5 = 18
            if (r4 != r5) goto L46
            goto Lba
        L46:
            r3 = 2048(0x800, float:2.87E-42)
            if (r0 > r3) goto L4e
            defpackage.ff.N(r10, r11, r1, r12)
            return
        L4e:
            int r0 = r12 - r1
            r3 = 1024(0x400, float:1.435E-42)
            if (r0 <= r3) goto L56
            r3 = r2
            goto L57
        L56:
            r3 = r0
        L57:
            int r4 = r11.length()
            int r4 = r4 - r12
            int r5 = 2048 - r3
            r6 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r8 = (double) r5
            double r8 = r8 * r6
            int r6 = (int) r8
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r5 - r6
            int r4 = java.lang.Math.min(r4, r6)
            int r5 = r5 - r4
            int r5 = java.lang.Math.min(r1, r5)
            int r1 = r1 - r5
            char r6 = r11.charAt(r1)
            boolean r6 = java.lang.Character.isLowSurrogate(r6)
            if (r6 == 0) goto L84
            int r1 = r1 + 1
            int r5 = r5 + (-1)
        L84:
            int r6 = r12 + r4
            r7 = 1
            int r6 = r6 - r7
            char r6 = r11.charAt(r6)
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L94
            int r4 = r4 + (-1)
        L94:
            int r6 = r5 + r3
            int r8 = r6 + r4
            if (r3 == r0) goto Lb1
            int r0 = r1 + r5
            java.lang.CharSequence r0 = r11.subSequence(r1, r0)
            int r4 = r4 + r12
            java.lang.CharSequence r11 = r11.subSequence(r12, r4)
            r12 = 2
            java.lang.CharSequence[] r12 = new java.lang.CharSequence[r12]
            r12[r2] = r0
            r12[r7] = r11
            java.lang.CharSequence r11 = android.text.TextUtils.concat(r12)
            goto Lb6
        Lb1:
            int r8 = r8 + r1
            java.lang.CharSequence r11 = r11.subSequence(r1, r8)
        Lb6:
            defpackage.ff.N(r10, r11, r5, r6)
            return
        Lba:
            defpackage.ff.N(r10, r3, r2, r2)
            return
        Lbe:
            defpackage.ff.N(r10, r3, r2, r2)
        Lc1:
            return
    }

    public final void a(android.graphics.drawable.Drawable r2, defpackage.y60 r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r1.a
            int[] r0 = r0.getDrawableState()
            defpackage.u3.e(r2, r3, r0)
        Ld:
            return
    }

    public final void b() {
            r6 = this;
            y60 r0 = r6.b
            r1 = 2
            r2 = 0
            android.widget.TextView r3 = r6.a
            if (r0 != 0) goto L14
            y60 r0 = r6.c
            if (r0 != 0) goto L14
            y60 r0 = r6.d
            if (r0 != 0) goto L14
            y60 r0 = r6.e
            if (r0 == 0) goto L36
        L14:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawables()
            r4 = r0[r2]
            y60 r5 = r6.b
            r6.a(r4, r5)
            r4 = 1
            r4 = r0[r4]
            y60 r5 = r6.c
            r6.a(r4, r5)
            r4 = r0[r1]
            y60 r5 = r6.d
            r6.a(r4, r5)
            r4 = 3
            r0 = r0[r4]
            y60 r4 = r6.e
            r6.a(r0, r4)
        L36:
            y60 r0 = r6.f
            if (r0 != 0) goto L40
            y60 r0 = r6.g
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            android.graphics.drawable.Drawable[] r0 = defpackage.z4.a(r3)
            r2 = r0[r2]
            y60 r3 = r6.f
            r6.a(r2, r3)
            r0 = r0[r1]
            y60 r1 = r6.g
            r6.a(r0, r1)
            return
    }

    public final android.content.res.ColorStateList d() {
            r1 = this;
            y60 r0 = r1.h
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.a
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final android.graphics.PorterDuff.Mode e() {
            r1 = this;
            y60 r0 = r1.h
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final void f(android.util.AttributeSet r27, int r28) {
            r26 = this;
            r0 = r26
            r4 = r27
            r6 = r28
            android.widget.TextView r1 = r0.a
            android.content.Context r7 = r1.getContext()
            u3 r8 = defpackage.u3.a()
            int[] r3 = defpackage.xy.h
            r5 r9 = defpackage.r5.y(r7, r4, r3, r6)
            android.content.Context r2 = r1.getContext()
            java.lang.Object r5 = r9.b
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            defpackage.ja0.k(r1, r2, r3, r4, r5, r6)
            r10 = r1
            java.lang.Object r1 = r9.b
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r11 = 0
            r12 = -1
            int r2 = r1.getResourceId(r11, r12)
            r13 = 3
            boolean r3 = r1.hasValue(r13)
            if (r3 == 0) goto L3d
            int r3 = r1.getResourceId(r13, r11)
            y60 r3 = c(r7, r8, r3)
            r0.b = r3
        L3d:
            r14 = 1
            boolean r3 = r1.hasValue(r14)
            if (r3 == 0) goto L4e
            int r3 = r1.getResourceId(r14, r11)
            y60 r3 = c(r7, r8, r3)
            r0.c = r3
        L4e:
            r15 = 4
            boolean r3 = r1.hasValue(r15)
            if (r3 == 0) goto L5f
            int r3 = r1.getResourceId(r15, r11)
            y60 r3 = c(r7, r8, r3)
            r0.d = r3
        L5f:
            r3 = 2
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto L70
            int r5 = r1.getResourceId(r3, r11)
            y60 r5 = c(r7, r8, r5)
            r0.e = r5
        L70:
            int r5 = android.os.Build.VERSION.SDK_INT
            r13 = 5
            boolean r17 = r1.hasValue(r13)
            if (r17 == 0) goto L83
            int r3 = r1.getResourceId(r13, r11)
            y60 r3 = c(r7, r8, r3)
            r0.f = r3
        L83:
            r3 = 6
            boolean r18 = r1.hasValue(r3)
            if (r18 == 0) goto L94
            int r1 = r1.getResourceId(r3, r11)
            y60 r1 = c(r7, r8, r1)
            r0.g = r1
        L94:
            r9.z()
            android.text.method.TransformationMethod r1 = r10.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            int[] r9 = defpackage.xy.w
            r3 = 14
            r14 = 13
            r15 = 15
            if (r2 == r12) goto Le5
            r5 r13 = new r5
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r2, r9)
            r13.<init>(r7, r2)
            if (r1 != 0) goto Lc1
            boolean r22 = r2.hasValue(r3)
            if (r22 == 0) goto Lc1
            boolean r22 = r2.getBoolean(r3, r11)
            r23 = r22
            r22 = 1
            goto Lc5
        Lc1:
            r22 = r11
            r23 = r22
        Lc5:
            r0.n(r7, r13)
            boolean r24 = r2.hasValue(r15)
            if (r24 == 0) goto Ld3
            java.lang.String r24 = r2.getString(r15)
            goto Ld5
        Ld3:
            r24 = 0
        Ld5:
            boolean r25 = r2.hasValue(r14)
            if (r25 == 0) goto Le0
            java.lang.String r2 = r2.getString(r14)
            goto Le1
        Le0:
            r2 = 0
        Le1:
            r13.z()
            goto Lec
        Le5:
            r22 = r11
            r23 = r22
            r2 = 0
            r24 = 0
        Lec:
            r5 r13 = new r5
            android.content.res.TypedArray r9 = r7.obtainStyledAttributes(r4, r9, r6, r11)
            r13.<init>(r7, r9)
            if (r1 != 0) goto L103
            boolean r25 = r9.hasValue(r3)
            if (r25 == 0) goto L103
            boolean r23 = r9.getBoolean(r3, r11)
            r22 = 1
        L103:
            r3 = r23
            boolean r23 = r9.hasValue(r15)
            if (r23 == 0) goto L10f
            java.lang.String r24 = r9.getString(r15)
        L10f:
            boolean r23 = r9.hasValue(r14)
            if (r23 == 0) goto L119
            java.lang.String r2 = r9.getString(r14)
        L119:
            r15 = 28
            if (r5 < r15) goto L12d
            boolean r5 = r9.hasValue(r11)
            if (r5 == 0) goto L12d
            int r5 = r9.getDimensionPixelSize(r11, r12)
            if (r5 != 0) goto L12d
            r5 = 0
            r10.setTextSize(r11, r5)
        L12d:
            r0.n(r7, r13)
            r13.z()
            if (r1 != 0) goto L13a
            if (r22 == 0) goto L13a
            r10.setAllCaps(r3)
        L13a:
            android.graphics.Typeface r1 = r0.l
            if (r1 == 0) goto L14b
            int r3 = r0.k
            if (r3 != r12) goto L148
            int r3 = r0.j
            r10.setTypeface(r1, r3)
            goto L14b
        L148:
            r10.setTypeface(r1)
        L14b:
            if (r2 == 0) goto L150
            defpackage.b5.d(r10, r2)
        L150:
            if (r24 == 0) goto L159
            android.os.LocaleList r1 = defpackage.a5.a(r24)
            defpackage.a5.b(r10, r1)
        L159:
            n5 r9 = r0.i
            android.content.Context r13 = r9.j
            int[] r3 = defpackage.xy.i
            android.content.res.TypedArray r5 = r13.obtainStyledAttributes(r4, r3, r6, r11)
            android.widget.TextView r1 = r9.i
            android.content.Context r2 = r1.getContext()
            r15 = 2
            defpackage.ja0.k(r1, r2, r3, r4, r5, r6)
            r1 = 5
            boolean r2 = r5.hasValue(r1)
            if (r2 == 0) goto L17a
            int r1 = r5.getInt(r1, r11)
            r9.a = r1
        L17a:
            r1 = 4
            boolean r2 = r5.hasValue(r1)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L188
            float r1 = r5.getDimension(r1, r6)
            goto L189
        L188:
            r1 = r6
        L189:
            boolean r2 = r5.hasValue(r15)
            if (r2 == 0) goto L195
            float r2 = r5.getDimension(r15, r6)
        L193:
            r14 = 1
            goto L197
        L195:
            r2 = r6
            goto L193
        L197:
            boolean r19 = r5.hasValue(r14)
            if (r19 == 0) goto L1a3
            float r20 = r5.getDimension(r14, r6)
        L1a1:
            r14 = 3
            goto L1a6
        L1a3:
            r20 = r6
            goto L1a1
        L1a6:
            boolean r16 = r5.hasValue(r14)
            r28 = r6
            if (r16 == 0) goto L1dc
            int r6 = r5.getResourceId(r14, r11)
            if (r6 <= 0) goto L1dc
            android.content.res.Resources r14 = r5.getResources()
            android.content.res.TypedArray r6 = r14.obtainTypedArray(r6)
            int r14 = r6.length()
            int[] r11 = new int[r14]
            if (r14 <= 0) goto L1d9
            r15 = 0
        L1c5:
            if (r15 >= r14) goto L1d0
            int r24 = r6.getDimensionPixelSize(r15, r12)
            r11[r15] = r24
            int r15 = r15 + 1
            goto L1c5
        L1d0:
            int[] r11 = defpackage.n5.b(r11)
            r9.f = r11
            r9.i()
        L1d9:
            r6.recycle()
        L1dc:
            r5.recycle()
            boolean r5 = r9.j()
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L21d
            int r5 = r9.a
            r14 = 1
            if (r5 != r14) goto L220
            boolean r5 = r9.g
            if (r5 != 0) goto L219
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r11 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r11 != 0) goto L204
            r2 = 1094713344(0x41400000, float:12.0)
            r15 = 2
            float r2 = android.util.TypedValue.applyDimension(r15, r2, r5)
            goto L205
        L204:
            r15 = 2
        L205:
            int r11 = (r20 > r28 ? 1 : (r20 == r28 ? 0 : -1))
            if (r11 != 0) goto L20f
            r11 = 1121976320(0x42e00000, float:112.0)
            float r20 = android.util.TypedValue.applyDimension(r15, r11, r5)
        L20f:
            r5 = r20
            int r11 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r11 != 0) goto L216
            r1 = r6
        L216:
            r9.k(r2, r5, r1)
        L219:
            r9.h()
            goto L220
        L21d:
            r1 = 0
            r9.a = r1
        L220:
            boolean r1 = defpackage.cb0.b
            if (r1 == 0) goto L251
            int r1 = r9.a
            if (r1 == 0) goto L251
            int[] r1 = r9.f
            int r2 = r1.length
            if (r2 <= 0) goto L251
            int r2 = defpackage.b5.a(r10)
            float r2 = (float) r2
            int r2 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r2 == 0) goto L24d
            float r1 = r9.d
            int r1 = java.lang.Math.round(r1)
            float r2 = r9.e
            int r2 = java.lang.Math.round(r2)
            float r5 = r9.c
            int r5 = java.lang.Math.round(r5)
            r9 = 0
            defpackage.b5.b(r10, r1, r2, r5, r9)
            goto L251
        L24d:
            r9 = 0
            defpackage.b5.c(r10, r1, r9)
        L251:
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r4, r3)
            r2 = 8
            int r2 = r1.getResourceId(r2, r12)
            if (r2 == r12) goto L264
            android.graphics.drawable.Drawable r2 = r8.b(r7, r2)
        L261:
            r3 = 13
            goto L266
        L264:
            r2 = 0
            goto L261
        L266:
            int r3 = r1.getResourceId(r3, r12)
            if (r3 == r12) goto L271
            android.graphics.drawable.Drawable r3 = r8.b(r7, r3)
            goto L272
        L271:
            r3 = 0
        L272:
            r4 = 9
            int r4 = r1.getResourceId(r4, r12)
            if (r4 == r12) goto L280
            android.graphics.drawable.Drawable r4 = r8.b(r7, r4)
        L27e:
            r5 = 6
            goto L282
        L280:
            r4 = 0
            goto L27e
        L282:
            int r5 = r1.getResourceId(r5, r12)
            if (r5 == r12) goto L28d
            android.graphics.drawable.Drawable r5 = r8.b(r7, r5)
            goto L28e
        L28d:
            r5 = 0
        L28e:
            r9 = 10
            int r9 = r1.getResourceId(r9, r12)
            if (r9 == r12) goto L29b
            android.graphics.drawable.Drawable r9 = r8.b(r7, r9)
            goto L29c
        L29b:
            r9 = 0
        L29c:
            r11 = 7
            int r11 = r1.getResourceId(r11, r12)
            if (r11 == r12) goto L2a8
            android.graphics.drawable.Drawable r8 = r8.b(r7, r11)
            goto L2a9
        L2a8:
            r8 = 0
        L2a9:
            if (r9 != 0) goto L300
            if (r8 == 0) goto L2ae
            goto L300
        L2ae:
            if (r2 != 0) goto L2b6
            if (r3 != 0) goto L2b6
            if (r4 != 0) goto L2b6
            if (r5 == 0) goto L323
        L2b6:
            android.graphics.drawable.Drawable[] r8 = defpackage.z4.a(r10)
            r21 = 0
            r9 = r8[r21]
            if (r9 != 0) goto L2e9
            r22 = 2
            r11 = r8[r22]
            if (r11 == 0) goto L2c7
            goto L2e9
        L2c7:
            android.graphics.drawable.Drawable[] r8 = r10.getCompoundDrawables()
            if (r2 == 0) goto L2ce
            goto L2d0
        L2ce:
            r2 = r8[r21]
        L2d0:
            if (r3 == 0) goto L2d3
            goto L2d7
        L2d3:
            r19 = 1
            r3 = r8[r19]
        L2d7:
            if (r4 == 0) goto L2da
            goto L2de
        L2da:
            r22 = 2
            r4 = r8[r22]
        L2de:
            if (r5 == 0) goto L2e1
            goto L2e5
        L2e1:
            r16 = 3
            r5 = r8[r16]
        L2e5:
            r10.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r5)
            goto L323
        L2e9:
            if (r3 == 0) goto L2ee
        L2eb:
            r22 = 2
            goto L2f3
        L2ee:
            r19 = 1
            r3 = r8[r19]
            goto L2eb
        L2f3:
            r2 = r8[r22]
            if (r5 == 0) goto L2f8
            goto L2fc
        L2f8:
            r16 = 3
            r5 = r8[r16]
        L2fc:
            defpackage.z4.b(r10, r9, r3, r2, r5)
            goto L323
        L300:
            android.graphics.drawable.Drawable[] r2 = defpackage.z4.a(r10)
            if (r9 == 0) goto L307
            goto L30b
        L307:
            r21 = 0
            r9 = r2[r21]
        L30b:
            if (r3 == 0) goto L30e
            goto L312
        L30e:
            r19 = 1
            r3 = r2[r19]
        L312:
            if (r8 == 0) goto L315
            goto L319
        L315:
            r22 = 2
            r8 = r2[r22]
        L319:
            if (r5 == 0) goto L31c
            goto L320
        L31c:
            r16 = 3
            r5 = r2[r16]
        L320:
            defpackage.z4.b(r10, r9, r3, r8, r5)
        L323:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L346
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L33f
            r9 = 0
            int r3 = r1.getResourceId(r2, r9)
            if (r3 == 0) goto L33f
            android.content.res.ColorStateList r3 = defpackage.ip.v(r7, r3)
            if (r3 == 0) goto L33f
            goto L343
        L33f:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L343:
            defpackage.l60.f(r10, r3)
        L346:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L35a
            int r2 = r1.getInt(r2, r12)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = defpackage.eh.b(r2, r3)
            defpackage.l60.g(r10, r2)
        L35a:
            r2 = 15
            int r2 = r1.getDimensionPixelSize(r2, r12)
            r3 = 18
            int r3 = r1.getDimensionPixelSize(r3, r12)
            r4 = 19
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r1.recycle()
            if (r2 == r12) goto L374
            defpackage.zt.L(r10, r2)
        L374:
            if (r3 == r12) goto L379
            defpackage.zt.M(r10, r3)
        L379:
            if (r4 == r12) goto L38e
            defpackage.zt.e(r4)
            android.text.TextPaint r1 = r10.getPaint()
            r3 = 0
            int r1 = r1.getFontMetricsInt(r3)
            if (r4 == r1) goto L38e
            int r4 = r4 - r1
            float r1 = (float) r4
            r10.setLineSpacing(r1, r6)
        L38e:
            return
    }

    public final void g(android.content.Context r6, int r7) {
            r5 = this;
            r5 r0 = new r5
            int[] r1 = defpackage.xy.w
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
            r0.<init>(r6, r7)
            r1 = 14
            boolean r2 = r7.hasValue(r1)
            android.widget.TextView r3 = r5.a
            r4 = 0
            if (r2 == 0) goto L1d
            boolean r1 = r7.getBoolean(r1, r4)
            r3.setAllCaps(r1)
        L1d:
            boolean r1 = r7.hasValue(r4)
            if (r1 == 0) goto L2e
            r1 = -1
            int r1 = r7.getDimensionPixelSize(r4, r1)
            if (r1 != 0) goto L2e
            r1 = 0
            r3.setTextSize(r4, r1)
        L2e:
            r5.n(r6, r0)
            r6 = 13
            boolean r1 = r7.hasValue(r6)
            if (r1 == 0) goto L42
            java.lang.String r6 = r7.getString(r6)
            if (r6 == 0) goto L42
            defpackage.b5.d(r3, r6)
        L42:
            r0.z()
            android.graphics.Typeface r6 = r5.l
            if (r6 == 0) goto L4e
            int r7 = r5.j
            r3.setTypeface(r6, r7)
        L4e:
            return
    }

    public final void i(int r3, int r4, int r5, int r6) {
            r2 = this;
            n5 r0 = r2.i
            boolean r1 = r0.j()
            if (r1 == 0) goto L2d
            android.content.Context r1 = r0.j
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r3 = (float) r3
            float r3 = android.util.TypedValue.applyDimension(r6, r3, r1)
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r1)
            float r5 = (float) r5
            float r5 = android.util.TypedValue.applyDimension(r6, r5, r1)
            r0.k(r3, r4, r5)
            boolean r3 = r0.h()
            if (r3 == 0) goto L2d
            r0.a()
        L2d:
            return
    }

    public final void j(int[] r7, int r8) {
            r6 = this;
            n5 r0 = r6.i
            boolean r1 = r0.j()
            if (r1 == 0) goto L61
            int r1 = r7.length
            r2 = 0
            if (r1 <= 0) goto L56
            int[] r3 = new int[r1]
            if (r8 != 0) goto L15
            int[] r3 = java.util.Arrays.copyOf(r7, r1)
            goto L31
        L15:
            android.content.Context r4 = r0.j
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
        L1f:
            if (r2 >= r1) goto L31
            r5 = r7[r2]
            float r5 = (float) r5
            float r5 = android.util.TypedValue.applyDimension(r8, r5, r4)
            int r5 = java.lang.Math.round(r5)
            r3[r2] = r5
            int r2 = r2 + 1
            goto L1f
        L31:
            int[] r8 = defpackage.n5.b(r3)
            r0.f = r8
            boolean r8 = r0.i()
            if (r8 == 0) goto L3e
            goto L58
        L3e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "None of the preset sizes is valid: "
            r0.<init>(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L56:
            r0.g = r2
        L58:
            boolean r7 = r0.h()
            if (r7 == 0) goto L61
            r0.a()
        L61:
            return
    }

    public final void k(int r5) {
            r4 = this;
            n5 r0 = r4.i
            boolean r1 = r0.j()
            if (r1 == 0) goto L58
            if (r5 == 0) goto L47
            r1 = 1
            if (r5 != r1) goto L33
            android.content.Context r5 = r0.j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r1 = 1094713344(0x41400000, float:12.0)
            r2 = 2
            float r1 = android.util.TypedValue.applyDimension(r2, r1, r5)
            r3 = 1121976320(0x42e00000, float:112.0)
            float r5 = android.util.TypedValue.applyDimension(r2, r3, r5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.k(r1, r5, r2)
            boolean r5 = r0.h()
            if (r5 == 0) goto L58
            r0.a()
            return
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown auto-size text type: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L47:
            r5 = 0
            r0.a = r5
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.d = r1
            r0.e = r1
            r0.c = r1
            int[] r1 = new int[r5]
            r0.f = r1
            r0.b = r5
        L58:
            return
    }

    public final void l(android.content.res.ColorStateList r2) {
            r1 = this;
            y60 r0 = r1.h
            if (r0 != 0) goto Lb
            y60 r0 = new y60
            r0.<init>()
            r1.h = r0
        Lb:
            y60 r0 = r1.h
            r0.a = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.d = r2
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            return
    }

    public final void m(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            y60 r0 = r1.h
            if (r0 != 0) goto Lb
            y60 r0 = new y60
            r0.<init>()
            r1.h = r0
        Lb:
            y60 r0 = r1.h
            r0.b = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.c = r2
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            return
    }

    public final void n(android.content.Context r12, defpackage.r5 r13) {
            r11 = this;
            int r0 = r11.j
            java.lang.Object r1 = r13.b
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 2
            int r0 = r1.getInt(r2, r0)
            r11.j = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = -1
            r4 = 28
            if (r0 < r4) goto L23
            r5 = 11
            int r5 = r1.getInt(r5, r3)
            r11.k = r5
            if (r5 == r3) goto L23
            int r5 = r11.j
            r5 = r5 & r2
            r11.j = r5
        L23:
            r5 = 10
            boolean r6 = r1.hasValue(r5)
            r7 = 12
            r8 = 0
            r9 = 1
            if (r6 != 0) goto L5a
            boolean r6 = r1.hasValue(r7)
            if (r6 == 0) goto L36
            goto L5a
        L36:
            boolean r12 = r1.hasValue(r9)
            if (r12 == 0) goto Ld5
            r11.m = r8
            int r12 = r1.getInt(r9, r9)
            if (r12 == r9) goto L55
            if (r12 == r2) goto L50
            r13 = 3
            if (r12 == r13) goto L4b
            goto Ld5
        L4b:
            android.graphics.Typeface r12 = android.graphics.Typeface.MONOSPACE
            r11.l = r12
            return
        L50:
            android.graphics.Typeface r12 = android.graphics.Typeface.SERIF
            r11.l = r12
            return
        L55:
            android.graphics.Typeface r12 = android.graphics.Typeface.SANS_SERIF
            r11.l = r12
            return
        L5a:
            r6 = 0
            r11.l = r6
            boolean r6 = r1.hasValue(r7)
            if (r6 == 0) goto L64
            r5 = r7
        L64:
            int r6 = r11.k
            int r7 = r11.j
            boolean r12 = r12.isRestricted()
            if (r12 != 0) goto La8
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            android.widget.TextView r10 = r11.a
            r12.<init>(r10)
            x4 r10 = new x4
            r10.<init>(r11, r6, r7, r12)
            int r12 = r11.j     // Catch: java.lang.Throwable -> La8
            android.graphics.Typeface r12 = r13.o(r5, r12, r10)     // Catch: java.lang.Throwable -> La8
            if (r12 == 0) goto L9f
            if (r0 < r4) goto L9d
            int r13 = r11.k     // Catch: java.lang.Throwable -> La8
            if (r13 == r3) goto L9d
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r8)     // Catch: java.lang.Throwable -> La8
            int r13 = r11.k     // Catch: java.lang.Throwable -> La8
            int r0 = r11.j     // Catch: java.lang.Throwable -> La8
            r0 = r0 & r2
            if (r0 == 0) goto L95
            r0 = r9
            goto L96
        L95:
            r0 = r8
        L96:
            android.graphics.Typeface r12 = defpackage.c5.a(r12, r13, r0)     // Catch: java.lang.Throwable -> La8
            r11.l = r12     // Catch: java.lang.Throwable -> La8
            goto L9f
        L9d:
            r11.l = r12     // Catch: java.lang.Throwable -> La8
        L9f:
            android.graphics.Typeface r12 = r11.l     // Catch: java.lang.Throwable -> La8
            if (r12 != 0) goto La5
            r12 = r9
            goto La6
        La5:
            r12 = r8
        La6:
            r11.m = r12     // Catch: java.lang.Throwable -> La8
        La8:
            android.graphics.Typeface r12 = r11.l
            if (r12 != 0) goto Ld5
            java.lang.String r12 = r1.getString(r5)
            if (r12 == 0) goto Ld5
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r4) goto Lcd
            int r13 = r11.k
            if (r13 == r3) goto Lcd
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r8)
            int r13 = r11.k
            int r0 = r11.j
            r0 = r0 & r2
            if (r0 == 0) goto Lc6
            r8 = r9
        Lc6:
            android.graphics.Typeface r12 = defpackage.c5.a(r12, r13, r8)
            r11.l = r12
            goto Ld5
        Lcd:
            int r13 = r11.j
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r13)
            r11.l = r12
        Ld5:
            return
    }
}
