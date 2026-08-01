package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1284 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Collection f3756;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3757;

    public /* synthetic */ C1284(Collection collection, int i) {
        this.f3757 = i;
        this.f3756 = collection;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        boolean zRetainAll;
        int i = this.f3757;
        Collection<?> collection = this.f3756;
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
