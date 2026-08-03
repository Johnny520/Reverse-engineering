package Yue;

import Yue.C3600;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۢۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class C8418 implements Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f25177;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3604 f25178;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC1524 f25179;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean f25180;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f25181;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f25182;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f25183;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public long f25184;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f25185;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f25186;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f25187;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f25188;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f25189;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    @InterfaceC6489
    public C6194 f25190;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    @InterfaceC6489
    public final byte[] f25191;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    @InterfaceC6489
    public final C3600.C0192 f25192;

    /* JADX INFO: renamed from: Yue.ۥۢۥۢ$ۥ */
    public interface InterfaceC1524 {
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo21897(@InterfaceC6399 String str) throws IOException;

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo21899(@InterfaceC6399 C3630 c3630) throws IOException;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        void mo21900(@InterfaceC6399 C3630 c3630);

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        void mo21902(@InterfaceC6399 C3630 c3630);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        void mo21903(int i, @InterfaceC6399 String str);
    }

    public C8418(boolean z, @InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 InterfaceC1524 interfaceC1524, boolean z2, boolean z3) {
        C5499.m17103(interfaceC3604, "source");
        C5499.m17103(interfaceC1524, "frameCallback");
        this.f25177 = z;
        this.f25178 = interfaceC3604;
        this.f25179 = interfaceC1524;
        this.f25180 = z2;
        this.f25181 = z3;
        this.f25188 = new C3600();
        this.f25189 = new C3600();
        this.f25191 = z ? null : new byte[4];
        this.f25192 = z ? null : new C3600.C0192();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C6194 c6194 = this.f25190;
        if (c6194 != null) {
            c6194.close();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC3604 m4397() {
        return this.f25178;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28120() throws IOException {
        m28122();
        if (this.f25186) {
            m28121();
        } else {
            m28124();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m28121() throws IOException {
        short s;
        String strMo9662;
        long j = this.f25184;
        if (j > 0) {
            this.f25178.mo9664(this.f25188, j);
            if (!this.f25177) {
                C3600 c3600 = this.f25188;
                C3600.C0192 c0192 = this.f25192;
                C5499.m17100(c0192);
                c3600.m9660(c0192);
                this.f25192.m9712(0L);
                C8417 c8417 = C8417.f3480;
                C3600.C0192 c01922 = this.f25192;
                byte[] bArr = this.f25191;
                C5499.m17100(bArr);
                c8417.m28118(c01922, bArr);
                this.f25192.close();
            }
        }
        switch (this.f25183) {
            case 8:
                long jM9684 = this.f25188.m9684();
                if (jM9684 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jM9684 != 0) {
                    s = this.f25188.readShort();
                    strMo9662 = this.f25188.mo9662();
                    String strM4396 = C8417.f3480.m4396(s);
                    if (strM4396 != null) {
                        throw new ProtocolException(strM4396);
                    }
                } else {
                    s = 1005;
                    strMo9662 = "";
                }
                this.f25179.mo21903(s, strMo9662);
                this.f25182 = true;
                return;
            case 9:
                this.f25179.mo21900(this.f25188.mo9648());
                return;
            case 10:
                this.f25179.mo21902(this.f25188.mo9648());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + C8158.m26885(this.f25183));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28122() throws IOException {
        boolean z;
        if (this.f25182) {
            throw new IOException("closed");
        }
        long jMo15623 = this.f25178.mo518().mo15623();
        this.f25178.mo518().mo15617();
        try {
            int iM26833 = C8158.m26833(this.f25178.readByte(), 255);
            this.f25178.mo518().mo15622(jMo15623, TimeUnit.NANOSECONDS);
            int i = iM26833 & 15;
            this.f25183 = i;
            boolean z2 = (iM26833 & 128) != 0;
            this.f25185 = z2;
            boolean z3 = (iM26833 & 8) != 0;
            this.f25186 = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (iM26833 & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f25180) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f25187 = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iM26833 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iM26833 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iM268332 = C8158.m26833(this.f25178.readByte(), 255);
            boolean z5 = (iM268332 & 128) != 0;
            if (z5 == this.f25177) {
                throw new ProtocolException(this.f25177 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = iM268332 & 127;
            this.f25184 = j;
            if (j == 126) {
                this.f25184 = C8158.m26834(this.f25178.readShort(), 65535);
            } else if (j == 127) {
                long j2 = this.f25178.readLong();
                this.f25184 = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + C8158.m26886(this.f25184) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f25186 && this.f25184 > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                InterfaceC3604 interfaceC3604 = this.f25178;
                byte[] bArr = this.f25191;
                C5499.m17100(bArr);
                interfaceC3604.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f25178.mo518().mo15622(jMo15623, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m28123() throws IOException {
        while (!this.f25182) {
            long j = this.f25184;
            if (j > 0) {
                this.f25178.mo9664(this.f25189, j);
                if (!this.f25177) {
                    C3600 c3600 = this.f25189;
                    C3600.C0192 c0192 = this.f25192;
                    C5499.m17100(c0192);
                    c3600.m9660(c0192);
                    this.f25192.m9712(this.f25189.m9684() - this.f25184);
                    C8417 c8417 = C8417.f3480;
                    C3600.C0192 c01922 = this.f25192;
                    byte[] bArr = this.f25191;
                    C5499.m17100(bArr);
                    c8417.m28118(c01922, bArr);
                    this.f25192.close();
                }
            }
            if (this.f25185) {
                return;
            }
            m28125();
            if (this.f25183 != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + C8158.m26885(this.f25183));
            }
        }
        throw new IOException("closed");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m28124() throws IOException {
        int i = this.f25183;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + C8158.m26885(i));
        }
        m28123();
        if (this.f25187) {
            C6194 c6194 = this.f25190;
            if (c6194 == null) {
                c6194 = new C6194(this.f25181);
                this.f25190 = c6194;
            }
            c6194.m2686(this.f25189);
        }
        if (i == 1) {
            this.f25179.mo21897(this.f25189.mo9662());
        } else {
            this.f25179.mo21899(this.f25189.mo9648());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28125() throws IOException {
        while (!this.f25182) {
            m28122();
            if (!this.f25186) {
                return;
            } else {
                m28121();
            }
        }
    }
}
