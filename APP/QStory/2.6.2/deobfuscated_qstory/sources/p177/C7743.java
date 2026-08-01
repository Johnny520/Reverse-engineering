package p177;

import androidx.compose.foundation.C1060;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.C2125;
import kotlin.C5175;
import kotlin.text.AbstractC5143;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p176.AbstractC7740;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7743 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SnapshotStateList f21017 = new SnapshotStateList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13075(final C7743 c7743, final InterfaceC6553 interfaceC6553, final C1242 c1242, final InterfaceC6542 interfaceC6542, int i) {
        if ((i & 8) != 0) {
            c1242 = null;
        }
        c7743.f21017.add(new C1242(-1789283891, true, new InterfaceC6550() { // from class: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世哲兰苏
            @Override // p052.InterfaceC6550
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C7745 c7745 = (C7745) obj;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2350(c7745) ? 4 : 2;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2333(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) interfaceC6553.invoke(c1324, 0);
                    if (AbstractC5143.m10164(str)) {
                        AbstractC7740.m13067("Label must not be blank");
                    }
                    c7743.getClass();
                    AbstractC7746.f21028.invoke(C2125.f6275, str, Boolean.TRUE, c7745, c1242, interfaceC6542, c1324, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    c1324.m2329();
                }
                return C5175.f14739;
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13076(C7745 c7745, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-798501095);
        int i2 = (c1324.m2350(c7745) ? 4 : 2) | i | (c1324.m2350(this) ? 32 : 16);
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.f21017;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC6550) snapshotStateList.get(i3)).invoke(c7745, c1324, Integer.valueOf(i2 & 14));
            }
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C1060(i, 11, this, c7745);
        }
    }
}
