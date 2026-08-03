package me.p186hd.wauxv.plugin.api.callback;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class PluginCallBack {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface HttpCallback {
        void onError(Exception exc);

        void onSuccess(int i9, String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private PluginCallBack() {
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface DownloadCallback {
        void onError(Exception exc);

        void onSuccess(File file);

        default void onProgress(int i9) {
        }
    }
}
