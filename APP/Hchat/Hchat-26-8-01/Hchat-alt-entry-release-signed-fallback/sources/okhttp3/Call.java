package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Call extends java.lang.Cloneable {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Factory {
        okhttp3.Call newCall(okhttp3.Request r1);
    }

    void cancel();

    okhttp3.Call clone();

    void enqueue(okhttp3.Callback r1);

    okhttp3.Response execute();

    boolean isCanceled();

    boolean isExecuted();

    okhttp3.Request request();

    okio.Timeout timeout();
}
