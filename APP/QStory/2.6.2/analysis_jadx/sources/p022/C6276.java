package p022;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1030;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.http2.ErrorCode;
import p005.C6104;
import p012.C6165;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6276 extends C6104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ C6273 f17306;

    public C6276(C6273 c6273) {
        this.f17306 = c6273;
    }

    @Override // p005.C6104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo10873() {
        this.f17306.m11769(ErrorCode.CANCEL);
        C6281 c6281 = this.f17306.f17291;
        synchronized (c6281) {
            long j = c6281.f17323;
            long j2 = c6281.f17324;
            if (j < j2) {
                return;
            }
            c6281.f17324 = j2 + 1;
            c6281.f17322 = System.nanoTime() + 1000000000;
            C6165.m11590(c6281.f17336, AbstractC0053.m146(new StringBuilder(), c6281.f17341, " ping"), new C1030(c6281, 26));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11786() {
        if (m11502()) {
            throw mo10874(null);
        }
    }

    @Override // p005.C6104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final IOException mo10874(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }
}
