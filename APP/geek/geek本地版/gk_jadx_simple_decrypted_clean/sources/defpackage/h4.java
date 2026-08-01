package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends SeekBar {
    public final i4 a;

    public h4(Context r2, AttributeSet r3) {
        super(r2, r3, R.attr.seekBarStyle);
        r60.a(this, getContext());
        i4 r22 = new i4(this);
        this.a = r22;
        r22.z(r3, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i4 r0 = this.a;
        h4 r1 = r0.e;
        Drawable r02 = r0.f;
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
        Drawable r0 = this.a.f;
        if (r0 == null) goto L6;
        r0.jumpToCurrentState();
        return;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas r2) {
        monitor-enter(this);
        super.onDraw(r2);     // Catch: Throwable -> L6
        this.a.N(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
