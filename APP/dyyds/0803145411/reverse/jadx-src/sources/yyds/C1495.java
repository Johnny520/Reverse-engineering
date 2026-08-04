package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛷᛲᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1495 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C2731 f7051;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f7052;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C2545 f7053;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2731 f7054;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final TextView f7055;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C2731 f7056;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C2731 f7057;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Typeface f7059;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2731 f7061;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2731 f7062;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C2731 f7063;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f7060 = 0;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f7058 = -1;

    public C1495(TextView textView) {
        this.f7055 = textView;
        this.f7053 = new C2545(textView);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C2731 m3004(Context context, C1541 c1541, int i) {
        ColorStateList colorStateListM3180;
        synchronized (c1541) {
            colorStateListM3180 = c1541.f7388.m3180(context, i);
        }
        if (colorStateListM3180 == null) {
            return null;
        }
        C2731 c2731 = new C2731();
        c2731.f13429 = true;
        c2731.f13430 = colorStateListM3180;
        return c2731;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m3005(ColorStateList colorStateList) {
        C2731 c2731 = this.f7051;
        if (c2731 == null) {
            c2731 = new C2731();
            this.f7051 = c2731;
        }
        C2731 c27312 = c2731;
        c2731.f13430 = colorStateList;
        c2731.f13429 = colorStateList != null;
        this.f7056 = c27312;
        this.f7061 = c27312;
        this.f7063 = c27312;
        this.f7054 = c27312;
        this.f7062 = c27312;
        this.f7057 = c27312;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m3006(PorterDuff.Mode mode) {
        C2731 c2731 = this.f7051;
        if (c2731 == null) {
            c2731 = new C2731();
            this.f7051 = c2731;
        }
        C2731 c27312 = c2731;
        c2731.f13431 = mode;
        c2731.f13428 = mode != null;
        this.f7056 = c27312;
        this.f7061 = c27312;
        this.f7063 = c27312;
        this.f7054 = c27312;
        this.f7062 = c27312;
        this.f7057 = c27312;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final PorterDuff.Mode m3007() {
        C2731 c2731 = this.f7051;
        if (c2731 != null) {
            return (PorterDuff.Mode) c2731.f13431;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3008(Drawable drawable, C2731 c2731) {
        if (drawable == null || c2731 == null) {
            return;
        }
        int[] drawableState = this.f7055.getDrawableState();
        PorterDuff.Mode mode = C1541.f7386;
        C1542.m3173(drawable, c2731, drawableState);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3009() {
        C2731 c2731 = this.f7056;
        TextView textView = this.f7055;
        if (c2731 != null || this.f7061 != null || this.f7063 != null || this.f7054 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m3008(compoundDrawables[0], this.f7056);
            m3008(compoundDrawables[1], this.f7061);
            m3008(compoundDrawables[2], this.f7063);
            m3008(compoundDrawables[3], this.f7054);
        }
        if (this.f7062 == null && this.f7057 == null) {
            return;
        }
        Drawable[] drawableArrM3242 = AbstractC1582.m3242(textView);
        m3008(drawableArrM3242[0], this.f7062);
        m3008(drawableArrM3242[2], this.f7057);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m3010(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1592.f8100);
        C0644 c0644 = new C0644(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f7055;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m3011(context, c0644);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0076.m471(textView, string);
        }
        c0644.m1568();
        Typeface typeface = this.f7059;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f7060);
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m3011(Context context, C0644 c0644) {
        String string;
        int i = this.f7060;
        TypedArray typedArray = (TypedArray) c0644.f3099;
        this.f7060 = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.f7058 = i2;
        if (i2 != -1) {
            this.f7060 &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f7052 = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.f7059 = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.f7059 = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f7059 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7059 = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.f7058;
        int i6 = this.f7060;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1562 = c0644.m1562(i4, this.f7060, new C1849(this, i5, i6, new WeakReference(this.f7055)));
                if (typefaceM1562 != null) {
                    if (this.f7058 != -1) {
                        this.f7059 = AbstractC1957.m3772(Typeface.create(typefaceM1562, 0), this.f7058, (this.f7060 & 2) != 0);
                    } else {
                        this.f7059 = typefaceM1562;
                    }
                }
                this.f7052 = this.f7059 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7059 != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.f7058 != -1) {
            this.f7059 = AbstractC1957.m3772(Typeface.create(string, 0), this.f7058, (this.f7060 & 2) != 0);
        } else {
            this.f7059 = Typeface.create(string, this.f7060);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3012(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        int i3;
        int resourceId2;
        TextView textView = this.f7055;
        Context context = textView.getContext();
        C1541 c1541M3170 = C1541.m3170();
        int[] iArr = AbstractC1592.f8088;
        C0644 c0644M1535 = C0644.m1535(context, attributeSet, iArr, i);
        Context context2 = textView.getContext();
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(textView, context2, iArr, attributeSet, typedArray, i, 0);
        TypedArray typedArray2 = (TypedArray) c0644M1535.f3099;
        int resourceId3 = typedArray2.getResourceId(0, -1);
        if (typedArray2.hasValue(3)) {
            this.f7056 = m3004(context, c1541M3170, typedArray2.getResourceId(3, 0));
        }
        if (typedArray2.hasValue(1)) {
            this.f7061 = m3004(context, c1541M3170, typedArray2.getResourceId(1, 0));
        }
        if (typedArray2.hasValue(4)) {
            this.f7063 = m3004(context, c1541M3170, typedArray2.getResourceId(4, 0));
        }
        if (typedArray2.hasValue(2)) {
            this.f7054 = m3004(context, c1541M3170, typedArray2.getResourceId(2, 0));
        }
        if (typedArray2.hasValue(5)) {
            this.f7062 = m3004(context, c1541M3170, typedArray2.getResourceId(5, 0));
        }
        if (typedArray2.hasValue(6)) {
            this.f7057 = m3004(context, c1541M3170, typedArray2.getResourceId(6, 0));
        }
        c0644M1535.m1568();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC1592.f8100;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0644 c0644 = new C0644(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m3011(context, c0644);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c0644.m1568();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0644 c06442 = new C0644(context, typedArrayObtainStyledAttributes2);
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
        m3011(context, c06442);
        c06442.m1568();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f7059;
        if (typeface != null) {
            if (this.f7058 == -1) {
                textView.setTypeface(typeface, this.f7060);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0076.m471(textView, string);
        }
        if (string2 != null) {
            AbstractC0566.m1440(textView, AbstractC0566.m1439(string2));
        }
        C2545 c2545 = this.f7053;
        Context context3 = c2545.f12540;
        int[] iArr3 = AbstractC1592.f8091;
        TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c2545.f12544;
        AbstractC1256.m2535(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c2545.f12542 = typedArrayObtainStyledAttributes3.getInt(5, 0);
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
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                int[] iArrM4582 = C2545.m4582(iArr4);
                c2545.f12541 = iArrM4582;
                boolean z5 = iArrM4582.length > 0;
                c2545.f12546 = z5;
                if (z5) {
                    c2545.f12542 = 1;
                    c2545.f12545 = iArrM4582[0];
                    c2545.f12547 = iArrM4582[r13 - 1];
                    c2545.f12543 = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c2545.m4583()) {
            c2545.f12542 = i2;
        } else if (c2545.f12542 == 1) {
            if (!c2545.f12546) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c2545.f12542 = 1;
                c2545.f12545 = dimension2;
                c2545.f12547 = dimension3;
                c2545.f12543 = dimension;
                c2545.f12546 = i2;
            }
            if (c2545.m4583() && c2545.f12542 == 1 && (!c2545.f12546 || c2545.f12541.length == 0)) {
                int iFloor = ((int) Math.floor((c2545.f12547 - c2545.f12545) / c2545.f12543)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i5 = 0; i5 < iFloor; i5++) {
                    iArr5[i5] = Math.round((i5 * c2545.f12543) + c2545.f12545);
                }
                c2545.f12541 = C2545.m4582(iArr5);
            }
        }
        Method method = AbstractC1603.f8163;
        if (c2545.f12542 != 0) {
            int[] iArr6 = c2545.f12541;
            if (iArr6.length > 0) {
                if (AbstractC0076.m468(textView) != -1.0f) {
                    AbstractC0076.m469(textView, Math.round(c2545.f12545), Math.round(c2545.f12547), Math.round(c2545.f12543), 0);
                } else {
                    AbstractC0076.m470(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM3172 = resourceId4 != -1 ? c1541M3170.m3172(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM31722 = resourceId5 != -1 ? c1541M3170.m3172(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM31723 = resourceId6 != -1 ? c1541M3170.m3172(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM31724 = resourceId7 != -1 ? c1541M3170.m3172(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM31725 = resourceId8 != -1 ? c1541M3170.m3172(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM31726 = resourceId9 != -1 ? c1541M3170.m3172(context, resourceId9) : null;
        if (drawableM31725 != null || drawableM31726 != null) {
            Drawable[] drawableArrM3242 = AbstractC1582.m3242(textView);
            if (drawableM31725 == null) {
                drawableM31725 = drawableArrM3242[0];
            }
            if (drawableM31722 == null) {
                drawableM31722 = drawableArrM3242[1];
            }
            if (drawableM31726 == null) {
                drawableM31726 = drawableArrM3242[2];
            }
            if (drawableM31724 == null) {
                drawableM31724 = drawableArrM3242[3];
            }
            AbstractC1582.m3243(textView, drawableM31725, drawableM31722, drawableM31726, drawableM31724);
        } else if (drawableM3172 != null || drawableM31722 != null || drawableM31723 != null || drawableM31724 != null) {
            Drawable[] drawableArrM32422 = AbstractC1582.m3242(textView);
            Drawable drawable = drawableArrM32422[0];
            if (drawable == null && drawableArrM32422[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM3172 == null) {
                    drawableM3172 = compoundDrawables[0];
                }
                if (drawableM31722 == null) {
                    drawableM31722 = compoundDrawables[1];
                }
                if (drawableM31723 == null) {
                    drawableM31723 = compoundDrawables[2];
                }
                if (drawableM31724 == null) {
                    drawableM31724 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM3172, drawableM31722, drawableM31723, drawableM31724);
            } else {
                if (drawableM31722 == null) {
                    drawableM31722 = drawableArrM32422[1];
                }
                Drawable drawable2 = drawableArrM32422[2];
                if (drawableM31724 == null) {
                    drawableM31724 = drawableArrM32422[3];
                }
                AbstractC1582.m3243(textView, drawable, drawableM31722, drawable2, drawableM31724);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = C2810.m4942(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC2137.m4076(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            if (dimensionPixelSize < 0) {
                C1693.m3437();
                return;
            }
            textView.setFirstBaselineToTopHeight(dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            if (dimensionPixelSize2 < 0) {
                C1693.m3437();
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i6 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize2 > Math.abs(i6)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i6);
            }
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                C1693.m3437();
                return;
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ColorStateList m3013() {
        C2731 c2731 = this.f7051;
        if (c2731 != null) {
            return (ColorStateList) c2731.f13430;
        }
        return null;
    }
}
