package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ha extends a.C {
    public final /* synthetic */ com.google.android.material.datepicker.c d;

    public Ha(com.google.android.material.datepicker.c r1) {
            r0 = this;
            r0.d = r1
            r0.<init>()
            return
    }

    @Override // a.C
    public final void d(android.view.View r2, a.I r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.f118a
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            com.google.android.material.datepicker.c r2 = r1.d
            android.view.View r0 = r2.i0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L20
            int r0 = com.google.android.material.R.string.mtrl_picker_toggle_to_year_selection
            android.content.Context r2 = r2.A()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r0)
            goto L2e
        L20:
            int r0 = com.google.android.material.R.string.mtrl_picker_toggle_to_day_selection
            android.content.Context r2 = r2.A()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r0)
        L2e:
            r3.setHintText(r2)
            return
    }
}
