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

    public /* synthetic */ RunnableC0579D(ViewGroup viewGroup, int i2) {
        this.f1718a = i2;
        this.f1719b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.f1719b;
        switch (this.f1718a) {
            case 0:
                AbstractC0307g.m703e(viewGroup, "$viewPager");
                C0588G c0588g = C0588G.f1768a;
                C0588G.m1418e(viewGroup.getRootView());
                break;
            case 1:
                AbstractC0307g.m703e(viewGroup, "$viewPager");
                C0588G c0588g2 = C0588G.f1768a;
                C0588G.m1418e(viewGroup.getRootView());
                break;
            case 2:
                AbstractC0307g.m703e(viewGroup, "$viewPager");
                C0588G c0588g3 = C0588G.f1768a;
                C0588G.m1418e(viewGroup.getRootView());
                break;
            case 3:
                AbstractC0307g.m703e(viewGroup, "$bar");
                if (BottomTabConfig.m1809d()) {
                    C0594I c0594i = C0594I.f1812a;
                    C0594I.m1470b(viewGroup);
                }
                break;
            default:
                AbstractC0307g.m703e(viewGroup, "$bar");
                if (BottomTabConfig.m1809d()) {
                    C0594I c0594i2 = C0594I.f1812a;
                    C0594I.m1470b(viewGroup);
                }
                break;
        }
    }
}
