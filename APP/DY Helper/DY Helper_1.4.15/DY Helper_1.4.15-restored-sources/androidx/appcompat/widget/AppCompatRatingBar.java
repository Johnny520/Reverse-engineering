package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends android.widget.RatingBar {

    /* JADX INFO: renamed from: ε */
    public final p000.C0574n5 f575;

    public AppCompatRatingBar(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968803(0x7f0400e3, float:1.754627E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public AppCompatRatingBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968803(0x7f0400e3, float:1.754627E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatRatingBar(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.content.Context r2 = r1.getContext()
            p000.b42.m739(r1, r2)
            n5 r2 = new n5
            r0 = 0
            r2.<init>(r0, r1)
            r1.f575 = r2
            r2.mo3966(r3, r4)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L22
            n5 r3 = r1.f575     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r3.f7388     // Catch: java.lang.Throwable -> L22
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
