package kotlinx.io;

import androidx.profileinstaller.AbstractC2442;
import java.io.EOFException;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5472 implements InterfaceC5481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5477 f15132 = new C5477();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5475 f15133;

    public C5472(C5475 c5475) {
        this.f15133 = c5475;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.f15131) {
            return;
        }
        this.f15131 = true;
        this.f15133.f15134 = true;
        C5477 c5477 = this.f15132;
        c5477.skip(c5477.f15142);
    }

    @Override // kotlinx.io.InterfaceC5481
    public final C5472 peek() {
        if (!this.f15131) {
            return new C5472(new C5475(this));
        }
        C5925.m11311("Source is closed.");
        return null;
    }

    @Override // kotlinx.io.InterfaceC5481
    public final byte readByte() throws EOFException {
        mo10606(1L);
        return this.f15132.readByte();
    }

    @Override // kotlinx.io.InterfaceC5481
    public final int readInt() throws EOFException {
        mo10606(4L);
        return this.f15132.readInt();
    }

    @Override // kotlinx.io.InterfaceC5481
    public final long readLong() throws EOFException {
        mo10606(8L);
        return this.f15132.readLong();
    }

    @Override // kotlinx.io.InterfaceC5481
    public final short readShort() throws EOFException {
        mo10606(2L);
        return this.f15132.readShort();
    }

    public final String toString() {
        return "buffered(" + this.f15133 + ')';
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long mo10600(InterfaceC5484 interfaceC5484) {
        C5477 c5477;
        long j;
        interfaceC5484.getClass();
        long j2 = 0;
        while (true) {
            C5475 c5475 = this.f15133;
            c5477 = this.f15132;
            long jMo10605 = c5475.mo10605(c5477, 8192L);
            j = c5477.f15142;
            if (jMo10605 == -1) {
                break;
            }
            if (j == 0) {
                j = 0;
            } else {
                C5479 c5479 = c5477.f15141;
                c5479.getClass();
                int i = c5479.f15148;
                if (i < 8192 && c5479.f15146) {
                    j -= (long) (i - c5479.f15149);
                }
            }
            if (j > 0) {
                j2 += j;
                ((C5477) interfaceC5484).m10616(c5477, j);
            }
        }
        if (j <= 0) {
            return j2;
        }
        long j3 = j2 + j;
        ((C5477) interfaceC5484).m10616(c5477, j);
        return j3;
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void mo10601(InterfaceC5484 interfaceC5484, long j) throws EOFException {
        C5477 c5477 = this.f15132;
        interfaceC5484.getClass();
        try {
            mo10606(j);
            c5477.mo10601(interfaceC5484, j);
        } catch (EOFException e) {
            ((C5477) interfaceC5484).m10616(c5477, c5477.f15142);
            throw e;
        }
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo10602(long j) {
        C5477 c5477;
        if (this.f15131) {
            C5925.m11311("Source is closed.");
            return false;
        }
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount: "));
            return false;
        }
        do {
            c5477 = this.f15132;
            if (c5477.f15142 >= j) {
                return true;
            }
        } while (this.f15133.mo10605(c5477, 8192L) != -1);
        return false;
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5477 mo10603() {
        return this.f15132;
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo10604() {
        if (this.f15131) {
            C5925.m11311("Source is closed.");
            return false;
        }
        C5477 c5477 = this.f15132;
        return c5477.mo10604() && this.f15133.mo10605(c5477, 8192L) == -1;
    }

    @Override // kotlinx.io.InterfaceC5474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final long mo10605(C5477 c5477, long j) {
        if (this.f15131) {
            C5925.m11311("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount: "));
            return 0L;
        }
        C5477 c54772 = this.f15132;
        if (c54772.f15142 == 0 && this.f15133.mo10605(c54772, 8192L) == -1) {
            return -1L;
        }
        return c54772.mo10605(c5477, Math.min(j, c54772.f15142));
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo10606(long j) throws EOFException {
        if (mo10602(j)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j + ").");
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final int mo10607(int i, byte[] bArr, int i2) {
        bArr.getClass();
        AbstractC5478.m10621(bArr.length, i, i2);
        C5477 c5477 = this.f15132;
        if (c5477.f15142 == 0 && this.f15133.mo10605(c5477, 8192L) == -1) {
            return -1;
        }
        return c5477.mo10607(i, bArr, ((int) Math.min(i2 - i, c5477.f15142)) + i);
    }
}
