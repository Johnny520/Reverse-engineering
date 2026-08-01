package p093;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.RunnableC0099;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.C5454;
import kotlinx.coroutines.InterfaceC5397;
import kotlinx.coroutines.InterfaceC5405;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.internal.AbstractC5364;
import p087.C7067;
import p095.C7206;
import p095.ExecutorC7207;

/* JADX INFO: renamed from: 飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7200 extends AbstractC5431 implements InterfaceC5405 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7200 f19218;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f19219;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Handler f19220;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f19221;

    public C7200(Handler handler, String str, boolean z) {
        this.f19220 = handler;
        this.f19221 = str;
        this.f19219 = z;
        this.f19218 = z ? this : new C7200(handler, str, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7200)) {
            return false;
        }
        C7200 c7200 = (C7200) obj;
        return c7200.f19220 == this.f19220 && c7200.f19219 == this.f19219;
    }

    public final int hashCode() {
        return (this.f19219 ? 1231 : 1237) ^ System.identityHashCode(this.f19220);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    public final String toString() {
        C7200 c7200;
        String str;
        C7206 c7206 = AbstractC5394.f15030;
        C7200 c72002 = AbstractC5364.f14960;
        if (this == c72002) {
            str = "Dispatchers.Main";
        } else {
            try {
                c7200 = c72002.f19218;
            } catch (UnsupportedOperationException unused) {
                c7200 = null;
            }
            str = this == c7200 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f19221;
        if (string == null) {
            string = this.f19220.toString();
        }
        return this.f19219 ? AbstractC0053.m136(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.InterfaceC5405
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5397 mo10336(long j, final Runnable runnable, InterfaceC4359 interfaceC4359) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f19220.postDelayed(runnable, j)) {
            return new InterfaceC5397() { // from class: 飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲苏兰
                @Override // kotlinx.coroutines.InterfaceC5397
                public final void dispose() {
                    this.f19223.f19220.removeCallbacks(runnable);
                }
            };
        }
        m12412(interfaceC4359, runnable);
        return C5454.f15106;
    }

    @Override // kotlinx.coroutines.InterfaceC5405
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10337(long j, C5443 c5443) {
        RunnableC0099 runnableC0099 = new RunnableC0099(c5443, 18, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f19220.postDelayed(runnableC0099, j)) {
            c5443.m10537(new C7067(this, 1, runnableC0099));
        } else {
            m12412(c5443.f15095, runnableC0099);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m12412(InterfaceC4359 interfaceC4359, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) interfaceC4359.get(C5452.f15105);
        if (interfaceC5451 != null) {
            interfaceC5451.mo10252(cancellationException);
        }
        C7206 c7206 = AbstractC5394.f15030;
        ExecutorC7207.f19230.mo3448(interfaceC4359, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable) {
        if (this.f19220.post(runnable)) {
            return;
        }
        m12412(interfaceC4359, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo4481(InterfaceC4359 interfaceC4359) {
        return (this.f19219 && AbstractC4394.m8917(Looper.myLooper(), this.f19220.getLooper())) ? false : true;
    }

    public C7200(Handler handler) {
        this(handler, null, false);
    }
}
