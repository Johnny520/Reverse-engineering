package p020;

import androidx.profileinstaller.AbstractC3275;
import com.android.p002dx.p005io.Opcodes;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;
import okio.internal.AbstractC6402;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6928 implements InterfaceC6939 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6921 f17016;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17017;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6930 f17018;

    public C6928(InterfaceC6930 interfaceC6930) {
        interfaceC6930.getClass();
        this.f17018 = interfaceC6930;
        this.f17016 = new C6921();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f17017) {
            return;
        }
        this.f17017 = true;
        this.f17018.close();
        this.f17016.m12034();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f17017;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C6921 c6921 = this.f17016;
        if (c6921.f16992 == 0 && this.f17018.mo11491(c6921, 8192L) == -1) {
            return -1;
        }
        return c6921.read(byteBuffer);
    }

    @Override // p020.InterfaceC6939
    public final byte readByte() throws EOFException {
        mo12046(1L);
        return this.f17016.readByte();
    }

    @Override // p020.InterfaceC6939
    public final int readInt() throws EOFException {
        mo12046(4L);
        return this.f17016.readInt();
    }

    @Override // p020.InterfaceC6939
    public final short readShort() throws EOFException {
        mo12046(2L);
        return this.f17016.readShort();
    }

    @Override // p020.InterfaceC6939
    public final void skip(long j) throws EOFException {
        if (this.f17017) {
            C6755.m11870("closed");
            return;
        }
        while (j > 0) {
            C6921 c6921 = this.f17016;
            if (c6921.f16992 == 0 && this.f17018.mo11491(c6921, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c6921.f16992);
            c6921.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f17018 + ')';
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final ByteString mo12019() {
        InterfaceC6930 interfaceC6930 = this.f17018;
        C6921 c6921 = this.f17016;
        c6921.mo12027(interfaceC6930);
        return c6921.mo12040(c6921.f16992);
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) {
        c6921.getClass();
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f17017) {
            C6755.m11870("closed");
            return 0L;
        }
        C6921 c69212 = this.f17016;
        if (c69212.f16992 == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f17018.mo11491(c69212, 8192L) == -1) {
                return -1L;
            }
        }
        return c69212.mo11491(c6921, Math.min(j, c69212.f16992));
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final int mo12026(C6938 c6938) throws EOFException {
        c6938.getClass();
        if (this.f17017) {
            C6755.m11870("closed");
            return 0;
        }
        while (true) {
            C6921 c6921 = this.f17016;
            int iM11498 = AbstractC6402.m11498(c6921, c6938, true);
            if (iM11498 != -2) {
                if (iM11498 != -1) {
                    c6921.skip(c6938.f17037[iM11498].size());
                    return iM11498;
                }
            } else if (this.f17018.mo11491(c6921, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final String mo12028(Charset charset) {
        charset.getClass();
        InterfaceC6930 interfaceC6930 = this.f17018;
        C6921 c6921 = this.f17016;
        c6921.mo12027(interfaceC6930);
        return c6921.m12036(c6921.f16992, charset);
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo12032(long j) {
        C6921 c6921;
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount < 0: "));
            return false;
        }
        if (this.f17017) {
            C6755.m11870("closed");
            return false;
        }
        do {
            c6921 = this.f17016;
            if (c6921.f16992 >= j) {
                return true;
            }
        } while (this.f17018.mo11491(c6921, 8192L) != -1);
        return false;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return this.f17018.mo11492();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m12060() throws EOFException {
        mo12046(4L);
        int i = this.f17016.readInt();
        return ((i & Opcodes.CONST_METHOD_TYPE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m12061(byte b, long j, long j2) {
        if (this.f17017) {
            C6755.m11870("closed");
            return 0L;
        }
        if (0 > j2) {
            C6755.m11873(AbstractC3275.m5143(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            C6921 c6921 = this.f17016;
            byte b2 = b;
            long j3 = j2;
            long jM12041 = c6921.m12041(b2, jMax, j3);
            if (jM12041 != -1) {
                return jM12041;
            }
            long j4 = c6921.f16992;
            if (j4 >= j3 || this.f17018.mo11491(c6921, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // p020.InterfaceC6939, p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C6921 mo12035() {
        return this.f17016;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m12062() {
        if (this.f17017) {
            C6755.m11870("closed");
            return false;
        }
        C6921 c6921 = this.f17016;
        return c6921.m12037() && this.f17018.mo11491(c6921, 8192L) == -1;
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final String mo12038(long j) throws EOFException {
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM12061 = m12061((byte) 10, 0L, j2);
        C6921 c6921 = this.f17016;
        if (jM12061 != -1) {
            return AbstractC6402.m11499(c6921, jM12061);
        }
        if (j2 < Long.MAX_VALUE && mo12032(j2) && c6921.m12045(j2 - 1) == 13 && mo12032(j2 + 1) && c6921.m12045(j2) == 10) {
            return AbstractC6402.m11499(c6921, j2);
        }
        C6921 c69212 = new C6921();
        c6921.m12044(c69212, 0L, Math.min(32L, c6921.f16992));
        throw new EOFException("\\n not found: limit=" + Math.min(c6921.f16992, j) + " content=" + c69212.mo12040(c69212.f16992).hex() + (char) 8230);
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final ByteString mo12040(long j) throws EOFException {
        mo12046(j);
        return this.f17016.mo12040(j);
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo12046(long j) throws EOFException {
        if (!mo12032(j)) {
            throw new EOFException();
        }
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final long mo12048(C6921 c6921) {
        C6921 c69212;
        long j = 0;
        while (true) {
            InterfaceC6930 interfaceC6930 = this.f17018;
            c69212 = this.f17016;
            if (interfaceC6930.mo11491(c69212, 8192L) == -1) {
                break;
            }
            long jM12031 = c69212.m12031();
            if (jM12031 > 0) {
                j += jM12031;
                c6921.mo11494(c69212, jM12031);
            }
        }
        long j2 = c69212.f16992;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c6921.mo11494(c69212, j2);
        return j3;
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final InputStream mo12049() {
        return new C6923(this, 1);
    }
}
