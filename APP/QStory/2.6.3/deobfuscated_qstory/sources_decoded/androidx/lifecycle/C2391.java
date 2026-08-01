package androidx.lifecycle;

import io.ktor.util.C4211;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2391 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f7029;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7030;

    public /* synthetic */ C2391(Object obj, int i) {
        this.f7030 = i;
        this.f7029 = obj;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        int i = this.f7030;
        Object obj = this.f7029;
        switch (i) {
            case 0:
                new HashMap();
                InterfaceC2408[] interfaceC2408Arr = (InterfaceC2408[]) obj;
                if (interfaceC2408Arr.length > 0) {
                    InterfaceC2408 interfaceC2408 = interfaceC2408Arr[0];
                    throw null;
                }
                if (interfaceC2408Arr.length <= 0) {
                    return;
                }
                InterfaceC2408 interfaceC24082 = interfaceC2408Arr[0];
                throw null;
            default:
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    C4211.m8615(lifecycle$Event, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    interfaceC2388.getLifecycle().mo4502(this);
                    ((C2416) obj).m4516();
                    return;
                }
        }
    }
}
