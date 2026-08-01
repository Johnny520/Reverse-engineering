package p357;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.zip.C5582;
import p330.C8796;
import p358.C8916;
import p358.InterfaceC8918;
import p377.AbstractC8985;

/* JADX INFO: renamed from: 飘花落叶言苏子世兰哲楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8910 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8918 f25097;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8916 f25098;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f25099;

    public AbstractC8910(C5582 c5582) {
        super(c5582);
        this.f25097 = new C8796(5);
        this.f25098 = C8916.f25109;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in == null || this.f25099) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e) {
            this.m14530(e);
            return 0;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = AbstractC8985.f25236;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                m14530(e);
            } catch (Exception e2) {
                m14530(new IOException(e2));
            }
        }
        this.f25099 = true;
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
            mo14531(i != -1 ? 1 : -1);
            return i;
        } catch (IOException e) {
            m14530(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            m14530(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            this.m14530(e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14530(IOException iOException) {
        this.f25097.accept(iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo14531(int i) {
        this.f25098.getClass();
    }

    public AbstractC8910(InputStream inputStream, C8914 c8914) {
        super(inputStream);
        this.f25097 = new C8796(5);
        this.f25098 = C8916.f25109;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            byte[] bArr2 = AbstractC8985.f25236;
            int i = ((FilterInputStream) this).in.read(bArr);
            mo14531(i);
            return i;
        } catch (IOException e) {
            m14530(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            mo14531(i3);
            return i3;
        } catch (IOException e) {
            m14530(e);
            return -1;
        }
    }
}
