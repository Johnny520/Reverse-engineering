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
    public final /* synthetic */ int f2763a;

    /* JADX INFO: renamed from: b */
    public final Object f2764b;

    public ViewTreeObserverOnPreDrawListenerC0877Ub(C0445KE r2) {
        this.f2763a = 1;
        this.f2764b = new WeakReference(r2);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch(this.f2763a) {
            case 0: goto L31;
            default: goto L4;
        };
    L4:
        C0445KE r0 = (C0445KE) ((WeakReference) this.f2764b).get();
        if (r0 == null) goto L34;
        ArrayList r1 = r0.f1462b;
        View r2 = r0.f1461a;
        if (r1.isEmpty() == true) goto L37;
        int r4 = r2.getPaddingRight() + r2.getPaddingLeft();
        ViewGroup.LayoutParams r3 = r2.getLayoutParams();
        int r5 = 0;
        if (r3 == null) goto L12;
        int r32 = r3.width;
    L13:
        int r33 = r0.m894a(r2.getWidth(), r32, r4);
        int r6 = r2.getPaddingBottom() + r2.getPaddingTop();
        ViewGroup.LayoutParams r42 = r2.getLayoutParams();
        if (r42 == null) goto L16;
        r5 = r42.height;
    L16:
        int r43 = r0.m894a(r2.getHeight(), r5, r6);
        if (r33 > 0) goto L19;
        if (r33 == Integer.MIN_VALUE) goto L19;
        return true;
    L19:
        if (r43 > 0) goto L21;
        if (r43 == Integer.MIN_VALUE) goto L21;
        return true;
    L21:
        Iterator r52 = new ArrayList(r1).iterator();
    L23:
        if (r52.hasNext() == false) goto L25;
        ((C2563ty) ((InterfaceC0041Ay) r52.next())).m5050l(r33, r43);
        goto L23
    L25:
        ViewTreeObserver r22 = r2.getViewTreeObserver();
        if (r22.isAlive() == false) goto L28;
        r22.removeOnPreDrawListener(r0.f1463c);
    L28:
        r0.f1463c = null;
        r1.clear();
        return true;
    L12:
        r32 = 0;
        goto L13
    L37:
        return true;
    L34:
        return true;
    L31:
        ((CoordinatorLayout) this.f2764b).m2139o(0);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC0877Ub(CoordinatorLayout r2) {
        this.f2763a = 0;
        this.f2764b = r2;
    }
}
