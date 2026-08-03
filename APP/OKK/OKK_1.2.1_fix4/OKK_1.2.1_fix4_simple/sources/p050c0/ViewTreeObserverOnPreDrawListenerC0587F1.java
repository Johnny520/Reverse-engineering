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

    public ViewTreeObserverOnPreDrawListenerC0587F1(Activity r2, ViewGroup r3, ImageView r4) {
        AbstractC0307g.m703e(r2, "activity");
        this.f1764a = new WeakReference(r2);
        this.f1765b = r3;
        this.f1766c = r4;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View r3, View r4) {
        if (r4 != this.f1766c) goto L5;
        return;
    L5:
        Activity r32 = (Activity) this.f1764a.get();
        if (r32 != null) goto L9;
        return;
    L9:
        if (C0575B1.f1701a.m1393e() == true) goto L11;
        return;
    L11:
        C0590G1.f1796e.post(new RunnableC0328h(r32, this, 4));
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View r1, View r2) {
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Activity r02 = (Activity) this.f1764a.get();
        if (r02 != null) goto L5;
    L34:
        return true;
    L5:
        if (r02.isFinishing() == true) goto L34;
        if (C0575B1.f1701a.m1393e() == false) goto L34;
        boolean r2 = AbstractC0425j.m1005J0(r02.getClass().getName(), "LauncherUI", false);
        ViewGroup r5 = this.f1765b;
        ImageView r6 = this.f1766c;
        if (r2 == false) goto L21;
        Object r22 = C0590G1.f1792a;
        Long r23 = (Long) C0590G1.f1801j.get(r02);
        if (r23 == null) goto L21;
        if (r23.longValue() <= SystemClock.uptimeMillis()) goto L21;
        if (r6.getParent() == r5) goto L18;
        return true;
    L18:
        C0590G1.m1440C(r6);
        return true;
    L21:
        if (AbstractC0425j.m1005J0(r02.getClass().getName(), "LauncherUI", false) == false) goto L27;
        Object r24 = C0590G1.f1792a;
        if (C0590G1.m1458p(r02) == false) goto L27;
        C0590G1.m1454l(r02);
        return true;
    L27:
        if (r6.getParent() == r5) goto L29;
        return true;
    L29:
        Object r03 = C0590G1.f1792a;
        C0590G1.m1440C(r6);
        int r04 = r5.getChildCount() - 1;
        if (r04 < 0) goto L34;
        if (r5.getChildAt(r04) == r6) goto L34;
        C0590G1.m1460r(r6);
        goto L34
    }
}
