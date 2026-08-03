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

    public C0820T3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1042YA.m1987a(getContext(), this);
        C0863U3 c0863u3 = new C0863U3(this);
        this.f2592a = c0863u3;
        c0863u3.mo1279J(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0863U3 c0863u3 = this.f2592a;
        C0820T3 c0820t3 = c0863u3.f2726e;
        Drawable drawable = c0863u3.f2727f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0820t3.getDrawableState())) {
            c0820t3.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2592a.f2727f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2592a.m1706W(canvas);
    }
}
