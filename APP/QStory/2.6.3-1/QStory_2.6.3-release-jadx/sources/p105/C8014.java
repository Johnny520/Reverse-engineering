package p105;

import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5919;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: 飘花落叶言世苏兰子楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8014 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f19515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19516;

    public /* synthetic */ C8014(int i, ArrayList arrayList) {
        this.f19516 = i;
        this.f19515 = arrayList;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f19516;
        int i2 = 0;
        ArrayList arrayList = this.f19515;
        switch (i) {
            case 0:
                return ((InterfaceC5919) arrayList.get(0)).mo9458();
            default:
                if (arrayList.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                if (((CharSequence) AbstractC5176.m9379(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i2 = 1;
                }
                return arrayList.subList(i2, ((CharSequence) AbstractC5176.m9367(arrayList)).length() == 0 ? arrayList.size() - 1 : arrayList.size());
        }
    }
}
