package p000a;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.D */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0056D implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final C0080E5 f192a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0056D(C0080E5 c0080e5) {
        this.f192a = c0080e5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0056D) {
            return this.f192a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0056D) obj).f192a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f192a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C0098F5 c0098f5 = (C0098F5) this.f192a.f260a;
        AutoCompleteTextView autoCompleteTextView = c0098f5.f314h;
        if (autoCompleteTextView == null || C0889w1.m2120G(autoCompleteTextView)) {
            return;
        }
        int i = z ? 2 : 1;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        c0098f5.f1878d.setImportantForAccessibility(i);
    }
}
