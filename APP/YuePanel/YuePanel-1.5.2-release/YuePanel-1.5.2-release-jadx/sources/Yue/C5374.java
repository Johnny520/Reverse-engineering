package Yue;

import Yue.C5318;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
public final class C5374 implements Closeable {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0730 f13171 = new C0730(null);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Logger f13172 = Logger.getLogger(C5354.class.getName());

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3603 f13173;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f13174;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f13175;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f13176;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f13177;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5318.C0713 f13178;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۟$ۥ */
    public static final class C0730 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۨ۟.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0730(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0730() {
        }
    }

    public C5374(@InterfaceC6399 InterfaceC3603 interfaceC3603, boolean z) {
        C5499.m17103(interfaceC3603, "sink");
        this.f13173 = interfaceC3603;
        this.f13174 = z;
        C3600 c3600 = new C3600();
        this.f13175 = c3600;
        this.f13176 = 16384;
        this.f13178 = new C5318.C0713(0, false, c3600, 3, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f13177 = true;
        this.f13173.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f13177) {
            throw new IOException("closed");
        }
        this.f13173.flush();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final synchronized void m2131(@InterfaceC6399 C7403 c7403) throws IOException {
        try {
            C5499.m17103(c7403, "peerSettings");
            if (this.f13177) {
                throw new IOException("closed");
            }
            this.f13176 = c7403.m23178(this.f13176);
            if (c7403.m23175() != -1) {
                this.f13178.m16340(c7403.m23175());
            }
            m16677(0, 0, 4, 1);
            this.f13173.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final synchronized void m16674() throws IOException {
        try {
            if (this.f13177) {
                throw new IOException("closed");
            }
            if (this.f13174) {
                Logger logger = f13172;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C8158.m26854(">> CONNECTION " + C5354.f1450.mo9828(), new Object[0]));
                }
                this.f13173.mo9668(C5354.f1450);
                this.f13173.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final synchronized void m16675(boolean z, int i, @InterfaceC6489 C3600 c3600, int i2) throws IOException {
        if (this.f13177) {
            throw new IOException("closed");
        }
        m16676(i, z ? 1 : 0, c3600, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m16676(int i, int i2, @InterfaceC6489 C3600 c3600, int i3) throws IOException {
        m16677(i, i3, 0, i2);
        if (i3 > 0) {
            InterfaceC3603 interfaceC3603 = this.f13173;
            C5499.m17100(c3600);
            interfaceC3603.mo9102(c3600, i3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m16677(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = f13172;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C5354.f1449.m16490(false, i, i2, i3, i4));
        }
        if (i2 > this.f13176) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f13176 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        C8158.m26897(this.f13173, i2);
        this.f13173.writeByte(i3 & 255);
        this.f13173.writeByte(i4 & 255);
        this.f13173.writeInt(i & Integer.MAX_VALUE);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C5318.C0713 m16678() {
        return this.f13178;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final synchronized void m16679(int i, @InterfaceC6399 EnumC4660 enumC4660, @InterfaceC6399 byte[] bArr) throws IOException {
        try {
            C5499.m17103(enumC4660, "errorCode");
            C5499.m17103(bArr, "debugData");
            if (this.f13177) {
                throw new IOException("closed");
            }
            if (enumC4660.m14003() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            m16677(0, bArr.length + 8, 7, 0);
            this.f13173.writeInt(i);
            this.f13173.writeInt(enumC4660.m14003());
            if (!(bArr.length == 0)) {
                this.f13173.write(bArr);
            }
            this.f13173.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final synchronized void m16680(boolean z, int i, @InterfaceC6399 List<C5255> list) throws IOException {
        C5499.m17103(list, "headerBlock");
        if (this.f13177) {
            throw new IOException("closed");
        }
        this.f13178.m16342(list);
        long jM9684 = this.f13175.m9684();
        long jMin = Math.min(this.f13176, jM9684);
        int i2 = jM9684 == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m16677(i, (int) jMin, 1, i2);
        this.f13173.mo9102(this.f13175, jMin);
        if (jM9684 > jMin) {
            m16687(i, jM9684 - jMin);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m16681() {
        return this.f13176;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final synchronized void m16682(boolean z, int i, int i2) throws IOException {
        if (this.f13177) {
            throw new IOException("closed");
        }
        m16677(0, 8, 6, z ? 1 : 0);
        this.f13173.writeInt(i);
        this.f13173.writeInt(i2);
        this.f13173.flush();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final synchronized void m16683(int i, int i2, @InterfaceC6399 List<C5255> list) throws IOException {
        C5499.m17103(list, "requestHeaders");
        if (this.f13177) {
            throw new IOException("closed");
        }
        this.f13178.m16342(list);
        long jM9684 = this.f13175.m9684();
        int iMin = (int) Math.min(((long) this.f13176) - 4, jM9684);
        long j = iMin;
        m16677(i, iMin + 4, 5, jM9684 == j ? 4 : 0);
        this.f13173.writeInt(i2 & Integer.MAX_VALUE);
        this.f13173.mo9102(this.f13175, j);
        if (jM9684 > j) {
            m16687(i, jM9684 - j);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final synchronized void m16684(int i, @InterfaceC6399 EnumC4660 enumC4660) throws IOException {
        C5499.m17103(enumC4660, "errorCode");
        if (this.f13177) {
            throw new IOException("closed");
        }
        if (enumC4660.m14003() == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        m16677(i, 4, 3, 0);
        this.f13173.writeInt(enumC4660.m14003());
        this.f13173.flush();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final synchronized void m16685(@InterfaceC6399 C7403 c7403) throws IOException {
        try {
            C5499.m17103(c7403, "settings");
            if (this.f13177) {
                throw new IOException("closed");
            }
            int i = 0;
            m16677(0, c7403.m23183() * 6, 4, 0);
            while (i < 10) {
                if (c7403.m23180(i)) {
                    this.f13173.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f13173.writeInt(c7403.m3605(i));
                }
                i++;
            }
            this.f13173.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final synchronized void m16686(int i, long j) throws IOException {
        if (this.f13177) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        m16677(i, 4, 8, 0);
        this.f13173.writeInt((int) j);
        this.f13173.flush();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m16687(int i, long j) throws IOException {
        while (j > 0) {
            long jMin = Math.min(this.f13176, j);
            j -= jMin;
            m16677(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.f13173.mo9102(this.f13175, jMin);
        }
    }
}
