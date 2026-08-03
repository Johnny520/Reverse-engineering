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
        C0237h4.m1090("it", methodHookParam2);
        Object obj = methodHookParam2.thisObject;
        C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", obj);
        Activity activity = (Activity) obj;
        Intent intent = activity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("sticker") : null;
        if (!(stringExtra == null || stringExtra.length() == 0) && C0406ta.m942(stringExtra, "{")) {
            C0325n8 c0325n8 = C0325n8.f994;
            C0379r9 c0379r9 = new C0379r9(stringExtra);
            c0325n8.getClass();
            C0325n8.m1161(activity, c0379r9);
        }
        return C0433vb.f1163;
    }
}
