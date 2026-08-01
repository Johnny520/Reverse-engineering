package p232;

import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2369;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2389;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.util.HashSet;
import java.util.Iterator;
import p222.AbstractC7988;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8068 implements InterfaceC8069, InterfaceC2389 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC2402 f22254;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final HashSet f22255 = new HashSet();

    public C8068(AbstractC2402 abstractC2402) {
        this.f22254 = abstractC2402;
        abstractC2402.mo4493(this);
    }

    @InterfaceC2369(Lifecycle$Event.ON_DESTROY)
    public void onDestroy(InterfaceC2388 interfaceC2388) {
        Iterator it = AbstractC7988.m13446(this.f22255).iterator();
        while (it.hasNext()) {
            ((InterfaceC8072) it.next()).mo6734();
        }
        interfaceC2388.getLifecycle().mo4492(this);
    }

    @InterfaceC2369(Lifecycle$Event.ON_START)
    public void onStart(InterfaceC2388 interfaceC2388) {
        Iterator it = AbstractC7988.m13446(this.f22255).iterator();
        while (it.hasNext()) {
            ((InterfaceC8072) it.next()).mo6730();
        }
    }

    @InterfaceC2369(Lifecycle$Event.ON_STOP)
    public void onStop(InterfaceC2388 interfaceC2388) {
        Iterator it = AbstractC7988.m13446(this.f22255).iterator();
        while (it.hasNext()) {
            ((InterfaceC8072) it.next()).mo6732();
        }
    }

    @Override // p232.InterfaceC8069
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12250(InterfaceC8072 interfaceC8072) {
        this.f22255.add(interfaceC8072);
        Lifecycle$State lifecycle$State = ((C2386) this.f22254).f7018;
        if (lifecycle$State == Lifecycle$State.DESTROYED) {
            interfaceC8072.mo6734();
        } else if (lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            interfaceC8072.mo6730();
        } else {
            interfaceC8072.mo6732();
        }
    }

    @Override // p232.InterfaceC8069
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12252(InterfaceC8072 interfaceC8072) {
        this.f22255.remove(interfaceC8072);
    }
}
