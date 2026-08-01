package p089;

import java.util.ArrayList;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5086;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言世苏兰子楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7184 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f19175;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19176;

    public /* synthetic */ C7184(int i, ArrayList arrayList) {
        this.f19176 = i;
        this.f19175 = arrayList;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f19176;
        int i2 = 0;
        ArrayList arrayList = this.f19175;
        switch (i) {
            case 0:
                return ((InterfaceC5086) arrayList.get(0)).mo8909();
            default:
                if (arrayList.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                if (((CharSequence) AbstractC4343.m8827(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i2 = 1;
                }
                return arrayList.subList(i2, ((CharSequence) AbstractC4343.m8811(arrayList)).length() == 0 ? arrayList.size() - 1 : arrayList.size());
        }
    }
}
