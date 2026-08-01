package defpackage;

/* JADX INFO: renamed from: ᛶᲈᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1182 extends android.widget.SeekBar {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1585 f5370;

    public C1182(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 1711538817(0x66040281, float:1.5584964E23)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.AbstractC2218.m3609(r2, r1)
            ᛸᲇᛷᲇ r2 = new ᛸᲇᛷᲇ
            r2.<init>(r1)
            r1.f5370 = r2
            r2.mo1555(r3, r0)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            ᛸᲇᛷᲇ r2 = r2.f5370
            ᛶᲈᛴᛶ r0 = r2.f7013
            android.graphics.drawable.Drawable r2 = r2.f7012
            if (r2 == 0) goto L1e
            boolean r1 = r2.isStateful()
            if (r1 == 0) goto L1e
            int[] r1 = r0.getDrawableState()
            boolean r1 = r2.setState(r1)
            if (r1 == 0) goto L1e
            r0.invalidateDrawable(r2)
        L1e:
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r0 = this;
            super.jumpDrawablesToCurrentState()
            ᛸᲇᛷᲇ r0 = r0.f5370
            android.graphics.drawable.Drawable r0 = r0.f7012
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
            ᛸᲇᛷᲇ r0 = r1.f5370     // Catch: java.lang.Throwable -> Lb
            r0.m2866(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
