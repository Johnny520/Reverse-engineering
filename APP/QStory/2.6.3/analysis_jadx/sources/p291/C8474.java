package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8474 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8474 f23509 = new C8474(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23508 = InterfaceC2912.m6355("[C");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23507 = AbstractC2860.m5774("[C");

    public C8474(Function function) {
        this.f23510 = function;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.m6058(obj, type, j)) {
            abstractC2897.mo6043(f23507, f23508);
        }
        Function function = this.f23510;
        char[] cArr = (function == null || obj == null) ? (char[]) obj : (char[]) function.apply(obj);
        abstractC2897.mo6021(cArr.length, cArr);
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23510;
        char[] cArr = (function == null || obj == null) ? (char[]) obj : (char[]) function.apply(obj);
        if (abstractC2897.f9177) {
            abstractC2897.mo6021(cArr.length, cArr);
        } else {
            abstractC2897.mo6017(new String(cArr));
        }
    }
}
