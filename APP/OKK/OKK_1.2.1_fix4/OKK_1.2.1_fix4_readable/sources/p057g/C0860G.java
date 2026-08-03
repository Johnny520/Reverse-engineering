package p057g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import com.abc.core.runtime.AbstractC0805P;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;
import p015I.AbstractC0207a;
import p017J.AbstractC0225n;
import p017J.AbstractC0228q;
import p018J0.C0234d;
import p034S.AbstractC0324d;
import p048b.AbstractC0550a;

/* JADX INFO: renamed from: g.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0860G {

    /* JADX INFO: renamed from: a */
    public final TextView f3091a;

    /* JADX INFO: renamed from: b */
    public C0853C0 f3092b;

    /* JADX INFO: renamed from: c */
    public C0853C0 f3093c;

    /* JADX INFO: renamed from: d */
    public C0853C0 f3094d;

    /* JADX INFO: renamed from: e */
    public C0853C0 f3095e;

    /* JADX INFO: renamed from: f */
    public C0853C0 f3096f;

    /* JADX INFO: renamed from: g */
    public C0853C0 f3097g;

    /* JADX INFO: renamed from: h */
    public C0853C0 f3098h;

    /* JADX INFO: renamed from: i */
    public final C0878P f3099i;

    /* JADX INFO: renamed from: j */
    public int f3100j = 0;

    /* JADX INFO: renamed from: k */
    public int f3101k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f3102l;

    /* JADX INFO: renamed from: m */
    public boolean f3103m;

    public C0860G(TextView textView) {
        this.f3091a = textView;
        this.f3099i = new C0878P(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C0853C0 m2173c(Context context, C0926s c0926s, int i2) {
        ColorStateList colorStateListM2270h;
        synchronized (c0926s) {
            colorStateListM2270h = c0926s.f3291a.m2270h(context, i2);
        }
        if (colorStateListM2270h == null) {
            return null;
        }
        C0853C0 c0853c0 = new C0853C0();
        c0853c0.f3087d = true;
        c0853c0.f3084a = colorStateListM2270h;
        return c0853c0;
    }

    /* JADX INFO: renamed from: f */
    public static void m2174f(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            AbstractC0207a.m590a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            AbstractC0207a.m590a(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = text.length();
        if (i5 < 0 || i3 > length) {
            AbstractC0040p.m93X(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            AbstractC0040p.m93X(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0040p.m93X(editorInfo, text, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        AbstractC0040p.m93X(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m2175a(Drawable drawable, C0853C0 c0853c0) {
        if (drawable == null || c0853c0 == null) {
            return;
        }
        C0926s.m2260c(drawable, c0853c0, this.f3091a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m2176b() {
        C0853C0 c0853c0 = this.f3092b;
        TextView textView = this.f3091a;
        if (c0853c0 != null || this.f3093c != null || this.f3094d != null || this.f3095e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m2175a(compoundDrawables[0], this.f3092b);
            m2175a(compoundDrawables[1], this.f3093c);
            m2175a(compoundDrawables[2], this.f3094d);
            m2175a(compoundDrawables[3], this.f3095e);
        }
        if (this.f3096f == null && this.f3097g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m2175a(compoundDrawablesRelative[0], this.f3096f);
        m2175a(compoundDrawablesRelative[2], this.f3097g);
    }

    /* JADX INFO: renamed from: d */
    public final void m2177d(AttributeSet attributeSet, int i2) {
        C0926s c0926s;
        boolean z2;
        boolean z3;
        String string;
        String string2;
        boolean z4;
        int i3;
        int i4;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6;
        TextView textView = this.f3091a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0926s.f3289b;
        synchronized (C0926s.class) {
            try {
                if (C0926s.f3290c == null) {
                    C0926s.m2259b();
                }
                c0926s = C0926s.f3290c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = AbstractC0550a.f1621f;
        C0234d c0234dM638s = C0234d.m638s(context, attributeSet, iArr, i2, 0);
        TextView textView2 = this.f3091a;
        AbstractC0080Q.m290i(textView2, textView2.getContext(), iArr, attributeSet, (TypedArray) c0234dM638s.f475c, i2);
        TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3092b = m2173c(context, c0926s, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3093c = m2173c(context, c0926s, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3094d = m2173c(context, c0926s, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3095e = m2173c(context, c0926s, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f3096f = m2173c(context, c0926s, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3097g = m2173c(context, c0926s, typedArray.getResourceId(6, 0));
        }
        c0234dM638s.m657u();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0550a.f1634s;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0234d c0234d = new C0234d(context, typedArrayObtainStyledAttributes);
            if (z5 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m2184l(context, c0234d);
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i6 = 13;
            } else {
                i6 = 13;
                string2 = null;
            }
            string = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getString(i6) : null;
            c0234d.m657u();
        } else {
            z2 = false;
            z3 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0234d c0234d2 = new C0234d(context, typedArrayObtainStyledAttributes2);
        if (z5 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z4 = z3;
        } else {
            z4 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2184l(context, c0234d2);
        c0234d2.m657u();
        if (!z5 && z2) {
            this.f3091a.setAllCaps(z4);
        }
        Typeface typeface = this.f3102l;
        if (typeface != null) {
            if (this.f3101k == -1) {
                textView.setTypeface(typeface, this.f3100j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0856E.m2171d(textView, string);
        }
        if (string2 != null) {
            AbstractC0854D.m2167b(textView, AbstractC0854D.m2166a(string2));
        }
        int[] iArr3 = AbstractC0550a.f1622g;
        C0878P c0878p = this.f3099i;
        Context context2 = c0878p.f3147j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView3 = c0878p.f3146i;
        AbstractC0080Q.m290i(textView3, textView3.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i2);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0878p.f3138a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i3 = -1;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = typedArrayObtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                i3 = -1;
                c0878p.f3143f = C0878P.m2200b(iArr4);
                c0878p.m2208i();
            } else {
                i3 = -1;
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0878p.m2209j()) {
            c0878p.f3138a = 0;
        } else if (c0878p.f3138a == 1) {
            if (!c0878p.f3144g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0878p.m2210k(dimension2, dimension3, dimension);
            }
            c0878p.m2207h();
        }
        if (AbstractC0881Q0.f3149a && c0878p.f3138a != 0) {
            int[] iArr5 = c0878p.f3143f;
            if (iArr5.length > 0) {
                if (AbstractC0856E.m2168a(textView) != -1.0f) {
                    AbstractC0856E.m2169b(textView, Math.round(c0878p.f3141d), Math.round(c0878p.f3142e), Math.round(c0878p.f3140c), 0);
                } else {
                    AbstractC0856E.m2170c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, i3);
        Drawable drawableM2261a = resourceId4 != i3 ? c0926s.m2261a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, i3);
        Drawable drawableM2261a2 = resourceId5 != i3 ? c0926s.m2261a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, i3);
        Drawable drawableM2261a3 = resourceId6 != i3 ? c0926s.m2261a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, i3);
        Drawable drawableM2261a4 = resourceId7 != i3 ? c0926s.m2261a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, i3);
        Drawable drawableM2261a5 = resourceId8 != i3 ? c0926s.m2261a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, i3);
        Drawable drawableM2261a6 = resourceId9 != i3 ? c0926s.m2261a(context, resourceId9) : null;
        if (drawableM2261a5 != null || drawableM2261a6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM2261a5 == null) {
                drawableM2261a5 = compoundDrawablesRelative[0];
            }
            if (drawableM2261a2 == null) {
                drawableM2261a2 = compoundDrawablesRelative[1];
            }
            if (drawableM2261a6 == null) {
                drawableM2261a6 = compoundDrawablesRelative[2];
            }
            if (drawableM2261a4 == null) {
                drawableM2261a4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM2261a5, drawableM2261a2, drawableM2261a6, drawableM2261a4);
        } else if (drawableM2261a != null || drawableM2261a2 != null || drawableM2261a3 != null || drawableM2261a4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM2261a == null) {
                    drawableM2261a = compoundDrawables[0];
                }
                if (drawableM2261a2 == null) {
                    drawableM2261a2 = compoundDrawables[1];
                }
                if (drawableM2261a3 == null) {
                    drawableM2261a3 = compoundDrawables[2];
                }
                if (drawableM2261a4 == null) {
                    drawableM2261a4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM2261a, drawableM2261a2, drawableM2261a3, drawableM2261a4);
            } else {
                if (drawableM2261a2 == null) {
                    drawableM2261a2 = compoundDrawablesRelative2[1];
                }
                if (drawableM2261a4 == null) {
                    drawableM2261a4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM2261a2, compoundDrawablesRelative2[2], drawableM2261a4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0805P.m2049p(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            AbstractC0225n.m621f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            AbstractC0225n.m622g(textView, AbstractC0886W.m2221c(typedArrayObtainStyledAttributes4.getInt(12, i3), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i3);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i3);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, i3);
                i4 = i3;
            } else {
                int i9 = typedValuePeekValue.data;
                i4 = i9 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i9);
            }
        } else {
            i4 = i3;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i3) {
            AbstractC0040p.m88S(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            AbstractC0040p.m90U(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i4 == i3) {
                AbstractC0040p.m91V(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0228q.m629a(textView, i4, dimensionPixelSize);
            } else {
                AbstractC0040p.m91V(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2178e(Context context, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0550a.f1634s);
        C0234d c0234d = new C0234d(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f3091a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2184l(context, c0234d);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0856E.m2171d(textView, string);
        }
        c0234d.m657u();
        Typeface typeface = this.f3102l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3100j);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2179g(int i2, int i3, int i4, int i5) {
        C0878P c0878p = this.f3099i;
        if (c0878p.m2209j()) {
            DisplayMetrics displayMetrics = c0878p.f3147j.getResources().getDisplayMetrics();
            c0878p.m2210k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0878p.m2207h()) {
                c0878p.m2203a();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2180h(int[] iArr, int i2) {
        C0878P c0878p = this.f3099i;
        if (c0878p.m2209j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0878p.f3147j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0878p.f3143f = C0878P.m2200b(iArrCopyOf);
                if (!c0878p.m2208i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0878p.f3144g = false;
            }
            if (c0878p.m2207h()) {
                c0878p.m2203a();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2181i(int i2) {
        C0878P c0878p = this.f3099i;
        if (c0878p.m2209j()) {
            if (i2 == 0) {
                c0878p.f3138a = 0;
                c0878p.f3141d = -1.0f;
                c0878p.f3142e = -1.0f;
                c0878p.f3140c = -1.0f;
                c0878p.f3143f = new int[0];
                c0878p.f3139b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(AbstractC0324d.m720c("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = c0878p.f3147j.getResources().getDisplayMetrics();
            c0878p.m2210k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0878p.m2207h()) {
                c0878p.m2203a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2182j(ColorStateList colorStateList) {
        if (this.f3098h == null) {
            this.f3098h = new C0853C0();
        }
        C0853C0 c0853c0 = this.f3098h;
        c0853c0.f3084a = colorStateList;
        c0853c0.f3087d = colorStateList != null;
        this.f3092b = c0853c0;
        this.f3093c = c0853c0;
        this.f3094d = c0853c0;
        this.f3095e = c0853c0;
        this.f3096f = c0853c0;
        this.f3097g = c0853c0;
    }

    /* JADX INFO: renamed from: k */
    public final void m2183k(PorterDuff.Mode mode) {
        if (this.f3098h == null) {
            this.f3098h = new C0853C0();
        }
        C0853C0 c0853c0 = this.f3098h;
        c0853c0.f3085b = mode;
        c0853c0.f3086c = mode != null;
        this.f3092b = c0853c0;
        this.f3093c = c0853c0;
        this.f3094d = c0853c0;
        this.f3095e = c0853c0;
        this.f3096f = c0853c0;
        this.f3097g = c0853c0;
    }

    /* JADX INFO: renamed from: l */
    public final void m2184l(Context context, C0234d c0234d) {
        String string;
        int i2 = this.f3100j;
        TypedArray typedArray = (TypedArray) c0234d.f475c;
        this.f3100j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f3101k = i4;
            if (i4 != -1) {
                this.f3100j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3103m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f3102l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f3102l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f3102l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3102l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f3101k;
        int i8 = this.f3100j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM647j = c0234d.m647j(i6, this.f3100j, new C0850B(this, i7, i8, new WeakReference(this.f3091a)));
                if (typefaceM647j != null) {
                    if (i3 < 28 || this.f3101k == -1) {
                        this.f3102l = typefaceM647j;
                    } else {
                        this.f3102l = AbstractC0858F.m2172a(Typeface.create(typefaceM647j, 0), this.f3101k, (this.f3100j & 2) != 0);
                    }
                }
                this.f3103m = this.f3102l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3102l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3101k == -1) {
            this.f3102l = Typeface.create(string, this.f3100j);
        } else {
            this.f3102l = AbstractC0858F.m2172a(Typeface.create(string, 0), this.f3101k, (this.f3100j & 2) != 0);
        }
    }
}
