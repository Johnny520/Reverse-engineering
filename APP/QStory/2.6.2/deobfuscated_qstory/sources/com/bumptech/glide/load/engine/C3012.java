package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3012 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9581;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3012 f9580 = new C3012(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3012 f9579 = new C3012(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3012 f9578 = new C3012(2);

    public /* synthetic */ C3012(int i) {
        this.f9581 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m6450(DataSource dataSource) {
        switch (this.f9581) {
            case 0:
                break;
            case 1:
                if (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                }
                break;
            default:
                if (dataSource == DataSource.REMOTE) {
                }
                break;
        }
        return false;
    }
}
