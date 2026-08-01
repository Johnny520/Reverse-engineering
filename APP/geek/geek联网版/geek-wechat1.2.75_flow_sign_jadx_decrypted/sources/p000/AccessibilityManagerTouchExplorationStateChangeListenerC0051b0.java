package p000;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0051b0 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0001a0 f654a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0051b0(InterfaceC0001a0 interfaceC0001a0) {
        this.f654a = interfaceC0001a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0051b0) {
            return this.f654a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0051b0) obj).f654a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f654a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C0670rh c0670rh = (C0670rh) ((C0633qh) this.f654a).f3907a;
        AutoCompleteTextView autoCompleteTextView = c0670rh.f4133h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = c0670rh.f2231d;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2671s(checkableImageButton, i);
    }
}
