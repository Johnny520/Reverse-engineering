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
            C0237h4.m1090("it", methodHookParam2);
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
            C0237h4.m1090("it", methodHookParam2);
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
        ArrayList arrayList = new ArrayList(C0432va.m1259(f781, new String[]{","}));
        if (arrayList.size() != 2) {
            int i = C0330o.f1000;
            C0330o.m1173(0, "定位设置错误,请检查设置");
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
        C0237h4.m1090("processName", str);
        f781 = C0192e1.m847(EnumC0164c1.f1390);
        f782 = C0192e1.m846(EnumC0164c1.f726);
        C0386s3.m1225("com.amap.api.location.AMapLocation", "getLongitude", new Object[0], new a());
        C0386s3.m1225("com.amap.api.location.AMapLocation", "getLatitude", new Object[0], new b());
        String str2 = C0283k8.f1632.f1540;
        C0237h4.m1089("TxLocationCls", str2);
        C0386s3.m1225(str2, "getLongitude", new Object[0], new C0182d5(this));
        String str3 = C0283k8.f1632.f1540;
        C0237h4.m1089("TxLocationCls", str3);
        C0386s3.m1225(str3, "getLatitude", new Object[0], new C0196e5(this));
    }
}
