package p039;

import java.util.List;
import java.util.concurrent.Callable;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6433 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ List f17621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17622;

    public /* synthetic */ CallableC6433(C5856 c5856, List list, int i) {
        this.f17622 = i;
        this.f17621 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17622;
        List list = this.f17621;
        switch (i) {
            case 0:
                if (list.size() == 1) {
                    C6430.m11977((String) list.get(0));
                }
                break;
            default:
                if (list.size() == 1) {
                    C6430.m11977((String) list.get(0));
                }
                break;
        }
        return null;
    }
}
