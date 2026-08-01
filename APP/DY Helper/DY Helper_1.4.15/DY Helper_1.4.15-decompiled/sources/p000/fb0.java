package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fb0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3860;

    public /* synthetic */ fb0(int r1) {
            r0 = this;
            r0.f3860 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ fb0(p000.C1009y5 r1, int r2) {
            r0 = this;
            r1 = 18
            r0.f3860 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m2090() {
            r20 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.pg1.f8551
            java.lang.String r2 = "r86c859e3375e752"
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.pg1.f8555
            r4 = 0
            java.lang.String r0 = "spark_auto_renew_delay_seconds"
            r5 = 15
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L13
            int r5 = r6.getInt(r0, r5)     // Catch: java.lang.Throwable -> L13
        L13:
            r0 = 5
            r6 = 300(0x12c, float:4.2E-43)
            int r0 = p000.j81.m2906(r5, r0, r6)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            boolean r0 = p000.pg1.m4529()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r0 == 0) goto L194
            boolean r0 = p000.AbstractC0976x9.m6529()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r0 != 0) goto L2f
            goto L194
        L2f:
            kt0 r0 = new kt0     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r5 = 17
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r5 = 60
            boolean r0 = p000.pg1.m4540(r5, r0)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r5 = 4
            r6 = 0
            if (r0 != 0) goto L4c
            java.lang.String r0 = "每日火星任务等待会话超时，保留重试机会"
            p000.C0888ux.m5988(r2, r0, r6, r5, r6)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r3.set(r4)
            return
        L49:
            r0 = move-exception
            goto L198
        L4c:
            java.lang.String r0 = "pet_elf_auto_mutual_message_enabled"
            r9 = 1
            boolean r12 = p000.ui1.m5887(r0, r9)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.String r0 = "pet_elf_auto_image_enabled"
            boolean r13 = p000.ui1.m5887(r0, r4)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.util.concurrent.ConcurrentHashMap r0 = p000.ry1.f9620     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.util.Map r0 = p000.ex0.m1975(r0)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            boolean r10 = r0 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r10 == 0) goto L73
            r10 = r0
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r10 == 0) goto L73
            goto Lc7
        L73:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
        L77:
            boolean r10 = r0.hasNext()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r10 == 0) goto Lc7
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            ky1 r10 = (p000.ky1) r10     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            int r11 = r10.f6325     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r11 != r9) goto L77
            ry1 r11 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            iy1 r10 = p000.ry1.m5203(r10, r12, r13, r6)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            boolean r10 = r10.f5247     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r10 == 0) goto L77
            r0 = r4
        L92:
            r10 = 30
            if (r0 >= r10) goto Lb6
            ry1 r10 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            boolean r10 = p000.ry1.m5270()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r10 == 0) goto La0
            r0 = r9
            goto Lbc
        La0:
            java.lang.Thread.sleep(r7)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            boolean r10 = r10.isInterrupted()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r10 != 0) goto Lb0
            int r0 = r0 + 1
            goto L92
        Lb0:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r0.<init>()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            throw r0     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
        Lb6:
            ry1 r0 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            boolean r0 = p000.ry1.m5270()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
        Lbc:
            if (r0 != 0) goto Lc7
            java.lang.String r0 = "每日火星任务等待文本发送核心超时，保留重试机会"
            p000.C0888ux.m5988(r2, r0, r6, r5, r6)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r3.set(r4)
            return
        Lc7:
            java.util.concurrent.atomic.AtomicReference r0 = p000.pg1.f8557     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r0 == 0) goto L190
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r0 == 0) goto L190
            boolean r7 = r0.isFinishing()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r7 != 0) goto Le5
            boolean r7 = r0.isDestroyed()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r7 == 0) goto Le6
        Le5:
            r0 = r6
        Le6:
            if (r0 == 0) goto L190
            kt0 r7 = new kt0     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r8 = 18
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r8 = 90
            boolean r7 = p000.pg1.m4540(r8, r7)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r7 != 0) goto L100
            java.lang.String r0 = "每日火星任务等待启动领取完成超时，保留重试机会"
            p000.C0888ux.m5988(r2, r0, r6, r5, r6)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r3.set(r4)
            return
        L100:
            boolean r7 = r1.compareAndSet(r4, r9)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r7 != 0) goto L10a
            r3.set(r4)
            return
        L10a:
            java.lang.String r7 = "pet_elf_task_image_uri"
            java.lang.String r8 = ""
            java.lang.String r7 = p000.ui1.m5893(r7, r8)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            boolean r8 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r8 != 0) goto L119
            goto L11a
        L119:
            r7 = r6
        L11a:
            if (r7 == 0) goto L123
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r16 = r7
            goto L125
        L123:
            r16 = r6
        L125:
            lg1 r10 = new lg1     // Catch: java.lang.Throwable -> L18b
            kg1 r11 = p000.kg1.f5914     // Catch: java.lang.Throwable -> L18b
            r18 = 0
            r19 = 208(0xd0, float:2.91E-43)
            r14 = 1
            r15 = 0
            r17 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L18b
            mg1 r7 = p000.pg1.m4527(r0, r10)     // Catch: java.lang.Throwable -> L18b
            int r8 = r7.f7128     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r1.set(r4)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            int r1 = r7.f7125     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.String r9 = r7.f7129     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            p000.pg1.m4535(r0, r9, r1)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            int r0 = r7.f7122     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            if (r0 <= 0) goto L16c
            if (r8 != 0) goto L16c
            java.lang.String r0 = "pet_elf_auto_last_run_date"
            java.lang.String r1 = p000.pg1.m4538()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            p000.ui1.m5875(r0, r1)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.String r0 = p000.pg1.m4538()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r1.<init>()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.String r7 = "已记录每日火星任务日期="
            r1.append(r7)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r1.append(r0)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            p000.C0888ux.m5988(r2, r0, r6, r5, r6)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            goto L187
        L16c:
            if (r0 <= 0) goto L187
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r0.<init>()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.String r1 = "每日火星任务存在可重试失败 count="
            r0.append(r1)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            r0.append(r8)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.String r1 = "，保留后续 Activity 恢复重试机会"
            r0.append(r1)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            p000.C0888ux.m5988(r2, r0, r6, r5, r6)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
        L187:
            r3.set(r4)
            return
        L18b:
            r0 = move-exception
            r1.set(r4)     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
            throw r0     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L1a3
        L190:
            r3.set(r4)
            return
        L194:
            r3.set(r4)
            return
        L198:
            java.lang.String r1 = "每日火星任务调度异常"
            p000.C0888ux.m5977(r2, r1, r0)     // Catch: java.lang.Throwable -> L1a1
        L19d:
            r3.set(r4)
            goto L1ab
        L1a1:
            r0 = move-exception
            goto L1ac
        L1a3:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1a1
            r0.interrupt()     // Catch: java.lang.Throwable -> L1a1
            goto L19d
        L1ab:
            return
        L1ac:
            r3.set(r4)
            throw r0
    }

    /* JADX INFO: renamed from: β */
    private final void m2091() {
            r20 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.pg1.f8551
            java.lang.String r2 = "r86c859e3375e752"
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.pg1.f8553
            java.lang.String r0 = "本次抖音进程启动领取检查完成: 会话="
            r4 = 5000(0x1388, double:2.4703E-320)
            r6 = 0
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            boolean r4 = p000.pg1.m4530()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r4 == 0) goto Lf5
            boolean r4 = p000.AbstractC0976x9.m6529()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r4 != 0) goto L1c
            goto Lf5
        L1c:
            kt0 r4 = new kt0     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r5 = 19
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r5 = 60
            boolean r4 = p000.pg1.m4540(r5, r4)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r5 = 4
            r7 = 0
            if (r4 != 0) goto L39
            java.lang.String r0 = "启动火星领取等待会话超时，保留本进程重试机会"
            p000.C0888ux.m5988(r2, r0, r7, r5, r7)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r3.set(r6)
            return
        L36:
            r0 = move-exception
            goto Lf9
        L39:
            java.util.concurrent.atomic.AtomicReference r4 = p000.pg1.f8557     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r4 == 0) goto Lf1
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r4 == 0) goto Lf1
            boolean r8 = r4.isFinishing()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r8 != 0) goto L57
            boolean r8 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r8 == 0) goto L58
        L57:
            r4 = r7
        L58:
            if (r4 == 0) goto Lf1
            kt0 r8 = new kt0     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r9 = 20
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r9 = 90
            boolean r8 = p000.pg1.m4540(r9, r8)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r8 != 0) goto L72
            java.lang.String r0 = "启动火星领取等待执行锁超时，保留本进程重试机会"
            p000.C0888ux.m5988(r2, r0, r7, r5, r7)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r3.set(r6)
            return
        L72:
            r8 = 1
            boolean r9 = r1.compareAndSet(r6, r8)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r9 != 0) goto L7d
            r3.set(r6)
            return
        L7d:
            lg1 r10 = new lg1     // Catch: java.lang.Throwable -> Lec
            kg1 r11 = p000.kg1.f5912     // Catch: java.lang.Throwable -> Lec
            java.lang.String r9 = "pet_elf_launch_claim_notice_date"
            java.lang.String r12 = "spark_show_top_notification"
            boolean r12 = p000.ui1.m5887(r12, r8)     // Catch: java.lang.Throwable -> Lec
            if (r12 != 0) goto L8d
        L8b:
            r15 = r6
            goto La2
        L8d:
            java.lang.String r12 = p000.pg1.m4538()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r13 = ""
            java.lang.String r13 = p000.ui1.m5893(r9, r13)     // Catch: java.lang.Throwable -> Lec
            boolean r13 = r13.equals(r12)     // Catch: java.lang.Throwable -> Lec
            if (r13 == 0) goto L9e
            goto L8b
        L9e:
            p000.ui1.m5875(r9, r12)     // Catch: java.lang.Throwable -> Lec
            r15 = r8
        La2:
            r18 = 0
            r19 = 224(0xe0, float:3.14E-43)
            r12 = 0
            r13 = 0
            r14 = 1
            r16 = 0
            r17 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Lec
            mg1 r9 = p000.pg1.m4527(r4, r10)     // Catch: java.lang.Throwable -> Lec
            int r10 = r9.f7122     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            int r11 = r9.f7125     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r1.set(r6)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            java.lang.String r1 = r9.f7129     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            p000.pg1.m4535(r4, r1, r11)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            if (r10 <= 0) goto Le8
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.pg1.f8552     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r1.set(r8)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            int r1 = r9.f7127     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r4.append(r10)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            java.lang.String r0 = " 领取="
            r4.append(r0)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r4.append(r11)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            java.lang.String r0 = " 失败="
            r4.append(r0)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            r4.append(r1)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            p000.C0888ux.m5988(r2, r0, r7, r5, r7)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
        Le8:
            r3.set(r6)
            return
        Lec:
            r0 = move-exception
            r1.set(r6)     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
            throw r0     // Catch: java.lang.Throwable -> L36 java.lang.InterruptedException -> L104
        Lf1:
            r3.set(r6)
            return
        Lf5:
            r3.set(r6)
            return
        Lf9:
            java.lang.String r1 = "启动火星领取调度异常"
            p000.C0888ux.m5977(r2, r1, r0)     // Catch: java.lang.Throwable -> L102
        Lfe:
            r3.set(r6)
            goto L10c
        L102:
            r0 = move-exception
            goto L10d
        L104:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L102
            r0.interrupt()     // Catch: java.lang.Throwable -> L102
            goto Lfe
        L10c:
            return
        L10d:
            r3.set(r6)
            throw r0
    }

    /* JADX INFO: renamed from: γ */
    private final void m2092() {
            r5 = this;
            java.util.Map r5 = p000.cn1.f2215
            r5.getClass()
            monitor-enter(r5)
            java.util.Set r0 = r5.entrySet()     // Catch: java.lang.Throwable -> L38
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)     // Catch: java.lang.Throwable -> L38
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L38
        L1b:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L38
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L38
            l91 r4 = new l91     // Catch: java.lang.Throwable -> L38
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L38
            r1.add(r4)     // Catch: java.lang.Throwable -> L38
            goto L1b
        L38:
            r0 = move-exception
            goto L7f
        L3a:
            monitor-exit(r5)
            java.util.Iterator r5 = r1.iterator()
        L3f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r5.next()
            l91 r0 = (p000.l91) r0
            java.lang.Object r1 = r0.f6502
            java.lang.Object r0 = r0.f6503
            bn1 r0 = (p000.bn1) r0
            ee0 r2 = r0.f1788     // Catch: java.lang.Throwable -> L65
            java.lang.reflect.Method r2 = r2.f3518     // Catch: java.lang.Throwable -> L65
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            java.util.ArrayList r0 = r0.f1789     // Catch: java.lang.Throwable -> L65
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch: java.lang.Throwable -> L65
            goto L6c
        L65:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L6c:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L3f
            java.lang.String r1 = "reae2c2e0c445b34d"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "relation refresh failed: "
            p000.AbstractC0602nx.m4143(r2, r0, r1)
            goto L3f
        L7e:
            return
        L7f:
            monitor-exit(r5)
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    private final void m2093() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ε */
    private final void m2094() {
            r3 = this;
            ry1 r3 = p000.ry1.f9602
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.ry1.f9631
            r0 = 0
            p000.ry1.m5278()     // Catch: java.lang.Throwable -> Lc
            r3.set(r0)
            return
        Lc:
            r1 = move-exception
            java.lang.String r2 = "自动续火检查异常"
            p000.ry1.m5275(r2, r1)     // Catch: java.lang.Throwable -> L16
            r3.set(r0)
            return
        L16:
            r1 = move-exception
            r3.set(r0)
            throw r1
    }

    @Override // java.lang.Runnable
    public final void run() {
            r21 = this;
            r0 = r21
            int r1 = r0.f3860
            r2 = 8
            r3 = 90
            r4 = 60
            r5 = 12000(0x2ee0, double:5.929E-320)
            r7 = 2
            r8 = 10
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            switch(r1) {
                case 0: goto L6d6;
                case 1: goto L6b5;
                case 2: goto L68b;
                case 3: goto L67e;
                case 4: goto L667;
                case 5: goto L661;
                case 6: goto L65b;
                case 7: goto L655;
                case 8: goto L5d6;
                case 9: goto L581;
                case 10: goto L564;
                case 11: goto L3cd;
                case 12: goto L2bb;
                case 13: goto L17d;
                case 14: goto L61;
                case 15: goto L5d;
                case 16: goto L59;
                case 17: goto L55;
                case 18: goto L54;
                case 19: goto L4d;
                case 20: goto L49;
                case 21: goto L43;
                case 22: goto L3f;
                default: goto L16;
            }
        L16:
            l82 r0 = p000.l82.f6483
            long r0 = p000.l82.f6491
            java.util.concurrent.atomic.AtomicLong r2 = p000.l82.f6489
            long r2 = r2.get()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3e
            java.lang.Float r0 = p000.l82.m3537()
            if (r0 == 0) goto L3e
            float r1 = r0.floatValue()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L35
            r11 = r0
        L35:
            if (r11 == 0) goto L3e
            float r0 = r11.floatValue()
            p000.l82.m3534(r0)
        L3e:
            return
        L3f:
            p000.u72.m5792(r12)
            return
        L43:
            o22 r0 = p000.o22.f7889
            p000.o22.m4160()
            return
        L49:
            r0.m2094()
            return
        L4d:
            android.app.AlertDialog r0 = p000.bv1.f1854
            if (r0 == 0) goto L54
            r0.dismiss()
        L54:
            return
        L55:
            r0.m2092()
            return
        L59:
            r0.m2091()
            return
        L5d:
            r0.m2090()
            return
        L61:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.se1.f9875
            java.lang.String r7 = "rb4e434d444870f0e"
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.se1.f9876
            java.lang.String r0 = "本次抖音进程亲密度领取检查完成: 会话="
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.se1.f9875     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            boolean r5 = p000.se1.m5488()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r5 != 0) goto L79
        L74:
            r8.set(r12)
            goto L178
        L79:
            kt0 r5 = new kt0     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r6 = 12
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            boolean r4 = p000.se1.m5492(r4, r5)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r4 != 0) goto L8f
            java.lang.String r0 = "启动亲密度领取等待会话超时，保留本进程重试机会"
            p000.C0888ux.m5988(r7, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            goto L74
        L8c:
            r0 = move-exception
            goto L166
        L8f:
            java.util.concurrent.atomic.AtomicReference r4 = p000.se1.f9878     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r4 == 0) goto L74
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r4 == 0) goto L74
            boolean r5 = r4.isFinishing()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r5 != 0) goto Lad
            boolean r5 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r5 == 0) goto Lae
        Lad:
            r4 = r11
        Lae:
            if (r4 == 0) goto L74
            kt0 r5 = new kt0     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r6 = 13
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            boolean r3 = p000.se1.m5492(r3, r5)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r3 != 0) goto Lc3
            java.lang.String r0 = "启动亲密度领取等待执行锁超时，保留本进程重试机会"
            p000.C0888ux.m5988(r7, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            goto L74
        Lc3:
            java.lang.String r3 = p000.se1.m5486()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r5 <= 0) goto Lce
            goto Lcf
        Lce:
            r3 = r11
        Lcf:
            if (r3 != 0) goto Ld2
            goto L74
        Ld2:
            boolean r5 = r1.compareAndSet(r12, r10)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r5 != 0) goto Ld9
            goto L74
        Ld9:
            java.util.concurrent.atomic.AtomicReference r5 = p000.ry1.f9578     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r5 == 0) goto Lec
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r5 == 0) goto Lec
            goto Lf4
        Lec:
            java.lang.Class r5 = r4.getClass()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
        Lf4:
            r5.getClass()     // Catch: java.lang.Throwable -> L161
            qe1 r5 = p000.se1.m5487(r5, r10, r3, r11)     // Catch: java.lang.Throwable -> L161
            int r6 = r5.f8987     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            int r13 = r5.f8984     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            int r14 = r5.f8985     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r1.set(r12)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.String r1 = r5.f8989     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r14 < r10) goto L119
            java.lang.String r15 = "pet_elf_auto_success_toast_enabled"
            boolean r10 = p000.ui1.m5887(r15, r10)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r10 != 0) goto L111
            goto L119
        L111:
            xx0 r10 = new xx0     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r10.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r4.runOnUiThread(r10)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
        L119:
            java.lang.String r1 = p000.se1.m5486()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            boolean r1 = p000.ln0.m3626(r1, r3)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            if (r1 == 0) goto L74
            int r1 = r13 + r6
            if (r1 <= 0) goto L74
            java.util.concurrent.atomic.AtomicReference r1 = p000.se1.f9877     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r1.set(r3)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            int r1 = r5.f8986     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            int r2 = r5.f8988     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r3.append(r13)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.String r0 = " 领取="
            r3.append(r0)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r3.append(r14)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.String r0 = " 幂等="
            r3.append(r0)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r3.append(r1)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.String r0 = " 跳过="
            r3.append(r0)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r3.append(r6)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.String r0 = " 失败="
            r3.append(r0)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            r3.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            p000.C0888ux.m5988(r7, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            goto L74
        L161:
            r0 = move-exception
            r1.set(r12)     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
            throw r0     // Catch: java.lang.Throwable -> L8c java.lang.InterruptedException -> L16f
        L166:
            java.lang.String r1 = "启动亲密度领取调度异常"
            p000.C0888ux.m5977(r7, r1, r0)     // Catch: java.lang.Throwable -> L16d
            goto L74
        L16d:
            r0 = move-exception
            goto L179
        L16f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L16d
            r0.interrupt()     // Catch: java.lang.Throwable -> L16d
            goto L74
        L178:
            return
        L179:
            r8.set(r12)
            throw r0
        L17d:
            java.lang.String r0 = "自动营地等待私信会话目录就绪 retry="
            java.lang.Object r1 = p000.dd1.f3095
            monitor-enter(r1)
            p000.dd1.f3099 = r11     // Catch: java.lang.Throwable -> L2b8
            r3 = 0
            p000.dd1.f3100 = r3     // Catch: java.lang.Throwable -> L2b8
            monitor-exit(r1)
            boolean r1 = p000.dd1.m1714()
            if (r1 != 0) goto L191
            goto L2a6
        L191:
            r3 = 3000(0xbb8, double:1.482E-320)
            android.app.Activity r1 = p000.dd1.m1713()     // Catch: java.lang.Throwable -> L1d6
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.jc1.f5424     // Catch: java.lang.Throwable -> L1d6
            java.util.List r5 = p000.jc1.m2939()     // Catch: java.lang.Throwable -> L1d6
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L1d6
            if (r5 == 0) goto L1da
            java.util.concurrent.atomic.AtomicInteger r1 = p000.dd1.f3096     // Catch: java.lang.Throwable -> L1d6
            int r1 = r1.incrementAndGet()     // Catch: java.lang.Throwable -> L1d6
            r2 = 20
            if (r1 > r2) goto L1af
            r2 = r10
            goto L1b0
        L1af:
            r2 = r12
        L1b0:
            if (r2 == 0) goto L1cc
            java.lang.String r5 = "r8b18805b9e3774c8"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c9
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L1c9
            r6.append(r1)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r0 = "/20"
            r6.append(r0)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L1c9
            p000.C0888ux.m5992(r5, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L1c9
            goto L1d3
        L1c9:
            r0 = move-exception
            goto L255
        L1cc:
            java.lang.String r0 = "r8b18805b9e3774c8"
            java.lang.String r1 = "自动营地等待会话超时，等待新会话事件唤醒"
            p000.C0888ux.m5992(r0, r1, r11, r9, r11)     // Catch: java.lang.Throwable -> L1c9
        L1d3:
            r10 = r2
            goto L243
        L1d6:
            r0 = move-exception
            r2 = r12
            goto L255
        L1da:
            a r0 = p000.jc1.f5426     // Catch: java.lang.Throwable -> L1d6
            java.lang.Object r0 = r0.f1     // Catch: java.lang.Throwable -> L1d6
            ｚ r0 = (p000.C1156) r0     // Catch: java.lang.Throwable -> L1d6
            boolean r0 = r0.f13525     // Catch: java.lang.Throwable -> L1d6
            if (r0 != 0) goto L237
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5424     // Catch: java.lang.Throwable -> L1d6
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L1d6
            if (r0 == 0) goto L1ed
            goto L237
        L1ed:
            java.util.concurrent.atomic.AtomicInteger r0 = p000.dd1.f3096     // Catch: java.lang.Throwable -> L1d6
            r0.set(r12)     // Catch: java.lang.Throwable -> L1d6
            java.lang.ClassLoader r13 = p000.dd1.m1717(r1)     // Catch: java.lang.Throwable -> L1d6
            cc1 r0 = p000.jc1.m2931()     // Catch: java.lang.Throwable -> L1d6
            java.util.LinkedHashSet r5 = r0.f2063     // Catch: java.lang.Throwable -> L1d6
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L1d6
            if (r5 == 0) goto L20a
            java.lang.String r0 = "r8b18805b9e3774c8"
            java.lang.String r1 = "自动营地没有到期会话或可立即执行的缓存地块"
            p000.C0888ux.m5992(r0, r1, r11, r9, r11)     // Catch: java.lang.Throwable -> L1d6
            goto L235
        L20a:
            java.util.LinkedHashSet r5 = r0.f2063     // Catch: java.lang.Throwable -> L1d6
            dc1 r2 = p000.jc1.m2943(r13, r12, r5, r11, r2)     // Catch: java.lang.Throwable -> L1d6
            java.util.LinkedHashSet r5 = r0.f2063     // Catch: java.lang.Throwable -> L1d6
            java.util.LinkedHashMap r6 = r0.f2064     // Catch: java.lang.Throwable -> L1d6
            java.util.LinkedHashMap r0 = r0.f2065     // Catch: java.lang.Throwable -> L1d6
            r19 = 0
            r20 = 64
            r14 = 0
            r15 = 1
            r18 = r0
            r16 = r5
            r17 = r6
            dc1 r0 = p000.jc1.m2934(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L1d6
            boolean r5 = r0.f3084     // Catch: java.lang.Throwable -> L1d6
            if (r5 == 0) goto L22b
            goto L243
        L22b:
            boolean r5 = r0.f3083     // Catch: java.lang.Throwable -> L1d6
            if (r5 != 0) goto L235
            p000.dd1.m1720(r1, r2, r0)     // Catch: java.lang.Throwable -> L1d6
            p000.pg1.m4534(r1)     // Catch: java.lang.Throwable -> L1d6
        L235:
            r10 = r12
            goto L243
        L237:
            java.util.concurrent.atomic.AtomicInteger r0 = p000.dd1.f3096     // Catch: java.lang.Throwable -> L1d6
            r0.set(r12)     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r0 = "r8b18805b9e3774c8"
            java.lang.String r1 = "自动营地检测到已有写批次，稍后重试"
            p000.C0888ux.m5992(r0, r1, r11, r9, r11)     // Catch: java.lang.Throwable -> L253
        L243:
            boolean r0 = p000.dd1.m1714()
            if (r0 == 0) goto L2a6
            if (r10 == 0) goto L24f
        L24b:
            p000.dd1.m1718(r3)
            goto L2a6
        L24f:
            p000.dd1.m1719()
            goto L2a6
        L253:
            r0 = move-exception
            r2 = r10
        L255:
            android.app.Activity r1 = p000.dd1.m1713()     // Catch: java.lang.Throwable -> L2a7
            boolean r5 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L2a7
            if (r5 == 0) goto L268
            java.lang.String r5 = "pet_elf_camp_show_top_notification"
            boolean r5 = p000.ui1.m5887(r5, r10)     // Catch: java.lang.Throwable -> L2a7
            if (r5 == 0) goto L268
            goto L269
        L268:
            r10 = r12
        L269:
            if (r10 == 0) goto L296
            if (r1 != 0) goto L26e
            goto L296
        L26e:
            be1 r5 = p000.be1.f1681     // Catch: java.lang.Throwable -> L2a7
            java.util.List r5 = p000.AbstractC1021yh.m6896(r5)     // Catch: java.lang.Throwable -> L2a7
            java.util.Set r5 = p000.xn0.m6705(r5)     // Catch: java.lang.Throwable -> L2a7
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L2a7
            if (r5 == 0) goto L27f
            goto L296
        L27f:
            android.os.Handler r5 = com.example.dyhelper.p002ui.C0182.f2694     // Catch: java.lang.Throwable -> L2a7
            java.lang.String r5 = "camp:auto"
            java.lang.String r6 = "营地后台任务失败"
            java.lang.Class r7 = r0.getClass()     // Catch: java.lang.Throwable -> L2a7
            java.lang.String r7 = r7.getSimpleName()     // Catch: java.lang.Throwable -> L2a7
            java.lang.String r8 = "，将按计划重试"
            java.lang.String r7 = r7.concat(r8)     // Catch: java.lang.Throwable -> L2a7
            com.example.dyhelper.p002ui.C0182.m1590(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a7
        L296:
            java.lang.String r1 = "r8b18805b9e3774c8"
            java.lang.String r5 = "自动营地批次异常"
            p000.C0888ux.m5977(r1, r5, r0)     // Catch: java.lang.Throwable -> L2a7
            boolean r0 = p000.dd1.m1714()
            if (r0 == 0) goto L2a6
            if (r2 == 0) goto L24f
            goto L24b
        L2a6:
            return
        L2a7:
            r0 = move-exception
            boolean r1 = p000.dd1.m1714()
            if (r1 == 0) goto L2b7
            if (r2 == 0) goto L2b4
            p000.dd1.m1718(r3)
            goto L2b7
        L2b4:
            p000.dd1.m1719()
        L2b7:
            throw r0
        L2b8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L2bb:
            java.lang.String r1 = "r87045d6703eaa6c4"
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.xa1.f12093
            java.lang.String r7 = "自动投喂异常 reason="
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            boolean r0 = p000.xa1.m6549()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r0 != 0) goto L2cf
        L2ca:
            r2.set(r12)
            goto L3c8
        L2cf:
            kt0 r0 = new kt0     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            boolean r0 = p000.xa1.m6555(r4, r0)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r0 != 0) goto L2e3
            java.lang.String r0 = "自动投喂跳过 reason=wait_conversation_timeout"
            p000.C0888ux.m5992(r1, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            goto L2ca
        L2e0:
            r0 = move-exception
            goto L388
        L2e3:
            java.util.concurrent.atomic.AtomicReference r0 = p000.xa1.f12095     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r0 == 0) goto L2ca
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r0 == 0) goto L2ca
            boolean r4 = r0.isFinishing()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r4 != 0) goto L301
            boolean r4 = r0.isDestroyed()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r4 == 0) goto L302
        L301:
            r0 = r11
        L302:
            if (r0 == 0) goto L2ca
            kt0 r4 = new kt0     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            r5 = 11
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            boolean r3 = p000.xa1.m6555(r3, r4)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r3 != 0) goto L317
            java.lang.String r0 = "自动投喂跳过 reason=execution_busy_timeout"
            p000.C0888ux.m5992(r1, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            goto L2ca
        L317:
            java.lang.String r3 = p000.xa1.m6546()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r4 <= 0) goto L322
            goto L323
        L322:
            r3 = r11
        L323:
            if (r3 != 0) goto L326
            goto L2ca
        L326:
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.jf1.f5454     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            boolean r5 = r4.compareAndSet(r12, r10)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r5 != 0) goto L32f
            goto L2ca
        L32f:
            java.util.concurrent.atomic.AtomicReference r5 = p000.ry1.f9578     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r5 == 0) goto L342
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r5 == 0) goto L342
            goto L34a
        L342:
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
        L34a:
            r5.getClass()     // Catch: java.lang.Throwable -> L381
            va1 r5 = p000.xa1.m6547(r5, r3)     // Catch: java.lang.Throwable -> L381
            r4.set(r12)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            int r4 = r5.f11201     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            java.lang.String r6 = r5.f11207     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r4 < r10) goto L36c
            java.lang.String r4 = "pet_elf_auto_success_toast_enabled"
            boolean r4 = p000.ui1.m5887(r4, r10)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r4 != 0) goto L363
            goto L36c
        L363:
            xx0 r4 = new xx0     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            r8 = 7
            r4.<init>(r0, r6, r8)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            r0.runOnUiThread(r4)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
        L36c:
            java.lang.String r0 = p000.xa1.m6546()     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            boolean r0 = p000.ln0.m3626(r0, r3)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r0 == 0) goto L2ca
            int r0 = r5.f11200     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            if (r0 <= 0) goto L2ca
            java.util.concurrent.atomic.AtomicReference r0 = p000.xa1.f12094     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            r0.set(r3)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            goto L2ca
        L381:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.jf1.f5454     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            r3.set(r12)     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
            throw r0     // Catch: java.lang.Throwable -> L2e0 java.lang.InterruptedException -> L3bf
        L388:
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L399
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L399
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L399
            if (r4 != 0) goto L39b
            java.lang.String r4 = ""
            goto L39b
        L399:
            r0 = move-exception
            goto L3c9
        L39b:
            r5 = 120(0x78, float:1.68E-43)
            java.lang.String r4 = p000.xa1.m6553(r4, r5)     // Catch: java.lang.Throwable -> L399
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L399
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L399
            r5.append(r3)     // Catch: java.lang.Throwable -> L399
            java.lang.String r3 = " message="
            r5.append(r3)     // Catch: java.lang.Throwable -> L399
            r5.append(r4)     // Catch: java.lang.Throwable -> L399
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L399
            p000.C0888ux.m5992(r1, r3, r11, r9, r11)     // Catch: java.lang.Throwable -> L399
            java.lang.String r3 = "自动投喂调度异常"
            p000.C0888ux.m5977(r1, r3, r0)     // Catch: java.lang.Throwable -> L399
            goto L2ca
        L3bf:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L399
            r0.interrupt()     // Catch: java.lang.Throwable -> L399
            goto L2ca
        L3c8:
            return
        L3c9:
            r2.set(r12)
            throw r0
        L3cd:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.f01.f3710
            r0.set(r12)
            java.util.Map r1 = p000.f01.f3714
            r1.getClass()
            monitor-enter(r1)
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L408
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L408
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L408
            int r3 = p000.AbstractC1021yh.m6889(r0, r8)     // Catch: java.lang.Throwable -> L408
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L408
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L408
        L3eb:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L408
            if (r3 == 0) goto L40b
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L408
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L408
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L408
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L408
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L408
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L408
            r2.add(r5)     // Catch: java.lang.Throwable -> L408
            goto L3eb
        L408:
            r0 = move-exception
            goto L562
        L40b:
            monitor-exit(r1)
            java.util.Iterator r1 = r2.iterator()
        L410:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L49c
            java.lang.Object r0 = r1.next()
            l91 r0 = (p000.l91) r0
            java.lang.Object r2 = r0.f6502
            java.lang.Object r0 = r0.f6503
            d01 r0 = (p000.d01) r0
            java.lang.ThreadLocal r3 = p000.f01.f3712
            java.util.concurrent.ConcurrentHashMap r4 = p000.vd0.f11239
            java.util.ArrayList r4 = r0.f2832
            java.util.ArrayList r4 = p000.vd0.m6179(r4)
            if (r4 != 0) goto L435
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList r5 = r0.f2832
            r4.<init>(r5)
        L435:
            java.lang.Object r5 = r3.get()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L442
            int r5 = r5.intValue()
            goto L443
        L442:
            r5 = r12
        L443:
            int r6 = r5 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.set(r6)
            xq0 r6 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L477
            java.lang.reflect.Method r13 = r0.f2831     // Catch: java.lang.Throwable -> L477
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L477
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L477
            boolean r4 = r0.f2833     // Catch: java.lang.Throwable -> L477
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L477
            int r15 = r0.f2834     // Catch: java.lang.Throwable -> L477
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L477
            java.lang.String r0 = r0.f2835     // Catch: java.lang.Throwable -> L477
            r16 = r11
            java.io.Serializable[] r11 = new java.io.Serializable[r9]     // Catch: java.lang.Throwable -> L475
            r11[r12] = r14     // Catch: java.lang.Throwable -> L475
            r11[r10] = r4     // Catch: java.lang.Throwable -> L475
            r11[r7] = r15     // Catch: java.lang.Throwable -> L475
            r4 = 3
            r11[r4] = r0     // Catch: java.lang.Throwable -> L475
            java.lang.Object r0 = r6.m6776(r13, r2, r11)     // Catch: java.lang.Throwable -> L475
            goto L480
        L475:
            r0 = move-exception
            goto L47a
        L477:
            r0 = move-exception
            r16 = r11
        L47a:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L480:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L491
            java.lang.String r2 = "rd1fe9f51c470bd02"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "legacy status refresh failed: "
            p000.AbstractC0602nx.m4143(r4, r0, r2)
        L491:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.set(r0)
            r11 = r16
            goto L410
        L49c:
            r16 = r11
            java.util.Map r1 = p000.f01.f3715
            r1.getClass()
            monitor-enter(r1)
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L4d4
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L4d4
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4d4
            int r3 = p000.AbstractC1021yh.m6889(r0, r8)     // Catch: java.lang.Throwable -> L4d4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4d4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d4
        L4b7:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d4
            if (r3 == 0) goto L4d7
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L4d4
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L4d4
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L4d4
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L4d4
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L4d4
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L4d4
            r2.add(r5)     // Catch: java.lang.Throwable -> L4d4
            goto L4b7
        L4d4:
            r0 = move-exception
            goto L560
        L4d7:
            monitor-exit(r1)
            java.util.Iterator r1 = r2.iterator()
        L4dc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L55f
            java.lang.Object r0 = r1.next()
            l91 r0 = (p000.l91) r0
            java.lang.Object r2 = r0.f6502
            java.lang.Object r0 = r0.f6503
            c01 r0 = (p000.c01) r0
            java.lang.ThreadLocal r3 = p000.f01.f3713
            java.util.concurrent.ConcurrentHashMap r4 = p000.vd0.f11239
            java.util.ArrayList r4 = r0.f1925
            java.lang.reflect.Method r5 = r0.f1924
            java.util.ArrayList r4 = p000.vd0.m6179(r4)
            if (r4 != 0) goto L503
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList r0 = r0.f1925
            r4.<init>(r0)
        L503:
            java.lang.Object r0 = r3.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L511
            int r0 = r0.intValue()
            r6 = r0
            goto L512
        L511:
            r6 = r12
        L512:
            int r0 = r6 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.set(r0)
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r0 = r0.length
            if (r0 != r10) goto L52c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
            r0[r12] = r8
            goto L537
        L52c:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
            r0[r12] = r8
            r0[r10] = r16
        L537:
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L53e
            java.lang.Object r0 = r4.m6776(r5, r2, r0)     // Catch: java.lang.Throwable -> L53e
            goto L545
        L53e:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L545:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L556
            java.lang.String r2 = "rd1fe9f51c470bd02"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "refactor status refresh failed: "
            p000.AbstractC0602nx.m4143(r4, r0, r2)
        L556:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.set(r0)
            goto L4dc
        L55f:
            return
        L560:
            monitor-exit(r1)
            throw r0
        L562:
            monitor-exit(r1)
            throw r0
        L564:
            java.util.concurrent.atomic.AtomicInteger r0 = p000.a01.f8
            int r0 = r0.get()
            if (r0 <= 0) goto L580
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m940()
            if (r0 != 0) goto L580
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.a01.f4
            p000.a01.m6(r12)
            java.lang.String r0 = "rbe3d87ed96de26de"
            java.lang.String r1 = "外部状态变化导致临时显示终止，已还原标题文字"
            p000.C0888ux.m5975(r0, r1)
        L580:
            return
        L581:
            r16 = r11
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.a01.f4
            java.util.concurrent.atomic.AtomicInteger r0 = p000.a01.f8
            int r1 = r0.decrementAndGet()
            if (r1 > 0) goto L5a8
            r0.set(r12)
            p000.a01.f9 = r16
            be0 r0 = p000.be0.f1670
            boolean r1 = r0.m940()
            if (r1 == 0) goto L59d
            r0.m945()
        L59d:
            p000.a01.m9()
            java.lang.String r0 = "rbe3d87ed96de26de"
            java.lang.String r1 = "临时显示倒计时到期，已自动恢复隐藏"
            p000.C0888ux.m5975(r0, r1)
            goto L5d5
        L5a8:
            int r0 = r0.get()
            java.util.concurrent.atomic.AtomicReference r1 = p000.a01.f6
            java.lang.Object r1 = r1.get()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L5c5
            java.lang.Object r1 = r1.get()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L5c5
            java.lang.String r0 = p000.a01.m5(r0)
            r1.setText(r0)
        L5c5:
            fb0 r0 = new fb0
            r1 = 9
            r0.<init>(r1)
            p000.a01.f9 = r0
            android.os.Handler r1 = p000.a01.f5
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r0, r2)
        L5d5:
            return
        L5d6:
            r16 = r11
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.yz0.f12892
            r0.set(r12)
            java.util.Map r1 = p000.yz0.f12889
            r1.getClass()
            monitor-enter(r1)
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L613
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L613
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L613
            int r3 = p000.AbstractC1021yh.m6889(r0, r8)     // Catch: java.lang.Throwable -> L613
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L613
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L613
        L5f6:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L613
            if (r3 == 0) goto L615
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L613
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L613
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L613
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L613
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L613
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L613
            r2.add(r5)     // Catch: java.lang.Throwable -> L613
            goto L5f6
        L613:
            r0 = move-exception
            goto L653
        L615:
            monitor-exit(r1)
            java.util.Iterator r1 = r2.iterator()
        L61a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L652
            java.lang.Object r0 = r1.next()
            l91 r0 = (p000.l91) r0
            java.lang.Object r2 = r0.f6502
            java.lang.Object r0 = r0.f6503
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r3 = r16
            java.lang.Object[] r4 = new java.lang.Object[]{r3, r3}     // Catch: java.lang.Throwable -> L637
            java.lang.Object r0 = r0.invoke(r2, r4)     // Catch: java.lang.Throwable -> L637
            goto L63e
        L637:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L63e:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L64f
            java.lang.String r2 = "r1e0d2867edbb56e0"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "session refresh failed: "
            p000.AbstractC0602nx.m4143(r4, r0, r2)
        L64f:
            r16 = r3
            goto L61a
        L652:
            return
        L653:
            monitor-exit(r1)
            throw r0
        L655:
            ht0 r0 = p000.ht0.f4800
            p000.ht0.m2533()
            return
        L65b:
            ht0 r0 = p000.ht0.f4800
            p000.ht0.m2533()
            return
        L661:
            ht0 r0 = p000.ht0.f4800
            p000.ht0.m2533()
            return
        L667:
            java.util.concurrent.CopyOnWriteArraySet r0 = p000.vh0.f11284
            java.util.Iterator r0 = r0.iterator()
        L66d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67d
            java.lang.Object r1 = r0.next()
            p70 r1 = (p000.p70) r1
            r1.invoke()     // Catch: java.lang.Throwable -> L66d
            goto L66d
        L67d:
            return
        L67e:
            android.os.Handler r0 = p000.ah0.f229
            android.os.Handler r0 = p000.ah0.f229
            fb0 r1 = new fb0
            r1.<init>(r7)
            r0.post(r1)
            return
        L68b:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.ah0.f245
            java.util.Iterator r1 = r0.iterator()
            r1.getClass()
        L694:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6b4
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto L6ac
            r0.remove(r2)
            goto L694
        L6ac:
            android.os.Handler r2 = p000.ah0.f229
            java.lang.String r2 = "refresh"
            p000.ah0.m165(r3, r2, r10)
            goto L694
        L6b4:
            return
        L6b5:
            java.lang.String r0 = "im_auto_read_enabled"
            p000.tg0.m5708()     // Catch: java.lang.Throwable -> L6be
            boolean r12 = p000.ui1.m5887(r0, r12)     // Catch: java.lang.Throwable -> L6be
        L6be:
            if (r12 == 0) goto L6c3
            p000.tg0.m5709()     // Catch: java.lang.Throwable -> L6c7
        L6c3:
            p000.tg0.m5710()
            goto L6d0
        L6c7:
            r0 = move-exception
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "定时已读执行异常"
            p000.C0888ux.m5977(r1, r2, r0)     // Catch: java.lang.Throwable -> L6d1
            goto L6c3
        L6d0:
            return
        L6d1:
            r0 = move-exception
            p000.tg0.m5710()
            throw r0
        L6d6:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jb0.f5399
            hb0 r0 = p000.hb0.f4675
            p000.jb0.m2923(r0)
            return
    }
}
