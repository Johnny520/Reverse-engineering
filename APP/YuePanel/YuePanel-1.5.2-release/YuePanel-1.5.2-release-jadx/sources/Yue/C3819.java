package Yue;

import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class C3819 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3604 f7089;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Cipher f7090;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f7091;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f7092;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f7093;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f7094;

    public C3819(@InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 Cipher cipher) {
        C5499.m17103(interfaceC3604, "source");
        C5499.m17103(cipher, "cipher");
        this.f7089 = interfaceC3604;
        this.f7090 = cipher;
        int blockSize = cipher.getBlockSize();
        this.f7091 = blockSize;
        this.f7092 = new C3600();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7094 = true;
        this.f7089.close();
    }

    @Override // Yue.InterfaceC7506
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo518() {
        return this.f7089.mo518();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m863() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int outputSize = this.f7090.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        C7275 c7275M9687 = this.f7092.m9687(outputSize);
        int iDoFinal = this.f7090.doFinal(c7275M9687.f2778, c7275M9687.f2779);
        c7275M9687.f21950 += iDoFinal;
        C3600 c3600 = this.f7092;
        c3600.m9680(c3600.m9684() + ((long) iDoFinal));
        if (c7275M9687.f2779 == c7275M9687.f21950) {
            this.f7092.f6209 = c7275M9687.m3540();
            C7278.m22744(c7275M9687);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Cipher m10526() {
        return this.f7090;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m10527() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        while (this.f7092.m9684() == 0 && !this.f7093) {
            if (this.f7089.mo9622()) {
                this.f7093 = true;
                m863();
                return;
            }
            m10528();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m10528() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        C7275 c7275 = this.f7089.mo9605().f6209;
        C5499.m17100(c7275);
        int i = c7275.f21950 - c7275.f2779;
        int outputSize = this.f7090.getOutputSize(i);
        while (outputSize > 8192) {
            int i2 = this.f7091;
            if (i <= i2) {
                this.f7093 = true;
                C3600 c3600 = this.f7092;
                byte[] bArrDoFinal = this.f7090.doFinal(this.f7089.mo9618());
                C5499.m17102(bArrDoFinal, "doFinal(...)");
                c3600.write(bArrDoFinal);
                return;
            }
            i -= i2;
            outputSize = this.f7090.getOutputSize(i);
        }
        C7275 c7275M9687 = this.f7092.m9687(outputSize);
        int iUpdate = this.f7090.update(c7275.f2778, c7275.f2779, i, c7275M9687.f2778, c7275M9687.f2779);
        this.f7089.skip(i);
        c7275M9687.f21950 += iUpdate;
        C3600 c36002 = this.f7092;
        c36002.m9680(c36002.m9684() + ((long) iUpdate));
        if (c7275M9687.f2779 == c7275M9687.f21950) {
            this.f7092.f6209 = c7275M9687.m3540();
            C7278.m22744(c7275M9687);
        }
    }

    @Override // Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        C5499.m17103(c3600, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f7094)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        m10527();
        return this.f7092.mo9103(c3600, j);
    }
}
