package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3665<T> extends InterfaceC4199<T> {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۟$ۥ */
    public static final class C0216 {
        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ boolean m731(InterfaceC3665 interfaceC3665, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return interfaceC3665.mo10011(th);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ Object m732(InterfaceC3665 interfaceC3665, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            return interfaceC3665.mo10015(obj, obj2);
        }
    }

    boolean isCancelled();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    boolean mo10011(@InterfaceC6489 Throwable th);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    boolean mo10012();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    boolean mo10013();

    @InterfaceC4764
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    void mo10014(T t, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124);

    @InterfaceC5495
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    Object mo10015(T t, @InterfaceC6489 Object obj);

    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    void mo10016(@InterfaceC6399 AbstractC4232 abstractC4232, T t);

    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    void mo10017(@InterfaceC6399 AbstractC4232 abstractC4232, @InterfaceC6399 Throwable th);

    @InterfaceC5495
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    Object mo10018(@InterfaceC6399 Throwable th);

    @InterfaceC5495
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    Object mo10019(T t, @InterfaceC6489 Object obj, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124);

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    void mo10020();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    void mo10021(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124);

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    void mo10022(@InterfaceC6399 Object obj);
}
