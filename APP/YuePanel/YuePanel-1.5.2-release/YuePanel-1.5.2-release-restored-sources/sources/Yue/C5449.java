package Yue;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n1#2:240\n86#3:241\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:241\n*E\n"})
public class C5449 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InputStream f13396;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7827 f13397;

    public C5449(@InterfaceC6399 InputStream inputStream, @InterfaceC6399 C7827 c7827) {
        C5499.m17103(inputStream, "input");
        C5499.m17103(c7827, "timeout");
        this.f13396 = inputStream;
        this.f13397 = c7827;
    }

    @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13396.close();
    }

    @InterfaceC6399
    public String toString() {
        return "source(" + this.f13396 + ')';
    }

    @Override // Yue.InterfaceC7506
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo518() {
        return this.f13397;
    }

    @Override // Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.f13397.mo15621();
            C7275 c7275M9687 = c3600.m9687(1);
            int i = this.f13396.read(c7275M9687.f2778, c7275M9687.f21950, (int) Math.min(j, 8192 - c7275M9687.f21950));
            if (i != -1) {
                c7275M9687.f21950 += i;
                long j2 = i;
                c3600.m9680(c3600.m9684() + j2);
                return j2;
            }
            if (c7275M9687.f2779 != c7275M9687.f21950) {
                return -1L;
            }
            c3600.f6209 = c7275M9687.m3540();
            C7278.m22744(c7275M9687);
            return -1L;
        } catch (AssertionError e) {
            if (C6542.m20838(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }
}
