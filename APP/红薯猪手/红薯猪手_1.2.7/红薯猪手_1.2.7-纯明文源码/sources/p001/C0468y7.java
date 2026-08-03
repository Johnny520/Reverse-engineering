package p001;

import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.y7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0468y7 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۟.y7$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            Object objM1203;
            Integer num;
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090("it", methodHookParam2);
            String strM1139 = C0292l3.m1139();
            C0274k c0274k = C0283k8.f1632;
            if (!C0237h4.m864(strM1139, C0283k8.a.m885().f1590)) {
                Object obj = methodHookParam2.thisObject;
                C0237h4.m1089("thisObject", obj);
                Object objM1103 = C0272jb.m1103(obj);
                int iIntValue = 0;
                Object objM12032 = null;
                Object objM12033 = objM1103 != null ? C0373r3.m1203(objM1103, C0283k8.a.m885().f1593) : null;
                if (objM12033 == null) {
                    int i = C0224g5.f810;
                    String string = C0372r2.m924("获取 getPositionFunc 失败, imageMatrixController:", objM1103 != null ? objM1103.getClass().getName() : null).toString();
                    C0237h4.m1089("toString(...)", string);
                    C0224g5.m856(string);
                }
                if (objM12033 != null && (num = (Integer) C0373r3.m927(objM12033, "invoke", new Object[0])) != null) {
                    iIntValue = num.intValue();
                }
                if (objM1103 != null && (objM1203 = C0373r3.m1203(objM1103, C0283k8.a.m885().f1594)) != null) {
                    objM12032 = C0373r3.m1203(objM1203, C0283k8.a.m885().f1595);
                }
                C0468y7.m1275(C0468y7.m1274(C0468y7.this, objM12032), iIntValue);
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final List m1274(C0468y7 c0468y7, Object obj) {
        c0468y7.getClass();
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) C0373r3.m1204(obj, "imageList");
            if (arrayList2 != null) {
                for (Object obj2 : arrayList2) {
                    String str = (String) C0373r3.m1204(obj2, "url");
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() == 0) {
                        String str2 = (String) C0373r3.m1204(obj2, "original");
                        str = str2 != null ? str2 : "";
                    }
                    if (str.length() > 0) {
                        arrayList.add(new C0250i3(str));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return C0179d2.f753;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1275(List list, int i) {
        if (!list.isEmpty()) {
            AlertDialogC0403t7 alertDialogC0403t7 = new AlertDialogC0403t7(C0292l3.m893(), list, i);
            alertDialogC0403t7.f1889 = true;
            alertDialogC0403t7.f1888 = true;
            alertDialogC0403t7.show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090("processName", str);
        if (C0192e1.m846(EnumC0164c1.f1379)) {
            String str2 = C0283k8.f1632.f894;
            C0237h4.m1089("ImageMatrixControllerClsBindZoom", str2);
            C0373r3.m1208(str2, "invoke", new Object[0], new a());
        }
    }
}
