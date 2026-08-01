package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.C6192;
import p025.AbstractC7012;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6245 extends C6192 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long f15397;

    public RunnableC6245(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.f15397 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5192 interfaceC5192 = this.f15418;
        AbstractC6231.m11059(interfaceC5192);
        C6234 c6234 = (C6234) interfaceC5192.get(C6234.f15389);
        String str = c6234 != null ? c6234.f15390 : null;
        String string = "Timed out waiting for " + this.f15397 + " ms";
        if (str != null) {
            StringBuilder sbM12144 = AbstractC7012.m12144("Coroutine \"", str, "\" ");
            if (string.length() > 0) {
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
            }
            sbM12144.append(string);
            string = sbM12144.toString();
        }
        m11131(new TimeoutCancellationException(string, this));
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final String mo11071() {
        return super.mo11071() + "(timeMillis=" + this.f15397 + ')';
    }
}
