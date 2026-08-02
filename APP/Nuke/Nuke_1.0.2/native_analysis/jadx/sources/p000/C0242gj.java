package p000;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0242gj {

    /* JADX INFO: renamed from: a */
    public final fm1 f3538a;

    /* JADX INFO: renamed from: b */
    public final ot1 f3539b;

    public C0242gj(fm1 fm1Var, ot1 ot1Var) {
        this.f3538a = fm1Var;
        this.f3539b = ot1Var;
        if ((fm1Var == null ? ot1Var : fm1Var) != null) {
            return;
        }
        C0676s.m4651j("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1926a(AbstractC0796v3 abstractC0796v3) {
        fm1 fm1Var = this.f3538a;
        if (fm1Var != null) {
            fm1.m1662a(fm1Var, (C0168ej) abstractC0796v3.f11661i);
            return;
        }
        ot1 ot1Var = this.f3539b;
        if (ot1Var == null) {
            C0676s.m4653l("Unreachable");
            return;
        }
        C0205fj c0205fj = (C0205fj) abstractC0796v3.f11660h;
        c0205fj.getClass();
        jt1 jt1Var = new jt1(c0205fj, new kt1(c0205fj, null));
        c0205fj.f3011a.add(jt1Var);
        fm1.m1662a(ot1Var.m3639a(), jt1Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m1927b(AbstractC0796v3 abstractC0796v3) throws Exception {
        boolean zIsTerminated;
        if (this.f3538a != null) {
            ((C0168ej) abstractC0796v3.f11661i).m2220e();
            return;
        }
        if (this.f3539b == null) {
            C0676s.m4653l("Unreachable");
            return;
        }
        C0205fj c0205fj = (C0205fj) abstractC0796v3.f11660h;
        ArrayList arrayList = c0205fj.f3011a;
        CopyOnWriteArrayList copyOnWriteArrayList = c0205fj.f3013c;
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
            ((jt1) it2.next()).m2220e();
        }
        arrayList.clear();
    }
}
