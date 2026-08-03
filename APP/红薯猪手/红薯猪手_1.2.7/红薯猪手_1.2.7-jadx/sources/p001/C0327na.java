package p001;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.na */
/* JADX INFO: loaded from: classes.dex */
public final class C0327na extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ */
    public static final String f998 = C0341oa.m915(new byte[]{121, 23, -50}, new byte[]{17, 126, -86, 119, -31, -118});

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f999 = true;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m1162(XC_MethodHook.MethodHookParam methodHookParam) {
        C0274k c0274k = C0283k8.f1632;
        String str = C0283k8.a.m885().f1535;
        C0237h4.m1089(C0341oa.m915(new byte[]{86, 18, -49, 117, -121, 12, 69, 55, -62, 89, -97, 23}, new byte[]{23, 126, -90, 26, -13, 100}), str);
        View viewFindViewById = null;
        Class clsM1199 = C0373r3.m1199(str, null, 3);
        if (clsM1199 == null) {
            return;
        }
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089(C0341oa.m915(new byte[]{90, -103, -107, -88, 82, 24, 68, -108, -97, -81}, new byte[]{46, -15, -4, -37, 29, 122}), obj);
        Object objM1203 = C0373r3.m1203(obj, C0341oa.m915(new byte[]{18, 37, -61, -31, -88, 13, 30, 38}, new byte[]{123, 81, -90, -116, -2, 100}));
        View view = objM1203 instanceof View ? (View) objM1203 : null;
        if (view != null) {
            Integer numM1205 = C0373r3.m1205(clsM1199, C0341oa.m915(new byte[]{-6, -14, 109, 15, -103, 22, -30, -13, 116, 24, -103, 21, -9, -17, 122, 24}, new byte[]{-106, -101, 27, 106, -40, 99}));
            viewFindViewById = view.findViewById(numM1205 != null ? numM1205.intValue() : -1);
        }
        if (viewFindViewById == null) {
            return;
        }
        Integer numM12052 = C0373r3.m1205(clsM1199, C0341oa.m915(new byte[]{-116, 21, 44, 70, 38, 97, -93, 1, 53, 75}, new byte[]{-19, 96, 88, 46, 73, 19}));
        View viewFindViewById2 = view.findViewById(numM12052 != null ? numM12052.intValue() : -1);
        Object obj2 = methodHookParam.args[0];
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0271ja(0, obj2));
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC0271ja(1, obj2));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1163(XC_MethodHook.MethodHookParam methodHookParam) {
        View viewFindViewById;
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089(C0341oa.m915(new byte[]{102, -16, 75, -98, 13, -61, 120, -3, 65, -103}, new byte[]{18, -104, 34, -19, 66, -95}), obj);
        View view = (View) C0373r3.m927(obj, C0341oa.m915(new byte[]{-111, 119, 4, -79, 87, 39, -127}, new byte[]{-10, 18, 112, -25, 62, 66}), new Object[0]);
        if (view != null) {
            C0274k c0274k = C0283k8.f1632;
            String str = C0283k8.a.m885().f1533;
            C0237h4.m1089(C0341oa.m915(new byte[]{30, 85, -101, 23, 94, 99, 1, 125, -117, 38, 91, 104}, new byte[]{83, 52, -17, 101, 55, 27}), str);
            Integer numM1206 = C0373r3.m1206(str, C0341oa.m915(new byte[]{-84, 69, -99, -25, -34, -1, -73, 113, -102, -29, -34, -24, -88, 117, -103}, new byte[]{-63, 16, -18, -126, -84, -66}));
            viewFindViewById = view.findViewById(numM1206 != null ? numM1206.intValue() : -1);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById == null) {
            return;
        }
        Object obj2 = methodHookParam.args[0];
        C0274k c0274k2 = C0283k8.f1632;
        String str2 = C0283k8.a.m885().f1533;
        C0237h4.m1089(C0341oa.m915(new byte[]{125, -15, -1, 119, -98, 85, 98, -39, -17, 70, -101, 94}, new byte[]{48, -112, -117, 5, -9, 45}), str2);
        Integer numM12062 = C0373r3.m1206(str2, C0341oa.m915(new byte[]{98, 84, -109, 7, -63, 10, 125, 76, -83, 4, -51}, new byte[]{22, 34, -52, 105, -88, 105}));
        View viewFindViewById2 = view.findViewById(numM12062 != null ? numM12062.intValue() : -1);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC0271ja(2, obj2));
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0271ja(3, obj2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{97, -75, 113, -53, 0, 76, 98, -119, 127, -59, 0}, new byte[]{17, -57, 30, -88, 101, 63}), str);
        boolean zM846 = C0192e1.m846(EnumC0164c1.f1370);
        f999 = zM846;
        if (zM846) {
            String str2 = C0283k8.f1632.f1579;
            C0237h4.m1089(C0341oa.m915(new byte[]{-80, -42, 65, 75, 63, -90, -84, -36, 70, 91, 26, -90, -121, -34, 100, 87, 54, -91, -86, -36, 94, 90, 54, -96, -95, -33, 65}, new byte[]{-30, -77, 50, 62, 83, -46}), str2);
            C0274k c0274k = C0283k8.f1632;
            String str3 = c0274k.f1580;
            String str4 = c0274k.f1581;
            C0237h4.m1089(C0341oa.m915(new byte[]{69, 116, 48, 70, -27, 22, 88, 126, 37, 81, -49, 10, 115, 124, 18, 88, -11}, new byte[]{22, 17, 81, 52, -122, 126}), str4);
            C0373r3.m1208(str2, str3, new Object[]{C0373r3.m1199(str4, null, 3)}, C0285ka.f916);
            String str5 = C0283k8.f1632.f1582;
            C0237h4.m1089(C0341oa.m915(new byte[]{80, 73, -105, -6, -15, -47, 123, 101, -108, -47, -13, -26, 118, 69, -116, -48, -50, -41, 123, 95, -123, -38, -22, -64, 108, 111, -116, -57}, new byte[]{30, 44, -32, -76, -98, -91}), str5);
            C0274k c0274k2 = C0283k8.f1632;
            String str6 = c0274k2.f893;
            String str7 = c0274k2.f1583;
            C0237h4.m1089(C0341oa.m915(new byte[]{5, -126, 109, 21, 13, -32, 46, -128, 91, 21, 37, -6, 8, -127, 106}, new byte[]{75, -19, 25, 112, 68, -108}), str7);
            C0373r3.m1208(str5, str6, new Object[]{C0373r3.m1199(str7, null, 3), Integer.TYPE}, C0299la.f945);
            String str8 = C0283k8.f1632.f1588;
            C0237h4.m1089(C0341oa.m915(new byte[]{-87, -76, -78, -36, 56, 61, -107, -65, -113, -51, 30, 49, -92, -76, -88, -51, 9, 51, -117, -73, -93, -53, 56, 48, -108}, new byte[]{-25, -37, -58, -71, 123, 92}), str8);
            C0274k c0274k3 = C0283k8.f1632;
            String str9 = c0274k3.f1589;
            String str10 = c0274k3.f1584;
            C0237h4.m1089(C0341oa.m915(new byte[]{-27, 7, 63, 21, 113, 14, -39, 12, 8, 28, 65}, new byte[]{-85, 104, 75, 112, 50, 111}), str10);
            C0373r3.m1208(str8, str9, new Object[]{C0373r3.m1199(str10, null, 3), Object.class}, C0313ma.f969);
        }
    }
}
