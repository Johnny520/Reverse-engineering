package defpackage;

/* JADX INFO: renamed from: 岵€釠滇洿釠? reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1674 extends defpackage.AbstractC1304 {

    /* JADX INFO: renamed from: 岵堘矆釠羔瞾, reason: contains not printable characters */
    public final /* synthetic */ int f7466;

    public /* synthetic */ C1674(android.view.View r1, int r2) {
            r0 = this;
            r0.f7466 = r2
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: 釠贬洺釠册浉, reason: contains not printable characters */
    public static final void m3067(android.widget.TextView r2, boolean r3) {
            if (r3 == 0) goto L23
            r0 = -106017257332270(0xffff9f93ef0961d2, double:NaN)
            java.lang.String r3 = "宸茶缃?
            r2.setText(r3)
            android.content.Context r3 = r2.getContext()
            r0 = 1711669380(0x66060084, float:1.5820166E23)
            int r3 = r3.getColor(r0)
            r2.setTextColor(r3)
            r3 = 1711800438(0x66080076, float:1.6056259E23)
            r2.setBackgroundResource(r3)
            return
        L23:
            r0 = -106034437201454(0xffff9f8fef0961d2, double:NaN)
            java.lang.String r3 = "榛樿"
            r2.setText(r3)
            android.content.Context r3 = r2.getContext()
            r0 = 1711669487(0x660600ef, float:1.5820358E23)
            int r3 = r3.getColor(r0)
            r2.setTextColor(r3)
            r3 = 1711800433(0x66080071, float:1.605625E23)
            r2.setBackgroundResource(r3)
            return
    }

    /* JADX INFO: renamed from: 岵堘矆釠羔瞾, reason: contains not printable characters */
    public static final void m3068(android.widget.TextView r33, android.widget.TextView r34, android.widget.TextView r35, android.widget.TextView r36) {
            r1 = r35
            r2 = r36
            r3 = 0
            java.lang.String r0 = defpackage.AbstractC0831.m1764(r3)
            boolean r0 = defpackage.AbstractC1347.m2524(r0)
            r4 = 1
            r0 = r0 ^ r4
            r5 = r33
            m3067(r5, r0)
            java.lang.String r0 = defpackage.AbstractC0831.m1764(r4)
            boolean r0 = defpackage.AbstractC1347.m2524(r0)
            r0 = r0 ^ r4
            r5 = r34
            m3067(r5, r0)
            r5 = -340092974964270(0xfffecaafef0961d2, double:NaN)
            r7 = 1711866140(0x6609011c, float:1.6174617E23)
            java.lang.Object r0 = r1.getTag(r7)
            if (r0 != 0) goto L3a
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            r1.setTag(r7, r0)
        L3a:
            r8 = 1711866141(0x6609011d, float:1.6174619E23)
            java.lang.Object r0 = r1.getTag(r8)
            if (r0 != 0) goto L5a
            int r0 = r1.getPaddingLeft()
            int r9 = r1.getPaddingTop()
            int r10 = r1.getPaddingRight()
            int r11 = r1.getPaddingBottom()
            int[] r0 = new int[]{r0, r9, r10, r11}
            r1.setTag(r8, r0)
        L5a:
            android.content.res.Resources r10 = r1.getResources()
            r15 = -340131629669934(0xfffecaa6ef0961d2, double:NaN)
            java.lang.String r0 = defpackage.AbstractC0831.m1764(r3)
            boolean r9 = defpackage.AbstractC1347.m2524(r0)
            r17 = -340754399927854(0xfffeca15ef0961d2, double:NaN)
            r11 = 9
            r19 = 84
            r20 = -340677090516526(0xfffeca27ef0961d2, double:NaN)
            r12 = 2
            r22 = 0
            r13 = 3
            if (r9 == 0) goto L83
            goto La1
        L83:
            byte[] r0 = android.util.Base64.decode(r0, r12)     // Catch: java.lang.Throwable -> L88
            goto L8f
        L88:
            r0 = move-exception
            釠瘁浉釠册瞼 r9 = new 釠瘁浉釠册瞼
            r9.<init>(r0)
            r0 = r9
        L8f:
            boolean r9 = r0 instanceof defpackage.C0723
            if (r9 == 0) goto L95
            r0 = r22
        L95:
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L9a
            goto La1
        L9a:
            int r9 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r9)
            if (r0 != 0) goto Lac
        La1:
            r33 = r5
            r5 = r11
            r6 = r12
            r8 = r13
            r25 = r15
            r9 = r22
            goto L213
        Lac:
            int r9 = r0.getWidth()
            if (r9 < r13) goto Lb8
            int r9 = r0.getHeight()
            if (r9 >= r13) goto Lc1
        Lb8:
            r33 = r5
            r5 = r11
            r6 = r12
            r8 = r13
            r25 = r15
            goto L20e
        Lc1:
            kotlin.Pair r9 = defpackage.AbstractC0831.m1766(r0, r4)
            if (r9 != 0) goto Ld5
            釠翅矅釠瘁洸 r9 = new 釠翅矅釠瘁洸
            r9.<init>(r0)
        Lcc:
            r33 = r5
            r5 = r11
            r6 = r12
            r8 = r13
            r25 = r15
            goto L213
        Ld5:
            kotlin.Pair r14 = defpackage.AbstractC0831.m1766(r0, r3)
            if (r14 != 0) goto Le1
            釠翅矅釠瘁洸 r9 = new 釠翅矅釠瘁洸
            r9.<init>(r0)
            goto Lcc
        Le1:
            int r23 = r0.getWidth()
            r33 = r5
            int r5 = r23 + (-2)
            int r6 = r0.getHeight()
            int r6 = r6 - r12
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r0, r4, r4, r5, r6)
            int r6 = r5.getWidth()
            int r23 = r5.getHeight()
            int r24 = r0.getWidth()
            int r13 = r24 + (-1)
            r25 = r15
            釠贬浉釠册瞾 r15 = new 釠贬浉釠册瞾
            r15.<init>(r0, r3)
            kotlin.Pair r13 = defpackage.AbstractC0831.m1765(r13, r15)
            int r15 = r0.getHeight()
            int r15 = r15 - r4
            釠贬浉釠册瞾 r8 = new 釠贬浉釠册瞾
            r8.<init>(r0, r4)
            kotlin.Pair r0 = defpackage.AbstractC0831.m1765(r15, r8)
            if (r13 == 0) goto L129
            java.lang.Object r8 = r13.getFirst()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L12a
        L129:
            r8 = r3
        L12a:
            if (r13 == 0) goto L139
            java.lang.Object r13 = r13.getSecond()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r6 = r6 - r13
            if (r6 >= 0) goto L13a
        L139:
            r6 = r3
        L13a:
            if (r0 == 0) goto L147
            java.lang.Object r13 = r0.getFirst()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            goto L148
        L147:
            r13 = r3
        L148:
            if (r0 == 0) goto L15d
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r23 = r23 - r0
            if (r23 >= 0) goto L15a
            r23 = r3
        L15a:
            r0 = r23
            goto L15e
        L15d:
            r0 = r3
        L15e:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r8, r13, r6, r0)
            java.lang.Object r0 = r9.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r6 = r9.getSecond()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            int[] r0 = new int[]{r0, r6}
            java.lang.Object r6 = r14.getFirst()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r8 = r14.getSecond()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int[] r6 = new int[]{r6, r8}
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r19)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r8 = r8.order(r9)
            r8.put(r4)
            r8.put(r12)
            r8.put(r12)
            r8.put(r11)
            r8.putInt(r3)
            r8.putInt(r3)
            int r9 = r15.left
            r8.putInt(r9)
            int r9 = r15.right
            r8.putInt(r9)
            int r9 = r15.top
            r8.putInt(r9)
            int r9 = r15.bottom
            r8.putInt(r9)
            r8.putInt(r3)
            r9 = r3
        L1c9:
            if (r9 >= r12) goto L1d3
            r13 = r0[r9]
            r8.putInt(r13)
            int r9 = r9 + 1
            goto L1c9
        L1d3:
            r0 = r3
        L1d4:
            if (r0 >= r12) goto L1de
            r9 = r6[r0]
            r8.putInt(r9)
            int r0 = r0 + 1
            goto L1d4
        L1de:
            r0 = r3
        L1df:
            if (r0 >= r11) goto L1e7
            r8.putInt(r4)
            int r0 = r0 + 1
            goto L1df
        L1e7:
            byte[] r0 = r8.array()
            boolean r6 = android.graphics.NinePatch.isNinePatchChunk(r0)
            if (r6 == 0) goto L202
            android.graphics.drawable.NinePatchDrawable r9 = new android.graphics.drawable.NinePatchDrawable
            r14 = 0
            r6 = r11
            r11 = r5
            r5 = r6
            r6 = r12
            r13 = r15
            r8 = 3
            r12 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            goto L213
        L202:
            r6 = r11
            r11 = r5
            r5 = r6
            r6 = r12
            r8 = 3
            釠翅矅釠瘁洸 r0 = new 釠翅矅釠瘁洸
            r0.<init>(r11)
            r9 = r0
            goto L213
        L20e:
            釠翅矅釠瘁洸 r9 = new 釠翅矅釠瘁洸
            r9.<init>(r0)
        L213:
            r10 = 4
            if (r9 != 0) goto L245
            java.lang.Object r0 = r1.getTag(r7)
            boolean r9 = r0 instanceof android.graphics.drawable.Drawable
            if (r9 == 0) goto L221
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L223
        L221:
            r0 = r22
        L223:
            r1.setBackground(r0)
            r9 = 1711866141(0x6609011d, float:1.6174619E23)
            java.lang.Object r0 = r1.getTag(r9)
            boolean r9 = r0 instanceof int[]
            if (r9 == 0) goto L234
            int[] r0 = (int[]) r0
            goto L236
        L234:
            r0 = r22
        L236:
            if (r0 != 0) goto L239
            goto L29b
        L239:
            r9 = r0[r3]
            r11 = r0[r4]
            r12 = r0[r6]
            r0 = r0[r8]
            r1.setPadding(r9, r11, r12, r0)
            goto L29b
        L245:
            r11 = 1711866141(0x6609011d, float:1.6174619E23)
            java.lang.Object r0 = r1.getTag(r11)
            boolean r11 = r0 instanceof int[]
            if (r11 == 0) goto L253
            int[] r0 = (int[]) r0
            goto L255
        L253:
            r0 = r22
        L255:
            if (r0 != 0) goto L271
            int[] r0 = new int[r10]
            int r11 = r1.getPaddingLeft()
            r0[r3] = r11
            int r11 = r1.getPaddingTop()
            r0[r4] = r11
            int r11 = r1.getPaddingRight()
            r0[r6] = r11
            int r11 = r1.getPaddingBottom()
            r0[r8] = r11
        L271:
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r9.getPadding(r11)
            r1.setBackground(r9)
            int r9 = r11.left
            if (r9 <= 0) goto L281
            goto L283
        L281:
            r9 = r0[r3]
        L283:
            int r12 = r11.top
            if (r12 <= 0) goto L288
            goto L28a
        L288:
            r12 = r0[r4]
        L28a:
            int r13 = r11.right
            if (r13 <= 0) goto L28f
            goto L291
        L28f:
            r13 = r0[r6]
        L291:
            int r11 = r11.bottom
            if (r11 <= 0) goto L296
            goto L298
        L296:
            r11 = r0[r8]
        L298:
            r1.setPadding(r9, r12, r13, r11)
        L29b:
            java.lang.Object r0 = r2.getTag(r7)
            if (r0 != 0) goto L2ab
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            r2.setTag(r7, r0)
        L2ab:
            r9 = 1711866141(0x6609011d, float:1.6174619E23)
            java.lang.Object r0 = r2.getTag(r9)
            if (r0 != 0) goto L2cb
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingTop()
            int r11 = r2.getPaddingRight()
            int r12 = r2.getPaddingBottom()
            int[] r0 = new int[]{r0, r1, r11, r12}
            r2.setTag(r9, r0)
        L2cb:
            android.content.res.Resources r28 = r2.getResources()
            java.lang.String r0 = defpackage.AbstractC0831.m1764(r4)
            boolean r1 = defpackage.AbstractC1347.m2524(r0)
            if (r1 == 0) goto L2dd
            goto L2fb
        L2dd:
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch: java.lang.Throwable -> L2e2
            goto L2e9
        L2e2:
            r0 = move-exception
            釠瘁浉釠册瞼 r1 = new 釠瘁浉釠册瞼
            r1.<init>(r0)
            r0 = r1
        L2e9:
            boolean r1 = r0 instanceof defpackage.C0723
            if (r1 == 0) goto L2ef
            r0 = r22
        L2ef:
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L2f4
            goto L2fb
        L2f4:
            int r1 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r1)
            if (r0 != 0) goto L2ff
        L2fb:
            r1 = r22
            goto L447
        L2ff:
            int r1 = r0.getWidth()
            if (r1 < r8) goto L442
            int r1 = r0.getHeight()
            if (r1 >= r8) goto L30d
            goto L442
        L30d:
            kotlin.Pair r1 = defpackage.AbstractC0831.m1766(r0, r4)
            if (r1 != 0) goto L31a
            釠翅矅釠瘁洸 r1 = new 釠翅矅釠瘁洸
            r1.<init>(r0)
            goto L447
        L31a:
            kotlin.Pair r9 = defpackage.AbstractC0831.m1766(r0, r3)
            if (r9 != 0) goto L327
            釠翅矅釠瘁洸 r1 = new 釠翅矅釠瘁洸
            r1.<init>(r0)
            goto L447
        L327:
            int r11 = r0.getWidth()
            int r11 = r11 - r6
            int r12 = r0.getHeight()
            int r12 = r12 - r6
            android.graphics.Bitmap r29 = android.graphics.Bitmap.createBitmap(r0, r4, r4, r11, r12)
            int r11 = r29.getWidth()
            int r12 = r29.getHeight()
            int r13 = r0.getWidth()
            int r13 = r13 - r4
            釠贬浉釠册瞾 r14 = new 釠贬浉釠册瞾
            r14.<init>(r0, r3)
            kotlin.Pair r13 = defpackage.AbstractC0831.m1765(r13, r14)
            int r14 = r0.getHeight()
            int r14 = r14 - r4
            釠贬浉釠册瞾 r15 = new 釠贬浉釠册瞾
            r15.<init>(r0, r4)
            kotlin.Pair r0 = defpackage.AbstractC0831.m1765(r14, r15)
            if (r13 == 0) goto L369
            java.lang.Object r14 = r13.getFirst()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            goto L36a
        L369:
            r14 = r3
        L36a:
            if (r13 == 0) goto L379
            java.lang.Object r13 = r13.getSecond()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r11 = r11 - r13
            if (r11 >= 0) goto L37a
        L379:
            r11 = r3
        L37a:
            if (r0 == 0) goto L387
            java.lang.Object r13 = r0.getFirst()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            goto L388
        L387:
            r13 = r3
        L388:
            if (r0 == 0) goto L397
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r12 = r12 - r0
            if (r12 >= 0) goto L398
        L397:
            r12 = r3
        L398:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r14, r13, r11, r12)
            java.lang.Object r11 = r1.getFirst()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int[] r1 = new int[]{r11, r1}
            java.lang.Object r11 = r9.getFirst()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            java.lang.Object r9 = r9.getSecond()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int[] r9 = new int[]{r11, r9}
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r19)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r11 = r11.order(r12)
            r11.put(r4)
            r11.put(r6)
            r11.put(r6)
            r11.put(r5)
            r11.putInt(r3)
            r11.putInt(r3)
            int r12 = r0.left
            r11.putInt(r12)
            int r12 = r0.right
            r11.putInt(r12)
            int r12 = r0.top
            r11.putInt(r12)
            int r12 = r0.bottom
            r11.putInt(r12)
            r11.putInt(r3)
            r12 = r3
        L403:
            if (r12 >= r6) goto L40d
            r13 = r1[r12]
            r11.putInt(r13)
            int r12 = r12 + 1
            goto L403
        L40d:
            r1 = r3
        L40e:
            if (r1 >= r6) goto L418
            r12 = r9[r1]
            r11.putInt(r12)
            int r1 = r1 + 1
            goto L40e
        L418:
            r1 = r3
        L419:
            if (r1 >= r5) goto L421
            r11.putInt(r4)
            int r1 = r1 + 1
            goto L419
        L421:
            byte[] r30 = r11.array()
            boolean r1 = android.graphics.NinePatch.isNinePatchChunk(r30)
            if (r1 == 0) goto L43a
            android.graphics.drawable.NinePatchDrawable r27 = new android.graphics.drawable.NinePatchDrawable
            r32 = 0
            r31 = r0
            r27.<init>(r28, r29, r30, r31, r32)
            r1 = r27
            goto L447
        L43a:
            r0 = r29
            釠翅矅釠瘁洸 r1 = new 釠翅矅釠瘁洸
            r1.<init>(r0)
            goto L447
        L442:
            釠翅矅釠瘁洸 r1 = new 釠翅矅釠瘁洸
            r1.<init>(r0)
        L447:
            if (r1 != 0) goto L477
            java.lang.Object r0 = r2.getTag(r7)
            boolean r1 = r0 instanceof android.graphics.drawable.Drawable
            if (r1 == 0) goto L454
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L456
        L454:
            r0 = r22
        L456:
            r2.setBackground(r0)
            r9 = 1711866141(0x6609011d, float:1.6174619E23)
            java.lang.Object r0 = r2.getTag(r9)
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L468
            r22 = r0
            int[] r22 = (int[]) r22
        L468:
            if (r22 != 0) goto L46b
            goto L4ce
        L46b:
            r0 = r22[r3]
            r1 = r22[r4]
            r3 = r22[r6]
            r4 = r22[r8]
            r2.setPadding(r0, r1, r3, r4)
            goto L4ce
        L477:
            r9 = 1711866141(0x6609011d, float:1.6174619E23)
            java.lang.Object r0 = r2.getTag(r9)
            boolean r5 = r0 instanceof int[]
            if (r5 == 0) goto L486
            r22 = r0
            int[] r22 = (int[]) r22
        L486:
            if (r22 != 0) goto L4a4
            int[] r0 = new int[r10]
            int r5 = r2.getPaddingLeft()
            r0[r3] = r5
            int r5 = r2.getPaddingTop()
            r0[r4] = r5
            int r5 = r2.getPaddingRight()
            r0[r6] = r5
            int r5 = r2.getPaddingBottom()
            r0[r8] = r5
            r22 = r0
        L4a4:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.getPadding(r0)
            r2.setBackground(r1)
            int r1 = r0.left
            if (r1 <= 0) goto L4b4
            goto L4b6
        L4b4:
            r1 = r22[r3]
        L4b6:
            int r3 = r0.top
            if (r3 <= 0) goto L4bb
            goto L4bd
        L4bb:
            r3 = r22[r4]
        L4bd:
            int r4 = r0.right
            if (r4 <= 0) goto L4c2
            goto L4c4
        L4c2:
            r4 = r22[r6]
        L4c4:
            int r0 = r0.bottom
            if (r0 <= 0) goto L4c9
            goto L4cb
        L4c9:
            r0 = r22[r8]
        L4cb:
            r2.setPadding(r1, r3, r4, r0)
        L4ce:
            return
    }

    @Override // defpackage.AbstractC1304
    /* JADX INFO: renamed from: 岵囜浉岵佱洷 */
    public final void mo1529(com.kongzue.dialogx.interfaces.AbstractC0008 r8, android.view.View r9) {
            r7 = this;
            int r7 = r7.f7466
            switch(r7) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            釠贬瞾岵€岵?r8 = (defpackage.C0185) r8
            r7 = -437030386834990(0xfffe7285ef0961d2, double:NaN)
            r7 = -437060451606062(0xfffe727eef0961d2, double:NaN)
            return
        L18:
            釠夺浀釠翅浉 r8 = (defpackage.C1069) r8
            r7 = -105978602626606(0xffff9f9cef0961d2, double:NaN)
            r7 = -106008667397678(0xffff9f95ef0961d2, double:NaN)
            r7 = 1711866630(0x66090306, float:1.61755E23)
            android.view.View r7 = r9.findViewById(r7)
            r3 = r7
            android.widget.TextView r3 = (android.widget.TextView) r3
            r7 = 1711866631(0x66090307, float:1.6175501E23)
            android.view.View r7 = r9.findViewById(r7)
            r4 = r7
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7 = 1711866871(0x660903f7, float:1.6175934E23)
            android.view.View r7 = r9.findViewById(r7)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7 = 1711866872(0x660903f8, float:1.6175935E23)
            android.view.View r7 = r9.findViewById(r7)
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
            r7 = 1711866033(0x660900b1, float:1.6174424E23)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r8 = 1711866006(0x66090096, float:1.6174375E23)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            r0 = 1711866034(0x660900b2, float:1.6174426E23)
            android.view.View r0 = r9.findViewById(r0)
            r6 = r0
            android.widget.Button r6 = (android.widget.Button) r6
            r0 = 1711866007(0x66090097, float:1.6174377E23)
            android.view.View r9 = r9.findViewById(r0)
            android.widget.Button r9 = (android.widget.Button) r9
            釠瘁矅釠羔浂 r0 = new 釠瘁矅釠羔浂
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.C1654.f7360 = r0
            m3068(r1, r2, r3, r4)
            釠瘁矅岵€釠?r0 = new 釠瘁矅岵€釠?
            r0.<init>(r5)
            r7.setOnClickListener(r0)
            釠丰洷釠滇矆 r0 = new 釠丰洷釠滇矆
            r0.<init>(r1, r2, r3, r4, r5)
            r8.setOnClickListener(r0)
            釠瘁矅岵€釠?r7 = new 釠瘁矅岵€釠?
            r8 = 1
            r7.<init>(r8)
            r6.setOnClickListener(r7)
            釠丰洷釠滇矆 r0 = new 釠丰洷釠滇矆
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r9.setOnClickListener(r0)
            return
    }
}
