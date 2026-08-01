package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ne */
/* JADX INFO: loaded from: classes.dex */
public final class C0519ne extends Thread {

    /* JADX INFO: renamed from: i */
    public static final AtomicIntegerFieldUpdater f3277i = AtomicIntegerFieldUpdater.newUpdater(C0519ne.class, "workerCtl");

    /* JADX INFO: renamed from: a */
    public final ed0 f3278a;

    /* JADX INFO: renamed from: b */
    public final p00 f3279b;

    /* JADX INFO: renamed from: c */
    public int f3280c;

    /* JADX INFO: renamed from: d */
    public long f3281d;

    /* JADX INFO: renamed from: e */
    public long f3282e;

    /* JADX INFO: renamed from: f */
    public int f3283f;

    /* JADX INFO: renamed from: g */
    public boolean f3284g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ExecutorC0556oe f3285h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public C0519ne(ExecutorC0556oe executorC0556oe, int i) {
        this.f3285h = executorC0556oe;
        setDaemon(true);
        this.f3278a = new ed0();
        this.f3279b = new p00();
        this.f3280c = 4;
        this.nextParkedWorker = ExecutorC0556oe.f3442k;
        this.f3283f = AbstractC0316hz.f2289a.mo1346b();
        m1952f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r11 = p000.ed0.f1580d.get(r9);
        r0 = p000.ed0.f1579c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r11 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p000.ed0.f1581e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.m987b(r0, true);
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
    public final p000.a60 m1947a(boolean r11) {
        /*
            r10 = this;
            int r0 = r10.f3280c
            oe r2 = r10.f3285h
            r7 = 0
            r8 = 1
            ed0 r9 = r10.f3278a
            if (r0 != r8) goto Lc
            goto L84
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0556oe.f3440i
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = p000.ed0.f1578b
            java.lang.Object r0 = r11.get(r9)
            a60 r0 = (p000.a60) r0
            if (r0 != 0) goto L2c
            goto L41
        L2c:
            b60 r1 = r0.f45b
            int r1 = r1.f686a
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = p000.ed0.f1580d
            int r11 = r11.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.ed0.f1579c
            int r0 = r0.get(r9)
        L4d:
            if (r11 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.ed0.f1581e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            a60 r1 = r9.m987b(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            go r11 = r2.f3448f
            java.lang.Object r11 = r11.m473d()
            a60 r11 = (p000.a60) r11
            if (r11 != 0) goto L71
            a60 r11 = r10.m1955i(r8)
        L71:
            return r11
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.ExecutorC0556oe.f3440i
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto Le
            r10.f3280c = r8
        L84:
            if (r11 == 0) goto Lb8
            int r11 = r2.f3443a
            int r11 = r11 * 2
            int r11 = r10.m1950d(r11)
            if (r11 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            a60 r11 = r10.m1951e()
            if (r11 == 0) goto L9b
            return r11
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = p000.ed0.f1578b
            java.lang.Object r11 = r11.getAndSet(r9, r7)
            a60 r11 = (p000.a60) r11
            if (r11 != 0) goto Lac
            a60 r11 = r9.m986a()
        Lac:
            if (r11 == 0) goto Laf
            return r11
        Laf:
            if (r8 != 0) goto Lbf
            a60 r11 = r10.m1951e()
            if (r11 == 0) goto Lbf
            return r11
        Lb8:
            a60 r11 = r10.m1951e()
            if (r11 == 0) goto Lbf
            return r11
        Lbf:
            r11 = 3
            a60 r11 = r10.m1955i(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0519ne.m1947a(boolean):a60");
    }

    /* JADX INFO: renamed from: b */
    public final int m1948b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1949c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m1950d(int i) {
        int i2 = this.f3283f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f3283f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: e */
    public final a60 m1951e() {
        int iM1950d = m1950d(2);
        ExecutorC0556oe executorC0556oe = this.f3285h;
        if (iM1950d == 0) {
            a60 a60Var = (a60) executorC0556oe.f3447e.m473d();
            return a60Var != null ? a60Var : (a60) executorC0556oe.f3448f.m473d();
        }
        a60 a60Var2 = (a60) executorC0556oe.f3448f.m473d();
        return a60Var2 != null ? a60Var2 : (a60) executorC0556oe.f3447e.m473d();
    }

    /* JADX INFO: renamed from: f */
    public final void m1952f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3285h.f3446d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m1953g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1954h(int i) {
        int i2 = this.f3280c;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC0556oe.f3440i.addAndGet(this.f3285h, 4398046511104L);
        }
        if (i2 != i) {
            this.f3280c = i;
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
    public final p000.a60 m1955i(int r26) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0519ne.m1955i(int):a60");
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0519ne.run():void");
    }
}
