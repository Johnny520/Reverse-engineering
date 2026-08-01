package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yo extends android.view.View.AccessibilityDelegate {
    public final /* synthetic */ defpackage.zo a;

    public yo(defpackage.zo r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View r1, android.view.accessibility.AccessibilityNodeInfo r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            zo r1 = r0.a
            com.google.android.material.textfield.TextInputLayout r1 = r1.h
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L10
            r2.setLabeledBy(r1)
        L10:
            return
    }
}
