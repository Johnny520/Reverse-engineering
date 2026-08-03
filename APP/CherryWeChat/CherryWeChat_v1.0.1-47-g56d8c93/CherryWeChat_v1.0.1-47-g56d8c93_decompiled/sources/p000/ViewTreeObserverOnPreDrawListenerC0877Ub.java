package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Ub */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0877Ub implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2763a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f2764b;

    public ViewTreeObserverOnPreDrawListenerC0877Ub(C0445KE c0445ke) {
        this.f2764b = new WeakReference(c0445ke);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f2763a) {
            case 0:
                ((CoordinatorLayout) this.f2764b).m2139o(0);
                break;
            default:
                C0445KE c0445ke = (C0445KE) ((WeakReference) this.f2764b).get();
                if (c0445ke != null) {
                    ArrayList arrayList = c0445ke.f1462b;
                    View view = c0445ke.f1461a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iM894a = c0445ke.m894a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM894a2 = c0445ke.m894a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iM894a > 0 || iM894a == Integer.MIN_VALUE) {
                            if (iM894a2 > 0 || iM894a2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((C2563ty) ((InterfaceC0041Ay) it.next())).m5050l(iM894a, iM894a2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c0445ke.f1463c);
                                }
                                c0445ke.f1463c = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC0877Ub(CoordinatorLayout coordinatorLayout) {
        this.f2764b = coordinatorLayout;
    }
}
