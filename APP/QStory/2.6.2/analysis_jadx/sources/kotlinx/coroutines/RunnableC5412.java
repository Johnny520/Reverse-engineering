package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.C5359;
import p007.AbstractC6136;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5412 extends C5359 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long f15052;

    public RunnableC5412(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.f15052 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4359 interfaceC4359 = this.f15073;
        AbstractC5398.m10496(interfaceC4359);
        C5401 c5401 = (C5401) interfaceC4359.get(C5401.f15044);
        String str = c5401 != null ? c5401.f15045 : null;
        String string = "Timed out waiting for " + this.f15052 + " ms";
        if (str != null) {
            StringBuilder sbM11550 = AbstractC6136.m11550("Coroutine \"", str, "\" ");
            if (string.length() > 0) {
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
            }
            sbM11550.append(string);
            string = sbM11550.toString();
        }
        m10569(new TimeoutCancellationException(string, this));
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final String mo10508() {
        return super.mo10508() + "(timeMillis=" + this.f15052 + ')';
    }
}
