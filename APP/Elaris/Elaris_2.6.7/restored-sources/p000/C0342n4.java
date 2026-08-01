package p000;

import android.view.View;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: n4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0342n4 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
        if (obj != null) {
            AbstractC0449s4.f840j = new WeakReference(obj);
        }
        WeakReference weakReference = AbstractC0449s4.f843m;
        View view = weakReference == null ? null : (View) weakReference.get();
        if (view == null || !AbstractC0278j4.m732x(view, "send_delegate")) {
            return;
        }
        methodHookParam.setResult(null);
    }
}
