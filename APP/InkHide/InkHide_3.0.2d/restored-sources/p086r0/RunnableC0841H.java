package p086r0;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: r0.H */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0841H implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0894d0 f2811b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f2812c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0841H(C0894d0 c0894d0, View view, int i2) {
        this.f2810a = i2;
        this.f2811b = c0894d0;
        this.f2812c = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0894d0 c0894d0 = this.f2811b;
        View view = this.f2812c;
        switch (this.f2810a) {
            case 0:
                c0894d0.m1885T0(view);
                break;
            case 1:
                c0894d0.m1885T0(view);
                break;
            case 2:
                C0894d0.m1844f(c0894d0, view, null);
                break;
            case 3:
                C0894d0.m1844f(c0894d0, view, null);
                break;
            default:
                View rootView = view.getRootView();
                List list = C0894d0.f3085U;
                c0894d0.m1904o(null, null, rootView);
                break;
        }
    }
}
