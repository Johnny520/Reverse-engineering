package p050c0;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import p031Q0.AbstractC0307g;
import p034S.RunnableC0328h;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.F1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0587F1 implements ViewTreeObserver.OnPreDrawListener, ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f1764a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f1765b;

    /* JADX INFO: renamed from: c */
    public final ImageView f1766c;

    /* JADX INFO: renamed from: d */
    public boolean f1767d;

    public ViewTreeObserverOnPreDrawListenerC0587F1(Activity activity, ViewGroup viewGroup, ImageView imageView) {
        AbstractC0307g.m703e(activity, "activity");
        this.f1764a = new WeakReference(activity);
        this.f1765b = viewGroup;
        this.f1766c = imageView;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        Activity activity;
        if (view2 == this.f1766c || (activity = (Activity) this.f1764a.get()) == null || !C0575B1.f1701a.m1393e()) {
            return;
        }
        C0590G1.f1796e.post(new RunnableC0328h(activity, this, 4));
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Activity activity = (Activity) this.f1764a.get();
        if (activity != null && !activity.isFinishing() && C0575B1.f1701a.m1393e()) {
            boolean zM1005J0 = AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false);
            ViewGroup viewGroup = this.f1765b;
            ImageView imageView = this.f1766c;
            if (zM1005J0) {
                Object obj = C0590G1.f1792a;
                Long l2 = (Long) C0590G1.f1801j.get(activity);
                if (l2 != null && l2.longValue() > SystemClock.uptimeMillis()) {
                    if (imageView.getParent() != viewGroup) {
                        return true;
                    }
                    C0590G1.m1440C(imageView);
                    return true;
                }
            }
            if (AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false)) {
                Object obj2 = C0590G1.f1792a;
                if (C0590G1.m1458p(activity)) {
                    C0590G1.m1454l(activity);
                    return true;
                }
            }
            if (imageView.getParent() != viewGroup) {
                return true;
            }
            Object obj3 = C0590G1.f1792a;
            C0590G1.m1440C(imageView);
            int childCount = viewGroup.getChildCount() - 1;
            if (childCount >= 0 && viewGroup.getChildAt(childCount) != imageView) {
                C0590G1.m1460r(imageView);
            }
        }
        return true;
    }
}
