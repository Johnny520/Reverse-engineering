package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0252Fu;
import p000.C0584Ni;
import p000.WindowOnFrameMetricsAvailableListenerC0541Mi;

/* JADX INFO: renamed from: io.sentry.android.core.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1685b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0252Fu f6087b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f6088c;

    public /* synthetic */ RunnableC1685b(C0252Fu c0252Fu, Activity activity, int i) {
        this.f6086a = i;
        this.f6087b = c0252Fu;
        this.f6088c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        switch (this.f6086a) {
            case 0:
                C0584Ni c0584Ni = ((FrameMetricsAggregator) this.f6087b.f819a).f3910a;
                c0584Ni.getClass();
                if (C0584Ni.f1890e == null) {
                    HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                    C0584Ni.f1890e = handlerThread;
                    handlerThread.start();
                    C0584Ni.f1891f = new Handler(C0584Ni.f1890e.getLooper());
                }
                for (int i = 0; i <= 8; i++) {
                    SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) c0584Ni.f1893b;
                    if (sparseIntArrayArr[i] == null && (c0584Ni.f1892a & (1 << i)) != 0) {
                        sparseIntArrayArr[i] = new SparseIntArray();
                    }
                }
                Activity activity2 = this.f6088c;
                activity2.getWindow().addOnFrameMetricsAvailableListener((WindowOnFrameMetricsAvailableListenerC0541Mi) c0584Ni.f1895d, C0584Ni.f1891f);
                ((ArrayList) c0584Ni.f1894c).add(new WeakReference(activity2));
                break;
            default:
                C0584Ni c0584Ni2 = ((FrameMetricsAggregator) this.f6087b.f819a).f3910a;
                ArrayList arrayList = (ArrayList) c0584Ni2.f1894c;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    activity = this.f6088c;
                    if (zHasNext) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference.get() == activity) {
                            arrayList.remove(weakReference);
                        }
                    }
                }
                activity.getWindow().removeOnFrameMetricsAvailableListener((WindowOnFrameMetricsAvailableListenerC0541Mi) c0584Ni2.f1895d);
                break;
        }
    }
}
