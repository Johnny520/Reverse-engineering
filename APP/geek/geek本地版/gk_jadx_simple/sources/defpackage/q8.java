package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q8(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r3) {
        switch(this.a) {
            case 0: goto L12;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ej r32 = (ej) this.b;
        AccessibilityManager r0 = r32.t;
        if (r32.u == null) goto L13;
        if (r0 == null) goto L14;
        WeakHashMap r1 = ja0.a;
        if (v90.b(r32) == false) goto L15;
        z.a(r0, r32.u);
        return;
    L15:
        return;
    L14:
        return;
    L13:
        return;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r3) {
        switch(this.a) {
            case 0: goto L18;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        q40 r0 = (q40) this.b;
        ViewTreeObserver r1 = r0.o;
        if (r1 != null) goto L7;
    L10:
        r3.removeOnAttachStateChangeListener(this);
        return;
    L7:
        if (r1.isAlive() == true) goto L9;
        r0.o = r3.getViewTreeObserver();
    L9:
        r0.o.removeGlobalOnLayoutListener(r0.i);
        goto L10
    L12:
        ej r32 = (ej) this.b;
        a0 r02 = r32.u;
        if (r02 == null) goto L26;
        AccessibilityManager r33 = r32.t;
        if (r33 == null) goto L27;
        z.b(r33, r02);
        return;
    L27:
        return;
    L26:
        return;
    L18:
        t8 r03 = (t8) this.b;
        ViewTreeObserver r12 = r03.x;
        if (r12 != null) goto L21;
    L24:
        r3.removeOnAttachStateChangeListener(this);
        return;
    L21:
        if (r12.isAlive() == true) goto L23;
        r03.x = r3.getViewTreeObserver();
    L23:
        r03.x.removeGlobalOnLayoutListener(r03.i);
        goto L24
    }

    private final void a(View r1) {
    }

    private final void b(View r1) {
    }
}
