package p124i7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import p008a8.AbstractC0023a;
import p344x7.C5706c;

/* JADX INFO: renamed from: i7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1995e extends AbstractC1996f {

    /* JADX INFO: renamed from: g */
    public final File f6739g;

    /* JADX INFO: renamed from: h */
    public FileChannel f6740h;

    /* JADX INFO: renamed from: i */
    public C5706c f6741i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1995e(File file) {
        this.f6739g = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p124i7.AbstractC1996f
    /* JADX INFO: renamed from: a */
    public final byte[] mo4932a() throws IOException {
        long length = this.f6739g.length();
        int i9 = ((long) 65581) > length ? (int) length : 65581;
        FileChannel fileChannelM4935e = m4935e();
        fileChannelM4935e.position(length - ((long) i9));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i9);
        fileChannelM4935e.read(byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p124i7.AbstractC1996f
    /* JADX INFO: renamed from: b */
    public final InputStream mo4933b(long j3, long j4) throws IOException {
        if (this.f6741i != null) {
            this.f6741i = null;
        }
        FileChannel fileChannelM4935e = m4935e();
        fileChannelM4935e.position(j3);
        C5706c c5706c = new C5706c(fileChannelM4935e, j4);
        this.f6741i = c5706c;
        return c5706c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p124i7.AbstractC1996f
    /* JADX INFO: renamed from: c */
    public final long mo4934c() {
        return this.f6739g.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6741i != null) {
            this.f6741i = null;
        }
        FileChannel fileChannel = this.f6740h;
        if (fileChannel == null) {
            return;
        }
        synchronized (this) {
            fileChannel.close();
            this.f6740h = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final FileChannel m4935e() {
        FileChannel channel;
        FileChannel fileChannel = this.f6740h;
        if (fileChannel != null) {
            return fileChannel;
        }
        synchronized (this) {
            try {
                File file = this.f6739g;
                int i9 = AbstractC0023a.f77a;
                if (!file.isFile()) {
                    throw new FileNotFoundException("No such file: " + file);
                }
                channel = new FileInputStream(file).getChannel();
                this.f6740h = channel;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        boolean zIsOpen;
        FileChannel fileChannel = this.f6740h;
        if (fileChannel == null) {
            return false;
        }
        synchronized (this) {
            zIsOpen = fileChannel.isOpen();
        }
        return zIsOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "File: " + this.f6739g;
    }
}
