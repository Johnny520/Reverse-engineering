package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q90 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap a;

    public q90() {
        this.a = new WeakHashMap();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT >= 28) goto L18;
        WeakHashMap r0 = this.a;
        Iterator r1 = r0.entrySet().iterator();
    L6:
        if (r1.hasNext() == false) goto L24;
        Map.Entry r2 = (Map.Entry) r1.next();
        View r3 = (View) r2.getKey();
        boolean r22 = ((Boolean) r2.getValue()).booleanValue();
        if (r3.isShown() == true) goto L10;
    L12:
        boolean r4 = false;
    L13:
        if (r22 == r4) goto L6;
        if (r4 == false) goto L16;
        int r23 = 16;
    L17:
        ja0.g(r3, r23);
        r0.put(r3, Boolean.valueOf(r4));
        goto L6
    L16:
        r23 = 32;
        goto L17
    L10:
        if (r3.getWindowVisibility() != 0) goto L12;
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
