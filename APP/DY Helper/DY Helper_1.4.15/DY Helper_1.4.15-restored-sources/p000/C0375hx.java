package p000;

/* JADX INFO: renamed from: hx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0375hx extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4832;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.z81 f4833;

    public /* synthetic */ C0375hx(p000.z81 r1, int r2) {
            r0 = this;
            r0.f4832 = r2
            r0.f4833 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r13) {
            r12 = this;
            int r0 = r12.f4832
            r1 = 1
            r2 = 0
            r3 = 0
            r13.getClass()
            switch(r0) {
                case 0: goto L120;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r13 = r13.f5691
            boolean r0 = r13 instanceof android.app.Activity
            if (r0 == 0) goto L14
            android.app.Activity r13 = (android.app.Activity) r13
            goto L15
        L14:
            r13 = r3
        L15:
            if (r13 != 0) goto L19
            goto L11f
        L19:
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9581
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r13)
            r0.set(r4)
            android.content.Context r0 = r13.getApplicationContext()
            p000.ry1.f9623 = r0
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L39
            android.content.Context r0 = r13.getApplicationContext()
            r0.getClass()
            p000.ui1.m5896(r0)
        L39:
            java.lang.ClassLoader r0 = p000.ry1.f9622
            if (r0 != 0) goto L41
            z81 r12 = r12.f4833
            java.lang.ClassLoader r0 = r12.f13011
        L41:
            ry1 r12 = p000.ry1.f9602
            boolean r12 = p000.ry1.m5271()
            if (r12 == 0) goto L6f
            android.os.Handler r12 = p000.C0661os.f8210     // Catch: java.lang.Throwable -> L4e
            p000.C0661os.m4263(r13)     // Catch: java.lang.Throwable -> L4e
        L4e:
            ry1 r12 = p000.ry1.f9602
            r12.m5297(r0, r2)
            int r12 = p000.C0410ix.f5220     // Catch: java.lang.Throwable -> L5b
            p000.C0410ix.m2822(r13, r0)     // Catch: java.lang.Throwable -> L5b
            s62 r12 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5b
            goto L62
        L5b:
            r12 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r12)
            r12 = r0
        L62:
            java.lang.Throwable r12 = p000.fo1.m2190(r12)
            if (r12 == 0) goto L6f
            ry1 r0 = p000.ry1.f9602
            java.lang.String r0 = "DexKit 首扫请求失败"
            p000.ry1.m5275(r0, r12)
        L6f:
            ry1 r12 = p000.ry1.f9602
            jy1 r12 = p000.ry1.m5235()
            boolean r12 = r12.f5668
            if (r12 == 0) goto Lc7
            boolean r12 = p000.ui1.m5867()
            if (r12 != 0) goto L80
            goto Lc7
        L80:
            long r4 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r12 = p000.ry1.f9632
            long r6 = r12.get()
            long r8 = r4 - r6
            r10 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto La3
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9633
            java.lang.Object r0 = r0.get()
            java.lang.String r8 = p000.ry1.m5252()
            boolean r0 = p000.ln0.m3626(r0, r8)
            if (r0 == 0) goto La3
            goto Lc7
        La3:
            boolean r12 = r12.compareAndSet(r6, r4)
            if (r12 != 0) goto Laa
            goto Lc7
        Laa:
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.ry1.f9631
            boolean r12 = r12.compareAndSet(r2, r1)
            if (r12 != 0) goto Lb3
            goto Lc7
        Lb3:
            java.lang.Thread r12 = new java.lang.Thread
            fb0 r0 = new fb0
            r4 = 20
            r0.<init>(r4)
            java.lang.String r4 = "SparkAutoRenew-Check"
            r12.<init>(r0, r4)
            r12.setDaemon(r1)
            r12.start()
        Lc7:
            p000.pg1.m4533(r13)
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.se1.f9875
            p000.se1.m5489(r13)
            p000.xa1.m6552(r13)
            java.util.concurrent.atomic.AtomicReference r12 = p000.dd1.f3093
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r13)
            r12.set(r0)
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.dd1.f3097
            boolean r12 = r12.get()
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.atomic.AtomicLong r13 = p000.dd1.f3098
            long r4 = r13.get()
            if (r12 != 0) goto L117
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 >= 0) goto Lf3
            goto L117
        Lf3:
            java.util.concurrent.atomic.AtomicInteger r12 = p000.dd1.f3096
            r12.set(r2)
            boolean r12 = p000.dd1.m1714()
            if (r12 == 0) goto L11f
            java.lang.String r12 = "pet_elf_camp_start_delay_seconds"
            r13 = 5
            android.content.SharedPreferences r0 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L109
            int r13 = r0.getInt(r12, r13)     // Catch: java.lang.Throwable -> L109
        L109:
            r12 = 300(0x12c, float:4.2E-43)
            int r12 = p000.j81.m2906(r13, r2, r12)
            long r12 = (long) r12
            r0 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r0
            p000.dd1.m1718(r12)
            goto L11f
        L117:
            java.lang.String r12 = "忽略操作菜单引起的 Activity 恢复，不重新触发营地自动任务"
            r13 = 4
            java.lang.String r0 = "r8b18805b9e3774c8"
            p000.C0888ux.m5992(r0, r12, r3, r13, r3)
        L11f:
            return
        L120:
            java.lang.Object r13 = r13.f5691
            boolean r0 = r13 instanceof android.app.Activity
            if (r0 == 0) goto L129
            r3 = r13
            android.app.Activity r3 = (android.app.Activity) r3
        L129:
            if (r3 != 0) goto L12c
            goto L142
        L12c:
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.C0410ix.f5230
            boolean r13 = r13.compareAndSet(r2, r1)
            if (r13 != 0) goto L135
            goto L142
        L135:
            int r13 = p000.C0410ix.f5220
            java.lang.ClassLoader r13 = p000.C0410ix.f5233
            if (r13 != 0) goto L13f
            z81 r12 = r12.f4833
            java.lang.ClassLoader r13 = r12.f13011
        L13f:
            p000.C0410ix.m2822(r3, r13)
        L142:
            return
    }
}
