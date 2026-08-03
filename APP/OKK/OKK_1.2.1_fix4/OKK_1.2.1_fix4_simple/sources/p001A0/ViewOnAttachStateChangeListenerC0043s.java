package p001A0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;
import p008E.AccessibilityManagerTouchExplorationStateChangeListenerC0148b;
import p055f.ViewOnKeyListenerC0775f;
import p055f.ViewOnKeyListenerC0788s;

/* JADX INFO: renamed from: A0.s */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0043s implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f111b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0043s(int r1, Object r2) {
        this.f110a = r1;
        this.f111b = r2;
    }

    /* JADX INFO: renamed from: a */
    private final void m138a(View r1) {
    }

    /* JADX INFO: renamed from: b */
    private final void m139b(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r3) {
        switch(this.f110a) {
            case 0: goto L5;
            case 1: goto L4;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0045u r32 = (C0045u) this.f111b;
        if (r32.f136u == null) goto L13;
        AccessibilityManager r02 = r32.f135t;
        if (r02 == null) goto L14;
        Field r1 = AbstractC0080Q.f219a;
        if (r32.isAttachedToWindow() == false) goto L15;
        r02.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0148b(r32.f136u));
        return;
    L15:
        return;
    L14:
        return;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r3) {
        switch(this.f110a) {
            case 0: goto L20;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        ViewOnKeyListenerC0788s r02 = (ViewOnKeyListenerC0788s) this.f111b;
        ViewTreeObserver r1 = r02.f2861p;
        if (r1 != null) goto L7;
    L10:
        r3.removeOnAttachStateChangeListener(this);
        return;
    L7:
        if (r1.isAlive() == true) goto L9;
        r02.f2861p = r3.getViewTreeObserver();
    L9:
        r02.f2861p.removeGlobalOnLayoutListener(r02.f2855j);
        goto L10
    L12:
        ViewOnKeyListenerC0775f r03 = (ViewOnKeyListenerC0775f) this.f111b;
        ViewTreeObserver r12 = r03.f2776y;
        if (r12 != null) goto L15;
    L18:
        r3.removeOnAttachStateChangeListener(this);
        return;
    L15:
        if (r12.isAlive() == true) goto L17;
        r03.f2776y = r3.getViewTreeObserver();
    L17:
        r03.f2776y.removeGlobalOnLayoutListener(r03.f2761j);
        goto L18
    L20:
        C0045u r32 = (C0045u) this.f111b;
        C0037m r04 = r32.f136u;
        if (r04 == null) goto L26;
        AccessibilityManager r33 = r32.f135t;
        if (r33 == null) goto L27;
        r33.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0148b(r04));
        return;
    L27:
        return;
    }
}
