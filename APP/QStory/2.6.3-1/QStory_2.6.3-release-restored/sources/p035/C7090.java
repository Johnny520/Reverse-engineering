package p035;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import okio.ByteString;
import p020.C6921;
import p029.AbstractC7054;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f17577;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6921 f17579;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f17580;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f17581;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f17578 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f17576 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C7093[] f17575 = new C7093[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17574 = 7;

    public C7090(C6921 c6921) {
        this.f17579 = c6921;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12324(int i, int i2, int i3) {
        C6921 c6921 = this.f17579;
        if (i < i2) {
            c6921.m12029(i | i3);
            return;
        }
        c6921.m12029(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c6921.m12029(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c6921.m12029(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12325(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f17577) {
            int i = this.f17578;
            if (i < this.f17576) {
                m12324(i, 31, 32);
            }
            this.f17577 = false;
            this.f17578 = Integer.MAX_VALUE;
            m12324(this.f17576, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7093 c7093 = (C7093) arrayList.get(i2);
            ByteString asciiLowercase = c7093.f17598.toAsciiLowercase();
            ByteString byteString = c7093.f17597;
            Integer num = (Integer) AbstractC7109.f17682.get(asciiLowercase);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    C7093[] c7093Arr = AbstractC7109.f17683;
                    if (AbstractC5227.m9466(c7093Arr[iIntValue].f17597, byteString)) {
                        length = length2;
                    } else if (AbstractC5227.m9466(c7093Arr[length2].f17597, byteString)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i3 = this.f17574 + 1;
                int length3 = this.f17575.length;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    C7093 c70932 = this.f17575[i3];
                    c70932.getClass();
                    if (AbstractC5227.m9466(c70932.f17598, asciiLowercase)) {
                        C7093 c70933 = this.f17575[i3];
                        c70933.getClass();
                        if (AbstractC5227.m9466(c70933.f17597, byteString)) {
                            length2 = AbstractC7109.f17683.length + (i3 - this.f17574);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f17574) + AbstractC7109.f17683.length;
                        }
                    }
                    i3++;
                }
            }
            if (length2 != -1) {
                m12324(length2, 127, 128);
            } else if (length == -1) {
                this.f17579.m12029(64);
                m12326(asciiLowercase);
                m12326(byteString);
                m12327(c7093);
            } else if (!asciiLowercase.startsWith(C7093.f17592) || AbstractC5227.m9466(C7093.f17595, asciiLowercase)) {
                m12324(length, 63, 64);
                m12326(byteString);
                m12327(c7093);
            } else {
                m12324(length, 15, 0);
                m12326(byteString);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12326(ByteString byteString) throws EOFException {
        byteString.getClass();
        int[] iArr = AbstractC7089.f17573;
        int size = byteString.size();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            byte[] bArr = AbstractC7054.f17503;
            j2 += (long) AbstractC7089.f17572[b & DefaultClassResolver.NAME];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int size2 = byteString.size();
        C6921 c6921 = this.f17579;
        if (i2 >= size2) {
            m12324(byteString.size(), 127, 0);
            c6921.m12030(byteString);
            return;
        }
        C6921 c69212 = new C6921();
        int[] iArr2 = AbstractC7089.f17573;
        int size3 = byteString.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            byte b2 = byteString.getByte(i4);
            byte[] bArr2 = AbstractC7054.f17503;
            int i5 = b2 & DefaultClassResolver.NAME;
            int i6 = AbstractC7089.f17573[i5];
            byte b3 = AbstractC7089.f17572[i5];
            j = (j << b3) | ((long) i6);
            i3 += b3;
            while (i3 >= 8) {
                i3 -= 8;
                c69212.m12029((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            c69212.m12029((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ByteString byteStringMo12040 = c69212.mo12040(c69212.f16992);
        m12324(byteStringMo12040.size(), 127, 128);
        c6921.m12030(byteStringMo12040);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12327(C7093 c7093) {
        int i = c7093.f17596;
        int i2 = this.f17576;
        if (i > i2) {
            C7093[] c7093Arr = this.f17575;
            AbstractC5179.m9393(0, c7093Arr.length, null, c7093Arr);
            this.f17574 = this.f17575.length - 1;
            this.f17581 = 0;
            this.f17580 = 0;
            return;
        }
        m12328((this.f17580 + i) - i2);
        int i3 = this.f17581 + 1;
        C7093[] c7093Arr2 = this.f17575;
        if (i3 > c7093Arr2.length) {
            C7093[] c7093Arr3 = new C7093[c7093Arr2.length * 2];
            System.arraycopy(c7093Arr2, 0, c7093Arr3, c7093Arr2.length, c7093Arr2.length);
            this.f17574 = this.f17575.length - 1;
            this.f17575 = c7093Arr3;
        }
        int i4 = this.f17574;
        this.f17574 = i4 - 1;
        this.f17575[i4] = c7093;
        this.f17581++;
        this.f17580 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12328(int i) {
        int i2;
        if (i > 0) {
            int length = this.f17575.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f17574;
                if (length < i2 || i <= 0) {
                    break;
                }
                C7093 c7093 = this.f17575[length];
                c7093.getClass();
                i -= c7093.f17596;
                int i4 = this.f17580;
                C7093 c70932 = this.f17575[length];
                c70932.getClass();
                this.f17580 = i4 - c70932.f17596;
                this.f17581--;
                i3++;
                length--;
            }
            C7093[] c7093Arr = this.f17575;
            int i5 = i2 + 1;
            System.arraycopy(c7093Arr, i5, c7093Arr, i5 + i3, this.f17581);
            C7093[] c7093Arr2 = this.f17575;
            int i6 = this.f17574 + 1;
            Arrays.fill(c7093Arr2, i6, i6 + i3, (Object) null);
            this.f17574 += i3;
        }
    }
}
