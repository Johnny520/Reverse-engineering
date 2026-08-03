package p000a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.C0983R;
import java.lang.ref.WeakReference;
import p000a.C0152I5;
import p000a.C0466Ze;
import p000a.C0787qd;

/* JADX INFO: renamed from: a.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0756p1 {

    /* JADX INFO: renamed from: a */
    public final TextView f2965a;

    /* JADX INFO: renamed from: b */
    public C0713mf f2966b;

    /* JADX INFO: renamed from: c */
    public C0713mf f2967c;

    /* JADX INFO: renamed from: d */
    public C0713mf f2968d;

    /* JADX INFO: renamed from: e */
    public C0713mf f2969e;

    /* JADX INFO: renamed from: f */
    public C0713mf f2970f;

    /* JADX INFO: renamed from: g */
    public C0713mf f2971g;

    /* JADX INFO: renamed from: h */
    public C0713mf f2972h;

    /* JADX INFO: renamed from: i */
    public final C0813s1 f2973i;

    /* JADX INFO: renamed from: j */
    public int f2974j = 0;

    /* JADX INFO: renamed from: k */
    public int f2975k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f2976l;

    /* JADX INFO: renamed from: m */
    public boolean f2977m;

    /* JADX INFO: renamed from: a.p1$a */
    public class a extends C0787qd.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2978a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2979b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WeakReference f2980c;

        public a(int i, int i2, WeakReference weakReference) {
            this.f2978a = i;
            this.f2979b = i2;
            this.f2980c = weakReference;
        }

        @Override // p000a.C0787qd.e
        /* JADX INFO: renamed from: b */
        public final void mo1036b(int i) {
        }

        @Override // p000a.C0787qd.e
        /* JADX INFO: renamed from: c */
        public final void mo1037c(Typeface typeface) {
            int i = this.f2978a;
            if (i != -1) {
                typeface = d.m1797a(typeface, i, (this.f2979b & 2) != 0);
            }
            C0756p1 c0756p1 = C0756p1.this;
            if (c0756p1.f2977m) {
                c0756p1.f2976l = typeface;
                TextView textView = (TextView) this.f2980c.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new RunnableC0775q1(textView, typeface, c0756p1.f2974j));
                    } else {
                        textView.setTypeface(typeface, c0756p1.f2974j);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.p1$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static LocaleList m1791a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* JADX INFO: renamed from: b */
        public static void m1792b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: a.p1$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static int m1793a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* JADX INFO: renamed from: b */
        public static void m1794b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* JADX INFO: renamed from: c */
        public static void m1795c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* JADX INFO: renamed from: d */
        public static boolean m1796d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: a.p1$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static Typeface m1797a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C0756p1(TextView textView) {
        this.f2965a = textView;
        this.f2973i = new C0813s1(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C0713mf m1780c(Context context, C0434Y0 c0434y0, int i) {
        ColorStateList colorStateListM1811f;
        synchronized (c0434y0) {
            colorStateListM1811f = c0434y0.f1632a.m1811f(context, i);
        }
        if (colorStateListM1811f == null) {
            return null;
        }
        C0713mf c0713mf = new C0713mf();
        c0713mf.f2696d = true;
        c0713mf.f2693a = colorStateListM1811f;
        return c0713mf;
    }

    /* JADX INFO: renamed from: h */
    public static void m1781h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            C0152I5.a.m433a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            C0152I5.a.m433a(editorInfo, text);
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
            C0152I5.m432a(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            C0152I5.m432a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            C0152I5.m432a(editorInfo, text, i4, i2);
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
        C0152I5.m432a(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m1782a(Drawable drawable, C0713mf c0713mf) {
        if (drawable == null || c0713mf == null) {
            return;
        }
        C0434Y0.m1083e(drawable, c0713mf, this.f2965a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m1783b() {
        C0713mf c0713mf = this.f2966b;
        TextView textView = this.f2965a;
        if (c0713mf != null || this.f2967c != null || this.f2968d != null || this.f2969e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m1782a(compoundDrawables[0], this.f2966b);
            m1782a(compoundDrawables[1], this.f2967c);
            m1782a(compoundDrawables[2], this.f2968d);
            m1782a(compoundDrawables[3], this.f2969e);
        }
        if (this.f2970f == null && this.f2971g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m1782a(compoundDrawablesRelative[0], this.f2970f);
        m1782a(compoundDrawablesRelative[2], this.f2971g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m1784d() {
        C0713mf c0713mf = this.f2972h;
        if (c0713mf != null) {
            return c0713mf.f2693a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m1785e() {
        C0713mf c0713mf = this.f2972h;
        if (c0713mf != null) {
            return c0713mf.f2694b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: f */
    public final void m1786f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        float f;
        int i2;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.f2965a;
        Context context = textView.getContext();
        C0434Y0 c0434y0M1080a = C0434Y0.m1080a();
        C0751of c0751ofM1768e = C0751of.m1768e(context, attributeSet, C0983R.styleable.AppCompatTextHelper, i);
        C0866ug.m2002i(textView, textView.getContext(), C0983R.styleable.AppCompatTextHelper, attributeSet, c0751ofM1768e.f2960b, i);
        int i3 = C0983R.styleable.AppCompatTextHelper_android_textAppearance;
        TypedArray typedArray = c0751ofM1768e.f2960b;
        int resourceId3 = typedArray.getResourceId(i3, -1);
        if (typedArray.hasValue(C0983R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.f2966b = m1780c(context, c0434y0M1080a, typedArray.getResourceId(C0983R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (typedArray.hasValue(C0983R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.f2967c = m1780c(context, c0434y0M1080a, typedArray.getResourceId(C0983R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (typedArray.hasValue(C0983R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.f2968d = m1780c(context, c0434y0M1080a, typedArray.getResourceId(C0983R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (typedArray.hasValue(C0983R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.f2969e = m1780c(context, c0434y0M1080a, typedArray.getResourceId(C0983R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (typedArray.hasValue(C0983R.styleable.AppCompatTextHelper_android_drawableStart)) {
            this.f2970f = m1780c(context, c0434y0M1080a, typedArray.getResourceId(C0983R.styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (typedArray.hasValue(C0983R.styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.f2971g = m1780c(context, c0434y0M1080a, typedArray.getResourceId(C0983R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        c0751ofM1768e.m1773f();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, C0983R.styleable.TextAppearance);
            C0751of c0751of = new C0751of(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m1790k(context, c0751of);
            string2 = typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.TextAppearance_textLocale) ? typedArrayObtainStyledAttributes.getString(C0983R.styleable.TextAppearance_textLocale) : null;
            string = typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.TextAppearance_fontVariationSettings) ? typedArrayObtainStyledAttributes.getString(C0983R.styleable.TextAppearance_fontVariationSettings) : null;
            c0751of.m1773f();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0983R.styleable.TextAppearance, i, 0);
        C0751of c0751of2 = new C0751of(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.TextAppearance_textAllCaps)) {
            z = typedArrayObtainStyledAttributes2.getBoolean(C0983R.styleable.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.TextAppearance_textLocale)) {
            string2 = typedArrayObtainStyledAttributes2.getString(C0983R.styleable.TextAppearance_textLocale);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.TextAppearance_fontVariationSettings)) {
            string = typedArrayObtainStyledAttributes2.getString(C0983R.styleable.TextAppearance_fontVariationSettings);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(C0983R.styleable.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1790k(context, c0751of2);
        c0751of2.m1773f();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.f2976l;
        if (typeface != null) {
            if (this.f2975k == -1) {
                textView.setTypeface(typeface, this.f2974j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            c.m1796d(textView, string);
        }
        if (string2 != null) {
            b.m1792b(textView, b.m1791a(string2));
        }
        int[] iArr = C0983R.styleable.AppCompatTextView;
        C0813s1 c0813s1 = this.f2973i;
        Context context2 = c0813s1.f3212h;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView2 = c0813s1.f3211g;
        C0866ug.m2002i(textView2, textView2.getContext(), C0983R.styleable.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(C0983R.styleable.AppCompatTextView_autoSizeTextType)) {
            c0813s1.f3205a = typedArrayObtainStyledAttributes3.getInt(C0983R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(C0983R.styleable.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes3.getDimension(C0983R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(C0983R.styleable.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes3.getDimension(C0983R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(C0983R.styleable.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes3.getDimension(C0983R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(C0983R.styleable.AppCompatTextView_autoSizePresetSizes) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(C0983R.styleable.AppCompatTextView_autoSizePresetSizes, 0)) <= 0) {
            f = 0.0f;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            f = 0.0f;
            int[] iArr2 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr2[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                int[] iArrM1884a = C0813s1.m1884a(iArr2);
                c0813s1.f3209e = iArrM1884a;
                boolean z4 = iArrM1884a.length > 0;
                c0813s1.f3210f = z4;
                if (z4) {
                    c0813s1.f3205a = 1;
                    c0813s1.f3207c = iArrM1884a[0];
                    c0813s1.f3208d = iArrM1884a[r12 - 1];
                    c0813s1.f3206b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0813s1.m1885b()) {
            c0813s1.f3205a = 0;
        } else if (c0813s1.f3205a == 1) {
            if (!c0813s1.f3210f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c0813s1.f3205a = 1;
                c0813s1.f3207c = dimension2;
                c0813s1.f3208d = dimension3;
                c0813s1.f3206b = dimension;
                c0813s1.f3210f = false;
            }
            if (c0813s1.m1885b() && c0813s1.f3205a == 1 && (!c0813s1.f3210f || c0813s1.f3209e.length == 0)) {
                int iFloor = ((int) Math.floor((c0813s1.f3208d - c0813s1.f3207c) / c0813s1.f3206b)) + 1;
                int[] iArr3 = new int[iFloor];
                for (int i5 = 0; i5 < iFloor; i5++) {
                    iArr3[i5] = Math.round((i5 * c0813s1.f3206b) + c0813s1.f3207c);
                }
                c0813s1.f3209e = C0813s1.m1884a(iArr3);
            }
        }
        if (c0813s1.f3205a != 0) {
            int[] iArr4 = c0813s1.f3209e;
            if (iArr4.length > 0) {
                if (c.m1793a(textView) != -1.0f) {
                    c.m1794b(textView, Math.round(c0813s1.f3207c), Math.round(c0813s1.f3208d), Math.round(c0813s1.f3206b), 0);
                } else {
                    c.m1795c(textView, iArr4, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, C0983R.styleable.AppCompatTextView);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(C0983R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableM1084b = resourceId4 != -1 ? c0434y0M1080a.m1084b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(C0983R.styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableM1084b2 = resourceId5 != -1 ? c0434y0M1080a.m1084b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(C0983R.styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableM1084b3 = resourceId6 != -1 ? c0434y0M1080a.m1084b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(C0983R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableM1084b4 = resourceId7 != -1 ? c0434y0M1080a.m1084b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(C0983R.styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableM1084b5 = resourceId8 != -1 ? c0434y0M1080a.m1084b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(C0983R.styleable.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawableM1084b6 = resourceId9 != -1 ? c0434y0M1080a.m1084b(context, resourceId9) : null;
        if (drawableM1084b5 != null || drawableM1084b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM1084b5 == null) {
                drawableM1084b5 = compoundDrawablesRelative[0];
            }
            if (drawableM1084b2 == null) {
                drawableM1084b2 = compoundDrawablesRelative[1];
            }
            if (drawableM1084b6 == null) {
                drawableM1084b6 = compoundDrawablesRelative[2];
            }
            if (drawableM1084b4 == null) {
                drawableM1084b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM1084b5, drawableM1084b2, drawableM1084b6, drawableM1084b4);
        } else if (drawableM1084b != null || drawableM1084b2 != null || drawableM1084b3 != null || drawableM1084b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM1084b == null) {
                    drawableM1084b = compoundDrawables[0];
                }
                if (drawableM1084b2 == null) {
                    drawableM1084b2 = compoundDrawables[1];
                }
                if (drawableM1084b3 == null) {
                    drawableM1084b3 = compoundDrawables[2];
                }
                if (drawableM1084b4 == null) {
                    drawableM1084b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM1084b, drawableM1084b2, drawableM1084b3, drawableM1084b4);
            } else {
                if (drawableM1084b2 == null) {
                    drawableM1084b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM1084b4 == null) {
                    drawableM1084b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM1084b2, compoundDrawablesRelative2[2], drawableM1084b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(C0983R.styleable.AppCompatTextView_drawableTint)) {
            int i6 = C0983R.styleable.AppCompatTextView_drawableTint;
            if (!typedArrayObtainStyledAttributes4.hasValue(i6) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(i6, 0)) == 0 || (colorStateList = C0437Y3.m1091a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(i6);
            }
            C0466Ze.a.m1127f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(C0983R.styleable.AppCompatTextView_drawableTintMode)) {
            C0466Ze.a.m1128g(textView, C0912x5.m2200c(typedArrayObtainStyledAttributes4.getInt(C0983R.styleable.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(C0983R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(C0983R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(C0983R.styleable.AppCompatTextView_lineHeight)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(C0983R.styleable.AppCompatTextView_lineHeight);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(C0983R.styleable.AppCompatTextView_lineHeight, -1);
                i2 = -1;
            } else {
                int i7 = typedValuePeekValue.data;
                i2 = i7 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i7);
            }
        } else {
            i2 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            C0726n9.m1664g(dimensionPixelSize2);
            C0466Ze.b.m1133d(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            C0726n9.m1664g(dimensionPixelSize3);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize3 > Math.abs(i8)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i8);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i2 == -1) {
                C0466Ze.m1120a(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                C0466Ze.c.m1134a(textView, i2, dimensionPixelSize);
            } else {
                C0466Ze.m1120a(textView, Math.round(TypedValue.applyDimension(i2, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1787g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C0983R.styleable.TextAppearance);
        C0751of c0751of = new C0751of(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.TextAppearance_textAllCaps);
        TextView textView = this.f2965a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.TextAppearance_textAllCaps, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(C0983R.styleable.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1790k(context, c0751of);
        if (typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(C0983R.styleable.TextAppearance_fontVariationSettings)) != null) {
            c.m1796d(textView, string);
        }
        c0751of.m1773f();
        Typeface typeface = this.f2976l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2974j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1788i(ColorStateList colorStateList) {
        if (this.f2972h == null) {
            this.f2972h = new C0713mf();
        }
        C0713mf c0713mf = this.f2972h;
        c0713mf.f2693a = colorStateList;
        c0713mf.f2696d = colorStateList != null;
        this.f2966b = c0713mf;
        this.f2967c = c0713mf;
        this.f2968d = c0713mf;
        this.f2969e = c0713mf;
        this.f2970f = c0713mf;
        this.f2971g = c0713mf;
    }

    /* JADX INFO: renamed from: j */
    public final void m1789j(PorterDuff.Mode mode) {
        if (this.f2972h == null) {
            this.f2972h = new C0713mf();
        }
        C0713mf c0713mf = this.f2972h;
        c0713mf.f2694b = mode;
        c0713mf.f2695c = mode != null;
        this.f2966b = c0713mf;
        this.f2967c = c0713mf;
        this.f2968d = c0713mf;
        this.f2969e = c0713mf;
        this.f2970f = c0713mf;
        this.f2971g = c0713mf;
    }

    /* JADX INFO: renamed from: k */
    public final void m1790k(Context context, C0751of c0751of) {
        String string;
        int i = C0983R.styleable.TextAppearance_android_textStyle;
        int i2 = this.f2974j;
        TypedArray typedArray = c0751of.f2960b;
        this.f2974j = typedArray.getInt(i, i2);
        int i3 = typedArray.getInt(C0983R.styleable.TextAppearance_android_textFontWeight, -1);
        this.f2975k = i3;
        if (i3 != -1) {
            this.f2974j &= 2;
        }
        if (!typedArray.hasValue(C0983R.styleable.TextAppearance_android_fontFamily) && !typedArray.hasValue(C0983R.styleable.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(C0983R.styleable.TextAppearance_android_typeface)) {
                this.f2977m = false;
                int i4 = typedArray.getInt(C0983R.styleable.TextAppearance_android_typeface, 1);
                if (i4 == 1) {
                    this.f2976l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f2976l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f2976l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2976l = null;
        int i5 = typedArray.hasValue(C0983R.styleable.TextAppearance_fontFamily) ? C0983R.styleable.TextAppearance_fontFamily : C0983R.styleable.TextAppearance_android_fontFamily;
        int i6 = this.f2975k;
        int i7 = this.f2974j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1772d = c0751of.m1772d(i5, this.f2974j, new a(i6, i7, new WeakReference(this.f2965a)));
                if (typefaceM1772d != null) {
                    if (this.f2975k != -1) {
                        this.f2976l = d.m1797a(Typeface.create(typefaceM1772d, 0), this.f2975k, (this.f2974j & 2) != 0);
                    } else {
                        this.f2976l = typefaceM1772d;
                    }
                }
                this.f2977m = this.f2976l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2976l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (this.f2975k != -1) {
            this.f2976l = d.m1797a(Typeface.create(string, 0), this.f2975k, (this.f2974j & 2) != 0);
        } else {
            this.f2976l = Typeface.create(string, this.f2974j);
        }
    }
}
