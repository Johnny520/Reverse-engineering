package p008E;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Field;
import p001A0.AbstractC0040p;
import p001A0.C0037m;
import p001A0.C0039o;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: E.b */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0148b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final C0037m f343a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0148b(C0037m r1) {
        this.f343a = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0148b) == true) goto L10;
        return false;
    L10:
        return this.f343a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0148b) r2).f343a);
    }

    public final int hashCode() {
        return this.f343a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r3) {
        C0039o r02 = (C0039o) this.f343a.f91a;
        AutoCompleteTextView r1 = r02.f97h;
        if (r1 != null) goto L5;
        return;
    L5:
        if (AbstractC0040p.m80C(r1) == true) goto L12;
        if (r3 == false) goto L8;
        int r32 = 2;
    L9:
        Field r12 = AbstractC0080Q.f219a;
        r02.f141d.setImportantForAccessibility(r32);
        return;
    L8:
        r32 = 1;
        goto L9
    }
}
