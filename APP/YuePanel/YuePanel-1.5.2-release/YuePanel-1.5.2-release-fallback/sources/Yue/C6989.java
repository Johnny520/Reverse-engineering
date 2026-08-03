package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6989 implements Yue.InterfaceC6981 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f24373 = 80;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f24374 = 443;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f24375 = 16384;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f24376 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC3804 f24377;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> f24378;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> f24379;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final Yue.InterfaceC6990 f24380;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.nio.channels.SelectionKey f24381;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.nio.channels.ByteChannel f24382;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Yue.AbstractRunnableC6995.C6996 f24383;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f24384;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public volatile Yue.EnumC5210 f24385;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public java.util.List<Yue.AbstractC1986> f24386;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Yue.AbstractC1986 f24387;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.EnumC5428 f24388;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public java.nio.ByteBuffer f24389;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Yue.InterfaceC1165 f24390;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public java.lang.String f24391;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public java.lang.Integer f24392;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public java.lang.Boolean f24393;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public java.lang.String f24394;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public long f24395;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final java.lang.Object f24396;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public java.lang.Object f24397;

    static {
            return
    }

    public C6989(Yue.InterfaceC6990 r3, Yue.AbstractC1986 r4) {
            r2 = this;
            r2.<init>()
            java.lang.Class<Yue.ۥۢۥۡۥ> r0 = Yue.C6989.class
            Yue.ۥ۠ۨۡۥ r0 = Yue.C3805.m15249(r0)
            r2.f24377 = r0
            r0 = 0
            r2.f24384 = r0
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19551
            r2.f24385 = r1
            r1 = 0
            r2.f24387 = r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2.f24389 = r0
            r2.f24390 = r1
            r2.f24391 = r1
            r2.f24392 = r1
            r2.f24393 = r1
            r2.f24394 = r1
            long r0 = java.lang.System.nanoTime()
            r2.f24395 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f24396 = r0
            if (r3 == 0) goto L59
            if (r4 != 0) goto L3c
            Yue.ۥۡۧ۟ۨ r0 = r2.f24388
            Yue.ۥۡۧ۟ۨ r1 = Yue.EnumC5428.f20113
            if (r0 == r1) goto L59
        L3c:
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r2.f24378 = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r2.f24379 = r0
            r2.f24380 = r3
            Yue.ۥۡۧ۟ۨ r3 = Yue.EnumC5428.f20112
            r2.f24388 = r3
            if (r4 == 0) goto L58
            Yue.ۥ۠۠۠۟ r3 = r4.mo9155()
            r2.f24387 = r3
        L58:
            return
        L59:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "parameters must not be null"
            r3.<init>(r4)
            throw r3
    }

    public C6989(Yue.InterfaceC6990 r2, java.util.List<Yue.AbstractC1986> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            Yue.ۥۡۧ۟ۨ r2 = Yue.EnumC5428.f20113
            r1.f24388 = r2
            if (r3 == 0) goto L14
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L11
            goto L14
        L11:
            r1.f24386 = r3
            goto L23
        L14:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f24386 = r2
            Yue.ۥ۠۠۠۠ r3 = new Yue.ۥ۠۠۠۠
            r3.<init>()
            r2.add(r3)
        L23:
            return
    }

    @Override // Yue.InterfaceC6981
    public void close() {
            r1 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.mo26941(r0)
            return
    }

    @Override // Yue.InterfaceC6981
    public boolean isOpen() {
            r2 = this;
            Yue.ۥۡۦ۠ۡ r0 = r2.f24385
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19552
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ */
    public void mo26934(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L15
            Yue.ۥ۠۠۠۟ r0 = r3.f24387
            Yue.ۥۡۧ۟ۨ r1 = r3.f24388
            Yue.ۥۡۧ۟ۨ r2 = Yue.EnumC5428.f20112
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.util.List r4 = r0.mo9157(r4, r1)
            r3.m27036(r4)
            return
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot send 'null' data to a WebSocketImpl."
            r4.<init>(r0)
            throw r4
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo26935() {
            r1 = this;
            java.lang.String r0 = r1.f24394
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo26936(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.m27017(r2, r3, r0)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo26937(byte[] r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r0.mo26948(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public synchronized void m27017(int r6, java.lang.String r7, boolean r8) {
            r5 = this;
            monitor-enter(r5)
            Yue.ۥۡۦ۠ۡ r0 = r5.f24385     // Catch: java.lang.Throwable -> L1f
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19553     // Catch: java.lang.Throwable -> L1f
            if (r0 == r1) goto L85
            Yue.ۥۡۦ۠ۡ r0 = r5.f24385     // Catch: java.lang.Throwable -> L1f
            Yue.ۥۡۦ۠ۡ r2 = Yue.EnumC5210.f19554     // Catch: java.lang.Throwable -> L1f
            if (r0 == r2) goto L85
            Yue.ۥۡۦ۠ۡ r0 = r5.f24385     // Catch: java.lang.Throwable -> L1f
            Yue.ۥۡۦ۠ۡ r2 = Yue.EnumC5210.f19552     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            if (r0 != r2) goto L68
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r6 != r0) goto L21
            r5.f24385 = r1     // Catch: java.lang.Throwable -> L1f
            r5.m27028(r6, r7, r3)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r5)
            return
        L1f:
            r6 = move-exception
            goto L87
        L21:
            Yue.ۥ۠۠۠۟ r1 = r5.f24387     // Catch: java.lang.Throwable -> L1f
            Yue.ۥ۟ۤۨۧ r1 = r1.mo9163()     // Catch: java.lang.Throwable -> L1f
            Yue.ۥ۟ۤۨۧ r2 = Yue.EnumC1172.f3657     // Catch: java.lang.Throwable -> L1f
            if (r1 == r2) goto L64
            if (r8 != 0) goto L3b
            Yue.ۥۢۥۡۦ r1 = r5.f24380     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33 java.lang.RuntimeException -> L35
            r1.mo26971(r5, r6, r7)     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33 java.lang.RuntimeException -> L35
            goto L3b
        L33:
            r1 = move-exception
            goto L53
        L35:
            r1 = move-exception
            Yue.ۥۢۥۡۦ r2 = r5.f24380     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
            r2.mo26979(r5, r1)     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
        L3b:
            boolean r1 = r5.isOpen()     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
            if (r1 == 0) goto L64
            Yue.ۥ۟ۤۨۥ r1 = new Yue.ۥ۟ۤۨۥ     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
            r1.m6108(r7)     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
            r1.m6107(r6)     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
            r1.mo6103()     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
            r5.mo26939(r1)     // Catch: java.lang.Throwable -> L1f Yue.C3342 -> L33
            goto L64
        L53:
            Yue.ۥ۠ۨۡۥ r2 = r5.f24377     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "generated frame is invalid"
            r2.error(r4, r1)     // Catch: java.lang.Throwable -> L1f
            Yue.ۥۢۥۡۦ r2 = r5.f24380     // Catch: java.lang.Throwable -> L1f
            r2.mo26979(r5, r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "generated frame is invalid"
            r5.m27028(r0, r1, r3)     // Catch: java.lang.Throwable -> L1f
        L64:
            r5.m27028(r6, r7, r8)     // Catch: java.lang.Throwable -> L1f
            goto L7c
        L68:
            r0 = -3
            if (r6 != r0) goto L70
            r6 = 1
            r5.m27028(r0, r7, r6)     // Catch: java.lang.Throwable -> L1f
            goto L7c
        L70:
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r6 != r0) goto L78
            r5.m27028(r6, r7, r8)     // Catch: java.lang.Throwable -> L1f
            goto L7c
        L78:
            r6 = -1
            r5.m27028(r6, r7, r3)     // Catch: java.lang.Throwable -> L1f
        L7c:
            Yue.ۥۡۦ۠ۡ r6 = Yue.EnumC5210.f19553     // Catch: java.lang.Throwable -> L1f
            r5.f24385 = r6     // Catch: java.lang.Throwable -> L1f
            r6 = 0
            r5.f24389 = r6     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r5)
            return
        L85:
            monitor-exit(r5)
            return
        L87:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1f
            throw r6
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo26938() {
            r2 = this;
            Yue.ۥۡۦ۠ۡ r0 = r2.f24385
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19553
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo26939(Yue.InterfaceC2813 r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.m27036(r1)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.EnumC5210 mo26940() {
            r1 = this;
            Yue.ۥۡۦ۠ۡ r0 = r1.f24385
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27018(Yue.C3342 r3) {
            r2 = this;
            int r0 = r3.m13950()
            java.lang.String r3 = r3.getMessage()
            r1 = 0
            r2.m27017(r0, r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m27019() {
            r3 = this;
            java.lang.Boolean r0 = r3.f24393
            if (r0 == 0) goto L16
            java.lang.Integer r0 = r3.f24392
            int r0 = r0.intValue()
            java.lang.String r1 = r3.f24391
            java.lang.Boolean r2 = r3.f24393
            boolean r2 = r2.booleanValue()
            r3.m27020(r0, r1, r2)
            return
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "this method must be used in conjunction with flushAndClose"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo26941(int r3) {
            r2 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2.m27017(r3, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public synchronized void m27020(int r4, java.lang.String r5, boolean r6) {
            r3 = this;
            monitor-enter(r3)
            Yue.ۥۡۦ۠ۡ r0 = r3.f24385     // Catch: java.lang.Throwable -> L18
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19554     // Catch: java.lang.Throwable -> L18
            if (r0 != r1) goto L9
            monitor-exit(r3)
            return
        L9:
            Yue.ۥۡۦ۠ۡ r0 = r3.f24385     // Catch: java.lang.Throwable -> L18
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19552     // Catch: java.lang.Throwable -> L18
            if (r0 != r1) goto L1a
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r4 != r0) goto L1a
            Yue.ۥۡۦ۠ۡ r0 = Yue.EnumC5210.f19553     // Catch: java.lang.Throwable -> L18
            r3.f24385 = r0     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r4 = move-exception
            goto L6c
        L1a:
            java.nio.channels.SelectionKey r0 = r3.f24381     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L21
            r0.cancel()     // Catch: java.lang.Throwable -> L18
        L21:
            java.nio.channels.ByteChannel r0 = r3.f24382     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L29
            goto L50
        L29:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L44
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "Broken pipe"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L44
            Yue.ۥ۠ۨۡۥ r1 = r3.f24377     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "Caught IOException: Broken pipe during closeConnection()"
            r1.mo10344(r2, r0)     // Catch: java.lang.Throwable -> L18
            goto L50
        L44:
            Yue.ۥ۠ۨۡۥ r1 = r3.f24377     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "Exception during channel.close()"
            r1.error(r2, r0)     // Catch: java.lang.Throwable -> L18
            Yue.ۥۢۥۡۦ r1 = r3.f24380     // Catch: java.lang.Throwable -> L18
            r1.mo26979(r3, r0)     // Catch: java.lang.Throwable -> L18
        L50:
            Yue.ۥۢۥۡۦ r0 = r3.f24380     // Catch: java.lang.Throwable -> L18 java.lang.RuntimeException -> L56
            r0.mo26972(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L18 java.lang.RuntimeException -> L56
            goto L5c
        L56:
            r4 = move-exception
            Yue.ۥۢۥۡۦ r5 = r3.f24380     // Catch: java.lang.Throwable -> L18
            r5.mo26979(r3, r4)     // Catch: java.lang.Throwable -> L18
        L5c:
            Yue.ۥ۠۠۠۟ r4 = r3.f24387     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L63
            r4.mo9169()     // Catch: java.lang.Throwable -> L18
        L63:
            r4 = 0
            r3.f24390 = r4     // Catch: java.lang.Throwable -> L18
            Yue.ۥۡۦ۠ۡ r4 = Yue.EnumC5210.f19554     // Catch: java.lang.Throwable -> L18
            r3.f24385 = r4     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            return
        L6c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m27021(int r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = ""
            r1.m27020(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m27022(java.lang.RuntimeException r3) {
            r2 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            java.nio.ByteBuffer r0 = r2.m27029(r0)
            r2.m27042(r0)
            java.lang.String r3 = r3.getMessage()
            r0 = 0
            r1 = -1
            r2.m27028(r1, r3, r0)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo26942() {
            r1 = this;
            java.nio.channels.ByteChannel r0 = r1.f24382
            boolean r0 = r0 instanceof Yue.InterfaceC3204
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m27023(Yue.C3342 r3) {
            r2 = this;
            r0 = 404(0x194, float:5.66E-43)
            java.nio.ByteBuffer r0 = r2.m27029(r0)
            r2.m27042(r0)
            int r0 = r3.m13950()
            java.lang.String r3 = r3.getMessage()
            r1 = 0
            r2.m27028(r0, r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m27024(java.nio.ByteBuffer r7) {
            r6 = this;
            Yue.ۥ۠ۨۡۥ r0 = r6.f24377
            int r1 = r7.remaining()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r7.remaining()
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 <= r3) goto L15
            java.lang.String r2 = "too big to display"
            goto L26
        L15:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r7.array()
            int r4 = r7.position()
            int r5 = r7.remaining()
            r2.<init>(r3, r4, r5)
        L26:
            java.lang.String r3 = "process({}): ({})"
            r0.mo10322(r3, r1, r2)
            Yue.ۥۡۦ۠ۡ r0 = r6.f24385
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19551
            if (r0 == r1) goto L3b
            Yue.ۥۡۦ۠ۡ r0 = r6.f24385
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19552
            if (r0 != r1) goto L64
            r6.m27025(r7)
            goto L64
        L3b:
            boolean r0 = r6.m27026(r7)
            if (r0 == 0) goto L64
            boolean r0 = r6.mo26938()
            if (r0 != 0) goto L64
            boolean r0 = r6.mo26947()
            if (r0 != 0) goto L64
            boolean r0 = r7.hasRemaining()
            if (r0 == 0) goto L57
            r6.m27025(r7)
            goto L64
        L57:
            java.nio.ByteBuffer r7 = r6.f24389
            boolean r7 = r7.hasRemaining()
            if (r7 == 0) goto L64
            java.nio.ByteBuffer r7 = r6.f24389
            r6.m27025(r7)
        L64:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m27025(java.nio.ByteBuffer r4) {
            r3 = this;
            Yue.ۥ۠۠۠۟ r0 = r3.f24387     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            java.util.List r4 = r0.mo9171(r4)     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
        La:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            Yue.ۥۣ۠۠۠ r0 = (Yue.InterfaceC2813) r0     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            Yue.ۥ۠ۨۡۥ r1 = r3.f24377     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            java.lang.String r2 = "matched frame: {}"
            r1.mo10321(r2, r0)     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            Yue.ۥ۠۠۠۟ r1 = r3.f24387     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            r1.mo9167(r3, r0)     // Catch: java.lang.Error -> L23 java.lang.LinkageError -> L25 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 Yue.C3342 -> L2b Yue.C3588 -> L2d
            goto La
        L23:
            r4 = move-exception
            goto L2f
        L25:
            r4 = move-exception
            goto L5f
        L27:
            r4 = move-exception
            goto L5f
        L29:
            r4 = move-exception
            goto L5f
        L2b:
            r4 = move-exception
            goto L67
        L2d:
            r4 = move-exception
            goto L77
        L2f:
            Yue.ۥ۠ۨۡۥ r0 = r3.f24377
            java.lang.String r1 = "Closing web socket due to an error during frame processing"
            r0.error(r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r4)
            Yue.ۥۢۥۡۦ r1 = r3.f24380
            r1.mo26979(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Got error "
            r0.append(r1)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 1011(0x3f3, float:1.417E-42)
            r3.mo26936(r0, r4)
            goto L8f
        L5f:
            Yue.ۥ۠ۨۡۥ r0 = r3.f24377
            java.lang.String r1 = "Got fatal error during frame processing"
            r0.error(r1)
            throw r4
        L67:
            Yue.ۥ۠ۨۡۥ r0 = r3.f24377
            java.lang.String r1 = "Closing due to invalid data in frame"
            r0.error(r1, r4)
            Yue.ۥۢۥۡۦ r0 = r3.f24380
            r0.mo26979(r3, r4)
            r3.m27018(r4)
            goto L8f
        L77:
            int r0 = r4.m14521()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L8c
            Yue.ۥ۠ۨۡۥ r0 = r3.f24377
            java.lang.String r1 = "Closing due to invalid size of frame"
            r0.error(r1, r4)
            Yue.ۥۢۥۡۦ r0 = r3.f24380
            r0.mo26979(r3, r4)
        L8c:
            r3.m27018(r4)
        L8f:
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public Yue.AbstractC1986 mo26943() {
            r1 = this;
            Yue.ۥ۠۠۠۟ r0 = r1.f24387
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m27026(java.nio.ByteBuffer r11) {
            r10 = this;
            java.nio.ByteBuffer r0 = r10.f24389
            int r0 = r0.capacity()
            if (r0 != 0) goto La
            r0 = r11
            goto L3d
        La:
            java.nio.ByteBuffer r0 = r10.f24389
            int r0 = r0.remaining()
            int r1 = r11.remaining()
            if (r0 >= r1) goto L31
            java.nio.ByteBuffer r0 = r10.f24389
            int r0 = r0.capacity()
            int r1 = r11.remaining()
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r1 = r10.f24389
            r1.flip()
            java.nio.ByteBuffer r1 = r10.f24389
            r0.put(r1)
            r10.f24389 = r0
        L31:
            java.nio.ByteBuffer r0 = r10.f24389
            r0.put(r11)
            java.nio.ByteBuffer r0 = r10.f24389
            r0.flip()
            java.nio.ByteBuffer r0 = r10.f24389
        L3d:
            r0.mark()
            r1 = 0
            Yue.ۥۡۧ۟ۨ r2 = r10.f24388     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥۡۧ۟ۨ r3 = Yue.EnumC5428.f20113     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r4 = "Closing due to protocol error: wrong http function"
            r5 = 1
            java.lang.String r6 = "wrong http function"
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r3) goto L118
            Yue.ۥ۠۠۠۟ r2 = r10.f24387     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            if (r2 != 0) goto Lea
            java.util.List<Yue.ۥ۠۠۠۟> r2 = r10.f24386     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.util.Iterator r2 = r2.iterator()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
        L58:
            boolean r3 = r2.hasNext()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            if (r3 == 0) goto Ld4
            java.lang.Object r3 = r2.next()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠۠۠۟ r3 = (Yue.AbstractC1986) r3     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠۠۠۟ r3 = r3.mo9155()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥۡۧ۟ۨ r4 = r10.f24388     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r3.m9170(r4)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r0.reset()     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            Yue.ۥ۠ۤۡۥ r4 = r3.m9172(r0)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            boolean r8 = r4 instanceof Yue.InterfaceC1165     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            if (r8 != 0) goto L8b
            Yue.ۥ۠ۨۡۥ r3 = r10.f24377     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            java.lang.String r4 = "Closing due to wrong handshake"
            r3.mo10348(r4)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            Yue.ۥ۠ۥۧۤ r3 = new Yue.ۥ۠ۥۧۤ     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r3.<init>(r7, r6)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r10.m27023(r3)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            return r1
        L88:
            r2 = move-exception
            goto L1a9
        L8b:
            Yue.ۥ۟ۤۨۡ r4 = (Yue.InterfaceC1165) r4     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            Yue.ۥ۠ۤۡۤ r8 = r3.mo9151(r4)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            Yue.ۥ۠ۤۡۤ r9 = Yue.EnumC2980.f9616     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            if (r8 != r9) goto L58
            java.lang.String r8 = r4.mo6095()     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r10.f24394 = r8     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            Yue.ۥۢۥۡۦ r8 = r10.f24380     // Catch: java.lang.RuntimeException -> Lb2 Yue.C3342 -> Lb4
            Yue.ۥۣۡۨۢ r8 = r8.mo26962(r10, r3, r4)     // Catch: java.lang.RuntimeException -> Lb2 Yue.C3342 -> Lb4
            Yue.ۥ۠ۤۡۡ r8 = r3.mo9166(r4, r8)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            java.util.List r8 = r3.m9159(r8)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r10.m27043(r8)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r10.f24387 = r3     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r10.m27035(r4)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            return r5
        Lb2:
            r3 = move-exception
            goto Lb6
        Lb4:
            r3 = move-exception
            goto Lc6
        Lb6:
            Yue.ۥ۠ۨۡۥ r4 = r10.f24377     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            java.lang.String r8 = "Closing due to internal server error"
            r4.error(r8, r3)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            Yue.ۥۢۥۡۦ r4 = r10.f24380     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r4.mo26979(r10, r3)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r10.m27022(r3)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            return r1
        Lc6:
            Yue.ۥ۠ۨۡۥ r4 = r10.f24377     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            java.lang.String r8 = "Closing due to wrong handshake. Possible handshake rejection"
            r4.mo10344(r8, r3)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            r10.m27023(r3)     // Catch: Yue.C3345 -> L58 Yue.C3237 -> L88
            return r1
        Ld1:
            r2 = move-exception
            goto L19e
        Ld4:
            Yue.ۥ۠۠۠۟ r2 = r10.f24387     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            if (r2 != 0) goto Le9
            Yue.ۥ۠ۨۡۥ r2 = r10.f24377     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r3 = "Closing due to protocol error: no draft matches"
            r2.mo10348(r3)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠ۥۧۤ r2 = new Yue.ۥ۠ۥۧۤ     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r3 = "no draft matches"
            r2.<init>(r7, r3)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r10.m27023(r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
        Le9:
            return r1
        Lea:
            Yue.ۥ۠ۤۡۥ r2 = r2.m9172(r0)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            boolean r3 = r2 instanceof Yue.InterfaceC1165     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            if (r3 != 0) goto Lfb
            Yue.ۥ۠ۨۡۥ r2 = r10.f24377     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r2.mo10348(r4)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r10.m27028(r7, r6, r1)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            return r1
        Lfb:
            Yue.ۥ۟ۤۨۡ r2 = (Yue.InterfaceC1165) r2     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠۠۠۟ r3 = r10.f24387     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠ۤۡۤ r3 = r3.mo9151(r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠ۤۡۤ r4 = Yue.EnumC2980.f9616     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            if (r3 != r4) goto L10b
            r10.m27035(r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            return r5
        L10b:
            Yue.ۥ۠ۨۡۥ r2 = r10.f24377     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r3 = "Closing due to protocol error: the handshake did finally not match"
            r2.mo10348(r3)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r2 = "the handshake did finally not match"
            r10.mo26936(r7, r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            return r1
        L118:
            Yue.ۥۡۧ۟ۨ r3 = Yue.EnumC5428.f20112     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            if (r2 != r3) goto L1dc
            Yue.ۥ۠۠۠۟ r3 = r10.f24387     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r3.m9170(r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠۠۠۟ r2 = r10.f24387     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠ۤۡۥ r2 = r2.m9172(r0)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            boolean r3 = r2 instanceof Yue.InterfaceC5669     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            if (r3 != 0) goto L134
            Yue.ۥ۠ۨۡۥ r2 = r10.f24377     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r2.mo10348(r4)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r10.m27028(r7, r6, r1)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            return r1
        L134:
            Yue.ۥۣۡۨۡ r2 = (Yue.InterfaceC5669) r2     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠۠۠۟ r3 = r10.f24387     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۟ۤۨۡ r4 = r10.f24390     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠ۤۡۤ r3 = r3.mo9150(r4, r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠ۤۡۤ r4 = Yue.EnumC2980.f9616     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            if (r3 != r4) goto L179
            Yue.ۥۢۥۡۦ r3 = r10.f24380     // Catch: java.lang.RuntimeException -> L14d Yue.C3342 -> L14f
            Yue.ۥ۟ۤۨۡ r4 = r10.f24390     // Catch: java.lang.RuntimeException -> L14d Yue.C3342 -> L14f
            r3.mo26961(r10, r4, r2)     // Catch: java.lang.RuntimeException -> L14d Yue.C3342 -> L14f
            r10.m27035(r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            return r5
        L14d:
            r2 = move-exception
            goto L151
        L14f:
            r2 = move-exception
            goto L166
        L151:
            Yue.ۥ۠ۨۡۥ r3 = r10.f24377     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r4 = "Closing since client was never connected"
            r3.error(r4, r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥۢۥۡۦ r3 = r10.f24380     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r3.mo26979(r10, r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r2 = r2.getMessage()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r3 = -1
            r10.m27028(r3, r2, r1)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            return r1
        L166:
            Yue.ۥ۠ۨۡۥ r3 = r10.f24377     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r4 = "Closing due to invalid data exception. Possible handshake rejection"
            r3.mo10344(r4, r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            int r3 = r2.m13950()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r2 = r2.getMessage()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r10.m27028(r3, r2, r1)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            return r1
        L179:
            Yue.ۥ۠ۨۡۥ r2 = r10.f24377     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r3 = "Closing due to protocol error: draft {} refuses handshake"
            Yue.ۥ۠۠۠۟ r4 = r10.f24387     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r2.mo10321(r3, r4)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r2.<init>()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r3 = "draft "
            r2.append(r3)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            Yue.ۥ۠۠۠۟ r3 = r10.f24387     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r2.append(r3)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r3 = " refuses handshake"
            r2.append(r3)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            java.lang.String r2 = r2.toString()     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            r10.mo26936(r7, r2)     // Catch: Yue.C3237 -> L88 Yue.C3345 -> Ld1
            goto L1dc
        L19e:
            Yue.ۥ۠ۨۡۥ r3 = r10.f24377     // Catch: Yue.C3237 -> L88
            java.lang.String r4 = "Closing due to invalid handshake"
            r3.mo10344(r4, r2)     // Catch: Yue.C3237 -> L88
            r10.m27018(r2)     // Catch: Yue.C3237 -> L88
            goto L1dc
        L1a9:
            java.nio.ByteBuffer r3 = r10.f24389
            int r3 = r3.capacity()
            if (r3 != 0) goto L1ca
            r0.reset()
            int r2 = r2.m13657()
            if (r2 != 0) goto L1c0
            int r0 = r0.capacity()
            int r2 = r0 + 16
        L1c0:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)
            r10.f24389 = r0
            r0.put(r11)
            goto L1dc
        L1ca:
            java.nio.ByteBuffer r11 = r10.f24389
            int r0 = r11.limit()
            r11.position(r0)
            java.nio.ByteBuffer r11 = r10.f24389
            int r0 = r11.capacity()
            r11.limit(r0)
        L1dc:
            return r1
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public Yue.InterfaceC3193 mo26944() {
            r2 = this;
            Yue.ۥ۠۠۠۟ r0 = r2.f24387
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r1 = r0 instanceof Yue.C1987
            if (r1 == 0) goto L11
            Yue.ۥ۠۠۠۠ r0 = (Yue.C1987) r0
            Yue.ۥ۠ۥۣ۟ r0 = r0.m9187()
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "This draft does not support Sec-WebSocket-Protocol"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m27027() {
            r5 = this;
            Yue.ۥۡۦ۠ۡ r0 = r5.f24385
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19551
            r2 = 1
            if (r0 != r1) goto Lc
            r0 = -1
            r5.m27021(r0, r2)
            goto L4f
        Lc:
            boolean r0 = r5.f24384
            if (r0 == 0) goto L22
            java.lang.Integer r0 = r5.f24392
            int r0 = r0.intValue()
            java.lang.String r1 = r5.f24391
            java.lang.Boolean r2 = r5.f24393
            boolean r2 = r2.booleanValue()
            r5.m27020(r0, r1, r2)
            goto L4f
        L22:
            Yue.ۥ۠۠۠۟ r0 = r5.f24387
            Yue.ۥ۟ۤۨۧ r0 = r0.mo9163()
            Yue.ۥ۟ۤۨۧ r1 = Yue.EnumC1172.f3657
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r1) goto L32
            r5.m27021(r3, r2)
            goto L4f
        L32:
            Yue.ۥ۠۠۠۟ r0 = r5.f24387
            Yue.ۥ۟ۤۨۧ r0 = r0.mo9163()
            Yue.ۥ۟ۤۨۧ r1 = Yue.EnumC1172.f3658
            r4 = 1006(0x3ee, float:1.41E-42)
            if (r0 != r1) goto L4c
            Yue.ۥۡۧ۟ۨ r0 = r5.f24388
            Yue.ۥۡۧ۟ۨ r1 = Yue.EnumC5428.f20113
            if (r0 != r1) goto L48
            r5.m27021(r4, r2)
            goto L4f
        L48:
            r5.m27021(r3, r2)
            goto L4f
        L4c:
            r5.m27021(r4, r2)
        L4f:
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public void mo26945() throws java.lang.NullPointerException {
            r2 = this;
            Yue.ۥۢۥۡۦ r0 = r2.f24380
            Yue.ۥۡۤۡ۠ r0 = r0.mo26958(r2)
            if (r0 == 0) goto Lc
            r2.mo26939(r0)
            return
        Lc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "onPreparePing(WebSocket) returned null. PingFrame to sent can't be null."
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo26946(java.util.Collection<Yue.InterfaceC2813> r1) {
            r0 = this;
            r0.m27036(r1)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo26947() {
            r2 = this;
            Yue.ۥۡۦ۠ۡ r0 = r2.f24385
            Yue.ۥۡۦ۠ۡ r1 = Yue.EnumC5210.f19554
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public synchronized void m27028(int r2, java.lang.String r3, boolean r4) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f24384     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L23
            r1.f24392 = r0     // Catch: java.lang.Throwable -> L23
            r1.f24391 = r3     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L23
            r1.f24393 = r0     // Catch: java.lang.Throwable -> L23
            r0 = 1
            r1.f24384 = r0     // Catch: java.lang.Throwable -> L23
            Yue.ۥۢۥۡۦ r0 = r1.f24380     // Catch: java.lang.Throwable -> L23
            r0.mo26973(r1)     // Catch: java.lang.Throwable -> L23
            Yue.ۥۢۥۡۦ r0 = r1.f24380     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L25
            r0.mo26974(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L25
            goto L32
        L23:
            r2 = move-exception
            goto L3e
        L25:
            r2 = move-exception
            Yue.ۥ۠ۨۡۥ r3 = r1.f24377     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "Exception in onWebsocketClosing"
            r3.error(r4, r2)     // Catch: java.lang.Throwable -> L23
            Yue.ۥۢۥۡۦ r3 = r1.f24380     // Catch: java.lang.Throwable -> L23
            r3.mo26979(r1, r2)     // Catch: java.lang.Throwable -> L23
        L32:
            Yue.ۥ۠۠۠۟ r2 = r1.f24387     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L39
            r2.mo9169()     // Catch: java.lang.Throwable -> L23
        L39:
            r2 = 0
            r1.f24390 = r2     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)
            return
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo26948(java.nio.ByteBuffer r4) {
            r3 = this;
            if (r4 == 0) goto L15
            Yue.ۥ۠۠۠۟ r0 = r3.f24387
            Yue.ۥۡۧ۟ۨ r1 = r3.f24388
            Yue.ۥۡۧ۟ۨ r2 = Yue.EnumC5428.f20112
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.util.List r4 = r0.mo9158(r4, r1)
            r3.m27036(r4)
            return
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot send 'null' data to a WebSocketImpl."
            r4.<init>(r0)
            throw r4
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public boolean mo26949() {
            r1 = this;
            boolean r0 = r1.f24384
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo26950(Yue.EnumC4633 r2, java.nio.ByteBuffer r3, boolean r4) {
            r1 = this;
            Yue.ۥ۠۠۠۟ r0 = r1.f24387
            java.util.List r2 = r0.m9154(r2, r3, r4)
            r1.m27036(r2)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public <T> void mo26951(T r1) {
            r0 = this;
            r0.f24397 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final java.nio.ByteBuffer m27029(int r3) {
            r2 = this;
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L7
            java.lang.String r3 = "500 Internal Server Error"
            goto L9
        L7:
            java.lang.String r3 = "404 WebSocket Upgrade Failure"
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HTTP/1.1 "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: "
            r0.append(r1)
            int r1 = r3.length()
            int r1 = r1 + 48
            r0.append(r1)
            java.lang.String r1 = "\r\n\r\n<html><head></head><body><h1>"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "</h1></body></html>"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            byte[] r3 = Yue.C1098.m5882(r3)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            return r3
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo26952() {
            r1 = this;
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r1.f24378
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public java.nio.channels.ByteChannel m27030() {
            r1 = this;
            java.nio.channels.ByteChannel r0 = r1.f24382
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public <T> T mo26953() {
            r1 = this;
            java.lang.Object r0 = r1.f24397
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public java.net.InetSocketAddress mo26954() {
            r1 = this;
            Yue.ۥۢۥۡۦ r0 = r1.f24380
            java.net.InetSocketAddress r0 = r0.mo26975(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public long m27031() {
            r2 = this;
            long r0 = r2.f24395
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public void mo26955(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.m27020(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public java.nio.channels.SelectionKey m27032() {
            r1 = this;
            java.nio.channels.SelectionKey r0 = r1.f24381
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public javax.net.ssl.SSLSession mo26956() {
            r2 = this;
            boolean r0 = r2.mo26942()
            if (r0 == 0) goto L13
            java.nio.channels.ByteChannel r0 = r2.f24382
            Yue.ۥ۠ۥ۟ۦ r0 = (Yue.InterfaceC3204) r0
            javax.net.ssl.SSLEngine r0 = r0.mo13618()
            javax.net.ssl.SSLSession r0 = r0.getSession()
            return r0
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "This websocket uses ws instead of wss. No SSLSession available."
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public java.net.InetSocketAddress mo26957() {
            r1 = this;
            Yue.ۥۢۥۡۦ r0 = r1.f24380
            java.net.InetSocketAddress r0 = r0.mo26976(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public Yue.InterfaceC6990 m27033() {
            r1 = this;
            Yue.ۥۢۥۡۦ r0 = r1.f24380
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Yue.AbstractRunnableC6995.C6996 m27034() {
            r1 = this;
            Yue.ۥۢۥۢ۟$ۥ r0 = r1.f24383
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m27035(Yue.InterfaceC2981 r4) {
            r3 = this;
            Yue.ۥ۠ۨۡۥ r0 = r3.f24377
            java.lang.String r1 = "open using draft: {}"
            Yue.ۥ۠۠۠۟ r2 = r3.f24387
            r0.mo10321(r1, r2)
            Yue.ۥۡۦ۠ۡ r0 = Yue.EnumC5210.f19552
            r3.f24385 = r0
            r3.m27041()
            Yue.ۥۢۥۡۦ r0 = r3.f24380     // Catch: java.lang.RuntimeException -> L16
            r0.mo26977(r3, r4)     // Catch: java.lang.RuntimeException -> L16
            goto L1c
        L16:
            r4 = move-exception
            Yue.ۥۢۥۡۦ r0 = r3.f24380
            r0.mo26979(r3, r4)
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m27036(java.util.Collection<Yue.InterfaceC2813> r5) {
            r4 = this;
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L38
            if (r5 == 0) goto L32
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.next()
            Yue.ۥۣ۠۠۠ r1 = (Yue.InterfaceC2813) r1
            Yue.ۥ۠ۨۡۥ r2 = r4.f24377
            java.lang.String r3 = "send frame: {}"
            r2.mo10321(r3, r1)
            Yue.ۥ۠۠۠۟ r2 = r4.f24387
            java.nio.ByteBuffer r1 = r2.mo9156(r1)
            r0.add(r1)
            goto L11
        L2e:
            r4.m27043(r0)
            return
        L32:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L38:
            Yue.ۥۢۥۢۤ r5 = new Yue.ۥۢۥۢۤ
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m27037(java.nio.channels.ByteChannel r1) {
            r0 = this;
            r0.f24382 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m27038(java.nio.channels.SelectionKey r1) {
            r0 = this;
            r0.f24381 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m27039(Yue.AbstractRunnableC6995.C6996 r1) {
            r0 = this;
            r0.f24383 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m27040(Yue.InterfaceC1166 r4) throws Yue.C3345 {
            r3 = this;
            Yue.ۥ۠۠۠۟ r0 = r3.f24387
            Yue.ۥ۟ۤۨۢ r0 = r0.mo9165(r4)
            r3.f24390 = r0
            java.lang.String r4 = r4.mo6095()
            r3.f24394 = r4
            Yue.ۥۢۥۡۦ r4 = r3.f24380     // Catch: java.lang.RuntimeException -> L21 Yue.C3342 -> L45
            Yue.ۥ۟ۤۨۡ r0 = r3.f24390     // Catch: java.lang.RuntimeException -> L21 Yue.C3342 -> L45
            r4.mo26959(r3, r0)     // Catch: java.lang.RuntimeException -> L21 Yue.C3342 -> L45
            Yue.ۥ۠۠۠۟ r4 = r3.f24387
            Yue.ۥ۟ۤۨۡ r0 = r3.f24390
            java.util.List r4 = r4.m9159(r0)
            r3.m27043(r4)
            return
        L21:
            r4 = move-exception
            Yue.ۥ۠ۨۡۥ r0 = r3.f24377
            java.lang.String r1 = "Exception in startHandshake"
            r0.error(r1, r4)
            Yue.ۥۢۥۡۦ r0 = r3.f24380
            r0.mo26979(r3, r4)
            Yue.ۥ۠ۥۧۧ r0 = new Yue.ۥ۠ۥۧۧ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "rejected because of "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L45:
            Yue.ۥ۠ۥۧۧ r4 = new Yue.ۥ۠ۥۧۧ
            java.lang.String r0 = "Handshake data rejected by client."
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27041() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.f24395 = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m27042(java.nio.ByteBuffer r5) {
            r4 = this;
            Yue.ۥ۠ۨۡۥ r0 = r4.f24377
            int r1 = r5.remaining()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.remaining()
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 <= r3) goto L15
            java.lang.String r2 = "too big to display"
            goto L1e
        L15:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r5.array()
            r2.<init>(r3)
        L1e:
            java.lang.String r3 = "write({}): {}"
            r0.mo10322(r3, r1, r2)
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f24378
            r0.add(r5)
            Yue.ۥۢۥۡۦ r5 = r4.f24380
            r5.mo26973(r4)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m27043(java.util.List<java.nio.ByteBuffer> r3) {
            r2 = this;
            java.lang.Object r0 = r2.f24396
            monitor-enter(r0)
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L17
        L7:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.Throwable -> L17
            r2.m27042(r1)     // Catch: java.lang.Throwable -> L17
            goto L7
        L17:
            r3 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }
}
