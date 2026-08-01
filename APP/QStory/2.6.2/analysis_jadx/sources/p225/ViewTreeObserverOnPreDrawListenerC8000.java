package p225;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.request.C3047;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC8000 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22100 = 2;

    public ViewTreeObserverOnPreDrawListenerC8000(C7999 c7999) {
        this.f22099 = new WeakReference(c7999);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        int i = this.f22100;
        Object obj = this.f22099;
        switch (i) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C7999 c7999 = (C7999) ((WeakReference) obj).get();
                if (c7999 != null) {
                    ArrayList arrayList = c7999.f22097;
                    View view = c7999.f22098;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iM13453 = c7999.m13453(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM134532 = c7999.m13453(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iM13453 > 0 || iM13453 == Integer.MIN_VALUE) && (iM134532 > 0 || iM134532 == Integer.MIN_VALUE)) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((C3047) it.next()).m6538(iM13453, iM134532);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(c7999.f22096);
                            }
                            c7999.f22096 = null;
                            arrayList.clear();
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C7997 c7997 = (C7997) ((WeakReference) obj).get();
                if (c7997 != null) {
                    ArrayList arrayList2 = c7997.f22093;
                    View view2 = c7997.f22094;
                    if (!arrayList2.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int iM13452 = c7997.m13452(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iM134522 = c7997.m13452(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if ((iM13452 > 0 || iM13452 == Integer.MIN_VALUE) && (iM134522 > 0 || iM134522 == Integer.MIN_VALUE)) {
                            Iterator it2 = new ArrayList(arrayList2).iterator();
                            while (it2.hasNext()) {
                                ((C3047) it2.next()).m6538(iM13452, iM134522);
                            }
                            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(c7997.f22092);
                            }
                            c7997.f22092 = null;
                            arrayList2.clear();
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) obj).m3932(0);
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC8000(C7997 c7997) {
        this.f22099 = new WeakReference(c7997);
    }

    public ViewTreeObserverOnPreDrawListenerC8000(CoordinatorLayout coordinatorLayout) {
        this.f22099 = coordinatorLayout;
    }
}
