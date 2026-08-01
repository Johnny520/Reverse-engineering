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
import p188.AbstractC7772;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
    public final void m529() {
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
    public final void mo530(AttributeSet attributeSet, int i) {
        super.mo530(attributeSet, R.attr.seekBarStyle);
        C0125 c0125 = this.f552;
        Context context = c0125.getContext();
        int[] iArr = AbstractC7772.f21106;
        C0108 c0108M353 = C0108.m353(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0108M353.f320;
        AbstractC2270.m4233(c0125, c0125.getContext(), iArr, attributeSet, (TypedArray) c0108M353.f320, R.attr.seekBarStyle);
        Drawable drawableM386 = c0108M353.m386(0);
        if (drawableM386 != null) {
            c0125.setThumb(drawableM386);
        }
        Drawable drawableM389 = c0108M353.m389(1);
        Drawable drawable = this.f551;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f551 = drawableM389;
        if (drawableM389 != null) {
            drawableM389.setCallback(c0125);
            drawableM389.setLayoutDirection(c0125.getLayoutDirection());
            if (drawableM389.isStateful()) {
                drawableM389.setState(c0125.getDrawableState());
            }
            m529();
        }
        c0125.invalidate();
        if (typedArray.hasValue(3)) {
            this.f553 = AbstractC0216.m721(typedArray.getInt(3, -1), this.f553);
            this.f556 = true;
        }
        if (typedArray.hasValue(2)) {
            this.f554 = c0108M353.m384(2);
            this.f555 = true;
        }
        c0108M353.m362();
        m529();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m531(Canvas canvas) {
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
