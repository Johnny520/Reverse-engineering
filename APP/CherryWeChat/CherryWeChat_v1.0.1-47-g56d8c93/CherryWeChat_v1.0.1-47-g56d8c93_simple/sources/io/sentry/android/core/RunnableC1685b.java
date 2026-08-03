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

    public /* synthetic */ RunnableC1685b(C0252Fu r1, Activity r2, int r3) {
        this.f6086a = r3;
        this.f6087b = r1;
        this.f6088c = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f6086a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        C0584Ni r0 = ((FrameMetricsAggregator) this.f6087b.f819a).f3910a;
        ArrayList r1 = (ArrayList) r0.f1894c;
        Iterator r2 = r1.iterator();
    L5:
        boolean r3 = r2.hasNext();
        Activity r4 = this.f6088c;
        if (r3 == false) goto L10;
        WeakReference r32 = (WeakReference) r2.next();
        if (r32.get() != r4) goto L5;
        r1.remove(r32);
    L10:
        r4.getWindow().removeOnFrameMetricsAvailableListener((WindowOnFrameMetricsAvailableListenerC0541Mi) r0.f1895d);
        return;
    L12:
        C0584Ni r02 = ((FrameMetricsAggregator) this.f6087b.f819a).f3910a;
        r02.getClass();
        if (C0584Ni.f1890e != null) goto L15;
        HandlerThread r12 = new HandlerThread("FrameMetricsAggregator");
        C0584Ni.f1890e = r12;
        r12.start();
        C0584Ni.f1891f = new Handler(C0584Ni.f1890e.getLooper());
    L15:
        int r13 = 0;
    L17:
        if (r13 > 8) goto L24;
        SparseIntArray[] r22 = (SparseIntArray[]) r02.f1893b;
        if (r22[r13] != null) goto L23;
        if ((r02.f1892a & (1 << r13)) == 0) goto L23;
        r22[r13] = new SparseIntArray();
    L23:
        r13 = r13 + 1;
        goto L17
    L24:
        Activity r14 = this.f6088c;
        r14.getWindow().addOnFrameMetricsAvailableListener((WindowOnFrameMetricsAvailableListenerC0541Mi) r02.f1895d, C0584Ni.f1891f);
        ((ArrayList) r02.f1894c).add(new WeakReference(r14));
    }
}
