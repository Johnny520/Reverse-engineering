package Yue;

import Yue.InterfaceC7042;

/* JADX INFO: renamed from: Yue.ۥ۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6501
public interface InterfaceC3142<E> extends InterfaceC4243, InterfaceC7042<E> {

    /* JADX INFO: renamed from: Yue.ۥ۟۠۟$ۥ */
    public static final class C0065 {
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public static <E> InterfaceC7287<E> m233(@InterfaceC6399 InterfaceC3142<E> interfaceC3142) {
            return InterfaceC7042.C1149.m21928(interfaceC3142);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC7097(expression = "tryReceive().getOrNull()", imports = {}))
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <E> E m6419(@InterfaceC6399 InterfaceC3142<E> interfaceC3142) {
            return (E) InterfaceC7042.C1149.m21932(interfaceC3142);
        }

        @InterfaceC5890
        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC7097(expression = "receiveCatching().getOrNull()", imports = {}))
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <E> Object m6420(@InterfaceC6399 InterfaceC3142<E> interfaceC3142, @InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
            return InterfaceC7042.C1149.m21933(interfaceC3142, interfaceC4199);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    InterfaceC3713<E> m231();
}
