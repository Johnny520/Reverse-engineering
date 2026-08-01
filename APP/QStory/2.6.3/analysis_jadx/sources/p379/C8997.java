package p379;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.ByteOrder;
import p357.C8903;
import p357.C8904;
import p377.C8991;

/* JADX INFO: renamed from: 飘花落叶言苏子楪哲兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8997 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final long[] f25260 = new long[64];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f25261;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ByteOrder f25262;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f25263;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8903 f25264;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f25260;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    public C8997(InputStream inputStream, ByteOrder byteOrder) {
        C8904 c8904M14545 = C8903.m14545();
        c8904M14545.f25218 = new C8991(inputStream);
        try {
            this.f25264 = new C8903(c8904M14545);
            this.f25262 = byteOrder;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25264.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m14602(int i) {
        long j;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j2 = this.f25263;
        long[] jArr = f25260;
        if (this.f25262 == byteOrder) {
            j = j2 & jArr[i];
            this.f25263 = j2 >>> i;
        } else {
            j = (j2 >> (this.f25261 - i)) & jArr[i];
        }
        this.f25261 -= i;
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
        r1 = p379.C8997.f25260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r3 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r12.f25263 = ((r1[r2] & r6) << r12.f25261) | r12.f25263;
        r2 = (r6 >>> r2) & r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r3 = r12.f25263 << r2;
        r12.f25263 = r3;
        r12.f25263 = r3 | ((r6 >>> r5) & r1[r2]);
        r2 = r1[r5] & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r0 = r1[r13] & r12.f25263;
        r12.f25263 = r2;
        r12.f25261 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        return m14602(r13);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m14603(int r13) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            if (r13 < 0) goto L82
            r2 = 63
            if (r13 > r2) goto L82
        L8:
            int r2 = r12.f25261
            java.nio.ByteOrder r3 = r12.f25262
            飘花落叶言苏子世兰楪哲.飘花落叶言子楪世苏兰哲 r4 = r12.f25264
            if (r2 >= r13) goto L3b
            r5 = 57
            if (r2 >= r5) goto L3b
            int r2 = r4.read()
            long r4 = (long) r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L20
            r12 = -1
            return r12
        L20:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            long r6 = r12.f25263
            r8 = 8
            if (r3 != r2) goto L30
            int r2 = r12.f25261
            long r2 = r4 << r2
            long r2 = r2 | r6
            r12.f25263 = r2
            goto L35
        L30:
            long r2 = r6 << r8
            long r2 = r2 | r4
            r12.f25263 = r2
        L35:
            int r2 = r12.f25261
            int r2 = r2 + r8
            r12.f25261 = r2
            goto L8
        L3b:
            if (r2 >= r13) goto L7d
            int r2 = r13 - r2
            int r5 = 8 - r2
            int r4 = r4.read()
            long r6 = (long) r4
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4b
            return r6
        L4b:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            long[] r1 = p379.C8997.f25260
            if (r3 != r0) goto L62
            r3 = r1[r2]
            long r3 = r3 & r6
            long r8 = r12.f25263
            int r0 = r12.f25261
            long r3 = r3 << r0
            long r3 = r3 | r8
            r12.f25263 = r3
            long r2 = r6 >>> r2
            r6 = r1[r5]
            long r2 = r2 & r6
            goto L73
        L62:
            long r3 = r12.f25263
            long r3 = r3 << r2
            r12.f25263 = r3
            long r8 = r6 >>> r5
            r10 = r1[r2]
            long r8 = r8 & r10
            long r2 = r3 | r8
            r12.f25263 = r2
            r2 = r1[r5]
            long r2 = r2 & r6
        L73:
            long r6 = r12.f25263
            r0 = r1[r13]
            long r0 = r0 & r6
            r12.f25263 = r2
            r12.f25261 = r5
            return r0
        L7d:
            long r12 = r12.m14602(r13)
            return r12
        L82:
            java.lang.String r12 = "count must not be negative or greater than 63"
            top.suzhelan.qstory.hook.item.C5925.m11307(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p379.C8997.m14603(int):long");
    }
}
