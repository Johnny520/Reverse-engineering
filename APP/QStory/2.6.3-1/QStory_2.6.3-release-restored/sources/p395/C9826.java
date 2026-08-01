package p395;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.ByteOrder;
import p373.C9732;
import p373.C9733;
import p393.C9820;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏子楪哲兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9826 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final long[] f25605 = new long[64];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f25606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ByteOrder f25607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f25608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9732 f25609;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f25605;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    public C9826(InputStream inputStream, ByteOrder byteOrder) {
        C9733 c9733M15104 = C9732.m15104();
        c9733M15104.f25563 = new C9820(inputStream);
        try {
            this.f25609 = new C9732(c9733M15104);
            this.f25607 = byteOrder;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25609.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m15161(int i) {
        long j;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j2 = this.f25608;
        long[] jArr = f25605;
        if (this.f25607 == byteOrder) {
            j = j2 & jArr[i];
            this.f25608 = j2 >>> i;
        } else {
            j = (j2 >> (this.f25606 - i)) & jArr[i];
        }
        this.f25606 -= i;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r2 >= r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r2 = r13 - r2;
        r5 = 8 - r2;
        r6 = r4.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r6 >= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        r0 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r1 = p395.C9826.f25605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r3 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r12.f25608 = ((r1[r2] & r6) << r12.f25606) | r12.f25608;
        r2 = (r6 >>> r2) & r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r3 = r12.f25608 << r2;
        r12.f25608 = r3;
        r12.f25608 = r3 | ((r6 >>> r5) & r1[r2]);
        r2 = r1[r5] & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r0 = r1[r13] & r12.f25608;
        r12.f25608 = r2;
        r12.f25606 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        return m15161(r13);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m15162(int i) throws IOException {
        if (i < 0 || i > 63) {
            C6755.m11866("count must not be negative or greater than 63");
            return 0L;
        }
        while (true) {
            int i2 = this.f25606;
            ByteOrder byteOrder = this.f25607;
            C9732 c9732 = this.f25609;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long j = c9732.read();
            if (j < 0) {
                return -1L;
            }
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j2 = this.f25608;
            if (byteOrder == byteOrder2) {
                this.f25608 = (j << this.f25606) | j2;
            } else {
                this.f25608 = (j2 << 8) | j;
            }
            this.f25606 += 8;
        }
    }
}
