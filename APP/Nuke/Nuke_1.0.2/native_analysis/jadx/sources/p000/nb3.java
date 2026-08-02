package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nb3 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: h */
    public final WeakReference f7106h;

    public nb3(ob3 ob3Var) {
        this.f7106h = new WeakReference(ob3Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
        }
        ob3 ob3Var = (ob3) this.f7106h.get();
        if (ob3Var == null) {
            return true;
        }
        ArrayList arrayList = ob3Var.f7618b;
        View view = ob3Var.f7617a;
        if (arrayList.isEmpty()) {
            return true;
        }
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM3552a = ob3Var.m3552a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM3552a2 = ob3Var.m3552a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if (iM3552a <= 0 && iM3552a != Integer.MIN_VALUE) {
            return true;
        }
        if (iM3552a2 <= 0 && iM3552a2 != Integer.MIN_VALUE) {
            return true;
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            ((yq2) it.next()).m6311l(iM3552a, iM3552a2);
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(ob3Var.f7619c);
        }
        ob3Var.f7619c = null;
        arrayList.clear();
        return true;
    }
}
