package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8503 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Enum[] f23631;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long[] f23632;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final char[][] f23633;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final byte[][] f23634;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final char[][] f23635;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final byte[][] f23636;

    public C8503(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f23631 = enumArr;
        this.f23632 = new long[enumArr.length];
        long[] jArr = new long[enumArr.length];
        int i2 = 0;
        while (true) {
            Enum[] enumArr2 = this.f23631;
            if (i2 >= enumArr2.length) {
                this.f23634 = new byte[enumArr2.length][];
                this.f23633 = new char[enumArr2.length][];
                this.f23636 = new byte[enumArr2.length][];
                this.f23635 = new char[enumArr2.length][];
                return;
            }
            this.f23632[i2] = AbstractC2860.m5774(enumArr2[i2].name());
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14085(AbstractC2897 abstractC2897, Enum r14) {
        long j = this.f23611;
        long jM6078 = abstractC2897.m6078(j);
        boolean z = abstractC2897.f9177;
        boolean z2 = abstractC2897.f9176;
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & jM6078) == 0) {
            if (abstractC2897.f9171) {
                m14086(abstractC2897, r14);
                return;
            }
            int iOrdinal = r14.ordinal();
            long j2 = JSONWriter$Feature.WriteEnumUsingOrdinal.mask & jM6078;
            char[] cArr = this.f23598;
            byte[] bArr = this.f23599;
            if (j2 != 0) {
                if ((j & JSONWriter$Feature.UnquoteFieldName.mask) == 0) {
                    if (z2) {
                        byte[][] bArr2 = this.f23636;
                        byte[] bArrCopyOf = bArr2[iOrdinal];
                        if (bArrCopyOf == null) {
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArr, bArr.length + AbstractC2849.m5756(iOrdinal));
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf2, bArrCopyOf2.length);
                            AbstractC2849.m5736(iOrdinal, bArrCopyOf, bArrCopyOf.length);
                            bArr2[iOrdinal] = bArrCopyOf;
                        }
                        abstractC2897.mo5974(bArrCopyOf);
                        return;
                    }
                    if (z) {
                        char[][] cArr2 = this.f23635;
                        char[] cArrCopyOf = cArr2[iOrdinal];
                        if (cArrCopyOf == null) {
                            char[] cArrCopyOf2 = Arrays.copyOf(cArr, cArr.length + AbstractC2849.m5756(iOrdinal));
                            cArrCopyOf = Arrays.copyOf(cArrCopyOf2, cArrCopyOf2.length);
                            AbstractC2849.m5732(iOrdinal, cArrCopyOf.length, cArrCopyOf);
                            cArr2[iOrdinal] = cArrCopyOf;
                        }
                        abstractC2897.mo5966(cArrCopyOf);
                        return;
                    }
                }
                m14078(abstractC2897);
                abstractC2897.mo5973(iOrdinal);
                return;
            }
            if ((JSONWriter$Feature.UnquoteFieldName.mask & jM6078) == 0) {
                int i = 0;
                Enum[] enumArr = this.f23631;
                if (z2) {
                    byte[][] bArr3 = this.f23634;
                    byte[] bArr4 = bArr3[iOrdinal];
                    if (bArr4 == null) {
                        byte[] bytes = enumArr[iOrdinal].name().getBytes(StandardCharsets.UTF_8);
                        byte[] bArrCopyOf3 = Arrays.copyOf(bArr, bArr.length + bytes.length + 2);
                        bArrCopyOf3[bArr.length] = 34;
                        int length = bArr.length + 1;
                        int length2 = bytes.length;
                        while (i < length2) {
                            bArrCopyOf3[length] = bytes[i];
                            i++;
                            length++;
                        }
                        bArrCopyOf3[bArrCopyOf3.length - 1] = 34;
                        bArr3[iOrdinal] = bArrCopyOf3;
                        bArr4 = bArrCopyOf3;
                    }
                    abstractC2897.mo5974(bArr4);
                    return;
                }
                if (z) {
                    char[][] cArr3 = this.f23633;
                    char[] cArr4 = cArr3[iOrdinal];
                    if (cArr4 == null) {
                        String strName = enumArr[iOrdinal].name();
                        char[] cArrCopyOf3 = Arrays.copyOf(cArr, strName.length() + cArr.length + 2);
                        cArrCopyOf3[cArr.length] = '\"';
                        strName.getChars(0, strName.length(), cArrCopyOf3, cArr.length + 1);
                        cArrCopyOf3[cArrCopyOf3.length - 1] = '\"';
                        cArr3[iOrdinal] = cArrCopyOf3;
                        cArr4 = cArrCopyOf3;
                    }
                    abstractC2897.mo5966(cArr4);
                    return;
                }
            }
        }
        m14078(abstractC2897);
        abstractC2897.mo6017(r14.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14086(AbstractC2897 abstractC2897, Enum r11) {
        long jM6078 = abstractC2897.m6078(this.f23611);
        long j = JSONWriter$Feature.WriteEnumUsingToString.mask;
        boolean z = ((JSONWriter$Feature.WriteEnumsUsingName.mask | j) & jM6078) == 0;
        boolean z2 = (jM6078 & j) != 0;
        int iOrdinal = r11.ordinal();
        long j2 = this.f23600;
        byte[] bArr = this.f23609;
        if (z2) {
            abstractC2897.mo6033(j2, bArr);
            abstractC2897.mo6017(r11.toString());
        } else if (z) {
            abstractC2897.mo6033(j2, bArr);
            abstractC2897.mo5973(iOrdinal);
        } else {
            m14078(abstractC2897);
            abstractC2897.mo6017(r11.name());
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        abstractC2897.mo6034((Enum) mo13995(obj));
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        Enum r7 = (Enum) mo13995(obj);
        if (r7 == null) {
            if (((abstractC2897.f9178.f9153 | this.f23611) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                return false;
            }
            m14078(abstractC2897);
            abstractC2897.mo5967();
            return true;
        }
        if (abstractC2897.f9171) {
            m14086(abstractC2897, r7);
            return true;
        }
        m14085(abstractC2897, r7);
        return true;
    }
}
