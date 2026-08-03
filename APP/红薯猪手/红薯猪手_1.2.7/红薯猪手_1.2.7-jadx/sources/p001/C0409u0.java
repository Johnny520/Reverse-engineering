package p001;

import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۟.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0409u0 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0461y0 f1120;

    public C0409u0(C0461y0 c0461y0) {
        this.f1120 = c0461y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090(C0341oa.m915(new byte[]{-62, -112, -100, 18, 114}, new byte[]{-78, -15, -18, 115, 31, 104}), methodHookParam2);
        C0461y0 c0461y0 = this.f1120;
        C0325n8.f994.getClass();
        View viewM1159 = C0325n8.m1159(methodHookParam2);
        if (viewM1159 != null) {
            String str = C0283k8.f1632.f887;
            C0237h4.m1089(C0341oa.m915(new byte[]{46, 74, 86, 34, 60, 73, 45, 68, 86, 53, 17, 84, 23, 74, 75, 60, 7, 120, 7, 104, 78, 35}, new byte[]{99, 43, 34, 80, 85, 49}), str);
            Integer numM1206 = C0373r3.m1206(str, C0341oa.m915(new byte[]{-77, -10, -117, 28, -42, -28, -87, -11, -102, 45, -44}, new byte[]{-35, -103, -1, 121, -126, -115}));
            TextView textView = (TextView) viewM1159.findViewById(numM1206 != null ? numM1206.intValue() : -1);
            String str2 = C0283k8.f1632.f887;
            C0237h4.m1089(C0341oa.m915(new byte[]{47, -25, -106, 55, -111, 66, 44, -23, -106, 32, -68, 95, 22, -25, -117, 41, -86, 115, 6, -59, -114, 54}, new byte[]{98, -122, -30, 69, -8, 58}), str2);
            Integer numM12062 = C0373r3.m1206(str2, C0341oa.m915(new byte[]{23, 121, -114, -126, -86, -11, 17, 96, -118, -79, -86, -61, 10, 66, -122, -128, -72}, new byte[]{126, 20, -17, -27, -49, -69}));
            View viewFindViewById = viewM1159.findViewById(numM12062 != null ? numM12062.intValue() : -1);
            if (viewFindViewById != null) {
                textView.setOnLongClickListener(new ViewOnLongClickListenerC0396t0(methodHookParam2, c0461y0, 0));
                viewFindViewById.setOnLongClickListener(new ViewOnLongClickListenerC0396t0(methodHookParam2, c0461y0, 1));
            }
        }
        return C0433vb.f1163;
    }
}
