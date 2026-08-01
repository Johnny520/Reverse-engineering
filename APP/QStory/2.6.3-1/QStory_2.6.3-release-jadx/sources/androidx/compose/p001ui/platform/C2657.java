package androidx.compose.p001ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.C5183;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.internal.AbstractC6197;
import p034.AbstractC7082;
import p068.InterfaceC7372;
import p111.C8036;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2657 extends AbstractC6264 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C2659 f5648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f5652;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f5653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Choreographer f5656;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Handler f5657;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final InterfaceC6016 f5647 = AbstractC6019.m10773(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // p068.InterfaceC7372
        public final InterfaceC5192 invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                C8036 c8036 = AbstractC6227.f15375;
                choreographer = (Choreographer) AbstractC6231.m11044(AbstractC6197.f15305, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
            }
            C2657 c2657 = new C2657(choreographer, AbstractC7082.m12298(Looper.getMainLooper()));
            return c2657.plus(c2657.f5648);
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C2667 f5646 = new C2667(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f5651 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5183 f5650 = new C5183();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ArrayList f5654 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ArrayList f5655 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ChoreographerFrameCallbackC2658 f5649 = new ChoreographerFrameCallbackC2658(this);

    public C2657(Choreographer choreographer, Handler handler) {
        this.f5656 = choreographer;
        this.f5657 = handler;
        this.f5648 = new C2659(choreographer, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m4017(C2657 c2657) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (c2657.f5651) {
                C5183 c5183 = c2657.f5650;
                runnable = (Runnable) (c5183.isEmpty() ? null : c5183.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c2657.f5651) {
                    C5183 c51832 = c2657.f5650;
                    runnable = (Runnable) (c51832.isEmpty() ? null : c51832.removeFirst());
                }
            }
            synchronized (c2657.f5651) {
                if (c2657.f5650.isEmpty()) {
                    z = false;
                    c2657.f5652 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable) {
        synchronized (this.f5651) {
            this.f5650.addLast(runnable);
            if (!this.f5652) {
                this.f5652 = true;
                this.f5657.post(this.f5649);
                if (!this.f5653) {
                    this.f5653 = true;
                    this.f5656.postFrameCallback(this.f5649);
                }
            }
        }
    }
}
