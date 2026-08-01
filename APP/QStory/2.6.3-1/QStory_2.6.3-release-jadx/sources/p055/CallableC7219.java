package p055;

import java.util.List;
import java.util.concurrent.Callable;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC7219 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ List f17900;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6686 f17901;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17902;

    public /* synthetic */ CallableC7219(C6686 c6686, List list, int i) {
        this.f17902 = i;
        this.f17901 = c6686;
        this.f17900 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17902;
        List list = this.f17900;
        C6686 c6686 = this.f17901;
        switch (i) {
            case 0:
                if (list.size() == 1) {
                    ViewOnClickListenerC7215.m12522((ViewOnClickListenerC7215) c6686.f16359, (String) list.get(0));
                }
                break;
            default:
                if (list.size() == 1) {
                    ViewOnClickListenerC7215.m12522((ViewOnClickListenerC7215) c6686.f16359, (String) list.get(0));
                }
                break;
        }
        return null;
    }
}
