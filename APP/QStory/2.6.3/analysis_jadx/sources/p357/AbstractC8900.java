package p357;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.zip.C5583;
import p336.C8791;
import p358.C8906;
import p358.InterfaceC8908;
import p376.AbstractC8985;

/* JADX INFO: renamed from: 飘花落叶言苏子世兰楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8900 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8908 f25086;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8906 f25087;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f25088;

    public AbstractC8900(C5583 c5583) {
        super(c5583);
        this.f25086 = new C8791(6);
        this.f25087 = C8906.f25098;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in == null || this.f25088) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e) {
            this.m14543(e);
            return 0;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = AbstractC8985.f25215;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                m14543(e);
            } catch (Exception e2) {
                m14543(new IOException(e2));
            }
        }
        this.f25088 = true;
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
            mo14544(i != -1 ? 1 : -1);
            return i;
        } catch (IOException e) {
            m14543(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            m14543(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            this.m14543(e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14543(IOException iOException) {
        this.f25086.accept(iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo14544(int i) {
        this.f25087.getClass();
    }

    public AbstractC8900(InputStream inputStream, C8904 c8904) {
        super(inputStream);
        this.f25086 = new C8791(6);
        this.f25087 = C8906.f25098;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            byte[] bArr2 = AbstractC8985.f25215;
            int i = ((FilterInputStream) this).in.read(bArr);
            mo14544(i);
            return i;
        } catch (IOException e) {
            m14543(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            mo14544(i3);
            return i3;
        } catch (IOException e) {
            m14543(e);
            return -1;
        }
    }
}
