package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0221 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f1347;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f1348;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1349;

    public /* synthetic */ RunnableC0221(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f1349 = r2
            r0.f1347 = r1
            r0.f1348 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0221(java.lang.Object r1, java.lang.Object r2, int r3, boolean r4) {
            r0 = this;
            r0.f1349 = r3
            r0.f1348 = r1
            r0.f1347 = r2
            r0.<init>()
            return
    }

    public RunnableC0221(defpackage.C0375 r1, defpackage.C1017 r2, int r3) {
            r0 = this;
            r3 = 5
            r0.f1349 = r3
            r0.<init>()
            r0.f1347 = r1
            r0.f1348 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r20 = this;
            r1 = r20
            int r0 = r1.f1349
            r2 = 1
            java.lang.Object r4 = r1.f1347
            switch(r0) {
                case 0: goto L23f;
                case 1: goto Le7;
                case 2: goto Ld9;
                case 3: goto La7;
                case 4: goto L9d;
                case 5: goto L52;
                case 6: goto L26;
                case 7: goto L1e;
                case 8: goto L14;
                default: goto La;
            }
        La:
            java.lang.Object r0 = r1.f1348
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r4 = (android.view.View) r4
            defpackage.AbstractC2193.m3591(r0, r4)
            return
        L14:
            ᲈᛶᛳᛷ r4 = (defpackage.C2260) r4
            java.lang.Object r0 = r1.f1348
            ᲈᛴᛲᛵ r0 = (defpackage.C2219) r0
            r4.m3653(r0)
            return
        L1e:
            java.lang.Object r0 = r1.f1348
            ᛸᛷᛴᛱ r0 = (defpackage.C1526) r0
            r0.accept(r4)
            return
        L26:
            r5 = r4
            ᲁᛵᛷᛳ r5 = (defpackage.C1860) r5
            ᲁᛲᛱᛵ r6 = r5.f8110
            r3 = 0
        L2c:
            java.lang.Object r0 = r1.f1348     // Catch: java.lang.Throwable -> L34
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L34
            r0.run()     // Catch: java.lang.Throwable -> L34
            goto L3a
        L34:
            r0 = move-exception
            ᛲᛶᛳᛱ r4 = defpackage.C0303.f1620
            defpackage.AbstractC2279.m3703(r4, r0)
        L3a:
            java.lang.Runnable r0 = r5.m3273()
            if (r0 != 0) goto L41
            goto L51
        L41:
            r1.f1348 = r0
            int r3 = r3 + r2
            r0 = 16
            if (r3 < r0) goto L2c
            boolean r0 = r6.mo2540(r5)
            if (r0 == 0) goto L2c
            r6.mo572(r5, r1)
        L51:
            return
        L52:
            java.lang.Object r0 = r1.f1348
            ᛶᛱᲁᛳ r0 = (defpackage.C1017) r0
            ᛲᲇᛷᲁ r4 = (defpackage.C0375) r4
            ᛱᛳᛶᛱ r2 = r4.f1945
            if (r2 == 0) goto L9c
            boolean r2 = r2.f622
            if (r2 == 0) goto L9c
            boolean r2 = r0.f4529
            if (r2 != 0) goto L9c
            ᲈᛸᲈᛷ r0 = r0.f4533
            int r0 = r0.m3789()
            r2 = -1
            if (r0 == r2) goto L9c
            ᛱᛳᛶᛱ r0 = r4.f1945
            ᛱᛳᛸᛶ r0 = r0.getItemAnimator()
            if (r0 == 0) goto L7b
            boolean r0 = r0.mo475()
            if (r0 != 0) goto L8e
        L7b:
            java.util.ArrayList r0 = r4.f1949
            int r2 = r0.size()
            r3 = 0
        L82:
            if (r3 >= r2) goto L97
            java.lang.Object r5 = r0.get(r3)
            ᛶᛱᲁᛳ r5 = (defpackage.C1017) r5
            boolean r5 = r5.f4530
            if (r5 != 0) goto L94
        L8e:
            ᛱᛳᛶᛱ r0 = r4.f1945
            r0.post(r1)
            goto L9c
        L94:
            int r3 = r3 + 1
            goto L82
        L97:
            ᛱᛵᛷᲈ r0 = r4.f1934
            r0.mo590()
        L9c:
            return
        L9d:
            java.lang.Object r0 = r1.f1348
            ᲈᛶᛳᛷ r0 = (defpackage.C2260) r0
            ᛷᲁᛷᛵ r4 = (defpackage.C1371) r4
            r0.m3653(r4)
            return
        La7:
            ᲀᛲᲁᲁ r4 = (defpackage.ThreadFactoryC1635) r4
            boolean r0 = r4.f7320
            if (r0 == 0) goto Lc1
            android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
            r0.<init>()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.detectNetwork()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.penaltyDeath()
            android.os.StrictMode$ThreadPolicy r0 = r0.build()
            android.os.StrictMode.setThreadPolicy(r0)
        Lc1:
            java.lang.Object r0 = r1.f1348     // Catch: java.lang.Throwable -> Lc9
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> Lc9
            r0.run()     // Catch: java.lang.Throwable -> Lc9
            goto Ld8
        Lc9:
            r0 = move-exception
            r1 = 6
            java.lang.String r2 = "GlideExecutor"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto Ld8
            java.lang.String r1 = "Request threw uncaught throwable"
            android.util.Log.e(r2, r1, r0)
        Ld8:
            return
        Ld9:
            java.lang.Object r0 = r1.f1348
            ᛶᲈᛱᲈ r0 = (defpackage.C1180) r0
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            java.lang.Object r0 = r0.f5356
            ᛲᲈᛸᛷ r0 = (defpackage.C0394) r0
            r0.m1137(r4)
            return
        Le7:
            ᛲᛱᲀᲇ r4 = (defpackage.RunnableC0240) r4
            ᲇᛶᲇᲀ r0 = r4.f1434
            int r5 = r0.f8923
            int r6 = r4.f1431
            if (r5 != r6) goto L23e
            java.util.List r4 = r4.f1432
            java.lang.Object r1 = r1.f1348
            ᛸᛶᛸᛳ r1 = (defpackage.C1515) r1
            r0.f8917 = r4
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            r0.f8922 = r4
            ᛸᲈᛸᲈ r4 = r0.f8920
            java.lang.Object r5 = r1.f6689
            int[] r5 = (int[]) r5
            java.lang.Object r6 = r1.f6690
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r7 = r1.f6692
            java.lang.Object r8 = r1.f6695
            ᛸᲈᛸᲈ r8 = (defpackage.C1606) r8
            ᲈᛴᲀᛸ r9 = new ᲈᛴᲀᛸ
            r9.<init>(r4)
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            int r10 = r1.f6693
            int r11 = r6.size()
            int r11 = r11 - r2
            r12 = r11
            r11 = r10
            r10 = r7
        L123:
            if (r12 < 0) goto L236
            java.lang.Object r13 = r6.get(r12)
            ᛸᛵᛵᛵ r13 = (defpackage.C1488) r13
            int r14 = r13.f6576
            int r15 = r13.f6575
            r16 = r2
            int r2 = r14 + r15
            int r13 = r13.f6577
            int r3 = r13 + r15
            r17 = r0
        L139:
            r0 = 2
            if (r10 <= r2) goto L1a4
            int r10 = r10 + (-1)
            r18 = r5[r10]
            r19 = r18 & 12
            if (r19 == 0) goto L178
            int r0 = r18 >> 4
            r20 = r2
            r19 = r5
            r2 = 0
            ᲇᛷᛴᛸ r5 = defpackage.C1515.m2758(r4, r0, r2)
            if (r5 == 0) goto L16a
            int r2 = r5.f8935
            int r2 = r7 - r2
            int r2 = r2 + (-1)
            r9.m3623(r10, r2)
            r5 = r18 & 4
            if (r5 == 0) goto L167
            r8.m2901(r10, r0)
            r5 = r16
            r9.m3625(r2, r5)
            goto L19d
        L167:
            r5 = r16
            goto L19d
        L16a:
            r5 = r16
            ᲇᛷᛴᛸ r0 = new ᲇᛷᛴᛸ
            int r2 = r7 - r10
            int r2 = r2 - r5
            r0.<init>(r10, r2, r5)
            r4.add(r0)
            goto L19d
        L178:
            r20 = r2
            r19 = r5
            int r2 = r9.f9523
            if (r2 != r0) goto L191
            int r2 = r9.f9521
            if (r2 < r10) goto L191
            int r5 = r10 + 1
            if (r2 > r5) goto L191
            int r0 = r9.f9520
            r5 = 1
            int r0 = r0 + r5
            r9.f9520 = r0
            r9.f9521 = r10
            goto L19b
        L191:
            r5 = 1
            r9.m3624()
            r9.f9521 = r10
            r9.f9520 = r5
            r9.f9523 = r0
        L19b:
            int r7 = r7 + (-1)
        L19d:
            r2 = r20
            r5 = r19
            r16 = 1
            goto L139
        L1a4:
            r19 = r5
        L1a6:
            if (r11 <= r3) goto L20a
            int r11 = r11 + (-1)
            java.lang.Object r2 = r1.f6694
            int[] r2 = (int[]) r2
            r2 = r2[r11]
            r5 = r2 & 12
            if (r5 == 0) goto L1de
            int r5 = r2 >> 4
            r20 = r1
            r1 = 1
            ᲇᛷᛴᛸ r0 = defpackage.C1515.m2758(r4, r5, r1)
            if (r0 != 0) goto L1cb
            ᲇᛷᛴᛸ r0 = new ᲇᛷᛴᛸ
            int r2 = r7 - r10
            r5 = 0
            r0.<init>(r11, r2, r5)
            r4.add(r0)
            goto L206
        L1cb:
            int r0 = r0.f8935
            int r0 = r7 - r0
            int r0 = r0 - r1
            r9.m3623(r0, r10)
            r0 = r2 & 4
            if (r0 == 0) goto L206
            r8.m2901(r5, r11)
            r9.m3625(r10, r1)
            goto L206
        L1de:
            r20 = r1
            r1 = 1
            int r0 = r9.f9523
            if (r0 != r1) goto L1fa
            int r0 = r9.f9521
            if (r10 < r0) goto L1fa
            int r1 = r9.f9520
            int r2 = r0 + r1
            if (r10 > r2) goto L1fa
            int r1 = r1 + 1
            r9.f9520 = r1
            int r0 = java.lang.Math.min(r10, r0)
            r9.f9521 = r0
            goto L204
        L1fa:
            r9.m3624()
            r9.f9521 = r10
            r5 = 1
            r9.f9520 = r5
            r9.f9523 = r5
        L204:
            int r7 = r7 + 1
        L206:
            r0 = 2
            r1 = r20
            goto L1a6
        L20a:
            r20 = r1
            r1 = r13
            r0 = r14
            r2 = 0
        L20f:
            if (r2 >= r15) goto L228
            r3 = r19[r0]
            r3 = r3 & 15
            r5 = 2
            if (r3 != r5) goto L220
            r8.m2901(r0, r1)
            r3 = 1
            r9.m3625(r0, r3)
            goto L221
        L220:
            r3 = 1
        L221:
            int r0 = r0 + 1
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L20f
        L228:
            r3 = 1
            int r12 = r12 + (-1)
            r1 = r20
            r2 = r3
            r11 = r13
            r10 = r14
            r0 = r17
            r5 = r19
            goto L123
        L236:
            r17 = r0
            r9.m3624()
            r17.m3504()
        L23e:
            return
        L23f:
            java.lang.Object r0 = r1.f1348
            ᛲᲈᛸᛲ r0 = (defpackage.C0393) r0
            ᲁᲀᛴᛷ r4 = (defpackage.C1909) r4
            ᲀᛷᛱᲇ r1 = r4.f8290
            if (r1 == 0) goto L250
            ᛳᛷᛲᲇ r2 = r1.f7583
            if (r2 == 0) goto L250
            r2.mo1301(r1)
        L250:
            ᲇᲁᛸᲈ r1 = r4.f8295
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L26e
            android.os.IBinder r1 = r1.getWindowToken()
            if (r1 == 0) goto L26e
            boolean r1 = r0.m3339()
            if (r1 == 0) goto L263
            goto L26c
        L263:
            android.view.View r1 = r0.f8274
            if (r1 != 0) goto L268
            goto L26e
        L268:
            r2 = 0
            r0.m3337(r2, r2, r2, r2)
        L26c:
            r4.f8286 = r0
        L26e:
            r0 = 0
            r4.f8297 = r0
            return
    }
}
