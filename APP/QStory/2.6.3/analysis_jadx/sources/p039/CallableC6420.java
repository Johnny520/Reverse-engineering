package p039;

import com.bumptech.glide.AbstractC3055;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6420 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f17601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f17602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17603;

    public /* synthetic */ CallableC6420(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.f17603 = i;
        this.f17602 = arrayList;
        this.f17601 = arrayList2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17603;
        ArrayList arrayList = this.f17601;
        ArrayList arrayList2 = this.f17602;
        switch (i) {
            case 0:
                if (arrayList2.size() == 1 && arrayList.size() == 1) {
                    AbstractC6347.m11915(AbstractC3055.m6653(), (String) arrayList2.get(0), (String) arrayList.get(0));
                } else {
                    AbstractC6347.m11914(arrayList2, arrayList, AbstractC3055.m6653());
                }
                break;
            default:
                if (arrayList2.size() == 1 && arrayList.size() == 1) {
                    AbstractC6347.m11915(AbstractC3055.m6653(), (String) arrayList2.get(0), (String) arrayList.get(0));
                } else {
                    AbstractC6347.m11914(arrayList2, arrayList, AbstractC3055.m6653());
                }
                break;
        }
        return null;
    }
}
