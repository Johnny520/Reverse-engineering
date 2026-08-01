package p086r0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Set;
import p054c0.AbstractC0514f;

/* JADX INFO: renamed from: r0.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0845I0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b */
    public int f2893b = 6;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f2894c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0854L0 f2895d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnPreDrawListenerC0845I0(View view, C0854L0 c0854l0) {
        this.f2894c = view;
        this.f2895d = c0854l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        boolean zM1754x;
        Object objM1712B;
        View view = this.f2894c;
        if (!view.getViewTreeObserver().isAlive()) {
            return true;
        }
        C0854L0 c0854l0 = this.f2895d;
        View viewM1755y = c0854l0.m1755y(view);
        if (viewM1755y != null) {
            if (c0854l0.m1745N(viewM1755y) && (objM1712B = C0854L0.m1712B(viewM1755y)) != null) {
                new WeakReference(viewM1755y);
                Set setM1750n = c0854l0.m1750n();
                if (setM1750n.isEmpty()) {
                    zM1754x = false;
                } else {
                    zM1754x = c0854l0.m1754x(objM1712B, setM1750n);
                    if (zM1754x) {
                        Set set = c0854l0.f2927e;
                        if (!set.contains(objM1712B)) {
                            try {
                                set.add(objM1712B);
                                AbstractC0514f.f1622b.mo1012c(objM1712B, "notifyDataSetChanged", new Object[0]);
                            } catch (Throwable unused) {
                            }
                            set.remove(objM1712B);
                        }
                    }
                }
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (zM1754x) {
                    return false;
                }
            }
        }
        int i2 = this.f2893b - 1;
        this.f2893b = i2;
        if (i2 > 0 || !view.getViewTreeObserver().isAlive()) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
