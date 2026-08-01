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
import bsh.C2633;
import com.alibaba.fastjson2.C2942;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3057;
import com.google.android.material.internal.AbstractC3149;
import com.google.android.material.internal.AbstractC3160;
import com.google.android.material.internal.C3150;
import com.google.android.material.internal.C3164;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import io.ktor.client.plugins.AbstractC3933;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p018.AbstractC6253;
import p034.AbstractC6344;
import p034.AbstractC6347;
import p053.AbstractC6561;
import p128.AbstractC7479;
import p128.C7480;
import p152.AbstractC7590;
import p152.C7594;
import p162.AbstractC7653;
import p164.AbstractC7667;
import p175.AbstractC7739;
import p268.AbstractC8267;
import p305.C8623;
import p305.C8628;
import p305.C8636;
import p305.C8639;
import p305.C8640;
import p305.C8641;
import p305.C8643;
import p305.InterfaceC8625;
import p310.C8654;
import p310.C8657;
import p314.AbstractC8661;
import p317.AbstractC8672;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final int[][] f10588 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f10589;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C8643 f10590;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ColorStateList f10591;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public ColorStateList f10592;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public CharSequence f10593;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10594;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ColorStateList f10595;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ColorStateList f10596;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10597;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ColorStateList f10598;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C7480 f10599;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C7480 f10600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC3175 f10601;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10602;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f10603;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10604;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3185 f10605;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f10606;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C0225 f10607;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10608;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public CharSequence f10609;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10610;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10611;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0225 f10612;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public int f10613;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public int f10614;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public int f10615;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public ColorStateList f10616;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public int f10617;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public int f10618;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public boolean f10619;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public boolean f10620;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public boolean f10621;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public ColorStateList f10622;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public Drawable f10623;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public int f10624;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public int f10625;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public ColorStateList f10626;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public int f10627;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public boolean f10628;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final C3150 f10629;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public ValueAnimator f10630;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public boolean f10631;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public int f10632;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public boolean f10633;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EditText f10634;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f10635;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10636;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10637;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public CharSequence f10638;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10639;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3186 f10640;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3195 f10641;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final FrameLayout f10642;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int f10643;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int f10644;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f10645;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public int f10646;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final int f10647;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public boolean f10648;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final LinkedHashSet f10649;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public int f10650;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public int f10651;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public ColorDrawable f10652;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public Typeface f10653;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public ColorDrawable f10654;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final Rect f10655;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f10656;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final RectF f10657;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final Rect f10658;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f10659;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f10660;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public StateListDrawable f10661;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8643 f10662;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public C8643 f10663;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C8640 f10664;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f10665;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C8643 f10666;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3172();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public boolean f10667;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public CharSequence f10668;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10668 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10667 = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f10668) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f10668, parcel, i);
            parcel.writeInt(this.f10667 ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC8267.m13829(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout), attributeSet, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle);
        this.f10639 = -1;
        this.f10636 = -1;
        this.f10637 = -1;
        this.f10606 = -1;
        this.f10605 = new C3185(this);
        this.f10601 = new C2942(15);
        this.f10655 = new Rect();
        this.f10658 = new Rect();
        this.f10657 = new RectF();
        this.f10649 = new LinkedHashSet();
        C3150 c3150 = new C3150(this);
        this.f10629 = c3150;
        this.f10619 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f10642 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC8672.f24468;
        c3150.f10436 = linearInterpolator;
        c3150.m7171(false);
        c3150.f10437 = linearInterpolator;
        c3150.m7171(false);
        if (c3150.f10477 != 8388659) {
            c3150.f10477 = 8388659;
            c3150.m7171(false);
        }
        AbstractC3160.m7186(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout);
        int[] iArr = AbstractC8661.f24418;
        AbstractC3160.m7185(context2, attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout);
        C0108 c0108 = new C0108(context2, typedArrayObtainStyledAttributes);
        C3186 c3186 = new C3186(this, c0108);
        this.f10640 = c3186;
        this.f10594 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f10631 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f10628 = typedArrayObtainStyledAttributes.getBoolean(42, true);
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
        this.f10664 = C8640.m14321(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.textInputStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_Design_TextInputLayout).m14319();
        this.f10647 = context2.getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f10645 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f10635 = getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f10643 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f10659 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f10644 = this.f10643;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C8639 c8639M14323 = this.f10664.m14323();
        if (dimension >= 0.0f) {
            c8639M14323.f24255 = new C8628(dimension);
        }
        if (dimension2 >= 0.0f) {
            c8639M14323.f24254 = new C8628(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c8639M14323.f24261 = new C8628(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c8639M14323.f24260 = new C8628(dimension4);
        }
        this.f10664 = c8639M14323.m14319();
        ColorStateList colorStateListM13072 = AbstractC7739.m13072(context2, c0108, 7);
        if (colorStateListM13072 != null) {
            int defaultColor = colorStateListM13072.getDefaultColor();
            this.f10615 = defaultColor;
            this.f10656 = defaultColor;
            if (colorStateListM13072.isStateful()) {
                this.f10618 = colorStateListM13072.getColorForState(new int[]{-16842910}, -1);
                this.f10617 = colorStateListM13072.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f10613 = colorStateListM13072.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f10617 = this.f10615;
                ColorStateList colorStateListM12919 = AbstractC7653.m12919(context2, com.davemorrissey.labs.subscaleview.R.color.mtrl_filled_background_color);
                this.f10618 = colorStateListM12919.getColorForState(new int[]{-16842910}, -1);
                this.f10613 = colorStateListM12919.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f10656 = 0;
            this.f10615 = 0;
            this.f10618 = 0;
            this.f10617 = 0;
            this.f10613 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM385 = c0108.m385(1);
            this.f10626 = colorStateListM385;
            this.f10622 = colorStateListM385;
        }
        ColorStateList colorStateListM130722 = AbstractC7739.m13072(context2, c0108, 14);
        this.f10625 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f10627 = context2.getColor(com.davemorrissey.labs.subscaleview.R.color.mtrl_textinput_default_box_stroke_color);
        this.f10614 = context2.getColor(com.davemorrissey.labs.subscaleview.R.color.mtrl_textinput_disabled_color);
        this.f10624 = context2.getColor(com.davemorrissey.labs.subscaleview.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM130722 != null) {
            setBoxStrokeColorStateList(colorStateListM130722);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC7739.m13072(context2, c0108, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.f10592 = c0108.m385(24);
        this.f10591 = c0108.m385(25);
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
        this.f10610 = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f10611 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f10611);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f10610);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0108.m385(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0108.m385(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(c0108.m385(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0108.m385(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0108.m385(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(c0108.m385(59));
        }
        C3195 c3195 = new C3195(this, c0108);
        this.f10641 = c3195;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        c0108.m363();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(c3186);
        frameLayout.addView(c3195);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f10634;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f10590;
        }
        EditText editText2 = this.f10634;
        int iM10026 = AbstractC5062.m10026(editText2.getContext(), AbstractC6561.m12059(editText2, com.davemorrissey.labs.subscaleview.R.attr.colorControlHighlight));
        int i = this.f10646;
        int[][] iArr = f10588;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C8643 c8643 = this.f10590;
            int i2 = this.f10656;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC5062.m10024(iM10026, 0.1f, i2), i2}), c8643, c8643);
        }
        Context context = getContext();
        C8643 c86432 = this.f10590;
        int iM100262 = AbstractC5062.m10026(context, AbstractC6561.m12067(context, "TextInputLayout", com.davemorrissey.labs.subscaleview.R.attr.colorSurface));
        C8643 c86433 = new C8643(c86432.m14348());
        int iM10024 = AbstractC5062.m10024(iM10026, 0.1f, iM100262);
        c86433.m14341(new ColorStateList(iArr, new int[]{iM10024, 0}));
        c86433.setTint(iM100262);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM10024, iM100262});
        C8643 c86434 = new C8643(c86432.m14348());
        c86434.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c86433, c86434), c86432});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f10661 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f10661 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f10661.addState(new int[0], m7213(false));
        }
        return this.f10661;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f10662 == null) {
            this.f10662 = m7213(true);
        }
        return this.f10662;
    }

    private void setEditText(EditText editText) {
        if (this.f10634 != null) {
            C5925.m11310("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f10634 = editText;
        int i = this.f10639;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f10637);
        }
        int i2 = this.f10636;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f10606);
        }
        this.f10665 = false;
        m7215();
        setTextInputAccessibilityDelegate(new C3176(this));
        Typeface typeface = this.f10634.getTypeface();
        C3150 c3150 = this.f10629;
        c3150.m7164(typeface);
        float textSize = this.f10634.getTextSize();
        if (c3150.f10476 != textSize) {
            c3150.f10476 = textSize;
            c3150.m7171(false);
        }
        float letterSpacing = this.f10634.getLetterSpacing();
        if (c3150.f10491 != letterSpacing) {
            c3150.f10491 = letterSpacing;
            c3150.m7171(false);
        }
        int gravity = this.f10634.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (c3150.f10477 != i3) {
            c3150.f10477 = i3;
            c3150.m7171(false);
        }
        if (c3150.f10458 != gravity) {
            c3150.f10458 = gravity;
            c3150.m7171(false);
        }
        this.f10632 = editText.getMinimumHeight();
        this.f10634.addTextChangedListener(new C3187(this, editText));
        if (this.f10622 == null) {
            this.f10622 = this.f10634.getHintTextColors();
        }
        if (this.f10594) {
            if (TextUtils.isEmpty(this.f10593)) {
                CharSequence hint = this.f10634.getHint();
                this.f10638 = hint;
                setHint(hint);
                this.f10634.setHint((CharSequence) null);
            }
            this.f10589 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m7210();
        }
        if (this.f10612 != null) {
            m7212(this.f10634.getText());
        }
        m7202();
        this.f10605.m7236();
        this.f10640.bringToFront();
        C3195 c3195 = this.f10641;
        c3195.bringToFront();
        Iterator it = this.f10649.iterator();
        while (it.hasNext()) {
            ((C3194) ((InterfaceC3174) it.next())).m7258(this);
        }
        c3195.m7265();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m7204(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f10593)) {
            return;
        }
        this.f10593 = charSequence;
        C3150 c3150 = this.f10629;
        if (charSequence == null || !TextUtils.equals(c3150.f10448, charSequence)) {
            c3150.f10448 = charSequence;
            c3150.f10447 = null;
            c3150.m7171(false);
        }
        if (this.f10633) {
            return;
        }
        m7216();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f10608 == z) {
            return;
        }
        C0225 c0225 = this.f10607;
        if (!z) {
            if (c0225 != null) {
                c0225.setVisibility(8);
            }
            this.f10607 = null;
        } else if (c0225 != null) {
            this.f10642.addView(c0225);
            this.f10607.setVisibility(0);
        }
        this.f10608 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m7193(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m7193((ViewGroup) childAt, z);
            }
        }
    }

    public void addOnEditTextAttachedListener(InterfaceC3174 interfaceC3174) {
        this.f10649.add(interfaceC3174);
        if (this.f10634 != null) {
            ((C3194) interfaceC3174).m7258(this);
        }
    }

    public void addOnEndIconChangedListener(InterfaceC3173 interfaceC3173) {
        this.f10641.addOnEndIconChangedListener(interfaceC3173);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f10642;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m7207();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f10634;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f10638 != null) {
            boolean z = this.f10589;
            this.f10589 = false;
            CharSequence hint = editText.getHint();
            this.f10634.setHint(this.f10638);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f10634.setHint(hint);
                this.f10589 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f10642;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f10634) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f10621 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10621 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C8643 c8643;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f10594;
        C3150 c3150 = this.f10629;
        if (z) {
            TextPaint textPaint = c3150.f10440;
            RectF rectF = c3150.f10459;
            int iSave = canvas2.save();
            if (c3150.f10447 != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c3150.f10455);
                float f = c3150.f10472;
                float f2 = c3150.f10473;
                float f3 = c3150.f10456;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((c3150.f10485 > 1 || c3150.f10484 > 1) && !c3150.f10446 && c3150.m7166()) {
                    float lineStart = c3150.f10472 - c3150.f10496.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c3150.f10487 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c3150.f10454;
                        float f6 = c3150.f10453;
                        float f7 = c3150.f10452;
                        int i2 = c3150.f10443;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC7667.m12973(i2, (textPaint.getAlpha() * Color.alpha(i2)) / Opcodes.CONST_METHOD_TYPE));
                    }
                    c3150.f10496.draw(canvas2);
                    textPaint.setAlpha((int) (c3150.f10494 * f4));
                    if (i >= 31) {
                        float f8 = c3150.f10454;
                        float f9 = c3150.f10453;
                        float f10 = c3150.f10452;
                        int i3 = c3150.f10443;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC7667.m12973(i3, (Color.alpha(i3) * textPaint.getAlpha()) / Opcodes.CONST_METHOD_TYPE));
                    }
                    int lineBaseline = c3150.f10496.getLineBaseline(0);
                    CharSequence charSequence = c3150.f10486;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c3150.f10454, c3150.f10453, c3150.f10452, c3150.f10443);
                    }
                    String strTrim = c3150.f10486.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = AbstractC0053.m161(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c3150.f10496.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    c3150.f10496.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f10663 == null || (c8643 = this.f10666) == null) {
            return;
        }
        c8643.draw(canvas2);
        if (this.f10634.isFocused()) {
            Rect bounds = this.f10663.getBounds();
            Rect bounds2 = this.f10666.getBounds();
            float f12 = c3150.f10462;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC8672.m14396(iCenterX, f12, bounds2.left);
            bounds.right = AbstractC8672.m14396(iCenterX, f12, bounds2.right);
            this.f10663.draw(canvas2);
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
            boolean r0 = r4.f10620
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f10620 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            com.google.android.material.internal.飘花落叶言子楪世兰苏哲 r3 = r4.f10629
            if (r3 == 0) goto L2f
            r3.f10445 = r1
            android.content.res.ColorStateList r1 = r3.f10478
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f10481
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m7171(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f10634
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.m7204(r0, r2)
        L45:
            r4.m7202()
            r4.m7194()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.f10620 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f10634;
        if (editText == null) {
            return super.getBaseline();
        }
        return m7197() + getPaddingTop() + editText.getBaseline();
    }

    public C8643 getBoxBackground() {
        int i = this.f10646;
        if (i == 1 || i == 2) {
            return this.f10590;
        }
        C2633.m5341();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.f10656;
    }

    public int getBoxBackgroundMode() {
        return this.f10646;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f10645;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        C8640 c8640 = this.f10664;
        RectF rectF = this.f10657;
        return layoutDirection == 1 ? c8640.f24272.mo14312(rectF) : c8640.f24273.mo14312(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        C8640 c8640 = this.f10664;
        RectF rectF = this.f10657;
        return layoutDirection == 1 ? c8640.f24273.mo14312(rectF) : c8640.f24272.mo14312(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        C8640 c8640 = this.f10664;
        RectF rectF = this.f10657;
        return layoutDirection == 1 ? c8640.f24267.mo14312(rectF) : c8640.f24266.mo14312(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        C8640 c8640 = this.f10664;
        RectF rectF = this.f10657;
        return layoutDirection == 1 ? c8640.f24266.mo14312(rectF) : c8640.f24267.mo14312(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f10625;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10616;
    }

    public int getBoxStrokeWidth() {
        return this.f10643;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f10659;
    }

    public int getCounterMaxLength() {
        return this.f10603;
    }

    public CharSequence getCounterOverflowDescription() {
        C0225 c0225;
        if (this.f10604 && this.f10602 && (c0225 = this.f10612) != null) {
            return c0225.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10596;
    }

    public ColorStateList getCounterTextColor() {
        return this.f10595;
    }

    public ColorStateList getCursorColor() {
        return this.f10592;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f10591;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10622;
    }

    public EditText getEditText() {
        return this.f10634;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10641.f10777.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f10641.f10777.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f10641.f10762;
    }

    public int getEndIconMode() {
        return this.f10641.f10775;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f10641.f10761;
    }

    public CheckableImageButton getEndIconView() {
        return this.f10641.f10777;
    }

    public CharSequence getError() {
        C3185 c3185 = this.f10605;
        if (c3185.f10711) {
            return c3185.f10714;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f10605.f10703;
    }

    public CharSequence getErrorContentDescription() {
        return this.f10605.f10704;
    }

    public int getErrorCurrentTextColors() {
        C0225 c0225 = this.f10605.f10712;
        if (c0225 != null) {
            return c0225.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f10641.f10779.getDrawable();
    }

    public CharSequence getHelperText() {
        C3185 c3185 = this.f10605;
        if (c3185.f10706) {
            return c3185.f10705;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0225 c0225 = this.f10605.f10696;
        if (c0225 != null) {
            return c0225.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f10594) {
            return this.f10593;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f10629.m7159();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C3150 c3150 = this.f10629;
        return c3150.m7167(c3150.f10478);
    }

    public int getHintMaxLines() {
        return this.f10629.f10485;
    }

    public ColorStateList getHintTextColor() {
        return this.f10626;
    }

    public InterfaceC3175 getLengthCounter() {
        return this.f10601;
    }

    public int getMaxEms() {
        return this.f10636;
    }

    public int getMaxWidth() {
        return this.f10606;
    }

    public int getMinEms() {
        return this.f10639;
    }

    public int getMinWidth() {
        return this.f10637;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10641.f10777.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10641.f10777.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f10608) {
            return this.f10609;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f10597;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f10598;
    }

    public CharSequence getPrefixText() {
        return this.f10640.f10729;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10640.f10728.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f10640.f10728;
    }

    public C8640 getShapeAppearanceModel() {
        return this.f10664;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10640.f10723.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f10640.f10723.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f10640.f10727;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f10640.f10724;
    }

    public CharSequence getSuffixText() {
        return this.f10641.f10771;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10641.f10770.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f10641.f10770;
    }

    public Typeface getTypeface() {
        return this.f10653;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10629.m7170(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C3195 c3195 = this.f10641;
        c3195.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f10619 = false;
        if (this.f10634 != null && this.f10634.getMeasuredHeight() < (iMax = Math.max(c3195.getMeasuredHeight(), this.f10640.getMeasuredHeight()))) {
            this.f10634.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM7203 = m7203();
        if (z || zM7203) {
            this.f10634.post(new RunnableC1107(this, 7));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f10634;
        if (editText != null) {
            Rect rect = this.f10655;
            AbstractC3149.m7156(this, editText, rect);
            C8643 c8643 = this.f10666;
            if (c8643 != null) {
                int i6 = rect.bottom;
                c8643.setBounds(rect.left, i6 - this.f10643, rect.right, i6);
            }
            C8643 c86432 = this.f10663;
            if (c86432 != null) {
                int i7 = rect.bottom;
                c86432.setBounds(rect.left, i7 - this.f10659, rect.right, i7);
            }
            if (this.f10594) {
                float textSize = this.f10634.getTextSize();
                C3150 c3150 = this.f10629;
                float f = c3150.f10476;
                TextPaint textPaint = c3150.f10441;
                if (f != textSize) {
                    c3150.f10476 = textSize;
                    c3150.m7171(false);
                }
                int gravity = this.f10634.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c3150.f10477 != i8) {
                    c3150.f10477 = i8;
                    c3150.m7171(false);
                }
                if (c3150.f10458 != gravity) {
                    c3150.f10458 = gravity;
                    c3150.m7171(false);
                }
                Rect rectM7198 = m7198(rect);
                int i9 = rectM7198.left;
                int i10 = rectM7198.top;
                int i11 = rectM7198.right;
                int i12 = rectM7198.bottom;
                Rect rect2 = c3150.f10460;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    c3150.f10444 = true;
                }
                if (this.f10634 == null) {
                    C2633.m5341();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(c3150.f10476);
                    textPaint.setTypeface(c3150.f10469);
                    textPaint.setLetterSpacing(c3150.f10491);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(c3150.f10476);
                    textPaint.setTypeface(c3150.f10469);
                    textPaint.setLetterSpacing(c3150.f10491);
                    fDescent = c3150.f10479 * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f10634.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f10658;
                rect3.left = compoundPaddingLeft;
                if (this.f10646 != 1 || this.f10634.getMinLines() > 1) {
                    if (this.f10646 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(c3150.f10476);
                        textPaint.setTypeface(c3150.f10469);
                        textPaint.setLetterSpacing(c3150.f10491);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f10634.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f10634.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f10646 != 1 || this.f10634.getMinLines() > 1) ? rect.bottom - this.f10634.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = c3150.f10461;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != c3150.f10488) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    c3150.f10444 = true;
                    c3150.f10488 = true;
                }
                c3150.m7171(false);
                if (!m7214() || this.f10633) {
                    return;
                }
                m7216();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f10619;
        C3195 c3195 = this.f10641;
        if (!z) {
            c3195.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f10619 = true;
        }
        if (this.f10607 != null && (editText = this.f10634) != null) {
            this.f10607.setGravity(editText.getGravity());
            this.f10607.setPadding(this.f10634.getCompoundPaddingLeft(), this.f10634.getCompoundPaddingTop(), this.f10634.getCompoundPaddingRight(), this.f10634.getCompoundPaddingBottom());
        }
        c3195.m7265();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f10634.getMeasuredWidth() - this.f10634.getCompoundPaddingLeft()) - this.f10634.getCompoundPaddingRight();
        C3150 c3150 = this.f10629;
        TextPaint textPaint = c3150.f10441;
        textPaint.setTextSize(c3150.f10480);
        textPaint.setTypeface(c3150.f10465);
        textPaint.setLetterSpacing(c3150.f10492);
        float f2 = measuredWidth;
        c3150.f10489 = c3150.m7160(c3150.f10484, textPaint, c3150.f10448, (c3150.f10480 / c3150.f10476) * f2, c3150.f10446).getHeight();
        textPaint.setTextSize(c3150.f10476);
        textPaint.setTypeface(c3150.f10469);
        textPaint.setLetterSpacing(c3150.f10491);
        c3150.f10490 = c3150.m7160(c3150.f10485, textPaint, c3150.f10448, f2, c3150.f10446).getHeight();
        EditText editText2 = this.f10634;
        Rect rect = this.f10655;
        AbstractC3149.m7156(this, editText2, rect);
        Rect rectM7198 = m7198(rect);
        int i3 = rectM7198.left;
        int i4 = rectM7198.top;
        int i5 = rectM7198.right;
        int i6 = rectM7198.bottom;
        Rect rect2 = c3150.f10460;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            c3150.f10444 = true;
        }
        m7207();
        m7201();
        if (this.f10634 == null) {
            return;
        }
        int i7 = c3150.f10490;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = c3150.f10441;
            textPaint2.setTextSize(c3150.f10476);
            textPaint2.setTypeface(c3150.f10469);
            textPaint2.setLetterSpacing(c3150.f10491);
            f = -textPaint2.ascent();
        }
        float height = 0.0f;
        if (this.f10609 != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f10607.getPaint());
            textPaint3.setTextSize(this.f10607.getTextSize());
            textPaint3.setTypeface(this.f10607.getTypeface());
            textPaint3.setLetterSpacing(this.f10607.getLetterSpacing());
            try {
                C3164 c3164 = new C3164(this.f10609, textPaint3, measuredWidth);
                c3164.f10536 = getLayoutDirection() == 1;
                c3164.f10539 = true;
                float lineSpacingExtra = this.f10607.getLineSpacingExtra();
                float lineSpacingMultiplier = this.f10607.getLineSpacingMultiplier();
                c3164.f10535 = lineSpacingExtra;
                c3164.f10534 = lineSpacingMultiplier;
                c3164.f10533 = new C2358(this, 4);
                height = c3164.m7187().getHeight() + (this.f10646 == 1 ? c3150.m7159() + this.f10645 + this.f10635 : 0.0f);
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float fMax = Math.max(f, height);
        if (this.f10634.getMeasuredHeight() < fMax) {
            this.f10634.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6699);
        setError(savedState.f10668);
        if (savedState.f10667) {
            post(new RunnableC0062(this, 9));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f10648) {
            InterfaceC8625 interfaceC8625 = this.f10664.f24267;
            RectF rectF = this.f10657;
            float fMo14312 = interfaceC8625.mo14312(rectF);
            float fMo143122 = this.f10664.f24266.mo14312(rectF);
            float fMo143123 = this.f10664.f24272.mo14312(rectF);
            float fMo143124 = this.f10664.f24273.mo14312(rectF);
            C8640 c8640 = this.f10664;
            AbstractC6253 abstractC6253 = c8640.f24271;
            AbstractC6253 abstractC62532 = c8640.f24270;
            AbstractC6253 abstractC62533 = c8640.f24268;
            AbstractC6253 abstractC62534 = c8640.f24269;
            C8623 c8623 = new C8623(0);
            C8623 c86232 = new C8623(0);
            C8623 c86233 = new C8623(0);
            C8623 c86234 = new C8623(0);
            C8628 c8628 = new C8628(fMo143122);
            C8628 c86282 = new C8628(fMo14312);
            C8628 c86283 = new C8628(fMo143124);
            C8628 c86284 = new C8628(fMo143123);
            C8640 c86402 = new C8640();
            c86402.f24271 = abstractC62532;
            c86402.f24270 = abstractC6253;
            c86402.f24269 = abstractC62533;
            c86402.f24268 = abstractC62534;
            c86402.f24267 = c8628;
            c86402.f24266 = c86282;
            c86402.f24273 = c86284;
            c86402.f24272 = c86283;
            c86402.f24276 = c8623;
            c86402.f24277 = c86232;
            c86402.f24274 = c86233;
            c86402.f24275 = c86234;
            this.f10648 = z;
            setShapeAppearanceModel(c86402);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m7211()) {
            savedState.f10668 = getError();
        }
        C3195 c3195 = this.f10641;
        savedState.f10667 = c3195.f10775 != 0 && c3195.f10777.f10414;
        return savedState;
    }

    public void removeOnEditTextAttachedListener(InterfaceC3174 interfaceC3174) {
        this.f10649.remove(interfaceC3174);
    }

    public void removeOnEndIconChangedListener(InterfaceC3173 interfaceC3173) {
        this.f10641.removeOnEndIconChangedListener(interfaceC3173);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f10656 != i) {
            this.f10656 = i;
            this.f10615 = i;
            this.f10617 = i;
            this.f10613 = i;
            m7199();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f10615 = defaultColor;
        this.f10656 = defaultColor;
        this.f10618 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f10617 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f10613 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m7199();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f10646) {
            return;
        }
        this.f10646 = i;
        if (this.f10634 != null) {
            m7215();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f10645 = i;
    }

    public void setBoxCornerFamily(int i) {
        C8639 c8639M14323 = this.f10664.m14323();
        InterfaceC8625 interfaceC8625 = this.f10664.f24267;
        c8639M14323.f24259 = AbstractC6344.m11890(i);
        c8639M14323.f24255 = interfaceC8625;
        InterfaceC8625 interfaceC86252 = this.f10664.f24266;
        c8639M14323.f24258 = AbstractC6344.m11890(i);
        c8639M14323.f24254 = interfaceC86252;
        InterfaceC8625 interfaceC86253 = this.f10664.f24272;
        c8639M14323.f24256 = AbstractC6344.m11890(i);
        c8639M14323.f24260 = interfaceC86253;
        InterfaceC8625 interfaceC86254 = this.f10664.f24273;
        c8639M14323.f24257 = AbstractC6344.m11890(i);
        c8639M14323.f24261 = interfaceC86254;
        this.f10664 = c8639M14323.m14319();
        m7199();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f10625 != i) {
            this.f10625 = i;
            m7194();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f10627 = colorStateList.getDefaultColor();
            this.f10614 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10624 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f10625 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f10625 != colorStateList.getDefaultColor()) {
            this.f10625 = colorStateList.getDefaultColor();
        }
        m7194();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10616 != colorStateList) {
            this.f10616 = colorStateList;
            m7194();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f10643 = i;
        m7194();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f10659 = i;
        m7194();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f10604 != z) {
            C3185 c3185 = this.f10605;
            if (z) {
                C0225 c0225 = new C0225(getContext(), null);
                this.f10612 = c0225;
                c0225.setId(com.davemorrissey.labs.subscaleview.R.id.textinput_counter);
                Typeface typeface = this.f10653;
                if (typeface != null) {
                    this.f10612.setTypeface(typeface);
                }
                this.f10612.setMaxLines(1);
                c3185.m7237(this.f10612, 2);
                ((ViewGroup.MarginLayoutParams) this.f10612.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_textinput_counter_margin_start));
                m7209();
                if (this.f10612 != null) {
                    EditText editText = this.f10634;
                    m7212(editText != null ? editText.getText() : null);
                }
            } else {
                c3185.m7239(this.f10612, 2);
                this.f10612 = null;
            }
            this.f10604 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f10603 != i) {
            if (i > 0) {
                this.f10603 = i;
            } else {
                this.f10603 = -1;
            }
            if (!this.f10604 || this.f10612 == null) {
                return;
            }
            EditText editText = this.f10634;
            m7212(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f10611 != i) {
            this.f10611 = i;
            m7209();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10596 != colorStateList) {
            this.f10596 = colorStateList;
            m7209();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f10610 != i) {
            this.f10610 = i;
            m7209();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10595 != colorStateList) {
            this.f10595 = colorStateList;
            m7209();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f10592 != colorStateList) {
            this.f10592 = colorStateList;
            m7210();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f10591 != colorStateList) {
            this.f10591 = colorStateList;
            if (m7211() || (this.f10612 != null && this.f10602)) {
                m7210();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10622 = colorStateList;
        this.f10626 = colorStateList;
        if (this.f10634 != null) {
            m7204(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m7193(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f10641.f10777.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f10641.f10777.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C3195 c3195 = this.f10641;
        c3195.m7269(i != 0 ? c3195.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        C3195 c3195 = this.f10641;
        Drawable drawableM8312 = i != 0 ? AbstractC3933.m8312(c3195.getContext(), i) : null;
        TextInputLayout textInputLayout = c3195.f10780;
        CheckableImageButton checkableImageButton = c3195.f10777;
        checkableImageButton.setImageDrawable(drawableM8312);
        if (drawableM8312 != null) {
            AbstractC3057.m6742(textInputLayout, checkableImageButton, c3195.f10764, c3195.f10763);
            AbstractC3057.m6746(textInputLayout, checkableImageButton, c3195.f10764);
        }
    }

    public void setEndIconMinSize(int i) {
        C3195 c3195 = this.f10641;
        if (i < 0) {
            c3195.getClass();
            C5925.m11310("endIconSize cannot be less than 0");
        } else if (i != c3195.f10762) {
            c3195.f10762 = i;
            CheckableImageButton checkableImageButton = c3195.f10777;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c3195.f10779;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f10641.m7268(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10641.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10641.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C3195 c3195 = this.f10641;
        c3195.f10761 = scaleType;
        c3195.f10777.setScaleType(scaleType);
        c3195.f10779.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C3195 c3195 = this.f10641;
        if (c3195.f10764 != colorStateList) {
            c3195.f10764 = colorStateList;
            AbstractC3057.m6742(c3195.f10780, c3195.f10777, colorStateList, c3195.f10763);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C3195 c3195 = this.f10641;
        if (c3195.f10763 != mode) {
            c3195.f10763 = mode;
            AbstractC3057.m6742(c3195.f10780, c3195.f10777, c3195.f10764, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f10641.m7272(z);
    }

    public void setError(CharSequence charSequence) {
        C3185 c3185 = this.f10605;
        if (!c3185.f10711) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c3185.m7232();
            return;
        }
        c3185.m7235();
        c3185.f10714 = charSequence;
        c3185.f10712.setText(charSequence);
        int i = c3185.f10709;
        if (i != 1) {
            c3185.f10713 = 1;
        }
        c3185.m7240(i, c3185.f10713, c3185.m7238(c3185.f10712, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C3185 c3185 = this.f10605;
        c3185.f10703 = i;
        C0225 c0225 = c3185.f10712;
        if (c0225 != null) {
            c0225.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C3185 c3185 = this.f10605;
        c3185.f10704 = charSequence;
        C0225 c0225 = c3185.f10712;
        if (c0225 != null) {
            c0225.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C3185 c3185 = this.f10605;
        TextInputLayout textInputLayout = c3185.f10715;
        if (c3185.f10711 == z) {
            return;
        }
        c3185.m7235();
        if (z) {
            C0225 c0225 = new C0225(c3185.f10716, null);
            c3185.f10712 = c0225;
            c0225.setId(com.davemorrissey.labs.subscaleview.R.id.textinput_error);
            c3185.f10712.setTextAlignment(5);
            Typeface typeface = c3185.f10693;
            if (typeface != null) {
                c3185.f10712.setTypeface(typeface);
            }
            int i = c3185.f10707;
            c3185.f10707 = i;
            C0225 c02252 = c3185.f10712;
            if (c02252 != null) {
                c3185.f10715.m7208(c02252, i);
            }
            ColorStateList colorStateList = c3185.f10708;
            c3185.f10708 = colorStateList;
            C0225 c02253 = c3185.f10712;
            if (c02253 != null && colorStateList != null) {
                c02253.setTextColor(colorStateList);
            }
            CharSequence charSequence = c3185.f10704;
            c3185.f10704 = charSequence;
            C0225 c02254 = c3185.f10712;
            if (c02254 != null) {
                c02254.setContentDescription(charSequence);
            }
            int i2 = c3185.f10703;
            c3185.f10703 = i2;
            C0225 c02255 = c3185.f10712;
            if (c02255 != null) {
                c02255.setAccessibilityLiveRegion(i2);
            }
            c3185.f10712.setVisibility(4);
            c3185.m7237(c3185.f10712, 0);
        } else {
            c3185.m7232();
            c3185.m7239(c3185.f10712, 0);
            c3185.f10712 = null;
            textInputLayout.m7202();
            textInputLayout.m7194();
        }
        c3185.f10711 = z;
    }

    public void setErrorIconDrawable(int i) {
        C3195 c3195 = this.f10641;
        c3195.m7273(i != 0 ? AbstractC3933.m8312(c3195.getContext(), i) : null);
        AbstractC3057.m6746(c3195.f10780, c3195.f10779, c3195.f10773);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10641.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10641.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C3195 c3195 = this.f10641;
        if (c3195.f10773 != colorStateList) {
            c3195.f10773 = colorStateList;
            AbstractC3057.m6742(c3195.f10780, c3195.f10779, colorStateList, c3195.f10772);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C3195 c3195 = this.f10641;
        if (c3195.f10772 != mode) {
            c3195.f10772 = mode;
            AbstractC3057.m6742(c3195.f10780, c3195.f10779, c3195.f10773, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C3185 c3185 = this.f10605;
        c3185.f10707 = i;
        C0225 c0225 = c3185.f10712;
        if (c0225 != null) {
            c3185.f10715.m7208(c0225, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C3185 c3185 = this.f10605;
        c3185.f10708 = colorStateList;
        C0225 c0225 = c3185.f10712;
        if (c0225 == null || colorStateList == null) {
            return;
        }
        c0225.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f10628 != z) {
            this.f10628 = z;
            m7204(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C3185 c3185 = this.f10605;
        if (zIsEmpty) {
            if (c3185.f10706) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c3185.f10706) {
            setHelperTextEnabled(true);
        }
        c3185.m7235();
        c3185.f10705 = charSequence;
        c3185.f10696.setText(charSequence);
        int i = c3185.f10709;
        if (i != 2) {
            c3185.f10713 = 2;
        }
        c3185.m7240(i, c3185.f10713, c3185.m7238(c3185.f10696, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C3185 c3185 = this.f10605;
        c3185.f10694 = colorStateList;
        C0225 c0225 = c3185.f10696;
        if (c0225 == null || colorStateList == null) {
            return;
        }
        c0225.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C3185 c3185 = this.f10605;
        TextInputLayout textInputLayout = c3185.f10715;
        if (c3185.f10706 == z) {
            return;
        }
        c3185.m7235();
        if (z) {
            C0225 c0225 = new C0225(c3185.f10716, null);
            c3185.f10696 = c0225;
            c0225.setId(com.davemorrissey.labs.subscaleview.R.id.textinput_helper_text);
            c3185.f10696.setTextAlignment(5);
            Typeface typeface = c3185.f10693;
            if (typeface != null) {
                c3185.f10696.setTypeface(typeface);
            }
            c3185.f10696.setVisibility(4);
            c3185.f10696.setImportantForAccessibility(2);
            int i = c3185.f10695;
            c3185.f10695 = i;
            C0225 c02252 = c3185.f10696;
            if (c02252 != null) {
                c02252.setTextAppearance(i);
            }
            ColorStateList colorStateList = c3185.f10694;
            c3185.f10694 = colorStateList;
            C0225 c02253 = c3185.f10696;
            if (c02253 != null && colorStateList != null) {
                c02253.setTextColor(colorStateList);
            }
            c3185.m7237(c3185.f10696, 1);
        } else {
            c3185.m7235();
            int i2 = c3185.f10709;
            if (i2 == 2) {
                c3185.f10713 = 0;
            }
            c3185.m7240(i2, c3185.f10713, c3185.m7238(c3185.f10696, ""));
            c3185.m7239(c3185.f10696, 1);
            c3185.f10696 = null;
            textInputLayout.m7202();
            textInputLayout.m7194();
        }
        c3185.f10706 = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C3185 c3185 = this.f10605;
        c3185.f10695 = i;
        C0225 c0225 = c3185.f10696;
        if (c0225 != null) {
            c0225.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f10631 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f10594) {
            this.f10594 = z;
            if (z) {
                CharSequence hint = this.f10634.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10593)) {
                        setHint(hint);
                    }
                    this.f10634.setHint((CharSequence) null);
                }
                this.f10589 = true;
            } else {
                this.f10589 = false;
                if (!TextUtils.isEmpty(this.f10593) && TextUtils.isEmpty(this.f10634.getHint())) {
                    this.f10634.setHint(this.f10593);
                }
                setHintInternal(null);
            }
            if (this.f10634 != null) {
                m7207();
            }
        }
    }

    public void setHintMaxLines(int i) {
        C3150 c3150 = this.f10629;
        if (i != c3150.f10484) {
            c3150.f10484 = i;
            c3150.m7171(false);
        }
        if (i != c3150.f10485) {
            c3150.f10485 = i;
            c3150.m7171(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        C3150 c3150 = this.f10629;
        TextInputLayout textInputLayout = c3150.f10463;
        C8654 c8654 = new C8654(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c8654.f24389;
        if (colorStateList != null) {
            c3150.f10478 = colorStateList;
        }
        float f = c8654.f24390;
        if (f != 0.0f) {
            c3150.f10480 = f;
        }
        ColorStateList colorStateList2 = c8654.f24382;
        if (colorStateList2 != null) {
            c3150.f10435 = colorStateList2;
        }
        c3150.f10438 = c8654.f24377;
        c3150.f10434 = c8654.f24388;
        c3150.f10439 = c8654.f24387;
        c3150.f10492 = c8654.f24392;
        C8657 c8657 = c3150.f10450;
        if (c8657 != null) {
            c8657.f24401 = true;
        }
        C2242 c2242 = new C2242(c3150, 13);
        c8654.m14357();
        c3150.f10450 = new C8657(c2242, c8654.f24386);
        c8654.m14356(textInputLayout.getContext(), c3150.f10450);
        c3150.m7171(false);
        this.f10626 = c3150.f10478;
        if (this.f10634 != null) {
            m7204(false, false);
            m7207();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10626 != colorStateList) {
            if (this.f10622 == null) {
                C3150 c3150 = this.f10629;
                if (c3150.f10478 != colorStateList) {
                    c3150.f10478 = colorStateList;
                    c3150.m7171(false);
                }
            }
            this.f10626 = colorStateList;
            if (this.f10634 != null) {
                m7204(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC3175 interfaceC3175) {
        this.f10601 = interfaceC3175;
    }

    public void setMaxEms(int i) {
        this.f10636 = i;
        EditText editText = this.f10634;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f10606 = i;
        EditText editText = this.f10634;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f10639 = i;
        EditText editText = this.f10634;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f10637 = i;
        EditText editText = this.f10634;
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
        C3195 c3195 = this.f10641;
        c3195.f10777.setContentDescription(i != 0 ? c3195.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C3195 c3195 = this.f10641;
        c3195.f10777.setImageDrawable(i != 0 ? AbstractC3933.m8312(c3195.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C3195 c3195 = this.f10641;
        if (z && c3195.f10775 != 1) {
            c3195.m7268(1);
        } else if (z) {
            c3195.getClass();
        } else {
            c3195.m7268(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C3195 c3195 = this.f10641;
        c3195.f10764 = colorStateList;
        AbstractC3057.m6742(c3195.f10780, c3195.f10777, colorStateList, c3195.f10763);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C3195 c3195 = this.f10641;
        c3195.f10763 = mode;
        AbstractC3057.m6742(c3195.f10780, c3195.f10777, c3195.f10764, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f10607 == null) {
            C0225 c0225 = new C0225(getContext(), null);
            this.f10607 = c0225;
            c0225.setId(com.davemorrissey.labs.subscaleview.R.id.textinput_placeholder);
            this.f10607.setImportantForAccessibility(1);
            this.f10607.setAccessibilityLiveRegion(1);
            C7480 c7480M7196 = m7196();
            this.f10600 = c7480M7196;
            c7480M7196.f20268 = 67L;
            this.f10599 = m7196();
            setPlaceholderTextAppearance(this.f10597);
            setPlaceholderTextColor(this.f10598);
            AbstractC2270.m4244(this.f10607, new C2292(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f10608) {
                setPlaceholderTextEnabled(true);
            }
            this.f10609 = charSequence;
        }
        EditText editText = this.f10634;
        m7205(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f10597 = i;
        C0225 c0225 = this.f10607;
        if (c0225 != null) {
            c0225.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f10598 != colorStateList) {
            this.f10598 = colorStateList;
            C0225 c0225 = this.f10607;
            if (c0225 == null || colorStateList == null) {
                return;
            }
            c0225.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C3186 c3186 = this.f10640;
        c3186.getClass();
        c3186.f10729 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c3186.f10728.setText(charSequence);
        c3186.m7241();
    }

    public void setPrefixTextAppearance(int i) {
        this.f10640.f10728.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f10640.f10728.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C8640 c8640) {
        C8643 c8643 = this.f10590;
        if (c8643 == null || c8643.m14348() == c8640) {
            return;
        }
        this.f10664 = c8640;
        m7199();
    }

    public void setStartIconCheckable(boolean z) {
        this.f10640.f10723.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC3933.m8312(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C3186 c3186 = this.f10640;
        if (i < 0) {
            c3186.getClass();
            C5925.m11310("startIconSize cannot be less than 0");
        } else if (i != c3186.f10727) {
            c3186.f10727 = i;
            CheckableImageButton checkableImageButton = c3186.f10723;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10640.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10640.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C3186 c3186 = this.f10640;
        c3186.f10724 = scaleType;
        c3186.f10723.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C3186 c3186 = this.f10640;
        if (c3186.f10722 != colorStateList) {
            c3186.f10722 = colorStateList;
            AbstractC3057.m6742(c3186.f10730, c3186.f10723, colorStateList, c3186.f10726);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C3186 c3186 = this.f10640;
        if (c3186.f10726 != mode) {
            c3186.f10726 = mode;
            AbstractC3057.m6742(c3186.f10730, c3186.f10723, c3186.f10722, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f10640.m7243(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C3195 c3195 = this.f10641;
        c3195.getClass();
        c3195.f10771 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c3195.f10770.setText(charSequence);
        c3195.m7267();
    }

    public void setSuffixTextAppearance(int i) {
        this.f10641.f10770.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f10641.f10770.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C3176 c3176) {
        EditText editText = this.f10634;
        if (editText != null) {
            AbstractC2270.m4244(editText, c3176);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10653) {
            this.f10653 = typeface;
            this.f10629.m7164(typeface);
            C3185 c3185 = this.f10605;
            if (typeface != c3185.f10693) {
                c3185.f10693 = typeface;
                C0225 c0225 = c3185.f10712;
                if (c0225 != null) {
                    c0225.setTypeface(typeface);
                }
                C0225 c02252 = c3185.f10696;
                if (c02252 != null) {
                    c02252.setTypeface(typeface);
                }
            }
            C0225 c02253 = this.f10612;
            if (c02253 != null) {
                c02253.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m7194() {
        C0225 c0225;
        EditText editText;
        EditText editText2;
        if (this.f10590 == null || this.f10646 == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.f10634) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.f10634) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f10660 = this.f10614;
        } else if (m7211()) {
            if (this.f10616 != null) {
                m7195(z, z2);
            } else {
                this.f10660 = getErrorCurrentTextColors();
            }
        } else if (!this.f10602 || (c0225 = this.f10612) == null) {
            if (z) {
                this.f10660 = this.f10625;
            } else if (z2) {
                this.f10660 = this.f10624;
            } else {
                this.f10660 = this.f10627;
            }
        } else if (this.f10616 != null) {
            m7195(z, z2);
        } else {
            this.f10660 = c0225.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m7210();
        }
        C3195 c3195 = this.f10641;
        TextInputLayout textInputLayout = c3195.f10780;
        CheckableImageButton checkableImageButton = c3195.f10777;
        TextInputLayout textInputLayout2 = c3195.f10780;
        c3195.m7266();
        AbstractC3057.m6746(textInputLayout2, c3195.f10779, c3195.f10773);
        AbstractC3057.m6746(textInputLayout2, checkableImageButton, c3195.f10764);
        if (c3195.m7263() instanceof C3199) {
            if (!textInputLayout.m7211() || checkableImageButton.getDrawable() == null) {
                AbstractC3057.m6742(textInputLayout, checkableImageButton, c3195.f10764, c3195.f10763);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C3186 c3186 = this.f10640;
        AbstractC3057.m6746(c3186.f10730, c3186.f10723, c3186.f10722);
        if (this.f10646 == 2) {
            int i = this.f10644;
            if (z && isEnabled()) {
                this.f10644 = this.f10659;
            } else {
                this.f10644 = this.f10643;
            }
            if (this.f10644 != i && m7214() && !this.f10633) {
                if (m7214()) {
                    ((C3196) this.f10590).m7274(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m7216();
            }
        }
        if (this.f10646 == 1) {
            if (!isEnabled()) {
                this.f10656 = this.f10618;
            } else if (z2 && !z) {
                this.f10656 = this.f10613;
            } else if (z) {
                this.f10656 = this.f10617;
            } else {
                this.f10656 = this.f10615;
            }
        }
        m7199();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f10634;
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
    public final void m7195(boolean z, boolean z2) {
        int defaultColor = this.f10616.getDefaultColor();
        int colorForState = this.f10616.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f10616.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f10660 = colorForState2;
        } else if (z2) {
            this.f10660 = colorForState;
        } else {
            this.f10660 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7480 m7196() {
        C7480 c7480 = new C7480();
        c7480.f20269 = AbstractC6347.m11922(getContext(), com.davemorrissey.labs.subscaleview.R.attr.motionDurationShort2, 87);
        c7480.f20263 = AbstractC6347.m11923(getContext(), com.davemorrissey.labs.subscaleview.R.attr.motionEasingLinearInterpolator, AbstractC8672.f24468);
        return c7480;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m7197() {
        if (this.f10594) {
            int i = this.f10646;
            C3150 c3150 = this.f10629;
            if (i == 0) {
                return (int) c3150.m7159();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (c3150.m7159() / 2.0f);
                }
                float fM7159 = c3150.m7159();
                TextPaint textPaint = c3150.f10441;
                textPaint.setTextSize(c3150.f10480);
                textPaint.setTypeface(c3150.f10465);
                textPaint.setLetterSpacing(c3150.f10492);
                return Math.max(0, (int) (fM7159 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect m7198(Rect rect) {
        if (this.f10634 == null) {
            C2633.m5341();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f10658;
        rect2.bottom = i;
        int i2 = this.f10646;
        if (i2 == 1) {
            rect2.left = m7217(rect.left, z);
            rect2.top = rect.top + this.f10645;
            rect2.right = m7218(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = m7217(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = m7218(rect.right, z);
            return rect2;
        }
        rect2.left = this.f10634.getPaddingLeft() + i3;
        rect2.top = rect.top - m7197();
        rect2.right = rect.right - this.f10634.getPaddingRight();
        return rect2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7199() {
        int i;
        int i2;
        C8643 c8643 = this.f10590;
        if (c8643 == null) {
            return;
        }
        C8640 c8640M14348 = c8643.m14348();
        C8640 c8640 = this.f10664;
        if (c8640M14348 != c8640) {
            this.f10590.setShapeAppearanceModel(c8640);
        }
        if (this.f10646 == 2 && (i = this.f10644) > -1 && (i2 = this.f10660) != 0) {
            C8643 c86432 = this.f10590;
            c86432.f24324.f24293 = i;
            c86432.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C8641 c8641 = c86432.f24324;
            if (c8641.f24280 != colorStateListValueOf) {
                c8641.f24280 = colorStateListValueOf;
                c86432.onStateChange(c86432.getState());
            }
        }
        int iM12975 = this.f10656;
        if (this.f10646 == 1) {
            Integer numM10046 = AbstractC5062.m10046(getContext(), com.davemorrissey.labs.subscaleview.R.attr.colorSurface);
            iM12975 = AbstractC7667.m12975(this.f10656, numM10046 != null ? numM10046.intValue() : 0);
        }
        this.f10656 = iM12975;
        this.f10590.m14341(ColorStateList.valueOf(iM12975));
        C8643 c86433 = this.f10666;
        if (c86433 != null && this.f10663 != null) {
            if (this.f10644 > -1 && this.f10660 != 0) {
                c86433.m14341(this.f10634.isFocused() ? ColorStateList.valueOf(this.f10627) : ColorStateList.valueOf(this.f10660));
                this.f10663.m14341(ColorStateList.valueOf(this.f10660));
            }
            invalidate();
        }
        m7206();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7200(float f) {
        C3150 c3150 = this.f10629;
        if (c3150.f10462 == f) {
            return;
        }
        int i = 0;
        if (this.f10630 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10630 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC6347.m11923(getContext(), com.davemorrissey.labs.subscaleview.R.attr.motionEasingEmphasizedInterpolator, AbstractC8672.f24467));
            this.f10630.setDuration(AbstractC6347.m11922(getContext(), com.davemorrissey.labs.subscaleview.R.attr.motionDurationMedium4, 167));
            this.f10630.addUpdateListener(new C3177(this, i));
        }
        this.f10630.setFloatValues(c3150.f10462, f);
        this.f10630.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7201() {
        if (this.f10634 == null || this.f10646 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f10634;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f10629.m7159() + this.f10635), this.f10634.getPaddingEnd(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f10634;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f10634.getPaddingEnd(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (AbstractC7739.m13065(getContext())) {
            EditText editText3 = this.f10634;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f10634.getPaddingEnd(), getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7202() {
        Drawable background;
        C0225 c0225;
        EditText editText = this.f10634;
        if (editText == null || this.f10646 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0216.f828;
        Drawable drawableMutate = background.mutate();
        if (m7211()) {
            drawableMutate.setColorFilter(C0130.m539(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f10602 && (c0225 = this.f10612) != null) {
            drawableMutate.setColorFilter(C0130.m539(c0225.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f10634.refreshDrawableState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m7203() {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m7203():boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7204(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C0225 c0225;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f10634;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f10634;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f10622;
        C3150 c3150 = this.f10629;
        if (colorStateList2 != null) {
            c3150.m7168(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f10622;
            int colorForState = this.f10614;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            c3150.m7168(ColorStateList.valueOf(colorForState));
        } else if (m7211()) {
            C0225 c02252 = this.f10605.f10712;
            c3150.m7168(c02252 != null ? c02252.getTextColors() : null);
        } else if (this.f10602 && (c0225 = this.f10612) != null) {
            c3150.m7168(c0225.getTextColors());
        } else if (z4 && (colorStateList = this.f10626) != null && c3150.f10478 != colorStateList) {
            c3150.f10478 = colorStateList;
            c3150.m7171(false);
        }
        C3195 c3195 = this.f10641;
        C3186 c3186 = this.f10640;
        if (z3 || !this.f10628 || (isEnabled() && z4)) {
            if (z2 || this.f10633) {
                ValueAnimator valueAnimator = this.f10630;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f10630.cancel();
                }
                if (z && this.f10631) {
                    m7200(1.0f);
                } else {
                    c3150.m7165(1.0f);
                }
                this.f10633 = false;
                if (m7214()) {
                    m7216();
                }
                EditText editText3 = this.f10634;
                m7205(editText3 != null ? editText3.getText() : null);
                c3186.f10721 = false;
                c3186.m7241();
                c3195.f10769 = false;
                c3195.m7267();
                return;
            }
            return;
        }
        if (z2 || !this.f10633) {
            ValueAnimator valueAnimator2 = this.f10630;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f10630.cancel();
            }
            if (z && this.f10631) {
                m7200(0.0f);
            } else {
                c3150.m7165(0.0f);
            }
            if (m7214() && !((C3196) this.f10590).f10782.f10783.isEmpty() && m7214()) {
                ((C3196) this.f10590).m7274(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f10633 = true;
            C0225 c02253 = this.f10607;
            if (c02253 != null && this.f10608) {
                c02253.setText((CharSequence) null);
                AbstractC7479.m12697(this.f10642, this.f10599);
                this.f10607.setVisibility(4);
            }
            c3186.f10721 = true;
            c3186.m7241();
            c3195.f10769 = true;
            c3195.m7267();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m7205(Editable editable) {
        ((C2942) this.f10601).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f10642;
        if (length != 0 || this.f10633) {
            C0225 c0225 = this.f10607;
            if (c0225 == null || !this.f10608) {
                return;
            }
            c0225.setText((CharSequence) null);
            AbstractC7479.m12697(frameLayout, this.f10599);
            this.f10607.setVisibility(4);
            return;
        }
        if (this.f10607 == null || !this.f10608 || TextUtils.isEmpty(this.f10609)) {
            return;
        }
        this.f10607.setText(this.f10609);
        AbstractC7479.m12697(frameLayout, this.f10600);
        this.f10607.setVisibility(0);
        this.f10607.bringToFront();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7206() {
        EditText editText = this.f10634;
        if (editText == null || this.f10590 == null) {
            return;
        }
        if ((this.f10665 || editText.getBackground() == null) && this.f10646 != 0) {
            this.f10634.setBackground(getEditTextBoxBackground());
            this.f10665 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7207() {
        if (this.f10646 != 1) {
            FrameLayout frameLayout = this.f10642;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM7197 = m7197();
            if (iM7197 != layoutParams.topMargin) {
                layoutParams.topMargin = iM7197;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7208(C0225 c0225, int i) {
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
    public final void m7209() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0225 c0225 = this.f10612;
        if (c0225 != null) {
            m7208(c0225, this.f10602 ? this.f10611 : this.f10610);
            if (!this.f10602 && (colorStateList2 = this.f10595) != null) {
                this.f10612.setTextColor(colorStateList2);
            }
            if (!this.f10602 || (colorStateList = this.f10596) == null) {
                return;
            }
            this.f10612.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7210() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f10592
            if (r0 == 0) goto L5
            goto L2a
        L5:
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r2 = 604242203(0x2404011b, float:2.8623874E-17)
            android.util.TypedValue r1 = p053.AbstractC6561.m12040(r1, r2)
            r2 = 0
            if (r1 != 0) goto L19
        L17:
            r0 = r2
            goto L2a
        L19:
            int r3 = r1.resourceId
            if (r3 == 0) goto L22
            android.content.res.ColorStateList r0 = p162.AbstractC7653.m12919(r0, r3)
            goto L2a
        L22:
            int r0 = r1.data
            if (r0 == 0) goto L17
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L2a:
            android.widget.EditText r1 = r4.f10634
            if (r1 == 0) goto L55
            android.graphics.drawable.Drawable r1 = androidx.core.view.AbstractC2230.m4111(r1)
            if (r1 != 0) goto L35
            goto L55
        L35:
            android.widget.EditText r1 = r4.f10634
            android.graphics.drawable.Drawable r1 = androidx.core.view.AbstractC2230.m4111(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m7211()
            if (r2 != 0) goto L4d
            androidx.appcompat.widget.飘花落叶言子苏哲楪世兰 r2 = r4.f10612
            if (r2 == 0) goto L52
            boolean r2 = r4.f10602
            if (r2 == 0) goto L52
        L4d:
            android.content.res.ColorStateList r4 = r4.f10591
            if (r4 == 0) goto L52
            r0 = r4
        L52:
            r1.setTintList(r0)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m7210():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7211() {
        C3185 c3185 = this.f10605;
        return (c3185.f10713 != 1 || c3185.f10712 == null || TextUtils.isEmpty(c3185.f10714)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m7212(Editable editable) {
        ((C2942) this.f10601).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f10602;
        int i = this.f10603;
        if (i == -1) {
            this.f10612.setText(String.valueOf(length));
            this.f10612.setContentDescription(null);
            this.f10602 = false;
        } else {
            this.f10602 = length > i;
            Context context = getContext();
            this.f10612.setContentDescription(context.getString(this.f10602 ? com.davemorrissey.labs.subscaleview.R.string.character_counter_overflowed_content_description : com.davemorrissey.labs.subscaleview.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f10603)));
            if (z != this.f10602) {
                m7209();
            }
            String str = C7594.f20585;
            C7594 c7594 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C7594.f20582 : C7594.f20583;
            C0225 c0225 = this.f10612;
            String string = getContext().getString(com.davemorrissey.labs.subscaleview.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f10603));
            c7594.getClass();
            C0064 c0064 = AbstractC7590.f20576;
            c0225.setText(string != null ? c7594.m12823(string).toString() : null);
        }
        if (this.f10634 == null || z == this.f10602) {
            return;
        }
        m7204(false, false);
        m7194();
        m7202();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8643 m7213(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f10634;
        float popupElevation = editText instanceof C3188 ? ((C3188) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C8636 c8636 = new C8636();
        C8636 c86362 = new C8636();
        C8636 c86363 = new C8636();
        C8636 c86364 = new C8636();
        int i = 0;
        C8623 c8623 = new C8623(i);
        C8623 c86232 = new C8623(i);
        C8623 c86233 = new C8623(i);
        C8623 c86234 = new C8623(i);
        C8628 c8628 = new C8628(f);
        C8628 c86282 = new C8628(f);
        C8628 c86283 = new C8628(dimensionPixelOffset);
        C8628 c86284 = new C8628(dimensionPixelOffset);
        C8640 c8640 = new C8640();
        c8640.f24271 = c8636;
        c8640.f24270 = c86362;
        c8640.f24269 = c86363;
        c8640.f24268 = c86364;
        c8640.f24267 = c8628;
        c8640.f24266 = c86282;
        c8640.f24273 = c86284;
        c8640.f24272 = c86283;
        c8640.f24276 = c8623;
        c8640.f24277 = c86232;
        c8640.f24274 = c86233;
        c8640.f24275 = c86234;
        EditText editText2 = this.f10634;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C3188 ? ((C3188) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C8643.f24296;
            dropDownBackgroundTintList = ColorStateList.valueOf(AbstractC5062.m10026(context, AbstractC6561.m12067(context, C8643.class.getSimpleName(), com.davemorrissey.labs.subscaleview.R.attr.colorSurface)));
        }
        C8643 c8643 = new C8643();
        c8643.m14338(context);
        c8643.m14341(dropDownBackgroundTintList);
        c8643.m14340(popupElevation);
        c8643.setShapeAppearanceModel(c8640);
        C8641 c8641 = c8643.f24324;
        if (c8641.f24289 == null) {
            c8641.f24289 = new Rect();
        }
        c8643.f24324.f24289.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c8643.invalidateSelf();
        return c8643;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m7214() {
        return this.f10594 && !TextUtils.isEmpty(this.f10593) && (this.f10590 instanceof C3196);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7215() {
        int i = this.f10646;
        if (i == 0) {
            this.f10590 = null;
            this.f10666 = null;
            this.f10663 = null;
        } else if (i == 1) {
            this.f10590 = new C8643(this.f10664);
            this.f10666 = new C8643();
            this.f10663 = new C8643();
        } else {
            if (i != 2) {
                C5925.m11310(AbstractC0053.m147(new StringBuilder(), " is illegal; only @BoxBackgroundMode constants are supported.", this.f10646));
                return;
            }
            if (!this.f10594 || (this.f10590 instanceof C3196)) {
                this.f10590 = new C8643(this.f10664);
            } else {
                C8640 c8640 = this.f10664;
                int i2 = C3196.f10781;
                if (c8640 == null) {
                    c8640 = new C8640();
                }
                C3197 c3197 = new C3197(c8640, new RectF());
                C3196 c3196 = new C3196(c3197);
                c3196.f10782 = c3197;
                this.f10590 = c3196;
            }
            this.f10666 = null;
            this.f10663 = null;
        }
        m7206();
        m7194();
        if (this.f10646 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f10645 = getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC7739.m13065(getContext())) {
                this.f10645 = getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        m7201();
        if (this.f10646 != 0) {
            m7207();
        }
        EditText editText = this.f10634;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f10646;
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
    public final void m7216() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m7216():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7217(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f10634.getCompoundPaddingLeft() : this.f10641.m7262() : this.f10640.m7246()) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m7218(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f10634.getCompoundPaddingRight() : this.f10640.m7246() : this.f10641.m7262());
    }

    public void setHint(CharSequence charSequence) {
        if (this.f10594) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f10640.m7245(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10640.m7244(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f10641.m7269(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10641.f10777.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10641.f10777.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10641.m7273(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        C3195 c3195 = this.f10641;
        TextInputLayout textInputLayout = c3195.f10780;
        CheckableImageButton checkableImageButton = c3195.f10777;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC3057.m6742(textInputLayout, checkableImageButton, c3195.f10764, c3195.f10763);
            AbstractC3057.m6746(textInputLayout, checkableImageButton, c3195.f10764);
        }
    }
}
