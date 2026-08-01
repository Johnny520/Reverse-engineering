package p035;

import com.android.p002dx.p005io.Opcodes;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC5179;
import okhttp3.internal.http2.ErrorCode;
import p020.C6921;
import p020.C6936;
import p020.InterfaceC6940;
import p025.AbstractC7012;
import p029.AbstractC7054;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7099 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final Logger f17621 = Logger.getLogger(AbstractC7108.class.getName());

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7090 f17622;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f17623;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6921 f17624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6940 f17626;

    public C7099(C6936 c6936) {
        c6936.getClass();
        this.f17626 = c6936;
        C6921 c6921 = new C6921();
        this.f17624 = c6921;
        this.f17625 = 16384;
        this.f17622 = new C7090(c6921);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f17623 = true;
            this.f17626.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f17623) {
                throw new IOException("closed");
            }
            this.f17626.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12354(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f17621;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC7108.m12373(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f17625) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f17625 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C6755.m11873(AbstractC7012.m12147(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = AbstractC7054.f17503;
        InterfaceC6940 interfaceC6940 = this.f17626;
        interfaceC6940.getClass();
        interfaceC6940.writeByte((i2 >>> 16) & Opcodes.CONST_METHOD_TYPE);
        interfaceC6940.writeByte((i2 >>> 8) & Opcodes.CONST_METHOD_TYPE);
        interfaceC6940.writeByte(i2 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6940.writeByte(i3 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6940.writeByte(i4 & Opcodes.CONST_METHOD_TYPE);
        interfaceC6940.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12355(boolean z, int i, C6921 c6921, int i2) {
        synchronized (this) {
            if (this.f17623) {
                throw new IOException("closed");
            }
            m12354(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                InterfaceC6940 interfaceC6940 = this.f17626;
                c6921.getClass();
                interfaceC6940.mo11494(c6921, i2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12356(C7087 c7087) {
        c7087.getClass();
        synchronized (this) {
            try {
                if (this.f17623) {
                    throw new IOException("closed");
                }
                int i = this.f17625;
                int i2 = c7087.f17569;
                if ((i2 & 32) != 0) {
                    i = c7087.f17568[5];
                }
                this.f17625 = i;
                if (((i2 & 2) != 0 ? c7087.f17568[1] : -1) != -1) {
                    C7090 c7090 = this.f17622;
                    int i3 = (i2 & 2) != 0 ? c7087.f17568[1] : -1;
                    c7090.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = c7090.f17576;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            c7090.f17578 = Math.min(c7090.f17578, iMin);
                        }
                        c7090.f17577 = true;
                        c7090.f17576 = iMin;
                        int i5 = c7090.f17580;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                C7093[] c7093Arr = c7090.f17575;
                                AbstractC5179.m9393(0, c7093Arr.length, null, c7093Arr);
                                c7090.f17574 = c7090.f17575.length - 1;
                                c7090.f17581 = 0;
                                c7090.f17580 = 0;
                            } else {
                                c7090.m12328(i5 - iMin);
                            }
                        }
                    }
                }
                m12354(0, 0, 4, 1);
                this.f17626.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12357(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f17623) {
                throw new IOException("closed");
            }
            this.f17622.m12325(arrayList);
            long j = this.f17624.f16992;
            long jMin = Math.min(this.f17625, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m12354(i, (int) jMin, 1, i2);
            this.f17626.mo11494(this.f17624, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f17625, j2);
                    j2 -= jMin2;
                    m12354(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f17626.mo11494(this.f17624, jMin2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12358(int i, ErrorCode errorCode, byte[] bArr) {
        errorCode.getClass();
        synchronized (this) {
            if (this.f17623) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m12354(0, bArr.length + 8, 7, 0);
            this.f17626.writeInt(i);
            this.f17626.writeInt(errorCode.getHttpCode());
            if (bArr.length != 0) {
                this.f17626.write(bArr);
            }
            this.f17626.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m12359(int i, ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (this.f17623) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m12354(i, 4, 3, 0);
            this.f17626.writeInt(errorCode.getHttpCode());
            this.f17626.flush();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m12360(int i, long j) {
        synchronized (this) {
            try {
                if (this.f17623) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f17621;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC7108.m12372(false, i, 4, j));
                }
                m12354(i, 4, 8, 0);
                this.f17626.writeInt((int) j);
                this.f17626.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m12361(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f17623) {
                throw new IOException("closed");
            }
            m12354(0, 8, 6, z ? 1 : 0);
            this.f17626.writeInt(i);
            this.f17626.writeInt(i2);
            this.f17626.flush();
        }
    }
}
