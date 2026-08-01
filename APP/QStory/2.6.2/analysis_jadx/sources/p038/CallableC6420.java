package p038;

import java.util.List;
import java.util.concurrent.Callable;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6420 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ List f17582;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5851 f17583;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17584;

    public /* synthetic */ CallableC6420(C5851 c5851, List list, int i) {
        this.f17584 = i;
        this.f17583 = c5851;
        this.f17582 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17584;
        List list = this.f17582;
        C5851 c5851 = this.f17583;
        switch (i) {
            case 0:
                if (list.size() == 1) {
                    ViewOnClickListenerC6421.m11930((ViewOnClickListenerC6421) c5851.f16007, (String) list.get(0));
                }
                break;
            default:
                if (list.size() == 1) {
                    ViewOnClickListenerC6421.m11930((ViewOnClickListenerC6421) c5851.f16007, (String) list.get(0));
                }
                break;
        }
        return null;
    }
}
