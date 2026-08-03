package p001;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۟.s9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0392s9 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public static final C0392s9 f1093 = new C0392s9();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090(C0341oa.m915(new byte[]{96, 79}, new byte[]{9, 59, 62, 73, -106, 114}), methodHookParam2);
        Object obj = methodHookParam2.thisObject;
        C0237h4.m1088(C0341oa.m915(new byte[]{30, 109, 54, -33, 18, 44, 17, 118, 52, -36, 70, 111, 18, 125, 122, -48, 83, 60, 4, 56, 46, -36, 18, 33, 31, 118, 119, -35, 71, 35, 28, 56, 46, -54, 66, 42, 80, 121, 52, -41, 64, 32, 25, 124, 116, -46, 66, 63, 94, 89, 57, -57, 91, 57, 25, 108, 35}, new byte[]{112, 24, 90, -77, 50, 79}), obj);
        Activity activity = (Activity) obj;
        Intent intent = activity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(C0341oa.m915(new byte[]{73, 26, 86, 63, 60, 103, 72}, new byte[]{58, 110, 63, 92, 87, 2})) : null;
        if (!(stringExtra == null || stringExtra.length() == 0) && C0406ta.m942(stringExtra, C0341oa.m915(new byte[]{119}, new byte[]{12, -84, -25, 124, 86, 45}))) {
            C0325n8 c0325n8 = C0325n8.f994;
            C0379r9 c0379r9 = new C0379r9(stringExtra);
            c0325n8.getClass();
            C0325n8.m1161(activity, c0379r9);
        }
        return C0433vb.f1163;
    }
}
