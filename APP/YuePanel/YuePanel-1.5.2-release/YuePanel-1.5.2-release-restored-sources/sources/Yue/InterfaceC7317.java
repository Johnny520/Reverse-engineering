package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7317<E> {

    /* JADX INFO: renamed from: Yue.ۥۡۨۡ۠$ۥ */
    public static final class C1231 {
        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ boolean m3566(InterfaceC7317 interfaceC7317, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return interfaceC7317.mo5860(th);
        }

        @InterfaceC4764
        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ void m3567() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: E */
        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC7097(expression = "trySend(element).isSuccess", imports = {}))
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <E> boolean m22855(@InterfaceC6399 InterfaceC7317<? super E> interfaceC7317, E e) throws Throwable {
            Object objMo5863 = interfaceC7317.mo5863(e);
            if (C3732.m10209(objMo5863)) {
                return true;
            }
            Throwable thM10202 = C3732.m10202(objMo5863);
            if (thM10202 == null) {
                return false;
            }
            throw C7565.m23687(thM10202);
        }
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC7097(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    Object mo5844(E e, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    InterfaceC7288<E, InterfaceC7317<E>> mo5856();

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    boolean mo5860(@InterfaceC6489 Throwable th);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    Object mo5863(E e);

    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    void mo5866(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124);

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    boolean mo5867();
}
