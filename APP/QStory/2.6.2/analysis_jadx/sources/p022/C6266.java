package p022;

import androidx.compose.animation.core.C0318;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.collections.AbstractC4346;
import okio.ByteString;
import p005.C6101;
import p005.C6108;
import p017.AbstractC6233;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6266 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17255;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6108 f17258;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f17261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f17260 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f17259 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6268[] f17257 = new C6268[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f17256 = 7;

    public C6266(C6280 c6280) {
        this.f17258 = new C6108(c6280);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m11753(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f17258.readByte();
            byte[] bArr = AbstractC6233.f17181;
            int i5 = b & DefaultClassResolver.NAME;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ByteString m11754() {
        C6108 c6108 = this.f17258;
        byte b = c6108.readByte();
        byte[] bArr = AbstractC6233.f17181;
        int i = b & DefaultClassResolver.NAME;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jM11753 = m11753(i, 127);
        if (!z) {
            return c6108.mo11487(jM11753);
        }
        C6101 c6101 = new C6101();
        int[] iArr = AbstractC6264.f17246;
        c6108.getClass();
        C0318 c0318 = AbstractC6264.f17244;
        C0318 c03182 = c0318;
        int i3 = 0;
        for (long j = 0; j < jM11753; j++) {
            byte b2 = c6108.readByte();
            byte[] bArr2 = AbstractC6233.f17181;
            i2 = (i2 << 8) | (b2 & DefaultClassResolver.NAME);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = (i2 >>> (i3 - 8)) & Opcodes.CONST_METHOD_TYPE;
                C0318[] c0318Arr = (C0318[]) c03182.f1071;
                c0318Arr.getClass();
                c03182 = c0318Arr[i4];
                c03182.getClass();
                if (((C0318[]) c03182.f1071) == null) {
                    c6101.m11474(c03182.f1072);
                    i3 -= c03182.f1070;
                    c03182 = c0318;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            int i5 = (i2 << (8 - i3)) & Opcodes.CONST_METHOD_TYPE;
            C0318[] c0318Arr2 = (C0318[]) c03182.f1071;
            c0318Arr2.getClass();
            C0318 c03183 = c0318Arr2[i5];
            c03183.getClass();
            int i6 = c03183.f1070;
            if (((C0318[]) c03183.f1071) != null || i6 > i3) {
                break;
            }
            c6101.m11474(c03183.f1072);
            i3 -= i6;
            c03182 = c0318;
        }
        return c6101.mo11487(c6101.f16657);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11755(C6268 c6268) {
        this.f17259.add(c6268);
        int i = c6268.f17269;
        int i2 = this.f17260;
        if (i > i2) {
            C6268[] c6268Arr = this.f17257;
            AbstractC4346.m8861(0, c6268Arr.length, null, c6268Arr);
            this.f17256 = this.f17257.length - 1;
            this.f17255 = 0;
            this.f17261 = 0;
            return;
        }
        m11757((this.f17261 + i) - i2);
        int i3 = this.f17255 + 1;
        C6268[] c6268Arr2 = this.f17257;
        if (i3 > c6268Arr2.length) {
            C6268[] c6268Arr3 = new C6268[c6268Arr2.length * 2];
            System.arraycopy(c6268Arr2, 0, c6268Arr3, c6268Arr2.length, c6268Arr2.length);
            this.f17256 = this.f17257.length - 1;
            this.f17257 = c6268Arr3;
        }
        int i4 = this.f17256;
        this.f17256 = i4 - 1;
        this.f17257[i4] = c6268;
        this.f17255++;
        this.f17261 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString m11756(int i) throws IOException {
        if (i >= 0) {
            C6268[] c6268Arr = AbstractC6284.f17356;
            if (i <= c6268Arr.length - 1) {
                return c6268Arr[i].f17271;
            }
        }
        int length = this.f17256 + 1 + (i - AbstractC6284.f17356.length);
        if (length >= 0) {
            C6268[] c6268Arr2 = this.f17257;
            if (length < c6268Arr2.length) {
                C6268 c6268 = c6268Arr2[length];
                c6268.getClass();
                return c6268.f17271;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m11757(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f17257.length;
            while (true) {
                length--;
                i2 = this.f17256;
                if (length < i2 || i <= 0) {
                    break;
                }
                C6268 c6268 = this.f17257[length];
                c6268.getClass();
                int i4 = c6268.f17269;
                i -= i4;
                this.f17261 -= i4;
                this.f17255--;
                i3++;
            }
            C6268[] c6268Arr = this.f17257;
            System.arraycopy(c6268Arr, i2 + 1, c6268Arr, i2 + 1 + i3, this.f17255);
            this.f17256 += i3;
        }
        return i3;
    }
}
