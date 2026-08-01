package p167;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7711 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f20913;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0455 f20914;

    public C7711(AbstractC0455 abstractC0455, ThreadPoolExecutor threadPoolExecutor) {
        this.f20914 = abstractC0455;
        this.f20913 = threadPoolExecutor;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo1179(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f20913;
        try {
            this.f20914.mo1179(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1180(C0325 c0325) {
        ThreadPoolExecutor threadPoolExecutor = this.f20913;
        try {
            this.f20914.mo1180(c0325);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
