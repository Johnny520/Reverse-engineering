package androidx.lifecycle;

import io.ktor.util.C4210;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2391 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f7028;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7029;

    public /* synthetic */ C2391(Object obj, int i) {
        this.f7029 = i;
        this.f7028 = obj;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        int i = this.f7029;
        Object obj = this.f7028;
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
                    C4210.m8625(lifecycle$Event, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    interfaceC2388.getLifecycle().mo4492(this);
                    ((C2416) obj).m4506();
                    return;
                }
        }
    }
}
