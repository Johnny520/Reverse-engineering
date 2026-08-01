package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class yo extends View.AccessibilityDelegate {
    public final /* synthetic */ zo a;

    public yo(zo r1) {
        this.a = r1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r1, AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r1, r2);
        EditText r12 = this.a.h.getEditText();
        if (r12 == null) goto L6;
        r2.setLabeledBy(r12);
        return;
    }
}
