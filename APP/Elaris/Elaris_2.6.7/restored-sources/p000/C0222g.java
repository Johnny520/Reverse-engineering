package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: g */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0222g extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        if (!HookEntry.runtimeBool(Prefs.KEY_WEB_KERNEL_FALLBACK) || (obj = methodHookParam.thisObject) == null) {
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getFields()) {
                try {
                    if (field.getType() == Boolean.TYPE) {
                        field.setBoolean(obj, true);
                    }
                } catch (Throwable th) {
                    AbstractC0198e7.m343a("web-kernel", "force-boolean-field", th);
                }
            }
        }
    }
}
