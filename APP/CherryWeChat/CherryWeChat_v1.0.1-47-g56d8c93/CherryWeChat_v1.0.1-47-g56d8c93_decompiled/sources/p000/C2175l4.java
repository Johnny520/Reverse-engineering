package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2175l4 {

    /* JADX INFO: renamed from: a */
    public final TextView f7571a;

    /* JADX INFO: renamed from: b */
    public C2090jB f7572b;

    /* JADX INFO: renamed from: c */
    public C2090jB f7573c;

    /* JADX INFO: renamed from: d */
    public C2090jB f7574d;

    /* JADX INFO: renamed from: e */
    public C2090jB f7575e;

    /* JADX INFO: renamed from: f */
    public C2090jB f7576f;

    /* JADX INFO: renamed from: g */
    public C2090jB f7577g;

    /* JADX INFO: renamed from: h */
    public C2090jB f7578h;

    /* JADX INFO: renamed from: i */
    public final C2484s4 f7579i;

    /* JADX INFO: renamed from: j */
    public int f7580j = 0;

    /* JADX INFO: renamed from: k */
    public int f7581k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f7582l;

    /* JADX INFO: renamed from: m */
    public boolean f7583m;

    public C2175l4(TextView textView) {
        this.f7571a = textView;
        this.f7579i = new C2484s4(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C2090jB m4372c(Context context, C0262G3 c0262g3, int i) {
        ColorStateList colorStateListM5352f;
        synchronized (c0262g3) {
            colorStateListM5352f = c0262g3.f844a.m5352f(context, i);
        }
        if (colorStateListM5352f == null) {
            return null;
        }
        C2090jB c2090jB = new C2090jB();
        c2090jB.f7361d = true;
        c2090jB.f7358a = colorStateListM5352f;
        return c2090jB;
    }

    /* JADX INFO: renamed from: h */
    public static void m4373h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC0945W.m1804e(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC0945W.m1804e(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            AbstractC0714Qj.m1475F(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC0714Qj.m1475F(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0714Qj.m1475F(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        AbstractC0714Qj.m1475F(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m4374a(Drawable drawable, C2090jB c2090jB) {
        if (drawable == null || c2090jB == null) {
            return;
        }
        C0262G3.m542e(drawable, c2090jB, this.f7571a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m4375b() {
        C2090jB c2090jB = this.f7572b;
        TextView textView = this.f7571a;
        if (c2090jB != null || this.f7573c != null || this.f7574d != null || this.f7575e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m4374a(compoundDrawables[0], this.f7572b);
            m4374a(compoundDrawables[1], this.f7573c);
            m4374a(compoundDrawables[2], this.f7574d);
            m4374a(compoundDrawables[3], this.f7575e);
        }
        if (this.f7576f == null && this.f7577g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m4374a(compoundDrawablesRelative[0], this.f7576f);
        m4374a(compoundDrawablesRelative[2], this.f7577g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m4376d() {
        C2090jB c2090jB = this.f7578h;
        if (c2090jB != null) {
            return c2090jB.f7358a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m4377e() {
        C2090jB c2090jB = this.f7578h;
        if (c2090jB != null) {
            return c2090jB.f7359b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4378f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.f7571a;
        Context context = textView.getContext();
        C0262G3 c0262g3M539a = C0262G3.m539a();
        int[] iArr = AbstractC0982Wu.f3073h;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context, attributeSet, iArr, i);
        AbstractC2185lE.m4398k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c2656w4M5186A.f9196b, i);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f7572b = m4372c(context, c0262g3M539a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f7573c = m4372c(context, c0262g3M539a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f7574d = m4372c(context, c0262g3M539a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f7575e = m4372c(context, c0262g3M539a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f7576f = m4372c(context, c0262g3M539a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f7577g = m4372c(context, c0262g3M539a, typedArray.getResourceId(6, 0));
        }
        c2656w4M5186A.m5195E();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0982Wu.f3088w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C2656w4 c2656w4 = new C2656w4(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m4382k(context, c2656w4);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c2656w4.m5195E();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C2656w4 c2656w42 = new C2656w4(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m4382k(context, c2656w42);
        c2656w42.m5195E();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f7582l;
        if (typeface != null) {
            if (this.f7581k == -1) {
                textView.setTypeface(typeface, this.f7580j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC2083j4.m4252d(textView, string);
        }
        if (string2 != null) {
            AbstractC1526i4.m2902b(textView, AbstractC1526i4.m2901a(string2));
        }
        C2484s4 c2484s4 = this.f7579i;
        Context context2 = c2484s4.f8742h;
        int[] iArr3 = AbstractC0982Wu.f3074i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c2484s4.f8741g;
        AbstractC2185lE.m4398k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c2484s4.f8735a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i2 = 0;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            i2 = 0;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                int[] iArrM4967a = C2484s4.m4967a(iArr4);
                c2484s4.f8739e = iArrM4967a;
                boolean z5 = iArrM4967a.length > 0;
                c2484s4.f8740f = z5;
                if (z5) {
                    c2484s4.f8735a = 1;
                    c2484s4.f8737c = iArrM4967a[0];
                    c2484s4.f8738d = iArrM4967a[r14 - 1];
                    c2484s4.f8736b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c2484s4.m4968b()) {
            c2484s4.f8735a = i2;
        } else if (c2484s4.f8735a == 1) {
            if (!c2484s4.f8740f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (f <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + f + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c2484s4.f8735a = 1;
                c2484s4.f8737c = dimension2;
                c2484s4.f8738d = f;
                c2484s4.f8736b = dimension;
                c2484s4.f8740f = i2;
            }
            if (c2484s4.m4968b() && c2484s4.f8735a == 1 && (!c2484s4.f8740f || c2484s4.f8739e.length == 0)) {
                int iFloor = ((int) Math.floor((c2484s4.f8738d - c2484s4.f8737c) / c2484s4.f8736b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i6 = 0; i6 < iFloor; i6++) {
                    iArr5[i6] = Math.round((i6 * c2484s4.f8736b) + c2484s4.f8737c);
                }
                c2484s4.f8739e = C2484s4.m4967a(iArr5);
            }
        }
        if (c2484s4.f8735a != 0) {
            int[] iArr6 = c2484s4.f8739e;
            if (iArr6.length > 0) {
                if (AbstractC2083j4.m4249a(textView) != -1.0f) {
                    AbstractC2083j4.m4250b(textView, Math.round(c2484s4.f8737c), Math.round(c2484s4.f8738d), Math.round(c2484s4.f8736b), 0);
                } else {
                    AbstractC2083j4.m4251c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM543b = resourceId4 != -1 ? c0262g3M539a.m543b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM543b2 = resourceId5 != -1 ? c0262g3M539a.m543b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM543b3 = resourceId6 != -1 ? c0262g3M539a.m543b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM543b4 = resourceId7 != -1 ? c0262g3M539a.m543b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM543b5 = resourceId8 != -1 ? c0262g3M539a.m543b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM543b6 = resourceId9 != -1 ? c0262g3M539a.m543b(context, resourceId9) : null;
        if (drawableM543b5 != null || drawableM543b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM543b5 == null) {
                drawableM543b5 = compoundDrawablesRelative[0];
            }
            if (drawableM543b2 == null) {
                drawableM543b2 = compoundDrawablesRelative[1];
            }
            if (drawableM543b6 == null) {
                drawableM543b6 = compoundDrawablesRelative[2];
            }
            if (drawableM543b4 == null) {
                drawableM543b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM543b5, drawableM543b2, drawableM543b6, drawableM543b4);
        } else if (drawableM543b != null || drawableM543b2 != null || drawableM543b3 != null || drawableM543b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM543b == null) {
                    drawableM543b = compoundDrawables[0];
                }
                if (drawableM543b2 == null) {
                    drawableM543b2 = compoundDrawables[1];
                }
                if (drawableM543b3 == null) {
                    drawableM543b3 = compoundDrawables[2];
                }
                if (drawableM543b4 == null) {
                    drawableM543b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM543b, drawableM543b2, drawableM543b3, drawableM543b4);
            } else {
                if (drawableM543b2 == null) {
                    drawableM543b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM543b4 == null) {
                    drawableM543b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM543b2, compoundDrawablesRelative2[2], drawableM543b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0295Gu.m622o(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC0107Ce.m161c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                int i7 = typedValuePeekValue.data;
                i3 = i7 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i7);
                typedArrayObtainStyledAttributes4.recycle();
                if (dimensionPixelSize2 != -1) {
                    AbstractC1293cr.m2546e(dimensionPixelSize2);
                    textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
                }
                if (dimensionPixelSize3 != -1) {
                    AbstractC1293cr.m2546e(dimensionPixelSize3);
                    Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
                    int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
                    if (dimensionPixelSize3 > Math.abs(i8)) {
                        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i8);
                    }
                }
                if (dimensionPixelSize == -1.0f) {
                    if (i3 == -1) {
                        AbstractC0148Dc.m284r(textView, (int) dimensionPixelSize);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC1031Y.m1961i(textView, i3, dimensionPixelSize);
                        return;
                    } else {
                        AbstractC0148Dc.m284r(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            dimensionPixelSize = -1.0f;
        }
        i3 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
        }
        if (dimensionPixelSize3 != -1) {
        }
        if (dimensionPixelSize == -1.0f) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4379g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0982Wu.f3088w);
        C2656w4 c2656w4 = new C2656w4(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f7571a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m4382k(context, c2656w4);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC2083j4.m4252d(textView, string);
        }
        c2656w4.m5195E();
        Typeface typeface = this.f7582l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f7580j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4380i(ColorStateList colorStateList) {
        if (this.f7578h == null) {
            this.f7578h = new C2090jB();
        }
        C2090jB c2090jB = this.f7578h;
        c2090jB.f7358a = colorStateList;
        c2090jB.f7361d = colorStateList != null;
        this.f7572b = c2090jB;
        this.f7573c = c2090jB;
        this.f7574d = c2090jB;
        this.f7575e = c2090jB;
        this.f7576f = c2090jB;
        this.f7577g = c2090jB;
    }

    /* JADX INFO: renamed from: j */
    public final void m4381j(PorterDuff.Mode mode) {
        if (this.f7578h == null) {
            this.f7578h = new C2090jB();
        }
        C2090jB c2090jB = this.f7578h;
        c2090jB.f7359b = mode;
        c2090jB.f7360c = mode != null;
        this.f7572b = c2090jB;
        this.f7573c = c2090jB;
        this.f7574d = c2090jB;
        this.f7575e = c2090jB;
        this.f7576f = c2090jB;
        this.f7577g = c2090jB;
    }

    /* JADX INFO: renamed from: k */
    public final void m4382k(Context context, C2656w4 c2656w4) {
        String string;
        int i = this.f7580j;
        TypedArray typedArray = (TypedArray) c2656w4.f9196b;
        this.f7580j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.f7581k = i2;
        if (i2 != -1) {
            this.f7580j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f7583m = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.f7582l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.f7582l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f7582l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7582l = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.f7581k;
        int i6 = this.f7580j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM5212s = c2656w4.m5212s(i4, this.f7580j, new C1438g4(this, i5, i6, new WeakReference(this.f7571a)));
                if (typefaceM5212s != null) {
                    if (this.f7581k != -1) {
                        this.f7582l = AbstractC2127k4.m4311a(Typeface.create(typefaceM5212s, 0), this.f7581k, (this.f7580j & 2) != 0);
                    } else {
                        this.f7582l = typefaceM5212s;
                    }
                }
                this.f7583m = this.f7582l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7582l != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.f7581k != -1) {
            this.f7582l = AbstractC2127k4.m4311a(Typeface.create(string, 0), this.f7581k, (this.f7580j & 2) != 0);
        } else {
            this.f7582l = Typeface.create(string, this.f7580j);
        }
    }
}
