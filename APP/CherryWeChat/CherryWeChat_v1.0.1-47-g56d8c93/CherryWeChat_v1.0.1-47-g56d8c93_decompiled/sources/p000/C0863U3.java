package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: U3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0863U3 extends C0649P3 {

    /* JADX INFO: renamed from: e */
    public final C0820T3 f2726e;

    /* JADX INFO: renamed from: f */
    public Drawable f2727f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2728g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f2729h;

    /* JADX INFO: renamed from: i */
    public boolean f2730i;

    /* JADX INFO: renamed from: j */
    public boolean f2731j;

    public C0863U3(C0820T3 c0820t3) {
        super(c0820t3);
        this.f2728g = null;
        this.f2729h = null;
        this.f2730i = false;
        this.f2731j = false;
        this.f2726e = c0820t3;
    }

    @Override // p000.C0649P3
    /* JADX INFO: renamed from: J */
    public final void mo1279J(AttributeSet attributeSet, int i) {
        super.mo1279J(attributeSet, R.attr.seekBarStyle);
        C0820T3 c0820t3 = this.f2726e;
        Context context = c0820t3.getContext();
        int[] iArr = AbstractC0982Wu.f3072g;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        AbstractC2185lE.m4398k(c0820t3, c0820t3.getContext(), iArr, attributeSet, (TypedArray) c2656w4M5186A.f9196b, R.attr.seekBarStyle);
        Drawable drawableM5211r = c2656w4M5186A.m5211r(0);
        if (drawableM5211r != null) {
            c0820t3.setThumb(drawableM5211r);
        }
        Drawable drawableM5210q = c2656w4M5186A.m5210q(1);
        Drawable drawable = this.f2727f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2727f = drawableM5210q;
        if (drawableM5210q != null) {
            drawableM5210q.setCallback(c0820t3);
            drawableM5210q.setLayoutDirection(c0820t3.getLayoutDirection());
            if (drawableM5210q.isStateful()) {
                drawableM5210q.setState(c0820t3.getDrawableState());
            }
            m1705V();
        }
        c0820t3.invalidate();
        if (typedArray.hasValue(3)) {
            this.f2729h = AbstractC0107Ce.m161c(typedArray.getInt(3, -1), this.f2729h);
            this.f2731j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2728g = c2656w4M5186A.m5209p(2);
            this.f2730i = true;
        }
        c2656w4M5186A.m5195E();
        m1705V();
    }

    /* JADX INFO: renamed from: V */
    public final void m1705V() {
        Drawable drawable = this.f2727f;
        if (drawable != null) {
            if (this.f2730i || this.f2731j) {
                Drawable drawableMutate = drawable.mutate();
                this.f2727f = drawableMutate;
                if (this.f2730i) {
                    drawableMutate.setTintList(this.f2728g);
                }
                if (this.f2731j) {
                    this.f2727f.setTintMode(this.f2729h);
                }
                if (this.f2727f.isStateful()) {
                    this.f2727f.setState(this.f2726e.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m1706W(Canvas canvas) {
        if (this.f2727f != null) {
            int max = this.f2726e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2727f.getIntrinsicWidth();
                int intrinsicHeight = this.f2727f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2727f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2727f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
