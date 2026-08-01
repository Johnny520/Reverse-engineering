package p376;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.ByteOrder;
import p357.C8913;
import p357.C8914;
import p362.C8939;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8978 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final long[] f25220 = new long[64];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f25221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ByteOrder f25222;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f25223;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8913 f25224;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f25220;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    public C8978(InputStream inputStream, ByteOrder byteOrder) {
        C8914 c8914M14532 = C8913.m14532();
        c8914M14532.f25144 = new C8939(inputStream);
        try {
            this.f25224 = new C8913(c8914M14532);
            this.f25222 = byteOrder;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25224.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m14566(int i) {
        long j;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j2 = this.f25223;
        long[] jArr = f25220;
        if (this.f25222 == byteOrder) {
            j = j2 & jArr[i];
            this.f25223 = j2 >>> i;
        } else {
            j = (j2 >> (this.f25221 - i)) & jArr[i];
        }
        this.f25221 -= i;
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
        r1 = p376.C8978.f25220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r3 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r12.f25223 = ((r1[r2] & r6) << r12.f25221) | r12.f25223;
        r2 = (r6 >>> r2) & r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r3 = r12.f25223 << r2;
        r12.f25223 = r3;
        r12.f25223 = r3 | ((r6 >>> r5) & r1[r2]);
        r2 = r1[r5] & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r0 = r1[r13] & r12.f25223;
        r12.f25223 = r2;
        r12.f25221 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        return m14566(r13);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m14567(int r13) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            if (r13 < 0) goto L82
            r2 = 63
            if (r13 > r2) goto L82
        L8:
            int r2 = r12.f25221
            java.nio.ByteOrder r3 = r12.f25222
            飘花落叶言苏子世兰哲楪.飘花落叶言子楪世苏兰哲 r4 = r12.f25224
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
            long r6 = r12.f25223
            r8 = 8
            if (r3 != r2) goto L30
            int r2 = r12.f25221
            long r2 = r4 << r2
            long r2 = r2 | r6
            r12.f25223 = r2
            goto L35
        L30:
            long r2 = r6 << r8
            long r2 = r2 | r4
            r12.f25223 = r2
        L35:
            int r2 = r12.f25221
            int r2 = r2 + r8
            r12.f25221 = r2
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
            long[] r1 = p376.C8978.f25220
            if (r3 != r0) goto L62
            r3 = r1[r2]
            long r3 = r3 & r6
            long r8 = r12.f25223
            int r0 = r12.f25221
            long r3 = r3 << r0
            long r3 = r3 | r8
            r12.f25223 = r3
            long r2 = r6 >>> r2
            r6 = r1[r5]
            long r2 = r2 & r6
            goto L73
        L62:
            long r3 = r12.f25223
            long r3 = r3 << r2
            r12.f25223 = r3
            long r8 = r6 >>> r5
            r10 = r1[r2]
            long r8 = r8 & r10
            long r2 = r3 | r8
            r12.f25223 = r2
            r2 = r1[r5]
            long r2 = r2 & r6
        L73:
            long r6 = r12.f25223
            r0 = r1[r13]
            long r0 = r0 & r6
            r12.f25223 = r2
            r12.f25221 = r5
            return r0
        L7d:
            long r12 = r12.m14566(r13)
            return r12
        L82:
            java.lang.String r12 = "count must not be negative or greater than 63"
            top.suzhelan.qstory.hook.item.C5919.m11246(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p376.C8978.m14567(int):long");
    }
}
