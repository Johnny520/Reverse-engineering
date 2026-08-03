package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6310 {

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۧ$ۥ */
    public static final class C0960 {
        @InterfaceC4372(level = EnumC0393.f8970, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ void m2779() {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ Object m2780(InterfaceC6310 interfaceC6310, Object obj, InterfaceC4199 interfaceC4199, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return interfaceC6310.mo2777(obj, interfaceC4199);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m19619(InterfaceC6310 interfaceC6310, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return interfaceC6310.mo2778(obj);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m19620(InterfaceC6310 interfaceC6310, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            interfaceC6310.mo19616(obj);
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    Object mo2777(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);

    /* JADX INFO: renamed from: ۥ۟ */
    boolean mo2778(@InterfaceC6489 Object obj);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    boolean mo19615();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    void mo19616(@InterfaceC6489 Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    boolean mo19617(@InterfaceC6399 Object obj);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    InterfaceC7288<Object, InterfaceC6310> mo19618();
}
