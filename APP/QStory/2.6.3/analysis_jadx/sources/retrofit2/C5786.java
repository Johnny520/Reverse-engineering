package retrofit2;

import java.io.IOException;
import p004.AbstractC6112;
import p004.C6092;
import p004.InterfaceC6110;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5786 extends AbstractC6112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5770 f15881;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5786(C5770 c5770, InterfaceC6110 interfaceC6110) {
        super(interfaceC6110);
        this.f15881 = c5770;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        try {
            c6092.getClass();
            return this.f16693.mo10932(c6092, 8192L);
        } catch (IOException e) {
            this.f15881.f15839 = e;
            throw e;
        }
    }
}
