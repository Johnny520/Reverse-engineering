package p069i;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: i.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0626J {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1233a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
