package yyds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲇᛲᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2401 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f11828;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f11832;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public long f11833;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2066 f11835;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f11830 = 4096;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f11831 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C1843[] f11829 = new C1843[8];

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f11834 = 7;

    public C2401(C2311 c2311) {
        this.f11835 = new C2066(c2311);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2534 m4440() {
        C2066 c2066 = this.f11835;
        byte bM3925 = c2066.m3925();
        byte[] bArr = AbstractC1429.f6782;
        int i = bM3925 & 255;
        int i2 = 0;
        boolean z = (bM3925 & 128) == 128;
        long jM4444 = m4444(i, 127);
        if (this.f11833 + jM4444 > 262144) {
            C0188.m804("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return c2066.m3927(jM4444);
        }
        C1507 c1507 = new C1507();
        C0394 c0394 = AbstractC1234.f5656;
        C0394 c03942 = c0394;
        int i3 = 0;
        for (long j = 0; j < jM4444; j++) {
            byte bM39252 = c2066.m3925();
            byte[] bArr2 = AbstractC1429.f6782;
            i2 = (i2 << 8) | (bM39252 & 255);
            i3 += 8;
            while (i3 >= 8) {
                c03942 = ((C0394[]) c03942.f2032)[(i2 >>> (i3 - 8)) & 255];
                if (((C0394[]) c03942.f2032) == null) {
                    c1507.m3036(c03942.f2030);
                    i3 -= c03942.f2031;
                    c03942 = c0394;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            C0394 c03943 = ((C0394[]) c03942.f2032)[(i2 << (8 - i3)) & 255];
            C0394[] c0394Arr = (C0394[]) c03943.f2032;
            int i4 = c03943.f2031;
            if (c0394Arr != null || i4 > i3) {
                break;
            }
            c1507.m3036(c03943.f2030);
            i3 -= i4;
            c03942 = c0394;
        }
        return c1507.m3037(c1507.f7087);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4441(C1843 c1843) {
        this.f11831.add(c1843);
        long jMo4261 = this.f11833 + ((long) (c1843.f9271.mo4261() + c1843.f9270.mo4261()));
        this.f11833 = jMo4261;
        if (jMo4261 <= 262144) {
            return;
        }
        C0188.m804("header byte count limit of 262144 exceeded");
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m4442(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f11829.length;
            while (true) {
                length--;
                i2 = this.f11834;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f11829[length].f9272;
                i -= i4;
                this.f11828 -= i4;
                this.f11832--;
                i3++;
            }
            C1843[] c1843Arr = this.f11829;
            int i5 = i2 + 1;
            System.arraycopy(c1843Arr, i5, c1843Arr, i5 + i3, this.f11832);
            this.f11834 += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2534 m4443(int i) throws IOException {
        if (i >= 0) {
            C1843[] c1843Arr = AbstractC1190.f5457;
            if (i <= c1843Arr.length - 1) {
                return c1843Arr[i].f9270;
            }
        }
        int length = this.f11834 + 1 + (i - AbstractC1190.f5457.length);
        if (length >= 0) {
            C1843[] c1843Arr2 = this.f11829;
            if (length < c1843Arr2.length) {
                return c1843Arr2[length].f9270;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int m4444(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte bM3925 = this.f11835.m3925();
            byte[] bArr = AbstractC1429.f6782;
            i4++;
            long j2 = ((long) (bM3925 & 127)) << i5;
            if (j2 > 2147483647L - j) {
                C0188.m804("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((bM3925 & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        C0188.m804("HPACK integer overflow");
        return 0;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m4445(C1843 c1843) {
        m4441(c1843);
        int i = c1843.f9272;
        int i2 = this.f11830;
        if (i > i2) {
            C1843[] c1843Arr = this.f11829;
            Arrays.fill(c1843Arr, 0, c1843Arr.length, (Object) null);
            this.f11834 = this.f11829.length - 1;
            this.f11832 = 0;
            this.f11828 = 0;
            return;
        }
        m4442((this.f11828 + i) - i2);
        int i3 = this.f11832 + 1;
        C1843[] c1843Arr2 = this.f11829;
        if (i3 > c1843Arr2.length) {
            C1843[] c1843Arr3 = new C1843[c1843Arr2.length * 2];
            System.arraycopy(c1843Arr2, 0, c1843Arr3, c1843Arr2.length, c1843Arr2.length);
            this.f11834 = this.f11829.length - 1;
            this.f11829 = c1843Arr3;
            c1843Arr2 = c1843Arr3;
        }
        int i4 = this.f11834;
        this.f11834 = i4 - 1;
        c1843Arr2[i4] = c1843;
        this.f11832++;
        this.f11828 += i;
    }
}
