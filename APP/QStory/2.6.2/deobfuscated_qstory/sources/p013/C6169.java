package p013;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.IOException;
import java.net.ProtocolException;
import p005.C6099;
import p005.C6101;
import p005.InterfaceC6112;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6169 implements InterfaceC6112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f16823;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f16824;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C0734 f16825;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f16826;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f16827;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f16828;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f16829;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6112 f16830;

    public C6169(C0734 c0734, InterfaceC6112 interfaceC6112, long j, boolean z) {
        interfaceC6112.getClass();
        this.f16825 = c0734;
        this.f16830 = interfaceC6112;
        this.f16828 = j;
        this.f16829 = z;
        this.f16826 = z;
    }

    @Override // p005.InterfaceC6112, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f16827) {
            return;
        }
        this.f16827 = true;
        long j = this.f16828;
        if (j != -1 && this.f16823 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m11599();
            m11598(null);
        } catch (IOException e) {
            IOException iOExceptionM11598 = m11598(e);
            iOExceptionM11598.getClass();
            throw iOExceptionM11598;
        }
    }

    @Override // p005.InterfaceC6112, java.io.Flushable
    public final void flush() throws IOException {
        try {
            m11597();
        } catch (IOException e) {
            IOException iOExceptionM11598 = m11598(e);
            iOExceptionM11598.getClass();
            throw iOExceptionM11598;
        }
    }

    public final String toString() {
        return C6169.class.getSimpleName() + '(' + this.f16830 + ')';
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo10877(C6101 c6101, long j) throws IOException {
        if (this.f16827) {
            C5919.m11250("closed");
            return;
        }
        long j2 = this.f16828;
        if (j2 != -1 && this.f16823 + j > j2) {
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f16823 + j));
        }
        try {
            if (this.f16826) {
                this.f16826 = false;
            }
            this.f16830.mo10877(c6101, j);
            this.f16823 += j;
        } catch (IOException e) {
            IOException iOExceptionM11598 = m11598(e);
            iOExceptionM11598.getClass();
            throw iOExceptionM11598;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11597() {
        this.f16830.flush();
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10878() {
        return this.f16830.mo10878();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final IOException m11598(IOException iOException) {
        if (this.f16824) {
            return iOException;
        }
        this.f16824 = true;
        return C0734.m1526(this.f16825, this.f16829, iOException, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11599() {
        this.f16830.close();
    }
}
