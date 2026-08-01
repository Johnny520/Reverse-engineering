package p089;

import java.util.ArrayList;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5087;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: 飘花落叶言世苏兰子楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7185 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f19170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19171;

    public /* synthetic */ C7185(int i, ArrayList arrayList) {
        this.f19171 = i;
        this.f19170 = arrayList;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f19171;
        int i2 = 0;
        ArrayList arrayList = this.f19170;
        switch (i) {
            case 0:
                return ((InterfaceC5087) arrayList.get(0)).mo8899();
            default:
                if (arrayList.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                if (((CharSequence) AbstractC4344.m8820(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i2 = 1;
                }
                return arrayList.subList(i2, ((CharSequence) AbstractC4344.m8808(arrayList)).length() == 0 ? arrayList.size() - 1 : arrayList.size());
        }
    }
}
