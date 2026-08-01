package kotlinx.serialization.json.internal;

import p088.AbstractC7159;
import p088.AbstractC7176;
import p088.C7157;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5504 extends AbstractC5492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f15224;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7157 f15225;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f15226;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5504(AbstractC7159 abstractC7159, C7157 c7157) {
        super(abstractC7159, null);
        abstractC7159.getClass();
        c7157.getClass();
        this.f15225 = c7157;
        this.f15226 = c7157.f19124.size();
        this.f15224 = -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC7176 mo10664() {
        return this.f15225;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC7176 mo10673(String str) {
        str.getClass();
        return (AbstractC7176) this.f15225.f19124.get(Integer.parseInt(str));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        int i = this.f15224;
        if (i >= this.f15226 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f15224 = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final String mo10683(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return String.valueOf(i);
    }
}
