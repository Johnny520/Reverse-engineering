package p109;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.RunnableC0946;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.C6287;
import kotlinx.coroutines.InterfaceC6230;
import kotlinx.coroutines.InterfaceC6238;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.internal.AbstractC6197;
import p103.C7897;
import p111.C8036;
import p111.ExecutorC8037;

/* JADX INFO: renamed from: 飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8030 extends AbstractC6264 implements InterfaceC6238 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8030 f19558;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f19559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Handler f19560;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f19561;

    public C8030(Handler handler, String str, boolean z) {
        this.f19560 = handler;
        this.f19561 = str;
        this.f19559 = z;
        this.f19558 = z ? this : new C8030(handler, str, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8030)) {
            return false;
        }
        C8030 c8030 = (C8030) obj;
        return c8030.f19560 == this.f19560 && c8030.f19559 == this.f19559;
    }

    public final int hashCode() {
        return (this.f19559 ? 1231 : 1237) ^ System.identityHashCode(this.f19560);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    public final String toString() {
        C8030 c8030;
        String str;
        C8036 c8036 = AbstractC6227.f15375;
        C8030 c80302 = AbstractC6197.f15305;
        if (this == c80302) {
            str = "Dispatchers.Main";
        } else {
            try {
                c8030 = c80302.f19558;
            } catch (UnsupportedOperationException unused) {
                c8030 = null;
            }
            str = this == c8030 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f19561;
        if (string == null) {
            string = this.f19560.toString();
        }
        return this.f19559 ? AbstractC0900.m696(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.InterfaceC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC6230 mo10899(long j, final Runnable runnable, InterfaceC5192 interfaceC5192) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f19560.postDelayed(runnable, j)) {
            return new InterfaceC6230() { // from class: 飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲苏兰
                @Override // kotlinx.coroutines.InterfaceC6230
                public final void dispose() {
                    this.f19563.f19560.removeCallbacks(runnable);
                }
            };
        }
        m12998(interfaceC5192, runnable);
        return C6287.f15451;
    }

    @Override // kotlinx.coroutines.InterfaceC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10900(long j, C6276 c6276) {
        RunnableC0946 runnableC0946 = new RunnableC0946(c6276, 18, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f19560.postDelayed(runnableC0946, j)) {
            c6276.m11100(new C7897(this, 1, runnableC0946));
        } else {
            m12998(c6276.f15440, runnableC0946);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m12998(InterfaceC5192 interfaceC5192, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) interfaceC5192.get(C6285.f15450);
        if (interfaceC6284 != null) {
            interfaceC6284.mo10815(cancellationException);
        }
        C8036 c8036 = AbstractC6227.f15375;
        ExecutorC8037.f19570.mo4018(interfaceC5192, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable) {
        if (this.f19560.post(runnable)) {
            return;
        }
        m12998(interfaceC5192, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo5051(InterfaceC5192 interfaceC5192) {
        return (this.f19559 && AbstractC5227.m9466(Looper.myLooper(), this.f19560.getLooper())) ? false : true;
    }

    public C8030(Handler handler) {
        this(handler, null, false);
    }
}
