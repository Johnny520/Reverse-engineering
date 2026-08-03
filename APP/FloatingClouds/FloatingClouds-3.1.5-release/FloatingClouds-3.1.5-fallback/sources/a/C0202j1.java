package a;

/* JADX INFO: renamed from: a.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0202j1 extends android.widget.RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0167h1 f519a;

    public C0202j1(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.ratingBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            a.C0109df.a(r1, r2)
            a.h1 r2 = new a.h1
            r2.<init>(r1)
            r1.f519a = r2
            r2.a(r3, r0)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L20
            a.h1 r3 = r1.f519a     // Catch: java.lang.Throwable -> L20
            android.graphics.Bitmap r3 = r3.b     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> L20
            int r0 = r1.getNumStars()     // Catch: java.lang.Throwable -> L20
            int r3 = r3 * r0
            r0 = 0
            int r2 = android.view.View.resolveSizeAndState(r3, r2, r0)     // Catch: java.lang.Throwable -> L20
            int r3 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L20
            r1.setMeasuredDimension(r2, r3)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r2 = move-exception
            goto L24
        L22:
            monitor-exit(r1)
            return
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r2
    }
}
