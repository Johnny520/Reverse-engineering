package p001;

import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۟.f5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0210f5 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ */
    public static String f781 = "";

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f782;

    /* JADX INFO: renamed from: ۟.f5$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, Object> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final Object mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090(C0341oa.m915(new byte[]{-82, 48}, new byte[]{-57, 68, 55, 90, 65, -80}), methodHookParam2);
            if (C0210f5.f782) {
                List listM1062 = C0210f5.m1062(C0210f5.this);
                if (listM1062.size() == 2) {
                    return listM1062.get(0);
                }
            }
            return C0373r3.m1213(methodHookParam2);
        }
    }

    /* JADX INFO: renamed from: ۟.f5$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, Object> {
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final Object mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090(C0341oa.m915(new byte[]{95, -47}, new byte[]{54, -91, 116, -68, -65, 60}), methodHookParam2);
            if (C0210f5.f782) {
                List listM1062 = C0210f5.m1062(C0210f5.this);
                if (listM1062.size() == 2) {
                    return listM1062.get(1);
                }
            }
            return C0373r3.m1213(methodHookParam2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final List m1062(C0210f5 c0210f5) {
        c0210f5.getClass();
        if (!(!C0406ta.m1245(f781))) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(C0432va.m1259(f781, new String[]{C0341oa.m915(new byte[]{9}, new byte[]{37, 72, 72, -32, -96, 52})}));
        if (arrayList.size() != 2) {
            int i = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{-36, -58, -44, 108, 89, 97, -47, -58, -16, 111, 89, 66, -48, -4, -41, 96, 75, 67, 21, -128, -31, 63, 2, 79, -71, -114, -47, 45, 12, 66, -121, -113, -13, 38}, new byte[]{57, 104, 78, -120, -28, -20}));
            return new ArrayList();
        }
        arrayList.set(0, C0432va.m1260((String) arrayList.get(0)).toString());
        arrayList.set(1, C0432va.m1260((String) arrayList.get(1)).toString());
        return C0272jb.m1106(Double.valueOf(Double.parseDouble((String) arrayList.get(0))), Double.valueOf(Double.parseDouble((String) arrayList.get(1))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{42, 46, 102, 40, -83, 69, 41, 18, 104, 38, -83}, new byte[]{90, 92, 9, 75, -56, 54}), str);
        f781 = C0192e1.m847(EnumC0164c1.f1390);
        f782 = C0192e1.m846(EnumC0164c1.f726);
        C0386s3.m1225(C0341oa.m915(new byte[]{127, 82, 3, -106, -40, -50, 125, 77, 64, -39, -55, -54, 50, 81, 1, -37, -40, -41, 117, 82, 0, -106, -8, -18, 125, 77, 34, -41, -38, -62, 104, 84, 1, -42}, new byte[]{28, 61, 110, -72, -71, -93}), C0341oa.m915(new byte[]{-76, -28, 2, 12, 76, 33, -76, -24, 2, 53, 71, 42}, new byte[]{-45, -127, 118, 64, 35, 79}), new Object[0], new a());
        C0386s3.m1225(C0341oa.m915(new byte[]{-31, 48, -66, -117, 119, 15, -29, 47, -3, -60, 102, 11, -84, 51, -68, -58, 119, 22, -21, 48, -67, -117, 87, 47, -29, 47, -97, -54, 117, 3, -10, 54, -68, -53}, new byte[]{-126, 95, -45, -91, 22, 98}), C0341oa.m915(new byte[]{-73, 101, -113, -66, -65, -57, -71, 116, -114, -106, -69}, new byte[]{-48, 0, -5, -14, -34, -77}), new Object[0], new b());
        String str2 = C0283k8.f1632.f1540;
        C0237h4.m1089(C0341oa.m915(new byte[]{-66, -13, 27, -88, -69, 104, -98, -30, 56, -87, -101, 101, -103}, new byte[]{-22, -117, 87, -57, -40, 9}), str2);
        C0386s3.m1225(str2, C0341oa.m915(new byte[]{77, -74, 46, 112, -27, -86, 77, -70, 46, 73, -18, -95}, new byte[]{42, -45, 90, 60, -118, -60}), new Object[0], new C0182d5(this));
        String str3 = C0283k8.f1632.f1540;
        C0237h4.m1089(C0341oa.m915(new byte[]{-65, -106, -34, 33, 120, -23, -97, -121, -3, 32, 88, -28, -104}, new byte[]{-21, -18, -110, 78, 27, -120}), str3);
        C0386s3.m1225(str3, C0341oa.m915(new byte[]{-110, 46, 106, -122, -27, 91, -100, 63, 107, -82, -31}, new byte[]{-11, 75, 30, -54, -124, 47}), new Object[0], new C0196e5(this));
    }
}
