package p013;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.IOException;
import java.net.ProtocolException;
import p005.AbstractC6121;
import p005.C6101;
import p005.InterfaceC6110;
import p021.InterfaceC6253;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6168 extends AbstractC6121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f16816;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f16817;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C0734 f16818;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f16819;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f16820;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f16821;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f16822;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6168(C0734 c0734, InterfaceC6110 interfaceC6110, long j, boolean z) {
        super(interfaceC6110);
        interfaceC6110.getClass();
        this.f16818 = c0734;
        this.f16821 = j;
        this.f16822 = z;
        this.f16816 = true;
        if (j == 0) {
            m11596(null);
        }
    }

    @Override // p005.AbstractC6121, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f16820) {
            return;
        }
        this.f16820 = true;
        try {
            super.close();
            m11596(null);
        } catch (IOException e) {
            IOException iOExceptionM11596 = m11596(e);
            iOExceptionM11596.getClass();
            throw iOExceptionM11596;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final IOException m11596(IOException iOException) {
        if (this.f16819) {
            return iOException;
        }
        this.f16819 = true;
        if (iOException == null && this.f16816) {
            this.f16816 = false;
        }
        return C0734.m1526(this.f16818, this.f16822, iOException, 8);
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) throws IOException {
        C0734 c0734 = this.f16818;
        c6101.getClass();
        if (this.f16820) {
            C5919.m11250("closed");
            return 0L;
        }
        try {
            long jMo10876 = this.f16703.mo10876(c6101, 8192L);
            if (this.f16816) {
                this.f16816 = false;
            }
            if (jMo10876 == -1) {
                m11596(null);
                return -1L;
            }
            long j2 = this.f16817 + jMo10876;
            long j3 = this.f16821;
            if (j3 == -1 || j2 <= j3) {
                this.f16817 = j2;
                if (((InterfaceC6253) c0734.f2068).mo11730()) {
                    m11596(null);
                }
                return jMo10876;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException iOExceptionM11596 = m11596(e);
            iOExceptionM11596.getClass();
            throw iOExceptionM11596;
        }
    }
}
