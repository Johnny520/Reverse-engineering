package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4986
public class C0934<T> extends Yue.AbstractC1874<T> implements Yue.InterfaceC0932<T>, Yue.InterfaceC1665 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f2695 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f2696 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _decision;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1598<T> f2697;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1632 f2698;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC1892 f2699;

    static {
            java.lang.String r0 = "_decision"
            java.lang.Class<Yue.ۥۣ۟ۨ۠> r1 = Yue.C0934.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            Yue.C0934.f2695 = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            Yue.C0934.f2696 = r0
            return
    }

    public C0934(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f2697 = r1
            Yue.ۥ۟ۧۦۥ r1 = r1.getContext()
            r0.f2698 = r1
            r1 = 0
            r0._decision = r1
            Yue.ۥ۟۟ۧۡ r1 = Yue.C0186.f439
            r0._state = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    private final boolean m5312() {
            r1 = this;
            int r0 = r1.f5791
            boolean r0 = Yue.C1875.m8764(r0)
            if (r0 == 0) goto L14
            Yue.ۥ۟ۧۤۢ<T> r0 = r1.f2697
            Yue.ۥ۠۟ۢ۟ r0 = (Yue.C1871) r0
            boolean r0 = r0.m8742()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ void m5313(Yue.C0934 r0, java.lang.Object r1, int r2, Yue.InterfaceC2825 r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto Lb
            r4 = r4 & 4
            if (r4 == 0) goto L7
            r3 = 0
        L7:
            r0.m5339(r1, r2, r3)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: resumeImpl"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public Yue.InterfaceC1665 getCallerFrame() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r2.f2697
            boolean r1 = r0 instanceof Yue.InterfaceC1665
            if (r1 == 0) goto L9
            Yue.ۥ۟ۧۧۨ r0 = (Yue.InterfaceC1665) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.f2698
            return r0
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC0932
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.m5330()
            boolean r0 = r0 instanceof Yue.C0945
            return r0
    }

    @Override // Yue.InterfaceC1598
    public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r7) {
            r6 = this;
            java.lang.Object r1 = Yue.C1423.m7052(r7, r6)
            int r2 = r6.f5791
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            m5313(r0, r1, r2, r3, r4, r5)
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mo5335()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            Yue.ۥ۟ۧۤۢ<T> r1 = r2.f2697
            java.lang.String r1 = Yue.C1758.m8352(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.lang.String r1 = r2.m5331()
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC1874
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo5314(@Yue.InterfaceC4543 java.lang.Object r11, @Yue.InterfaceC4418 java.lang.Throwable r12) {
            r10 = this;
        L0:
            java.lang.Object r11 = r10._state
            boolean r0 = r11 instanceof Yue.InterfaceC4416
            if (r0 != 0) goto L56
            boolean r0 = r11 instanceof Yue.C1417
            if (r0 == 0) goto Lb
            return
        Lb:
            boolean r0 = r11 instanceof Yue.C1415
            if (r0 == 0) goto L3f
            r0 = r11
            Yue.ۥ۟ۦۣ۠ r0 = (Yue.C1415) r0
            boolean r1 = r0.m7039()
            r1 = r1 ^ 1
            if (r1 == 0) goto L33
            r7 = 15
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r0
            r6 = r12
            Yue.ۥ۟ۦۣ۠ r1 = Yue.C1415.m7032(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C0934.f2696
            boolean r11 = Yue.C0084.m471(r2, r10, r11, r1)
            if (r11 == 0) goto L0
            r0.m7040(r10, r12)
            return
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Must be called at most once"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L3f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = Yue.C0934.f2696
            Yue.ۥ۟ۦۣ۠ r9 = new Yue.ۥ۟ۦۣ۠
            r6 = 14
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r11 = Yue.C0084.m471(r8, r10, r11, r9)
            if (r11 == 0) goto L0
            return
        L56:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not completed"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo5298(@Yue.InterfaceC4543 java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.InterfaceC4416
            if (r1 != 0) goto L8
            r5 = 0
            return r5
        L8:
            Yue.ۥۣ۟ۨۨ r1 = new Yue.ۥۣ۟ۨۨ
            boolean r2 = r0 instanceof Yue.AbstractC0928
            r1.<init>(r4, r5, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Yue.C0934.f2696
            boolean r1 = Yue.C0084.m471(r3, r4, r0, r1)
            if (r1 == 0) goto L0
            if (r2 == 0) goto L1c
            Yue.ۥۣ۟ۧۦ r0 = (Yue.AbstractC0928) r0
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L22
            r4.m5320(r0, r5)
        L22:
            r4.m5326()
            int r5 = r4.f5791
            r4.m5327(r5)
            r5 = 1
            return r5
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo5299() {
            r1 = this;
            java.lang.Object r0 = r1.m5330()
            boolean r0 = r0 instanceof Yue.InterfaceC4416
            return r0
    }

    @Override // Yue.AbstractC1874
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC1598<T> mo5315() {
            r1 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r1.f2697
            return r0
    }

    @Override // Yue.AbstractC1874
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Throwable mo5316(@Yue.InterfaceC4543 java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = super.mo5316(r1)
            if (r1 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    @Override // Yue.AbstractC1874
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public <T> T mo5317(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C1415
            if (r0 == 0) goto L8
            Yue.ۥ۟ۦۣ۠ r2 = (Yue.C1415) r2
            java.lang.Object r2 = r2.f4513
        L8:
            return r2
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo5300() {
            r1 = this;
            java.lang.Object r0 = r1.m5330()
            boolean r0 = r0 instanceof Yue.InterfaceC4416
            r0 = r0 ^ 1
            return r0
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo5301(T r2, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r3) {
            r1 = this;
            int r0 = r1.f5791
            r1.m5339(r2, r0, r3)
            return
    }

    @Override // Yue.InterfaceC0932
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public java.lang.Object mo5302(T r2, @Yue.InterfaceC4543 java.lang.Object r3) {
            r1 = this;
            r0 = 0
            Yue.ۥۢ۠ۦۢ r2 = r1.m5342(r2, r3, r0)
            return r2
    }

    @Override // Yue.AbstractC1874
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.lang.Object mo5318() {
            r1 = this;
            java.lang.Object r0 = r1.m5330()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final java.lang.Void m5319(java.lang.Object r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Already resumed, but proposed with update "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m5320(@Yue.InterfaceC4418 Yue.AbstractC0928 r4, @Yue.InterfaceC4543 java.lang.Throwable r5) {
            r3 = this;
            r4.mo353(r5)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r4 = move-exception
            Yue.ۥ۟ۧۦۥ r5 = r3.getContext()
            Yue.ۥ۟ۦۣۥ r0 = new Yue.ۥ۟ۦۣۥ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            Yue.C1650.m7933(r5, r0)
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m5321(Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r4, java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r4 = move-exception
            Yue.ۥ۟ۧۦۥ r5 = r3.getContext()
            Yue.ۥ۟ۦۣۥ r0 = new Yue.ۥ۟ۦۣۥ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            Yue.C1650.m7933(r5, r0)
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m5322(Yue.InterfaceC2823<Yue.C6593> r5) {
            r4 = this;
            r5.invoke()     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r5 = move-exception
            Yue.ۥ۟ۧۦۥ r0 = r4.getContext()
            Yue.ۥ۟ۦۣۥ r1 = new Yue.ۥ۟ۦۣۥ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in invokeOnCancellation handler for "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r5)
            Yue.C1650.m7933(r0, r1)
        L22:
            return
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo5303(@Yue.InterfaceC4418 Yue.AbstractC1643 r7, T r8) {
            r6 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r6.f2697
            boolean r1 = r0 instanceof Yue.C1871
            r2 = 0
            if (r1 == 0) goto La
            Yue.ۥ۠۟ۢ۟ r0 = (Yue.C1871) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto Lf
            Yue.ۥ۟ۧۦۨ r2 = r0.f5784
        Lf:
            if (r2 != r7) goto L14
            r7 = 4
        L12:
            r2 = r7
            goto L17
        L14:
            int r7 = r6.f5791
            goto L12
        L17:
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r8
            m5313(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m5323(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r4, @Yue.InterfaceC4418 java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r4 = move-exception
            Yue.ۥ۟ۧۦۥ r5 = r3.getContext()
            Yue.ۥ۟ۦۣۥ r0 = new Yue.ۥ۟ۦۣۥ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in resume onCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            Yue.C1650.m7933(r5, r0)
        L22:
            return
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo5304(@Yue.InterfaceC4418 Yue.AbstractC1643 r10, @Yue.InterfaceC4418 java.lang.Throwable r11) {
            r9 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r9.f2697
            boolean r1 = r0 instanceof Yue.C1871
            r2 = 0
            if (r1 == 0) goto La
            Yue.ۥ۠۟ۢ۟ r0 = (Yue.C1871) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            Yue.ۥ۟ۦۣۢ r4 = new Yue.ۥ۟ۦۣۢ
            r1 = 0
            r3 = 2
            r4.<init>(r11, r1, r3, r2)
            if (r0 == 0) goto L16
            Yue.ۥ۟ۧۦۨ r2 = r0.f5784
        L16:
            if (r2 != r10) goto L1b
            r10 = 4
        L19:
            r5 = r10
            goto L1e
        L1b:
            int r10 = r9.f5791
            goto L19
        L1e:
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r9
            m5313(r3, r4, r5, r6, r7, r8)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m5324(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.m5312()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            Yue.ۥ۟ۧۤۢ<T> r0 = r1.f2697
            Yue.ۥ۠۟ۢ۟ r0 = (Yue.C1871) r0
            boolean r2 = r0.m8743(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m5325() {
            r1 = this;
            Yue.ۥۣۣ۠۟ r0 = r1.f2699
            if (r0 != 0) goto L5
            return
        L5:
            r0.mo352()
            Yue.ۥۡۢۤۡ r0 = Yue.C4408.f13977
            r1.f2699 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m5326() {
            r1 = this;
            boolean r0 = r1.m5312()
            if (r0 != 0) goto L9
            r1.m5325()
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m5327(int r2) {
            r1 = this;
            boolean r0 = r1.m5341()
            if (r0 == 0) goto L7
            return
        L7:
            Yue.C1875.m8761(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.lang.Throwable mo5328(@Yue.InterfaceC4418 Yue.InterfaceC3383 r1) {
            r0 = this;
            java.util.concurrent.CancellationException r1 = r1.mo13982()
            return r1
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final java.lang.Object m5329() {
            r3 = this;
            boolean r0 = r3.m5312()
            boolean r1 = r3.m5343()
            if (r1 == 0) goto L1b
            Yue.ۥۣۣ۠۟ r1 = r3.f2699
            if (r1 != 0) goto L11
            r3.m5332()
        L11:
            if (r0 == 0) goto L16
            r3.m5337()
        L16:
            java.lang.Object r0 = Yue.C3341.m13947()
            return r0
        L1b:
            if (r0 == 0) goto L20
            r3.m5337()
        L20:
            java.lang.Object r0 = r3.m5330()
            boolean r1 = r0 instanceof Yue.C1417
            if (r1 != 0) goto L52
            int r1 = r3.f5791
            boolean r1 = Yue.C1875.m8763(r1)
            if (r1 == 0) goto L4d
            Yue.ۥ۟ۧۦۥ r1 = r3.getContext()
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r2 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r1.get(r2)
            Yue.ۥ۠ۦ۟ۡ r1 = (Yue.InterfaceC3383) r1
            if (r1 == 0) goto L4d
            boolean r2 = r1.mo371()
            if (r2 == 0) goto L45
            goto L4d
        L45:
            java.util.concurrent.CancellationException r1 = r1.mo13982()
            r3.mo5314(r0, r1)
            throw r1
        L4d:
            java.lang.Object r0 = r3.mo5317(r0)
            return r0
        L52:
            Yue.ۥ۟ۦۣۢ r0 = (Yue.C1417) r0
            java.lang.Throwable r0 = r0.f4520
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final java.lang.Object m5330() {
            r1 = this;
            java.lang.Object r0 = r1._state
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final java.lang.String m5331() {
            r2 = this;
            java.lang.Object r0 = r2.m5330()
            boolean r1 = r0 instanceof Yue.InterfaceC4416
            if (r1 == 0) goto Lb
            java.lang.String r0 = "Active"
            goto L14
        Lb:
            boolean r0 = r0 instanceof Yue.C0945
            if (r0 == 0) goto L12
            java.lang.String r0 = "Cancelled"
            goto L14
        L12:
            java.lang.String r0 = "Completed"
        L14:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Yue.InterfaceC1892 m5332() {
            r7 = this;
            Yue.ۥ۟ۧۦۥ r0 = r7.getContext()
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r1 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r0.get(r1)
            r1 = r0
            Yue.ۥ۠ۦ۟ۡ r1 = (Yue.InterfaceC3383) r1
            if (r1 != 0) goto L11
            r0 = 0
            return r0
        L11:
            Yue.ۥ۟ۤۥۧ r4 = new Yue.ۥ۟ۤۥۧ
            r4.<init>(r7)
            r5 = 2
            r6 = 0
            r2 = 1
            r3 = 0
            Yue.ۥۣۣ۠۟ r0 = Yue.InterfaceC3383.C3384.m13992(r1, r2, r3, r4, r5, r6)
            r7.f2699 = r0
            return r0
    }

    @Override // Yue.InterfaceC0932
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public java.lang.Object mo5305(@Yue.InterfaceC4418 java.lang.Throwable r5) {
            r4 = this;
            Yue.ۥ۟ۦۣۢ r0 = new Yue.ۥ۟ۦۣۢ
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            Yue.ۥۢ۠ۦۢ r5 = r4.m5342(r0, r3, r3)
            return r5
    }

    @Override // Yue.InterfaceC0932
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public java.lang.Object mo5306(T r1, @Yue.InterfaceC4543 java.lang.Object r2, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r3) {
            r0 = this;
            Yue.ۥۢ۠ۦۢ r1 = r0.m5342(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final Yue.AbstractC0928 m5333(Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.AbstractC0928
            if (r0 == 0) goto L7
            Yue.ۥۣ۟ۧۦ r2 = (Yue.AbstractC0928) r2
            goto Ld
        L7:
            Yue.ۥ۠ۥۨ r0 = new Yue.ۥ۠ۥۨ
            r0.<init>(r2)
            r2 = r0
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m5334(Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", already has "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public java.lang.String mo5335() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m5336(@Yue.InterfaceC4418 java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.m5324(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.mo5298(r2)
            r1.m5326()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m5337() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r2.f2697
            boolean r1 = r0 instanceof Yue.C1871
            if (r1 == 0) goto L9
            Yue.ۥ۠۟ۢ۟ r0 = (Yue.C1871) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L19
            java.lang.Throwable r0 = r0.m8748(r2)
            if (r0 != 0) goto L13
            goto L19
        L13:
            r2.m5325()
            r2.mo5298(r0)
        L19:
            return
    }

    @Yue.InterfaceC3421(name = "resetStateReusable")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m5338() {
            r3 = this;
            java.lang.Object r0 = r3._state
            boolean r1 = r0 instanceof Yue.C1415
            r2 = 0
            if (r1 == 0) goto L11
            Yue.ۥ۟ۦۣ۠ r0 = (Yue.C1415) r0
            java.lang.Object r0 = r0.f4516
            if (r0 == 0) goto L11
            r3.m5325()
            return r2
        L11:
            r3._decision = r2
            Yue.ۥ۟۟ۧۡ r0 = Yue.C0186.f439
            r3._state = r0
            r0 = 1
            return r0
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public void mo5307() {
            r2 = this;
            Yue.ۥۣۣ۠۟ r0 = r2.m5332()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r2.mo5300()
            if (r1 == 0) goto L14
            r0.mo352()
            Yue.ۥۡۢۤۡ r0 = Yue.C4408.f13977
            r2.f2699 = r0
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m5339(java.lang.Object r9, int r10, Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r11) {
            r8 = this;
        L0:
            java.lang.Object r0 = r8._state
            boolean r1 = r0 instanceof Yue.InterfaceC4416
            if (r1 == 0) goto L21
            r3 = r0
            Yue.ۥۡۢۥ r3 = (Yue.InterfaceC4416) r3
            r7 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            java.lang.Object r1 = r2.m5340(r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C0934.f2696
            boolean r0 = Yue.C0084.m471(r2, r8, r0, r1)
            if (r0 == 0) goto L0
            r8.m5326()
            r8.m5327(r10)
            return
        L21:
            boolean r10 = r0 instanceof Yue.C0945
            if (r10 == 0) goto L35
            Yue.ۥۣ۟ۨۨ r0 = (Yue.C0945) r0
            boolean r10 = r0.m5368()
            if (r10 == 0) goto L35
            if (r11 == 0) goto L34
            java.lang.Throwable r9 = r0.f4520
            r8.m5323(r11, r9)
        L34:
            return
        L35:
            r8.m5319(r9)
            Yue.ۥ۠ۦۧۤ r9 = new Yue.ۥ۠ۦۧۤ
            r9.<init>()
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final java.lang.Object m5340(Yue.InterfaceC4416 r9, java.lang.Object r10, int r11, Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r12, java.lang.Object r13) {
            r8 = this;
            boolean r0 = r10 instanceof Yue.C1417
            if (r0 == 0) goto L5
            goto L32
        L5:
            boolean r11 = Yue.C1875.m8763(r11)
            if (r11 != 0) goto Le
            if (r13 != 0) goto Le
            goto L32
        Le:
            if (r12 != 0) goto L1a
            boolean r11 = r9 instanceof Yue.AbstractC0928
            if (r11 == 0) goto L18
            boolean r11 = r9 instanceof Yue.AbstractC0751
            if (r11 == 0) goto L1a
        L18:
            if (r13 == 0) goto L32
        L1a:
            Yue.ۥ۟ۦۣ۠ r11 = new Yue.ۥ۟ۦۣ۠
            boolean r0 = r9 instanceof Yue.AbstractC0928
            if (r0 == 0) goto L24
            Yue.ۥۣ۟ۧۦ r9 = (Yue.AbstractC0928) r9
        L22:
            r2 = r9
            goto L26
        L24:
            r9 = 0
            goto L22
        L26:
            r6 = 16
            r7 = 0
            r5 = 0
            r0 = r11
            r1 = r10
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = r11
        L32:
            return r10
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m5341() {
            r4 = this;
        L0:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C0934.f2695
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final Yue.C6075 m5342(java.lang.Object r9, java.lang.Object r10, Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r11) {
            r8 = this;
        L0:
            java.lang.Object r0 = r8._state
            boolean r1 = r0 instanceof Yue.InterfaceC4416
            if (r1 == 0) goto L21
            r3 = r0
            Yue.ۥۡۢۥ r3 = (Yue.InterfaceC4416) r3
            int r5 = r8.f5791
            r2 = r8
            r4 = r9
            r6 = r11
            r7 = r10
            java.lang.Object r1 = r2.m5340(r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C0934.f2696
            boolean r0 = Yue.C0084.m471(r2, r8, r0, r1)
            if (r0 == 0) goto L0
            r8.m5326()
            Yue.ۥۢ۠ۦۢ r9 = Yue.C0935.f2703
            return r9
        L21:
            boolean r9 = r0 instanceof Yue.C1415
            r11 = 0
            if (r9 == 0) goto L30
            if (r10 == 0) goto L30
            Yue.ۥ۟ۦۣ۠ r0 = (Yue.C1415) r0
            java.lang.Object r9 = r0.f4516
            if (r9 != r10) goto L30
            Yue.ۥۢ۠ۦۢ r11 = Yue.C0935.f2703
        L30:
            return r11
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final boolean m5343() {
            r3 = this;
        L0:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L15
            r2 = 2
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C0934.f2695
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            return r2
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo5308(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r12) {
            r11 = this;
            Yue.ۥۣ۟ۧۦ r8 = r11.m5333(r12)
        L4:
            java.lang.Object r9 = r11._state
            boolean r0 = r9 instanceof Yue.C0186
            if (r0 == 0) goto L13
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C0934.f2696
            boolean r0 = Yue.C0084.m471(r0, r11, r9, r8)
            if (r0 == 0) goto L4
            return
        L13:
            boolean r0 = r9 instanceof Yue.AbstractC0928
            if (r0 == 0) goto L1b
            r11.m5334(r12, r9)
            goto L4
        L1b:
            boolean r0 = r9 instanceof Yue.C1417
            if (r0 == 0) goto L3e
            r0 = r9
            Yue.ۥ۟ۦۣۢ r0 = (Yue.C1417) r0
            boolean r1 = r0.m7042()
            if (r1 != 0) goto L2b
            r11.m5334(r12, r9)
        L2b:
            boolean r1 = r9 instanceof Yue.C0945
            if (r1 == 0) goto L3d
            boolean r1 = r9 instanceof Yue.C1417
            r2 = 0
            if (r1 == 0) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 == 0) goto L3a
            java.lang.Throwable r2 = r0.f4520
        L3a:
            r11.m5321(r12, r2)
        L3d:
            return
        L3e:
            boolean r0 = r9 instanceof Yue.C1415
            if (r0 == 0) goto L72
            r0 = r9
            Yue.ۥ۟ۦۣ۠ r0 = (Yue.C1415) r0
            Yue.ۥۣ۟ۧۦ r1 = r0.f4514
            if (r1 == 0) goto L4c
            r11.m5334(r12, r9)
        L4c:
            boolean r1 = r8 instanceof Yue.AbstractC0751
            if (r1 == 0) goto L51
            return
        L51:
            boolean r1 = r0.m7039()
            if (r1 == 0) goto L5d
            java.lang.Throwable r0 = r0.f4517
            r11.m5321(r12, r0)
            return
        L5d:
            r6 = 29
            r7 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            Yue.ۥ۟ۦۣ۠ r0 = Yue.C1415.m7032(r0, r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C0934.f2696
            boolean r0 = Yue.C0084.m471(r1, r11, r9, r0)
            if (r0 == 0) goto L4
            return
        L72:
            boolean r0 = r8 instanceof Yue.AbstractC0751
            if (r0 == 0) goto L77
            return
        L77:
            Yue.ۥ۟ۦۣ۠ r10 = new Yue.ۥ۟ۦۣ۠
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r10
            r1 = r9
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C0934.f2696
            boolean r0 = Yue.C0084.m471(r0, r11, r9, r10)
            if (r0 == 0) goto L4
            return
    }

    @Override // Yue.InterfaceC0932
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public void mo5309(@Yue.InterfaceC4418 java.lang.Object r1) {
            r0 = this;
            int r1 = r0.f5791
            r0.m5327(r1)
            return
    }
}
