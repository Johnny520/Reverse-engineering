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
        C0237h4.m1090("$param", methodHookParam);
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089("thisObject", obj);
        C0274k c0274k = C0283k8.f1632;
        Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1606);
        if (objM1203 == null || (str = (String) C0373r3.m1204(objM1203, "url")) == null) {
            str = "";
        }
        int iIntValue = 1;
        if (!(str.length() > 0)) {
            int i = C0330o.f1000;
            C0330o.m1173(0, "获取瞬间链接失败");
            return;
        }
        if (objM1203 != null && (num = (Integer) C0373r3.m1204(objM1203, "type")) != null) {
            iIntValue = num.intValue();
        }
        String strM915 = iIntValue == 2 ? "mp4" : "jpg";
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
        C0237h4.m1090("param", methodHookParam2);
        Object obj = methodHookParam2.thisObject;
        C0237h4.m1089("thisObject", obj);
        C0274k c0274k = C0283k8.f1632;
        String str = C0283k8.a.m885().f1607;
        String str2 = C0283k8.a.m885().f1534;
        C0237h4.m1089("HeyRIdCls", str2);
        View view = (View) C0373r3.m927(obj, str, C0373r3.m1206(str2, "heyDetailClickSwitchView"));
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
