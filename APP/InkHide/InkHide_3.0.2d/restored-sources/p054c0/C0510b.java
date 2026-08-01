package p054c0;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import p001A0.C0026a;

/* JADX INFO: renamed from: c0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0510b extends XC_MethodReplacement {

    /* JADX INFO: renamed from: a */
    public XC_MethodReplacement f1617a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            return XposedHelpers.callMethod(this.f1617a, "replaceHookedMethod", new Object[]{methodHookParam});
        } catch (Throwable th) {
            C0026a c0026a = (C0026a) AbstractC0514f.f1621a.f443b;
            if (c0026a != null) {
                c0026a.m9d(th);
            }
            return XposedBridge.invokeOriginalMethod(methodHookParam.method, methodHookParam.thisObject, methodHookParam.args);
        }
    }
}
