package io.ktor.server.engine;

import androidx.compose.foundation.C1030;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4098 extends Thread {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AtomicBoolean f12443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1030 f12444;

    public C4098(C1030 c1030) {
        super("KtorShutdownHook");
        this.f12444 = c1030;
        this.f12443 = new AtomicBoolean(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (this.f12443.compareAndSet(true, false)) {
            this.f12444.invoke();
        }
    }
}
