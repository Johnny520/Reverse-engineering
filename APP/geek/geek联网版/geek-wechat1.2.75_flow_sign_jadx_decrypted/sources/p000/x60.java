package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class x60 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f5192a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f5193b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f5194c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f5195d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f5196e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f5197f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f5198g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m2635a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0205ez.f1686j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m2636b(Context context, int i) {
        ColorStateList colorStateListM2638d = m2638d(context, i);
        if (colorStateListM2638d != null && colorStateListM2638d.isStateful()) {
            return colorStateListM2638d.getColorForState(f5193b, colorStateListM2638d.getDefaultColor());
        }
        ThreadLocal threadLocal = f5192a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC0627qb.m2144d(m2637c(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m2637c(Context context, int i) {
        int[] iArr = f5198g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m2638d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f5198g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0493mp.m1864n(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
