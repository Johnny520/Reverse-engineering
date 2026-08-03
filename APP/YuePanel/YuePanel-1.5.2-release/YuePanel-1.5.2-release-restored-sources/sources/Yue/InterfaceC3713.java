package Yue;

import Yue.InterfaceC7042;
import Yue.InterfaceC7317;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3713<E> extends InterfaceC7317<E>, InterfaceC7042<E> {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C0233 f491 = C0233.f492;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f6605 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f6606 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f6607 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f6608 = -2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f6609 = -3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f6610 = "kotlinx.coroutines.channels.defaultBuffer";

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۨ$ۥ */
    public static final class C0232 {
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public static <E> InterfaceC7287<E> m796(@InterfaceC6399 InterfaceC3713<E> interfaceC3713) {
            return InterfaceC7042.C1149.m21928(interfaceC3713);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC7097(expression = "trySend(element).isSuccess", imports = {}))
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <E> boolean m10169(@InterfaceC6399 InterfaceC3713<E> interfaceC3713, E e) {
            return InterfaceC7317.C1231.m22855(interfaceC3713, e);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC7097(expression = "tryReceive().getOrNull()", imports = {}))
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <E> E m10170(@InterfaceC6399 InterfaceC3713<E> interfaceC3713) {
            return (E) InterfaceC7042.C1149.m21932(interfaceC3713);
        }

        @InterfaceC5890
        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC7097(expression = "receiveCatching().getOrNull()", imports = {}))
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static <E> Object m10171(@InterfaceC6399 InterfaceC3713<E> interfaceC3713, @InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
            return InterfaceC7042.C1149.m21933(interfaceC3713, interfaceC4199);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۨ$ۥ۟ */
    public static final class C0233 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f493 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f6611 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f6612 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f6613 = -2;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f6614 = -3;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f6615 = "kotlinx.coroutines.channels.defaultBuffer";

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ C0233 f492 = new C0233();

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f6616 = C7705.m3806("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        /* JADX INFO: renamed from: ۥ */
        public final int m797() {
            return f6616;
        }
    }
}
