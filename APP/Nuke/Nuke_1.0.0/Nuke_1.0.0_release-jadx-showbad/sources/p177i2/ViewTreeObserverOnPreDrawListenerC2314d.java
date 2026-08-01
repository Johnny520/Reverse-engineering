package p177i2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p171h2.C2239f;

/* JADX INFO: renamed from: i2.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2314d implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: d */
    public final WeakReference f7550d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnPreDrawListenerC2314d(C2315e c2315e) {
        this.f7550d = new WeakReference(c2315e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
        }
        C2315e c2315e = (C2315e) this.f7550d.get();
        if (c2315e == null) {
            return true;
        }
        ArrayList arrayList = c2315e.f7553b;
        View view = c2315e.f7552a;
        if (arrayList.isEmpty()) {
            return true;
        }
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM4144a = c2315e.m4144a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM4144a2 = c2315e.m4144a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if (iM4144a <= 0 && iM4144a != Integer.MIN_VALUE) {
            return true;
        }
        if (iM4144a2 <= 0 && iM4144a2 != Integer.MIN_VALUE) {
            return true;
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            ((C2239f) ((InterfaceC2312b) it.next())).m4067l(iM4144a, iM4144a2);
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c2315e.f7554c);
        }
        c2315e.f7554c = null;
        arrayList.clear();
        return true;
    }
}
