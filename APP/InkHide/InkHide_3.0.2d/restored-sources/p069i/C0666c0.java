package p069i;

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
import p004C.AbstractC0058b;
import p004C.AbstractC0059c;
import p004C.C0064h;
import p006D.AbstractC0079h;
import p006D.AbstractC0088q;
import p006D.InterfaceC0074c;
import p022L.AbstractC0174d;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0666c0 {

    /* JADX INFO: renamed from: a */
    public final TextView f2241a;

    /* JADX INFO: renamed from: b */
    public C0676f1 f2242b;

    /* JADX INFO: renamed from: c */
    public C0676f1 f2243c;

    /* JADX INFO: renamed from: d */
    public C0676f1 f2244d;

    /* JADX INFO: renamed from: e */
    public C0676f1 f2245e;

    /* JADX INFO: renamed from: f */
    public C0676f1 f2246f;

    /* JADX INFO: renamed from: g */
    public C0676f1 f2247g;

    /* JADX INFO: renamed from: h */
    public C0676f1 f2248h;

    /* JADX INFO: renamed from: i */
    public final C0690k0 f2249i;

    /* JADX INFO: renamed from: j */
    public int f2250j = 0;

    /* JADX INFO: renamed from: k */
    public int f2251k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f2252l;

    /* JADX INFO: renamed from: m */
    public boolean f2253m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0666c0(TextView textView) {
        this.f2241a = textView;
        this.f2249i = new C0690k0(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C0676f1 m1278c(Context context, C0719u c0719u, int i2) {
        ColorStateList colorStateListM1256f;
        synchronized (c0719u) {
            colorStateListM1256f = c0719u.f2439a.m1256f(context, i2);
        }
        if (colorStateListM1256f == null) {
            return null;
        }
        C0676f1 c0676f1 = new C0676f1();
        c0676f1.f2290d = true;
        c0676f1.f2287a = colorStateListM1256f;
        return c0676f1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m1279h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            AbstractC0058b.m106a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            AbstractC0058b.m106a(editorInfo, text);
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
            AbstractC0059c.m107a(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            AbstractC0059c.m107a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0059c.m107a(editorInfo, text, i5, i3);
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
        AbstractC0059c.m107a(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1280a(Drawable drawable, C0676f1 c0676f1) {
        if (drawable == null || c0676f1 == null) {
            return;
        }
        C0719u.m1369d(drawable, c0676f1, this.f2241a.getDrawableState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1281b() {
        C0676f1 c0676f1 = this.f2242b;
        TextView textView = this.f2241a;
        if (c0676f1 != null || this.f2243c != null || this.f2244d != null || this.f2245e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m1280a(compoundDrawables[0], this.f2242b);
            m1280a(compoundDrawables[1], this.f2243c);
            m1280a(compoundDrawables[2], this.f2244d);
            m1280a(compoundDrawables[3], this.f2245e);
        }
        if (this.f2246f == null && this.f2247g == null) {
            return;
        }
        Drawable[] drawableArrM1268a = AbstractC0655Y.m1268a(textView);
        m1280a(drawableArrM1268a[0], this.f2246f);
        m1280a(drawableArrM1268a[2], this.f2247g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final ColorStateList m1282d() {
        C0676f1 c0676f1 = this.f2248h;
        if (c0676f1 != null) {
            return c0676f1.f2287a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m1283e() {
        C0676f1 c0676f1 = this.f2248h;
        if (c0676f1 != null) {
            return c0676f1.f2288b;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1284f(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String string;
        String string2;
        ColorStateList colorStateList;
        int resourceId;
        int i3;
        int resourceId2;
        TextView textView = this.f2241a;
        Context context = textView.getContext();
        C0719u c0719uM1367a = C0719u.m1367a();
        int[] iArr = AbstractC0515a.f1644h;
        C0064h c0064hM114t = C0064h.m114t(context, attributeSet, iArr, i2);
        AbstractC1048L.m2289h(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0064hM114t.f309c, i2);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2242b = m1278c(context, c0719uM1367a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2243c = m1278c(context, c0719uM1367a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2244d = m1278c(context, c0719uM1367a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2245e = m1278c(context, c0719uM1367a, typedArray.getResourceId(2, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f2246f = m1278c(context, c0719uM1367a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2247g = m1278c(context, c0719uM1367a, typedArray.getResourceId(6, 0));
        }
        c0064hM114t.m130v();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0515a.f1659w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0064h c0064h = new C0064h(context, typedArrayObtainStyledAttributes);
            if (z4 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m1291n(context, c0064h);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i4 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c0064h.m130v();
        } else {
            z2 = false;
            z3 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0064h c0064h2 = new C0064h(context, typedArrayObtainStyledAttributes2);
        if (!z4 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z3 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z5 = z3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i4 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i4 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1291n(context, c0064h2);
        c0064h2.m130v();
        if (!z4 && z2) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f2252l;
        if (typeface != null) {
            if (this.f2251k == -1) {
                textView.setTypeface(typeface, this.f2250j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0660a0.m1276d(textView, string);
        }
        if (string2 != null) {
            AbstractC0657Z.m1272b(textView, AbstractC0657Z.m1271a(string2));
        }
        int[] iArr3 = AbstractC0515a.f1645i;
        C0690k0 c0690k0 = this.f2249i;
        Context context2 = c0690k0.f2336j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = c0690k0.f2335i;
        AbstractC1048L.m2289h(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i2);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0690k0.f2327a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                c0690k0.f2332f = C0690k0.m1312b(iArr4);
                c0690k0.m1320i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0690k0.m1321j()) {
            c0690k0.f2327a = 0;
        } else if (c0690k0.f2327a == 1) {
            if (!c0690k0.f2333g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0690k0.m1322k(dimension2, f, dimension);
            }
            c0690k0.m1319h();
        }
        if (InterfaceC0074c.f337a && c0690k0.f2327a != 0) {
            int[] iArr5 = c0690k0.f2332f;
            if (iArr5.length > 0) {
                if (AbstractC0660a0.m1273a(textView) != -1.0f) {
                    AbstractC0660a0.m1274b(textView, Math.round(c0690k0.f2330d), Math.round(c0690k0.f2331e), Math.round(c0690k0.f2329c), 0);
                } else {
                    AbstractC0660a0.m1275c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM1370b = resourceId4 != -1 ? c0719uM1367a.m1370b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM1370b2 = resourceId5 != -1 ? c0719uM1367a.m1370b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM1370b3 = resourceId6 != -1 ? c0719uM1367a.m1370b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM1370b4 = resourceId7 != -1 ? c0719uM1367a.m1370b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM1370b5 = resourceId8 != -1 ? c0719uM1367a.m1370b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM1370b6 = resourceId9 != -1 ? c0719uM1367a.m1370b(context, resourceId9) : null;
        if (drawableM1370b5 != null || drawableM1370b6 != null) {
            Drawable[] drawableArrM1268a = AbstractC0655Y.m1268a(textView);
            if (drawableM1370b5 == null) {
                drawableM1370b5 = drawableArrM1268a[0];
            }
            if (drawableM1370b2 == null) {
                drawableM1370b2 = drawableArrM1268a[1];
            }
            if (drawableM1370b6 == null) {
                drawableM1370b6 = drawableArrM1268a[2];
            }
            if (drawableM1370b4 == null) {
                drawableM1370b4 = drawableArrM1268a[3];
            }
            AbstractC0655Y.m1269b(textView, drawableM1370b5, drawableM1370b2, drawableM1370b6, drawableM1370b4);
        } else if (drawableM1370b != null || drawableM1370b2 != null || drawableM1370b3 != null || drawableM1370b4 != null) {
            Drawable[] drawableArrM1268a2 = AbstractC0655Y.m1268a(textView);
            Drawable drawable = drawableArrM1268a2[0];
            if (drawable == null && drawableArrM1268a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM1370b == null) {
                    drawableM1370b = compoundDrawables[0];
                }
                if (drawableM1370b2 == null) {
                    drawableM1370b2 = compoundDrawables[1];
                }
                if (drawableM1370b3 == null) {
                    drawableM1370b3 = compoundDrawables[2];
                }
                if (drawableM1370b4 == null) {
                    drawableM1370b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM1370b, drawableM1370b2, drawableM1370b3, drawableM1370b4);
            } else {
                if (drawableM1370b2 == null) {
                    drawableM1370b2 = drawableArrM1268a2[1];
                }
                Drawable drawable2 = drawableArrM1268a2[2];
                if (drawableM1370b4 == null) {
                    drawableM1370b4 = drawableArrM1268a2[3];
                }
                AbstractC0655Y.m1269b(textView, drawable, drawableM1370b2, drawable2, drawableM1370b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0503h.m990w(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            AbstractC0088q.m233f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            AbstractC0088q.m234g(textView, AbstractC0705p0.m1337b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0079h.m173R(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0079h.m174S(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1285g(Context context, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0515a.f1659w);
        C0064h c0064h = new C0064h(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f2241a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1291n(context, c0064h);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0660a0.m1276d(textView, string);
        }
        c0064h.m130v();
        Typeface typeface = this.f2252l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2250j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1286i(int i2, int i3, int i4, int i5) {
        C0690k0 c0690k0 = this.f2249i;
        if (c0690k0.m1321j()) {
            DisplayMetrics displayMetrics = c0690k0.f2336j.getResources().getDisplayMetrics();
            c0690k0.m1322k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0690k0.m1319h()) {
                c0690k0.m1315a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1287j(int[] iArr, int i2) {
        C0690k0 c0690k0 = this.f2249i;
        if (c0690k0.m1321j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0690k0.f2336j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0690k0.f2332f = C0690k0.m1312b(iArrCopyOf);
                if (!c0690k0.m1320i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0690k0.f2333g = false;
            }
            if (c0690k0.m1319h()) {
                c0690k0.m1315a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1288k(int i2) {
        C0690k0 c0690k0 = this.f2249i;
        if (c0690k0.m1321j()) {
            if (i2 == 0) {
                c0690k0.f2327a = 0;
                c0690k0.f2330d = -1.0f;
                c0690k0.f2331e = -1.0f;
                c0690k0.f2329c = -1.0f;
                c0690k0.f2332f = new int[0];
                c0690k0.f2328b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(AbstractC0174d.m351g(i2, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c0690k0.f2336j.getResources().getDisplayMetrics();
            c0690k0.m1322k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0690k0.m1319h()) {
                c0690k0.m1315a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m1289l(ColorStateList colorStateList) {
        if (this.f2248h == null) {
            this.f2248h = new C0676f1();
        }
        C0676f1 c0676f1 = this.f2248h;
        c0676f1.f2287a = colorStateList;
        c0676f1.f2290d = colorStateList != null;
        this.f2242b = c0676f1;
        this.f2243c = c0676f1;
        this.f2244d = c0676f1;
        this.f2245e = c0676f1;
        this.f2246f = c0676f1;
        this.f2247g = c0676f1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m1290m(PorterDuff.Mode mode) {
        if (this.f2248h == null) {
            this.f2248h = new C0676f1();
        }
        C0676f1 c0676f1 = this.f2248h;
        c0676f1.f2288b = mode;
        c0676f1.f2289c = mode != null;
        this.f2242b = c0676f1;
        this.f2243c = c0676f1;
        this.f2244d = c0676f1;
        this.f2245e = c0676f1;
        this.f2246f = c0676f1;
        this.f2247g = c0676f1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m1291n(Context context, C0064h c0064h) {
        String string;
        int i2 = this.f2250j;
        TypedArray typedArray = (TypedArray) c0064h.f309c;
        this.f2250j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f2251k = i4;
            if (i4 != -1) {
                this.f2250j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2253m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f2252l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f2252l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f2252l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2252l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f2251k;
        int i8 = this.f2250j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM126p = c0064h.m126p(i6, this.f2250j, new C0651W(this, i7, i8, new WeakReference(this.f2241a)));
                if (typefaceM126p != null) {
                    if (i3 < 28 || this.f2251k == -1) {
                        this.f2252l = typefaceM126p;
                    } else {
                        this.f2252l = AbstractC0663b0.m1277a(Typeface.create(typefaceM126p, 0), this.f2251k, (this.f2250j & 2) != 0);
                    }
                }
                this.f2253m = this.f2252l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2252l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2251k == -1) {
            this.f2252l = Typeface.create(string, this.f2250j);
        } else {
            this.f2252l = AbstractC0663b0.m1277a(Typeface.create(string, 0), this.f2251k, (this.f2250j & 2) != 0);
        }
    }
}
