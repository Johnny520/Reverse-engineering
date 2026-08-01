package defpackage;

/* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1794 extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f7883;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2060 f7884;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f7885;

    public C1794(int r1, defpackage.C2060 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7885 = r1
            r0.f7884 = r2
            r0.f7883 = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r2.f7885
            r3.putInt(r0, r1)
            int r0 = r2.f7883
            ᲇᛶᛱᛱ r2 = r2.f7884
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f8857
            r2.performAction(r0, r3)
            return
    }
}
