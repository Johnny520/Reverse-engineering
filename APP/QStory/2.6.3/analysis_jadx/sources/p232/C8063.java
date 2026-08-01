package p232;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p222.AbstractC7989;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8063 implements InterfaceC8062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8065 f22242;

    public C8063(C8065 c8065) {
        this.f22242 = c8065;
    }

    @Override // p232.InterfaceC8062
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6791(boolean z) {
        ArrayList arrayList;
        AbstractC7989.m13473();
        synchronized (this.f22242) {
            arrayList = new ArrayList((HashSet) this.f22242.f22244);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC8062) it.next()).mo6791(z);
        }
    }
}
