package p241;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.request.C3880;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC8830 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22441;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22442 = 2;

    public ViewTreeObserverOnPreDrawListenerC8830(C8829 c8829) {
        this.f22441 = new WeakReference(c8829);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        int i = this.f22442;
        Object obj = this.f22441;
        switch (i) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C8829 c8829 = (C8829) ((WeakReference) obj).get();
                if (c8829 != null) {
                    ArrayList arrayList = c8829.f22439;
                    View view = c8829.f22440;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iM14040 = c8829.m14040(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM140402 = c8829.m14040(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iM14040 > 0 || iM14040 == Integer.MIN_VALUE) && (iM140402 > 0 || iM140402 == Integer.MIN_VALUE)) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((C3880) it.next()).m7158(iM14040, iM140402);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(c8829.f22438);
                            }
                            c8829.f22438 = null;
                            arrayList.clear();
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C8827 c8827 = (C8827) ((WeakReference) obj).get();
                if (c8827 != null) {
                    ArrayList arrayList2 = c8827.f22435;
                    View view2 = c8827.f22436;
                    if (!arrayList2.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int iM14039 = c8827.m14039(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iM140392 = c8827.m14039(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if ((iM14039 > 0 || iM14039 == Integer.MIN_VALUE) && (iM140392 > 0 || iM140392 == Integer.MIN_VALUE)) {
                            Iterator it2 = new ArrayList(arrayList2).iterator();
                            while (it2.hasNext()) {
                                ((C3880) it2.next()).m7158(iM14039, iM140392);
                            }
                            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(c8827.f22434);
                            }
                            c8827.f22434 = null;
                            arrayList2.clear();
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) obj).m4502(0);
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC8830(C8827 c8827) {
        this.f22441 = new WeakReference(c8827);
    }

    public ViewTreeObserverOnPreDrawListenerC8830(CoordinatorLayout coordinatorLayout) {
        this.f22441 = coordinatorLayout;
    }
}
