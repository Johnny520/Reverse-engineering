package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.megatronking.stringfog.Base64;
import java.lang.reflect.Field;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: gu */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0274gu {

    /* JADX INFO: renamed from: a */
    public static long f2055a = 0;

    /* JADX INFO: renamed from: b */
    public static boolean f2056b = true;

    /* JADX INFO: renamed from: c */
    public static Field f2057c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f2058d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f2059e = true;

    /* JADX INFO: renamed from: B */
    public static Typeface m1299B(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, m1309c(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: C */
    public static final int m1300C(C0456lp c0456lp) {
        AbstractC0467m abstractC0467m = AbstractC0316hz.f2289a;
        int i = c0456lp.f2737a;
        if (c0456lp.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + c0456lp);
        }
        int i2 = c0456lp.f2738b;
        if (i2 < Integer.MAX_VALUE) {
            return AbstractC0316hz.f2289a.mo1347c(i, i2 + 1);
        }
        if (i <= Integer.MIN_VALUE) {
            return AbstractC0316hz.f2289a.mo1346b();
        }
        return AbstractC0316hz.f2289a.mo1347c(i - 1, i2) + 1;
    }

    /* JADX INFO: renamed from: D */
    public static TypedArray m1301D(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: E */
    public static int m1302E(Context context, int i, int i2) {
        TypedValue typedValueM1836J = AbstractC0493mp.m1836J(context, i);
        return (typedValueM1836J == null || typedValueM1836J.type != 16) ? i2 : typedValueM1836J.data;
    }

    /* JADX INFO: renamed from: F */
    public static TimeInterpolator m1303F(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m1322y(strValueOf, "cubic-bezier") && !m1322y(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m1322y(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return AbstractC0834vx.m2579b(m1317m(strArrSplit, 0), m1317m(strArrSplit, 1), m1317m(strArrSplit, 2), m1317m(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!m1322y(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        C0872wx[] c0872wxArrM1312f = m1312f(strSubstring);
        if (c0872wxArrM1312f != null) {
            try {
                C0872wx.m2625b(c0872wxArrM1312f, path);
            } catch (RuntimeException e) {
                throw new RuntimeException(g40.m1155r("Error in parsing ", strSubstring), e);
            }
        } else {
            path = null;
        }
        return AbstractC0834vx.m2580c(path);
    }

    /* JADX INFO: renamed from: G */
    public static void m1304G(TextView textView, int i) {
        AbstractC0498mu.m1886c(i);
        if (Build.VERSION.SDK_INT >= 28) {
            t60.m2402c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = p60.m2072a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m1305H(TextView textView, int i) {
        AbstractC0498mu.m1886c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = p60.m2072a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m1306L(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f2056b) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f2056b = false;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static final void m1307M(Object obj) throws Throwable {
        if (obj instanceof l10) {
            throw ((l10) obj).f2894a;
        }
    }

    /* JADX INFO: renamed from: O */
    public static ActionMode.Callback m1308O(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof u60) || callback == null) ? callback : new u60(callback, textView);
    }

    /* JADX INFO: renamed from: c */
    public static int m1309c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: d */
    public static float[] m1310d(float[] fArr, int i) {
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

    /* JADX INFO: renamed from: e */
    public static final l10 m1311e(Throwable th) {
        AbstractC0493mp.m1857g("exception", th);
        return new l10(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a A[Catch: NumberFormatException -> 0x00ae, LOOP:3: B:29:0x006c->B:48:0x009a, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ae, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:48:0x009a, B:50:0x00a0, B:56:0x00b5, B:57:0x00b8), top: B:71:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0 A[Catch: NumberFormatException -> 0x00ae, TryCatch #0 {NumberFormatException -> 0x00ae, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:48:0x009a, B:50:0x00a0, B:56:0x00b5, B:57:0x00b8), top: B:71:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5 A[Catch: NumberFormatException -> 0x00ae, TryCatch #0 {NumberFormatException -> 0x00ae, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:48:0x009a, B:50:0x00a0, B:56:0x00b5, B:57:0x00b8), top: B:71:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0099 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.C0872wx[] m1312f(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0274gu.m1312f(java.lang.String):wx[]");
    }

    /* JADX INFO: renamed from: g */
    public static C0872wx[] m1313g(C0872wx[] c0872wxArr) {
        if (c0872wxArr == null) {
            return null;
        }
        C0872wx[] c0872wxArr2 = new C0872wx[c0872wxArr.length];
        for (int i = 0; i < c0872wxArr.length; i++) {
            C0872wx c0872wx = c0872wxArr[i];
            C0872wx c0872wx2 = new C0872wx();
            c0872wx2.f5141a = c0872wx.f5141a;
            float[] fArr = c0872wx.f5142b;
            c0872wx2.f5142b = m1310d(fArr, fArr.length);
            c0872wxArr2[i] = c0872wx2;
        }
        return c0872wxArr2;
    }

    /* JADX INFO: renamed from: h */
    public static ColorStateList m1314h(Context context, C0658r5 c0658r5, int i) {
        int resourceId;
        ColorStateList colorStateListM1864n;
        TypedArray typedArray = (TypedArray) c0658r5.f4064b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1864n = AbstractC0493mp.m1864n(context, resourceId)) == null) ? c0658r5.m2240l(i) : colorStateListM1864n;
    }

    /* JADX INFO: renamed from: i */
    public static ColorStateList m1315i(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM1864n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1864n = AbstractC0493mp.m1864n(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM1864n;
    }

    /* JADX INFO: renamed from: j */
    public static Drawable m1316j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM1261w;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM1261w = AbstractC0259gf.m1261w(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM1261w;
    }

    /* JADX INFO: renamed from: m */
    public static float m1317m(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* JADX INFO: renamed from: p */
    public static C0953z3 m1318p(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C0953z3 c0953z3M2788b;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0953z3(null, null, typedValue.data);
            }
            try {
                c0953z3M2788b = C0953z3.m2788b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0953z3M2788b = null;
            }
            if (c0953z3M2788b != null) {
                return c0953z3M2788b;
            }
        }
        return new C0953z3(null, null, 0);
    }

    /* JADX INFO: renamed from: t */
    public static C0241fy m1319t(C0249g5 c0249g5) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C0241fy(t60.m2401b(c0249g5));
        }
        TextPaint textPaint = new TextPaint(c0249g5.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iM2256a = r60.m2256a(c0249g5);
        int iM2259d = r60.m2259d(c0249g5);
        if (c0249g5.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c0249g5.getInputType() & 15) != 3) {
            boolean z = q60.m2122b(c0249g5) == 1;
            switch (q60.m2123c(c0249g5)) {
                case Base64.NO_WRAP /* 2 */:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(t60.m2400a(s60.m2308a(q60.m2124d(c0249g5)))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C0241fy(textPaint, textDirectionHeuristic, iM2256a, iM2259d);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m1320v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m1321x(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m1322y(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo1323A(float f, float f2);

    /* JADX INFO: renamed from: I */
    public void mo1324I(View view, float f) {
        if (f2059e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f2059e = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: J */
    public void mo1325J(View view, int i) {
        if (!f2058d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2057c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f2058d = true;
        }
        Field field = f2057c;
        if (field != null) {
            try {
                f2057c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract boolean mo1326K(View view, float f);

    /* JADX INFO: renamed from: N */
    public abstract void mo1327N(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* JADX INFO: renamed from: a */
    public abstract int mo1328a(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: b */
    public abstract float mo1329b(int i);

    /* JADX INFO: renamed from: k */
    public abstract int mo1330k();

    /* JADX INFO: renamed from: l */
    public abstract int mo1331l();

    /* JADX INFO: renamed from: n */
    public abstract int mo1332n();

    /* JADX INFO: renamed from: o */
    public abstract int mo1333o();

    /* JADX INFO: renamed from: q */
    public abstract int mo1334q(View view);

    /* JADX INFO: renamed from: r */
    public abstract int mo1335r(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: s */
    public abstract int mo1336s();

    /* JADX INFO: renamed from: u */
    public float mo1337u(View view) {
        if (f2059e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f2059e = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: w */
    public abstract boolean mo1338w(float f);

    /* JADX INFO: renamed from: z */
    public abstract boolean mo1339z(View view);
}
