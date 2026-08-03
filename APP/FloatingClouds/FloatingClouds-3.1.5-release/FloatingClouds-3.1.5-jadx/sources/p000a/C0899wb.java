package p000a;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p000a.C0824sc;

/* JADX INFO: renamed from: a.wb */
/* JADX INFO: loaded from: classes.dex */
public final class C0899wb {
    /* JADX INFO: renamed from: a */
    public static float m2185a(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2186b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: c */
    public static int m2187c(Context context, int i, int i2) {
        TypedValue typedValueM2244a = C0955za.m2244a(context, i);
        return (typedValueM2244a == null || typedValueM2244a.type != 16) ? i2 : typedValueM2244a.data;
    }

    /* JADX INFO: renamed from: d */
    public static TimeInterpolator m2188d(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m2186b(strValueOf, "cubic-bezier") && !m2186b(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m2186b(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return C0805rc.m1882b(m2185a(strArrSplit, 0), m2185a(strArrSplit, 1), m2185a(strArrSplit, 2), m2185a(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!m2186b(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            C0824sc.a.m1925b(C0824sc.m1922b(strSubstring), path);
            return C0805rc.m1883c(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e);
        }
    }
}
