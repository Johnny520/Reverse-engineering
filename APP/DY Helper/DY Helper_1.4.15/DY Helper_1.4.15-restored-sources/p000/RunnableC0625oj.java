package p000;

/* JADX INFO: renamed from: oj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0625oj implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8116;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f8117;

    public /* synthetic */ RunnableC0625oj(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            r0.f8116 = r2
            r0.f8117 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r0 = r17
            int r1 = r0.f8116
            r2 = 15000(0x3a98, double:7.411E-320)
            r4 = 200(0xc8, double:9.9E-322)
            r6 = 0
            r7 = 0
            switch(r1) {
                case 0: goto L2b8;
                case 1: goto L29c;
                case 2: goto L294;
                case 3: goto L132;
                case 4: goto L104;
                case 5: goto Lfc;
                case 6: goto Ld6;
                case 7: goto L38;
                case 8: goto L30;
                case 9: goto L18;
                default: goto Ld;
            }
        Ld:
            java.lang.ClassLoader r0 = r0.f8117
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L17
            p000.e72.m1857(r0)     // Catch: java.lang.Throwable -> L17
        L17:
            return
        L18:
            java.lang.ClassLoader r0 = r0.f8117
            p000.e72.m1857(r0)     // Catch: java.lang.Throwable -> L1e
            goto L2f
        L1e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "AppLog 刷新失败 source=User.getUid() changed: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            r1 = 4
            java.lang.String r2 = "r3d7af71c7d5f3398"
            p000.C0888ux.m5988(r2, r0, r6, r1, r6)
        L2f:
            return
        L30:
            java.lang.ClassLoader r0 = r0.f8117
            sh1 r1 = p000.sh1.f9903
            r1.m5520(r0)
            return
        L38:
            java.lang.String r1 = "r33415130c3798aa0"
            java.lang.ClassLoader r0 = r0.f8117
            sh1 r7 = p000.sh1.f9903
            r7 = 10
            android.os.Process.setThreadPriority(r7)     // Catch: java.lang.Throwable -> L43
        L43:
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5e
            r10 = 3000(0xbb8, double:1.482E-320)
            long r8 = r8 + r10
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.C0666ox.f8305     // Catch: java.lang.Throwable -> L5e
            boolean r11 = r10.get()     // Catch: java.lang.Throwable -> L5e
            if (r11 != 0) goto L61
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5e
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 >= 0) goto L61
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L5e
            goto L4a
        L5e:
            r0 = move-exception
            goto Ld0
        L61:
            boolean r4 = r10.get()     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L6e
            java.lang.String r0 = "DexKit manager not initialized, skip full resolve"
            p000.sh1.m5510(r0)     // Catch: java.lang.Throwable -> L5e
            goto Ld5
        L6e:
            boolean r4 = p000.sh1.m5506(r0)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L75
            goto Ld5
        L75:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5e
            long r4 = r4 + r2
        L7a:
            java.lang.ref.WeakReference r2 = p000.sh1.f9912     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L85
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L5e
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L5e
            goto L86
        L85:
            r2 = r6
        L86:
            if (r2 != 0) goto L96
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L96
            r2 = 250(0xfa, double:1.235E-321)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L5e
            goto L7a
        L96:
            r2 = 1500(0x5dc, double:7.41E-321)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L5e
            boolean r2 = p000.sh1.m5506(r0)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto La2
            goto Ld5
        La2:
            java.lang.String r2 = "play completed hooks installed, methods="
            android.os.Process.setThreadPriority(r7)     // Catch: java.lang.Throwable -> La7
        La7:
            boolean r3 = p000.sh1.m5506(r0)     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto Lae
            goto Ld5
        Lae:
            java.util.List r3 = p000.uh1.m5866(r0)     // Catch: java.lang.Throwable -> Lc9
            p000.sh1.m5505(r0, r3)     // Catch: java.lang.Throwable -> Lc9
            int r0 = r3.size()     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lc9
            r3.append(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lc9
            p000.sh1.m5510(r0)     // Catch: java.lang.Throwable -> Lc9
            goto Ld5
        Lc9:
            r0 = move-exception
            java.lang.String r2 = "DexKit progress failed"
            p000.C0888ux.m5977(r1, r2, r0)     // Catch: java.lang.Throwable -> L5e
            goto Ld5
        Ld0:
            java.lang.String r2 = "schedule completed hooks failed"
            p000.C0888ux.m5977(r1, r2, r0)
        Ld5:
            return
        Ld6:
            java.lang.ClassLoader r0 = r0.f8117
            sh1 r1 = p000.sh1.f9903
            java.lang.Object r1 = r1.m5517(r0)
            if (r1 != 0) goto Le6
            java.lang.String r0 = "resumeFeedPlayer failed: wrapper is null"
            p000.sh1.m5510(r0)
            goto Lfb
        Le6:
            boolean r2 = p000.sh1.m5508(r1, r0, r7)
            if (r2 == 0) goto Led
            goto Lfb
        Led:
            java.lang.String r2 = "resume"
            boolean r0 = p000.sh1.m5507(r0, r1, r2)
            if (r0 == 0) goto Lf6
            goto Lfb
        Lf6:
            java.lang.String r0 = "resumeFeedPlayer failed: all methods unavailable"
            p000.sh1.m5510(r0)
        Lfb:
            return
        Lfc:
            java.lang.ClassLoader r0 = r0.f8117
            sh1 r1 = p000.sh1.f9903
            r1.m5520(r0)
            return
        L104:
            java.lang.ClassLoader r0 = r0.f8117
            android.os.Handler r1 = p000.ah0.f229
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.ah0.f232
            java.lang.Class r0 = p000.ah0.m139(r0)     // Catch: java.lang.Throwable -> L114
            if (r0 != 0) goto L116
            r1.set(r7)     // Catch: java.lang.Throwable -> L114
            goto L131
        L114:
            r0 = move-exception
            goto L129
        L116:
            android.os.Handler r2 = p000.ah0.f229     // Catch: java.lang.Throwable -> L114
            ν r3 = new ν     // Catch: java.lang.Throwable -> L114
            r4 = 19
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L114
            boolean r0 = r2.post(r3)     // Catch: java.lang.Throwable -> L114
            if (r0 != 0) goto L131
            r1.set(r7)     // Catch: java.lang.Throwable -> L114
            goto L131
        L129:
            r1.set(r7)
            java.lang.String r1 = "resolve-adapter"
            p000.ah0.m138(r1, r0)
        L131:
            return
        L132:
            java.lang.ClassLoader r0 = r0.f8117
            x r1 = p000.C0966x.f11923
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.C0777rx.f9564
            java.util.concurrent.ConcurrentHashMap r8 = p000.C0777rx.f9562
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L171
            long r8 = r8 + r2
        L13f:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L171
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r3 = 1
            if (r2 >= 0) goto L15f
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.C0666ox.f8305     // Catch: java.lang.Throwable -> L171
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L152
            r2 = r3
            goto L165
        L152:
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L156 java.lang.Throwable -> L171
            goto L13f
        L156:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L171
            r2.interrupt()     // Catch: java.lang.Throwable -> L171
            r2 = r7
            goto L165
        L15f:
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.C0666ox.f8305     // Catch: java.lang.Throwable -> L171
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L171
        L165:
            if (r2 != 0) goto L174
            java.lang.String r0 = "prewarm canceled: DyDexKitManager not initialized"
            p000.C0777rx.m5175(r0)     // Catch: java.lang.Throwable -> L171
        L16c:
            r6.set(r7)
            goto L28e
        L171:
            r0 = move-exception
            goto L278
        L174:
            java.util.LinkedHashMap r2 = p000.C0777rx.m5174(r0)     // Catch: java.lang.Throwable -> L171
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L171
            if (r4 == 0) goto L187
            java.lang.String r1 = "no prewarm tasks registered"
            p000.C0777rx.m5175(r1)     // Catch: java.lang.Throwable -> L171
            p000.C0777rx.m5176(r0)     // Catch: java.lang.Throwable -> L171
            goto L16c
        L187:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L171
            r4.<init>()     // Catch: java.lang.Throwable -> L171
            java.util.Set r5 = r2.entrySet()     // Catch: java.lang.Throwable -> L171
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L171
            r8 = r7
            r9 = r8
        L196:
            boolean r10 = r5.hasNext()     // Catch: java.lang.Throwable -> L171
            if (r10 == 0) goto L1e7
            java.lang.Object r10 = r5.next()     // Catch: java.lang.Throwable -> L171
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch: java.lang.Throwable -> L171
            java.lang.Object r11 = r10.getKey()     // Catch: java.lang.Throwable -> L171
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L171
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L171
            qx r10 = (p000.C0740qx) r10     // Catch: java.lang.Throwable -> L171
            java.lang.Object r12 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L171
            java.lang.String r12 = r10.f9152     // Catch: java.lang.Throwable -> L171
            boolean r13 = p000.C0666ox.m4318(r12)     // Catch: java.lang.Throwable -> L171
            if (r13 == 0) goto L1ba
        L1b8:
            r12 = r3
            goto L1d3
        L1ba:
            boolean r13 = r1.m6456(r12)     // Catch: java.lang.Throwable -> L171
            if (r13 == 0) goto L1d2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L171
            java.lang.String r14 = "skip unsupported prewarm task: "
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L171
            r13.append(r12)     // Catch: java.lang.Throwable -> L171
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L171
            p000.C0777rx.m5175(r12)     // Catch: java.lang.Throwable -> L171
            goto L1b8
        L1d2:
            r12 = r7
        L1d3:
            if (r12 == 0) goto L1e3
            java.lang.String r10 = r10.f9152     // Catch: java.lang.Throwable -> L171
            boolean r10 = r1.m6456(r10)     // Catch: java.lang.Throwable -> L171
            if (r10 == 0) goto L1e0
            int r9 = r9 + 1
            goto L196
        L1e0:
            int r8 = r8 + 1
            goto L196
        L1e3:
            r4.put(r11, r10)     // Catch: java.lang.Throwable -> L171
            goto L196
        L1e7:
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L171
            java.lang.String r3 = ", unsupported="
            if (r1 == 0) goto L21d
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L171
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L171
            r2.<init>()     // Catch: java.lang.Throwable -> L171
            java.lang.String r4 = "all prewarm tasks satisfied: cached="
            r2.append(r4)     // Catch: java.lang.Throwable -> L171
            r2.append(r8)     // Catch: java.lang.Throwable -> L171
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            r2.append(r9)     // Catch: java.lang.Throwable -> L171
            java.lang.String r3 = ", total="
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            r2.append(r1)     // Catch: java.lang.Throwable -> L171
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L171
            p000.C0777rx.m5175(r1)     // Catch: java.lang.Throwable -> L171
            p000.C0777rx.m5182()     // Catch: java.lang.Throwable -> L171
            p000.C0777rx.m5176(r0)     // Catch: java.lang.Throwable -> L171
            goto L16c
        L21d:
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L171
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L171
            java.util.Collection r5 = r4.values()     // Catch: java.lang.Throwable -> L171
            r5.getClass()     // Catch: java.lang.Throwable -> L171
            r10 = r5
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L171
            java.lang.String r11 = ", "
            hm r15 = new hm     // Catch: java.lang.Throwable -> L171
            r5 = 23
            r15.<init>(r5)     // Catch: java.lang.Throwable -> L171
            r16 = 30
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L171
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L171
            r10.<init>()     // Catch: java.lang.Throwable -> L171
            java.lang.String r11 = "prewarm start, total="
            r10.append(r11)     // Catch: java.lang.Throwable -> L171
            r10.append(r1)     // Catch: java.lang.Throwable -> L171
            java.lang.String r1 = ", cached="
            r10.append(r1)     // Catch: java.lang.Throwable -> L171
            r10.append(r8)     // Catch: java.lang.Throwable -> L171
            r10.append(r3)     // Catch: java.lang.Throwable -> L171
            r10.append(r9)     // Catch: java.lang.Throwable -> L171
            java.lang.String r1 = ", missing="
            r10.append(r1)     // Catch: java.lang.Throwable -> L171
            r10.append(r2)     // Catch: java.lang.Throwable -> L171
            java.lang.String r1 = ", missingIds="
            r10.append(r1)     // Catch: java.lang.Throwable -> L171
            r10.append(r5)     // Catch: java.lang.Throwable -> L171
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Throwable -> L171
            p000.C0777rx.m5175(r1)     // Catch: java.lang.Throwable -> L171
            p000.C0777rx.m5180(r0, r4)     // Catch: java.lang.Throwable -> L171
            goto L16c
        L278:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28f
            r1.<init>()     // Catch: java.lang.Throwable -> L28f
            java.lang.String r2 = "prewarm fatal: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L28f
            r1.append(r0)     // Catch: java.lang.Throwable -> L28f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L28f
            p000.C0777rx.m5175(r0)     // Catch: java.lang.Throwable -> L28f
            goto L16c
        L28e:
            return
        L28f:
            r0 = move-exception
            r6.set(r7)
            throw r0
        L294:
            java.lang.ClassLoader r0 = r0.f8117
            int r1 = p000.C0410ix.f5220
            p000.C0410ix.m2823(r0)
            return
        L29c:
            java.lang.ClassLoader r0 = r0.f8117
            android.os.MessageQueue r1 = android.os.Looper.myQueue()
            ex r2 = new ex
            r2.<init>(r0)
            r1.addIdleHandler(r2)
            android.os.Handler r1 = p000.C0410ix.f5232
            oj r2 = new oj
            r3 = 2
            r2.<init>(r0, r3)
            r3 = 0
            r1.postDelayed(r2, r3)
            return
        L2b8:
            java.lang.ClassLoader r0 = r0.f8117
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.m1393(r0)
            return
    }
}
