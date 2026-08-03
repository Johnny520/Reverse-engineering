package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: T3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0820T3 extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final C0863U3 f2592a;

    public C0820T3(Context r2, AttributeSet r3) {
        super(r2, r3, R.attr.seekBarStyle);
        AbstractC1042YA.m1987a(getContext(), this);
        C0863U3 r22 = new C0863U3(this);
        this.f2592a = r22;
        r22.mo1279J(r3, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0863U3 r0 = this.f2592a;
        C0820T3 r1 = r0.f2726e;
        Drawable r02 = r0.f2727f;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.isStateful() == true) goto L7;
        return;
    L7:
        if (r02.setState(r1.getDrawableState()) == false) goto L12;
        r1.invalidateDrawable(r02);
        return;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r0 = this.f2592a.f2727f;
        if (r0 == null) goto L6;
        r0.jumpToCurrentState();
        return;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas r2) {
        monitor-enter(this);
        super.onDraw(r2);     // Catch: Throwable -> L6
        this.f2592a.m1706W(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
