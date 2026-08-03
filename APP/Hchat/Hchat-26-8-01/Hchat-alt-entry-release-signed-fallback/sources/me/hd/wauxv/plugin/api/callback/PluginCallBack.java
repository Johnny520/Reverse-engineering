package me.hd.wauxv.plugin.api.callback;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginCallBack {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface DownloadCallback {
        void onError(java.lang.Exception r1);

        default void onProgress(int r1) {
                r0 = this;
                return
        }

        void onSuccess(java.io.File r1);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface HttpCallback {
        void onError(java.lang.Exception r1);

        void onSuccess(int r1, java.lang.String r2);
    }

    private PluginCallBack() {
            r0 = this;
            r0.<init>()
            return
    }
}
