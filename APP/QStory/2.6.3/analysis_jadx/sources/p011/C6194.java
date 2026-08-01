package p011;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.IOException;
import java.net.ProtocolException;
import p004.C6090;
import p004.C6092;
import p004.InterfaceC6103;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6194 implements InterfaceC6103 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17027;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f17028;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C0734 f17029;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17030;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f17031;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f17032;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f17033;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6103 f17034;

    public C6194(C0734 c0734, InterfaceC6103 interfaceC6103, long j, boolean z) {
        interfaceC6103.getClass();
        this.f17029 = c0734;
        this.f17034 = interfaceC6103;
        this.f17032 = j;
        this.f17033 = z;
        this.f17030 = z;
    }

    @Override // p004.InterfaceC6103, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f17031) {
            return;
        }
        this.f17031 = true;
        long j = this.f17032;
        if (j != -1 && this.f17027 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m11618();
            m11617(null);
        } catch (IOException e) {
            IOException iOExceptionM11617 = m11617(e);
            iOExceptionM11617.getClass();
            throw iOExceptionM11617;
        }
    }

    @Override // p004.InterfaceC6103, java.io.Flushable
    public final void flush() throws IOException {
        try {
            m11616();
        } catch (IOException e) {
            IOException iOExceptionM11617 = m11617(e);
            iOExceptionM11617.getClass();
            throw iOExceptionM11617;
        }
    }

    public final String toString() {
        return C6194.class.getSimpleName() + '(' + this.f17034 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11616() {
        this.f17034.flush();
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10934() {
        return this.f17034.mo10934();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final IOException m11617(IOException iOException) {
        if (this.f17028) {
            return iOException;
        }
        this.f17028 = true;
        return C0734.m1536(this.f17029, this.f17033, iOException, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11618() {
        this.f17034.close();
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo10935(C6092 c6092, long j) throws IOException {
        if (this.f17031) {
            C5925.m11311("closed");
            return;
        }
        long j2 = this.f17032;
        if (j2 != -1 && this.f17027 + j > j2) {
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f17027 + j));
        }
        try {
            if (this.f17030) {
                this.f17030 = false;
            }
            this.f17034.mo10935(c6092, j);
            this.f17027 += j;
        } catch (IOException e) {
            IOException iOExceptionM11617 = m11617(e);
            iOExceptionM11617.getClass();
            throw iOExceptionM11617;
        }
    }
}
