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
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0881 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f413 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final CopyOnWriteArrayList f411 = new CopyOnWriteArrayList();

    public AbstractC0881(boolean z) {
        this.f412 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m624(boolean z) {
        this.f412 = z;
        for (C0882 c0882 : this.f413) {
            c0882.m13341(c0882.f414 && z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m625() {
        boolean zIsTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f411;
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
                    C6755.m11865();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.f413;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0882) it2.next()).m13339();
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo584();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo585() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo582(C0888 c0888) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo583(C0888 c0888) {
    }
}
