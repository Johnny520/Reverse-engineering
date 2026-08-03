package p001;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0448x0 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0461y0 f1182;

    public C0448x0(C0461y0 c0461y0) {
        this.f1182 = c0461y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090("param", methodHookParam2);
        Object obj = methodHookParam2.args[1];
        if (obj != null) {
            C0325n8.f994.getClass();
            View viewM1159 = C0325n8.m1159(methodHookParam2);
            View viewFindViewById = null;
            if (viewM1159 != null) {
                C0274k c0274k = C0283k8.f1632;
                String str = C0283k8.a.m885().f1537;
                C0237h4.m1089("MatrixDetailFeedRIdCls", str);
                Integer numM1206 = C0373r3.m1206(str, "noteContentText");
                viewFindViewById = viewM1159.findViewById(numM1206 != null ? numM1206.intValue() : -1);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setOnLongClickListener(new ViewOnLongClickListenerC0396t0(this.f1182, obj));
            }
        }
        return C0433vb.f1163;
    }
}
