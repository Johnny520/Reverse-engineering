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

    public AccessibilityManagerTouchExplorationStateChangeListenerC0148b(C0037m c0037m) {
        this.f343a = c0037m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0148b) {
            return this.f343a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0148b) obj).f343a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f343a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        C0039o c0039o = (C0039o) this.f343a.f91a;
        AutoCompleteTextView autoCompleteTextView = c0039o.f97h;
        if (autoCompleteTextView == null || AbstractC0040p.m80C(autoCompleteTextView)) {
            return;
        }
        int i2 = z2 ? 2 : 1;
        Field field = AbstractC0080Q.f219a;
        c0039o.f141d.setImportantForAccessibility(i2);
    }
}
