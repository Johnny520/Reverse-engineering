package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9274 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9274 f23722 = new C9274();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23721 = InterfaceC3745.m6915("[Byte");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23720 = AbstractC3693.m6334("[Byte");

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        if (abstractC3730.m6619(obj, type)) {
            abstractC3730.mo6603(f23720, f23721);
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Byte[] bArr = (Byte[]) obj;
        abstractC3730.mo6600(bArr.length);
        for (Byte b : bArr) {
            if (b == null) {
                abstractC3730.mo6527();
            } else {
                byte bByteValue = b.byteValue();
                if (z) {
                    abstractC3730.mo6583(bByteValue);
                } else {
                    abstractC3730.mo6524(bByteValue);
                }
            }
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        boolean z = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Byte[] bArr = (Byte[]) obj;
        abstractC3730.mo6559();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                abstractC3730.mo6542();
            }
            Byte b = bArr[i];
            if (b == null) {
                abstractC3730.mo6527();
            } else {
                byte bByteValue = b.byteValue();
                if (z) {
                    abstractC3730.mo6583(bByteValue);
                } else {
                    abstractC3730.mo6524(bByteValue);
                }
            }
        }
        abstractC3730.mo6555();
    }
}
