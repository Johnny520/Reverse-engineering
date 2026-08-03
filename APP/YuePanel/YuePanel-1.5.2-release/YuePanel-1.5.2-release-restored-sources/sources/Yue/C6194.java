package Yue;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: Yue.ۥۡۡ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6194 implements Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f15215;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f15216;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Inflater f15217;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5432 f15218;

    public C6194(boolean z) {
        this.f15215 = z;
        C3600 c3600 = new C3600();
        this.f15216 = c3600;
        Inflater inflater = new Inflater(true);
        this.f15217 = inflater;
        this.f15218 = new C5432((InterfaceC7506) c3600, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15218.close();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2686(@InterfaceC6399 C3600 c3600) throws IOException {
        C5499.m17103(c3600, "buffer");
        if (this.f15216.m9684() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f15215) {
            this.f15217.reset();
        }
        this.f15216.mo9610(c3600);
        this.f15216.writeInt(65535);
        long bytesRead = this.f15217.getBytesRead() + this.f15216.m9684();
        do {
            this.f15218.m2204(c3600, Long.MAX_VALUE);
        } while (this.f15217.getBytesRead() < bytesRead);
    }
}
