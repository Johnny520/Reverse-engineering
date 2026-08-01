package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.lazy.C1603;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7387;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1522 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1521 f2250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2251;

    public /* synthetic */ C1522(C1521 c1521, int i) {
        this.f2251 = i;
        this.f2250 = c1521;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2251;
        C1521 c1521 = this.f2250;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                C1603 c1603 = (C1603) c1521.f2243.invoke();
                if (iIntValue < 0 || iIntValue >= c1603.m2131()) {
                    StringBuilder sbM710 = AbstractC0900.m710(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM710.append(c1603.m2131());
                    sbM710.append(')');
                    AbstractC8570.m13656(sbM710.toString());
                }
                AbstractC6231.m11036(c1521.m4427(), null, null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(c1521, iIntValue, null), 3);
                return Boolean.TRUE;
            default:
                C1603 c16032 = (C1603) c1521.f2243.invoke();
                int iM2131 = c16032.m2131();
                int i2 = 0;
                while (true) {
                    if (i2 >= iM2131) {
                        i2 = -1;
                    } else if (!c16032.m2130(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
        }
    }
}
