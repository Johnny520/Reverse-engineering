package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: YA */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1042YA {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3324a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f3325b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f3326c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f3327d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f3328e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f3329f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f3330g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m1987a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0982Wu.f3075j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1988b(Context context, int i) {
        ColorStateList colorStateListM1990d = m1990d(context, i);
        if (colorStateListM1990d != null && colorStateListM1990d.isStateful()) {
            return colorStateListM1990d.getColorForState(f3325b, colorStateListM1990d.getDefaultColor());
        }
        ThreadLocal threadLocal = f3324a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC2797za.m5367e(m1989c(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m1989c(Context context, int i) {
        int[] iArr = f3330g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m1990d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f3330g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0295Gu.m622o(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
