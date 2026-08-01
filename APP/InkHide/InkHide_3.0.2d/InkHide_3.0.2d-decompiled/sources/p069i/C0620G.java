package p069i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.p055lu.wxmask272.R;

/* JADX INFO: renamed from: i.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0620G extends SeekBar {

    /* JADX INFO: renamed from: b */
    public final C0622H f2153b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0620G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC0670d1.m1297a(this, getContext());
        C0622H c0622h = new C0622H(this);
        this.f2153b = c0622h;
        c0622h.mo1213b(attributeSet, R.attr.seekBarStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0622H c0622h = this.f2153b;
        Drawable drawable = c0622h.f2155f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0620G c0620g = c0622h.f2154e;
        if (drawable.setState(c0620g.getDrawableState())) {
            c0620g.invalidateDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2153b.f2155f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2153b.m1229g(canvas);
    }
}
