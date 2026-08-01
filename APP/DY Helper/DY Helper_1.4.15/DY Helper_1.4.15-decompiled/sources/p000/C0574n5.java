package p000;

/* JADX INFO: renamed from: n5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0574n5 implements p000.InterfaceC0237e6, p000.InterfaceC0852ty, p000.lx1, p000.f40, p000.InterfaceC0074be, p000.r71, p000.mq1 {

    /* JADX INFO: renamed from: θ */
    public static final int[] f7385 = null;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7386;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f7387;

    /* JADX INFO: renamed from: η */
    public java.lang.Object f7388;

    static {
            r0 = 16843067(0x101013b, float:2.369444E-38)
            r1 = 16843068(0x101013c, float:2.3694444E-38)
            int[] r0 = new int[]{r0, r1}
            p000.C0574n5.f7385 = r0
            return
    }

    public C0574n5(int r2) {
            r1 = this;
            r1.f7386 = r2
            switch(r2) {
                case 23: goto L17;
                default: goto L5;
            }
        L5:
            r1.<init>()
            b21 r2 = new b21
            r2.<init>()
            r1.f7387 = r2
            b21 r2 = new b21
            r2.<init>()
            r1.f7388 = r2
            return
        L17:
            r1.<init>()
            k21 r2 = new k21
            r0 = 16
            yp0[] r0 = new p000.yp0[r0]
            r2.<init>(r0)
            r1.f7387 = r2
            return
    }

    public /* synthetic */ C0574n5(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7386 = r1
            r0.f7387 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C0574n5(int r1, java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.f7386 = r1
            r0.f7387 = r2
            r0.f7388 = r3
            r0.<init>()
            return
    }

    public C0574n5(android.app.Activity r2, java.lang.ClassLoader r3) {
            r1 = this;
            r0 = 16
            r1.f7386 = r0
            r1.<init>()
            r1.f7387 = r3
            android.content.Context r2 = r2.getApplicationContext()
            r1.f7388 = r2
            return
    }

    public C0574n5(android.view.View r2) {
            r1 = this;
            r0 = 18
            r1.f7386 = r0
            r1.<init>()
            r1.f7387 = r2
            k1 r2 = new k1
            r0 = 3
            r2.<init>(r0, r1)
            qq0 r0 = p000.qq0.f9080
            oq0 r2 = p000.ln0.m3611(r0, r2)
            r1.f7388 = r2
            return
    }

    public C0574n5(android.widget.EditText r4, int r5) {
            r3 = this;
            r3.f7386 = r5
            switch(r5) {
                case 9: goto L12;
                default: goto L5;
            }
        L5:
            r3.<init>()
            r3.f7387 = r4
            n r5 = new n
            r5.<init>(r4)
            r3.f7388 = r5
            return
        L12:
            r3.<init>()
            r3.f7387 = r4
            bz r5 = new bz
            r5.<init>(r4)
            r3.f7388 = r5
            r4.addTextChangedListener(r5)
            ny r3 = p000.C0603ny.f7815
            if (r3 != 0) goto L49
            java.lang.Object r3 = p000.C0603ny.f7814
            monitor-enter(r3)
            ny r5 = p000.C0603ny.f7815     // Catch: java.lang.Throwable -> L43
            if (r5 != 0) goto L45
            ny r5 = new ny     // Catch: java.lang.Throwable -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<ny> r1 = p000.C0603ny.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L40
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Throwable -> L40
            p000.C0603ny.f7816 = r0     // Catch: java.lang.Throwable -> L40
        L40:
            p000.C0603ny.f7815 = r5     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r4 = move-exception
            goto L47
        L45:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            goto L49
        L47:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            throw r4
        L49:
            ny r3 = p000.C0603ny.f7815
            r4.setEditableFactory(r3)
            return
    }

    public C0574n5(androidx.appcompat.widget.AppCompatTextView r2) {
            r1 = this;
            r0 = 5
            r1.f7386 = r0
            r1.<init>()
            r1.f7388 = r2
            r1.f7387 = r2
            return
    }

    public C0574n5(p000.b70 r2) {
            r1 = this;
            r0 = 13
            r1.f7386 = r0
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f7387 = r0
            r1.f7388 = r2
            return
    }

    public /* synthetic */ C0574n5(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f7386 = r2
            r0.f7388 = r1
            r0.f7387 = r3
            r0.<init>()
            return
    }

    public C0574n5(java.lang.String r2, java.util.Set r3) {
            r1 = this;
            r0 = 15
            r1.f7386 = r0
            r3.getClass()
            r1.<init>()
            r1.f7387 = r2
            r1.f7388 = r3
            return
    }

    public C0574n5(p000.jq1 r3) {
            r2 = this;
            r0 = 28
            r2.f7386 = r0
            r2.<init>()
            r2.f7387 = r3
            n5 r0 = new n5
            r1 = 27
            r0.<init>(r1, r3)
            r2.f7388 = r0
            return
    }

    public C0574n5(p000.C0673p3 r2) {
            r1 = this;
            r0 = 17
            r1.f7386 = r0
            r1.<init>()
            r1.f7387 = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.f7388 = r2
            return
    }

    public C0574n5(p000.C1048z7 r2) {
            r1 = this;
            r0 = 24
            r1.f7386 = r0
            r1.<init>()
            r1.f7387 = r2
            j7 r2 = new j7
            r0 = 0
            r2.<init>(r0)
            r1.f7388 = r2
            return
    }

    public C0574n5(p000.C1076zz r14) {
            r13 = this;
            r0 = 11
            r13.f7386 = r0
            r13.<init>()
            xz r1 = new xz
            java.lang.Object r0 = r14.f13382
            b00 r0 = (p000.b00) r0
            lx1 r2 = r0.mo649()
            iw1 r3 = r2.mo2564()
            r4 = -1
            r6 = 1
            r2 = r14
            r1.<init>(r2, r3, r4, r6)
            r13.f7387 = r1
            yz r7 = new yz
            lx1 r14 = r0.mo649()
            rx1 r9 = r14.mo2556()
            r10 = -1
            r12 = 1
            r8 = r2
            r7.<init>(r8, r9, r10, r12)
            r13.f7388 = r7
            return
    }

    /* JADX INFO: renamed from: Θ */
    public static java.lang.IllegalStateException m3953(java.lang.Object r7) {
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        Ld:
            r3 = 0
            if (r2 >= r1) goto L2c
            r4 = r0[r2]
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L29
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.Class r6 = r4.getReturnType()
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L29
            goto L2d
        L29:
            int r2 = r2 + 1
            goto Ld
        L2c:
            r4 = r3
        L2d:
            if (r4 == 0) goto L4c
            java.lang.Object r7 = r4.invoke(r7, r3)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r7 instanceof java.lang.Throwable     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L3c
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch: java.lang.Throwable -> L3a
            goto L44
        L3a:
            r7 = move-exception
            goto L3e
        L3c:
            r7 = r3
            goto L44
        L3e:
            eo1 r0 = new eo1
            r0.<init>(r7)
            r7 = r0
        L44:
            boolean r0 = r7 instanceof p000.eo1
            if (r0 == 0) goto L49
            r7 = r3
        L49:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            goto L4d
        L4c:
            r7 = r3
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            if (r7 == 0) goto L56
            java.lang.String r1 = r7.getMessage()
            goto L57
        L56:
            r1 = r3
        L57:
            if (r1 == 0) goto L6d
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L60
            goto L6d
        L60:
            if (r7 == 0) goto L66
            java.lang.String r3 = r7.getMessage()
        L66:
            java.lang.String r1 = "宿主 Fresco 未返回编码资源: "
            java.lang.String r1 = p000.lz1.m3687(r1, r3)
            goto L6f
        L6d:
            java.lang.String r1 = "宿主 Fresco 未返回编码资源"
        L6f:
            r0.<init>(r1, r7)
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static void m3954(java.lang.Object r5) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r0 + r2
        L7:
            java.lang.String r2 = "isFinished"
            java.lang.Class r3 = r5.getClass()
            r4 = 0
            java.lang.reflect.Method r2 = r3.getMethod(r2, r4)
            java.lang.Object r2 = r2.invoke(r5, r4)
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L1d
            r4 = r2
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L1d:
            if (r4 == 0) goto L24
            boolean r2 = r4.booleanValue()
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 != 0) goto L4a
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L45
            r2 = 20
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L35
            goto L7
        L35:
            r5 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "宿主 Fresco 请求被中断"
            r0.<init>(r1, r5)
            throw r0
        L45:
            java.lang.String r5 = "宿主 Fresco 请求表情超时"
            p000.C1080.m7279(r5)
        L4a:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m3955(java.lang.Object r3) {
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "close"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> Le
            r0.invoke(r3, r2)     // Catch: java.lang.Throwable -> Le
        Le:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static byte[] m3956(java.lang.Object r11) {
            java.lang.String r0 = "size"
            java.lang.Class r1 = r11.getClass()
            r2 = 0
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)
            java.lang.Object r0 = r0.invoke(r11, r2)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L16
            java.lang.Number r0 = (java.lang.Number) r0
            goto L17
        L16:
            r0 = r2
        L17:
            if (r0 == 0) goto Laa
            int r0 = r0.intValue()
            r1 = 1
            if (r1 > r0) goto L9e
            r1 = 33554433(0x2000001, float:9.403956E-38)
            if (r0 >= r1) goto L9e
            byte[] r1 = new byte[r0]
            java.lang.Class r3 = r11.getClass()
            java.lang.reflect.Method[] r3 = r3.getMethods()
            r3.getClass()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L35:
            if (r6 >= r4) goto L5b
            r7 = r3[r6]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "read"
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L58
            java.lang.Class[] r8 = r7.getParameterTypes()
            java.lang.Class r9 = java.lang.Integer.TYPE
            java.lang.Class<byte[]> r10 = byte[].class
            java.lang.Class[] r9 = new java.lang.Class[]{r9, r10, r9, r9}
            boolean r8 = java.util.Arrays.equals(r8, r9)
            if (r8 == 0) goto L58
            goto L5c
        L58:
            int r6 = r6 + 1
            goto L35
        L5b:
            r7 = r2
        L5c:
            if (r7 == 0) goto L98
        L5e:
            if (r5 >= r0) goto L97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            int r6 = r0 - r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1, r4, r6}
            java.lang.Object r3 = r7.invoke(r11, r3)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L7d
            java.lang.Number r3 = (java.lang.Number) r3
            goto L7e
        L7d:
            r3 = r2
        L7e:
            if (r3 == 0) goto L85
            int r3 = r3.intValue()
            goto L86
        L85:
            r3 = -1
        L86:
            if (r3 <= 0) goto L8a
            int r5 = r5 + r3
            goto L5e
        L8a:
            java.lang.String r11 = "宿主表情资源读取不完整: "
            java.lang.String r1 = "/"
            java.lang.String r11 = p000.AbstractC0602nx.m4125(r5, r0, r11, r1)
            p000.C1080.m7279(r11)
        L95:
            r11 = 0
            return r11
        L97:
            return r1
        L98:
            java.lang.String r11 = "宿主 PooledByteBuffer 缺少批量读取方法"
            p000.ql1.m4936(r11)
            goto L95
        L9e:
            java.lang.String r11 = "宿主表情资源大小不安全: "
            java.lang.String r1 = " bytes"
            java.lang.String r11 = p000.AbstractC0602nx.m4127(r11, r0, r1)
            p000.C1080.m7266(r11)
            goto L95
        Laa:
            java.lang.String r11 = "无法读取宿主表情资源大小"
            p000.C1080.m7279(r11)
            goto L95
    }

    /* JADX INFO: renamed from: π */
    public static void m3957(p000.yp0 r10) {
            int r0 = r10.f12741
            if (r0 <= 0) goto La6
            bq0 r0 = r10.f12734
            up0 r0 = r0.f1803
            up0 r1 = p000.up0.f10923
            r2 = 0
            if (r0 != r1) goto L90
            boolean r0 = r10.m7001()
            if (r0 != 0) goto L90
            boolean r0 = r10.m7002()
            if (r0 != 0) goto L90
            boolean r0 = r10.f12742
            if (r0 == 0) goto L1f
            goto L90
        L1f:
            boolean r0 = r10.m6978()
            if (r0 != 0) goto L27
            goto L90
        L27:
            k31 r0 = r10.f12733
            q01 r0 = r0.f5729
            int r1 = r0.f8774
            r3 = 256(0x100, float:3.59E-43)
            r1 = r1 & r3
            if (r1 == 0) goto L90
        L32:
            if (r0 == 0) goto L90
            int r1 = r0.f8773
            r1 = r1 & r3
            if (r1 == 0) goto L88
            r1 = 0
            r4 = r0
            r5 = r1
        L3c:
            if (r4 == 0) goto L88
            boolean r6 = r4 instanceof p000.qa0
            if (r6 == 0) goto L4c
            qa0 r4 = (p000.qa0) r4
            q31 r6 = p000.h62.m2443(r4, r3)
            r4.mo606(r6)
            goto L83
        L4c:
            int r6 = r4.f8773
            r6 = r6 & r3
            if (r6 == 0) goto L83
            boolean r6 = r4 instanceof p000.C1014ya
            if (r6 == 0) goto L83
            r6 = r4
            ya r6 = (p000.C1014ya) r6
            q01 r6 = r6.f12512
            r7 = r2
        L5b:
            r8 = 1
            if (r6 == 0) goto L80
            int r9 = r6.f8773
            r9 = r9 & r3
            if (r9 == 0) goto L7d
            int r7 = r7 + 1
            if (r7 != r8) goto L69
            r4 = r6
            goto L7d
        L69:
            if (r5 != 0) goto L74
            k21 r5 = new k21
            r8 = 16
            q01[] r8 = new p000.q01[r8]
            r5.<init>(r8)
        L74:
            if (r4 == 0) goto L7a
            r5.m3127(r4)
            r4 = r1
        L7a:
            r5.m3127(r6)
        L7d:
            q01 r6 = r6.f8776
            goto L5b
        L80:
            if (r7 != r8) goto L83
            goto L3c
        L83:
            q01 r4 = p000.h62.m2387(r5)
            goto L3c
        L88:
            int r1 = r0.f8774
            r1 = r1 & r3
            if (r1 == 0) goto L90
            q01 r0 = r0.f8776
            goto L32
        L90:
            r10.f12740 = r2
            k21 r10 = r10.m7009()
            java.lang.Object[] r0 = r10.f5716
            int r10 = r10.f5718
        L9a:
            if (r2 >= r10) goto La6
            r1 = r0[r2]
            yp0 r1 = (p000.yp0) r1
            m3957(r1)
            int r2 = r2 + 1
            goto L9a
        La6:
            return
    }

    @Override // p000.InterfaceC0074be
    public void cancel() {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            j7 r0 = (p000.C0421j7) r0
            r1 = 1
            boolean r0 = r0.compareAndSet(r1, r1)
            if (r0 != 0) goto L12
            java.lang.Object r2 = r2.f7387
            z7 r2 = (p000.C1048z7) r2
            r2.invoke()
        L12:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f7386
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationResult(endReason="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f7388
            u3 r1 = (p000.EnumC0858u3) r1
            r0.append(r1)
            java.lang.String r1 = ", endState="
            r0.append(r1)
            java.lang.Object r2 = r2.f7387
            x3 r2 = (p000.C0970x3) r2
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: Α */
    public void m3958(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3958(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: Β */
    public void m3959(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3959(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public void m3960(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3960(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: Δ */
    public void m3961(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3961(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: Ε */
    public void m3962(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3962(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public android.text.method.KeyListener m3963(android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L23
            java.lang.Object r1 = r1.f7388
            n r1 = (p000.C0568n) r1
            java.lang.Object r1 = r1.f7336
            n5 r1 = (p000.C0574n5) r1
            r1.getClass()
            boolean r1 = r2 instanceof p000.C0815sy
            if (r1 == 0) goto L14
            return r2
        L14:
            if (r2 != 0) goto L18
            r1 = 0
            return r1
        L18:
            boolean r1 = r2 instanceof android.text.method.NumberKeyListener
            if (r1 == 0) goto L1d
            return r2
        L1d:
            sy r1 = new sy
            r1.<init>(r2)
            return r1
        L23:
            return r2
    }

    /* JADX INFO: renamed from: Η */
    public p000.hq1 m3964(java.lang.String r5) {
            r4 = this;
            java.lang.Object r4 = r4.f7387
            jq1 r4 = (p000.jq1) r4
            zz1 r0 = r4.f5548
            monitor-enter(r0)
            java.util.LinkedHashMap r4 = r4.f5549     // Catch: java.lang.Throwable -> L34
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L34
        L11:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L34
            r2 = 0
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L34
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L34
            hq1 r1 = (p000.hq1) r1     // Catch: java.lang.Throwable -> L34
            boolean r3 = p000.ln0.m3626(r3, r5)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L31
            r2 = r1
        L31:
            if (r2 == 0) goto L11
            goto L36
        L34:
            r4 = move-exception
            goto L38
        L36:
            monitor-exit(r0)
            return r2
        L38:
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: Ι */
    public p000.C0228dy m3965(java.lang.String r10) {
            r9 = this;
            java.lang.Object r0 = r9.f7387
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r10.getClass()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "main"
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L11e
            java.lang.CharSequence r10 = p000.q02.m4660(r10)
            java.lang.String r10 = r10.toString()
            java.lang.String r1 = "http"
            r2 = 1
            boolean r1 = p000.x02.m6485(r10, r1, r2)
            if (r1 == 0) goto L118
            java.lang.String r1 = "~794CAD457CF453294FB37A31D9BB512AE8FE5DF4D92CE4C78C846F11E01884A640C46D4B1118EBF570928B88E9C215889C839335D8CE"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            java.lang.String r4 = "newBuilderWithSource"
            java.lang.reflect.Method r1 = r1.getMethod(r4, r3)
            android.net.Uri r3 = android.net.Uri.parse(r10)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r4 = 0
            java.lang.Object r1 = r1.invoke(r4, r3)
            if (r1 == 0) goto L112
            java.lang.Class r3 = r1.getClass()
            java.lang.String r5 = "build"
            java.lang.reflect.Method r3 = r3.getMethod(r5, r4)
            java.lang.Object r1 = r3.invoke(r1, r4)
            if (r1 == 0) goto L10c
            java.lang.String r3 = "~7924EBBB33F7BB6EE9173DF4F1D7CD2F7356A8020D042F9D2DDC0A3E85288D408F45EB8A682F45711B3CCA65"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r0 = java.lang.Class.forName(r3, r2, r0)
            java.lang.String r2 = "getImagePipeline"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)
            java.lang.Object r0 = r0.invoke(r4, r4)
            if (r0 == 0) goto L106
            java.lang.Class r2 = r0.getClass()
            java.lang.reflect.Method[] r2 = r2.getMethods()
            r2.getClass()
            int r3 = r2.length
            r5 = 0
        L80:
            if (r5 >= r3) goto L9c
            r6 = r2[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "fetchEncodedImage"
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L99
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r7 = r7.length
            r8 = 2
            if (r7 != r8) goto L99
            goto L9d
        L99:
            int r5 = r5 + 1
            goto L80
        L9c:
            r6 = r4
        L9d:
            if (r6 == 0) goto L100
            java.lang.Object r9 = r9.f7388
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r9}
            java.lang.Object r9 = r6.invoke(r0, r9)
            if (r9 == 0) goto Lf9
            m3954(r9)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = "getResult"
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.Throwable -> Le0
            java.lang.reflect.Method r0 = r1.getMethod(r0, r4)     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r0 = r0.invoke(r9, r4)     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto Lf0
            java.lang.String r1 = "get"
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> Le2
            java.lang.reflect.Method r1 = r2.getMethod(r1, r4)     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r1 = r1.invoke(r0, r4)     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Le4
            byte[] r1 = m3956(r1)     // Catch: java.lang.Throwable -> Le2
            dy r2 = new dy     // Catch: java.lang.Throwable -> Le2
            r2.<init>(r10, r1)     // Catch: java.lang.Throwable -> Le2
            m3955(r0)     // Catch: java.lang.Throwable -> Le0
            m3955(r9)
            return r2
        Le0:
            r10 = move-exception
            goto Lf5
        Le2:
            r10 = move-exception
            goto Lec
        Le4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = "宿主 Fresco 编码缓冲区为空"
            r10.<init>(r1)     // Catch: java.lang.Throwable -> Le2
            throw r10     // Catch: java.lang.Throwable -> Le2
        Lec:
            m3955(r0)     // Catch: java.lang.Throwable -> Le0
            throw r10     // Catch: java.lang.Throwable -> Le0
        Lf0:
            java.lang.IllegalStateException r10 = m3953(r9)     // Catch: java.lang.Throwable -> Le0
            throw r10     // Catch: java.lang.Throwable -> Le0
        Lf5:
            m3955(r9)
            throw r10
        Lf9:
            java.lang.String r9 = "宿主 Fresco 编码请求未创建"
            p000.C1080.m7279(r9)
        Lfe:
            r9 = 0
            return r9
        L100:
            java.lang.String r9 = "宿主 Fresco 缺少 fetchEncodedImage"
            p000.ql1.m4936(r9)
            goto Lfe
        L106:
            java.lang.String r9 = "宿主 Fresco ImagePipeline 未初始化"
            p000.C1080.m7279(r9)
            goto Lfe
        L10c:
            java.lang.String r9 = "宿主 Fresco 图片请求为空"
            p000.C1080.m7279(r9)
            goto Lfe
        L112:
            java.lang.String r9 = "宿主 Fresco 无法创建图片请求"
            p000.C1080.m7279(r9)
            goto Lfe
        L118:
            java.lang.String r9 = "表情地址不是 HTTP(S) URL"
            p000.C1080.m7275(r9)
            goto Lfe
        L11e:
            java.lang.String r9 = "宿主表情请求不能在主线程执行"
            p000.C1080.m7279(r9)
            goto Lfe
    }

    /* JADX INFO: renamed from: Κ */
    public void mo3966(android.util.AttributeSet r9, int r10) {
            r8 = this;
            int r0 = r8.f7386
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L2f;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r8.f7387
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.content.Context r0 = r0.getContext()
            int[] r3 = p000.kk1.f5976
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r9, r3, r10, r2)
            r10 = 14
            boolean r0 = r9.hasValue(r10)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            boolean r1 = r9.getBoolean(r10, r1)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r8 = move-exception
            goto L2b
        L24:
            r9.recycle()
            r8.m3977(r1)
            return
        L2b:
            r9.recycle()
            throw r8
        L2f:
            java.lang.Object r0 = r8.f7387
            android.widget.AbsSeekBar r0 = (android.widget.AbsSeekBar) r0
            android.content.Context r3 = r0.getContext()
            int[] r4 = p000.C0574n5.f7385
            m6 r9 = p000.C0538m6.m3752(r3, r9, r4, r10)
            android.graphics.drawable.Drawable r10 = r9.m3755(r2)
            if (r10 == 0) goto L7a
            boolean r3 = r10 instanceof android.graphics.drawable.AnimationDrawable
            if (r3 == 0) goto L77
            android.graphics.drawable.AnimationDrawable r10 = (android.graphics.drawable.AnimationDrawable) r10
            int r3 = r10.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r4 = new android.graphics.drawable.AnimationDrawable
            r4.<init>()
            boolean r5 = r10.isOneShot()
            r4.setOneShot(r5)
            r5 = r2
        L5a:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 >= r3) goto L73
            android.graphics.drawable.Drawable r7 = r10.getFrame(r5)
            android.graphics.drawable.Drawable r7 = r8.m3978(r7, r1)
            r7.setLevel(r6)
            int r6 = r10.getDuration(r5)
            r4.addFrame(r7, r6)
            int r5 = r5 + 1
            goto L5a
        L73:
            r4.setLevel(r6)
            r10 = r4
        L77:
            r0.setIndeterminateDrawable(r10)
        L7a:
            android.graphics.drawable.Drawable r10 = r9.m3755(r1)
            if (r10 == 0) goto L87
            android.graphics.drawable.Drawable r8 = r8.m3978(r10, r2)
            r0.setProgressDrawable(r8)
        L87:
            r9.m3765()
            return
    }

    /* JADX INFO: renamed from: Λ */
    public android.view.autofill.AutofillId m3967(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.f7387
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            java.lang.Object r1 = r1.f7388
            android.view.View r1 = (android.view.View) r1
            android.view.autofill.AutofillId r1 = r1.getAutofillId()
            android.view.autofill.AutofillId r1 = r0.newAutofillId(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: Μ */
    public p000.C0704py m3968(android.view.inputmethod.InputConnection r2, android.view.inputmethod.EditorInfo r3) {
            r1 = this;
            java.lang.Object r1 = r1.f7388
            n r1 = (p000.C0568n) r1
            if (r2 != 0) goto Lb
            r1.getClass()
            r1 = 0
            goto L22
        Lb:
            java.lang.Object r1 = r1.f7336
            n5 r1 = (p000.C0574n5) r1
            r1.getClass()
            boolean r0 = r2 instanceof p000.C0704py
            if (r0 == 0) goto L17
            goto L21
        L17:
            py r0 = new py
            java.lang.Object r1 = r1.f7387
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.<init>(r3, r2, r1)
            r2 = r0
        L21:
            r1 = r2
        L22:
            py r1 = (p000.C0704py) r1
            return r1
    }

    /* JADX INFO: renamed from: Ν */
    public void m3969(p000.AbstractC1153 r4) {
            r3 = this;
            java.lang.Object r0 = r3.f7387
            i0 r0 = (p000.C0379i0) r0
            java.lang.Object r1 = r0.f4857
            android.view.ActionMode$Callback r1 = (android.view.ActionMode.Callback) r1
            p12 r4 = r0.m2570(r4)
            r1.onDestroyActionMode(r4)
            java.lang.Object r4 = r3.f7388
            androidx.appcompat.app.β r4 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r4
            android.widget.PopupWindow r0 = r4.f375
            if (r0 == 0) goto L22
            android.view.Window r0 = r4.f399
            android.view.View r0 = r0.getDecorView()
            w4 r1 = r4.f376
            r0.removeCallbacks(r1)
        L22:
            androidx.appcompat.widget.ActionBarContextView r0 = r4.f374
            if (r0 == 0) goto L42
            x92 r0 = r4.f377
            if (r0 == 0) goto L2d
            r0.m6541()
        L2d:
            androidx.appcompat.widget.ActionBarContextView r0 = r4.f374
            x92 r0 = p000.b92.m823(r0)
            r1 = 0
            r0.m6540(r1)
            r4.f377 = r0
            y4 r1 = new y4
            r2 = 2
            r1.<init>(r2, r3)
            r0.m6543(r1)
        L42:
            r3 = 0
            r4.f373 = r3
            android.view.ViewGroup r3 = r4.f379
            java.util.WeakHashMap r0 = p000.b92.f1572
            p000.s82.m5376(r3)
            r4.m219()
            return
    }

    /* JADX INFO: renamed from: Ξ */
    public boolean m3970(p000.AbstractC1153 r5, android.view.Menu r6) {
            r4 = this;
            java.lang.Object r0 = r4.f7388
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            android.view.ViewGroup r0 = r0.f379
            java.util.WeakHashMap r1 = p000.b92.f1572
            p000.s82.m5376(r0)
            java.lang.Object r4 = r4.f7387
            i0 r4 = (p000.C0379i0) r4
            java.lang.Object r0 = r4.f4857
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            p12 r5 = r4.m2570(r5)
            java.lang.Object r1 = r4.f4860
            fw1 r1 = (p000.fw1) r1
            java.lang.Object r2 = r1.get(r6)
            android.view.Menu r2 = (android.view.Menu) r2
            if (r2 != 0) goto L32
            xz0 r2 = new xz0
            java.lang.Object r4 = r4.f4858
            android.content.Context r4 = (android.content.Context) r4
            r3 = r6
            iz0 r3 = (p000.iz0) r3
            r2.<init>(r4, r3)
            r1.put(r6, r2)
        L32:
            boolean r4 = r0.onPrepareActionMode(r5, r2)
            return r4
    }

    /* JADX INFO: renamed from: Ο */
    public void m3971(p000.s50 r5) {
            r4 = this;
            java.lang.Object r0 = r4.f7388
            nn1 r0 = (p000.nn1) r0
            java.lang.Object r4 = r4.f7387
            y21 r4 = (p000.y21) r4
            int r1 = r5.f9739
            if (r1 != 0) goto L19
            android.graphics.Typeface r5 = r5.f9738
            ｓ r1 = new ｓ
            r2 = 1
            r3 = 0
            r1.<init>(r2, r4, r5, r3)
            r0.execute(r1)
            return
        L19:
            md r5 = new md
            r5.<init>(r4, r1)
            r0.execute(r5)
            return
    }

    /* JADX INFO: renamed from: Π */
    public void m3972(android.os.Bundle r4) {
            r3 = this;
            java.lang.Object r3 = r3.f7387
            jq1 r3 = (p000.jq1) r3
            kq1 r0 = r3.f5546
            boolean r1 = r3.f5550
            if (r1 != 0) goto Ld
            r3.m2979()
        Ld:
            jr0 r1 = r0.mo192()
            cr0 r1 = r1.f5558
            cr0 r2 = p000.cr0.f2727
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L3a
            boolean r0 = r3.f5552
            if (r0 != 0) goto L34
            r0 = 0
            if (r4 == 0) goto L2e
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L2e
            android.os.Bundle r0 = p000.e81.m1878(r4, r1)
        L2e:
            r3.f5551 = r0
            r4 = 1
            r3.f5552 = r4
            return
        L34:
            java.lang.String r3 = "SavedStateRegistry was already restored."
            p000.C1080.m7279(r3)
            return
        L3a:
            jr0 r3 = r0.mo192()
            cr0 r3 = r3.f5558
            java.lang.String r4 = "performRestore cannot be called when owner is "
            p000.C1080.m7282(r3, r4)
            return
    }

    /* JADX INFO: renamed from: Ρ */
    public void m3973(android.os.Bundle r5) {
            r4 = this;
            java.lang.Object r4 = r4.f7387
            jq1 r4 = (p000.jq1) r4
            r0 = 0
            l91[] r1 = new p000.l91[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            l91[] r0 = (p000.l91[]) r0
            android.os.Bundle r0 = p000.jx0.m3044(r0)
            android.os.Bundle r1 = r4.f5551
            if (r1 == 0) goto L18
            r0.putAll(r1)
        L18:
            zz1 r1 = r4.f5548
            monitor-enter(r1)
            java.util.LinkedHashMap r4 = r4.f5549     // Catch: java.lang.Throwable -> L4b
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4b
        L25:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L4b
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L4b
            hq1 r2 = (p000.hq1) r2     // Catch: java.lang.Throwable -> L4b
            android.os.Bundle r2 = r2.mo1949()     // Catch: java.lang.Throwable -> L4b
            r3.getClass()     // Catch: java.lang.Throwable -> L4b
            r2.getClass()     // Catch: java.lang.Throwable -> L4b
            r0.putBundle(r3, r2)     // Catch: java.lang.Throwable -> L4b
            goto L25
        L4b:
            r4 = move-exception
            goto L5a
        L4d:
            monitor-exit(r1)
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L59
            java.lang.String r4 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r4, r0)
        L59:
            return
        L5a:
            monitor-exit(r1)
            throw r4
    }

    /* JADX INFO: renamed from: Σ */
    public void m3974(java.lang.String r3, p000.hq1 r4) {
            r2 = this;
            r4.getClass()
            java.lang.Object r2 = r2.f7387
            jq1 r2 = (p000.jq1) r2
            zz1 r0 = r2.f5548
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r2.f5549     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            java.util.LinkedHashMap r2 = r2.f5549     // Catch: java.lang.Throwable -> L19
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L19:
            r2 = move-exception
            goto L23
        L1b:
            java.lang.String r2 = "SavedStateProvider with the given key is already registered"
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L19
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L23:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: Τ */
    public void m3975() {
            r4 = this;
            java.lang.Class<uq0> r0 = p000.uq0.class
            java.lang.Object r1 = r4.f7387
            jq1 r1 = (p000.jq1) r1
            boolean r1 = r1.f5553
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r4.f7388
            m4 r1 = (p000.C0536m4) r1
            if (r1 != 0) goto L15
            m4 r1 = new m4
            r1.<init>(r4)
        L15:
            r4.f7388 = r1
            r1 = 0
            r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L2d
            java.lang.Object r4 = r4.f7388
            m4 r4 = (p000.C0536m4) r4
            if (r4 == 0) goto L2c
            java.lang.String r0 = r0.getName()
            java.lang.Object r4 = r4.f6930
            java.util.LinkedHashSet r4 = (java.util.LinkedHashSet) r4
            r4.add(r0)
        L2c:
            return
        L2d:
            r4 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Class "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " must have default constructor in order to be automatically recreated"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r4)
            throw r1
        L4b:
            java.lang.String r4 = "Can not perform this action after onSaveInstanceState"
            p000.C1080.m7279(r4)
            return
    }

    /* JADX INFO: renamed from: Υ */
    public void m3976(java.lang.String r5, p000.p70 r6) {
            r4 = this;
            java.lang.Object r0 = r4.f7387
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "init."
            com.example.dyhelper.beta.BlacklistVerifier r2 = com.example.dyhelper.beta.BlacklistVerifier.f2226
            boolean r2 = r2.m1312()
            java.lang.String r3 = ": "
            if (r2 == 0) goto L35
            java.lang.Object r4 = r4.f7388
            java.util.Set r4 = (java.util.Set) r4
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            r4.append(r5)
            java.lang.String r5 = " skipped, all features disabled by blacklist"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            p000.C0888ux.m5985(r4)
            return
        L35:
            int r4 = p000.oe0.f8059     // Catch: java.lang.Throwable -> L58
            r1.concat(r5)     // Catch: java.lang.Throwable -> L58
            r6.invoke()     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r4.<init>()     // Catch: java.lang.Throwable -> L58
            r4.append(r0)     // Catch: java.lang.Throwable -> L58
            r4.append(r3)     // Catch: java.lang.Throwable -> L58
            r4.append(r5)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = " 初始化成功"
            r4.append(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L58
            p000.C0888ux.m5985(r4)     // Catch: java.lang.Throwable -> L58
            return
        L58:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " 初始化失败: "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            p000.C0888ux.m5977(r0, r5, r4)
            return
    }

    /* JADX INFO: renamed from: Φ */
    public void m3977(boolean r5) {
            r4 = this;
            java.lang.Object r4 = r4.f7388
            n r4 = (p000.C0568n) r4
            java.lang.Object r4 = r4.f7336
            n5 r4 = (p000.C0574n5) r4
            java.lang.Object r4 = r4.f7388
            bz r4 = (p000.C0094bz) r4
            boolean r0 = r4.f1894
            if (r0 == r5) goto L52
            az r0 = r4.f1893
            if (r0 == 0) goto L41
            jy r0 = p000.C0449jy.m3071()
            az r1 = r4.f1893
            r0.getClass()
            java.lang.String r2 = "initCallback cannot be null"
            p000.p91.m4418(r1, r2)
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r0.f5650
            java.util.concurrent.locks.Lock r3 = r2.writeLock()
            r3.lock()
            d7 r0 = r0.f5651     // Catch: java.lang.Throwable -> L38
            r0.remove(r1)     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.locks.Lock r0 = r2.writeLock()
            r0.unlock()
            goto L41
        L38:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = r2.writeLock()
            r5.unlock()
            throw r4
        L41:
            r4.f1894 = r5
            if (r5 == 0) goto L52
            android.widget.EditText r4 = r4.f1892
            jy r5 = p000.C0449jy.m3071()
            int r5 = r5.m3073()
            p000.C0094bz.m1085(r4, r5)
        L52:
            return
    }

    /* JADX INFO: renamed from: Χ */
    public android.graphics.drawable.Drawable m3978(android.graphics.drawable.Drawable r8, boolean r9) {
            r7 = this;
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L81
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r9) goto L30
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L26
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L24
            goto L26
        L24:
            r4 = r2
            goto L27
        L26:
            r4 = r1
        L27:
            android.graphics.drawable.Drawable r4 = r7.m3978(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto Lf
        L30:
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r7.<init>(r0)
        L35:
            if (r2 >= r9) goto L80
            int r0 = r8.getId(r2)
            r7.setId(r2, r0)
            int r0 = r8.getLayerGravity(r2)
            r7.setLayerGravity(r2, r0)
            int r0 = r8.getLayerWidth(r2)
            r7.setLayerWidth(r2, r0)
            int r0 = r8.getLayerHeight(r2)
            r7.setLayerHeight(r2, r0)
            int r0 = r8.getLayerInsetLeft(r2)
            r7.setLayerInsetLeft(r2, r0)
            int r0 = r8.getLayerInsetRight(r2)
            r7.setLayerInsetRight(r2, r0)
            int r0 = r8.getLayerInsetTop(r2)
            r7.setLayerInsetTop(r2, r0)
            int r0 = r8.getLayerInsetBottom(r2)
            r7.setLayerInsetBottom(r2, r0)
            int r0 = r8.getLayerInsetStart(r2)
            r7.setLayerInsetStart(r2, r0)
            int r0 = r8.getLayerInsetEnd(r2)
            r7.setLayerInsetEnd(r2, r0)
            int r2 = r2 + 1
            goto L35
        L80:
            return r7
        L81:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Lce
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            java.lang.Object r2 = r7.f7388
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto L93
            r7.f7388 = r0
        L93:
            android.graphics.drawable.ShapeDrawable r7 = new android.graphics.drawable.ShapeDrawable
            r2 = 8
            float[] r2 = new float[r2]
            r2 = {x00d0: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r3 = new android.graphics.drawable.shapes.RoundRectShape
            r4 = 0
            r3.<init>(r2, r4, r4)
            r7.<init>(r3)
            android.graphics.BitmapShader r2 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r2.<init>(r0, r3, r4)
            android.graphics.Paint r0 = r7.getPaint()
            r0.setShader(r2)
            android.graphics.Paint r0 = r7.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto Lcd
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r7, r9, r1)
            return r8
        Lcd:
            return r7
        Lce:
            return r8
    }

    /* JADX INFO: renamed from: Ψ */
    public void m3979() {
            r8 = this;
            java.lang.Object r0 = r8.f7388
            sm r0 = (p000.C0803sm) r0
            java.lang.Object r8 = r8.f7387
            java.lang.String r8 = (java.lang.String) r8
            android.os.Bundle r1 = r0.f9961
            java.util.HashMap r2 = r0.f9960
            java.util.ArrayList r3 = r0.f9958
            boolean r3 = r3.contains(r8)
            if (r3 != 0) goto L23
            java.util.HashMap r3 = r0.f9956
            java.lang.Object r3 = r3.remove(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L23
            java.util.HashMap r4 = r0.f9955
            r4.remove(r3)
        L23:
            java.util.HashMap r3 = r0.f9959
            r3.remove(r8)
            boolean r3 = r2.containsKey(r8)
            java.lang.String r4 = ": "
            java.lang.String r5 = "Dropping pending result for request "
            java.lang.String r6 = "ActivityResultRegistry"
            if (r3 == 0) goto L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r8)
            r3.append(r4)
            java.lang.Object r7 = r2.get(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r6, r3)
            r2.remove(r8)
        L50:
            boolean r2 = r1.containsKey(r8)
            if (r2 == 0) goto L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r8)
            r2.append(r4)
            android.os.Parcelable r3 = r1.getParcelable(r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r6, r2)
            r1.remove(r8)
        L72:
            java.util.HashMap r0 = r0.f9957
            java.lang.Object r8 = r0.get(r8)
            if (r8 != 0) goto L7b
            return
        L7b:
            p000.C1080.m7264()
            return
    }

    @Override // p000.InterfaceC0852ty
    /* JADX INFO: renamed from: α */
    public java.lang.Object mo3980() {
            r0 = this;
            java.lang.Object r0 = r0.f7387
            u62 r0 = (p000.u62) r0
            return r0
    }

    @Override // p000.lx1
    /* JADX INFO: renamed from: β */
    public p000.rx1 mo2556() {
            r0 = this;
            java.lang.Object r0 = r0.f7388
            yz r0 = (p000.C1039yz) r0
            return r0
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: γ */
    public java.lang.Object mo601(p000.g40 r4, p000.InterfaceC0631op r5) {
            r3 = this;
            qm1 r0 = new qm1
            r0.<init>()
            java.lang.Object r1 = r3.f7387
            se r1 = (p000.C0795se) r1
            k40 r2 = new k40
            java.lang.Object r3 = r3.f7388
            gl1 r3 = (p000.gl1) r3
            r2.<init>(r0, r4, r3)
            java.lang.Object r3 = r1.mo601(r2, r5)
            cq r4 = p000.EnumC0184cq.f2716
            if (r3 != r4) goto L1b
            return r3
        L1b:
            s62 r3 = p000.s62.f9751
            return r3
    }

    @Override // p000.r71
    /* JADX INFO: renamed from: δ */
    public java.util.List mo3981(java.lang.Integer r4) {
            r3 = this;
            java.lang.Object r0 = r3.f7387
            r71 r0 = (p000.r71) r0
            r1 = 0
            java.util.List r0 = r0.mo3981(r1)
            java.lang.Object r3 = r3.f7388
            rw1 r3 = (p000.rw1) r3
            int r1 = r3.f9559
            if (r1 >= 0) goto L12
            return r0
        L12:
            int[] r2 = r3.f9539
            int r2 = r3.m5134(r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.List r3 = p000.ln0.m3628(r3, r4, r1, r2)
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6651(r3, r0)
            return r3
    }

    @Override // p000.r71
    /* JADX INFO: renamed from: ε */
    public boolean mo3982() {
            r0 = this;
            java.lang.Object r0 = r0.f7387
            r71 r0 = (p000.r71) r0
            boolean r0 = r0.mo3982()
            return r0
    }

    @Override // p000.InterfaceC0852ty
    /* JADX INFO: renamed from: ζ */
    public boolean mo3983(java.lang.CharSequence r4, int r5, int r6, p000.k62 r7) {
            r3 = this;
            int r0 = r7.f5778
            r0 = r0 & 4
            r1 = 1
            if (r0 <= 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r3.f7387
            u62 r0 = (p000.u62) r0
            if (r0 != 0) goto L22
            u62 r0 = new u62
            boolean r2 = r4 instanceof android.text.Spannable
            if (r2 == 0) goto L17
            android.text.Spannable r4 = (android.text.Spannable) r4
            goto L1d
        L17:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r4)
            r4 = r2
        L1d:
            r0.<init>(r4)
            r3.f7387 = r0
        L22:
            java.lang.Object r4 = r3.f7388
            i2 r4 = (p000.C0381i2) r4
            r4.getClass()
            l62 r4 = new l62
            r4.<init>(r7)
            java.lang.Object r3 = r3.f7387
            u62 r3 = (p000.u62) r3
            r7 = 33
            r3.setSpan(r4, r5, r6, r7)
            return r1
    }

    @Override // p000.InterfaceC0237e6
    /* JADX INFO: renamed from: η */
    public void mo1848(int r1, float r2) {
            r0 = this;
            return
    }

    @Override // p000.mq1
    /* JADX INFO: renamed from: θ */
    public java.lang.Object mo3879(p000.wp1 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r0.f7387
            e80 r0 = (p000.e80) r0
            java.lang.Object r0 = r0.invoke(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public boolean m3984(long r7) {
            r6 = this;
            java.lang.Object r6 = r6.f7388
            n5 r6 = (p000.C0574n5) r6
            java.lang.Object r6 = r6.f7387
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        Le:
            if (r2 >= r0) goto L23
            java.lang.Object r3 = r6.get(r2)
            r4 = r3
            ci1 r4 = (p000.ci1) r4
            long r4 = r4.f2141
            boolean r4 = p000.u81.m5805(r4, r7)
            if (r4 == 0) goto L20
            goto L24
        L20:
            int r2 = r2 + 1
            goto Le
        L23:
            r3 = 0
        L24:
            ci1 r3 = (p000.ci1) r3
            if (r3 == 0) goto L2b
            boolean r6 = r3.f2148
            return r6
        L2b:
            return r1
    }

    @Override // p000.lx1
    /* JADX INFO: renamed from: λ */
    public p000.iw1 mo2564() {
            r0 = this;
            java.lang.Object r0 = r0.f7387
            xz r0 = (p000.C1002xz) r0
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public android.os.Bundle m3985(java.lang.String r4) {
            r3 = this;
            java.lang.Object r3 = r3.f7387
            jq1 r3 = (p000.jq1) r3
            boolean r0 = r3.f5552
            if (r0 == 0) goto L26
            android.os.Bundle r0 = r3.f5551
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            boolean r2 = r0.containsKey(r4)
            if (r2 == 0) goto L19
            android.os.Bundle r2 = p000.e81.m1878(r0, r4)
            goto L1a
        L19:
            r2 = r1
        L1a:
            r0.remove(r4)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L25
            r3.f5551 = r1
        L25:
            return r2
        L26:
            java.lang.String r3 = "You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state"
            p000.C1080.m7279(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ο */
    public void m3986() {
            r6 = this;
            java.lang.Object r0 = r6.f7387
            k21 r0 = (p000.k21) r0
            d50 r1 = p000.d50.f2889
            java.lang.Object[] r2 = r0.f5716
            int r3 = r0.f5718
            r4 = 0
            java.util.Arrays.sort(r2, r4, r3, r1)
            int r1 = r0.f5718
            java.lang.Object r2 = r6.f7388
            yp0[] r2 = (p000.yp0[]) r2
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            yp0[] r2 = new p000.yp0[r2]
        L21:
            r3 = 0
            r6.f7388 = r3
        L24:
            if (r4 >= r1) goto L2f
            java.lang.Object[] r5 = r0.f5716
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L24
        L2f:
            r0.m3132()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L48
            r0 = r2[r1]
            r0.getClass()
            boolean r4 = r0.f12740
            if (r4 == 0) goto L43
            m3957(r0)
        L43:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L34
        L48:
            r6.f7388 = r2
            return
    }

    /* JADX INFO: renamed from: ρ */
    public void m3987(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3987(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: σ */
    public void m3988(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            p60 r1 = r0.f1537
            r1.getClass()
            n60 r0 = r0.f1539
            if (r0 == 0) goto L17
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3988(r1)
        L17:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L30
            r2 = 0
            if (r3 == 0) goto L2f
            throw r2
        L2f:
            throw r2
        L30:
            p000.C1080.m7264()
        L33:
            return
    }

    /* JADX INFO: renamed from: τ */
    public void m3989(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3989(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: υ */
    public void m3990(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3990(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: φ */
    public void m3991(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3991(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: χ */
    public void m3992(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3992(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public void m3993(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            p60 r1 = r0.f1537
            r1.getClass()
            n60 r0 = r0.f1539
            if (r0 == 0) goto L17
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3993(r1)
        L17:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L30
            r2 = 0
            if (r3 == 0) goto L2f
            throw r2
        L2f:
            throw r2
        L30:
            p000.C1080.m7264()
        L33:
            return
    }

    /* JADX INFO: renamed from: ω */
    public void m3994(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f7388
            b70 r0 = (p000.b70) r0
            n60 r0 = r0.f1539
            if (r0 == 0) goto L12
            b70 r0 = r0.m3999()
            n5 r0 = r0.f1529
            r1 = 1
            r0.m3994(r1)
        L12:
            java.lang.Object r2 = r2.f7387
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L2a
            throw r2
        L2a:
            throw r2
        L2b:
            p000.C1080.m7264()
        L2e:
            return
    }
}
