package Yue;

import Yue.InterfaceC7317;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6501
public interface InterfaceC3592<E> extends InterfaceC7317<E> {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۡ$ۥ */
    public static final class C0187 {
        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ void m640(InterfaceC3592 interfaceC3592, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC3592.mo6939(cancellationException);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ boolean m641(InterfaceC3592 interfaceC3592, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return interfaceC3592.mo6938(th);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC7097(expression = "trySend(element).isSuccess", imports = {}))
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <E> boolean m9587(@InterfaceC6399 InterfaceC3592<E> interfaceC3592, E e) {
            return InterfaceC7317.C1231.m22855(interfaceC3592, e);
        }
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility only")
    /* JADX INFO: renamed from: ۥ۟۟ */
    /* synthetic */ boolean mo6938(Throwable th);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    void mo6939(@InterfaceC6489 CancellationException cancellationException);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    InterfaceC7042<E> mo6940();
}
