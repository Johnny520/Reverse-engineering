package p019;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import okio.ByteString;
import p004.C6092;
import p013.AbstractC6225;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6261 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f17232;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6092 f17234;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f17235;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f17236;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f17233 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f17231 = 4096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6264[] f17230 = new C6264[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17229 = 7;

    public C6261(C6092 c6092) {
        this.f17234 = c6092;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11765(int i, int i2, int i3) {
        C6092 c6092 = this.f17234;
        if (i < i2) {
            c6092.m11470(i | i3);
            return;
        }
        c6092.m11470(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c6092.m11470(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c6092.m11470(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11766(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p019.C6261.m11766(java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11767(ByteString byteString) throws EOFException {
        byteString.getClass();
        int[] iArr = AbstractC6260.f17228;
        int size = byteString.size();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            byte[] bArr = AbstractC6225.f17158;
            j2 += (long) AbstractC6260.f17227[b & DefaultClassResolver.NAME];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int size2 = byteString.size();
        C6092 c6092 = this.f17234;
        if (i2 >= size2) {
            m11765(byteString.size(), 127, 0);
            c6092.m11471(byteString);
            return;
        }
        C6092 c60922 = new C6092();
        int[] iArr2 = AbstractC6260.f17228;
        int size3 = byteString.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            byte b2 = byteString.getByte(i4);
            byte[] bArr2 = AbstractC6225.f17158;
            int i5 = b2 & DefaultClassResolver.NAME;
            int i6 = AbstractC6260.f17228[i5];
            byte b3 = AbstractC6260.f17227[i5];
            j = (j << b3) | ((long) i6);
            i3 += b3;
            while (i3 >= 8) {
                i3 -= 8;
                c60922.m11470((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            c60922.m11470((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ByteString byteStringMo11481 = c60922.mo11481(c60922.f16647);
        m11765(byteStringMo11481.size(), 127, 128);
        c6092.m11471(byteStringMo11481);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11768(C6264 c6264) {
        int i = c6264.f17251;
        int i2 = this.f17231;
        if (i > i2) {
            C6264[] c6264Arr = this.f17230;
            AbstractC4347.m8834(0, c6264Arr.length, null, c6264Arr);
            this.f17229 = this.f17230.length - 1;
            this.f17236 = 0;
            this.f17235 = 0;
            return;
        }
        m11769((this.f17235 + i) - i2);
        int i3 = this.f17236 + 1;
        C6264[] c6264Arr2 = this.f17230;
        if (i3 > c6264Arr2.length) {
            C6264[] c6264Arr3 = new C6264[c6264Arr2.length * 2];
            System.arraycopy(c6264Arr2, 0, c6264Arr3, c6264Arr2.length, c6264Arr2.length);
            this.f17229 = this.f17230.length - 1;
            this.f17230 = c6264Arr3;
        }
        int i4 = this.f17229;
        this.f17229 = i4 - 1;
        this.f17230[i4] = c6264;
        this.f17236++;
        this.f17235 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11769(int i) {
        int i2;
        if (i > 0) {
            int length = this.f17230.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f17229;
                if (length < i2 || i <= 0) {
                    break;
                }
                C6264 c6264 = this.f17230[length];
                c6264.getClass();
                i -= c6264.f17251;
                int i4 = this.f17235;
                C6264 c62642 = this.f17230[length];
                c62642.getClass();
                this.f17235 = i4 - c62642.f17251;
                this.f17236--;
                i3++;
                length--;
            }
            C6264[] c6264Arr = this.f17230;
            int i5 = i2 + 1;
            System.arraycopy(c6264Arr, i5, c6264Arr, i5 + i3, this.f17236);
            C6264[] c6264Arr2 = this.f17230;
            int i6 = this.f17229 + 1;
            Arrays.fill(c6264Arr2, i6, i6 + i3, (Object) null);
            this.f17229 += i3;
        }
    }
}
