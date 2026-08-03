package okhttp3.internal.http2;

import java.util.List;
import okio.BufferedSource;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class PushObserverCancel implements PushObserver {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i9, BufferedSource bufferedSource, int i10, boolean z9) {
                bufferedSource.getClass();
                bufferedSource.skip(i10);
                return true;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i9, List<Header> list, boolean z9) {
                list.getClass();
                return true;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i9, List<Header> list) {
                list.getClass();
                return true;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i9, ErrorCode errorCode) {
                errorCode.getClass();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Companion() {
        }
    }

    boolean onData(int i9, BufferedSource bufferedSource, int i10, boolean z9);

    boolean onHeaders(int i9, List<Header> list, boolean z9);

    boolean onRequest(int i9, List<Header> list);

    void onReset(int i9, ErrorCode errorCode);
}
