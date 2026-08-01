package p000;

/* JADX INFO: renamed from: o7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0613o7 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7967;

    public /* synthetic */ C0613o7(int r1) {
            r0 = this;
            r0.f7967 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r5 = this;
            int r5 = r5.f7967
            java.lang.String r0 = "auto_scroll_touch_restart_enabled"
            java.lang.String r1 = "chapter_ad_skip_enabled"
            r2 = 1
            r3 = 0
            r4 = 0
            switch(r5) {
                case 0: goto L301;
                case 1: goto L2f5;
                case 2: goto L2e9;
                case 3: goto L2df;
                case 4: goto L2b8;
                case 5: goto L29d;
                case 6: goto L29a;
                case 7: goto L27b;
                case 8: goto L273;
                case 9: goto L243;
                case 10: goto L213;
                case 11: goto L1b9;
                case 12: goto L196;
                case 13: goto L146;
                case 14: goto L123;
                case 15: goto Ld3;
                case 16: goto Lc0;
                case 17: goto Lad;
                case 18: goto La3;
                case 19: goto La0;
                case 20: goto L95;
                case 21: goto L86;
                case 22: goto L5e;
                case 23: goto L53;
                case 24: goto L48;
                case 25: goto L2b;
                case 26: goto L23;
                case 27: goto L19;
                case 28: goto Lf;
                default: goto Lc;
            }
        Lc:
            m02 r5 = p000.pm0.f8593
            return r4
        Lf:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            return r5
        L19:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            return r5
        L23:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "CompositionLocal LocalHostDefaultProvider not present"
            r5.<init>(r0)
            throw r5
        L2b:
            java.util.concurrent.atomic.AtomicReference r5 = p000.qd0.f8971
            java.lang.Object r5 = r5.get()
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5
            if (r5 != 0) goto L36
            goto L45
        L36:
            be0 r0 = p000.be0.f1670
            zd0 r0 = r0.m935()
            if (r0 == 0) goto L45
            boolean r0 = r0.f13044
            if (r0 != r2) goto L45
            p000.qd0.m4865(r5)
        L45:
            s62 r5 = p000.s62.f9751
            return r5
        L48:
            java.lang.String r5 = "feed_right_auto_scroll_button_enabled"
            boolean r5 = p000.ui1.m5887(r5, r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L53:
            java.lang.String r5 = "feed_right_dislike_button_enabled"
            boolean r5 = p000.ui1.m5887(r5, r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5e:
            com.example.dyhelper.hook.C0157.f2408 = r4
            r0 = 0
            com.example.dyhelper.hook.C0157.f2409 = r0
            com.example.dyhelper.hook.C0157.f2410 = r4
            com.example.dyhelper.hook.γ r5 = com.example.dyhelper.hook.C0157.f2411
            boolean r5 = com.example.dyhelper.hook.C0157.m1476()
            if (r5 != 0) goto L72
            com.example.dyhelper.hook.C0157.m1486()
            goto L83
        L72:
            pq r5 = p000.C0696pq.f8651
            mq r5 = p000.C0696pq.m4566()
            if (r5 == 0) goto L83
            long r0 = r5.f7247
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            com.example.dyhelper.hook.C0157.m1470(r5)
        L83:
            s62 r5 = p000.s62.f9751
            return r5
        L86:
            android.os.Handler r5 = com.example.dyhelper.hook.C0157.f2416
            s0 r0 = new s0
            r1 = 26
            r0.<init>(r1)
            r5.post(r0)
            s62 r5 = p000.s62.f9751
            return r5
        L95:
            java.lang.String r5 = "Unexpected call to default provider"
            p000.AbstractC0804sn.m5527(r5)
            pm r5 = new pm
            r5.<init>()
            throw r5
        La0:
            m02 r5 = p000.AbstractC1027yn.f12689
            return r4
        La3:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            return r5
        Lad:
            boolean r5 = p000.AbstractC0976x9.m6523()
            if (r5 == 0) goto Lba
            boolean r5 = p000.ui1.m5887(r1, r3)
            if (r5 == 0) goto Lba
            goto Lbb
        Lba:
            r2 = r3
        Lbb:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        Lc0:
            boolean r5 = p000.AbstractC0976x9.m6523()
            if (r5 == 0) goto Lcd
            boolean r5 = p000.ui1.m5887(r1, r3)
            if (r5 == 0) goto Lcd
            goto Lce
        Lcd:
            r2 = r3
        Lce:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        Ld3:
            java.util.concurrent.ConcurrentHashMap r5 = p000.C0792sb.f9809
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Ldd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L120
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            n7 r1 = new n7
            r2 = 14
            r1.<init>(r2)
            p000.AbstractC0984xh.m6652(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        Lff:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ldd
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L114
            goto Lff
        L114:
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto Lff
            sb r2 = p000.C0792sb.f9786
            p000.C0792sb.m5400(r1)
            goto Lff
        L120:
            s62 r5 = p000.s62.f9751
            return r5
        L123:
            sb r5 = p000.C0792sb.f9786
            java.lang.ref.WeakReference r5 = p000.C0792sb.f9808
            if (r5 == 0) goto L13b
            java.lang.Object r5 = r5.get()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L13b
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L13b
            android.view.View r4 = r5.getDecorView()
        L13b:
            if (r4 == 0) goto L140
            p000.C0792sb.m5426(r4)
        L140:
            p000.C0792sb.m5404()
            s62 r5 = p000.s62.f9751
            return r5
        L146:
            java.util.concurrent.ConcurrentHashMap r5 = p000.C0792sb.f9809
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L150:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L193
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            n7 r1 = new n7
            r2 = 15
            r1.<init>(r2)
            p000.AbstractC0984xh.m6652(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L172:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L150
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L187
            goto L172
        L187:
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L172
            sb r2 = p000.C0792sb.f9786
            p000.C0792sb.m5396(r1)
            goto L172
        L193:
            s62 r5 = p000.s62.f9751
            return r5
        L196:
            sb r5 = p000.C0792sb.f9786
            java.lang.ref.WeakReference r5 = p000.C0792sb.f9808
            if (r5 == 0) goto L1ae
            java.lang.Object r5 = r5.get()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L1ae
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L1ae
            android.view.View r4 = r5.getDecorView()
        L1ae:
            if (r4 == 0) goto L1b3
            p000.C0792sb.m5426(r4)
        L1b3:
            p000.C0792sb.m5404()
            s62 r5 = p000.s62.f9751
            return r5
        L1b9:
            java.util.concurrent.ConcurrentHashMap r5 = p000.C0792sb.f9809
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L1c3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L210
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            n7 r2 = new n7
            r3 = 13
            r2.<init>(r3)
            p000.AbstractC0984xh.m6652(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L1ef:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c3
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L204
            goto L1ef
        L204:
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L1ef
            sb r3 = p000.C0792sb.f9786
            p000.C0792sb.m5407(r2, r1)
            goto L1ef
        L210:
            s62 r5 = p000.s62.f9751
            return r5
        L213:
            java.lang.ref.WeakReference r5 = p000.C0792sb.f9808
            if (r5 == 0) goto L21e
            java.lang.Object r5 = r5.get()
            android.app.Activity r5 = (android.app.Activity) r5
            goto L21f
        L21e:
            r5 = r4
        L21f:
            sb r0 = p000.C0792sb.f9786
            r0.m5430(r5)
            boolean r1 = p000.C0792sb.f9798
            if (r1 != 0) goto L229
            goto L240
        L229:
            r0.m5431()
            if (r5 == 0) goto L238
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L238
            android.view.View r4 = r5.getDecorView()
        L238:
            if (r4 == 0) goto L23d
            p000.C0792sb.m5426(r4)
        L23d:
            p000.C0792sb.m5404()
        L240:
            s62 r5 = p000.s62.f9751
            return r5
        L243:
            java.lang.ref.WeakReference r5 = p000.C0792sb.f9808
            if (r5 == 0) goto L24e
            java.lang.Object r5 = r5.get()
            android.app.Activity r5 = (android.app.Activity) r5
            goto L24f
        L24e:
            r5 = r4
        L24f:
            sb r0 = p000.C0792sb.f9786
            r0.m5430(r5)
            boolean r1 = p000.C0792sb.f9798
            if (r1 != 0) goto L259
            goto L270
        L259:
            r0.m5431()
            if (r5 == 0) goto L268
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L268
            android.view.View r4 = r5.getDecorView()
        L268:
            if (r4 == 0) goto L26d
            p000.C0792sb.m5426(r4)
        L26d:
            p000.C0792sb.m5404()
        L270:
            s62 r5 = p000.s62.f9751
            return r5
        L273:
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.C0753r9.f9293
            r5.set(r3)
            s62 r5 = p000.s62.f9751
            return r5
        L27b:
            java.util.concurrent.atomic.AtomicBoolean r5 = com.example.dyhelper.beta.BetaNativeBridge.f2224
            java.lang.String r5 = "dy_protect"
            java.lang.System.loadLibrary(r5)     // Catch: java.lang.Throwable -> L283
            goto L295
        L283:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r0 = "dy_protect load failed: "
            java.lang.String r5 = p000.lz1.m3687(r0, r5)
            r0 = 4
            java.lang.String r1 = "r2c07920444d2b8e4"
            p000.C0888ux.m5988(r1, r5, r4, r0, r4)
            r2 = r3
        L295:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L29a:
            m02 r5 = p000.AbstractC0938w8.f11601
            return r4
        L29d:
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.AbstractC0825t7.f10214
            boolean r5 = p000.ui1.m5887(r0, r2)
            if (r5 != 0) goto L2a6
            goto L2b5
        L2a6:
            p000.AbstractC0825t7.f10220 = r2
            p7 r5 = p000.AbstractC0825t7.f10218
            if (r5 == 0) goto L2b5
            boolean r0 = r5.f8446
            if (r0 != 0) goto L2b5
            r5.f8445 = r2
            p000.AbstractC0825t7.m5609(r5)
        L2b5:
            s62 r5 = p000.s62.f9751
            return r5
        L2b8:
            boolean r5 = p000.AbstractC0825t7.f10220
            p000.AbstractC0825t7.f10220 = r3
            if (r5 != 0) goto L2bf
            goto L2dc
        L2bf:
            p7 r5 = p000.AbstractC0825t7.f10218
            if (r5 != 0) goto L2c4
            goto L2dc
        L2c4:
            boolean r1 = r5.f8446
            if (r1 == 0) goto L2c9
            goto L2dc
        L2c9:
            boolean r1 = r5.f8445
            boolean r0 = p000.ui1.m5887(r0, r2)
            if (r1 == 0) goto L2d3
            if (r0 == 0) goto L2dc
        L2d3:
            boolean r0 = r5.f8445
            if (r0 == 0) goto L2d9
            r5.f8445 = r3
        L2d9:
            p000.AbstractC0825t7.m5613(r5)
        L2dc:
            s62 r5 = p000.s62.f9751
            return r5
        L2df:
            p000.AbstractC0825t7.f10219 = r3
            p7 r5 = p000.AbstractC0825t7.f10218
            p000.AbstractC0825t7.m5609(r5)
            s62 r5 = p000.s62.f9751
            return r5
        L2e9:
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.AbstractC0825t7.f10214
            mq r5 = p000.C0696pq.m4566()
            p000.AbstractC0825t7.m5610(r5)
            s62 r5 = p000.s62.f9751
            return r5
        L2f5:
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.AbstractC0825t7.f10214
            mq r5 = p000.C0696pq.m4566()
            p000.AbstractC0825t7.m5610(r5)
            s62 r5 = p000.s62.f9751
            return r5
        L301:
            p000.AbstractC0825t7.f10219 = r2
            p7 r5 = p000.AbstractC0825t7.f10218
            if (r5 == 0) goto L309
            m7 r4 = r5.f8442
        L309:
            if (r4 == 0) goto L30f
            p000.AbstractC0825t7.m5613(r5)
            goto L316
        L30f:
            mq r5 = p000.C0696pq.m4566()
            p000.AbstractC0825t7.m5610(r5)
        L316:
            s62 r5 = p000.s62.f9751
            return r5
    }
}
