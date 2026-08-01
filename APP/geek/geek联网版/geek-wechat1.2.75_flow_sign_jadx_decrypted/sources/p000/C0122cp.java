package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: renamed from: cp */
/* JADX INFO: loaded from: classes.dex */
public final class C0122cp extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0158dp f1235a;

    public C0122cp(C0158dp c0158dp) {
        this.f1235a = c0158dp;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f1235a.f1409h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
