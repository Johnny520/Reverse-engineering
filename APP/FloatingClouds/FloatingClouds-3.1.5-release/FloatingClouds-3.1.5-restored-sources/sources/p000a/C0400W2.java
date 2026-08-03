package p000a;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: a.W2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0400W2 extends C0038C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CheckableImageButton f1527d;

    public C0400W2(CheckableImageButton checkableImageButton) {
        this.f1527d = checkableImageButton;
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: c */
    public final void mo114c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo114c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f1527d.f5799d);
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: d */
    public final void mo115d(View view, C0146I c0146i) {
        View.AccessibilityDelegate accessibilityDelegate = this.f137a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f1527d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f5800e);
        accessibilityNodeInfo.setChecked(checkableImageButton.f5799d);
    }
}
