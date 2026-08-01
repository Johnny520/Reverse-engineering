package p232;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p222.AbstractC7989;
import p225.InterfaceC7999;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8066 implements InterfaceC8073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f22248 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6775() {
        Iterator it = AbstractC7989.m13474(this.f22248).iterator();
        while (it.hasNext()) {
            ((InterfaceC7999) it.next()).mo6775();
        }
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6777() {
        Iterator it = AbstractC7989.m13474(this.f22248).iterator();
        while (it.hasNext()) {
            ((InterfaceC7999) it.next()).mo6777();
        }
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo6779() {
        Iterator it = AbstractC7989.m13474(this.f22248).iterator();
        while (it.hasNext()) {
            ((InterfaceC7999) it.next()).mo6779();
        }
    }
}
