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
    public static final String f1221 = "discover_friends";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f1895 = "creator_center";

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final String f1896 = "draft";

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final String f1897 = "order";

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final String f1898 = "cart";

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final String f1899 = "wallet";

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final String f1900 = "community_rule";

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final String f1901 = "help_center";

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static final String f1902 = "scan";

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
            C0237h4.m1090("it", methodHookParam2);
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
            C0237h4.m1090("it", methodHookParam2);
            Integer numM1206 = C0373r3.m1206("com.xingin.xhs.homepage.R$id", "navigation_bottom_bar");
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
                if (obj == null || (objM9262 = C0373r3.m926(obj, "getTag", new Object[0])) == null || (string = objM9262.toString()) == null) {
                    string = "";
                }
                if (c0475z1.f1222.contains(string)) {
                    arrayList.remove(size);
                    if (size == 0 && C0237h4.m864(str, "sidebarDivider")) {
                        arrayList.remove(size);
                    }
                    str = "";
                } else {
                    if (obj == null || (objM926 = C0373r3.m926(obj, "getType", new Object[0])) == null || (string2 = objM926.toString()) == null) {
                        string2 = "";
                    }
                    if (C0237h4.m864(string2, "sidebarDivider") && C0237h4.m864(str, "sidebarDivider")) {
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
        C0237h4.m1090("processName", str);
        this.f1222 = C0192e1.m1053(EnumC0164c1.f725);
        String str2 = C0283k8.f1632.f1541;
        C0237h4.m1089("HomeNavigationManagerCls", str2);
        C0373r3.m1208(str2, C0283k8.f1632.f1542, new Object[]{Context.class, String.class}, new b());
        String str3 = C0283k8.f1632.f1551;
        C0237h4.m1089("HomeNavigationViewCls", str3);
        C0274k c0274k = C0283k8.f1632;
        String str4 = c0274k.f890;
        String str5 = c0274k.f1552;
        C0237h4.m1089("OpenDrawerEventCls", str5);
        C0373r3.m1208(str3, str4, new Object[]{C0373r3.m1199(str5, null, 3), ArrayList.class}, new c());
    }
}
