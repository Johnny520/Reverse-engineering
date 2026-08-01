package p156e4;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p208n4.C2706e;
import p208n4.C2715n;
import p208n4.InterfaceC2707f;

/* JADX INFO: renamed from: e4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2063z implements Closeable {

    /* JADX INFO: renamed from: i */
    public static final Logger f6910i = Logger.getLogger(AbstractC2045h.class.getName());

    /* JADX INFO: renamed from: d */
    public final InterfaceC2707f f6911d;

    /* JADX INFO: renamed from: e */
    public final C2706e f6912e;

    /* JADX INFO: renamed from: f */
    public int f6913f;

    /* JADX INFO: renamed from: g */
    public boolean f6914g;

    /* JADX INFO: renamed from: h */
    public final C2043f f6915h;

    public C2063z(C2715n c2715n) {
        AbstractC1665j.m2985e(c2715n, "sink");
        this.f6911d = c2715n;
        C2706e c2706e = new C2706e();
        this.f6912e = c2706e;
        this.f6913f = 16384;
        this.f6915h = new C2043f(c2706e);
    }

    /* JADX INFO: renamed from: b */
    public final void m3778b(C2036C c2036c) {
        AbstractC1665j.m2985e(c2036c, "peerSettings");
        synchronized (this) {
            try {
                if (this.f6914g) {
                    throw new IOException("closed");
                }
                int i5 = this.f6913f;
                int i6 = c2036c.f6780a;
                if ((i6 & 32) != 0) {
                    i5 = c2036c.f6781b[5];
                }
                this.f6913f = i5;
                if (((i6 & 2) != 0 ? c2036c.f6781b[1] : -1) != -1) {
                    C2043f c2043f = this.f6915h;
                    int i7 = (i6 & 2) != 0 ? c2036c.f6781b[1] : -1;
                    c2043f.getClass();
                    int iMin = Math.min(i7, 16384);
                    int i8 = c2043f.f6813d;
                    if (i8 != iMin) {
                        if (iMin < i8) {
                            c2043f.f6811b = Math.min(c2043f.f6811b, iMin);
                        }
                        c2043f.f6812c = true;
                        c2043f.f6813d = iMin;
                        int i9 = c2043f.f6817h;
                        if (iMin < i9) {
                            if (iMin == 0) {
                                C2041d[] c2041dArr = c2043f.f6814e;
                                AbstractC0972l.m1998V(c2041dArr, 0, c2041dArr.length);
                                c2043f.f6815f = c2043f.f6814e.length - 1;
                                c2043f.f6816g = 0;
                                c2043f.f6817h = 0;
                            } else {
                                c2043f.m3743a(i9 - iMin);
                            }
                        }
                    }
                }
                m3780d(0, 0, 4, 1);
                this.f6911d.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3779c(boolean z5, int i5, C2706e c2706e, int i6) {
        synchronized (this) {
            if (this.f6914g) {
                throw new IOException("closed");
            }
            m3780d(i5, i6, 0, z5 ? 1 : 0);
            if (i6 > 0) {
                InterfaceC2707f interfaceC2707f = this.f6911d;
                AbstractC1665j.m2982b(c2706e);
                interfaceC2707f.mo3343p(c2706e, i6);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f6914g = true;
            this.f6911d.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3780d(int i5, int i6, int i7, int i8) {
        if (i7 != 8) {
            Level level = Level.FINE;
            Logger logger = f6910i;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC2045h.m3750b(false, i5, i6, i7, i8));
            }
        }
        if (i6 > this.f6913f) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f6913f + ": " + i6).toString());
        }
        if ((Integer.MIN_VALUE & i5) != 0) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("reserved bit set: ", i5).toString());
        }
        byte[] bArr = AbstractC1774e.f6072a;
        InterfaceC2707f interfaceC2707f = this.f6911d;
        AbstractC1665j.m2985e(interfaceC2707f, "<this>");
        interfaceC2707f.writeByte((i6 >>> 16) & 255);
        interfaceC2707f.writeByte((i6 >>> 8) & 255);
        interfaceC2707f.writeByte(i6 & 255);
        interfaceC2707f.writeByte(i7 & 255);
        interfaceC2707f.writeByte(i8 & 255);
        interfaceC2707f.writeInt(i5 & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: f */
    public final void m3781f(int i5, EnumC2039b enumC2039b, byte[] bArr) {
        synchronized (this) {
            if (this.f6914g) {
                throw new IOException("closed");
            }
            if (enumC2039b.f6791d == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m3780d(0, bArr.length + 8, 7, 0);
            this.f6911d.writeInt(i5);
            this.f6911d.writeInt(enumC2039b.f6791d);
            if (bArr.length != 0) {
                this.f6911d.write(bArr);
            }
            this.f6911d.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f6914g) {
                throw new IOException("closed");
            }
            this.f6911d.flush();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3782h(boolean z5, int i5, ArrayList arrayList) {
        synchronized (this) {
            if (this.f6914g) {
                throw new IOException("closed");
            }
            this.f6915h.m3746d(arrayList);
            long j5 = this.f6912e.f8629e;
            long jMin = Math.min(this.f6913f, j5);
            int i6 = j5 == jMin ? 4 : 0;
            if (z5) {
                i6 |= 1;
            }
            m3780d(i5, (int) jMin, 1, i6);
            this.f6911d.mo3343p(this.f6912e, jMin);
            if (j5 > jMin) {
                long j6 = j5 - jMin;
                while (j6 > 0) {
                    long jMin2 = Math.min(this.f6913f, j6);
                    j6 -= jMin2;
                    m3780d(i5, (int) jMin2, 9, j6 == 0 ? 4 : 0);
                    this.f6911d.mo3343p(this.f6912e, jMin2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3783j(int i5, int i6, boolean z5) {
        synchronized (this) {
            if (this.f6914g) {
                throw new IOException("closed");
            }
            m3780d(0, 8, 6, z5 ? 1 : 0);
            this.f6911d.writeInt(i5);
            this.f6911d.writeInt(i6);
            this.f6911d.flush();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3784l(int i5, EnumC2039b enumC2039b) {
        synchronized (this) {
            if (this.f6914g) {
                throw new IOException("closed");
            }
            if (enumC2039b.f6791d == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m3780d(i5, 4, 3, 0);
            this.f6911d.writeInt(enumC2039b.f6791d);
            this.f6911d.flush();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3785m(long j5, int i5) {
        synchronized (this) {
            try {
                if (this.f6914g) {
                    throw new IOException("closed");
                }
                if (j5 == 0 || j5 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j5).toString());
                }
                Logger logger = f6910i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC2045h.m3751c(false, i5, 4, j5));
                }
                m3780d(i5, 4, 8, 0);
                this.f6911d.writeInt((int) j5);
                this.f6911d.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
