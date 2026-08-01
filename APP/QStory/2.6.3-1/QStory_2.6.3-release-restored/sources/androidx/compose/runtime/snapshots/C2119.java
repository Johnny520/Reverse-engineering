package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2119 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Collection f4102;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4103;

    public /* synthetic */ C2119(Collection collection, int i) {
        this.f4103 = i;
        this.f4102 = collection;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        boolean zRetainAll;
        int i = this.f4103;
        Collection<?> collection = this.f4102;
        switch (i) {
            case 0:
                zRetainAll = ((List) obj).retainAll(collection);
                break;
            case 1:
                zRetainAll = collection.contains(obj);
                break;
            default:
                zRetainAll = collection.contains(obj);
                break;
        }
        return Boolean.valueOf(zRetainAll);
    }
}
