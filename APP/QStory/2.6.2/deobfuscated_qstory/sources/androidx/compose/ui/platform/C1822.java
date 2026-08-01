package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.C4350;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.coroutines.internal.AbstractC5364;
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p095.C7206;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1822 extends AbstractC5431 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1824 f5302;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f5306;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f5307;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Choreographer f5310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Handler f5311;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final InterfaceC5183 f5301 = AbstractC5186.m10210(new InterfaceC6542() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // p052.InterfaceC6542
        public final InterfaceC4359 invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                C7206 c7206 = AbstractC5394.f15030;
                choreographer = (Choreographer) AbstractC5398.m10481(AbstractC5364.f14960, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
            }
            C1822 c1822 = new C1822(choreographer, AbstractC6325.m11873(Looper.getMainLooper()));
            return c1822.plus(c1822.f5302);
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C1832 f5300 = new C1832(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f5305 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4350 f5304 = new C4350();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ArrayList f5308 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ArrayList f5309 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ChoreographerFrameCallbackC1823 f5303 = new ChoreographerFrameCallbackC1823(this);

    public C1822(Choreographer choreographer, Handler handler) {
        this.f5310 = choreographer;
        this.f5311 = handler;
        this.f5302 = new C1824(choreographer, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m3447(C1822 c1822) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (c1822.f5305) {
                C4350 c4350 = c1822.f5304;
                runnable = (Runnable) (c4350.isEmpty() ? null : c4350.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c1822.f5305) {
                    C4350 c43502 = c1822.f5304;
                    runnable = (Runnable) (c43502.isEmpty() ? null : c43502.removeFirst());
                }
            }
            synchronized (c1822.f5305) {
                if (c1822.f5304.isEmpty()) {
                    z = false;
                    c1822.f5306 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable) {
        synchronized (this.f5305) {
            this.f5304.addLast(runnable);
            if (!this.f5306) {
                this.f5306 = true;
                this.f5311.post(this.f5303);
                if (!this.f5307) {
                    this.f5307 = true;
                    this.f5310.postFrameCallback(this.f5303);
                }
            }
        }
    }
}
