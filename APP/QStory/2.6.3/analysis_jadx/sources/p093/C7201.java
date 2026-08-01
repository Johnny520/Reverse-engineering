package p093;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.RunnableC0099;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.C5455;
import kotlinx.coroutines.InterfaceC5398;
import kotlinx.coroutines.InterfaceC5406;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.internal.AbstractC5365;
import p087.C7068;
import p095.C7207;
import p095.ExecutorC7208;

/* JADX INFO: renamed from: 飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7201 extends AbstractC5432 implements InterfaceC5406 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7201 f19213;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f19214;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Handler f19215;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f19216;

    public C7201(Handler handler, String str, boolean z) {
        this.f19215 = handler;
        this.f19216 = str;
        this.f19214 = z;
        this.f19213 = z ? this : new C7201(handler, str, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7201)) {
            return false;
        }
        C7201 c7201 = (C7201) obj;
        return c7201.f19215 == this.f19215 && c7201.f19214 == this.f19214;
    }

    public final int hashCode() {
        return (this.f19214 ? 1231 : 1237) ^ System.identityHashCode(this.f19215);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    public final String toString() {
        C7201 c7201;
        String str;
        C7207 c7207 = AbstractC5395.f15030;
        C7201 c72012 = AbstractC5365.f14960;
        if (this == c72012) {
            str = "Dispatchers.Main";
        } else {
            try {
                c7201 = c72012.f19213;
            } catch (UnsupportedOperationException unused) {
                c7201 = null;
            }
            str = this == c7201 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f19216;
        if (string == null) {
            string = this.f19215.toString();
        }
        return this.f19214 ? AbstractC0053.m136(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.InterfaceC5406
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5398 mo10340(long j, final Runnable runnable, InterfaceC4360 interfaceC4360) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f19215.postDelayed(runnable, j)) {
            return new InterfaceC5398() { // from class: 飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲苏兰
                @Override // kotlinx.coroutines.InterfaceC5398
                public final void dispose() {
                    this.f19218.f19215.removeCallbacks(runnable);
                }
            };
        }
        m12439(interfaceC4360, runnable);
        return C5455.f15106;
    }

    @Override // kotlinx.coroutines.InterfaceC5406
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10341(long j, C5444 c5444) {
        RunnableC0099 runnableC0099 = new RunnableC0099(c5444, 18, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f19215.postDelayed(runnableC0099, j)) {
            c5444.m10541(new C7068(this, 1, runnableC0099));
        } else {
            m12439(c5444.f15095, runnableC0099);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m12439(InterfaceC4360 interfaceC4360, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) interfaceC4360.get(C5453.f15105);
        if (interfaceC5452 != null) {
            interfaceC5452.mo10256(cancellationException);
        }
        C7207 c7207 = AbstractC5395.f15030;
        ExecutorC7208.f19225.mo3458(interfaceC4360, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable) {
        if (this.f19215.post(runnable)) {
            return;
        }
        m12439(interfaceC4360, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo4491(InterfaceC4360 interfaceC4360) {
        return (this.f19214 && AbstractC4395.m8907(Looper.myLooper(), this.f19215.getLooper())) ? false : true;
    }

    public C7201(Handler handler) {
        this(handler, null, false);
    }
}
