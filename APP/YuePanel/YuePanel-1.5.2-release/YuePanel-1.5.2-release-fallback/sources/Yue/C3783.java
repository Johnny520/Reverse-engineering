package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3324
public class C3783 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11993 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11994 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11995 = null;

    @Yue.InterfaceC4418
    volatile /* synthetic */ java.lang.Object _next;

    @Yue.InterfaceC4418
    volatile /* synthetic */ java.lang.Object _prev;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _removedRef;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ, reason: contains not printable characters */
    public static abstract class AbstractC3784 extends Yue.AbstractC0637 {
        public AbstractC3784() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0637
        /* JADX INFO: renamed from: ۥ */
        public final void mo4180(@Yue.InterfaceC4418 Yue.AbstractC0641<?> r5, @Yue.InterfaceC4543 java.lang.Object r6) {
                r4 = this;
                if (r6 != 0) goto L4
                r6 = 1
                goto L5
            L4:
                r6 = 0
            L5:
                Yue.ۥ۠ۨ۠ۥ r0 = r4.mo15184()
                if (r0 != 0) goto Lc
                return
            Lc:
                Yue.ۥ۠ۨ۠ۥ r1 = r4.mo15185()
                if (r1 != 0) goto L13
                return
            L13:
                if (r6 == 0) goto L1a
                java.lang.Object r2 = r4.mo15188(r0, r1)
                goto L1b
            L1a:
                r2 = r1
            L1b:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Yue.C3783.f11993
                boolean r5 = Yue.C0084.m471(r3, r0, r5, r2)
                if (r5 == 0) goto L28
                if (r6 == 0) goto L28
                r4.mo15182(r0, r1)
            L28:
                return
        }

        @Override // Yue.AbstractC0637
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final java.lang.Object mo4182(@Yue.InterfaceC4418 Yue.AbstractC0641<?> r6) {
                r5 = this;
            L0:
                Yue.ۥ۠ۨ۠ۥ r0 = r5.mo15187(r6)
                if (r0 != 0) goto L9
                java.lang.Object r6 = Yue.C0640.f1626
                return r6
            L9:
                java.lang.Object r1 = r0._next
                r2 = 0
                if (r1 != r6) goto Lf
                return r2
            Lf:
                boolean r3 = r6.m4208()
                if (r3 == 0) goto L16
                return r2
            L16:
                boolean r3 = r1 instanceof Yue.AbstractC4632
                if (r3 == 0) goto L29
                Yue.ۥۣۣۡۡ r1 = (Yue.AbstractC4632) r1
                boolean r2 = r6.m18453(r1)
                if (r2 == 0) goto L25
                java.lang.Object r6 = Yue.C0640.f1626
                return r6
            L25:
                r1.mo4203(r0)
                goto L0
            L29:
                java.lang.Object r3 = r5.mo354(r0)
                if (r3 == 0) goto L30
                return r3
            L30:
                boolean r3 = r5.mo15186(r0, r1)
                if (r3 != 0) goto L0
                Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟ r3 = new Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟
                r4 = r1
                Yue.ۥ۠ۨ۠ۥ r4 = (Yue.C3783) r4
                r3.<init>(r0, r4, r5)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Yue.C3783.f11993
                boolean r4 = Yue.C0084.m471(r4, r0, r1, r3)
                if (r4 == 0) goto L0
                java.lang.Object r4 = r3.mo4203(r0)     // Catch: java.lang.Throwable -> L4f
                java.lang.Object r0 = Yue.C3791.f12008     // Catch: java.lang.Throwable -> L4f
                if (r4 == r0) goto L0
                return r2
            L4f:
                r6 = move-exception
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C3783.f11993
                Yue.C0084.m471(r2, r0, r3, r1)
                throw r6
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.Object mo354(@Yue.InterfaceC4418 Yue.C3783 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public abstract void mo15182(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 Yue.C3783 r2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public abstract void mo15183(@Yue.InterfaceC4418 Yue.C3783.C3787 r1);

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public abstract Yue.C3783 mo15184();

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public abstract Yue.C3783 mo15185();

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public java.lang.Object mo355(@Yue.InterfaceC4418 Yue.C3783.C3787 r1) {
                r0 = this;
                r0.mo15183(r1)
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo356(@Yue.InterfaceC4418 Yue.C3783 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean mo15186(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 java.lang.Object r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public Yue.C3783 mo15187(@Yue.InterfaceC4418 Yue.AbstractC4632 r1) {
                r0 = this;
                Yue.ۥ۠ۨ۠ۥ r1 = r0.mo15184()
                Yue.C3329.m13903(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public abstract java.lang.Object mo15188(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 Yue.C3783 r2);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟, reason: contains not printable characters */
    public static class C3785<T extends Yue.C3783> extends Yue.C3783.AbstractC3784 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11996 = null;

        @Yue.InterfaceC4418
        private volatile /* synthetic */ java.lang.Object _affectedNode;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C3783 f11997;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final T f11998;

        static {
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r1 = "_affectedNode"
                java.lang.Class<Yue.ۥ۠ۨ۠ۥ$ۥ۟> r2 = Yue.C3783.C3785.class
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
                Yue.C3783.C3785.f11996 = r0
                return
        }

        public C3785(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 T r2) {
                r0 = this;
                r0.<init>()
                r0.f11997 = r1
                r0.f11998 = r2
                r1 = 0
                r0._affectedNode = r1
                return
        }

        @Override // Yue.C3783.AbstractC3784
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo15182(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 Yue.C3783 r2) {
                r0 = this;
                T extends Yue.ۥ۠ۨ۠ۥ r1 = r0.f11998
                Yue.ۥ۠ۨ۠ۥ r2 = r0.f11997
                Yue.C3783.m15157(r1, r2)
                return
        }

        @Override // Yue.C3783.AbstractC3784
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo15183(@Yue.InterfaceC4418 Yue.C3783.C3787 r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.C3785.f11996
                r1 = 0
                Yue.ۥ۠ۨ۠ۥ r3 = r3.f12001
                Yue.C0084.m471(r0, r2, r1, r3)
                return
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public final Yue.C3783 mo15184() {
                r1 = this;
                java.lang.Object r0 = r1._affectedNode
                Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
                return r0
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public final Yue.C3783 mo15185() {
                r1 = this;
                Yue.ۥ۠ۨ۠ۥ r0 = r1.f11997
                return r0
        }

        @Override // Yue.C3783.AbstractC3784
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo15186(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 java.lang.Object r2) {
                r0 = this;
                Yue.ۥ۠ۨ۠ۥ r1 = r0.f11997
                if (r2 == r1) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public final Yue.C3783 mo15187(@Yue.InterfaceC4418 Yue.AbstractC4632 r2) {
                r1 = this;
                Yue.ۥ۠ۨ۠ۥ r0 = r1.f11997
                Yue.ۥ۠ۨ۠ۥ r2 = Yue.C3783.m15156(r0, r2)
                return r2
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public java.lang.Object mo15188(@Yue.InterfaceC4418 Yue.C3783 r2, @Yue.InterfaceC4418 Yue.C3783 r3) {
                r1 = this;
                T extends Yue.ۥ۠ۨ۠ۥ r3 = r1.f11998
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.f11994
                Yue.C0084.m471(r0, r3, r3, r2)
                T extends Yue.ۥ۠ۨ۠ۥ r2 = r1.f11998
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Yue.C3783.f11993
                Yue.ۥ۠ۨ۠ۥ r0 = r1.f11997
                Yue.C0084.m471(r3, r2, r2, r0)
                T extends Yue.ۥ۠ۨ۠ۥ r2 = r1.f11998
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4986
    public static abstract class AbstractC3786 extends Yue.AbstractC0641<Yue.C3783> {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C3783 f11999;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public Yue.C3783 f12000;

        public AbstractC3786(@Yue.InterfaceC4418 Yue.C3783 r1) {
                r0 = this;
                r0.<init>()
                r0.f11999 = r1
                return
        }

        @Override // Yue.AbstractC0641
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public /* bridge */ /* synthetic */ void mo4204(Yue.C3783 r1, java.lang.Object r2) {
                r0 = this;
                Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
                r0.m15189(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m15189(@Yue.InterfaceC4418 Yue.C3783 r3, @Yue.InterfaceC4543 java.lang.Object r4) {
                r2 = this;
                if (r4 != 0) goto L4
                r4 = 1
                goto L5
            L4:
                r4 = 0
            L5:
                if (r4 == 0) goto La
                Yue.ۥ۠ۨ۠ۥ r0 = r2.f11999
                goto Lc
            La:
                Yue.ۥ۠ۨ۠ۥ r0 = r2.f12000
            Lc:
                if (r0 == 0) goto L22
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C3783.f11993
                boolean r3 = Yue.C0084.m471(r1, r3, r2, r0)
                if (r3 == 0) goto L22
                if (r4 == 0) goto L22
                Yue.ۥ۠ۨ۠ۥ r3 = r2.f11999
                Yue.ۥ۠ۨ۠ۥ r4 = r2.f12000
                Yue.C3329.m13903(r4)
                Yue.C3783.m15157(r3, r4)
            L22:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C3787 extends Yue.AbstractC4632 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C3783 f12001;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C3783 f12002;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C3783.AbstractC3784 f12003;

        public C3787(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 Yue.C3783 r2, @Yue.InterfaceC4418 Yue.C3783.AbstractC3784 r3) {
                r0 = this;
                r0.<init>()
                r0.f12001 = r1
                r0.f12002 = r2
                r0.f12003 = r3
                return
        }

        @Override // Yue.AbstractC4632
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "PrepareOp(op="
                r0.append(r1)
                Yue.ۥ۟ۢ۠ r1 = r2.mo4202()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.AbstractC4632
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.AbstractC0641<?> mo4202() {
                r1 = this;
                Yue.ۥ۠ۨ۠ۥ$ۥ r0 = r1.f12003
                Yue.ۥ۟ۢ۠ r0 = r0.m4181()
                return r0
        }

        @Override // Yue.AbstractC4632
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ */
        public java.lang.Object mo4203(@Yue.InterfaceC4543 java.lang.Object r6) {
                r5 = this;
                if (r6 == 0) goto L55
                Yue.ۥ۠ۨ۠ۥ r6 = (Yue.C3783) r6
                Yue.ۥ۠ۨ۠ۥ$ۥ r0 = r5.f12003
                java.lang.Object r0 = r0.mo355(r5)
                java.lang.Object r1 = Yue.C3791.f12008
                r2 = 0
                if (r0 != r1) goto L26
                Yue.ۥ۠ۨ۠ۥ r0 = r5.f12002
                Yue.ۥۡۦۤ۟ r3 = Yue.C3783.m15158(r0)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Yue.C3783.f11993
                boolean r3 = Yue.C0084.m471(r4, r6, r5, r3)
                if (r3 == 0) goto L25
                Yue.ۥ۠ۨ۠ۥ$ۥ r3 = r5.f12003
                r3.mo356(r6)
                Yue.C3783.m15156(r0, r2)
            L25:
                return r1
            L26:
                if (r0 == 0) goto L31
                Yue.ۥ۟ۢ۠ r1 = r5.mo4202()
                java.lang.Object r0 = r1.m4205(r0)
                goto L39
            L31:
                Yue.ۥ۟ۢ۠ r0 = r5.mo4202()
                java.lang.Object r0 = r0.m4206()
            L39:
                java.lang.Object r1 = Yue.C0640.f1625
                if (r0 != r1) goto L42
                Yue.ۥ۟ۢ۠ r0 = r5.mo4202()
                goto L4f
            L42:
                if (r0 != 0) goto L4d
                Yue.ۥ۠ۨ۠ۥ$ۥ r0 = r5.f12003
                Yue.ۥ۠ۨ۠ۥ r1 = r5.f12002
                java.lang.Object r0 = r0.mo15188(r6, r1)
                goto L4f
            L4d:
                Yue.ۥ۠ۨ۠ۥ r0 = r5.f12002
            L4f:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C3783.f11993
                Yue.C0084.m471(r1, r6, r5, r0)
                return r2
            L55:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                r6.<init>(r0)
                throw r6
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m15190() {
                r1 = this;
                Yue.ۥ۠ۨ۠ۥ$ۥ r0 = r1.f12003
                r0.mo15183(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C3788<T> extends Yue.C3783.AbstractC3784 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12004 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12005 = null;

        @Yue.InterfaceC4418
        private volatile /* synthetic */ java.lang.Object _affectedNode;

        @Yue.InterfaceC4418
        private volatile /* synthetic */ java.lang.Object _originalNext;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C3783 f12006;

        static {
                java.lang.String r0 = "_affectedNode"
                java.lang.Class<Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۟> r1 = Yue.C3783.C3788.class
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
                Yue.C3783.C3788.f12004 = r0
                java.lang.String r0 = "_originalNext"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
                Yue.C3783.C3788.f12005 = r0
                return
        }

        public C3788(@Yue.InterfaceC4418 Yue.C3783 r1) {
                r0 = this;
                r0.<init>()
                r0.f12006 = r1
                r1 = 0
                r0._affectedNode = r1
                r0._originalNext = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static /* synthetic */ void m15191() {
                return
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.Object mo354(@Yue.InterfaceC4418 Yue.C3783 r2) {
                r1 = this;
                Yue.ۥ۠ۨ۠ۥ r0 = r1.f12006
                if (r2 != r0) goto L9
                java.lang.Object r2 = Yue.C3782.m15151()
                goto La
            L9:
                r2 = 0
            La:
                return r2
        }

        @Override // Yue.C3783.AbstractC3784
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public final void mo15182(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 Yue.C3783 r2) {
                r0 = this;
                r1 = 0
                Yue.C3783.m15156(r2, r1)
                return
        }

        @Override // Yue.C3783.AbstractC3784
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo15183(@Yue.InterfaceC4418 Yue.C3783.C3787 r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.C3788.f12004
                Yue.ۥ۠ۨ۠ۥ r1 = r4.f12001
                r2 = 0
                Yue.C0084.m471(r0, r3, r2, r1)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.C3788.f12005
                Yue.ۥ۠ۨ۠ۥ r4 = r4.f12002
                Yue.C0084.m471(r0, r3, r2, r4)
                return
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public final Yue.C3783 mo15184() {
                r1 = this;
                java.lang.Object r0 = r1._affectedNode
                Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
                return r0
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public final Yue.C3783 mo15185() {
                r1 = this;
                java.lang.Object r0 = r1._originalNext
                Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
                return r0
        }

        @Override // Yue.C3783.AbstractC3784
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public final boolean mo15186(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 java.lang.Object r2) {
                r0 = this;
                boolean r1 = r2 instanceof Yue.C5309
                if (r1 != 0) goto L6
                r1 = 0
                return r1
            L6:
                Yue.ۥۡۦۤ۟ r2 = (Yue.C5309) r2
                Yue.ۥ۠ۨ۠ۥ r1 = r2.f19876
                r1.m15174()
                r1 = 1
                return r1
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public final Yue.C3783 mo15187(@Yue.InterfaceC4418 Yue.AbstractC4632 r4) {
                r3 = this;
                Yue.ۥ۠ۨ۠ۥ r0 = r3.f12006
            L2:
                java.lang.Object r1 = r0._next
                boolean r2 = r1 instanceof Yue.AbstractC4632
                if (r2 == 0) goto L18
                Yue.ۥۣۣۡۡ r1 = (Yue.AbstractC4632) r1
                boolean r2 = r4.m18453(r1)
                if (r2 == 0) goto L12
                r4 = 0
                return r4
            L12:
                Yue.ۥ۠ۨ۠ۥ r2 = r3.f12006
                r1.mo4203(r2)
                goto L2
            L18:
                Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
                return r1
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public final java.lang.Object mo15188(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 Yue.C3783 r2) {
                r0 = this;
                Yue.ۥۡۦۤ۟ r1 = Yue.C3783.m15158(r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final T m15192() {
                r1 = this;
                Yue.ۥ۠ۨ۠ۥ r0 = r1.mo15184()
                Yue.C3329.m13903(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C3789 extends Yue.C3783.AbstractC3786 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2823<java.lang.Boolean> f12007;

        public C3789(Yue.C3783 r1, Yue.InterfaceC2823<java.lang.Boolean> r2) {
                r0 = this;
                r0.f12007 = r2
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0641
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public /* bridge */ /* synthetic */ java.lang.Object mo357(Yue.C3783 r1) {
                r0 = this;
                Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
                java.lang.Object r1 = r0.m15193(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public java.lang.Object m15193(@Yue.InterfaceC4418 Yue.C3783 r1) {
                r0 = this;
                Yue.ۥۣ۠۠ۨ<java.lang.Boolean> r1 = r0.f12007
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L10
                r1 = 0
                goto L14
            L10:
                java.lang.Object r1 = Yue.C3782.m15148()
            L14:
                return r1
        }
    }


    static {
            java.lang.String r0 = "_next"
            java.lang.Class<Yue.ۥ۠ۨ۠ۥ> r1 = Yue.C3783.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C3783.f11993 = r0
            java.lang.String r0 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C3783.f11994 = r0
            java.lang.String r0 = "_removedRef"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C3783.f11995 = r0
            return
    }

    public C3783() {
            r1 = this;
            r1.<init>()
            r1._next = r1
            r1._prev = r1
            r0 = 0
            r1._removedRef = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C3783 m15156(Yue.C3783 r0, Yue.AbstractC4632 r1) {
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15165(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final /* synthetic */ void m15157(Yue.C3783 r0, Yue.C3783 r1) {
            r0.m15169(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C5309 m15158(Yue.C3783 r0) {
            Yue.ۥۡۦۤ۟ r0 = r0.m15179()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟ۡ r1 = new Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟ۡ
            r1.<init>(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m15159(@Yue.InterfaceC4418 Yue.C3783 r2) {
            r1 = this;
        L0:
            Yue.ۥ۠ۨ۠ۥ r0 = r1.m15172()
            boolean r0 = r0.m15163(r2, r1)
            if (r0 == 0) goto L0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final boolean m15160(@Yue.InterfaceC4418 Yue.C3783 r3, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.Boolean> r4) {
            r2 = this;
            Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۠ r0 = new Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۠
            r0.<init>(r3, r4)
        L5:
            Yue.ۥ۠ۨ۠ۥ r4 = r2.m15172()
            int r4 = r4.m15180(r3, r2, r0)
            r1 = 1
            if (r4 == r1) goto L16
            r1 = 2
            if (r4 == r1) goto L14
            goto L5
        L14:
            r3 = 0
            return r3
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final boolean m15161(@Yue.InterfaceC4418 Yue.C3783 r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.C3783, java.lang.Boolean> r4) {
            r2 = this;
        L0:
            Yue.ۥ۠ۨ۠ۥ r0 = r2.m15172()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L12
            r3 = 0
            return r3
        L12:
            boolean r0 = r0.m15163(r3, r2)
            if (r0 == 0) goto L0
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final boolean m15162(@Yue.InterfaceC4418 Yue.C3783 r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.C3783, java.lang.Boolean> r5, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.Boolean> r6) {
            r3 = this;
            Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۠ r0 = new Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۠
            r0.<init>(r4, r6)
        L5:
            Yue.ۥ۠ۨ۠ۥ r6 = r3.m15172()
            java.lang.Object r1 = r5.invoke(r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 != 0) goto L17
            return r2
        L17:
            int r6 = r6.m15180(r4, r3, r0)
            r1 = 1
            if (r6 == r1) goto L23
            r1 = 2
            if (r6 == r1) goto L22
            goto L5
        L22:
            return r2
        L23:
            return r1
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final boolean m15163(@Yue.InterfaceC4418 Yue.C3783 r2, @Yue.InterfaceC4418 Yue.C3783 r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.f11994
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.f11993
            r0.lazySet(r2, r3)
            boolean r0 = Yue.C0084.m471(r0, r1, r3, r2)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            r2.m15169(r3)
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final boolean m15164(@Yue.InterfaceC4418 Yue.C3783 r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.f11994
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.f11993
            r0.lazySet(r2, r1)
        La:
            java.lang.Object r0 = r1.m15170()
            if (r0 == r1) goto L12
            r2 = 0
            return r2
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.f11993
            boolean r0 = Yue.C0084.m471(r0, r1, r1, r2)
            if (r0 == 0) goto La
            r2.m15169(r1)
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final Yue.C3783 m15165(Yue.AbstractC4632 r8) {
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C3783.f11994
            boolean r0 = Yue.C0084.m471(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.mo15141()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof Yue.AbstractC4632
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            boolean r0 = r8.m18453(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            Yue.ۥۣۣۡۡ r4 = (Yue.AbstractC4632) r4
            r4.mo4203(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof Yue.C5309
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Yue.C3783.f11993
            Yue.ۥۡۦۤ۟ r4 = (Yue.C5309) r4
            Yue.ۥ۠ۨ۠ۥ r4 = r4.f19876
            boolean r2 = Yue.C0084.m471(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            Yue.ۥ۠ۨ۠ۥ r2 = (Yue.C3783) r2
            goto L7
        L52:
            r3 = r4
            Yue.ۥ۠ۨ۠ۥ r3 = (Yue.C3783) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final <T extends Yue.C3783> Yue.C3783.C3785<T> m15166(@Yue.InterfaceC4418 T r2) {
            r1 = this;
            Yue.ۥ۠ۨ۠ۥ$ۥ۟ r0 = new Yue.ۥ۠ۨ۠ۥ$ۥ۟
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final Yue.C3783.C3788<Yue.C3783> m15167() {
            r1 = this;
            Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public final Yue.C3783 m15168(Yue.C3783 r2) {
            r1 = this;
        L0:
            boolean r0 = r2.mo15141()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.Object r2 = r2._prev
            Yue.ۥ۠ۨ۠ۥ r2 = (Yue.C3783) r2
            goto L0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m15169(Yue.C3783 r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r3._prev
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
            java.lang.Object r1 = r2.m15170()
            if (r1 == r3) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C3783.f11994
            boolean r0 = Yue.C0084.m471(r1, r3, r0, r2)
            if (r0 == 0) goto L0
            boolean r0 = r2.mo15141()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.m15165(r0)
        L1d:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final java.lang.Object m15170() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._next
            boolean r1 = r0 instanceof Yue.AbstractC4632
            if (r1 != 0) goto L7
            return r0
        L7:
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            r0.mo4203(r2)
            goto L0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final Yue.C3783 m15171() {
            r1 = this;
            java.lang.Object r0 = r1.m15170()
            Yue.ۥ۠ۨ۠ۥ r0 = Yue.C3782.m15155(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final Yue.C3783 m15172() {
            r1 = this;
            r0 = 0
            Yue.ۥ۠ۨ۠ۥ r0 = r1.m15165(r0)
            if (r0 != 0) goto Lf
            java.lang.Object r0 = r1._prev
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
            Yue.ۥ۠ۨ۠ۥ r0 = r1.m15168(r0)
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final void m15173() {
            r1 = this;
            java.lang.Object r0 = r1.m15170()
            Yue.ۥۡۦۤ۟ r0 = (Yue.C5309) r0
            Yue.ۥ۠ۨ۠ۥ r0 = r0.f19876
            r0.m15174()
            return
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final void m15174() {
            r3 = this;
            r0 = r3
        L1:
            java.lang.Object r1 = r0.m15170()
            boolean r2 = r1 instanceof Yue.C5309
            if (r2 == 0) goto Le
            Yue.ۥۡۦۤ۟ r1 = (Yue.C5309) r1
            Yue.ۥ۠ۨ۠ۥ r0 = r1.f19876
            goto L1
        Le:
            r1 = 0
            r0.m15165(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public boolean mo15141() {
            r1 = this;
            java.lang.Object r0 = r1.m15170()
            boolean r0 = r0 instanceof Yue.C5309
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public final Yue.C3783.AbstractC3786 m15175(@Yue.InterfaceC4418 Yue.C3783 r2, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.Boolean> r3) {
            r1 = this;
            Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۠ r0 = new Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۠
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ */
    public Yue.C3783 mo15142() {
            r3 = this;
            java.lang.Object r0 = r3.m15170()
            boolean r1 = r0 instanceof Yue.C5309
            r2 = 0
            if (r1 == 0) goto Lc
            Yue.ۥۡۦۤ۟ r0 = (Yue.C5309) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L11
            Yue.ۥ۠ۨ۠ۥ r2 = r0.f19876
        L11:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public boolean mo15143() {
            r1 = this;
            Yue.ۥ۠ۨ۠ۥ r0 = r1.m15178()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final /* synthetic */ <T> T m15176(Yue.InterfaceC2825<? super T, java.lang.Boolean> r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.m15170()
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
            r1 = 0
            if (r0 != r4) goto La
            return r1
        La:
            r2 = 3
            java.lang.String r3 = "T"
            Yue.C3329.m13915(r2, r3)
            boolean r2 = r0 instanceof java.lang.Object
            if (r2 != 0) goto L15
            return r1
        L15:
            java.lang.Object r1 = r5.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L28
            boolean r1 = r0.mo15141()
            if (r1 != 0) goto L28
            return r0
        L28:
            Yue.ۥ۠ۨ۠ۥ r1 = r0.m15178()
            if (r1 != 0) goto L2f
            return r0
        L2f:
            r1.m15174()
            goto L0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final Yue.C3783 m15177() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.m15170()
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
            if (r0 != r2) goto La
            r0 = 0
            return r0
        La:
            boolean r1 = r0.mo15143()
            if (r1 == 0) goto L11
            return r0
        L11:
            r0.m15173()
            goto L0
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final Yue.C3783 m15178() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.m15170()
            boolean r1 = r0 instanceof Yue.C5309
            if (r1 == 0) goto Ld
            Yue.ۥۡۦۤ۟ r0 = (Yue.C5309) r0
            Yue.ۥ۠ۨ۠ۥ r0 = r0.f19876
            return r0
        Ld:
            if (r0 != r4) goto L12
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
            return r0
        L12:
            r1 = r0
            Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
            Yue.ۥۡۦۤ۟ r2 = r1.m15179()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Yue.C3783.f11993
            boolean r0 = Yue.C0084.m471(r3, r4, r0, r2)
            if (r0 == 0) goto L0
            r0 = 0
            r1.m15165(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public final Yue.C5309 m15179() {
            r2 = this;
            java.lang.Object r0 = r2._removedRef
            Yue.ۥۡۦۤ۟ r0 = (Yue.C5309) r0
            if (r0 != 0) goto L10
            Yue.ۥۡۦۤ۟ r0 = new Yue.ۥۡۦۤ۟
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C3783.f11995
            r1.lazySet(r2, r0)
        L10:
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final int m15180(@Yue.InterfaceC4418 Yue.C3783 r2, @Yue.InterfaceC4418 Yue.C3783 r3, @Yue.InterfaceC4418 Yue.C3783.AbstractC3786 r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.f11994
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C3783.f11993
            r0.lazySet(r2, r3)
            r4.f12000 = r3
            boolean r2 = Yue.C0084.m471(r0, r1, r3, r4)
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            java.lang.Object r2 = r4.mo4203(r1)
            if (r2 != 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 2
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public final void m15181(@Yue.InterfaceC4418 Yue.C3783 r1, @Yue.InterfaceC4418 Yue.C3783 r2) {
            r0 = this;
            return
    }
}
