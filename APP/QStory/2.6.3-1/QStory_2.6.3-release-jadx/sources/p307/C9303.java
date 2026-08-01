package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9303 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9303 f23854 = new C9303(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23853 = InterfaceC3745.m6915("[C");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23852 = AbstractC3693.m6334("[C");

    public C9303(Function function) {
        this.f23855 = function;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (abstractC3730.m6618(obj, type, j)) {
            abstractC3730.mo6603(f23852, f23853);
        }
        Function function = this.f23855;
        char[] cArr = (function == null || obj == null) ? (char[]) obj : (char[]) function.apply(obj);
        abstractC3730.mo6581(cArr.length, cArr);
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23855;
        char[] cArr = (function == null || obj == null) ? (char[]) obj : (char[]) function.apply(obj);
        if (abstractC3730.f9522) {
            abstractC3730.mo6581(cArr.length, cArr);
        } else {
            abstractC3730.mo6577(new String(cArr));
        }
    }
}
