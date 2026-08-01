package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.megatronking.stringfog.Base64;
import java.lang.reflect.Field;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: zt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0979zt {

    /* JADX INFO: renamed from: a */
    public static boolean f5615a = true;

    /* JADX INFO: renamed from: b */
    public static Field f5616b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f5617c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f5618d = true;

    /* JADX INFO: renamed from: B */
    public static boolean m2813B(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* JADX INFO: renamed from: E */
    public static int m2814E(float f, int i, int i2) {
        return AbstractC0329ib.m1426b(AbstractC0329ib.m1428d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: F */
    public static double[] m2815F(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0])};
    }

    /* JADX INFO: renamed from: G */
    public static Typeface m2816G(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC0126ct.m810d(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: H */
    public static TypedArray m2817H(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m2818K() {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0979zt.m2818K():java.util.ArrayList");
    }

    /* JADX INFO: renamed from: L */
    public static void m2819L(TextView textView, int i) {
        m2824e(i);
        if (Build.VERSION.SDK_INT >= 28) {
            n60.m1918c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = j60.m1551a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m2820M(TextView textView, int i) {
        m2824e(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = j60.m1551a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m2821Q(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f5615a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5615a = false;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static ActionMode.Callback m2822S(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof o60) || callback == null) ? callback : new o60(callback, textView);
    }

    /* JADX INFO: renamed from: d */
    public static void m2823d(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2824e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2825f(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m2826g(C0948yz c0948yz, AbstractC0019ai abstractC0019ai, View view, View view2, AbstractC0540nz abstractC0540nz, boolean z) {
        if (abstractC0540nz.m1980v() == 0 || c0948yz.m2745b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC0540nz.m1953F(view) - AbstractC0540nz.m1953F(view2)) + 1;
        }
        return Math.min(abstractC0019ai.mo108l(), abstractC0019ai.mo98b(view2) - abstractC0019ai.mo101e(view));
    }

    /* JADX INFO: renamed from: h */
    public static int m2827h(C0948yz c0948yz, AbstractC0019ai abstractC0019ai, View view, View view2, AbstractC0540nz abstractC0540nz, boolean z, boolean z2) {
        if (abstractC0540nz.m1980v() == 0 || c0948yz.m2745b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0948yz.m2745b() - Math.max(AbstractC0540nz.m1953F(view), AbstractC0540nz.m1953F(view2))) - 1) : Math.max(0, Math.min(AbstractC0540nz.m1953F(view), AbstractC0540nz.m1953F(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0019ai.mo98b(view2) - abstractC0019ai.mo101e(view)) / (Math.abs(AbstractC0540nz.m1953F(view) - AbstractC0540nz.m1953F(view2)) + 1))) + (abstractC0019ai.mo107k() - abstractC0019ai.mo101e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: i */
    public static int m2828i(C0948yz c0948yz, AbstractC0019ai abstractC0019ai, View view, View view2, AbstractC0540nz abstractC0540nz, boolean z) {
        if (abstractC0540nz.m1980v() == 0 || c0948yz.m2745b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0948yz.m2745b();
        }
        return (int) (((abstractC0019ai.mo98b(view2) - abstractC0019ai.mo101e(view)) / (Math.abs(AbstractC0540nz.m1953F(view) - AbstractC0540nz.m1953F(view2)) + 1)) * c0948yz.m2745b());
    }

    /* JADX INFO: renamed from: j */
    public static int m2829j(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueM1316y = AbstractC0273gt.m1316y(context, i);
        if (typedValueM1316y != null) {
            int i3 = typedValueM1316y.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? AbstractC0294hd.m1354a(context, i3) : typedValueM1316y.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    /* JADX INFO: renamed from: k */
    public static int m2830k(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueM1297A = AbstractC0273gt.m1297A(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueM1297A.resourceId;
        return i2 != 0 ? AbstractC0294hd.m1354a(context, i2) : typedValueM1297A.data;
    }

    /* JADX INFO: renamed from: p */
    public static C0953z3 m2831p(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C0953z3 c0953z3M2752b;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0953z3(null, null, typedValue.data);
            }
            try {
                c0953z3M2752b = C0953z3.m2752b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0953z3M2752b = null;
            }
            if (c0953z3M2752b != null) {
                return c0953z3M2752b;
            }
        }
        return new C0953z3(null, null, 0);
    }

    /* JADX INFO: renamed from: r */
    public static Intent m2832r(AppCompatActivity appCompatActivity) {
        Intent intentM1089a = AbstractC0202ew.m1089a(appCompatActivity);
        if (intentM1089a != null) {
            return intentM1089a;
        }
        try {
            String strM2834t = m2834t(appCompatActivity, appCompatActivity.getComponentName());
            if (strM2834t == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strM2834t);
            try {
                return m2834t(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM2834t + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: s */
    public static Intent m2833s(AppCompatActivity appCompatActivity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM2834t = m2834t(appCompatActivity, componentName);
        if (strM2834t == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM2834t);
        return m2834t(appCompatActivity, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: t */
    public static String m2834t(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: w */
    public static C0872wx m2835w(C0249g5 c0249g5) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C0872wx(n60.m1917b(c0249g5));
        }
        TextPaint textPaint = new TextPaint(c0249g5.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iM1744a = l60.m1744a(c0249g5);
        int iM1747d = l60.m1747d(c0249g5);
        if (c0249g5.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c0249g5.getInputType() & 15) != 3) {
            boolean z = k60.m1633b(c0249g5) == 1;
            switch (k60.m1634c(c0249g5)) {
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
            byte directionality = Character.getDirectionality(n60.m1916a(m60.m1794a(k60.m1635d(c0249g5)))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C0872wx(textPaint, textDirectionHeuristic, iM1744a, iM1747d);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m2836y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m2837z(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC0329ib.f2405a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo1053A(float f);

    /* JADX INFO: renamed from: C */
    public abstract boolean mo1054C(View view);

    /* JADX INFO: renamed from: D */
    public abstract boolean mo1055D(float f, float f2);

    /* JADX INFO: renamed from: I */
    public abstract void mo2608I(int i);

    /* JADX INFO: renamed from: J */
    public abstract void mo2609J(Typeface typeface);

    /* JADX INFO: renamed from: N */
    public void mo1007N(View view, float f) {
        if (f5618d) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5618d = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: O */
    public void mo933O(View view, int i) {
        if (!f5617c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5616b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f5617c = true;
        }
        Field field = f5616b;
        if (field != null) {
            try {
                f5616b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract boolean mo1056P(View view, float f);

    /* JADX INFO: renamed from: R */
    public abstract void mo1057R(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* JADX INFO: renamed from: a */
    public abstract int mo1058a(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: b */
    public abstract float mo1059b(int i);

    /* JADX INFO: renamed from: c */
    public void m2838c(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0422ks(this, i, 1));
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo1060l();

    /* JADX INFO: renamed from: m */
    public abstract int mo1061m();

    /* JADX INFO: renamed from: n */
    public abstract int mo1062n();

    /* JADX INFO: renamed from: o */
    public abstract int mo1063o();

    /* JADX INFO: renamed from: q */
    public abstract int mo1064q(View view);

    /* JADX INFO: renamed from: u */
    public abstract int mo1065u(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: v */
    public abstract int mo1066v();

    /* JADX INFO: renamed from: x */
    public float mo1008x(View view) {
        if (f5618d) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f5618d = false;
            }
        }
        return view.getAlpha();
    }
}
