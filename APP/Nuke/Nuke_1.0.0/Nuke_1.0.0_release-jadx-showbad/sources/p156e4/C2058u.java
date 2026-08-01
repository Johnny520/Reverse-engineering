package p156e4;

import com.bumptech.glide.AbstractC1926h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.dartcv.nuke.BuildConfig;
import p000A.C0073m;
import p011B4.AbstractC0231b;
import p056K2.C0891q;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p123Y3.AbstractC1776g;
import p132a3.C1802b;
import p133a4.C1807c;
import p208n4.C2706e;
import p208n4.C2709h;
import p208n4.C2716o;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: e4.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2058u implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f6882g;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2708g f6883d;

    /* JADX INFO: renamed from: e */
    public final C2057t f6884e;

    /* JADX INFO: renamed from: f */
    public final C2042e f6885f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Logger logger = Logger.getLogger(AbstractC2045h.class.getName());
        AbstractC1665j.m2984d(logger, "getLogger(...)");
        f6882g = logger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2058u(C2716o c2716o) {
        AbstractC1665j.m2985e(c2716o, "source");
        this.f6883d = c2716o;
        C2057t c2057t = new C2057t(c2716o);
        this.f6884e = c2057t;
        this.f6885f = new C2042e(c2057t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0251, code lost:
    
        throw new java.io.IOException(p011B4.AbstractC0231b.m398i("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3761b(boolean z5, C2053p c2053p) throws Exception {
        Object[] array;
        try {
            this.f6883d.mo4727u(9L);
            int iM3171l = AbstractC1774e.m3171l(this.f6883d);
            if (iM3171l > 16384) {
                throw new IOException(AbstractC0231b.m398i("FRAME_SIZE_ERROR: ", iM3171l));
            }
            int i5 = this.f6883d.readByte() & 255;
            byte b2 = this.f6883d.readByte();
            int i6 = b2 & 255;
            int i7 = this.f6883d.readInt();
            int i8 = Integer.MAX_VALUE & i7;
            int i9 = 1;
            if (i5 != 8) {
                Logger logger = f6882g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC2045h.m3750b(true, i8, iM3171l, i5, i6));
                }
            }
            if (z5 && i5 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + AbstractC2045h.m3749a(i5));
            }
            EnumC2039b enumC2039b = null;
            switch (i5) {
                case 0:
                    m3762c(c2053p, iM3171l, i6, i8);
                    return true;
                case BuildConfig.VERSION_CODE /* 1 */:
                    m3764f(c2053p, iM3171l, i6, i8);
                    return true;
                case 2:
                    if (iM3171l != 5) {
                        throw new IOException(AbstractC0231b.m397h(iM3171l, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    InterfaceC2708g interfaceC2708g = this.f6883d;
                    interfaceC2708g.readInt();
                    interfaceC2708g.readByte();
                    return true;
                case 3:
                    if (iM3171l != 4) {
                        throw new IOException(AbstractC0231b.m397h(iM3171l, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i10 = this.f6883d.readInt();
                    EnumC2039b.f6783e.getClass();
                    EnumC2039b[] enumC2039bArrValues = EnumC2039b.values();
                    int length = enumC2039bArrValues.length;
                    while (true) {
                        if (i < length) {
                            EnumC2039b enumC2039b2 = enumC2039bArrValues[i];
                            if (enumC2039b2.f6791d == i10) {
                                enumC2039b = enumC2039b2;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (enumC2039b == null) {
                        throw new IOException(AbstractC0231b.m398i("TYPE_RST_STREAM unexpected error code: ", i10));
                    }
                    C2054q c2054q = c2053p.f6842e;
                    if (i8 != 0 && (i7 & 1) == 0) {
                        C1807c.m3275b(c2054q.f6854l, c2054q.f6848f + '[' + i8 + "] onReset", new C2049l(c2054q, i8, enumC2039b, i9));
                        return true;
                    }
                    C2062y c2062yM3754d = c2054q.m3754d(i8);
                    if (c2062yM3754d != null) {
                        synchronized (c2062yM3754d) {
                            if (c2062yM3754d.m3774f() == null) {
                                c2062yM3754d.f6908o = enumC2039b;
                                c2062yM3754d.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                case 4:
                    InterfaceC2708g interfaceC2708g2 = this.f6883d;
                    if (i8 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b2 & 1) != 0) {
                        if (iM3171l != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iM3171l % 6 != 0) {
                        throw new IOException(AbstractC0231b.m398i("TYPE_SETTINGS length % 6 != 0: ", iM3171l));
                    }
                    C2036C c2036c = new C2036C();
                    C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, iM3171l), 6);
                    int i11 = c1802bM3552E.f6140d;
                    int i12 = c1802bM3552E.f6141e;
                    int i13 = c1802bM3552E.f6142f;
                    if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                        while (true) {
                            short s5 = interfaceC2708g2.readShort();
                            byte[] bArr = AbstractC1774e.f6072a;
                            int i14 = s5 & 65535;
                            int i15 = interfaceC2708g2.readInt();
                            if (i14 != 2) {
                                if (i14 != 4) {
                                    if (i14 == 5 && (i15 < 16384 || i15 > 16777215)) {
                                    }
                                } else if (i15 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (i15 != 0 && i15 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            c2036c.m3736c(i14, i15);
                            if (i11 != i12) {
                                i11 += i13;
                            }
                            break;
                        }
                    }
                    C2054q c2054q2 = c2053p.f6842e;
                    C1807c.m3275b(c2054q2.f6853k, AbstractC0231b.m403n(new StringBuilder(), c2054q2.f6848f, " applyAndAckSettings"), new C0073m(21, c2053p, c2036c));
                    return true;
                case 5:
                    m3765h(c2053p, iM3171l, i6, i8);
                    return true;
                case 6:
                    if (iM3171l != 8) {
                        throw new IOException(AbstractC0231b.m398i("TYPE_PING length != 8: ", iM3171l));
                    }
                    if (i8 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int i16 = this.f6883d.readInt();
                    final int i17 = this.f6883d.readInt();
                    if (((b2 & 1) != 0 ? 1 : 0) == 0) {
                        C1807c c1807c = c2053p.f6842e.f6853k;
                        String strM403n = AbstractC0231b.m403n(new StringBuilder(), c2053p.f6842e.f6848f, " ping");
                        final C2054q c2054q3 = c2053p.f6842e;
                        C1807c.m3275b(c1807c, strM403n, new InterfaceC1599a() { // from class: e4.o
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p112W2.InterfaceC1599a
                            /* JADX INFO: renamed from: a */
                            public final Object mo6a() {
                                C2054q c2054q4 = c2054q3;
                                try {
                                    c2054q4.f6868z.m3783j(i16, i17, true);
                                } catch (IOException e5) {
                                    EnumC2039b enumC2039b3 = EnumC2039b.f6785g;
                                    c2054q4.m3752b(enumC2039b3, enumC2039b3, e5);
                                }
                                return C0891q.f2780a;
                            }
                        });
                        return true;
                    }
                    C2054q c2054q4 = c2053p.f6842e;
                    synchronized (c2054q4) {
                        try {
                            if (i16 == 1) {
                                c2054q4.f6857o++;
                            } else if (i16 == 2) {
                                c2054q4.f6859q++;
                            } else if (i16 == 3) {
                                c2054q4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iM3171l < 8) {
                        throw new IOException(AbstractC0231b.m398i("TYPE_GOAWAY length < 8: ", iM3171l));
                    }
                    if (i8 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i18 = this.f6883d.readInt();
                    int i19 = this.f6883d.readInt();
                    int i20 = iM3171l - 8;
                    EnumC2039b.f6783e.getClass();
                    EnumC2039b[] enumC2039bArrValues2 = EnumC2039b.values();
                    int length2 = enumC2039bArrValues2.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 < length2) {
                            EnumC2039b enumC2039b3 = enumC2039bArrValues2[i21];
                            if (enumC2039b3.f6791d == i19) {
                                enumC2039b = enumC2039b3;
                            } else {
                                i21++;
                            }
                        }
                    }
                    if (enumC2039b == null) {
                        throw new IOException(AbstractC0231b.m398i("TYPE_GOAWAY unexpected error code: ", i19));
                    }
                    C2709h c2709hMo4714g = C2709h.f8630g;
                    if (i20 > 0) {
                        c2709hMo4714g = this.f6883d.mo4714g(i20);
                    }
                    AbstractC1665j.m2985e(c2709hMo4714g, "debugData");
                    c2709hMo4714g.mo4732a();
                    C2054q c2054q5 = c2053p.f6842e;
                    synchronized (c2054q5) {
                        array = c2054q5.f6847e.values().toArray(new C2062y[0]);
                        c2054q5.f6851i = true;
                    }
                    C2062y[] c2062yArr = (C2062y[]) array;
                    int length3 = c2062yArr.length;
                    while (i < length3) {
                        C2062y c2062y = c2062yArr[i];
                        if (c2062y.f6897d > i18 && c2062y.m3775g()) {
                            EnumC2039b enumC2039b4 = EnumC2039b.f6788j;
                            synchronized (c2062y) {
                                if (c2062y.m3774f() == null) {
                                    c2062y.f6908o = enumC2039b4;
                                    c2062y.notifyAll();
                                }
                            }
                            c2053p.f6842e.m3754d(c2062y.f6897d);
                        }
                        i++;
                    }
                    return true;
                case 8:
                    try {
                        if (iM3171l != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iM3171l);
                        }
                        long j5 = 2147483647L & ((long) this.f6883d.readInt());
                        if (j5 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f6882g;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(AbstractC2045h.m3751c(true, i8, iM3171l, j5));
                        }
                        if (i8 == 0) {
                            C2054q c2054q6 = c2053p.f6842e;
                            synchronized (c2054q6) {
                                c2054q6.f6866x += j5;
                                c2054q6.notifyAll();
                            }
                            return true;
                        }
                        C2062y c2062yM3753c = c2053p.f6842e.m3753c(i8);
                        if (c2062yM3753c != null) {
                            synchronized (c2062yM3753c) {
                                c2062yM3753c.f6901h += j5;
                                if (j5 > 0) {
                                    c2062yM3753c.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e5) {
                        f6882g.fine(AbstractC2045h.m3750b(true, i8, iM3171l, 8, i6));
                        throw e5;
                    }
                default:
                    this.f6883d.skip(iM3171l);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r19 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        r9.m3777i(p118X3.C1707q.f5858e, true);
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3762c(C2053p c2053p, int i5, int i6, final int i7) throws IOException {
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        if (i7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z8 = (i6 & 1) != 0;
        if ((i6 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i6 & 8) != 0) {
            byte b2 = this.f6883d.readByte();
            byte[] bArr = AbstractC1774e.f6072a;
            i8 = b2 & 255;
        } else {
            i8 = 0;
        }
        final int iM3760a = AbstractC2056s.m3760a(i5, i6, i8);
        InterfaceC2708g interfaceC2708g = this.f6883d;
        AbstractC1665j.m2985e(interfaceC2708g, "source");
        final C2054q c2054q = c2053p.f6842e;
        if (i7 == 0 || (i7 & 1) != 0) {
            C2062y c2062yM3753c = c2054q.m3753c(i7);
            if (c2062yM3753c != null) {
                TimeZone timeZone = AbstractC1776g.f6076a;
                C2060w c2060w = c2062yM3753c.f6904k;
                long j5 = iM3760a;
                c2060w.getClass();
                long j6 = j5;
                while (true) {
                    if (j6 <= 0) {
                        z5 = z8;
                        C2062y c2062y = c2060w.f6895i;
                        TimeZone timeZone2 = AbstractC1776g.f6076a;
                        c2062y.f6898e.m3756h(j5);
                        c2060w.f6895i.f6898e.f6861s.getClass();
                        break;
                    }
                    synchronized (c2060w.f6895i) {
                        z6 = c2060w.f6891e;
                        z5 = z8;
                        z7 = c2060w.f6893g.f8629e + j6 > c2060w.f6890d;
                    }
                    if (z7) {
                        interfaceC2708g.skip(j6);
                        c2060w.f6895i.m3773e(EnumC2039b.f6787i);
                        break;
                    }
                    if (z6) {
                        interfaceC2708g.skip(j6);
                        break;
                    }
                    long jMo554y = interfaceC2708g.mo554y(c2060w.f6892f, j6);
                    if (jMo554y == -1) {
                        throw new EOFException();
                    }
                    j6 -= jMo554y;
                    C2062y c2062y2 = c2060w.f6895i;
                    synchronized (c2062y2) {
                        try {
                            if (c2060w.f6894h) {
                                c2060w.f6892f.m4715h();
                            } else {
                                C2706e c2706e = c2060w.f6893g;
                                boolean z9 = c2706e.f8629e == 0;
                                c2706e.m4704F(c2060w.f6892f);
                                if (z9) {
                                    c2062y2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z8 = z5;
                }
            } else {
                c2053p.f6842e.m3758l(i7, EnumC2039b.f6785g);
                long j7 = iM3760a;
                c2053p.f6842e.m3756h(j7);
                interfaceC2708g.skip(j7);
            }
        } else {
            final C2706e c2706e2 = new C2706e();
            long j8 = iM3760a;
            interfaceC2708g.mo4727u(j8);
            interfaceC2708g.mo554y(c2706e2, j8);
            C1807c.m3275b(c2054q.f6854l, c2054q.f6848f + '[' + i7 + "] onData", new InterfaceC1599a(i7, c2706e2, iM3760a, z8) { // from class: e4.k

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f6831e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C2706e f6832f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ int f6833g;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1599a
                /* JADX INFO: renamed from: a */
                public final Object mo6a() {
                    C2054q c2054q2 = this.f6830d;
                    int i9 = this.f6831e;
                    C2706e c2706e3 = this.f6832f;
                    int i10 = this.f6833g;
                    try {
                        c2054q2.f6856n.getClass();
                        c2706e3.skip(i10);
                        c2054q2.f6868z.m3784l(i9, EnumC2039b.f6789k);
                        synchronized (c2054q2) {
                            c2054q2.f6845B.remove(Integer.valueOf(i9));
                        }
                    } catch (IOException unused) {
                    }
                    return C0891q.f2780a;
                }
            });
        }
        this.f6883d.skip(i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6883d.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final List m3763d(int i5, int i6, int i7, int i8) throws IOException {
        C2057t c2057t = this.f6884e;
        c2057t.f6880g = i5;
        c2057t.f6881h = i6;
        c2057t.f6878e = i7;
        c2057t.f6879f = i8;
        C2042e c2042e = this.f6885f;
        C2716o c2716o = c2042e.f6805d;
        while (!c2716o.m4753b()) {
            byte b2 = c2716o.readByte();
            byte[] bArr = AbstractC1774e.f6072a;
            int i9 = b2 & 255;
            if (i9 == 128) {
                throw new IOException("index == 0");
            }
            if ((b2 & 128) == 128) {
                int iM3742f = c2042e.m3742f(i9, 127);
                int i10 = iM3742f - 1;
                if (i10 >= 0) {
                    C2041d[] c2041dArr = AbstractC2044g.f6818a;
                    if (i10 <= c2041dArr.length - 1) {
                        c2042e.m3737a(c2041dArr[i10]);
                    }
                }
                int length = c2042e.f6807f + 1 + (i10 - AbstractC2044g.f6818a.length);
                if (length >= 0) {
                    C2041d[] c2041dArr2 = c2042e.f6806e;
                    if (length < c2041dArr2.length) {
                        C2041d c2041d = c2041dArr2[length];
                        AbstractC1665j.m2982b(c2041d);
                        c2042e.m3737a(c2041d);
                    }
                }
                throw new IOException(AbstractC0231b.m398i("Header index too large ", iM3742f));
            }
            if (i9 == 64) {
                C2041d[] c2041dArr3 = AbstractC2044g.f6818a;
                C2709h c2709hM3741e = c2042e.m3741e();
                AbstractC2044g.m3748a(c2709hM3741e);
                c2042e.m3740d(new C2041d(c2709hM3741e, c2042e.m3741e()));
            } else if ((b2 & 64) == 64) {
                c2042e.m3740d(new C2041d(c2042e.m3739c(c2042e.m3742f(i9, 63) - 1), c2042e.m3741e()));
            } else if ((b2 & 32) == 32) {
                int iM3742f2 = c2042e.m3742f(i9, 31);
                c2042e.f6802a = iM3742f2;
                if (iM3742f2 < 0 || iM3742f2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c2042e.f6802a);
                }
                int i11 = c2042e.f6809h;
                if (iM3742f2 < i11) {
                    if (iM3742f2 == 0) {
                        C2041d[] c2041dArr4 = c2042e.f6806e;
                        AbstractC0972l.m1998V(c2041dArr4, 0, c2041dArr4.length);
                        c2042e.f6807f = c2042e.f6806e.length - 1;
                        c2042e.f6808g = 0;
                        c2042e.f6809h = 0;
                    } else {
                        c2042e.m3738b(i11 - iM3742f2);
                    }
                }
            } else if (i9 == 16 || i9 == 0) {
                C2041d[] c2041dArr5 = AbstractC2044g.f6818a;
                C2709h c2709hM3741e2 = c2042e.m3741e();
                AbstractC2044g.m3748a(c2709hM3741e2);
                c2042e.m3737a(new C2041d(c2709hM3741e2, c2042e.m3741e()));
            } else {
                c2042e.m3737a(new C2041d(c2042e.m3739c(c2042e.m3742f(i9, 15) - 1), c2042e.m3741e()));
            }
        }
        ArrayList arrayList = c2042e.f6803b;
        List listM2024e0 = AbstractC0973m.m2024e0(arrayList);
        arrayList.clear();
        c2042e.f6804c = 0L;
        return listM2024e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3764f(C2053p c2053p, int i5, int i6, int i7) throws IOException {
        if (i7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i8 = 0;
        boolean z5 = (i6 & 1) != 0;
        if ((i6 & 8) != 0) {
            byte b2 = this.f6883d.readByte();
            byte[] bArr = AbstractC1774e.f6072a;
            i8 = b2 & 255;
        }
        if ((i6 & 32) != 0) {
            InterfaceC2708g interfaceC2708g = this.f6883d;
            interfaceC2708g.readInt();
            interfaceC2708g.readByte();
            byte[] bArr2 = AbstractC1774e.f6072a;
            i5 -= 5;
        }
        List listM3763d = m3763d(AbstractC2056s.m3760a(i5, i6, i8), i8, i6, i7);
        C2054q c2054q = c2053p.f6842e;
        if (i7 != 0 && (i7 & 1) == 0) {
            C1807c.m3275b(c2054q.f6854l, c2054q.f6848f + '[' + i7 + "] onHeaders", new C2049l(c2054q, i7, listM3763d, z5));
            return;
        }
        synchronized (c2054q) {
            C2062y c2062yM3753c = c2054q.m3753c(i7);
            if (c2062yM3753c != null) {
                c2062yM3753c.m3777i(AbstractC1776g.m3180g(listM3763d), z5);
                return;
            }
            if (c2054q.f6851i) {
                return;
            }
            if (i7 <= c2054q.f6849g) {
                return;
            }
            if (i7 % 2 == c2054q.f6850h % 2) {
                return;
            }
            C2062y c2062y = new C2062y(i7, c2054q, false, z5, AbstractC1776g.m3180g(listM3763d));
            c2054q.f6849g = i7;
            c2054q.f6847e.put(Integer.valueOf(i7), c2062y);
            C1807c.m3275b(c2054q.f6852j.m3283d(), c2054q.f6848f + '[' + i7 + "] onStream", new C0073m(20, c2054q, c2062y));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3765h(C2053p c2053p, int i5, int i6, int i7) throws IOException {
        int i8;
        if (i7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i9 = 0;
        if ((i6 & 8) != 0) {
            byte b2 = this.f6883d.readByte();
            byte[] bArr = AbstractC1774e.f6072a;
            i8 = b2 & 255;
        } else {
            i8 = 0;
        }
        int i10 = this.f6883d.readInt() & Integer.MAX_VALUE;
        List listM3763d = m3763d(AbstractC2056s.m3760a(i5 - 4, i6, i8), i8, i6, i7);
        C2054q c2054q = c2053p.f6842e;
        synchronized (c2054q) {
            if (c2054q.f6845B.contains(Integer.valueOf(i10))) {
                c2054q.m3758l(i10, EnumC2039b.f6785g);
                return;
            }
            c2054q.f6845B.add(Integer.valueOf(i10));
            C1807c.m3275b(c2054q.f6854l, c2054q.f6848f + '[' + i10 + "] onRequest", new C2049l(c2054q, i10, listM3763d, i9));
        }
    }
}
