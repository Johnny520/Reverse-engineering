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
public abstract class r60 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4213a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f4214b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f4215c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f4216d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f4217e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f4218f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f4219g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m2247a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0910xy.f5226j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m2248b(Context context, int i) {
        ColorStateList colorStateListM2250d = m2250d(context, i);
        if (colorStateListM2250d != null && colorStateListM2250d.isStateful()) {
            return colorStateListM2250d.getColorForState(f4214b, colorStateListM2250d.getDefaultColor());
        }
        ThreadLocal threadLocal = f4213a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC0329ib.m1428d(m2249c(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m2249c(Context context, int i) {
        int[] iArr = f4219g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m2250d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f4219g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0346ip.m1510v(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
