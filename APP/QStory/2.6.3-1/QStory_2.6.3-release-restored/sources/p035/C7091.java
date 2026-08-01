package p035;

import androidx.compose.animation.core.C1164;
import com.android.p002dx.p005io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.collections.AbstractC5179;
import okio.ByteString;
import p020.C6921;
import p020.C6928;
import p029.AbstractC7054;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7091 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17582;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6928 f17585;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f17588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f17587 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f17586 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7093[] f17584 = new C7093[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f17583 = 7;

    public C7091(C7105 c7105) {
        this.f17585 = new C6928(c7105);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m12329(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f17585.readByte();
            byte[] bArr = AbstractC7054.f17503;
            int i5 = b & DefaultClassResolver.NAME;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ByteString m12330() {
        C6928 c6928 = this.f17585;
        byte b = c6928.readByte();
        byte[] bArr = AbstractC7054.f17503;
        int i = b & DefaultClassResolver.NAME;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jM12329 = m12329(i, 127);
        if (!z) {
            return c6928.mo12040(jM12329);
        }
        C6921 c6921 = new C6921();
        int[] iArr = AbstractC7089.f17573;
        c6928.getClass();
        C1164 c1164 = AbstractC7089.f17571;
        C1164 c11642 = c1164;
        int i3 = 0;
        for (long j = 0; j < jM12329; j++) {
            byte b2 = c6928.readByte();
            byte[] bArr2 = AbstractC7054.f17503;
            i2 = (i2 << 8) | (b2 & DefaultClassResolver.NAME);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = (i2 >>> (i3 - 8)) & Opcodes.CONST_METHOD_TYPE;
                C1164[] c1164Arr = (C1164[]) c11642.f1416;
                c1164Arr.getClass();
                c11642 = c1164Arr[i4];
                c11642.getClass();
                if (((C1164[]) c11642.f1416) == null) {
                    c6921.m12029(c11642.f1417);
                    i3 -= c11642.f1415;
                    c11642 = c1164;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            int i5 = (i2 << (8 - i3)) & Opcodes.CONST_METHOD_TYPE;
            C1164[] c1164Arr2 = (C1164[]) c11642.f1416;
            c1164Arr2.getClass();
            C1164 c11643 = c1164Arr2[i5];
            c11643.getClass();
            int i6 = c11643.f1415;
            if (((C1164[]) c11643.f1416) != null || i6 > i3) {
                break;
            }
            c6921.m12029(c11643.f1417);
            i3 -= i6;
            c11642 = c1164;
        }
        return c6921.mo12040(c6921.f16992);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12331(C7093 c7093) {
        this.f17586.add(c7093);
        int i = c7093.f17596;
        int i2 = this.f17587;
        if (i > i2) {
            C7093[] c7093Arr = this.f17584;
            AbstractC5179.m9393(0, c7093Arr.length, null, c7093Arr);
            this.f17583 = this.f17584.length - 1;
            this.f17582 = 0;
            this.f17588 = 0;
            return;
        }
        m12333((this.f17588 + i) - i2);
        int i3 = this.f17582 + 1;
        C7093[] c7093Arr2 = this.f17584;
        if (i3 > c7093Arr2.length) {
            C7093[] c7093Arr3 = new C7093[c7093Arr2.length * 2];
            System.arraycopy(c7093Arr2, 0, c7093Arr3, c7093Arr2.length, c7093Arr2.length);
            this.f17583 = this.f17584.length - 1;
            this.f17584 = c7093Arr3;
        }
        int i4 = this.f17583;
        this.f17583 = i4 - 1;
        this.f17584[i4] = c7093;
        this.f17582++;
        this.f17588 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString m12332(int i) throws IOException {
        if (i >= 0) {
            C7093[] c7093Arr = AbstractC7109.f17683;
            if (i <= c7093Arr.length - 1) {
                return c7093Arr[i].f17598;
            }
        }
        int length = this.f17583 + 1 + (i - AbstractC7109.f17683.length);
        if (length >= 0) {
            C7093[] c7093Arr2 = this.f17584;
            if (length < c7093Arr2.length) {
                C7093 c7093 = c7093Arr2[length];
                c7093.getClass();
                return c7093.f17598;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12333(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f17584.length;
            while (true) {
                length--;
                i2 = this.f17583;
                if (length < i2 || i <= 0) {
                    break;
                }
                C7093 c7093 = this.f17584[length];
                c7093.getClass();
                int i4 = c7093.f17596;
                i -= i4;
                this.f17588 -= i4;
                this.f17582--;
                i3++;
            }
            C7093[] c7093Arr = this.f17584;
            System.arraycopy(c7093Arr, i2 + 1, c7093Arr, i2 + 1 + i3, this.f17582);
            this.f17583 += i3;
        }
        return i3;
    }
}
