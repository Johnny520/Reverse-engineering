package p000;

import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: l8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0314l8 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f528a;

    /* JADX INFO: renamed from: b */
    public volatile Thread f529b;

    /* JADX INFO: renamed from: c */
    public volatile HttpURLConnection f530c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m752a() {
        this.f528a = true;
        HttpURLConnection httpURLConnection = this.f530c;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
        Thread thread = this.f529b;
        if (thread != null) {
            thread.interrupt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m753b() throws IOException {
        if (this.f529b == null) {
            this.f529b = Thread.currentThread();
        }
        if (this.f528a || Thread.currentThread().isInterrupted()) {
            C0479u2.m1038c("tts cancelled");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m754c() {
        this.f530c = null;
        this.f529b = null;
    }
}
