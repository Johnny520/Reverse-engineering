package p001;

import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import p001.C0211f6;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.jc */
/* JADX INFO: loaded from: classes.dex */
public final class C0273jc extends AbstractC0484za {

    /* JADX INFO: renamed from: ۟.jc$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final a f886 = new a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090(C0341oa.m915(new byte[]{77, -66}, new byte[]{36, -54, 108, 123, -69, 69}), methodHookParam2);
            C0273jc.m1112(methodHookParam2);
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m1112(XC_MethodHook.MethodHookParam methodHookParam) {
        String string;
        Object objM1203;
        String string2;
        Object objM12032;
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089(C0341oa.m915(new byte[]{-72, -2, 6, -59, 84, -101, -90, -13, 12, -62}, new byte[]{-52, -106, 111, -74, 27, -7}), obj);
        C0274k c0274k = C0283k8.f1632;
        Object objM12033 = C0373r3.m1203(obj, C0283k8.a.m885().f1602);
        if (objM12033 == null) {
            return;
        }
        ArrayList<C0250i3> arrayList = C0211f6.f1445;
        Object objM12034 = C0373r3.m1203(objM12033, C0341oa.m915(new byte[]{-35, -23, 52, 75, -105}, new byte[]{-85, -128, 80, 46, -8, 75}));
        String str = "";
        if (objM12034 == null || (objM12032 = C0373r3.m1203(objM12034, C0341oa.m915(new byte[]{9, -26, 33}, new byte[]{124, -108, 77, 47, -43, -108}))) == null || (string = objM12032.toString()) == null) {
            string = "";
        }
        C0211f6.a.m853(string);
        Object objM12035 = C0373r3.m1203(objM12033, C0341oa.m915(new byte[]{-109, -7, 29, -74, -30, -82, -85, -9, 0, -68, -15}, new byte[]{-3, -104, 105, -33, -108, -53}));
        if (objM12035 != null && (objM1203 = C0373r3.m1203(objM12035, C0341oa.m915(new byte[]{-30, 115, -120}, new byte[]{-105, 1, -28, 121, -123, -69}))) != null && (string2 = objM1203.toString()) != null) {
            str = string2;
        }
        C0211f6.a.m854(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-84, -47, 3, 57, 4, -120, -81, -19, 13, 55, 4}, new byte[]{-36, -93, 108, 90, 97, -5}), str);
        String str2 = C0283k8.f1632.f1600;
        C0237h4.m1089(C0341oa.m915(new byte[]{-71, 69, -47, 107, 96, 48, -101, 73, -40, 94, 99, 24, -106, 73, -57, 77, 96, 23, -101, 94, -38, 98, 99, 28, -99, 111, -39, 125}, new byte[]{-17, 44, -75, 14, 15, 121}), str2);
        C0373r3.m1210(str2, C0283k8.f1632.f1601, new Object[]{Double.TYPE, Float.TYPE, Long.class, Integer.TYPE}, a.f886);
    }
}
