package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Ref$IntRef;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0869 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2446;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2447;

    public /* synthetic */ C0869(Object obj, int i) {
        this.f2447 = i;
        this.f2446 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f2447;
        Object obj = this.f2446;
        switch (i) {
            case 0:
                return CursorAnchorInfoController$startOrStopMonitoring$1.invokeSuspend$lambda$0((C0873) obj);
            case 1:
                return Integer.valueOf(TextFieldCoreModifierNode$startCursorJob$1.invokeSuspend$lambda$0(null, (Ref$IntRef) obj));
            case 2:
                Object systemService = ((C0867) obj).f2442.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            default:
                return new BaseInputConnection(((C0851) obj).f2396, false);
        }
    }
}
