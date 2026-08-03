package a;

/* JADX INFO: loaded from: classes.dex */
public final class W2 extends a.C {
    public final /* synthetic */ com.google.android.material.internal.CheckableImageButton d;

    public W2(com.google.android.material.internal.CheckableImageButton r1) {
            r0 = this;
            r0.d = r1
            r0.<init>()
            return
    }

    @Override // a.C
    public final void c(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.c(r1, r2)
            com.google.android.material.internal.CheckableImageButton r1 = r0.d
            boolean r1 = r1.d
            r2.setChecked(r1)
            return
    }

    @Override // a.C
    public final void d(android.view.View r2, a.I r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.f118a
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            com.google.android.material.internal.CheckableImageButton r2 = r1.d
            boolean r0 = r2.e
            r3.setCheckable(r0)
            boolean r2 = r2.d
            r3.setChecked(r2)
            return
    }
}
