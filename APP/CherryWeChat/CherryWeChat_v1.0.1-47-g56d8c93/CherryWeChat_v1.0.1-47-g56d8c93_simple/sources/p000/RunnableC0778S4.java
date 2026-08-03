package p000;

import com.google.android.exoplayer2.p001ui.AspectRatioFrameLayout;

/* JADX INFO: renamed from: S4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0778S4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2457a;

    /* JADX INFO: renamed from: b */
    public boolean f2458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2459c;

    public RunnableC0778S4(C2649vy r2, boolean r3) {
        this.f2457a = 1;
        this.f2459c = r2;
        this.f2458b = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.f2457a;
        Object r1 = this.f2459c;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        boolean r02 = this.f2458b;
        AbstractC2622vD.m5130a();
        C1094Zd r12 = (C1094Zd) ((C2649vy) r1).f9168b;
        boolean r2 = r12.f3477a;
        r12.f3477a = r02;
        if (r2 == r02) goto L10;
        ((C2606uy) r12.f3478b).mo2019a(r02);
        return;
    L10:
        return;
    L8:
        this.f2458b = false;
        int r03 = AspectRatioFrameLayout.f4347d;
        ((AspectRatioFrameLayout) r1).getClass();
    }

    public RunnableC0778S4(AspectRatioFrameLayout r2) {
        this.f2457a = 0;
        this.f2459c = r2;
    }
}
