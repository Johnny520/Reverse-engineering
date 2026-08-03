package h3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h3.g f5053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5054i;

    public a(int r1, h3.g r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f5052g = r1
            r0.f5053h = r2
            r0.f5054i = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r2.f5052g
            r3.putInt(r0, r1)
            int r0 = r2.f5054i
            h3.g r1 = r2.f5053h
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.f5066a
            r1.performAction(r0, r3)
            return
    }
}
