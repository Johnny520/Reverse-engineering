package p057g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.abc.core.runtime.AbstractC0805P;
import p048b.AbstractC0550a;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: g.A0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0849A0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3068a = null;

    /* JADX INFO: renamed from: b */
    public static final int[] f3069b = null;

    /* JADX INFO: renamed from: c */
    public static final int[] f3070c = null;

    /* JADX INFO: renamed from: d */
    public static final int[] f3071d = null;

    /* JADX INFO: renamed from: e */
    public static final int[] f3072e = null;

    /* JADX INFO: renamed from: f */
    public static final int[] f3073f = null;

    /* JADX INFO: renamed from: g */
    public static final int[] f3074g = null;

    static {
        f3068a = new ThreadLocal();
        f3069b = new int[]{-16842910};
        f3070c = new int[]{R.attr.state_focused};
        f3071d = new int[]{R.attr.state_pressed};
        f3072e = new int[]{R.attr.state_checked};
        f3073f = new int[0];
        f3074g = new int[1];
    }

    /* JADX INFO: renamed from: a */
    public static void m2159a(View r1, Context r2) {
        TypedArray r22 = r2.obtainStyledAttributes(AbstractC0550a.f1623h);
    L7:
        th = move-exception;
        r22.recycle();
        throw th;
    L4:
        if (r22.hasValue(117) == true) goto L9;
        r1.getClass().toString();     // Catch: Throwable -> L7
    L9:
        r22.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static int m2160b(Context r4, int r5) {
        ColorStateList r02 = m2162d(r4, r5);
        if (r02 != null) goto L5;
    L8:
        ThreadLocal r03 = f3068a;
        TypedValue r1 = (TypedValue) r03.get();
        if (r1 != null) goto L11;
        r1 = new TypedValue();
        r03.set(r1);
    L11:
        r4.getTheme().resolveAttribute(R.attr.disabledAlpha, r1, true);
        float r04 = r1.getFloat();
        return AbstractC1100a.m2595d(m2161c(r4, r5), Math.round(Color.alpha(r4) * r04));
    L5:
        if (r02.isStateful() == false) goto L8;
        return r02.getColorForState(f3069b, r02.getDefaultColor());
    }

    /* JADX INFO: renamed from: c */
    public static int m2161c(Context r2, int r3) {
        int[] r02 = f3074g;
        r02[0] = r3;
        TypedArray r22 = r2.obtainStyledAttributes(null, r02);
        int r32 = r22.getColor(0, 0);     // Catch: Throwable -> L6
        r22.recycle();
        return r32;
    L6:
        th = move-exception;
        r22.recycle();
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m2162d(Context r2, int r3) {
        int[] r02 = f3074g;
        r02[0] = r3;
        TypedArray r32 = r2.obtainStyledAttributes(null, r02);
    L13:
        th = move-exception;
        r32.recycle();
        throw th;
    L4:
        if (r32.hasValue(0) == false) goto L10;
        int r03 = r32.getResourceId(0, 0);     // Catch: Throwable -> L13
        if (r03 == 0) goto L10;
        ColorStateList r22 = AbstractC0805P.m2049p(r2, r03);     // Catch: Throwable -> L13
        if (r22 == null) goto L10;
    L11:
        r32.recycle();
        return r22;
    L10:
        r22 = r32.getColorStateList(0);     // Catch: Throwable -> L13
        goto L11
    }
}
