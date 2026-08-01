package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.util.AbstractC2859;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2711 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f8243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2711 f8242 = new C2711(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8241 = AbstractC2859.m5729("[Byte");

    public C2711(String str) {
        super(Byte[].class);
        this.f8243 = str;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!abstractC2898.mo6073()) {
            int i = 0;
            if (abstractC2898.mo6095()) {
                Byte[] bArr = new Byte[16];
                while (!abstractC2898.mo6096()) {
                    if (abstractC2898.mo6119()) {
                        C0276.m849(abstractC2898.mo6124("input end"));
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
                    Integer numMo6168 = abstractC2898.mo6168();
                    bArr[i] = numMo6168 == null ? null : Byte.valueOf(numMo6168.byteValue());
                    i = i2;
                }
                abstractC2898.mo6099();
                return Arrays.copyOf(bArr, i);
            }
            if (abstractC2898.f9191 == 'x') {
                return abstractC2898.mo6067();
            }
            if (abstractC2898.mo6133()) {
                String str = this.f8243;
                if ("hex".equals(str)) {
                    return abstractC2898.mo6069();
                }
                String strMo6139 = abstractC2898.mo6139();
                if (!strMo6139.isEmpty()) {
                    if ("base64".equals(str)) {
                        return Base64.getDecoder().decode(strMo6139);
                    }
                    if ("gzip,base64".equals(str) || "gzip".equals(str)) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(strMo6139)));
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
                            C0276.m842(abstractC2898.mo6124("unzip bytes error."), e);
                            return null;
                        }
                    }
                }
            }
            C0276.m849(abstractC2898.mo6124("TODO"));
            return null;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        Byte[] bArr = new Byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Byte bValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    bValueOf = Byte.valueOf(((Number) obj).byteValue());
                } else {
                    Function functionM5586 = AbstractC2932.m6329().m5586(obj.getClass(), Byte.class);
                    if (functionM5586 == null) {
                        C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to Byte ")));
                        return null;
                    }
                    bValueOf = (Byte) functionM5586.apply(obj);
                }
            }
            bArr[i] = bValueOf;
            i++;
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6097((byte) -110) && abstractC2898.mo6194() != f8241) {
            C0276.m840(abstractC2898.mo6055(), "not support autoType : ");
            return null;
        }
        if (abstractC2898.mo6133() && "hex".equals(this.f8243)) {
            return abstractC2898.mo6069();
        }
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        Byte[] bArr = new Byte[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            Integer numMo6168 = abstractC2898.mo6168();
            bArr[i] = numMo6168 == null ? null : Byte.valueOf(numMo6168.byteValue());
        }
        return bArr;
    }
}
