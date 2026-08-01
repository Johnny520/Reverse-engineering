package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.app.C0955;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import p204.AbstractC8602;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0971 extends C0980 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Drawable f896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0972 f897;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public PorterDuff.Mode f898;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ColorStateList f899;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f900;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f901;

    public C0971(C0972 c0972) {
        super(c0972);
        this.f899 = null;
        this.f898 = null;
        this.f900 = false;
        this.f901 = false;
        this.f897 = c0972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1090() {
        Drawable drawable = this.f896;
        if (drawable != null) {
            if (this.f900 || this.f901) {
                Drawable drawableMutate = drawable.mutate();
                this.f896 = drawableMutate;
                if (this.f900) {
                    drawableMutate.setTintList(this.f899);
                }
                if (this.f901) {
                    this.f896.setTintMode(this.f898);
                }
                if (this.f896.isStateful()) {
                    this.f896.setState(this.f897.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C0980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1091(AttributeSet attributeSet, int i) {
        super.mo1091(attributeSet, C0328R.attr.seekBarStyle);
        C0972 c0972 = this.f897;
        Context context = c0972.getContext();
        int[] iArr = AbstractC8602.f21448;
        C0955 c0955M914 = C0955.m914(C0328R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        AbstractC3103.m4803(c0972, c0972.getContext(), iArr, attributeSet, (TypedArray) c0955M914.f665, C0328R.attr.seekBarStyle);
        Drawable drawableM947 = c0955M914.m947(0);
        if (drawableM947 != null) {
            c0972.setThumb(drawableM947);
        }
        Drawable drawableM950 = c0955M914.m950(1);
        Drawable drawable = this.f896;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f896 = drawableM950;
        if (drawableM950 != null) {
            drawableM950.setCallback(c0972);
            drawableM950.setLayoutDirection(c0972.getLayoutDirection());
            if (drawableM950.isStateful()) {
                drawableM950.setState(c0972.getDrawableState());
            }
            m1090();
        }
        c0972.invalidate();
        if (typedArray.hasValue(3)) {
            this.f898 = AbstractC1063.m1282(typedArray.getInt(3, -1), this.f898);
            this.f901 = true;
        }
        if (typedArray.hasValue(2)) {
            this.f899 = c0955M914.m945(2);
            this.f900 = true;
        }
        c0955M914.m923();
        m1090();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1092(Canvas canvas) {
        if (this.f896 != null) {
            int max = this.f897.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f896.getIntrinsicWidth();
                int intrinsicHeight = this.f896.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f896.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f896.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
