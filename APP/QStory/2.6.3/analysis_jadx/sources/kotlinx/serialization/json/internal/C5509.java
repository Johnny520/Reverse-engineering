package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C0191;
import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import kotlin.C5173;
import kotlin.C5178;
import kotlin.C5179;
import kotlin.C5181;
import kotlin.text.AbstractC5139;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p088.AbstractC7159;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5509 extends AbstractC6347 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1245 f15233;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0191 f15234;

    public C5509(C0191 c0191, AbstractC7159 abstractC7159) {
        abstractC7159.getClass();
        this.f15234 = c0191;
        this.f15233 = abstractC7159.f19127;
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo10665() {
        C0191 c0191 = this.f15234;
        String strM686 = c0191.m686();
        try {
            strM686.getClass();
            C5181 c5181M13678 = AbstractC8190.m13678(strM686);
            if (c5181M13678 != null) {
                return c5181M13678.f14744;
            }
            AbstractC5139.m10133(strM686);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m652(c0191, AbstractC6183.m11590('\'', "Failed to parse type 'UInt' for input '", strM686), 0, null, 6);
            throw null;
        }
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo10668() {
        C0191 c0191 = this.f15234;
        String strM686 = c0191.m686();
        try {
            strM686.getClass();
            C5179 c5179M13683 = AbstractC8190.m13683(strM686);
            if (c5179M13683 != null) {
                return c5179M13683.f14742;
            }
            AbstractC5139.m10133(strM686);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m652(c0191, AbstractC6183.m11590('\'', "Failed to parse type 'ULong' for input '", strM686), 0, null, 6);
            throw null;
        }
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10677() {
        return this.f15233;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo10698() {
        C5173 c5173;
        C0191 c0191 = this.f15234;
        String strM686 = c0191.m686();
        try {
            strM686.getClass();
            C5181 c5181M13678 = AbstractC8190.m13678(strM686);
            if (c5181M13678 != null) {
                int i = c5181M13678.f14744;
                c5173 = Integer.compareUnsigned(i, Opcodes.MAX_VALUE) > 0 ? null : new C5173((short) i);
            }
            if (c5173 != null) {
                return c5173.f14736;
            }
            AbstractC5139.m10133(strM686);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m652(c0191, AbstractC6183.m11590('\'', "Failed to parse type 'UShort' for input '", strM686), 0, null, 6);
            throw null;
        }
    }

    @Override // p034.AbstractC6347, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo10700() {
        C5178 c5178;
        C0191 c0191 = this.f15234;
        String strM686 = c0191.m686();
        try {
            strM686.getClass();
            C5181 c5181M13678 = AbstractC8190.m13678(strM686);
            if (c5181M13678 != null) {
                int i = c5181M13678.f14744;
                c5178 = Integer.compareUnsigned(i, Opcodes.CONST_METHOD_TYPE) > 0 ? null : new C5178((byte) i);
            }
            if (c5178 != null) {
                return c5178.f14741;
            }
            AbstractC5139.m10133(strM686);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m652(c0191, AbstractC6183.m11590('\'', "Failed to parse type 'UByte' for input '", strM686), 0, null, 6);
            throw null;
        }
    }
}
