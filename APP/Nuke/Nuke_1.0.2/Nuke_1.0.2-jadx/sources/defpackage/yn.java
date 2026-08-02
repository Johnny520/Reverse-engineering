package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yn {
    public final boolean a;
    public byte[] b;
    public int c;
    public final ArrayList d;
    public final int e;
    public final int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yn(byte[] bArr, boolean z) {
        this.a = z;
        this.b = bArr;
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            s.j("bogus alignment");
            return;
        }
        int i3 = (this.c + i2) & (~i2);
        if (this.a) {
            f(i3);
        } else if (i3 > this.b.length) {
            g();
            throw null;
        }
        Arrays.fill(this.b, this.c, i3, (byte) 0);
        this.c = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(String str) {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return;
        }
        e();
        arrayList.add(new xn(str, this.c, Integer.MAX_VALUE));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(String str, int i) {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return;
        }
        e();
        int size = arrayList.size();
        int i2 = size == 0 ? 0 : ((xn) arrayList.get(size - 1)).a;
        int i3 = this.c;
        if (i2 <= i3) {
            i2 = i3;
        }
        arrayList.add(new xn(str, i2, i + i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        return this.d != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        int size;
        ArrayList arrayList = this.d;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        xn xnVar = (xn) arrayList.get(size - 1);
        int i = this.c;
        if (xnVar.a == Integer.MAX_VALUE) {
            xnVar.a = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        byte[] bArr = this.b;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.c);
            this.b = bArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(byte[] bArr) {
        int length = bArr.length;
        int i = this.c;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.a) {
            f(i2);
        } else if (i2 > this.b.length) {
            g();
            throw null;
        }
        System.arraycopy(bArr, 0, this.b, i, length);
        this.c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(int i) {
        int i2 = this.c;
        int i3 = i2 + 1;
        if (this.a) {
            f(i3);
        } else if (i3 > this.b.length) {
            g();
            throw null;
        }
        this.b[i2] = (byte) i;
        this.c = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i) {
        int i2 = this.c;
        int i3 = i2 + 4;
        if (this.a) {
            f(i3);
        } else if (i3 > this.b.length) {
            g();
            throw null;
        }
        byte[] bArr = this.b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.c = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i) {
        int i2 = this.c;
        int i3 = i2 + 2;
        if (this.a) {
            f(i3);
        } else if (i3 > this.b.length) {
            g();
            throw null;
        }
        byte[] bArr = this.b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.c = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i) {
        if (this.a) {
            f(this.c + 5);
        }
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            i((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m(int i) {
        if (this.a) {
            f(this.c + 5);
        }
        int i2 = this.c;
        while (true) {
            int i3 = i;
            i >>>= 7;
            if (i == 0) {
                i((byte) (i3 & 127));
                return this.c - i2;
            }
            i((byte) ((i3 & 127) | 128));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(int i) {
        if (i < 0) {
            s.j("count < 0");
            return;
        }
        int i2 = this.c + i;
        if (this.a) {
            f(i2);
        } else if (i2 > this.b.length) {
            g();
            throw null;
        }
        Arrays.fill(this.b, this.c, i2, (byte) 0);
        this.c = i2;
    }

    public yn() {
        this(new byte[1000], true);
    }
}
