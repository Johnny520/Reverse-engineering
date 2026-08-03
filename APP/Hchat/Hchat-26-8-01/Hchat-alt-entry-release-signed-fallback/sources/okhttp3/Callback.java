package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Callback {
    void onFailure(okhttp3.Call r1, java.io.IOException r2);

    void onResponse(okhttp3.Call r1, okhttp3.Response r2);
}
