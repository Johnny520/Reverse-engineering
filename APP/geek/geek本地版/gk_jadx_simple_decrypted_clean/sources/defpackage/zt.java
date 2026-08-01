package defpackage;

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
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class zt {
    public static boolean a = true;
    public static Field b = null;
    public static boolean c = false;
    public static boolean d = true;

    public static boolean B(MotionEvent r0, int r1) {
        if ((r0.getSource() & r1) != r1) goto L6;
        return true;
    L6:
        return false;
    }

    public static int E(float r1, int r2, int r3) {
        return ib.b(ib.d(r3, Math.round(Color.alpha(r3) * r1)), r2);
    }

    public static double[] F(double[] r17, double[][] r18) {
        double r1 = r17[0];
        double[] r3 = r18[0];
        double r4 = r3[0] * r1;
        double r7 = r17[1];
        double r9 = (r3[1] * r7) + r4;
        double r11 = r17[2];
        double r13 = (r3[2] * r11) + r9;
        double[] r32 = r18[1];
        double r92 = (r32[2] * r11) + ((r32[1] * r7) + (r32[0] * r1));
        double[] r33 = r18[2];
        return new double[]{r13, r92, (r11 * r33[2]) + ((r7 * r33[1]) + (r1 * r33[0]))};
    }

    public static Typeface G(Configuration r2, Typeface r3) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return null;
    L5:
        if (p7.a(r2) != Integer.MAX_VALUE) goto L7;
        return null;
    L7:
        if (p7.a(r2) == 0) goto L14;
        if (r3 == null) goto L15;
        int r0 = c0.a(r3);
        return c0.e(r3, ct.d(p7.a(r2) + r0, 1, 1000), r3.isItalic());
    L15:
        return null;
    L14:
        return null;
    }

    public static TypedArray H(Resources r0, Resources.Theme r1, AttributeSet r2, int[] r3) {
        if (r1 != null) goto L6;
        return r0.obtainAttributes(r2, r3);
    L6:
        return r1.obtainStyledAttributes(r2, r3, 0, 0);
    }

    public static ArrayList K() {
        ArrayList r0 = new ArrayList();
        gn r1 = gn.a;
        String r2 = "key_tab_all_on";
        r1.getClass();
        if (gn.a(r2, true) == false) goto L6;
        r0.add("all");
    L6:
        if (gn.a("key_tab_unread_on", true) == false) goto L9;
        r0.add("unread");
    L9:
        if (gn.a("key_tab_friend_on", true) == false) goto L12;
        r0.add("friend");
    L12:
        if (gn.a("key_tab_group_on", true) == false) goto L15;
        r0.add("group");
    L15:
        if (r0.isEmpty() == false) goto L17;
        r0.add("all");
    L17:
        ArrayList r12 = new ArrayList(cb.h0(r0));
        int r22 = r0.size();
        int r3 = 0;
    L18:
        if (r3 >= r22) goto L39;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        String r42 = (String) r4;
        switch(r42.hashCode()) {
            case -1266283874: goto L35;
            case -840272977: goto L31;
            case 96673: goto L27;
            case 98629247: goto L23;
            default: goto L36;
        };
    L36:
        String r5 = "\u5168\u90e8";
    L38:
        r12.add(new s50(r5, r42));
        goto L18
    L23:
        if (r42.equals("group") == false) goto L36;
        gn r52 = gn.a;
        String r6 = "key_tab_name_group";
        String r7 = "\u7fa4\u804a";
        r52.getClass();
        r5 = gn.d(r6, r7);
        goto L38
    L27:
        if (r42.equals("all") == false) goto L36;
        gn r53 = gn.a;
        String r62 = "key_tab_name_all";
        String r72 = "\u5168\u90e8";
        r53.getClass();
        r5 = gn.d(r62, r72);
        goto L38
    L31:
        if (r42.equals("unread") == false) goto L36;
        gn r54 = gn.a;
        String r63 = "key_tab_name_unread";
        String r73 = "\u672a\u8bfb";
        r54.getClass();
        r5 = gn.d(r63, r73);
        goto L38
    L35:
        if (r42.equals("friend") == false) goto L36;
        gn r55 = gn.a;
        String r64 = "key_tab_name_friend";
        String r74 = "\u597d\u53cb";
        r55.getClass();
        r5 = gn.d(r64, r74);
        goto L38
    L39:
        return r12;
    }

    public static void L(TextView r3, int r4) {
        e(r4);
        if (Build.VERSION.SDK_INT < 28) goto L6;
        n60.c(r3, r4);
        return;
    L6:
        Paint.FontMetricsInt r0 = r3.getPaint().getFontMetricsInt();
        if (j60.a(r3) == false) goto L9;
        int r02 = r0.top;
    L11:
        if (r4 <= Math.abs(r02)) goto L14;
        int r42 = r4 + r02;
        r3.setPadding(r3.getPaddingLeft(), r42, r3.getPaddingRight(), r3.getPaddingBottom());
        return;
    L14:
        return;
    L9:
        r02 = r0.ascent;
        goto L11
    }

    public static void M(TextView r3, int r4) {
        e(r4);
        Paint.FontMetricsInt r0 = r3.getPaint().getFontMetricsInt();
        if (j60.a(r3) == false) goto L5;
        int r02 = r0.bottom;
    L7:
        if (r4 <= Math.abs(r02)) goto L10;
        int r42 = r4 - r02;
        r3.setPadding(r3.getPaddingLeft(), r3.getPaddingTop(), r3.getPaddingRight(), r42);
        return;
    L10:
        return;
    L5:
        r02 = r0.descent;
        goto L7
    }

    public static void Q(ViewGroup r2, boolean r3) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        f0.o(r2, r3);
        return;
    L7:
        if (a == false) goto L14;
        f0.o(r2, r3);     // Catch: NoSuchMethodError -> L10
        return;
    L10:
        a = false;
        return;
    }

    public static ActionMode.Callback S(ActionMode.Callback r2, TextView r3) {
        if (Build.VERSION.SDK_INT <= 27) goto L5;
    L10:
        return r2;
    L5:
        if ((r2 instanceof o60) == true) goto L10;
        if (r2 == null) goto L10;
        return new o60(r2, r3);
    }

    public static void d(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r0);
    }

    public static void e(int r0) {
        if (r0 < 0) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    public static void f(String r0, Object r1) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r0);
    }

    public static int g(yz r0, ai r1, View r2, View r3, nz r4, boolean r5) {
        if (r4.v() != 0) goto L5;
        return 0;
    L5:
        if (r0.b() == 0) goto L16;
        if (r2 == null) goto L17;
        if (r3 == null) goto L18;
        if (r5 == false) goto L11;
        int r02 = r1.b(r3) - r1.e(r2);
        return Math.min(r1.l(), r02);
    L11:
        return Math.abs(nz.F(r2) - nz.F(r3)) + 1;
    L18:
        return 0;
    L17:
        return 0;
    L16:
        return 0;
    }

    public static int h(yz r3, ai r4, View r5, View r6, nz r7, boolean r8, boolean r9) {
        if (r7.v() != 0) goto L5;
    L17:
        return 0;
    L5:
        if (r3.b() == 0) goto L17;
        if (r5 == null) goto L17;
        if (r6 == null) goto L17;
        int r72 = Math.min(nz.F(r5), nz.F(r6));
        int r1 = Math.max(nz.F(r5), nz.F(r6));
        if (r9 == false) goto L12;
        int r32 = Math.max(0, (r3.b() - r1) - 1);
    L13:
        if (r8 == true) goto L16;
        return r32;
    L16:
        return Math.round((r32 * (Math.abs(r4.b(r6) - r4.e(r5)) / (Math.abs(nz.F(r5) - nz.F(r6)) + 1))) + (r4.k() - r4.e(r5)));
    L12:
        r32 = Math.max(0, r72);
        goto L13
    }

    public static int i(yz r0, ai r1, View r2, View r3, nz r4, boolean r5) {
        if (r4.v() != 0) goto L5;
        return 0;
    L5:
        if (r0.b() == 0) goto L16;
        if (r2 == null) goto L17;
        if (r3 == null) goto L18;
        if (r5 == true) goto L13;
        return r0.b();
    L13:
        return (int) (((r1.b(r3) - r1.e(r2)) / (Math.abs(nz.F(r2) - nz.F(r3)) + 1)) * r0.b());
    L18:
        return 0;
    L17:
        return 0;
    L16:
        return 0;
    }

    public static int j(Context r1, int r2, int r3) {
        TypedValue r22 = gt.y(r1, r2);
        if (r22 == null) goto L9;
        int r0 = r22.resourceId;
        if (r0 == 0) goto L7;
        int r12 = hd.a(r1, r0);
    L8:
        Integer r13 = Integer.valueOf(r12);
    L10:
        if (r13 != null) goto L12;
        return r3;
    L12:
        return r13.intValue();
    L7:
        r12 = r22.data;
        goto L8
    L9:
        r13 = null;
        goto L10
    }

    public static int k(View r2, int r3) {
        Context r0 = r2.getContext();
        TypedValue r22 = gt.A(r2.getContext(), r3, r2.getClass().getCanonicalName());
        int r32 = r22.resourceId;
        if (r32 == 0) goto L7;
        return hd.a(r0, r32);
    L7:
        return r22.data;
    }

    public static z3 p(TypedArray r3, XmlPullParser r4, Resources.Theme r5, String r6, int r7) {
        if (r4.getAttributeValue("http://schemas.android.com/apk/res/android", r6) == null) goto L18;
        TypedValue r42 = new TypedValue();
        r3.getValue(r7, r42);
        int r1 = r42.type;
        if (r1 < 28) goto L19;
        if (r1 > 31) goto L19;
        return new z3(null, null, r42.data);
    L19:
        z3 r32 = z3.b(r3.getResources(), r3.getResourceId(r7, 0), r5);     // Catch: Exception -> L13
    L15:
        if (r32 == null) goto L18;
        return r32;
    L13:
        e = move-exception;
        Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
        r32 = null;
    L18:
        return new z3(null, null, 0);
    }

    public static Intent r(AppCompatActivity r3) {
        Intent r0 = ew.a(r3);
        if (r0 == null) goto L21;
        return r0;
    L21:
        String r02 = t(r3, r3.getComponentName());     // Catch: PackageManager.NameNotFoundException -> L18
        if (r02 != null) goto L9;
        return null;
    L9:
        ComponentName r2 = new ComponentName(r3, r02);
    L16:
        Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + r02 + "' in manifest");
        return null;
    L11:
        if (t(r3, r2) != null) goto L15;
        return Intent.makeMainActivity(r2);
    L15:
        return new Intent().setComponent(r2);
    L18:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static Intent s(AppCompatActivity r2, ComponentName r3) {
        String r0 = t(r2, r3);
        if (r0 != null) goto L6;
        return null;
    L6:
        ComponentName r1 = new ComponentName(r3.getPackageName(), r0);
        if (t(r2, r1) != null) goto L11;
        return Intent.makeMainActivity(r1);
    L11:
        return new Intent().setComponent(r1);
    }

    public static String t(Context r3, ComponentName r4) {
        PackageManager r0 = r3.getPackageManager();
        if (Build.VERSION.SDK_INT < 29) goto L5;
        int r1 = 269222528;
    L6:
        ActivityInfo r42 = r0.getActivityInfo(r4, r1);
        String r02 = r42.parentActivityName;
        if (r02 == null) goto L9;
        return r02;
    L9:
        Bundle r43 = r42.metaData;
        if (r43 != null) goto L12;
        return null;
    L12:
        String r44 = r43.getString("android.support.PARENT_ACTIVITY");
        if (r44 != null) goto L16;
        return null;
    L16:
        if (r44.charAt(0) == '.') goto L18;
        return r44;
    L18:
        return r3.getPackageName() + r44;
    L5:
        r1 = 787072;
        goto L6
    }

    public static wx w(g5 r8) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) goto L5;
        TextPaint r2 = new TextPaint(r8.getPaint());
        TextDirectionHeuristic r3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int r4 = l60.a(r8);
        int r5 = l60.d(r8);
        if ((r8.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L9;
        r3 = TextDirectionHeuristics.LTR;
    L34:
        return new wx(r2, r3, r4, r5);
    L9:
        boolean r6 = true;
        if (r0 < 28) goto L21;
        if ((r8.getInputType() & 15) != 3) goto L21;
        byte r82 = Character.getDirectionality(n60.a(m60.a(k60.d(r8)))[0].codePointAt(0));
        if (r82 != 1) goto L16;
    L19:
        r3 = TextDirectionHeuristics.RTL;
        goto L34
    L16:
        if (r82 == 2) goto L19;
        r3 = TextDirectionHeuristics.LTR;
    L21:
        if (k60.b(r8) == 1) goto L25;
        r6 = false;
    L25:
        switch(k60.c(r8)) {
            case 2: goto L32;
            case 3: goto L31;
            case 4: goto L30;
            case 5: goto L29;
            case 6: goto L34;
            case 7: goto L28;
            default: goto L26;
        };
    L26:
        if (r6 == false) goto L34;
        r3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        goto L34
    L28:
        r3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        goto L34
    L29:
        r3 = TextDirectionHeuristics.LOCALE;
        goto L34
    L30:
        r3 = TextDirectionHeuristics.RTL;
        goto L34
    L31:
        r3 = TextDirectionHeuristics.LTR;
        goto L34
    L32:
        r3 = TextDirectionHeuristics.ANYRTL_LTR;
        goto L34
    L5:
        return new wx(n60.b(r8));
    }

    public static boolean y(XmlPullParser r1, String r2) {
        if (r1.getAttributeValue("http://schemas.android.com/apk/res/android", r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean z(int r21) {
        if (r21 == 0) goto L26;
        ThreadLocal r1 = ib.a;
        double[] r2 = (double[]) r1.get();
        if (r2 != null) goto L6;
        r2 = new double[3];
        r1.set(r2);
    L6:
        int r12 = Color.red(r21);
        int r4 = Color.green(r21);
        int r5 = Color.blue(r21);
        if (r2.length != 3) goto L25;
        double r6 = ((double) r12) / 255.0d;
        if (r6 >= 0.04045d) goto L11;
        double r62 = r6 / 12.92d;
    L12:
        double r3 = ((double) r4) / 255.0d;
        if (r3 >= 0.04045d) goto L16;
        double r32 = r3 / 12.92d;
    L17:
        double r0 = ((double) r5) / 255.0d;
        if (r0 >= 0.04045d) goto L20;
        double r02 = r0 / 12.92d;
    L21:
        double r10 = 0.3576d * r32;
        double r102 = r10 + (0.4124d * r62);
        r2[0] = ((0.1805d * r02) + r102) * 100.0d;
        double r122 = 0.7152d * r32;
        double r123 = r122 + (0.2126d * r62);
        double r8 = ((0.0722d * r02) + r123) * 100.0d;
        r2[1] = r8;
        double r33 = r32 * 0.1192d;
        double r03 = r02 * 0.9505d;
        r2[2] = (r03 + (r33 + (r62 * 0.0193d))) * 100.0d;
        if ((r8 / 100.0d) <= 0.5d) goto L28;
        return true;
    L28:
        return false;
    L20:
        r02 = Math.pow((r0 + 0.055d) / 1.055d, 2.4d);
        goto L21
    L16:
        r32 = Math.pow((r3 + 0.055d) / 1.055d, 2.4d);
        goto L17
    L11:
        r62 = Math.pow((r6 + 0.055d) / 1.055d, 2.4d);
        goto L12
    L25:
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    L26:
        return false;
    }

    public abstract boolean A(float r1);

    public abstract boolean C(View r1);

    public abstract boolean D(float r1, float r2);

    public abstract void I(int r1);

    public abstract void J(Typeface r1);

    public void N(View r2, float r3) {
        if (d == true) goto L9;
    L7:
        r2.setAlpha(r3);
        return;
    L9:
        f0.k(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        d = false;
        goto L7
    }

    public void O(View r4, int r5) {
        if (c == false) goto L16;
    L9:
        Field r0 = b;
        if (r0 == null) goto L18;
        int r02 = r0.getInt(r4);     // Catch: IllegalAccessException -> L13
        b.setInt(r4, r5 | (r02 & (-13)));     // Catch: IllegalAccessException -> L13
        return;
    L19:
        return;
    L18:
        return;
    L16:
        Field r1 = View.class.getDeclaredField("mViewFlags");     // Catch: NoSuchFieldException -> L7
        b = r1;     // Catch: NoSuchFieldException -> L7
        r1.setAccessible(true);     // Catch: NoSuchFieldException -> L7
    L8:
        c = true;
    L7:
        Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
        goto L8
    }

    public abstract boolean P(View r1, float r2);

    public abstract void R(ViewGroup.MarginLayoutParams r1, int r2, int r3);

    public abstract int a(ViewGroup.MarginLayoutParams r1);

    public abstract float b(int r1);

    public void c(int r4) {
        new Handler(Looper.getMainLooper()).post(new ks(this, r4, 1));
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int q(View r1);

    public abstract int u(CoordinatorLayout r1);

    public abstract int v();

    public float x(View r2) {
        if (d == false) goto L8;
        return f0.a(r2);
    L6:
        d = false;
    L8:
        return r2.getAlpha();
    }
}
