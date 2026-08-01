package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C0191;
import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3065;
import kotlin.C5172;
import kotlin.C5177;
import kotlin.C5178;
import kotlin.C5180;
import kotlin.text.AbstractC5138;
import p007.AbstractC6136;
import p088.AbstractC7158;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5508 extends AbstractC3065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1245 f15233;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0191 f15234;

    public C5508(C0191 c0191, AbstractC7158 abstractC7158) {
        abstractC7158.getClass();
        this.f15234 = c0191;
        this.f15233 = abstractC7158.f19132;
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo6868() {
        C0191 c0191 = this.f15234;
        String strM685 = c0191.m685();
        try {
            strM685.getClass();
            C5180 c5180M6582 = AbstractC3054.m6582(strM685);
            if (c5180M6582 != null) {
                return c5180M6582.f14744;
            }
            AbstractC5138.m10131(strM685);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m651(c0191, AbstractC6136.m11558('\'', "Failed to parse type 'UInt' for input '", strM685), 0, null, 6);
            throw null;
        }
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo6869() {
        C0191 c0191 = this.f15234;
        String strM685 = c0191.m685();
        try {
            strM685.getClass();
            C5178 c5178M6581 = AbstractC3054.m6581(strM685);
            if (c5178M6581 != null) {
                return c5178M6581.f14742;
            }
            AbstractC5138.m10131(strM685);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m651(c0191, AbstractC6136.m11558('\'', "Failed to parse type 'ULong' for input '", strM685), 0, null, 6);
            throw null;
        }
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10652() {
        return this.f15233;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo6885() {
        C5172 c5172;
        C0191 c0191 = this.f15234;
        String strM685 = c0191.m685();
        try {
            strM685.getClass();
            C5180 c5180M6582 = AbstractC3054.m6582(strM685);
            if (c5180M6582 != null) {
                int i = c5180M6582.f14744;
                c5172 = Integer.compareUnsigned(i, Opcodes.MAX_VALUE) > 0 ? null : new C5172((short) i);
            }
            if (c5172 != null) {
                return c5172.f14736;
            }
            AbstractC5138.m10131(strM685);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m651(c0191, AbstractC6136.m11558('\'', "Failed to parse type 'UShort' for input '", strM685), 0, null, 6);
            throw null;
        }
    }

    @Override // com.bumptech.glide.AbstractC3065, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo6887() {
        C5177 c5177;
        C0191 c0191 = this.f15234;
        String strM685 = c0191.m685();
        try {
            strM685.getClass();
            C5180 c5180M6582 = AbstractC3054.m6582(strM685);
            if (c5180M6582 != null) {
                int i = c5180M6582.f14744;
                c5177 = Integer.compareUnsigned(i, Opcodes.CONST_METHOD_TYPE) > 0 ? null : new C5177((byte) i);
            }
            if (c5177 != null) {
                return c5177.f14741;
            }
            AbstractC5138.m10131(strM685);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0191.m651(c0191, AbstractC6136.m11558('\'', "Failed to parse type 'UByte' for input '", strM685), 0, null, 6);
            throw null;
        }
    }
}
