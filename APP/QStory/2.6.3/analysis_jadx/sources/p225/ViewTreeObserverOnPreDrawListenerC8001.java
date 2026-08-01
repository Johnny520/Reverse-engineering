package p225;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.request.C3048;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC8001 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22096;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22097 = 2;

    public ViewTreeObserverOnPreDrawListenerC8001(C8000 c8000) {
        this.f22096 = new WeakReference(c8000);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        int i = this.f22097;
        Object obj = this.f22096;
        switch (i) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C8000 c8000 = (C8000) ((WeakReference) obj).get();
                if (c8000 != null) {
                    ArrayList arrayList = c8000.f22094;
                    View view = c8000.f22095;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iM13481 = c8000.m13481(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM134812 = c8000.m13481(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iM13481 > 0 || iM13481 == Integer.MIN_VALUE) && (iM134812 > 0 || iM134812 == Integer.MIN_VALUE)) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((C3048) it.next()).m6598(iM13481, iM134812);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(c8000.f22093);
                            }
                            c8000.f22093 = null;
                            arrayList.clear();
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C7998 c7998 = (C7998) ((WeakReference) obj).get();
                if (c7998 != null) {
                    ArrayList arrayList2 = c7998.f22090;
                    View view2 = c7998.f22091;
                    if (!arrayList2.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int iM13480 = c7998.m13480(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iM134802 = c7998.m13480(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if ((iM13480 > 0 || iM13480 == Integer.MIN_VALUE) && (iM134802 > 0 || iM134802 == Integer.MIN_VALUE)) {
                            Iterator it2 = new ArrayList(arrayList2).iterator();
                            while (it2.hasNext()) {
                                ((C3048) it2.next()).m6598(iM13480, iM134802);
                            }
                            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(c7998.f22089);
                            }
                            c7998.f22089 = null;
                            arrayList2.clear();
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) obj).m3942(0);
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC8001(C7998 c7998) {
        this.f22096 = new WeakReference(c7998);
    }

    public ViewTreeObserverOnPreDrawListenerC8001(CoordinatorLayout coordinatorLayout) {
        this.f22096 = coordinatorLayout;
    }
}
