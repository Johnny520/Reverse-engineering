package p000a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.df */
/* JADX INFO: loaded from: classes.dex */
public final class C0542df {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f1949a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final int[] f1950b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f1951c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f1952d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f1953e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f1954f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f1955g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m1311a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0983R.styleable.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1312b(Context context, int i) {
        ColorStateList colorStateListM1314d = m1314d(context, i);
        if (colorStateListM1314d != null && colorStateListM1314d.isStateful()) {
            return colorStateListM1314d.getColorForState(f1950b, colorStateListM1314d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1949a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return C0872v3.m2086d(m1313c(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m1313c(Context context, int i) {
        int[] iArr = f1955g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m1314d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1955g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C0437Y3.m1091a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
