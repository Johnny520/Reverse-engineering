package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0995X6 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3169b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0995X6(int r1, Object r2) {
        this.f3168a = r1;
        this.f3169b = r2;
    }

    /* JADX INFO: renamed from: a */
    private final void m1883a(View r1) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1884b(View r1) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1885c(View r1) {
    }

    /* JADX INFO: renamed from: d */
    private final void m1886d(View r1) {
    }

    /* JADX INFO: renamed from: e */
    private final void m1887e(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r5) {
        int r0 = this.f3168a;
        Object r1 = this.f3169b;
        switch(r0) {
            case 0: goto L19;
            case 1: goto L14;
            case 2: goto L7;
            case 3: goto L5;
            case 4: goto L4;
            case 5: goto L4;
            default: goto L4;
        };
    L4:
        return;
    L5:
        View r12 = (View) r1;
        r12.removeOnAttachStateChangeListener(this);
        WeakHashMap r52 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r12);
        return;
    L7:
        C1141ag r13 = (C1141ag) r1;
        AccessibilityManager r53 = r13.f3625t;
        if (r13.f3626u == null) goto L16;
        if (r53 != null) goto L11;
        return;
    L11:
        if (r13.isAttachedToWindow() == false) goto L18;
        r53.addTouchExplorationStateChangeListener(r13.f3626u);
        return;
    L18:
        return;
    L16:
        return;
    L14:
        AbstractC0295Gu.m625r(-247325691738165L);
        r5.removeOnAttachStateChangeListener(this);
        r5.post(new RunnableC1398f8((C0693Q4) r1, 1));
        return;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r3) {
        switch(this.f3168a) {
            case 0: goto L32;
            case 1: goto L30;
            case 2: goto L24;
            case 3: goto L42;
            case 4: goto L18;
            case 5: goto L12;
            default: goto L4;
        };
    L4:
        ViewOnKeyListenerC1029Xy r0 = (ViewOnKeyListenerC1029Xy) this.f3169b;
        ViewTreeObserver r1 = r0.f3288o;
        if (r1 != null) goto L7;
    L10:
        r3.removeOnAttachStateChangeListener(this);
        return;
    L7:
        if (r1.isAlive() == true) goto L9;
        r0.f3288o = r3.getViewTreeObserver();
    L9:
        r0.f3288o.removeGlobalOnLayoutListener(r0.f3282i);
        goto L10
    L12:
        HideViewOnScrollBehavior r32 = (HideViewOnScrollBehavior) this.f3169b;
        AccessibilityManagerTouchExplorationStateChangeListenerC2807zk r02 = r32.f4393c;
        if (r02 == null) goto L40;
        AccessibilityManager r12 = r32.f4392b;
        if (r12 == null) goto L41;
        r12.removeTouchExplorationStateChangeListener(r02);
        r32.f4393c = null;
        return;
    L41:
        return;
    L40:
        return;
    L18:
        HideBottomViewOnScrollBehavior r33 = (HideBottomViewOnScrollBehavior) this.f3169b;
        AccessibilityManagerTouchExplorationStateChangeListenerC2807zk r03 = r33.f4387h;
        if (r03 == null) goto L43;
        AccessibilityManager r13 = r33.f4386g;
        if (r13 == null) goto L44;
        r13.removeTouchExplorationStateChangeListener(r03);
        r33.f4387h = null;
        return;
    L44:
        return;
    L43:
        return;
    L24:
        C1141ag r34 = (C1141ag) this.f3169b;
        AccessibilityManager.TouchExplorationStateChangeListener r04 = r34.f3626u;
        if (r04 == null) goto L45;
        AccessibilityManager r35 = r34.f3625t;
        if (r35 == null) goto L46;
        r35.removeTouchExplorationStateChangeListener(r04);
        return;
    L46:
        return;
    L45:
        return;
    L30:
        AbstractC0295Gu.m625r(-247334281672757L);
        return;
    L32:
        ViewOnKeyListenerC1125a7 r05 = (ViewOnKeyListenerC1125a7) this.f3169b;
        ViewTreeObserver r14 = r05.f3564x;
        if (r14 != null) goto L35;
    L38:
        r3.removeOnAttachStateChangeListener(this);
        return;
    L35:
        if (r14.isAlive() == true) goto L37;
        r05.f3564x = r3.getViewTreeObserver();
    L37:
        r05.f3564x.removeGlobalOnLayoutListener(r05.f3549i);
        goto L38
    }
}
