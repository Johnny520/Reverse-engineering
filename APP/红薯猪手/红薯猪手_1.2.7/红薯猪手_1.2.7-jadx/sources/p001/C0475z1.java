package p001;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: ۟.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475z1 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1221 = C0341oa.m915(new byte[]{-63, -100, -18, 22, -86, 119, -64, -121, -62, 19, -73, 104, -64, -101, -7, 6}, new byte[]{-91, -11, -99, 117, -59, 1});

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f1895 = C0341oa.m915(new byte[]{-77, 124, -122, -6, -84, 0, -94, 81, -128, -2, -74, 27, -75, 124}, new byte[]{-48, 14, -29, -101, -40, 111});

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final String f1896 = C0341oa.m915(new byte[]{19, 68, -17, -103, 19}, new byte[]{119, 54, -114, -1, 103, -107});

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final String f1897 = C0341oa.m915(new byte[]{-54, -56, -87, 95, -70}, new byte[]{-91, -70, -51, 58, -56, -15});

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final String f1898 = C0341oa.m915(new byte[]{-95, 19, 29, 43}, new byte[]{-62, 114, 111, 95, 72, -86});

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final String f1899 = C0341oa.m915(new byte[]{-62, 111, -3, 106, 39, 112}, new byte[]{-75, 14, -111, 6, 66, 4});

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final String f1900 = C0341oa.m915(new byte[]{-37, -60, -84, -100, 68, 105, -47, -33, -72, -82, 67, 114, -44, -50}, new byte[]{-72, -85, -63, -15, 49, 7});

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final String f1901 = C0341oa.m915(new byte[]{82, 67, 15, -86, 12, -119, 95, 72, 23, -65, 33}, new byte[]{58, 38, 99, -38, 83, -22});

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static final String f1902 = C0341oa.m915(new byte[]{-75, 47, -71, -74}, new byte[]{-58, 76, -40, -40, 27, -22});

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static final int f1903 = 291;

    /* JADX INFO: renamed from: ۥ */
    public Set<String> f1222 = C0207f2.f778;

    /* JADX INFO: renamed from: ۟.z1$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static int m974() {
            return C0475z1.f1903;
        }
    }

    /* JADX INFO: renamed from: ۟.z1$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090(C0341oa.m915(new byte[]{105, 43}, new byte[]{0, 95, 18, 13, 116, 119}), methodHookParam2);
            Object result = methodHookParam2.getResult();
            C0475z1.m1284(C0475z1.this, result instanceof ArrayList ? (ArrayList) result : null);
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.z1$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            LinearLayout linearLayout;
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090(C0341oa.m915(new byte[]{32, 127}, new byte[]{73, 11, -122, 92, -73, 112}), methodHookParam2);
            Integer numM1206 = C0373r3.m1206(C0341oa.m915(new byte[]{-15, -67, 90, 81, 67, -44, -4, -75, 94, 17, 21, -59, -6, -95, 25, 23, 84, -48, -9, -94, 86, 24, 94, -109, -64, -10, 94, 27}, new byte[]{-110, -46, 55, 127, 59, -67}), C0341oa.m915(new byte[]{8, -19, -3, -26, -12, 38, 18, -27, -28, -31, -52, 37, 9, -8, -1, -32, -2, 24, 4, -19, -7}, new byte[]{102, -116, -117, -113, -109, 71}));
            Object obj = methodHookParam2.thisObject;
            View view = obj instanceof View ? (View) obj : null;
            if (view != null && numM1206 != null && (linearLayout = (LinearLayout) view.findViewById(numM1206.intValue())) != null) {
                ViewParent parent = linearLayout.getParent();
                LinearLayout linearLayout2 = parent instanceof LinearLayout ? (LinearLayout) parent : null;
                if (linearLayout2 != null) {
                    String str = C0475z1.f1221;
                    if (linearLayout2.findViewById(a.m974()) == null) {
                        int iIndexOfChild = linearLayout2.indexOfChild(linearLayout);
                        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
                        C0475z1 c0475z1 = C0475z1.this;
                        linearLayout3.setId(a.m974());
                        linearLayout3.setOrientation(1);
                        C0475z1.m1283(linearLayout3, c0475z1);
                        linearLayout2.addView(linearLayout3, iIndexOfChild);
                    }
                }
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m1283(LinearLayout linearLayout, C0475z1 c0475z1) {
        c0475z1.getClass();
        linearLayout.post(new RunnableC0258ib(linearLayout, c0475z1, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1284(C0475z1 c0475z1, ArrayList arrayList) {
        String string;
        String string2;
        Object objM926;
        Object objM9262;
        if (c0475z1.f1222.isEmpty() || arrayList == null) {
            return;
        }
        int i = C0330o.f1000;
        if (arrayList.isEmpty() ^ true) {
            String str = "";
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                Object obj = arrayList.get(size);
                if (obj == null || (objM9262 = C0373r3.m926(obj, C0341oa.m915(new byte[]{-64, 84, 23, -5, -33, 44}, new byte[]{-89, 49, 99, -81, -66, 75}), new Object[0])) == null || (string = objM9262.toString()) == null) {
                    string = "";
                }
                if (c0475z1.f1222.contains(string)) {
                    arrayList.remove(size);
                    if (size == 0 && C0237h4.m864(str, C0341oa.m915(new byte[]{-7, 66, 78, -4, -68, 61, -8, 111, 67, -17, -73, 56, -17, 89}, new byte[]{-118, 43, 42, -103, -34, 92}))) {
                        arrayList.remove(size);
                    }
                    str = "";
                } else {
                    if (obj == null || (objM926 = C0373r3.m926(obj, C0341oa.m915(new byte[]{-20, 69, 62, -103, -5, 95, -18}, new byte[]{-117, 32, 74, -51, -126, 47}), new Object[0])) == null || (string2 = objM926.toString()) == null) {
                        string2 = "";
                    }
                    if (C0237h4.m864(string2, C0341oa.m915(new byte[]{13, 11, 62, -80, -76, -28, 12, 38, 51, -93, -65, -31, 27, 16}, new byte[]{126, 98, 90, -43, -42, -123})) && C0237h4.m864(str, C0341oa.m915(new byte[]{-1, -38, 9, 120, 104, 102, -2, -9, 4, 107, 99, 99, -23, -63}, new byte[]{-116, -77, 109, 29, 10, 7}))) {
                        arrayList.remove(size);
                    }
                    str = string2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static TextView m1285(LinearLayout linearLayout) {
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iM1038 = (int) C0167c4.m1038(1, 26.0f);
        int i = AbstractAlertDialogC0471ya.f1885;
        layoutParams.setMargins(iM1038, 0, 0, i);
        textView.setLayoutParams(layoutParams);
        textView.setPadding((int) TypedValue.applyDimension(1, 36.0f, Resources.getSystem().getDisplayMetrics()), i, 0, i);
        C0325n8.f994.getClass();
        if (C0325n8.m1158()) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(-12303292);
        }
        textView.setTextSize(14.0f);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-1, -126, 77, -8, -111, 100, -4, -66, 67, -10, -111}, new byte[]{-113, -16, 34, -101, -12, 23}), str);
        this.f1222 = C0192e1.m1053(EnumC0164c1.f725);
        String str2 = C0283k8.f1632.f1541;
        C0237h4.m1089(C0341oa.m915(new byte[]{94, 62, -65, 66, 32, -46, 96, 56, -75, 70, 26, -38, 121, 63, -97, 70, 0, -46, 113, 52, -96, 100, 2, -64}, new byte[]{22, 81, -46, 39, 110, -77}), str2);
        C0373r3.m1208(str2, C0283k8.f1632.f1542, new Object[]{Context.class, String.class}, new b());
        String str3 = C0283k8.f1632.f1551;
        C0237h4.m1089(C0341oa.m915(new byte[]{-80, -28, -95, -92, 49, 84, -114, -30, -85, -96, 11, 92, -105, -27, -102, -88, 26, 66, -69, -25, -65}, new byte[]{-8, -117, -52, -63, 127, 53}), str3);
        C0274k c0274k = C0283k8.f1632;
        String str4 = c0274k.f890;
        String str5 = c0274k.f1552;
        C0237h4.m1089(C0341oa.m915(new byte[]{-114, 122, 115, -55, -73, -16, -96, 125, 115, -43, -74, -12, -92, 100, 98, -28, -97, -15}, new byte[]{-63, 10, 22, -89, -13, -126}), str5);
        C0373r3.m1208(str3, str4, new Object[]{C0373r3.m1199(str5, null, 3), ArrayList.class}, new c());
    }
}
