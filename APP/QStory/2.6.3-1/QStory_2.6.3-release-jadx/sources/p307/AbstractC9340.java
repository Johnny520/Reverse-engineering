package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import net.bytebuddy.asm.Advice;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9340 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final char[] f23986;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final char[] f23987;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final byte[] f23988;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final byte[] f23989;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final byte[] f23990;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final byte[] f23991;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final char[] f23992;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final char[] f23993;

    public AbstractC9340(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls2, field, method);
        byte[] bArr = this.f23944;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + 4);
        byte[] bArr2 = this.f23944;
        bArrCopyOf[bArr2.length] = 116;
        bArrCopyOf[bArr2.length + 1] = 114;
        bArrCopyOf[bArr2.length + 2] = 117;
        bArrCopyOf[bArr2.length + 3] = 101;
        this.f23989 = bArrCopyOf;
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length + 5);
        byte[] bArr3 = this.f23944;
        bArrCopyOf2[bArr3.length] = 102;
        bArrCopyOf2[bArr3.length + 1] = 97;
        bArrCopyOf2[bArr3.length + 2] = 108;
        bArrCopyOf2[bArr3.length + 3] = 115;
        bArrCopyOf2[bArr3.length + 4] = 101;
        this.f23988 = bArrCopyOf2;
        byte[] bArrCopyOf3 = Arrays.copyOf(bArr3, bArr3.length + 1);
        byte[] bArr4 = this.f23944;
        bArrCopyOf3[bArr4.length] = 49;
        this.f23991 = bArrCopyOf3;
        byte[] bArrCopyOf4 = Arrays.copyOf(bArr4, bArr4.length + 1);
        bArrCopyOf4[this.f23944.length] = 48;
        this.f23990 = bArrCopyOf4;
        char[] cArr = this.f23943;
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length + 4);
        char[] cArr2 = this.f23943;
        cArrCopyOf[cArr2.length] = Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL;
        cArrCopyOf[cArr2.length + 1] = Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL;
        cArrCopyOf[cArr2.length + 2] = 'u';
        cArrCopyOf[cArr2.length + 3] = 'e';
        this.f23986 = cArrCopyOf;
        char[] cArrCopyOf2 = Arrays.copyOf(cArr2, cArr2.length + 5);
        char[] cArr3 = this.f23943;
        cArrCopyOf2[cArr3.length] = 'f';
        cArrCopyOf2[cArr3.length + 1] = 'a';
        cArrCopyOf2[cArr3.length + 2] = 'l';
        cArrCopyOf2[cArr3.length + 3] = Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL;
        cArrCopyOf2[cArr3.length + 4] = 'e';
        this.f23987 = cArrCopyOf2;
        char[] cArrCopyOf3 = Arrays.copyOf(cArr3, cArr3.length + 1);
        char[] cArr4 = this.f23943;
        cArrCopyOf3[cArr4.length] = '1';
        this.f23993 = cArrCopyOf3;
        char[] cArrCopyOf4 = Arrays.copyOf(cArr4, cArr4.length + 1);
        cArrCopyOf4[this.f23943.length] = '0';
        this.f23992 = cArrCopyOf4;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        return cls == this.f23962 ? C9317.f23926 : abstractC3730.m6637(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14649(AbstractC3730 abstractC3730, boolean z) {
        long jM6638 = abstractC3730.m6638(this.f23956);
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & jM6638) != 0) {
            m14637(abstractC3730);
            abstractC3730.mo6577(z ? "true" : "false");
        } else if (abstractC3730.f9521) {
            abstractC3730.mo6534((jM6638 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0 ? z ? this.f23991 : this.f23990 : z ? this.f23989 : this.f23988);
        } else if (abstractC3730.f9522) {
            abstractC3730.mo6526((jM6638 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0 ? z ? this.f23993 : this.f23992 : z ? this.f23986 : this.f23987);
        } else {
            m14637(abstractC3730);
            abstractC3730.mo6549(z);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        Boolean bool = (Boolean) mo14554(obj);
        if (bool == null) {
            abstractC3730.mo6527();
        } else {
            abstractC3730.mo6549(bool.booleanValue());
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        try {
            Boolean bool = (Boolean) mo14554(obj);
            long j = this.f23956;
            if (bool == null) {
                long j2 = j | abstractC3730.f9523.f9498;
                long j3 = JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask;
                JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.WriteNullBooleanAsFalse;
                if (((j3 | jSONWriter$Feature.mask) & j2) != 0) {
                    m14637(abstractC3730);
                    if ((j2 & jSONWriter$Feature.mask) != 0) {
                        abstractC3730.mo6549(false);
                        return true;
                    }
                    abstractC3730.m6628();
                    return true;
                }
            } else if (this.f23962 != Boolean.TYPE || bool.booleanValue() || (abstractC3730.m6638(j) & JSONWriter$Feature.NotWriteDefaultValue.mask) == 0) {
                m14649(abstractC3730, bool.booleanValue());
                return true;
            }
        } catch (RuntimeException e) {
            if (!abstractC3730.m6635()) {
                throw e;
            }
        }
        return false;
    }
}
