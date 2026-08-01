package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C1038;
import androidx.compose.runtime.internal.C2080;
import com.android.p002dx.p005io.Opcodes;
import kotlin.C6005;
import kotlin.C6010;
import kotlin.C6011;
import kotlin.C6013;
import kotlin.text.AbstractC5971;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p104.AbstractC7988;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6341 extends AbstractC7176 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2080 f15578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1038 f15579;

    public C6341(C1038 c1038, AbstractC7988 abstractC7988) {
        abstractC7988.getClass();
        this.f15579 = c1038;
        this.f15578 = abstractC7988.f19472;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo11224() {
        C1038 c1038 = this.f15579;
        String strM1246 = c1038.m1246();
        try {
            strM1246.getClass();
            C6013 c6013M14237 = AbstractC9019.m14237(strM1246);
            if (c6013M14237 != null) {
                return c6013M14237.f15089;
            }
            AbstractC5971.m10692(strM1246);
            throw null;
        } catch (IllegalArgumentException unused) {
            C1038.m1212(c1038, AbstractC7012.m12149('\'', "Failed to parse type 'UInt' for input '", strM1246), 0, null, 6);
            throw null;
        }
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo11227() {
        C1038 c1038 = this.f15579;
        String strM1246 = c1038.m1246();
        try {
            strM1246.getClass();
            C6011 c6011M14242 = AbstractC9019.m14242(strM1246);
            if (c6011M14242 != null) {
                return c6011M14242.f15087;
            }
            AbstractC5971.m10692(strM1246);
            throw null;
        } catch (IllegalArgumentException unused) {
            C1038.m1212(c1038, AbstractC7012.m12149('\'', "Failed to parse type 'ULong' for input '", strM1246), 0, null, 6);
            throw null;
        }
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2080 mo11236() {
        return this.f15578;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo11257() {
        C6005 c6005;
        C1038 c1038 = this.f15579;
        String strM1246 = c1038.m1246();
        try {
            strM1246.getClass();
            C6013 c6013M14237 = AbstractC9019.m14237(strM1246);
            if (c6013M14237 != null) {
                int i = c6013M14237.f15089;
                c6005 = Integer.compareUnsigned(i, Opcodes.MAX_VALUE) > 0 ? null : new C6005((short) i);
            }
            if (c6005 != null) {
                return c6005.f15081;
            }
            AbstractC5971.m10692(strM1246);
            throw null;
        } catch (IllegalArgumentException unused) {
            C1038.m1212(c1038, AbstractC7012.m12149('\'', "Failed to parse type 'UShort' for input '", strM1246), 0, null, 6);
            throw null;
        }
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo11259() {
        C6010 c6010;
        C1038 c1038 = this.f15579;
        String strM1246 = c1038.m1246();
        try {
            strM1246.getClass();
            C6013 c6013M14237 = AbstractC9019.m14237(strM1246);
            if (c6013M14237 != null) {
                int i = c6013M14237.f15089;
                c6010 = Integer.compareUnsigned(i, Opcodes.CONST_METHOD_TYPE) > 0 ? null : new C6010((byte) i);
            }
            if (c6010 != null) {
                return c6010.f15086;
            }
            AbstractC5971.m10692(strM1246);
            throw null;
        } catch (IllegalArgumentException unused) {
            C1038.m1212(c1038, AbstractC7012.m12149('\'', "Failed to parse type 'UByte' for input '", strM1246), 0, null, 6);
            throw null;
        }
    }
}
