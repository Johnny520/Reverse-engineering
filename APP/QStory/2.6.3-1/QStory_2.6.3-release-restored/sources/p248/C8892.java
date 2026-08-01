package p248;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p238.AbstractC8818;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8892 implements InterfaceC8891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8894 f22587;

    public C8892(C8894 c8894) {
        this.f22587 = c8894;
    }

    @Override // p248.InterfaceC8891
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7351(boolean z) {
        ArrayList arrayList;
        AbstractC8818.m14032();
        synchronized (this.f22587) {
            arrayList = new ArrayList((HashSet) this.f22587.f22589);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC8891) it.next()).mo7351(z);
        }
    }
}
