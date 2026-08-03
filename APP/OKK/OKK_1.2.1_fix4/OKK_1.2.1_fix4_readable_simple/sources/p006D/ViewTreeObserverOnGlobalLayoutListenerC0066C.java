package p006D;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D.C */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0066C implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f210a;

    public ViewTreeObserverOnGlobalLayoutListenerC0066C() {
        this.f210a = new WeakHashMap();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT >= 28) goto L18;
        Iterator r02 = this.f210a.entrySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L24;
        Map.Entry r1 = (Map.Entry) r02.next();
        View r2 = (View) r1.getKey();
        boolean r3 = ((Boolean) r1.getValue()).booleanValue();
        if (r2.isShown() == true) goto L10;
    L12:
        boolean r4 = false;
    L13:
        if (r3 == r4) goto L6;
        if (r4 == false) goto L16;
        int r32 = 16;
    L17:
        AbstractC0080Q.m286e(r2, r32);
        r1.setValue(Boolean.valueOf(r4));
        goto L6
    L16:
        r32 = 32;
        goto L17
    L10:
        if (r2.getWindowVisibility() != 0) goto L12;
        r4 = true;
        goto L13
    L24:
        return;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
        r1.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r1) {
    }
}
