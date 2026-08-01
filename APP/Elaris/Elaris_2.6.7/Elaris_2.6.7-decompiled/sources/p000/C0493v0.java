package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.HashSet;

/* JADX INFO: renamed from: v0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0493v0 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
            Object obj = methodHookParam.thisObject;
            ThreadLocal threadLocal = AbstractC0545y4.f1088a;
            if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE) && HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
                AbstractC0545y4.m1168i(obj, 0, new HashSet());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        if (!HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE) || (objArr = methodHookParam.args) == null) {
            return;
        }
        ThreadLocal threadLocal = AbstractC0545y4.f1088a;
        if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.indexOf(47) < 0 && str.indexOf(92) < 0) {
                        String strM1167h = AbstractC0545y4.m1167h(str);
                        if (!strM1167h.equals(str)) {
                            AbstractC0497v4.m1076C("filename sanitize original=" + AbstractC0260i5.m535H1(str, 180) + " fixed=" + AbstractC0260i5.m535H1(strM1167h, 180));
                            objArr[i] = strM1167h;
                        }
                    }
                } else {
                    ThreadLocal threadLocal2 = AbstractC0545y4.f1088a;
                    if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE) && HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
                        AbstractC0545y4.m1168i(obj, 0, new HashSet());
                    }
                }
            }
        }
    }
}
