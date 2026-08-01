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
public abstract /* synthetic */ class g40 {
    /* JADX INFO: renamed from: a */
    public static final void m1138a(View view, int i) {
        int iM1158u = m1158u(i);
        if (iM1158u == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (C0023am.m55A(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM1158u == 1) {
            if (C0023am.m55A(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iM1158u == 2) {
            if (C0023am.m55A(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iM1158u != 3) {
            return;
        }
        if (C0023am.m55A(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public static int m1139b(int i) {
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
    public static int m1140c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m1139b(view.getVisibility());
    }

    /* JADX INFO: renamed from: d */
    public static int m1141d(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: e */
    public static int m1142e(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static p40 m1143f(float f, float f2, float f3) {
        p40 p40Var = new p40(f);
        p40Var.m2064b(f2);
        p40Var.m2063a(f3);
        return p40Var;
    }

    /* JADX INFO: renamed from: g */
    public static LinearLayout m1144g(Activity activity, int i) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    /* JADX INFO: renamed from: h */
    public static ClassCastException m1145h(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: i */
    public static String m1146i(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: j */
    public static String m1147j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: k */
    public static String m1148k(String str, String str2, String str3, String str4, String str5) {
        AbstractC0493mp.m1857g(b50.m492a(str, str2), str3);
        return b50.m492a(str4, str5);
    }

    /* JADX INFO: renamed from: l */
    public static String m1149l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1150m(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m1151n(String str, String str2, TextView textView, float f, int i) {
        textView.setText(b50.m492a(str, str2));
        textView.setTextSize(f);
        textView.setTextColor(i);
    }

    /* JADX INFO: renamed from: o */
    public static void m1152o(String str, String str2, String str3, String str4, String str5) {
        AbstractC0493mp.m1857g(b50.m492a(str, str2), str3);
        b50.m492a(str4, str5);
    }

    /* JADX INFO: renamed from: p */
    public static void m1153p(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1154q(String str, String str2, C0417kn c0417kn) {
        String strM492a = b50.m492a(str, str2);
        c0417kn.getClass();
        return C0417kn.m1694e(strM492a);
    }

    /* JADX INFO: renamed from: r */
    public static String m1155r(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: s */
    public static void m1156s(String str, String str2, String str3, String str4, String str5) {
        AbstractC0493mp.m1857g(str2, str);
        AbstractC0493mp.m1857g(b50.m492a(str3, str4), str5);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m1157t(int i) {
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

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m1158u(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m1159v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m1160w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
