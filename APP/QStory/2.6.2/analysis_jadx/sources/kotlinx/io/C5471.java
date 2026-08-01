package kotlinx.io;

import androidx.profileinstaller.AbstractC2442;
import java.io.EOFException;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5471 implements InterfaceC5480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5476 f15132 = new C5476();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5474 f15133;

    public C5471(C5474 c5474) {
        this.f15133 = c5474;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.f15131) {
            return;
        }
        this.f15131 = true;
        this.f15133.f15134 = true;
        C5476 c5476 = this.f15132;
        c5476.skip(c5476.f15142);
    }

    @Override // kotlinx.io.InterfaceC5480
    public final C5471 peek() {
        if (!this.f15131) {
            return new C5471(new C5474(this));
        }
        C5919.m11250("Source is closed.");
        return null;
    }

    @Override // kotlinx.io.InterfaceC5480
    public final byte readByte() throws EOFException {
        mo10602(1L);
        return this.f15132.readByte();
    }

    @Override // kotlinx.io.InterfaceC5480
    public final int readInt() throws EOFException {
        mo10602(4L);
        return this.f15132.readInt();
    }

    @Override // kotlinx.io.InterfaceC5480
    public final long readLong() throws EOFException {
        mo10602(8L);
        return this.f15132.readLong();
    }

    @Override // kotlinx.io.InterfaceC5480
    public final short readShort() throws EOFException {
        mo10602(2L);
        return this.f15132.readShort();
    }

    public final String toString() {
        return "buffered(" + this.f15133 + ')';
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void mo10596(InterfaceC5483 interfaceC5483, long j) throws EOFException {
        C5476 c5476 = this.f15132;
        interfaceC5483.getClass();
        try {
            mo10602(j);
            c5476.mo10596(interfaceC5483, j);
        } catch (EOFException e) {
            ((C5476) interfaceC5483).m10612(c5476, c5476.f15142);
            throw e;
        }
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long mo10597(InterfaceC5483 interfaceC5483) {
        C5476 c5476;
        long j;
        interfaceC5483.getClass();
        long j2 = 0;
        while (true) {
            C5474 c5474 = this.f15133;
            c5476 = this.f15132;
            long jMo10598 = c5474.mo10598(c5476, 8192L);
            j = c5476.f15142;
            if (jMo10598 == -1) {
                break;
            }
            if (j == 0) {
                j = 0;
            } else {
                C5478 c5478 = c5476.f15141;
                c5478.getClass();
                int i = c5478.f15148;
                if (i < 8192 && c5478.f15146) {
                    j -= (long) (i - c5478.f15149);
                }
            }
            if (j > 0) {
                j2 += j;
                ((C5476) interfaceC5483).m10612(c5476, j);
            }
        }
        if (j <= 0) {
            return j2;
        }
        long j3 = j2 + j;
        ((C5476) interfaceC5483).m10612(c5476, j);
        return j3;
    }

    @Override // kotlinx.io.InterfaceC5473
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long mo10598(C5476 c5476, long j) {
        if (this.f15131) {
            C5919.m11250("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount: "));
            return 0L;
        }
        C5476 c54762 = this.f15132;
        if (c54762.f15142 == 0 && this.f15133.mo10598(c54762, 8192L) == -1) {
            return -1L;
        }
        return c54762.mo10598(c5476, Math.min(j, c54762.f15142));
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo10599(long j) {
        C5476 c5476;
        if (this.f15131) {
            C5919.m11250("Source is closed.");
            return false;
        }
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount: "));
            return false;
        }
        do {
            c5476 = this.f15132;
            if (c5476.f15142 >= j) {
                return true;
            }
        } while (this.f15133.mo10598(c5476, 8192L) != -1);
        return false;
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5476 mo10600() {
        return this.f15132;
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean mo10601() {
        if (this.f15131) {
            C5919.m11250("Source is closed.");
            return false;
        }
        C5476 c5476 = this.f15132;
        return c5476.mo10601() && this.f15133.mo10598(c5476, 8192L) == -1;
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo10602(long j) throws EOFException {
        if (mo10599(j)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j + ").");
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final int mo10603(int i, byte[] bArr, int i2) {
        bArr.getClass();
        AbstractC5477.m10617(bArr.length, i, i2);
        C5476 c5476 = this.f15132;
        if (c5476.f15142 == 0 && this.f15133.mo10598(c5476, 8192L) == -1) {
            return -1;
        }
        return c5476.mo10603(i, bArr, ((int) Math.min(i2 - i, c5476.f15142)) + i);
    }
}
