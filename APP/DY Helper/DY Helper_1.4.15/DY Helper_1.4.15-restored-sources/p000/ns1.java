package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ns1 {

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7727 = null;

    /* JADX INFO: renamed from: γ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f7728 = null;

    /* JADX INFO: renamed from: δ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7729 = null;

    /* JADX INFO: renamed from: ε */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f7730 = null;

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f7731 = null;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private volatile /* synthetic */ java.lang.Object tail$volatile;

    /* JADX INFO: renamed from: α */
    public final p000.C1054zd f7732;

    static {
            java.lang.String r0 = "head$volatile"
            java.lang.Class<ns1> r1 = p000.ns1.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.ns1.f7727 = r0
            java.lang.String r0 = "deqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            p000.ns1.f7728 = r0
            java.lang.String r0 = "tail$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.ns1.f7729 = r0
            java.lang.String r0 = "enqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            p000.ns1.f7730 = r0
            java.lang.String r0 = "_availablePermits$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            p000.ns1.f7731 = r0
            return
    }

    public ns1() {
            r5 = this;
            r5.<init>()
            ps1 r0 = new ps1
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r3, r1, r2)
            r5.head$volatile = r0
            r5.tail$volatile = r0
            r0 = 1
            r5._availablePermits$volatile = r0
            zd r0 = new zd
            r1 = 2
            r0.<init>(r1, r5)
            r5.f7732 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m4094(p000.q21 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            ae r2 = r1.f8808
            r21 r3 = r1.f8809
        L8:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = p000.ns1.f7731
            int r4 = r4.getAndDecrement(r0)
            r5 = 1
            if (r4 > r5) goto L8
            s62 r5 = p000.s62.f9751
            r6 = 0
            if (r4 <= 0) goto L2c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.r21.f9237
            r0.set(r3, r6)
            θ r0 = new θ
            r0.<init>(r3, r1)
            int r1 = r2.f5573
            zd r3 = new zd
            r4 = 0
            r3.<init>(r4, r0)
            r2.m68(r5, r1, r3)
            return
        L2c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p000.ns1.f7729
            java.lang.Object r7 = r4.get(r0)
            ps1 r7 = (p000.ps1) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = p000.ns1.f7730
            long r8 = r8.getAndIncrement(r0)
            ls1 r10 = p000.ls1.f6766
            int r11 = p000.os1.f8239
            long r11 = (long) r11
            long r11 = r8 / r11
        L41:
            java.lang.Object r13 = p000.AbstractC0073bd.m884(r7, r11, r10)
            boolean r14 = p000.u81.m5808(r13)
            if (r14 != 0) goto L8f
            sr1 r14 = p000.u81.m5806(r13)
        L4f:
            java.lang.Object r15 = r4.get(r0)
            sr1 r15 = (p000.sr1) r15
            r16 = r7
            long r6 = r15.f10004
            r17 = r6
            long r6 = r14.f10004
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 < 0) goto L62
            goto L8f
        L62:
            boolean r6 = r14.m5532()
            if (r6 != 0) goto L6c
            r7 = r16
            r6 = 0
            goto L41
        L6c:
            boolean r6 = r4.compareAndSet(r0, r15, r14)
            if (r6 == 0) goto L7c
            boolean r4 = r15.m5530()
            if (r4 == 0) goto L8f
            r15.m2977()
            goto L8f
        L7c:
            java.lang.Object r6 = r4.get(r0)
            if (r6 == r15) goto L6c
            boolean r6 = r14.m5530()
            if (r6 == 0) goto L8b
            r14.m2977()
        L8b:
            r7 = r16
            r6 = 0
            goto L4f
        L8f:
            sr1 r4 = p000.u81.m5806(r13)
            ps1 r4 = (p000.ps1) r4
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f8692
            int r7 = p000.os1.f8239
            long r10 = (long) r7
            long r8 = r8 % r10
            int r7 = (int) r8
        L9c:
            r8 = 0
            boolean r9 = r6.compareAndSet(r7, r8, r1)
            if (r9 == 0) goto La7
            r1.mo70(r4, r7)
            return
        La7:
            java.lang.Object r8 = r6.get(r7)
            if (r8 == 0) goto L9c
            uy r8 = p000.os1.f8235
            uy r9 = p000.os1.f8236
        Lb1:
            boolean r4 = r6.compareAndSet(r7, r8, r9)
            if (r4 == 0) goto Lce
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.r21.f9237
            r10 = 0
            r0.set(r3, r10)
            θ r0 = new θ
            r0.<init>(r3, r1)
            int r1 = r2.f5573
            zd r3 = new zd
            r4 = 0
            r3.<init>(r4, r0)
            r2.m68(r5, r1, r3)
            return
        Lce:
            r10 = 0
            java.lang.Object r4 = r6.get(r7)
            if (r4 == r8) goto Lb1
            goto L8
    }

    /* JADX INFO: renamed from: β */
    public final void m4095() {
            r15 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.ns1.f7731
            int r1 = r0.getAndIncrement(r15)
            r2 = 1
            if (r1 >= r2) goto Lcd
            if (r1 < 0) goto Ld
            goto Lc6
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.ns1.f7727
            java.lang.Object r1 = r0.get(r15)
            ps1 r1 = (p000.ps1) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.ns1.f7728
            long r3 = r3.getAndIncrement(r15)
            int r5 = p000.os1.f8239
            long r5 = (long) r5
            long r5 = r3 / r5
            ms1 r7 = p000.ms1.f7266
        L22:
            java.lang.Object r8 = p000.AbstractC0073bd.m884(r1, r5, r7)
            boolean r9 = p000.u81.m5808(r8)
            if (r9 != 0) goto L66
            sr1 r9 = p000.u81.m5806(r8)
        L30:
            java.lang.Object r10 = r0.get(r15)
            sr1 r10 = (p000.sr1) r10
            long r11 = r10.f10004
            long r13 = r9.f10004
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L3f
            goto L66
        L3f:
            boolean r11 = r9.m5532()
            if (r11 != 0) goto L46
            goto L22
        L46:
            boolean r11 = r0.compareAndSet(r15, r10, r9)
            if (r11 == 0) goto L56
            boolean r0 = r10.m5530()
            if (r0 == 0) goto L66
            r10.m2977()
            goto L66
        L56:
            java.lang.Object r11 = r0.get(r15)
            if (r11 == r10) goto L46
            boolean r10 = r9.m5530()
            if (r10 == 0) goto L30
            r9.m2977()
            goto L30
        L66:
            sr1 r0 = p000.u81.m5806(r8)
            ps1 r0 = (p000.ps1) r0
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f8692
            r0.m2974()
            long r7 = r0.f10004
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 0
            if (r0 <= 0) goto L7a
        L78:
            r2 = r5
            goto Lc4
        L7a:
            int r0 = p000.os1.f8239
            long r6 = (long) r0
            long r3 = r3 % r6
            int r0 = (int) r3
            uy r3 = p000.os1.f8235
            java.lang.Object r3 = r1.getAndSet(r0, r3)
            if (r3 != 0) goto Lac
            int r3 = p000.os1.f8234
            r4 = r5
        L8a:
            if (r4 >= r3) goto L98
            java.lang.Object r6 = r1.get(r0)
            uy r7 = p000.os1.f8236
            if (r6 != r7) goto L95
            goto Lc4
        L95:
            int r4 = r4 + 1
            goto L8a
        L98:
            uy r4 = p000.os1.f8235
            uy r6 = p000.os1.f8237
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
            uy r0 = p000.os1.f8238
            if (r3 != r0) goto Lb1
            goto L78
        Lb1:
            boolean r0 = r3 instanceof p000.InterfaceC1017yd
            if (r0 == 0) goto Lc7
            yd r3 = (p000.InterfaceC1017yd) r3
            s62 r0 = p000.s62.f9751
            zd r1 = r15.f7732
            uy r0 = r3.mo78(r0, r1)
            if (r0 == 0) goto L78
            r3.mo90(r0)
        Lc4:
            if (r2 == 0) goto L0
        Lc6:
            return
        Lc7:
            java.lang.String r15 = "unexpected: "
            p000.C1080.m7278(r3, r15)
            return
        Lcd:
            int r1 = r0.get(r15)
            if (r1 <= r2) goto Lda
            boolean r1 = r0.compareAndSet(r15, r1, r2)
            if (r1 != 0) goto Lda
            goto Lcd
        Lda:
            java.lang.String r15 = "The number of released permits cannot be greater than 1"
            p000.C1080.m7273(r15)
            return
    }
}
