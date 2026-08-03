package Yue;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: Yue.ۥۣۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"})
public final class C6586 implements InterfaceC7472 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final OutputStream f16915;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7827 f16916;

    public C6586(@InterfaceC6399 OutputStream outputStream, @InterfaceC6399 C7827 c7827) {
        C5499.m17103(outputStream, "out");
        C5499.m17103(c7827, "timeout");
        this.f16915 = outputStream;
        this.f16916 = c7827;
    }

    @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16915.close();
    }

    @Override // Yue.InterfaceC7472, java.io.Flushable
    public void flush() throws IOException {
        this.f16915.flush();
    }

    @InterfaceC6399
    public String toString() {
        return "sink(" + this.f16915 + ')';
    }

    @Override // Yue.InterfaceC7472
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo516() {
        return this.f16916;
    }

    @Override // Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "source");
        C2963.m5677(c3600.m9684(), 0L, j);
        while (j > 0) {
            this.f16916.mo15621();
            C7275 c7275 = c3600.f6209;
            C5499.m17100(c7275);
            int iMin = (int) Math.min(j, c7275.f21950 - c7275.f2779);
            this.f16915.write(c7275.f2778, c7275.f2779, iMin);
            c7275.f2779 += iMin;
            long j2 = iMin;
            j -= j2;
            c3600.m9680(c3600.m9684() - j2);
            if (c7275.f2779 == c7275.f21950) {
                c3600.f6209 = c7275.m3540();
                C7278.m22744(c7275);
            }
        }
    }
}
