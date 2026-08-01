package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.C3047;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Executor f9538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3047 f9539;

    public C3005(C3047 c3047, Executor executor) {
        this.f9539 = c3047;
        this.f9538 = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3005) && this.f9539 == ((C3005) obj).f9539;
    }

    public final int hashCode() {
        return this.f9539.hashCode();
    }
}
