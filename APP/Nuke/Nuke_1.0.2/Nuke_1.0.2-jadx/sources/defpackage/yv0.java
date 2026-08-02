package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yv0 implements Closeable {
    public static final Logger m = Logger.getLogger(jv0.class.getName());
    public final nn h;
    public final fn i;
    public int j;
    public boolean k;
    public final av0 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yv0(n52 n52Var) {
        n52Var.getClass();
        this.h = n52Var;
        fn fnVar = new fn();
        this.i = fnVar;
        this.j = 16384;
        this.l = new av0(fnVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(xp2 xp2Var) {
        xp2Var.getClass();
        synchronized (this) {
            try {
                if (this.k) {
                    throw new IOException("closed");
                }
                int i = this.j;
                int i2 = xp2Var.a;
                if ((i2 & 32) != 0) {
                    i = xp2Var.b[5];
                }
                this.j = i;
                if (((i2 & 2) != 0 ? xp2Var.b[1] : -1) != -1) {
                    av0 av0Var = this.l;
                    int i3 = (i2 & 2) != 0 ? xp2Var.b[1] : -1;
                    av0Var.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = av0Var.d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            av0Var.b = Math.min(av0Var.b, iMin);
                        }
                        av0Var.c = true;
                        av0Var.d = iMin;
                        int i5 = av0Var.h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                gs0[] gs0VarArr = av0Var.e;
                                mg.i0(gs0VarArr, 0, gs0VarArr.length);
                                av0Var.f = av0Var.e.length - 1;
                                av0Var.g = 0;
                                av0Var.h = 0;
                            } else {
                                av0Var.a(i5 - iMin);
                            }
                        }
                    }
                }
                e(0, 0, 4, 1);
                this.h.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(boolean z, int i, fn fnVar, int i2) {
        synchronized (this) {
            if (this.k) {
                throw new IOException("closed");
            }
            e(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                nn nnVar = this.h;
                fnVar.getClass();
                nnVar.d(fnVar, i2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.k = true;
            this.h.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = m;
            if (logger.isLoggable(level)) {
                logger.fine(jv0.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.j) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.j + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            s.c(vi0.g("reserved bit set: ", i));
            return;
        }
        byte[] bArr = ug3.a;
        nn nnVar = this.h;
        nnVar.getClass();
        nnVar.writeByte((i2 >>> 16) & 255);
        nnVar.writeByte((i2 >>> 8) & 255);
        nnVar.writeByte(i2 & 255);
        nnVar.writeByte(i3 & 255);
        nnVar.writeByte(i4 & 255);
        nnVar.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void flush() {
        synchronized (this) {
            if (this.k) {
                throw new IOException("closed");
            }
            this.h.flush();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i, cg0 cg0Var, byte[] bArr) {
        synchronized (this) {
            if (this.k) {
                throw new IOException("closed");
            }
            if (cg0Var.h == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            e(0, bArr.length + 8, 7, 0);
            this.h.writeInt(i);
            this.h.writeInt(cg0Var.h);
            if (bArr.length != 0) {
                this.h.write(bArr);
            }
            this.h.flush();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.k) {
                throw new IOException("closed");
            }
            this.l.d(arrayList);
            long j = this.i.i;
            long jMin = Math.min(this.j, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            e(i, (int) jMin, 1, i2);
            this.h.d(this.i, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.j, j2);
                    j2 -= jMin2;
                    e(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.h.d(this.i, jMin2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.k) {
                throw new IOException("closed");
            }
            e(0, 8, 6, z ? 1 : 0);
            this.h.writeInt(i);
            this.h.writeInt(i2);
            this.h.flush();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i, cg0 cg0Var) {
        synchronized (this) {
            if (this.k) {
                throw new IOException("closed");
            }
            if (cg0Var.h == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            e(i, 4, 3, 0);
            this.h.writeInt(cg0Var.h);
            this.h.flush();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(long j, int i) {
        synchronized (this) {
            try {
                if (this.k) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = m;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(jv0.c(false, i, 4, j));
                }
                e(i, 4, 8, 0);
                this.h.writeInt((int) j);
                this.h.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
