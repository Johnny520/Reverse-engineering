package Yue;

import Yue.InterfaceC7317;

/* JADX INFO: renamed from: Yue.ۥۡۥۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6809<E> extends InterfaceC4243, InterfaceC7317<E> {

    /* JADX INFO: renamed from: Yue.ۥۡۥۡۤ$ۥ */
    public static final class C1091 {
        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC7097(expression = "trySend(element).isSuccess", imports = {}))
        /* JADX INFO: renamed from: ۥ */
        public static <E> boolean m3273(@InterfaceC6399 InterfaceC6809<? super E> interfaceC6809, E e) {
            return InterfaceC7317.C1231.m22855(interfaceC6809, e);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    InterfaceC7317<E> mo643();
}
