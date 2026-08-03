package Yue;

import Yue.InterfaceC4202;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public interface InterfaceC4225 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ */
    public static final class C0356 {

        /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4226 extends AbstractC5673 implements InterfaceC5138<InterfaceC4225, InterfaceC0357, InterfaceC4225> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final C4226 f8581 = new C4226();

            public C4226() {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5138
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final InterfaceC4225 invoke(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC0357 interfaceC0357) {
                C3924 c3924;
                C5499.m17103(interfaceC4225, "acc");
                C5499.m17103(interfaceC0357, "element");
                InterfaceC4225 interfaceC4225MinusKey = interfaceC4225.minusKey(interfaceC0357.getKey());
                C4629 c4629 = C4629.f9940;
                if (interfaceC4225MinusKey == c4629) {
                    return interfaceC0357;
                }
                InterfaceC4202.C0349 c0349 = InterfaceC4202.f8519;
                InterfaceC4202 interfaceC4202 = (InterfaceC4202) interfaceC4225MinusKey.get(c0349);
                if (interfaceC4202 == null) {
                    c3924 = new C3924(interfaceC4225MinusKey, interfaceC0357);
                } else {
                    InterfaceC4225 interfaceC4225MinusKey2 = interfaceC4225MinusKey.minusKey(c0349);
                    if (interfaceC4225MinusKey2 == c4629) {
                        return new C3924(interfaceC0357, interfaceC4202);
                    }
                    c3924 = new C3924(new C3924(interfaceC4225MinusKey2, interfaceC0357), interfaceC4202);
                }
                return c3924;
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public static InterfaceC4225 m1190(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC4225 interfaceC42252) {
            C5499.m17103(interfaceC42252, "context");
            return interfaceC42252 == C4629.f9940 ? interfaceC4225 : (InterfaceC4225) interfaceC42252.fold(interfaceC4225, C4226.f8581);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ۟ */
    public interface InterfaceC0357 extends InterfaceC4225 {

        /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C4227 {
            /* JADX INFO: renamed from: ۥ */
            public static <R> R m1191(@InterfaceC6399 InterfaceC0357 interfaceC0357, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC0357, ? extends R> interfaceC5138) {
                C5499.m17103(interfaceC5138, "operation");
                return interfaceC5138.invoke(r, interfaceC0357);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۧۦۥ$ۥ۟ */
            /* JADX WARN: Multi-variable type inference failed */
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟ */
            public static <E extends InterfaceC0357> E m1192(@InterfaceC6399 InterfaceC0357 interfaceC0357, @InterfaceC6399 InterfaceC4228<E> interfaceC4228) {
                C5499.m17103(interfaceC4228, C6659.f17103);
                if (!C5499.m17094(interfaceC0357.getKey(), interfaceC4228)) {
                    return null;
                }
                C5499.m17101(interfaceC0357, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return interfaceC0357;
            }

            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static InterfaceC4225 m12161(@InterfaceC6399 InterfaceC0357 interfaceC0357, @InterfaceC6399 InterfaceC4228<?> interfaceC4228) {
                C5499.m17103(interfaceC4228, C6659.f17103);
                return C5499.m17094(interfaceC0357.getKey(), interfaceC4228) ? C4629.f9940 : interfaceC0357;
            }

            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static InterfaceC4225 m12162(@InterfaceC6399 InterfaceC0357 interfaceC0357, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
                C5499.m17103(interfaceC4225, "context");
                return C0356.m1190(interfaceC0357, interfaceC4225);
            }
        }

        @Override // Yue.InterfaceC4225
        <R> R fold(R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC0357, ? extends R> interfaceC5138);

        @Override // Yue.InterfaceC4225
        @InterfaceC6489
        <E extends InterfaceC0357> E get(@InterfaceC6399 InterfaceC4228<E> interfaceC4228);

        @InterfaceC6399
        InterfaceC4228<?> getKey();

        @Override // Yue.InterfaceC4225
        @InterfaceC6399
        InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4228<?> interfaceC4228);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۥ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC4228<E extends InterfaceC0357> {
    }

    <R> R fold(R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC0357, ? extends R> interfaceC5138);

    @InterfaceC6489
    <E extends InterfaceC0357> E get(@InterfaceC6399 InterfaceC4228<E> interfaceC4228);

    @InterfaceC6399
    InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4228<?> interfaceC4228);

    @InterfaceC6399
    InterfaceC4225 plus(@InterfaceC6399 InterfaceC4225 interfaceC4225);
}
