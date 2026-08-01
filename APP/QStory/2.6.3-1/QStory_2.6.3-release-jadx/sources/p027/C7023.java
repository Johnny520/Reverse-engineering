package p027;

import androidx.compose.foundation.lazy.layout.C1575;
import java.io.IOException;
import java.net.ProtocolException;
import p020.C6919;
import p020.C6921;
import p020.InterfaceC6932;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7023 implements InterfaceC6932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17372;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f17373;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C1575 f17374;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17375;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f17376;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f17377;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f17378;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6932 f17379;

    public C7023(C1575 c1575, InterfaceC6932 interfaceC6932, long j, boolean z) {
        interfaceC6932.getClass();
        this.f17374 = c1575;
        this.f17379 = interfaceC6932;
        this.f17377 = j;
        this.f17378 = z;
        this.f17375 = z;
    }

    @Override // p020.InterfaceC6932, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f17376) {
            return;
        }
        this.f17376 = true;
        long j = this.f17377;
        if (j != -1 && this.f17372 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m12177();
            m12176(null);
        } catch (IOException e) {
            IOException iOExceptionM12176 = m12176(e);
            iOExceptionM12176.getClass();
            throw iOExceptionM12176;
        }
    }

    @Override // p020.InterfaceC6932, java.io.Flushable
    public final void flush() throws IOException {
        try {
            m12175();
        } catch (IOException e) {
            IOException iOExceptionM12176 = m12176(e);
            iOExceptionM12176.getClass();
            throw iOExceptionM12176;
        }
    }

    public final String toString() {
        return C7023.class.getSimpleName() + '(' + this.f17379 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12175() {
        this.f17379.flush();
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11493() {
        return this.f17379.mo11493();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final IOException m12176(IOException iOException) {
        if (this.f17373) {
            return iOException;
        }
        this.f17373 = true;
        return C1575.m2096(this.f17374, this.f17378, iOException, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12177() {
        this.f17379.close();
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo11494(C6921 c6921, long j) throws IOException {
        if (this.f17376) {
            C6755.m11870("closed");
            return;
        }
        long j2 = this.f17377;
        if (j2 != -1 && this.f17372 + j > j2) {
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f17372 + j));
        }
        try {
            if (this.f17375) {
                this.f17375 = false;
            }
            this.f17379.mo11494(c6921, j);
            this.f17372 += j;
        } catch (IOException e) {
            IOException iOExceptionM12176 = m12176(e);
            iOExceptionM12176.getClass();
            throw iOExceptionM12176;
        }
    }
}
