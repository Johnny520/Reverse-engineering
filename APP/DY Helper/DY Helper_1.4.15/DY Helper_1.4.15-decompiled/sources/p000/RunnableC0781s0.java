package p000;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0781s0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9637;

    public /* synthetic */ RunnableC0781s0(int r1) {
            r0 = this;
            r0.f9637 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r9 = r9.f9637
            r0 = 8
            r2 = 2
            r3 = 4
            r4 = 0
            r5 = 1
            r6 = 0
            switch(r9) {
                case 0: goto L480;
                case 1: goto L448;
                case 2: goto L3d2;
                case 3: goto L385;
                case 4: goto L2da;
                case 5: goto L2d0;
                case 6: goto L2ca;
                case 7: goto L2ba;
                case 8: goto L262;
                case 9: goto L25e;
                case 10: goto L257;
                case 11: goto L251;
                case 12: goto L24d;
                case 13: goto L247;
                case 14: goto L241;
                case 15: goto L22f;
                case 16: goto L20e;
                case 17: goto L205;
                case 18: goto L201;
                case 19: goto L144;
                case 20: goto L140;
                case 21: goto L131;
                case 22: goto L118;
                case 23: goto La4;
                case 24: goto L9e;
                case 25: goto L98;
                case 26: goto L92;
                case 27: goto L7c;
                case 28: goto L66;
                default: goto Lc;
            }
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.jb0.f5402
            r9.set(r6)
            hb0 r9 = p000.hb0.f4674
            boolean r0 = p000.jb0.m2921(r9)
            if (r0 == 0) goto L65
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jb0.f5401
            boolean r1 = r0.get()
            if (r1 == 0) goto L22
            goto L65
        L22:
            boolean r1 = p000.jb0.m2920()
            r7 = 5
            if (r1 != 0) goto L42
            int r9 = p000.jb0.f5405
            int r9 = r9 + r5
            p000.jb0.f5405 = r9
            r1 = 24
            if (r9 >= r1) goto L37
            p000.jb0.m2924(r7)
            goto L65
        L37:
            r0.set(r5)
            java.lang.String r9 = "rb22c2f83ae9ef877"
            java.lang.String r0 = "冷启动自动审批等待宿主 IM 就绪超时，本进程已降级跳过"
            p000.C0888ux.m5988(r9, r0, r4, r3, r4)
            goto L65
        L42:
            boolean r9 = p000.jb0.m2923(r9)
            if (r9 == 0) goto L62
            r0.set(r5)
            hb0 r9 = p000.hb0.f4675
            boolean r9 = p000.jb0.m2921(r9)
            if (r9 == 0) goto L65
            java.util.concurrent.ScheduledFuture r9 = p000.jb0.f5407
            if (r9 == 0) goto L5a
            r9.cancel(r6)
        L5a:
            p000.jb0.f5407 = r4
            p000.jb0.f5406 = r6
            p000.jb0.m2925()
            goto L65
        L62:
            p000.jb0.m2924(r7)
        L65:
            return
        L66:
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.jb0.f5400
            boolean r9 = r9.get()
            if (r9 == 0) goto L7b
            boolean r9 = p000.ui1.m5867()
            if (r9 != 0) goto L75
            goto L7b
        L75:
            p000.jb0.m2924(r0)
            p000.jb0.m2925()
        L7b:
            return
        L7c:
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.jb0.f5400
            boolean r9 = r9.get()
            if (r9 == 0) goto L91
            boolean r9 = p000.ui1.m5867()
            if (r9 != 0) goto L8b
            goto L91
        L8b:
            p000.jb0.m2924(r0)
            p000.jb0.m2925()
        L91:
            return
        L92:
            com.example.dyhelper.hook.γ r9 = com.example.dyhelper.hook.C0157.f2411
            com.example.dyhelper.hook.C0157.m1499()
            return
        L98:
            android.os.Handler r9 = p000.C0661os.f8210
            p000.C0661os.m4269()
            return
        L9e:
            android.os.Handler r9 = p000.C0661os.f8210
            p000.C0661os.m4286()
            return
        La4:
            java.lang.Object r9 = p000.C0661os.f8206
            monitor-enter(r9)
            p000.C0661os.f8209 = r4     // Catch: java.lang.Throwable -> Lc2
            java.util.LinkedHashMap r0 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> Lc2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lc2
            r0.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> Lc2
            boolean r1 = r0 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lc4
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> Lc2
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lc4
            goto Ldb
        Lc2:
            r0 = move-exception
            goto L116
        Lc4:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc2
        Lc8:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Ldb
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lc2
            ms r1 = (p000.C0560ms) r1     // Catch: java.lang.Throwable -> Lc2
            ns r1 = r1.f7261     // Catch: java.lang.Throwable -> Lc2
            ns r2 = p000.EnumC0597ns.f7713     // Catch: java.lang.Throwable -> Lc2
            if (r1 != r2) goto Lc8
            goto L102
        Ldb:
            java.util.LinkedHashMap r0 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> Lc2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lc2
            r0.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc2
        Lea:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L102
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lc2
            ms r1 = (p000.C0560ms) r1     // Catch: java.lang.Throwable -> Lc2
            ns r2 = r1.f7261     // Catch: java.lang.Throwable -> Lc2
            ns r3 = p000.EnumC0597ns.f7712     // Catch: java.lang.Throwable -> Lc2
            if (r2 != r3) goto Lea
            ns r2 = p000.EnumC0597ns.f7714     // Catch: java.lang.Throwable -> Lc2
            r1.f7261 = r2     // Catch: java.lang.Throwable -> Lc2
            r6 = r5
            goto Lea
        L102:
            monitor-exit(r9)
            if (r6 == 0) goto L115
            android.os.Handler r9 = p000.C0661os.f8210
            java.lang.String r9 = "auto finish idle pending DexKit tasks"
            p000.C0661os.m4293(r9)
            p000.C0661os.m4286()
            p000.C0661os.m4265()
            p000.C0661os.m4264()
        L115:
            return
        L116:
            monitor-exit(r9)
            throw r0
        L118:
            java.lang.Object r9 = p000.C0661os.f8206
            monitor-enter(r9)
            p000.C0661os.f8208 = r4     // Catch: java.lang.Throwable -> L12e
            monitor-exit(r9)
            android.os.Handler r9 = p000.C0661os.f8210
            boolean r9 = p000.C0661os.m4274()
            if (r9 != 0) goto L127
            goto L12d
        L127:
            p000.C0661os.m4286()
            p000.C0661os.m4272()
        L12d:
            return
        L12e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L131:
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.C0661os.f8203
            r9.set(r6)
            android.widget.ScrollView r9 = p000.C0661os.f8226
            if (r9 == 0) goto L13f
            android.os.Handler r9 = p000.C0661os.f8210
            p000.C0661os.m4272()
        L13f:
            return
        L140:
            p000.C0661os.m4282(r5)
            return
        L144:
            java.lang.Object r9 = p000.C0661os.f8206
            monitor-enter(r9)
            android.os.Handler r0 = p000.C0661os.f8210     // Catch: java.lang.Throwable -> L166
            p000.C0661os.m4275()     // Catch: java.lang.Throwable -> L166
            java.util.LinkedHashMap r0 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> L166
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L166
            r0.getClass()     // Catch: java.lang.Throwable -> L166
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L166
            boolean r1 = r0 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L166
            if (r1 == 0) goto L169
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L166
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L166
            if (r1 == 0) goto L169
        L164:
            r0 = r6
            goto L180
        L166:
            r0 = move-exception
            goto L1ff
        L169:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L166
        L16d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L166
            if (r1 == 0) goto L164
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L166
            ms r1 = (p000.C0560ms) r1     // Catch: java.lang.Throwable -> L166
            ns r1 = r1.f7261     // Catch: java.lang.Throwable -> L166
            ns r2 = p000.EnumC0597ns.f7712     // Catch: java.lang.Throwable -> L166
            if (r1 != r2) goto L16d
            r0 = r5
        L180:
            java.util.LinkedHashMap r1 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> L166
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L166
            r1.getClass()     // Catch: java.lang.Throwable -> L166
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L166
            boolean r2 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L166
            if (r2 == 0) goto L19a
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L166
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L166
            if (r2 == 0) goto L19a
        L198:
            r1 = r6
            goto L1b1
        L19a:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L166
        L19e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L166
            if (r2 == 0) goto L198
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L166
            ms r2 = (p000.C0560ms) r2     // Catch: java.lang.Throwable -> L166
            ns r2 = r2.f7261     // Catch: java.lang.Throwable -> L166
            ns r3 = p000.EnumC0597ns.f7713     // Catch: java.lang.Throwable -> L166
            if (r2 != r3) goto L19e
            r1 = r5
        L1b1:
            java.util.LinkedHashMap r2 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> L166
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L166
            r2.getClass()     // Catch: java.lang.Throwable -> L166
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L166
            boolean r3 = r2 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L166
            if (r3 == 0) goto L1cb
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L166
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L166
            if (r3 == 0) goto L1cb
        L1c9:
            r5 = r6
            goto L1e5
        L1cb:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L166
        L1cf:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L166
            if (r3 == 0) goto L1c9
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L166
            ms r3 = (p000.C0560ms) r3     // Catch: java.lang.Throwable -> L166
            android.os.Handler r7 = p000.C0661os.f8210     // Catch: java.lang.Throwable -> L166
            ns r3 = r3.f7261     // Catch: java.lang.Throwable -> L166
            boolean r3 = p000.C0661os.m4291(r3)     // Catch: java.lang.Throwable -> L166
            if (r3 == 0) goto L1cf
        L1e5:
            if (r0 == 0) goto L1f4
            if (r1 != 0) goto L1f4
            if (r5 == 0) goto L1f4
            s0 r4 = new s0     // Catch: java.lang.Throwable -> L166
            r0 = 23
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L166
            p000.C0661os.f8209 = r4     // Catch: java.lang.Throwable -> L166
        L1f4:
            monitor-exit(r9)
            if (r4 == 0) goto L1fe
            android.os.Handler r9 = p000.C0661os.f8210
            r0 = 300(0x12c, double:1.48E-321)
            r9.postDelayed(r4, r0)
        L1fe:
            return
        L1ff:
            monitor-exit(r9)
            throw r0
        L201:
            p000.C0661os.m4282(r5)
            return
        L205:
            android.os.Handler r9 = p000.C0661os.f8210
            p000.C0661os.m4286()
            p000.C0661os.m4272()
            return
        L20e:
            android.widget.ScrollView r9 = p000.C0661os.f8204
            if (r9 != 0) goto L213
            goto L22e
        L213:
            android.view.View r0 = r9.getChildAt(r6)
            if (r0 != 0) goto L21a
            goto L22e
        L21a:
            int r0 = r0.getMeasuredHeight()
            int r1 = r9.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r9.getHeight()
            int r1 = r1 - r0
            if (r1 >= 0) goto L22b
            r1 = r6
        L22b:
            r9.smoothScrollTo(r6, r1)
        L22e:
            return
        L22f:
            int r9 = android.os.Process.myPid()
            android.os.Process.killProcess(r9)
            java.lang.System.exit(r6)
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "System.exit returned normally, while it was supposed to halt JVM."
            r9.<init>(r0)
            throw r9
        L241:
            android.os.Handler r9 = p000.C0661os.f8210
            p000.C0661os.m4273()
            return
        L247:
            android.os.Handler r9 = p000.C0661os.f8210
            p000.C0661os.m4272()
            return
        L24d:
            p000.C0661os.m4282(r5)
            return
        L251:
            ll r9 = p000.C0516ll.f6699
            p000.C0516ll.m3589()
            return
        L257:
            p000.AbstractC0551mj.m3848()
            p000.AbstractC0551mj.m3862()
            return
        L25e:
            p000.AbstractC0551mj.m3862()
            return
        L262:
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r9 = p000.C0287fj.f3956
            java.util.Set r9 = r9.entrySet()
            gh r3 = new gh
            r4 = 8
            r3.<init>(r4)
            wi r4 = new wi
            r4.<init>(r3, r6)
            r9.removeIf(r4)
            java.util.concurrent.ConcurrentHashMap r9 = p000.C0287fj.f3957
            java.util.Set r9 = r9.entrySet()
            gh r3 = new gh
            r4 = 9
            r3.<init>(r4)
            wi r4 = new wi
            r4.<init>(r3, r5)
            r9.removeIf(r4)
            java.util.concurrent.ConcurrentHashMap r9 = p000.C0287fj.f3958
            java.util.Set r9 = r9.entrySet()
            mc r3 = new mc
            r3.<init>(r2, r0)
            wi r0 = new wi
            r0.<init>(r3, r2)
            r9.removeIf(r0)
            java.util.concurrent.ConcurrentHashMap r9 = p000.C0287fj.f3959
            java.util.Set r9 = r9.entrySet()
            gh r0 = new gh
            r1 = 10
            r0.<init>(r1)
            wi r1 = new wi
            r2 = 3
            r1.<init>(r0, r2)
            r9.removeIf(r1)
            return
        L2ba:
            tg r9 = p000.AbstractC0871ug.f10771
            boolean r0 = p000.C0834tg.m5640()
            if (r0 != 0) goto L2c3
            goto L2c9
        L2c3:
            r9.m5697()
            p000.C0834tg.m5650(r6)
        L2c9:
            return
        L2ca:
            tg r9 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5667()
            return
        L2d0:
            p000.AbstractC0871ug.f10766 = r4
            p000.AbstractC0871ug.f10791 = r6
            tg r9 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5650(r5)
            return
        L2da:
            java.util.LinkedHashSet r9 = p000.AbstractC0871ug.f10797
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r9)
            java.lang.String r1 = p000.AbstractC0871ug.f10798
            r9.clear()
            java.lang.String r9 = ""
            p000.AbstractC0871ug.f10798 = r9
            p000.AbstractC0871ug.f10796 = r4
            tg r9 = p000.AbstractC0871ug.f10771
            java.lang.String r2 = "clean_mode_enabled"
            boolean r3 = p000.C0834tg.m5640()
            boolean r4 = p000.AbstractC0871ug.f10783
            boolean r7 = p000.AbstractC0871ug.f10788
            p000.C0834tg.m5668()
            java.lang.String r8 = "runtime config changed"
            p000.C0834tg.m5685(r8)
            oh r8 = p000.C0623oh.f8099
            boolean r8 = p000.AbstractC0871ug.f10793
            p000.C0623oh.m4242(r8)
            boolean r8 = p000.C0834tg.m5640()
            if (r8 == 0) goto L30f
            r9.m5697()
        L30f:
            r9.m5698()
            r9.m5707()
            p000.C0834tg.m5655()
            boolean r9 = r0.contains(r2)
            if (r9 != 0) goto L32a
            boolean r9 = p000.AbstractC0871ug.f10783
            if (r4 != r9) goto L32a
            boolean r9 = p000.AbstractC0871ug.f10788
            if (r7 != r9) goto L32a
            boolean r9 = p000.AbstractC0871ug.f10788
            if (r9 != 0) goto L32c
        L32a:
            p000.AbstractC0871ug.f10791 = r6
        L32c:
            if (r8 != 0) goto L34d
            p000.AbstractC0871ug.f10791 = r6
            sb r9 = p000.C0792sb.f9786     // Catch: java.lang.Throwable -> L335
            p000.C0792sb.m5428(r6)     // Catch: java.lang.Throwable -> L335
        L335:
            p000.C0834tg.m5672()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "re81757ac4b2b47fd"
            r9.<init>(r2)
            r9.append(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            p000.C0888ux.m5985(r9)
            goto L384
        L34d:
            boolean r9 = r0.contains(r2)
            if (r9 != 0) goto L363
            java.lang.String r9 = "clean_auto_hide"
            boolean r9 = r0.contains(r9)
            if (r9 != 0) goto L363
            if (r3 != r8) goto L363
            boolean r9 = p000.AbstractC0871ug.f10783
            if (r4 == r9) goto L362
            goto L363
        L362:
            r5 = r6
        L363:
            p000.C0834tg.m5650(r5)
            boolean r9 = p000.AbstractC0871ug.f10783
            boolean r2 = p000.AbstractC0871ug.f10788
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "r421e2dad95c76c36"
            r3.<init>(r4)
            r3.append(r9)
            r3.append(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r9 = r3.toString()
            p000.C0888ux.m5985(r9)
        L384:
            return
        L385:
            boolean r9 = p000.AbstractC0871ug.f10783
            tg r0 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5668()
            p000.C0834tg.m5655()
            p000.AbstractC0871ug.f10791 = r6
            java.lang.String r1 = "account changed"
            p000.C0834tg.m5685(r1)
            boolean r1 = p000.C0834tg.m5640()
            if (r1 == 0) goto L39f
            r0.m5697()
        L39f:
            r0.m5698()
            r0.m5707()
            boolean r0 = p000.C0834tg.m5640()
            if (r0 != 0) goto L3b1
            if (r9 == 0) goto L3b4
            p000.C0834tg.m5672()
            goto L3b4
        L3b1:
            p000.C0834tg.m5650(r5)
        L3b4:
            boolean r9 = p000.AbstractC0871ug.f10765
            boolean r0 = p000.AbstractC0871ug.f10783
            boolean r1 = p000.AbstractC0871ug.f10788
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "r85fd2d219760e52a"
            r2.<init>(r3)
            r2.append(r9)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            p000.C0888ux.m5985(r9)
            return
        L3d2:
            java.lang.String r9 = "rc2b948eb05c3593c"
            java.lang.String r0 = "blacklist block dialog shown uid="
            com.example.dyhelper.beta.BlacklistVerifier r1 = com.example.dyhelper.beta.BlacklistVerifier.f2226
            java.lang.ref.WeakReference r2 = com.example.dyhelper.beta.BlacklistVerifier.f2236     // Catch: java.lang.Throwable -> L3f3
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L3f3
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L3f3
            if (r2 == 0) goto L3e3
            goto L3e8
        L3e3:
            android.content.Context r2 = com.example.dyhelper.beta.BlacklistVerifier.f2234     // Catch: java.lang.Throwable -> L3f3
            if (r2 != 0) goto L3e8
            goto L42b
        L3e8:
            java.lang.String r6 = com.example.dyhelper.beta.BlacklistVerifier.f2235     // Catch: java.lang.Throwable -> L3f3
            boolean r7 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L3f3
            if (r7 == 0) goto L3f5
            java.lang.String r6 = "未知"
            goto L3f5
        L3f3:
            r0 = move-exception
            goto L42e
        L3f5:
            java.lang.String r1 = r1.m1310()     // Catch: java.lang.Throwable -> L3f3
            boolean r7 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> L3f3
            if (r7 == 0) goto L401
            java.lang.String r1 = "违规使用"
        L401:
            java.lang.String r7 = "DYHelper 黑名单用户，进程将退出"
            android.widget.Toast r7 = android.widget.Toast.makeText(r2, r7, r5)     // Catch: java.lang.Throwable -> L3f3
            r7.show()     // Catch: java.lang.Throwable -> L3f3
            android.os.Handler r7 = p000.AbstractC0205da.f2995     // Catch: java.lang.Throwable -> L3f3
            e9 r8 = new e9     // Catch: java.lang.Throwable -> L3f3
            r8.<init>(r2, r6, r1, r5)     // Catch: java.lang.Throwable -> L3f3
            r7.post(r8)     // Catch: java.lang.Throwable -> L3f3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f3
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3f3
            r2.append(r6)     // Catch: java.lang.Throwable -> L3f3
            java.lang.String r0 = " reason="
            r2.append(r0)     // Catch: java.lang.Throwable -> L3f3
            r2.append(r1)     // Catch: java.lang.Throwable -> L3f3
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3f3
            p000.C0888ux.m5988(r9, r0, r4, r3, r4)     // Catch: java.lang.Throwable -> L3f3
        L42b:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3f3
            goto L434
        L42e:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L434:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L447
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "show blocked toast/dialog failed: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            p000.C0888ux.m5988(r9, r0, r4, r3, r4)
        L447:
            return
        L448:
            java.lang.String r9 = "notice check failed: "
            java.lang.String r0 = p000.AbstractC0976x9.m6536(r4)     // Catch: java.lang.Throwable -> L45a
            boolean r1 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L45a
            if (r1 != 0) goto L45c
            android.os.Handler r1 = p000.C0753r9.f9291     // Catch: java.lang.Throwable -> L45a
            p000.C0753r9.m5070(r0)     // Catch: java.lang.Throwable -> L45a
            goto L45c
        L45a:
            r0 = move-exception
            goto L462
        L45c:
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.AbstractC0976x9.f12071
            r9.set(r6)
            goto L478
        L462:
            java.lang.String r1 = "r267d1c3d8cdbcdb7"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L479
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L479
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L479
            r2.append(r0)     // Catch: java.lang.Throwable -> L479
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L479
            p000.C0888ux.m5988(r1, r9, r4, r3, r4)     // Catch: java.lang.Throwable -> L479
            goto L45c
        L478:
            return
        L479:
            r9 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0976x9.f12071
            r0.set(r6)
            throw r9
        L480:
            v11 r9 = androidx.compose.p001ui.platform.AndroidComposeView.f874
            monitor-enter(r9)
            java.lang.Object[] r0 = r9.f11064     // Catch: java.lang.Throwable -> L498
            int r1 = r9.f11065     // Catch: java.lang.Throwable -> L498
        L487:
            if (r6 >= r1) goto L49a
            r3 = r0[r6]     // Catch: java.lang.Throwable -> L498
            androidx.compose.ui.platform.AndroidComposeView r3 = (androidx.compose.p001ui.platform.AndroidComposeView) r3     // Catch: java.lang.Throwable -> L498
            q0 r4 = new q0     // Catch: java.lang.Throwable -> L498
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L498
            r3.post(r4)     // Catch: java.lang.Throwable -> L498
            int r6 = r6 + 1
            goto L487
        L498:
            r0 = move-exception
            goto L49c
        L49a:
            monitor-exit(r9)
            return
        L49c:
            monitor-exit(r9)
            throw r0
    }
}
