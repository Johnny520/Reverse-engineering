package Yue;

import Yue.C5318;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5369 implements Closeable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0726 f13132 = new C0726(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final Logger f13133;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3604 f13134;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f13135;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final C0727 f13136;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5318.C0712 f13137;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۨ$ۥ */
    public static final class C0726 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۧۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0726(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final Logger m2124() {
            return C5369.f13133;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m2125(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0726() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۨ$ۥ۟ */
    public static final class C0727 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3604 f13138;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f13139;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f13140;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f13141;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f13142;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f13143;

        public C0727(@InterfaceC6399 InterfaceC3604 interfaceC3604) {
            C5499.m17103(interfaceC3604, "source");
            this.f13138 = interfaceC3604;
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo518() {
            return this.f13138.mo518();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m2126() {
            return this.f13140;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m16612() {
            return this.f13142;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m16613() {
            return this.f13139;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int m16614() {
            return this.f13143;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int m16615() {
            return this.f13141;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m16616() throws IOException {
            int i = this.f13141;
            int iM26877 = C8158.m26877(this.f13138);
            this.f13142 = iM26877;
            this.f13139 = iM26877;
            int iM26833 = C8158.m26833(this.f13138.readByte(), 255);
            this.f13140 = C8158.m26833(this.f13138.readByte(), 255);
            C0726 c0726 = C5369.f13132;
            if (c0726.m2124().isLoggable(Level.FINE)) {
                c0726.m2124().fine(C5354.f1449.m16490(true, this.f13141, this.f13139, iM26833, this.f13140));
            }
            int i2 = this.f13138.readInt() & Integer.MAX_VALUE;
            this.f13141 = i2;
            if (iM26833 == 9) {
                if (i2 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM26833 + " != TYPE_CONTINUATION");
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m16617(int i) {
            this.f13140 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m16618(int i) {
            this.f13142 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m16619(int i) {
            this.f13139 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final void m16620(int i) {
            this.f13143 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final void m16621(int i) {
            this.f13141 = i;
        }

        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            while (true) {
                int i = this.f13142;
                if (i != 0) {
                    long jMo9103 = this.f13138.mo9103(c3600, Math.min(j, i));
                    if (jMo9103 == -1) {
                        return -1L;
                    }
                    this.f13142 -= (int) jMo9103;
                    return jMo9103;
                }
                this.f13138.skip(this.f13143);
                this.f13143 = 0;
                if ((this.f13140 & 4) != 0) {
                    return -1L;
                }
                m16616();
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۨ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC5370 {
        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo16583();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo16584(int i, @InterfaceC6399 EnumC4660 enumC4660);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        void mo16585(boolean z, int i, int i2, @InterfaceC6399 List<C5255> list);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        void mo16586(int i, long j);

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        void mo16587(boolean z, @InterfaceC6399 C7403 c7403);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        void mo16588(boolean z, int i, int i2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        void mo16589(int i, int i2, int i3, boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        void mo16590(boolean z, int i, @InterfaceC6399 InterfaceC3604 interfaceC3604, int i2) throws IOException;

        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        void mo16591(int i, @InterfaceC6399 String str, @InterfaceC6399 C3630 c3630, @InterfaceC6399 String str2, int i2, long j);

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        void mo16592(int i, int i2, @InterfaceC6399 List<C5255> list) throws IOException;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        void mo16593(int i, @InterfaceC6399 EnumC4660 enumC4660, @InterfaceC6399 C3630 c3630);
    }

    static {
        Logger logger = Logger.getLogger(C5354.class.getName());
        C5499.m17102(logger, "getLogger(Http2::class.java.name)");
        f13133 = logger;
    }

    public C5369(@InterfaceC6399 InterfaceC3604 interfaceC3604, boolean z) {
        C5499.m17103(interfaceC3604, "source");
        this.f13134 = interfaceC3604;
        this.f13135 = z;
        C0727 c0727 = new C0727(interfaceC3604);
        this.f13136 = c0727;
        this.f13137 = new C5318.C0712(c0727, 4096, 0, 4, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13134.close();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m16599(boolean z, @InterfaceC6399 InterfaceC5370 interfaceC5370) throws IOException {
        C5499.m17103(interfaceC5370, "handler");
        try {
            this.f13134.mo9670(9L);
            int iM26877 = C8158.m26877(this.f13134);
            if (iM26877 > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM26877);
            }
            int iM26833 = C8158.m26833(this.f13134.readByte(), 255);
            int iM268332 = C8158.m26833(this.f13134.readByte(), 255);
            int i = this.f13134.readInt() & Integer.MAX_VALUE;
            Logger logger = f13133;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C5354.f1449.m16490(true, i, iM26877, iM26833, iM268332));
            }
            if (z && iM26833 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C5354.f1449.m2116(iM26833));
            }
            switch (iM26833) {
                case 0:
                    m16601(interfaceC5370, iM26877, iM268332, i);
                    return true;
                case 1:
                    m16604(interfaceC5370, iM26877, iM268332, i);
                    return true;
                case 2:
                    m16607(interfaceC5370, iM26877, iM268332, i);
                    return true;
                case 3:
                    m16609(interfaceC5370, iM26877, iM268332, i);
                    return true;
                case 4:
                    m16610(interfaceC5370, iM26877, iM268332, i);
                    return true;
                case 5:
                    m16608(interfaceC5370, iM26877, iM268332, i);
                    return true;
                case 6:
                    m16605(interfaceC5370, iM26877, iM268332, i);
                    return true;
                case 7:
                    m16602(interfaceC5370, iM26877, iM268332, i);
                    return true;
                case 8:
                    m16611(interfaceC5370, iM26877, iM268332, i);
                    return true;
                default:
                    this.f13134.skip(iM26877);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m16600(@InterfaceC6399 InterfaceC5370 interfaceC5370) throws IOException {
        C5499.m17103(interfaceC5370, "handler");
        if (this.f13135) {
            if (!m16599(true, interfaceC5370)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC3604 interfaceC3604 = this.f13134;
        C3630 c3630 = C5354.f1450;
        C3630 c3630Mo9612 = interfaceC3604.mo9612(c3630.m9852());
        Logger logger = f13133;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C8158.m26854("<< CONNECTION " + c3630Mo9612.mo9828(), new Object[0]));
        }
        if (C5499.m17094(c3630, c3630Mo9612)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + c3630Mo9612.m9862());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m16601(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM26833 = (i2 & 8) != 0 ? C8158.m26833(this.f13134.readByte(), 255) : 0;
        interfaceC5370.mo16590(z, i3, this.f13134, f13132.m2125(i, i2, iM26833));
        this.f13134.skip(iM26833);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m16602(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        }
        if (i3 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i4 = this.f13134.readInt();
        int i5 = this.f13134.readInt();
        int i6 = i - 8;
        EnumC4660 enumC4660M1615 = EnumC4660.f9988.m1615(i5);
        if (enumC4660M1615 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i5);
        }
        C3630 c3630Mo9612 = C3630.f6372;
        if (i6 > 0) {
            c3630Mo9612 = this.f13134.mo9612(i6);
        }
        interfaceC5370.mo16593(i4, enumC4660M1615, c3630Mo9612);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final List<C5255> m16603(int i, int i2, int i3, int i4) throws IOException {
        this.f13136.m16618(i);
        C0727 c0727 = this.f13136;
        c0727.m16619(c0727.m16612());
        this.f13136.m16620(i2);
        this.f13136.m16617(i3);
        this.f13136.m16621(i4);
        this.f13137.m16331();
        return this.f13137.m16324();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m16604(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        int iM26833 = (i2 & 8) != 0 ? C8158.m26833(this.f13134.readByte(), 255) : 0;
        if ((i2 & 32) != 0) {
            m16606(interfaceC5370, i3);
            i -= 5;
        }
        interfaceC5370.mo16585(z, i3, -1, m16603(f13132.m2125(i, i2, iM26833), iM26833, i2, i3));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m16605(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        interfaceC5370.mo16588((i2 & 1) != 0, this.f13134.readInt(), this.f13134.readInt());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m16606(InterfaceC5370 interfaceC5370, int i) throws IOException {
        int i2 = this.f13134.readInt();
        interfaceC5370.mo16589(i, i2 & Integer.MAX_VALUE, C8158.m26833(this.f13134.readByte(), 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m16607(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        if (i == 5) {
            if (i3 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m16606(interfaceC5370, i3);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m16608(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM26833 = (i2 & 8) != 0 ? C8158.m26833(this.f13134.readByte(), 255) : 0;
        interfaceC5370.mo16592(i3, this.f13134.readInt() & Integer.MAX_VALUE, m16603(f13132.m2125(i - 4, i2, iM26833), iM26833, i2, i3));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m16609(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        }
        if (i3 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i4 = this.f13134.readInt();
        EnumC4660 enumC4660M1615 = EnumC4660.f9988.m1615(i4);
        if (enumC4660M1615 != null) {
            interfaceC5370.mo16584(i3, enumC4660M1615);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m16610(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i2 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            interfaceC5370.mo16583();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
        }
        C7403 c7403 = new C7403();
        C5456 c5456M21772 = C7007.m21772(C7007.m21793(0, i), 6);
        int iM16964 = c5456M21772.m16964();
        int iM16965 = c5456M21772.m16965();
        int iM16966 = c5456M21772.m16966();
        if ((iM16966 > 0 && iM16964 <= iM16965) || (iM16966 < 0 && iM16965 <= iM16964)) {
            while (true) {
                int iM26834 = C8158.m26834(this.f13134.readShort(), 65535);
                i4 = this.f13134.readInt();
                if (iM26834 != 2) {
                    if (iM26834 == 3) {
                        iM26834 = 4;
                    } else if (iM26834 != 4) {
                        if (iM26834 == 5 && (i4 < 16384 || i4 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i4 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iM26834 = 7;
                    }
                } else if (i4 != 0 && i4 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                c7403.m23182(iM26834, i4);
                if (iM16964 == iM16965) {
                    break;
                } else {
                    iM16964 += iM16966;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i4);
        }
        interfaceC5370.mo16587(false, c7403);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m16611(InterfaceC5370 interfaceC5370, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
        }
        long jM26835 = C8158.m26835(this.f13134.readInt(), 2147483647L);
        if (jM26835 == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        interfaceC5370.mo16586(i3, jM26835);
    }
}
