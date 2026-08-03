package p000a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0680l1 extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final C0699m1 f2532a;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0680l1(Context context, AttributeSet attributeSet) {
        int i = C0983R.attr.seekBarStyle;
        super(context, attributeSet, i);
        C0542df.m1311a(this, getContext());
        C0699m1 c0699m1 = new C0699m1(this);
        this.f2532a = c0699m1;
        c0699m1.mo1442a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0699m1 c0699m1 = this.f2532a;
        Drawable drawable = c0699m1.f2640e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0680l1 c0680l1 = c0699m1.f2639d;
        if (drawable.setState(c0680l1.getDrawableState())) {
            c0680l1.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2532a.f2640e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2532a.m1594d(canvas);
    }
}
