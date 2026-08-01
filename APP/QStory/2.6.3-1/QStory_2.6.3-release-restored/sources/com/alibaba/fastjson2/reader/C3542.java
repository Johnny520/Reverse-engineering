package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3542 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f8582;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8583;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3542 f8581 = new C3542();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f8580 = AbstractC3693.m6334("[B");

    public C3542(String str, Function function) {
        super(byte[].class);
        this.f8582 = "base64".equals(str) ? JSONReader$Feature.Base64StringAsByteArray.mask : 0L;
        this.f8583 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        byte[] bArrDecode = null;
        if (abstractC3732.mo6679()) {
            return null;
        }
        boolean zMo6701 = abstractC3732.mo6701();
        Function function = this.f8583;
        if (!zMo6701) {
            if (!abstractC3732.mo6739()) {
                C1123.m1410(abstractC3732.mo6730("TODO"));
                return null;
            }
            if ((abstractC3732.m6717(j | this.f8582) & JSONReader$Feature.Base64StringAsByteArray.mask) != 0) {
                bArrDecode = abstractC3732.mo6683();
            } else {
                String strMo6744 = abstractC3732.mo6744();
                if (!strMo6744.isEmpty()) {
                    int iIndexOf = strMo6744.indexOf(";base64,");
                    if (iIndexOf == -1) {
                        C1123.m1410(abstractC3732.mo6730("illegal input : ".concat(strMo6744)));
                        return null;
                    }
                    bArrDecode = Base64.getDecoder().decode(strMo6744.substring(iIndexOf + 8));
                }
            }
            return function != null ? function.apply(bArrDecode) : bArrDecode;
        }
        byte[] bArrCopyOf = new byte[16];
        int i = 0;
        while (!abstractC3732.mo6702()) {
            if (abstractC3732.mo6725()) {
                C1123.m1410(abstractC3732.mo6730("input end"));
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
            bArrCopyOf[i] = (byte) abstractC3732.mo6772();
            i = i2;
        }
        abstractC3732.mo6705();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
        return function != null ? function.apply(bArrCopyOf2) : bArrCopyOf2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo6029(Collection collection, long j) {
        byte bByteValue;
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bByteValue = 0;
            } else if (obj instanceof Number) {
                bByteValue = ((Number) obj).byteValue();
            } else {
                Function functionM6191 = AbstractC3766.m6947().m6191(obj.getClass(), Byte.TYPE);
                if (functionM6191 == null) {
                    C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to byte ")));
                    return null;
                }
                bByteValue = ((Byte) functionM6191.apply(obj)).byteValue();
            }
            bArr[i] = bByteValue;
            i++;
        }
        Function function = this.f8583;
        return function != null ? function.apply(bArr) : bArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        byte[] bArrDecode;
        int iIndexOf;
        if (abstractC3732.mo6703((byte) -110)) {
            long jMo6799 = abstractC3732.mo6799();
            if (jMo6799 != f8580 && jMo6799 != C3545.f8588) {
                C1123.m1401(abstractC3732.mo6660(), "not support autoType : ");
                return null;
            }
        }
        if (abstractC3732.mo6728()) {
            bArrDecode = abstractC3732.mo6673();
        } else if (abstractC3732.mo6739()) {
            String strMo6744 = abstractC3732.mo6744();
            if (strMo6744 != null && (iIndexOf = strMo6744.indexOf(";base64,")) != -1) {
                strMo6744 = strMo6744.substring(iIndexOf + 8);
            }
            bArrDecode = Base64.getDecoder().decode(strMo6744);
        } else {
            int iMo6792 = abstractC3732.mo6792();
            if (iMo6792 == -1) {
                return null;
            }
            byte[] bArr = new byte[iMo6792];
            for (int i = 0; i < iMo6792; i++) {
                bArr[i] = (byte) abstractC3732.mo6772();
            }
            bArrDecode = bArr;
        }
        Function function = this.f8583;
        return function != null ? function.apply(bArrDecode) : bArrDecode;
    }

    public C3542() {
        super(byte[].class);
        this.f8583 = null;
        this.f8582 = 0L;
    }
}
