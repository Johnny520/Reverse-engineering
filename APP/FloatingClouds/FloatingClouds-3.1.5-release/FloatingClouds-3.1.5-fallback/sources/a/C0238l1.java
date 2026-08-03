package a;

/* JADX INFO: renamed from: a.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0238l1 extends android.widget.SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0256m1 f553a;

    public C0238l1(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.seekBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            a.C0109df.a(r1, r2)
            a.m1 r2 = new a.m1
            r2.<init>(r1)
            r1.f553a = r2
            r2.a(r3, r0)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            a.m1 r0 = r3.f553a
            android.graphics.drawable.Drawable r1 = r0.e
            if (r1 == 0) goto L1e
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L1e
            a.l1 r0 = r0.d
            int[] r2 = r0.getDrawableState()
            boolean r2 = r1.setState(r2)
            if (r2 == 0) goto L1e
            r0.invalidateDrawable(r1)
        L1e:
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            a.m1 r0 = r1.f553a
            android.graphics.drawable.Drawable r0 = r0.e
            if (r0 == 0) goto Lc
            r0.jumpToCurrentState()
        Lc:
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            monitor-enter(r1)
            super.onDraw(r2)     // Catch: java.lang.Throwable -> Lb
            a.m1 r0 = r1.f553a     // Catch: java.lang.Throwable -> Lb
            r0.d(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
