package androidx.compose.ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1999 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Choreographer f5890;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.f5890.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.飘花落叶言子世楪兰苏哲
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
