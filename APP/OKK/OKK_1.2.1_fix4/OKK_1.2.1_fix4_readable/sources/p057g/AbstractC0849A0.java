package p057g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.abc.core.runtime.AbstractC0805P;
import p048b.AbstractC0550a;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: g.A0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0849A0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3068a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f3069b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f3070c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f3071d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f3072e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f3073f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f3074g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m2159a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0550a.f1623h);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m2160b(Context context, int i2) {
        ColorStateList colorStateListM2162d = m2162d(context, i2);
        if (colorStateListM2162d != null && colorStateListM2162d.isStateful()) {
            return colorStateListM2162d.getColorForState(f3069b, colorStateListM2162d.getDefaultColor());
        }
        ThreadLocal threadLocal = f3068a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return AbstractC1100a.m2595d(m2161c(context, i2), Math.round(Color.alpha(r4) * f2));
    }

    /* JADX INFO: renamed from: c */
    public static int m2161c(Context context, int i2) {
        int[] iArr = f3074g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m2162d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f3074g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0805P.m2049p(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
