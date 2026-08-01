package p047I0;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import me.dartcv.nuke.BuildConfig;
import p095T.InterfaceC1315H;
import p117X2.AbstractC1665j;
import p135b.C1810B;
import p135b.C1833u;
import p139c.C1882e;
import p145d.C1949b;
import p203n.C2635S;
import p203n.C2636T;
import p203n.C2642Z;
import p229r1.AbstractC3087q;
import p229r1.AbstractC3092v;
import p244u.C3278k0;
import p260x.C3408N;

/* JADX INFO: renamed from: I0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0685N implements InterfaceC1315H {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2204c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0685N(int i5, Object obj, Object obj2) {
        this.f2202a = i5;
        this.f2203b = obj;
        this.f2204c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1315H
    /* JADX INFO: renamed from: a */
    public final void mo17a() throws Exception {
        boolean zIsTerminated;
        int i5 = this.f2202a;
        Object obj = this.f2204c;
        Object obj2 = this.f2203b;
        switch (i5) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0687O) obj);
                return;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0689P) obj);
                return;
            case 2:
                C1949b c1949b = (C1949b) obj2;
                C1882e c1882e = (C1882e) obj;
                if (c1949b.f6617a != null) {
                    c1882e.f6403b.m707e();
                    return;
                }
                if (c1949b.f6618b == null) {
                    throw new IllegalStateException("Unreachable");
                }
                C1810B c1810b = c1882e.f6402a;
                ArrayList arrayList = c1810b.f6193a;
                CopyOnWriteArrayList copyOnWriteArrayList = c1810b.f6195c;
                Iterator it = copyOnWriteArrayList.iterator();
                AbstractC1665j.m2984d(it, "iterator(...)");
                while (it.hasNext()) {
                    AutoCloseable autoCloseable = (AutoCloseable) it.next();
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z5 = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z5) {
                                        executorService.shutdownNow();
                                        z5 = true;
                                    }
                                }
                            }
                            if (z5) {
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
                    ((C1833u) it2.next()).m707e();
                }
                arrayList.clear();
                return;
            case 3:
                ((C2642Z) obj2).f8410j.remove((C2642Z) obj);
                return;
            case 4:
                C2642Z c2642z = (C2642Z) obj2;
                C2635S c2635s = (C2635S) ((C2636T) obj).f8382b.getValue();
                if (c2635s != null) {
                    c2642z.f8409i.remove(c2635s.f8377d);
                    return;
                }
                return;
            case 5:
                C3278k0 c3278k0 = (C3278k0) obj2;
                View view = (View) obj;
                int i6 = c3278k0.f10138t - 1;
                c3278k0.f10138t = i6;
                if (i6 == 0) {
                    int i7 = AbstractC3092v.f9811a;
                    AbstractC3087q.m5400b(view, null);
                    AbstractC3092v.m5409c(view, null);
                    view.removeOnAttachStateChangeListener(c3278k0.f10139u);
                    return;
                }
                return;
            default:
                ((C3408N) obj2).f10657f.m4288j(obj);
                return;
        }
    }
}
