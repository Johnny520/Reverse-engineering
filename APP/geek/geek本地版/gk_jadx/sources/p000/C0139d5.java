package p000;

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
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0139d5 {

    /* JADX INFO: renamed from: a */
    public final TextView f1367a;

    /* JADX INFO: renamed from: b */
    public y60 f1368b;

    /* JADX INFO: renamed from: c */
    public y60 f1369c;

    /* JADX INFO: renamed from: d */
    public y60 f1370d;

    /* JADX INFO: renamed from: e */
    public y60 f1371e;

    /* JADX INFO: renamed from: f */
    public y60 f1372f;

    /* JADX INFO: renamed from: g */
    public y60 f1373g;

    /* JADX INFO: renamed from: h */
    public y60 f1374h;

    /* JADX INFO: renamed from: i */
    public final C0510n5 f1375i;

    /* JADX INFO: renamed from: j */
    public int f1376j = 0;

    /* JADX INFO: renamed from: k */
    public int f1377k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f1378l;

    /* JADX INFO: renamed from: m */
    public boolean f1379m;

    public C0139d5(TextView textView) {
        this.f1367a = textView;
        this.f1375i = new C0510n5(textView);
    }

    /* JADX INFO: renamed from: c */
    public static y60 m910c(Context context, C0768u3 c0768u3, int i) {
        ColorStateList colorStateListM2542f;
        synchronized (c0768u3) {
            colorStateListM2542f = c0768u3.f4655a.m2542f(context, i);
        }
        if (colorStateListM2542f == null) {
            return null;
        }
        y60 y60Var = new y60();
        y60Var.f5282d = true;
        y60Var.f5279a = colorStateListM2542f;
        return y60Var;
    }

    /* JADX INFO: renamed from: h */
    public static void m911h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC0856wh.m2569a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC0856wh.m2569a(editorInfo, text);
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
            AbstractC0222ff.m1168N(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC0222ff.m1168N(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0222ff.m1168N(editorInfo, text, i4, i2);
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
        AbstractC0222ff.m1168N(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m912a(Drawable drawable, y60 y60Var) {
        if (drawable == null || y60Var == null) {
            return;
        }
        C0768u3.m2407e(drawable, y60Var, this.f1367a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m913b() {
        y60 y60Var = this.f1368b;
        TextView textView = this.f1367a;
        if (y60Var != null || this.f1369c != null || this.f1370d != null || this.f1371e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m912a(compoundDrawables[0], this.f1368b);
            m912a(compoundDrawables[1], this.f1369c);
            m912a(compoundDrawables[2], this.f1370d);
            m912a(compoundDrawables[3], this.f1371e);
        }
        if (this.f1372f == null && this.f1373g == null) {
            return;
        }
        Drawable[] drawableArrM2778a = AbstractC0954z4.m2778a(textView);
        m912a(drawableArrM2778a[0], this.f1372f);
        m912a(drawableArrM2778a[2], this.f1373g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m914d() {
        y60 y60Var = this.f1374h;
        if (y60Var != null) {
            return y60Var.f5279a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m915e() {
        y60 y60Var = this.f1374h;
        if (y60Var != null) {
            return y60Var.f5280b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m916f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        ColorStateList colorStateList;
        int resourceId;
        int i2;
        int resourceId2;
        TextView textView = this.f1367a;
        Context context = textView.getContext();
        C0768u3 c0768u3M2404a = C0768u3.m2404a();
        int[] iArr = AbstractC0910xy.f5224h;
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context, attributeSet, iArr, i);
        ja0.m1574k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0659r5M2219y.f4209b, i);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1368b = m910c(context, c0768u3M2404a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1369c = m910c(context, c0768u3M2404a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f1370d = m910c(context, c0768u3M2404a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f1371e = m910c(context, c0768u3M2404a, typedArray.getResourceId(2, 0));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f1372f = m910c(context, c0768u3M2404a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1373g = m910c(context, c0768u3M2404a, typedArray.getResourceId(6, 0));
        }
        c0659r5M2219y.m2245z();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0910xy.f5239w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0659r5 c0659r5 = new C0659r5(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m923n(context, c0659r5);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c0659r5.m2245z();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0659r5 c0659r52 = new C0659r5(context, typedArrayObtainStyledAttributes2);
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
        if (i3 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m923n(context, c0659r52);
        c0659r52.m2245z();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f1378l;
        if (typeface != null) {
            if (this.f1377k == -1) {
                textView.setTypeface(typeface, this.f1376j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0056b5.m515d(textView, string);
        }
        if (string2 != null) {
            AbstractC0006a5.m16b(textView, AbstractC0006a5.m15a(string2));
        }
        C0510n5 c0510n5 = this.f1375i;
        Context context2 = c0510n5.f3343j;
        int[] iArr3 = AbstractC0910xy.f5225i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0510n5.f3342i;
        ja0.m1574k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0510n5.f3334a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                c0510n5.f3339f = C0510n5.m1905b(iArr4);
                c0510n5.m1913i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0510n5.m1914j()) {
            c0510n5.f3334a = 0;
        } else if (c0510n5.f3334a == 1) {
            if (!c0510n5.f3340g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0510n5.m1915k(dimension2, f, dimension);
            }
            c0510n5.m1912h();
        }
        if (cb0.f943b && c0510n5.f3334a != 0) {
            int[] iArr5 = c0510n5.f3339f;
            if (iArr5.length > 0) {
                if (AbstractC0056b5.m512a(textView) != -1.0f) {
                    AbstractC0056b5.m513b(textView, Math.round(c0510n5.f3337d), Math.round(c0510n5.f3338e), Math.round(c0510n5.f3336c), 0);
                } else {
                    AbstractC0056b5.m514c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM2408b = resourceId4 != -1 ? c0768u3M2404a.m2408b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM2408b2 = resourceId5 != -1 ? c0768u3M2404a.m2408b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM2408b3 = resourceId6 != -1 ? c0768u3M2404a.m2408b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM2408b4 = resourceId7 != -1 ? c0768u3M2404a.m2408b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM2408b5 = resourceId8 != -1 ? c0768u3M2404a.m2408b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM2408b6 = resourceId9 != -1 ? c0768u3M2404a.m2408b(context, resourceId9) : null;
        if (drawableM2408b5 != null || drawableM2408b6 != null) {
            Drawable[] drawableArrM2778a = AbstractC0954z4.m2778a(textView);
            if (drawableM2408b5 == null) {
                drawableM2408b5 = drawableArrM2778a[0];
            }
            if (drawableM2408b2 == null) {
                drawableM2408b2 = drawableArrM2778a[1];
            }
            if (drawableM2408b6 == null) {
                drawableM2408b6 = drawableArrM2778a[2];
            }
            if (drawableM2408b4 == null) {
                drawableM2408b4 = drawableArrM2778a[3];
            }
            AbstractC0954z4.m2779b(textView, drawableM2408b5, drawableM2408b2, drawableM2408b6, drawableM2408b4);
        } else if (drawableM2408b != null || drawableM2408b2 != null || drawableM2408b3 != null || drawableM2408b4 != null) {
            Drawable[] drawableArrM2778a2 = AbstractC0954z4.m2778a(textView);
            Drawable drawable = drawableArrM2778a2[0];
            if (drawable == null && drawableArrM2778a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM2408b == null) {
                    drawableM2408b = compoundDrawables[0];
                }
                if (drawableM2408b2 == null) {
                    drawableM2408b2 = compoundDrawables[1];
                }
                if (drawableM2408b3 == null) {
                    drawableM2408b3 = compoundDrawables[2];
                }
                if (drawableM2408b4 == null) {
                    drawableM2408b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM2408b, drawableM2408b2, drawableM2408b3, drawableM2408b4);
            } else {
                if (drawableM2408b2 == null) {
                    drawableM2408b2 = drawableArrM2778a2[1];
                }
                Drawable drawable2 = drawableArrM2778a2[2];
                if (drawableM2408b4 == null) {
                    drawableM2408b4 = drawableArrM2778a2[3];
                }
                AbstractC0954z4.m2779b(textView, drawable, drawableM2408b2, drawable2, drawableM2408b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0346ip.m1510v(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            l60.m1749f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            l60.m1750g(textView, AbstractC0187eh.m1028b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0979zt.m2819L(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0979zt.m2820M(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC0979zt.m2824e(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m917g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0910xy.f5239w);
        C0659r5 c0659r5 = new C0659r5(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1367a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m923n(context, c0659r5);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0056b5.m515d(textView, string);
        }
        c0659r5.m2245z();
        Typeface typeface = this.f1378l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1376j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m918i(int i, int i2, int i3, int i4) {
        C0510n5 c0510n5 = this.f1375i;
        if (c0510n5.m1914j()) {
            DisplayMetrics displayMetrics = c0510n5.f3343j.getResources().getDisplayMetrics();
            c0510n5.m1915k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0510n5.m1912h()) {
                c0510n5.m1908a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m919j(int[] iArr, int i) {
        C0510n5 c0510n5 = this.f1375i;
        if (c0510n5.m1914j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0510n5.f3343j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0510n5.f3339f = C0510n5.m1905b(iArrCopyOf);
                if (!c0510n5.m1913i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0510n5.f3340g = false;
            }
            if (c0510n5.m1912h()) {
                c0510n5.m1908a();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m920k(int i) {
        C0510n5 c0510n5 = this.f1375i;
        if (c0510n5.m1914j()) {
            if (i == 0) {
                c0510n5.f3334a = 0;
                c0510n5.f3337d = -1.0f;
                c0510n5.f3338e = -1.0f;
                c0510n5.f3336c = -1.0f;
                c0510n5.f3339f = new int[0];
                c0510n5.f3335b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = c0510n5.f3343j.getResources().getDisplayMetrics();
            c0510n5.m1915k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0510n5.m1912h()) {
                c0510n5.m1908a();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m921l(ColorStateList colorStateList) {
        if (this.f1374h == null) {
            this.f1374h = new y60();
        }
        y60 y60Var = this.f1374h;
        y60Var.f5279a = colorStateList;
        y60Var.f5282d = colorStateList != null;
        this.f1368b = y60Var;
        this.f1369c = y60Var;
        this.f1370d = y60Var;
        this.f1371e = y60Var;
        this.f1372f = y60Var;
        this.f1373g = y60Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m922m(PorterDuff.Mode mode) {
        if (this.f1374h == null) {
            this.f1374h = new y60();
        }
        y60 y60Var = this.f1374h;
        y60Var.f5280b = mode;
        y60Var.f5281c = mode != null;
        this.f1368b = y60Var;
        this.f1369c = y60Var;
        this.f1370d = y60Var;
        this.f1371e = y60Var;
        this.f1372f = y60Var;
        this.f1373g = y60Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m923n(Context context, C0659r5 c0659r5) {
        String string;
        int i = this.f1376j;
        TypedArray typedArray = (TypedArray) c0659r5.f4209b;
        this.f1376j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f1377k = i3;
            if (i3 != -1) {
                this.f1376j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1379m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f1378l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f1378l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f1378l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1378l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f1377k;
        int i7 = this.f1376j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM2236o = c0659r5.m2236o(i5, this.f1376j, new C0880x4(this, i6, i7, new WeakReference(this.f1367a)));
                if (typefaceM2236o != null) {
                    if (i2 < 28 || this.f1377k == -1) {
                        this.f1378l = typefaceM2236o;
                    } else {
                        this.f1378l = AbstractC0092c5.m628a(Typeface.create(typefaceM2236o, 0), this.f1377k, (this.f1376j & 2) != 0);
                    }
                }
                this.f1379m = this.f1378l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1378l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1377k == -1) {
            this.f1378l = Typeface.create(string, this.f1376j);
        } else {
            this.f1378l = AbstractC0092c5.m628a(Typeface.create(string, 0), this.f1377k, (this.f1376j & 2) != 0);
        }
    }
}
