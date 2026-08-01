package p055;

import com.bumptech.glide.AbstractC3887;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC7249 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f17946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f17947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17948;

    public /* synthetic */ CallableC7249(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.f17948 = i;
        this.f17947 = arrayList;
        this.f17946 = arrayList2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17948;
        ArrayList arrayList = this.f17946;
        ArrayList arrayList2 = this.f17947;
        switch (i) {
            case 0:
                if (arrayList2.size() == 1 && arrayList.size() == 1) {
                    AbstractC7176.m12474(AbstractC3887.m7213(), (String) arrayList2.get(0), (String) arrayList.get(0));
                } else {
                    AbstractC7176.m12473(arrayList2, arrayList, AbstractC3887.m7213());
                }
                break;
            default:
                if (arrayList2.size() == 1 && arrayList.size() == 1) {
                    AbstractC7176.m12474(AbstractC3887.m7213(), (String) arrayList2.get(0), (String) arrayList.get(0));
                } else {
                    AbstractC7176.m12473(arrayList2, arrayList, AbstractC3887.m7213());
                }
                break;
        }
        return null;
    }
}
