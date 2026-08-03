package Yue;

import Yue.C3600;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class C8422 implements Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f25212;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3603 f25213;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Random f25214;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean f25215;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f25216;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final long f25217;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f25218;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f25219;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f25220;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC6489
    public C6191 f25221;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @InterfaceC6489
    public final byte[] f25222;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6489
    public final C3600.C0192 f25223;

    public C8422(boolean z, @InterfaceC6399 InterfaceC3603 interfaceC3603, @InterfaceC6399 Random random, boolean z2, boolean z3, long j) {
        C5499.m17103(interfaceC3603, "sink");
        C5499.m17103(random, "random");
        this.f25212 = z;
        this.f25213 = interfaceC3603;
        this.f25214 = random;
        this.f25215 = z2;
        this.f25216 = z3;
        this.f25217 = j;
        this.f25218 = new C3600();
        this.f25219 = interfaceC3603.mo9605();
        this.f25222 = z ? new byte[4] : null;
        this.f25223 = z ? new C3600.C0192() : null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        C6191 c6191 = this.f25221;
        if (c6191 != null) {
            c6191.close();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final Random m4400() {
        return this.f25214;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC3603 m28175() {
        return this.f25213;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m28176(int i, @InterfaceC6489 C3630 c3630) throws IOException {
        C3630 c3630Mo9648 = C3630.f6372;
        if (i != 0 || c3630 != null) {
            if (i != 0) {
                C8417.f3480.m28119(i);
            }
            C3600 c3600 = new C3600();
            c3600.writeShort(i);
            if (c3630 != null) {
                c3600.mo9668(c3630);
            }
            c3630Mo9648 = c3600.mo9648();
        }
        try {
            m28177(8, c3630Mo9648);
        } finally {
            this.f25220 = true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28177(int i, C3630 c3630) throws IOException {
        if (this.f25220) {
            throw new IOException("closed");
        }
        int iM9852 = c3630.m9852();
        if (iM9852 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f25219.writeByte(i | 128);
        if (this.f25212) {
            this.f25219.writeByte(iM9852 | 128);
            Random random = this.f25214;
            byte[] bArr = this.f25222;
            C5499.m17100(bArr);
            random.nextBytes(bArr);
            this.f25219.write(this.f25222);
            if (iM9852 > 0) {
                long jM9684 = this.f25219.m9684();
                this.f25219.mo9668(c3630);
                C3600 c3600 = this.f25219;
                C3600.C0192 c0192 = this.f25223;
                C5499.m17100(c0192);
                c3600.m9660(c0192);
                this.f25223.m9712(jM9684);
                C8417.f3480.m28118(this.f25223, this.f25222);
                this.f25223.close();
            }
        } else {
            this.f25219.writeByte(iM9852);
            this.f25219.mo9668(c3630);
        }
        this.f25213.flush();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m28178(int i, @InterfaceC6399 C3630 c3630) throws IOException {
        C5499.m17103(c3630, "data");
        if (this.f25220) {
            throw new IOException("closed");
        }
        this.f25218.mo9668(c3630);
        int i2 = i | 128;
        if (this.f25215 && c3630.m9852() >= this.f25217) {
            C6191 c6191 = this.f25221;
            if (c6191 == null) {
                c6191 = new C6191(this.f25216);
                this.f25221 = c6191;
            }
            c6191.m2682(this.f25218);
            i2 = i | 192;
        }
        long jM9684 = this.f25218.m9684();
        this.f25219.writeByte(i2);
        int i3 = this.f25212 ? 128 : 0;
        if (jM9684 <= 125) {
            this.f25219.writeByte(i3 | ((int) jM9684));
        } else if (jM9684 <= C8417.f25173) {
            this.f25219.writeByte(i3 | 126);
            this.f25219.writeShort((int) jM9684);
        } else {
            this.f25219.writeByte(i3 | 127);
            this.f25219.writeLong(jM9684);
        }
        if (this.f25212) {
            Random random = this.f25214;
            byte[] bArr = this.f25222;
            C5499.m17100(bArr);
            random.nextBytes(bArr);
            this.f25219.write(this.f25222);
            if (jM9684 > 0) {
                C3600 c3600 = this.f25218;
                C3600.C0192 c0192 = this.f25223;
                C5499.m17100(c0192);
                c3600.m9660(c0192);
                this.f25223.m9712(0L);
                C8417.f3480.m28118(this.f25223, this.f25222);
                this.f25223.close();
            }
        }
        this.f25219.mo9102(this.f25218, jM9684);
        this.f25213.mo9614();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m28179(@InterfaceC6399 C3630 c3630) throws IOException {
        C5499.m17103(c3630, "payload");
        m28177(9, c3630);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28180(@InterfaceC6399 C3630 c3630) throws IOException {
        C5499.m17103(c3630, "payload");
        m28177(10, c3630);
    }
}
