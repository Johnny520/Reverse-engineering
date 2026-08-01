package p000;

import android.view.View;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: m4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0326m4 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
        Object obj2 = (methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length <= 0) ? null : objArr[0];
        if (obj != null) {
            AbstractC0449s4.f842l = new WeakReference(obj);
        }
        if (obj2 instanceof View) {
            View view = (View) obj2;
            AbstractC0449s4.f843m = new WeakReference(view);
            if (AbstractC0278j4.m732x(view, "send_button_click")) {
                methodHookParam.setResult(null);
            }
        }
    }
}
