package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u extends android.text.style.ClickableSpan {
    public final int a;
    public final defpackage.j0 b;
    public final int c;

    public u(int r1, defpackage.j0 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
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
            int r1 = r2.a
            r3.putInt(r0, r1)
            int r0 = r2.c
            j0 r1 = r2.b
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.a
            r1.performAction(r0, r3)
            return
    }
}
