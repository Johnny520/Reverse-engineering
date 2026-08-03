package yg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f22446b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f22447c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f22448d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f22449e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f22450f = null;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.h f22451a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private volatile /* synthetic */ java.lang.Object tail$volatile;

    static {
            java.lang.String r0 = "head$volatile"
            java.lang.Class<yg.f> r1 = yg.f.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            yg.f.f22446b = r0
            java.lang.String r0 = "deqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            yg.f.f22447c = r0
            java.lang.String r0 = "tail$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            yg.f.f22448d = r0
            java.lang.String r0 = "enqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            yg.f.f22449e = r0
            java.lang.String r0 = "_availablePermits$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            yg.f.f22450f = r0
            return
    }

    public f() {
            r5 = this;
            r5.<init>()
            yg.h r0 = new yg.h
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r3, r1, r2)
            r5.head$volatile = r0
            r5.tail$volatile = r0
            r0 = 1
            r5._availablePermits$volatile = r0
            f0.h r0 = new f0.h
            r1 = 15
            r0.<init>(r5, r1)
            r5.f22451a = r0
            return
    }

    public final void a(yg.a r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            qg.g r2 = r1.f22440g
            yg.b r3 = r1.f22441h
        L8:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = yg.f.f22450f
            int r4 = r4.getAndDecrement(r0)
            r5 = 1
            if (r4 > r5) goto L8
            sf.n r5 = sf.n.f12433a
            r6 = 0
            if (r4 <= 0) goto L2e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = yg.b.f22442g
            r4.set(r3, r6)
            nb.a r4 = new nb.a
            r6 = 28
            r4.<init>(r3, r6, r1)
            int r1 = r2.f11034i
            f0.h r3 = new f0.h
            r6 = 3
            r3.<init>(r4, r6)
            r2.z(r5, r1, r3)
            return
        L2e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = yg.f.f22448d
            java.lang.Object r7 = r4.get(r0)
            yg.h r7 = (yg.h) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = yg.f.f22449e
            long r8 = r8.getAndIncrement(r0)
            yg.d r10 = yg.d.f22444n
            int r11 = yg.g.f22457f
            long r11 = (long) r11
            long r11 = r8 / r11
        L43:
            java.lang.Object r13 = vg.a.b(r7, r11, r10)
            boolean r14 = vg.a.e(r13)
            if (r14 != 0) goto L91
            vg.q r14 = vg.a.c(r13)
        L51:
            java.lang.Object r15 = r4.get(r0)
            vg.q r15 = (vg.q) r15
            r16 = r7
            long r6 = r15.f14357c
            r17 = r6
            long r6 = r14.f14357c
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 < 0) goto L64
            goto L91
        L64:
            boolean r6 = r14.i()
            if (r6 != 0) goto L6e
            r7 = r16
            r6 = 0
            goto L43
        L6e:
            boolean r6 = r4.compareAndSet(r0, r15, r14)
            if (r6 == 0) goto L7e
            boolean r4 = r15.e()
            if (r4 == 0) goto L91
            r15.d()
            goto L91
        L7e:
            java.lang.Object r6 = r4.get(r0)
            if (r6 == r15) goto L6e
            boolean r6 = r14.e()
            if (r6 == 0) goto L8d
            r14.d()
        L8d:
            r7 = r16
            r6 = 0
            goto L51
        L91:
            vg.q r4 = vg.a.c(r13)
            yg.h r4 = (yg.h) r4
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f22458e
            int r7 = yg.g.f22457f
            long r10 = (long) r7
            long r8 = r8 % r10
            int r7 = (int) r8
        L9e:
            r8 = 0
            boolean r9 = r6.compareAndSet(r7, r8, r1)
            if (r9 == 0) goto La9
            r1.a(r4, r7)
            return
        La9:
            java.lang.Object r8 = r6.get(r7)
            if (r8 == 0) goto L9e
            l3.q r8 = yg.g.f22453b
            l3.q r9 = yg.g.f22454c
        Lb3:
            boolean r4 = r6.compareAndSet(r7, r8, r9)
            if (r4 == 0) goto Ld2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = yg.b.f22442g
            r10 = 0
            r4.set(r3, r10)
            nb.a r4 = new nb.a
            r6 = 28
            r4.<init>(r3, r6, r1)
            int r1 = r2.f11034i
            f0.h r3 = new f0.h
            r6 = 3
            r3.<init>(r4, r6)
            r2.z(r5, r1, r3)
            return
        Ld2:
            r10 = 0
            java.lang.Object r4 = r6.get(r7)
            if (r4 == r8) goto Lb3
            goto L8
    }

    public final void b() {
            r15 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = yg.f.f22450f
            int r1 = r0.getAndIncrement(r15)
            r2 = 1
            if (r1 >= r2) goto Lcd
            if (r1 < 0) goto Ld
            goto Lc6
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = yg.f.f22446b
            java.lang.Object r1 = r0.get(r15)
            yg.h r1 = (yg.h) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = yg.f.f22447c
            long r3 = r3.getAndIncrement(r15)
            int r5 = yg.g.f22457f
            long r5 = (long) r5
            long r5 = r3 / r5
            yg.e r7 = yg.e.f22445n
        L22:
            java.lang.Object r8 = vg.a.b(r1, r5, r7)
            boolean r9 = vg.a.e(r8)
            if (r9 != 0) goto L66
            vg.q r9 = vg.a.c(r8)
        L30:
            java.lang.Object r10 = r0.get(r15)
            vg.q r10 = (vg.q) r10
            long r11 = r10.f14357c
            long r13 = r9.f14357c
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L3f
            goto L66
        L3f:
            boolean r11 = r9.i()
            if (r11 != 0) goto L46
            goto L22
        L46:
            boolean r11 = r0.compareAndSet(r15, r10, r9)
            if (r11 == 0) goto L56
            boolean r0 = r10.e()
            if (r0 == 0) goto L66
            r10.d()
            goto L66
        L56:
            java.lang.Object r11 = r0.get(r15)
            if (r11 == r10) goto L46
            boolean r10 = r9.e()
            if (r10 == 0) goto L30
            r9.d()
            goto L30
        L66:
            vg.q r0 = vg.a.c(r8)
            yg.h r0 = (yg.h) r0
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f22458e
            r0.a()
            long r7 = r0.f14357c
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 0
            if (r0 <= 0) goto L7a
        L78:
            r2 = r5
            goto Lc4
        L7a:
            int r0 = yg.g.f22457f
            long r6 = (long) r0
            long r3 = r3 % r6
            int r0 = (int) r3
            l3.q r3 = yg.g.f22453b
            java.lang.Object r3 = r1.getAndSet(r0, r3)
            if (r3 != 0) goto Lac
            int r3 = yg.g.f22452a
            r4 = r5
        L8a:
            if (r4 >= r3) goto L98
            java.lang.Object r6 = r1.get(r0)
            l3.q r7 = yg.g.f22454c
            if (r6 != r7) goto L95
            goto Lc4
        L95:
            int r4 = r4 + 1
            goto L8a
        L98:
            l3.q r4 = yg.g.f22453b
            l3.q r6 = yg.g.f22455d
        L9c:
            boolean r3 = r1.compareAndSet(r0, r4, r6)
            if (r3 == 0) goto La4
            r5 = r2
            goto Laa
        La4:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r4) goto L9c
        Laa:
            r2 = r2 ^ r5
            goto Lc4
        Lac:
            l3.q r0 = yg.g.f22456e
            if (r3 != r0) goto Lb1
            goto L78
        Lb1:
            boolean r0 = r3 instanceof qg.f
            if (r0 == 0) goto Lc7
            qg.f r3 = (qg.f) r3
            sf.n r0 = sf.n.f12433a
            f0.h r1 = r15.f22451a
            l3.q r0 = r3.j(r0, r1)
            if (r0 == 0) goto L78
            r3.A(r0)
        Lc4:
            if (r2 == 0) goto L0
        Lc6:
            return
        Lc7:
            java.lang.String r0 = "unexpected: "
            okio.a.p(r3, r0)
            return
        Lcd:
            int r1 = r0.get(r15)
            if (r1 <= r2) goto Lda
            boolean r1 = r0.compareAndSet(r15, r1, r2)
            if (r1 != 0) goto Lda
            goto Lcd
        Lda:
            java.lang.String r0 = "The number of released permits cannot be greater than 1"
            ah.a.h(r0)
            return
    }
}
