package p327;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0979;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p069.AbstractC7390;
import p191.AbstractC8568;
import p284.AbstractC9096;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9487 extends C0979 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final int[][] f24747 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList f24748;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f24749;

    public C9487(Context context, AttributeSet attributeSet) {
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.radioButtonStyle, C0328R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM7741 = AbstractC3992.m7741(context2, attributeSet, AbstractC9490.f24779, C0328R.attr.radioButtonStyle, C0328R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM7741.hasValue(0)) {
            setButtonTintList(AbstractC8568.m13632(context2, typedArrayM7741, 0));
        }
        if (typedArrayM7741.hasValue(1)) {
            setRippleColor(AbstractC8568.m13632(context2, typedArrayM7741, 1));
        }
        this.f24749 = typedArrayM7741.getBoolean(2, false);
        typedArrayM7741.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24748 == null) {
            int iM10585 = AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorControlActivated));
            int iM105852 = AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorOnSurface));
            int iM105853 = AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorSurface));
            this.f24748 = new ColorStateList(f24747, new int[]{AbstractC5894.m10583(iM105853, 1.0f, iM10585), AbstractC5894.m10583(iM105853, 0.54f, iM105852), AbstractC5894.m10583(iM105853, 0.38f, iM105852), AbstractC5894.m10583(iM105853, 0.38f, iM105852)});
        }
        return this.f24748;
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
        if (this.f24749 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f24749 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
