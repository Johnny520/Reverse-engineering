package retrofit2;

import java.io.IOException;
import p005.AbstractC6121;
import p005.C6101;
import p005.InterfaceC6119;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5785 extends AbstractC6121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5769 f15881;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5785(C5769 c5769, InterfaceC6119 interfaceC6119) {
        super(interfaceC6119);
        this.f15881 = c5769;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) throws IOException {
        try {
            c6101.getClass();
            return this.f16703.mo10876(c6101, 8192L);
        } catch (IOException e) {
            this.f15881.f15839 = e;
            throw e;
        }
    }
}
