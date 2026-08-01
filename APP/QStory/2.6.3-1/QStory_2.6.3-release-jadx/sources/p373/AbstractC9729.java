package p373;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.zip.C6413;
import p352.C9620;
import p374.C9735;
import p374.InterfaceC9737;
import p392.AbstractC9814;

/* JADX INFO: renamed from: 飘花落叶言苏子世兰楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9729 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC9737 f25431;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9735 f25432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f25433;

    public AbstractC9729(C6413 c6413) {
        super(c6413);
        this.f25431 = new C9620(6);
        this.f25432 = C9735.f25443;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in == null || this.f25433) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e) {
            this.m15102(e);
            return 0;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = AbstractC9814.f25560;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                m15102(e);
            } catch (Exception e2) {
                m15102(new IOException(e2));
            }
        }
        this.f25433 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        try {
            int i = ((FilterInputStream) this).in.read();
            mo15103(i != -1 ? 1 : -1);
            return i;
        } catch (IOException e) {
            m15102(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            m15102(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            this.m15102(e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m15102(IOException iOException) {
        this.f25431.accept(iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo15103(int i) {
        this.f25432.getClass();
    }

    public AbstractC9729(InputStream inputStream, C9733 c9733) {
        super(inputStream);
        this.f25431 = new C9620(6);
        this.f25432 = C9735.f25443;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            byte[] bArr2 = AbstractC9814.f25560;
            int i = ((FilterInputStream) this).in.read(bArr);
            mo15103(i);
            return i;
        } catch (IOException e) {
            m15102(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            mo15103(i3);
            return i3;
        } catch (IOException e) {
            m15102(e);
            return -1;
        }
    }
}
