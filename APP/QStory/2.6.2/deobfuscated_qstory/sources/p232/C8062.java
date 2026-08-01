package p232;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p222.AbstractC7988;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8062 implements InterfaceC8061 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8064 f22244;

    public C8062(C8064 c8064) {
        this.f22244 = c8064;
    }

    @Override // p232.InterfaceC8061
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6746(boolean z) {
        ArrayList arrayList;
        AbstractC7988.m13445();
        synchronized (this.f22244) {
            arrayList = new ArrayList((HashSet) this.f22244.f22246);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC8061) it.next()).mo6746(z);
        }
    }
}
