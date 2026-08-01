package kotlinx.p010io;

import io.ktor.util.C5043;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6307 implements InterfaceC6306 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f15479;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15480;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f15481;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6309 f15482;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6311 f15483;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6313 f15484;

    public C6307(InterfaceC6313 interfaceC6313) {
        this.f15484 = interfaceC6313;
        C6309 c6309Mo11162 = interfaceC6313.mo11162();
        this.f15482 = c6309Mo11162;
        C6311 c6311 = c6309Mo11162.f15488;
        this.f15483 = c6311;
        this.f15480 = c6311 != null ? c6311.f15494 : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15479 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r3 == r5.f15494) goto L15;
     */
    @Override // kotlinx.p010io.InterfaceC6306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo11164(C6309 c6309, long j) {
        C6311 c6311;
        if (this.f15479) {
            C6755.m11870("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            C5043.m9168("byteCount (", j, ") < 0");
            return 0L;
        }
        C6311 c63112 = this.f15483;
        C6309 c63092 = this.f15482;
        if (c63112 != null) {
            C6311 c63113 = c63092.f15488;
            if (c63112 == c63113) {
                int i = this.f15480;
                c63113.getClass();
            }
            C6755.m11870("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f15484.mo11161(this.f15481 + 1)) {
            return -1L;
        }
        if (this.f15483 == null && (c6311 = c63092.f15488) != null) {
            this.f15483 = c6311;
            this.f15480 = c6311.f15494;
        }
        long jMin = Math.min(j, c63092.f15487 - this.f15481);
        long j2 = this.f15481;
        long j3 = j2 + jMin;
        AbstractC6310.m11180(c63092.f15487, j2, j3);
        if (j2 != j3) {
            long j4 = j3 - j2;
            c6309.f15487 += j4;
            C6311 c63114 = c63092.f15488;
            while (true) {
                c63114.getClass();
                long j5 = c63114.f15493 - c63114.f15494;
                if (j2 < j5) {
                    break;
                }
                j2 -= j5;
                c63114 = c63114.f15490;
            }
            while (j4 > 0) {
                c63114.getClass();
                C6311 c6311M11193 = c63114.m11193();
                int i2 = c6311M11193.f15494 + ((int) j2);
                c6311M11193.f15494 = i2;
                c6311M11193.f15493 = Math.min(i2 + ((int) j4), c6311M11193.f15493);
                if (c6309.f15488 == null) {
                    c6309.f15488 = c6311M11193;
                    c6309.f15486 = c6311M11193;
                } else {
                    C6311 c63115 = c6309.f15486;
                    c63115.getClass();
                    c63115.m11194(c6311M11193);
                    c6309.f15486 = c6311M11193;
                }
                j4 -= (long) (c6311M11193.f15493 - c6311M11193.f15494);
                c63114 = c63114.f15490;
                j2 = 0;
            }
        }
        this.f15481 += jMin;
        return jMin;
    }
}
