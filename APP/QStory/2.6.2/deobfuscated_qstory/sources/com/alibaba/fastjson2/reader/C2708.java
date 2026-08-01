package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2708 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f8235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8236;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2708 f8234 = new C2708();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f8233 = AbstractC2859.m5729("[B");

    public C2708(String str, Function function) {
        super(byte[].class);
        this.f8235 = "base64".equals(str) ? JSONReader$Feature.Base64StringAsByteArray.mask : 0L;
        this.f8236 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        byte[] bArrDecode = null;
        if (abstractC2898.mo6073()) {
            return null;
        }
        boolean zMo6095 = abstractC2898.mo6095();
        Function function = this.f8236;
        if (!zMo6095) {
            if (!abstractC2898.mo6133()) {
                C0276.m849(abstractC2898.mo6124("TODO"));
                return null;
            }
            if ((abstractC2898.m6110(j | this.f8235) & JSONReader$Feature.Base64StringAsByteArray.mask) != 0) {
                bArrDecode = abstractC2898.mo6077();
            } else {
                String strMo6139 = abstractC2898.mo6139();
                if (!strMo6139.isEmpty()) {
                    int iIndexOf = strMo6139.indexOf(";base64,");
                    if (iIndexOf == -1) {
                        C0276.m849(abstractC2898.mo6124("illegal input : ".concat(strMo6139)));
                        return null;
                    }
                    bArrDecode = Base64.getDecoder().decode(strMo6139.substring(iIndexOf + 8));
                }
            }
            return function != null ? function.apply(bArrDecode) : bArrDecode;
        }
        byte[] bArrCopyOf = new byte[16];
        int i = 0;
        while (!abstractC2898.mo6096()) {
            if (abstractC2898.mo6119()) {
                C0276.m849(abstractC2898.mo6124("input end"));
                return null;
            }
            int i2 = i + 1;
            if (i2 - bArrCopyOf.length > 0) {
                int length = bArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            }
            bArrCopyOf[i] = (byte) abstractC2898.mo6167();
            i = i2;
        }
        abstractC2898.mo6099();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
        return function != null ? function.apply(bArrCopyOf2) : bArrCopyOf2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        byte bByteValue;
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bByteValue = 0;
            } else if (obj instanceof Number) {
                bByteValue = ((Number) obj).byteValue();
            } else {
                Function functionM5586 = AbstractC2932.m6329().m5586(obj.getClass(), Byte.TYPE);
                if (functionM5586 == null) {
                    C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to byte ")));
                    return null;
                }
                bByteValue = ((Byte) functionM5586.apply(obj)).byteValue();
            }
            bArr[i] = bByteValue;
            i++;
        }
        Function function = this.f8236;
        return function != null ? function.apply(bArr) : bArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        byte[] bArrDecode;
        int iIndexOf;
        if (abstractC2898.mo6097((byte) -110)) {
            long jMo6194 = abstractC2898.mo6194();
            if (jMo6194 != f8233 && jMo6194 != C2711.f8241) {
                C0276.m840(abstractC2898.mo6055(), "not support autoType : ");
                return null;
            }
        }
        if (abstractC2898.mo6122()) {
            bArrDecode = abstractC2898.mo6067();
        } else if (abstractC2898.mo6133()) {
            String strMo6139 = abstractC2898.mo6139();
            if (strMo6139 != null && (iIndexOf = strMo6139.indexOf(";base64,")) != -1) {
                strMo6139 = strMo6139.substring(iIndexOf + 8);
            }
            bArrDecode = Base64.getDecoder().decode(strMo6139);
        } else {
            int iMo6187 = abstractC2898.mo6187();
            if (iMo6187 == -1) {
                return null;
            }
            byte[] bArr = new byte[iMo6187];
            for (int i = 0; i < iMo6187; i++) {
                bArr[i] = (byte) abstractC2898.mo6167();
            }
            bArrDecode = bArr;
        }
        Function function = this.f8236;
        return function != null ? function.apply(bArrDecode) : bArrDecode;
    }

    public C2708() {
        super(byte[].class);
        this.f8236 = null;
        this.f8235 = 0L;
    }
}
