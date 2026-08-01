package p022;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import okio.ByteString;
import p005.C6101;
import p017.AbstractC6233;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6265 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f17250;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6101 f17252;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f17253;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f17254;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f17251 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f17249 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6268[] f17248 = new C6268[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17247 = 7;

    public C6265(C6101 c6101) {
        this.f17252 = c6101;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11748(int i, int i2, int i3) {
        C6101 c6101 = this.f17252;
        if (i < i2) {
            c6101.m11474(i | i3);
            return;
        }
        c6101.m11474(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c6101.m11474(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c6101.m11474(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11749(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6265.m11749(java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11750(ByteString byteString) throws EOFException {
        byteString.getClass();
        int[] iArr = AbstractC6264.f17246;
        int size = byteString.size();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            byte[] bArr = AbstractC6233.f17181;
            j2 += (long) AbstractC6264.f17245[b & DefaultClassResolver.NAME];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int size2 = byteString.size();
        C6101 c6101 = this.f17252;
        if (i2 >= size2) {
            m11748(byteString.size(), 127, 0);
            c6101.m11476(byteString);
            return;
        }
        C6101 c61012 = new C6101();
        int[] iArr2 = AbstractC6264.f17246;
        int size3 = byteString.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            byte b2 = byteString.getByte(i4);
            byte[] bArr2 = AbstractC6233.f17181;
            int i5 = b2 & DefaultClassResolver.NAME;
            int i6 = AbstractC6264.f17246[i5];
            byte b3 = AbstractC6264.f17245[i5];
            j = (j << b3) | ((long) i6);
            i3 += b3;
            while (i3 >= 8) {
                i3 -= 8;
                c61012.m11474((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            c61012.m11474((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ByteString byteStringMo11487 = c61012.mo11487(c61012.f16657);
        m11748(byteStringMo11487.size(), 127, 128);
        c6101.m11476(byteStringMo11487);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11751(C6268 c6268) {
        int i = c6268.f17269;
        int i2 = this.f17249;
        if (i > i2) {
            C6268[] c6268Arr = this.f17248;
            AbstractC4346.m8861(0, c6268Arr.length, null, c6268Arr);
            this.f17247 = this.f17248.length - 1;
            this.f17254 = 0;
            this.f17253 = 0;
            return;
        }
        m11752((this.f17253 + i) - i2);
        int i3 = this.f17254 + 1;
        C6268[] c6268Arr2 = this.f17248;
        if (i3 > c6268Arr2.length) {
            C6268[] c6268Arr3 = new C6268[c6268Arr2.length * 2];
            System.arraycopy(c6268Arr2, 0, c6268Arr3, c6268Arr2.length, c6268Arr2.length);
            this.f17247 = this.f17248.length - 1;
            this.f17248 = c6268Arr3;
        }
        int i4 = this.f17247;
        this.f17247 = i4 - 1;
        this.f17248[i4] = c6268;
        this.f17254++;
        this.f17253 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11752(int i) {
        int i2;
        if (i > 0) {
            int length = this.f17248.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f17247;
                if (length < i2 || i <= 0) {
                    break;
                }
                C6268 c6268 = this.f17248[length];
                c6268.getClass();
                i -= c6268.f17269;
                int i4 = this.f17253;
                C6268 c62682 = this.f17248[length];
                c62682.getClass();
                this.f17253 = i4 - c62682.f17269;
                this.f17254--;
                i3++;
                length--;
            }
            C6268[] c6268Arr = this.f17248;
            int i5 = i2 + 1;
            System.arraycopy(c6268Arr, i5, c6268Arr, i5 + i3, this.f17254);
            C6268[] c6268Arr2 = this.f17248;
            int i6 = this.f17247 + 1;
            Arrays.fill(c6268Arr2, i6, i6 + i3, (Object) null);
            this.f17247 += i3;
        }
    }
}
