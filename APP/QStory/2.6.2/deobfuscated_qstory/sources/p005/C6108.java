package p005;

import androidx.profileinstaller.AbstractC2442;
import com.android.dx.io.Opcodes;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;
import okio.internal.AbstractC5571;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6108 implements InterfaceC6119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6101 f16681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f16682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6110 f16683;

    public C6108(InterfaceC6110 interfaceC6110) {
        interfaceC6110.getClass();
        this.f16683 = interfaceC6110;
        this.f16681 = new C6101();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f16682) {
            return;
        }
        this.f16682 = true;
        this.f16683.close();
        this.f16681.m11481();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16682;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C6101 c6101 = this.f16681;
        if (c6101.f16657 == 0 && this.f16683.mo10876(c6101, 8192L) == -1) {
            return -1;
        }
        return c6101.read(byteBuffer);
    }

    @Override // p005.InterfaceC6119
    public final byte readByte() throws EOFException {
        mo11493(1L);
        return this.f16681.readByte();
    }

    @Override // p005.InterfaceC6119
    public final int readInt() throws EOFException {
        mo11493(4L);
        return this.f16681.readInt();
    }

    @Override // p005.InterfaceC6119
    public final short readShort() throws EOFException {
        mo11493(2L);
        return this.f16681.readShort();
    }

    @Override // p005.InterfaceC6119
    public final void skip(long j) throws EOFException {
        if (this.f16682) {
            C5919.m11250("closed");
            return;
        }
        while (j > 0) {
            C6101 c6101 = this.f16681;
            if (c6101.f16657 == 0 && this.f16683.mo10876(c6101, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c6101.f16657);
            c6101.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f16683 + ')';
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final ByteString mo11467() {
        InterfaceC6110 interfaceC6110 = this.f16683;
        C6101 c6101 = this.f16681;
        c6101.mo11495(interfaceC6110);
        return c6101.mo11487(c6101.f16657);
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final String mo11472(long j) throws EOFException {
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM11509 = m11509((byte) 10, 0L, j2);
        C6101 c6101 = this.f16681;
        if (jM11509 != -1) {
            return AbstractC5571.m10883(c6101, jM11509);
        }
        if (j2 < Long.MAX_VALUE && mo11479(j2) && c6101.m11492(j2 - 1) == 13 && mo11479(j2 + 1) && c6101.m11492(j2) == 10) {
            return AbstractC5571.m10883(c6101, j2);
        }
        C6101 c61012 = new C6101();
        c6101.m11491(c61012, 0L, Math.min(32L, c6101.f16657));
        throw new EOFException("\\n not found: limit=" + Math.min(c6101.f16657, j) + " content=" + c61012.mo11487(c61012.f16657).hex() + (char) 8230);
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final String mo11473(Charset charset) {
        charset.getClass();
        InterfaceC6110 interfaceC6110 = this.f16683;
        C6101 c6101 = this.f16681;
        c6101.mo11495(interfaceC6110);
        return c6101.m11485(c6101.f16657, charset);
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo11475(C6101 c6101) {
        C6101 c61012;
        long j = 0;
        while (true) {
            InterfaceC6110 interfaceC6110 = this.f16683;
            c61012 = this.f16681;
            if (interfaceC6110.mo10876(c61012, 8192L) == -1) {
                break;
            }
            long jM11478 = c61012.m11478();
            if (jM11478 > 0) {
                j += jM11478;
                c6101.mo10877(c61012, jM11478);
            }
        }
        long j2 = c61012.f16657;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c6101.mo10877(c61012, j2);
        return j3;
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo11479(long j) {
        C6101 c6101;
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount < 0: "));
            return false;
        }
        if (this.f16682) {
            C5919.m11250("closed");
            return false;
        }
        do {
            c6101 = this.f16681;
            if (c6101.f16657 >= j) {
                return true;
            }
        } while (this.f16683.mo10876(c6101, 8192L) != -1);
        return false;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return this.f16683.mo10875();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m11508() throws EOFException {
        mo11493(4L);
        int i = this.f16681.readInt();
        return ((i & Opcodes.CONST_METHOD_TYPE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m11509(byte b, long j, long j2) {
        if (this.f16682) {
            C5919.m11250("closed");
            return 0L;
        }
        if (0 > j2) {
            C5919.m11253(AbstractC2442.m4572(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            C6101 c6101 = this.f16681;
            byte b2 = b;
            long j3 = j2;
            long jM11488 = c6101.m11488(b2, jMax, j3);
            if (jM11488 != -1) {
                return jM11488;
            }
            long j4 = c6101.f16657;
            if (j4 >= j3 || this.f16683.mo10876(c6101, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // p005.InterfaceC6119, p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C6101 mo11482() {
        return this.f16681;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m11510() {
        if (this.f16682) {
            C5919.m11250("closed");
            return false;
        }
        C6101 c6101 = this.f16681;
        return c6101.m11483() && this.f16683.mo10876(c6101, 8192L) == -1;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) {
        c6101.getClass();
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f16682) {
            C5919.m11250("closed");
            return 0L;
        }
        C6101 c61012 = this.f16681;
        if (c61012.f16657 == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f16683.mo10876(c61012, 8192L) == -1) {
                return -1L;
            }
        }
        return c61012.mo10876(c6101, Math.min(j, c61012.f16657));
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final ByteString mo11487(long j) throws EOFException {
        mo11493(j);
        return this.f16681.mo11487(j);
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo11490(C6118 c6118) throws EOFException {
        c6118.getClass();
        if (this.f16682) {
            C5919.m11250("closed");
            return 0;
        }
        while (true) {
            C6101 c6101 = this.f16681;
            int iM10882 = AbstractC5571.m10882(c6101, c6118, true);
            if (iM10882 != -2) {
                if (iM10882 != -1) {
                    c6101.skip(c6118.f16702[iM10882].size());
                    return iM10882;
                }
            } else if (this.f16683.mo10876(c6101, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo11493(long j) throws EOFException {
        if (!mo11479(j)) {
            throw new EOFException();
        }
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final InputStream mo11497() {
        return new C6103(this, 1);
    }
}
