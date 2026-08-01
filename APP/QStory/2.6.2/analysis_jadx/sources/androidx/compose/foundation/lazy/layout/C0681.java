package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.C0762;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6557;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0681 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0680 f1904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1905;

    public /* synthetic */ C0681(C0680 c0680, int i) {
        this.f1905 = i;
        this.f1904 = c0680;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1905;
        C0680 c0680 = this.f1904;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                C0762 c0762 = (C0762) c0680.f1897.invoke();
                if (iIntValue < 0 || iIntValue >= c0762.m1561()) {
                    StringBuilder sbM148 = AbstractC0053.m148(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM148.append(c0762.m1561());
                    sbM148.append(')');
                    AbstractC7740.m13069(sbM148.toString());
                }
                AbstractC5398.m10473(c0680.m3857(), null, null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(c0680, iIntValue, null), 3);
                return Boolean.TRUE;
            default:
                C0762 c07622 = (C0762) c0680.f1897.invoke();
                int iM1561 = c07622.m1561();
                int i2 = 0;
                while (true) {
                    if (i2 >= iM1561) {
                        i2 = -1;
                    } else if (!c07622.m1560(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
        }
    }
}
