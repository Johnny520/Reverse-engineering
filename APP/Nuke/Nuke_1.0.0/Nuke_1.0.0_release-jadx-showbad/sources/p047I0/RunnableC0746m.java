package p047I0;

import android.os.Build;
import p186k.C2404A;

/* JADX INFO: renamed from: I0.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0746m implements Runnable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C2404A c2404a = ViewTreeObserverOnGlobalLayoutListenerC0772y.f2423Q0;
        synchronized (c2404a) {
            try {
                int i5 = 0;
                if (Build.VERSION.SDK_INT < 30) {
                    Object[] objArr = c2404a.f7766a;
                    int i6 = c2404a.f7767b;
                    while (i5 < i6) {
                        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = (ViewTreeObserverOnGlobalLayoutListenerC0772y) objArr[i5];
                        boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC0772y.getShowLayoutBounds();
                        Class cls = ViewTreeObserverOnGlobalLayoutListenerC0772y.f2420N0;
                        viewTreeObserverOnGlobalLayoutListenerC0772y.setShowLayoutBounds(AbstractC0681L.m1188j());
                        if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC0772y.getShowLayoutBounds()) {
                            ViewTreeObserverOnGlobalLayoutListenerC0772y.m1291n(viewTreeObserverOnGlobalLayoutListenerC0772y.getRoot());
                        }
                        i5++;
                    }
                } else {
                    Object[] objArr2 = c2404a.f7766a;
                    int i7 = c2404a.f7767b;
                    while (i5 < i7) {
                        ViewTreeObserverOnGlobalLayoutListenerC0772y.m1291n(((ViewTreeObserverOnGlobalLayoutListenerC0772y) objArr2[i5]).getRoot());
                        i5++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
