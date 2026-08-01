package p248;

import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3202;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3222;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.util.HashSet;
import java.util.Iterator;
import p238.AbstractC8818;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8898 implements InterfaceC8899, InterfaceC3222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC3235 f22597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final HashSet f22598 = new HashSet();

    public C8898(AbstractC3235 abstractC3235) {
        this.f22597 = abstractC3235;
        abstractC3235.mo5063(this);
    }

    @InterfaceC3202(Lifecycle$Event.ON_DESTROY)
    public void onDestroy(InterfaceC3221 interfaceC3221) {
        Iterator it = AbstractC8818.m14033(this.f22598).iterator();
        while (it.hasNext()) {
            ((InterfaceC8902) it.next()).mo7339();
        }
        interfaceC3221.getLifecycle().mo5062(this);
    }

    @InterfaceC3202(Lifecycle$Event.ON_START)
    public void onStart(InterfaceC3221 interfaceC3221) {
        Iterator it = AbstractC8818.m14033(this.f22598).iterator();
        while (it.hasNext()) {
            ((InterfaceC8902) it.next()).mo7335();
        }
    }

    @InterfaceC3202(Lifecycle$Event.ON_STOP)
    public void onStop(InterfaceC3221 interfaceC3221) {
        Iterator it = AbstractC8818.m14033(this.f22598).iterator();
        while (it.hasNext()) {
            ((InterfaceC8902) it.next()).mo7337();
        }
    }

    @Override // p248.InterfaceC8899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12836(InterfaceC8902 interfaceC8902) {
        this.f22598.add(interfaceC8902);
        Lifecycle$State lifecycle$State = ((C3219) this.f22597).f7364;
        if (lifecycle$State == Lifecycle$State.DESTROYED) {
            interfaceC8902.mo7339();
        } else if (lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            interfaceC8902.mo7335();
        } else {
            interfaceC8902.mo7337();
        }
    }

    @Override // p248.InterfaceC8899
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12838(InterfaceC8902 interfaceC8902) {
        this.f22598.remove(interfaceC8902);
    }
}
