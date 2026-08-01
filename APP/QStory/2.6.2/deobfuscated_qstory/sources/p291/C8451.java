package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8451 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8451 f23379 = new C8451();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23378 = InterfaceC2911.m6297("[Long");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23377 = AbstractC2859.m5729("[Long");

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(f23377, f23378);
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Long[] lArr = (Long[]) obj;
        abstractC2896.mo5995(lArr.length);
        for (Long l : lArr) {
            if (l == null) {
                abstractC2896.mo5922();
            } else {
                long jLongValue = l.longValue();
                if (z) {
                    abstractC2896.mo5977(jLongValue);
                } else {
                    abstractC2896.mo5918(jLongValue);
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
        Long[] lArr = (Long[]) obj;
        abstractC2896.mo5954();
        for (int i = 0; i < lArr.length; i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            Long l = lArr[i];
            if (l == null) {
                abstractC2896.mo5922();
            } else {
                long jLongValue = l.longValue();
                if (z) {
                    abstractC2896.mo5977(jLongValue);
                } else {
                    abstractC2896.mo5918(jLongValue);
                }
            }
        }
        abstractC2896.mo5950();
    }
}
