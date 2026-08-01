package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8456 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8456 f23415 = new C8456();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23414 = InterfaceC2912.m6355("[Integer");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23413 = AbstractC2860.m5774("[Integer");

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(f23413, f23414);
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Integer[] numArr = (Integer[]) obj;
        abstractC2897.mo6040(numArr.length);
        for (Integer num : numArr) {
            if (num == null) {
                abstractC2897.mo5967();
            } else {
                int iIntValue = num.intValue();
                if (z) {
                    abstractC2897.mo6024(iIntValue);
                } else {
                    abstractC2897.mo5973(iIntValue);
                }
            }
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            if (!abstractC2897.m6074(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) {
                abstractC2897.mo5967();
                return;
            } else {
                abstractC2897.mo5999();
                abstractC2897.mo5995();
                return;
            }
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Integer[] numArr = (Integer[]) obj;
        abstractC2897.mo5999();
        for (int i = 0; i < numArr.length; i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            Integer num = numArr[i];
            if (num == null) {
                abstractC2897.mo5967();
            } else {
                int iIntValue = num.intValue();
                if (z) {
                    abstractC2897.mo6024(iIntValue);
                } else {
                    abstractC2897.mo5973(iIntValue);
                }
            }
        }
        abstractC2897.mo5995();
    }
}
