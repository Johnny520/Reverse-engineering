package p000;

/* JADX INFO: renamed from: ν */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1090 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13405;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f13406;

    public /* synthetic */ RunnableC1090(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f13405 = r1
            r0.f13406 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC1090(java.util.ArrayList r1, p000.mz1 r2, p000.C0697pr r3) {
            r0 = this;
            r2 = 11
            r0.f13405 = r2
            r0.<init>()
            r0.f13406 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m7283() {
            r4 = this;
            java.lang.Object r4 = r4.f13406
            o50 r4 = (p000.o50) r4
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.Object r1 = r4.f7955
            monitor-enter(r1)
            pd2 r2 = r4.f7959     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r4 = move-exception
            goto Lae
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            f60 r1 = r4.m4211()     // Catch: java.lang.Throwable -> L24
            int r2 = r1.f3763     // Catch: java.lang.Throwable -> L24
            r3 = 2
            if (r2 != r3) goto L26
            java.lang.Object r3 = r4.f7955     // Catch: java.lang.Throwable -> L24
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L26
        L21:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L24
        L24:
            r0 = move-exception
            goto L9a
        L26:
            if (r2 != 0) goto L83
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L7e
            i2 r0 = r4.f7954     // Catch: java.lang.Throwable -> L7e
            android.content.Context r2 = r4.f7952     // Catch: java.lang.Throwable -> L7e
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            f60[] r0 = new p000.f60[]{r1}     // Catch: java.lang.Throwable -> L7e
            r3 = 0
            android.graphics.Typeface r0 = p000.i62.m2622(r2, r0, r3)     // Catch: java.lang.Throwable -> L7e
            android.content.Context r2 = r4.f7952     // Catch: java.lang.Throwable -> L7e
            android.net.Uri r1 = r1.f3758     // Catch: java.lang.Throwable -> L7e
            java.nio.MappedByteBuffer r1 = p000.u81.m5812(r2, r1)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L76
            if (r0 == 0) goto L76
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L71
            i0 r2 = new i0     // Catch: java.lang.Throwable -> L71
            h01 r1 = p000.ln0.m3643(r1)     // Catch: java.lang.Throwable -> L71
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L71
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L7e
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r4.f7955     // Catch: java.lang.Throwable -> L24
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L24
            pd2 r1 = r4.f7959     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L6a
            r1.mo1979(r2)     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r1 = move-exception
            goto L6f
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            r4.m4210()     // Catch: java.lang.Throwable -> L24
            return
        L6f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L24
        L71:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L7e
        L76:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "Unable to open file."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L83:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r3.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L24
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L24
        L9a:
            java.lang.Object r2 = r4.f7955
            monitor-enter(r2)
            pd2 r1 = r4.f7959     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto La7
            r1.mo1978(r0)     // Catch: java.lang.Throwable -> La5
            goto La7
        La5:
            r4 = move-exception
            goto Lac
        La7:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            r4.m4210()
            return
        Lac:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r4
        Lae:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    @Override // java.lang.Runnable
    public final void run() {
            r20 = this;
            r0 = r20
            int r1 = r0.f13405
            r4 = 7
            r5 = 5
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            switch(r1) {
                case 0: goto L62f;
                case 1: goto L606;
                case 2: goto L552;
                case 3: goto L4c1;
                case 4: goto L402;
                case 5: goto L39c;
                case 6: goto L237;
                case 7: goto L22f;
                case 8: goto L227;
                case 9: goto L219;
                case 10: goto L211;
                case 11: goto L202;
                case 12: goto L1fa;
                case 13: goto L1f2;
                case 14: goto L1ea;
                case 15: goto L1e6;
                case 16: goto L1de;
                case 17: goto L1d6;
                case 18: goto L19c;
                case 19: goto L173;
                case 20: goto L165;
                case 21: goto L15d;
                case 22: goto L155;
                case 23: goto L14e;
                case 24: goto L12d;
                case 25: goto L31;
                case 26: goto L1d;
                case 27: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r0.f13406
            h52 r0 = (p000.h52) r0
            r0.invoke()
            return
        L15:
            java.lang.Object r0 = r0.f13406
            h52 r0 = (p000.h52) r0
            r0.invoke()
            return
        L1d:
            java.lang.Object r0 = r0.f13406
            androidx.core.view.insets.α r0 = (androidx.core.view.insets.C0044) r0
            android.view.View r0 = r0.f1020
            android.view.ViewParent r1 = r0.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L30
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r0)
        L30:
            return
        L31:
            java.lang.Object r0 = r0.f13406
            jy1 r0 = (p000.jy1) r0
            ry1 r1 = p000.ry1.f9602
            java.lang.String r2 = "需要续期: "
            java.lang.String r3 = "收集到 "
            java.lang.String r4 = "续火线程启动，等待 "
            int r5 = r0.f5669     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r10.append(r5)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.String r4 = " 秒"
            r10.append(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            p000.ry1.m5276(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            int r4 = r0.f5669     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r10 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r10
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            boolean r4 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r4 == 0) goto L69
        L62:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ry1.f9629
            r0.set(r9)
            goto L126
        L69:
            java.lang.String r4 = "火花数据"
            tv1 r5 = new tv1     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r7 = 60
            s62 r4 = p000.ry1.m5296(r7, r5, r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r4 != 0) goto L81
            java.lang.String r0 = "60s 超时，无火花数据"
            p000.ry1.m5276(r0)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            goto L62
        L7e:
            r0 = move-exception
            goto L116
        L81:
            java.util.concurrent.ConcurrentHashMap r4 = p000.ry1.f9620     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r5.append(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.String r3 = " 个会话"
            r5.append(r3)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            p000.ry1.m5276(r3)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.util.concurrent.atomic.AtomicReference r3 = p000.ry1.f9578     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r4 != 0) goto Ld6
            java.lang.String r4 = "IMSdkContext"
            tv1 r5 = new tv1     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r6 = 20
            p000.ry1.m5296(r6, r5, r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r4 != 0) goto Lca
            java.lang.ClassLoader r4 = p000.ry1.f9622     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r4 == 0) goto Lca
            eo1 r4 = p000.ry1.m5294(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r4 == 0) goto Lca
            r3.set(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            p000.ry1.m5217(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.String r4 = "主动获取 IMSdkContext 成功"
            p000.ry1.m5276(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
        Lca:
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r3 != 0) goto Ld6
            java.lang.String r0 = "IMSdkContext 不可用，放弃续期"
            p000.ry1.m5275(r0, r8)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            goto L62
        Ld6:
            java.lang.String r3 = "发送核心"
            tv1 r4 = new tv1     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r5 = 3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r5 = 30
            s62 r3 = p000.ry1.m5296(r5, r4, r3)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r3 != 0) goto Led
            java.lang.String r0 = "发送核心 30s 未就绪"
            p000.ry1.m5276(r0)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            goto L62
        Led:
            java.util.ArrayList r3 = p000.ry1.m5195()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            r5.append(r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            p000.ry1.m5276(r2)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            boolean r2 = r3.isEmpty()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            if (r2 == 0) goto L111
            java.lang.String r0 = "所有火花今日均已续期"
            p000.ry1.m5276(r0)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            goto L62
        L111:
            r1.m5298(r3, r0)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L11f
            goto L62
        L116:
            java.lang.String r1 = "续火线程异常"
            p000.ry1.m5275(r1, r0)     // Catch: java.lang.Throwable -> L11d
            goto L62
        L11d:
            r0 = move-exception
            goto L127
        L11f:
            java.lang.String r0 = "续火线程被中断"
            p000.ry1.m5274(r0)     // Catch: java.lang.Throwable -> L11d
            goto L62
        L126:
            return
        L127:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.ry1.f9629
            r1.set(r9)
            throw r0
        L12d:
            java.lang.Object r0 = r0.f13406
            wi1 r0 = (p000.wi1) r0
            jr0 r1 = r0.f11740
            int r2 = r0.f11736
            if (r2 != 0) goto L13e
            r0.f11737 = r7
            br0 r2 = p000.br0.ON_PAUSE
            r1.m2983(r2)
        L13e:
            int r2 = r0.f11735
            if (r2 != 0) goto L14d
            boolean r2 = r0.f11737
            if (r2 == 0) goto L14d
            br0 r2 = p000.br0.ON_STOP
            r1.m2983(r2)
            r0.f11738 = r7
        L14d:
            return
        L14e:
            java.lang.Object r0 = r0.f13406
            d81 r0 = (p000.d81) r0
            r0.f2959 = r9
            return
        L155:
            java.lang.Object r0 = r0.f13406
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r0.scrollTo(r9, r9)
            return
        L15d:
            java.lang.Object r0 = r0.f13406
            xb0 r0 = (p000.xb0) r0
            r0.invoke()
            return
        L165:
            java.lang.Object r0 = r0.f13406
            android.view.Window r0 = (android.view.Window) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.il0.f5108
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L172
            r0.requestApplyInsets()     // Catch: java.lang.Throwable -> L172
        L172:
            return
        L173:
            java.lang.Object r0 = r0.f13406
            java.lang.Class r0 = (java.lang.Class) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.ah0.f232
            android.os.Handler r2 = p000.ah0.f229     // Catch: java.lang.Throwable -> L192
            boolean r2 = p000.ah0.m123()     // Catch: java.lang.Throwable -> L192
            if (r2 == 0) goto L194
            p000.ah0.m120(r0)     // Catch: java.lang.Throwable -> L192
            p000.ah0.m149()     // Catch: java.lang.Throwable -> L192
            android.os.Handler r0 = p000.ah0.f229     // Catch: java.lang.Throwable -> L192
            fb0 r2 = new fb0     // Catch: java.lang.Throwable -> L192
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L192
            r0.post(r2)     // Catch: java.lang.Throwable -> L192
            goto L194
        L192:
            r0 = move-exception
            goto L198
        L194:
            r1.set(r9)
            return
        L198:
            r1.set(r9)
            throw r0
        L19c:
            java.lang.Object r0 = r0.f13406
            dc0 r0 = (p000.dc0) r0
            um1 r1 = new um1
            r1.<init>()
            p3 r2 = new p3
            r3 = 14
            r2.<init>(r1, r3, r0)
            boolean r2 = p000.jc0.m2927(r2)
            if (r2 != 0) goto L1bb
            wb0 r1 = new wb0
            r1.<init>(r0, r5)
            r0.m1690(r1)
            goto L1cf
        L1bb:
            java.lang.Object r2 = r1.f10912
            if (r2 == 0) goto L1d0
            sb0 r2 = (p000.sb0) r2
            java.util.List r2 = r2.f9811
            java.util.Map r2 = r0.m1691(r2)
            z7 r3 = new z7
            r3.<init>(r0, r1, r2, r4)
            r0.m1690(r3)
        L1cf:
            return
        L1d0:
            java.lang.String r0 = "result"
            p000.ln0.m3650(r0)
            throw r8
        L1d6:
            java.lang.Object r0 = r0.f13406
            ja0 r0 = (p000.ja0) r0
            r0.invoke()
            return
        L1de:
            java.lang.Object r0 = r0.f13406
            ja0 r0 = (p000.ja0) r0
            r0.invoke()
            return
        L1e6:
            r0.m7283()
            return
        L1ea:
            java.lang.Object r0 = r0.f13406
            o7 r0 = (p000.C0613o7) r0
            r0.invoke()
            return
        L1f2:
            java.lang.Object r0 = r0.f13406
            η r0 = (p000.C1084) r0
            r0.invoke()
            return
        L1fa:
            java.lang.Object r0 = r0.f13406
            hb r0 = (p000.C0353hb) r0
            r0.invoke()
            return
        L202:
            java.lang.Object r0 = r0.f13406
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r1 = r0.contains(r8)
            if (r1 != 0) goto L20d
            return
        L20d:
            r0.remove(r8)
            throw r8
        L211:
            java.lang.Object r0 = r0.f13406
            xm r0 = (p000.DialogC0989xm) r0
            p000.DialogC0989xm.m6682(r0)
            return
        L219:
            java.lang.Object r0 = r0.f13406
            wm r0 = (p000.ViewTreeObserverOnDrawListenerC0952wm) r0
            java.lang.Runnable r1 = r0.f11760
            if (r1 == 0) goto L226
            r1.run()
            r0.f11760 = r8
        L226:
            return
        L227:
            java.lang.Object r0 = r0.f13406
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.invalidateOptionsMenu()
            return
        L22f:
            java.lang.Object r0 = r0.f13406
            af0 r0 = (p000.af0) r0
            r0.invoke()
            return
        L237:
            java.lang.Object r0 = r0.f13406
            r1 = r0
            dj r1 = (p000.C0214dj) r1
            java.util.concurrent.atomic.AtomicReference r0 = p000.C0287fj.f3964
            java.lang.Object r4 = r0.get()
            if (r4 == r1) goto L246
            goto L398
        L246:
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.Object r4 = r1.f3180
            monitor-enter(r4)
            long r12 = r1.f3182     // Catch: java.lang.Throwable -> L399
            monitor-exit(r4)
            long r14 = r1.f3183
            r16 = 0
            long r2 = r1.f3179
            long r2 = r10 - r2
            r18 = 45000(0xafc8, double:2.2233E-319)
            int r2 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r2 < 0) goto L261
            r2 = r7
            goto L262
        L261:
            r2 = r9
        L262:
            r18 = 2048(0x800, double:1.012E-320)
            int r3 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r3 < 0) goto L274
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 <= 0) goto L274
            long r10 = r10 - r14
            r3 = 1600(0x640, double:7.905E-321)
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 < 0) goto L274
            goto L275
        L274:
            r7 = r9
        L275:
            if (r2 != 0) goto L28d
            if (r7 == 0) goto L27a
            goto L28d
        L27a:
            fj r0 = p000.C0287fj.f3949
            java.util.concurrent.ScheduledExecutorService r0 = p000.C0287fj.f3963
            ν r2 = new ν
            r3 = 6
            r2.<init>(r3, r1)
            r3 = 500(0x1f4, double:2.47E-321)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r2, r3, r1)
            goto L398
        L28d:
            fj r3 = p000.C0287fj.f3949
        L28f:
            boolean r3 = r0.compareAndSet(r1, r8)
            if (r3 == 0) goto L392
            java.lang.Object r3 = r1.f3180     // Catch: java.lang.Throwable -> L2fc
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L2fc
            java.io.BufferedOutputStream r0 = r1.f3181     // Catch: java.lang.Throwable -> L29f
            if (r0 == 0) goto L29f
            r0.flush()     // Catch: java.lang.Throwable -> L29f
        L29f:
            java.io.BufferedOutputStream r0 = r1.f3181     // Catch: java.lang.Throwable -> L2a6
            if (r0 == 0) goto L2a6
            r0.close()     // Catch: java.lang.Throwable -> L2a6
        L2a6:
            r1.f3181 = r8     // Catch: java.lang.Throwable -> L337
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2fc
            java.lang.Object r3 = r1.f3180     // Catch: java.lang.Throwable -> L2fc
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L2fc
            long r10 = r1.f3182     // Catch: java.lang.Throwable -> L334
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2fc
            int r0 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r0 < 0) goto L30a
            java.io.File r0 = r1.f3177     // Catch: java.lang.Throwable -> L2fc
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L2bc
            goto L30a
        L2bc:
            ej r0 = r1.f3184     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L2c8
            ej r0 = new ej     // Catch: java.lang.Throwable -> L2fc
            r2 = 44100(0xac44, float:6.1797E-41)
            r0.<init>(r2, r6, r6)     // Catch: java.lang.Throwable -> L2fc
        L2c8:
            cj r2 = r1.f3176     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r3 = r2.f2158     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r2 = r2.f2154     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r4 = "wav"
            java.lang.String r2 = p000.C0287fj.m2120(r3, r2, r4)     // Catch: java.lang.Throwable -> L2fc
            android.content.Context r3 = r1.f3175     // Catch: java.lang.Throwable -> L2fc
            cj r4 = r1.f3176     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r6 = "audio/wav"
            wa r7 = new wa     // Catch: java.lang.Throwable -> L2fc
            r7.<init>(r1, r5, r0)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = p000.C0287fj.m2114(r3, r4, r2, r6, r7)     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L2fe
            android.content.Context r2 = r1.f3175     // Catch: java.lang.Throwable -> L2fc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2fc
            r3.<init>()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r4 = "评论语音已保存为 WAV: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2fc
            r3.append(r0)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L2fc
            p000.C0287fj.m2116(r2, r0)     // Catch: java.lang.Throwable -> L2fc
            goto L2fe
        L2fc:
            r0 = move-exception
            goto L33a
        L2fe:
            java.io.File r0 = r1.f3177     // Catch: java.lang.Throwable -> L303
        L300:
            r0.delete()     // Catch: java.lang.Throwable -> L303
        L303:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f3178
            r0.set(r9)
            goto L398
        L30a:
            java.io.File r0 = r1.f3177     // Catch: java.lang.Throwable -> L2fc
            r0.delete()     // Catch: java.lang.Throwable -> L2fc
            if (r2 == 0) goto L314
            java.lang.String r0 = "，已超时"
            goto L316
        L314:
            java.lang.String r0 = ""
        L316:
            android.content.Context r2 = r1.f3175     // Catch: java.lang.Throwable -> L2fc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2fc
            r3.<init>()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r4 = "未捕获到有效语音"
            r3.append(r4)     // Catch: java.lang.Throwable -> L2fc
            r3.append(r0)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = "，请重试"
            r3.append(r0)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L2fc
            p000.C0287fj.m2116(r2, r0)     // Catch: java.lang.Throwable -> L2fc
            java.io.File r0 = r1.f3177     // Catch: java.lang.Throwable -> L303
            goto L300
        L334:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2fc
            throw r0     // Catch: java.lang.Throwable -> L2fc
        L337:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2fc
            throw r0     // Catch: java.lang.Throwable -> L2fc
        L33a:
            cj r2 = r1.f3176     // Catch: java.lang.Throwable -> L36d
            java.lang.String r2 = r2.f2154     // Catch: java.lang.Throwable -> L36d
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L36d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36d
            r4.<init>()     // Catch: java.lang.Throwable -> L36d
            java.lang.String r5 = "PCM 保存 WAV 失败 vid="
            r4.append(r5)     // Catch: java.lang.Throwable -> L36d
            r4.append(r2)     // Catch: java.lang.Throwable -> L36d
            java.lang.String r2 = " err="
            r4.append(r2)     // Catch: java.lang.Throwable -> L36d
            r4.append(r3)     // Catch: java.lang.Throwable -> L36d
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L36d
            p000.C0287fj.m2138(r2)     // Catch: java.lang.Throwable -> L36d
            android.content.Context r2 = r1.f3175     // Catch: java.lang.Throwable -> L36d
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L36d
            if (r0 == 0) goto L36f
            r3 = 40
            java.lang.String r8 = p000.q02.m4693(r0, r3)     // Catch: java.lang.Throwable -> L36d
            goto L36f
        L36d:
            r0 = move-exception
            goto L387
        L36f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36d
            r0.<init>()     // Catch: java.lang.Throwable -> L36d
            java.lang.String r3 = "WAV 保存失败: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L36d
            r0.append(r8)     // Catch: java.lang.Throwable -> L36d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L36d
            p000.C0287fj.m2116(r2, r0)     // Catch: java.lang.Throwable -> L36d
            java.io.File r0 = r1.f3177     // Catch: java.lang.Throwable -> L303
            goto L300
        L387:
            java.io.File r2 = r1.f3177     // Catch: java.lang.Throwable -> L38c
            r2.delete()     // Catch: java.lang.Throwable -> L38c
        L38c:
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f3178
            r1.set(r9)
            throw r0
        L392:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L28f
        L398:
            return
        L399:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L39c:
            r16 = 0
            java.lang.Object r0 = r0.f13406
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            kh r1 = p000.C0469kh.f5917     // Catch: java.lang.Throwable -> L3e9
            ih r1 = p000.C0469kh.m3254()     // Catch: java.lang.Throwable -> L3e9
            if (r1 != 0) goto L3ab
            goto L3e6
        L3ab:
            long r2 = r1.f5082     // Catch: java.lang.Throwable -> L3e9
            long r4 = r1.f5083     // Catch: java.lang.Throwable -> L3e9
            int r1 = r0.getMax()     // Catch: java.lang.Throwable -> L3e9
            int r6 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r6 < 0) goto L3d4
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 <= 0) goto L3d4
            if (r1 > 0) goto L3be
            goto L3d4
        L3be:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3c3
            r2 = r4
        L3c3:
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L3e9
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L3e9
            double r2 = r2 / r4
            double r4 = (double) r1     // Catch: java.lang.Throwable -> L3e9
            double r2 = r2 * r4
            int r2 = p000.jx0.m3060(r2)     // Catch: java.lang.Throwable -> L3e9
            int r1 = p000.j81.m2906(r2, r9, r1)     // Catch: java.lang.Throwable -> L3e9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3e9
        L3d4:
            if (r8 == 0) goto L3e6
            int r1 = r8.intValue()     // Catch: java.lang.Throwable -> L3e9
            int r2 = r0.getProgress()     // Catch: java.lang.Throwable -> L3e9
            if (r2 == r1) goto L3e3
            r0.setProgress(r1)     // Catch: java.lang.Throwable -> L3e9
        L3e3:
            r0.invalidate()     // Catch: java.lang.Throwable -> L3e9
        L3e6:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3e9
            goto L3f0
        L3e9:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L3f0:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L401
            java.lang.String r1 = "r2a13f9ab3a7ddc68"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "rcf05132dbd725a9c"
            p000.AbstractC0602nx.m4143(r2, r0, r1)
        L401:
            return
        L402:
            java.lang.Object r0 = r0.f13406
            r1 = r0
            lh r1 = (p000.C0512lh) r1
            p000.AbstractC0871ug.f10767 = r8
            kh r0 = p000.C0469kh.f5917
            hh r0 = p000.C0469kh.f5923
            if (r0 != 0) goto L411
        L40f:
            r0 = r8
            goto L449
        L411:
            java.lang.ref.WeakReference r2 = r0.f4731
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L41a
            goto L40f
        L41a:
            java.lang.reflect.Method r0 = r0.f4732     // Catch: java.lang.Throwable -> L427
            java.lang.Object r0 = r0.invoke(r2, r8)     // Catch: java.lang.Throwable -> L427
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L427
            if (r2 == 0) goto L429
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L427
            goto L431
        L427:
            r0 = move-exception
            goto L42b
        L429:
            r0 = r8
            goto L431
        L42b:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L431:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 == 0) goto L442
            java.lang.String r3 = "rc90e47ff78acb49f"
            java.lang.String r2 = r2.getMessage()
            java.lang.String r4 = "r9a935a8fa433c578"
            p000.AbstractC0602nx.m4143(r4, r2, r3)
        L442:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L447
            r0 = r8
        L447:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L449:
            pq r2 = p000.C0696pq.f8651
            kq r2 = p000.C0696pq.m4567()
            if (r2 == 0) goto L45a
            mq r2 = r2.f6079
            long r2 = r2.f7247
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L45b
        L45a:
            r2 = r8
        L45b:
            rf r3 = p000.AbstractC0871ug.f10781
            r3.getClass()
            r1.getClass()
            java.lang.Object r4 = r3.f9359
            lh r4 = (p000.C0512lh) r4
            boolean r4 = p000.ln0.m3626(r4, r1)
            if (r4 != 0) goto L46e
            goto L483
        L46e:
            r3.f9359 = r8
            java.lang.Long r3 = r1.f6633
            if (r3 == 0) goto L47b
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L47b
            goto L483
        L47b:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = p000.ln0.m3626(r0, r3)
            r9 = r3 ^ 1
        L483:
            java.lang.String r3 = "rf9ef3362bd85f5b5"
            long r4 = r1.f6631
            java.lang.Long r6 = r1.f6633
            boolean r8 = r1.f6634
            java.lang.String r10 = r1.f6632
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "r80aa871f451526f5"
            r11.<init>(r12)
            r11.append(r9)
            r11.append(r0)
            r11.append(r4)
            r11.append(r6)
            r11.append(r2)
            r11.append(r8)
            r11.append(r10)
            java.lang.String r0 = r11.toString()
            p000.C0888ux.m5975(r3, r0)
            if (r9 == 0) goto L4c0
            java.lang.String r0 = r1.f6632
            java.lang.String r2 = "confirmed pause: "
            java.lang.String r0 = r2.concat(r0)
            boolean r1 = r1.f6634
            r2 = 4
            p000.C0834tg.m5657(r7, r0, r1, r2)
        L4c0:
            return
        L4c1:
            r7 r1 = p000.EnumC0751r7.f9280
            java.lang.Object r0 = r0.f13406
            r2 = r0
            p7 r2 = (p000.C0677p7) r2
            p7 r0 = p000.AbstractC0825t7.f10218
            if (r0 != r2) goto L551
            ν r0 = r2.f8444
            if (r0 != 0) goto L4d2
            goto L551
        L4d2:
            r2.f8444 = r8
            boolean r0 = p000.AbstractC0825t7.f10219
            if (r0 == 0) goto L551
            boolean r0 = p000.AbstractC0825t7.f10220
            if (r0 != 0) goto L551
            boolean r0 = r2.f8445
            if (r0 != 0) goto L551
            boolean r0 = r2.f8446
            if (r0 == 0) goto L4e6
            goto L551
        L4e6:
            pq r0 = p000.C0696pq.f8651
            mq r0 = p000.C0696pq.m4566()
            if (r0 == 0) goto L551
            long r3 = r0.f7247
            long r10 = r2.f8439
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 != 0) goto L551
            m7 r0 = r2.f8442
            if (r0 != 0) goto L4fb
            goto L551
        L4fb:
            java.lang.String r3 = "auto_scroll_next_enabled"
            boolean r3 = p000.ui1.m5887(r3, r9)
            if (r3 == 0) goto L551
            boolean r3 = p000.AbstractC0825t7.m5611(r0)
            if (r3 != 0) goto L50a
            goto L551
        L50a:
            q7 r3 = new q7
            long r4 = r2.f8439
            java.lang.String r8 = r2.f8440
            r3.<init>(r4, r8, r0)
            ny0 r0 = p000.AbstractC0825t7.f10217     // Catch: java.lang.Throwable -> L51e
            if (r0 == 0) goto L520
            java.lang.Object r0 = r0.invoke(r3)     // Catch: java.lang.Throwable -> L51e
            r7 r0 = (p000.EnumC0751r7) r0     // Catch: java.lang.Throwable -> L51e
            goto L528
        L51e:
            r0 = move-exception
            goto L522
        L520:
            r0 = r1
            goto L528
        L522:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L528:
            java.lang.Throwable r3 = p000.fo1.m2190(r0)
            if (r3 == 0) goto L535
            java.lang.String r4 = "rca2353f6f44ad78b"
            java.lang.String r5 = "非视频自动下滑回调失败"
            p000.C0888ux.m5977(r4, r5, r3)
        L535:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L53a
            goto L53b
        L53a:
            r1 = r0
        L53b:
            r7 r1 = (p000.EnumC0751r7) r1
            int r0 = r1.ordinal()
            if (r0 == 0) goto L54f
            if (r0 == r7) goto L54c
            if (r0 != r6) goto L548
            goto L54f
        L548:
            p000.C1080.m7272()
            goto L551
        L54c:
            r2.f8445 = r7
            goto L551
        L54f:
            r2.f8446 = r7
        L551:
            return
        L552:
            java.lang.Object r0 = r0.f13406
            z1 r0 = (p000.ViewOnAttachStateChangeListenerC1042z1) r0
            boolean r1 = r0.m7060()
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f12924
            if (r1 != 0) goto L560
            goto L5fb
        L560:
            java.lang.String r1 = "ContentCapture:changeChecker"
            android.os.Trace.beginSection(r1)
            r2.m393(r7)     // Catch: java.lang.Throwable -> L601
            n11 r1 = r0.f12934     // Catch: java.lang.Throwable -> L601
            int[] r3 = r1.f9963     // Catch: java.lang.Throwable -> L601
            long[] r1 = r1.f9962     // Catch: java.lang.Throwable -> L601
            int r5 = r1.length     // Catch: java.lang.Throwable -> L601
            int r5 = r5 - r6
            if (r5 < 0) goto L5d7
            r6 = r9
        L573:
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L601
            long r10 = ~r7     // Catch: java.lang.Throwable -> L601
            long r10 = r10 << r4
            long r10 = r10 & r7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5d1
            int r10 = r6 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L601
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r9
        L58c:
            if (r12 >= r10) goto L5cb
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5c2
            int r13 = r6 << 3
            int r13 = r13 + r12
            r15 = r3[r13]     // Catch: java.lang.Throwable -> L601
            sm0 r13 = r0.m7059()     // Catch: java.lang.Throwable -> L601
            boolean r13 = r13.m5524(r15)     // Catch: java.lang.Throwable -> L601
            if (r13 != 0) goto L5c2
            java.util.ArrayList r13 = r0.f12927     // Catch: java.lang.Throwable -> L601
            bp r14 = new bp     // Catch: java.lang.Throwable -> L601
            r20 = r5
            long r4 = r0.f12933     // Catch: java.lang.Throwable -> L601
            cp r18 = p000.EnumC0183cp.f2701     // Catch: java.lang.Throwable -> L601
            r19 = 0
            r16 = r4
            r14.<init>(r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L601
            r13.add(r14)     // Catch: java.lang.Throwable -> L601
            wc r4 = r0.f12931     // Catch: java.lang.Throwable -> L601
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L601
            r4.mo3385(r5)     // Catch: java.lang.Throwable -> L601
            goto L5c4
        L5c2:
            r20 = r5
        L5c4:
            long r7 = r7 >> r11
            int r12 = r12 + 1
            r4 = 7
            r5 = r20
            goto L58c
        L5cb:
            r20 = r5
            if (r10 != r11) goto L5d7
            r5 = r20
        L5d1:
            if (r6 == r5) goto L5d7
            int r6 = r6 + 1
            r4 = 7
            goto L573
        L5d7:
            java.lang.String r1 = "ContentCapture:sendAppearEvents"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L601
            es1 r1 = r2.getSemanticsOwner()     // Catch: java.lang.Throwable -> L5fc
            bs1 r1 = r1.m1953()     // Catch: java.lang.Throwable -> L5fc
            cs1 r2 = r0.f12935     // Catch: java.lang.Throwable -> L5fc
            r0.m7062(r1, r2)     // Catch: java.lang.Throwable -> L5fc
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L601
            sm0 r1 = r0.m7059()     // Catch: java.lang.Throwable -> L601
            r0.m7057(r1)     // Catch: java.lang.Throwable -> L601
            r0.m7065()     // Catch: java.lang.Throwable -> L601
            r0.f12936 = r9     // Catch: java.lang.Throwable -> L601
            android.os.Trace.endSection()
        L5fb:
            return
        L5fc:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L601
            throw r0     // Catch: java.lang.Throwable -> L601
        L601:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L606:
            java.lang.Object r0 = r0.f13406
            l1 r0 = (p000.ViewOnAttachStateChangeListenerC0496l1) r0
            java.lang.String r1 = "measureAndLayout"
            android.os.Trace.beginSection(r1)
            androidx.compose.ui.platform.AndroidComposeView r1 = r0.f6358     // Catch: java.lang.Throwable -> L62a
            r1.m393(r7)     // Catch: java.lang.Throwable -> L62a
            android.os.Trace.endSection()
            java.lang.String r1 = "checkForSemanticsChanges"
            android.os.Trace.beginSection(r1)
            r0.m3452()     // Catch: java.lang.Throwable -> L625
            android.os.Trace.endSection()
            r0.f6353 = r9
            return
        L625:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L62a:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L62f:
            java.lang.Object r0 = r0.f13406
            androidx.compose.ui.platform.AbstractComposeView r0 = (androidx.compose.p001ui.platform.AbstractComposeView) r0
            int r1 = androidx.compose.p001ui.platform.AbstractComposeView.f862
            r0.m356()
            return
    }
}
