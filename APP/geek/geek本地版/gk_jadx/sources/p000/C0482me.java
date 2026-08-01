package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: me */
/* JADX INFO: loaded from: classes.dex */
public final class C0482me extends Thread {

    /* JADX INFO: renamed from: i */
    public static final AtomicIntegerFieldUpdater f3196i = AtomicIntegerFieldUpdater.newUpdater(C0482me.class, "workerCtl");

    /* JADX INFO: renamed from: a */
    public final zc0 f3197a;

    /* JADX INFO: renamed from: b */
    public final i00 f3198b;

    /* JADX INFO: renamed from: c */
    public int f3199c;

    /* JADX INFO: renamed from: d */
    public long f3200d;

    /* JADX INFO: renamed from: e */
    public long f3201e;

    /* JADX INFO: renamed from: f */
    public int f3202f;

    /* JADX INFO: renamed from: g */
    public boolean f3203g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ExecutorC0519ne f3204h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public C0482me(ExecutorC0519ne executorC0519ne, int i) {
        this.f3204h = executorC0519ne;
        setDaemon(true);
        this.f3197a = new zc0();
        this.f3198b = new i00();
        this.f3199c = 4;
        this.nextParkedWorker = ExecutorC0519ne.f3402k;
        this.f3202f = AbstractC0049az.f694a.mo479b();
        m1825f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r11 = p000.zc0.f5536d.get(r9);
        r0 = p000.zc0.f5535c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r11 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p000.zc0.f5537e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.m2801b(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.u50 m1820a(boolean r11) {
        /*
            r10 = this;
            int r0 = r10.f3199c
            ne r2 = r10.f3204h
            r7 = 0
            r8 = 1
            zc0 r9 = r10.f3197a
            if (r0 != r8) goto Lc
            goto L84
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0519ne.f3400i
        Le:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = p000.zc0.f5534b
            java.lang.Object r0 = r11.get(r9)
            u50 r0 = (p000.u50) r0
            if (r0 != 0) goto L2c
            goto L41
        L2c:
            v50 r1 = r0.f4669b
            int r1 = r1.f4807a
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r11.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r11.get(r9)
            if (r1 == r0) goto L32
            goto L21
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = p000.zc0.f5536d
            int r11 = r11.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.zc0.f5535c
            int r0 = r0.get(r9)
        L4d:
            if (r11 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.zc0.f5537e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            u50 r1 = r9.m2801b(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            bo r11 = r2.f3408f
            java.lang.Object r11 = r11.m2598d()
            u50 r11 = (p000.u50) r11
            if (r11 != 0) goto L71
            u50 r11 = r10.m1828i(r8)
        L71:
            return r11
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.ExecutorC0519ne.f3400i
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto Le
            r10.f3199c = r8
        L84:
            if (r11 == 0) goto Lb8
            int r11 = r2.f3403a
            int r11 = r11 * 2
            int r11 = r10.m1823d(r11)
            if (r11 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            u50 r11 = r10.m1824e()
            if (r11 == 0) goto L9b
            return r11
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = p000.zc0.f5534b
            java.lang.Object r11 = r11.getAndSet(r9, r7)
            u50 r11 = (p000.u50) r11
            if (r11 != 0) goto Lac
            u50 r11 = r9.m2800a()
        Lac:
            if (r11 == 0) goto Laf
            return r11
        Laf:
            if (r8 != 0) goto Lbf
            u50 r11 = r10.m1824e()
            if (r11 == 0) goto Lbf
            return r11
        Lb8:
            u50 r11 = r10.m1824e()
            if (r11 == 0) goto Lbf
            return r11
        Lbf:
            r11 = 3
            u50 r11 = r10.m1828i(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0482me.m1820a(boolean):u50");
    }

    /* JADX INFO: renamed from: b */
    public final int m1821b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1822c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m1823d(int i) {
        int i2 = this.f3202f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f3202f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: e */
    public final u50 m1824e() {
        int iM1823d = m1823d(2);
        ExecutorC0519ne executorC0519ne = this.f3204h;
        if (iM1823d == 0) {
            u50 u50Var = (u50) executorC0519ne.f3407e.m2598d();
            return u50Var != null ? u50Var : (u50) executorC0519ne.f3408f.m2598d();
        }
        u50 u50Var2 = (u50) executorC0519ne.f3408f.m2598d();
        return u50Var2 != null ? u50Var2 : (u50) executorC0519ne.f3407e.m2598d();
    }

    /* JADX INFO: renamed from: f */
    public final void m1825f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3204h.f3406d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m1826g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1827h(int i) {
        int i2 = this.f3199c;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC0519ne.f3400i.addAndGet(this.f3204h, 4398046511104L);
        }
        if (i2 != i) {
            this.f3199c = i;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.u50 m1828i(int r26) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0482me.m1828i(int):u50");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0482me.run():void");
    }
}
