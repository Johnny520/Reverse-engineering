package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.C0762;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6558;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0681 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0680 f1905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1906;

    public /* synthetic */ C0681(C0680 c0680, int i) {
        this.f1906 = i;
        this.f1905 = c0680;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1906;
        C0680 c0680 = this.f1905;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                C0762 c0762 = (C0762) c0680.f1898.invoke();
                if (iIntValue < 0 || iIntValue >= c0762.m1571()) {
                    StringBuilder sbM150 = AbstractC0053.m150(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM150.append(c0762.m1571());
                    sbM150.append(')');
                    AbstractC7741.m13097(sbM150.toString());
                }
                AbstractC5399.m10477(c0680.m3867(), null, null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(c0680, iIntValue, null), 3);
                return Boolean.TRUE;
            default:
                C0762 c07622 = (C0762) c0680.f1898.invoke();
                int iM1571 = c07622.m1571();
                int i2 = 0;
                while (true) {
                    if (i2 >= iM1571) {
                        i2 = -1;
                    } else if (!c07622.m1570(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
        }
    }
}
