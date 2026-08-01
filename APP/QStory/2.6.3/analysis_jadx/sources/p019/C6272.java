package p019;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1030;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.http2.ErrorCode;
import p004.C6095;
import p015.C6235;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6272 extends C6095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ C6269 f17288;

    public C6272(C6269 c6269) {
        this.f17288 = c6269;
    }

    @Override // p004.C6095
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo10930() {
        this.f17288.m11786(ErrorCode.CANCEL);
        C6277 c6277 = this.f17288.f17273;
        synchronized (c6277) {
            long j = c6277.f17305;
            long j2 = c6277.f17306;
            if (j < j2) {
                return;
            }
            c6277.f17306 = j2 + 1;
            c6277.f17304 = System.nanoTime() + 1000000000;
            C6235.m11712(c6277.f17318, AbstractC0053.m151(new StringBuilder(), c6277.f17323, " ping"), new C1030(c6277, 26));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11803() {
        if (m11495()) {
            throw mo10931(null);
        }
    }

    @Override // p004.C6095
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final IOException mo10931(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }
}
