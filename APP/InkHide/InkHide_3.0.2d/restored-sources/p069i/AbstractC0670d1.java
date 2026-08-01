package p069i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p085r.AbstractC0809a;

/* JADX INFO: renamed from: i.d1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0670d1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f2279a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f2280b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f2281c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f2282d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f2283e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f2284f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f2285g = new int[1];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1297a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0515a.f1646j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m1298b(Context context, int i2) {
        ColorStateList colorStateListM1300d = m1300d(context, i2);
        if (colorStateListM1300d != null && colorStateListM1300d.isStateful()) {
            return colorStateListM1300d.getColorForState(f2280b, colorStateListM1300d.getDefaultColor());
        }
        ThreadLocal threadLocal = f2279a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM1299c = m1299c(context, i2);
        int iRound = Math.round(Color.alpha(iM1299c) * f);
        int i3 = AbstractC0809a.f2710a;
        if (iRound < 0 || iRound > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (iM1299c & 16777215) | (iRound << 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m1299c(Context context, int i2) {
        int[] iArr = f2285g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static ColorStateList m1300d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f2285g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0503h.m990w(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
