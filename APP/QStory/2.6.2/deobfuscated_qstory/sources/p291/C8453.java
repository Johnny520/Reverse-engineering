package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8453 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8453 f23386 = new C8453();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23385 = InterfaceC2911.m6297("[Byte");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23384 = AbstractC2859.m5729("[Byte");

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(f23384, f23385);
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Byte[] bArr = (Byte[]) obj;
        abstractC2896.mo5995(bArr.length);
        for (Byte b : bArr) {
            if (b == null) {
                abstractC2896.mo5922();
            } else {
                byte bByteValue = b.byteValue();
                if (z) {
                    abstractC2896.mo5978(bByteValue);
                } else {
                    abstractC2896.mo5919(bByteValue);
                }
            }
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Byte[] bArr = (Byte[]) obj;
        abstractC2896.mo5954();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            Byte b = bArr[i];
            if (b == null) {
                abstractC2896.mo5922();
            } else {
                byte bByteValue = b.byteValue();
                if (z) {
                    abstractC2896.mo5978(bByteValue);
                } else {
                    abstractC2896.mo5919(bByteValue);
                }
            }
        }
        abstractC2896.mo5950();
    }
}
