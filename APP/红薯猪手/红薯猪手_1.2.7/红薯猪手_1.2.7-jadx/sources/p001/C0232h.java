package p001;

import android.view.View;
import android.widget.RelativeLayout;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۟.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0232h extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public static final C0232h f819 = new C0232h();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        RelativeLayout relativeLayout;
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090(C0341oa.m915(new byte[]{49, -65}, new byte[]{88, -53, -6, 122, -9, 102}), methodHookParam2);
        C0325n8.f994.getClass();
        View viewM1159 = C0325n8.m1159(methodHookParam2);
        if (viewM1159 != null) {
            String str = C0283k8.f1632.f888;
            C0237h4.m1089(C0341oa.m915(new byte[]{-124, -51, 42, -72, -110, -94, -118, -61, 51, -89, -98, -76, -67, -2, 23, -82, -72, -74, -70}, new byte[]{-55, -84, 94, -54, -5, -38}), str);
            Integer numM1206 = C0373r3.m1206(str, C0341oa.m915(new byte[]{-118, -96, 68, -119, -22, 102, -97, -106, 84, -125, -19, 68, -118, -70, 72, -109, -21}, new byte[]{-21, -61, 39, -26, -97, 8}));
            relativeLayout = (RelativeLayout) viewM1159.findViewById(numM1206 != null ? numM1206.intValue() : -1);
        } else {
            relativeLayout = null;
        }
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        return C0433vb.f1163;
    }
}
