package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2709 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f8237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8238;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2709 f8236 = new C2709();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f8235 = AbstractC2860.m5774("[B");

    public C2709(String str, Function function) {
        super(byte[].class);
        this.f8237 = "base64".equals(str) ? JSONReader$Feature.Base64StringAsByteArray.mask : 0L;
        this.f8238 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        byte[] bArrDecode = null;
        if (abstractC2899.mo6119()) {
            return null;
        }
        boolean zMo6141 = abstractC2899.mo6141();
        Function function = this.f8238;
        if (!zMo6141) {
            if (!abstractC2899.mo6179()) {
                C0276.m850(abstractC2899.mo6170("TODO"));
                return null;
            }
            if ((abstractC2899.m6157(j | this.f8237) & JSONReader$Feature.Base64StringAsByteArray.mask) != 0) {
                bArrDecode = abstractC2899.mo6123();
            } else {
                String strMo6184 = abstractC2899.mo6184();
                if (!strMo6184.isEmpty()) {
                    int iIndexOf = strMo6184.indexOf(";base64,");
                    if (iIndexOf == -1) {
                        C0276.m850(abstractC2899.mo6170("illegal input : ".concat(strMo6184)));
                        return null;
                    }
                    bArrDecode = Base64.getDecoder().decode(strMo6184.substring(iIndexOf + 8));
                }
            }
            return function != null ? function.apply(bArrDecode) : bArrDecode;
        }
        byte[] bArrCopyOf = new byte[16];
        int i = 0;
        while (!abstractC2899.mo6142()) {
            if (abstractC2899.mo6165()) {
                C0276.m850(abstractC2899.mo6170("input end"));
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
            bArrCopyOf[i] = (byte) abstractC2899.mo6212();
            i = i2;
        }
        abstractC2899.mo6145();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
        return function != null ? function.apply(bArrCopyOf2) : bArrCopyOf2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        byte bByteValue;
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bByteValue = 0;
            } else if (obj instanceof Number) {
                bByteValue = ((Number) obj).byteValue();
            } else {
                Function functionM5631 = AbstractC2933.m6387().m5631(obj.getClass(), Byte.TYPE);
                if (functionM5631 == null) {
                    C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to byte ")));
                    return null;
                }
                bByteValue = ((Byte) functionM5631.apply(obj)).byteValue();
            }
            bArr[i] = bByteValue;
            i++;
        }
        Function function = this.f8238;
        return function != null ? function.apply(bArr) : bArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        byte[] bArrDecode;
        int iIndexOf;
        if (abstractC2899.mo6143((byte) -110)) {
            long jMo6239 = abstractC2899.mo6239();
            if (jMo6239 != f8235 && jMo6239 != C2712.f8243) {
                C0276.m841(abstractC2899.mo6100(), "not support autoType : ");
                return null;
            }
        }
        if (abstractC2899.mo6168()) {
            bArrDecode = abstractC2899.mo6113();
        } else if (abstractC2899.mo6179()) {
            String strMo6184 = abstractC2899.mo6184();
            if (strMo6184 != null && (iIndexOf = strMo6184.indexOf(";base64,")) != -1) {
                strMo6184 = strMo6184.substring(iIndexOf + 8);
            }
            bArrDecode = Base64.getDecoder().decode(strMo6184);
        } else {
            int iMo6232 = abstractC2899.mo6232();
            if (iMo6232 == -1) {
                return null;
            }
            byte[] bArr = new byte[iMo6232];
            for (int i = 0; i < iMo6232; i++) {
                bArr[i] = (byte) abstractC2899.mo6212();
            }
            bArrDecode = bArr;
        }
        Function function = this.f8238;
        return function != null ? function.apply(bArrDecode) : bArrDecode;
    }

    public C2709() {
        super(byte[].class);
        this.f8238 = null;
        this.f8237 = 0L;
    }
}
