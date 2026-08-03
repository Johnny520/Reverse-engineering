package a;

/* JADX INFO: loaded from: classes.dex */
public final class Fa extends a.C {
    public final /* synthetic */ int d;

    public /* synthetic */ Fa(int r1) {
            r0 = this;
            r0.d = r1
            r0.<init>()
            return
    }

    @Override // a.C
    public final void d(android.view.View r3, a.I r4) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            android.view.View$AccessibilityDelegate r0 = r2.f36a
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.f118a
            r0.onInitializeAccessibilityNodeInfo(r3, r4)
            r3 = 0
            r4.setCollectionInfo(r3)
            return
        L11:
            android.view.View$AccessibilityDelegate r0 = r2.f36a
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.f118a
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            r3 = 0
            r4.i(r3)
            return
    }
}
