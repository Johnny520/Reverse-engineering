package p156e4;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p208n4.C2706e;
import p208n4.C2709h;

/* JADX INFO: renamed from: e4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2043f {

    /* JADX INFO: renamed from: a */
    public final C2706e f6810a;

    /* JADX INFO: renamed from: c */
    public boolean f6812c;

    /* JADX INFO: renamed from: g */
    public int f6816g;

    /* JADX INFO: renamed from: h */
    public int f6817h;

    /* JADX INFO: renamed from: b */
    public int f6811b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public int f6813d = 4096;

    /* JADX INFO: renamed from: e */
    public C2041d[] f6814e = new C2041d[8];

    /* JADX INFO: renamed from: f */
    public int f6815f = 7;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2043f(C2706e c2706e) {
        this.f6810a = c2706e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3743a(int i5) {
        int i6;
        if (i5 > 0) {
            int length = this.f6814e.length - 1;
            int i7 = 0;
            while (true) {
                i6 = this.f6815f;
                if (length < i6 || i5 <= 0) {
                    break;
                }
                C2041d c2041d = this.f6814e[length];
                AbstractC1665j.m2982b(c2041d);
                i5 -= c2041d.f6801c;
                int i8 = this.f6817h;
                C2041d c2041d2 = this.f6814e[length];
                AbstractC1665j.m2982b(c2041d2);
                this.f6817h = i8 - c2041d2.f6801c;
                this.f6816g--;
                i7++;
                length--;
            }
            C2041d[] c2041dArr = this.f6814e;
            int i9 = i6 + 1;
            System.arraycopy(c2041dArr, i9, c2041dArr, i9 + i7, this.f6816g);
            C2041d[] c2041dArr2 = this.f6814e;
            int i10 = this.f6815f + 1;
            Arrays.fill(c2041dArr2, i10, i10 + i7, (Object) null);
            this.f6815f += i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3744b(C2041d c2041d) {
        int i5 = c2041d.f6801c;
        int i6 = this.f6813d;
        if (i5 > i6) {
            C2041d[] c2041dArr = this.f6814e;
            AbstractC0972l.m1998V(c2041dArr, 0, c2041dArr.length);
            this.f6815f = this.f6814e.length - 1;
            this.f6816g = 0;
            this.f6817h = 0;
            return;
        }
        m3743a((this.f6817h + i5) - i6);
        int i7 = this.f6816g + 1;
        C2041d[] c2041dArr2 = this.f6814e;
        if (i7 > c2041dArr2.length) {
            C2041d[] c2041dArr3 = new C2041d[c2041dArr2.length * 2];
            System.arraycopy(c2041dArr2, 0, c2041dArr3, c2041dArr2.length, c2041dArr2.length);
            this.f6815f = this.f6814e.length - 1;
            this.f6814e = c2041dArr3;
        }
        int i8 = this.f6815f;
        this.f6815f = i8 - 1;
        this.f6814e[i8] = c2041d;
        this.f6816g++;
        this.f6817h += i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3745c(C2709h c2709h) throws EOFException {
        AbstractC1665j.m2985e(c2709h, "data");
        int[] iArr = AbstractC2034A.f6776a;
        int iMo4732a = c2709h.mo4732a();
        long j5 = 0;
        long j6 = 0;
        for (int i5 = 0; i5 < iMo4732a; i5++) {
            byte bMo4735d = c2709h.mo4735d(i5);
            byte[] bArr = AbstractC1774e.f6072a;
            j6 += (long) AbstractC2034A.f6777b[bMo4735d & 255];
        }
        int i6 = (int) ((j6 + ((long) 7)) >> 3);
        int iMo4732a2 = c2709h.mo4732a();
        C2706e c2706e = this.f6810a;
        if (i6 >= iMo4732a2) {
            m3747e(c2709h.mo4732a(), 127, 0);
            c2706e.m4703E(c2709h);
            return;
        }
        C2706e c2706e2 = new C2706e();
        int[] iArr2 = AbstractC2034A.f6776a;
        int iMo4732a3 = c2709h.mo4732a();
        int i7 = 0;
        for (int i8 = 0; i8 < iMo4732a3; i8++) {
            byte bMo4735d2 = c2709h.mo4735d(i8);
            byte[] bArr2 = AbstractC1774e.f6072a;
            int i9 = bMo4735d2 & 255;
            int i10 = AbstractC2034A.f6776a[i9];
            byte b2 = AbstractC2034A.f6777b[i9];
            j5 = (j5 << b2) | ((long) i10);
            i7 += b2;
            while (i7 >= 8) {
                i7 -= 8;
                c2706e2.m4705G((int) (j5 >> i7));
            }
        }
        if (i7 > 0) {
            c2706e2.m4705G((int) ((j5 << (8 - i7)) | (255 >>> i7)));
        }
        C2709h c2709hMo4714g = c2706e2.mo4714g(c2706e2.f8629e);
        m3747e(c2709hMo4714g.mo4732a(), 127, 128);
        c2706e.m4703E(c2709hMo4714g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3746d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f6812c) {
            int i5 = this.f6811b;
            if (i5 < this.f6813d) {
                m3747e(i5, 31, 32);
            }
            this.f6812c = false;
            this.f6811b = Integer.MAX_VALUE;
            m3747e(this.f6813d, 31, 32);
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C2041d c2041d = (C2041d) arrayList.get(i6);
            C2709h c2709hMo4740i = c2041d.f6799a.mo4740i();
            C2709h c2709h = c2041d.f6800b;
            Integer num = (Integer) AbstractC2044g.f6819b.get(c2709hMo4740i);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    C2041d[] c2041dArr = AbstractC2044g.f6818a;
                    if (AbstractC1665j.m2981a(c2041dArr[iIntValue].f6800b, c2709h)) {
                        length = length2;
                    } else if (AbstractC1665j.m2981a(c2041dArr[length2].f6800b, c2709h)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i7 = this.f6815f + 1;
                int length3 = this.f6814e.length;
                while (true) {
                    if (i7 >= length3) {
                        break;
                    }
                    C2041d c2041d2 = this.f6814e[i7];
                    AbstractC1665j.m2982b(c2041d2);
                    if (AbstractC1665j.m2981a(c2041d2.f6799a, c2709hMo4740i)) {
                        C2041d c2041d3 = this.f6814e[i7];
                        AbstractC1665j.m2982b(c2041d3);
                        if (AbstractC1665j.m2981a(c2041d3.f6800b, c2709h)) {
                            length2 = AbstractC2044g.f6818a.length + (i7 - this.f6815f);
                            break;
                        } else if (length == -1) {
                            length = (i7 - this.f6815f) + AbstractC2044g.f6818a.length;
                        }
                    }
                    i7++;
                }
            }
            if (length2 != -1) {
                m3747e(length2, 127, 128);
            } else if (length == -1) {
                this.f6810a.m4705G(64);
                m3745c(c2709hMo4740i);
                m3745c(c2709h);
                m3744b(c2041d);
            } else {
                C2709h c2709h2 = C2041d.f6793d;
                c2709hMo4740i.getClass();
                AbstractC1665j.m2985e(c2709h2, "prefix");
                if (!c2709hMo4740i.mo4737f(c2709h2, c2709h2.mo4732a()) || AbstractC1665j.m2981a(C2041d.f6798i, c2709hMo4740i)) {
                    m3747e(length, 63, 64);
                    m3745c(c2709h);
                    m3744b(c2041d);
                } else {
                    m3747e(length, 15, 0);
                    m3745c(c2709h);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m3747e(int i5, int i6, int i7) {
        C2706e c2706e = this.f6810a;
        if (i5 < i6) {
            c2706e.m4705G(i5 | i7);
            return;
        }
        c2706e.m4705G(i7 | i6);
        int i8 = i5 - i6;
        while (i8 >= 128) {
            c2706e.m4705G(128 | (i8 & 127));
            i8 >>>= 7;
        }
        c2706e.m4705G(i8);
    }
}
