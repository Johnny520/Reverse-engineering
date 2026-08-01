package p004;

import androidx.profileinstaller.AbstractC2442;
import com.android.dx.io.Opcodes;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;
import okio.internal.AbstractC5572;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6099 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6092 f16671;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f16672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6101 f16673;

    public C6099(InterfaceC6101 interfaceC6101) {
        interfaceC6101.getClass();
        this.f16673 = interfaceC6101;
        this.f16671 = new C6092();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f16672) {
            return;
        }
        this.f16672 = true;
        this.f16673.close();
        this.f16671.m11475();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16672;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C6092 c6092 = this.f16671;
        if (c6092.f16647 == 0 && this.f16673.mo10932(c6092, 8192L) == -1) {
            return -1;
        }
        return c6092.read(byteBuffer);
    }

    @Override // p004.InterfaceC6110
    public final byte readByte() throws EOFException {
        mo11487(1L);
        return this.f16671.readByte();
    }

    @Override // p004.InterfaceC6110
    public final int readInt() throws EOFException {
        mo11487(4L);
        return this.f16671.readInt();
    }

    @Override // p004.InterfaceC6110
    public final short readShort() throws EOFException {
        mo11487(2L);
        return this.f16671.readShort();
    }

    @Override // p004.InterfaceC6110
    public final void skip(long j) throws EOFException {
        if (this.f16672) {
            C5925.m11311("closed");
            return;
        }
        while (j > 0) {
            C6092 c6092 = this.f16671;
            if (c6092.f16647 == 0 && this.f16673.mo10932(c6092, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c6092.f16647);
            c6092.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f16673 + ')';
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final ByteString mo11460() {
        InterfaceC6101 interfaceC6101 = this.f16673;
        C6092 c6092 = this.f16671;
        c6092.mo11468(interfaceC6101);
        return c6092.mo11481(c6092.f16647);
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) {
        c6092.getClass();
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f16672) {
            C5925.m11311("closed");
            return 0L;
        }
        C6092 c60922 = this.f16671;
        if (c60922.f16647 == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f16673.mo10932(c60922, 8192L) == -1) {
                return -1L;
            }
        }
        return c60922.mo10932(c6092, Math.min(j, c60922.f16647));
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final int mo11467(C6109 c6109) throws EOFException {
        c6109.getClass();
        if (this.f16672) {
            C5925.m11311("closed");
            return 0;
        }
        while (true) {
            C6092 c6092 = this.f16671;
            int iM10939 = AbstractC5572.m10939(c6092, c6109, true);
            if (iM10939 != -2) {
                if (iM10939 != -1) {
                    c6092.skip(c6109.f16692[iM10939].size());
                    return iM10939;
                }
            } else if (this.f16673.mo10932(c6092, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final String mo11469(Charset charset) {
        charset.getClass();
        InterfaceC6101 interfaceC6101 = this.f16673;
        C6092 c6092 = this.f16671;
        c6092.mo11468(interfaceC6101);
        return c6092.m11477(c6092.f16647, charset);
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo11473(long j) {
        C6092 c6092;
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount < 0: "));
            return false;
        }
        if (this.f16672) {
            C5925.m11311("closed");
            return false;
        }
        do {
            c6092 = this.f16671;
            if (c6092.f16647 >= j) {
                return true;
            }
        } while (this.f16673.mo10932(c6092, 8192L) != -1);
        return false;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return this.f16673.mo10933();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m11501() throws EOFException {
        mo11487(4L);
        int i = this.f16671.readInt();
        return ((i & Opcodes.CONST_METHOD_TYPE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m11502(byte b, long j, long j2) {
        if (this.f16672) {
            C5925.m11311("closed");
            return 0L;
        }
        if (0 > j2) {
            C5925.m11314(AbstractC2442.m4583(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            C6092 c6092 = this.f16671;
            byte b2 = b;
            long j3 = j2;
            long jM11482 = c6092.m11482(b2, jMax, j3);
            if (jM11482 != -1) {
                return jM11482;
            }
            long j4 = c6092.f16647;
            if (j4 >= j3 || this.f16673.mo10932(c6092, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // p004.InterfaceC6110, p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C6092 mo11476() {
        return this.f16671;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m11503() {
        if (this.f16672) {
            C5925.m11311("closed");
            return false;
        }
        C6092 c6092 = this.f16671;
        return c6092.m11478() && this.f16673.mo10932(c6092, 8192L) == -1;
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final String mo11479(long j) throws EOFException {
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM11502 = m11502((byte) 10, 0L, j2);
        C6092 c6092 = this.f16671;
        if (jM11502 != -1) {
            return AbstractC5572.m10940(c6092, jM11502);
        }
        if (j2 < Long.MAX_VALUE && mo11473(j2) && c6092.m11486(j2 - 1) == 13 && mo11473(j2 + 1) && c6092.m11486(j2) == 10) {
            return AbstractC5572.m10940(c6092, j2);
        }
        C6092 c60922 = new C6092();
        c6092.m11485(c60922, 0L, Math.min(32L, c6092.f16647));
        throw new EOFException("\\n not found: limit=" + Math.min(c6092.f16647, j) + " content=" + c60922.mo11481(c60922.f16647).hex() + (char) 8230);
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final ByteString mo11481(long j) throws EOFException {
        mo11487(j);
        return this.f16671.mo11481(j);
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo11487(long j) throws EOFException {
        if (!mo11473(j)) {
            throw new EOFException();
        }
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final long mo11489(C6092 c6092) {
        C6092 c60922;
        long j = 0;
        while (true) {
            InterfaceC6101 interfaceC6101 = this.f16673;
            c60922 = this.f16671;
            if (interfaceC6101.mo10932(c60922, 8192L) == -1) {
                break;
            }
            long jM11472 = c60922.m11472();
            if (jM11472 > 0) {
                j += jM11472;
                c6092.mo10935(c60922, jM11472);
            }
        }
        long j2 = c60922.f16647;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c6092.mo10935(c60922, j2);
        return j3;
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final InputStream mo11490() {
        return new C6094(this, 1);
    }
}
