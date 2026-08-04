package yyds;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᛲᛱᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0276 implements Closeable {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final Logger f1480 = Logger.getLogger(AbstractC0545.class.getName());

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f1481;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2351 f1482;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2776 f1483;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f1484;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1507 f1485;

    public C0276(C2776 c2776) {
        this.f1483 = c2776;
        C1507 c1507 = new C1507();
        this.f1485 = c1507;
        this.f1481 = 16384;
        this.f1482 = new C2351(c1507);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f1484 = true;
            this.f1483.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f1484) {
                throw new IOException("closed");
            }
            this.f1483.flush();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m917(C1670 c1670) {
        synchronized (this) {
            try {
                if (this.f1484) {
                    throw new IOException("closed");
                }
                int i = this.f1481;
                int i2 = c1670.f8523;
                if ((i2 & 32) != 0) {
                    i = c1670.f8524[5];
                }
                this.f1481 = i;
                if (((i2 & 2) != 0 ? c1670.f8524[1] : -1) != -1) {
                    C2351 c2351 = this.f1482;
                    int iMin = Math.min((i2 & 2) != 0 ? c1670.f8524[1] : -1, 16384);
                    int i3 = c2351.f11537;
                    if (i3 != iMin) {
                        if (iMin < i3) {
                            c2351.f11533 = Math.min(c2351.f11533, iMin);
                        }
                        c2351.f11535 = true;
                        c2351.f11537 = iMin;
                        int i4 = c2351.f11530;
                        if (iMin < i4) {
                            if (iMin == 0) {
                                C1843[] c1843Arr = c2351.f11531;
                                Arrays.fill(c1843Arr, 0, c1843Arr.length, (Object) null);
                                c2351.f11536 = c2351.f11531.length - 1;
                                c2351.f11534 = 0;
                                c2351.f11530 = 0;
                            } else {
                                c2351.m4364(i4 - iMin);
                            }
                        }
                    }
                }
                m921(0, 0, 4, 1);
                this.f1483.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m918(int i, long j) {
        synchronized (this) {
            try {
                if (this.f1484) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f1480;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC0545.m1381(false, i, 4, j));
                }
                m921(i, 4, 8, 0);
                this.f1483.m4894((int) j);
                this.f1483.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m919(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f1484) {
                throw new IOException("closed");
            }
            this.f1482.m4367(arrayList);
            long j = this.f1485.f7087;
            long jMin = Math.min(this.f1481, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m921(i, (int) jMin, 1, i2);
            this.f1483.mo576(jMin, this.f1485);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f1481, j2);
                    j2 -= jMin2;
                    m921(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f1483.mo576(jMin2, this.f1485);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m920(int i, int i2) {
        synchronized (this) {
            if (this.f1484) {
                throw new IOException("closed");
            }
            if (AbstractC2104.m4012(i2) == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m921(i, 4, 3, 0);
            this.f1483.m4894(AbstractC2104.m4012(i2));
            this.f1483.flush();
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m921(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f1480;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC0545.m1380(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f1481) {
            C0188.m790("FRAME_SIZE_ERROR length > ", this.f1481, ": ", i2);
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C0188.m806(AbstractC0897.m1989(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = AbstractC1429.f6782;
        C2776 c2776 = this.f1483;
        c2776.m4893((i2 >>> 16) & 255);
        c2776.m4893((i2 >>> 8) & 255);
        c2776.m4893(i2 & 255);
        c2776.m4893(i3 & 255);
        c2776.m4893(i4 & 255);
        c2776.m4894(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m922(byte[] bArr, int i, int i2) {
        synchronized (this) {
            if (this.f1484) {
                throw new IOException("closed");
            }
            if (AbstractC2104.m4012(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m921(0, bArr.length + 8, 7, 0);
            this.f1483.m4894(i);
            this.f1483.m4894(AbstractC2104.m4012(i2));
            if (bArr.length != 0) {
                C2776 c2776 = this.f1483;
                if (c2776.f13528) {
                    throw new IllegalStateException("closed");
                }
                c2776.f13530.m3018(bArr.length, bArr);
                c2776.m4891();
            }
            this.f1483.flush();
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m923(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f1484) {
                throw new IOException("closed");
            }
            m921(0, 8, 6, z ? 1 : 0);
            this.f1483.m4894(i);
            this.f1483.m4894(i2);
            this.f1483.flush();
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m924(boolean z, int i, C1507 c1507, int i2) {
        synchronized (this) {
            if (this.f1484) {
                throw new IOException("closed");
            }
            m921(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                this.f1483.mo576(i2, c1507);
            }
        }
    }
}
