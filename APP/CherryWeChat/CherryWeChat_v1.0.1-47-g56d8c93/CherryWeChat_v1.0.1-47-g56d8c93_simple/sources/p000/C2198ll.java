package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: renamed from: ll */
/* JADX INFO: loaded from: classes.dex */
public final class C2198ll extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2241ml f7653a;

    public C2198ll(C2241ml r1) {
        this.f7653a = r1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r1, AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r1, r2);
        EditText r12 = this.f7653a.f7902h.getEditText();
        if (r12 == null) goto L6;
        r2.setLabeledBy(r12);
        return;
    }
}
