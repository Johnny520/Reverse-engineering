package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class C7772 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3070 = "ThemeUtils";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final ThreadLocal<TypedValue> f3071 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int[] f23305 = {-16842910};

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int[] f23306 = {R.attr.state_focused};

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int[] f23307 = {R.attr.state_activated};

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int[] f23308 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int[] f23309 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int[] f23310 = {R.attr.state_selected};

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int[] f23311 = {-16842919, -16842908};

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int[] f23312 = new int[0];

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int[] f23313 = new int[1];

    /* JADX INFO: renamed from: ۥ */
    public static void m3866(@InterfaceC6391 View view, @InterfaceC6391 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C6898.C6909.f19461);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19579)) {
                Log.e(f3070, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static ColorStateList m3867(int i, int i2) {
        return new ColorStateList(new int[][]{f23305, f23312}, new int[]{i2, i});
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m24706(@InterfaceC6391 Context context, int i) {
        ColorStateList colorStateListM24709 = m24709(context, i);
        if (colorStateListM24709 != null && colorStateListM24709.isStateful()) {
            return colorStateListM24709.getColorForState(f23305, colorStateListM24709.getDefaultColor());
        }
        TypedValue typedValueM24710 = m24710();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM24710, true);
        return m24708(context, i, typedValueM24710.getFloat());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m24707(@InterfaceC6391 Context context, int i) {
        int[] iArr = f23313;
        iArr[0] = i;
        C7837 c7837M24868 = C7837.m24868(context, null, iArr);
        try {
            return c7837M24868.m24870(0, 0);
        } finally {
            c7837M24868.m24899();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m24708(@InterfaceC6391 Context context, int i, float f) {
        return C3913.m11173(m24707(context, i), Math.round(Color.alpha(r0) * f));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static ColorStateList m24709(@InterfaceC6391 Context context, int i) {
        int[] iArr = f23313;
        iArr[0] = i;
        C7837 c7837M24868 = C7837.m24868(context, null, iArr);
        try {
            return c7837M24868.m24871(0);
        } finally {
            c7837M24868.m24899();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static TypedValue m24710() {
        ThreadLocal<TypedValue> threadLocal = f3071;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
