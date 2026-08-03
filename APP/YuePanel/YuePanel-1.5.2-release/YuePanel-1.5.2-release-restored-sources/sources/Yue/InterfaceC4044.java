package Yue;

import Yue.InterfaceC4225;
import Yue.InterfaceC4360;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4044<T> extends InterfaceC4360<T> {

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۢۧ$ۥ */
    public static final class C0314 {
        /* JADX INFO: renamed from: ۥ۟ */
        public static <T, R> R m994(@InterfaceC6399 InterfaceC4044<T> interfaceC4044, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
            return (R) InterfaceC4360.C0385.m1318(interfaceC4044, r, interfaceC5138);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T, E extends InterfaceC4225.InterfaceC0357> E m11462(@InterfaceC6399 InterfaceC4044<T> interfaceC4044, @InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
            return (E) InterfaceC4360.C0385.m12610(interfaceC4044, interfaceC4228);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T> InterfaceC4225 m11463(@InterfaceC6399 InterfaceC4044<T> interfaceC4044, @InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
            return InterfaceC4360.C0385.m12611(interfaceC4044, interfaceC4228);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static <T> InterfaceC4225 m11464(@InterfaceC6399 InterfaceC4044<T> interfaceC4044, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
            return InterfaceC4360.C0385.m12612(interfaceC4044, interfaceC4225);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static <T> InterfaceC5542 m11465(@InterfaceC6399 InterfaceC4044<T> interfaceC4044, @InterfaceC6399 InterfaceC5542 interfaceC5542) {
            return InterfaceC4360.C0385.m12613(interfaceC4044, interfaceC5542);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    boolean mo992(@InterfaceC6399 Throwable th);

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    boolean mo11461(T t);
}
