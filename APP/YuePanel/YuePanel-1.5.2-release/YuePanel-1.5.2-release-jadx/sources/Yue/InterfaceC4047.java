package Yue;

import Yue.InterfaceC4225;
import Yue.InterfaceC5542;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4047 extends InterfaceC5542 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣ۟$ۥ */
    public static final class C0315 {
        /* JADX INFO: renamed from: ۥ۟ */
        public static <R> R m999(@InterfaceC6399 InterfaceC4047 interfaceC4047, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
            return (R) InterfaceC5542.C0790.m17167(interfaceC4047, r, interfaceC5138);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <E extends InterfaceC4225.InterfaceC0357> E m11472(@InterfaceC6399 InterfaceC4047 interfaceC4047, @InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
            return (E) InterfaceC5542.C0790.m17168(interfaceC4047, interfaceC4228);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static InterfaceC4225 m11473(@InterfaceC6399 InterfaceC4047 interfaceC4047, @InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
            return InterfaceC5542.C0790.m17170(interfaceC4047, interfaceC4228);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static InterfaceC4225 m11474(@InterfaceC6399 InterfaceC4047 interfaceC4047, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
            return InterfaceC5542.C0790.m17171(interfaceC4047, interfaceC4225);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static InterfaceC5542 m11475(@InterfaceC6399 InterfaceC4047 interfaceC4047, @InterfaceC6399 InterfaceC5542 interfaceC5542) {
            return InterfaceC5542.C0790.m17172(interfaceC4047, interfaceC5542);
        }
    }

    boolean complete();

    /* JADX INFO: renamed from: ۥ۟ */
    boolean mo997(@InterfaceC6399 Throwable th);
}
