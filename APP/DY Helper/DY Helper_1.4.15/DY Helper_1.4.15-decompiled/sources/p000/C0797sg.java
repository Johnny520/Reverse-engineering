package p000;

/* JADX INFO: renamed from: sg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0797sg implements p000.d30 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9893;

    public /* synthetic */ C0797sg(int r1) {
            r0 = this;
            r0.f9893 = r1
            r0.<init>()
            return
    }

    @Override // p000.d30
    /* JADX INFO: renamed from: γ */
    public final boolean mo1647(android.app.Activity r13, android.view.MotionEvent r14) {
            r12 = this;
            int r12 = r12.f9893
            r1 = 0
            r2 = 0
            switch(r12) {
                case 0: goto La3;
                default: goto L7;
            }
        L7:
            java.util.concurrent.CopyOnWriteArrayList r12 = p000.g10.f4192
            int r12 = r14.getActionMasked()
            if (r12 == 0) goto L11
            goto La0
        L11:
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r13)     // Catch: java.lang.Throwable -> L1f
            int r12 = r12.getScaledDoubleTapSlop()     // Catch: java.lang.Throwable -> L1f
            float r12 = (float) r12     // Catch: java.lang.Throwable -> L1f
            java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch: java.lang.Throwable -> L1f
            goto L27
        L1f:
            r0 = move-exception
            r12 = r0
            eo1 r0 = new eo1
            r0.<init>(r12)
            r12 = r0
        L27:
            r0 = 1123024896(0x42f00000, float:120.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            boolean r3 = r12 instanceof p000.eo1
            if (r3 == 0) goto L32
            r12 = r0
        L32:
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            java.lang.Object r3 = p000.g10.f4197
            monitor-enter(r3)
            java.util.WeakHashMap r0 = p000.g10.f4200     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r0.get(r13)     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L51
            h10 r4 = new h10     // Catch: java.lang.Throwable -> L4e
            long r5 = p000.g10.f4191     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4e
            r0.put(r13, r4)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            r12 = r0
            goto La1
        L51:
            h10 r4 = (p000.h10) r4     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.CopyOnWriteArrayList r13 = p000.g10.f4192     // Catch: java.lang.Throwable -> L4e
            j10 r5 = new j10     // Catch: java.lang.Throwable -> L4e
            long r6 = r14.getDownTime()     // Catch: java.lang.Throwable -> L4e
            long r8 = r14.getEventTime()     // Catch: java.lang.Throwable -> L4e
            float r10 = r14.getRawX()     // Catch: java.lang.Throwable -> L4e
            float r11 = r14.getRawY()     // Catch: java.lang.Throwable -> L4e
            r5.<init>(r6, r8, r10, r11)     // Catch: java.lang.Throwable -> L4e
            j10 r13 = r4.f4526     // Catch: java.lang.Throwable -> L4e
            if (r13 != 0) goto L74
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L78
        L74:
            long r6 = r13.f5290     // Catch: java.lang.Throwable -> L4e
            long r6 = r8 - r6
        L78:
            if (r13 == 0) goto L9b
            r8 = 1
            int r14 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r14 > 0) goto L9b
            long r8 = r4.f4525     // Catch: java.lang.Throwable -> L4e
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 > 0) goto L9b
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L8c
            r12 = r14
        L8c:
            float r14 = r13.f5291     // Catch: java.lang.Throwable -> L4e
            float r10 = r10 - r14
            float r13 = r13.f5292     // Catch: java.lang.Throwable -> L4e
            float r11 = r11 - r13
            float r10 = r10 * r10
            float r11 = r11 * r11
            float r11 = r11 + r10
            float r12 = r12 * r12
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 > 0) goto L9b
            r2 = r5
        L9b:
            r4.f4527 = r2     // Catch: java.lang.Throwable -> L4e
            r4.f4526 = r5     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r3)
        La0:
            return r1
        La1:
            monitor-exit(r3)
            throw r12
        La3:
            tg r12 = p000.AbstractC0871ug.f10771
            boolean r12 = p000.C0834tg.m5640()
            r0 = 5
            r3 = 3
            r4 = 1
            if (r12 == 0) goto L177
            boolean r12 = p000.AbstractC0871ug.f10788
            if (r12 == 0) goto L177
            a r12 = p000.AbstractC0871ug.f10782
            java.lang.Object r12 = r12.f1
            java.lang.ref.WeakReference r12 = (java.lang.ref.WeakReference) r12
            if (r12 == 0) goto L177
            java.lang.Object r12 = r12.get()
            if (r12 != 0) goto Lc2
            goto L177
        Lc2:
            if (r12 != r13) goto L177
            int r12 = r14.getActionMasked()
            if (r12 == 0) goto L15f
            r5 = 0
            if (r12 == r4) goto L115
            r2 = 2
            if (r12 == r2) goto Le3
            if (r12 == r3) goto Lde
            if (r12 == r0) goto Lda
            r2 = 6
            if (r12 == r2) goto Lda
            goto L17a
        Lda:
            p000.AbstractC0871ug.f10752 = r4
            goto L17a
        Lde:
            p000.C0834tg.m5670()
            goto L17a
        Le3:
            long r7 = p000.AbstractC0871ug.f10749
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 > 0) goto Leb
            goto L17a
        Leb:
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r13)
            int r12 = r12.getScaledTouchSlop()
            float r2 = r14.getX()
            float r5 = p000.AbstractC0871ug.f10750
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r12 = (float) r12
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 > 0) goto L112
            float r2 = r14.getY()
            float r5 = p000.AbstractC0871ug.f10751
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 <= 0) goto L17a
        L112:
            p000.AbstractC0871ug.f10752 = r4
            goto L17a
        L115:
            long r7 = r14.getEventTime()
            long r9 = p000.AbstractC0871ug.f10749
            long r7 = r7 - r9
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 <= 0) goto L15b
            boolean r12 = p000.AbstractC0871ug.f10752
            if (r12 != 0) goto L15b
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 > 0) goto L15b
            r5 = 401(0x191, double:1.98E-321)
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 >= 0) goto L15b
            pq r12 = p000.C0696pq.f8651
            kq r12 = p000.C0696pq.m4567()
            if (r12 == 0) goto L13e
            mq r12 = r12.f6079
            long r5 = r12.f7247
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
        L13e:
            if (r2 == 0) goto L15b
            long r5 = android.os.SystemClock.uptimeMillis()
            p000.AbstractC0871ug.f10753 = r5
            p000.AbstractC0871ug.f10754 = r2
            java.lang.String r12 = "rf9ef3362bd85f5b5"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "r49a9992dee2eb0ce"
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            p000.C0888ux.m5975(r12, r2)
        L15b:
            p000.C0834tg.m5670()
            goto L17a
        L15f:
            p000.C0834tg.m5656()
            long r5 = r14.getEventTime()
            p000.AbstractC0871ug.f10749 = r5
            float r12 = r14.getX()
            p000.AbstractC0871ug.f10750 = r12
            float r12 = r14.getY()
            p000.AbstractC0871ug.f10751 = r12
            p000.AbstractC0871ug.f10752 = r1
            goto L17a
        L177:
            p000.C0834tg.m5670()
        L17a:
            boolean r12 = p000.C0834tg.m5640()
            if (r12 != 0) goto L181
            goto L1c0
        L181:
            boolean r12 = p000.AbstractC0871ug.f10789
            if (r12 != 0) goto L186
            goto L1c0
        L186:
            boolean r12 = p000.AbstractC0871ug.f10783
            if (r12 != 0) goto L18f
            boolean r12 = p000.AbstractC0871ug.f10788
            if (r12 != 0) goto L18f
            goto L1c0
        L18f:
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r13)
            p000.AbstractC0871ug.f10777 = r12
            int r12 = r14.getActionMasked()
            if (r12 == 0) goto L1b8
            if (r12 == r4) goto L1a1
            if (r12 == r3) goto L1a1
            goto L1c0
        L1a1:
            p000.C0834tg.m5655()
            s0 r12 = new s0
            r12.<init>(r0)
            p000.AbstractC0871ug.f10766 = r12
            android.os.Handler r12 = p000.AbstractC0871ug.f10780
            s0 r13 = p000.AbstractC0871ug.f10766
            r13.getClass()
            r2 = 600(0x258, double:2.964E-321)
            r12.postDelayed(r13, r2)
            goto L1c0
        L1b8:
            p000.C0834tg.m5655()
            p000.AbstractC0871ug.f10791 = r4
            p000.C0834tg.m5650(r4)
        L1c0:
            return r1
    }
}
