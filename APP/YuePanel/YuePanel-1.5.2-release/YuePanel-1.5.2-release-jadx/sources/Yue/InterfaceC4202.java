package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public interface InterfaceC4202 extends InterfaceC4225.InterfaceC0357 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0349 f8519 = C0349.f8520;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۤۥ$ۥ */
    public static final class C0348 {
        /* JADX INFO: renamed from: ۥ */
        public static <R> R m1161(@InterfaceC6399 InterfaceC4202 interfaceC4202, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
            C5499.m17103(interfaceC5138, "operation");
            return (R) InterfaceC4225.InterfaceC0357.C4227.m1191(interfaceC4202, r, interfaceC5138);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public static <E extends InterfaceC4225.InterfaceC0357> E m1162(@InterfaceC6399 InterfaceC4202 interfaceC4202, @InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
            C5499.m17103(interfaceC4228, C6659.f17103);
            if (!(interfaceC4228 instanceof AbstractC2982)) {
                if (InterfaceC4202.f8519 != interfaceC4228) {
                    return null;
                }
                C5499.m17101(interfaceC4202, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC4202;
            }
            AbstractC2982 abstractC2982 = (AbstractC2982) interfaceC4228;
            if (!abstractC2982.m42(interfaceC4202.getKey())) {
                return null;
            }
            E e = (E) abstractC2982.m43(interfaceC4202);
            if (e instanceof InterfaceC4225.InterfaceC0357) {
                return e;
            }
            return null;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static InterfaceC4225 m12092(@InterfaceC6399 InterfaceC4202 interfaceC4202, @InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
            C5499.m17103(interfaceC4228, C6659.f17103);
            if (!(interfaceC4228 instanceof AbstractC2982)) {
                return InterfaceC4202.f8519 == interfaceC4228 ? C4629.f9940 : interfaceC4202;
            }
            AbstractC2982 abstractC2982 = (AbstractC2982) interfaceC4228;
            return (!abstractC2982.m42(interfaceC4202.getKey()) || abstractC2982.m43(interfaceC4202) == null) ? interfaceC4202 : C4629.f9940;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static InterfaceC4225 m12093(@InterfaceC6399 InterfaceC4202 interfaceC4202, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
            C5499.m17103(interfaceC4225, "context");
            return InterfaceC4225.InterfaceC0357.C4227.m12162(interfaceC4202, interfaceC4225);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m12094(@InterfaceC6399 InterfaceC4202 interfaceC4202, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C5499.m17103(interfaceC4199, "continuation");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۤۥ$ۥ۟ */
    public static final class C0349 implements InterfaceC4225.InterfaceC4228<InterfaceC4202> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final /* synthetic */ C0349 f8520 = new C0349();
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6489
    <E extends InterfaceC4225.InterfaceC0357> E get(@InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228);

    @InterfaceC6399
    <T> InterfaceC4199<T> interceptContinuation(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199);

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6399
    InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228);

    void releaseInterceptedContinuation(@InterfaceC6399 InterfaceC4199<?> interfaceC4199);
}
