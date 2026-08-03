package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4556
public interface InterfaceC0830<E> extends Yue.InterfaceC5599<E> {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۡ$ۥ, reason: contains not printable characters */
    public static final class C0831 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m4783(Yue.InterfaceC0830 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.mo1961(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m4784(Yue.InterfaceC0830 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.mo1960(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'trySend' method", replaceWith = @Yue.InterfaceC5313(expression = "trySend(element).isSuccess", imports = {}))
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <E> boolean m4785(@Yue.InterfaceC4418 Yue.InterfaceC0830<E> r0, E r1) {
                boolean r0 = Yue.InterfaceC5599.C5600.m20961(r0, r1)
                return r0
        }
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Binary compatibility only")
    /* JADX INFO: renamed from: ۥ۟۟ */
    /* synthetic */ boolean mo1960(java.lang.Throwable r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    void mo1961(@Yue.InterfaceC4543 java.util.concurrent.CancellationException r1);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    Yue.InterfaceC5242<E> mo1962();
}
