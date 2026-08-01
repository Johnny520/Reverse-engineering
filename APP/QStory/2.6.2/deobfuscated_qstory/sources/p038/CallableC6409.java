package p038;

import java.util.List;
import java.util.concurrent.Callable;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6409 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ List f17567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17568;

    public /* synthetic */ CallableC6409(C5851 c5851, List list, int i) {
        this.f17568 = i;
        this.f17567 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17568;
        List list = this.f17567;
        switch (i) {
            case 0:
                if (list.size() == 1) {
                    C6410.m11926((String) list.get(0));
                }
                break;
            default:
                if (list.size() == 1) {
                    C6410.m11926((String) list.get(0));
                }
                break;
        }
        return null;
    }
}
