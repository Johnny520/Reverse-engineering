package kotlinx.p010io;

import androidx.profileinstaller.AbstractC3275;
import java.io.EOFException;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6304 implements InterfaceC6313 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15476;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6309 f15477 = new C6309();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6307 f15478;

    public C6304(C6307 c6307) {
        this.f15478 = c6307;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.f15476) {
            return;
        }
        this.f15476 = true;
        this.f15478.f15479 = true;
        C6309 c6309 = this.f15477;
        c6309.skip(c6309.f15487);
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final C6304 peek() {
        if (!this.f15476) {
            return new C6304(new C6307(this));
        }
        C6755.m11870("Source is closed.");
        return null;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final byte readByte() throws EOFException {
        mo11165(1L);
        return this.f15477.readByte();
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final int readInt() throws EOFException {
        mo11165(4L);
        return this.f15477.readInt();
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final long readLong() throws EOFException {
        mo11165(8L);
        return this.f15477.readLong();
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final short readShort() throws EOFException {
        mo11165(2L);
        return this.f15477.readShort();
    }

    public final String toString() {
        return "buffered(" + this.f15478 + ')';
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long mo11159(InterfaceC6316 interfaceC6316) {
        C6309 c6309;
        long j;
        interfaceC6316.getClass();
        long j2 = 0;
        while (true) {
            C6307 c6307 = this.f15478;
            c6309 = this.f15477;
            long jMo11164 = c6307.mo11164(c6309, 8192L);
            j = c6309.f15487;
            if (jMo11164 == -1) {
                break;
            }
            if (j == 0) {
                j = 0;
            } else {
                C6311 c6311 = c6309.f15486;
                c6311.getClass();
                int i = c6311.f15493;
                if (i < 8192 && c6311.f15491) {
                    j -= (long) (i - c6311.f15494);
                }
            }
            if (j > 0) {
                j2 += j;
                ((C6309) interfaceC6316).m11175(c6309, j);
            }
        }
        if (j <= 0) {
            return j2;
        }
        long j3 = j2 + j;
        ((C6309) interfaceC6316).m11175(c6309, j);
        return j3;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void mo11160(InterfaceC6316 interfaceC6316, long j) throws EOFException {
        C6309 c6309 = this.f15477;
        interfaceC6316.getClass();
        try {
            mo11165(j);
            c6309.mo11160(interfaceC6316, j);
        } catch (EOFException e) {
            ((C6309) interfaceC6316).m11175(c6309, c6309.f15487);
            throw e;
        }
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo11161(long j) {
        C6309 c6309;
        if (this.f15476) {
            C6755.m11870("Source is closed.");
            return false;
        }
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount: "));
            return false;
        }
        do {
            c6309 = this.f15477;
            if (c6309.f15487 >= j) {
                return true;
            }
        } while (this.f15478.mo11164(c6309, 8192L) != -1);
        return false;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6309 mo11162() {
        return this.f15477;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo11163() {
        if (this.f15476) {
            C6755.m11870("Source is closed.");
            return false;
        }
        C6309 c6309 = this.f15477;
        return c6309.mo11163() && this.f15478.mo11164(c6309, 8192L) == -1;
    }

    @Override // kotlinx.p010io.InterfaceC6306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final long mo11164(C6309 c6309, long j) {
        if (this.f15476) {
            C6755.m11870("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount: "));
            return 0L;
        }
        C6309 c63092 = this.f15477;
        if (c63092.f15487 == 0 && this.f15478.mo11164(c63092, 8192L) == -1) {
            return -1L;
        }
        return c63092.mo11164(c6309, Math.min(j, c63092.f15487));
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo11165(long j) throws EOFException {
        if (mo11161(j)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j + ").");
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final int mo11166(int i, byte[] bArr, int i2) {
        bArr.getClass();
        AbstractC6310.m11180(bArr.length, i, i2);
        C6309 c6309 = this.f15477;
        if (c6309.f15487 == 0 && this.f15478.mo11164(c6309, 8192L) == -1) {
            return -1;
        }
        return c6309.mo11166(i, bArr, ((int) Math.min(i2 - i, c6309.f15487)) + i);
    }
}
