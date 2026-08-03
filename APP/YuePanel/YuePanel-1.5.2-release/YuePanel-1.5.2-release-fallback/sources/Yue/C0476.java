package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0476 extends android.widget.RatingBar {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.C0472 f1209;

    public C0476(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0476(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16742
            r1.<init>(r2, r3, r0)
            return
    }

    public C0476(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            Yue.C6173.m23109(r0, r1)
            Yue.ۥ۟ۡۢۦ r1 = new Yue.ۥ۟ۡۢۦ
            r1.<init>(r0)
            r0.f1209 = r1
            r1.mo1726(r2, r3)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L22
            Yue.ۥ۟ۡۢۦ r3 = r1.f1209     // Catch: java.lang.Throwable -> L22
            android.graphics.Bitmap r3 = r3.m1725()     // Catch: java.lang.Throwable -> L22
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
