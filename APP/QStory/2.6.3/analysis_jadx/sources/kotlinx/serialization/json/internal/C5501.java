package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import p088.AbstractC7159;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.C7152;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5501 extends C5503 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f15214;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f15215;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f15216;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7152 f15217;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5501(AbstractC7159 abstractC7159, C7152 c7152) {
        super(abstractC7159, c7152, (String) null, 12);
        abstractC7159.getClass();
        this.f15217 = c7152;
        List listM8797 = AbstractC4344.m8797(c7152.f19116.keySet());
        this.f15216 = listM8797;
        this.f15215 = listM8797.size() * 2;
        this.f15214 = -1;
    }

    @Override // kotlinx.serialization.json.internal.C5503
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C7152 mo10664() {
        return this.f15217;
    }

    @Override // kotlinx.serialization.json.internal.C5503, kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC7176 mo10664() {
        return this.f15217;
    }

    @Override // kotlinx.serialization.json.internal.C5503, kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC7176 mo10673(String str) {
        str.getClass();
        return this.f15214 % 2 == 0 ? AbstractC7168.m12432(str) : (AbstractC7176) AbstractC4339.m8773(str, this.f15217);
    }

    @Override // kotlinx.serialization.json.internal.C5503, kotlinx.serialization.json.internal.AbstractC5492, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10678(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
    }

    @Override // kotlinx.serialization.json.internal.C5503, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        int i = this.f15214;
        if (i >= this.f15215 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f15214 = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.C5503, kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final String mo10683(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return (String) this.f15216.get(i / 2);
    }
}
