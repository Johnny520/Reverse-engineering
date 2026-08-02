package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: yn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0929yn {

    /* JADX INFO: renamed from: a */
    public final boolean f13524a;

    /* JADX INFO: renamed from: b */
    public byte[] f13525b;

    /* JADX INFO: renamed from: c */
    public int f13526c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f13527d;

    /* JADX INFO: renamed from: e */
    public final int f13528e;

    /* JADX INFO: renamed from: f */
    public final int f13529f;

    public C0929yn(byte[] bArr, boolean z) {
        this.f13524a = z;
        this.f13525b = bArr;
        this.f13526c = 0;
        this.f13527d = null;
        this.f13528e = 0;
        this.f13529f = 0;
    }

    /* JADX INFO: renamed from: g */
    public static void m6289g() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: a */
    public final void m6290a(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            C0676s.m4651j("bogus alignment");
            return;
        }
        int i3 = (this.f13526c + i2) & (~i2);
        if (this.f13524a) {
            m6295f(i3);
        } else if (i3 > this.f13525b.length) {
            m6289g();
            throw null;
        }
        Arrays.fill(this.f13525b, this.f13526c, i3, (byte) 0);
        this.f13526c = i3;
    }

    /* JADX INFO: renamed from: b */
    public final void m6291b(String str) {
        ArrayList arrayList = this.f13527d;
        if (arrayList == null) {
            return;
        }
        m6294e();
        arrayList.add(new C0892xn(str, this.f13526c, Integer.MAX_VALUE));
    }

    /* JADX INFO: renamed from: c */
    public final void m6292c(String str, int i) {
        ArrayList arrayList = this.f13527d;
        if (arrayList == null) {
            return;
        }
        m6294e();
        int size = arrayList.size();
        int i2 = size == 0 ? 0 : ((C0892xn) arrayList.get(size - 1)).f13085a;
        int i3 = this.f13526c;
        if (i2 <= i3) {
            i2 = i3;
        }
        arrayList.add(new C0892xn(str, i2, i + i2));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6293d() {
        return this.f13527d != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m6294e() {
        int size;
        ArrayList arrayList = this.f13527d;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        C0892xn c0892xn = (C0892xn) arrayList.get(size - 1);
        int i = this.f13526c;
        if (c0892xn.f13085a == Integer.MAX_VALUE) {
            c0892xn.f13085a = i;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6295f(int i) {
        byte[] bArr = this.f13525b;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f13526c);
            this.f13525b = bArr2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6296h(byte[] bArr) {
        int length = bArr.length;
        int i = this.f13526c;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.f13524a) {
            m6295f(i2);
        } else if (i2 > this.f13525b.length) {
            m6289g();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f13525b, i, length);
        this.f13526c = i2;
    }

    /* JADX INFO: renamed from: i */
    public final void m6297i(int i) {
        int i2 = this.f13526c;
        int i3 = i2 + 1;
        if (this.f13524a) {
            m6295f(i3);
        } else if (i3 > this.f13525b.length) {
            m6289g();
            throw null;
        }
        this.f13525b[i2] = (byte) i;
        this.f13526c = i3;
    }

    /* JADX INFO: renamed from: j */
    public final void m6298j(int i) {
        int i2 = this.f13526c;
        int i3 = i2 + 4;
        if (this.f13524a) {
            m6295f(i3);
        } else if (i3 > this.f13525b.length) {
            m6289g();
            throw null;
        }
        byte[] bArr = this.f13525b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f13526c = i3;
    }

    /* JADX INFO: renamed from: k */
    public final void m6299k(int i) {
        int i2 = this.f13526c;
        int i3 = i2 + 2;
        if (this.f13524a) {
            m6295f(i3);
        } else if (i3 > this.f13525b.length) {
            m6289g();
            throw null;
        }
        byte[] bArr = this.f13525b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f13526c = i3;
    }

    /* JADX INFO: renamed from: l */
    public final void m6300l(int i) {
        if (this.f13524a) {
            m6295f(this.f13526c + 5);
        }
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            m6297i((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m6301m(int i) {
        if (this.f13524a) {
            m6295f(this.f13526c + 5);
        }
        int i2 = this.f13526c;
        while (true) {
            int i3 = i;
            i >>>= 7;
            if (i == 0) {
                m6297i((byte) (i3 & 127));
                return this.f13526c - i2;
            }
            m6297i((byte) ((i3 & 127) | 128));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6302n(int i) {
        if (i < 0) {
            C0676s.m4651j("count < 0");
            return;
        }
        int i2 = this.f13526c + i;
        if (this.f13524a) {
            m6295f(i2);
        } else if (i2 > this.f13525b.length) {
            m6289g();
            throw null;
        }
        Arrays.fill(this.f13525b, this.f13526c, i2, (byte) 0);
        this.f13526c = i2;
    }

    public C0929yn() {
        this(new byte[1000], true);
    }
}
