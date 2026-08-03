package p001;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۟.k9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284k9 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public static final C0284k9 f915 = new C0284k9();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090("it", methodHookParam2);
        Object result = methodHookParam2.getResult();
        Object obj = methodHookParam2.thisObject;
        C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", obj);
        Activity activity = (Activity) obj;
        C0325n8 c0325n8 = C0325n8.f994;
        C0270j9 c0270j9 = new C0270j9(activity, result);
        c0325n8.getClass();
        C0325n8.m1161(activity, c0270j9);
        return C0433vb.f1163;
    }
}
