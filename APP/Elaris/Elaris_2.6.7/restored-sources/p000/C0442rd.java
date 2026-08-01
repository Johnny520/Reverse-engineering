package p000;

import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: rd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0442rd extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        TextView textViewM1096o;
        if (HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT)) {
            Object obj = methodHookParam.args[0];
            int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
            if (iIntValue <= 0 || (textViewM1096o = AbstractC0497v4.m1096o(3, methodHookParam.thisObject)) == null) {
                return;
            }
            textViewM1096o.setText(String.valueOf(iIntValue));
        }
    }
}
