package com.abc.core.features;

import android.view.ViewGroup;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0579D implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f1719b;

    public /* synthetic */ RunnableC0579D(ViewGroup r1, int r2) {
        this.f1718a = r2;
        this.f1719b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup r2 = this.f1719b;
        switch(this.f1718a) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L8;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r2, "$bar");
        if (BottomTabConfig.m1809d() == false) goto L18;
        C0594I r02 = C0594I.f1812a;
        C0594I.m1470b(r2);
        return;
    L18:
        return;
    L8:
        AbstractC0307g.m703e(r2, "$bar");
        if (BottomTabConfig.m1809d() == false) goto L19;
        C0594I r03 = C0594I.f1812a;
        C0594I.m1470b(r2);
        return;
    L19:
        return;
    L12:
        AbstractC0307g.m703e(r2, "$viewPager");
        C0588G r04 = C0588G.f1768a;
        C0588G.m1418e(r2.getRootView());
        return;
    L14:
        AbstractC0307g.m703e(r2, "$viewPager");
        C0588G r05 = C0588G.f1768a;
        C0588G.m1418e(r2.getRootView());
        return;
    L16:
        AbstractC0307g.m703e(r2, "$viewPager");
        C0588G r06 = C0588G.f1768a;
        C0588G.m1418e(r2.getRootView());
    }
}
