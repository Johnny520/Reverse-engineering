package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8511 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Enum[] f23640;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long[] f23641;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final char[][] f23642;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final byte[][] f23643;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final char[][] f23644;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final byte[][] f23645;

    public C8511(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f23640 = enumArr;
        this.f23641 = new long[enumArr.length];
        long[] jArr = new long[enumArr.length];
        int i2 = 0;
        while (true) {
            Enum[] enumArr2 = this.f23640;
            if (i2 >= enumArr2.length) {
                this.f23643 = new byte[enumArr2.length][];
                this.f23642 = new char[enumArr2.length][];
                this.f23645 = new byte[enumArr2.length][];
                this.f23644 = new char[enumArr2.length][];
                return;
            }
            this.f23641[i2] = AbstractC2859.m5729(enumArr2[i2].name());
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14066(AbstractC2896 abstractC2896, Enum r14) {
        long j = this.f23620;
        long jM6032 = abstractC2896.m6032(j);
        boolean z = abstractC2896.f9175;
        boolean z2 = abstractC2896.f9174;
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & jM6032) == 0) {
            if (abstractC2896.f9169) {
                m14067(abstractC2896, r14);
                return;
            }
            int iOrdinal = r14.ordinal();
            long j2 = JSONWriter$Feature.WriteEnumUsingOrdinal.mask & jM6032;
            char[] cArr = this.f23607;
            byte[] bArr = this.f23608;
            if (j2 != 0) {
                if ((j & JSONWriter$Feature.UnquoteFieldName.mask) == 0) {
                    if (z2) {
                        byte[][] bArr2 = this.f23645;
                        byte[] bArrCopyOf = bArr2[iOrdinal];
                        if (bArrCopyOf == null) {
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArr, bArr.length + AbstractC2848.m5711(iOrdinal));
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf2, bArrCopyOf2.length);
                            AbstractC2848.m5691(iOrdinal, bArrCopyOf, bArrCopyOf.length);
                            bArr2[iOrdinal] = bArrCopyOf;
                        }
                        abstractC2896.mo5929(bArrCopyOf);
                        return;
                    }
                    if (z) {
                        char[][] cArr2 = this.f23644;
                        char[] cArrCopyOf = cArr2[iOrdinal];
                        if (cArrCopyOf == null) {
                            char[] cArrCopyOf2 = Arrays.copyOf(cArr, cArr.length + AbstractC2848.m5711(iOrdinal));
                            cArrCopyOf = Arrays.copyOf(cArrCopyOf2, cArrCopyOf2.length);
                            AbstractC2848.m5687(iOrdinal, cArrCopyOf.length, cArrCopyOf);
                            cArr2[iOrdinal] = cArrCopyOf;
                        }
                        abstractC2896.mo5921(cArrCopyOf);
                        return;
                    }
                }
                m14059(abstractC2896);
                abstractC2896.mo5928(iOrdinal);
                return;
            }
            if ((JSONWriter$Feature.UnquoteFieldName.mask & jM6032) == 0) {
                int i = 0;
                Enum[] enumArr = this.f23640;
                if (z2) {
                    byte[][] bArr3 = this.f23643;
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
                    abstractC2896.mo5929(bArr4);
                    return;
                }
                if (z) {
                    char[][] cArr3 = this.f23642;
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
                    abstractC2896.mo5921(cArr4);
                    return;
                }
            }
        }
        m14059(abstractC2896);
        abstractC2896.mo5972(r14.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14067(AbstractC2896 abstractC2896, Enum r11) {
        long jM6032 = abstractC2896.m6032(this.f23620);
        long j = JSONWriter$Feature.WriteEnumUsingToString.mask;
        boolean z = ((JSONWriter$Feature.WriteEnumsUsingName.mask | j) & jM6032) == 0;
        boolean z2 = (jM6032 & j) != 0;
        int iOrdinal = r11.ordinal();
        long j2 = this.f23609;
        byte[] bArr = this.f23618;
        if (z2) {
            abstractC2896.mo5988(j2, bArr);
            abstractC2896.mo5972(r11.toString());
        } else if (z) {
            abstractC2896.mo5988(j2, bArr);
            abstractC2896.mo5928(iOrdinal);
        } else {
            m14059(abstractC2896);
            abstractC2896.mo5972(r11.name());
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        abstractC2896.mo5989((Enum) mo13976(obj));
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        Enum r7 = (Enum) mo13976(obj);
        if (r7 == null) {
            if (((abstractC2896.f9176.f9151 | this.f23620) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                return false;
            }
            m14059(abstractC2896);
            abstractC2896.mo5922();
            return true;
        }
        if (abstractC2896.f9169) {
            m14067(abstractC2896, r7);
            return true;
        }
        m14066(abstractC2896, r7);
        return true;
    }
}
