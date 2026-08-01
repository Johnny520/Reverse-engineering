package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.C3048;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3006 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Executor f9540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3048 f9541;

    public C3006(C3048 c3048, Executor executor) {
        this.f9541 = c3048;
        this.f9540 = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3006) && this.f9541 == ((C3006) obj).f9541;
    }

    public final int hashCode() {
        return this.f9541.hashCode();
    }
}
