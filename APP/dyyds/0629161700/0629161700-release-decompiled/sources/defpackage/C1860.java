package defpackage;

/* JADX INFO: renamed from: ᲁᛵᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1860 extends defpackage.AbstractC1805 implements defpackage.InterfaceC1925 {

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8107 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f8108 = 0;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.Object f8109;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.AbstractC1805 f8110;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC1925 f8111;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f8112;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0368 f8113;

    static {
            java.lang.Class<ᲁᛵᛷᛳ> r0 = defpackage.C1860.class
            java.lang.String r1 = "runningWorkers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.C1860.f8107 = r2
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            long r0 = r2.objectFieldOffset(r0)
            defpackage.C1860.f8108 = r0
            return
    }

    public C1860(defpackage.AbstractC1805 r2, int r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof defpackage.InterfaceC1925
            if (r0 == 0) goto Lb
            r0 = r2
            ᲁᲁᛴᛸ r0 = (defpackage.InterfaceC1925) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            ᲁᲁᛴᛸ r0 = defpackage.AbstractC0164.f1140
        L10:
            r1.f8111 = r0
            r1.f8110 = r2
            r1.f8112 = r3
            ᛲᲁᲈᲀ r2 = new ᛲᲁᲈᲀ
            r2.<init>()
            r1.f8113 = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f8109 = r2
            return
    }

    @Override // defpackage.AbstractC1805
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ᲁᛲᛱᛵ r1 = r2.f8110
            r0.append(r1)
            java.lang.String r1 = ".limitedParallelism("
            r0.append(r1)
            int r2 = r2.f8112
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo571(long r1, defpackage.C2260 r3) {
            r0 = this;
            ᲁᲁᛴᛸ r0 = r0.f8111
            r0.mo571(r1, r3)
            return
    }

    @Override // defpackage.AbstractC1805
    /* JADX INFO: renamed from: ᛲᛲᛸᲈ */
    public final void mo572(defpackage.InterfaceC0493 r5, java.lang.Runnable r6) {
            r4 = this;
            ᛲᲁᲈᲀ r5 = r4.f8113
            r5.m1093(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.C1860.f8107
            sun.misc.Unsafe r6 = defpackage.AbstractC0051.f569
            long r0 = defpackage.C1860.f8108
            int r2 = r6.getIntVolatile(r4, r0)
            int r3 = r4.f8112
            if (r2 >= r3) goto L3a
            java.lang.Object r2 = r4.f8109
            monitor-enter(r2)
            int r6 = r6.getIntVolatile(r4, r0)     // Catch: java.lang.Throwable -> L37
            int r0 = r4.f8112     // Catch: java.lang.Throwable -> L37
            if (r6 < r0) goto L20
            monitor-exit(r2)
            return
        L20:
            r5.incrementAndGet(r4)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            java.lang.Runnable r5 = r4.m3273()
            if (r5 != 0) goto L2b
            goto L3a
        L2b:
            ᛱᲈᛷᲀ r6 = new ᛱᲈᛷᲀ
            r0 = 6
            r6.<init>(r4, r0, r5)
            ᲁᛲᛱᛵ r5 = r4.f8110
            r5.mo572(r4, r6)
            return
        L37:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L3a:
            return
    }

    @Override // defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final defpackage.InterfaceC0843 mo573(long r1, defpackage.RunnableC1062 r3, defpackage.InterfaceC0493 r4) {
            r0 = this;
            ᲁᲁᛴᛸ r0 = r0.f8111
            ᛵᛲᲇᲇ r0 = r0.mo573(r1, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public final java.lang.Runnable m3273() {
            r3 = this;
        L0:
            ᛲᲁᲈᲀ r0 = r3.f8113
            java.lang.Object r0 = r0.m1091()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L25
            java.lang.Object r0 = r3.f8109
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.C1860.f8107     // Catch: java.lang.Throwable -> L22
            r1.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            ᛲᲁᲈᲀ r2 = r3.f8113     // Catch: java.lang.Throwable -> L22
            int r2 = r2.m1092()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1d
            monitor-exit(r0)
            r3 = 0
            return r3
        L1d:
            r1.incrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L0
        L22:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L25:
            return r0
    }
}
