package p000a;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.C0983R;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699m1 extends C0604h1 {

    /* JADX INFO: renamed from: d */
    public final C0680l1 f2639d;

    /* JADX INFO: renamed from: e */
    public Drawable f2640e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f2641f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f2642g;

    /* JADX INFO: renamed from: h */
    public boolean f2643h;

    /* JADX INFO: renamed from: i */
    public boolean f2644i;

    public C0699m1(C0680l1 c0680l1) {
        super(c0680l1);
        this.f2641f = null;
        this.f2642g = null;
        this.f2643h = false;
        this.f2644i = false;
        this.f2639d = c0680l1;
    }

    @Override // p000a.C0604h1
    /* JADX INFO: renamed from: a */
    public final void mo1442a(AttributeSet attributeSet, int i) {
        super.mo1442a(attributeSet, i);
        C0680l1 c0680l1 = this.f2639d;
        C0751of c0751ofM1768e = C0751of.m1768e(c0680l1.getContext(), attributeSet, C0983R.styleable.AppCompatSeekBar, i);
        C0866ug.m2002i(c0680l1, c0680l1.getContext(), C0983R.styleable.AppCompatSeekBar, attributeSet, c0751ofM1768e.f2960b, i);
        Drawable drawableM1771c = c0751ofM1768e.m1771c(C0983R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableM1771c != null) {
            c0680l1.setThumb(drawableM1771c);
        }
        Drawable drawableM1770b = c0751ofM1768e.m1770b(C0983R.styleable.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f2640e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2640e = drawableM1770b;
        if (drawableM1770b != null) {
            drawableM1770b.setCallback(c0680l1);
            C0893w5.b.m2179b(drawableM1770b, c0680l1.getLayoutDirection());
            if (drawableM1770b.isStateful()) {
                drawableM1770b.setState(c0680l1.getDrawableState());
            }
            m1593c();
        }
        c0680l1.invalidate();
        int i2 = C0983R.styleable.AppCompatSeekBar_tickMarkTintMode;
        TypedArray typedArray = c0751ofM1768e.f2960b;
        if (typedArray.hasValue(i2)) {
            this.f2642g = C0912x5.m2200c(typedArray.getInt(C0983R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f2642g);
            this.f2644i = true;
        }
        if (typedArray.hasValue(C0983R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f2641f = c0751ofM1768e.m1769a(C0983R.styleable.AppCompatSeekBar_tickMarkTint);
            this.f2643h = true;
        }
        c0751ofM1768e.m1773f();
        m1593c();
    }

    /* JADX INFO: renamed from: c */
    public final void m1593c() {
        Drawable drawable = this.f2640e;
        if (drawable != null) {
            if (this.f2643h || this.f2644i) {
                Drawable drawableMutate = drawable.mutate();
                this.f2640e = drawableMutate;
                if (this.f2643h) {
                    C0893w5.a.m2176h(drawableMutate, this.f2641f);
                }
                if (this.f2644i) {
                    C0893w5.a.m2177i(this.f2640e, this.f2642g);
                }
                if (this.f2640e.isStateful()) {
                    this.f2640e.setState(this.f2639d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1594d(Canvas canvas) {
        if (this.f2640e != null) {
            int max = this.f2639d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2640e.getIntrinsicWidth();
                int intrinsicHeight = this.f2640e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2640e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2640e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
