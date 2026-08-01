package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class fo0 implements p000.InterfaceC0806sp {

    /* JADX INFO: renamed from: ε */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f4052 = null;

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f4053 = null;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
            java.lang.String r0 = "_state$volatile"
            java.lang.Class<fo0> r1 = p000.fo0.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.fo0.f4052 = r0
            java.lang.String r0 = "_parentHandle$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.fo0.f4053 = r0
            return
    }

    public fo0(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            ez r1 = p000.AbstractC0978xb.f12107
            goto La
        L8:
            ez r1 = p000.AbstractC0978xb.f12106
        La:
            r0._state$volatile = r1
            return
    }

    /* JADX INFO: renamed from: Ο */
    public static p000.C0722qf m2156(kotlinx.coroutines.internal.C0478 r2) {
        L0:
            boolean r0 = r2.mo3391()
            if (r0 == 0) goto L24
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C0478.f6064
            kotlinx.coroutines.internal.α r1 = r2.m3388()
            if (r1 != 0) goto L22
            java.lang.Object r2 = r0.get(r2)
            kotlinx.coroutines.internal.α r2 = (kotlinx.coroutines.internal.C0478) r2
        L14:
            boolean r1 = r2.mo3391()
            if (r1 != 0) goto L1b
            goto L0
        L1b:
            java.lang.Object r2 = r0.get(r2)
            kotlinx.coroutines.internal.α r2 = (kotlinx.coroutines.internal.C0478) r2
            goto L14
        L22:
            r2 = r1
            goto L0
        L24:
            kotlinx.coroutines.internal.α r2 = r2.m3390()
            boolean r0 = r2.mo3391()
            if (r0 != 0) goto L24
            boolean r0 = r2 instanceof p000.C0722qf
            if (r0 == 0) goto L35
            qf r2 = (p000.C0722qf) r2
            return r2
        L35:
            boolean r0 = r2 instanceof p000.s31
            if (r0 == 0) goto L24
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Χ */
    public static java.lang.String m2157(java.lang.Object r2) {
            boolean r0 = r2 instanceof p000.eo0
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L1d
            eo0 r2 = (p000.eo0) r2
            boolean r0 = r2.m1944()
            if (r0 == 0) goto L11
            java.lang.String r2 = "Cancelling"
            return r2
        L11:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.eo0.f3618
            int r2 = r0.get(r2)
            if (r2 == 0) goto L1c
            java.lang.String r2 = "Completing"
            return r2
        L1c:
            return r1
        L1d:
            boolean r0 = r2 instanceof p000.ml0
            if (r0 == 0) goto L2d
            ml0 r2 = (p000.ml0) r2
            boolean r2 = r2.mo1277()
            if (r2 == 0) goto L2a
            return r1
        L2a:
            java.lang.String r2 = "New"
            return r2
        L2d:
            boolean r2 = r2 instanceof p000.C0628om
            if (r2 == 0) goto L34
            java.lang.String r2 = "Cancelled"
            return r2
        L34:
            java.lang.String r2 = "Completed"
            return r2
    }

    @Override // p000.InterfaceC0806sp
    public final p000.InterfaceC0843tp getKey() {
            r0 = this;
            xn0 r0 = p000.xn0.f12226
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.fo0.f4052
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = m2157(r2)
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r3 = p000.AbstractC1021yh.m6855(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: Α */
    public final java.lang.Object m2158(p000.eo0 r8, java.lang.Object r9) {
            r7 = this;
            boolean r0 = r9 instanceof p000.C0628om
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r9
            om r0 = (p000.C0628om) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Le
            java.lang.Throwable r1 = r0.f8149
        Le:
            monitor-enter(r8)
            r8.m1944()     // Catch: java.lang.Throwable -> L9d
            java.util.ArrayList r0 = r8.m1945(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.Throwable r2 = r7.m2160(r8, r0)     // Catch: java.lang.Throwable -> L9d
            r3 = 1
            if (r2 == 0) goto L53
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L9d
            if (r4 > r3) goto L24
            goto L53
        L24:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L9d
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> L9d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L9d
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9d
        L35:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L53
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L9d
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Throwable -> L9d
            if (r5 == r2) goto L35
            if (r5 == r2) goto L35
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L9d
            if (r6 != 0) goto L35
            boolean r6 = r4.add(r5)     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L35
            p000.ln0.m3624(r2, r5)     // Catch: java.lang.Throwable -> L9d
            goto L35
        L53:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L58
            goto L60
        L58:
            if (r2 != r1) goto L5b
            goto L60
        L5b:
            om r9 = new om
            r9.<init>(r2, r0)
        L60:
            if (r2 == 0) goto L79
            boolean r1 = r7.m2185(r2)
            if (r1 != 0) goto L6e
            boolean r1 = r7.mo2164(r2)
            if (r1 == 0) goto L79
        L6e:
            r9.getClass()
            r1 = r9
            om r1 = (p000.C0628om) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000.C0628om.f8148
            r2.compareAndSet(r1, r0, r3)
        L79:
            r7.mo2173(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4052
            boolean r1 = r9 instanceof p000.ml0
            if (r1 == 0) goto L8b
            nl0 r1 = new nl0
            r2 = r9
            ml0 r2 = (p000.ml0) r2
            r1.<init>(r2)
            goto L8c
        L8b:
            r1 = r9
        L8c:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L93
            goto L99
        L93:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L8c
        L99:
            r7.m2188(r8, r9)
            return r9
        L9d:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
    }

    /* JADX INFO: renamed from: Β */
    public final java.util.concurrent.CancellationException m2159() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4052
            java.lang.Object r0 = r0.get(r4)
            boolean r1 = r0 instanceof p000.eo0
            java.lang.String r2 = "Job is still new or active: "
            r3 = 0
            if (r1 == 0) goto L38
            eo0 r0 = (p000.eo0) r0
            java.lang.Throwable r0 = r0.m1943()
            if (r0 == 0) goto L33
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " is cancelling"
            java.lang.String r1 = r1.concat(r2)
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L2a
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L2a:
            if (r3 != 0) goto L32
            yn0 r2 = new yn0
            r2.<init>(r1, r0, r4)
            return r2
        L32:
            return r3
        L33:
            p000.C1080.m7278(r4, r2)
        L36:
            r4 = 0
            return r4
        L38:
            boolean r1 = r0 instanceof p000.ml0
            if (r1 != 0) goto L6c
            boolean r1 = r0 instanceof p000.C0628om
            if (r1 == 0) goto L58
            om r0 = (p000.C0628om) r0
            java.lang.Throwable r0 = r0.f8149
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L4b
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L4b:
            if (r3 != 0) goto L57
            yn0 r1 = new yn0
            java.lang.String r2 = r4.mo2186()
            r1.<init>(r2, r0, r4)
            return r1
        L57:
            return r3
        L58:
            yn0 r0 = new yn0
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " has completed normally"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1, r3, r4)
            return r0
        L6c:
            p000.C1080.m7278(r4, r2)
            goto L36
    }

    /* JADX INFO: renamed from: Γ */
    public final java.lang.Throwable m2160(p000.eo0 r3, java.util.ArrayList r4) {
            r2 = this;
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r3 = r3.m1944()
            if (r3 == 0) goto L17
            yn0 r3 = new yn0
            java.lang.String r4 = r2.mo2186()
            r3.<init>(r4, r1, r2)
            return r3
        L17:
            return r1
        L18:
            java.util.Iterator r2 = r4.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L1c
            goto L2f
        L2e:
            r3 = r1
        L2f:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L34
            return r3
        L34:
            r2 = 0
            java.lang.Object r2 = r4.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r3 = r2 instanceof p000.n42
            if (r3 == 0) goto L5c
            java.util.Iterator r3 = r4.iterator()
        L43:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r3.next()
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == r2) goto L43
            boolean r0 = r0 instanceof p000.n42
            if (r0 == 0) goto L43
            r1 = r4
        L57:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L5c
            return r1
        L5c:
            return r2
    }

    /* JADX INFO: renamed from: Δ */
    public boolean mo2161() {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: Ε */
    public boolean mo2162() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Ζ */
    public final p000.s31 m2163(p000.ml0 r2) {
            r1 = this;
            s31 r0 = r2.mo1278()
            if (r0 != 0) goto L22
            boolean r0 = r2 instanceof p000.C0266ez
            if (r0 == 0) goto L10
            s31 r1 = new s31
            r1.<init>()
            return r1
        L10:
            boolean r0 = r2 instanceof p000.co0
            if (r0 == 0) goto L1b
            co0 r2 = (p000.co0) r2
            r1.m2176(r2)
            r1 = 0
            return r1
        L1b:
            java.lang.String r1 = "State should have list: "
            p000.C1080.m7278(r2, r1)
            r1 = 0
            return r1
        L22:
            return r0
    }

    /* JADX INFO: renamed from: Η */
    public boolean mo2164(java.lang.Throwable r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Θ */
    public void mo2165(p000.C0692pm r1) {
            r0 = this;
            throw r1
    }

    /* JADX INFO: renamed from: Ι */
    public final void m2166(p000.fo0 r9) {
            r8 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4053
            u31 r1 = p000.u31.f10580
            if (r9 != 0) goto La
            r0.set(r8, r1)
            return
        La:
            r9.getClass()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.fo0.f4052
            java.lang.Object r2 = r2.get(r9)
            int r2 = r9.m2177(r2)
            if (r2 == 0) goto L1d
            r3 = 1
            if (r2 == r3) goto L1d
            goto Ld
        L1d:
            qf r2 = new qf
            r2.<init>(r8)
            r2.f2220 = r9
        L24:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.fo0.f4052
            java.lang.Object r4 = r3.get(r9)
            boolean r5 = r4 instanceof p000.C0266ez
            if (r5 == 0) goto L48
            r5 = r4
            ez r5 = (p000.C0266ez) r5
            boolean r6 = r5.f3687
            if (r6 == 0) goto L44
        L35:
            boolean r5 = r3.compareAndSet(r9, r4, r2)
            if (r5 == 0) goto L3d
            goto La2
        L3d:
            java.lang.Object r5 = r3.get(r9)
            if (r5 == r4) goto L35
            goto L24
        L44:
            r9.m2175(r5)
            goto L24
        L48:
            boolean r5 = r4 instanceof p000.ml0
            u31 r6 = p000.u31.f10580
            r7 = 0
            if (r5 == 0) goto L8e
            r5 = r4
            ml0 r5 = (p000.ml0) r5
            s31 r5 = r5.mo1278()
            if (r5 != 0) goto L5e
            co0 r4 = (p000.co0) r4
            r9.m2176(r4)
            goto L24
        L5e:
            r4 = 7
            boolean r4 = r5.m3387(r2, r4)
            if (r4 == 0) goto L66
            goto La2
        L66:
            r4 = 3
            boolean r4 = r5.m3387(r2, r4)
            java.lang.Object r9 = r3.get(r9)
            boolean r3 = r9 instanceof p000.eo0
            if (r3 == 0) goto L7a
            eo0 r9 = (p000.eo0) r9
            java.lang.Throwable r7 = r9.m1943()
            goto L86
        L7a:
            boolean r3 = r9 instanceof p000.C0628om
            if (r3 == 0) goto L81
            om r9 = (p000.C0628om) r9
            goto L82
        L81:
            r9 = r7
        L82:
            if (r9 == 0) goto L86
            java.lang.Throwable r7 = r9.f8149
        L86:
            r2.mo1281(r7)
            if (r4 == 0) goto L8c
            goto La2
        L8c:
            r2 = r6
            goto La2
        L8e:
            java.lang.Object r9 = r3.get(r9)
            boolean r3 = r9 instanceof p000.C0628om
            if (r3 == 0) goto L99
            om r9 = (p000.C0628om) r9
            goto L9a
        L99:
            r9 = r7
        L9a:
            if (r9 == 0) goto L9e
            java.lang.Throwable r7 = r9.f8149
        L9e:
            r2.mo1281(r7)
            goto L8c
        La2:
            r0.set(r8, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = p000.fo0.f4052
            java.lang.Object r9 = r9.get(r8)
            boolean r9 = r9 instanceof p000.ml0
            if (r9 != 0) goto Lb5
            r2.mo1276()
            r0.set(r8, r1)
        Lb5:
            return
    }

    /* JADX INFO: renamed from: Κ */
    public final p000.InterfaceC0922vt m2167(p000.a80 r3) {
            r2 = this;
            of r0 = new of
            r1 = 2
            r0.<init>(r1, r3)
            r3 = 1
            vt r2 = r2.m2168(r3, r0)
            return r2
    }

    /* JADX INFO: renamed from: Λ */
    public final p000.InterfaceC0922vt m2168(boolean r8, p000.co0 r9) {
            r7 = this;
            r9.f2220 = r7
        L2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4052
            java.lang.Object r1 = r0.get(r7)
            boolean r2 = r1 instanceof p000.C0266ez
            u31 r3 = p000.u31.f10580
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L29
            r2 = r1
            ez r2 = (p000.C0266ez) r2
            boolean r6 = r2.f3687
            if (r6 == 0) goto L25
        L17:
            boolean r2 = r0.compareAndSet(r7, r1, r9)
            if (r2 == 0) goto L1e
            goto L68
        L1e:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r1) goto L17
            goto L2
        L25:
            r7.m2175(r2)
            goto L2
        L29:
            boolean r2 = r1 instanceof p000.ml0
            if (r2 == 0) goto L67
            r2 = r1
            ml0 r2 = (p000.ml0) r2
            s31 r6 = r2.mo1278()
            if (r6 != 0) goto L3c
            co0 r1 = (p000.co0) r1
            r7.m2176(r1)
            goto L2
        L3c:
            boolean r1 = r9.mo1280()
            if (r1 == 0) goto L60
            boolean r1 = r2 instanceof p000.eo0
            if (r1 == 0) goto L49
            eo0 r2 = (p000.eo0) r2
            goto L4a
        L49:
            r2 = r5
        L4a:
            if (r2 == 0) goto L51
            java.lang.Throwable r1 = r2.m1943()
            goto L52
        L51:
            r1 = r5
        L52:
            if (r1 != 0) goto L5a
            r1 = 5
            boolean r1 = r6.m3387(r9, r1)
            goto L64
        L5a:
            if (r8 == 0) goto L80
            r9.mo1281(r1)
            return r3
        L60:
            boolean r1 = r6.m3387(r9, r4)
        L64:
            if (r1 == 0) goto L2
            goto L68
        L67:
            r4 = 0
        L68:
            if (r4 == 0) goto L6b
            return r9
        L6b:
            if (r8 == 0) goto L80
            java.lang.Object r7 = r0.get(r7)
            boolean r8 = r7 instanceof p000.C0628om
            if (r8 == 0) goto L78
            om r7 = (p000.C0628om) r7
            goto L79
        L78:
            r7 = r5
        L79:
            if (r7 == 0) goto L7d
            java.lang.Throwable r5 = r7.f8149
        L7d:
            r9.mo1281(r5)
        L80:
            return r3
    }

    /* JADX INFO: renamed from: Μ */
    public boolean m2169() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4052
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof p000.ml0
            if (r0 == 0) goto L14
            ml0 r1 = (p000.ml0) r1
            boolean r1 = r1.mo1277()
            if (r1 == 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Ν */
    public boolean mo2170() {
            r0 = this;
            boolean r0 = r0 instanceof p000.C0424ja
            return r0
    }

    /* JADX INFO: renamed from: Ξ */
    public final java.lang.Object m2171(java.lang.Object r4) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4052
            java.lang.Object r0 = r0.get(r3)
            java.lang.Object r0 = r3.m2178(r0, r4)
            uy r1 = p000.AbstractC0978xb.f12101
            if (r0 != r1) goto L37
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Job "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " is already complete or completing, but is being completed with "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r1 = r4 instanceof p000.C0628om
            r2 = 0
            if (r1 == 0) goto L2e
            om r4 = (p000.C0628om) r4
            goto L2f
        L2e:
            r4 = r2
        L2f:
            if (r4 == 0) goto L33
            java.lang.Throwable r2 = r4.f8149
        L33:
            r0.<init>(r3, r2)
            throw r0
        L37:
            uy r1 = p000.AbstractC0978xb.f12103
            if (r0 == r1) goto L0
            return r0
    }

    /* JADX INFO: renamed from: Π */
    public final void m2172(p000.s31 r6, java.lang.Throwable r7) {
            r5 = this;
            au0 r0 = new au0
            r1 = 4
            r0.<init>(r1)
            r6.m3387(r0, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C0478.f6063
            java.lang.Object r0 = r0.get(r6)
            r0.getClass()
            kotlinx.coroutines.internal.α r0 = (kotlinx.coroutines.internal.C0478) r0
            r1 = 0
        L15:
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L56
            boolean r2 = r0 instanceof p000.co0
            if (r2 == 0) goto L51
            r2 = r0
            co0 r2 = (p000.co0) r2
            boolean r2 = r2.mo1280()
            if (r2 == 0) goto L51
            r2 = r0
            co0 r2 = (p000.co0) r2     // Catch: java.lang.Throwable -> L2f
            r2.mo1281(r7)     // Catch: java.lang.Throwable -> L2f
            goto L51
        L2f:
            r2 = move-exception
            if (r1 == 0) goto L36
            p000.ln0.m3624(r1, r2)
            goto L51
        L36:
            pm r1 = new pm
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
        L51:
            kotlinx.coroutines.internal.α r0 = r0.m3390()
            goto L15
        L56:
            if (r1 == 0) goto L5b
            r5.mo2165(r1)
        L5b:
            r5.m2185(r7)
            return
    }

    /* JADX INFO: renamed from: Ρ */
    public void mo2173(java.lang.Object r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: Σ */
    public void mo2174() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: Τ */
    public final void m2175(p000.C0266ez r4) {
            r3 = this;
            s31 r0 = new s31
            r0.<init>()
            boolean r1 = r4.f3687
            if (r1 == 0) goto La
            goto L10
        La:
            ll0 r1 = new ll0
            r1.<init>(r0)
            r0 = r1
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.fo0.f4052
            boolean r2 = r1.compareAndSet(r3, r4, r0)
            if (r2 == 0) goto L19
            goto L1f
        L19:
            java.lang.Object r1 = r1.get(r3)
            if (r1 == r4) goto L10
        L1f:
            return
    }

    /* JADX INFO: renamed from: Υ */
    public final void m2176(p000.co0 r4) {
            r3 = this;
            s31 r0 = new s31
            r0.<init>()
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C0478.f6064
            r1.set(r0, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C0478.f6063
            r1.set(r0, r4)
        L12:
            java.lang.Object r2 = r1.get(r4)
            if (r2 == r4) goto L19
            goto L22
        L19:
            boolean r2 = r1.compareAndSet(r4, r4, r0)
            if (r2 == 0) goto L36
            r0.m3389(r4)
        L22:
            kotlinx.coroutines.internal.α r2 = r4.m3390()
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4052
            boolean r1 = r0.compareAndSet(r3, r4, r2)
            if (r1 == 0) goto L2f
            return
        L2f:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L26
            return
        L36:
            java.lang.Object r2 = r1.get(r4)
            if (r2 == r4) goto L19
            goto L12
    }

    /* JADX INFO: renamed from: Φ */
    public final int m2177(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof p000.C0266ez
            r1 = 1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.fo0.f4052
            if (r0 == 0) goto L22
            r0 = r5
            ez r0 = (p000.C0266ez) r0
            boolean r0 = r0.f3687
            if (r0 == 0) goto Lf
            goto L3d
        Lf:
            ez r0 = p000.AbstractC0978xb.f12107
        L11:
            boolean r3 = r2.compareAndSet(r4, r5, r0)
            if (r3 == 0) goto L1b
            r4.mo2174()
            return r1
        L1b:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r5) goto L11
            goto L3b
        L22:
            boolean r0 = r5 instanceof p000.ll0
            if (r0 == 0) goto L3d
            r0 = r5
            ll0 r0 = (p000.ll0) r0
            s31 r0 = r0.f6707
        L2b:
            boolean r3 = r2.compareAndSet(r4, r5, r0)
            if (r3 == 0) goto L35
            r4.mo2174()
            return r1
        L35:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r5) goto L2b
        L3b:
            r4 = -1
            return r4
        L3d:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: Ψ */
    public final java.lang.Object m2178(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            boolean r0 = r7 instanceof p000.ml0
            if (r0 != 0) goto L7
            uy r6 = p000.AbstractC0978xb.f12101
            return r6
        L7:
            boolean r0 = r7 instanceof p000.C0266ez
            if (r0 != 0) goto Lf
            boolean r0 = r7 instanceof p000.co0
            if (r0 == 0) goto L41
        Lf:
            boolean r0 = r7 instanceof p000.C0722qf
            if (r0 != 0) goto L41
            boolean r0 = r8 instanceof p000.C0628om
            if (r0 != 0) goto L41
            r0 = r7
            ml0 r0 = (p000.ml0) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.fo0.f4052
            boolean r7 = r8 instanceof p000.ml0
            if (r7 == 0) goto L2a
            nl0 r7 = new nl0
            r2 = r8
            ml0 r2 = (p000.ml0) r2
            r7.<init>(r2)
            r2 = r7
            goto L2b
        L2a:
            r2 = r8
        L2b:
            boolean r7 = r1.compareAndSet(r6, r0, r2)
            if (r7 == 0) goto L38
            r6.mo2173(r8)
            r6.m2188(r0, r8)
            return r8
        L38:
            java.lang.Object r7 = r1.get(r6)
            if (r7 == r0) goto L2b
            uy r6 = p000.AbstractC0978xb.f12103
            return r6
        L41:
            ml0 r7 = (p000.ml0) r7
            s31 r0 = r6.m2163(r7)
            if (r0 != 0) goto L4c
            uy r6 = p000.AbstractC0978xb.f12103
            return r6
        L4c:
            boolean r1 = r7 instanceof p000.eo0
            r2 = 0
            if (r1 == 0) goto L55
            r1 = r7
            eo0 r1 = (p000.eo0) r1
            goto L56
        L55:
            r1 = r2
        L56:
            if (r1 != 0) goto L5d
            eo0 r1 = new eo0
            r1.<init>(r0, r2)
        L5d:
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p000.eo0.f3618     // Catch: java.lang.Throwable -> L70
            int r4 = r3.get(r1)     // Catch: java.lang.Throwable -> L70
            r5 = 1
            if (r4 == 0) goto L69
            r4 = r5
            goto L6a
        L69:
            r4 = 0
        L6a:
            if (r4 == 0) goto L72
            uy r6 = p000.AbstractC0978xb.f12101     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)
            return r6
        L70:
            r6 = move-exception
            goto Ld7
        L72:
            r3.set(r1, r5)     // Catch: java.lang.Throwable -> L70
            if (r1 == r7) goto L8a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.fo0.f4052     // Catch: java.lang.Throwable -> L70
        L79:
            boolean r4 = r3.compareAndSet(r6, r7, r1)     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L80
            goto L8a
        L80:
            java.lang.Object r4 = r3.get(r6)     // Catch: java.lang.Throwable -> L70
            if (r4 == r7) goto L79
            uy r6 = p000.AbstractC0978xb.f12103     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)
            return r6
        L8a:
            boolean r7 = r1.m1944()     // Catch: java.lang.Throwable -> L70
            boolean r3 = r8 instanceof p000.C0628om     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L96
            r3 = r8
            om r3 = (p000.C0628om) r3     // Catch: java.lang.Throwable -> L70
            goto L97
        L96:
            r3 = r2
        L97:
            if (r3 == 0) goto L9e
            java.lang.Throwable r3 = r3.f8149     // Catch: java.lang.Throwable -> L70
            r1.m1942(r3)     // Catch: java.lang.Throwable -> L70
        L9e:
            java.lang.Throwable r3 = r1.m1943()     // Catch: java.lang.Throwable -> L70
            if (r7 != 0) goto La5
            r2 = r3
        La5:
            monitor-exit(r1)
            if (r2 == 0) goto Lab
            r6.m2172(r0, r2)
        Lab:
            qf r7 = m2156(r0)
            if (r7 == 0) goto Lba
            boolean r7 = r6.m2179(r1, r7, r8)
            if (r7 == 0) goto Lba
            uy r6 = p000.AbstractC0978xb.f12102
            return r6
        Lba:
            au0 r7 = new au0
            r2 = 2
            r7.<init>(r2)
            r0.m3387(r7, r2)
            qf r7 = m2156(r0)
            if (r7 == 0) goto Ld2
            boolean r7 = r6.m2179(r1, r7, r8)
            if (r7 == 0) goto Ld2
            uy r6 = p000.AbstractC0978xb.f12102
            return r6
        Ld2:
            java.lang.Object r6 = r6.m2158(r1, r8)
            return r6
        Ld7:
            monitor-exit(r1)
            throw r6
    }

    /* JADX INFO: renamed from: Ω */
    public final boolean m2179(p000.eo0 r4, p000.C0722qf r5, java.lang.Object r6) {
            r3 = this;
        L0:
            fo0 r0 = r5.f8990
            do0 r1 = new do0
            r1.<init>(r3, r4, r5, r6)
            r2 = 0
            vt r0 = p000.AbstractC1021yh.m6866(r0, r2, r1)
            u31 r1 = p000.u31.f10580
            if (r0 == r1) goto L12
            r3 = 1
            return r3
        L12:
            qf r5 = m2156(r5)
            if (r5 != 0) goto L0
            return r2
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0880up mo1784(p000.InterfaceC0880up r1) {
            r0 = this;
            up r0 = p000.pd2.m4462(r0, r1)
            return r0
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: θ */
    public final p000.InterfaceC0806sp mo1785(p000.InterfaceC0843tp r1) {
            r0 = this;
            sp r0 = p000.pd2.m4498(r0, r1)
            return r0
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo1787(p000.e80 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r1.invoke(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public void mo2180(java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            yn0 r3 = new yn0
            java.lang.String r0 = r2.mo2186()
            r1 = 0
            r3.<init>(r0, r1, r2)
        Lc:
            r2.mo2184(r3)
            return
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: ξ */
    public final p000.InterfaceC0880up mo1788(p000.InterfaceC0843tp r1) {
            r0 = this;
            up r0 = p000.pd2.m4460(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public void mo2181(java.lang.Object r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: π */
    public void mo2182(java.lang.Object r1) {
            r0 = this;
            r0.mo2181(r1)
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final boolean m2183(java.lang.Object r10) {
            r9 = this;
            uy r0 = p000.AbstractC0978xb.f12101
            boolean r1 = r9.mo2162()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
        La:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4052
            java.lang.Object r0 = r0.get(r9)
            boolean r1 = r0 instanceof p000.ml0
            if (r1 == 0) goto L36
            boolean r1 = r0 instanceof p000.eo0
            if (r1 == 0) goto L24
            r1 = r0
            eo0 r1 = (p000.eo0) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = p000.eo0.f3618
            int r1 = r4.get(r1)
            if (r1 == 0) goto L24
            goto L36
        L24:
            om r1 = new om
            java.lang.Throwable r4 = r9.m2189(r10)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r9.m2178(r0, r1)
            uy r1 = p000.AbstractC0978xb.f12103
            if (r0 == r1) goto La
            goto L38
        L36:
            uy r0 = p000.AbstractC0978xb.f12101
        L38:
            uy r1 = p000.AbstractC0978xb.f12102
            if (r0 != r1) goto L3e
            goto Le8
        L3e:
            uy r1 = p000.AbstractC0978xb.f12101
            if (r0 != r1) goto Ldf
            r0 = 0
            r1 = r0
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p000.fo0.f4052
            java.lang.Object r5 = r4.get(r9)
            boolean r6 = r5 instanceof p000.eo0
            if (r6 == 0) goto L90
            monitor-enter(r5)
            r4 = r5
            eo0 r4 = (p000.eo0) r4     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p000.eo0.f3620     // Catch: java.lang.Throwable -> L62
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Throwable -> L62
            uy r6 = p000.AbstractC0978xb.f12105     // Catch: java.lang.Throwable -> L62
            if (r4 != r6) goto L64
            uy r10 = p000.AbstractC0978xb.f12104     // Catch: java.lang.Throwable -> L62
            monitor-exit(r5)
        L5f:
            r0 = r10
            goto Ldf
        L62:
            r9 = move-exception
            goto L8e
        L64:
            r4 = r5
            eo0 r4 = (p000.eo0) r4     // Catch: java.lang.Throwable -> L62
            boolean r4 = r4.m1944()     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L71
            java.lang.Throwable r1 = r9.m2189(r10)     // Catch: java.lang.Throwable -> L62
        L71:
            r10 = r5
            eo0 r10 = (p000.eo0) r10     // Catch: java.lang.Throwable -> L62
            r10.m1942(r1)     // Catch: java.lang.Throwable -> L62
            r10 = r5
            eo0 r10 = (p000.eo0) r10     // Catch: java.lang.Throwable -> L62
            java.lang.Throwable r10 = r10.m1943()     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L81
            r0 = r10
        L81:
            monitor-exit(r5)
            if (r0 == 0) goto L8b
            eo0 r5 = (p000.eo0) r5
            s31 r10 = r5.f3621
            r9.m2172(r10, r0)
        L8b:
            uy r10 = p000.AbstractC0978xb.f12101
            goto L5f
        L8e:
            monitor-exit(r5)
            throw r9
        L90:
            boolean r6 = r5 instanceof p000.ml0
            if (r6 == 0) goto Ldc
            if (r1 != 0) goto L9a
            java.lang.Throwable r1 = r9.m2189(r10)
        L9a:
            r6 = r5
            ml0 r6 = (p000.ml0) r6
            boolean r7 = r6.mo1277()
            if (r7 == 0) goto Lc2
            s31 r7 = r9.m2163(r6)
            if (r7 != 0) goto Laa
            goto L44
        Laa:
            eo0 r8 = new eo0
            r8.<init>(r7, r1)
        Laf:
            boolean r5 = r4.compareAndSet(r9, r6, r8)
            if (r5 == 0) goto Lbb
            r9.m2172(r7, r1)
            uy r10 = p000.AbstractC0978xb.f12101
            goto L5f
        Lbb:
            java.lang.Object r5 = r4.get(r9)
            if (r5 == r6) goto Laf
            goto L44
        Lc2:
            om r4 = new om
            r4.<init>(r1, r2)
            java.lang.Object r4 = r9.m2178(r5, r4)
            uy r6 = p000.AbstractC0978xb.f12101
            if (r4 == r6) goto Ld5
            uy r5 = p000.AbstractC0978xb.f12103
            if (r4 == r5) goto L44
            r0 = r4
            goto Ldf
        Ld5:
            java.lang.String r9 = "Cannot happen in "
            p000.C1080.m7278(r5, r9)
            r9 = 0
            return r9
        Ldc:
            uy r10 = p000.AbstractC0978xb.f12104
            goto L5f
        Ldf:
            uy r10 = p000.AbstractC0978xb.f12101
            if (r0 != r10) goto Le4
            goto Le8
        Le4:
            uy r10 = p000.AbstractC0978xb.f12102
            if (r0 != r10) goto Le9
        Le8:
            return r3
        Le9:
            uy r10 = p000.AbstractC0978xb.f12104
            if (r0 != r10) goto Lee
            return r2
        Lee:
            r9.mo2181(r0)
            return r3
    }

    /* JADX INFO: renamed from: σ */
    public void mo2184(java.util.concurrent.CancellationException r1) {
            r0 = this;
            r0.m2183(r1)
            return
    }

    /* JADX INFO: renamed from: τ */
    public final boolean m2185(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.mo2170()
            if (r0 == 0) goto L7
            goto L23
        L7:
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.fo0.f4053
            java.lang.Object r2 = r1.get(r2)
            pf r2 = (p000.InterfaceC0685pf) r2
            if (r2 == 0) goto L25
            u31 r1 = p000.u31.f10580
            if (r2 != r1) goto L18
            goto L25
        L18:
            boolean r2 = r2.mo4515(r3)
            if (r2 != 0) goto L23
            if (r0 == 0) goto L21
            goto L23
        L21:
            r2 = 0
            return r2
        L23:
            r2 = 1
            return r2
        L25:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public java.lang.String mo2186() {
            r0 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public boolean mo2187(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L5
            goto L11
        L5:
            boolean r2 = r1.m2183(r2)
            if (r2 == 0) goto L13
            boolean r1 = r1.mo2161()
            if (r1 == 0) goto L13
        L11:
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public final void m2188(p000.ml0 r7, java.lang.Object r8) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4053
            java.lang.Object r1 = r0.get(r6)
            pf r1 = (p000.InterfaceC0685pf) r1
            if (r1 == 0) goto L12
            r1.mo1276()
            u31 r1 = p000.u31.f10580
            r0.set(r6, r1)
        L12:
            boolean r0 = r8 instanceof p000.C0628om
            r1 = 0
            if (r0 == 0) goto L1a
            om r8 = (p000.C0628om) r8
            goto L1b
        L1a:
            r8 = r1
        L1b:
            if (r8 == 0) goto L20
            java.lang.Throwable r8 = r8.f8149
            goto L21
        L20:
            r8 = r1
        L21:
            boolean r0 = r7 instanceof p000.co0
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L4c
            r0 = r7
            co0 r0 = (p000.co0) r0     // Catch: java.lang.Throwable -> L30
            r0.mo1281(r8)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r8 = move-exception
            pm r0 = new pm
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r8)
            r6.mo2165(r0)
            goto L9f
        L4c:
            s31 r7 = r7.mo1278()
            if (r7 == 0) goto L9f
            au0 r0 = new au0
            r4 = 1
            r0.<init>(r4)
            r7.m3387(r0, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C0478.f6063
            java.lang.Object r0 = r0.get(r7)
            r0.getClass()
            kotlinx.coroutines.internal.α r0 = (kotlinx.coroutines.internal.C0478) r0
        L66:
            boolean r4 = r0.equals(r7)
            if (r4 != 0) goto L9a
            boolean r4 = r0 instanceof p000.co0
            if (r4 == 0) goto L95
            r4 = r0
            co0 r4 = (p000.co0) r4     // Catch: java.lang.Throwable -> L77
            r4.mo1281(r8)     // Catch: java.lang.Throwable -> L77
            goto L95
        L77:
            r4 = move-exception
            if (r1 == 0) goto L7e
            p000.ln0.m3624(r1, r4)
            goto L95
        L7e:
            pm r1 = new pm
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
        L95:
            kotlinx.coroutines.internal.α r0 = r0.m3390()
            goto L66
        L9a:
            if (r1 == 0) goto L9f
            r6.mo2165(r1)
        L9f:
            return
    }

    /* JADX INFO: renamed from: ω */
    public final java.lang.Throwable m2189(java.lang.Object r4) {
            r3 = this;
            boolean r3 = r4 instanceof java.lang.Throwable
            if (r3 == 0) goto L7
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            return r4
        L7:
            fo0 r4 = (p000.fo0) r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.fo0.f4052
            java.lang.Object r3 = r3.get(r4)
            boolean r0 = r3 instanceof p000.eo0
            r1 = 0
            if (r0 == 0) goto L1c
            r0 = r3
            eo0 r0 = (p000.eo0) r0
            java.lang.Throwable r0 = r0.m1943()
            goto L2b
        L1c:
            boolean r0 = r3 instanceof p000.C0628om
            if (r0 == 0) goto L26
            r0 = r3
            om r0 = (p000.C0628om) r0
            java.lang.Throwable r0 = r0.f8149
            goto L2b
        L26:
            boolean r0 = r3 instanceof p000.ml0
            if (r0 != 0) goto L44
            r0 = r1
        L2b:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L32
            r1 = r0
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L32:
            if (r1 != 0) goto L43
            yn0 r1 = new yn0
            java.lang.String r3 = m2157(r3)
            java.lang.String r2 = "Parent job is "
            java.lang.String r3 = r2.concat(r3)
            r1.<init>(r3, r0, r4)
        L43:
            return r1
        L44:
            java.lang.String r4 = "Cannot be cancelling child in this state: "
            p000.C1080.m7278(r3, r4)
            r3 = 0
            return r3
    }
}
