package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.C3880;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3838 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Executor f9885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3880 f9886;

    public C3838(C3880 c3880, Executor executor) {
        this.f9886 = c3880;
        this.f9885 = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3838) && this.f9886 == ((C3838) obj).f9886;
    }

    public final int hashCode() {
        return this.f9886.hashCode();
    }
}
