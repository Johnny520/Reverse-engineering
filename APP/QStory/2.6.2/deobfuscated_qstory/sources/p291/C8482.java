package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8482 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8482 f23518 = new C8482(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23517 = InterfaceC2911.m6297("[C");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23516 = AbstractC2859.m5729("[C");

    public C8482(Function function) {
        this.f23519 = function;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.m6043(obj, type, j)) {
            abstractC2896.mo5998(f23516, f23517);
        }
        Function function = this.f23519;
        char[] cArr = (function == null || obj == null) ? (char[]) obj : (char[]) function.apply(obj);
        abstractC2896.mo5976(cArr.length, cArr);
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23519;
        char[] cArr = (function == null || obj == null) ? (char[]) obj : (char[]) function.apply(obj);
        if (abstractC2896.f9175) {
            abstractC2896.mo5976(cArr.length, cArr);
        } else {
            abstractC2896.mo5972(new String(cArr));
        }
    }
}
