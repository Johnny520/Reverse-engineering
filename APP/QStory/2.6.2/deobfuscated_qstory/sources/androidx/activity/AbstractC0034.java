package androidx.activity;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f67;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f68 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final CopyOnWriteArrayList f66 = new CopyOnWriteArrayList();

    public AbstractC0034(boolean z) {
        this.f67 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m64(boolean z) {
        this.f67 = z;
        for (C0035 c0035 : this.f68) {
            c0035.m12753(c0035.f69 && z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m65() {
        boolean zIsTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f66;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    C5919.m11245();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.f68;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0035) it2.next()).m12751();
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo24();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo25() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo22(C0041 c0041) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo23(C0041 c0041) {
    }
}
