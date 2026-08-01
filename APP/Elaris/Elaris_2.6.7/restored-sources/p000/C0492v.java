package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: v */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0492v extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            try {
                Object[] objArr = methodHookParam.args;
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                Method method = null;
                ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                if (AbstractC0033c0.m75a(arrayList, obj)) {
                    methodHookParam.setResult(null);
                    Object[] objArr2 = methodHookParam.args;
                    Object obj3 = objArr2.length >= 3 ? objArr2[2] : null;
                    if (obj3 != null) {
                        try {
                            Class<?> superclass = obj3.getClass();
                            Class<?>[] clsArr = {Integer.TYPE, String.class};
                            while (true) {
                                if (superclass == null) {
                                    break;
                                }
                                try {
                                    Method declaredMethod = superclass.getDeclaredMethod("onResult", clsArr);
                                    declaredMethod.setAccessible(true);
                                    method = declaredMethod;
                                    break;
                                } catch (Throwable unused) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                            if (method != null) {
                                method.invoke(obj3, 0, "");
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    int i = AbstractC0033c0.f76f;
                    AbstractC0033c0.f76f = i + 1;
                    if (i < 8) {
                        AbstractC0033c0.m85k("blocked recall deleteMsg fallback: " + obj + ", list=" + arrayList);
                    }
                }
            } catch (Throwable th) {
                AbstractC0033c0.m85k("deleteMsg fallback failed: " + th);
            }
        }
    }
}
