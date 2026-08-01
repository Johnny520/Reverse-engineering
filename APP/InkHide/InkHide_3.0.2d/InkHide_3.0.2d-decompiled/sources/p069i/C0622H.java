package p069i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p055lu.wxmask272.R;
import p004C.C0064h;
import p058d.AbstractC0515a;
import p087s.AbstractC0962a;
import p087s.AbstractC0963b;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0622H extends C0612C {

    /* JADX INFO: renamed from: e */
    public final C0620G f2154e;

    /* JADX INFO: renamed from: f */
    public Drawable f2155f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2156g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f2157h;

    /* JADX INFO: renamed from: i */
    public boolean f2158i;

    /* JADX INFO: renamed from: j */
    public boolean f2159j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0622H(C0620G c0620g) {
        super(c0620g);
        this.f2156g = null;
        this.f2157h = null;
        this.f2158i = false;
        this.f2159j = false;
        this.f2154e = c0620g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.C0612C
    /* JADX INFO: renamed from: b */
    public final void mo1213b(AttributeSet attributeSet, int i2) {
        super.mo1213b(attributeSet, R.attr.seekBarStyle);
        C0620G c0620g = this.f2154e;
        Context context = c0620g.getContext();
        int[] iArr = AbstractC0515a.f1643g;
        C0064h c0064hM114t = C0064h.m114t(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC1048L.m2289h(c0620g, c0620g.getContext(), iArr, attributeSet, (TypedArray) c0064hM114t.f309c, R.attr.seekBarStyle);
        Drawable drawableM124n = c0064hM114t.m124n(0);
        if (drawableM124n != null) {
            c0620g.setThumb(drawableM124n);
        }
        Drawable drawableM123m = c0064hM114t.m123m(1);
        Drawable drawable = this.f2155f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2155f = drawableM123m;
        if (drawableM123m != null) {
            drawableM123m.setCallback(c0620g);
            AbstractC0963b.m2146b(drawableM123m, c0620g.getLayoutDirection());
            if (drawableM123m.isStateful()) {
                drawableM123m.setState(c0620g.getDrawableState());
            }
            m1228f();
        }
        c0620g.invalidate();
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        if (typedArray.hasValue(3)) {
            this.f2157h = AbstractC0705p0.m1337b(typedArray.getInt(3, -1), this.f2157h);
            this.f2159j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2156g = c0064hM114t.m122l(2);
            this.f2158i = true;
        }
        c0064hM114t.m130v();
        m1228f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1228f() {
        Drawable drawable = this.f2155f;
        if (drawable != null) {
            if (this.f2158i || this.f2159j) {
                Drawable drawableMutate = drawable.mutate();
                this.f2155f = drawableMutate;
                if (this.f2158i) {
                    AbstractC0962a.m2143h(drawableMutate, this.f2156g);
                }
                if (this.f2159j) {
                    AbstractC0962a.m2144i(this.f2155f, this.f2157h);
                }
                if (this.f2155f.isStateful()) {
                    this.f2155f.setState(this.f2154e.getDrawableState());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1229g(Canvas canvas) {
        if (this.f2155f != null) {
            int max = this.f2154e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2155f.getIntrinsicWidth();
                int intrinsicHeight = this.f2155f.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2155f.setBounds(-i2, -i3, i2, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f2155f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
