package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: ua */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0487ua extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        if (!HookEntry.runtimeBool(Prefs.KEY_BLOCK_ANNOYING_POPUPS) || (objArr = methodHookParam.args) == null || objArr.length < 2) {
            return;
        }
        Object obj = objArr[1];
        if (obj instanceof Dialog) {
            Dialog dialog = (Dialog) obj;
            try {
                Method method = obj.getClass().getMethod("getTitleTextView", null);
                Method method2 = obj.getClass().getMethod("getMessageTextView", null);
                Method method3 = obj.getClass().getMethod("getBtnight", null);
                String str = AbstractC0535xa.m1140b(method.invoke(obj, null)) + "\n" + AbstractC0535xa.m1140b(method2.invoke(obj, null));
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                if (lowerCase.contains("即将离开") || lowerCase.contains("打开其他应用")) {
                    Object objInvoke = method3.invoke(obj, null);
                    if (objInvoke instanceof View) {
                        View view = (View) objInvoke;
                        if (dialog.isShowing() && view.isShown()) {
                            String lowerCase2 = (view instanceof TextView ? AbstractC0535xa.m1140b(view) : "").toLowerCase(locale);
                            if ((lowerCase2.contains("允许") || lowerCase2.contains("打开") || lowerCase2.contains("allow")) && view.performClick()) {
                                AbstractC0497v4.m1076C("external app leave dialog auto allowed precise");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                AbstractC0000a.m2c("external app dialog precise allow failed: ", th);
            }
        }
    }
}
