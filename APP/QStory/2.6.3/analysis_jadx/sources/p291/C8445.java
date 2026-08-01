package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8445 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8445 f23377 = new C8445();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23376 = InterfaceC2912.m6355("[Byte");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23375 = AbstractC2860.m5774("[Byte");

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(f23375, f23376);
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Byte[] bArr = (Byte[]) obj;
        abstractC2897.mo6040(bArr.length);
        for (Byte b : bArr) {
            if (b == null) {
                abstractC2897.mo5967();
            } else {
                byte bByteValue = b.byteValue();
                if (z) {
                    abstractC2897.mo6023(bByteValue);
                } else {
                    abstractC2897.mo5964(bByteValue);
                }
            }
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Byte[] bArr = (Byte[]) obj;
        abstractC2897.mo5999();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            Byte b = bArr[i];
            if (b == null) {
                abstractC2897.mo5967();
            } else {
                byte bByteValue = b.byteValue();
                if (z) {
                    abstractC2897.mo6023(bByteValue);
                } else {
                    abstractC2897.mo5964(bByteValue);
                }
            }
        }
        abstractC2897.mo5995();
    }
}
