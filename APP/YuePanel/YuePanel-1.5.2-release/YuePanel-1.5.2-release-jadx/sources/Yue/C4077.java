package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4077 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f651 = 16;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C7694 f652 = new C7694("CLOSED");

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <N extends AbstractC4078<N>> N m1033(@InterfaceC6399 N n) {
        while (true) {
            Object objM11517 = n.m11517();
            if (objM11517 == f652) {
                return n;
            }
            AbstractC4078 abstractC4078 = (AbstractC4078) objM11517;
            if (abstractC4078 != null) {
                n = (N) abstractC4078;
            } else if (n.m11522()) {
                return n;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <S extends AbstractC7276<S>> Object m11513(S s, long j, InterfaceC5138<? super Long, ? super S, ? extends S> interfaceC5138) {
        while (true) {
            if (s.m22732() >= j && !s.mo11519()) {
                return C7277.m3542(s);
            }
            Object objM11517 = s.m11517();
            if (objM11517 == f652) {
                return C7277.m3542(f652);
            }
            S sInvoke = (S) ((AbstractC4078) objM11517);
            if (sInvoke == null) {
                sInvoke = interfaceC5138.invoke(Long.valueOf(s.m22732() + 1), s);
                if (s.m11525(sInvoke)) {
                    if (s.mo11519()) {
                        s.m11524();
                    }
                }
            }
            s = (Object) sInvoke;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m11514() {
    }
}
