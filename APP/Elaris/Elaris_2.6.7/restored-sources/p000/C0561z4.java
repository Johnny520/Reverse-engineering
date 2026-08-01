package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: z4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0561z4 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_FLASH_PIC_AS_IMAGE)) {
            Object objFirstMsgRecordArg = HookEntry.firstMsgRecordArg(methodHookParam == null ? null : methodHookParam.args);
            Field fieldM34d = AbstractC0006a5.m34d(objFirstMsgRecordArg != null ? objFirstMsgRecordArg.getClass() : null);
            int iM31a = 0;
            if (fieldM34d != null) {
                try {
                    iM31a = AbstractC0006a5.m31a(objFirstMsgRecordArg, fieldM34d);
                } catch (Throwable unused) {
                }
            }
            if (iM31a > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - AbstractC0006a5.f24e < 1200) {
                    return;
                }
                AbstractC0006a5.f24e = jCurrentTimeMillis;
                HookEntry.logAlways("flash pic converted: source=aio-constructor, fields=" + iM31a);
            }
        }
    }
}
