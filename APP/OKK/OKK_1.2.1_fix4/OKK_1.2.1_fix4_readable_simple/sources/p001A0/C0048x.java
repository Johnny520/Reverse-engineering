package p001A0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: renamed from: A0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0048x extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0049y f148a;

    public C0048x(C0049y r1) {
        this.f148a = r1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r1, AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r1, r2);
        EditText r12 = this.f148a.f158h.getEditText();
        if (r12 == null) goto L6;
        r2.setLabeledBy(r12);
        return;
    }
}
