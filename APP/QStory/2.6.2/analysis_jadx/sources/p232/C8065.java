package p232;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p222.AbstractC7988;
import p225.InterfaceC7998;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8065 implements InterfaceC8072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f22250 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6730() {
        Iterator it = AbstractC7988.m13446(this.f22250).iterator();
        while (it.hasNext()) {
            ((InterfaceC7998) it.next()).mo6730();
        }
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6732() {
        Iterator it = AbstractC7988.m13446(this.f22250).iterator();
        while (it.hasNext()) {
            ((InterfaceC7998) it.next()).mo6732();
        }
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo6734() {
        Iterator it = AbstractC7988.m13446(this.f22250).iterator();
        while (it.hasNext()) {
            ((InterfaceC7998) it.next()).mo6734();
        }
    }
}
