package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0550y9 {

    /* JADX INFO: renamed from: a */
    public final String f1101a;

    /* JADX INFO: renamed from: c */
    public volatile boolean f1103c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f1104d;

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f1102b = new CountDownLatch(1);

    /* JADX INFO: renamed from: e */
    public volatile String f1105e = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0550y9(String str) {
        this.f1101a = (str == null || str.length() == 0) ? "plain-text" : str;
    }
}
