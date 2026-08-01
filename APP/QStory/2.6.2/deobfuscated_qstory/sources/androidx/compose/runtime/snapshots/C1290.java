package androidx.compose.runtime.snapshots;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f3772;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f3773;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f3774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f3775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f3776;

    public C1290(InputStream inputStream) throws IOException {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            i = 0;
            if (i2 == -1) {
                break;
            } else if (i2 > 0) {
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        }
        inputStream.close();
        this.f3773 = byteArrayOutputStream.toByteArray();
        int iM2284 = m2284(8);
        this.f3776 = new int[iM2284];
        this.f3772 = new String[iM2284];
        int i3 = 10;
        int i4 = 1;
        while (i4 < iM2284) {
            int i5 = i3 + 1;
            this.f3776[i4] = i5;
            byte b = ((byte[]) this.f3773)[i3];
            int iM22842 = 3;
            if (b == 1) {
                iM22842 = 3 + m2284(i5);
                if (iM22842 > i) {
                    i = iM22842;
                }
            } else if (b == 15) {
                iM22842 = 4;
            } else if (b != 18 && b != 3 && b != 4) {
                if (b != 5 && b != 6) {
                    switch (b) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            iM22842 = 5;
                            break;
                    }
                } else {
                    i4++;
                    iM22842 = 9;
                }
            } else {
                iM22842 = 5;
            }
            i3 += iM22842;
            i4++;
        }
        this.f3775 = i;
        this.f3774 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m2283(int i, int i2) {
        long[] jArr = (long[]) this.f3773;
        int[] iArr = this.f3776;
        int[] iArr2 = (int[]) this.f3772;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int m2284(int i) {
        byte[] bArr = (byte[]) this.f3773;
        return (bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String m2285(int i, char[] cArr) {
        int i2;
        int iM2284 = m2284(i);
        String[] strArr = (String[]) this.f3772;
        String str = strArr[iM2284];
        if (str != null) {
            return str;
        }
        int i3 = this.f3776[iM2284];
        int i4 = i3 + 2;
        int iM22842 = m2284(i3) + i4;
        byte[] bArr = (byte[]) this.f3773;
        int i5 = 0;
        char c = 0;
        char c2 = 0;
        while (i4 < iM22842) {
            int i6 = i4 + 1;
            byte b = bArr[i4];
            if (c == 0) {
                int i7 = b & DefaultClassResolver.NAME;
                if (i7 < 128) {
                    cArr[i5] = (char) i7;
                    i5++;
                } else if (i7 >= 224 || i7 <= 191) {
                    c2 = (char) (b & 15);
                    c = 2;
                } else {
                    i2 = b & 31;
                    c2 = (char) i2;
                    c = 1;
                }
            } else if (c == 1) {
                cArr[i5] = (char) ((b & 63) | (c2 << 6));
                i5++;
                c = 0;
            } else if (c == 2) {
                i2 = (b & 63) | (c2 << 6);
                c2 = (char) i2;
                c = 1;
            }
            i4 = i6;
        }
        String str2 = new String(cArr, 0, i5);
        strArr[iM2284] = str2;
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m2286(int i) {
        byte[] bArr = (byte[]) this.f3773;
        return (bArr[i + 3] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m2287(long j) {
        int i = this.f3775 + 1;
        long[] jArr = (long[]) this.f3773;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            AbstractC4346.m8835(jArr, jArr2, 0, 0, jArr.length);
            AbstractC4346.m8838(0, 0, 14, this.f3776, iArr);
            this.f3773 = jArr2;
            this.f3776 = iArr;
        }
        int i3 = this.f3775;
        this.f3775 = i3 + 1;
        int length2 = ((int[]) this.f3772).length;
        if (this.f3774 >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            AbstractC4346.m8838(0, 0, 14, (int[]) this.f3772, iArr2);
            this.f3772 = iArr2;
        }
        int i7 = this.f3774;
        int[] iArr3 = (int[]) this.f3772;
        this.f3774 = iArr3[i7];
        long[] jArr3 = (long[]) this.f3773;
        jArr3[i3] = j;
        this.f3776[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (AbstractC4394.m8914(jArr3[i8], j) <= 0) {
                break;
            }
            m2283(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2288(p297.C8603 r18) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1290.m2288(飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏哲世兰):void");
    }
}
