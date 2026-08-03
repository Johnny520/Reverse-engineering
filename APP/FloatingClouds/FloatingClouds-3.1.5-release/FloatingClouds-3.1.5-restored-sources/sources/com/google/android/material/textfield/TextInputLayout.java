package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
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
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.transition.C1233c;
import androidx.transition.C1237g;
import com.google.android.material.C1247R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p000a.AbstractC0792r;
import p000a.C0014Ad;
import p000a.C0030Ba;
import p000a.C0038C;
import p000a.C0097F4;
import p000a.C0098F5;
import p000a.C0134H5;
import p000a.C0146I;
import p000a.C0167J2;
import p000a.C0181Jg;
import p000a.C0227M8;
import p000a.C0247Na;
import p000a.C0308R0;
import p000a.C0324Rg;
import p000a.C0336Sa;
import p000a.C0352T8;
import p000a.C0354Ta;
import p000a.C0370U8;
import p000a.C0393Vd;
import p000a.C0394Ve;
import p000a.C0402W4;
import p000a.C0408Wa;
import p000a.C0430Xe;
import p000a.C0434Y0;
import p000a.C0437Y3;
import p000a.C0523cf;
import p000a.C0567f2;
import p000a.C0720n3;
import p000a.C0726n9;
import p000a.C0751of;
import p000a.C0794r1;
import p000a.C0811s;
import p000a.C0826se;
import p000a.C0866ug;
import p000a.C0872v3;
import p000a.C0888w0;
import p000a.C0889w1;
import p000a.C0893w5;
import p000a.C0899wb;
import p000a.C0912x5;
import p000a.C0944z;
import p000a.C0955za;
import p000a.InterfaceC0892w4;
import p000a.RunnableC0221M2;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: C0 */
    public static final int f5877C0 = C1247R.style.Widget_Design_TextInputLayout;

    /* JADX INFO: renamed from: D0 */
    public static final int[][] f5878D0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A */
    public ColorStateList f5879A;

    /* JADX INFO: renamed from: A0 */
    public boolean f5880A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f5881B;

    /* JADX INFO: renamed from: B0 */
    public boolean f5882B0;

    /* JADX INFO: renamed from: C */
    public boolean f5883C;

    /* JADX INFO: renamed from: D */
    public CharSequence f5884D;

    /* JADX INFO: renamed from: E */
    public boolean f5885E;

    /* JADX INFO: renamed from: F */
    public C0354Ta f5886F;

    /* JADX INFO: renamed from: G */
    public C0354Ta f5887G;

    /* JADX INFO: renamed from: H */
    public StateListDrawable f5888H;

    /* JADX INFO: renamed from: I */
    public boolean f5889I;

    /* JADX INFO: renamed from: J */
    public C0354Ta f5890J;

    /* JADX INFO: renamed from: K */
    public C0354Ta f5891K;

    /* JADX INFO: renamed from: L */
    public C0393Vd f5892L;

    /* JADX INFO: renamed from: M */
    public boolean f5893M;

    /* JADX INFO: renamed from: N */
    public final int f5894N;

    /* JADX INFO: renamed from: O */
    public int f5895O;

    /* JADX INFO: renamed from: P */
    public int f5896P;

    /* JADX INFO: renamed from: Q */
    public int f5897Q;

    /* JADX INFO: renamed from: R */
    public int f5898R;

    /* JADX INFO: renamed from: S */
    public int f5899S;

    /* JADX INFO: renamed from: T */
    public int f5900T;

    /* JADX INFO: renamed from: U */
    public int f5901U;

    /* JADX INFO: renamed from: V */
    public final Rect f5902V;

    /* JADX INFO: renamed from: W */
    public final Rect f5903W;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f5904a;

    /* JADX INFO: renamed from: a0 */
    public final RectF f5905a0;

    /* JADX INFO: renamed from: b */
    public final C0826se f5906b;

    /* JADX INFO: renamed from: b0 */
    public Typeface f5907b0;

    /* JADX INFO: renamed from: c */
    public final C1318a f5908c;

    /* JADX INFO: renamed from: c0 */
    public ColorDrawable f5909c0;

    /* JADX INFO: renamed from: d */
    public EditText f5910d;

    /* JADX INFO: renamed from: d0 */
    public int f5911d0;

    /* JADX INFO: renamed from: e */
    public CharSequence f5912e;

    /* JADX INFO: renamed from: e0 */
    public final LinkedHashSet<InterfaceC1315f> f5913e0;

    /* JADX INFO: renamed from: f */
    public int f5914f;

    /* JADX INFO: renamed from: f0 */
    public ColorDrawable f5915f0;

    /* JADX INFO: renamed from: g */
    public int f5916g;

    /* JADX INFO: renamed from: g0 */
    public int f5917g0;

    /* JADX INFO: renamed from: h */
    public int f5918h;

    /* JADX INFO: renamed from: h0 */
    public Drawable f5919h0;

    /* JADX INFO: renamed from: i */
    public int f5920i;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f5921i0;

    /* JADX INFO: renamed from: j */
    public final C0352T8 f5922j;

    /* JADX INFO: renamed from: j0 */
    public ColorStateList f5923j0;

    /* JADX INFO: renamed from: k */
    public boolean f5924k;

    /* JADX INFO: renamed from: k0 */
    public int f5925k0;

    /* JADX INFO: renamed from: l */
    public int f5926l;

    /* JADX INFO: renamed from: l0 */
    public int f5927l0;

    /* JADX INFO: renamed from: m */
    public boolean f5928m;

    /* JADX INFO: renamed from: m0 */
    public int f5929m0;

    /* JADX INFO: renamed from: n */
    public InterfaceC1314e f5930n;

    /* JADX INFO: renamed from: n0 */
    public ColorStateList f5931n0;

    /* JADX INFO: renamed from: o */
    public C0794r1 f5932o;

    /* JADX INFO: renamed from: o0 */
    public int f5933o0;

    /* JADX INFO: renamed from: p */
    public int f5934p;

    /* JADX INFO: renamed from: p0 */
    public int f5935p0;

    /* JADX INFO: renamed from: q */
    public int f5936q;

    /* JADX INFO: renamed from: q0 */
    public int f5937q0;

    /* JADX INFO: renamed from: r */
    public CharSequence f5938r;

    /* JADX INFO: renamed from: r0 */
    public int f5939r0;

    /* JADX INFO: renamed from: s */
    public boolean f5940s;

    /* JADX INFO: renamed from: s0 */
    public int f5941s0;

    /* JADX INFO: renamed from: t */
    public C0794r1 f5942t;

    /* JADX INFO: renamed from: t0 */
    public int f5943t0;

    /* JADX INFO: renamed from: u */
    public ColorStateList f5944u;

    /* JADX INFO: renamed from: u0 */
    public boolean f5945u0;

    /* JADX INFO: renamed from: v */
    public int f5946v;

    /* JADX INFO: renamed from: v0 */
    public final C0720n3 f5947v0;

    /* JADX INFO: renamed from: w */
    public C1233c f5948w;

    /* JADX INFO: renamed from: w0 */
    public boolean f5949w0;

    /* JADX INFO: renamed from: x */
    public C1233c f5950x;

    /* JADX INFO: renamed from: x0 */
    public boolean f5951x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f5952y;

    /* JADX INFO: renamed from: y0 */
    public ValueAnimator f5953y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f5954z;

    /* JADX INFO: renamed from: z0 */
    public boolean f5955z0;

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C1310a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public int f5956a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EditText f5957b;

        public C1310a(EditText editText) {
            this.f5957b = editText;
            this.f5956a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m3276u(!textInputLayout.f5880A0, false);
            if (textInputLayout.f5924k) {
                textInputLayout.m3269n(editable);
            }
            if (textInputLayout.f5940s) {
                textInputLayout.m3277v(editable);
            }
            EditText editText = this.f5957b;
            int lineCount = editText.getLineCount();
            int i = this.f5956a;
            if (lineCount != i) {
                if (lineCount < i) {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    int minimumHeight = editText.getMinimumHeight();
                    int i2 = textInputLayout.f5943t0;
                    if (minimumHeight != i2) {
                        editText.setMinimumHeight(i2);
                    }
                }
                this.f5956a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class RunnableC1311b implements Runnable {
        public RunnableC1311b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f5908c.f5970g;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C1312c implements ValueAnimator.AnimatorUpdateListener {
        public C1312c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f5947v0.m1650k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public static class C1313d extends C0038C {

        /* JADX INFO: renamed from: d */
        public final TextInputLayout f5961d;

        public C1313d(TextInputLayout textInputLayout) {
            this.f5961d = textInputLayout;
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: d */
        public final void mo115d(View view, C0146I c0146i) {
            View.AccessibilityDelegate accessibilityDelegate = this.f137a;
            AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f5961d;
            EditText editText = textInputLayout.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z = textInputLayout.f5945u0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            C0826se c0826se = textInputLayout.f5906b;
            C0794r1 c0794r1 = c0826se.f3288b;
            if (c0794r1.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(c0794r1);
                accessibilityNodeInfo.setTraversalAfter(c0794r1);
            } else {
                accessibilityNodeInfo.setTraversalAfter(c0826se.f3290d);
            }
            if (!zIsEmpty) {
                accessibilityNodeInfo.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfo.setText(string);
                if (!z && placeholderText != null) {
                    accessibilityNodeInfo.setText(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfo.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfo.setHintText(string);
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z2) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            C0794r1 c0794r12 = textInputLayout.f5922j.f1280y;
            if (c0794r12 != null) {
                accessibilityNodeInfo.setLabelFor(c0794r12);
            }
            textInputLayout.f5908c.m3283b().mo271n(c0146i);
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: e */
        public final void mo116e(View view, AccessibilityEvent accessibilityEvent) {
            super.mo116e(view, accessibilityEvent);
            this.f5961d.f5908c.m3283b().mo272o(accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public interface InterfaceC1314e {
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC1315f {
        /* JADX INFO: renamed from: a */
        void mo3280a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC1316g {
        /* JADX INFO: renamed from: a */
        void m3281a();
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C1317h extends AbstractC0792r {
        public static final Parcelable.Creator<C1317h> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public CharSequence f5962c;

        /* JADX INFO: renamed from: d */
        public boolean f5963d;

        /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        public class a implements Parcelable.ClassLoaderCreator<C1317h> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1317h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1317h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1317h[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1317h(parcel, null);
            }
        }

        public C1317h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5962c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5963d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f5962c) + "}";
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f5962c, parcel, i);
            parcel.writeInt(this.f5963d ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.textInputStyle;
        int i2 = f5877C0;
        super(C0408Wa.m1054a(context, attributeSet, i, i2), attributeSet, i);
        this.f5914f = -1;
        this.f5916g = -1;
        this.f5918h = -1;
        this.f5920i = -1;
        this.f5922j = new C0352T8(this);
        this.f5930n = new C0944z(14);
        this.f5902V = new Rect();
        this.f5903W = new Rect();
        this.f5905a0 = new RectF();
        this.f5913e0 = new LinkedHashSet<>();
        C0720n3 c0720n3 = new C0720n3(this);
        this.f5947v0 = c0720n3;
        this.f5882B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f5904a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = C0888w0.f3468a;
        c0720n3.f2758Q = linearInterpolator;
        c0720n3.m1647h(false);
        c0720n3.f2757P = linearInterpolator;
        c0720n3.m1647h(false);
        if (c0720n3.f2780g != 8388659) {
            c0720n3.f2780g = 8388659;
            c0720n3.m1647h(false);
        }
        int[] iArr = C1247R.styleable.TextInputLayout;
        int[] iArr2 = {C1247R.styleable.TextInputLayout_counterTextAppearance, C1247R.styleable.TextInputLayout_counterOverflowTextAppearance, C1247R.styleable.TextInputLayout_errorTextAppearance, C1247R.styleable.TextInputLayout_helperTextTextAppearance, C1247R.styleable.TextInputLayout_hintTextAppearance};
        C0523cf.m1298a(context2, attributeSet, i, i2);
        C0523cf.m1299b(context2, attributeSet, iArr, i, i2, iArr2);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C0751of c0751of = new C0751of(context2, typedArrayObtainStyledAttributes);
        C0826se c0826se = new C0826se(this, c0751of);
        this.f5906b = c0826se;
        this.f5883C = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.TextInputLayout_hintEnabled, true);
        setHint(typedArrayObtainStyledAttributes.getText(C1247R.styleable.TextInputLayout_android_hint));
        this.f5951x0 = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.f5949w0 = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.TextInputLayout_expandedHintEnabled, true);
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_android_minEms)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(C1247R.styleable.TextInputLayout_android_minEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.TextInputLayout_android_minWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(C1247R.styleable.TextInputLayout_android_maxEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.TextInputLayout_android_maxWidth, -1));
        }
        this.f5892L = C0393Vd.m1023b(context2, attributeSet, i, i2).m1028a();
        this.f5894N = context2.getResources().getDimensionPixelOffset(C1247R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f5896P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1247R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f5898R = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C1247R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f5899S = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C1247R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f5897Q = this.f5898R;
        float dimension = typedArrayObtainStyledAttributes.getDimension(C1247R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C1247R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C1247R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(C1247R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C0393Vd.a aVarM1026e = this.f5892L.m1026e();
        if (dimension >= 0.0f) {
            aVarM1026e.f1498e = new C0811s(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVarM1026e.f1499f = new C0811s(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVarM1026e.f1500g = new C0811s(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVarM1026e.f1501h = new C0811s(dimension4);
        }
        this.f5892L = aVarM1026e.m1028a();
        ColorStateList colorStateListM924a = C0336Sa.m924a(context2, c0751of, C1247R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateListM924a != null) {
            int defaultColor = colorStateListM924a.getDefaultColor();
            this.f5933o0 = defaultColor;
            this.f5901U = defaultColor;
            if (colorStateListM924a.isStateful()) {
                this.f5935p0 = colorStateListM924a.getColorForState(new int[]{-16842910}, -1);
                this.f5937q0 = colorStateListM924a.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f5939r0 = colorStateListM924a.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f5937q0 = this.f5933o0;
                ColorStateList colorStateListM1091a = C0437Y3.m1091a(context2, C1247R.color.mtrl_filled_background_color);
                this.f5935p0 = colorStateListM1091a.getColorForState(new int[]{-16842910}, -1);
                this.f5939r0 = colorStateListM1091a.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f5901U = 0;
            this.f5933o0 = 0;
            this.f5935p0 = 0;
            this.f5937q0 = 0;
            this.f5939r0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListM1769a = c0751of.m1769a(C1247R.styleable.TextInputLayout_android_textColorHint);
            this.f5923j0 = colorStateListM1769a;
            this.f5921i0 = colorStateListM1769a;
        }
        ColorStateList colorStateListM924a2 = C0336Sa.m924a(context2, c0751of, C1247R.styleable.TextInputLayout_boxStrokeColor);
        this.f5929m0 = typedArrayObtainStyledAttributes.getColor(C1247R.styleable.TextInputLayout_boxStrokeColor, 0);
        this.f5925k0 = C0437Y3.b.m1095a(context2, C1247R.color.mtrl_textinput_default_box_stroke_color);
        this.f5941s0 = C0437Y3.b.m1095a(context2, C1247R.color.mtrl_textinput_disabled_color);
        this.f5927l0 = C0437Y3.b.m1095a(context2, C1247R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM924a2 != null) {
            setBoxStrokeColorStateList(colorStateListM924a2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(C0336Sa.m924a(context2, c0751of, C1247R.styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        this.f5879A = c0751of.m1769a(C1247R.styleable.TextInputLayout_cursorColor);
        this.f5881B = c0751of.m1769a(C1247R.styleable.TextInputLayout_cursorErrorColor);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(C1247R.styleable.TextInputLayout_errorContentDescription);
        int i3 = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(C1247R.styleable.TextInputLayout_helperText);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(C1247R.styleable.TextInputLayout_placeholderText);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(C1247R.styleable.TextInputLayout_counterMaxLength, -1));
        this.f5936q = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.f5934p = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(C1247R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.f5934p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f5936q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(c0751of.m1769a(C1247R.styleable.TextInputLayout_errorTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(c0751of.m1769a(C1247R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(c0751of.m1769a(C1247R.styleable.TextInputLayout_hintTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(c0751of.m1769a(C1247R.styleable.TextInputLayout_counterTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(c0751of.m1769a(C1247R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(c0751of.m1769a(C1247R.styleable.TextInputLayout_placeholderTextColor));
        }
        C1318a c1318a = new C1318a(this, c0751of);
        this.f5908c = c1318a;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.TextInputLayout_android_enabled, true);
        c0751of.m1773f();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        setImportantForAccessibility(2);
        C0866ug.f.m2051m(this, 1);
        frameLayout.addView(c0826se);
        frameLayout.addView(c1318a);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f5910d;
        if (!(editText instanceof AutoCompleteTextView) || C0889w1.m2120G(editText)) {
            return this.f5886F;
        }
        int iM684b = C0247Na.m684b(this.f5910d, C1247R.attr.colorControlHighlight);
        int i = this.f5895O;
        int[][] iArr = f5878D0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C0354Ta c0354Ta = this.f5886F;
            int i2 = this.f5901U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{C0247Na.m686d(iM684b, i2, 0.1f), i2}), c0354Ta, c0354Ta);
        }
        Context context = getContext();
        C0354Ta c0354Ta2 = this.f5886F;
        TypedValue typedValueM2246c = C0955za.m2246c(context, C1247R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM2246c.resourceId;
        int iM1095a = i3 != 0 ? C0437Y3.b.m1095a(context, i3) : typedValueM2246c.data;
        C0354Ta c0354Ta3 = new C0354Ta(c0354Ta2.f1310a.f1334a);
        int iM686d = C0247Na.m686d(iM684b, iM1095a, 0.1f);
        c0354Ta3.m967k(new ColorStateList(iArr, new int[]{iM686d, 0}));
        c0354Ta3.setTint(iM1095a);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM686d, iM1095a});
        C0354Ta c0354Ta4 = new C0354Ta(c0354Ta2.f1310a.f1334a);
        c0354Ta4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0354Ta3, c0354Ta4), c0354Ta2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f5888H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f5888H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f5888H.addState(new int[0], m3262f(false));
        }
        return this.f5888H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f5887G == null) {
            this.f5887G = m3262f(true);
        }
        return this.f5887G;
    }

    /* JADX INFO: renamed from: k */
    public static void m3256k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m3256k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f5910d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f5910d = editText;
        int i = this.f5914f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f5918h);
        }
        int i2 = this.f5916g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f5920i);
        }
        this.f5889I = false;
        m3265i();
        setTextInputAccessibilityDelegate(new C1313d(this));
        Typeface typeface = this.f5910d.getTypeface();
        C0720n3 c0720n3 = this.f5947v0;
        c0720n3.m1652m(typeface);
        float textSize = this.f5910d.getTextSize();
        if (c0720n3.f2781h != textSize) {
            c0720n3.f2781h = textSize;
            c0720n3.m1647h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f5910d.getLetterSpacing();
        if (c0720n3.f2764W != letterSpacing) {
            c0720n3.f2764W = letterSpacing;
            c0720n3.m1647h(false);
        }
        int gravity = this.f5910d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0720n3.f2780g != i4) {
            c0720n3.f2780g = i4;
            c0720n3.m1647h(false);
        }
        if (c0720n3.f2778f != gravity) {
            c0720n3.f2778f = gravity;
            c0720n3.m1647h(false);
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        this.f5943t0 = editText.getMinimumHeight();
        this.f5910d.addTextChangedListener(new C1310a(editText));
        if (this.f5921i0 == null) {
            this.f5921i0 = this.f5910d.getHintTextColors();
        }
        if (this.f5883C) {
            if (TextUtils.isEmpty(this.f5884D)) {
                CharSequence hint = this.f5910d.getHint();
                this.f5912e = hint;
                setHint(hint);
                this.f5910d.setHint((CharSequence) null);
            }
            this.f5885E = true;
        }
        if (i3 >= 29) {
            m3271p();
        }
        if (this.f5932o != null) {
            m3269n(this.f5910d.getText());
        }
        m3273r();
        this.f5922j.m945b();
        this.f5906b.bringToFront();
        C1318a c1318a = this.f5908c;
        c1318a.bringToFront();
        Iterator<InterfaceC1315f> it = this.f5913e0.iterator();
        while (it.hasNext()) {
            it.next().mo3280a(this);
        }
        c1318a.m3294m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m3276u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5884D)) {
            return;
        }
        this.f5884D = charSequence;
        C0720n3 c0720n3 = this.f5947v0;
        if (charSequence == null || !TextUtils.equals(c0720n3.f2742A, charSequence)) {
            c0720n3.f2742A = charSequence;
            c0720n3.f2743B = null;
            Bitmap bitmap = c0720n3.f2746E;
            if (bitmap != null) {
                bitmap.recycle();
                c0720n3.f2746E = null;
            }
            c0720n3.m1647h(false);
        }
        if (this.f5945u0) {
            return;
        }
        m3266j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f5940s == z) {
            return;
        }
        if (z) {
            C0794r1 c0794r1 = this.f5942t;
            if (c0794r1 != null) {
                this.f5904a.addView(c0794r1);
                this.f5942t.setVisibility(0);
            }
        } else {
            C0794r1 c0794r12 = this.f5942t;
            if (c0794r12 != null) {
                c0794r12.setVisibility(8);
            }
            this.f5942t = null;
        }
        this.f5940s = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m3257a(float f) {
        C0720n3 c0720n3 = this.f5947v0;
        if (c0720n3.f2770b == f) {
            return;
        }
        if (this.f5953y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5953y0 = valueAnimator;
            valueAnimator.setInterpolator(C0899wb.m2188d(getContext(), C1247R.attr.motionEasingEmphasizedInterpolator, C0888w0.f3469b));
            this.f5953y0.setDuration(C0899wb.m2187c(getContext(), C1247R.attr.motionDurationMedium4, 167));
            this.f5953y0.addUpdateListener(new C1312c());
        }
        this.f5953y0.setFloatValues(c0720n3.f2770b, f);
        this.f5953y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f5904a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m3275t();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m3258b() {
        int i;
        int i2;
        C0354Ta c0354Ta = this.f5886F;
        if (c0354Ta == null) {
            return;
        }
        C0393Vd c0393Vd = c0354Ta.f1310a.f1334a;
        C0393Vd c0393Vd2 = this.f5892L;
        if (c0393Vd != c0393Vd2) {
            c0354Ta.setShapeAppearanceModel(c0393Vd2);
        }
        if (this.f5895O == 2 && (i = this.f5897Q) > -1 && (i2 = this.f5900T) != 0) {
            C0354Ta c0354Ta2 = this.f5886F;
            c0354Ta2.f1310a.f1343j = i;
            c0354Ta2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C0354Ta.b bVar = c0354Ta2.f1310a;
            if (bVar.f1337d != colorStateListValueOf) {
                bVar.f1337d = colorStateListValueOf;
                c0354Ta2.onStateChange(c0354Ta2.getState());
            }
        }
        int iM2084b = this.f5901U;
        if (this.f5895O == 1) {
            iM2084b = C0872v3.m2084b(this.f5901U, C0247Na.m683a(getContext(), C1247R.attr.colorSurface, 0));
        }
        this.f5901U = iM2084b;
        this.f5886F.m967k(ColorStateList.valueOf(iM2084b));
        C0354Ta c0354Ta3 = this.f5890J;
        if (c0354Ta3 != null && this.f5891K != null) {
            if (this.f5897Q > -1 && this.f5900T != 0) {
                c0354Ta3.m967k(this.f5910d.isFocused() ? ColorStateList.valueOf(this.f5925k0) : ColorStateList.valueOf(this.f5900T));
                this.f5891K.m967k(ColorStateList.valueOf(this.f5900T));
            }
            invalidate();
        }
        m3274s();
    }

    /* JADX INFO: renamed from: c */
    public final int m3259c() {
        float fM1644d;
        if (!this.f5883C) {
            return 0;
        }
        int i = this.f5895O;
        C0720n3 c0720n3 = this.f5947v0;
        if (i == 0) {
            fM1644d = c0720n3.m1644d();
        } else {
            if (i != 2) {
                return 0;
            }
            fM1644d = c0720n3.m1644d() / 2.0f;
        }
        return (int) fM1644d;
    }

    /* JADX INFO: renamed from: d */
    public final C1233c m3260d() {
        C1233c c1233c = new C1233c();
        c1233c.f5240c = C0899wb.m2187c(getContext(), C1247R.attr.motionDurationShort2, 87);
        c1233c.f5241d = C0899wb.m2188d(getContext(), C1247R.attr.motionEasingLinearInterpolator, C0888w0.f3468a);
        return c1233c;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f5910d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f5912e != null) {
            boolean z = this.f5885E;
            this.f5885E = false;
            CharSequence hint = editText.getHint();
            this.f5910d.setHint(this.f5912e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f5910d.setHint(hint);
                this.f5885E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f5904a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f5910d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f5880A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f5880A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0354Ta c0354Ta;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f5883C;
        C0720n3 c0720n3 = this.f5947v0;
        if (z) {
            c0720n3.getClass();
            int iSave = canvas2.save();
            if (c0720n3.f2743B != null) {
                RectF rectF = c0720n3.f2776e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0720n3.f2755N;
                    textPaint.setTextSize(c0720n3.f2748G);
                    float f = c0720n3.f2789p;
                    float f2 = c0720n3.f2790q;
                    float f3 = c0720n3.f2747F;
                    if (f3 != 1.0f) {
                        canvas2.scale(f3, f3, f, f2);
                    }
                    if (c0720n3.f2775d0 <= 1 || c0720n3.f2744C) {
                        canvas2.translate(f, f2);
                        c0720n3.f2766Y.draw(canvas2);
                    } else {
                        float lineStart = c0720n3.f2789p - c0720n3.f2766Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c0720n3.f2771b0 * f4));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f5 = c0720n3.f2749H;
                            float f6 = c0720n3.f2750I;
                            float f7 = c0720n3.f2751J;
                            int i2 = c0720n3.f2752K;
                            textPaint.setShadowLayer(f5, f6, f7, C0872v3.m2086d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                        }
                        c0720n3.f2766Y.draw(canvas2);
                        textPaint.setAlpha((int) (c0720n3.f2769a0 * f4));
                        if (i >= 31) {
                            float f8 = c0720n3.f2749H;
                            float f9 = c0720n3.f2750I;
                            float f10 = c0720n3.f2751J;
                            int i3 = c0720n3.f2752K;
                            textPaint.setShadowLayer(f8, f9, f10, C0872v3.m2086d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c0720n3.f2766Y.getLineBaseline(0);
                        CharSequence charSequence = c0720n3.f2773c0;
                        float f11 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(c0720n3.f2749H, c0720n3.f2750I, c0720n3.f2751J, c0720n3.f2752K);
                        }
                        String strTrim = c0720n3.f2773c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(c0720n3.f2766Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(iSave);
                }
            }
        }
        if (this.f5891K == null || (c0354Ta = this.f5890J) == null) {
            return;
        }
        c0354Ta.draw(canvas2);
        if (this.f5910d.isFocused()) {
            Rect bounds = this.f5891K.getBounds();
            Rect bounds2 = this.f5890J.getBounds();
            float f12 = c0720n3.f2770b;
            int iCenterX = bounds2.centerX();
            bounds.left = C0888w0.m2114c(iCenterX, bounds2.left, f12);
            bounds.right = C0888w0.m2114c(iCenterX, bounds2.right, f12);
            this.f5891K.draw(canvas2);
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
        if (this.f5955z0) {
            return;
        }
        this.f5955z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0720n3 c0720n3 = this.f5947v0;
        if (c0720n3 != null) {
            c0720n3.f2753L = drawableState;
            ColorStateList colorStateList2 = c0720n3.f2784k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0720n3.f2783j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c0720n3.m1647h(false);
                z = true;
            }
        }
        if (this.f5910d != null) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            m3276u(isLaidOut() && isEnabled(), false);
        }
        m3273r();
        m3279x();
        if (z) {
            invalidate();
        }
        this.f5955z0 = false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3261e() {
        return this.f5883C && !TextUtils.isEmpty(this.f5884D) && (this.f5886F instanceof C0097F4);
    }

    /* JADX INFO: renamed from: f */
    public final C0354Ta m3262f(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C1247R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f5910d;
        float popupElevation = editText instanceof C0030Ba ? ((C0030Ba) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C1247R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C1247R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0014Ad c0014Ad = new C0014Ad();
        C0014Ad c0014Ad2 = new C0014Ad();
        C0014Ad c0014Ad3 = new C0014Ad();
        C0014Ad c0014Ad4 = new C0014Ad();
        C0134H5 c0134h5 = new C0134H5();
        C0134H5 c0134h52 = new C0134H5();
        C0134H5 c0134h53 = new C0134H5();
        C0134H5 c0134h54 = new C0134H5();
        C0811s c0811s = new C0811s(f);
        C0811s c0811s2 = new C0811s(f);
        C0811s c0811s3 = new C0811s(dimensionPixelOffset);
        C0811s c0811s4 = new C0811s(dimensionPixelOffset);
        C0393Vd c0393Vd = new C0393Vd();
        c0393Vd.f1482a = c0014Ad;
        c0393Vd.f1483b = c0014Ad2;
        c0393Vd.f1484c = c0014Ad3;
        c0393Vd.f1485d = c0014Ad4;
        c0393Vd.f1486e = c0811s;
        c0393Vd.f1487f = c0811s2;
        c0393Vd.f1488g = c0811s4;
        c0393Vd.f1489h = c0811s3;
        c0393Vd.f1490i = c0134h5;
        c0393Vd.f1491j = c0134h52;
        c0393Vd.f1492k = c0134h53;
        c0393Vd.f1493l = c0134h54;
        EditText editText2 = this.f5910d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0030Ba ? ((C0030Ba) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0354Ta.f1309x;
            TypedValue typedValueM2246c = C0955za.m2246c(context, C1247R.attr.colorSurface, C0354Ta.class.getSimpleName());
            int i = typedValueM2246c.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? C0437Y3.b.m1095a(context, i) : typedValueM2246c.data);
        }
        C0354Ta c0354Ta = new C0354Ta();
        c0354Ta.m965i(context);
        c0354Ta.m967k(dropDownBackgroundTintList);
        c0354Ta.m966j(popupElevation);
        c0354Ta.setShapeAppearanceModel(c0393Vd);
        C0354Ta.b bVar = c0354Ta.f1310a;
        if (bVar.f1340g == null) {
            bVar.f1340g = new Rect();
        }
        c0354Ta.f1310a.f1340g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0354Ta.invalidateSelf();
        return c0354Ta;
    }

    /* JADX INFO: renamed from: g */
    public final int m3263g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f5910d.getCompoundPaddingLeft() : this.f5908c.m3284c() : this.f5906b.m1926a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f5910d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m3259c() + getPaddingTop() + editText.getBaseline();
    }

    public C0354Ta getBoxBackground() {
        int i = this.f5895O;
        if (i == 1 || i == 2) {
            return this.f5886F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f5901U;
    }

    public int getBoxBackgroundMode() {
        return this.f5895O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f5896P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM895a = C0324Rg.m895a(this);
        RectF rectF = this.f5905a0;
        return zM895a ? this.f5892L.f1489h.mo1073a(rectF) : this.f5892L.f1488g.mo1073a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM895a = C0324Rg.m895a(this);
        RectF rectF = this.f5905a0;
        return zM895a ? this.f5892L.f1488g.mo1073a(rectF) : this.f5892L.f1489h.mo1073a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM895a = C0324Rg.m895a(this);
        RectF rectF = this.f5905a0;
        return zM895a ? this.f5892L.f1486e.mo1073a(rectF) : this.f5892L.f1487f.mo1073a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM895a = C0324Rg.m895a(this);
        RectF rectF = this.f5905a0;
        return zM895a ? this.f5892L.f1487f.mo1073a(rectF) : this.f5892L.f1486e.mo1073a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f5929m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f5931n0;
    }

    public int getBoxStrokeWidth() {
        return this.f5898R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f5899S;
    }

    public int getCounterMaxLength() {
        return this.f5926l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0794r1 c0794r1;
        if (this.f5924k && this.f5928m && (c0794r1 = this.f5932o) != null) {
            return c0794r1.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5954z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5952y;
    }

    public ColorStateList getCursorColor() {
        return this.f5879A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f5881B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f5921i0;
    }

    public EditText getEditText() {
        return this.f5910d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5908c.f5970g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f5908c.f5970g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f5908c.f5976m;
    }

    public int getEndIconMode() {
        return this.f5908c.f5972i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f5908c.f5977n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f5908c.f5970g;
    }

    public CharSequence getError() {
        C0352T8 c0352t8 = this.f5922j;
        if (c0352t8.f1272q) {
            return c0352t8.f1271p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f5922j.f1275t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f5922j.f1274s;
    }

    public int getErrorCurrentTextColors() {
        C0794r1 c0794r1 = this.f5922j.f1273r;
        if (c0794r1 != null) {
            return c0794r1.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f5908c.f5966c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0352T8 c0352t8 = this.f5922j;
        if (c0352t8.f1279x) {
            return c0352t8.f1278w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0794r1 c0794r1 = this.f5922j.f1280y;
        if (c0794r1 != null) {
            return c0794r1.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f5883C) {
            return this.f5884D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f5947v0.m1644d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0720n3 c0720n3 = this.f5947v0;
        return c0720n3.m1645e(c0720n3.f2784k);
    }

    public ColorStateList getHintTextColor() {
        return this.f5923j0;
    }

    public InterfaceC1314e getLengthCounter() {
        return this.f5930n;
    }

    public int getMaxEms() {
        return this.f5916g;
    }

    public int getMaxWidth() {
        return this.f5920i;
    }

    public int getMinEms() {
        return this.f5914f;
    }

    public int getMinWidth() {
        return this.f5918h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5908c.f5970g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5908c.f5970g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f5940s) {
            return this.f5938r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f5946v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f5944u;
    }

    public CharSequence getPrefixText() {
        return this.f5906b.f3289c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f5906b.f3288b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f5906b.f3288b;
    }

    public C0393Vd getShapeAppearanceModel() {
        return this.f5892L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5906b.f3290d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f5906b.f3290d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f5906b.f3293g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f5906b.f3294h;
    }

    public CharSequence getSuffixText() {
        return this.f5908c.f5979p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f5908c.f5980q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f5908c.f5980q;
    }

    public Typeface getTypeface() {
        return this.f5907b0;
    }

    /* JADX INFO: renamed from: h */
    public final int m3264h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f5910d.getCompoundPaddingRight() : this.f5906b.m1926a() : this.f5908c.m3284c());
    }

    /* JADX INFO: renamed from: i */
    public final void m3265i() {
        int i = this.f5895O;
        if (i == 0) {
            this.f5886F = null;
            this.f5890J = null;
            this.f5891K = null;
        } else if (i == 1) {
            this.f5886F = new C0354Ta(this.f5892L);
            this.f5890J = new C0354Ta();
            this.f5891K = new C0354Ta();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f5895O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f5883C || (this.f5886F instanceof C0097F4)) {
                this.f5886F = new C0354Ta(this.f5892L);
            } else {
                C0393Vd c0393Vd = this.f5892L;
                int i2 = C0097F4.f308z;
                if (c0393Vd == null) {
                    c0393Vd = new C0393Vd();
                }
                C0097F4.a aVar = new C0097F4.a(c0393Vd, new RectF());
                C0097F4.b bVar = new C0097F4.b(aVar);
                bVar.f309y = aVar;
                this.f5886F = bVar;
            }
            this.f5890J = null;
            this.f5891K = null;
        }
        m3274s();
        m3279x();
        if (this.f5895O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f5896P = getResources().getDimensionPixelSize(C1247R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (C0336Sa.m927d(getContext())) {
                this.f5896P = getResources().getDimensionPixelSize(C1247R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f5910d != null && this.f5895O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f5910d;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(C1247R.dimen.material_filled_edittext_font_2_0_padding_top), this.f5910d.getPaddingEnd(), getResources().getDimensionPixelSize(C1247R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C0336Sa.m927d(getContext())) {
                EditText editText2 = this.f5910d;
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C1247R.dimen.material_filled_edittext_font_1_3_padding_top), this.f5910d.getPaddingEnd(), getResources().getDimensionPixelSize(C1247R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f5895O != 0) {
            m3275t();
        }
        EditText editText3 = this.f5910d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f5895O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3266j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (m3261e()) {
            int width = this.f5910d.getWidth();
            int gravity = this.f5910d.getGravity();
            C0720n3 c0720n3 = this.f5947v0;
            boolean zM1642b = c0720n3.m1642b(c0720n3.f2742A);
            c0720n3.f2744C = zM1642b;
            Rect rect = c0720n3.f2774d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM1642b) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c0720n3.f2767Z;
                    }
                } else if (zM1642b) {
                    f = rect.right;
                    f2 = c0720n3.f2767Z;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f5905a0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c0720n3.f2767Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0720n3.f2744C) {
                        f5 = c0720n3.f2767Z;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c0720n3.f2744C) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = c0720n3.f2767Z;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0720n3.m1644d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f5894N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f5897Q);
                C0097F4 c0097f4 = (C0097F4) this.f5886F;
                c0097f4.getClass();
                c0097f4.m259o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c0720n3.f2767Z / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f5905a0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c0720n3.f2767Z / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c0720n3.m1644d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3267l(C0794r1 c0794r1, int i) {
        try {
            c0794r1.setTextAppearance(i);
            if (c0794r1.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0794r1.setTextAppearance(C1247R.style.TextAppearance_AppCompat_Caption);
        c0794r1.setTextColor(C0437Y3.b.m1095a(getContext(), C1247R.color.design_error));
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3268m() {
        C0352T8 c0352t8 = this.f5922j;
        return (c0352t8.f1270o != 1 || c0352t8.f1273r == null || TextUtils.isEmpty(c0352t8.f1271p)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m3269n(Editable editable) {
        ((C0944z) this.f5930n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f5928m;
        int i = this.f5926l;
        String string = null;
        if (i == -1) {
            this.f5932o.setText(String.valueOf(length));
            this.f5932o.setContentDescription(null);
            this.f5928m = false;
        } else {
            this.f5928m = length > i;
            Context context = getContext();
            this.f5932o.setContentDescription(context.getString(this.f5928m ? C1247R.string.character_counter_overflowed_content_description : C1247R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f5926l)));
            if (z != this.f5928m) {
                m3270o();
            }
            String str = C0567f2.f2114b;
            C0567f2 c0567f2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0567f2.f2117e : C0567f2.f2116d;
            C0794r1 c0794r1 = this.f5932o;
            String string2 = getContext().getString(C1247R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f5926l));
            if (string2 == null) {
                c0567f2.getClass();
            } else {
                c0567f2.getClass();
                C0430Xe.c cVar = C0430Xe.f1609a;
                string = c0567f2.m1410c(string2).toString();
            }
            c0794r1.setText(string);
        }
        if (this.f5910d == null || z == this.f5928m) {
            return;
        }
        m3276u(false, false);
        m3279x();
        m3273r();
    }

    /* JADX INFO: renamed from: o */
    public final void m3270o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0794r1 c0794r1 = this.f5932o;
        if (c0794r1 != null) {
            m3267l(c0794r1, this.f5928m ? this.f5934p : this.f5936q);
            if (!this.f5928m && (colorStateList2 = this.f5952y) != null) {
                this.f5932o.setTextColor(colorStateList2);
            }
            if (!this.f5928m || (colorStateList = this.f5954z) == null) {
                return;
            }
            this.f5932o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5947v0.m1646g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C1318a c1318a = this.f5908c;
        c1318a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f5882B0 = false;
        if (this.f5910d != null && this.f5910d.getMeasuredHeight() < (iMax = Math.max(c1318a.getMeasuredHeight(), this.f5906b.getMeasuredHeight()))) {
            this.f5910d.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM3272q = m3272q();
        if (z || zM3272q) {
            this.f5910d.post(new RunnableC0221M2(17, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f5910d;
        if (editText != null) {
            Rect rect = this.f5902V;
            C0402W4.m1048a(this, editText, rect);
            C0354Ta c0354Ta = this.f5890J;
            if (c0354Ta != null) {
                int i5 = rect.bottom;
                c0354Ta.setBounds(rect.left, i5 - this.f5898R, rect.right, i5);
            }
            C0354Ta c0354Ta2 = this.f5891K;
            if (c0354Ta2 != null) {
                int i6 = rect.bottom;
                c0354Ta2.setBounds(rect.left, i6 - this.f5899S, rect.right, i6);
            }
            if (this.f5883C) {
                float textSize = this.f5910d.getTextSize();
                C0720n3 c0720n3 = this.f5947v0;
                if (c0720n3.f2781h != textSize) {
                    c0720n3.f2781h = textSize;
                    c0720n3.m1647h(false);
                }
                int gravity = this.f5910d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0720n3.f2780g != i7) {
                    c0720n3.f2780g = i7;
                    c0720n3.m1647h(false);
                }
                if (c0720n3.f2778f != gravity) {
                    c0720n3.f2778f = gravity;
                    c0720n3.m1647h(false);
                }
                if (this.f5910d == null) {
                    throw new IllegalStateException();
                }
                boolean zM895a = C0324Rg.m895a(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f5903W;
                rect2.bottom = i8;
                int i9 = this.f5895O;
                if (i9 == 1) {
                    rect2.left = m3263g(rect.left, zM895a);
                    rect2.top = rect.top + this.f5896P;
                    rect2.right = m3264h(rect.right, zM895a);
                } else if (i9 != 2) {
                    rect2.left = m3263g(rect.left, zM895a);
                    rect2.top = getPaddingTop();
                    rect2.right = m3264h(rect.right, zM895a);
                } else {
                    rect2.left = this.f5910d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m3259c();
                    rect2.right = rect.right - this.f5910d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0720n3.f2774d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0720n3.f2754M = true;
                }
                if (this.f5910d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0720n3.f2756O;
                textPaint.setTextSize(c0720n3.f2781h);
                textPaint.setTypeface(c0720n3.f2794u);
                textPaint.setLetterSpacing(c0720n3.f2764W);
                float f = -textPaint.ascent();
                rect2.left = this.f5910d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f5895O != 1 || this.f5910d.getMinLines() > 1) ? rect.top + this.f5910d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f5910d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f5895O != 1 || this.f5910d.getMinLines() > 1) ? rect.bottom - this.f5910d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0720n3.f2772c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0720n3.f2754M = true;
                }
                c0720n3.m1647h(false);
                if (!m3261e() || this.f5945u0) {
                    return;
                }
                m3266j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f5882B0;
        C1318a c1318a = this.f5908c;
        if (!z) {
            c1318a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f5882B0 = true;
        }
        if (this.f5942t != null && (editText = this.f5910d) != null) {
            this.f5942t.setGravity(editText.getGravity());
            this.f5942t.setPadding(this.f5910d.getCompoundPaddingLeft(), this.f5910d.getCompoundPaddingTop(), this.f5910d.getCompoundPaddingRight(), this.f5910d.getCompoundPaddingBottom());
        }
        c1318a.m3294m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1317h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1317h c1317h = (C1317h) parcelable;
        super.onRestoreInstanceState(c1317h.f3119a);
        setError(c1317h.f5962c);
        if (c1317h.f5963d) {
            post(new RunnableC1311b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f5893M) {
            InterfaceC0892w4 interfaceC0892w4 = this.f5892L.f1486e;
            RectF rectF = this.f5905a0;
            float fMo1073a = interfaceC0892w4.mo1073a(rectF);
            float fMo1073a2 = this.f5892L.f1487f.mo1073a(rectF);
            float fMo1073a3 = this.f5892L.f1489h.mo1073a(rectF);
            float fMo1073a4 = this.f5892L.f1488g.mo1073a(rectF);
            C0393Vd c0393Vd = this.f5892L;
            C0889w1 c0889w1 = c0393Vd.f1482a;
            C0889w1 c0889w12 = c0393Vd.f1483b;
            C0889w1 c0889w13 = c0393Vd.f1485d;
            C0889w1 c0889w14 = c0393Vd.f1484c;
            new C0014Ad();
            new C0014Ad();
            new C0014Ad();
            new C0014Ad();
            C0134H5 c0134h5 = new C0134H5();
            C0134H5 c0134h52 = new C0134H5();
            C0134H5 c0134h53 = new C0134H5();
            C0134H5 c0134h54 = new C0134H5();
            C0393Vd.a.m1027b(c0889w12);
            C0393Vd.a.m1027b(c0889w1);
            C0393Vd.a.m1027b(c0889w14);
            C0393Vd.a.m1027b(c0889w13);
            C0811s c0811s = new C0811s(fMo1073a2);
            C0811s c0811s2 = new C0811s(fMo1073a);
            C0811s c0811s3 = new C0811s(fMo1073a4);
            C0811s c0811s4 = new C0811s(fMo1073a3);
            C0393Vd c0393Vd2 = new C0393Vd();
            c0393Vd2.f1482a = c0889w12;
            c0393Vd2.f1483b = c0889w1;
            c0393Vd2.f1484c = c0889w13;
            c0393Vd2.f1485d = c0889w14;
            c0393Vd2.f1486e = c0811s;
            c0393Vd2.f1487f = c0811s2;
            c0393Vd2.f1488g = c0811s4;
            c0393Vd2.f1489h = c0811s3;
            c0393Vd2.f1490i = c0134h5;
            c0393Vd2.f1491j = c0134h52;
            c0393Vd2.f1492k = c0134h53;
            c0393Vd2.f1493l = c0134h54;
            this.f5893M = z;
            setShapeAppearanceModel(c0393Vd2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1317h c1317h = new C1317h(super.onSaveInstanceState());
        if (m3268m()) {
            c1317h.f5962c = getError();
        }
        C1318a c1318a = this.f5908c;
        c1317h.f5963d = c1318a.f5972i != 0 && c1318a.f5970g.f5799d;
        return c1317h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3271p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f5879A;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM2244a = C0955za.m2244a(context, C1247R.attr.colorControlActivated);
            if (typedValueM2244a != null) {
                int i = typedValueM2244a.resourceId;
                if (i != 0) {
                    colorStateListValueOf = C0437Y3.m1091a(context, i);
                } else {
                    int i2 = typedValueM2244a.data;
                    colorStateListValueOf = i2 != 0 ? ColorStateList.valueOf(i2) : null;
                }
            }
        }
        EditText editText = this.f5910d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f5910d.getTextCursorDrawable().mutate();
        if ((m3268m() || (this.f5932o != null && this.f5928m)) && (colorStateList = this.f5881B) != null) {
            colorStateListValueOf = colorStateList;
        }
        C0893w5.a.m2176h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3272q() {
        boolean z;
        if (this.f5910d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C0826se c0826se = this.f5906b;
            if (c0826se.getMeasuredWidth() > 0) {
                int measuredWidth = c0826se.getMeasuredWidth() - this.f5910d.getPaddingLeft();
                if (this.f5909c0 == null || this.f5911d0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f5909c0 = colorDrawable;
                    this.f5911d0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f5910d.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f5909c0;
                if (drawable != colorDrawable2) {
                    this.f5910d.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                }
                z = false;
            } else {
                if (this.f5909c0 != null) {
                    Drawable[] compoundDrawablesRelative2 = this.f5910d.getCompoundDrawablesRelative();
                    this.f5910d.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.f5909c0 = null;
                    z = true;
                }
                z = false;
            }
        }
        C1318a c1318a = this.f5908c;
        if ((c1318a.m3286e() || ((c1318a.f5972i != 0 && c1318a.m3285d()) || c1318a.f5979p != null)) && c1318a.getMeasuredWidth() > 0) {
            int measuredWidth2 = c1318a.f5980q.getMeasuredWidth() - this.f5910d.getPaddingRight();
            if (c1318a.m3286e()) {
                checkableImageButton = c1318a.f5966c;
            } else if (c1318a.f5972i != 0 && c1318a.m3285d()) {
                checkableImageButton = c1318a.f5970g;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f5910d.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f5915f0;
            if (colorDrawable3 != null && this.f5917g0 != measuredWidth2) {
                this.f5917g0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f5910d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f5915f0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f5915f0 = colorDrawable4;
                this.f5917g0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.f5915f0;
            if (drawable2 != colorDrawable5) {
                this.f5919h0 = drawable2;
                this.f5910d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f5915f0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f5910d.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f5915f0) {
                this.f5910d.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f5919h0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.f5915f0 = null;
            return z2;
        }
        return z;
    }

    /* JADX INFO: renamed from: r */
    public final void m3273r() {
        Drawable background;
        C0794r1 c0794r1;
        EditText editText = this.f5910d;
        if (editText == null || this.f5895O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = C0912x5.f3515a;
        Drawable drawableMutate = background.mutate();
        if (m3268m()) {
            drawableMutate.setColorFilter(C0434Y0.m1081c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f5928m && (c0794r1 = this.f5932o) != null) {
            drawableMutate.setColorFilter(C0434Y0.m1081c(c0794r1.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f5910d.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3274s() {
        EditText editText = this.f5910d;
        if (editText == null || this.f5886F == null) {
            return;
        }
        if ((this.f5889I || editText.getBackground() == null) && this.f5895O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f5910d;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            editText2.setBackground(editTextBoxBackground);
            this.f5889I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f5901U != i) {
            this.f5901U = i;
            this.f5933o0 = i;
            this.f5937q0 = i;
            this.f5939r0 = i;
            m3258b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0437Y3.b.m1095a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f5933o0 = defaultColor;
        this.f5901U = defaultColor;
        this.f5935p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f5937q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f5939r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m3258b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f5895O) {
            return;
        }
        this.f5895O = i;
        if (this.f5910d != null) {
            m3265i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f5896P = i;
    }

    public void setBoxCornerFamily(int i) {
        C0393Vd.a aVarM1026e = this.f5892L.m1026e();
        InterfaceC0892w4 interfaceC0892w4 = this.f5892L.f1486e;
        C0889w1 c0889w1M1669l = C0726n9.m1669l(i);
        aVarM1026e.f1494a = c0889w1M1669l;
        C0393Vd.a.m1027b(c0889w1M1669l);
        aVarM1026e.f1498e = interfaceC0892w4;
        InterfaceC0892w4 interfaceC0892w42 = this.f5892L.f1487f;
        C0889w1 c0889w1M1669l2 = C0726n9.m1669l(i);
        aVarM1026e.f1495b = c0889w1M1669l2;
        C0393Vd.a.m1027b(c0889w1M1669l2);
        aVarM1026e.f1499f = interfaceC0892w42;
        InterfaceC0892w4 interfaceC0892w43 = this.f5892L.f1489h;
        C0889w1 c0889w1M1669l3 = C0726n9.m1669l(i);
        aVarM1026e.f1497d = c0889w1M1669l3;
        C0393Vd.a.m1027b(c0889w1M1669l3);
        aVarM1026e.f1501h = interfaceC0892w43;
        InterfaceC0892w4 interfaceC0892w44 = this.f5892L.f1488g;
        C0889w1 c0889w1M1669l4 = C0726n9.m1669l(i);
        aVarM1026e.f1496c = c0889w1M1669l4;
        C0393Vd.a.m1027b(c0889w1M1669l4);
        aVarM1026e.f1500g = interfaceC0892w44;
        this.f5892L = aVarM1026e.m1028a();
        m3258b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f5929m0 != i) {
            this.f5929m0 = i;
            m3279x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f5925k0 = colorStateList.getDefaultColor();
            this.f5941s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f5927l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f5929m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f5929m0 != colorStateList.getDefaultColor()) {
            this.f5929m0 = colorStateList.getDefaultColor();
        }
        m3279x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f5931n0 != colorStateList) {
            this.f5931n0 = colorStateList;
            m3279x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f5898R = i;
        m3279x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f5899S = i;
        m3279x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f5924k != z) {
            C0352T8 c0352t8 = this.f5922j;
            if (z) {
                C0794r1 c0794r1 = new C0794r1(getContext(), null);
                this.f5932o = c0794r1;
                c0794r1.setId(C1247R.id.textinput_counter);
                Typeface typeface = this.f5907b0;
                if (typeface != null) {
                    this.f5932o.setTypeface(typeface);
                }
                this.f5932o.setMaxLines(1);
                c0352t8.m944a(this.f5932o, 2);
                ((ViewGroup.MarginLayoutParams) this.f5932o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C1247R.dimen.mtrl_textinput_counter_margin_start));
                m3270o();
                if (this.f5932o != null) {
                    EditText editText = this.f5910d;
                    m3269n(editText != null ? editText.getText() : null);
                }
            } else {
                c0352t8.m950g(this.f5932o, 2);
                this.f5932o = null;
            }
            this.f5924k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f5926l != i) {
            if (i > 0) {
                this.f5926l = i;
            } else {
                this.f5926l = -1;
            }
            if (!this.f5924k || this.f5932o == null) {
                return;
            }
            EditText editText = this.f5910d;
            m3269n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f5934p != i) {
            this.f5934p = i;
            m3270o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5954z != colorStateList) {
            this.f5954z = colorStateList;
            m3270o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f5936q != i) {
            this.f5936q = i;
            m3270o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5952y != colorStateList) {
            this.f5952y = colorStateList;
            m3270o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f5879A != colorStateList) {
            this.f5879A = colorStateList;
            m3271p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f5881B != colorStateList) {
            this.f5881B = colorStateList;
            if (m3268m() || (this.f5932o != null && this.f5928m)) {
                m3271p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f5921i0 = colorStateList;
        this.f5923j0 = colorStateList;
        if (this.f5910d != null) {
            m3276u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m3256k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f5908c.f5970g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f5908c.f5970g.setCheckable(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconContentDescription(int i) {
        C1318a c1318a = this.f5908c;
        CharSequence text = i != 0 ? c1318a.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c1318a.f5970g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconDrawable(int i) {
        C1318a c1318a = this.f5908c;
        Drawable drawableM2115A = i != 0 ? C0889w1.m2115A(c1318a.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c1318a.f5970g;
        checkableImageButton.setImageDrawable(drawableM2115A);
        if (drawableM2115A != null) {
            ColorStateList colorStateList = c1318a.f5974k;
            PorterDuff.Mode mode = c1318a.f5975l;
            TextInputLayout textInputLayout = c1318a.f5964a;
            C0227M8.m617a(textInputLayout, checkableImageButton, colorStateList, mode);
            C0227M8.m619c(textInputLayout, checkableImageButton, c1318a.f5974k);
        }
    }

    public void setEndIconMinSize(int i) {
        C1318a c1318a = this.f5908c;
        if (i < 0) {
            c1318a.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c1318a.f5976m) {
            c1318a.f5976m = i;
            CheckableImageButton checkableImageButton = c1318a.f5970g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c1318a.f5966c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f5908c.m3288g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C1318a c1318a = this.f5908c;
        View.OnLongClickListener onLongClickListener = c1318a.f5978o;
        CheckableImageButton checkableImageButton = c1318a.f5970g;
        checkableImageButton.setOnClickListener(onClickListener);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1318a c1318a = this.f5908c;
        c1318a.f5978o = onLongClickListener;
        CheckableImageButton checkableImageButton = c1318a.f5970g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C1318a c1318a = this.f5908c;
        c1318a.f5977n = scaleType;
        c1318a.f5970g.setScaleType(scaleType);
        c1318a.f5966c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C1318a c1318a = this.f5908c;
        if (c1318a.f5974k != colorStateList) {
            c1318a.f5974k = colorStateList;
            C0227M8.m617a(c1318a.f5964a, c1318a.f5970g, colorStateList, c1318a.f5975l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C1318a c1318a = this.f5908c;
        if (c1318a.f5975l != mode) {
            c1318a.f5975l = mode;
            C0227M8.m617a(c1318a.f5964a, c1318a.f5970g, c1318a.f5974k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f5908c.m3289h(z);
    }

    public void setError(CharSequence charSequence) {
        C0352T8 c0352t8 = this.f5922j;
        if (!c0352t8.f1272q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0352t8.m949f();
            return;
        }
        c0352t8.m946c();
        c0352t8.f1271p = charSequence;
        c0352t8.f1273r.setText(charSequence);
        int i = c0352t8.f1269n;
        if (i != 1) {
            c0352t8.f1270o = 1;
        }
        c0352t8.m952i(i, c0352t8.f1270o, c0352t8.m951h(c0352t8.f1273r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0352T8 c0352t8 = this.f5922j;
        c0352t8.f1275t = i;
        C0794r1 c0794r1 = c0352t8.f1273r;
        if (c0794r1 != null) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            c0794r1.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0352T8 c0352t8 = this.f5922j;
        c0352t8.f1274s = charSequence;
        C0794r1 c0794r1 = c0352t8.f1273r;
        if (c0794r1 != null) {
            c0794r1.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C0352T8 c0352t8 = this.f5922j;
        if (c0352t8.f1272q == z) {
            return;
        }
        c0352t8.m946c();
        TextInputLayout textInputLayout = c0352t8.f1263h;
        if (z) {
            C0794r1 c0794r1 = new C0794r1(c0352t8.f1262g, null);
            c0352t8.f1273r = c0794r1;
            c0794r1.setId(C1247R.id.textinput_error);
            c0352t8.f1273r.setTextAlignment(5);
            Typeface typeface = c0352t8.f1255B;
            if (typeface != null) {
                c0352t8.f1273r.setTypeface(typeface);
            }
            int i = c0352t8.f1276u;
            c0352t8.f1276u = i;
            C0794r1 c0794r12 = c0352t8.f1273r;
            if (c0794r12 != null) {
                textInputLayout.m3267l(c0794r12, i);
            }
            ColorStateList colorStateList = c0352t8.f1277v;
            c0352t8.f1277v = colorStateList;
            C0794r1 c0794r13 = c0352t8.f1273r;
            if (c0794r13 != null && colorStateList != null) {
                c0794r13.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0352t8.f1274s;
            c0352t8.f1274s = charSequence;
            C0794r1 c0794r14 = c0352t8.f1273r;
            if (c0794r14 != null) {
                c0794r14.setContentDescription(charSequence);
            }
            int i2 = c0352t8.f1275t;
            c0352t8.f1275t = i2;
            C0794r1 c0794r15 = c0352t8.f1273r;
            if (c0794r15 != null) {
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                c0794r15.setAccessibilityLiveRegion(i2);
            }
            c0352t8.f1273r.setVisibility(4);
            c0352t8.m944a(c0352t8.f1273r, 0);
        } else {
            c0352t8.m949f();
            c0352t8.m950g(c0352t8.f1273r, 0);
            c0352t8.f1273r = null;
            textInputLayout.m3273r();
            textInputLayout.m3279x();
        }
        c0352t8.f1272q = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconDrawable(int i) {
        C1318a c1318a = this.f5908c;
        c1318a.m3290i(i != 0 ? C0889w1.m2115A(c1318a.getContext(), i) : null);
        C0227M8.m619c(c1318a.f5964a, c1318a.f5966c, c1318a.f5967d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C1318a c1318a = this.f5908c;
        CheckableImageButton checkableImageButton = c1318a.f5966c;
        View.OnLongClickListener onLongClickListener = c1318a.f5969f;
        checkableImageButton.setOnClickListener(onClickListener);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1318a c1318a = this.f5908c;
        c1318a.f5969f = onLongClickListener;
        CheckableImageButton checkableImageButton = c1318a.f5966c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C1318a c1318a = this.f5908c;
        if (c1318a.f5967d != colorStateList) {
            c1318a.f5967d = colorStateList;
            C0227M8.m617a(c1318a.f5964a, c1318a.f5966c, colorStateList, c1318a.f5968e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C1318a c1318a = this.f5908c;
        if (c1318a.f5968e != mode) {
            c1318a.f5968e = mode;
            C0227M8.m617a(c1318a.f5964a, c1318a.f5966c, c1318a.f5967d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0352T8 c0352t8 = this.f5922j;
        c0352t8.f1276u = i;
        C0794r1 c0794r1 = c0352t8.f1273r;
        if (c0794r1 != null) {
            c0352t8.f1263h.m3267l(c0794r1, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0352T8 c0352t8 = this.f5922j;
        c0352t8.f1277v = colorStateList;
        C0794r1 c0794r1 = c0352t8.f1273r;
        if (c0794r1 == null || colorStateList == null) {
            return;
        }
        c0794r1.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f5949w0 != z) {
            this.f5949w0 = z;
            m3276u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0352T8 c0352t8 = this.f5922j;
        if (zIsEmpty) {
            if (c0352t8.f1279x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0352t8.f1279x) {
            setHelperTextEnabled(true);
        }
        c0352t8.m946c();
        c0352t8.f1278w = charSequence;
        c0352t8.f1280y.setText(charSequence);
        int i = c0352t8.f1269n;
        if (i != 2) {
            c0352t8.f1270o = 2;
        }
        c0352t8.m952i(i, c0352t8.f1270o, c0352t8.m951h(c0352t8.f1280y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0352T8 c0352t8 = this.f5922j;
        c0352t8.f1254A = colorStateList;
        C0794r1 c0794r1 = c0352t8.f1280y;
        if (c0794r1 == null || colorStateList == null) {
            return;
        }
        c0794r1.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C0352T8 c0352t8 = this.f5922j;
        if (c0352t8.f1279x == z) {
            return;
        }
        c0352t8.m946c();
        if (z) {
            C0794r1 c0794r1 = new C0794r1(c0352t8.f1262g, null);
            c0352t8.f1280y = c0794r1;
            c0794r1.setId(C1247R.id.textinput_helper_text);
            c0352t8.f1280y.setTextAlignment(5);
            Typeface typeface = c0352t8.f1255B;
            if (typeface != null) {
                c0352t8.f1280y.setTypeface(typeface);
            }
            c0352t8.f1280y.setVisibility(4);
            C0794r1 c0794r12 = c0352t8.f1280y;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            c0794r12.setAccessibilityLiveRegion(1);
            int i = c0352t8.f1281z;
            c0352t8.f1281z = i;
            C0794r1 c0794r13 = c0352t8.f1280y;
            if (c0794r13 != null) {
                c0794r13.setTextAppearance(i);
            }
            ColorStateList colorStateList = c0352t8.f1254A;
            c0352t8.f1254A = colorStateList;
            C0794r1 c0794r14 = c0352t8.f1280y;
            if (c0794r14 != null && colorStateList != null) {
                c0794r14.setTextColor(colorStateList);
            }
            c0352t8.m944a(c0352t8.f1280y, 1);
            c0352t8.f1280y.setAccessibilityDelegate(new C0370U8(c0352t8));
        } else {
            c0352t8.m946c();
            int i2 = c0352t8.f1269n;
            if (i2 == 2) {
                c0352t8.f1270o = 0;
            }
            c0352t8.m952i(i2, c0352t8.f1270o, c0352t8.m951h(c0352t8.f1280y, ""));
            c0352t8.m950g(c0352t8.f1280y, 1);
            c0352t8.f1280y = null;
            TextInputLayout textInputLayout = c0352t8.f1263h;
            textInputLayout.m3273r();
            textInputLayout.m3279x();
        }
        c0352t8.f1279x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C0352T8 c0352t8 = this.f5922j;
        c0352t8.f1281z = i;
        C0794r1 c0794r1 = c0352t8.f1280y;
        if (c0794r1 != null) {
            c0794r1.setTextAppearance(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(CharSequence charSequence) {
        if (this.f5883C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f5951x0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f5883C) {
            this.f5883C = z;
            if (z) {
                CharSequence hint = this.f5910d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f5884D)) {
                        setHint(hint);
                    }
                    this.f5910d.setHint((CharSequence) null);
                }
                this.f5885E = true;
            } else {
                this.f5885E = false;
                if (!TextUtils.isEmpty(this.f5884D) && TextUtils.isEmpty(this.f5910d.getHint())) {
                    this.f5910d.setHint(this.f5884D);
                }
                setHintInternal(null);
            }
            if (this.f5910d != null) {
                m3275t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0720n3 c0720n3 = this.f5947v0;
        TextInputLayout textInputLayout = c0720n3.f2768a;
        C0394Ve c0394Ve = new C0394Ve(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c0394Ve.f1515j;
        if (colorStateList != null) {
            c0720n3.f2784k = colorStateList;
        }
        float f = c0394Ve.f1516k;
        if (f != 0.0f) {
            c0720n3.f2782i = f;
        }
        ColorStateList colorStateList2 = c0394Ve.f1506a;
        if (colorStateList2 != null) {
            c0720n3.f2762U = colorStateList2;
        }
        c0720n3.f2760S = c0394Ve.f1510e;
        c0720n3.f2761T = c0394Ve.f1511f;
        c0720n3.f2759R = c0394Ve.f1512g;
        c0720n3.f2763V = c0394Ve.f1514i;
        C0167J2 c0167j2 = c0720n3.f2798y;
        if (c0167j2 != null) {
            c0167j2.f595c = true;
        }
        C0308R0 c0308r0 = new C0308R0(c0720n3);
        c0394Ve.m1029a();
        c0720n3.f2798y = new C0167J2(c0308r0, c0394Ve.f1519n);
        c0394Ve.m1031c(textInputLayout.getContext(), c0720n3.f2798y);
        c0720n3.m1647h(false);
        this.f5923j0 = c0720n3.f2784k;
        if (this.f5910d != null) {
            m3276u(false, false);
            m3275t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f5923j0 != colorStateList) {
            if (this.f5921i0 == null) {
                C0720n3 c0720n3 = this.f5947v0;
                if (c0720n3.f2784k != colorStateList) {
                    c0720n3.f2784k = colorStateList;
                    c0720n3.m1647h(false);
                }
            }
            this.f5923j0 = colorStateList;
            if (this.f5910d != null) {
                m3276u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC1314e interfaceC1314e) {
        this.f5930n = interfaceC1314e;
    }

    public void setMaxEms(int i) {
        this.f5916g = i;
        EditText editText = this.f5910d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f5920i = i;
        EditText editText = this.f5910d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f5914f = i;
        EditText editText = this.f5910d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f5918h = i;
        EditText editText = this.f5910d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C1318a c1318a = this.f5908c;
        c1318a.f5970g.setContentDescription(i != 0 ? c1318a.getResources().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C1318a c1318a = this.f5908c;
        c1318a.f5970g.setImageDrawable(i != 0 ? C0889w1.m2115A(c1318a.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C1318a c1318a = this.f5908c;
        if (z && c1318a.f5972i != 1) {
            c1318a.m3288g(1);
        } else if (z) {
            c1318a.getClass();
        } else {
            c1318a.m3288g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C1318a c1318a = this.f5908c;
        c1318a.f5974k = colorStateList;
        C0227M8.m617a(c1318a.f5964a, c1318a.f5970g, colorStateList, c1318a.f5975l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C1318a c1318a = this.f5908c;
        c1318a.f5975l = mode;
        C0227M8.m617a(c1318a.f5964a, c1318a.f5970g, c1318a.f5974k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f5942t == null) {
            C0794r1 c0794r1 = new C0794r1(getContext(), null);
            this.f5942t = c0794r1;
            c0794r1.setId(C1247R.id.textinput_placeholder);
            C0794r1 c0794r12 = this.f5942t;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            c0794r12.setImportantForAccessibility(2);
            C1233c c1233cM3260d = m3260d();
            this.f5948w = c1233cM3260d;
            c1233cM3260d.f5239b = 67L;
            this.f5950x = m3260d();
            setPlaceholderTextAppearance(this.f5946v);
            setPlaceholderTextColor(this.f5944u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f5940s) {
                setPlaceholderTextEnabled(true);
            }
            this.f5938r = charSequence;
        }
        EditText editText = this.f5910d;
        m3277v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f5946v = i;
        C0794r1 c0794r1 = this.f5942t;
        if (c0794r1 != null) {
            c0794r1.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f5944u != colorStateList) {
            this.f5944u = colorStateList;
            C0794r1 c0794r1 = this.f5942t;
            if (c0794r1 == null || colorStateList == null) {
                return;
            }
            c0794r1.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0826se c0826se = this.f5906b;
        c0826se.getClass();
        c0826se.f3289c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0826se.f3288b.setText(charSequence);
        c0826se.m1930e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f5906b.f3288b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f5906b.f3288b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0393Vd c0393Vd) {
        C0354Ta c0354Ta = this.f5886F;
        if (c0354Ta == null || c0354Ta.f1310a.f1334a == c0393Vd) {
            return;
        }
        this.f5892L = c0393Vd;
        m3258b();
    }

    public void setStartIconCheckable(boolean z) {
        this.f5906b.f3290d.setCheckable(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f5906b.f3290d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0889w1.m2115A(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C0826se c0826se = this.f5906b;
        if (i < 0) {
            c0826se.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c0826se.f3293g) {
            c0826se.f3293g = i;
            CheckableImageButton checkableImageButton = c0826se.f3290d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0826se c0826se = this.f5906b;
        View.OnLongClickListener onLongClickListener = c0826se.f3295i;
        CheckableImageButton checkableImageButton = c0826se.f3290d;
        checkableImageButton.setOnClickListener(onClickListener);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0826se c0826se = this.f5906b;
        c0826se.f3295i = onLongClickListener;
        CheckableImageButton checkableImageButton = c0826se.f3290d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0826se c0826se = this.f5906b;
        c0826se.f3294h = scaleType;
        c0826se.f3290d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0826se c0826se = this.f5906b;
        if (c0826se.f3291e != colorStateList) {
            c0826se.f3291e = colorStateList;
            C0227M8.m617a(c0826se.f3287a, c0826se.f3290d, colorStateList, c0826se.f3292f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0826se c0826se = this.f5906b;
        if (c0826se.f3292f != mode) {
            c0826se.f3292f = mode;
            C0227M8.m617a(c0826se.f3287a, c0826se.f3290d, c0826se.f3291e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f5906b.m1928c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C1318a c1318a = this.f5908c;
        c1318a.getClass();
        c1318a.f5979p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c1318a.f5980q.setText(charSequence);
        c1318a.m3295n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f5908c.f5980q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f5908c.f5980q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C1313d c1313d) {
        EditText editText = this.f5910d;
        if (editText != null) {
            C0866ug.m2003j(editText, c1313d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f5907b0) {
            this.f5907b0 = typeface;
            this.f5947v0.m1652m(typeface);
            C0352T8 c0352t8 = this.f5922j;
            if (typeface != c0352t8.f1255B) {
                c0352t8.f1255B = typeface;
                C0794r1 c0794r1 = c0352t8.f1273r;
                if (c0794r1 != null) {
                    c0794r1.setTypeface(typeface);
                }
                C0794r1 c0794r12 = c0352t8.f1280y;
                if (c0794r12 != null) {
                    c0794r12.setTypeface(typeface);
                }
            }
            C0794r1 c0794r13 = this.f5932o;
            if (c0794r13 != null) {
                c0794r13.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m3275t() {
        if (this.f5895O != 1) {
            FrameLayout frameLayout = this.f5904a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM3259c = m3259c();
            if (iM3259c != layoutParams.topMargin) {
                layoutParams.topMargin = iM3259c;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3276u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C0794r1 c0794r1;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f5910d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f5910d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f5921i0;
        C0720n3 c0720n3 = this.f5947v0;
        if (colorStateList2 != null) {
            c0720n3.m1648i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f5921i0;
            c0720n3.m1648i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f5941s0) : this.f5941s0));
        } else if (m3268m()) {
            C0794r1 c0794r12 = this.f5922j.f1273r;
            c0720n3.m1648i(c0794r12 != null ? c0794r12.getTextColors() : null);
        } else if (this.f5928m && (c0794r1 = this.f5932o) != null) {
            c0720n3.m1648i(c0794r1.getTextColors());
        } else if (z4 && (colorStateList = this.f5923j0) != null && c0720n3.f2784k != colorStateList) {
            c0720n3.f2784k = colorStateList;
            c0720n3.m1647h(false);
        }
        C1318a c1318a = this.f5908c;
        C0826se c0826se = this.f5906b;
        if (z3 || !this.f5949w0 || (isEnabled() && z4)) {
            if (z2 || this.f5945u0) {
                ValueAnimator valueAnimator = this.f5953y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f5953y0.cancel();
                }
                if (z && this.f5951x0) {
                    m3257a(1.0f);
                } else {
                    c0720n3.m1650k(1.0f);
                }
                this.f5945u0 = false;
                if (m3261e()) {
                    m3266j();
                }
                EditText editText3 = this.f5910d;
                m3277v(editText3 != null ? editText3.getText() : null);
                c0826se.f3296j = false;
                c0826se.m1930e();
                c1318a.f5981r = false;
                c1318a.m3295n();
                return;
            }
            return;
        }
        if (z2 || !this.f5945u0) {
            ValueAnimator valueAnimator2 = this.f5953y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f5953y0.cancel();
            }
            if (z && this.f5951x0) {
                m3257a(0.0f);
            } else {
                c0720n3.m1650k(0.0f);
            }
            if (m3261e() && !((C0097F4) this.f5886F).f309y.f310q.isEmpty() && m3261e()) {
                ((C0097F4) this.f5886F).m259o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f5945u0 = true;
            C0794r1 c0794r13 = this.f5942t;
            if (c0794r13 != null && this.f5940s) {
                c0794r13.setText((CharSequence) null);
                C1237g.m3064a(this.f5904a, this.f5950x);
                this.f5942t.setVisibility(4);
            }
            c0826se.f3296j = true;
            c0826se.m1930e();
            c1318a.f5981r = true;
            c1318a.m3295n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3277v(Editable editable) {
        ((C0944z) this.f5930n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f5904a;
        if (length != 0 || this.f5945u0) {
            C0794r1 c0794r1 = this.f5942t;
            if (c0794r1 == null || !this.f5940s) {
                return;
            }
            c0794r1.setText((CharSequence) null);
            C1237g.m3064a(frameLayout, this.f5950x);
            this.f5942t.setVisibility(4);
            return;
        }
        if (this.f5942t == null || !this.f5940s || TextUtils.isEmpty(this.f5938r)) {
            return;
        }
        this.f5942t.setText(this.f5938r);
        C1237g.m3064a(frameLayout, this.f5948w);
        this.f5942t.setVisibility(0);
        this.f5942t.bringToFront();
        announceForAccessibility(this.f5938r);
    }

    /* JADX INFO: renamed from: w */
    public final void m3278w(boolean z, boolean z2) {
        int defaultColor = this.f5931n0.getDefaultColor();
        int colorForState = this.f5931n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f5931n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f5900T = colorForState2;
        } else if (z2) {
            this.f5900T = colorForState;
        } else {
            this.f5900T = defaultColor;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m3279x() {
        C0794r1 c0794r1;
        EditText editText;
        EditText editText2;
        if (this.f5886F == null || this.f5895O == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f5910d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f5910d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f5900T = this.f5941s0;
        } else if (m3268m()) {
            if (this.f5931n0 != null) {
                m3278w(z2, z);
            } else {
                this.f5900T = getErrorCurrentTextColors();
            }
        } else if (!this.f5928m || (c0794r1 = this.f5932o) == null) {
            if (z2) {
                this.f5900T = this.f5929m0;
            } else if (z) {
                this.f5900T = this.f5927l0;
            } else {
                this.f5900T = this.f5925k0;
            }
        } else if (this.f5931n0 != null) {
            m3278w(z2, z);
        } else {
            this.f5900T = c0794r1.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m3271p();
        }
        C1318a c1318a = this.f5908c;
        c1318a.m3293l();
        CheckableImageButton checkableImageButton = c1318a.f5966c;
        ColorStateList colorStateList = c1318a.f5967d;
        TextInputLayout textInputLayout = c1318a.f5964a;
        C0227M8.m619c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c1318a.f5974k;
        CheckableImageButton checkableImageButton2 = c1318a.f5970g;
        C0227M8.m619c(textInputLayout, checkableImageButton2, colorStateList2);
        if (c1318a.m3283b() instanceof C0098F5) {
            if (!textInputLayout.m3268m() || checkableImageButton2.getDrawable() == null) {
                C0227M8.m617a(textInputLayout, checkableImageButton2, c1318a.f5974k, c1318a.f5975l);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                C0893w5.a.m2175g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C0826se c0826se = this.f5906b;
        C0227M8.m619c(c0826se.f3287a, c0826se.f3290d, c0826se.f3291e);
        if (this.f5895O == 2) {
            int i = this.f5897Q;
            if (z2 && isEnabled()) {
                this.f5897Q = this.f5899S;
            } else {
                this.f5897Q = this.f5898R;
            }
            if (this.f5897Q != i && m3261e() && !this.f5945u0) {
                if (m3261e()) {
                    ((C0097F4) this.f5886F).m259o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m3266j();
            }
        }
        if (this.f5895O == 1) {
            if (!isEnabled()) {
                this.f5901U = this.f5935p0;
            } else if (z && !z2) {
                this.f5901U = this.f5939r0;
            } else if (z2) {
                this.f5901U = this.f5937q0;
            } else {
                this.f5901U = this.f5933o0;
            }
        }
        m3258b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setStartIconDrawable(Drawable drawable) {
        this.f5906b.m1927b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5908c.f5970g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5908c.f5970g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5908c.m3290i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f5908c.f5970g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C1318a c1318a = this.f5908c;
        CheckableImageButton checkableImageButton = c1318a.f5970g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c1318a.f5974k;
            PorterDuff.Mode mode = c1318a.f5975l;
            TextInputLayout textInputLayout = c1318a.f5964a;
            C0227M8.m617a(textInputLayout, checkableImageButton, colorStateList, mode);
            C0227M8.m619c(textInputLayout, checkableImageButton, c1318a.f5974k);
        }
    }
}
