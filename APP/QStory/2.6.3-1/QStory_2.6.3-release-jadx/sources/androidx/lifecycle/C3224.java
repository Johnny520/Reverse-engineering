package androidx.lifecycle;

import io.ktor.util.C5043;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3224 implements InterfaceC3213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f7374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7375;

    public /* synthetic */ C3224(Object obj, int i) {
        this.f7375 = i;
        this.f7374 = obj;
    }

    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        int i = this.f7375;
        Object obj = this.f7374;
        switch (i) {
            case 0:
                new HashMap();
                InterfaceC3241[] interfaceC3241Arr = (InterfaceC3241[]) obj;
                if (interfaceC3241Arr.length > 0) {
                    InterfaceC3241 interfaceC3241 = interfaceC3241Arr[0];
                    throw null;
                }
                if (interfaceC3241Arr.length <= 0) {
                    return;
                }
                InterfaceC3241 interfaceC32412 = interfaceC3241Arr[0];
                throw null;
            default:
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    C5043.m9174(lifecycle$Event, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    interfaceC3221.getLifecycle().mo5062(this);
                    ((C3249) obj).m5076();
                    return;
                }
        }
    }
}
