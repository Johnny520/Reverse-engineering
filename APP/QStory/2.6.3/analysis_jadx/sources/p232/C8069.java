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
import p222.AbstractC7989;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8069 implements InterfaceC8070, InterfaceC2389 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC2402 f22252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final HashSet f22253 = new HashSet();

    public C8069(AbstractC2402 abstractC2402) {
        this.f22252 = abstractC2402;
        abstractC2402.mo4503(this);
    }

    @InterfaceC2369(Lifecycle$Event.ON_DESTROY)
    public void onDestroy(InterfaceC2388 interfaceC2388) {
        Iterator it = AbstractC7989.m13474(this.f22253).iterator();
        while (it.hasNext()) {
            ((InterfaceC8073) it.next()).mo6779();
        }
        interfaceC2388.getLifecycle().mo4502(this);
    }

    @InterfaceC2369(Lifecycle$Event.ON_START)
    public void onStart(InterfaceC2388 interfaceC2388) {
        Iterator it = AbstractC7989.m13474(this.f22253).iterator();
        while (it.hasNext()) {
            ((InterfaceC8073) it.next()).mo6775();
        }
    }

    @InterfaceC2369(Lifecycle$Event.ON_STOP)
    public void onStop(InterfaceC2388 interfaceC2388) {
        Iterator it = AbstractC7989.m13474(this.f22253).iterator();
        while (it.hasNext()) {
            ((InterfaceC8073) it.next()).mo6777();
        }
    }

    @Override // p232.InterfaceC8070
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12277(InterfaceC8073 interfaceC8073) {
        this.f22253.add(interfaceC8073);
        Lifecycle$State lifecycle$State = ((C2386) this.f22252).f7019;
        if (lifecycle$State == Lifecycle$State.DESTROYED) {
            interfaceC8073.mo6779();
        } else if (lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            interfaceC8073.mo6775();
        } else {
            interfaceC8073.mo6777();
        }
    }

    @Override // p232.InterfaceC8070
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12279(InterfaceC8073 interfaceC8073) {
        this.f22253.remove(interfaceC8073);
    }
}
