package io.ktor.server.engine;

import androidx.compose.foundation.C1030;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4097 extends Thread {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AtomicBoolean f12439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1030 f12440;

    public C4097(C1030 c1030) {
        super("KtorShutdownHook");
        this.f12440 = c1030;
        this.f12439 = new AtomicBoolean(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (this.f12439.compareAndSet(true, false)) {
            this.f12440.invoke();
        }
    }
}
