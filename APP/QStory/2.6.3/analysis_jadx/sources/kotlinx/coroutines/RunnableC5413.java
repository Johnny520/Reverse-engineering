package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.C5360;
import p009.AbstractC6183;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5413 extends C5360 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long f15052;

    public RunnableC5413(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.f15052 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4360 interfaceC4360 = this.f15073;
        AbstractC5399.m10500(interfaceC4360);
        C5402 c5402 = (C5402) interfaceC4360.get(C5402.f15044);
        String str = c5402 != null ? c5402.f15045 : null;
        String string = "Timed out waiting for " + this.f15052 + " ms";
        if (str != null) {
            StringBuilder sbM11585 = AbstractC6183.m11585("Coroutine \"", str, "\" ");
            if (string.length() > 0) {
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
            }
            sbM11585.append(string);
            string = sbM11585.toString();
        }
        m10572(new TimeoutCancellationException(string, this));
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final String mo10512() {
        return super.mo10512() + "(timeMillis=" + this.f15052 + ')';
    }
}
