package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z30 {
    public static final void a(View r4, int r5) {
        int r52 = t(r5);
        if (r52 != 0) goto L5;
        ViewGroup r53 = (ViewGroup) r4.getParent();
        if (r53 != null) goto L28;
        return;
    L28:
        if (yl.A(2) == false) goto L30;
        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + r4 + " from container " + r53);
    L30:
        r53.removeView(r4);
        return;
    L5:
        if (r52 == 1) goto L21;
        if (r52 == 2) goto L16;
        if (r52 == 3) goto L11;
        return;
    L11:
        if (yl.A(2) == false) goto L13;
        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + r4 + " to INVISIBLE");
    L13:
        r4.setVisibility(4);
        return;
    L16:
        if (yl.A(2) == false) goto L18;
        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + r4 + " to GONE");
    L18:
        r4.setVisibility(8);
        return;
    L21:
        if (yl.A(2) == false) goto L23;
        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + r4 + " to VISIBLE");
    L23:
        r4.setVisibility(0);
    }

    public static int b(int r3) {
        if (r3 != 0) goto L4;
        return 2;
    L4:
        if (r3 != 4) goto L6;
        return 4;
    L6:
        if (r3 != 8) goto L10;
        return 3;
    L10:
        throw new IllegalArgumentException("Unknown visibility " + r3);
    }

    public static int c(View r2) {
        if (r2.getAlpha() != 0.0f) goto L9;
        if (r2.getVisibility() != 0) goto L9;
        return 4;
    L9:
        return b(r2.getVisibility());
    }

    public static int d(int r0, int r1, int r2) {
        return (Integer.hashCode(r0) + r1) * r2;
    }

    public static int e(String r0, int r1, int r2) {
        return (r0.hashCode() + r1) * r2;
    }

    public static i40 f(float r1, float r2, float r3) {
        i40 r0 = new i40(r1);
        r0.b(r2);
        r0.a(r3);
        return r0;
    }

    public static LinearLayout g(Activity r1, int r2) {
        LinearLayout r0 = new LinearLayout(r1);
        r0.setOrientation(r2);
        return r0;
    }

    public static ClassCastException h(Iterator r0) {
        r0.next().getClass();
        return new ClassCastException();
    }

    public static String i(String r1, String r2) {
        return r1 + r2;
    }

    public static String j(String r1, String r2, String r3) {
        return r1 + r2 + r3;
    }

    public static String k(String r0, String r1, String r2, String r3, String r4) {
        ip.o(u40.a(r0, r1), r2);
        return u40.a(r3, r4);
    }

    public static String l(StringBuilder r0, String r1, String r2) {
        r0.append(r1);
        r0.append(r2);
        return r0.toString();
    }

    public static /* synthetic */ void m(Object r0) {
        if (r0 != null) goto L5;
        return;
    L5:
        throw new ClassCastException();
    }

    public static void n(String r0, String r1, TextView r2, float r3, int r4) {
        r2.setText(u40.a(r0, r1));
        r2.setTextSize(r3);
        r2.setTextColor(r4);
    }

    public static void o(String r0, String r1, String r2, String r3, String r4) {
        ip.o(u40.a(r0, r1), r2);
        u40.a(r3, r4);
    }

    public static void p(StringBuilder r0, String r1, String r2, String r3, String r4) {
        r0.append(r1);
        r0.append(r2);
        r0.append(r3);
        r0.append(r4);
    }

    public static boolean q(String r0, String r1, gn r2) {
        String r02 = u40.a(r0, r1);
        r2.getClass();
        return gn.e(r02);
    }

    public static void r(String r0, String r1, String r2, String r3, String r4) {
        ip.o(r1, r0);
        ip.o(u40.a(r2, r3), r4);
    }

    public static /* synthetic */ String s(int r0) {
        switch(r0) {
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            case 9: goto L5;
            default: goto L4;
        };
    L5:
        return "CENTER_Y";
    L7:
        return "CENTER_X";
    L9:
        return "CENTER";
    L11:
        return "BASELINE";
    L13:
        return "BOTTOM";
    L15:
        return "RIGHT";
    L17:
        return "TOP";
    L19:
        return "LEFT";
    L21:
        return "NONE";
    L4:
        throw null;
    }

    public static /* synthetic */ int t(int r0) {
        if (r0 == 0) goto L6;
        return r0 - 1;
    L6:
        throw null;
    }

    public static /* synthetic */ String u(int r1) {
        if (r1 != 1) goto L5;
        return "NONE";
    L5:
        if (r1 != 2) goto L7;
        return "ADDING";
    L7:
        if (r1 == 3) goto L10;
        return "null";
    L10:
        return "REMOVING";
    }

    public static /* synthetic */ String v(int r1) {
        if (r1 != 1) goto L5;
        return "REMOVED";
    L5:
        if (r1 != 2) goto L7;
        return "VISIBLE";
    L7:
        if (r1 != 3) goto L9;
        return "GONE";
    L9:
        if (r1 == 4) goto L12;
        return "null";
    L12:
        return "INVISIBLE";
    }

    static {
    }
}
