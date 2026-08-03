package Yue;

import Yue.InterfaceC4225;
import Yue.InterfaceC5542;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4360<T> extends InterfaceC5542 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۧۥ$ۥ */
    public static final class C0385 {
        /* JADX INFO: renamed from: ۥ۟ */
        public static <T, R> R m1318(@InterfaceC6399 InterfaceC4360<? extends T> interfaceC4360, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
            return (R) InterfaceC5542.C0790.m17167(interfaceC4360, r, interfaceC5138);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T, E extends InterfaceC4225.InterfaceC0357> E m12610(@InterfaceC6399 InterfaceC4360<? extends T> interfaceC4360, @InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
            return (E) InterfaceC5542.C0790.m17168(interfaceC4360, interfaceC4228);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T> InterfaceC4225 m12611(@InterfaceC6399 InterfaceC4360<? extends T> interfaceC4360, @InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
            return InterfaceC5542.C0790.m17170(interfaceC4360, interfaceC4228);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static <T> InterfaceC4225 m12612(@InterfaceC6399 InterfaceC4360<? extends T> interfaceC4360, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
            return InterfaceC5542.C0790.m17171(interfaceC4360, interfaceC4225);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static <T> InterfaceC5542 m12613(@InterfaceC6399 InterfaceC4360<? extends T> interfaceC4360, @InterfaceC6399 InterfaceC5542 interfaceC5542) {
            return InterfaceC5542.C0790.m17172(interfaceC4360, interfaceC5542);
        }
    }

    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    T mo11466();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    InterfaceC7287<T> mo11467();

    @InterfaceC4764
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    Throwable m12609();

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    Object mo11468(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199);
}
