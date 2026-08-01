package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2712 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f8245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2712 f8244 = new C2712(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8243 = AbstractC2860.m5774("[Byte");

    public C2712(String str) {
        super(Byte[].class);
        this.f8245 = str;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!abstractC2899.mo6119()) {
            int i = 0;
            if (abstractC2899.mo6141()) {
                Byte[] bArr = new Byte[16];
                while (!abstractC2899.mo6142()) {
                    if (abstractC2899.mo6165()) {
                        C0276.m850(abstractC2899.mo6170("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - bArr.length > 0) {
                        int length = bArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        bArr = (Byte[]) Arrays.copyOf(bArr, i3);
                    }
                    Integer numMo6213 = abstractC2899.mo6213();
                    bArr[i] = numMo6213 == null ? null : Byte.valueOf(numMo6213.byteValue());
                    i = i2;
                }
                abstractC2899.mo6145();
                return Arrays.copyOf(bArr, i);
            }
            if (abstractC2899.f9193 == 'x') {
                return abstractC2899.mo6113();
            }
            if (abstractC2899.mo6179()) {
                String str = this.f8245;
                if ("hex".equals(str)) {
                    return abstractC2899.mo6115();
                }
                String strMo6184 = abstractC2899.mo6184();
                if (!strMo6184.isEmpty()) {
                    if ("base64".equals(str)) {
                        return Base64.getDecoder().decode(strMo6184);
                    }
                    if ("gzip,base64".equals(str) || "gzip".equals(str)) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(strMo6184)));
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            while (true) {
                                byte[] bArr2 = new byte[1024];
                                int i4 = gZIPInputStream.read(bArr2);
                                if (i4 == -1) {
                                    return byteArrayOutputStream.toByteArray();
                                }
                                if (i4 > 0) {
                                    byteArrayOutputStream.write(bArr2, 0, i4);
                                }
                            }
                        } catch (IOException e) {
                            C0276.m843(abstractC2899.mo6170("unzip bytes error."), e);
                            return null;
                        }
                    }
                }
            }
            C0276.m850(abstractC2899.mo6170("TODO"));
            return null;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        Byte[] bArr = new Byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Byte bValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    bValueOf = Byte.valueOf(((Number) obj).byteValue());
                } else {
                    Function functionM5631 = AbstractC2933.m6387().m5631(obj.getClass(), Byte.class);
                    if (functionM5631 == null) {
                        C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to Byte ")));
                        return null;
                    }
                    bValueOf = (Byte) functionM5631.apply(obj);
                }
            }
            bArr[i] = bValueOf;
            i++;
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6143((byte) -110) && abstractC2899.mo6239() != f8243) {
            C0276.m841(abstractC2899.mo6100(), "not support autoType : ");
            return null;
        }
        if (abstractC2899.mo6179() && "hex".equals(this.f8245)) {
            return abstractC2899.mo6115();
        }
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        Byte[] bArr = new Byte[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            Integer numMo6213 = abstractC2899.mo6213();
            bArr[i] = numMo6213 == null ? null : Byte.valueOf(numMo6213.byteValue());
        }
        return bArr;
    }
}
