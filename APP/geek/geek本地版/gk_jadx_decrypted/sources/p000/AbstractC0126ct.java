package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ct */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0126ct implements ya0 {

    /* JADX INFO: renamed from: a */
    public static long f1319a;

    /* JADX INFO: renamed from: b */
    public static long f1320b;

    /* JADX INFO: renamed from: c */
    public static Method f1321c;

    public AbstractC0126ct() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: d */
    public static int m810d(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: e */
    public static float[] m811e(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: f */
    public static final e10 m812f(Throwable th) {
        AbstractC0346ip.m1503o("exception", th);
        return new e10(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a A[Catch: NumberFormatException -> 0x00ae, LOOP:3: B:29:0x006c->B:48:0x009a, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ae, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:48:0x009a, B:50:0x00a0, B:56:0x00b5, B:57:0x00b8), top: B:71:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0 A[Catch: NumberFormatException -> 0x00ae, TryCatch #0 {NumberFormatException -> 0x00ae, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:48:0x009a, B:50:0x00a0, B:56:0x00b5, B:57:0x00b8), top: B:71:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5 A[Catch: NumberFormatException -> 0x00ae, TryCatch #0 {NumberFormatException -> 0x00ae, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:48:0x009a, B:50:0x00a0, B:56:0x00b5, B:57:0x00b8), top: B:71:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0099 A[SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.C0575ox[] m813j(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0126ct.m813j(java.lang.String):ox[]");
    }

    /* JADX INFO: renamed from: k */
    public static C0575ox[] m814k(C0575ox[] c0575oxArr) {
        if (c0575oxArr == null) {
            return null;
        }
        C0575ox[] c0575oxArr2 = new C0575ox[c0575oxArr.length];
        for (int i = 0; i < c0575oxArr.length; i++) {
            C0575ox c0575ox = c0575oxArr[i];
            C0575ox c0575ox2 = new C0575ox();
            c0575ox2.f3615a = c0575ox.f3615a;
            float[] fArr = c0575ox.f3616b;
            c0575ox2.f3616b = m811e(fArr, fArr.length);
            c0575oxArr2[i] = c0575ox2;
        }
        return c0575oxArr2;
    }

    /* JADX INFO: renamed from: m */
    public static ColorStateList m815m(Context context, C0659r5 c0659r5, int i) {
        int resourceId;
        ColorStateList colorStateListM1510v;
        TypedArray typedArray = (TypedArray) c0659r5.f4209b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1510v = AbstractC0346ip.m1510v(context, resourceId)) == null) ? c0659r5.m2233l(i) : colorStateListM1510v;
    }

    /* JADX INFO: renamed from: n */
    public static ColorStateList m816n(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM1510v;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1510v = AbstractC0346ip.m1510v(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM1510v;
    }

    /* JADX INFO: renamed from: o */
    public static Drawable m817o(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM1196r;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM1196r = AbstractC0222ff.m1196r(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM1196r;
    }

    /* JADX INFO: renamed from: p */
    public static float m818p(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* JADX INFO: renamed from: q */
    public static int m819q(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m820r() {
        try {
            if (f1321c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1321c == null) {
                f1320b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1321c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1321c.invoke(null, Long.valueOf(f1320b))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m821s(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m822t(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: u */
    public static final int m823u(C0306hp c0306hp) {
        AbstractC0467m abstractC0467m = AbstractC0049az.f694a;
        int i = c0306hp.f1988a;
        if (c0306hp.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + c0306hp);
        }
        int i2 = c0306hp.f1989b;
        if (i2 < Integer.MAX_VALUE) {
            return AbstractC0049az.f694a.mo480c(i, i2 + 1);
        }
        if (i <= Integer.MIN_VALUE) {
            return AbstractC0049az.f694a.mo479b();
        }
        return AbstractC0049az.f694a.mo480c(i - 1, i2) + 1;
    }

    /* JADX INFO: renamed from: v */
    public static int m824v(Context context, int i, int i2) {
        TypedValue typedValueM1316y = AbstractC0273gt.m1316y(context, i);
        return (typedValueM1316y == null || typedValueM1316y.type != 16) ? i2 : typedValueM1316y.data;
    }

    /* JADX INFO: renamed from: w */
    public static TimeInterpolator m825w(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m822t(strValueOf, "cubic-bezier") && !m822t(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m822t(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return AbstractC0538nx.m1950b(m818p(strArrSplit, 0), m818p(strArrSplit, 1), m818p(strArrSplit, 2), m818p(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!m822t(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        C0575ox[] c0575oxArrM813j = m813j(strSubstring);
        if (c0575oxArrM813j != null) {
            try {
                C0575ox.m2027b(c0575oxArrM813j, path);
            } catch (RuntimeException e) {
                throw new RuntimeException("Error in parsing " + strSubstring, e);
            }
        } else {
            path = null;
        }
        return AbstractC0538nx.m1951c(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static final Object m826x(w10 w10Var, w10 w10Var2, InterfaceC0861wm interfaceC0861wm) throws Throwable {
        Object c0516nb;
        Object objM2579C;
        InterfaceC0826vo interfaceC0826vo;
        try {
            a80.m38b((m50) interfaceC0861wm);
            c0516nb = interfaceC0861wm.mo472e(w10Var2, w10Var);
        } catch (Throwable th) {
            c0516nb = new C0516nb(th, false);
        }
        EnumC0594pe enumC0594pe = EnumC0594pe.f3883a;
        if (c0516nb == enumC0594pe || (objM2579C = w10Var.m2579C(c0516nb)) == AbstractC0346ip.f2478g) {
            return enumC0594pe;
        }
        if (objM2579C instanceof C0516nb) {
            throw ((C0516nb) objM2579C).f3368a;
        }
        C0863wo c0863wo = objM2579C instanceof C0863wo ? (C0863wo) objM2579C : null;
        return (c0863wo == null || (interfaceC0826vo = c0863wo.f4999a) == null) ? objM2579C : interfaceC0826vo;
    }

    /* JADX INFO: renamed from: y */
    public static final void m827y(Object obj) throws Throwable {
        if (obj instanceof e10) {
            throw ((e10) obj).f1660a;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Typeface mo643g(Context context, C0155dl c0155dl, Resources resources, int i);

    /* JADX INFO: renamed from: h */
    public abstract Typeface mo644h(Context context, C0265gl[] c0265glArr, int i);

    /* JADX INFO: renamed from: i */
    public Typeface mo645i(Context context, Resources resources, int i, String str, int i2) {
        File fileM1310k = AbstractC0273gt.m1310k(context);
        if (fileM1310k == null) {
            return null;
        }
        try {
            if (AbstractC0273gt.m1305f(fileM1310k, resources, i)) {
                return Typeface.createFromFile(fileM1310k.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM1310k.delete();
        }
    }

    /* JADX INFO: renamed from: l */
    public C0265gl mo828l(int i, C0265gl[] c0265glArr) {
        new C0354iy(9);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C0265gl c0265gl = null;
        int i3 = Integer.MAX_VALUE;
        for (C0265gl c0265gl2 : c0265glArr) {
            int iAbs = (Math.abs(c0265gl2.f2138c - i2) * 2) + (c0265gl2.f2139d == z ? 0 : 1);
            if (c0265gl == null || i3 > iAbs) {
                c0265gl = c0265gl2;
                i3 = iAbs;
            }
        }
        return c0265gl;
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: b */
    public void mo1b(View view) {
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: c */
    public void mo2c() {
    }
}
