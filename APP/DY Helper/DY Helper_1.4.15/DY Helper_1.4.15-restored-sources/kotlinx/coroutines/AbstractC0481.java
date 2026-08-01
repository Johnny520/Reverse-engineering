package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.γ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0481 extends p000.AbstractC0853tz implements p000.InterfaceC0845tr {

    /* JADX INFO: renamed from: λ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f6069 = null;

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f6070 = null;

    /* JADX INFO: renamed from: ν */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f6071 = null;
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    static {
            java.lang.String r0 = "_queue$volatile"
            java.lang.Class<kotlinx.coroutines.γ> r1 = kotlinx.coroutines.AbstractC0481.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.AbstractC0481.f6069 = r0
            java.lang.String r0 = "_delayed$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.AbstractC0481.f6070 = r0
            java.lang.String r0 = "_isCompleted$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.AbstractC0481.f6071 = r0
            return
    }

    public AbstractC0481() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isCompleted$volatile = r0
            return
    }

    @Override // p000.AbstractC0853tz
    public void shutdown() {
            r7 = this;
            java.lang.ThreadLocal r0 = p000.d42.f2881
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6071
            r2 = 1
            r0.set(r7, r2)
            uy r0 = p000.AbstractC1021yh.f12620
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.AbstractC0481.f6069
        L10:
            java.lang.Object r4 = r3.get(r7)
            if (r4 != 0) goto L24
        L16:
            boolean r4 = r3.compareAndSet(r7, r1, r0)
            if (r4 == 0) goto L1d
            goto L44
        L1d:
            java.lang.Object r4 = r3.get(r7)
            if (r4 == 0) goto L16
            goto L10
        L24:
            boolean r5 = r4 instanceof p000.iv0
            if (r5 == 0) goto L2e
            iv0 r4 = (p000.iv0) r4
            r4.m2809()
            goto L44
        L2e:
            if (r4 != r0) goto L31
            goto L44
        L31:
            iv0 r5 = new iv0
            r6 = 8
            r5.<init>(r6, r2)
            r6 = r4
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.m2808(r6)
        L3e:
            boolean r6 = r3.compareAndSet(r7, r4, r5)
            if (r6 == 0) goto L79
        L44:
            long r2 = r7.mo3402()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L44
            long r2 = java.lang.System.nanoTime()
        L52:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6070
            java.lang.Object r0 = r0.get(r7)
            wz r0 = (p000.C0965wz) r0
            if (r0 == 0) goto L78
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = p000.f42.f3750     // Catch: java.lang.Throwable -> L6b
            int r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L6b
            if (r4 <= 0) goto L6d
            r4 = 0
            vz r4 = r0.m2037(r4)     // Catch: java.lang.Throwable -> L6b
            goto L6e
        L6b:
            r7 = move-exception
            goto L76
        L6d:
            r4 = r1
        L6e:
            monitor-exit(r0)
            if (r4 != 0) goto L72
            goto L78
        L72:
            r7.mo3395(r2, r4)
            goto L52
        L76:
            monitor-exit(r0)
            throw r7
        L78:
            return
        L79:
            java.lang.Object r6 = r3.get(r7)
            if (r6 == r4) goto L3e
            goto L10
    }

    /* JADX INFO: renamed from: Α */
    public void mo3394(java.lang.Runnable r2) {
            r1 = this;
            r1.m3397()
            boolean r0 = r1.m3398(r2)
            if (r0 == 0) goto L17
            java.lang.Thread r1 = r1.mo3183()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r2 == r1) goto L16
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L16:
            return
        L17:
            kotlinx.coroutines.β r1 = kotlinx.coroutines.RunnableC0480.f6067
            r1.mo3394(r2)
            return
    }

    /* JADX INFO: renamed from: Β */
    public final void m3397() {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6070
            java.lang.Object r0 = r0.get(r10)
            wz r0 = (p000.C0965wz) r0
            if (r0 == 0) goto L44
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.f42.f3750
            int r1 = r1.get(r0)
            if (r1 != 0) goto L13
            return
        L13:
            long r1 = java.lang.System.nanoTime()
        L17:
            monitor-enter(r0)
            vz[] r3 = r0.f3751     // Catch: java.lang.Throwable -> L35
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L21
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L35
            goto L22
        L21:
            r3 = r4
        L22:
            if (r3 != 0) goto L26
            monitor-exit(r0)
            goto L3f
        L26:
            long r6 = r3.f11492     // Catch: java.lang.Throwable -> L35
            long r6 = r1 - r6
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L37
            boolean r3 = r10.m3398(r3)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r10 = move-exception
            goto L42
        L37:
            r3 = r5
        L38:
            if (r3 == 0) goto L3e
            vz r4 = r0.m2037(r5)     // Catch: java.lang.Throwable -> L35
        L3e:
            monitor-exit(r0)
        L3f:
            if (r4 != 0) goto L17
            goto L44
        L42:
            monitor-exit(r0)
            throw r10
        L44:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public final boolean m3398(java.lang.Runnable r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6069
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.AbstractC0481.f6071
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof p000.iv0
            if (r4 == 0) goto L47
            r4 = r1
            iv0 r4 = (p000.iv0) r4
            int r5 = r4.m2808(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            iv0 r3 = r4.m2810()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            uy r4 = p000.AbstractC1021yh.f12620
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            iv0 r3 = new iv0
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.m2808(r4)
            r3.m2808(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
    }

    /* JADX INFO: renamed from: Δ */
    public abstract java.lang.Thread mo3183();

    /* JADX INFO: renamed from: Ε */
    public final boolean m3399() {
            r7 = this;
            w6 r0 = r7.f10515
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6070
            java.lang.Object r0 = r0.get(r7)
            wz r0 = (p000.C0965wz) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p000.f42.f3750
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6069
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L30
            goto L53
        L30:
            boolean r0 = r7 instanceof p000.iv0
            if (r0 == 0) goto L4f
            iv0 r7 = (p000.iv0) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.iv0.f5211
            long r3 = r0.get(r7)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r0 = 30
            long r3 = r3 >> r0
            int r0 = (int) r3
            if (r7 != r0) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            uy r0 = p000.AbstractC1021yh.f12620
            if (r7 != r0) goto L54
        L53:
            return r1
        L54:
            return r2
    }

    /* JADX INFO: renamed from: Ζ */
    public void mo3395(long r1, p000.AbstractRunnableC0928vz r3) {
            r0 = this;
            kotlinx.coroutines.β r0 = kotlinx.coroutines.RunnableC0480.f6067
            r0.m3400(r1, r3)
            return
    }

    /* JADX INFO: renamed from: Η */
    public final void m3400(long r6, p000.AbstractRunnableC0928vz r8) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6070
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.AbstractC0481.f6071
            int r1 = r1.get(r5)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
            r1 = r3
            goto L37
        Le:
            java.lang.Object r1 = r0.get(r5)
            wz r1 = (p000.C0965wz) r1
            if (r1 != 0) goto L33
            wz r4 = new wz
            r4.<init>()
            r4.f11907 = r6
        L1d:
            boolean r1 = r0.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L24
            goto L2a
        L24:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L1d
        L2a:
            java.lang.Object r1 = r0.get(r5)
            r1.getClass()
            wz r1 = (p000.C0965wz) r1
        L33:
            int r1 = r8.m6287(r6, r1, r5)
        L37:
            if (r1 == 0) goto L49
            if (r1 == r3) goto L45
            r5 = 2
            if (r1 != r5) goto L3f
            goto L6f
        L3f:
            java.lang.String r5 = "unexpected result"
            p000.C1080.m7279(r5)
            return
        L45:
            r5.mo3395(r6, r8)
            return
        L49:
            java.lang.Object r6 = r0.get(r5)
            wz r6 = (p000.C0965wz) r6
            if (r6 == 0) goto L60
            monitor-enter(r6)
            vz[] r7 = r6.f3751     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L5c
            r0 = 0
            r2 = r7[r0]     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r5 = move-exception
            goto L5e
        L5c:
            monitor-exit(r6)
            goto L60
        L5e:
            monitor-exit(r6)
            throw r5
        L60:
            if (r2 != r8) goto L6f
            java.lang.Thread r5 = r5.mo3183()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            if (r6 == r5) goto L6f
            java.util.concurrent.locks.LockSupport.unpark(r5)
        L6f:
            return
    }

    @Override // p000.InterfaceC0845tr
    /* JADX INFO: renamed from: δ */
    public final void mo3401(long r4, p000.C0015ae r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L1a
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L16
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1a
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
        L1a:
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L39
            long r4 = java.lang.System.nanoTime()
            uz r2 = new uz
            long r0 = r0 + r4
            r2.<init>(r3, r0, r6)
            r3.m3400(r4, r2)
            ud r3 = new ud
            r4 = 1
            r3.<init>(r4, r2)
            r6.m91(r3)
        L39:
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: ρ */
    public final void mo1950(p000.InterfaceC0880up r1, java.lang.Runnable r2) {
            r0 = this;
            r0.mo3394(r2)
            return
    }

    @Override // p000.AbstractC0853tz
    /* JADX INFO: renamed from: ψ */
    public final long mo3402() {
            r10 = this;
            uy r0 = p000.AbstractC1021yh.f12620
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.AbstractC0481.f6069
            boolean r2 = r10.m5767()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.m3397()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof p000.iv0
            if (r6 == 0) goto L3e
            r6 = r2
            iv0 r6 = (p000.iv0) r6
            java.lang.Object r7 = r6.m2811()
            uy r8 = p000.iv0.f5212
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            iv0 r6 = r6.m2810()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            w6 r2 = r10.f10515
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof p000.iv0
            if (r2 == 0) goto L8d
            iv0 r1 = (p000.iv0) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.iv0.f5211
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6070
            java.lang.Object r10 = r0.get(r10)
            wz r10 = (p000.C0965wz) r10
            if (r10 == 0) goto Lb8
            monitor-enter(r10)
            vz[] r0 = r10.f3751     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto La5
            r1 = 0
            r5 = r0[r1]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r0 = move-exception
            goto Lb6
        La5:
            monitor-exit(r10)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f11492
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r10)
            throw r0
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
    }
}
