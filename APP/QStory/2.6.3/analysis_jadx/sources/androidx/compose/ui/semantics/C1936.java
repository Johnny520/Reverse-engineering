package androidx.compose.ui.semantics;

import java.util.Comparator;
import kotlin.Pair;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1936 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5699;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1936 f5697 = new C1936(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1936 f5698 = new C1936(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1936 f5696 = new C1936(2);

    public /* synthetic */ C1936(int i) {
        this.f5699 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5699) {
            case 0:
                C7328 c7328M3665 = ((C1953) obj).m3665();
                C7328 c7328M36652 = ((C1953) obj2).m3665();
                int iCompare = Float.compare(c7328M3665.f19540, c7328M36652.f19540);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c7328M3665.f19539, c7328M36652.f19539);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c7328M3665.f19537, c7328M36652.f19537);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c7328M3665.f19538, c7328M36652.f19538);
            case 1:
                C7328 c7328M36653 = ((C1953) obj).m3665();
                C7328 c7328M36654 = ((C1953) obj2).m3665();
                int iCompare4 = Float.compare(c7328M36654.f19538, c7328M36653.f19538);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c7328M36653.f19539, c7328M36654.f19539);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c7328M36653.f19537, c7328M36654.f19537);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c7328M36654.f19540, c7328M36653.f19540);
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompare7 = Float.compare(((C7328) pair.getFirst()).f19539, ((C7328) pair2.getFirst()).f19539);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C7328) pair.getFirst()).f19537, ((C7328) pair2.getFirst()).f19537);
        }
    }
}
