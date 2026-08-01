package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1284 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Collection f3757;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3758;

    public /* synthetic */ C1284(Collection collection, int i) {
        this.f3758 = i;
        this.f3757 = collection;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        boolean zRetainAll;
        int i = this.f3758;
        Collection<?> collection = this.f3757;
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
