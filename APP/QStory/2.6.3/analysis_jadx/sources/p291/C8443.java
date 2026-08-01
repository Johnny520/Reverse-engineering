package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8443 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8443 f23370 = new C8443();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23369 = InterfaceC2912.m6355("[Long");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23368 = AbstractC2860.m5774("[Long");

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(f23368, f23369);
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Long[] lArr = (Long[]) obj;
        abstractC2897.mo6040(lArr.length);
        for (Long l : lArr) {
            if (l == null) {
                abstractC2897.mo5967();
            } else {
                long jLongValue = l.longValue();
                if (z) {
                    abstractC2897.mo6022(jLongValue);
                } else {
                    abstractC2897.mo5963(jLongValue);
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
        Long[] lArr = (Long[]) obj;
        abstractC2897.mo5999();
        for (int i = 0; i < lArr.length; i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            Long l = lArr[i];
            if (l == null) {
                abstractC2897.mo5967();
            } else {
                long jLongValue = l.longValue();
                if (z) {
                    abstractC2897.mo6022(jLongValue);
                } else {
                    abstractC2897.mo5963(jLongValue);
                }
            }
        }
        abstractC2897.mo5995();
    }
}
