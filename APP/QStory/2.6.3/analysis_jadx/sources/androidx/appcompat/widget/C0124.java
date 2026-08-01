package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.app.C0108;
import androidx.core.view.AbstractC2270;
import com.davemorrissey.labs.subscaleview.R;
import p188.AbstractC7773;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0124 extends C0133 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Drawable f551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0125 f552;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public PorterDuff.Mode f553;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ColorStateList f554;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f555;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f556;

    public C0124(C0125 c0125) {
        super(c0125);
        this.f554 = null;
        this.f553 = null;
        this.f555 = false;
        this.f556 = false;
        this.f552 = c0125;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m530() {
        Drawable drawable = this.f551;
        if (drawable != null) {
            if (this.f555 || this.f556) {
                Drawable drawableMutate = drawable.mutate();
                this.f551 = drawableMutate;
                if (this.f555) {
                    drawableMutate.setTintList(this.f554);
                }
                if (this.f556) {
                    this.f551.setTintMode(this.f553);
                }
                if (this.f551.isStateful()) {
                    this.f551.setState(this.f552.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C0133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo531(AttributeSet attributeSet, int i) {
        super.mo531(attributeSet, R.attr.seekBarStyle);
        C0125 c0125 = this.f552;
        Context context = c0125.getContext();
        int[] iArr = AbstractC7773.f21103;
        C0108 c0108M354 = C0108.m354(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0108M354.f320;
        AbstractC2270.m4243(c0125, c0125.getContext(), iArr, attributeSet, (TypedArray) c0108M354.f320, R.attr.seekBarStyle);
        Drawable drawableM387 = c0108M354.m387(0);
        if (drawableM387 != null) {
            c0125.setThumb(drawableM387);
        }
        Drawable drawableM390 = c0108M354.m390(1);
        Drawable drawable = this.f551;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f551 = drawableM390;
        if (drawableM390 != null) {
            drawableM390.setCallback(c0125);
            drawableM390.setLayoutDirection(c0125.getLayoutDirection());
            if (drawableM390.isStateful()) {
                drawableM390.setState(c0125.getDrawableState());
            }
            m530();
        }
        c0125.invalidate();
        if (typedArray.hasValue(3)) {
            this.f553 = AbstractC0216.m722(typedArray.getInt(3, -1), this.f553);
            this.f556 = true;
        }
        if (typedArray.hasValue(2)) {
            this.f554 = c0108M354.m385(2);
            this.f555 = true;
        }
        c0108M354.m363();
        m530();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m532(Canvas canvas) {
        if (this.f551 != null) {
            int max = this.f552.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f551.getIntrinsicWidth();
                int intrinsicHeight = this.f551.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f551.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f551.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
