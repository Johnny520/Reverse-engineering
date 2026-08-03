package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1643 extends Yue.AbstractC0044 implements Yue.InterfaceC1601 {

    @Yue.InterfaceC4418
    public static final Yue.AbstractC1643.C1644 Key = null;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC2310
    public static final class C1644 extends Yue.AbstractC0045<Yue.InterfaceC1601, Yue.AbstractC1643> {

        /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۨ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C1645 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.InterfaceC1632.InterfaceC1635, Yue.AbstractC1643> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final Yue.AbstractC1643.C1644.C1645 f5098 = null;

            static {
                    Yue.ۥ۟ۧۦۨ$ۥ$ۥ r0 = new Yue.ۥ۟ۧۦۨ$ۥ$ۥ
                    r0.<init>()
                    Yue.AbstractC1643.C1644.C1645.f5098 = r0
                    return
            }

            public C1645() {
                    r1 = this;
                    r0 = 1
                    r1.<init>(r0)
                    return
            }

            @Override // Yue.InterfaceC2825
            public /* bridge */ /* synthetic */ Yue.AbstractC1643 invoke(Yue.InterfaceC1632.InterfaceC1635 r1) {
                    r0 = this;
                    Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = (Yue.InterfaceC1632.InterfaceC1635) r1
                    Yue.ۥ۟ۧۦۨ r1 = r0.m7926(r1)
                    return r1
            }

            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final Yue.AbstractC1643 m7926(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r2) {
                    r1 = this;
                    boolean r0 = r2 instanceof Yue.AbstractC1643
                    if (r0 == 0) goto L7
                    Yue.ۥ۟ۧۦۨ r2 = (Yue.AbstractC1643) r2
                    goto L8
                L7:
                    r2 = 0
                L8:
                    return r2
            }
        }

        public C1644() {
                r2 = this;
                Yue.ۥ۟ۧۤۥ$ۥ۟ r0 = Yue.InterfaceC1601.f5016
                Yue.ۥ۟ۧۦۨ$ۥ$ۥ r1 = Yue.AbstractC1643.C1644.C1645.f5098
                r2.<init>(r0, r1)
                return
        }

        public /* synthetic */ C1644(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۟ۧۦۨ$ۥ r0 = new Yue.ۥ۟ۧۦۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.AbstractC1643.Key = r0
            return
    }

    public AbstractC1643() {
            r1 = this;
            Yue.ۥ۟ۧۤۥ$ۥ۟ r0 = Yue.InterfaceC1601.f5016
            r1.<init>(r0)
            return
    }

    public abstract void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2);

    @Yue.InterfaceC3324
    public void dispatchYield(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2) {
            r0 = this;
            r0.dispatch(r1, r2)
            return
    }

    @Override // Yue.AbstractC0044, Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632
    @Yue.InterfaceC4543
    public <E extends Yue.InterfaceC1632.InterfaceC1635> E get(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<E> r1) {
            r0 = this;
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = Yue.InterfaceC1601.C1602.m7810(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC1601
    @Yue.InterfaceC4418
    public final <T> Yue.InterfaceC1598<T> interceptContinuation(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2) {
            r1 = this;
            Yue.ۥ۠۟ۢ۟ r0 = new Yue.ۥ۠۟ۢ۟
            r0.<init>(r1, r2)
            return r0
    }

    public boolean isDispatchNeeded(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC2302
    public Yue.AbstractC1643 limitedParallelism(int r2) {
            r1 = this;
            Yue.C3590.m14525(r2)
            Yue.ۥ۠ۧ۠۟ r0 = new Yue.ۥ۠ۧ۠۟
            r0.<init>(r1, r2)
            return r0
    }

    @Override // Yue.AbstractC0044, Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 minusKey(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r1) {
            r0 = this;
            Yue.ۥ۟ۧۦۥ r1 = Yue.InterfaceC1601.C1602.m7811(r0, r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final Yue.AbstractC1643 plus(@Yue.InterfaceC4418 Yue.AbstractC1643 r1) {
            r0 = this;
            return r1
    }

    @Override // Yue.InterfaceC1601
    public final void releaseInterceptedContinuation(@Yue.InterfaceC4418 Yue.InterfaceC1598<?> r1) {
            r0 = this;
            Yue.ۥ۠۟ۢ۟ r1 = (Yue.C1871) r1
            r1.m8744()
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
