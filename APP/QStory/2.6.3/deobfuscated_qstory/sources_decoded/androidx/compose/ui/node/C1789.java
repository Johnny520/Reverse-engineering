package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1789 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1789 f5227 = new C1789(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5228;

    public /* synthetic */ C1789(int i) {
        this.f5228 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5228) {
            case 0:
                C1748 c1748 = (C1748) obj;
                C1748 c17482 = (C1748) obj2;
                int iM8905 = AbstractC4395.m8905(c17482.f5115, c1748.f5115);
                return iM8905 != 0 ? iM8905 : AbstractC4395.m8905(c1748.hashCode(), c17482.hashCode());
            default:
                C1748 c17483 = (C1748) obj;
                C1748 c17484 = (C1748) obj2;
                int iM89052 = AbstractC4395.m8905(c17483.f5115, c17484.f5115);
                return iM89052 != 0 ? iM89052 : AbstractC4395.m8905(c17483.hashCode(), c17484.hashCode());
        }
    }
}
