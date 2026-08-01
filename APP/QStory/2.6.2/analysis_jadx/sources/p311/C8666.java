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
import com.google.android.material.internal.AbstractC3159;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p268.AbstractC8266;
import p314.AbstractC8669;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8666 extends C0132 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final int[][] f24411 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList f24412;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f24413;

    public C8666(Context context, AttributeSet attributeSet) {
        super(AbstractC8266.m13812(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.radioButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM7195 = AbstractC3159.m7195(context2, attributeSet, AbstractC8669.f24443, com.davemorrissey.labs.subscaleview.R.attr.radioButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM7195.hasValue(0)) {
            setButtonTintList(AbstractC8189.m13678(context2, typedArrayM7195, 0));
        }
        if (typedArrayM7195.hasValue(1)) {
            setRippleColor(AbstractC8189.m13678(context2, typedArrayM7195, 1));
        }
        this.f24413 = typedArrayM7195.getBoolean(2, false);
        typedArrayM7195.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24412 == null) {
            int iM9876 = AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, com.davemorrissey.labs.subscaleview.R.attr.colorControlActivated));
            int iM98762 = AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, com.davemorrissey.labs.subscaleview.R.attr.colorOnSurface));
            int iM98763 = AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, com.davemorrissey.labs.subscaleview.R.attr.colorSurface));
            this.f24412 = new ColorStateList(f24411, new int[]{AbstractC4921.m9884(iM98763, 1.0f, iM9876), AbstractC4921.m9884(iM98763, 0.54f, iM98762), AbstractC4921.m9884(iM98763, 0.38f, iM98762), AbstractC4921.m9884(iM98763, 0.38f, iM98762)});
        }
        return this.f24412;
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
        if (this.f24413 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f24413 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
