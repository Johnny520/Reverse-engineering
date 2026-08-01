package p038;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import p033.AbstractC6333;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6385 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f17528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f17529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17530;

    public /* synthetic */ CallableC6385(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.f17530 = i;
        this.f17529 = arrayList;
        this.f17528 = arrayList2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17530;
        ArrayList arrayList = this.f17528;
        ArrayList arrayList2 = this.f17529;
        switch (i) {
            case 0:
                if (arrayList2.size() == 1 && arrayList.size() == 1) {
                    AbstractC6333.m11888(AbstractC7738.m13031(), (String) arrayList2.get(0), (String) arrayList.get(0));
                } else {
                    AbstractC6333.m11889(arrayList2, arrayList, AbstractC7738.m13031());
                }
                break;
            default:
                if (arrayList2.size() == 1 && arrayList.size() == 1) {
                    AbstractC6333.m11888(AbstractC7738.m13031(), (String) arrayList2.get(0), (String) arrayList.get(0));
                } else {
                    AbstractC6333.m11889(arrayList2, arrayList, AbstractC7738.m13031());
                }
                break;
        }
        return null;
    }
}
