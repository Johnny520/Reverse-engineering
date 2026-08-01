package p000;

import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: td */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0474td extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT)) {
            Object[] objArr = methodHookParam.args;
            Object obj = objArr[0];
            if (obj instanceof TextView) {
                TextView textView = (TextView) obj;
                Object obj2 = objArr[2];
                int iIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                if (iIntValue > 0) {
                    textView.setText(String.valueOf(iIntValue));
                }
                try {
                    textView.setMaxWidth(Integer.MAX_VALUE);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT)) {
            methodHookParam.args[4] = Integer.MAX_VALUE;
        }
    }
}
