package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yv0 implements Closeable {

    /* JADX INFO: renamed from: m */
    public static final Logger f13626m = Logger.getLogger(jv0.class.getName());

    /* JADX INFO: renamed from: h */
    public final InterfaceC0504nn f13627h;

    /* JADX INFO: renamed from: i */
    public final C0209fn f13628i;

    /* JADX INFO: renamed from: j */
    public int f13629j;

    /* JADX INFO: renamed from: k */
    public boolean f13630k;

    /* JADX INFO: renamed from: l */
    public final av0 f13631l;

    public yv0(n52 n52Var) {
        n52Var.getClass();
        this.f13627h = n52Var;
        C0209fn c0209fn = new C0209fn();
        this.f13628i = c0209fn;
        this.f13629j = 16384;
        this.f13631l = new av0(c0209fn);
    }

    /* JADX INFO: renamed from: b */
    public final void m6347b(xp2 xp2Var) {
        xp2Var.getClass();
        synchronized (this) {
            try {
                if (this.f13630k) {
                    throw new IOException("closed");
                }
                int i = this.f13629j;
                int i2 = xp2Var.f13107a;
                if ((i2 & 32) != 0) {
                    i = xp2Var.f13108b[5];
                }
                this.f13629j = i;
                if (((i2 & 2) != 0 ? xp2Var.f13108b[1] : -1) != -1) {
                    av0 av0Var = this.f13631l;
                    int i3 = (i2 & 2) != 0 ? xp2Var.f13108b[1] : -1;
                    av0Var.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = av0Var.f405d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            av0Var.f403b = Math.min(av0Var.f403b, iMin);
                        }
                        av0Var.f404c = true;
                        av0Var.f405d = iMin;
                        int i5 = av0Var.f409h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                gs0[] gs0VarArr = av0Var.f406e;
                                AbstractC0460mg.m3094i0(gs0VarArr, 0, gs0VarArr.length);
                                av0Var.f407f = av0Var.f406e.length - 1;
                                av0Var.f408g = 0;
                                av0Var.f409h = 0;
                            } else {
                                av0Var.m291a(i5 - iMin);
                            }
                        }
                    }
                }
                m6349e(0, 0, 4, 1);
                this.f13627h.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6348c(boolean z, int i, C0209fn c0209fn, int i2) {
        synchronized (this) {
            if (this.f13630k) {
                throw new IOException("closed");
            }
            m6349e(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                InterfaceC0504nn interfaceC0504nn = this.f13627h;
                c0209fn.getClass();
                interfaceC0504nn.mo1175d(c0209fn, i2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f13630k = true;
            this.f13627h.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6349e(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f13626m;
            if (logger.isLoggable(level)) {
                logger.fine(jv0.m2580b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f13629j) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f13629j + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C0676s.m4645c(vi0.m5688g("reserved bit set: ", i));
            return;
        }
        byte[] bArr = ug3.f11300a;
        InterfaceC0504nn interfaceC0504nn = this.f13627h;
        interfaceC0504nn.getClass();
        interfaceC0504nn.writeByte((i2 >>> 16) & 255);
        interfaceC0504nn.writeByte((i2 >>> 8) & 255);
        interfaceC0504nn.writeByte(i2 & 255);
        interfaceC0504nn.writeByte(i3 & 255);
        interfaceC0504nn.writeByte(i4 & 255);
        interfaceC0504nn.writeInt(i & Integer.MAX_VALUE);
    }

    public final void flush() {
        synchronized (this) {
            if (this.f13630k) {
                throw new IOException("closed");
            }
            this.f13627h.flush();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6350g(int i, cg0 cg0Var, byte[] bArr) {
        synchronized (this) {
            if (this.f13630k) {
                throw new IOException("closed");
            }
            if (cg0Var.f1529h == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m6349e(0, bArr.length + 8, 7, 0);
            this.f13627h.writeInt(i);
            this.f13627h.writeInt(cg0Var.f1529h);
            if (bArr.length != 0) {
                this.f13627h.write(bArr);
            }
            this.f13627h.flush();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6351h(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f13630k) {
                throw new IOException("closed");
            }
            this.f13631l.m294d(arrayList);
            long j = this.f13628i.f3068i;
            long jMin = Math.min(this.f13629j, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m6349e(i, (int) jMin, 1, i2);
            this.f13627h.mo1175d(this.f13628i, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f13629j, j2);
                    j2 -= jMin2;
                    m6349e(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f13627h.mo1175d(this.f13628i, jMin2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6352j(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f13630k) {
                throw new IOException("closed");
            }
            m6349e(0, 8, 6, z ? 1 : 0);
            this.f13627h.writeInt(i);
            this.f13627h.writeInt(i2);
            this.f13627h.flush();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6353k(int i, cg0 cg0Var) {
        synchronized (this) {
            if (this.f13630k) {
                throw new IOException("closed");
            }
            if (cg0Var.f1529h == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m6349e(i, 4, 3, 0);
            this.f13627h.writeInt(cg0Var.f1529h);
            this.f13627h.flush();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6354o(long j, int i) {
        synchronized (this) {
            try {
                if (this.f13630k) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f13626m;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(jv0.m2581c(false, i, 4, j));
                }
                m6349e(i, 4, 8, 0);
                this.f13627h.writeInt((int) j);
                this.f13627h.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
