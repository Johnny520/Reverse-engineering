package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.C4351;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.internal.AbstractC5365;
import p018.AbstractC6253;
import p052.InterfaceC6543;
import p095.C7207;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1822 extends AbstractC5432 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1824 f5303;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f5307;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f5308;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Choreographer f5311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Handler f5312;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final InterfaceC5184 f5302 = AbstractC5187.m10214(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // p052.InterfaceC6543
        public final InterfaceC4360 invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                C7207 c7207 = AbstractC5395.f15030;
                choreographer = (Choreographer) AbstractC5399.m10485(AbstractC5365.f14960, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
            }
            C1822 c1822 = new C1822(choreographer, AbstractC6253.m11739(Looper.getMainLooper()));
            return c1822.plus(c1822.f5303);
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C1832 f5301 = new C1832(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f5306 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4351 f5305 = new C4351();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ArrayList f5309 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ArrayList f5310 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ChoreographerFrameCallbackC1823 f5304 = new ChoreographerFrameCallbackC1823(this);

    public C1822(Choreographer choreographer, Handler handler) {
        this.f5311 = choreographer;
        this.f5312 = handler;
        this.f5303 = new C1824(choreographer, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m3457(C1822 c1822) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (c1822.f5306) {
                C4351 c4351 = c1822.f5305;
                runnable = (Runnable) (c4351.isEmpty() ? null : c4351.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c1822.f5306) {
                    C4351 c43512 = c1822.f5305;
                    runnable = (Runnable) (c43512.isEmpty() ? null : c43512.removeFirst());
                }
            }
            synchronized (c1822.f5306) {
                if (c1822.f5305.isEmpty()) {
                    z = false;
                    c1822.f5307 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable) {
        synchronized (this.f5306) {
            this.f5305.addLast(runnable);
            if (!this.f5307) {
                this.f5307 = true;
                this.f5312.post(this.f5304);
                if (!this.f5308) {
                    this.f5308 = true;
                    this.f5311.postFrameCallback(this.f5304);
                }
            }
        }
    }
}
