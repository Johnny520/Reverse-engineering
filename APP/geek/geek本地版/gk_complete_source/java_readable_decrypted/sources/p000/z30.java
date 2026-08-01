package p000;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.megatronking.stringfog.Base64;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z30 {
    /* JADX INFO: renamed from: a */
    public static final void m2756a(View view, int i) {
        int iM2775t = m2775t(i);
        if (iM2775t == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (C0934yl.m2689A(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM2775t == 1) {
            if (C0934yl.m2689A(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iM2775t == 2) {
            if (C0934yl.m2689A(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iM2775t != 3) {
            return;
        }
        if (C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public static int m2757b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown visibility " + i);
    }

    /* JADX INFO: renamed from: c */
    public static int m2758c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m2757b(view.getVisibility());
    }

    /* JADX INFO: renamed from: d */
    public static int m2759d(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: e */
    public static int m2760e(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static i40 m2761f(float f, float f2, float f3) {
        i40 i40Var = new i40(f);
        i40Var.m1394b(f2);
        i40Var.m1393a(f3);
        return i40Var;
    }

    /* JADX INFO: renamed from: g */
    public static LinearLayout m2762g(Activity activity, int i) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    /* JADX INFO: renamed from: h */
    public static ClassCastException m2763h(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: i */
    public static String m2764i(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: j */
    public static String m2765j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: k */
    public static String m2766k(String str, String str2, String str3, String str4, String str5) {
        AbstractC0346ip.m1503o(u40.m2419a(str, str2), str3);
        return u40.m2419a(str4, str5);
    }

    /* JADX INFO: renamed from: l */
    public static String m2767l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m2768m(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m2769n(String str, String str2, TextView textView, float f, int i) {
        textView.setText(u40.m2419a(str, str2));
        textView.setTextSize(f);
        textView.setTextColor(i);
    }

    /* JADX INFO: renamed from: o */
    public static void m2770o(String str, String str2, String str3, String str4, String str5) {
        AbstractC0346ip.m1503o(u40.m2419a(str, str2), str3);
        u40.m2419a(str4, str5);
    }

    /* JADX INFO: renamed from: p */
    public static void m2771p(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2772q(String str, String str2, C0267gn c0267gn) {
        String strM2419a = u40.m2419a(str, str2);
        c0267gn.getClass();
        return C0267gn.m1285e(strM2419a);
    }

    /* JADX INFO: renamed from: r */
    public static void m2773r(String str, String str2, String str3, String str4, String str5) {
        AbstractC0346ip.m1503o(str2, str);
        AbstractC0346ip.m1503o(u40.m2419a(str3, str4), str5);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m2774s(int i) {
        switch (i) {
            case Base64.NO_PADDING /* 1 */:
                return "NONE";
            case Base64.NO_WRAP /* 2 */:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m2775t(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m2776u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m2777v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
