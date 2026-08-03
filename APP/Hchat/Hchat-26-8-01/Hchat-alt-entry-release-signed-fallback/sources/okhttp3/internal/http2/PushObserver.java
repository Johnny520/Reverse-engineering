package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface PushObserver {
    public static final okhttp3.internal.http2.PushObserver CANCEL = null;
    public static final okhttp3.internal.http2.PushObserver.Companion Companion = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.http2.PushObserver.Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class PushObserverCancel implements okhttp3.internal.http2.PushObserver {
            public PushObserverCancel() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int r1, okio.BufferedSource r2, int r3, boolean r4) {
                    r0 = this;
                    r2.getClass()
                    long r3 = (long) r3
                    r2.skip(r3)
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int r1, java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) {
                    r0 = this;
                    r2.getClass()
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int r1, java.util.List<okhttp3.internal.http2.Header> r2) {
                    r0 = this;
                    r2.getClass()
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int r1, okhttp3.internal.http2.ErrorCode r2) {
                    r0 = this;
                    r2.getClass()
                    return
            }
        }

        static {
                okhttp3.internal.http2.PushObserver$Companion r0 = new okhttp3.internal.http2.PushObserver$Companion
                r0.<init>()
                okhttp3.internal.http2.PushObserver.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http2.PushObserver$Companion r0 = okhttp3.internal.http2.PushObserver.Companion.$$INSTANCE
            okhttp3.internal.http2.PushObserver.Companion = r0
            okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel r0 = new okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel
            r0.<init>()
            okhttp3.internal.http2.PushObserver.CANCEL = r0
            return
    }

    boolean onData(int r1, okio.BufferedSource r2, int r3, boolean r4);

    boolean onHeaders(int r1, java.util.List<okhttp3.internal.http2.Header> r2, boolean r3);

    boolean onRequest(int r1, java.util.List<okhttp3.internal.http2.Header> r2);

    void onReset(int r1, okhttp3.internal.http2.ErrorCode r2);
}
