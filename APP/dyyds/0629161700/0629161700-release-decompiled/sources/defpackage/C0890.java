package defpackage;

/* JADX INFO: renamed from: ᛵᛵᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0890 extends android.widget.ScrollView {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f4011;

    public C0890(android.app.Activity r3, int r4) {
            r2 = this;
            r0 = -588659912252974(0xfffde89def0961d2, double:NaN)
            r2.<init>(r3)
            r2.f4011 = r4
            return
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = r3.intValue()
            if (r0 <= 0) goto Lf
            goto L10
        Lf:
            r3 = 0
        L10:
            int r0 = r1.f4011
            if (r3 == 0) goto L19
            int r3 = r3.intValue()
            goto L1a
        L19:
            r3 = r0
        L1a:
            int r3 = java.lang.Math.min(r0, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            return
    }
}
