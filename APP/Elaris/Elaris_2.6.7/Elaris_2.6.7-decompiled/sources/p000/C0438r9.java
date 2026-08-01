package p000;

import android.app.Activity;
import android.view.View;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: r9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0438r9 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f801a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0438r9(int i) {
        super(70);
        this.f801a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        View viewFindViewById;
        Object obj = methodHookParam.thisObject;
        if ((obj instanceof Activity) && (viewFindViewById = ((Activity) obj).findViewById(this.f801a)) != null && viewFindViewById.getVisibility() == 0) {
            viewFindViewById.setEnabled(true);
        }
        methodHookParam.setResult(null);
    }
}
