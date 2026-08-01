package p193;

import androidx.compose.foundation.C1898;
import androidx.compose.p001ui.C2958;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.C6008;
import kotlin.text.AbstractC5976;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p192.AbstractC8570;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8573 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SnapshotStateList f21359 = new SnapshotStateList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13662(final C8573 c8573, final InterfaceC7383 interfaceC7383, final C2077 c2077, final InterfaceC7372 interfaceC7372, int i) {
        if ((i & 8) != 0) {
            c2077 = null;
        }
        c8573.f21359.add(new C2077(-1789283891, true, new InterfaceC7380() { // from class: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世哲兰苏
            @Override // p068.InterfaceC7380
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C8575 c8575 = (C8575) obj;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C2159) interfaceC2208).m2920(c8575) ? 4 : 2;
                }
                C2159 c2159 = (C2159) interfaceC2208;
                if (c2159.m2903(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) interfaceC7383.invoke(c2159, 0);
                    if (AbstractC5976.m10731(str)) {
                        AbstractC8570.m13654("Label must not be blank");
                    }
                    c8573.getClass();
                    AbstractC8576.f21370.invoke(C2958.f6621, str, Boolean.TRUE, c8575, c2077, interfaceC7372, c2159, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    c2159.m2899();
                }
                return C6008.f15084;
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13663(C8575 c8575, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-798501095);
        int i2 = (c2159.m2920(c8575) ? 4 : 2) | i | (c2159.m2920(this) ? 32 : 16);
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.f21359;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC7380) snapshotStateList.get(i3)).invoke(c8575, c2159, Integer.valueOf(i2 & 14));
            }
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1898(i, 11, this, c8575);
        }
    }
}
