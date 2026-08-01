package kotlinx.serialization.json.internal;

import p088.AbstractC7158;
import p088.AbstractC7175;
import p088.C7156;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5503 extends AbstractC5491 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f15224;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7156 f15225;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f15226;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5503(AbstractC7158 abstractC7158, C7156 c7156) {
        super(abstractC7158, null);
        abstractC7158.getClass();
        c7156.getClass();
        this.f15225 = c7156;
        this.f15226 = c7156.f19129.size();
        this.f15224 = -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC7175 mo10648() {
        return this.f15225;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC7175 mo10651(String str) {
        str.getClass();
        return (AbstractC7175) this.f15225.f19129.get(Integer.parseInt(str));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        int i = this.f15224;
        if (i >= this.f15226 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f15224 = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final String mo10657(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return String.valueOf(i);
    }
}
