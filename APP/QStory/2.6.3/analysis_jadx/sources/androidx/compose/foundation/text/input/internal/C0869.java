package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Ref$IntRef;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0869 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2447;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2448;

    public /* synthetic */ C0869(Object obj, int i) {
        this.f2448 = i;
        this.f2447 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f2448;
        Object obj = this.f2447;
        switch (i) {
            case 0:
                return CursorAnchorInfoController$startOrStopMonitoring$1.invokeSuspend$lambda$0((C0873) obj);
            case 1:
                return Integer.valueOf(TextFieldCoreModifierNode$startCursorJob$1.invokeSuspend$lambda$0(null, (Ref$IntRef) obj));
            case 2:
                Object systemService = ((C0867) obj).f2443.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            default:
                return new BaseInputConnection(((C0851) obj).f2397, false);
        }
    }
}
