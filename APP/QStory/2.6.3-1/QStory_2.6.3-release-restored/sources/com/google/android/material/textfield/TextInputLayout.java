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
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
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
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.RunnableC0909;
import androidx.appcompat.widget.AbstractC1063;
import androidx.appcompat.widget.C0977;
import androidx.appcompat.widget.C1072;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3075;
import androidx.core.widget.C3125;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.C3191;
import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3981;
import com.google.android.material.internal.AbstractC3992;
import com.google.android.material.internal.C3982;
import com.google.android.material.internal.C3996;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import io.ktor.client.plugins.AbstractC4765;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p034.AbstractC7082;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p069.AbstractC7390;
import p144.AbstractC8308;
import p144.C8309;
import p168.AbstractC8419;
import p168.C8423;
import p178.AbstractC8482;
import p180.AbstractC8496;
import p191.AbstractC8568;
import p284.AbstractC9096;
import p321.C9452;
import p321.C9457;
import p321.C9465;
import p321.C9468;
import p321.C9469;
import p321.C9470;
import p321.C9472;
import p321.InterfaceC9454;
import p326.C9483;
import p326.C9486;
import p330.AbstractC9490;
import p333.AbstractC9501;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final int[][] f10933 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f10934;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C9472 f10935;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ColorStateList f10936;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public ColorStateList f10937;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public CharSequence f10938;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10939;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ColorStateList f10940;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ColorStateList f10941;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10942;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ColorStateList f10943;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C8309 f10944;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C8309 f10945;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC4007 f10946;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10947;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f10948;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10949;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4017 f10950;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f10951;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C1072 f10952;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10953;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public CharSequence f10954;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10955;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10956;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1072 f10957;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public int f10958;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public int f10959;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public int f10960;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public ColorStateList f10961;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public int f10962;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public int f10963;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public boolean f10964;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public boolean f10965;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public boolean f10966;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public ColorStateList f10967;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public Drawable f10968;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public int f10969;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public int f10970;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public ColorStateList f10971;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public int f10972;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public boolean f10973;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final C3982 f10974;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public ValueAnimator f10975;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public boolean f10976;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public int f10977;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public boolean f10978;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EditText f10979;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f10980;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10981;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10982;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public CharSequence f10983;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10984;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4018 f10985;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4027 f10986;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final FrameLayout f10987;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int f10988;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int f10989;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f10990;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public int f10991;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final int f10992;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public boolean f10993;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final LinkedHashSet f10994;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public int f10995;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public int f10996;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public ColorDrawable f10997;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public Typeface f10998;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public ColorDrawable f10999;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final Rect f11000;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f11001;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final RectF f11002;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final Rect f11003;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f11004;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f11005;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public StateListDrawable f11006;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C9472 f11007;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public C9472 f11008;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C9469 f11009;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f11010;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C9472 f11011;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4004();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public boolean f11012;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public CharSequence f11013;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11013 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11012 = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f11013) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f11013, parcel, i);
            parcel.writeInt(this.f11012 ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.textInputStyle, C0328R.style.Widget_Design_TextInputLayout), attributeSet, C0328R.attr.textInputStyle);
        this.f10984 = -1;
        this.f10981 = -1;
        this.f10982 = -1;
        this.f10951 = -1;
        this.f10950 = new C4017(this);
        this.f10946 = new C3775(15);
        this.f11000 = new Rect();
        this.f11003 = new Rect();
        this.f11002 = new RectF();
        this.f10994 = new LinkedHashSet();
        C3982 c3982 = new C3982(this);
        this.f10974 = c3982;
        this.f10964 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f10987 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC9501.f24813;
        c3982.f10781 = linearInterpolator;
        c3982.m7730(false);
        c3982.f10782 = linearInterpolator;
        c3982.m7730(false);
        if (c3982.f10822 != 8388659) {
            c3982.f10822 = 8388659;
            c3982.m7730(false);
        }
        AbstractC3992.m7745(context2, attributeSet, C0328R.attr.textInputStyle, C0328R.style.Widget_Design_TextInputLayout);
        int[] iArr = AbstractC9490.f24763;
        AbstractC3992.m7744(context2, attributeSet, iArr, C0328R.attr.textInputStyle, C0328R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C0328R.attr.textInputStyle, C0328R.style.Widget_Design_TextInputLayout);
        C0955 c0955 = new C0955(context2, typedArrayObtainStyledAttributes);
        C4018 c4018 = new C4018(this, c0955);
        this.f10985 = c4018;
        this.f10939 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f10976 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f10973 = typedArrayObtainStyledAttributes.getBoolean(42, true);
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
        this.f11009 = C9469.m14880(context2, attributeSet, C0328R.attr.textInputStyle, C0328R.style.Widget_Design_TextInputLayout).m14878();
        this.f10992 = context2.getResources().getDimensionPixelOffset(C0328R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f10990 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f10980 = getResources().getDimensionPixelSize(C0328R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f10988 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(C0328R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f11004 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(C0328R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f10989 = this.f10988;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C9468 c9468M14882 = this.f11009.m14882();
        if (dimension >= 0.0f) {
            c9468M14882.f24600 = new C9457(dimension);
        }
        if (dimension2 >= 0.0f) {
            c9468M14882.f24599 = new C9457(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c9468M14882.f24606 = new C9457(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c9468M14882.f24605 = new C9457(dimension4);
        }
        this.f11009 = c9468M14882.m14878();
        ColorStateList colorStateListM13631 = AbstractC8568.m13631(context2, c0955, 7);
        if (colorStateListM13631 != null) {
            int defaultColor = colorStateListM13631.getDefaultColor();
            this.f10960 = defaultColor;
            this.f11001 = defaultColor;
            if (colorStateListM13631.isStateful()) {
                this.f10963 = colorStateListM13631.getColorForState(new int[]{-16842910}, -1);
                this.f10962 = colorStateListM13631.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f10958 = colorStateListM13631.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f10962 = this.f10960;
                ColorStateList colorStateListM13478 = AbstractC8482.m13478(context2, C0328R.color.mtrl_filled_background_color);
                this.f10963 = colorStateListM13478.getColorForState(new int[]{-16842910}, -1);
                this.f10958 = colorStateListM13478.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f11001 = 0;
            this.f10960 = 0;
            this.f10963 = 0;
            this.f10962 = 0;
            this.f10958 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM945 = c0955.m945(1);
            this.f10971 = colorStateListM945;
            this.f10967 = colorStateListM945;
        }
        ColorStateList colorStateListM136312 = AbstractC8568.m13631(context2, c0955, 14);
        this.f10970 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f10972 = context2.getColor(C0328R.color.mtrl_textinput_default_box_stroke_color);
        this.f10959 = context2.getColor(C0328R.color.mtrl_textinput_disabled_color);
        this.f10969 = context2.getColor(C0328R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM136312 != null) {
            setBoxStrokeColorStateList(colorStateListM136312);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC8568.m13631(context2, c0955, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.f10937 = c0955.m945(24);
        this.f10936 = c0955.m945(25);
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
        this.f10955 = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f10956 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f10956);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f10955);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0955.m945(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0955.m945(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(c0955.m945(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0955.m945(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0955.m945(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(c0955.m945(59));
        }
        C4027 c4027 = new C4027(this, c0955);
        this.f10986 = c4027;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        c0955.m923();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(c4018);
        frameLayout.addView(c4027);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f10979;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f10935;
        }
        EditText editText2 = this.f10979;
        int iM10585 = AbstractC5894.m10585(editText2.getContext(), AbstractC7390.m12618(editText2, C0328R.attr.colorControlHighlight));
        int i = this.f10991;
        int[][] iArr = f10933;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C9472 c9472 = this.f10935;
            int i2 = this.f11001;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC5894.m10583(iM10585, 0.1f, i2), i2}), c9472, c9472);
        }
        Context context = getContext();
        C9472 c94722 = this.f10935;
        int iM105852 = AbstractC5894.m10585(context, AbstractC7390.m12626(context, "TextInputLayout", C0328R.attr.colorSurface));
        C9472 c94723 = new C9472(c94722.m14907());
        int iM10583 = AbstractC5894.m10583(iM10585, 0.1f, iM105852);
        c94723.m14900(new ColorStateList(iArr, new int[]{iM10583, 0}));
        c94723.setTint(iM105852);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM10583, iM105852});
        C9472 c94724 = new C9472(c94722.m14907());
        c94724.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c94723, c94724), c94722});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f11006 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f11006 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f11006.addState(new int[0], m7772(false));
        }
        return this.f11006;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f11007 == null) {
            this.f11007 = m7772(true);
        }
        return this.f11007;
    }

    private void setEditText(EditText editText) {
        if (this.f10979 != null) {
            C6755.m11869("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f10979 = editText;
        int i = this.f10984;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f10982);
        }
        int i2 = this.f10981;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f10951);
        }
        this.f11010 = false;
        m7774();
        setTextInputAccessibilityDelegate(new C4008(this));
        Typeface typeface = this.f10979.getTypeface();
        C3982 c3982 = this.f10974;
        c3982.m7723(typeface);
        float textSize = this.f10979.getTextSize();
        if (c3982.f10821 != textSize) {
            c3982.f10821 = textSize;
            c3982.m7730(false);
        }
        float letterSpacing = this.f10979.getLetterSpacing();
        if (c3982.f10836 != letterSpacing) {
            c3982.f10836 = letterSpacing;
            c3982.m7730(false);
        }
        int gravity = this.f10979.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (c3982.f10822 != i3) {
            c3982.f10822 = i3;
            c3982.m7730(false);
        }
        if (c3982.f10803 != gravity) {
            c3982.f10803 = gravity;
            c3982.m7730(false);
        }
        this.f10977 = editText.getMinimumHeight();
        this.f10979.addTextChangedListener(new C4019(this, editText));
        if (this.f10967 == null) {
            this.f10967 = this.f10979.getHintTextColors();
        }
        if (this.f10939) {
            if (TextUtils.isEmpty(this.f10938)) {
                CharSequence hint = this.f10979.getHint();
                this.f10983 = hint;
                setHint(hint);
                this.f10979.setHint((CharSequence) null);
            }
            this.f10934 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m7769();
        }
        if (this.f10957 != null) {
            m7771(this.f10979.getText());
        }
        m7761();
        this.f10950.m7795();
        this.f10985.bringToFront();
        C4027 c4027 = this.f10986;
        c4027.bringToFront();
        Iterator it = this.f10994.iterator();
        while (it.hasNext()) {
            ((C4026) ((InterfaceC4006) it.next())).m7817(this);
        }
        c4027.m7824();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m7763(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f10938)) {
            return;
        }
        this.f10938 = charSequence;
        C3982 c3982 = this.f10974;
        if (charSequence == null || !TextUtils.equals(c3982.f10793, charSequence)) {
            c3982.f10793 = charSequence;
            c3982.f10792 = null;
            c3982.m7730(false);
        }
        if (this.f10978) {
            return;
        }
        m7775();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f10953 == z) {
            return;
        }
        C1072 c1072 = this.f10952;
        if (!z) {
            if (c1072 != null) {
                c1072.setVisibility(8);
            }
            this.f10952 = null;
        } else if (c1072 != null) {
            this.f10987.addView(c1072);
            this.f10952.setVisibility(0);
        }
        this.f10953 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m7752(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m7752((ViewGroup) childAt, z);
            }
        }
    }

    public void addOnEditTextAttachedListener(InterfaceC4006 interfaceC4006) {
        this.f10994.add(interfaceC4006);
        if (this.f10979 != null) {
            ((C4026) interfaceC4006).m7817(this);
        }
    }

    public void addOnEndIconChangedListener(InterfaceC4005 interfaceC4005) {
        this.f10986.addOnEndIconChangedListener(interfaceC4005);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f10987;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m7766();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f10979;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f10983 != null) {
            boolean z = this.f10934;
            this.f10934 = false;
            CharSequence hint = editText.getHint();
            this.f10979.setHint(this.f10983);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f10979.setHint(hint);
                this.f10934 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f10987;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f10979) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f10966 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10966 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C9472 c9472;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f10939;
        C3982 c3982 = this.f10974;
        if (z) {
            TextPaint textPaint = c3982.f10785;
            RectF rectF = c3982.f10804;
            int iSave = canvas2.save();
            if (c3982.f10792 != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c3982.f10800);
                float f = c3982.f10817;
                float f2 = c3982.f10818;
                float f3 = c3982.f10801;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((c3982.f10830 > 1 || c3982.f10829 > 1) && !c3982.f10791 && c3982.m7725()) {
                    float lineStart = c3982.f10817 - c3982.f10841.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c3982.f10832 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c3982.f10799;
                        float f6 = c3982.f10798;
                        float f7 = c3982.f10797;
                        int i2 = c3982.f10788;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC8496.m13532(i2, (textPaint.getAlpha() * Color.alpha(i2)) / Opcodes.CONST_METHOD_TYPE));
                    }
                    c3982.f10841.draw(canvas2);
                    textPaint.setAlpha((int) (c3982.f10839 * f4));
                    if (i >= 31) {
                        float f8 = c3982.f10799;
                        float f9 = c3982.f10798;
                        float f10 = c3982.f10797;
                        int i3 = c3982.f10788;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC8496.m13532(i3, (Color.alpha(i3) * textPaint.getAlpha()) / Opcodes.CONST_METHOD_TYPE));
                    }
                    int lineBaseline = c3982.f10841.getLineBaseline(0);
                    CharSequence charSequence = c3982.f10831;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c3982.f10799, c3982.f10798, c3982.f10797, c3982.f10788);
                    }
                    String strTrim = c3982.f10831.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = AbstractC0900.m721(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c3982.f10841.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    c3982.f10841.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f11008 == null || (c9472 = this.f11011) == null) {
            return;
        }
        c9472.draw(canvas2);
        if (this.f10979.isFocused()) {
            Rect bounds = this.f11008.getBounds();
            Rect bounds2 = this.f11011.getBounds();
            float f12 = c3982.f10807;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC9501.m14955(iCenterX, f12, bounds2.left);
            bounds.right = AbstractC9501.m14955(iCenterX, f12, bounds2.right);
            this.f11008.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.f10965) {
            return;
        }
        this.f10965 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C3982 c3982 = this.f10974;
        if (c3982 != null) {
            c3982.f10790 = drawableState;
            ColorStateList colorStateList2 = c3982.f10823;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c3982.f10826) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c3982.m7730(false);
                z = true;
            }
        }
        if (this.f10979 != null) {
            m7763(isLaidOut() && isEnabled(), false);
        }
        m7761();
        m7753();
        if (z) {
            invalidate();
        }
        this.f10965 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f10979;
        if (editText == null) {
            return super.getBaseline();
        }
        return m7756() + getPaddingTop() + editText.getBaseline();
    }

    public C9472 getBoxBackground() {
        int i = this.f10991;
        if (i == 1 || i == 2) {
            return this.f10935;
        }
        C3466.m5901();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.f11001;
    }

    public int getBoxBackgroundMode() {
        return this.f10991;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f10990;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        C9469 c9469 = this.f11009;
        RectF rectF = this.f11002;
        return layoutDirection == 1 ? c9469.f24617.mo14871(rectF) : c9469.f24618.mo14871(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        C9469 c9469 = this.f11009;
        RectF rectF = this.f11002;
        return layoutDirection == 1 ? c9469.f24618.mo14871(rectF) : c9469.f24617.mo14871(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        C9469 c9469 = this.f11009;
        RectF rectF = this.f11002;
        return layoutDirection == 1 ? c9469.f24612.mo14871(rectF) : c9469.f24611.mo14871(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        C9469 c9469 = this.f11009;
        RectF rectF = this.f11002;
        return layoutDirection == 1 ? c9469.f24611.mo14871(rectF) : c9469.f24612.mo14871(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f10970;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10961;
    }

    public int getBoxStrokeWidth() {
        return this.f10988;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f11004;
    }

    public int getCounterMaxLength() {
        return this.f10948;
    }

    public CharSequence getCounterOverflowDescription() {
        C1072 c1072;
        if (this.f10949 && this.f10947 && (c1072 = this.f10957) != null) {
            return c1072.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10941;
    }

    public ColorStateList getCounterTextColor() {
        return this.f10940;
    }

    public ColorStateList getCursorColor() {
        return this.f10937;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f10936;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10967;
    }

    public EditText getEditText() {
        return this.f10979;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10986.f11122.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f10986.f11122.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f10986.f11107;
    }

    public int getEndIconMode() {
        return this.f10986.f11120;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f10986.f11106;
    }

    public CheckableImageButton getEndIconView() {
        return this.f10986.f11122;
    }

    public CharSequence getError() {
        C4017 c4017 = this.f10950;
        if (c4017.f11056) {
            return c4017.f11059;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f10950.f11048;
    }

    public CharSequence getErrorContentDescription() {
        return this.f10950.f11049;
    }

    public int getErrorCurrentTextColors() {
        C1072 c1072 = this.f10950.f11057;
        if (c1072 != null) {
            return c1072.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f10986.f11124.getDrawable();
    }

    public CharSequence getHelperText() {
        C4017 c4017 = this.f10950;
        if (c4017.f11051) {
            return c4017.f11050;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1072 c1072 = this.f10950.f11041;
        if (c1072 != null) {
            return c1072.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f10939) {
            return this.f10938;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f10974.m7718();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C3982 c3982 = this.f10974;
        return c3982.m7726(c3982.f10823);
    }

    public int getHintMaxLines() {
        return this.f10974.f10830;
    }

    public ColorStateList getHintTextColor() {
        return this.f10971;
    }

    public InterfaceC4007 getLengthCounter() {
        return this.f10946;
    }

    public int getMaxEms() {
        return this.f10981;
    }

    public int getMaxWidth() {
        return this.f10951;
    }

    public int getMinEms() {
        return this.f10984;
    }

    public int getMinWidth() {
        return this.f10982;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10986.f11122.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10986.f11122.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f10953) {
            return this.f10954;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f10942;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f10943;
    }

    public CharSequence getPrefixText() {
        return this.f10985.f11074;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10985.f11073.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f10985.f11073;
    }

    public C9469 getShapeAppearanceModel() {
        return this.f11009;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10985.f11068.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f10985.f11068.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f10985.f11072;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f10985.f11069;
    }

    public CharSequence getSuffixText() {
        return this.f10986.f11116;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10986.f11115.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f10986.f11115;
    }

    public Typeface getTypeface() {
        return this.f10998;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10974.m7729(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C4027 c4027 = this.f10986;
        c4027.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f10964 = false;
        if (this.f10979 != null && this.f10979.getMeasuredHeight() < (iMax = Math.max(c4027.getMeasuredHeight(), this.f10985.getMeasuredHeight()))) {
            this.f10979.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM7762 = m7762();
        if (z || zM7762) {
            this.f10979.post(new RunnableC1945(this, 7));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f10979;
        if (editText != null) {
            Rect rect = this.f11000;
            AbstractC3981.m7715(this, editText, rect);
            C9472 c9472 = this.f11011;
            if (c9472 != null) {
                int i6 = rect.bottom;
                c9472.setBounds(rect.left, i6 - this.f10988, rect.right, i6);
            }
            C9472 c94722 = this.f11008;
            if (c94722 != null) {
                int i7 = rect.bottom;
                c94722.setBounds(rect.left, i7 - this.f11004, rect.right, i7);
            }
            if (this.f10939) {
                float textSize = this.f10979.getTextSize();
                C3982 c3982 = this.f10974;
                float f = c3982.f10821;
                TextPaint textPaint = c3982.f10786;
                if (f != textSize) {
                    c3982.f10821 = textSize;
                    c3982.m7730(false);
                }
                int gravity = this.f10979.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c3982.f10822 != i8) {
                    c3982.f10822 = i8;
                    c3982.m7730(false);
                }
                if (c3982.f10803 != gravity) {
                    c3982.f10803 = gravity;
                    c3982.m7730(false);
                }
                Rect rectM7757 = m7757(rect);
                int i9 = rectM7757.left;
                int i10 = rectM7757.top;
                int i11 = rectM7757.right;
                int i12 = rectM7757.bottom;
                Rect rect2 = c3982.f10805;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    c3982.f10789 = true;
                }
                if (this.f10979 == null) {
                    C3466.m5901();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(c3982.f10821);
                    textPaint.setTypeface(c3982.f10814);
                    textPaint.setLetterSpacing(c3982.f10836);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(c3982.f10821);
                    textPaint.setTypeface(c3982.f10814);
                    textPaint.setLetterSpacing(c3982.f10836);
                    fDescent = c3982.f10824 * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f10979.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f11003;
                rect3.left = compoundPaddingLeft;
                if (this.f10991 != 1 || this.f10979.getMinLines() > 1) {
                    if (this.f10991 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(c3982.f10821);
                        textPaint.setTypeface(c3982.f10814);
                        textPaint.setLetterSpacing(c3982.f10836);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f10979.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f10979.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f10991 != 1 || this.f10979.getMinLines() > 1) ? rect.bottom - this.f10979.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = c3982.f10806;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != c3982.f10833) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    c3982.f10789 = true;
                    c3982.f10833 = true;
                }
                c3982.m7730(false);
                if (!m7773() || this.f10978) {
                    return;
                }
                m7775();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f10964;
        C4027 c4027 = this.f10986;
        if (!z) {
            c4027.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f10964 = true;
        }
        if (this.f10952 != null && (editText = this.f10979) != null) {
            this.f10952.setGravity(editText.getGravity());
            this.f10952.setPadding(this.f10979.getCompoundPaddingLeft(), this.f10979.getCompoundPaddingTop(), this.f10979.getCompoundPaddingRight(), this.f10979.getCompoundPaddingBottom());
        }
        c4027.m7824();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f10979.getMeasuredWidth() - this.f10979.getCompoundPaddingLeft()) - this.f10979.getCompoundPaddingRight();
        C3982 c3982 = this.f10974;
        TextPaint textPaint = c3982.f10786;
        textPaint.setTextSize(c3982.f10825);
        textPaint.setTypeface(c3982.f10810);
        textPaint.setLetterSpacing(c3982.f10837);
        float f2 = measuredWidth;
        c3982.f10834 = c3982.m7719(c3982.f10829, textPaint, c3982.f10793, (c3982.f10825 / c3982.f10821) * f2, c3982.f10791).getHeight();
        textPaint.setTextSize(c3982.f10821);
        textPaint.setTypeface(c3982.f10814);
        textPaint.setLetterSpacing(c3982.f10836);
        c3982.f10835 = c3982.m7719(c3982.f10830, textPaint, c3982.f10793, f2, c3982.f10791).getHeight();
        EditText editText2 = this.f10979;
        Rect rect = this.f11000;
        AbstractC3981.m7715(this, editText2, rect);
        Rect rectM7757 = m7757(rect);
        int i3 = rectM7757.left;
        int i4 = rectM7757.top;
        int i5 = rectM7757.right;
        int i6 = rectM7757.bottom;
        Rect rect2 = c3982.f10805;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            c3982.f10789 = true;
        }
        m7766();
        m7760();
        if (this.f10979 == null) {
            return;
        }
        int i7 = c3982.f10835;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = c3982.f10786;
            textPaint2.setTextSize(c3982.f10821);
            textPaint2.setTypeface(c3982.f10814);
            textPaint2.setLetterSpacing(c3982.f10836);
            f = -textPaint2.ascent();
        }
        float height = 0.0f;
        if (this.f10954 != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f10952.getPaint());
            textPaint3.setTextSize(this.f10952.getTextSize());
            textPaint3.setTypeface(this.f10952.getTypeface());
            textPaint3.setLetterSpacing(this.f10952.getLetterSpacing());
            try {
                C3996 c3996 = new C3996(this.f10954, textPaint3, measuredWidth);
                c3996.f10881 = getLayoutDirection() == 1;
                c3996.f10884 = true;
                float lineSpacingExtra = this.f10952.getLineSpacingExtra();
                float lineSpacingMultiplier = this.f10952.getLineSpacingMultiplier();
                c3996.f10880 = lineSpacingExtra;
                c3996.f10879 = lineSpacingMultiplier;
                c3996.f10878 = new C3191(this, 4);
                height = c3996.m7746().getHeight() + (this.f10991 == 1 ? c3982.m7718() + this.f10990 + this.f10980 : 0.0f);
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float fMax = Math.max(f, height);
        if (this.f10979.getMeasuredHeight() < fMax) {
            this.f10979.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f7044);
        setError(savedState.f11013);
        if (savedState.f11012) {
            post(new RunnableC0909(this, 9));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f10993) {
            InterfaceC9454 interfaceC9454 = this.f11009.f24612;
            RectF rectF = this.f11002;
            float fMo14871 = interfaceC9454.mo14871(rectF);
            float fMo148712 = this.f11009.f24611.mo14871(rectF);
            float fMo148713 = this.f11009.f24617.mo14871(rectF);
            float fMo148714 = this.f11009.f24618.mo14871(rectF);
            C9469 c9469 = this.f11009;
            AbstractC7082 abstractC7082 = c9469.f24616;
            AbstractC7082 abstractC70822 = c9469.f24615;
            AbstractC7082 abstractC70823 = c9469.f24613;
            AbstractC7082 abstractC70824 = c9469.f24614;
            C9452 c9452 = new C9452(0);
            C9452 c94522 = new C9452(0);
            C9452 c94523 = new C9452(0);
            C9452 c94524 = new C9452(0);
            C9457 c9457 = new C9457(fMo148712);
            C9457 c94572 = new C9457(fMo14871);
            C9457 c94573 = new C9457(fMo148714);
            C9457 c94574 = new C9457(fMo148713);
            C9469 c94692 = new C9469();
            c94692.f24616 = abstractC70822;
            c94692.f24615 = abstractC7082;
            c94692.f24614 = abstractC70823;
            c94692.f24613 = abstractC70824;
            c94692.f24612 = c9457;
            c94692.f24611 = c94572;
            c94692.f24618 = c94574;
            c94692.f24617 = c94573;
            c94692.f24621 = c9452;
            c94692.f24622 = c94522;
            c94692.f24619 = c94523;
            c94692.f24620 = c94524;
            this.f10993 = z;
            setShapeAppearanceModel(c94692);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m7770()) {
            savedState.f11013 = getError();
        }
        C4027 c4027 = this.f10986;
        savedState.f11012 = c4027.f11120 != 0 && c4027.f11122.f10759;
        return savedState;
    }

    public void removeOnEditTextAttachedListener(InterfaceC4006 interfaceC4006) {
        this.f10994.remove(interfaceC4006);
    }

    public void removeOnEndIconChangedListener(InterfaceC4005 interfaceC4005) {
        this.f10986.removeOnEndIconChangedListener(interfaceC4005);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f11001 != i) {
            this.f11001 = i;
            this.f10960 = i;
            this.f10962 = i;
            this.f10958 = i;
            m7758();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f10960 = defaultColor;
        this.f11001 = defaultColor;
        this.f10963 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f10962 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f10958 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m7758();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f10991) {
            return;
        }
        this.f10991 = i;
        if (this.f10979 != null) {
            m7774();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f10990 = i;
    }

    public void setBoxCornerFamily(int i) {
        C9468 c9468M14882 = this.f11009.m14882();
        InterfaceC9454 interfaceC9454 = this.f11009.f24612;
        c9468M14882.f24604 = AbstractC7173.m12449(i);
        c9468M14882.f24600 = interfaceC9454;
        InterfaceC9454 interfaceC94542 = this.f11009.f24611;
        c9468M14882.f24603 = AbstractC7173.m12449(i);
        c9468M14882.f24599 = interfaceC94542;
        InterfaceC9454 interfaceC94543 = this.f11009.f24617;
        c9468M14882.f24601 = AbstractC7173.m12449(i);
        c9468M14882.f24605 = interfaceC94543;
        InterfaceC9454 interfaceC94544 = this.f11009.f24618;
        c9468M14882.f24602 = AbstractC7173.m12449(i);
        c9468M14882.f24606 = interfaceC94544;
        this.f11009 = c9468M14882.m14878();
        m7758();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f10970 != i) {
            this.f10970 = i;
            m7753();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f10972 = colorStateList.getDefaultColor();
            this.f10959 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10969 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f10970 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f10970 != colorStateList.getDefaultColor()) {
            this.f10970 = colorStateList.getDefaultColor();
        }
        m7753();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10961 != colorStateList) {
            this.f10961 = colorStateList;
            m7753();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f10988 = i;
        m7753();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f11004 = i;
        m7753();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f10949 != z) {
            C4017 c4017 = this.f10950;
            if (z) {
                C1072 c1072 = new C1072(getContext(), null);
                this.f10957 = c1072;
                c1072.setId(C0328R.id.textinput_counter);
                Typeface typeface = this.f10998;
                if (typeface != null) {
                    this.f10957.setTypeface(typeface);
                }
                this.f10957.setMaxLines(1);
                c4017.m7796(this.f10957, 2);
                ((ViewGroup.MarginLayoutParams) this.f10957.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C0328R.dimen.mtrl_textinput_counter_margin_start));
                m7768();
                if (this.f10957 != null) {
                    EditText editText = this.f10979;
                    m7771(editText != null ? editText.getText() : null);
                }
            } else {
                c4017.m7798(this.f10957, 2);
                this.f10957 = null;
            }
            this.f10949 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f10948 != i) {
            if (i > 0) {
                this.f10948 = i;
            } else {
                this.f10948 = -1;
            }
            if (!this.f10949 || this.f10957 == null) {
                return;
            }
            EditText editText = this.f10979;
            m7771(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f10956 != i) {
            this.f10956 = i;
            m7768();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10941 != colorStateList) {
            this.f10941 = colorStateList;
            m7768();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f10955 != i) {
            this.f10955 = i;
            m7768();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10940 != colorStateList) {
            this.f10940 = colorStateList;
            m7768();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f10937 != colorStateList) {
            this.f10937 = colorStateList;
            m7769();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f10936 != colorStateList) {
            this.f10936 = colorStateList;
            if (m7770() || (this.f10957 != null && this.f10947)) {
                m7769();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10967 = colorStateList;
        this.f10971 = colorStateList;
        if (this.f10979 != null) {
            m7763(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m7752(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f10986.f11122.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f10986.f11122.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C4027 c4027 = this.f10986;
        c4027.m7828(i != 0 ? c4027.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        C4027 c4027 = this.f10986;
        Drawable drawableM8871 = i != 0 ? AbstractC4765.m8871(c4027.getContext(), i) : null;
        TextInputLayout textInputLayout = c4027.f11125;
        CheckableImageButton checkableImageButton = c4027.f11122;
        checkableImageButton.setImageDrawable(drawableM8871);
        if (drawableM8871 != null) {
            AbstractC3889.m7302(textInputLayout, checkableImageButton, c4027.f11109, c4027.f11108);
            AbstractC3889.m7306(textInputLayout, checkableImageButton, c4027.f11109);
        }
    }

    public void setEndIconMinSize(int i) {
        C4027 c4027 = this.f10986;
        if (i < 0) {
            c4027.getClass();
            C6755.m11869("endIconSize cannot be less than 0");
        } else if (i != c4027.f11107) {
            c4027.f11107 = i;
            CheckableImageButton checkableImageButton = c4027.f11122;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c4027.f11124;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f10986.m7827(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10986.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10986.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C4027 c4027 = this.f10986;
        c4027.f11106 = scaleType;
        c4027.f11122.setScaleType(scaleType);
        c4027.f11124.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C4027 c4027 = this.f10986;
        if (c4027.f11109 != colorStateList) {
            c4027.f11109 = colorStateList;
            AbstractC3889.m7302(c4027.f11125, c4027.f11122, colorStateList, c4027.f11108);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C4027 c4027 = this.f10986;
        if (c4027.f11108 != mode) {
            c4027.f11108 = mode;
            AbstractC3889.m7302(c4027.f11125, c4027.f11122, c4027.f11109, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f10986.m7831(z);
    }

    public void setError(CharSequence charSequence) {
        C4017 c4017 = this.f10950;
        if (!c4017.f11056) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c4017.m7791();
            return;
        }
        c4017.m7794();
        c4017.f11059 = charSequence;
        c4017.f11057.setText(charSequence);
        int i = c4017.f11054;
        if (i != 1) {
            c4017.f11058 = 1;
        }
        c4017.m7799(i, c4017.f11058, c4017.m7797(c4017.f11057, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C4017 c4017 = this.f10950;
        c4017.f11048 = i;
        C1072 c1072 = c4017.f11057;
        if (c1072 != null) {
            c1072.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C4017 c4017 = this.f10950;
        c4017.f11049 = charSequence;
        C1072 c1072 = c4017.f11057;
        if (c1072 != null) {
            c1072.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C4017 c4017 = this.f10950;
        TextInputLayout textInputLayout = c4017.f11060;
        if (c4017.f11056 == z) {
            return;
        }
        c4017.m7794();
        if (z) {
            C1072 c1072 = new C1072(c4017.f11061, null);
            c4017.f11057 = c1072;
            c1072.setId(C0328R.id.textinput_error);
            c4017.f11057.setTextAlignment(5);
            Typeface typeface = c4017.f11038;
            if (typeface != null) {
                c4017.f11057.setTypeface(typeface);
            }
            int i = c4017.f11052;
            c4017.f11052 = i;
            C1072 c10722 = c4017.f11057;
            if (c10722 != null) {
                c4017.f11060.m7767(c10722, i);
            }
            ColorStateList colorStateList = c4017.f11053;
            c4017.f11053 = colorStateList;
            C1072 c10723 = c4017.f11057;
            if (c10723 != null && colorStateList != null) {
                c10723.setTextColor(colorStateList);
            }
            CharSequence charSequence = c4017.f11049;
            c4017.f11049 = charSequence;
            C1072 c10724 = c4017.f11057;
            if (c10724 != null) {
                c10724.setContentDescription(charSequence);
            }
            int i2 = c4017.f11048;
            c4017.f11048 = i2;
            C1072 c10725 = c4017.f11057;
            if (c10725 != null) {
                c10725.setAccessibilityLiveRegion(i2);
            }
            c4017.f11057.setVisibility(4);
            c4017.m7796(c4017.f11057, 0);
        } else {
            c4017.m7791();
            c4017.m7798(c4017.f11057, 0);
            c4017.f11057 = null;
            textInputLayout.m7761();
            textInputLayout.m7753();
        }
        c4017.f11056 = z;
    }

    public void setErrorIconDrawable(int i) {
        C4027 c4027 = this.f10986;
        c4027.m7832(i != 0 ? AbstractC4765.m8871(c4027.getContext(), i) : null);
        AbstractC3889.m7306(c4027.f11125, c4027.f11124, c4027.f11118);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10986.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10986.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C4027 c4027 = this.f10986;
        if (c4027.f11118 != colorStateList) {
            c4027.f11118 = colorStateList;
            AbstractC3889.m7302(c4027.f11125, c4027.f11124, colorStateList, c4027.f11117);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C4027 c4027 = this.f10986;
        if (c4027.f11117 != mode) {
            c4027.f11117 = mode;
            AbstractC3889.m7302(c4027.f11125, c4027.f11124, c4027.f11118, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C4017 c4017 = this.f10950;
        c4017.f11052 = i;
        C1072 c1072 = c4017.f11057;
        if (c1072 != null) {
            c4017.f11060.m7767(c1072, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C4017 c4017 = this.f10950;
        c4017.f11053 = colorStateList;
        C1072 c1072 = c4017.f11057;
        if (c1072 == null || colorStateList == null) {
            return;
        }
        c1072.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f10973 != z) {
            this.f10973 = z;
            m7763(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C4017 c4017 = this.f10950;
        if (zIsEmpty) {
            if (c4017.f11051) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c4017.f11051) {
            setHelperTextEnabled(true);
        }
        c4017.m7794();
        c4017.f11050 = charSequence;
        c4017.f11041.setText(charSequence);
        int i = c4017.f11054;
        if (i != 2) {
            c4017.f11058 = 2;
        }
        c4017.m7799(i, c4017.f11058, c4017.m7797(c4017.f11041, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C4017 c4017 = this.f10950;
        c4017.f11039 = colorStateList;
        C1072 c1072 = c4017.f11041;
        if (c1072 == null || colorStateList == null) {
            return;
        }
        c1072.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C4017 c4017 = this.f10950;
        TextInputLayout textInputLayout = c4017.f11060;
        if (c4017.f11051 == z) {
            return;
        }
        c4017.m7794();
        if (z) {
            C1072 c1072 = new C1072(c4017.f11061, null);
            c4017.f11041 = c1072;
            c1072.setId(C0328R.id.textinput_helper_text);
            c4017.f11041.setTextAlignment(5);
            Typeface typeface = c4017.f11038;
            if (typeface != null) {
                c4017.f11041.setTypeface(typeface);
            }
            c4017.f11041.setVisibility(4);
            c4017.f11041.setImportantForAccessibility(2);
            int i = c4017.f11040;
            c4017.f11040 = i;
            C1072 c10722 = c4017.f11041;
            if (c10722 != null) {
                c10722.setTextAppearance(i);
            }
            ColorStateList colorStateList = c4017.f11039;
            c4017.f11039 = colorStateList;
            C1072 c10723 = c4017.f11041;
            if (c10723 != null && colorStateList != null) {
                c10723.setTextColor(colorStateList);
            }
            c4017.m7796(c4017.f11041, 1);
        } else {
            c4017.m7794();
            int i2 = c4017.f11054;
            if (i2 == 2) {
                c4017.f11058 = 0;
            }
            c4017.m7799(i2, c4017.f11058, c4017.m7797(c4017.f11041, ""));
            c4017.m7798(c4017.f11041, 1);
            c4017.f11041 = null;
            textInputLayout.m7761();
            textInputLayout.m7753();
        }
        c4017.f11051 = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C4017 c4017 = this.f10950;
        c4017.f11040 = i;
        C1072 c1072 = c4017.f11041;
        if (c1072 != null) {
            c1072.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f10976 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f10939) {
            this.f10939 = z;
            if (z) {
                CharSequence hint = this.f10979.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10938)) {
                        setHint(hint);
                    }
                    this.f10979.setHint((CharSequence) null);
                }
                this.f10934 = true;
            } else {
                this.f10934 = false;
                if (!TextUtils.isEmpty(this.f10938) && TextUtils.isEmpty(this.f10979.getHint())) {
                    this.f10979.setHint(this.f10938);
                }
                setHintInternal(null);
            }
            if (this.f10979 != null) {
                m7766();
            }
        }
    }

    public void setHintMaxLines(int i) {
        C3982 c3982 = this.f10974;
        if (i != c3982.f10829) {
            c3982.f10829 = i;
            c3982.m7730(false);
        }
        if (i != c3982.f10830) {
            c3982.f10830 = i;
            c3982.m7730(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        C3982 c3982 = this.f10974;
        TextInputLayout textInputLayout = c3982.f10808;
        C9483 c9483 = new C9483(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c9483.f24734;
        if (colorStateList != null) {
            c3982.f10823 = colorStateList;
        }
        float f = c9483.f24735;
        if (f != 0.0f) {
            c3982.f10825 = f;
        }
        ColorStateList colorStateList2 = c9483.f24727;
        if (colorStateList2 != null) {
            c3982.f10780 = colorStateList2;
        }
        c3982.f10783 = c9483.f24722;
        c3982.f10779 = c9483.f24733;
        c3982.f10784 = c9483.f24732;
        c3982.f10837 = c9483.f24737;
        C9486 c9486 = c3982.f10795;
        if (c9486 != null) {
            c9486.f24746 = true;
        }
        C3075 c3075 = new C3075(c3982, 13);
        c9483.m14916();
        c3982.f10795 = new C9486(c3075, c9483.f24731);
        c9483.m14915(textInputLayout.getContext(), c3982.f10795);
        c3982.m7730(false);
        this.f10971 = c3982.f10823;
        if (this.f10979 != null) {
            m7763(false, false);
            m7766();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10971 != colorStateList) {
            if (this.f10967 == null) {
                C3982 c3982 = this.f10974;
                if (c3982.f10823 != colorStateList) {
                    c3982.f10823 = colorStateList;
                    c3982.m7730(false);
                }
            }
            this.f10971 = colorStateList;
            if (this.f10979 != null) {
                m7763(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC4007 interfaceC4007) {
        this.f10946 = interfaceC4007;
    }

    public void setMaxEms(int i) {
        this.f10981 = i;
        EditText editText = this.f10979;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f10951 = i;
        EditText editText = this.f10979;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f10984 = i;
        EditText editText = this.f10979;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f10982 = i;
        EditText editText = this.f10979;
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
        C4027 c4027 = this.f10986;
        c4027.f11122.setContentDescription(i != 0 ? c4027.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C4027 c4027 = this.f10986;
        c4027.f11122.setImageDrawable(i != 0 ? AbstractC4765.m8871(c4027.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C4027 c4027 = this.f10986;
        if (z && c4027.f11120 != 1) {
            c4027.m7827(1);
        } else if (z) {
            c4027.getClass();
        } else {
            c4027.m7827(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C4027 c4027 = this.f10986;
        c4027.f11109 = colorStateList;
        AbstractC3889.m7302(c4027.f11125, c4027.f11122, colorStateList, c4027.f11108);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C4027 c4027 = this.f10986;
        c4027.f11108 = mode;
        AbstractC3889.m7302(c4027.f11125, c4027.f11122, c4027.f11109, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f10952 == null) {
            C1072 c1072 = new C1072(getContext(), null);
            this.f10952 = c1072;
            c1072.setId(C0328R.id.textinput_placeholder);
            this.f10952.setImportantForAccessibility(1);
            this.f10952.setAccessibilityLiveRegion(1);
            C8309 c8309M7755 = m7755();
            this.f10945 = c8309M7755;
            c8309M7755.f20613 = 67L;
            this.f10944 = m7755();
            setPlaceholderTextAppearance(this.f10942);
            setPlaceholderTextColor(this.f10943);
            AbstractC3103.m4804(this.f10952, new C3125(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f10953) {
                setPlaceholderTextEnabled(true);
            }
            this.f10954 = charSequence;
        }
        EditText editText = this.f10979;
        m7764(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f10942 = i;
        C1072 c1072 = this.f10952;
        if (c1072 != null) {
            c1072.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f10943 != colorStateList) {
            this.f10943 = colorStateList;
            C1072 c1072 = this.f10952;
            if (c1072 == null || colorStateList == null) {
                return;
            }
            c1072.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C4018 c4018 = this.f10985;
        c4018.getClass();
        c4018.f11074 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c4018.f11073.setText(charSequence);
        c4018.m7800();
    }

    public void setPrefixTextAppearance(int i) {
        this.f10985.f11073.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f10985.f11073.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C9469 c9469) {
        C9472 c9472 = this.f10935;
        if (c9472 == null || c9472.m14907() == c9469) {
            return;
        }
        this.f11009 = c9469;
        m7758();
    }

    public void setStartIconCheckable(boolean z) {
        this.f10985.f11068.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC4765.m8871(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C4018 c4018 = this.f10985;
        if (i < 0) {
            c4018.getClass();
            C6755.m11869("startIconSize cannot be less than 0");
        } else if (i != c4018.f11072) {
            c4018.f11072 = i;
            CheckableImageButton checkableImageButton = c4018.f11068;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10985.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10985.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C4018 c4018 = this.f10985;
        c4018.f11069 = scaleType;
        c4018.f11068.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C4018 c4018 = this.f10985;
        if (c4018.f11067 != colorStateList) {
            c4018.f11067 = colorStateList;
            AbstractC3889.m7302(c4018.f11075, c4018.f11068, colorStateList, c4018.f11071);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C4018 c4018 = this.f10985;
        if (c4018.f11071 != mode) {
            c4018.f11071 = mode;
            AbstractC3889.m7302(c4018.f11075, c4018.f11068, c4018.f11067, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f10985.m7802(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C4027 c4027 = this.f10986;
        c4027.getClass();
        c4027.f11116 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c4027.f11115.setText(charSequence);
        c4027.m7826();
    }

    public void setSuffixTextAppearance(int i) {
        this.f10986.f11115.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f10986.f11115.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C4008 c4008) {
        EditText editText = this.f10979;
        if (editText != null) {
            AbstractC3103.m4804(editText, c4008);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10998) {
            this.f10998 = typeface;
            this.f10974.m7723(typeface);
            C4017 c4017 = this.f10950;
            if (typeface != c4017.f11038) {
                c4017.f11038 = typeface;
                C1072 c1072 = c4017.f11057;
                if (c1072 != null) {
                    c1072.setTypeface(typeface);
                }
                C1072 c10722 = c4017.f11041;
                if (c10722 != null) {
                    c10722.setTypeface(typeface);
                }
            }
            C1072 c10723 = this.f10957;
            if (c10723 != null) {
                c10723.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m7753() {
        C1072 c1072;
        EditText editText;
        EditText editText2;
        if (this.f10935 == null || this.f10991 == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.f10979) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.f10979) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f11005 = this.f10959;
        } else if (m7770()) {
            if (this.f10961 != null) {
                m7754(z, z2);
            } else {
                this.f11005 = getErrorCurrentTextColors();
            }
        } else if (!this.f10947 || (c1072 = this.f10957) == null) {
            if (z) {
                this.f11005 = this.f10970;
            } else if (z2) {
                this.f11005 = this.f10969;
            } else {
                this.f11005 = this.f10972;
            }
        } else if (this.f10961 != null) {
            m7754(z, z2);
        } else {
            this.f11005 = c1072.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m7769();
        }
        C4027 c4027 = this.f10986;
        TextInputLayout textInputLayout = c4027.f11125;
        CheckableImageButton checkableImageButton = c4027.f11122;
        TextInputLayout textInputLayout2 = c4027.f11125;
        c4027.m7825();
        AbstractC3889.m7306(textInputLayout2, c4027.f11124, c4027.f11118);
        AbstractC3889.m7306(textInputLayout2, checkableImageButton, c4027.f11109);
        if (c4027.m7822() instanceof C4031) {
            if (!textInputLayout.m7770() || checkableImageButton.getDrawable() == null) {
                AbstractC3889.m7302(textInputLayout, checkableImageButton, c4027.f11109, c4027.f11108);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C4018 c4018 = this.f10985;
        AbstractC3889.m7306(c4018.f11075, c4018.f11068, c4018.f11067);
        if (this.f10991 == 2) {
            int i = this.f10989;
            if (z && isEnabled()) {
                this.f10989 = this.f11004;
            } else {
                this.f10989 = this.f10988;
            }
            if (this.f10989 != i && m7773() && !this.f10978) {
                if (m7773()) {
                    ((C4028) this.f10935).m7833(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m7775();
            }
        }
        if (this.f10991 == 1) {
            if (!isEnabled()) {
                this.f11001 = this.f10963;
            } else if (z2 && !z) {
                this.f11001 = this.f10958;
            } else if (z) {
                this.f11001 = this.f10962;
            } else {
                this.f11001 = this.f10960;
            }
        }
        m7758();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f10979;
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
    public final void m7754(boolean z, boolean z2) {
        int defaultColor = this.f10961.getDefaultColor();
        int colorForState = this.f10961.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f10961.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f11005 = colorForState2;
        } else if (z2) {
            this.f11005 = colorForState;
        } else {
            this.f11005 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8309 m7755() {
        C8309 c8309 = new C8309();
        c8309.f20614 = AbstractC7176.m12481(getContext(), C0328R.attr.motionDurationShort2, 87);
        c8309.f20608 = AbstractC7176.m12482(getContext(), C0328R.attr.motionEasingLinearInterpolator, AbstractC9501.f24813);
        return c8309;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m7756() {
        if (this.f10939) {
            int i = this.f10991;
            C3982 c3982 = this.f10974;
            if (i == 0) {
                return (int) c3982.m7718();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (c3982.m7718() / 2.0f);
                }
                float fM7718 = c3982.m7718();
                TextPaint textPaint = c3982.f10786;
                textPaint.setTextSize(c3982.f10825);
                textPaint.setTypeface(c3982.f10810);
                textPaint.setLetterSpacing(c3982.f10837);
                return Math.max(0, (int) (fM7718 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect m7757(Rect rect) {
        if (this.f10979 == null) {
            C3466.m5901();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f11003;
        rect2.bottom = i;
        int i2 = this.f10991;
        if (i2 == 1) {
            rect2.left = m7776(rect.left, z);
            rect2.top = rect.top + this.f10990;
            rect2.right = m7777(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = m7776(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = m7777(rect.right, z);
            return rect2;
        }
        rect2.left = this.f10979.getPaddingLeft() + i3;
        rect2.top = rect.top - m7756();
        rect2.right = rect.right - this.f10979.getPaddingRight();
        return rect2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7758() {
        int i;
        int i2;
        C9472 c9472 = this.f10935;
        if (c9472 == null) {
            return;
        }
        C9469 c9469M14907 = c9472.m14907();
        C9469 c9469 = this.f11009;
        if (c9469M14907 != c9469) {
            this.f10935.setShapeAppearanceModel(c9469);
        }
        if (this.f10991 == 2 && (i = this.f10989) > -1 && (i2 = this.f11005) != 0) {
            C9472 c94722 = this.f10935;
            c94722.f24669.f24638 = i;
            c94722.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C9470 c9470 = c94722.f24669;
            if (c9470.f24625 != colorStateListValueOf) {
                c9470.f24625 = colorStateListValueOf;
                c94722.onStateChange(c94722.getState());
            }
        }
        int iM13534 = this.f11001;
        if (this.f10991 == 1) {
            Integer numM10605 = AbstractC5894.m10605(getContext(), C0328R.attr.colorSurface);
            iM13534 = AbstractC8496.m13534(this.f11001, numM10605 != null ? numM10605.intValue() : 0);
        }
        this.f11001 = iM13534;
        this.f10935.m14900(ColorStateList.valueOf(iM13534));
        C9472 c94723 = this.f11011;
        if (c94723 != null && this.f11008 != null) {
            if (this.f10989 > -1 && this.f11005 != 0) {
                c94723.m14900(this.f10979.isFocused() ? ColorStateList.valueOf(this.f10972) : ColorStateList.valueOf(this.f11005));
                this.f11008.m14900(ColorStateList.valueOf(this.f11005));
            }
            invalidate();
        }
        m7765();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7759(float f) {
        C3982 c3982 = this.f10974;
        if (c3982.f10807 == f) {
            return;
        }
        int i = 0;
        if (this.f10975 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10975 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC7176.m12482(getContext(), C0328R.attr.motionEasingEmphasizedInterpolator, AbstractC9501.f24812));
            this.f10975.setDuration(AbstractC7176.m12481(getContext(), C0328R.attr.motionDurationMedium4, 167));
            this.f10975.addUpdateListener(new C4009(this, i));
        }
        this.f10975.setFloatValues(c3982.f10807, f);
        this.f10975.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7760() {
        if (this.f10979 == null || this.f10991 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f10979;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f10974.m7718() + this.f10980), this.f10979.getPaddingEnd(), getResources().getDimensionPixelSize(C0328R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f10979;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C0328R.dimen.material_filled_edittext_font_2_0_padding_top), this.f10979.getPaddingEnd(), getResources().getDimensionPixelSize(C0328R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (AbstractC8568.m13624(getContext())) {
            EditText editText3 = this.f10979;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(C0328R.dimen.material_filled_edittext_font_1_3_padding_top), this.f10979.getPaddingEnd(), getResources().getDimensionPixelSize(C0328R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7761() {
        Drawable background;
        C1072 c1072;
        EditText editText = this.f10979;
        if (editText == null || this.f10991 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1063.f1173;
        Drawable drawableMutate = background.mutate();
        if (m7770()) {
            drawableMutate.setColorFilter(C0977.m1099(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f10947 && (c1072 = this.f10957) != null) {
            drawableMutate.setColorFilter(C0977.m1099(c1072.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f10979.refreshDrawableState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7762() {
        boolean z;
        if (this.f10979 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C4018 c4018 = this.f10985;
            if (c4018.getMeasuredWidth() > 0) {
                int iMax = Math.max(0, c4018.getMeasuredWidth() - this.f10979.getPaddingLeft());
                if (this.f10999 == null || this.f10995 != iMax) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f10999 = colorDrawable;
                    this.f10995 = iMax;
                    colorDrawable.setBounds(0, 0, iMax, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f10979.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f10999;
                if (drawable != colorDrawable2) {
                    this.f10979.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                }
                z = false;
            } else {
                if (this.f10999 != null) {
                    Drawable[] compoundDrawablesRelative2 = this.f10979.getCompoundDrawablesRelative();
                    this.f10979.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.f10999 = null;
                    z = true;
                }
                z = false;
            }
        }
        C4027 c4027 = this.f10986;
        if ((c4027.m7819() || ((c4027.f11120 != 0 && c4027.m7820()) || c4027.f11116 != null)) && c4027.getMeasuredWidth() > 0) {
            int measuredWidth = c4027.f11115.getMeasuredWidth() - this.f10979.getPaddingRight();
            if (c4027.m7819()) {
                checkableImageButton = c4027.f11124;
            } else if (c4027.f11120 != 0 && c4027.m7820()) {
                checkableImageButton = c4027.f11122;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.f10979.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f10997;
            if (colorDrawable3 != null && this.f10996 != iMax2) {
                this.f10996 = iMax2;
                colorDrawable3.setBounds(0, 0, iMax2, 1);
                this.f10979.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f10997, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f10997 = colorDrawable4;
                this.f10996 = iMax2;
                colorDrawable4.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.f10997;
            if (drawable2 != colorDrawable5) {
                this.f10968 = drawable2;
                this.f10979.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f10997 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f10979.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f10997) {
                this.f10979.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f10968, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.f10997 = null;
            return z2;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7763(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C1072 c1072;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f10979;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f10979;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f10967;
        C3982 c3982 = this.f10974;
        if (colorStateList2 != null) {
            c3982.m7727(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f10967;
            int colorForState = this.f10959;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            c3982.m7727(ColorStateList.valueOf(colorForState));
        } else if (m7770()) {
            C1072 c10722 = this.f10950.f11057;
            c3982.m7727(c10722 != null ? c10722.getTextColors() : null);
        } else if (this.f10947 && (c1072 = this.f10957) != null) {
            c3982.m7727(c1072.getTextColors());
        } else if (z4 && (colorStateList = this.f10971) != null && c3982.f10823 != colorStateList) {
            c3982.f10823 = colorStateList;
            c3982.m7730(false);
        }
        C4027 c4027 = this.f10986;
        C4018 c4018 = this.f10985;
        if (z3 || !this.f10973 || (isEnabled() && z4)) {
            if (z2 || this.f10978) {
                ValueAnimator valueAnimator = this.f10975;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f10975.cancel();
                }
                if (z && this.f10976) {
                    m7759(1.0f);
                } else {
                    c3982.m7724(1.0f);
                }
                this.f10978 = false;
                if (m7773()) {
                    m7775();
                }
                EditText editText3 = this.f10979;
                m7764(editText3 != null ? editText3.getText() : null);
                c4018.f11066 = false;
                c4018.m7800();
                c4027.f11114 = false;
                c4027.m7826();
                return;
            }
            return;
        }
        if (z2 || !this.f10978) {
            ValueAnimator valueAnimator2 = this.f10975;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f10975.cancel();
            }
            if (z && this.f10976) {
                m7759(0.0f);
            } else {
                c3982.m7724(0.0f);
            }
            if (m7773() && !((C4028) this.f10935).f11127.f11128.isEmpty() && m7773()) {
                ((C4028) this.f10935).m7833(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f10978 = true;
            C1072 c10723 = this.f10952;
            if (c10723 != null && this.f10953) {
                c10723.setText((CharSequence) null);
                AbstractC8308.m13256(this.f10987, this.f10944);
                this.f10952.setVisibility(4);
            }
            c4018.f11066 = true;
            c4018.m7800();
            c4027.f11114 = true;
            c4027.m7826();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m7764(Editable editable) {
        ((C3775) this.f10946).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f10987;
        if (length != 0 || this.f10978) {
            C1072 c1072 = this.f10952;
            if (c1072 == null || !this.f10953) {
                return;
            }
            c1072.setText((CharSequence) null);
            AbstractC8308.m13256(frameLayout, this.f10944);
            this.f10952.setVisibility(4);
            return;
        }
        if (this.f10952 == null || !this.f10953 || TextUtils.isEmpty(this.f10954)) {
            return;
        }
        this.f10952.setText(this.f10954);
        AbstractC8308.m13256(frameLayout, this.f10945);
        this.f10952.setVisibility(0);
        this.f10952.bringToFront();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7765() {
        EditText editText = this.f10979;
        if (editText == null || this.f10935 == null) {
            return;
        }
        if ((this.f11010 || editText.getBackground() == null) && this.f10991 != 0) {
            this.f10979.setBackground(getEditTextBoxBackground());
            this.f11010 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7766() {
        if (this.f10991 != 1) {
            FrameLayout frameLayout = this.f10987;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM7756 = m7756();
            if (iM7756 != layoutParams.topMargin) {
                layoutParams.topMargin = iM7756;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7767(C1072 c1072, int i) {
        try {
            c1072.setTextAppearance(i);
            if (c1072.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c1072.setTextAppearance(605225506);
        c1072.setTextColor(getContext().getColor(C0328R.color.design_error));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7768() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1072 c1072 = this.f10957;
        if (c1072 != null) {
            m7767(c1072, this.f10947 ? this.f10956 : this.f10955);
            if (!this.f10947 && (colorStateList2 = this.f10940) != null) {
                this.f10957.setTextColor(colorStateList2);
            }
            if (!this.f10947 || (colorStateList = this.f10941) == null) {
                return;
            }
            this.f10957.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7769() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f10937;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM12599 = AbstractC7390.m12599(context.getTheme(), C0328R.attr.colorControlActivated);
            if (typedValueM12599 != null) {
                int i = typedValueM12599.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC8482.m13478(context, i);
                } else {
                    int i2 = typedValueM12599.data;
                    colorStateListValueOf = i2 != 0 ? ColorStateList.valueOf(i2) : null;
                }
            }
        }
        EditText editText = this.f10979;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f10979.getTextCursorDrawable().mutate();
        if ((m7770() || (this.f10957 != null && this.f10947)) && (colorStateList = this.f10936) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7770() {
        C4017 c4017 = this.f10950;
        return (c4017.f11058 != 1 || c4017.f11057 == null || TextUtils.isEmpty(c4017.f11059)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m7771(Editable editable) {
        ((C3775) this.f10946).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f10947;
        int i = this.f10948;
        if (i == -1) {
            this.f10957.setText(String.valueOf(length));
            this.f10957.setContentDescription(null);
            this.f10947 = false;
        } else {
            this.f10947 = length > i;
            Context context = getContext();
            this.f10957.setContentDescription(context.getString(this.f10947 ? C0328R.string.character_counter_overflowed_content_description : C0328R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f10948)));
            if (z != this.f10947) {
                m7768();
            }
            String str = C8423.f20930;
            C8423 c8423 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C8423.f20927 : C8423.f20928;
            C1072 c1072 = this.f10957;
            String string = getContext().getString(C0328R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f10948));
            c8423.getClass();
            C0911 c0911 = AbstractC8419.f20921;
            c1072.setText(string != null ? c8423.m13382(string).toString() : null);
        }
        if (this.f10979 == null || z == this.f10947) {
            return;
        }
        m7763(false, false);
        m7753();
        m7761();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C9472 m7772(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C0328R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f10979;
        float popupElevation = editText instanceof C4020 ? ((C4020) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C0328R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C0328R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C9465 c9465 = new C9465();
        C9465 c94652 = new C9465();
        C9465 c94653 = new C9465();
        C9465 c94654 = new C9465();
        int i = 0;
        C9452 c9452 = new C9452(i);
        C9452 c94522 = new C9452(i);
        C9452 c94523 = new C9452(i);
        C9452 c94524 = new C9452(i);
        C9457 c9457 = new C9457(f);
        C9457 c94572 = new C9457(f);
        C9457 c94573 = new C9457(dimensionPixelOffset);
        C9457 c94574 = new C9457(dimensionPixelOffset);
        C9469 c9469 = new C9469();
        c9469.f24616 = c9465;
        c9469.f24615 = c94652;
        c9469.f24614 = c94653;
        c9469.f24613 = c94654;
        c9469.f24612 = c9457;
        c9469.f24611 = c94572;
        c9469.f24618 = c94574;
        c9469.f24617 = c94573;
        c9469.f24621 = c9452;
        c9469.f24622 = c94522;
        c9469.f24619 = c94523;
        c9469.f24620 = c94524;
        EditText editText2 = this.f10979;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C4020 ? ((C4020) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C9472.f24641;
            dropDownBackgroundTintList = ColorStateList.valueOf(AbstractC5894.m10585(context, AbstractC7390.m12626(context, C9472.class.getSimpleName(), C0328R.attr.colorSurface)));
        }
        C9472 c9472 = new C9472();
        c9472.m14897(context);
        c9472.m14900(dropDownBackgroundTintList);
        c9472.m14899(popupElevation);
        c9472.setShapeAppearanceModel(c9469);
        C9470 c9470 = c9472.f24669;
        if (c9470.f24634 == null) {
            c9470.f24634 = new Rect();
        }
        c9472.f24669.f24634.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c9472.invalidateSelf();
        return c9472;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m7773() {
        return this.f10939 && !TextUtils.isEmpty(this.f10938) && (this.f10935 instanceof C4028);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7774() {
        int i = this.f10991;
        if (i == 0) {
            this.f10935 = null;
            this.f11011 = null;
            this.f11008 = null;
        } else if (i == 1) {
            this.f10935 = new C9472(this.f11009);
            this.f11011 = new C9472();
            this.f11008 = new C9472();
        } else {
            if (i != 2) {
                C6755.m11869(AbstractC0900.m707(new StringBuilder(), " is illegal; only @BoxBackgroundMode constants are supported.", this.f10991));
                return;
            }
            if (!this.f10939 || (this.f10935 instanceof C4028)) {
                this.f10935 = new C9472(this.f11009);
            } else {
                C9469 c9469 = this.f11009;
                int i2 = C4028.f11126;
                if (c9469 == null) {
                    c9469 = new C9469();
                }
                C4029 c4029 = new C4029(c9469, new RectF());
                C4028 c4028 = new C4028(c4029);
                c4028.f11127 = c4029;
                this.f10935 = c4028;
            }
            this.f11011 = null;
            this.f11008 = null;
        }
        m7765();
        m7753();
        if (this.f10991 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f10990 = getResources().getDimensionPixelSize(C0328R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC8568.m13624(getContext())) {
                this.f10990 = getResources().getDimensionPixelSize(C0328R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        m7760();
        if (this.f10991 != 0) {
            m7766();
        }
        EditText editText = this.f10979;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f10991;
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
    */
    public final void m7775() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (m7773()) {
            int width = this.f10979.getWidth();
            int gravity = this.f10979.getGravity();
            C3982 c3982 = this.f10974;
            boolean zM7721 = c3982.m7721(c3982.f10793);
            c3982.f10791 = zM7721;
            Rect rect = c3982.f10805;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM7721) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c3982.f10838;
                    }
                } else if (zM7721) {
                    f = rect.right;
                    f2 = c3982.f10838;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f11002;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c3982.f10838 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c3982.f10791) {
                        f5 = c3982.f10838;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c3982.f10791) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = c3982.f10838;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c3982.m7718() + rect.top;
                if (c3982.f10841 != null && !c3982.m7725()) {
                    StaticLayout staticLayout = c3982.f10841;
                    float lineWidth = (c3982.f10825 / c3982.f10821) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (c3982.f10791) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f10992;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f10989);
                rectF.top = 0.0f;
                C4028 c4028 = (C4028) this.f10935;
                c4028.getClass();
                c4028.m7833(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c3982.f10838 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f11002;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c3982.f10838 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c3982.m7718() + rect.top;
            if (c3982.f10841 != null) {
                StaticLayout staticLayout2 = c3982.f10841;
                float lineWidth2 = (c3982.f10825 / c3982.f10821) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (c3982.f10791) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7776(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f10979.getCompoundPaddingLeft() : this.f10986.m7821() : this.f10985.m7805()) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m7777(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f10979.getCompoundPaddingRight() : this.f10985.m7805() : this.f10986.m7821());
    }

    public void setHint(CharSequence charSequence) {
        if (this.f10939) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f10985.m7804(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10985.m7803(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f10986.m7828(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10986.f11122.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10986.f11122.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10986.m7832(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        C4027 c4027 = this.f10986;
        TextInputLayout textInputLayout = c4027.f11125;
        CheckableImageButton checkableImageButton = c4027.f11122;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC3889.m7302(textInputLayout, checkableImageButton, c4027.f11109, c4027.f11108);
            AbstractC3889.m7306(textInputLayout, checkableImageButton, c4027.f11109);
        }
    }
}
