package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import net.bytebuddy.asm.Advice;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8511 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final char[] f23641;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final char[] f23642;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final byte[] f23643;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final byte[] f23644;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final byte[] f23645;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final byte[] f23646;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final char[] f23647;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final char[] f23648;

    public AbstractC8511(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls2, field, method);
        byte[] bArr = this.f23599;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + 4);
        byte[] bArr2 = this.f23599;
        bArrCopyOf[bArr2.length] = 116;
        bArrCopyOf[bArr2.length + 1] = 114;
        bArrCopyOf[bArr2.length + 2] = 117;
        bArrCopyOf[bArr2.length + 3] = 101;
        this.f23644 = bArrCopyOf;
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length + 5);
        byte[] bArr3 = this.f23599;
        bArrCopyOf2[bArr3.length] = 102;
        bArrCopyOf2[bArr3.length + 1] = 97;
        bArrCopyOf2[bArr3.length + 2] = 108;
        bArrCopyOf2[bArr3.length + 3] = 115;
        bArrCopyOf2[bArr3.length + 4] = 101;
        this.f23643 = bArrCopyOf2;
        byte[] bArrCopyOf3 = Arrays.copyOf(bArr3, bArr3.length + 1);
        byte[] bArr4 = this.f23599;
        bArrCopyOf3[bArr4.length] = 49;
        this.f23646 = bArrCopyOf3;
        byte[] bArrCopyOf4 = Arrays.copyOf(bArr4, bArr4.length + 1);
        bArrCopyOf4[this.f23599.length] = 48;
        this.f23645 = bArrCopyOf4;
        char[] cArr = this.f23598;
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length + 4);
        char[] cArr2 = this.f23598;
        cArrCopyOf[cArr2.length] = Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL;
        cArrCopyOf[cArr2.length + 1] = Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL;
        cArrCopyOf[cArr2.length + 2] = 'u';
        cArrCopyOf[cArr2.length + 3] = 'e';
        this.f23641 = cArrCopyOf;
        char[] cArrCopyOf2 = Arrays.copyOf(cArr2, cArr2.length + 5);
        char[] cArr3 = this.f23598;
        cArrCopyOf2[cArr3.length] = 'f';
        cArrCopyOf2[cArr3.length + 1] = 'a';
        cArrCopyOf2[cArr3.length + 2] = 'l';
        cArrCopyOf2[cArr3.length + 3] = Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL;
        cArrCopyOf2[cArr3.length + 4] = 'e';
        this.f23642 = cArrCopyOf2;
        char[] cArrCopyOf3 = Arrays.copyOf(cArr3, cArr3.length + 1);
        char[] cArr4 = this.f23598;
        cArrCopyOf3[cArr4.length] = '1';
        this.f23648 = cArrCopyOf3;
        char[] cArrCopyOf4 = Arrays.copyOf(cArr4, cArr4.length + 1);
        cArrCopyOf4[this.f23598.length] = '0';
        this.f23647 = cArrCopyOf4;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        return cls == this.f23617 ? C8488.f23581 : abstractC2897.m6077(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14090(AbstractC2897 abstractC2897, boolean z) {
        long jM6078 = abstractC2897.m6078(this.f23611);
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & jM6078) != 0) {
            m14078(abstractC2897);
            abstractC2897.mo6017(z ? "true" : "false");
        } else if (abstractC2897.f9176) {
            abstractC2897.mo5974((jM6078 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0 ? z ? this.f23646 : this.f23645 : z ? this.f23644 : this.f23643);
        } else if (abstractC2897.f9177) {
            abstractC2897.mo5966((jM6078 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0 ? z ? this.f23648 : this.f23647 : z ? this.f23641 : this.f23642);
        } else {
            m14078(abstractC2897);
            abstractC2897.mo5989(z);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        Boolean bool = (Boolean) mo13995(obj);
        if (bool == null) {
            abstractC2897.mo5967();
        } else {
            abstractC2897.mo5989(bool.booleanValue());
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        try {
            Boolean bool = (Boolean) mo13995(obj);
            long j = this.f23611;
            if (bool == null) {
                long j2 = j | abstractC2897.f9178.f9153;
                long j3 = JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask;
                JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.WriteNullBooleanAsFalse;
                if (((j3 | jSONWriter$Feature.mask) & j2) != 0) {
                    m14078(abstractC2897);
                    if ((j2 & jSONWriter$Feature.mask) != 0) {
                        abstractC2897.mo5989(false);
                        return true;
                    }
                    abstractC2897.m6068();
                    return true;
                }
            } else if (this.f23617 != Boolean.TYPE || bool.booleanValue() || (abstractC2897.m6078(j) & JSONWriter$Feature.NotWriteDefaultValue.mask) == 0) {
                m14090(abstractC2897, bool.booleanValue());
                return true;
            }
        } catch (RuntimeException e) {
            if (!abstractC2897.m6075()) {
                throw e;
            }
        }
        return false;
    }
}
