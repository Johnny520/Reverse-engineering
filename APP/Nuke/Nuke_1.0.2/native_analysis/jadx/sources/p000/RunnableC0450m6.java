package p000;

import android.os.Build;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0450m6 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        lk1 lk1Var = ViewTreeObserverOnGlobalLayoutListenerC0045b7.f623X0;
        synchronized (lk1Var) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = lk1Var.f6163a;
                int i2 = lk1Var.f6164b;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) objArr[i3];
                        boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC0045b7.getShowLayoutBounds();
                        Class cls = ViewTreeObserverOnGlobalLayoutListenerC0045b7.f620U0;
                        viewTreeObserverOnGlobalLayoutListenerC0045b7.setShowLayoutBounds(gf1.m1905w());
                        if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC0045b7.getShowLayoutBounds()) {
                            viewTreeObserverOnGlobalLayoutListenerC0045b7.post(new RunnableC0376k6(viewTreeObserverOnGlobalLayoutListenerC0045b7, 2));
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) objArr[i3];
                        viewTreeObserverOnGlobalLayoutListenerC0045b72.post(new RunnableC0376k6(viewTreeObserverOnGlobalLayoutListenerC0045b72, 3));
                        i3++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
