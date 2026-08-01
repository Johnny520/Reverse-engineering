package p035;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1868;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.http2.ErrorCode;
import p020.C6924;
import p031.C7064;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7101 extends C6924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ C7098 f17633;

    public C7101(C7098 c7098) {
        this.f17633 = c7098;
    }

    @Override // p020.C6924
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo11489() {
        this.f17633.m12345(ErrorCode.CANCEL);
        C7106 c7106 = this.f17633.f17618;
        synchronized (c7106) {
            long j = c7106.f17650;
            long j2 = c7106.f17651;
            if (j < j2) {
                return;
            }
            c7106.f17651 = j2 + 1;
            c7106.f17649 = System.nanoTime() + 1000000000;
            C7064.m12271(c7106.f17663, AbstractC0900.m711(new StringBuilder(), c7106.f17668, " ping"), new C1868(c7106, 26));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m12362() {
        if (m12054()) {
            throw mo11490(null);
        }
    }

    @Override // p020.C6924
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final IOException mo11490(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }
}
