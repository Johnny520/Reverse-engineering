package androidx.compose.p001ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2624 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2624 f5572 = new C2624(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5573;

    public /* synthetic */ C2624(int i) {
        this.f5573 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5573) {
            case 0:
                C2583 c2583 = (C2583) obj;
                C2583 c25832 = (C2583) obj2;
                int iM9464 = AbstractC5227.m9464(c25832.f5460, c2583.f5460);
                return iM9464 != 0 ? iM9464 : AbstractC5227.m9464(c2583.hashCode(), c25832.hashCode());
            default:
                C2583 c25833 = (C2583) obj;
                C2583 c25834 = (C2583) obj2;
                int iM94642 = AbstractC5227.m9464(c25833.f5460, c25834.f5460);
                return iM94642 != 0 ? iM94642 : AbstractC5227.m9464(c25833.hashCode(), c25834.hashCode());
        }
    }
}
