package p201m3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p117X2.C1675t;

/* JADX INFO: renamed from: m3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2604a extends Thread {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8277l = AtomicIntegerFieldUpdater.newUpdater(C2604a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: d */
    public final C2616m f8278d;

    /* JADX INFO: renamed from: e */
    public final C1675t f8279e;

    /* JADX INFO: renamed from: f */
    public EnumC2605b f8280f;

    /* JADX INFO: renamed from: g */
    public long f8281g;

    /* JADX INFO: renamed from: h */
    public long f8282h;

    /* JADX INFO: renamed from: i */
    public int f8283i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j */
    public boolean f8284j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ExecutorC2606c f8285k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C2604a(ExecutorC2606c executorC2606c, int i5) {
        this.f8285k = executorC2606c;
        setDaemon(true);
        setContextClassLoader(ExecutorC2606c.class.getClassLoader());
        this.f8278d = new C2616m();
        this.f8279e = new C1675t();
        this.f8280f = EnumC2605b.f8289g;
        this.nextParkedWorker = ExecutorC2606c.f8295n;
        int iNanoTime = (int) System.nanoTime();
        this.f8283i = iNanoTime == 0 ? 42 : iNanoTime;
        m4554f(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = p201m3.C2616m.f8320d.get(r9);
        r0 = p201m3.C2616m.f8319c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p201m3.C2616m.f8321e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.m4566c(r0, true);
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
    public final p201m3.AbstractRunnableC2612i m4549a(boolean r12) {
        /*
            r11 = this;
            m3.b r0 = r11.f8280f
            m3.c r2 = r11.f8285k
            r7 = 0
            r8 = 1
            m3.m r9 = r11.f8278d
            m3.b r10 = p201m3.EnumC2605b.f8286d
            if (r0 != r10) goto Le
            goto L84
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p201m3.ExecutorC2606c.f8293l
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p201m3.C2616m.f8318b
            java.lang.Object r0 = r12.get(r9)
            m3.i r0 = (p201m3.AbstractRunnableC2612i) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f8309e
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = p201m3.C2616m.f8320d
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p201m3.C2616m.f8319c
            int r0 = r0.get(r9)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p201m3.C2616m.f8321e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            m3.i r1 = r9.m4566c(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            m3.f r12 = r2.f8301i
            java.lang.Object r12 = r12.m4397d()
            m3.i r12 = (p201m3.AbstractRunnableC2612i) r12
            if (r12 != 0) goto L71
            m3.i r12 = r11.m4557i(r8)
        L71:
            return r12
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p201m3.ExecutorC2606c.f8293l
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f8280f = r10
        L84:
            if (r12 == 0) goto Lb8
            int r12 = r2.f8296d
            int r12 = r12 * 2
            int r12 = r11.m4552d(r12)
            if (r12 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            m3.i r12 = r11.m4553e()
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p201m3.C2616m.f8318b
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            m3.i r12 = (p201m3.AbstractRunnableC2612i) r12
            if (r12 != 0) goto Lac
            m3.i r12 = r9.m4565b()
        Lac:
            if (r12 == 0) goto Laf
            return r12
        Laf:
            if (r8 != 0) goto Lbf
            m3.i r12 = r11.m4553e()
            if (r12 == 0) goto Lbf
            return r12
        Lb8:
            m3.i r12 = r11.m4553e()
            if (r12 == 0) goto Lbf
            return r12
        Lbf:
            r12 = 3
            m3.i r12 = r11.m4557i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p201m3.C2604a.m4549a(boolean):m3.i");
    }

    /* JADX INFO: renamed from: b */
    public final int m4550b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m4551c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m4552d(int i5) {
        int i6 = this.f8283i;
        int i7 = i6 ^ (i6 << 13);
        int i8 = i7 ^ (i7 >> 17);
        int i9 = i8 ^ (i8 << 5);
        this.f8283i = i9;
        int i10 = i5 - 1;
        return (i10 & i5) == 0 ? i9 & i10 : (i9 & Integer.MAX_VALUE) % i5;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC2612i m4553e() {
        int iM4552d = m4552d(2);
        ExecutorC2606c executorC2606c = this.f8285k;
        if (iM4552d == 0) {
            AbstractRunnableC2612i abstractRunnableC2612i = (AbstractRunnableC2612i) executorC2606c.f8300h.m4397d();
            return abstractRunnableC2612i != null ? abstractRunnableC2612i : (AbstractRunnableC2612i) executorC2606c.f8301i.m4397d();
        }
        AbstractRunnableC2612i abstractRunnableC2612i2 = (AbstractRunnableC2612i) executorC2606c.f8301i.m4397d();
        return abstractRunnableC2612i2 != null ? abstractRunnableC2612i2 : (AbstractRunnableC2612i) executorC2606c.f8300h.m4397d();
    }

    /* JADX INFO: renamed from: f */
    public final void m4554f(int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8285k.f8299g);
        sb.append("-worker-");
        sb.append(i5 == 0 ? "TERMINATED" : String.valueOf(i5));
        setName(sb.toString());
        this.indexInArray = i5;
    }

    /* JADX INFO: renamed from: g */
    public final void m4555g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4556h(EnumC2605b enumC2605b) {
        EnumC2605b enumC2605b2 = this.f8280f;
        boolean z5 = enumC2605b2 == EnumC2605b.f8286d;
        if (z5) {
            ExecutorC2606c.f8293l.addAndGet(this.f8285k, 4398046511104L);
        }
        if (enumC2605b2 != enumC2605b) {
            this.f8280f = enumC2605b;
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p201m3.AbstractRunnableC2612i m4557i(int r26) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201m3.C2604a.m4557i(int):m3.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201m3.C2604a.run():void");
    }
}
