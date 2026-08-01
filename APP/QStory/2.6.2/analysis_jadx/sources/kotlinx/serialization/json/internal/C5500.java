package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import p088.AbstractC7158;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.C7151;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5500 extends C5502 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f15214;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f15215;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f15216;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7151 f15217;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5500(AbstractC7158 abstractC7158, C7151 c7151) {
        super(abstractC7158, c7151, (String) null, 12);
        abstractC7158.getClass();
        this.f15217 = c7151;
        List listM8804 = AbstractC4343.m8804(c7151.f19121.keySet());
        this.f15216 = listM8804;
        this.f15215 = listM8804.size() * 2;
        this.f15214 = -1;
    }

    @Override // kotlinx.serialization.json.internal.C5502
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C7151 mo10648() {
        return this.f15217;
    }

    @Override // kotlinx.serialization.json.internal.C5502, kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC7175 mo10648() {
        return this.f15217;
    }

    @Override // kotlinx.serialization.json.internal.C5502, kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC7175 mo10651(String str) {
        str.getClass();
        return this.f15214 % 2 == 0 ? AbstractC7167.m12405(str) : (AbstractC7175) AbstractC4338.m8780(str, this.f15217);
    }

    @Override // kotlinx.serialization.json.internal.C5502, kotlinx.serialization.json.internal.AbstractC5491, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6877(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
    }

    @Override // kotlinx.serialization.json.internal.C5502, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        int i = this.f15214;
        if (i >= this.f15215 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f15214 = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.C5502, kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final String mo10657(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return (String) this.f15216.get(i / 2);
    }
}
