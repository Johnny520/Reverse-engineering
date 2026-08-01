package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends android.widget.SeekBar {

    /* JADX INFO: renamed from: ε */
    public final p000.C0675p5 f576;

    public AppCompatSeekBar(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968813(0x7f0400ed, float:1.754629E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public AppCompatSeekBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968813(0x7f0400ed, float:1.754629E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatSeekBar(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            p000.b42.m739(r0, r1)
            p5 r1 = new p5
            r1.<init>(r0)
            r0.f576 = r1
            r1.mo3966(r2, r3)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            p5 r2 = r2.f576
            androidx.appcompat.widget.AppCompatSeekBar r0 = r2.f8417
            android.graphics.drawable.Drawable r2 = r2.f8418
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
            p5 r0 = r0.f576
            android.graphics.drawable.Drawable r0 = r0.f8418
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
            p5 r0 = r1.f576     // Catch: java.lang.Throwable -> Lb
            r0.m4382(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
