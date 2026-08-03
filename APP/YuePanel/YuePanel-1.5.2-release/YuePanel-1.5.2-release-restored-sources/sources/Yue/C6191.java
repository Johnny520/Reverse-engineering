package Yue;

import Yue.C3600;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: Yue.ۥۡۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6191 implements Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f15209;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f15210;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Deflater f15211;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C4363 f15212;

    public C6191(boolean z) {
        this.f15209 = z;
        C3600 c3600 = new C3600();
        this.f15210 = c3600;
        Deflater deflater = new Deflater(-1, true);
        this.f15211 = deflater;
        this.f15212 = new C4363((InterfaceC7472) c3600, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f15212.close();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2682(@InterfaceC6399 C3600 c3600) throws IOException {
        C5499.m17103(c3600, "buffer");
        if (this.f15210.m9684() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f15209) {
            this.f15211.reset();
        }
        this.f15212.mo9102(c3600, c3600.m9684());
        this.f15212.flush();
        if (m19081(this.f15210, C6192.f1882)) {
            long jM9684 = this.f15210.m9684() - ((long) 4);
            C3600.C0192 c0192M9598 = C3600.m9598(this.f15210, null, 1, null);
            try {
                c0192M9598.m9711(jM9684);
                C3849.m904(c0192M9598, null);
            } finally {
            }
        } else {
            this.f15210.writeByte(0);
        }
        C3600 c36002 = this.f15210;
        c3600.mo9102(c36002, c36002.m9684());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m19081(C3600 c3600, C3630 c3630) {
        return c3600.mo9647(c3600.m9684() - ((long) c3630.m9852()), c3630);
    }
}
