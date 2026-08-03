package p001;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import p001.AbstractC0149b0;

/* JADX INFO: renamed from: ۟.t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0399t3 extends XC_MethodReplacement {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ InterfaceC0222g3<XC_MethodHook.MethodHookParam, Object> f1105;

    public C0399t3(InterfaceC0222g3<? super XC_MethodHook.MethodHookParam, ? extends Object> interfaceC0222g3) {
        this.f1105 = interfaceC0222g3;
    }

    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0237h4.m1090(C0341oa.m915(new byte[]{4, 29, -24, 58, 49}, new byte[]{116, 124, -102, 91, 92, -22}), methodHookParam);
        try {
            return C0386s3.m935(this.f1105, methodHookParam);
        } catch (Throwable th) {
            StringBuilder sb = AbstractC0149b0.f695;
            AbstractC0149b0.a.m817(th);
            return null;
        }
    }
}
