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
    public final TextView f1301a;

    /* JADX INFO: renamed from: b */
    public e70 f1302b;

    /* JADX INFO: renamed from: c */
    public e70 f1303c;

    /* JADX INFO: renamed from: d */
    public e70 f1304d;

    /* JADX INFO: renamed from: e */
    public e70 f1305e;

    /* JADX INFO: renamed from: f */
    public e70 f1306f;

    /* JADX INFO: renamed from: g */
    public e70 f1307g;

    /* JADX INFO: renamed from: h */
    public e70 f1308h;

    /* JADX INFO: renamed from: i */
    public final C0510n5 f1309i;

    /* JADX INFO: renamed from: j */
    public int f1310j = 0;

    /* JADX INFO: renamed from: k */
    public int f1311k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f1312l;

    /* JADX INFO: renamed from: m */
    public boolean f1313m;

    public C0139d5(TextView textView) {
        this.f1301a = textView;
        this.f1309i = new C0510n5(textView);
    }

    /* JADX INFO: renamed from: c */
    public static e70 m867c(Context context, C0767u3 c0767u3, int i) {
        ColorStateList colorStateListM822f;
        synchronized (c0767u3) {
            colorStateListM822f = c0767u3.f4623a.m822f(context, i);
        }
        if (colorStateListM822f == null) {
            return null;
        }
        e70 e70Var = new e70();
        e70Var.f1525d = true;
        e70Var.f1522a = colorStateListM822f;
        return e70Var;
    }

    /* JADX INFO: renamed from: h */
    public static void m868h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC0930yh.m2764a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC0930yh.m2764a(editorInfo, text);
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
            g80.m1178I(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            g80.m1178I(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            g80.m1178I(editorInfo, text, i4, i2);
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
        g80.m1178I(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m869a(Drawable drawable, e70 e70Var) {
        if (drawable == null || e70Var == null) {
            return;
        }
        C0767u3.m2428e(drawable, e70Var, this.f1301a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m870b() {
        e70 e70Var = this.f1302b;
        TextView textView = this.f1301a;
        if (e70Var != null || this.f1303c != null || this.f1304d != null || this.f1305e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m869a(compoundDrawables[0], this.f1302b);
            m869a(compoundDrawables[1], this.f1303c);
            m869a(compoundDrawables[2], this.f1304d);
            m869a(compoundDrawables[3], this.f1305e);
        }
        if (this.f1306f == null && this.f1307g == null) {
            return;
        }
        Drawable[] drawableArrM2792a = AbstractC0954z4.m2792a(textView);
        m869a(drawableArrM2792a[0], this.f1306f);
        m869a(drawableArrM2792a[2], this.f1307g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m871d() {
        e70 e70Var = this.f1308h;
        if (e70Var != null) {
            return e70Var.f1522a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m872e() {
        e70 e70Var = this.f1308h;
        if (e70Var != null) {
            return e70Var.f1523b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m873f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        ColorStateList colorStateList;
        int resourceId;
        int i2;
        int resourceId2;
        TextView textView = this.f1301a;
        Context context = textView.getContext();
        C0767u3 c0767u3M2425a = C0767u3.m2425a();
        int[] iArr = AbstractC0205ez.f1684h;
        C0658r5 c0658r5M2226y = C0658r5.m2226y(context, attributeSet, iArr, i);
        oa0.m2011k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0658r5M2226y.f4064b, i);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1302b = m867c(context, c0767u3M2425a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1303c = m867c(context, c0767u3M2425a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f1304d = m867c(context, c0767u3M2425a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f1305e = m867c(context, c0767u3M2425a, typedArray.getResourceId(2, 0));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f1306f = m867c(context, c0767u3M2425a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1307g = m867c(context, c0767u3M2425a, typedArray.getResourceId(6, 0));
        }
        c0658r5M2226y.m2252z();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0205ez.f1699w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0658r5 c0658r5 = new C0658r5(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m880n(context, c0658r5);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c0658r5.m2252z();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0658r5 c0658r52 = new C0658r5(context, typedArrayObtainStyledAttributes2);
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
        m880n(context, c0658r52);
        c0658r52.m2252z();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f1312l;
        if (typeface != null) {
            if (this.f1311k == -1) {
                textView.setTypeface(typeface, this.f1310j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0056b5.m491d(textView, string);
        }
        if (string2 != null) {
            AbstractC0006a5.m28b(textView, AbstractC0006a5.m27a(string2));
        }
        C0510n5 c0510n5 = this.f1309i;
        Context context2 = c0510n5.f3233j;
        int[] iArr3 = AbstractC0205ez.f1685i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0510n5.f3232i;
        oa0.m2011k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0510n5.f3224a = typedArrayObtainStyledAttributes3.getInt(5, 0);
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
                c0510n5.f3229f = C0510n5.m1916b(iArr4);
                c0510n5.m1924i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0510n5.m1925j()) {
            c0510n5.f3224a = 0;
        } else if (c0510n5.f3224a == 1) {
            if (!c0510n5.f3230g) {
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
                c0510n5.m1926k(dimension2, f, dimension);
            }
            c0510n5.m1923h();
        }
        if (hb0.f2215b && c0510n5.f3224a != 0) {
            int[] iArr5 = c0510n5.f3229f;
            if (iArr5.length > 0) {
                if (AbstractC0056b5.m488a(textView) != -1.0f) {
                    AbstractC0056b5.m489b(textView, Math.round(c0510n5.f3227d), Math.round(c0510n5.f3228e), Math.round(c0510n5.f3226c), 0);
                } else {
                    AbstractC0056b5.m490c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM2429b = resourceId4 != -1 ? c0767u3M2425a.m2429b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM2429b2 = resourceId5 != -1 ? c0767u3M2425a.m2429b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM2429b3 = resourceId6 != -1 ? c0767u3M2425a.m2429b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM2429b4 = resourceId7 != -1 ? c0767u3M2425a.m2429b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM2429b5 = resourceId8 != -1 ? c0767u3M2425a.m2429b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM2429b6 = resourceId9 != -1 ? c0767u3M2425a.m2429b(context, resourceId9) : null;
        if (drawableM2429b5 != null || drawableM2429b6 != null) {
            Drawable[] drawableArrM2792a = AbstractC0954z4.m2792a(textView);
            if (drawableM2429b5 == null) {
                drawableM2429b5 = drawableArrM2792a[0];
            }
            if (drawableM2429b2 == null) {
                drawableM2429b2 = drawableArrM2792a[1];
            }
            if (drawableM2429b6 == null) {
                drawableM2429b6 = drawableArrM2792a[2];
            }
            if (drawableM2429b4 == null) {
                drawableM2429b4 = drawableArrM2792a[3];
            }
            AbstractC0954z4.m2793b(textView, drawableM2429b5, drawableM2429b2, drawableM2429b6, drawableM2429b4);
        } else if (drawableM2429b != null || drawableM2429b2 != null || drawableM2429b3 != null || drawableM2429b4 != null) {
            Drawable[] drawableArrM2792a2 = AbstractC0954z4.m2792a(textView);
            Drawable drawable = drawableArrM2792a2[0];
            if (drawable == null && drawableArrM2792a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM2429b == null) {
                    drawableM2429b = compoundDrawables[0];
                }
                if (drawableM2429b2 == null) {
                    drawableM2429b2 = compoundDrawables[1];
                }
                if (drawableM2429b3 == null) {
                    drawableM2429b3 = compoundDrawables[2];
                }
                if (drawableM2429b4 == null) {
                    drawableM2429b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM2429b, drawableM2429b2, drawableM2429b3, drawableM2429b4);
            } else {
                if (drawableM2429b2 == null) {
                    drawableM2429b2 = drawableArrM2792a2[1];
                }
                Drawable drawable2 = drawableArrM2792a2[2];
                if (drawableM2429b4 == null) {
                    drawableM2429b4 = drawableArrM2792a2[3];
                }
                AbstractC0954z4.m2793b(textView, drawable, drawableM2429b2, drawable2, drawableM2429b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0493mp.m1864n(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            r60.m2261f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            r60.m2262g(textView, AbstractC0261gh.m1276b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0274gu.m1304G(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0274gu.m1305H(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC0498mu.m1886c(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m874g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0205ez.f1699w);
        C0658r5 c0658r5 = new C0658r5(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1301a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m880n(context, c0658r5);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0056b5.m491d(textView, string);
        }
        c0658r5.m2252z();
        Typeface typeface = this.f1312l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1310j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m875i(int i, int i2, int i3, int i4) {
        C0510n5 c0510n5 = this.f1309i;
        if (c0510n5.m1925j()) {
            DisplayMetrics displayMetrics = c0510n5.f3233j.getResources().getDisplayMetrics();
            c0510n5.m1926k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0510n5.m1923h()) {
                c0510n5.m1919a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m876j(int[] iArr, int i) {
        C0510n5 c0510n5 = this.f1309i;
        if (c0510n5.m1925j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0510n5.f3233j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0510n5.f3229f = C0510n5.m1916b(iArrCopyOf);
                if (!c0510n5.m1924i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0510n5.f3230g = false;
            }
            if (c0510n5.m1923h()) {
                c0510n5.m1919a();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m877k(int i) {
        C0510n5 c0510n5 = this.f1309i;
        if (c0510n5.m1925j()) {
            if (i == 0) {
                c0510n5.f3224a = 0;
                c0510n5.f3227d = -1.0f;
                c0510n5.f3228e = -1.0f;
                c0510n5.f3226c = -1.0f;
                c0510n5.f3229f = new int[0];
                c0510n5.f3225b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = c0510n5.f3233j.getResources().getDisplayMetrics();
            c0510n5.m1926k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0510n5.m1923h()) {
                c0510n5.m1919a();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m878l(ColorStateList colorStateList) {
        if (this.f1308h == null) {
            this.f1308h = new e70();
        }
        e70 e70Var = this.f1308h;
        e70Var.f1522a = colorStateList;
        e70Var.f1525d = colorStateList != null;
        this.f1302b = e70Var;
        this.f1303c = e70Var;
        this.f1304d = e70Var;
        this.f1305e = e70Var;
        this.f1306f = e70Var;
        this.f1307g = e70Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m879m(PorterDuff.Mode mode) {
        if (this.f1308h == null) {
            this.f1308h = new e70();
        }
        e70 e70Var = this.f1308h;
        e70Var.f1523b = mode;
        e70Var.f1524c = mode != null;
        this.f1302b = e70Var;
        this.f1303c = e70Var;
        this.f1304d = e70Var;
        this.f1305e = e70Var;
        this.f1306f = e70Var;
        this.f1307g = e70Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m880n(Context context, C0658r5 c0658r5) {
        String string;
        int i = this.f1310j;
        TypedArray typedArray = (TypedArray) c0658r5.f4064b;
        this.f1310j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f1311k = i3;
            if (i3 != -1) {
                this.f1310j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1313m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f1312l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f1312l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f1312l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1312l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f1311k;
        int i7 = this.f1310j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM2243o = c0658r5.m2243o(i5, this.f1310j, new C0880x4(this, i6, i7, new WeakReference(this.f1301a)));
                if (typefaceM2243o != null) {
                    if (i2 < 28 || this.f1311k == -1) {
                        this.f1312l = typefaceM2243o;
                    } else {
                        this.f1312l = AbstractC0092c5.m586a(Typeface.create(typefaceM2243o, 0), this.f1311k, (this.f1310j & 2) != 0);
                    }
                }
                this.f1313m = this.f1312l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1312l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1311k == -1) {
            this.f1312l = Typeface.create(string, this.f1310j);
        } else {
            this.f1312l = AbstractC0092c5.m586a(Typeface.create(string, 0), this.f1311k, (this.f1310j & 2) != 0);
        }
    }
}
