package android.view;

import Yue.AbstractC5912;
import Yue.C4423;
import Yue.C5499;
import Yue.InterfaceC3262;
import Yue.InterfaceC4225;
import Yue.InterfaceC5922;
import Yue.InterfaceC6399;
import android.view.DispatchQueue;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/lang/Runnable;", "runnable", "LYue/ۥۣۢ۠ۤ;", "enqueue", "(Ljava/lang/Runnable;)V", "pause", "resume", "finish", "drainQueue", "", "canRun", "()Z", "LYue/ۥ۟ۧۦۥ;", "context", "dispatchAndEnqueue", "(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V", "paused", "Z", "finished", "isDraining", "Ljava/util/Queue;", "queue", "Ljava/util/Queue;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;

    @InterfaceC6399
    private final Queue<Runnable> queue = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue dispatchQueue, Runnable runnable) {
        C5499.m17103(dispatchQueue, "this$0");
        C5499.m17103(runnable, "$runnable");
        dispatchQueue.enqueue(runnable);
    }

    @InterfaceC5922
    private final void enqueue(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        drainQueue();
    }

    @InterfaceC5922
    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    @InterfaceC3262
    public final void dispatchAndEnqueue(@InterfaceC6399 InterfaceC4225 context, @InterfaceC6399 final Runnable runnable) {
        C5499.m17103(context, "context");
        C5499.m17103(runnable, "runnable");
        AbstractC5912 abstractC5912Mo16039 = C4423.m12872().mo16039();
        if (abstractC5912Mo16039.isDispatchNeeded(context) || canRun()) {
            abstractC5912Mo16039.dispatch(context, new Runnable() { // from class: Yue.ۥ۠۟ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1(this.f9140, runnable);
                }
            });
        } else {
            enqueue(runnable);
        }
    }

    @InterfaceC5922
    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    @InterfaceC5922
    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    @InterfaceC5922
    public final void pause() {
        this.paused = true;
    }

    @InterfaceC5922
    public final void resume() {
        if (this.paused) {
            if (!(!this.finished)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.paused = false;
            drainQueue();
        }
    }
}
