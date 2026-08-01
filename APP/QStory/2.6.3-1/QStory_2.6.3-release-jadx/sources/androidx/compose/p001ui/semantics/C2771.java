package androidx.compose.p001ui.semantics;

import java.util.Comparator;
import kotlin.Pair;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2771 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6044;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2771 f6042 = new C2771(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2771 f6043 = new C2771(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2771 f6041 = new C2771(2);

    public /* synthetic */ C2771(int i) {
        this.f6044 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6044) {
            case 0:
                C8157 c8157M4225 = ((C2788) obj).m4225();
                C8157 c8157M42252 = ((C2788) obj2).m4225();
                int iCompare = Float.compare(c8157M4225.f19885, c8157M42252.f19885);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c8157M4225.f19884, c8157M42252.f19884);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c8157M4225.f19882, c8157M42252.f19882);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c8157M4225.f19883, c8157M42252.f19883);
            case 1:
                C8157 c8157M42253 = ((C2788) obj).m4225();
                C8157 c8157M42254 = ((C2788) obj2).m4225();
                int iCompare4 = Float.compare(c8157M42254.f19883, c8157M42253.f19883);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c8157M42253.f19884, c8157M42254.f19884);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c8157M42253.f19882, c8157M42254.f19882);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c8157M42254.f19885, c8157M42253.f19885);
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompare7 = Float.compare(((C8157) pair.getFirst()).f19884, ((C8157) pair2.getFirst()).f19884);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C8157) pair.getFirst()).f19882, ((C8157) pair2.getFirst()).f19882);
        }
    }
}
