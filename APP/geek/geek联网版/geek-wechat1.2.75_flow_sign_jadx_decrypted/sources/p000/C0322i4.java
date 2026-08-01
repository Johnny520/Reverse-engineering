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
    public final C0285h4 f2320e;

    /* JADX INFO: renamed from: f */
    public Drawable f2321f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2322g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f2323h;

    /* JADX INFO: renamed from: i */
    public boolean f2324i;

    /* JADX INFO: renamed from: j */
    public boolean f2325j;

    public C0322i4(C0285h4 c0285h4) {
        super(c0285h4);
        this.f2322g = null;
        this.f2323h = null;
        this.f2324i = false;
        this.f2325j = false;
        this.f2320e = c0285h4;
    }

    /* JADX INFO: renamed from: M */
    public final void m1441M() {
        Drawable drawable = this.f2321f;
        if (drawable != null) {
            if (this.f2324i || this.f2325j) {
                Drawable drawableMutate = drawable.mutate();
                this.f2321f = drawableMutate;
                if (this.f2324i) {
                    AbstractC0187eh.m995h(drawableMutate, this.f2322g);
                }
                if (this.f2325j) {
                    AbstractC0187eh.m996i(this.f2321f, this.f2323h);
                }
                if (this.f2321f.isStateful()) {
                    this.f2321f.setState(this.f2320e.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m1442N(Canvas canvas) {
        if (this.f2321f != null) {
            int max = this.f2320e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2321f.getIntrinsicWidth();
                int intrinsicHeight = this.f2321f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2321f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2321f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // p000.C0138d4
    /* JADX INFO: renamed from: z */
    public final void mo864z(AttributeSet attributeSet, int i) {
        super.mo864z(attributeSet, R.attr.seekBarStyle);
        C0285h4 c0285h4 = this.f2320e;
        Context context = c0285h4.getContext();
        int[] iArr = AbstractC0205ez.f1683g;
        C0658r5 c0658r5M2226y = C0658r5.m2226y(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
        oa0.m2011k(c0285h4, c0285h4.getContext(), iArr, attributeSet, (TypedArray) c0658r5M2226y.f4064b, R.attr.seekBarStyle);
        Drawable drawableM2242n = c0658r5M2226y.m2242n(0);
        if (drawableM2242n != null) {
            c0285h4.setThumb(drawableM2242n);
        }
        Drawable drawableM2241m = c0658r5M2226y.m2241m(1);
        Drawable drawable = this.f2321f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2321f = drawableM2241m;
        if (drawableM2241m != null) {
            drawableM2241m.setCallback(c0285h4);
            AbstractC0224fh.m1101b(drawableM2241m, y90.m2732d(c0285h4));
            if (drawableM2241m.isStateful()) {
                drawableM2241m.setState(c0285h4.getDrawableState());
            }
            m1441M();
        }
        c0285h4.invalidate();
        if (typedArray.hasValue(3)) {
            this.f2323h = AbstractC0261gh.m1276b(typedArray.getInt(3, -1), this.f2323h);
            this.f2325j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2322g = c0658r5M2226y.m2240l(2);
            this.f2324i = true;
        }
        c0658r5M2226y.m2252z();
        m1441M();
    }
}
