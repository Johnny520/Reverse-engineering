package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
public interface InterfaceC1632 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ, reason: contains not printable characters */
    public static final class C1633 {

        /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C1634 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<Yue.InterfaceC1632, Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final Yue.InterfaceC1632.C1633.C1634 f5092 = null;

            static {
                    Yue.ۥ۟ۧۦۥ$ۥ$ۥ r0 = new Yue.ۥ۟ۧۦۥ$ۥ$ۥ
                    r0.<init>()
                    Yue.InterfaceC1632.C1633.C1634.f5092 = r0
                    return
            }

            public C1634() {
                    r1 = this;
                    r0 = 2
                    r1.<init>(r0)
                    return
            }

            @Override // Yue.InterfaceC2839
            public /* bridge */ /* synthetic */ Yue.InterfaceC1632 invoke(Yue.InterfaceC1632 r1, Yue.InterfaceC1632.InterfaceC1635 r2) {
                    r0 = this;
                    Yue.ۥ۟ۧۦۥ r1 = (Yue.InterfaceC1632) r1
                    Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = (Yue.InterfaceC1632.InterfaceC1635) r2
                    Yue.ۥ۟ۧۦۥ r1 = r0.m7907(r1, r2)
                    return r1
            }

            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final Yue.InterfaceC1632 m7907(@Yue.InterfaceC4418 Yue.InterfaceC1632 r4, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r5) {
                    r3 = this;
                    java.lang.String r0 = "acc"
                    Yue.C3329.m13906(r4, r0)
                    java.lang.String r0 = "element"
                    Yue.C3329.m13906(r5, r0)
                    Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r5.getKey()
                    Yue.ۥ۟ۧۦۥ r4 = r4.minusKey(r0)
                    Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
                    if (r4 != r0) goto L17
                    goto L40
                L17:
                    Yue.ۥ۟ۧۤۥ$ۥ۟ r1 = Yue.InterfaceC1601.f5016
                    Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = r4.get(r1)
                    Yue.ۥ۟ۧۤۥ r2 = (Yue.InterfaceC1601) r2
                    if (r2 != 0) goto L28
                    Yue.ۥ۟ۥۤۡ r0 = new Yue.ۥ۟ۥۤۡ
                    r0.<init>(r4, r5)
                L26:
                    r5 = r0
                    goto L40
                L28:
                    Yue.ۥ۟ۧۦۥ r4 = r4.minusKey(r1)
                    if (r4 != r0) goto L35
                    Yue.ۥ۟ۥۤۡ r4 = new Yue.ۥ۟ۥۤۡ
                    r4.<init>(r5, r2)
                    r5 = r4
                    goto L40
                L35:
                    Yue.ۥ۟ۥۤۡ r0 = new Yue.ۥ۟ۥۤۡ
                    Yue.ۥ۟ۥۤۡ r1 = new Yue.ۥ۟ۥۤۡ
                    r1.<init>(r4, r5)
                    r0.<init>(r1, r2)
                    goto L26
                L40:
                    return r5
            }
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.InterfaceC1632 m7906(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2) {
                java.lang.String r0 = "context"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
                if (r2 != r0) goto La
                goto L12
            La:
                Yue.ۥ۟ۧۦۥ$ۥ$ۥ r0 = Yue.InterfaceC1632.C1633.C1634.f5092
                java.lang.Object r1 = r2.fold(r1, r0)
                Yue.ۥ۟ۧۦۥ r1 = (Yue.InterfaceC1632) r1
            L12:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC1635 extends Yue.InterfaceC1632 {

        /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C1636 {
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static <R> R m7908(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r1, R r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super R, ? super Yue.InterfaceC1632.InterfaceC1635, ? extends R> r3) {
                    java.lang.String r0 = "operation"
                    Yue.C3329.m13906(r3, r0)
                    java.lang.Object r1 = r3.invoke(r2, r1)
                    return r1
            }

            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public static <E extends Yue.InterfaceC1632.InterfaceC1635> E m7909(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r1, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<E> r2) {
                    java.lang.String r0 = "key"
                    Yue.C3329.m13906(r2, r0)
                    Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r1.getKey()
                    boolean r2 = Yue.C3329.m13897(r0, r2)
                    if (r2 == 0) goto L15
                    java.lang.String r2 = "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get"
                    Yue.C3329.m13904(r1, r2)
                    goto L16
                L15:
                    r1 = 0
                L16:
                    return r1
            }

            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static Yue.InterfaceC1632 m7910(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r1, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r2) {
                    java.lang.String r0 = "key"
                    Yue.C3329.m13906(r2, r0)
                    Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r1.getKey()
                    boolean r2 = Yue.C3329.m13897(r0, r2)
                    if (r2 == 0) goto L11
                    Yue.ۥ۠۠ۧۦ r1 = Yue.C2141.f6728
                L11:
                    return r1
            }

            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static Yue.InterfaceC1632 m7911(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2) {
                    java.lang.String r0 = "context"
                    Yue.C3329.m13906(r2, r0)
                    Yue.ۥ۟ۧۦۥ r1 = Yue.InterfaceC1632.C1633.m7906(r1, r2)
                    return r1
            }
        }

        @Override // Yue.InterfaceC1632
        <R> R fold(R r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super R, ? super Yue.InterfaceC1632.InterfaceC1635, ? extends R> r2);

        @Override // Yue.InterfaceC1632
        @Yue.InterfaceC4543
        <E extends Yue.InterfaceC1632.InterfaceC1635> E get(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<E> r1);

        @Yue.InterfaceC4418
        Yue.InterfaceC1632.InterfaceC1637<?> getKey();

        @Override // Yue.InterfaceC1632
        @Yue.InterfaceC4418
        Yue.InterfaceC1632 minusKey(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r1);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC1637<E extends Yue.InterfaceC1632.InterfaceC1635> {
    }

    <R> R fold(R r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super R, ? super Yue.InterfaceC1632.InterfaceC1635, ? extends R> r2);

    @Yue.InterfaceC4543
    <E extends Yue.InterfaceC1632.InterfaceC1635> E get(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<E> r1);

    @Yue.InterfaceC4418
    Yue.InterfaceC1632 minusKey(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r1);

    @Yue.InterfaceC4418
    Yue.InterfaceC1632 plus(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1);
}
