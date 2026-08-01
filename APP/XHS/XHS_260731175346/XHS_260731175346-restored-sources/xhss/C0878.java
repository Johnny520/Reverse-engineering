package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛷᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0878 extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f2834;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0755 f2835;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f2836;

    public C0878(int r1, xhss.C0755 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f2834 = r1
            r0.f2835 = r2
            r0.f2836 = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r2.f2834
            r3.putInt(r0, r1)
            int r0 = r2.f2836
            xhss.ᛸᛴᛸᛲ r2 = r2.f2835
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f2532
            r2.performAction(r0, r3)
            return
    }
}
