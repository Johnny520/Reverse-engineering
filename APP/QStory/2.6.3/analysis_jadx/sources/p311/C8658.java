package p311;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0132;
import com.google.android.material.internal.AbstractC3160;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p053.AbstractC6561;
import p175.AbstractC7739;
import p268.AbstractC8267;
import p314.AbstractC8661;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8658 extends C0132 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final int[][] f24402 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList f24403;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f24404;

    public C8658(Context context, AttributeSet attributeSet) {
        super(AbstractC8267.m13829(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.radioButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM7182 = AbstractC3160.m7182(context2, attributeSet, AbstractC8661.f24434, com.davemorrissey.labs.subscaleview.R.attr.radioButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM7182.hasValue(0)) {
            setButtonTintList(AbstractC7739.m13073(context2, typedArrayM7182, 0));
        }
        if (typedArrayM7182.hasValue(1)) {
            setRippleColor(AbstractC7739.m13073(context2, typedArrayM7182, 1));
        }
        this.f24404 = typedArrayM7182.getBoolean(2, false);
        typedArrayM7182.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24403 == null) {
            int iM10026 = AbstractC5062.m10026(getContext(), AbstractC6561.m12059(this, com.davemorrissey.labs.subscaleview.R.attr.colorControlActivated));
            int iM100262 = AbstractC5062.m10026(getContext(), AbstractC6561.m12059(this, com.davemorrissey.labs.subscaleview.R.attr.colorOnSurface));
            int iM100263 = AbstractC5062.m10026(getContext(), AbstractC6561.m12059(this, com.davemorrissey.labs.subscaleview.R.attr.colorSurface));
            this.f24403 = new ColorStateList(f24402, new int[]{AbstractC5062.m10024(iM100263, 1.0f, iM10026), AbstractC5062.m10024(iM100263, 0.54f, iM100262), AbstractC5062.m10024(iM100263, 0.38f, iM100262), AbstractC5062.m10024(iM100263, 0.38f, iM100262)});
        }
        return this.f24403;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24404 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f24404 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
