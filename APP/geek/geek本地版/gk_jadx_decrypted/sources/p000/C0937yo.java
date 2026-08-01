package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: renamed from: yo */
/* JADX INFO: loaded from: classes.dex */
public final class C0937yo extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0974zo f5378a;

    public C0937yo(C0974zo c0974zo) {
        this.f5378a = c0974zo;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f5378a.f5585h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
