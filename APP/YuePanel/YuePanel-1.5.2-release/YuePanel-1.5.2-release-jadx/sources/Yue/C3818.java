package Yue;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
public final class C3818 implements InterfaceC7472 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3603 f7085;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Cipher f7086;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f7087;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f7088;

    public C3818(@InterfaceC6399 InterfaceC3603 interfaceC3603, @InterfaceC6399 Cipher cipher) {
        C5499.m17103(interfaceC3603, "sink");
        C5499.m17103(cipher, "cipher");
        this.f7085 = interfaceC3603;
        this.f7086 = cipher;
        int blockSize = cipher.getBlockSize();
        this.f7087 = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f7088) {
            return;
        }
        this.f7088 = true;
        Throwable thM862 = m862();
        try {
            this.f7085.close();
        } catch (Throwable th) {
            if (thM862 == null) {
                thM862 = th;
            }
        }
        if (thM862 != null) {
            throw thM862;
        }
    }

    @Override // Yue.InterfaceC7472, java.io.Flushable
    public void flush() throws IOException {
        this.f7085.flush();
    }

    @Override // Yue.InterfaceC7472
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo516() {
        return this.f7085.mo516();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final Throwable m862() {
        int outputSize = this.f7086.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                InterfaceC3603 interfaceC3603 = this.f7085;
                byte[] bArrDoFinal = this.f7086.doFinal();
                C5499.m17102(bArrDoFinal, "doFinal(...)");
                interfaceC3603.write(bArrDoFinal);
                return null;
            } catch (Throwable th2) {
                return th2;
            }
        }
        C3600 c3600Mo9605 = this.f7085.mo9605();
        C7275 c7275M9687 = c3600Mo9605.m9687(outputSize);
        try {
            int iDoFinal = this.f7086.doFinal(c7275M9687.f2778, c7275M9687.f21950);
            c7275M9687.f21950 += iDoFinal;
            c3600Mo9605.m9680(c3600Mo9605.m9684() + ((long) iDoFinal));
        } catch (Throwable th3) {
            th = th3;
        }
        if (c7275M9687.f2779 == c7275M9687.f21950) {
            c3600Mo9605.f6209 = c7275M9687.m3540();
            C7278.m22744(c7275M9687);
        }
        return th;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Cipher m10524() {
        return this.f7086;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m10525(C3600 c3600, long j) throws IOException, ShortBufferException {
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        int iMin = (int) Math.min(j, c7275.f21950 - c7275.f2779);
        C3600 c3600Mo9605 = this.f7085.mo9605();
        int outputSize = this.f7086.getOutputSize(iMin);
        while (outputSize > 8192) {
            int i = this.f7087;
            if (iMin <= i) {
                InterfaceC3603 interfaceC3603 = this.f7085;
                byte[] bArrUpdate = this.f7086.update(c3600.mo9661(j));
                C5499.m17102(bArrUpdate, "update(...)");
                interfaceC3603.write(bArrUpdate);
                return (int) j;
            }
            iMin -= i;
            outputSize = this.f7086.getOutputSize(iMin);
        }
        C7275 c7275M9687 = c3600Mo9605.m9687(outputSize);
        int iUpdate = this.f7086.update(c7275.f2778, c7275.f2779, iMin, c7275M9687.f2778, c7275M9687.f21950);
        c7275M9687.f21950 += iUpdate;
        c3600Mo9605.m9680(c3600Mo9605.m9684() + ((long) iUpdate));
        if (c7275M9687.f2779 == c7275M9687.f21950) {
            c3600Mo9605.f6209 = c7275M9687.m3540();
            C7278.m22744(c7275M9687);
        }
        this.f7085.mo9632();
        c3600.m9680(c3600.m9684() - ((long) iMin));
        int i2 = c7275.f2779 + iMin;
        c7275.f2779 = i2;
        if (i2 == c7275.f21950) {
            c3600.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        }
        return iMin;
    }

    @Override // Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "source");
        C2963.m5677(c3600.m9684(), 0L, j);
        if (!(!this.f7088)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            j -= (long) m10525(c3600, j);
        }
    }
}
