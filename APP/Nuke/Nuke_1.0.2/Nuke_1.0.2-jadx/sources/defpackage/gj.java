package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gj {
    public final fm1 a;
    public final ot1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gj(fm1 fm1Var, ot1 ot1Var) {
        this.a = fm1Var;
        this.b = ot1Var;
        if ((fm1Var == null ? ot1Var : fm1Var) != null) {
            return;
        }
        s.j("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(v3 v3Var) {
        fm1 fm1Var = this.a;
        if (fm1Var != null) {
            fm1.a(fm1Var, (ej) v3Var.i);
            return;
        }
        ot1 ot1Var = this.b;
        if (ot1Var == null) {
            s.l("Unreachable");
            return;
        }
        fj fjVar = (fj) v3Var.h;
        fjVar.getClass();
        jt1 jt1Var = new jt1(fjVar, new kt1(fjVar, null));
        fjVar.a.add(jt1Var);
        fm1.a(ot1Var.a(), jt1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(v3 v3Var) throws Exception {
        boolean zIsTerminated;
        if (this.a != null) {
            ((ej) v3Var.i).e();
            return;
        }
        if (this.b == null) {
            s.l("Unreachable");
            return;
        }
        fj fjVar = (fj) v3Var.h;
        ArrayList arrayList = fjVar.a;
        CopyOnWriteArrayList copyOnWriteArrayList = fjVar.c;
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
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((jt1) it2.next()).e();
        }
        arrayList.clear();
    }
}
