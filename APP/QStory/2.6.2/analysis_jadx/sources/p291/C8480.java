package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.util.Currency;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8480 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8480 f23514 = new C8480();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8480 f23513 = new C8480();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23512 = InterfaceC2911.m6297(AbstractC2866.m5898(Currency.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23511 = AbstractC2859.m5729(AbstractC2866.m5898(Currency.class));

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Currency currency = (Currency) obj;
        if (abstractC2896.m6015(currency)) {
            abstractC2896.mo5998(f23511, f23512);
        }
        abstractC2896.mo5972(currency.getCurrencyCode());
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.f9169) {
            mo5633(abstractC2896, obj, obj2, type, j);
        } else if (obj == null) {
            abstractC2896.mo5922();
        } else {
            abstractC2896.mo5972(((Currency) obj).getCurrencyCode());
        }
    }
}
