package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import net.bytebuddy.asm.Advice;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8519 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final char[] f23650;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final char[] f23651;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final byte[] f23652;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final byte[] f23653;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final byte[] f23654;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final byte[] f23655;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final char[] f23656;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final char[] f23657;

    public AbstractC8519(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls2, field, method);
        byte[] bArr = this.f23608;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + 4);
        byte[] bArr2 = this.f23608;
        bArrCopyOf[bArr2.length] = 116;
        bArrCopyOf[bArr2.length + 1] = 114;
        bArrCopyOf[bArr2.length + 2] = 117;
        bArrCopyOf[bArr2.length + 3] = 101;
        this.f23653 = bArrCopyOf;
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length + 5);
        byte[] bArr3 = this.f23608;
        bArrCopyOf2[bArr3.length] = 102;
        bArrCopyOf2[bArr3.length + 1] = 97;
        bArrCopyOf2[bArr3.length + 2] = 108;
        bArrCopyOf2[bArr3.length + 3] = 115;
        bArrCopyOf2[bArr3.length + 4] = 101;
        this.f23652 = bArrCopyOf2;
        byte[] bArrCopyOf3 = Arrays.copyOf(bArr3, bArr3.length + 1);
        byte[] bArr4 = this.f23608;
        bArrCopyOf3[bArr4.length] = 49;
        this.f23655 = bArrCopyOf3;
        byte[] bArrCopyOf4 = Arrays.copyOf(bArr4, bArr4.length + 1);
        bArrCopyOf4[this.f23608.length] = 48;
        this.f23654 = bArrCopyOf4;
        char[] cArr = this.f23607;
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length + 4);
        char[] cArr2 = this.f23607;
        cArrCopyOf[cArr2.length] = Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL;
        cArrCopyOf[cArr2.length + 1] = Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL;
        cArrCopyOf[cArr2.length + 2] = 'u';
        cArrCopyOf[cArr2.length + 3] = 'e';
        this.f23650 = cArrCopyOf;
        char[] cArrCopyOf2 = Arrays.copyOf(cArr2, cArr2.length + 5);
        char[] cArr3 = this.f23607;
        cArrCopyOf2[cArr3.length] = 'f';
        cArrCopyOf2[cArr3.length + 1] = 'a';
        cArrCopyOf2[cArr3.length + 2] = 'l';
        cArrCopyOf2[cArr3.length + 3] = Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL;
        cArrCopyOf2[cArr3.length + 4] = 'e';
        this.f23651 = cArrCopyOf2;
        char[] cArrCopyOf3 = Arrays.copyOf(cArr3, cArr3.length + 1);
        char[] cArr4 = this.f23607;
        cArrCopyOf3[cArr4.length] = '1';
        this.f23657 = cArrCopyOf3;
        char[] cArrCopyOf4 = Arrays.copyOf(cArr4, cArr4.length + 1);
        cArrCopyOf4[this.f23607.length] = '0';
        this.f23656 = cArrCopyOf4;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        return cls == this.f23626 ? C8496.f23590 : abstractC2896.m6031(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14071(AbstractC2896 abstractC2896, boolean z) {
        long jM6032 = abstractC2896.m6032(this.f23620);
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & jM6032) != 0) {
            m14059(abstractC2896);
            abstractC2896.mo5972(z ? "true" : "false");
        } else if (abstractC2896.f9174) {
            abstractC2896.mo5929((jM6032 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0 ? z ? this.f23655 : this.f23654 : z ? this.f23653 : this.f23652);
        } else if (abstractC2896.f9175) {
            abstractC2896.mo5921((jM6032 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0 ? z ? this.f23657 : this.f23656 : z ? this.f23650 : this.f23651);
        } else {
            m14059(abstractC2896);
            abstractC2896.mo5944(z);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        Boolean bool = (Boolean) mo13976(obj);
        if (bool == null) {
            abstractC2896.mo5922();
        } else {
            abstractC2896.mo5944(bool.booleanValue());
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        try {
            Boolean bool = (Boolean) mo13976(obj);
            long j = this.f23620;
            if (bool == null) {
                long j2 = j | abstractC2896.f9176.f9151;
                long j3 = JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask;
                JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.WriteNullBooleanAsFalse;
                if (((j3 | jSONWriter$Feature.mask) & j2) != 0) {
                    m14059(abstractC2896);
                    if ((j2 & jSONWriter$Feature.mask) != 0) {
                        abstractC2896.mo5944(false);
                        return true;
                    }
                    abstractC2896.m6022();
                    return true;
                }
            } else if (this.f23626 != Boolean.TYPE || bool.booleanValue() || (abstractC2896.m6032(j) & JSONWriter$Feature.NotWriteDefaultValue.mask) == 0) {
                m14071(abstractC2896, bool.booleanValue());
                return true;
            }
        } catch (RuntimeException e) {
            if (!abstractC2896.m6026()) {
                throw e;
            }
        }
        return false;
    }
}
