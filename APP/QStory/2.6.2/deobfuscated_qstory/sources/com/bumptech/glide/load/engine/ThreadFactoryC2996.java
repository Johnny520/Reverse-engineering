package com.bumptech.glide.load.engine;

import androidx.appcompat.app.RunnableC0062;
import java.util.concurrent.ThreadFactory;
import p153.C7603;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2996 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9485;

    public /* synthetic */ ThreadFactoryC2996(int i) {
        this.f9485 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f9485) {
            case 0:
                return new Thread(new RunnableC0062(runnable, 7), "glide-active-resources");
            default:
                return new C7603(runnable);
        }
    }
}
