package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0285h4 extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final C0322i4 f2099a;

    public C0285h4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        x60.m2635a(this, getContext());
        C0322i4 c0322i4 = new C0322i4(this);
        this.f2099a = c0322i4;
        c0322i4.mo864z(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0322i4 c0322i4 = this.f2099a;
        C0285h4 c0285h4 = c0322i4.f2320e;
        Drawable drawable = c0322i4.f2321f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0285h4.getDrawableState())) {
            c0285h4.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2099a.f2321f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2099a.m1442N(canvas);
    }
}
