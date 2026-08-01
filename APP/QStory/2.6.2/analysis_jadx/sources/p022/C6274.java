package p022;

import com.android.dx.io.Opcodes;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC4346;
import okhttp3.internal.http2.ErrorCode;
import p005.C6101;
import p005.C6116;
import p005.InterfaceC6120;
import p007.AbstractC6136;
import p017.AbstractC6233;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6274 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final Logger f17294 = Logger.getLogger(AbstractC6283.class.getName());

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6265 f17295;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f17296;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6101 f17297;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17298;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6120 f17299;

    public C6274(C6116 c6116) {
        c6116.getClass();
        this.f17299 = c6116;
        C6101 c6101 = new C6101();
        this.f17297 = c6101;
        this.f17298 = 16384;
        this.f17295 = new C6265(c6101);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f17296 = true;
            this.f17299.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f17296) {
                throw new IOException("closed");
            }
            this.f17299.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11778(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f17294;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC6283.m11797(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f17298) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f17298 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C5919.m11253(AbstractC6136.m11556(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = AbstractC6233.f17181;
        InterfaceC6120 interfaceC6120 = this.f17299;
        interfaceC6120.getClass();
        interfaceC6120.writeByte((i2 >>> 16) & Opcodes.CONST_METHOD_TYPE);
        interfaceC6120.writeByte((i2 >>> 8) & Opcodes.CONST_METHOD_TYPE);
        interfaceC6120.writeByte(i2 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6120.writeByte(i3 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6120.writeByte(i4 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6120.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11779(boolean z, int i, C6101 c6101, int i2) {
        synchronized (this) {
            if (this.f17296) {
                throw new IOException("closed");
            }
            m11778(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                InterfaceC6120 interfaceC6120 = this.f17299;
                c6101.getClass();
                interfaceC6120.mo10877(c6101, i2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11780(C6262 c6262) {
        c6262.getClass();
        synchronized (this) {
            try {
                if (this.f17296) {
                    throw new IOException("closed");
                }
                int i = this.f17298;
                int i2 = c6262.f17242;
                if ((i2 & 32) != 0) {
                    i = c6262.f17241[5];
                }
                this.f17298 = i;
                if (((i2 & 2) != 0 ? c6262.f17241[1] : -1) != -1) {
                    C6265 c6265 = this.f17295;
                    int i3 = (i2 & 2) != 0 ? c6262.f17241[1] : -1;
                    c6265.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = c6265.f17249;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            c6265.f17251 = Math.min(c6265.f17251, iMin);
                        }
                        c6265.f17250 = true;
                        c6265.f17249 = iMin;
                        int i5 = c6265.f17253;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                C6268[] c6268Arr = c6265.f17248;
                                AbstractC4346.m8861(0, c6268Arr.length, null, c6268Arr);
                                c6265.f17247 = c6265.f17248.length - 1;
                                c6265.f17254 = 0;
                                c6265.f17253 = 0;
                            } else {
                                c6265.m11752(i5 - iMin);
                            }
                        }
                    }
                }
                m11778(0, 0, 4, 1);
                this.f17299.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11781(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f17296) {
                throw new IOException("closed");
            }
            this.f17295.m11749(arrayList);
            long j = this.f17297.f16657;
            long jMin = Math.min(this.f17298, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m11778(i, (int) jMin, 1, i2);
            this.f17299.mo10877(this.f17297, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f17298, j2);
                    j2 -= jMin2;
                    m11778(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f17299.mo10877(this.f17297, jMin2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11782(int i, ErrorCode errorCode, byte[] bArr) {
        errorCode.getClass();
        synchronized (this) {
            if (this.f17296) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m11778(0, bArr.length + 8, 7, 0);
            this.f17299.writeInt(i);
            this.f17299.writeInt(errorCode.getHttpCode());
            if (bArr.length != 0) {
                this.f17299.write(bArr);
            }
            this.f17299.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11783(int i, ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (this.f17296) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m11778(i, 4, 3, 0);
            this.f17299.writeInt(errorCode.getHttpCode());
            this.f17299.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11784(int i, long j) {
        synchronized (this) {
            try {
                if (this.f17296) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f17294;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC6283.m11796(false, i, 4, j));
                }
                m11778(i, 4, 8, 0);
                this.f17299.writeInt((int) j);
                this.f17299.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11785(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f17296) {
                throw new IOException("closed");
            }
            m11778(0, 8, 6, z ? 1 : 0);
            this.f17299.writeInt(i);
            this.f17299.writeInt(i2);
            this.f17299.flush();
        }
    }
}
