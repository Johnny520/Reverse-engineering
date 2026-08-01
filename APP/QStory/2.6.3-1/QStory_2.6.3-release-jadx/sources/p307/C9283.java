package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9283 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f23752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DecimalFormat f23753;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C9283 f23751 = new C9283((DecimalFormat) null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f23750 = InterfaceC3745.m6915("[D");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f23749 = AbstractC3693.m6334("[D");

    public C9283(DecimalFormat decimalFormat) {
        this.f23753 = decimalFormat;
        this.f23752 = null;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (abstractC3730.m6619(obj, type)) {
            abstractC3730.mo6603(f23749, f23750);
        }
        Function function = this.f23752;
        abstractC3730.mo6544((function == null || obj == null) ? (double[]) obj : (double[]) function.apply(obj));
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23752;
        double[] dArr = (function == null || obj == null) ? (double[]) obj : (double[]) function.apply(obj);
        DecimalFormat decimalFormat = this.f23753;
        if (decimalFormat == null) {
            abstractC3730.mo6544(dArr);
            return;
        }
        if (abstractC3730.f9516) {
            abstractC3730.mo6544(dArr);
            return;
        }
        if (dArr == null) {
            abstractC3730.mo6527();
            return;
        }
        abstractC3730.mo6559();
        for (int i = 0; i < dArr.length; i++) {
            if (i != 0) {
                abstractC3730.mo6542();
            }
            abstractC3730.mo6569(decimalFormat.format(dArr[i]));
        }
        abstractC3730.mo6555();
    }

    public C9283(Function function) {
        this.f23752 = function;
        this.f23753 = null;
    }
}
