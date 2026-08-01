package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9583;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3013 f9582 = new C3013(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3013 f9581 = new C3013(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3013 f9580 = new C3013(2);

    public /* synthetic */ C3013(int i) {
        this.f9583 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m6510(DataSource dataSource) {
        switch (this.f9583) {
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
