package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lh(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r4) {
        switch(this.a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((View) ((yb0) ((l0) this.b).b).z.getParent()).invalidate();
        return;
    L6:
        FrameLayout r0 = (FrameLayout) this.b;
        ip.o(u40.a("W2s=\n", "Mh80cBTZgFI=\n"), r4);
        Object r42 = r4.getAnimatedValue();
        ip.m(u40.a("gfIwzb4DTW+B6CiB/AUMYo70KIHqDwxvgOlxz+sMQCGb/izEvgtDdYPuMo/YDENgmw==\n", "74dcoZ5gLAE=\n"), r42);
        r0.setAlpha(((Float) r42).floatValue());
        return;
    L8:
        GradientDrawable r02 = (GradientDrawable) this.b;
        ip.o(u40.a("IAY=\n", "SXLmdnhOoq8=\n"), r4);
        Object r43 = r4.getAnimatedValue();
        ip.m(u40.a("pRJqVfO3EPqlCHIZsbFR96oUchmnu1H6pAkrV6a4HbS/HnZc878e4KcOaBeaugU=\n", "y2cGOdPUcZQ=\n"), r43);
        r02.setColor(((Integer) r43).intValue());
        return;
    L10:
        ph r03 = (ph) this.b;
        r03.getClass();
        float r44 = ((Float) r4.getAnimatedValue()).floatValue();
        r03.d.setAlpha(r44);
    }

    public /* synthetic */ lh(l0 r1, View r2) {
        this.a = 3;
        this.b = r1;
    }
}
