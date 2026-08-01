package p039;

import java.util.List;
import java.util.concurrent.Callable;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6390 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ List f17555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5856 f17556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17557;

    public /* synthetic */ CallableC6390(C5856 c5856, List list, int i) {
        this.f17557 = i;
        this.f17556 = c5856;
        this.f17555 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17557;
        List list = this.f17555;
        C5856 c5856 = this.f17556;
        switch (i) {
            case 0:
                if (list.size() == 1) {
                    ViewOnClickListenerC6386.m11963((ViewOnClickListenerC6386) c5856.f16014, (String) list.get(0));
                }
                break;
            default:
                if (list.size() == 1) {
                    ViewOnClickListenerC6386.m11963((ViewOnClickListenerC6386) c5856.f16014, (String) list.get(0));
                }
                break;
        }
        return null;
    }
}
