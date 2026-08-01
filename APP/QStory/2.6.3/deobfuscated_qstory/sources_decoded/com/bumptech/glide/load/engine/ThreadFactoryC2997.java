package com.bumptech.glide.load.engine;

import androidx.appcompat.app.RunnableC0062;
import java.util.concurrent.ThreadFactory;
import p153.C7604;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2997 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9487;

    public /* synthetic */ ThreadFactoryC2997(int i) {
        this.f9487 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f9487) {
            case 0:
                return new Thread(new RunnableC0062(runnable, 7), "glide-active-resources");
            default:
                return new C7604(runnable);
        }
    }
}
