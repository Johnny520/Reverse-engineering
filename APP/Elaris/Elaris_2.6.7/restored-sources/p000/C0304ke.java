package p000;

import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: ke */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0304ke extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String str;
        if (HookEntry.runtimeBool(Prefs.KEY_VOICE_MESSAGE_ACTIONS)) {
            C0410pd c0410pdM270T0 = AbstractC0169w.m270T0(methodHookParam == null ? null : methodHookParam.thisObject);
            if (c0410pdM270T0 == null) {
                return;
            }
            AbstractC0169w.f176p = c0410pdM270T0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            AbstractC0169w.f177q = jCurrentTimeMillis;
            if (jCurrentTimeMillis - AbstractC0169w.f174n > 60000) {
                AbstractC0169w.f174n = jCurrentTimeMillis;
                StringBuilder sb = new StringBuilder("local voice entry target captured source=aio_delegate_show chatType=");
                sb.append(c0410pdM270T0.f723b);
                sb.append(" peer=");
                String str2 = c0410pdM270T0.f722a;
                if (str2.length() == 0) {
                    str = "";
                } else {
                    int length = str2.length();
                    if (length <= 6) {
                        str = "***" + length;
                    } else {
                        str = str2.substring(0, Math.min(3, length)) + "***" + str2.substring(Math.max(3, length - 3)) + "(" + length + ")";
                    }
                }
                sb.append(str);
                HookEntry.log(sb.toString());
            }
        }
    }
}
