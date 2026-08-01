package p000;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0051b0 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0001a0 f695a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0051b0(InterfaceC0001a0 interfaceC0001a0) {
        this.f695a = interfaceC0001a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0051b0) {
            return this.f695a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0051b0) obj).f695a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f695a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C0597ph c0597ph = (C0597ph) ((C0559oh) this.f695a).f3535a;
        AutoCompleteTextView autoCompleteTextView = c0597ph.f3894h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = c0597ph.f1972d;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2327s(checkableImageButton, i);
    }
}
