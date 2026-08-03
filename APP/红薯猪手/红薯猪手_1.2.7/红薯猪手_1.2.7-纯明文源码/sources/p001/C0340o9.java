package p001;

import android.view.View;
import android.widget.LinearLayout;
import de.robv.android.xposed.XC_MethodHook;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.o9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0340o9 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0405t9 f1014;

    public C0340o9(C0405t9 c0405t9) {
        this.f1014 = c0405t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        LinearLayout linearLayout;
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090("param", methodHookParam2);
        this.f1014.f1822 = C0407tb.m1249(17.0f);
        Object obj = methodHookParam2.thisObject;
        C0237h4.m1089("thisObject", obj);
        C0274k c0274k = C0283k8.f1632;
        Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1573);
        C0325n8.f994.getClass();
        View viewM1159 = C0325n8.m1159(methodHookParam2);
        if (viewM1159 != null) {
            String str = C0283k8.a.m885().f1538;
            C0237h4.m1089("AlphaRIdCls", str);
            Integer numM1206 = C0373r3.m1206(str, C0283k8.a.m885().f1574);
            linearLayout = (LinearLayout) viewM1159.findViewById(numM1206 != null ? numM1206.intValue() : -1);
        } else {
            linearLayout = null;
        }
        if (objM1203 != null && linearLayout != null) {
            if (C0237h4.m864(C0373r3.m1203(objM1203, "noteType"), "normal")) {
                C0405t9.m1237(this.f1014, linearLayout, objM1203);
            } else {
                C0405t9.m1238(this.f1014, linearLayout);
            }
        }
        return C0433vb.f1163;
    }
}
