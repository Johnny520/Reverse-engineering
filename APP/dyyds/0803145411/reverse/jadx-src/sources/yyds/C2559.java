package yyds;

/* JADX INFO: renamed from: yyds.ᲇᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2559 extends AbstractC0395 {
    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo1143(C1037 c1037, Thread thread) {
        c1037.f4701 = thread;
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final boolean mo1144(AbstractFutureC2622 abstractFutureC2622, C1037 c1037, C1037 c10372) {
        synchronized (abstractFutureC2622) {
            try {
                if (abstractFutureC2622.f12905 != c1037) {
                    return false;
                }
                abstractFutureC2622.f12905 = c10372;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo1145(C1037 c1037, C1037 c10372) {
        c1037.f4702 = c10372;
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo1146(AbstractFutureC2622 abstractFutureC2622, C1336 c1336) {
        C1336 c13362 = C1336.f6186;
        synchronized (abstractFutureC2622) {
            try {
                if (abstractFutureC2622.f12907 != c1336) {
                    return false;
                }
                abstractFutureC2622.f12907 = c13362;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final boolean mo1147(AbstractFutureC2622 abstractFutureC2622, Object obj, Object obj2) {
        synchronized (abstractFutureC2622) {
            try {
                if (abstractFutureC2622.f12906 != obj) {
                    return false;
                }
                abstractFutureC2622.f12906 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
