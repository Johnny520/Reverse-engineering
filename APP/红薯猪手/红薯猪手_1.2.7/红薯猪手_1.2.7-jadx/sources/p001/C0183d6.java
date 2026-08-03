package p001;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.d6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0183d6 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public static final C0183d6 f755 = new C0183d6();

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m1047(XC_MethodHook.MethodHookParam methodHookParam) {
        String str;
        Integer num;
        C0237h4.m1090(C0341oa.m915(new byte[]{107, 8, 50, -117, 108, -14}, new byte[]{79, 120, 83, -7, 13, -97}), methodHookParam);
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089(C0341oa.m915(new byte[]{-18, -108, 50, 121, -36, -46, -16, -103, 56, 126}, new byte[]{-102, -4, 91, 10, -109, -80}), obj);
        C0274k c0274k = C0283k8.f1632;
        Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1606);
        if (objM1203 == null || (str = (String) C0373r3.m1204(objM1203, C0341oa.m915(new byte[]{67, 122, -119}, new byte[]{54, 8, -27, 19, 58, -80}))) == null) {
            str = "";
        }
        int iIntValue = 1;
        if (!(str.length() > 0)) {
            int i = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{52, -24, 98, -73, -27, -7, 59, -8, 121, -69, -3, -37, 53, -11, 107, -76, -28, -54, 57, -62, 100, -70, -34, -54}, new byte[]{-36, 102, -43, 82, 106, 111}));
            return;
        }
        if (objM1203 != null && (num = (Integer) C0373r3.m1204(objM1203, C0341oa.m915(new byte[]{116, -29, 49, 80}, new byte[]{0, -102, 65, 53, -54, -60}))) != null) {
            iIntValue = num.intValue();
        }
        String strM915 = iIntValue == 2 ? C0341oa.m915(new byte[]{-98, -51, -63}, new byte[]{-13, -67, -11, -96, -40, -74}) : C0341oa.m915(new byte[]{-41, -124, 95}, new byte[]{-67, -12, 56, 49, 118, -11});
        String str2 = C0436w1.f1166;
        C0436w1.m953(strM915, C0272jb.m1105(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        final XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090(C0341oa.m915(new byte[]{-109, -89, -30, -91, -47}, new byte[]{-29, -58, -112, -60, -68, 54}), methodHookParam2);
        Object obj = methodHookParam2.thisObject;
        C0237h4.m1089(C0341oa.m915(new byte[]{9, -94, 51, 107, 3, -84, 23, -81, 57, 108}, new byte[]{125, -54, 90, 24, 76, -50}), obj);
        C0274k c0274k = C0283k8.f1632;
        String str = C0283k8.a.m885().f1607;
        String str2 = C0283k8.a.m885().f1534;
        C0237h4.m1089(C0341oa.m915(new byte[]{-116, -108, -41, 84, 110, 82, -121, -99, -35}, new byte[]{-60, -15, -82, 6, 39, 54}), str2);
        View view = (View) C0373r3.m927(obj, str, C0373r3.m1206(str2, C0341oa.m915(new byte[]{127, -53, -113, 34, -105, -13, 118, -57, -102, 37, -98, -18, 116, -59, -91, 17, -101, -13, 116, -58, -96, 15, -105, -16}, new byte[]{23, -82, -10, 102, -14, -121})));
        if (view != null) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: ۟.c6
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    C0183d6.m1047(methodHookParam2);
                    return true;
                }
            });
        }
        return C0433vb.f1163;
    }
}
