package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: i4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0322i4 extends C0138d4 {

    /* JADX INFO: renamed from: e */
    public final C0285h4 f2338e;

    /* JADX INFO: renamed from: f */
    public Drawable f2339f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2340g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f2341h;

    /* JADX INFO: renamed from: i */
    public boolean f2342i;

    /* JADX INFO: renamed from: j */
    public boolean f2343j;

    public C0322i4(C0285h4 c0285h4) {
        super(c0285h4);
        this.f2340g = null;
        this.f2341h = null;
        this.f2342i = false;
        this.f2343j = false;
        this.f2338e = c0285h4;
    }

    /* JADX INFO: renamed from: M */
    public final void m1391M() {
        Drawable drawable = this.f2339f;
        if (drawable != null) {
            if (this.f2342i || this.f2343j) {
                Drawable drawableMutate = drawable.mutate();
                this.f2339f = drawableMutate;
                if (this.f2342i) {
                    AbstractC0104ch.m688h(drawableMutate, this.f2340g);
                }
                if (this.f2343j) {
                    AbstractC0104ch.m689i(this.f2339f, this.f2341h);
                }
                if (this.f2339f.isStateful()) {
                    this.f2339f.setState(this.f2338e.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m1392N(Canvas canvas) {
        if (this.f2339f != null) {
            int max = this.f2338e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2339f.getIntrinsicWidth();
                int intrinsicHeight = this.f2339f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2339f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2339f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // p000.C0138d4
    /* JADX INFO: renamed from: z */
    public final void mo904z(AttributeSet attributeSet, int i) {
        super.mo904z(attributeSet, R.attr.seekBarStyle);
        C0285h4 c0285h4 = this.f2338e;
        Context context = c0285h4.getContext();
        int[] iArr = AbstractC0910xy.f5223g;
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        ja0.m1574k(c0285h4, c0285h4.getContext(), iArr, attributeSet, (TypedArray) c0659r5M2219y.f4209b, R.attr.seekBarStyle);
        Drawable drawableM2235n = c0659r5M2219y.m2235n(0);
        if (drawableM2235n != null) {
            c0285h4.setThumb(drawableM2235n);
        }
        Drawable drawableM2234m = c0659r5M2219y.m2234m(1);
        Drawable drawable = this.f2339f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2339f = drawableM2234m;
        if (drawableM2234m != null) {
            drawableM2234m.setCallback(c0285h4);
            AbstractC0151dh.m942b(drawableM2234m, t90.m2367d(c0285h4));
            if (drawableM2234m.isStateful()) {
                drawableM2234m.setState(c0285h4.getDrawableState());
            }
            m1391M();
        }
        c0285h4.invalidate();
        if (typedArray.hasValue(3)) {
            this.f2341h = AbstractC0187eh.m1028b(typedArray.getInt(3, -1), this.f2341h);
            this.f2343j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2340g = c0659r5M2219y.m2233l(2);
            this.f2342i = true;
        }
        c0659r5M2219y.m2245z();
        m1391M();
    }
}
