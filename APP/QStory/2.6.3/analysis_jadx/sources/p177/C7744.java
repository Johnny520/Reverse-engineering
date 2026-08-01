package p177;

import androidx.compose.foundation.C1060;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.C2125;
import kotlin.C5176;
import kotlin.text.AbstractC5144;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p176.AbstractC7741;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7744 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SnapshotStateList f21014 = new SnapshotStateList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13103(final C7744 c7744, final InterfaceC6554 interfaceC6554, final C1242 c1242, final InterfaceC6543 interfaceC6543, int i) {
        if ((i & 8) != 0) {
            c1242 = null;
        }
        c7744.f21014.add(new C1242(-1789283891, true, new InterfaceC6551() { // from class: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世哲兰苏
            @Override // p052.InterfaceC6551
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C7746 c7746 = (C7746) obj;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2360(c7746) ? 4 : 2;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2343(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) interfaceC6554.invoke(c1324, 0);
                    if (AbstractC5144.m10172(str)) {
                        AbstractC7741.m13095("Label must not be blank");
                    }
                    c7744.getClass();
                    AbstractC7747.f21025.invoke(C2125.f6276, str, Boolean.TRUE, c7746, c1242, interfaceC6543, c1324, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    c1324.m2339();
                }
                return C5176.f14739;
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13104(C7746 c7746, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-798501095);
        int i2 = (c1324.m2360(c7746) ? 4 : 2) | i | (c1324.m2360(this) ? 32 : 16);
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.f21014;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC6551) snapshotStateList.get(i3)).invoke(c7746, c1324, Integer.valueOf(i2 & 14));
            }
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C1060(i, 11, this, c7746);
        }
    }
}
