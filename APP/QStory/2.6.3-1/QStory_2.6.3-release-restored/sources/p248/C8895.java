package p248;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p238.AbstractC8818;
import p241.InterfaceC8828;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8895 implements InterfaceC8902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f22593 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335() {
        Iterator it = AbstractC8818.m14033(this.f22593).iterator();
        while (it.hasNext()) {
            ((InterfaceC8828) it.next()).mo7335();
        }
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7337() {
        Iterator it = AbstractC8818.m14033(this.f22593).iterator();
        while (it.hasNext()) {
            ((InterfaceC8828) it.next()).mo7337();
        }
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo7339() {
        Iterator it = AbstractC8818.m14033(this.f22593).iterator();
        while (it.hasNext()) {
            ((InterfaceC8828) it.next()).mo7339();
        }
    }
}
