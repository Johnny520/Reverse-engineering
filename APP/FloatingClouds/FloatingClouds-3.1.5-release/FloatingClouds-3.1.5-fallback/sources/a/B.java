package a;

/* JADX INFO: loaded from: classes.dex */
public final class B extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19a;
    public final a.I b;
    public final int c;

    public B(int r1, a.I r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f19a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r2.f19a
            r3.putInt(r0, r1)
            a.I r0 = r2.b
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f118a
            int r1 = r2.c
            r0.performAction(r1, r3)
            return
    }
}
