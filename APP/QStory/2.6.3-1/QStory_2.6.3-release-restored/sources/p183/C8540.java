package p183;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8540 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f21258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1298 f21259;

    public C8540(AbstractC1298 abstractC1298, ThreadPoolExecutor threadPoolExecutor) {
        this.f21259 = abstractC1298;
        this.f21258 = threadPoolExecutor;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo1739(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f21258;
        try {
            this.f21259.mo1739(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1740(C1171 c1171) {
        ThreadPoolExecutor threadPoolExecutor = this.f21258;
        try {
            this.f21259.mo1740(c1171);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
