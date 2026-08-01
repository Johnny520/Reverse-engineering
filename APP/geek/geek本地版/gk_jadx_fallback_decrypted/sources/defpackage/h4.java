package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends android.widget.SeekBar {
    public final defpackage.i4 a;

    public h4(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969454(0x7f04036e, float:1.754759E38)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.r60.a(r1, r2)
            i4 r2 = new i4
            r2.<init>(r1)
            r1.a = r2
            r2.z(r3, r0)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            i4 r0 = r3.a
            h4 r1 = r0.e
            android.graphics.drawable.Drawable r0 = r0.f
            if (r0 == 0) goto L1e
            boolean r2 = r0.isStateful()
            if (r2 == 0) goto L1e
            int[] r2 = r1.getDrawableState()
            boolean r2 = r0.setState(r2)
            if (r2 == 0) goto L1e
            r1.invalidateDrawable(r0)
        L1e:
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            i4 r0 = r1.a
            android.graphics.drawable.Drawable r0 = r0.f
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
            i4 r0 = r1.a     // Catch: java.lang.Throwable -> Lb
            r0.N(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
