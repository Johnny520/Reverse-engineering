package androidx.compose.ui.semantics;

import java.util.Comparator;
import kotlin.Pair;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1936 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5698;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1936 f5696 = new C1936(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1936 f5697 = new C1936(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1936 f5695 = new C1936(2);

    public /* synthetic */ C1936(int i) {
        this.f5698 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5698) {
            case 0:
                C7327 c7327M3655 = ((C1953) obj).m3655();
                C7327 c7327M36552 = ((C1953) obj2).m3655();
                int iCompare = Float.compare(c7327M3655.f19545, c7327M36552.f19545);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c7327M3655.f19544, c7327M36552.f19544);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c7327M3655.f19542, c7327M36552.f19542);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c7327M3655.f19543, c7327M36552.f19543);
            case 1:
                C7327 c7327M36553 = ((C1953) obj).m3655();
                C7327 c7327M36554 = ((C1953) obj2).m3655();
                int iCompare4 = Float.compare(c7327M36554.f19543, c7327M36553.f19543);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c7327M36553.f19544, c7327M36554.f19544);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c7327M36553.f19542, c7327M36554.f19542);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c7327M36554.f19545, c7327M36553.f19545);
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompare7 = Float.compare(((C7327) pair.getFirst()).f19544, ((C7327) pair2.getFirst()).f19544);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C7327) pair.getFirst()).f19542, ((C7327) pair2.getFirst()).f19542);
        }
    }
}
