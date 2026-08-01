package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1789 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1789 f5226 = new C1789(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5227;

    public /* synthetic */ C1789(int i) {
        this.f5227 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5227) {
            case 0:
                C1748 c1748 = (C1748) obj;
                C1748 c17482 = (C1748) obj2;
                int iM8915 = AbstractC4394.m8915(c17482.f5114, c1748.f5114);
                return iM8915 != 0 ? iM8915 : AbstractC4394.m8915(c1748.hashCode(), c17482.hashCode());
            default:
                C1748 c17483 = (C1748) obj;
                C1748 c17484 = (C1748) obj2;
                int iM89152 = AbstractC4394.m8915(c17483.f5114, c17484.f5114);
                return iM89152 != 0 ? iM89152 : AbstractC4394.m8915(c17483.hashCode(), c17484.hashCode());
        }
    }
}
