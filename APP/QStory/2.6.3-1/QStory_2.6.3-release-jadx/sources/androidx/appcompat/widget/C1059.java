package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.app.C0955;
import androidx.core.view.AbstractC3103;
import androidx.core.widget.AbstractC3129;
import java.lang.ref.WeakReference;
import p069.AbstractC7390;
import p178.AbstractC8482;
import p204.AbstractC8602;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0987 f1159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0987 f1160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0987 f1161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0987 f1162;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0987 f1163;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f1164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f1165;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C0987 f1166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0987 f1167;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Typeface f1169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1071 f1170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f1171 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f1168 = -1;

    public C1059(TextView textView) {
        this.f1164 = textView;
        this.f1170 = new C1071(textView);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0987 m1266(Context context, C0977 c0977, int i) {
        ColorStateList colorStateListM1192;
        synchronized (c0977) {
            colorStateListM1192 = c0977.f917.m1192(context, i);
        }
        if (colorStateListM1192 == null) {
            return null;
        }
        C0987 c0987 = new C0987();
        c0987.f946 = true;
        c0987.f945 = colorStateListM1192;
        return c0987;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1267(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float f;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        TextView textView = this.f1164;
        Context context = textView.getContext();
        C0977 c0977M1100 = C0977.m1100();
        int[] iArr = AbstractC8602.f21447;
        C0955 c0955M914 = C0955.m914(i, 0, context, attributeSet, iArr);
        AbstractC3103.m4803(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0955M914.f665, i);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        int resourceId2 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1163 = m1266(context, c0977M1100, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1162 = m1266(context, c0977M1100, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f1161 = m1266(context, c0977M1100, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f1160 = m1266(context, c0977M1100, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f1159 = m1266(context, c0977M1100, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1167 = m1266(context, c0977M1100, typedArray.getResourceId(6, 0));
        }
        c0955M914.m923();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC8602.f21440;
        if (resourceId2 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, iArr2);
            C0955 c0955 = new C0955(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m1275(context, c0955);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c0955.m923();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0955 c09552 = new C0955(context, typedArrayObtainStyledAttributes2);
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
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1275(context, c09552);
        c09552.m923();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f1169;
        if (typeface != null) {
            if (this.f1168 == -1) {
                textView.setTypeface(typeface, this.f1171);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC1061.m1277(textView, string);
        }
        if (string2 != null) {
            AbstractC1077.m1292(textView, AbstractC1077.m1293(string2));
        }
        C1071 c1071 = this.f1170;
        Context context2 = c1071.f1187;
        int[] iArr3 = AbstractC8602.f21451;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c1071.f1188;
        AbstractC3103.m4803(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c1071.f1186 = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3)) {
            f = 0.0f;
            int resourceId3 = typedArrayObtainStyledAttributes3.getResourceId(3, 0);
            if (resourceId3 > 0) {
                TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId3);
                int length = typedArrayObtainTypedArray.length();
                int[] iArr4 = new int[length];
                if (length > 0) {
                    i2 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                    }
                    int[] iArrM1286 = C1071.m1286(iArr4);
                    c1071.f1182 = iArrM1286;
                    boolean z5 = iArrM1286.length > 0;
                    c1071.f1181 = z5;
                    if (z5) {
                        c1071.f1186 = 1;
                        c1071.f1184 = iArrM1286[0];
                        c1071.f1183 = iArrM1286[r13 - 1];
                        c1071.f1185 = -1.0f;
                    }
                } else {
                    i2 = 0;
                }
                typedArrayObtainTypedArray.recycle();
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
            f = 0.0f;
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c1071.m1287()) {
            c1071.f1186 = i2;
        } else if (c1071.f1186 == 1) {
            if (!c1071.f1181) {
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
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (f2 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c1071.f1186 = 1;
                c1071.f1184 = dimension2;
                c1071.f1183 = f2;
                c1071.f1185 = dimension;
                c1071.f1181 = i2;
            }
            if (c1071.m1287() && c1071.f1186 == 1 && (!c1071.f1181 || c1071.f1182.length == 0)) {
                int iFloor = ((int) Math.floor((c1071.f1183 - c1071.f1184) / c1071.f1185)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i6 = 0; i6 < iFloor; i6++) {
                    iArr5[i6] = Math.round((i6 * c1071.f1185) + c1071.f1184);
                }
                c1071.f1182 = C1071.m1286(iArr5);
            }
        }
        if (c1071.f1186 != 0) {
            int[] iArr6 = c1071.f1182;
            if (iArr6.length > 0) {
                if (AbstractC1061.m1280(textView) != -1.0f) {
                    AbstractC1061.m1279(textView, Math.round(c1071.f1184), Math.round(c1071.f1183), Math.round(c1071.f1185), 0);
                } else {
                    AbstractC1061.m1278(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM1101 = resourceId4 != -1 ? c0977M1100.m1101(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM11012 = resourceId5 != -1 ? c0977M1100.m1101(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM11013 = resourceId6 != -1 ? c0977M1100.m1101(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM11014 = resourceId7 != -1 ? c0977M1100.m1101(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM11015 = resourceId8 != -1 ? c0977M1100.m1101(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM11016 = resourceId9 != -1 ? c0977M1100.m1101(context, resourceId9) : null;
        if (drawableM11015 != null || drawableM11016 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM11015 == null) {
                drawableM11015 = compoundDrawablesRelative[0];
            }
            if (drawableM11012 == null) {
                drawableM11012 = compoundDrawablesRelative[1];
            }
            if (drawableM11016 == null) {
                drawableM11016 = compoundDrawablesRelative[2];
            }
            if (drawableM11014 == null) {
                drawableM11014 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM11015, drawableM11012, drawableM11016, drawableM11014);
        } else if (drawableM1101 != null || drawableM11012 != null || drawableM11013 != null || drawableM11014 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM1101 == null) {
                    drawableM1101 = compoundDrawables[0];
                }
                if (drawableM11012 == null) {
                    drawableM11012 = compoundDrawables[1];
                }
                if (drawableM11013 == null) {
                    drawableM11013 = compoundDrawables[2];
                }
                if (drawableM11014 == null) {
                    drawableM11014 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM1101, drawableM11012, drawableM11013, drawableM11014);
            } else {
                if (drawableM11012 == null) {
                    drawableM11012 = compoundDrawablesRelative2[1];
                }
                if (drawableM11014 == null) {
                    drawableM11014 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM11012, compoundDrawablesRelative2[2], drawableM11014);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC8482.m13478(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC1063.m1282(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
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
                    AbstractC7390.m12615(textView, dimensionPixelSize2);
                }
                if (dimensionPixelSize3 != -1) {
                    AbstractC7390.m12624(textView, dimensionPixelSize3);
                }
                if (dimensionPixelSize == -1.0f) {
                    if (i3 == -1) {
                        AbstractC7390.m12625(textView, (int) dimensionPixelSize);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC3129.m4881(textView, i3, dimensionPixelSize);
                        return;
                    } else {
                        AbstractC7390.m12625(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final PorterDuff.Mode m1268() {
        C0987 c0987 = this.f1166;
        if (c0987 != null) {
            return (PorterDuff.Mode) c0987.f944;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ColorStateList m1269() {
        C0987 c0987 = this.f1166;
        if (c0987 != null) {
            return (ColorStateList) c0987.f945;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1270() {
        C0987 c0987 = this.f1163;
        TextView textView = this.f1164;
        if (c0987 != null || this.f1162 != null || this.f1161 != null || this.f1160 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m1271(compoundDrawables[0], this.f1163);
            m1271(compoundDrawables[1], this.f1162);
            m1271(compoundDrawables[2], this.f1161);
            m1271(compoundDrawables[3], this.f1160);
        }
        if (this.f1159 == null && this.f1167 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m1271(compoundDrawablesRelative[0], this.f1159);
        m1271(compoundDrawablesRelative[2], this.f1167);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1271(Drawable drawable, C0987 c0987) {
        if (drawable == null || c0987 == null) {
            return;
        }
        C0977.m1097(drawable, c0987, this.f1164.getDrawableState());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1272(ColorStateList colorStateList) {
        if (this.f1166 == null) {
            this.f1166 = new C0987();
        }
        C0987 c0987 = this.f1166;
        c0987.f945 = colorStateList;
        c0987.f946 = colorStateList != null;
        this.f1163 = c0987;
        this.f1162 = c0987;
        this.f1161 = c0987;
        this.f1160 = c0987;
        this.f1159 = c0987;
        this.f1167 = c0987;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1273(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC8602.f21440);
        C0955 c0955 = new C0955(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1164;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1275(context, c0955);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC1061.m1277(textView, string);
        }
        c0955.m923();
        Typeface typeface = this.f1169;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1171);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1274(PorterDuff.Mode mode) {
        if (this.f1166 == null) {
            this.f1166 = new C0987();
        }
        C0987 c0987 = this.f1166;
        c0987.f944 = mode;
        c0987.f947 = mode != null;
        this.f1163 = c0987;
        this.f1162 = c0987;
        this.f1161 = c0987;
        this.f1160 = c0987;
        this.f1159 = c0987;
        this.f1167 = c0987;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1275(Context context, C0955 c0955) {
        String string;
        int i = this.f1171;
        TypedArray typedArray = (TypedArray) c0955.f665;
        this.f1171 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f1168 = i3;
            if (i3 != -1) {
                this.f1171 &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1165 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f1169 = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f1169 = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f1169 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1169 = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f1168;
        int i7 = this.f1171;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM948 = c0955.m948(i5, this.f1171, new C1079(this, i6, i7, new WeakReference(this.f1164)));
                if (typefaceM948 != null) {
                    if (i2 < 28 || this.f1168 == -1) {
                        this.f1169 = typefaceM948;
                    } else {
                        this.f1169 = AbstractC1060.m1276(Typeface.create(typefaceM948, 0), this.f1168, (this.f1171 & 2) != 0);
                    }
                }
                this.f1165 = this.f1169 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1169 != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1168 == -1) {
            this.f1169 = Typeface.create(string, this.f1171);
        } else {
            this.f1169 = AbstractC1060.m1276(Typeface.create(string, 0), this.f1168, (this.f1171 & 2) != 0);
        }
    }
}
