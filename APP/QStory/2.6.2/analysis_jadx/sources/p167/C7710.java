package p167;

import androidx.compose.animation.core.C0325;
import java.util.concurrent.ThreadPoolExecutor;
import p251.AbstractC8174;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7710 extends AbstractC8174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f20918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8174 f20919;

    public C7710(AbstractC8174 abstractC8174, ThreadPoolExecutor threadPoolExecutor) {
        this.f20919 = abstractC8174;
        this.f20918 = threadPoolExecutor;
    }

    @Override // p251.AbstractC8174
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo12961(C0325 c0325) {
        ThreadPoolExecutor threadPoolExecutor = this.f20918;
        try {
            this.f20919.mo12961(c0325);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p251.AbstractC8174
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo12962(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f20918;
        try {
            this.f20919.mo12962(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
