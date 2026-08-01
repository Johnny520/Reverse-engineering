package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.util.AbstractC3693;
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
public final class C3545 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f8590;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3545 f8589 = new C3545(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8588 = AbstractC3693.m6334("[Byte");

    public C3545(String str) {
        super(Byte[].class);
        this.f8590 = str;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6679()) {
            int i = 0;
            if (abstractC3732.mo6701()) {
                Byte[] bArr = new Byte[16];
                while (!abstractC3732.mo6702()) {
                    if (abstractC3732.mo6725()) {
                        C1123.m1410(abstractC3732.mo6730("input end"));
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
                    Integer numMo6773 = abstractC3732.mo6773();
                    bArr[i] = numMo6773 == null ? null : Byte.valueOf(numMo6773.byteValue());
                    i = i2;
                }
                abstractC3732.mo6705();
                return Arrays.copyOf(bArr, i);
            }
            if (abstractC3732.f9538 == 'x') {
                return abstractC3732.mo6673();
            }
            if (abstractC3732.mo6739()) {
                String str = this.f8590;
                if ("hex".equals(str)) {
                    return abstractC3732.mo6675();
                }
                String strMo6744 = abstractC3732.mo6744();
                if (!strMo6744.isEmpty()) {
                    if ("base64".equals(str)) {
                        return Base64.getDecoder().decode(strMo6744);
                    }
                    if ("gzip,base64".equals(str) || "gzip".equals(str)) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(strMo6744)));
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
                            C1123.m1403(abstractC3732.mo6730("unzip bytes error."), e);
                            return null;
                        }
                    }
                }
            }
            C1123.m1410(abstractC3732.mo6730("TODO"));
            return null;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo6029(Collection collection, long j) {
        Byte[] bArr = new Byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Byte bValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    bValueOf = Byte.valueOf(((Number) obj).byteValue());
                } else {
                    Function functionM6191 = AbstractC3766.m6947().m6191(obj.getClass(), Byte.class);
                    if (functionM6191 == null) {
                        C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to Byte ")));
                        return null;
                    }
                    bValueOf = (Byte) functionM6191.apply(obj);
                }
            }
            bArr[i] = bValueOf;
            i++;
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110) && abstractC3732.mo6799() != f8588) {
            C1123.m1401(abstractC3732.mo6660(), "not support autoType : ");
            return null;
        }
        if (abstractC3732.mo6739() && "hex".equals(this.f8590)) {
            return abstractC3732.mo6675();
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        Byte[] bArr = new Byte[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            Integer numMo6773 = abstractC3732.mo6773();
            bArr[i] = numMo6773 == null ? null : Byte.valueOf(numMo6773.byteValue());
        }
        return bArr;
    }
}
