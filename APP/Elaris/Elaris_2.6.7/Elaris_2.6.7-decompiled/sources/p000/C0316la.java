package p000;

import android.widget.CheckBox;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: la */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0316la extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT)) {
            try {
                Object objM763d = AbstractC0332ma.m763d(AbstractC0332ma.m763d(methodHookParam.thisObject, "a"), "d");
                if (objM763d instanceof CheckBox) {
                    CheckBox checkBox = (CheckBox) objM763d;
                    if (checkBox.isChecked()) {
                        return;
                    }
                    checkBox.post(new RunnableC0239h0(7, checkBox));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
