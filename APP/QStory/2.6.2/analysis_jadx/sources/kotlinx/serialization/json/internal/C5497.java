package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C0191;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.C1609;
import com.bumptech.glide.AbstractC3065;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import p007.AbstractC6136;
import p088.AbstractC7158;
import p088.AbstractC7175;
import p088.C7176;
import p088.InterfaceC7177;
import p089.InterfaceC7183;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5497 extends AbstractC3065 implements InterfaceC7177 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5509 f15197;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7176 f15198;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final WriteMode f15199;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC7158 f15200;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f15201;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C4484 f15202;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0191 f15203;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C1245 f15204;

    public C5497(AbstractC7158 abstractC7158, WriteMode writeMode, C0191 c0191, InterfaceC7190 interfaceC7190, C4484 c4484) {
        writeMode.getClass();
        interfaceC7190.getClass();
        this.f15200 = abstractC7158;
        this.f15199 = writeMode;
        this.f15203 = c0191;
        this.f15204 = abstractC7158.f19132;
        this.f15201 = -1;
        this.f15202 = c4484;
        C7176 c7176 = abstractC7158.f19133;
        this.f15198 = c7176;
        this.f15197 = c7176.f19158 ? null : new C5509(interfaceC7190);
    }

    @Override // p088.InterfaceC7177
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final AbstractC7158 mo10643() {
        return this.f15200;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10644(p089.InterfaceC7183 r19) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5497.mo10644(飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6865() {
        /*
            r9 = this;
            r0 = 0
            kotlinx.serialization.json.internal.飘花落叶言子楪苏哲兰世 r1 = r9.f15197
            if (r1 == 0) goto L8
            boolean r1 = r1.f15235
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 != 0) goto L53
            androidx.appcompat.widget.飘花落叶言子楪兰世哲苏 r9 = r9.f15203
            int r1 = r9.m659()
            int r1 = r9.m668(r1)
            java.lang.Object r2 = r9.f752
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.length()
            int r3 = r3 - r1
            r4 = 1
            r5 = 4
            if (r3 < r5) goto L4f
            r6 = -1
            if (r1 != r6) goto L26
            goto L4f
        L26:
            r6 = r0
        L27:
            if (r6 >= r5) goto L3b
            java.lang.String r7 = "null"
            char r7 = r7.charAt(r6)
            int r8 = r1 + r6
            char r8 = r2.charAt(r8)
            if (r7 == r8) goto L38
            goto L4f
        L38:
            int r6 = r6 + 1
            goto L27
        L3b:
            if (r3 <= r5) goto L4a
            int r3 = r1 + 4
            char r2 = r2.charAt(r3)
            byte r2 = kotlinx.serialization.json.internal.AbstractC5506.m10682(r2)
            if (r2 != 0) goto L4a
            goto L4f
        L4a:
            int r1 = r1 + r5
            r9.f750 = r1
            r9 = r4
            goto L50
        L4f:
            r9 = r0
        L50:
            if (r9 != 0) goto L53
            return r4
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5497.mo6865():boolean");
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final String mo6867() {
        boolean z = this.f15198.f19160;
        C0191 c0191 = this.f15203;
        return z ? c0191.m684() : c0191.m692();
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo6868() {
        C0191 c0191 = this.f15203;
        long jM694 = c0191.m694();
        int i = (int) jM694;
        if (jM694 == i) {
            return i;
        }
        C0191.m651(c0191, "Failed to parse int for input '" + jM694 + '\'', 0, null, 6);
        throw null;
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo6869() {
        return this.f15203.m694();
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final int mo6873(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return AbstractC5506.m10699(interfaceC7190, this.f15200, mo6867(), " at path ".concat(((C1609) this.f15203.f748).m2953()));
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6874(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        C1609 c1609 = (C1609) this.f15203.f748;
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        boolean z = this.f15199 == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c1609.f4713;
            int i2 = c1609.f4716;
            if (iArr[i2] == -2) {
                ((Object[]) c1609.f4714)[i2] = C5507.f15231;
            }
        }
        Object objMo10644 = mo10644(interfaceC7183);
        if (z) {
            int[] iArr2 = (int[]) c1609.f4713;
            int i3 = c1609.f4716;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c1609.f4716 = i4;
                if (i4 == ((Object[]) c1609.f4714).length) {
                    c1609.m2950();
                }
            }
            Object[] objArr = (Object[]) c1609.f4714;
            int i5 = c1609.f4716;
            objArr[i5] = ((C7176) c1609.f4715).f19166 ? objMo10644 : C5507.f15232;
            ((int[]) c1609.f4713)[i5] = -2;
        }
        return objMo10644;
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7188 mo6876(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        AbstractC7158 abstractC7158 = this.f15200;
        WriteMode writeModeM10689 = AbstractC5506.m10689(abstractC7158, interfaceC7190);
        C0191 c0191 = this.f15203;
        C1609 c1609 = (C1609) c0191.f748;
        c1609.getClass();
        int i = c1609.f4716 + 1;
        c1609.f4716 = i;
        if (i == ((Object[]) c1609.f4714).length) {
            c1609.m2950();
        }
        ((Object[]) c1609.f4714)[i] = interfaceC7190;
        c0191.m693(writeModeM10689.begin);
        if (c0191.m672() != 4) {
            int i2 = AbstractC5496.f15196[writeModeM10689.ordinal()];
            return (i2 == 1 || i2 == 2 || i2 == 3) ? new C5497(abstractC7158, writeModeM10689, c0191, interfaceC7190, this.f15202) : (this.f15199 == writeModeM10689 && abstractC7158.f19133.f19158) ? this : new C5497(abstractC7158, writeModeM10689, c0191, interfaceC7190, this.f15202);
        }
        C0191.m651(c0191, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10652() {
        return this.f15204;
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6877(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (interfaceC7190.mo12353() == 0 && AbstractC5506.m10691(this.f15200, interfaceC7190)) {
            while (mo10672(interfaceC7190) != -1) {
            }
        }
        C0191 c0191 = this.f15203;
        if (c0191.m656()) {
            AbstractC5506.m10690(c0191, "");
            throw null;
        }
        c0191.m693(this.f15199.end);
        C1609 c1609 = (C1609) c0191.f748;
        int i = c1609.f4716;
        int[] iArr = (int[]) c1609.f4713;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c1609.f4716 = i - 1;
        }
        int i2 = c1609.f4716;
        if (i2 != -1) {
            c1609.f4716 = i2 - 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        r0 = r3.f4716;
        r1 = (int[]) r3.f4713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r1[r0] != (-2)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        r1[r0] = -1;
        r3.f4716 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        r0 = r3.f4716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r0 == (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        r3.f4716 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r2.m679(kotlin.text.AbstractC5143.m10166(0, 6, ((java.lang.String) r2.f752).subSequence(0, r2.f750).toString(), r4), p007.AbstractC6136.m11558('\'', "Encountered an unknown key '", r4), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        throw null;
     */
    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo10672(p091.InterfaceC7190 r18) throws java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5497.mo10672(飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲):int");
    }

    @Override // p088.InterfaceC7177
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC7175 mo10655() {
        return new C5493(this.f15200.f19133, this.f15203).m10669();
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7186 mo6880(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return AbstractC5485.m10639(interfaceC7190) ? new C5508(this.f15203, this.f15200) : this;
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final char mo6881() {
        C0191 c0191 = this.f15203;
        String strM685 = c0191.m685();
        if (strM685.length() == 1) {
            return strM685.charAt(0);
        }
        C0191.m651(c0191, AbstractC6136.m11558('\'', "Expected single char, but got '", strM685), 0, null, 6);
        throw null;
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6882() {
        boolean z;
        boolean z2;
        C0191 c0191 = this.f15203;
        int iM659 = c0191.m659();
        String str = (String) c0191.f752;
        if (iM659 == str.length()) {
            C0191.m651(c0191, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM659) == '\"') {
            iM659++;
            z = true;
        } else {
            z = false;
        }
        int iM668 = c0191.m668(iM659);
        if (iM668 >= str.length() || iM668 == -1) {
            C0191.m651(c0191, "EOF", 0, null, 6);
            throw null;
        }
        int i = iM668 + 1;
        int iCharAt = str.charAt(iM668) | ' ';
        if (iCharAt == 102) {
            c0191.m674(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C0191.m651(c0191, "Expected valid boolean literal prefix, but had '" + c0191.m685() + '\'', 0, null, 6);
                throw null;
            }
            c0191.m674(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c0191.f750 == str.length()) {
            C0191.m651(c0191, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c0191.f750) == '\"') {
            c0191.f750++;
            return z2;
        }
        C0191.m651(c0191, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final double mo6883() {
        C0191 c0191 = this.f15203;
        String strM685 = c0191.m685();
        try {
            double d = Double.parseDouble(strM685);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            C0191.m651(c0191, AbstractC5506.m10692(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m651(c0191, AbstractC6136.m11558('\'', "Failed to parse type 'double' for input '", strM685), 0, null, 6);
            throw null;
        }
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final float mo6884() {
        C0191 c0191 = this.f15203;
        String strM685 = c0191.m685();
        try {
            float f = Float.parseFloat(strM685);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            C0191.m651(c0191, AbstractC5506.m10692(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m651(c0191, AbstractC6136.m11558('\'', "Failed to parse type 'float' for input '", strM685), 0, null, 6);
            throw null;
        }
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo6885() {
        C0191 c0191 = this.f15203;
        long jM694 = c0191.m694();
        short s = (short) jM694;
        if (jM694 == s) {
            return s;
        }
        C0191.m651(c0191, "Failed to parse short for input '" + jM694 + '\'', 0, null, 6);
        throw null;
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo6887() {
        C0191 c0191 = this.f15203;
        long jM694 = c0191.m694();
        byte b = (byte) jM694;
        if (jM694 == b) {
            return b;
        }
        C0191.m651(c0191, "Failed to parse byte for input '" + jM694 + '\'', 0, null, 6);
        throw null;
    }
}
