package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C0191;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.C1609;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p088.AbstractC7159;
import p088.AbstractC7176;
import p088.C7177;
import p088.InterfaceC7178;
import p089.InterfaceC7184;
import p090.InterfaceC7187;
import p090.InterfaceC7189;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5498 extends AbstractC6347 implements InterfaceC7178 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5510 f15197;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0191 f15198;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final WriteMode f15199;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C4485 f15200;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C7177 f15201;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1245 f15202;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f15203;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7159 f15204;

    public C5498(AbstractC7159 abstractC7159, WriteMode writeMode, C0191 c0191, InterfaceC7191 interfaceC7191, C4485 c4485) {
        writeMode.getClass();
        interfaceC7191.getClass();
        this.f15204 = abstractC7159;
        this.f15199 = writeMode;
        this.f15198 = c0191;
        this.f15202 = abstractC7159.f19127;
        this.f15203 = -1;
        this.f15200 = c4485;
        C7177 c7177 = abstractC7159.f19128;
        this.f15201 = c7177;
        this.f15197 = c7177.f19153 ? null : new C5510(interfaceC7191);
    }

    @Override // p088.InterfaceC7178
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final AbstractC7159 mo10656() {
        return this.f15204;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10657(p089.InterfaceC7184 r19) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5498.mo10657(飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo10658() {
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
            androidx.appcompat.widget.飘花落叶言子楪兰世哲苏 r9 = r9.f15198
            int r1 = r9.m660()
            int r1 = r9.m669(r1)
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
            byte r2 = kotlinx.serialization.json.internal.AbstractC5507.m10739(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5498.mo10658():boolean");
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final String mo10662() {
        boolean z = this.f15201.f19155;
        C0191 c0191 = this.f15198;
        return z ? c0191.m685() : c0191.m693();
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo10665() {
        C0191 c0191 = this.f15198;
        long jM695 = c0191.m695();
        int i = (int) jM695;
        if (jM695 == i) {
            return i;
        }
        C0191.m652(c0191, "Failed to parse int for input '" + jM695 + '\'', 0, null, 6);
        throw null;
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo10668() {
        return this.f15198.m695();
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final int mo10672(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return AbstractC5507.m10756(interfaceC7191, this.f15204, mo10662(), " at path ".concat(((C1609) this.f15198.f748).m2963()));
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo10674(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        C1609 c1609 = (C1609) this.f15198.f748;
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        boolean z = this.f15199 == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c1609.f4714;
            int i2 = c1609.f4717;
            if (iArr[i2] == -2) {
                ((Object[]) c1609.f4715)[i2] = C5508.f15231;
            }
        }
        Object objMo10657 = mo10657(interfaceC7184);
        if (z) {
            int[] iArr2 = (int[]) c1609.f4714;
            int i3 = c1609.f4717;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c1609.f4717 = i4;
                if (i4 == ((Object[]) c1609.f4715).length) {
                    c1609.m2960();
                }
            }
            Object[] objArr = (Object[]) c1609.f4715;
            int i5 = c1609.f4717;
            objArr[i5] = ((C7177) c1609.f4716).f19161 ? objMo10657 : C5508.f15232;
            ((int[]) c1609.f4714)[i5] = -2;
        }
        return objMo10657;
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7189 mo10676(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        AbstractC7159 abstractC7159 = this.f15204;
        WriteMode writeModeM10746 = AbstractC5507.m10746(abstractC7159, interfaceC7191);
        C0191 c0191 = this.f15198;
        C1609 c1609 = (C1609) c0191.f748;
        c1609.getClass();
        int i = c1609.f4717 + 1;
        c1609.f4717 = i;
        if (i == ((Object[]) c1609.f4715).length) {
            c1609.m2960();
        }
        ((Object[]) c1609.f4715)[i] = interfaceC7191;
        c0191.m694(writeModeM10746.begin);
        if (c0191.m673() != 4) {
            int i2 = AbstractC5497.f15196[writeModeM10746.ordinal()];
            return (i2 == 1 || i2 == 2 || i2 == 3) ? new C5498(abstractC7159, writeModeM10746, c0191, interfaceC7191, this.f15200) : (this.f15199 == writeModeM10746 && abstractC7159.f19128.f19153) ? this : new C5498(abstractC7159, writeModeM10746, c0191, interfaceC7191, this.f15200);
        }
        C0191.m652(c0191, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10677() {
        return this.f15202;
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10678(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (interfaceC7191.mo12380() == 0 && AbstractC5507.m10748(this.f15204, interfaceC7191)) {
            while (mo10718(interfaceC7191) != -1) {
            }
        }
        C0191 c0191 = this.f15198;
        if (c0191.m657()) {
            AbstractC5507.m10747(c0191, "");
            throw null;
        }
        c0191.m694(this.f15199.end);
        C1609 c1609 = (C1609) c0191.f748;
        int i = c1609.f4717;
        int[] iArr = (int[]) c1609.f4714;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c1609.f4717 = i - 1;
        }
        int i2 = c1609.f4717;
        if (i2 != -1) {
            c1609.f4717 = i2 - 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        r0 = r3.f4717;
        r1 = (int[]) r3.f4714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r1[r0] != (-2)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        r1[r0] = -1;
        r3.f4717 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        r0 = r3.f4717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r0 == (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        r3.f4717 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r2.m680(kotlin.text.AbstractC5144.m10169(0, 6, ((java.lang.String) r2.f752).subSequence(0, r2.f750).toString(), r4), p009.AbstractC6183.m11590('\'', "Encountered an unknown key '", r4), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        throw null;
     */
    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo10718(p091.InterfaceC7191 r18) throws java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5498.mo10718(飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲):int");
    }

    @Override // p088.InterfaceC7178
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC7176 mo10681() {
        return new C5494(this.f15204.f19128, this.f15198).m10704();
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7187 mo10689(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return AbstractC5486.m10643(interfaceC7191) ? new C5509(this.f15198, this.f15204) : this;
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final char mo10690() {
        C0191 c0191 = this.f15198;
        String strM686 = c0191.m686();
        if (strM686.length() == 1) {
            return strM686.charAt(0);
        }
        C0191.m652(c0191, AbstractC6183.m11590('\'', "Expected single char, but got '", strM686), 0, null, 6);
        throw null;
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo10691() {
        boolean z;
        boolean z2;
        C0191 c0191 = this.f15198;
        int iM660 = c0191.m660();
        String str = (String) c0191.f752;
        if (iM660 == str.length()) {
            C0191.m652(c0191, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM660) == '\"') {
            iM660++;
            z = true;
        } else {
            z = false;
        }
        int iM669 = c0191.m669(iM660);
        if (iM669 >= str.length() || iM669 == -1) {
            C0191.m652(c0191, "EOF", 0, null, 6);
            throw null;
        }
        int i = iM669 + 1;
        int iCharAt = str.charAt(iM669) | ' ';
        if (iCharAt == 102) {
            c0191.m675(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C0191.m652(c0191, "Expected valid boolean literal prefix, but had '" + c0191.m686() + '\'', 0, null, 6);
                throw null;
            }
            c0191.m675(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c0191.f750 == str.length()) {
            C0191.m652(c0191, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c0191.f750) == '\"') {
            c0191.f750++;
            return z2;
        }
        C0191.m652(c0191, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final double mo10696() {
        C0191 c0191 = this.f15198;
        String strM686 = c0191.m686();
        try {
            double d = Double.parseDouble(strM686);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            C0191.m652(c0191, AbstractC5507.m10749(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m652(c0191, AbstractC6183.m11590('\'', "Failed to parse type 'double' for input '", strM686), 0, null, 6);
            throw null;
        }
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final float mo10697() {
        C0191 c0191 = this.f15198;
        String strM686 = c0191.m686();
        try {
            float f = Float.parseFloat(strM686);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            C0191.m652(c0191, AbstractC5507.m10749(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m652(c0191, AbstractC6183.m11590('\'', "Failed to parse type 'float' for input '", strM686), 0, null, 6);
            throw null;
        }
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo10698() {
        C0191 c0191 = this.f15198;
        long jM695 = c0191.m695();
        short s = (short) jM695;
        if (jM695 == s) {
            return s;
        }
        C0191.m652(c0191, "Failed to parse short for input '" + jM695 + '\'', 0, null, 6);
        throw null;
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo10700() {
        C0191 c0191 = this.f15198;
        long jM695 = c0191.m695();
        byte b = (byte) jM695;
        if (jM695 == b) {
            return b;
        }
        C0191.m652(c0191, "Failed to parse byte for input '" + jM695 + '\'', 0, null, 6);
        throw null;
    }
}
