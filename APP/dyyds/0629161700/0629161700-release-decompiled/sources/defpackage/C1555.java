package defpackage;

/* JADX INFO: renamed from: ᛸᲀᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1555 extends android.widget.RatingBar {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f6888;

    public C1555(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 1711538788(0x66040264, float:1.5584912E23)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.AbstractC2218.m3609(r2, r1)
            ᛴᛵᲇᲇ r2 = new ᛴᛵᲇᲇ
            r2.<init>(r1)
            r1.f6888 = r2
            r2.mo1555(r3, r0)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L22
            ᛴᛵᲇᲇ r3 = r1.f6888     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r3.f3285     // Catch: java.lang.Throwable -> L22
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L24
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> L22
            int r0 = r1.getNumStars()     // Catch: java.lang.Throwable -> L22
            int r3 = r3 * r0
            r0 = 0
            int r2 = android.view.View.resolveSizeAndState(r3, r2, r0)     // Catch: java.lang.Throwable -> L22
            int r3 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L22
            r1.setMeasuredDimension(r2, r3)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r2 = move-exception
            goto L26
        L24:
            monitor-exit(r1)
            return
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r2
    }
}
