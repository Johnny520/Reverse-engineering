package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0999<T> extends Yue.AbstractC1001<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f2873 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int consumed;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5242<T> f2874;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f2875;

    static {
            java.lang.Class<Yue.ۥ۟ۤۡ> r0 = Yue.C0999.class
            java.lang.String r1 = "consumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.C0999.f2873 = r0
            return
    }

    public C0999(@Yue.InterfaceC4418 Yue.InterfaceC5242<? extends T> r1, boolean r2, @Yue.InterfaceC4418 Yue.InterfaceC1632 r3, int r4, @Yue.InterfaceC4418 Yue.EnumC0847 r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.f2874 = r1
            r0.f2875 = r2
            r1 = 0
            r0.consumed = r1
            return
    }

    public /* synthetic */ C0999(Yue.InterfaceC5242 r7, boolean r8, Yue.InterfaceC1632 r9, int r10, Yue.EnumC0847 r11, int r12, Yue.C1769 r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r9 = Yue.C2141.f6728
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Lc
            r10 = -3
        Lc:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L13
            Yue.ۥۣۣ۟ r11 = Yue.EnumC0847.f2389
        L13:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // Yue.AbstractC1001, Yue.InterfaceC2464
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r4) {
            r2 = this;
            int r0 = r2.f2878
            r1 = -3
            if (r0 != r1) goto L1a
            r2.m5529()
            Yue.ۥۡۦۡۡ<T> r0 = r2.f2874
            boolean r1 = r2.f2875
            java.lang.Object r3 = Yue.C2496.m11677(r3, r0, r1, r4)
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L17
            return r3
        L17:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
        L1a:
            java.lang.Object r3 = super.mo392(r3, r4)
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L25
            return r3
        L25:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String mo5526() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel="
            r0.append(r1)
            Yue.ۥۡۦۡۡ<T> r1 = r2.f2874
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.Object mo5253(@Yue.InterfaceC4418 Yue.InterfaceC4951<? super T> r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r4) {
            r2 = this;
            Yue.ۥۡۨۡۧ r0 = new Yue.ۥۡۨۡۧ
            r0.<init>(r3)
            Yue.ۥۡۦۡۡ<T> r3 = r2.f2874
            boolean r1 = r2.f2875
            java.lang.Object r3 = Yue.C2496.m11677(r0, r3, r1, r4)
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L14
            return r3
        L14:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.AbstractC1001<T> mo5254(@Yue.InterfaceC4418 Yue.InterfaceC1632 r8, int r9, @Yue.InterfaceC4418 Yue.EnumC0847 r10) {
            r7 = this;
            Yue.ۥ۟ۤۡ r6 = new Yue.ۥ۟ۤۡ
            Yue.ۥۡۦۡۡ<T> r1 = r7.f2874
            boolean r2 = r7.f2875
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Yue.InterfaceC2464<T> mo5527() {
            r9 = this;
            Yue.ۥ۟ۤۡ r8 = new Yue.ۥ۟ۤۡ
            Yue.ۥۡۦۡۡ<T> r1 = r9.f2874
            boolean r2 = r9.f2875
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.InterfaceC5242<T> mo5528(@Yue.InterfaceC4418 Yue.InterfaceC1662 r3) {
            r2 = this;
            r2.m5529()
            int r0 = r2.f2878
            r1 = -3
            if (r0 != r1) goto Lb
            Yue.ۥۡۦۡۡ<T> r3 = r2.f2874
            goto Lf
        Lb:
            Yue.ۥۡۦۡۡ r3 = super.mo5528(r3)
        Lf:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m5529() {
            r2 = this;
            boolean r0 = r2.f2875
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C0999.f2873
            r1 = 1
            int r0 = r0.getAndSet(r2, r1)
            if (r0 != 0) goto Le
            goto L1a
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ReceiveChannel.consumeAsFlow can be collected just once"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1a:
            return
    }
}
