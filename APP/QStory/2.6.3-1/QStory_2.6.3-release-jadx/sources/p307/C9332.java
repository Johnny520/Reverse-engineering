package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9332 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Enum[] f23976;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long[] f23977;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final char[][] f23978;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final byte[][] f23979;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final char[][] f23980;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final byte[][] f23981;

    public C9332(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f23976 = enumArr;
        this.f23977 = new long[enumArr.length];
        long[] jArr = new long[enumArr.length];
        int i2 = 0;
        while (true) {
            Enum[] enumArr2 = this.f23976;
            if (i2 >= enumArr2.length) {
                this.f23979 = new byte[enumArr2.length][];
                this.f23978 = new char[enumArr2.length][];
                this.f23981 = new byte[enumArr2.length][];
                this.f23980 = new char[enumArr2.length][];
                return;
            }
            this.f23977[i2] = AbstractC3693.m6334(enumArr2[i2].name());
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14644(AbstractC3730 abstractC3730, Enum r14) {
        long j = this.f23956;
        long jM6638 = abstractC3730.m6638(j);
        boolean z = abstractC3730.f9522;
        boolean z2 = abstractC3730.f9521;
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & jM6638) == 0) {
            if (abstractC3730.f9516) {
                m14645(abstractC3730, r14);
                return;
            }
            int iOrdinal = r14.ordinal();
            long j2 = JSONWriter$Feature.WriteEnumUsingOrdinal.mask & jM6638;
            char[] cArr = this.f23943;
            byte[] bArr = this.f23944;
            if (j2 != 0) {
                if ((j & JSONWriter$Feature.UnquoteFieldName.mask) == 0) {
                    if (z2) {
                        byte[][] bArr2 = this.f23981;
                        byte[] bArrCopyOf = bArr2[iOrdinal];
                        if (bArrCopyOf == null) {
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArr, bArr.length + AbstractC3682.m6316(iOrdinal));
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf2, bArrCopyOf2.length);
                            AbstractC3682.m6296(iOrdinal, bArrCopyOf, bArrCopyOf.length);
                            bArr2[iOrdinal] = bArrCopyOf;
                        }
                        abstractC3730.mo6534(bArrCopyOf);
                        return;
                    }
                    if (z) {
                        char[][] cArr2 = this.f23980;
                        char[] cArrCopyOf = cArr2[iOrdinal];
                        if (cArrCopyOf == null) {
                            char[] cArrCopyOf2 = Arrays.copyOf(cArr, cArr.length + AbstractC3682.m6316(iOrdinal));
                            cArrCopyOf = Arrays.copyOf(cArrCopyOf2, cArrCopyOf2.length);
                            AbstractC3682.m6292(iOrdinal, cArrCopyOf.length, cArrCopyOf);
                            cArr2[iOrdinal] = cArrCopyOf;
                        }
                        abstractC3730.mo6526(cArrCopyOf);
                        return;
                    }
                }
                m14637(abstractC3730);
                abstractC3730.mo6533(iOrdinal);
                return;
            }
            if ((JSONWriter$Feature.UnquoteFieldName.mask & jM6638) == 0) {
                int i = 0;
                Enum[] enumArr = this.f23976;
                if (z2) {
                    byte[][] bArr3 = this.f23979;
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
                    abstractC3730.mo6534(bArr4);
                    return;
                }
                if (z) {
                    char[][] cArr3 = this.f23978;
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
                    abstractC3730.mo6526(cArr4);
                    return;
                }
            }
        }
        m14637(abstractC3730);
        abstractC3730.mo6577(r14.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14645(AbstractC3730 abstractC3730, Enum r11) {
        long jM6638 = abstractC3730.m6638(this.f23956);
        long j = JSONWriter$Feature.WriteEnumUsingToString.mask;
        boolean z = ((JSONWriter$Feature.WriteEnumsUsingName.mask | j) & jM6638) == 0;
        boolean z2 = (jM6638 & j) != 0;
        int iOrdinal = r11.ordinal();
        long j2 = this.f23945;
        byte[] bArr = this.f23954;
        if (z2) {
            abstractC3730.mo6593(j2, bArr);
            abstractC3730.mo6577(r11.toString());
        } else if (z) {
            abstractC3730.mo6593(j2, bArr);
            abstractC3730.mo6533(iOrdinal);
        } else {
            m14637(abstractC3730);
            abstractC3730.mo6577(r11.name());
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        abstractC3730.mo6594((Enum) mo14554(obj));
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        Enum r7 = (Enum) mo14554(obj);
        if (r7 == null) {
            if (((abstractC3730.f9523.f9498 | this.f23956) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                return false;
            }
            m14637(abstractC3730);
            abstractC3730.mo6527();
            return true;
        }
        if (abstractC3730.f9516) {
            m14645(abstractC3730, r7);
            return true;
        }
        m14644(abstractC3730, r7);
        return true;
    }
}
