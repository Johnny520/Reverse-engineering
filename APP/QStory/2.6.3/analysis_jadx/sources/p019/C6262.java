package p019;

import androidx.compose.animation.core.C0318;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.collections.AbstractC4347;
import okio.ByteString;
import p004.C6092;
import p004.C6099;
import p013.AbstractC6225;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6262 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6099 f17240;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f17243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f17242 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f17241 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6264[] f17239 = new C6264[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f17238 = 7;

    public C6262(C6276 c6276) {
        this.f17240 = new C6099(c6276);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m11770(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f17240.readByte();
            byte[] bArr = AbstractC6225.f17158;
            int i5 = b & DefaultClassResolver.NAME;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ByteString m11771() {
        C6099 c6099 = this.f17240;
        byte b = c6099.readByte();
        byte[] bArr = AbstractC6225.f17158;
        int i = b & DefaultClassResolver.NAME;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jM11770 = m11770(i, 127);
        if (!z) {
            return c6099.mo11481(jM11770);
        }
        C6092 c6092 = new C6092();
        int[] iArr = AbstractC6260.f17228;
        c6099.getClass();
        C0318 c0318 = AbstractC6260.f17226;
        C0318 c03182 = c0318;
        int i3 = 0;
        for (long j = 0; j < jM11770; j++) {
            byte b2 = c6099.readByte();
            byte[] bArr2 = AbstractC6225.f17158;
            i2 = (i2 << 8) | (b2 & DefaultClassResolver.NAME);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = (i2 >>> (i3 - 8)) & Opcodes.CONST_METHOD_TYPE;
                C0318[] c0318Arr = (C0318[]) c03182.f1071;
                c0318Arr.getClass();
                c03182 = c0318Arr[i4];
                c03182.getClass();
                if (((C0318[]) c03182.f1071) == null) {
                    c6092.m11470(c03182.f1072);
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
            c6092.m11470(c03183.f1072);
            i3 -= i6;
            c03182 = c0318;
        }
        return c6092.mo11481(c6092.f16647);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11772(C6264 c6264) {
        this.f17241.add(c6264);
        int i = c6264.f17251;
        int i2 = this.f17242;
        if (i > i2) {
            C6264[] c6264Arr = this.f17239;
            AbstractC4347.m8834(0, c6264Arr.length, null, c6264Arr);
            this.f17238 = this.f17239.length - 1;
            this.f17237 = 0;
            this.f17243 = 0;
            return;
        }
        m11774((this.f17243 + i) - i2);
        int i3 = this.f17237 + 1;
        C6264[] c6264Arr2 = this.f17239;
        if (i3 > c6264Arr2.length) {
            C6264[] c6264Arr3 = new C6264[c6264Arr2.length * 2];
            System.arraycopy(c6264Arr2, 0, c6264Arr3, c6264Arr2.length, c6264Arr2.length);
            this.f17238 = this.f17239.length - 1;
            this.f17239 = c6264Arr3;
        }
        int i4 = this.f17238;
        this.f17238 = i4 - 1;
        this.f17239[i4] = c6264;
        this.f17237++;
        this.f17243 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString m11773(int i) throws IOException {
        if (i >= 0) {
            C6264[] c6264Arr = AbstractC6280.f17338;
            if (i <= c6264Arr.length - 1) {
                return c6264Arr[i].f17253;
            }
        }
        int length = this.f17238 + 1 + (i - AbstractC6280.f17338.length);
        if (length >= 0) {
            C6264[] c6264Arr2 = this.f17239;
            if (length < c6264Arr2.length) {
                C6264 c6264 = c6264Arr2[length];
                c6264.getClass();
                return c6264.f17253;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m11774(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f17239.length;
            while (true) {
                length--;
                i2 = this.f17238;
                if (length < i2 || i <= 0) {
                    break;
                }
                C6264 c6264 = this.f17239[length];
                c6264.getClass();
                int i4 = c6264.f17251;
                i -= i4;
                this.f17243 -= i4;
                this.f17237--;
                i3++;
            }
            C6264[] c6264Arr = this.f17239;
            System.arraycopy(c6264Arr, i2 + 1, c6264Arr, i2 + 1 + i3, this.f17237);
            this.f17238 += i3;
        }
        return i3;
    }
}
