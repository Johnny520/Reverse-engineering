package p000;

/* JADX INFO: renamed from: wc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0942wc implements p000.InterfaceC0546me {

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f11664 = null;

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f11665 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f11666 = null;

    /* JADX INFO: renamed from: ι */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f11667 = null;

    /* JADX INFO: renamed from: κ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11668 = null;

    /* JADX INFO: renamed from: λ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11669 = null;

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11670 = null;

    /* JADX INFO: renamed from: ν */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11671 = null;

    /* JADX INFO: renamed from: ξ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11672 = null;
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: ε */
    public final int f11673;

    static {
            java.lang.String r0 = "sendersAndCloseStatus$volatile"
            java.lang.Class<wc> r1 = p000.C0942wc.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            p000.C0942wc.f11664 = r0
            java.lang.String r0 = "receivers$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            p000.C0942wc.f11665 = r0
            java.lang.String r0 = "bufferEnd$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            p000.C0942wc.f11666 = r0
            java.lang.String r0 = "completedExpandBuffersAndPauseFlag$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            p000.C0942wc.f11667 = r0
            java.lang.String r0 = "sendSegment$volatile"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.C0942wc.f11668 = r0
            java.lang.String r0 = "receiveSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.C0942wc.f11669 = r0
            java.lang.String r0 = "bufferEndSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.C0942wc.f11670 = r0
            java.lang.String r0 = "_closeCause$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.C0942wc.f11671 = r0
            java.lang.String r0 = "closeHandler$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.C0942wc.f11672 = r0
            return
    }

    public C0942wc(int r9) {
            r8 = this;
            r8.<init>()
            r8.f11673 = r9
            if (r9 < 0) goto L44
            ve r0 = p000.AbstractC1016yc.f12556
            if (r9 == 0) goto L18
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r0) goto L12
            long r0 = (long) r9
            goto L1a
        L12:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1a
        L18:
            r0 = 0
        L1a:
            r8.bufferEnd$volatile = r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = p000.C0942wc.f11666
            long r0 = r9.get(r8)
            r8.completedExpandBuffersAndPauseFlag$volatile = r0
            ve r2 = new ve
            r5 = 0
            r7 = 3
            r3 = 0
            r6 = r8
            r2.<init>(r3, r5, r6, r7)
            r6.sendSegment$volatile = r2
            r6.receiveSegment$volatile = r2
            boolean r8 = r6.m6372()
            if (r8 == 0) goto L3d
            ve r2 = p000.AbstractC1016yc.f12556
            r2.getClass()
        L3d:
            r6.bufferEndSegment$volatile = r2
            uy r8 = p000.AbstractC1016yc.f12574
            r6._closeCause$volatile = r8
            return
        L44:
            java.lang.String r8 = "Invalid channel capacity: "
            java.lang.String r0 = ", should be >=0"
            java.lang.String r8 = p000.AbstractC0602nx.m4127(r8, r9, r0)
            p000.C1080.m7266(r8)
            r8 = 0
            throw r8
    }

    /* JADX INFO: renamed from: Β */
    public static boolean m6352(java.lang.Object r3) {
            boolean r0 = r3 instanceof p000.InterfaceC1017yd
            r1 = 0
            if (r0 == 0) goto L18
            yd r3 = (p000.InterfaceC1017yd) r3
            ve r0 = p000.AbstractC1016yc.f12556
            r0 = 0
            s62 r2 = p000.s62.f9751
            uy r0 = r3.mo78(r2, r0)
            if (r0 == 0) goto L17
            r3.mo90(r0)
            r3 = 1
            return r3
        L17:
            return r1
        L18:
            java.lang.String r0 = "Unexpected waiter: "
            p000.C1080.m7278(r3, r0)
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static final p000.C0906ve m6353(p000.C0942wc r11, long r12, p000.C0906ve r14) {
            ve r0 = p000.AbstractC1016yc.f12556
            xc r0 = p000.C0979xc.f12127
        L4:
            java.lang.Object r1 = p000.AbstractC0073bd.m884(r14, r12, r0)
            boolean r2 = p000.u81.m5808(r1)
            if (r2 != 0) goto L4a
            sr1 r2 = p000.u81.m5806(r1)
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.C0942wc.f11668
            java.lang.Object r4 = r3.get(r11)
            sr1 r4 = (p000.sr1) r4
            long r5 = r4.f10004
            long r7 = r2.f10004
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L23
            goto L4a
        L23:
            boolean r5 = r2.m5532()
            if (r5 != 0) goto L2a
            goto L4
        L2a:
            boolean r5 = r3.compareAndSet(r11, r4, r2)
            if (r5 == 0) goto L3a
            boolean r0 = r4.m5530()
            if (r0 == 0) goto L4a
            r4.m2977()
            goto L4a
        L3a:
            java.lang.Object r5 = r3.get(r11)
            if (r5 == r4) goto L2a
            boolean r3 = r2.m5530()
            if (r3 == 0) goto L12
            r2.m2977()
            goto L12
        L4a:
            boolean r0 = p000.u81.m5808(r1)
            r2 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C0942wc.f11665
            if (r0 == 0) goto L68
            r11.m6371()
            long r12 = r14.f10004
            int r0 = p000.AbstractC1016yc.f12557
            long r0 = (long) r0
            long r12 = r12 * r0
            long r0 = r3.get(r11)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto Laa
            r14.m2974()
            return r2
        L68:
            sr1 r14 = p000.u81.m5806(r1)
            ve r14 = (p000.C0906ve) r14
            long r0 = r14.f10004
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 <= 0) goto Lad
            int r12 = p000.AbstractC1016yc.f12557
            long r12 = (long) r12
            long r12 = r12 * r0
        L78:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.C0942wc.f11664
            long r7 = r4.get(r11)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r7
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L8a
            r6 = r11
            goto L9b
        L8a:
            r6 = 60
            long r9 = r7 >> r6
            int r9 = (int) r9
            long r9 = (long) r9
            long r9 = r9 << r6
            long r9 = r9 + r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = p000.C0942wc.f11664
            r6 = r11
            boolean r11 = r5.compareAndSet(r6, r7, r9)
            if (r11 == 0) goto Lab
        L9b:
            int r11 = p000.AbstractC1016yc.f12557
            long r11 = (long) r11
            long r0 = r0 * r11
            long r11 = r3.get(r6)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto Laa
            r14.m2974()
        Laa:
            return r2
        Lab:
            r11 = r6
            goto L78
        Lad:
            return r14
    }

    /* JADX INFO: renamed from: γ */
    public static final void m6354(p000.C0942wc r0, java.lang.Object r1, p000.C0015ae r2) {
            java.lang.Throwable r0 = r0.m6368()
            eo1 r1 = new eo1
            r1.<init>(r0)
            r2.mo75(r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final int m6355(p000.C0942wc r4, p000.C0906ve r5, int r6, java.lang.Object r7, long r8, java.lang.Object r10, boolean r11) {
            r5.m6201(r6, r7)
            if (r11 == 0) goto La
            int r4 = r4.m6359(r5, r6, r7, r8, r10, r11)
            return r4
        La:
            java.lang.Object r0 = r5.m6199(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2d
            boolean r0 = r4.m6361(r8)
            if (r0 == 0) goto L21
            uy r0 = p000.AbstractC1016yc.f12559
            boolean r0 = r5.m6198(r2, r6, r0)
            if (r0 == 0) goto L53
            return r1
        L21:
            if (r10 != 0) goto L25
            r4 = 3
            return r4
        L25:
            boolean r0 = r5.m6198(r2, r6, r10)
            if (r0 == 0) goto L53
            r4 = 2
            return r4
        L2d:
            boolean r3 = r0 instanceof p000.jb2
            if (r3 == 0) goto L53
            r5.m6201(r6, r2)
            boolean r4 = r4.m6357(r0, r7)
            if (r4 == 0) goto L41
            uy r4 = p000.AbstractC1016yc.f12564
            r5.m6202(r6, r4)
            r4 = 0
            return r4
        L41:
            uy r4 = p000.AbstractC1016yc.f12566
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r5.f11249
            int r8 = r6 * 2
            int r8 = r8 + r1
            java.lang.Object r7 = r7.getAndSet(r8, r4)
            if (r7 == r4) goto L51
            r5.m6200(r6, r1)
        L51:
            r4 = 5
            return r4
        L53:
            int r4 = r4.m6359(r5, r6, r7, r8, r10, r11)
            return r4
    }

    /* JADX INFO: renamed from: ρ */
    public static void m6356(p000.C0942wc r7) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11667
            r1 = 1
            long r1 = r0.addAndGet(r7, r1)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r1 = r1 & r3
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L1b
        L11:
            long r1 = r0.get(r7)
            long r1 = r1 & r3
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L1b
            goto L11
        L1b:
            return
    }

    @Override // p000.InterfaceC0546me
    public final p000.C0904vc iterator() {
            r1 = this;
            vc r0 = new vc
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.C0942wc.f11664
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L1e
            if (r2 == r3) goto L18
            goto L23
        L18:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L23
        L1e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L23:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "capacity="
            r2.<init>(r5)
            int r5 = r0.f11673
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            ve[] r2 = new p000.C0906ve[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.C0942wc.f11669
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.C0942wc.f11668
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.C0942wc.f11670
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L69:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()
            r8 = r4
            ve r8 = (p000.C0906ve) r8
            ve r9 = p000.AbstractC1016yc.f12556
            if (r8 == r9) goto L69
            r3.add(r4)
            goto L69
        L7e:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1b3
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L93
            goto Lad
        L93:
            r4 = r3
            ve r4 = (p000.C0906ve) r4
            long r8 = r4.f10004
        L98:
            java.lang.Object r4 = r2.next()
            r10 = r4
            ve r10 = (p000.C0906ve) r10
            long r10 = r10.f10004
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto La7
            r3 = r4
            r8 = r10
        La7:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L98
        Lad:
            ve r3 = (p000.C0906ve) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.C0942wc.f11665
            long r10 = r2.get(r0)
            long r12 = r0.m6369()
        Lb9:
            int r0 = p000.AbstractC1016yc.f12557
            r2 = r6
        Lbc:
            if (r2 >= r0) goto L18b
            long r8 = r3.f10004
            int r4 = p000.AbstractC1016yc.f12557
            long r14 = (long) r4
            long r8 = r8 * r14
            long r14 = (long) r2
            long r8 = r8 + r14
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 < 0) goto Lce
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 >= 0) goto L194
        Lce:
            java.lang.Object r14 = r3.m6199(r2)
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r3.f11249
            int r6 = r2 * 2
            java.lang.Object r6 = r15.get(r6)
            boolean r15 = r14 instanceof p000.InterfaceC1017yd
            if (r15 == 0) goto Lf2
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto Le8
            if (r4 < 0) goto Le8
            java.lang.String r4 = "receive"
            goto L155
        Le8:
            if (r4 >= 0) goto Lef
            if (r8 < 0) goto Lef
            java.lang.String r4 = "send"
            goto L155
        Lef:
            java.lang.String r4 = "cont"
            goto L155
        Lf2:
            boolean r4 = r14 instanceof p000.kb2
            if (r4 == 0) goto L10a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "EB("
            r4.<init>(r8)
            r4.append(r14)
            r8 = 41
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            goto L155
        L10a:
            uy r4 = p000.AbstractC1016yc.f12561
            boolean r4 = p000.ln0.m3626(r14, r4)
            if (r4 != 0) goto L153
            uy r4 = p000.AbstractC1016yc.f12562
            boolean r4 = p000.ln0.m3626(r14, r4)
            if (r4 == 0) goto L11b
            goto L153
        L11b:
            if (r14 == 0) goto L186
            uy r4 = p000.AbstractC1016yc.f12560
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L186
            uy r4 = p000.AbstractC1016yc.f12564
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L186
            uy r4 = p000.AbstractC1016yc.f12563
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L186
            uy r4 = p000.AbstractC1016yc.f12566
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L186
            uy r4 = p000.AbstractC1016yc.f12565
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L186
            uy r4 = p000.AbstractC1016yc.f12567
            boolean r4 = r14.equals(r4)
            if (r4 == 0) goto L14e
            goto L186
        L14e:
            java.lang.String r4 = r14.toString()
            goto L155
        L153:
            java.lang.String r4 = "resuming_sender"
        L155:
            if (r6 == 0) goto L174
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "("
            r8.<init>(r9)
            r8.append(r4)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r4 = "),"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r1.append(r4)
            goto L186
        L174:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r1.append(r4)
        L186:
            int r2 = r2 + 1
            r6 = 0
            goto Lbc
        L18b:
            jo r0 = r3.m2975()
            r3 = r0
            ve r3 = (p000.C0906ve) r3
            if (r3 != 0) goto L1b0
        L194:
            char r0 = p000.q02.m4672(r1)
            if (r0 != r5) goto L1a6
            int r0 = r1.length()
            int r0 = r0 - r7
            java.lang.StringBuilder r0 = r1.deleteCharAt(r0)
            r0.getClass()
        L1a6:
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L1b0:
            r6 = 0
            goto Lb9
        L1b3:
            p000.C1080.m7277()
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Α */
    public final boolean m6357(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            boolean r3 = r4 instanceof p000.C0904vc
            r0 = 0
            r1 = 1
            r2 = 0
            if (r3 == 0) goto L26
            vc r4 = (p000.C0904vc) r4
            ae r3 = r4.f11227
            r3.getClass()
            r4.f11227 = r2
            r4.f11226 = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            wc r4 = r4.f11228
            r4.getClass()
            ve r4 = p000.AbstractC1016yc.f12556
            uy r4 = r3.mo78(r5, r2)
            if (r4 == 0) goto L25
            r3.mo90(r4)
            return r1
        L25:
            return r0
        L26:
            boolean r3 = r4 instanceof p000.InterfaceC1017yd
            if (r3 == 0) goto L39
            yd r4 = (p000.InterfaceC1017yd) r4
            ve r3 = p000.AbstractC1016yc.f12556
            uy r3 = r4.mo78(r5, r2)
            if (r3 == 0) goto L38
            r4.mo90(r3)
            return r1
        L38:
            return r0
        L39:
            java.lang.String r3 = "Unexpected receiver type: "
            p000.C1080.m7278(r4, r3)
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public final java.lang.Object m6358(p000.C0906ve r9, int r10, long r11, java.lang.Object r13) {
            r8 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r9.f11249
            java.lang.Object r1 = r9.m6199(r10)
            r2 = 0
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = p000.C0942wc.f11664
            if (r1 != 0) goto L2a
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L43
            if (r13 != 0) goto L1e
            uy r8 = p000.AbstractC1016yc.f12569
            return r8
        L1e:
            boolean r1 = r9.m6198(r1, r10, r13)
            if (r1 == 0) goto L43
            r8.m6365()
            uy r8 = p000.AbstractC1016yc.f12568
            return r8
        L2a:
            uy r6 = p000.AbstractC1016yc.f12559
            if (r1 != r6) goto L43
            uy r6 = p000.AbstractC1016yc.f12564
            boolean r1 = r9.m6198(r1, r10, r6)
            if (r1 == 0) goto L43
            r8.m6365()
            int r8 = r10 * 2
            java.lang.Object r8 = r0.get(r8)
            r9.m6201(r10, r2)
            return r8
        L43:
            java.lang.Object r1 = r9.m6199(r10)
            if (r1 == 0) goto Lb9
            uy r6 = p000.AbstractC1016yc.f12560
            if (r1 != r6) goto L4e
            goto Lb9
        L4e:
            uy r6 = p000.AbstractC1016yc.f12559
            if (r1 != r6) goto L67
            uy r6 = p000.AbstractC1016yc.f12564
            boolean r1 = r9.m6198(r1, r10, r6)
            if (r1 == 0) goto L43
            r8.m6365()
            int r8 = r10 * 2
            java.lang.Object r8 = r0.get(r8)
            r9.m6201(r10, r2)
            return r8
        L67:
            uy r6 = p000.AbstractC1016yc.f12565
            if (r1 != r6) goto L6e
            uy r8 = p000.AbstractC1016yc.f12570
            return r8
        L6e:
            uy r7 = p000.AbstractC1016yc.f12563
            if (r1 != r7) goto L75
            uy r8 = p000.AbstractC1016yc.f12570
            return r8
        L75:
            uy r7 = p000.AbstractC1016yc.f12567
            if (r1 != r7) goto L7f
            r8.m6365()
            uy r8 = p000.AbstractC1016yc.f12570
            return r8
        L7f:
            uy r7 = p000.AbstractC1016yc.f12562
            if (r1 == r7) goto L43
            uy r7 = p000.AbstractC1016yc.f12561
            boolean r7 = r9.m6198(r1, r10, r7)
            if (r7 == 0) goto L43
            boolean r11 = r1 instanceof p000.kb2
            if (r11 == 0) goto L93
            kb2 r1 = (p000.kb2) r1
            jb2 r1 = r1.f5844
        L93:
            boolean r12 = m6352(r1)
            if (r12 == 0) goto Lab
            uy r11 = p000.AbstractC1016yc.f12564
            r9.m6202(r10, r11)
            r8.m6365()
            int r8 = r10 * 2
            java.lang.Object r8 = r0.get(r8)
            r9.m6201(r10, r2)
            return r8
        Lab:
            r9.m6202(r10, r6)
            r9.m5531()
            if (r11 == 0) goto Lb6
            r8.m6365()
        Lb6:
            uy r8 = p000.AbstractC1016yc.f12570
            return r8
        Lb9:
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 >= 0) goto Ld0
            uy r6 = p000.AbstractC1016yc.f12563
            boolean r1 = r9.m6198(r1, r10, r6)
            if (r1 == 0) goto L43
            r8.m6365()
            uy r8 = p000.AbstractC1016yc.f12570
            return r8
        Ld0:
            if (r13 != 0) goto Ld5
            uy r8 = p000.AbstractC1016yc.f12569
            return r8
        Ld5:
            boolean r1 = r9.m6198(r1, r10, r13)
            if (r1 == 0) goto L43
            r8.m6365()
            uy r8 = p000.AbstractC1016yc.f12568
            return r8
    }

    /* JADX INFO: renamed from: Δ */
    public final int m6359(p000.C0906ve r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.m6199(r7)
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L34
            boolean r0 = r5.m6361(r9)
            if (r0 == 0) goto L1a
            if (r12 != 0) goto L1a
            uy r0 = p000.AbstractC1016yc.f12559
            boolean r0 = r6.m6198(r3, r7, r0)
            if (r0 == 0) goto L0
            goto L40
        L1a:
            if (r12 == 0) goto L28
            uy r0 = p000.AbstractC1016yc.f12565
            boolean r0 = r6.m6198(r3, r7, r0)
            if (r0 == 0) goto L0
            r6.m5531()
            return r1
        L28:
            if (r11 != 0) goto L2c
            r5 = 3
            return r5
        L2c:
            boolean r0 = r6.m6198(r3, r7, r11)
            if (r0 == 0) goto L0
            r5 = 2
            return r5
        L34:
            uy r4 = p000.AbstractC1016yc.f12560
            if (r0 != r4) goto L41
            uy r1 = p000.AbstractC1016yc.f12559
            boolean r0 = r6.m6198(r0, r7, r1)
            if (r0 == 0) goto L0
        L40:
            return r2
        L41:
            uy r9 = p000.AbstractC1016yc.f12566
            r10 = 5
            if (r0 != r9) goto L4a
            r6.m6201(r7, r3)
            return r10
        L4a:
            uy r11 = p000.AbstractC1016yc.f12563
            if (r0 != r11) goto L52
            r6.m6201(r7, r3)
            return r10
        L52:
            uy r11 = p000.AbstractC1016yc.f12567
            if (r0 != r11) goto L5d
            r6.m6201(r7, r3)
            r5.m6371()
            return r1
        L5d:
            r6.m6201(r7, r3)
            boolean r11 = r0 instanceof p000.kb2
            if (r11 == 0) goto L68
            kb2 r0 = (p000.kb2) r0
            jb2 r0 = r0.f5844
        L68:
            boolean r5 = r5.m6357(r0, r8)
            if (r5 == 0) goto L75
            uy r5 = p000.AbstractC1016yc.f12564
            r6.m6202(r7, r5)
            r5 = 0
            return r5
        L75:
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.f11249
            int r8 = r7 * 2
            int r8 = r8 + r2
            java.lang.Object r5 = r5.getAndSet(r8, r9)
            if (r5 == r9) goto L83
            r6.m6200(r7, r2)
        L83:
            return r10
    }

    /* JADX INFO: renamed from: Ε */
    public final void m6360(long r19) {
            r18 = this;
            r1 = r18
            boolean r0 = r1.m6372()
            if (r0 == 0) goto La
            goto L78
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p000.C0942wc.f11666
            long r2 = r6.get(r1)
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 <= 0) goto L8c
            int r0 = p000.AbstractC1016yc.f12558
            r7 = 0
            r2 = r7
        L18:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C0942wc.f11667
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r2 >= r0) goto L3a
            long r4 = r6.get(r1)
            long r10 = r3.get(r1)
            long r8 = r8 & r10
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 != 0) goto L37
            long r8 = r6.get(r1)
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 != 0) goto L37
            goto L78
        L37:
            int r2 = r2 + 1
            goto L18
        L3a:
            r0 = r3
        L3b:
            long r2 = r0.get(r1)
            long r4 = r2 & r8
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r4 = r4 + r10
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L89
        L4a:
            long r2 = r6.get(r1)
            r4 = r2
            long r2 = r0.get(r1)
            long r12 = r2 & r8
            long r14 = r2 & r10
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L5f
            r14 = 1
            goto L60
        L5f:
            r14 = r7
        L60:
            int r15 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r15 != 0) goto L7c
            long r15 = r6.get(r1)
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 != 0) goto L7c
        L6c:
            long r2 = r0.get(r1)
            long r4 = r2 & r8
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L79
        L78:
            return
        L79:
            r1 = r18
            goto L6c
        L7c:
            if (r14 != 0) goto L86
            long r4 = r10 + r12
            r1 = r18
            r0.compareAndSet(r1, r2, r4)
            goto L4a
        L86:
            r1 = r18
            goto L4a
        L89:
            r1 = r18
            goto L3b
        L8c:
            r1 = r18
            goto La
    }

    @Override // p000.qs1
    /* JADX INFO: renamed from: α */
    public java.lang.Object mo3384(p000.InterfaceC0631op r24, java.lang.Object r25) {
            r23 = this;
            r0 = r23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = p000.C0942wc.f11668
            java.lang.Object r1 = r8.get(r0)
            ve r1 = (p000.C0906ve) r1
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = p000.C0942wc.f11664
            long r2 = r9.getAndIncrement(r0)
            r10 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r2 & r10
            r12 = 0
            boolean r7 = r0.m6370(r2, r12)
            int r13 = p000.AbstractC1016yc.f12557
            long r2 = (long) r13
            long r14 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            r16 = r10
            long r10 = r1.f10004
            int r3 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            cq r10 = p000.EnumC0184cq.f2716
            s62 r11 = p000.s62.f9751
            if (r3 == 0) goto L40
            ve r3 = m6353(r0, r14, r1)
            if (r3 != 0) goto L3f
            if (r7 == 0) goto La
            java.lang.Object r0 = r23.m6374(r24, r25)
            if (r0 != r10) goto L157
            return r0
        L3f:
            r1 = r3
        L40:
            r6 = 0
            r3 = r25
            int r6 = m6355(r0, r1, r2, r3, r4, r6, r7)
            if (r6 == 0) goto L158
            r14 = 1
            if (r6 == r14) goto L157
            r15 = 2
            if (r6 == r15) goto L149
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C0942wc.f11665
            r7 = 5
            r12 = 4
            r15 = 3
            if (r6 == r15) goto L71
            if (r6 == r12) goto L5f
            if (r6 == r7) goto L5b
            goto La
        L5b:
            r1.m2974()
            goto La
        L5f:
            long r2 = r3.get(r0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L6a
            r1.m2974()
        L6a:
            java.lang.Object r0 = r23.m6374(r24, r25)
            if (r0 != r10) goto L157
            return r0
        L71:
            op r6 = p000.AbstractC0978xb.m6563(r24)
            ae r6 = p000.AbstractC0978xb.m6559(r6)
            r18 = r7
            r7 = 0
            r19 = r3
            r15 = r18
            r3 = r25
            int r7 = m6355(r0, r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Lc4
            if (r7 == 0) goto L136
            if (r7 == r14) goto L114
            r14 = 2
            if (r7 == r14) goto L131
            if (r7 == r12) goto L123
            java.lang.String r13 = "unexpected"
            if (r7 != r15) goto L11c
            r1.m2974()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r1 = r8.get(r0)     // Catch: java.lang.Throwable -> Lc4
            ve r1 = (p000.C0906ve) r1     // Catch: java.lang.Throwable -> Lc4
        L9c:
            long r4 = r9.getAndIncrement(r0)     // Catch: java.lang.Throwable -> Lc4
            long r7 = r4 & r16
            r14 = 0
            boolean r2 = r0.m6370(r4, r14)     // Catch: java.lang.Throwable -> Lc4
            int r4 = p000.AbstractC1016yc.f12557     // Catch: java.lang.Throwable -> Lc4
            long r14 = (long) r4     // Catch: java.lang.Throwable -> Lc4
            r20 = r13
            long r12 = r7 / r14
            long r14 = r7 % r14
            int r5 = (int) r14     // Catch: java.lang.Throwable -> Lc4
            long r14 = r1.f10004     // Catch: java.lang.Throwable -> Lc4
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 == 0) goto Lcd
            ve r12 = m6353(r0, r12, r1)     // Catch: java.lang.Throwable -> Lc4
            if (r12 != 0) goto Lcc
            if (r2 == 0) goto Lc7
        Lbf:
            m6354(r0, r3, r6)     // Catch: java.lang.Throwable -> Lc4
            goto L13a
        Lc4:
            r0 = move-exception
            goto L145
        Lc7:
            r13 = r20
            r12 = 4
            r15 = 5
            goto L9c
        Lcc:
            r1 = r12
        Lcd:
            r21 = r7
            r7 = r2
            r8 = r4
            r2 = r5
            r4 = r21
            int r12 = m6355(r0, r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Lc4
            if (r12 == 0) goto L118
            r13 = 1
            if (r12 == r13) goto L114
            r14 = 2
            if (r12 == r14) goto L108
            r15 = 3
            if (r12 == r15) goto L100
            r2 = 4
            if (r12 == r2) goto Lf2
            r7 = 5
            if (r12 == r7) goto Lea
            goto Led
        Lea:
            r1.m2974()     // Catch: java.lang.Throwable -> Lc4
        Led:
            r12 = r2
            r15 = r7
            r13 = r20
            goto L9c
        Lf2:
            r2 = r19
            long r7 = r2.get(r0)     // Catch: java.lang.Throwable -> Lc4
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 >= 0) goto Lbf
            r1.m2974()     // Catch: java.lang.Throwable -> Lc4
            goto Lbf
        L100:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc4
            r1 = r20
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            throw r0     // Catch: java.lang.Throwable -> Lc4
        L108:
            if (r7 == 0) goto L10e
            r1.m5531()     // Catch: java.lang.Throwable -> Lc4
            goto Lbf
        L10e:
            int r5 = r2 + r8
            r6.mo70(r1, r5)     // Catch: java.lang.Throwable -> Lc4
            goto L13a
        L114:
            r6.mo75(r11)     // Catch: java.lang.Throwable -> Lc4
            goto L13a
        L118:
            r1.m2974()     // Catch: java.lang.Throwable -> Lc4
            goto L114
        L11c:
            r1 = r13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            throw r0     // Catch: java.lang.Throwable -> Lc4
        L123:
            r2 = r19
            long r7 = r2.get(r0)     // Catch: java.lang.Throwable -> Lc4
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 >= 0) goto Lbf
            r1.m2974()     // Catch: java.lang.Throwable -> Lc4
            goto Lbf
        L131:
            int r2 = r2 + r13
            r6.mo70(r1, r2)     // Catch: java.lang.Throwable -> Lc4
            goto L13a
        L136:
            r1.m2974()     // Catch: java.lang.Throwable -> Lc4
            goto L114
        L13a:
            java.lang.Object r0 = r6.m86()
            if (r0 != r10) goto L141
            goto L142
        L141:
            r0 = r11
        L142:
            if (r0 != r10) goto L157
            return r0
        L145:
            r6.m66()
            throw r0
        L149:
            r3 = r25
            if (r7 == 0) goto L157
            r1.m5531()
            java.lang.Object r0 = r23.m6374(r24, r25)
            if (r0 != r10) goto L157
            return r0
        L157:
            return r11
        L158:
            r1.m2974()
            return r11
    }

    @Override // p000.InterfaceC0546me
    /* JADX INFO: renamed from: ε */
    public final java.lang.Object mo3816() {
            r14 = this;
            ue r0 = p000.pd2.f8518
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.C0942wc.f11665
            long r2 = r1.get(r14)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.C0942wc.f11664
            long r5 = r4.get(r14)
            r7 = 1
            boolean r8 = r14.m6370(r5, r7)
            if (r8 == 0) goto L1f
            java.lang.Throwable r14 = r14.m6367()
            te r0 = new te
            r0.<init>(r14)
            return r0
        L1f:
            r8 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r5 = r5 & r8
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L2a
            return r0
        L2a:
            uy r13 = p000.AbstractC1016yc.f12566
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.C0942wc.f11669
            java.lang.Object r2 = r2.get(r14)
            ve r2 = (p000.C0906ve) r2
        L34:
            long r5 = r4.get(r14)
            boolean r3 = r14.m6370(r5, r7)
            if (r3 == 0) goto L48
            java.lang.Throwable r14 = r14.m6367()
            te r0 = new te
            r0.<init>(r14)
            return r0
        L48:
            long r11 = r1.getAndIncrement(r14)
            int r3 = p000.AbstractC1016yc.f12557
            long r5 = (long) r3
            long r8 = r11 / r5
            long r5 = r11 % r5
            int r10 = (int) r5
            long r5 = r2.f10004
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L64
            ve r3 = r14.m6366(r8, r2)
            if (r3 != 0) goto L61
            goto L34
        L61:
            r9 = r3
        L62:
            r8 = r14
            goto L66
        L64:
            r9 = r2
            goto L62
        L66:
            java.lang.Object r14 = r8.m6358(r9, r10, r11, r13)
            r2 = r9
            uy r3 = p000.AbstractC1016yc.f12568
            if (r14 != r3) goto L83
            boolean r14 = r13 instanceof p000.jb2
            if (r14 == 0) goto L76
            jb2 r13 = (p000.jb2) r13
            goto L77
        L76:
            r13 = 0
        L77:
            if (r13 == 0) goto L7c
            r13.mo70(r2, r10)
        L7c:
            r8.m6360(r11)
            r2.m5531()
            return r0
        L83:
            uy r3 = p000.AbstractC1016yc.f12570
            if (r14 != r3) goto L94
            long r5 = r8.m6369()
            int r14 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r14 >= 0) goto L92
            r2.m2974()
        L92:
            r14 = r8
            goto L34
        L94:
            uy r0 = p000.AbstractC1016yc.f12569
            if (r14 == r0) goto L9c
            r2.m2974()
            return r14
        L9c:
            java.lang.String r14 = "unexpected"
            p000.C1080.m7279(r14)
            r14 = 0
            return r14
    }

    /* JADX INFO: renamed from: ζ */
    public final boolean m6361(long r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11666
            long r0 = r0.get(r4)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11665
            long r0 = r0.get(r4)
            int r4 = r4.f11673
            long r2 = (long) r4
            long r0 = r0 + r2
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
            goto L1b
        L19:
            r4 = 0
            return r4
        L1b:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: η */
    public final boolean m6362(java.lang.Throwable r13, boolean r14) {
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C0942wc.f11664
            r9 = 1
            if (r14 == 0) goto L26
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L26
            long r7 = r5 & r1
            ve r4 = p000.AbstractC1016yc.f12556
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r12 = r3.compareAndSet(r4, r5, r7)
            if (r12 == 0) goto L24
            goto L27
        L24:
            r12 = r4
            goto Lc
        L26:
            r4 = r12
        L27:
            uy r12 = p000.AbstractC1016yc.f12574
        L29:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.C0942wc.f11671
            boolean r6 = r5.compareAndSet(r4, r12, r13)
            if (r6 == 0) goto L33
            r10 = r9
            goto L3b
        L33:
            java.lang.Object r5 = r5.get(r4)
            if (r5 == r12) goto L29
            r12 = 0
            r10 = r12
        L3b:
            r11 = 3
            if (r14 == 0) goto L4e
        L3e:
            long r5 = r3.get(r4)
            long r12 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r12
            boolean r12 = r3.compareAndSet(r4, r5, r7)
            if (r12 == 0) goto L3e
            goto L6b
        L4e:
            long r5 = r3.get(r4)
            long r12 = r5 >> r0
            int r12 = (int) r12
            if (r12 == 0) goto L60
            if (r12 == r9) goto L5a
            goto L6b
        L5a:
            long r12 = r5 & r1
            long r7 = (long) r11
        L5d:
            long r7 = r7 << r0
            long r7 = r7 + r12
            goto L65
        L60:
            long r12 = r5 & r1
            r14 = 2
            long r7 = (long) r14
            goto L5d
        L65:
            boolean r12 = r3.compareAndSet(r4, r5, r7)
            if (r12 == 0) goto L4e
        L6b:
            r4.m6371()
            if (r10 == 0) goto L9a
        L70:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p000.C0942wc.f11672
            java.lang.Object r13 = r12.get(r4)
            if (r13 != 0) goto L7b
            uy r14 = p000.AbstractC1016yc.f12572
            goto L7d
        L7b:
            uy r14 = p000.AbstractC1016yc.f12573
        L7d:
            boolean r0 = r12.compareAndSet(r4, r13, r14)
            if (r0 == 0) goto L93
            if (r13 != 0) goto L86
            goto L9a
        L86:
            p000.h62.m2394(r9, r13)
            a80 r13 = (p000.a80) r13
            java.lang.Throwable r12 = r4.m6367()
            r13.invoke(r12)
            return r10
        L93:
            java.lang.Object r0 = r12.get(r4)
            if (r0 == r13) goto L7d
            goto L70
        L9a:
            return r10
    }

    /* JADX INFO: renamed from: θ */
    public final p000.C0906ve m6363(long r13) {
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0942wc.f11670
            java.lang.Object r0 = r0.get(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0942wc.f11668
            java.lang.Object r1 = r1.get(r12)
            ve r1 = (p000.C0906ve) r1
            long r2 = r1.f10004
            r4 = r0
            ve r4 = (p000.C0906ve) r4
            long r4 = r4.f10004
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r0 = r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0942wc.f11669
            java.lang.Object r1 = r1.get(r12)
            ve r1 = (p000.C0906ve) r1
            long r2 = r1.f10004
            r4 = r0
            ve r4 = (p000.C0906ve) r4
            long r4 = r4.f10004
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2e
            r0 = r1
        L2e:
            jo r0 = (p000.AbstractC0439jo) r0
        L30:
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.AbstractC0439jo.f5529
            java.lang.Object r2 = r1.get(r0)
            uy r3 = p000.AbstractC0073bd.f1648
            r4 = 0
            if (r2 != r3) goto L3f
            goto L49
        L3f:
            jo r2 = (p000.AbstractC0439jo) r2
            if (r2 != 0) goto L12f
        L43:
            boolean r2 = r1.compareAndSet(r0, r4, r3)
            if (r2 == 0) goto L127
        L49:
            ve r0 = (p000.C0906ve) r0
            boolean r1 = r12.mo3386()
            r2 = 1
            r3 = -1
            if (r1 == 0) goto La1
            r1 = r0
        L54:
            int r5 = p000.AbstractC1016yc.f12557
            int r5 = r5 - r2
        L57:
            r6 = -1
            if (r3 >= r5) goto L8d
            long r8 = r1.f10004
            int r10 = p000.AbstractC1016yc.f12557
            long r10 = (long) r10
            long r8 = r8 * r10
            long r10 = (long) r5
            long r8 = r8 + r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = p000.C0942wc.f11665
            long r10 = r10.get(r12)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto L6f
        L6d:
            r8 = r6
            goto L9a
        L6f:
            java.lang.Object r10 = r1.m6199(r5)
            if (r10 == 0) goto L7f
            uy r11 = p000.AbstractC1016yc.f12560
            if (r10 != r11) goto L7a
            goto L7f
        L7a:
            uy r11 = p000.AbstractC1016yc.f12559
            if (r10 != r11) goto L8a
            goto L9a
        L7f:
            uy r11 = p000.AbstractC1016yc.f12567
            boolean r10 = r1.m6198(r10, r5, r11)
            if (r10 == 0) goto L6f
            r1.m5531()
        L8a:
            int r5 = r5 + (-1)
            goto L57
        L8d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.AbstractC0439jo.f5530
            java.lang.Object r1 = r5.get(r1)
            jo r1 = (p000.AbstractC0439jo) r1
            ve r1 = (p000.C0906ve) r1
            if (r1 != 0) goto L54
            goto L6d
        L9a:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto La1
            r12.m6364(r8)
        La1:
            r1 = r0
        La2:
            if (r1 == 0) goto L105
            int r5 = p000.AbstractC1016yc.f12557
            int r5 = r5 - r2
        La7:
            if (r3 >= r5) goto Lfa
            long r6 = r1.f10004
            int r8 = p000.AbstractC1016yc.f12557
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r5
            long r6 = r6 + r8
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 < 0) goto L105
        Lb5:
            java.lang.Object r6 = r1.m6199(r5)
            if (r6 == 0) goto Lec
            uy r7 = p000.AbstractC1016yc.f12560
            if (r6 != r7) goto Lc0
            goto Lec
        Lc0:
            boolean r7 = r6 instanceof p000.kb2
            if (r7 == 0) goto Ld8
            uy r7 = p000.AbstractC1016yc.f12567
            boolean r7 = r1.m6198(r6, r5, r7)
            if (r7 == 0) goto Lb5
            kb2 r6 = (p000.kb2) r6
            jb2 r6 = r6.f5844
            java.lang.Object r4 = p000.jx0.m3032(r4, r6)
            r1.m6200(r5, r2)
            goto Lf7
        Ld8:
            boolean r7 = r6 instanceof p000.jb2
            if (r7 == 0) goto Lf7
            uy r7 = p000.AbstractC1016yc.f12567
            boolean r7 = r1.m6198(r6, r5, r7)
            if (r7 == 0) goto Lb5
            java.lang.Object r4 = p000.jx0.m3032(r4, r6)
            r1.m6200(r5, r2)
            goto Lf7
        Lec:
            uy r7 = p000.AbstractC1016yc.f12567
            boolean r6 = r1.m6198(r6, r5, r7)
            if (r6 == 0) goto Lb5
            r1.m5531()
        Lf7:
            int r5 = r5 + (-1)
            goto La7
        Lfa:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.AbstractC0439jo.f5530
            java.lang.Object r1 = r5.get(r1)
            jo r1 = (p000.AbstractC0439jo) r1
            ve r1 = (p000.C0906ve) r1
            goto La2
        L105:
            if (r4 == 0) goto L126
            boolean r13 = r4 instanceof java.util.ArrayList
            if (r13 != 0) goto L111
            jb2 r4 = (p000.jb2) r4
            r12.m6375(r4, r2)
            return r0
        L111:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r13 = r4.size()
            int r13 = r13 - r2
        L118:
            if (r3 >= r13) goto L126
            java.lang.Object r14 = r4.get(r13)
            jb2 r14 = (p000.jb2) r14
            r12.m6375(r14, r2)
            int r13 = r13 + (-1)
            goto L118
        L126:
            return r0
        L127:
            java.lang.Object r2 = r1.get(r0)
            if (r2 == 0) goto L43
            goto L30
        L12f:
            r0 = r2
            goto L30
    }

    /* JADX INFO: renamed from: ι */
    public final void m6364(long r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0942wc.f11669
            java.lang.Object r0 = r0.get(r9)
            ve r0 = (p000.C0906ve) r0
        L8:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.C0942wc.f11665
            long r3 = r1.get(r9)
            int r2 = r9.f11673
            long r5 = (long) r2
            long r5 = r5 + r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.C0942wc.f11666
            long r7 = r2.get(r9)
            long r5 = java.lang.Math.max(r5, r7)
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L21
            return
        L21:
            r5 = 1
            long r5 = r5 + r3
            r2 = r9
            boolean r9 = r1.compareAndSet(r2, r3, r5)
            if (r9 == 0) goto L5f
            int r9 = p000.AbstractC1016yc.f12557
            long r5 = (long) r9
            long r7 = r3 / r5
            long r5 = r3 % r5
            int r9 = (int) r5
            long r5 = r0.f10004
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L41
            ve r1 = r2.m6366(r7, r0)
            if (r1 != 0) goto L40
            goto L5f
        L40:
            r0 = r1
        L41:
            r7 = 0
            r5 = r3
            r4 = r9
            r3 = r0
            java.lang.Object r9 = r2.m6358(r3, r4, r5, r7)
            uy r0 = p000.AbstractC1016yc.f12570
            if (r9 != r0) goto L59
            long r0 = r2.m6369()
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 >= 0) goto L5c
            r3.m2974()
            goto L5c
        L59:
            r3.m2974()
        L5c:
            r9 = r2
            r0 = r3
            goto L8
        L5f:
            r9 = r2
            goto L8
    }

    /* JADX INFO: renamed from: κ */
    public final void m6365() {
            r15 = this;
            boolean r0 = r15.m6372()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p000.C0942wc.f11670
            java.lang.Object r0 = r6.get(r15)
            ve r0 = (p000.C0906ve) r0
            r7 = r0
        L10:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11666
            long r8 = r0.getAndIncrement(r15)
            int r0 = p000.AbstractC1016yc.f12557
            long r2 = (long) r0
            long r2 = r8 / r2
            long r4 = r15.m6369()
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 > 0) goto L36
            long r4 = r7.f10004
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L32
            jo r0 = r7.m2975()
            if (r0 == 0) goto L32
            r15.m6373(r2, r7)
        L32:
            m6356(r15)
            return
        L36:
            long r4 = r7.f10004
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld3
            xc r0 = p000.C0979xc.f12127
        L3e:
            java.lang.Object r4 = p000.AbstractC0073bd.m884(r7, r2, r0)
            boolean r5 = p000.u81.m5808(r4)
            if (r5 != 0) goto L82
            sr1 r5 = p000.u81.m5806(r4)
        L4c:
            java.lang.Object r10 = r6.get(r15)
            sr1 r10 = (p000.sr1) r10
            long r11 = r10.f10004
            long r13 = r5.f10004
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L5b
            goto L82
        L5b:
            boolean r11 = r5.m5532()
            if (r11 != 0) goto L62
            goto L3e
        L62:
            boolean r11 = r6.compareAndSet(r15, r10, r5)
            if (r11 == 0) goto L72
            boolean r0 = r10.m5530()
            if (r0 == 0) goto L82
            r10.m2977()
            goto L82
        L72:
            java.lang.Object r11 = r6.get(r15)
            if (r11 == r10) goto L62
            boolean r10 = r5.m5530()
            if (r10 == 0) goto L4c
            r5.m2977()
            goto L4c
        L82:
            boolean r0 = p000.u81.m5808(r4)
            r10 = 0
            if (r0 == 0) goto L93
            r15.m6371()
            r15.m6373(r2, r7)
            m6356(r15)
            goto Lce
        L93:
            sr1 r0 = p000.u81.m5806(r4)
            ve r0 = (p000.C0906ve) r0
            long r4 = r0.f10004
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lcd
            r2 = 1
            long r2 = r2 + r8
            int r0 = p000.AbstractC1016yc.f12557
            long r11 = (long) r0
            long r4 = r4 * r11
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11666
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto Lc9
            long r4 = r4 - r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11667
            long r2 = r0.addAndGet(r15, r4)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r2 = r2 & r4
            r11 = 0
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto Lce
        Lbf:
            long r2 = r0.get(r15)
            long r2 = r2 & r4
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto Lce
            goto Lbf
        Lc9:
            m6356(r15)
            goto Lce
        Lcd:
            r10 = r0
        Lce:
            if (r10 != 0) goto Ld2
            goto L10
        Ld2:
            r7 = r10
        Ld3:
            int r0 = p000.AbstractC1016yc.f12557
            long r2 = (long) r0
            long r2 = r8 % r2
            int r0 = (int) r2
            java.lang.Object r2 = r7.m6199(r0)
            boolean r3 = r2 instanceof p000.jb2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.C0942wc.f11665
            if (r3 == 0) goto L109
            long r10 = r4.get(r15)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto L109
            uy r3 = p000.AbstractC1016yc.f12562
            boolean r3 = r7.m6198(r2, r0, r3)
            if (r3 == 0) goto L109
            boolean r2 = m6352(r2)
            if (r2 == 0) goto L100
            uy r2 = p000.AbstractC1016yc.f12559
            r7.m6202(r0, r2)
            goto L17b
        L100:
            uy r2 = p000.AbstractC1016yc.f12565
            r7.m6202(r0, r2)
            r7.m5531()
            goto L149
        L109:
            java.lang.Object r2 = r7.m6199(r0)
            boolean r3 = r2 instanceof p000.jb2
            if (r3 == 0) goto L145
            long r10 = r4.get(r15)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 >= 0) goto L128
            kb2 r3 = new kb2
            r5 = r2
            jb2 r5 = (p000.jb2) r5
            r3.<init>(r5)
            boolean r2 = r7.m6198(r2, r0, r3)
            if (r2 == 0) goto L109
            goto L17b
        L128:
            uy r3 = p000.AbstractC1016yc.f12562
            boolean r3 = r7.m6198(r2, r0, r3)
            if (r3 == 0) goto L109
            boolean r2 = m6352(r2)
            if (r2 == 0) goto L13c
            uy r2 = p000.AbstractC1016yc.f12559
            r7.m6202(r0, r2)
            goto L17b
        L13c:
            uy r2 = p000.AbstractC1016yc.f12565
            r7.m6202(r0, r2)
            r7.m5531()
            goto L149
        L145:
            uy r3 = p000.AbstractC1016yc.f12565
            if (r2 != r3) goto L14e
        L149:
            m6356(r15)
            goto L10
        L14e:
            if (r2 != 0) goto L159
            uy r3 = p000.AbstractC1016yc.f12560
            boolean r2 = r7.m6198(r2, r0, r3)
            if (r2 == 0) goto L109
            goto L17b
        L159:
            uy r3 = p000.AbstractC1016yc.f12559
            if (r2 != r3) goto L15e
            goto L17b
        L15e:
            uy r3 = p000.AbstractC1016yc.f12563
            if (r2 == r3) goto L17b
            uy r3 = p000.AbstractC1016yc.f12564
            if (r2 == r3) goto L17b
            uy r3 = p000.AbstractC1016yc.f12566
            if (r2 != r3) goto L16b
            goto L17b
        L16b:
            uy r3 = p000.AbstractC1016yc.f12567
            if (r2 != r3) goto L170
            goto L17b
        L170:
            uy r3 = p000.AbstractC1016yc.f12561
            if (r2 != r3) goto L175
            goto L109
        L175:
            java.lang.String r0 = "Unexpected cell state: "
            p000.C1080.m7278(r2, r0)
            return
        L17b:
            m6356(r15)
            return
    }

    /* JADX INFO: renamed from: λ */
    public final p000.C0906ve m6366(long r10, p000.C0906ve r12) {
            r9 = this;
            ve r0 = p000.AbstractC1016yc.f12556
            xc r0 = p000.C0979xc.f12127
        L4:
            java.lang.Object r1 = p000.AbstractC0073bd.m884(r12, r10, r0)
            boolean r2 = p000.u81.m5808(r1)
            if (r2 != 0) goto L4a
            sr1 r2 = p000.u81.m5806(r1)
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.C0942wc.f11669
            java.lang.Object r4 = r3.get(r9)
            sr1 r4 = (p000.sr1) r4
            long r5 = r4.f10004
            long r7 = r2.f10004
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L23
            goto L4a
        L23:
            boolean r5 = r2.m5532()
            if (r5 != 0) goto L2a
            goto L4
        L2a:
            boolean r5 = r3.compareAndSet(r9, r4, r2)
            if (r5 == 0) goto L3a
            boolean r0 = r4.m5530()
            if (r0 == 0) goto L4a
            r4.m2977()
            goto L4a
        L3a:
            java.lang.Object r5 = r3.get(r9)
            if (r5 == r4) goto L2a
            boolean r3 = r2.m5530()
            if (r3 == 0) goto L12
            r2.m2977()
            goto L12
        L4a:
            boolean r0 = p000.u81.m5808(r1)
            r2 = 0
            if (r0 == 0) goto L66
            r9.m6371()
            long r10 = r12.f10004
            int r0 = p000.AbstractC1016yc.f12557
            long r0 = (long) r0
            long r10 = r10 * r0
            long r0 = r9.m6369()
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 >= 0) goto Le3
            r12.m2974()
            return r2
        L66:
            sr1 r12 = p000.u81.m5806(r1)
            ve r12 = (p000.C0906ve) r12
            long r0 = r12.f10004
            boolean r3 = r9.m6372()
            if (r3 != 0) goto Lb6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C0942wc.f11666
            long r3 = r3.get(r9)
            int r5 = p000.AbstractC1016yc.f12557
            long r5 = (long) r5
            long r3 = r3 / r5
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 > 0) goto Lb6
        L82:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000.C0942wc.f11670
            java.lang.Object r4 = r3.get(r9)
            sr1 r4 = (p000.sr1) r4
            long r5 = r4.f10004
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto Lb6
            boolean r5 = r12.m5532()
            if (r5 == 0) goto Lb6
        L96:
            boolean r5 = r3.compareAndSet(r9, r4, r12)
            if (r5 == 0) goto La6
            boolean r3 = r4.m5530()
            if (r3 == 0) goto Lb6
            r4.m2977()
            goto Lb6
        La6:
            java.lang.Object r5 = r3.get(r9)
            if (r5 == r4) goto L96
            boolean r3 = r12.m5530()
            if (r3 == 0) goto L82
            r12.m2977()
            goto L82
        Lb6:
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 <= 0) goto Le6
            int r10 = p000.AbstractC1016yc.f12557
            long r10 = (long) r10
            long r7 = r0 * r10
        Lbf:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = p000.C0942wc.f11665
            long r5 = r10.get(r9)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto Lcb
            r4 = r9
            goto Ld4
        Lcb:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C0942wc.f11665
            r4 = r9
            boolean r9 = r3.compareAndSet(r4, r5, r7)
            if (r9 == 0) goto Le4
        Ld4:
            int r9 = p000.AbstractC1016yc.f12557
            long r9 = (long) r9
            long r0 = r0 * r9
            long r9 = r4.m6369()
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 >= 0) goto Le3
            r12.m2974()
        Le3:
            return r2
        Le4:
            r9 = r4
            goto Lbf
        Le6:
            return r12
    }

    @Override // p000.qs1
    /* JADX INFO: renamed from: μ */
    public java.lang.Object mo3385(java.lang.Object r16) {
            r15 = this;
            ue r8 = p000.pd2.f8518
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = p000.C0942wc.f11664
            long r1 = r9.get(r15)
            r10 = 0
            boolean r3 = r15.m6370(r1, r10)
            r11 = 1
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L17
            r1 = r10
            goto L1d
        L17:
            long r1 = r1 & r12
            boolean r1 = r15.m6361(r1)
            r1 = r1 ^ r11
        L1d:
            if (r1 == 0) goto L20
            return r8
        L20:
            uy r6 = p000.AbstractC1016yc.f12565
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0942wc.f11668
            java.lang.Object r1 = r1.get(r15)
            ve r1 = (p000.C0906ve) r1
        L2a:
            long r2 = r9.getAndIncrement(r15)
            long r4 = r2 & r12
            boolean r7 = r15.m6370(r2, r10)
            int r14 = p000.AbstractC1016yc.f12557
            long r2 = (long) r14
            long r12 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r10 = r1.f10004
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L5d
            ve r3 = m6353(r15, r12, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r0 = r15.m6368()
            te r1 = new te
            r1.<init>(r0)
            return r1
        L54:
            r10 = 0
            r11 = 1
        L56:
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r10 = m6355(r0, r1, r2, r3, r4, r6, r7)
            s62 r3 = p000.s62.f9751
            if (r10 == 0) goto Lbd
            r11 = 1
            if (r10 == r11) goto Lbc
            r3 = 2
            if (r10 == r3) goto L9b
            r2 = 3
            if (r10 == r2) goto L94
            r2 = 4
            if (r10 == r2) goto L7d
            r2 = 5
            if (r10 == r2) goto L78
            goto L7b
        L78:
            r1.m2974()
        L7b:
            r10 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.C0942wc.f11665
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.m2974()
        L8a:
            java.lang.Throwable r0 = r15.m6368()
            te r1 = new te
            r1.<init>(r0)
            return r1
        L94:
            java.lang.String r0 = "unexpected"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L9b:
            if (r7 == 0) goto Laa
            r1.m5531()
            java.lang.Throwable r0 = r15.m6368()
            te r1 = new te
            r1.<init>(r0)
            return r1
        Laa:
            boolean r0 = r6 instanceof p000.jb2
            if (r0 == 0) goto Lb1
            jb2 r6 = (p000.jb2) r6
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            if (r6 == 0) goto Lb8
            int r2 = r2 + r14
            r6.mo70(r1, r2)
        Lb8:
            r1.m5531()
            return r8
        Lbc:
            return r3
        Lbd:
            r1.m2974()
            return r3
    }

    @Override // p000.InterfaceC0546me
    /* JADX INFO: renamed from: ν */
    public final void mo2180(java.util.concurrent.CancellationException r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Channel was cancelled"
            r2.<init>(r0)
        L9:
            r0 = 1
            r1.m6362(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final java.lang.Throwable m6367() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0942wc.f11671
            java.lang.Object r1 = r0.get(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
    }

    /* JADX INFO: renamed from: ο */
    public final java.lang.Throwable m6368() {
            r1 = this;
            java.lang.Throwable r1 = r1.m6367()
            if (r1 != 0) goto Ld
            vh r1 = new vh
            java.lang.String r0 = "Channel was closed"
            r1.<init>(r0)
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: π */
    public final long m6369() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11664
            long r0 = r0.get(r4)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r2
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public final boolean m6370(long r14, boolean r16) {
            r13 = this;
            r0 = 60
            long r0 = r14 >> r0
            int r0 = (int) r0
            r1 = 0
            if (r0 == 0) goto L16a
            r2 = 1
            if (r0 == r2) goto L16a
            r3 = 2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.C0942wc.f11665
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 == r3) goto Ldb
            r3 = 3
            if (r0 != r3) goto Ld0
            long r5 = r5 & r14
            ve r0 = r13.m6363(r5)
            r3 = 0
            r5 = r3
        L1f:
            int r6 = p000.AbstractC1016yc.f12557
            int r6 = r6 - r2
        L22:
            r7 = -1
            if (r7 >= r6) goto La2
            long r8 = r0.f10004
            int r10 = p000.AbstractC1016yc.f12557
            long r10 = (long) r10
            long r8 = r8 * r10
            long r10 = (long) r6
            long r8 = r8 + r10
        L2d:
            java.lang.Object r10 = r0.m6199(r6)
            uy r11 = p000.AbstractC1016yc.f12564
            if (r10 == r11) goto Lae
            uy r11 = p000.AbstractC1016yc.f12559
            if (r10 != r11) goto L50
            long r11 = r4.get(r13)
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 < 0) goto Lae
            uy r11 = p000.AbstractC1016yc.f12567
            boolean r10 = r0.m6198(r10, r6, r11)
            if (r10 == 0) goto L2d
            r0.m6201(r6, r3)
            r0.m5531()
            goto L9f
        L50:
            uy r11 = p000.AbstractC1016yc.f12560
            if (r10 == r11) goto L94
            if (r10 != 0) goto L57
            goto L94
        L57:
            boolean r11 = r10 instanceof p000.jb2
            if (r11 != 0) goto L6c
            boolean r11 = r10 instanceof p000.kb2
            if (r11 == 0) goto L60
            goto L6c
        L60:
            uy r11 = p000.AbstractC1016yc.f12562
            if (r10 == r11) goto Lae
            uy r12 = p000.AbstractC1016yc.f12561
            if (r10 != r12) goto L69
            goto Lae
        L69:
            if (r10 == r11) goto L2d
            goto L9f
        L6c:
            long r11 = r4.get(r13)
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 < 0) goto Lae
            boolean r11 = r10 instanceof p000.kb2
            if (r11 == 0) goto L7e
            r11 = r10
            kb2 r11 = (p000.kb2) r11
            jb2 r11 = r11.f5844
            goto L81
        L7e:
            r11 = r10
            jb2 r11 = (p000.jb2) r11
        L81:
            uy r12 = p000.AbstractC1016yc.f12567
            boolean r10 = r0.m6198(r10, r6, r12)
            if (r10 == 0) goto L2d
            java.lang.Object r5 = p000.jx0.m3032(r5, r11)
            r0.m6201(r6, r3)
            r0.m5531()
            goto L9f
        L94:
            uy r11 = p000.AbstractC1016yc.f12567
            boolean r10 = r0.m6198(r10, r6, r11)
            if (r10 == 0) goto L2d
            r0.m5531()
        L9f:
            int r6 = r6 + (-1)
            goto L22
        La2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p000.AbstractC0439jo.f5530
            java.lang.Object r0 = r6.get(r0)
            jo r0 = (p000.AbstractC0439jo) r0
            ve r0 = (p000.C0906ve) r0
            if (r0 != 0) goto L1f
        Lae:
            if (r5 == 0) goto L169
            boolean r0 = r5 instanceof java.util.ArrayList
            if (r0 != 0) goto Lbb
            jb2 r5 = (p000.jb2) r5
            r13.m6375(r5, r1)
            goto L169
        Lbb:
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r0 = r5.size()
            int r0 = r0 - r2
        Lc2:
            if (r7 >= r0) goto L169
            java.lang.Object r3 = r5.get(r0)
            jb2 r3 = (p000.jb2) r3
            r13.m6375(r3, r1)
            int r0 = r0 + (-1)
            goto Lc2
        Ld0:
            java.lang.String r13 = "unexpected close status: "
            java.lang.String r13 = p000.a12.m17(r13, r0)
            p000.C1080.m7273(r13)
            r13 = 0
            return r13
        Ldb:
            long r5 = r5 & r14
            r13.m6363(r5)
            if (r16 == 0) goto L169
        Le1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0942wc.f11669
            java.lang.Object r3 = r0.get(r13)
            ve r3 = (p000.C0906ve) r3
            long r7 = r4.get(r13)
            long r5 = r13.m6369()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto Lf7
            goto L169
        Lf7:
            int r5 = p000.AbstractC1016yc.f12557
            long r5 = (long) r5
            long r9 = r7 / r5
            long r11 = r3.f10004
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L115
            ve r3 = r13.m6366(r9, r3)
            if (r3 != 0) goto L115
            java.lang.Object r0 = r0.get(r13)
            ve r0 = (p000.C0906ve) r0
            long r5 = r0.f10004
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto Le1
            goto L169
        L115:
            r3.m2974()
            long r5 = r7 % r5
            int r0 = (int) r5
        L11b:
            java.lang.Object r5 = r3.m6199(r0)
            if (r5 == 0) goto L152
            uy r6 = p000.AbstractC1016yc.f12560
            if (r5 != r6) goto L126
            goto L152
        L126:
            uy r0 = p000.AbstractC1016yc.f12559
            if (r5 != r0) goto L12b
            goto L16a
        L12b:
            uy r0 = p000.AbstractC1016yc.f12565
            if (r5 != r0) goto L130
            goto L15d
        L130:
            uy r0 = p000.AbstractC1016yc.f12567
            if (r5 != r0) goto L135
            goto L15d
        L135:
            uy r0 = p000.AbstractC1016yc.f12564
            if (r5 != r0) goto L13a
            goto L15d
        L13a:
            uy r0 = p000.AbstractC1016yc.f12563
            if (r5 != r0) goto L13f
            goto L15d
        L13f:
            uy r0 = p000.AbstractC1016yc.f12562
            if (r5 != r0) goto L144
            goto L16a
        L144:
            uy r0 = p000.AbstractC1016yc.f12561
            if (r5 != r0) goto L149
            goto L15d
        L149:
            long r5 = r4.get(r13)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L15d
            goto L16a
        L152:
            uy r6 = p000.AbstractC1016yc.f12563
            boolean r5 = r3.m6198(r5, r0, r6)
            if (r5 == 0) goto L11b
            r13.m6365()
        L15d:
            r5 = 1
            long r9 = r7 + r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = p000.C0942wc.f11665
            r6 = r13
            r5.compareAndSet(r6, r7, r9)
            goto Le1
        L169:
            return r2
        L16a:
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public final boolean m6371() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11664
            long r0 = r0.get(r3)
            r2 = 0
            boolean r3 = r3.m6370(r0, r2)
            return r3
    }

    /* JADX INFO: renamed from: υ */
    public boolean mo3386() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public final boolean m6372() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.C0942wc.f11666
            long r0 = r0.get(r4)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            goto L18
        L16:
            r4 = 0
            return r4
        L18:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: χ */
    public final void m6373(long r5, p000.C0906ve r7) {
            r4 = this;
        L0:
            long r0 = r7.f10004
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            jo r0 = r7.m2975()
            ve r0 = (p000.C0906ve) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo2976()
            if (r5 == 0) goto L22
            jo r5 = r7.m2975()
            ve r5 = (p000.C0906ve) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.C0942wc.f11670
            java.lang.Object r6 = r5.get(r4)
            sr1 r6 = (p000.sr1) r6
            long r0 = r6.f10004
            long r2 = r7.f10004
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.m5532()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r4 = r6.m5530()
            if (r4 == 0) goto L49
            r6.m2977()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.m5530()
            if (r5 == 0) goto L22
            r7.m2977()
            goto L22
    }

    /* JADX INFO: renamed from: ψ */
    public final java.lang.Object m6374(p000.InterfaceC0631op r2, java.lang.Object r3) {
            r1 = this;
            ae r3 = new ae
            op r2 = p000.AbstractC0978xb.m6563(r2)
            r0 = 1
            r3.<init>(r0, r2)
            r3.m87()
            java.lang.Throwable r1 = r1.m6368()
            eo1 r2 = new eo1
            r2.<init>(r1)
            r3.mo75(r2)
            java.lang.Object r1 = r3.m86()
            cq r2 = p000.EnumC0184cq.f2716
            if (r1 != r2) goto L22
            return r1
        L22:
            s62 r1 = p000.s62.f9751
            return r1
    }

    /* JADX INFO: renamed from: ω */
    public final void m6375(p000.jb2 r2, boolean r3) {
            r1 = this;
            boolean r0 = r2 instanceof p000.InterfaceC1017yd
            if (r0 == 0) goto L23
            op r2 = (p000.InterfaceC0631op) r2
            if (r3 == 0) goto L16
            java.lang.Throwable r1 = r1.m6367()
            if (r1 != 0) goto L1a
            uh r1 = new uh
            java.lang.String r3 = "Channel was closed"
            r1.<init>(r3)
            goto L1a
        L16:
            java.lang.Throwable r1 = r1.m6368()
        L1a:
            eo1 r3 = new eo1
            r3.<init>(r1)
            r2.mo75(r3)
            return
        L23:
            boolean r1 = r2 instanceof p000.C0904vc
            if (r1 == 0) goto L4c
            vc r2 = (p000.C0904vc) r2
            ae r1 = r2.f11227
            r1.getClass()
            r3 = 0
            r2.f11227 = r3
            uy r3 = p000.AbstractC1016yc.f12567
            r2.f11226 = r3
            wc r2 = r2.f11228
            java.lang.Throwable r2 = r2.m6367()
            if (r2 != 0) goto L43
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.mo75(r2)
            return
        L43:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r1.mo75(r3)
            return
        L4c:
            java.lang.String r1 = "Unexpected waiter: "
            p000.C1080.m7278(r2, r1)
            return
    }
}
