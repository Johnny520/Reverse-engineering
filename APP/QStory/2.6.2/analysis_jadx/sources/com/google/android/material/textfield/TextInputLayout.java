package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0108;
import androidx.appcompat.app.RunnableC0062;
import androidx.appcompat.widget.AbstractC0216;
import androidx.appcompat.widget.C0130;
import androidx.appcompat.widget.C0225;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2242;
import androidx.core.widget.C2292;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.C2358;
import bsh.C2632;
import com.alibaba.fastjson2.C2941;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3054;
import com.google.android.material.internal.AbstractC3148;
import com.google.android.material.internal.AbstractC3159;
import com.google.android.material.internal.C3149;
import com.google.android.material.internal.C3163;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p033.AbstractC6325;
import p053.AbstractC6560;
import p128.AbstractC7478;
import p128.C7479;
import p152.AbstractC7589;
import p152.C7593;
import p162.AbstractC7652;
import p164.AbstractC7666;
import p175.AbstractC7738;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p268.AbstractC8266;
import p305.C8631;
import p305.C8636;
import p305.C8644;
import p305.C8647;
import p305.C8648;
import p305.C8649;
import p305.C8651;
import p305.InterfaceC8633;
import p310.C8662;
import p310.C8665;
import p314.AbstractC8669;
import p317.AbstractC8680;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final int[][] f10583 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f10584;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C8651 f10585;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ColorStateList f10586;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public ColorStateList f10587;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public CharSequence f10588;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10589;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ColorStateList f10590;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ColorStateList f10591;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10592;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ColorStateList f10593;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C7479 f10594;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C7479 f10595;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC3174 f10596;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10597;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f10598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10599;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3184 f10600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f10601;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C0225 f10602;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10603;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public CharSequence f10604;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10605;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10606;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0225 f10607;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public int f10608;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public int f10609;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public int f10610;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public ColorStateList f10611;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public int f10612;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public int f10613;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public boolean f10614;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public boolean f10615;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public boolean f10616;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public ColorStateList f10617;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public Drawable f10618;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public int f10619;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public int f10620;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public ColorStateList f10621;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public int f10622;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public boolean f10623;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final C3149 f10624;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public ValueAnimator f10625;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public boolean f10626;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public int f10627;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public boolean f10628;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EditText f10629;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f10630;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10631;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10632;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public CharSequence f10633;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10634;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3185 f10635;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3194 f10636;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final FrameLayout f10637;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int f10638;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int f10639;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f10640;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public int f10641;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final int f10642;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public boolean f10643;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final LinkedHashSet f10644;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public int f10645;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public int f10646;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public ColorDrawable f10647;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public Typeface f10648;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public ColorDrawable f10649;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final Rect f10650;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f10651;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final RectF f10652;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final Rect f10653;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f10654;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f10655;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public StateListDrawable f10656;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8651 f10657;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public C8651 f10658;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C8648 f10659;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f10660;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C8651 f10661;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3171();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public boolean f10662;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public CharSequence f10663;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10663 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10662 = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f10663) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f10663, parcel, i);
            parcel.writeInt(this.f10662 ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC8266.m13812(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout), attributeSet, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle);
        this.f10634 = -1;
        this.f10631 = -1;
        this.f10632 = -1;
        this.f10601 = -1;
        this.f10600 = new C3184(this);
        this.f10596 = new C2941(15);
        this.f10650 = new Rect();
        this.f10653 = new Rect();
        this.f10652 = new RectF();
        this.f10644 = new LinkedHashSet();
        C3149 c3149 = new C3149(this);
        this.f10624 = c3149;
        this.f10614 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f10637 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC8680.f24476;
        c3149.f10431 = linearInterpolator;
        c3149.m7184(false);
        c3149.f10432 = linearInterpolator;
        c3149.m7184(false);
        if (c3149.f10472 != 8388659) {
            c3149.f10472 = 8388659;
            c3149.m7184(false);
        }
        AbstractC3159.m7199(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout);
        int[] iArr = AbstractC8669.f24427;
        AbstractC3159.m7198(context2, attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout);
        C0108 c0108 = new C0108(context2, typedArrayObtainStyledAttributes);
        C3185 c3185 = new C3185(this, c0108);
        this.f10635 = c3185;
        this.f10589 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f10626 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f10623 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f10659 = C8648.m14303(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout).m14301();
        this.f10642 = context2.getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f10640 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f10630 = getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f10638 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f10654 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f10639 = this.f10638;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C8647 c8647M14305 = this.f10659.m14305();
        if (dimension >= 0.0f) {
            c8647M14305.f24264 = new C8636(dimension);
        }
        if (dimension2 >= 0.0f) {
            c8647M14305.f24263 = new C8636(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c8647M14305.f24270 = new C8636(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c8647M14305.f24269 = new C8636(dimension4);
        }
        this.f10659 = c8647M14305.m14301();
        ColorStateList colorStateListM13682 = AbstractC8189.m13682(context2, c0108, 7);
        if (colorStateListM13682 != null) {
            int defaultColor = colorStateListM13682.getDefaultColor();
            this.f10610 = defaultColor;
            this.f10651 = defaultColor;
            if (colorStateListM13682.isStateful()) {
                this.f10613 = colorStateListM13682.getColorForState(new int[]{-16842910}, -1);
                this.f10612 = colorStateListM13682.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f10608 = colorStateListM13682.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f10612 = this.f10610;
                ColorStateList colorStateListM12890 = AbstractC7652.m12890(context2, com.davemorrissey.labs.subscaleview.R.color.mtrl_filled_background_color);
                this.f10613 = colorStateListM12890.getColorForState(new int[]{-16842910}, -1);
                this.f10608 = colorStateListM12890.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f10651 = 0;
            this.f10610 = 0;
            this.f10613 = 0;
            this.f10612 = 0;
            this.f10608 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM384 = c0108.m384(1);
            this.f10621 = colorStateListM384;
            this.f10617 = colorStateListM384;
        }
        ColorStateList colorStateListM136822 = AbstractC8189.m13682(context2, c0108, 14);
        this.f10620 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f10622 = context2.getColor(com.davemorrissey.labs.subscaleview.R.color.mtrl_textinput_default_box_stroke_color);
        this.f10609 = context2.getColor(com.davemorrissey.labs.subscaleview.R.color.mtrl_textinput_disabled_color);
        this.f10619 = context2.getColor(com.davemorrissey.labs.subscaleview.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM136822 != null) {
            setBoxStrokeColorStateList(colorStateListM136822);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC8189.m13682(context2, c0108, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.f10587 = c0108.m384(24);
        this.f10586 = c0108.m384(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f10605 = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f10606 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f10606);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f10605);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0108.m384(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0108.m384(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(c0108.m384(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0108.m384(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0108.m384(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(c0108.m384(59));
        }
        C3194 c3194 = new C3194(this, c0108);
        this.f10636 = c3194;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        c0108.m362();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(c3185);
        frameLayout.addView(c3194);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f10629;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f10585;
        }
        EditText editText2 = this.f10629;
        int iM9876 = AbstractC4921.m9876(editText2.getContext(), AbstractC8174.m13603(editText2, com.davemorrissey.labs.subscaleview.R.attr.colorControlHighlight));
        int i = this.f10641;
        int[][] iArr = f10583;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C8651 c8651 = this.f10585;
            int i2 = this.f10651;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC4921.m9884(iM9876, 0.1f, i2), i2}), c8651, c8651);
        }
        Context context = getContext();
        C8651 c86512 = this.f10585;
        int iM98762 = AbstractC4921.m9876(context, AbstractC8174.m13595(context, "TextInputLayout", com.davemorrissey.labs.subscaleview.R.attr.colorSurface));
        C8651 c86513 = new C8651(c86512.m14330());
        int iM9884 = AbstractC4921.m9884(iM9876, 0.1f, iM98762);
        c86513.m14323(new ColorStateList(iArr, new int[]{iM9884, 0}));
        c86513.setTint(iM98762);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM9884, iM98762});
        C8651 c86514 = new C8651(c86512.m14330());
        c86514.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c86513, c86514), c86512});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f10656 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f10656 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f10656.addState(new int[0], m7226(false));
        }
        return this.f10656;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f10657 == null) {
            this.f10657 = m7226(true);
        }
        return this.f10657;
    }

    private void setEditText(EditText editText) {
        if (this.f10629 != null) {
            C5919.m11249("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f10629 = editText;
        int i = this.f10634;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f10632);
        }
        int i2 = this.f10631;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f10601);
        }
        this.f10660 = false;
        m7228();
        setTextInputAccessibilityDelegate(new C3175(this));
        Typeface typeface = this.f10629.getTypeface();
        C3149 c3149 = this.f10624;
        c3149.m7177(typeface);
        float textSize = this.f10629.getTextSize();
        if (c3149.f10471 != textSize) {
            c3149.f10471 = textSize;
            c3149.m7184(false);
        }
        float letterSpacing = this.f10629.getLetterSpacing();
        if (c3149.f10486 != letterSpacing) {
            c3149.f10486 = letterSpacing;
            c3149.m7184(false);
        }
        int gravity = this.f10629.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (c3149.f10472 != i3) {
            c3149.f10472 = i3;
            c3149.m7184(false);
        }
        if (c3149.f10453 != gravity) {
            c3149.f10453 = gravity;
            c3149.m7184(false);
        }
        this.f10627 = editText.getMinimumHeight();
        this.f10629.addTextChangedListener(new C3186(this, editText));
        if (this.f10617 == null) {
            this.f10617 = this.f10629.getHintTextColors();
        }
        if (this.f10589) {
            if (TextUtils.isEmpty(this.f10588)) {
                CharSequence hint = this.f10629.getHint();
                this.f10633 = hint;
                setHint(hint);
                this.f10629.setHint((CharSequence) null);
            }
            this.f10584 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m7223();
        }
        if (this.f10607 != null) {
            m7225(this.f10629.getText());
        }
        m7215();
        this.f10600.m7249();
        this.f10635.bringToFront();
        C3194 c3194 = this.f10636;
        c3194.bringToFront();
        Iterator it = this.f10644.iterator();
        while (it.hasNext()) {
            ((C3193) ((InterfaceC3173) it.next())).m7271(this);
        }
        c3194.m7278();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m7217(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f10588)) {
            return;
        }
        this.f10588 = charSequence;
        C3149 c3149 = this.f10624;
        if (charSequence == null || !TextUtils.equals(c3149.f10443, charSequence)) {
            c3149.f10443 = charSequence;
            c3149.f10442 = null;
            c3149.m7184(false);
        }
        if (this.f10628) {
            return;
        }
        m7229();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f10603 == z) {
            return;
        }
        C0225 c0225 = this.f10602;
        if (!z) {
            if (c0225 != null) {
                c0225.setVisibility(8);
            }
            this.f10602 = null;
        } else if (c0225 != null) {
            this.f10637.addView(c0225);
            this.f10602.setVisibility(0);
        }
        this.f10603 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m7206(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m7206((ViewGroup) childAt, z);
            }
        }
    }

    public void addOnEditTextAttachedListener(InterfaceC3173 interfaceC3173) {
        this.f10644.add(interfaceC3173);
        if (this.f10629 != null) {
            ((C3193) interfaceC3173).m7271(this);
        }
    }

    public void addOnEndIconChangedListener(InterfaceC3172 interfaceC3172) {
        this.f10636.addOnEndIconChangedListener(interfaceC3172);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f10637;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m7220();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f10629;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f10633 != null) {
            boolean z = this.f10584;
            this.f10584 = false;
            CharSequence hint = editText.getHint();
            this.f10629.setHint(this.f10633);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f10629.setHint(hint);
                this.f10584 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f10637;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f10629) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f10616 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10616 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C8651 c8651;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f10589;
        C3149 c3149 = this.f10624;
        if (z) {
            TextPaint textPaint = c3149.f10435;
            RectF rectF = c3149.f10454;
            int iSave = canvas2.save();
            if (c3149.f10442 != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c3149.f10450);
                float f = c3149.f10467;
                float f2 = c3149.f10468;
                float f3 = c3149.f10451;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((c3149.f10480 > 1 || c3149.f10479 > 1) && !c3149.f10441 && c3149.m7179()) {
                    float lineStart = c3149.f10467 - c3149.f10491.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c3149.f10482 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c3149.f10449;
                        float f6 = c3149.f10448;
                        float f7 = c3149.f10447;
                        int i2 = c3149.f10438;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC7666.m12944(i2, (textPaint.getAlpha() * Color.alpha(i2)) / Opcodes.CONST_METHOD_TYPE));
                    }
                    c3149.f10491.draw(canvas2);
                    textPaint.setAlpha((int) (c3149.f10489 * f4));
                    if (i >= 31) {
                        float f8 = c3149.f10449;
                        float f9 = c3149.f10448;
                        float f10 = c3149.f10447;
                        int i3 = c3149.f10438;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC7666.m12944(i3, (Color.alpha(i3) * textPaint.getAlpha()) / Opcodes.CONST_METHOD_TYPE));
                    }
                    int lineBaseline = c3149.f10491.getLineBaseline(0);
                    CharSequence charSequence = c3149.f10481;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c3149.f10449, c3149.f10448, c3149.f10447, c3149.f10438);
                    }
                    String strTrim = c3149.f10481.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = AbstractC0053.m160(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c3149.f10491.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    c3149.f10491.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f10658 == null || (c8651 = this.f10661) == null) {
            return;
        }
        c8651.draw(canvas2);
        if (this.f10629.isFocused()) {
            Rect bounds = this.f10658.getBounds();
            Rect bounds2 = this.f10661.getBounds();
            float f12 = c3149.f10457;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC8680.m14376(iCenterX, f12, bounds2.left);
            bounds.right = AbstractC8680.m14376(iCenterX, f12, bounds2.right);
            this.f10658.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f10615
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f10615 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            com.google.android.material.internal.飘花落叶言子楪世兰苏哲 r3 = r4.f10624
            if (r3 == 0) goto L2f
            r3.f10440 = r1
            android.content.res.ColorStateList r1 = r3.f10473
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f10476
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m7184(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f10629
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.m7217(r0, r2)
        L45:
            r4.m7215()
            r4.m7207()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.f10615 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f10629;
        if (editText == null) {
            return super.getBaseline();
        }
        return m7210() + getPaddingTop() + editText.getBaseline();
    }

    public C8651 getBoxBackground() {
        int i = this.f10641;
        if (i == 1 || i == 2) {
            return this.f10585;
        }
        C2632.m5296();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.f10651;
    }

    public int getBoxBackgroundMode() {
        return this.f10641;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f10640;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        C8648 c8648 = this.f10659;
        RectF rectF = this.f10652;
        return layoutDirection == 1 ? c8648.f24281.mo14294(rectF) : c8648.f24282.mo14294(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        C8648 c8648 = this.f10659;
        RectF rectF = this.f10652;
        return layoutDirection == 1 ? c8648.f24282.mo14294(rectF) : c8648.f24281.mo14294(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        C8648 c8648 = this.f10659;
        RectF rectF = this.f10652;
        return layoutDirection == 1 ? c8648.f24276.mo14294(rectF) : c8648.f24275.mo14294(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        C8648 c8648 = this.f10659;
        RectF rectF = this.f10652;
        return layoutDirection == 1 ? c8648.f24275.mo14294(rectF) : c8648.f24276.mo14294(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f10620;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10611;
    }

    public int getBoxStrokeWidth() {
        return this.f10638;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f10654;
    }

    public int getCounterMaxLength() {
        return this.f10598;
    }

    public CharSequence getCounterOverflowDescription() {
        C0225 c0225;
        if (this.f10599 && this.f10597 && (c0225 = this.f10607) != null) {
            return c0225.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10591;
    }

    public ColorStateList getCounterTextColor() {
        return this.f10590;
    }

    public ColorStateList getCursorColor() {
        return this.f10587;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f10586;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10617;
    }

    public EditText getEditText() {
        return this.f10629;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10636.f10772.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f10636.f10772.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f10636.f10757;
    }

    public int getEndIconMode() {
        return this.f10636.f10770;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f10636.f10756;
    }

    public CheckableImageButton getEndIconView() {
        return this.f10636.f10772;
    }

    public CharSequence getError() {
        C3184 c3184 = this.f10600;
        if (c3184.f10706) {
            return c3184.f10709;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f10600.f10698;
    }

    public CharSequence getErrorContentDescription() {
        return this.f10600.f10699;
    }

    public int getErrorCurrentTextColors() {
        C0225 c0225 = this.f10600.f10707;
        if (c0225 != null) {
            return c0225.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f10636.f10774.getDrawable();
    }

    public CharSequence getHelperText() {
        C3184 c3184 = this.f10600;
        if (c3184.f10701) {
            return c3184.f10700;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0225 c0225 = this.f10600.f10691;
        if (c0225 != null) {
            return c0225.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f10589) {
            return this.f10588;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f10624.m7172();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C3149 c3149 = this.f10624;
        return c3149.m7180(c3149.f10473);
    }

    public int getHintMaxLines() {
        return this.f10624.f10480;
    }

    public ColorStateList getHintTextColor() {
        return this.f10621;
    }

    public InterfaceC3174 getLengthCounter() {
        return this.f10596;
    }

    public int getMaxEms() {
        return this.f10631;
    }

    public int getMaxWidth() {
        return this.f10601;
    }

    public int getMinEms() {
        return this.f10634;
    }

    public int getMinWidth() {
        return this.f10632;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10636.f10772.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10636.f10772.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f10603) {
            return this.f10604;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f10592;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f10593;
    }

    public CharSequence getPrefixText() {
        return this.f10635.f10724;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10635.f10723.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f10635.f10723;
    }

    public C8648 getShapeAppearanceModel() {
        return this.f10659;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10635.f10718.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f10635.f10718.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f10635.f10722;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f10635.f10719;
    }

    public CharSequence getSuffixText() {
        return this.f10636.f10766;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10636.f10765.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f10636.f10765;
    }

    public Typeface getTypeface() {
        return this.f10648;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10624.m7183(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C3194 c3194 = this.f10636;
        c3194.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f10614 = false;
        if (this.f10629 != null && this.f10629.getMeasuredHeight() < (iMax = Math.max(c3194.getMeasuredHeight(), this.f10635.getMeasuredHeight()))) {
            this.f10629.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM7216 = m7216();
        if (z || zM7216) {
            this.f10629.post(new RunnableC1107(this, 7));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f10629;
        if (editText != null) {
            Rect rect = this.f10650;
            AbstractC3148.m7169(this, editText, rect);
            C8651 c8651 = this.f10661;
            if (c8651 != null) {
                int i6 = rect.bottom;
                c8651.setBounds(rect.left, i6 - this.f10638, rect.right, i6);
            }
            C8651 c86512 = this.f10658;
            if (c86512 != null) {
                int i7 = rect.bottom;
                c86512.setBounds(rect.left, i7 - this.f10654, rect.right, i7);
            }
            if (this.f10589) {
                float textSize = this.f10629.getTextSize();
                C3149 c3149 = this.f10624;
                float f = c3149.f10471;
                TextPaint textPaint = c3149.f10436;
                if (f != textSize) {
                    c3149.f10471 = textSize;
                    c3149.m7184(false);
                }
                int gravity = this.f10629.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c3149.f10472 != i8) {
                    c3149.f10472 = i8;
                    c3149.m7184(false);
                }
                if (c3149.f10453 != gravity) {
                    c3149.f10453 = gravity;
                    c3149.m7184(false);
                }
                Rect rectM7211 = m7211(rect);
                int i9 = rectM7211.left;
                int i10 = rectM7211.top;
                int i11 = rectM7211.right;
                int i12 = rectM7211.bottom;
                Rect rect2 = c3149.f10455;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    c3149.f10439 = true;
                }
                if (this.f10629 == null) {
                    C2632.m5296();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(c3149.f10471);
                    textPaint.setTypeface(c3149.f10464);
                    textPaint.setLetterSpacing(c3149.f10486);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(c3149.f10471);
                    textPaint.setTypeface(c3149.f10464);
                    textPaint.setLetterSpacing(c3149.f10486);
                    fDescent = c3149.f10474 * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f10629.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f10653;
                rect3.left = compoundPaddingLeft;
                if (this.f10641 != 1 || this.f10629.getMinLines() > 1) {
                    if (this.f10641 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(c3149.f10471);
                        textPaint.setTypeface(c3149.f10464);
                        textPaint.setLetterSpacing(c3149.f10486);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f10629.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f10629.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f10641 != 1 || this.f10629.getMinLines() > 1) ? rect.bottom - this.f10629.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = c3149.f10456;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != c3149.f10483) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    c3149.f10439 = true;
                    c3149.f10483 = true;
                }
                c3149.m7184(false);
                if (!m7227() || this.f10628) {
                    return;
                }
                m7229();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f10614;
        C3194 c3194 = this.f10636;
        if (!z) {
            c3194.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f10614 = true;
        }
        if (this.f10602 != null && (editText = this.f10629) != null) {
            this.f10602.setGravity(editText.getGravity());
            this.f10602.setPadding(this.f10629.getCompoundPaddingLeft(), this.f10629.getCompoundPaddingTop(), this.f10629.getCompoundPaddingRight(), this.f10629.getCompoundPaddingBottom());
        }
        c3194.m7278();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f10629.getMeasuredWidth() - this.f10629.getCompoundPaddingLeft()) - this.f10629.getCompoundPaddingRight();
        C3149 c3149 = this.f10624;
        TextPaint textPaint = c3149.f10436;
        textPaint.setTextSize(c3149.f10475);
        textPaint.setTypeface(c3149.f10460);
        textPaint.setLetterSpacing(c3149.f10487);
        float f2 = measuredWidth;
        c3149.f10484 = c3149.m7173(c3149.f10479, textPaint, c3149.f10443, (c3149.f10475 / c3149.f10471) * f2, c3149.f10441).getHeight();
        textPaint.setTextSize(c3149.f10471);
        textPaint.setTypeface(c3149.f10464);
        textPaint.setLetterSpacing(c3149.f10486);
        c3149.f10485 = c3149.m7173(c3149.f10480, textPaint, c3149.f10443, f2, c3149.f10441).getHeight();
        EditText editText2 = this.f10629;
        Rect rect = this.f10650;
        AbstractC3148.m7169(this, editText2, rect);
        Rect rectM7211 = m7211(rect);
        int i3 = rectM7211.left;
        int i4 = rectM7211.top;
        int i5 = rectM7211.right;
        int i6 = rectM7211.bottom;
        Rect rect2 = c3149.f10455;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            c3149.f10439 = true;
        }
        m7220();
        m7214();
        if (this.f10629 == null) {
            return;
        }
        int i7 = c3149.f10485;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = c3149.f10436;
            textPaint2.setTextSize(c3149.f10471);
            textPaint2.setTypeface(c3149.f10464);
            textPaint2.setLetterSpacing(c3149.f10486);
            f = -textPaint2.ascent();
        }
        float height = 0.0f;
        if (this.f10604 != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f10602.getPaint());
            textPaint3.setTextSize(this.f10602.getTextSize());
            textPaint3.setTypeface(this.f10602.getTypeface());
            textPaint3.setLetterSpacing(this.f10602.getLetterSpacing());
            try {
                C3163 c3163 = new C3163(this.f10604, textPaint3, measuredWidth);
                c3163.f10531 = getLayoutDirection() == 1;
                c3163.f10534 = true;
                float lineSpacingExtra = this.f10602.getLineSpacingExtra();
                float lineSpacingMultiplier = this.f10602.getLineSpacingMultiplier();
                c3163.f10530 = lineSpacingExtra;
                c3163.f10529 = lineSpacingMultiplier;
                c3163.f10528 = new C2358(this, 4);
                height = c3163.m7200().getHeight() + (this.f10641 == 1 ? c3149.m7172() + this.f10640 + this.f10630 : 0.0f);
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float fMax = Math.max(f, height);
        if (this.f10629.getMeasuredHeight() < fMax) {
            this.f10629.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6698);
        setError(savedState.f10663);
        if (savedState.f10662) {
            post(new RunnableC0062(this, 9));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f10643) {
            InterfaceC8633 interfaceC8633 = this.f10659.f24276;
            RectF rectF = this.f10652;
            float fMo14294 = interfaceC8633.mo14294(rectF);
            float fMo142942 = this.f10659.f24275.mo14294(rectF);
            float fMo142943 = this.f10659.f24281.mo14294(rectF);
            float fMo142944 = this.f10659.f24282.mo14294(rectF);
            C8648 c8648 = this.f10659;
            AbstractC6325 abstractC6325 = c8648.f24280;
            AbstractC6325 abstractC63252 = c8648.f24279;
            AbstractC6325 abstractC63253 = c8648.f24277;
            AbstractC6325 abstractC63254 = c8648.f24278;
            C8631 c8631 = new C8631(0);
            C8631 c86312 = new C8631(0);
            C8631 c86313 = new C8631(0);
            C8631 c86314 = new C8631(0);
            C8636 c8636 = new C8636(fMo142942);
            C8636 c86362 = new C8636(fMo14294);
            C8636 c86363 = new C8636(fMo142944);
            C8636 c86364 = new C8636(fMo142943);
            C8648 c86482 = new C8648();
            c86482.f24280 = abstractC63252;
            c86482.f24279 = abstractC6325;
            c86482.f24278 = abstractC63253;
            c86482.f24277 = abstractC63254;
            c86482.f24276 = c8636;
            c86482.f24275 = c86362;
            c86482.f24282 = c86364;
            c86482.f24281 = c86363;
            c86482.f24285 = c8631;
            c86482.f24286 = c86312;
            c86482.f24283 = c86313;
            c86482.f24284 = c86314;
            this.f10643 = z;
            setShapeAppearanceModel(c86482);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m7224()) {
            savedState.f10663 = getError();
        }
        C3194 c3194 = this.f10636;
        savedState.f10662 = c3194.f10770 != 0 && c3194.f10772.f10409;
        return savedState;
    }

    public void removeOnEditTextAttachedListener(InterfaceC3173 interfaceC3173) {
        this.f10644.remove(interfaceC3173);
    }

    public void removeOnEndIconChangedListener(InterfaceC3172 interfaceC3172) {
        this.f10636.removeOnEndIconChangedListener(interfaceC3172);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f10651 != i) {
            this.f10651 = i;
            this.f10610 = i;
            this.f10612 = i;
            this.f10608 = i;
            m7212();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f10610 = defaultColor;
        this.f10651 = defaultColor;
        this.f10613 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f10612 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f10608 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m7212();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f10641) {
            return;
        }
        this.f10641 = i;
        if (this.f10629 != null) {
            m7228();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f10640 = i;
    }

    public void setBoxCornerFamily(int i) {
        C8647 c8647M14305 = this.f10659.m14305();
        InterfaceC8633 interfaceC8633 = this.f10659.f24276;
        c8647M14305.f24268 = AbstractC6560.m12030(i);
        c8647M14305.f24264 = interfaceC8633;
        InterfaceC8633 interfaceC86332 = this.f10659.f24275;
        c8647M14305.f24267 = AbstractC6560.m12030(i);
        c8647M14305.f24263 = interfaceC86332;
        InterfaceC8633 interfaceC86333 = this.f10659.f24281;
        c8647M14305.f24265 = AbstractC6560.m12030(i);
        c8647M14305.f24269 = interfaceC86333;
        InterfaceC8633 interfaceC86334 = this.f10659.f24282;
        c8647M14305.f24266 = AbstractC6560.m12030(i);
        c8647M14305.f24270 = interfaceC86334;
        this.f10659 = c8647M14305.m14301();
        m7212();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f10620 != i) {
            this.f10620 = i;
            m7207();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f10622 = colorStateList.getDefaultColor();
            this.f10609 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10619 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f10620 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f10620 != colorStateList.getDefaultColor()) {
            this.f10620 = colorStateList.getDefaultColor();
        }
        m7207();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10611 != colorStateList) {
            this.f10611 = colorStateList;
            m7207();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f10638 = i;
        m7207();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f10654 = i;
        m7207();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f10599 != z) {
            C3184 c3184 = this.f10600;
            if (z) {
                C0225 c0225 = new C0225(getContext(), null);
                this.f10607 = c0225;
                c0225.setId(com.davemorrissey.labs.subscaleview.R.id.textinput_counter);
                Typeface typeface = this.f10648;
                if (typeface != null) {
                    this.f10607.setTypeface(typeface);
                }
                this.f10607.setMaxLines(1);
                c3184.m7250(this.f10607, 2);
                ((ViewGroup.MarginLayoutParams) this.f10607.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_textinput_counter_margin_start));
                m7222();
                if (this.f10607 != null) {
                    EditText editText = this.f10629;
                    m7225(editText != null ? editText.getText() : null);
                }
            } else {
                c3184.m7252(this.f10607, 2);
                this.f10607 = null;
            }
            this.f10599 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f10598 != i) {
            if (i > 0) {
                this.f10598 = i;
            } else {
                this.f10598 = -1;
            }
            if (!this.f10599 || this.f10607 == null) {
                return;
            }
            EditText editText = this.f10629;
            m7225(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f10606 != i) {
            this.f10606 = i;
            m7222();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10591 != colorStateList) {
            this.f10591 = colorStateList;
            m7222();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f10605 != i) {
            this.f10605 = i;
            m7222();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10590 != colorStateList) {
            this.f10590 = colorStateList;
            m7222();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f10587 != colorStateList) {
            this.f10587 = colorStateList;
            m7223();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f10586 != colorStateList) {
            this.f10586 = colorStateList;
            if (m7224() || (this.f10607 != null && this.f10597)) {
                m7223();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10617 = colorStateList;
        this.f10621 = colorStateList;
        if (this.f10629 != null) {
            m7217(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m7206(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f10636.f10772.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f10636.f10772.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C3194 c3194 = this.f10636;
        c3194.m7282(i != 0 ? c3194.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        C3194 c3194 = this.f10636;
        Drawable drawableM6607 = i != 0 ? AbstractC3054.m6607(c3194.getContext(), i) : null;
        TextInputLayout textInputLayout = c3194.f10775;
        CheckableImageButton checkableImageButton = c3194.f10772;
        checkableImageButton.setImageDrawable(drawableM6607);
        if (drawableM6607 != null) {
            AbstractC3054.m6597(textInputLayout, checkableImageButton, c3194.f10759, c3194.f10758);
            AbstractC3054.m6588(textInputLayout, checkableImageButton, c3194.f10759);
        }
    }

    public void setEndIconMinSize(int i) {
        C3194 c3194 = this.f10636;
        if (i < 0) {
            c3194.getClass();
            C5919.m11249("endIconSize cannot be less than 0");
        } else if (i != c3194.f10757) {
            c3194.f10757 = i;
            CheckableImageButton checkableImageButton = c3194.f10772;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c3194.f10774;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f10636.m7281(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10636.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10636.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C3194 c3194 = this.f10636;
        c3194.f10756 = scaleType;
        c3194.f10772.setScaleType(scaleType);
        c3194.f10774.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C3194 c3194 = this.f10636;
        if (c3194.f10759 != colorStateList) {
            c3194.f10759 = colorStateList;
            AbstractC3054.m6597(c3194.f10775, c3194.f10772, colorStateList, c3194.f10758);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C3194 c3194 = this.f10636;
        if (c3194.f10758 != mode) {
            c3194.f10758 = mode;
            AbstractC3054.m6597(c3194.f10775, c3194.f10772, c3194.f10759, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f10636.m7285(z);
    }

    public void setError(CharSequence charSequence) {
        C3184 c3184 = this.f10600;
        if (!c3184.f10706) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c3184.m7245();
            return;
        }
        c3184.m7248();
        c3184.f10709 = charSequence;
        c3184.f10707.setText(charSequence);
        int i = c3184.f10704;
        if (i != 1) {
            c3184.f10708 = 1;
        }
        c3184.m7253(i, c3184.f10708, c3184.m7251(c3184.f10707, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C3184 c3184 = this.f10600;
        c3184.f10698 = i;
        C0225 c0225 = c3184.f10707;
        if (c0225 != null) {
            c0225.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C3184 c3184 = this.f10600;
        c3184.f10699 = charSequence;
        C0225 c0225 = c3184.f10707;
        if (c0225 != null) {
            c0225.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C3184 c3184 = this.f10600;
        TextInputLayout textInputLayout = c3184.f10710;
        if (c3184.f10706 == z) {
            return;
        }
        c3184.m7248();
        if (z) {
            C0225 c0225 = new C0225(c3184.f10711, null);
            c3184.f10707 = c0225;
            c0225.setId(com.davemorrissey.labs.subscaleview.R.id.textinput_error);
            c3184.f10707.setTextAlignment(5);
            Typeface typeface = c3184.f10688;
            if (typeface != null) {
                c3184.f10707.setTypeface(typeface);
            }
            int i = c3184.f10702;
            c3184.f10702 = i;
            C0225 c02252 = c3184.f10707;
            if (c02252 != null) {
                c3184.f10710.m7221(c02252, i);
            }
            ColorStateList colorStateList = c3184.f10703;
            c3184.f10703 = colorStateList;
            C0225 c02253 = c3184.f10707;
            if (c02253 != null && colorStateList != null) {
                c02253.setTextColor(colorStateList);
            }
            CharSequence charSequence = c3184.f10699;
            c3184.f10699 = charSequence;
            C0225 c02254 = c3184.f10707;
            if (c02254 != null) {
                c02254.setContentDescription(charSequence);
            }
            int i2 = c3184.f10698;
            c3184.f10698 = i2;
            C0225 c02255 = c3184.f10707;
            if (c02255 != null) {
                c02255.setAccessibilityLiveRegion(i2);
            }
            c3184.f10707.setVisibility(4);
            c3184.m7250(c3184.f10707, 0);
        } else {
            c3184.m7245();
            c3184.m7252(c3184.f10707, 0);
            c3184.f10707 = null;
            textInputLayout.m7215();
            textInputLayout.m7207();
        }
        c3184.f10706 = z;
    }

    public void setErrorIconDrawable(int i) {
        C3194 c3194 = this.f10636;
        c3194.m7286(i != 0 ? AbstractC3054.m6607(c3194.getContext(), i) : null);
        AbstractC3054.m6588(c3194.f10775, c3194.f10774, c3194.f10768);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10636.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10636.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C3194 c3194 = this.f10636;
        if (c3194.f10768 != colorStateList) {
            c3194.f10768 = colorStateList;
            AbstractC3054.m6597(c3194.f10775, c3194.f10774, colorStateList, c3194.f10767);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C3194 c3194 = this.f10636;
        if (c3194.f10767 != mode) {
            c3194.f10767 = mode;
            AbstractC3054.m6597(c3194.f10775, c3194.f10774, c3194.f10768, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C3184 c3184 = this.f10600;
        c3184.f10702 = i;
        C0225 c0225 = c3184.f10707;
        if (c0225 != null) {
            c3184.f10710.m7221(c0225, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C3184 c3184 = this.f10600;
        c3184.f10703 = colorStateList;
        C0225 c0225 = c3184.f10707;
        if (c0225 == null || colorStateList == null) {
            return;
        }
        c0225.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f10623 != z) {
            this.f10623 = z;
            m7217(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C3184 c3184 = this.f10600;
        if (zIsEmpty) {
            if (c3184.f10701) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c3184.f10701) {
            setHelperTextEnabled(true);
        }
        c3184.m7248();
        c3184.f10700 = charSequence;
        c3184.f10691.setText(charSequence);
        int i = c3184.f10704;
        if (i != 2) {
            c3184.f10708 = 2;
        }
        c3184.m7253(i, c3184.f10708, c3184.m7251(c3184.f10691, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C3184 c3184 = this.f10600;
        c3184.f10689 = colorStateList;
        C0225 c0225 = c3184.f10691;
        if (c0225 == null || colorStateList == null) {
            return;
        }
        c0225.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C3184 c3184 = this.f10600;
        TextInputLayout textInputLayout = c3184.f10710;
        if (c3184.f10701 == z) {
            return;
        }
        c3184.m7248();
        if (z) {
            C0225 c0225 = new C0225(c3184.f10711, null);
            c3184.f10691 = c0225;
            c0225.setId(com.davemorrissey.labs.subscaleview.R.id.textinput_helper_text);
            c3184.f10691.setTextAlignment(5);
            Typeface typeface = c3184.f10688;
            if (typeface != null) {
                c3184.f10691.setTypeface(typeface);
            }
            c3184.f10691.setVisibility(4);
            c3184.f10691.setImportantForAccessibility(2);
            int i = c3184.f10690;
            c3184.f10690 = i;
            C0225 c02252 = c3184.f10691;
            if (c02252 != null) {
                c02252.setTextAppearance(i);
            }
            ColorStateList colorStateList = c3184.f10689;
            c3184.f10689 = colorStateList;
            C0225 c02253 = c3184.f10691;
            if (c02253 != null && colorStateList != null) {
                c02253.setTextColor(colorStateList);
            }
            c3184.m7250(c3184.f10691, 1);
        } else {
            c3184.m7248();
            int i2 = c3184.f10704;
            if (i2 == 2) {
                c3184.f10708 = 0;
            }
            c3184.m7253(i2, c3184.f10708, c3184.m7251(c3184.f10691, ""));
            c3184.m7252(c3184.f10691, 1);
            c3184.f10691 = null;
            textInputLayout.m7215();
            textInputLayout.m7207();
        }
        c3184.f10701 = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C3184 c3184 = this.f10600;
        c3184.f10690 = i;
        C0225 c0225 = c3184.f10691;
        if (c0225 != null) {
            c0225.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f10626 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f10589) {
            this.f10589 = z;
            if (z) {
                CharSequence hint = this.f10629.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10588)) {
                        setHint(hint);
                    }
                    this.f10629.setHint((CharSequence) null);
                }
                this.f10584 = true;
            } else {
                this.f10584 = false;
                if (!TextUtils.isEmpty(this.f10588) && TextUtils.isEmpty(this.f10629.getHint())) {
                    this.f10629.setHint(this.f10588);
                }
                setHintInternal(null);
            }
            if (this.f10629 != null) {
                m7220();
            }
        }
    }

    public void setHintMaxLines(int i) {
        C3149 c3149 = this.f10624;
        if (i != c3149.f10479) {
            c3149.f10479 = i;
            c3149.m7184(false);
        }
        if (i != c3149.f10480) {
            c3149.f10480 = i;
            c3149.m7184(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        C3149 c3149 = this.f10624;
        TextInputLayout textInputLayout = c3149.f10458;
        C8662 c8662 = new C8662(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c8662.f24398;
        if (colorStateList != null) {
            c3149.f10473 = colorStateList;
        }
        float f = c8662.f24399;
        if (f != 0.0f) {
            c3149.f10475 = f;
        }
        ColorStateList colorStateList2 = c8662.f24391;
        if (colorStateList2 != null) {
            c3149.f10430 = colorStateList2;
        }
        c3149.f10433 = c8662.f24386;
        c3149.f10429 = c8662.f24397;
        c3149.f10434 = c8662.f24396;
        c3149.f10487 = c8662.f24401;
        C8665 c8665 = c3149.f10445;
        if (c8665 != null) {
            c8665.f24408 = true;
        }
        C2242 c2242 = new C2242(c3149, 13);
        c8662.m14339();
        c3149.f10445 = new C8665(c2242, c8662.f24395);
        c8662.m14338(textInputLayout.getContext(), c3149.f10445);
        c3149.m7184(false);
        this.f10621 = c3149.f10473;
        if (this.f10629 != null) {
            m7217(false, false);
            m7220();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10621 != colorStateList) {
            if (this.f10617 == null) {
                C3149 c3149 = this.f10624;
                if (c3149.f10473 != colorStateList) {
                    c3149.f10473 = colorStateList;
                    c3149.m7184(false);
                }
            }
            this.f10621 = colorStateList;
            if (this.f10629 != null) {
                m7217(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC3174 interfaceC3174) {
        this.f10596 = interfaceC3174;
    }

    public void setMaxEms(int i) {
        this.f10631 = i;
        EditText editText = this.f10629;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f10601 = i;
        EditText editText = this.f10629;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f10634 = i;
        EditText editText = this.f10629;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f10632 = i;
        EditText editText = this.f10629;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C3194 c3194 = this.f10636;
        c3194.f10772.setContentDescription(i != 0 ? c3194.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C3194 c3194 = this.f10636;
        c3194.f10772.setImageDrawable(i != 0 ? AbstractC3054.m6607(c3194.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C3194 c3194 = this.f10636;
        if (z && c3194.f10770 != 1) {
            c3194.m7281(1);
        } else if (z) {
            c3194.getClass();
        } else {
            c3194.m7281(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C3194 c3194 = this.f10636;
        c3194.f10759 = colorStateList;
        AbstractC3054.m6597(c3194.f10775, c3194.f10772, colorStateList, c3194.f10758);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C3194 c3194 = this.f10636;
        c3194.f10758 = mode;
        AbstractC3054.m6597(c3194.f10775, c3194.f10772, c3194.f10759, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f10602 == null) {
            C0225 c0225 = new C0225(getContext(), null);
            this.f10602 = c0225;
            c0225.setId(com.davemorrissey.labs.subscaleview.R.id.textinput_placeholder);
            this.f10602.setImportantForAccessibility(1);
            this.f10602.setAccessibilityLiveRegion(1);
            C7479 c7479M7209 = m7209();
            this.f10595 = c7479M7209;
            c7479M7209.f20273 = 67L;
            this.f10594 = m7209();
            setPlaceholderTextAppearance(this.f10592);
            setPlaceholderTextColor(this.f10593);
            AbstractC2270.m4234(this.f10602, new C2292(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f10603) {
                setPlaceholderTextEnabled(true);
            }
            this.f10604 = charSequence;
        }
        EditText editText = this.f10629;
        m7218(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f10592 = i;
        C0225 c0225 = this.f10602;
        if (c0225 != null) {
            c0225.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f10593 != colorStateList) {
            this.f10593 = colorStateList;
            C0225 c0225 = this.f10602;
            if (c0225 == null || colorStateList == null) {
                return;
            }
            c0225.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C3185 c3185 = this.f10635;
        c3185.getClass();
        c3185.f10724 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c3185.f10723.setText(charSequence);
        c3185.m7254();
    }

    public void setPrefixTextAppearance(int i) {
        this.f10635.f10723.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f10635.f10723.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C8648 c8648) {
        C8651 c8651 = this.f10585;
        if (c8651 == null || c8651.m14330() == c8648) {
            return;
        }
        this.f10659 = c8648;
        m7212();
    }

    public void setStartIconCheckable(boolean z) {
        this.f10635.f10718.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC3054.m6607(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C3185 c3185 = this.f10635;
        if (i < 0) {
            c3185.getClass();
            C5919.m11249("startIconSize cannot be less than 0");
        } else if (i != c3185.f10722) {
            c3185.f10722 = i;
            CheckableImageButton checkableImageButton = c3185.f10718;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10635.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10635.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C3185 c3185 = this.f10635;
        c3185.f10719 = scaleType;
        c3185.f10718.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C3185 c3185 = this.f10635;
        if (c3185.f10717 != colorStateList) {
            c3185.f10717 = colorStateList;
            AbstractC3054.m6597(c3185.f10725, c3185.f10718, colorStateList, c3185.f10721);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C3185 c3185 = this.f10635;
        if (c3185.f10721 != mode) {
            c3185.f10721 = mode;
            AbstractC3054.m6597(c3185.f10725, c3185.f10718, c3185.f10717, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f10635.m7256(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C3194 c3194 = this.f10636;
        c3194.getClass();
        c3194.f10766 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c3194.f10765.setText(charSequence);
        c3194.m7280();
    }

    public void setSuffixTextAppearance(int i) {
        this.f10636.f10765.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f10636.f10765.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C3175 c3175) {
        EditText editText = this.f10629;
        if (editText != null) {
            AbstractC2270.m4234(editText, c3175);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10648) {
            this.f10648 = typeface;
            this.f10624.m7177(typeface);
            C3184 c3184 = this.f10600;
            if (typeface != c3184.f10688) {
                c3184.f10688 = typeface;
                C0225 c0225 = c3184.f10707;
                if (c0225 != null) {
                    c0225.setTypeface(typeface);
                }
                C0225 c02252 = c3184.f10691;
                if (c02252 != null) {
                    c02252.setTypeface(typeface);
                }
            }
            C0225 c02253 = this.f10607;
            if (c02253 != null) {
                c02253.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m7207() {
        C0225 c0225;
        EditText editText;
        EditText editText2;
        if (this.f10585 == null || this.f10641 == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.f10629) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.f10629) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f10655 = this.f10609;
        } else if (m7224()) {
            if (this.f10611 != null) {
                m7208(z, z2);
            } else {
                this.f10655 = getErrorCurrentTextColors();
            }
        } else if (!this.f10597 || (c0225 = this.f10607) == null) {
            if (z) {
                this.f10655 = this.f10620;
            } else if (z2) {
                this.f10655 = this.f10619;
            } else {
                this.f10655 = this.f10622;
            }
        } else if (this.f10611 != null) {
            m7208(z, z2);
        } else {
            this.f10655 = c0225.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m7223();
        }
        C3194 c3194 = this.f10636;
        TextInputLayout textInputLayout = c3194.f10775;
        CheckableImageButton checkableImageButton = c3194.f10772;
        TextInputLayout textInputLayout2 = c3194.f10775;
        c3194.m7279();
        AbstractC3054.m6588(textInputLayout2, c3194.f10774, c3194.f10768);
        AbstractC3054.m6588(textInputLayout2, checkableImageButton, c3194.f10759);
        if (c3194.m7276() instanceof C3198) {
            if (!textInputLayout.m7224() || checkableImageButton.getDrawable() == null) {
                AbstractC3054.m6597(textInputLayout, checkableImageButton, c3194.f10759, c3194.f10758);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C3185 c3185 = this.f10635;
        AbstractC3054.m6588(c3185.f10725, c3185.f10718, c3185.f10717);
        if (this.f10641 == 2) {
            int i = this.f10639;
            if (z && isEnabled()) {
                this.f10639 = this.f10654;
            } else {
                this.f10639 = this.f10638;
            }
            if (this.f10639 != i && m7227() && !this.f10628) {
                if (m7227()) {
                    ((C3195) this.f10585).m7287(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m7229();
            }
        }
        if (this.f10641 == 1) {
            if (!isEnabled()) {
                this.f10651 = this.f10613;
            } else if (z2 && !z) {
                this.f10651 = this.f10608;
            } else if (z) {
                this.f10651 = this.f10612;
            } else {
                this.f10651 = this.f10610;
            }
        }
        m7212();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f10629;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m7208(boolean z, boolean z2) {
        int defaultColor = this.f10611.getDefaultColor();
        int colorForState = this.f10611.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f10611.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f10655 = colorForState2;
        } else if (z2) {
            this.f10655 = colorForState;
        } else {
            this.f10655 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7479 m7209() {
        C7479 c7479 = new C7479();
        c7479.f20274 = AbstractC7738.m13024(getContext(), com.davemorrissey.labs.subscaleview.R.attr.motionDurationShort2, 87);
        c7479.f20268 = AbstractC7738.m13027(getContext(), com.davemorrissey.labs.subscaleview.R.attr.motionEasingLinearInterpolator, AbstractC8680.f24476);
        return c7479;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m7210() {
        if (this.f10589) {
            int i = this.f10641;
            C3149 c3149 = this.f10624;
            if (i == 0) {
                return (int) c3149.m7172();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (c3149.m7172() / 2.0f);
                }
                float fM7172 = c3149.m7172();
                TextPaint textPaint = c3149.f10436;
                textPaint.setTextSize(c3149.f10475);
                textPaint.setTypeface(c3149.f10460);
                textPaint.setLetterSpacing(c3149.f10487);
                return Math.max(0, (int) (fM7172 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect m7211(Rect rect) {
        if (this.f10629 == null) {
            C2632.m5296();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f10653;
        rect2.bottom = i;
        int i2 = this.f10641;
        if (i2 == 1) {
            rect2.left = m7230(rect.left, z);
            rect2.top = rect.top + this.f10640;
            rect2.right = m7231(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = m7230(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = m7231(rect.right, z);
            return rect2;
        }
        rect2.left = this.f10629.getPaddingLeft() + i3;
        rect2.top = rect.top - m7210();
        rect2.right = rect.right - this.f10629.getPaddingRight();
        return rect2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7212() {
        int i;
        int i2;
        C8651 c8651 = this.f10585;
        if (c8651 == null) {
            return;
        }
        C8648 c8648M14330 = c8651.m14330();
        C8648 c8648 = this.f10659;
        if (c8648M14330 != c8648) {
            this.f10585.setShapeAppearanceModel(c8648);
        }
        if (this.f10641 == 2 && (i = this.f10639) > -1 && (i2 = this.f10655) != 0) {
            C8651 c86512 = this.f10585;
            c86512.f24333.f24302 = i;
            c86512.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C8649 c8649 = c86512.f24333;
            if (c8649.f24289 != colorStateListValueOf) {
                c8649.f24289 = colorStateListValueOf;
                c86512.onStateChange(c86512.getState());
            }
        }
        int iM12946 = this.f10651;
        if (this.f10641 == 1) {
            Integer numM9893 = AbstractC4921.m9893(getContext(), com.davemorrissey.labs.subscaleview.R.attr.colorSurface);
            iM12946 = AbstractC7666.m12946(this.f10651, numM9893 != null ? numM9893.intValue() : 0);
        }
        this.f10651 = iM12946;
        this.f10585.m14323(ColorStateList.valueOf(iM12946));
        C8651 c86513 = this.f10661;
        if (c86513 != null && this.f10658 != null) {
            if (this.f10639 > -1 && this.f10655 != 0) {
                c86513.m14323(this.f10629.isFocused() ? ColorStateList.valueOf(this.f10622) : ColorStateList.valueOf(this.f10655));
                this.f10658.m14323(ColorStateList.valueOf(this.f10655));
            }
            invalidate();
        }
        m7219();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7213(float f) {
        C3149 c3149 = this.f10624;
        if (c3149.f10457 == f) {
            return;
        }
        int i = 0;
        if (this.f10625 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10625 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC7738.m13027(getContext(), com.davemorrissey.labs.subscaleview.R.attr.motionEasingEmphasizedInterpolator, AbstractC8680.f24475));
            this.f10625.setDuration(AbstractC7738.m13024(getContext(), com.davemorrissey.labs.subscaleview.R.attr.motionDurationMedium4, 167));
            this.f10625.addUpdateListener(new C3176(this, i));
        }
        this.f10625.setFloatValues(c3149.f10457, f);
        this.f10625.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7214() {
        if (this.f10629 == null || this.f10641 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f10629;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f10624.m7172() + this.f10630), this.f10629.getPaddingEnd(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f10629;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f10629.getPaddingEnd(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (AbstractC8189.m13674(getContext())) {
            EditText editText3 = this.f10629;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f10629.getPaddingEnd(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7215() {
        Drawable background;
        C0225 c0225;
        EditText editText = this.f10629;
        if (editText == null || this.f10641 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0216.f828;
        Drawable drawableMutate = background.mutate();
        if (m7224()) {
            drawableMutate.setColorFilter(C0130.m538(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f10597 && (c0225 = this.f10607) != null) {
            drawableMutate.setColorFilter(C0130.m538(c0225.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f10629.refreshDrawableState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m7216() {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m7216():boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7217(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C0225 c0225;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f10629;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f10629;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f10617;
        C3149 c3149 = this.f10624;
        if (colorStateList2 != null) {
            c3149.m7181(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f10617;
            int colorForState = this.f10609;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            c3149.m7181(ColorStateList.valueOf(colorForState));
        } else if (m7224()) {
            C0225 c02252 = this.f10600.f10707;
            c3149.m7181(c02252 != null ? c02252.getTextColors() : null);
        } else if (this.f10597 && (c0225 = this.f10607) != null) {
            c3149.m7181(c0225.getTextColors());
        } else if (z4 && (colorStateList = this.f10621) != null && c3149.f10473 != colorStateList) {
            c3149.f10473 = colorStateList;
            c3149.m7184(false);
        }
        C3194 c3194 = this.f10636;
        C3185 c3185 = this.f10635;
        if (z3 || !this.f10623 || (isEnabled() && z4)) {
            if (z2 || this.f10628) {
                ValueAnimator valueAnimator = this.f10625;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f10625.cancel();
                }
                if (z && this.f10626) {
                    m7213(1.0f);
                } else {
                    c3149.m7178(1.0f);
                }
                this.f10628 = false;
                if (m7227()) {
                    m7229();
                }
                EditText editText3 = this.f10629;
                m7218(editText3 != null ? editText3.getText() : null);
                c3185.f10716 = false;
                c3185.m7254();
                c3194.f10764 = false;
                c3194.m7280();
                return;
            }
            return;
        }
        if (z2 || !this.f10628) {
            ValueAnimator valueAnimator2 = this.f10625;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f10625.cancel();
            }
            if (z && this.f10626) {
                m7213(0.0f);
            } else {
                c3149.m7178(0.0f);
            }
            if (m7227() && !((C3195) this.f10585).f10777.f10778.isEmpty() && m7227()) {
                ((C3195) this.f10585).m7287(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f10628 = true;
            C0225 c02253 = this.f10602;
            if (c02253 != null && this.f10603) {
                c02253.setText((CharSequence) null);
                AbstractC7478.m12668(this.f10637, this.f10594);
                this.f10602.setVisibility(4);
            }
            c3185.f10716 = true;
            c3185.m7254();
            c3194.f10764 = true;
            c3194.m7280();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m7218(Editable editable) {
        ((C2941) this.f10596).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f10637;
        if (length != 0 || this.f10628) {
            C0225 c0225 = this.f10602;
            if (c0225 == null || !this.f10603) {
                return;
            }
            c0225.setText((CharSequence) null);
            AbstractC7478.m12668(frameLayout, this.f10594);
            this.f10602.setVisibility(4);
            return;
        }
        if (this.f10602 == null || !this.f10603 || TextUtils.isEmpty(this.f10604)) {
            return;
        }
        this.f10602.setText(this.f10604);
        AbstractC7478.m12668(frameLayout, this.f10595);
        this.f10602.setVisibility(0);
        this.f10602.bringToFront();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7219() {
        EditText editText = this.f10629;
        if (editText == null || this.f10585 == null) {
            return;
        }
        if ((this.f10660 || editText.getBackground() == null) && this.f10641 != 0) {
            this.f10629.setBackground(getEditTextBoxBackground());
            this.f10660 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7220() {
        if (this.f10641 != 1) {
            FrameLayout frameLayout = this.f10637;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM7210 = m7210();
            if (iM7210 != layoutParams.topMargin) {
                layoutParams.topMargin = iM7210;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7221(C0225 c0225, int i) {
        try {
            c0225.setTextAppearance(i);
            if (c0225.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0225.setTextAppearance(605225506);
        c0225.setTextColor(getContext().getColor(com.davemorrissey.labs.subscaleview.R.color.design_error));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7222() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0225 c0225 = this.f10607;
        if (c0225 != null) {
            m7221(c0225, this.f10597 ? this.f10606 : this.f10605);
            if (!this.f10597 && (colorStateList2 = this.f10590) != null) {
                this.f10607.setTextColor(colorStateList2);
            }
            if (!this.f10597 || (colorStateList = this.f10591) == null) {
                return;
            }
            this.f10607.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7223() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f10587
            if (r0 == 0) goto L5
            goto L2a
        L5:
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r2 = 604242203(0x2404011b, float:2.8623874E-17)
            android.util.TypedValue r1 = p251.AbstractC8174.m13597(r1, r2)
            r2 = 0
            if (r1 != 0) goto L19
        L17:
            r0 = r2
            goto L2a
        L19:
            int r3 = r1.resourceId
            if (r3 == 0) goto L22
            android.content.res.ColorStateList r0 = p162.AbstractC7652.m12890(r0, r3)
            goto L2a
        L22:
            int r0 = r1.data
            if (r0 == 0) goto L17
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L2a:
            android.widget.EditText r1 = r4.f10629
            if (r1 == 0) goto L55
            android.graphics.drawable.Drawable r1 = androidx.core.view.AbstractC2230.m4101(r1)
            if (r1 != 0) goto L35
            goto L55
        L35:
            android.widget.EditText r1 = r4.f10629
            android.graphics.drawable.Drawable r1 = androidx.core.view.AbstractC2230.m4101(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m7224()
            if (r2 != 0) goto L4d
            androidx.appcompat.widget.飘花落叶言子苏哲楪世兰 r2 = r4.f10607
            if (r2 == 0) goto L52
            boolean r2 = r4.f10597
            if (r2 == 0) goto L52
        L4d:
            android.content.res.ColorStateList r4 = r4.f10586
            if (r4 == 0) goto L52
            r0 = r4
        L52:
            r1.setTintList(r0)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m7223():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7224() {
        C3184 c3184 = this.f10600;
        return (c3184.f10708 != 1 || c3184.f10707 == null || TextUtils.isEmpty(c3184.f10709)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m7225(Editable editable) {
        ((C2941) this.f10596).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f10597;
        int i = this.f10598;
        if (i == -1) {
            this.f10607.setText(String.valueOf(length));
            this.f10607.setContentDescription(null);
            this.f10597 = false;
        } else {
            this.f10597 = length > i;
            Context context = getContext();
            this.f10607.setContentDescription(context.getString(this.f10597 ? com.davemorrissey.labs.subscaleview.R.string.character_counter_overflowed_content_description : com.davemorrissey.labs.subscaleview.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f10598)));
            if (z != this.f10597) {
                m7222();
            }
            String str = C7593.f20590;
            C7593 c7593 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C7593.f20587 : C7593.f20588;
            C0225 c0225 = this.f10607;
            String string = getContext().getString(com.davemorrissey.labs.subscaleview.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f10598));
            c7593.getClass();
            C0064 c0064 = AbstractC7589.f20581;
            c0225.setText(string != null ? c7593.m12794(string).toString() : null);
        }
        if (this.f10629 == null || z == this.f10597) {
            return;
        }
        m7217(false, false);
        m7207();
        m7215();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8651 m7226(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f10629;
        float popupElevation = editText instanceof C3187 ? ((C3187) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C8644 c8644 = new C8644();
        C8644 c86442 = new C8644();
        C8644 c86443 = new C8644();
        C8644 c86444 = new C8644();
        int i = 0;
        C8631 c8631 = new C8631(i);
        C8631 c86312 = new C8631(i);
        C8631 c86313 = new C8631(i);
        C8631 c86314 = new C8631(i);
        C8636 c8636 = new C8636(f);
        C8636 c86362 = new C8636(f);
        C8636 c86363 = new C8636(dimensionPixelOffset);
        C8636 c86364 = new C8636(dimensionPixelOffset);
        C8648 c8648 = new C8648();
        c8648.f24280 = c8644;
        c8648.f24279 = c86442;
        c8648.f24278 = c86443;
        c8648.f24277 = c86444;
        c8648.f24276 = c8636;
        c8648.f24275 = c86362;
        c8648.f24282 = c86364;
        c8648.f24281 = c86363;
        c8648.f24285 = c8631;
        c8648.f24286 = c86312;
        c8648.f24283 = c86313;
        c8648.f24284 = c86314;
        EditText editText2 = this.f10629;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C3187 ? ((C3187) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C8651.f24305;
            dropDownBackgroundTintList = ColorStateList.valueOf(AbstractC4921.m9876(context, AbstractC8174.m13595(context, C8651.class.getSimpleName(), com.davemorrissey.labs.subscaleview.R.attr.colorSurface)));
        }
        C8651 c8651 = new C8651();
        c8651.m14320(context);
        c8651.m14323(dropDownBackgroundTintList);
        c8651.m14322(popupElevation);
        c8651.setShapeAppearanceModel(c8648);
        C8649 c8649 = c8651.f24333;
        if (c8649.f24298 == null) {
            c8649.f24298 = new Rect();
        }
        c8651.f24333.f24298.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c8651.invalidateSelf();
        return c8651;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m7227() {
        return this.f10589 && !TextUtils.isEmpty(this.f10588) && (this.f10585 instanceof C3195);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7228() {
        int i = this.f10641;
        if (i == 0) {
            this.f10585 = null;
            this.f10661 = null;
            this.f10658 = null;
        } else if (i == 1) {
            this.f10585 = new C8651(this.f10659);
            this.f10661 = new C8651();
            this.f10658 = new C8651();
        } else {
            if (i != 2) {
                C5919.m11249(AbstractC0053.m147(new StringBuilder(), " is illegal; only @BoxBackgroundMode constants are supported.", this.f10641));
                return;
            }
            if (!this.f10589 || (this.f10585 instanceof C3195)) {
                this.f10585 = new C8651(this.f10659);
            } else {
                C8648 c8648 = this.f10659;
                int i2 = C3195.f10776;
                if (c8648 == null) {
                    c8648 = new C8648();
                }
                C3196 c3196 = new C3196(c8648, new RectF());
                C3195 c3195 = new C3195(c3196);
                c3195.f10777 = c3196;
                this.f10585 = c3195;
            }
            this.f10661 = null;
            this.f10658 = null;
        }
        m7219();
        m7207();
        if (this.f10641 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f10640 = getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC8189.m13674(getContext())) {
                this.f10640 = getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        m7214();
        if (this.f10641 != 0) {
            m7220();
        }
        EditText editText = this.f10629;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f10641;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7229() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m7229():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7230(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f10629.getCompoundPaddingLeft() : this.f10636.m7275() : this.f10635.m7259()) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m7231(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f10629.getCompoundPaddingRight() : this.f10635.m7259() : this.f10636.m7275());
    }

    public void setHint(CharSequence charSequence) {
        if (this.f10589) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f10635.m7258(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10635.m7257(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f10636.m7282(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10636.f10772.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10636.f10772.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10636.m7286(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        C3194 c3194 = this.f10636;
        TextInputLayout textInputLayout = c3194.f10775;
        CheckableImageButton checkableImageButton = c3194.f10772;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC3054.m6597(textInputLayout, checkableImageButton, c3194.f10759, c3194.f10758);
            AbstractC3054.m6588(textInputLayout, checkableImageButton, c3194.f10759);
        }
    }
}
