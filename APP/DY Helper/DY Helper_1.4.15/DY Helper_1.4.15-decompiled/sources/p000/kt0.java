package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6113;

    public /* synthetic */ kt0(int r1) {
            r0 = this;
            r0.f6113 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ kt0(p000.z81 r1, int r2) {
            r0 = this;
            r0.f6113 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r6 = this;
            int r6 = r6.f6113
            r0 = 4
            r1 = 0
            s62 r2 = p000.s62.f9751
            r3 = 0
            r4 = 1
            switch(r6) {
                case 0: goto L1ef;
                case 1: goto L1ec;
                case 2: goto L19e;
                case 3: goto L184;
                case 4: goto L13b;
                case 5: goto L133;
                case 6: goto L12e;
                case 7: goto L126;
                case 8: goto L119;
                case 9: goto L116;
                case 10: goto L108;
                case 11: goto Lfc;
                case 12: goto Lec;
                case 13: goto Le0;
                case 14: goto Ld4;
                case 15: goto Lc4;
                case 16: goto Lae;
                case 17: goto L9e;
                case 18: goto L88;
                case 19: goto L78;
                case 20: goto L6c;
                case 21: goto L67;
                case 22: goto L62;
                case 23: goto L3a;
                case 24: goto L34;
                case 25: goto L31;
                case 26: goto L2e;
                case 27: goto L21;
                case 28: goto L17;
                default: goto Lb;
            }
        Lb:
            aj r6 = new aj
            r0 = 18
            r6.<init>(r0)
            java.util.concurrent.ExecutorService r6 = java.util.concurrent.Executors.newSingleThreadExecutor(r6)
            return r6
        L17:
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r6.<init>(r0)
            return r6
        L21:
            bv1 r6 = p000.bv1.f1853
            p000.bv1.m1078()
            android.widget.ScrollView r6 = p000.bv1.f1862
            if (r6 == 0) goto L2d
            r6.scrollTo(r3, r3)
        L2d:
            return r2
        L2e:
            yx r6 = p000.vr1.f11372
            return r1
        L31:
            m02 r6 = p000.yp1.f12763
            return r1
        L34:
            kp1 r6 = new kp1
            r6.<init>()
            return r6
        L3a:
            java.lang.Object r6 = com.example.dyhelper.core.protection.ProtectionNativeBridge.f2247
            java.lang.String r6 = "dy_protect"
            java.lang.System.loadLibrary(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L44
            goto L4b
        L44:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L4b:
            java.lang.Throwable r0 = p000.fo1.m2190(r6)
            if (r0 == 0) goto L58
            java.lang.String r1 = "DYHelper-Native"
            java.lang.String r2 = "dy_protect load failed"
            android.util.Log.e(r1, r2, r0)
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r6 instanceof p000.eo1
            if (r1 == 0) goto L5f
            r6 = r0
        L5f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            return r6
        L62:
            s62 r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.m1457()
            return r6
        L67:
            s62 r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.m1455()
            return r6
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.pg1.f8551
            boolean r6 = r6.get()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L78:
            java.util.concurrent.ConcurrentHashMap r6 = p000.ry1.f9620
            java.util.Map r6 = p000.ex0.m1975(r6)
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L88:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.pg1.f8553
            boolean r6 = r6.get()
            if (r6 != 0) goto L99
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.pg1.f8551
            boolean r6 = r6.get()
            if (r6 != 0) goto L99
            r3 = r4
        L99:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L9e:
            java.util.concurrent.ConcurrentHashMap r6 = p000.ry1.f9620
            java.util.Map r6 = p000.ex0.m1975(r6)
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lae:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.pg1.f8553
            boolean r6 = r6.get()
            if (r6 != 0) goto Lbf
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.pg1.f8551
            boolean r6 = r6.get()
            if (r6 != 0) goto Lbf
            r3 = r4
        Lbf:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        Lc4:
            java.util.concurrent.ConcurrentHashMap r6 = p000.ry1.f9620
            java.util.Map r6 = p000.ex0.m1975(r6)
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Ld4:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.se1.f9875
            boolean r6 = r6.get()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Le0:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.se1.f9875
            boolean r6 = r6.get()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lec:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.se1.f9875
            java.util.List r6 = p000.se1.m5491()
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lfc:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.jf1.f5454
            boolean r6 = r6.get()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L108:
            java.util.List r6 = p000.xa1.m6554()
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L116:
            q71 r6 = p000.q71.f8896
            return r2
        L119:
            android.os.Handler r6 = p000.a01.f5
            fb0 r0 = new fb0
            r1 = 10
            r0.<init>(r1)
            r6.post(r0)
            return r2
        L126:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "CompositionLocal LocalSavedStateRegistryOwner not present"
            r6.<init>(r0)
            throw r6
        L12e:
            m02 r6 = p000.xu0.f12310
            x r6 = p000.C0966x.f11932
            return r6
        L133:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "CompositionLocal LocalLifecycleOwner not present"
            r6.<init>(r0)
            throw r6
        L13b:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.il0.f5108
            boolean r6 = r6.compareAndSet(r3, r4)
            if (r6 != 0) goto L144
            goto L183
        L144:
            p000.il0.m2762()     // Catch: java.lang.Throwable -> L177
            boolean r6 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L15b
            if (r6 != 0) goto L14e
            goto L171
        L14e:
            wj0 r6 = new wj0     // Catch: java.lang.Throwable -> L15b
            r0 = 23
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L15b
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.ui1.f10853     // Catch: java.lang.Throwable -> L15b
            r0.add(r6)     // Catch: java.lang.Throwable -> L15b
            goto L171
        L15b:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L177
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L177
            java.lang.String r1 = "ra271a8f65257ac83"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L177
            r0.append(r6)     // Catch: java.lang.Throwable -> L177
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L177
            p000.C0888ux.m5985(r6)     // Catch: java.lang.Throwable -> L177
        L171:
            java.lang.String r6 = "ra6f6ddad27a7dd1a"
            p000.C0888ux.m5985(r6)     // Catch: java.lang.Throwable -> L177
            goto L183
        L177:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()
            java.lang.String r1 = "初始化失败: "
            java.lang.String r3 = "racd07984e4339f30"
            p000.AbstractC0602nx.m4145(r1, r0, r3, r6)
        L183:
            return r2
        L184:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.tg0.f10367
            boolean r6 = r6.compareAndSet(r3, r4)
            if (r6 != 0) goto L18d
            goto L19d
        L18d:
            android.os.Handler r6 = p000.tg0.f10368
            fb0 r3 = p000.tg0.f10369
            r4 = 30000(0x7530, double:1.4822E-319)
            r6.postDelayed(r3, r4)
            java.lang.String r6 = "DYHelper"
            java.lang.String r3 = "IMAutoReadScheduler 初始化完成"
            p000.C0888ux.m5988(r6, r3, r1, r0, r1)
        L19d:
            return r2
        L19e:
            android.os.Handler r6 = p000.C1036yw.f12843
            xl r6 = new xl
            r4 = 11
            r6.<init>(r4, r3)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            java.lang.String r5 = "onResume"
            p000.qe0.m4873(r4, r5, r6)
            xl r6 = new xl
            r5 = 12
            r6.<init>(r5, r3)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r5 = "onPause"
            p000.qe0.m4873(r4, r5, r6)
            xl r6 = new xl
            r5 = 13
            r6.<init>(r5, r3)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r5 = "onDestroy"
            p000.qe0.m4873(r4, r5, r6)
            xl r6 = new xl
            r5 = 14
            r6.<init>(r5, r3)
            java.lang.Class<android.view.MotionEvent> r3 = android.view.MotionEvent.class
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r6}
            java.lang.String r3 = "dispatchTouchEvent"
            p000.qe0.m4873(r4, r3, r6)
            java.lang.String r6 = "DYHelper:DurationAlert"
            java.lang.String r3 = "视频时长提醒 & 空闲退出 Hook 初始化完成"
            p000.C0888ux.m5988(r6, r3, r1, r0, r1)
            return r2
        L1ec:
            xo1 r6 = p000.yo1.f12711
            return r6
        L1ef:
            xo1 r6 = p000.yo1.f12711
            return r6
    }
}
