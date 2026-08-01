package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8464 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8464 f23424 = new C8464();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23423 = InterfaceC2911.m6297("[Integer");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23422 = AbstractC2859.m5729("[Integer");

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(f23422, f23423);
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Integer[] numArr = (Integer[]) obj;
        abstractC2896.mo5995(numArr.length);
        for (Integer num : numArr) {
            if (num == null) {
                abstractC2896.mo5922();
            } else {
                int iIntValue = num.intValue();
                if (z) {
                    abstractC2896.mo5979(iIntValue);
                } else {
                    abstractC2896.mo5928(iIntValue);
                }
            }
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            if (!abstractC2896.m6029(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) {
                abstractC2896.mo5922();
                return;
            } else {
                abstractC2896.mo5954();
                abstractC2896.mo5950();
                return;
            }
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Integer[] numArr = (Integer[]) obj;
        abstractC2896.mo5954();
        for (int i = 0; i < numArr.length; i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            Integer num = numArr[i];
            if (num == null) {
                abstractC2896.mo5922();
            } else {
                int iIntValue = num.intValue();
                if (z) {
                    abstractC2896.mo5979(iIntValue);
                } else {
                    abstractC2896.mo5928(iIntValue);
                }
            }
        }
        abstractC2896.mo5950();
    }
}
