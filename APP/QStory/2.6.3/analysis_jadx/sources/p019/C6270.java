package p019;

import com.android.dx.io.Opcodes;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC4347;
import okhttp3.internal.http2.ErrorCode;
import p004.C6092;
import p004.C6107;
import p004.InterfaceC6111;
import p009.AbstractC6183;
import p013.AbstractC6225;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6270 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final Logger f17276 = Logger.getLogger(AbstractC6279.class.getName());

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6261 f17277;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f17278;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6092 f17279;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17280;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6111 f17281;

    public C6270(C6107 c6107) {
        c6107.getClass();
        this.f17281 = c6107;
        C6092 c6092 = new C6092();
        this.f17279 = c6092;
        this.f17280 = 16384;
        this.f17277 = new C6261(c6092);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f17278 = true;
            this.f17281.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f17278) {
                throw new IOException("closed");
            }
            this.f17281.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11795(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f17276;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC6279.m11814(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f17280) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f17280 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C5925.m11314(AbstractC6183.m11588(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = AbstractC6225.f17158;
        InterfaceC6111 interfaceC6111 = this.f17281;
        interfaceC6111.getClass();
        interfaceC6111.writeByte((i2 >>> 16) & Opcodes.CONST_METHOD_TYPE);
        interfaceC6111.writeByte((i2 >>> 8) & Opcodes.CONST_METHOD_TYPE);
        interfaceC6111.writeByte(i2 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6111.writeByte(i3 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6111.writeByte(i4 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6111.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11796(boolean z, int i, C6092 c6092, int i2) {
        synchronized (this) {
            if (this.f17278) {
                throw new IOException("closed");
            }
            m11795(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                InterfaceC6111 interfaceC6111 = this.f17281;
                c6092.getClass();
                interfaceC6111.mo10935(c6092, i2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11797(C6258 c6258) {
        c6258.getClass();
        synchronized (this) {
            try {
                if (this.f17278) {
                    throw new IOException("closed");
                }
                int i = this.f17280;
                int i2 = c6258.f17224;
                if ((i2 & 32) != 0) {
                    i = c6258.f17223[5];
                }
                this.f17280 = i;
                if (((i2 & 2) != 0 ? c6258.f17223[1] : -1) != -1) {
                    C6261 c6261 = this.f17277;
                    int i3 = (i2 & 2) != 0 ? c6258.f17223[1] : -1;
                    c6261.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = c6261.f17231;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            c6261.f17233 = Math.min(c6261.f17233, iMin);
                        }
                        c6261.f17232 = true;
                        c6261.f17231 = iMin;
                        int i5 = c6261.f17235;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                C6264[] c6264Arr = c6261.f17230;
                                AbstractC4347.m8834(0, c6264Arr.length, null, c6264Arr);
                                c6261.f17229 = c6261.f17230.length - 1;
                                c6261.f17236 = 0;
                                c6261.f17235 = 0;
                            } else {
                                c6261.m11769(i5 - iMin);
                            }
                        }
                    }
                }
                m11795(0, 0, 4, 1);
                this.f17281.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11798(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f17278) {
                throw new IOException("closed");
            }
            this.f17277.m11766(arrayList);
            long j = this.f17279.f16647;
            long jMin = Math.min(this.f17280, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m11795(i, (int) jMin, 1, i2);
            this.f17281.mo10935(this.f17279, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f17280, j2);
                    j2 -= jMin2;
                    m11795(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f17281.mo10935(this.f17279, jMin2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11799(int i, ErrorCode errorCode, byte[] bArr) {
        errorCode.getClass();
        synchronized (this) {
            if (this.f17278) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m11795(0, bArr.length + 8, 7, 0);
            this.f17281.writeInt(i);
            this.f17281.writeInt(errorCode.getHttpCode());
            if (bArr.length != 0) {
                this.f17281.write(bArr);
            }
            this.f17281.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11800(int i, ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (this.f17278) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m11795(i, 4, 3, 0);
            this.f17281.writeInt(errorCode.getHttpCode());
            this.f17281.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11801(int i, long j) {
        synchronized (this) {
            try {
                if (this.f17278) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f17276;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC6279.m11813(false, i, 4, j));
                }
                m11795(i, 4, 8, 0);
                this.f17281.writeInt((int) j);
                this.f17281.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11802(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f17278) {
                throw new IOException("closed");
            }
            m11795(0, 8, 6, z ? 1 : 0);
            this.f17281.writeInt(i);
            this.f17281.writeInt(i2);
            this.f17281.flush();
        }
    }
}
