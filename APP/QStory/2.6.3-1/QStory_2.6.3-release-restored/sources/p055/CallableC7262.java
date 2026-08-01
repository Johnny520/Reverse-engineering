package p055;

import java.util.List;
import java.util.concurrent.Callable;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC7262 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ List f17966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17967;

    public /* synthetic */ CallableC7262(C6686 c6686, List list, int i) {
        this.f17967 = i;
        this.f17966 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17967;
        List list = this.f17966;
        switch (i) {
            case 0:
                if (list.size() == 1) {
                    C7259.m12536((String) list.get(0));
                }
                break;
            default:
                if (list.size() == 1) {
                    C7259.m12536((String) list.get(0));
                }
                break;
        }
        return null;
    }
}
