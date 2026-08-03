package p000;

import com.google.android.exoplayer2.p001ui.AspectRatioFrameLayout;

/* JADX INFO: renamed from: S4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0778S4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2457a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f2458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2459c;

    public RunnableC0778S4(C2649vy c2649vy, boolean z) {
        this.f2459c = c2649vy;
        this.f2458b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2457a;
        Object obj = this.f2459c;
        switch (i) {
            case 0:
                this.f2458b = false;
                int i2 = AspectRatioFrameLayout.f4347d;
                ((AspectRatioFrameLayout) obj).getClass();
                break;
            default:
                boolean z = this.f2458b;
                AbstractC2622vD.m5130a();
                C1094Zd c1094Zd = (C1094Zd) ((C2649vy) obj).f9168b;
                boolean z2 = c1094Zd.f3477a;
                c1094Zd.f3477a = z;
                if (z2 != z) {
                    ((C2606uy) c1094Zd.f3478b).mo2019a(z);
                }
                break;
        }
    }

    public RunnableC0778S4(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f2459c = aspectRatioFrameLayout;
    }
}
