package p260x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p011B4.AbstractC0231b;
import p029F0.AbstractC0391b0;
import p049I2.C0793k;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0977q;
import p117X2.AbstractC1665j;
import p169h0.InterfaceC2207p;
import p186k.AbstractC2415L;
import p186k.AbstractC2416M;
import p186k.C2408E;
import p186k.C2409F;
import p255w.C3378i;
import p255w.C3381l;

/* JADX INFO: renamed from: x.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3436s {

    /* JADX INFO: renamed from: a */
    public final C2408E f10726a;

    /* JADX INFO: renamed from: b */
    public C0793k f10727b;

    /* JADX INFO: renamed from: c */
    public final C2409F f10728c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f10729d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f10730e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f10731f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f10732g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f10733h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2207p f10734i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3436s() {
        long[] jArr = AbstractC2415L.f7816a;
        this.f10726a = new C2408E();
        C2409F c2409f = AbstractC2416M.f7817a;
        this.f10728c = new C2409F();
        this.f10729d = new ArrayList();
        this.f10730e = new ArrayList();
        this.f10731f = new ArrayList();
        this.f10732g = new ArrayList();
        this.f10733h = new ArrayList();
        this.f10734i = new C3433p(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m5698e(int[] iArr, C3381l c3381l) {
        c3381l.getClass();
        int i5 = iArr[0] + c3381l.f10546l;
        iArr[0] = i5;
        return Math.max(0, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m5699a() {
        ArrayList arrayList = this.f10733h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        AbstractC0231b.m408s(arrayList.get(0));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5700b(int i5, int i6, ArrayList arrayList, C0793k c0793k, C3378i c3378i, boolean z5, boolean z6, int i7, int i8) {
        long j5;
        boolean z7;
        Throwable th;
        ArrayList arrayList2;
        int i9;
        Object[] objArr;
        Object[] objArr2;
        C0793k c0793k2 = this.f10727b;
        this.f10727b = c0793k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3381l c3381l = (C3381l) arrayList.get(i10);
            int size2 = c3381l.f10536b.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((AbstractC0391b0) c3381l.f10536b.get(i11)).mo650l();
            }
        }
        C2408E c2408e = this.f10726a;
        if (c2408e.m4274i()) {
            m5701c();
            return;
        }
        boolean z8 = z5 || !z6;
        Object[] objArr3 = c2408e.f7788b;
        long[] jArr = c2408e.f7787a;
        int length = jArr.length - 2;
        C2409F c2409f = this.f10728c;
        if (length >= 0) {
            int i12 = 0;
            j5 = 255;
            while (true) {
                long j6 = jArr[i12];
                int i13 = i12;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    long j7 = j6;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j7 & 255) < 128) {
                            c2409f.m4279a(objArr3[(i13 << 3) + i15]);
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 == length) {
                        break;
                    } else {
                        i12 = i13 + 1;
                    }
                }
            }
        } else {
            j5 = 255;
        }
        int size3 = arrayList.size();
        for (int i16 = 0; i16 < size3; i16++) {
            C3381l c3381l2 = (C3381l) arrayList.get(i16);
            c2409f.m4290l(c3381l2.f10541g);
            int size4 = c3381l2.f10536b.size();
            for (int i17 = 0; i17 < size4; i17++) {
                ((AbstractC0391b0) c3381l2.f10536b.get(i17)).mo650l();
            }
            AbstractC0231b.m408s(this.f10726a.m4276k(c3381l2.f10541g));
        }
        int[] iArr = new int[1];
        ArrayList arrayList3 = this.f10730e;
        ArrayList arrayList4 = this.f10729d;
        if (z8 && c0793k2 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    AbstractC0977q.m2031M(arrayList4, new C3435r(c0793k2, 2));
                }
                if (arrayList4.size() > 0) {
                    C3381l c3381l3 = (C3381l) arrayList4.get(0);
                    m5698e(iArr, c3381l3);
                    Object objM4272g = c2408e.m4272g(c3381l3.f10541g);
                    AbstractC1665j.m2982b(objM4272g);
                    AbstractC0231b.m408s(objM4272g);
                    c3381l3.m5616a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    AbstractC0977q.m2031M(arrayList3, new C3435r(c0793k2, 0));
                }
                if (arrayList3.size() > 0) {
                    C3381l c3381l4 = (C3381l) arrayList3.get(0);
                    m5698e(iArr, c3381l4);
                    Object objM4272g2 = c2408e.m4272g(c3381l4.f10541g);
                    AbstractC1665j.m2982b(objM4272g2);
                    AbstractC0231b.m408s(objM4272g2);
                    c3381l4.m5616a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
        }
        Object[] objArr4 = c2409f.f7794b;
        long[] jArr2 = c2409f.f7793a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            th = null;
            arrayList2 = arrayList3;
            int i18 = 0;
            while (true) {
                long j8 = jArr2[i18];
                long[] jArr3 = jArr2;
                z7 = z8;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j8 & j5) < 128) {
                            objArr2 = objArr4;
                            AbstractC0231b.m408s(c2408e.m4272g(objArr2[(i18 << 3) + i20]));
                        } else {
                            objArr2 = objArr4;
                        }
                        j8 >>= 8;
                        i20++;
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    if (i19 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                }
                if (i18 == length2) {
                    break;
                }
                i18++;
                z8 = z7;
                jArr2 = jArr3;
                objArr4 = objArr;
            }
        } else {
            z7 = z8;
            th = null;
            arrayList2 = arrayList3;
        }
        ArrayList arrayList5 = this.f10731f;
        if (arrayList5.isEmpty()) {
            i9 = 1;
        } else {
            if (arrayList5.size() > 1) {
                AbstractC0977q.m2031M(arrayList5, new C3435r(c0793k, 3));
            }
            int size5 = arrayList5.size();
            for (int i21 = 0; i21 < size5; i21++) {
                C3381l c3381l5 = (C3381l) arrayList5.get(i21);
                Object objM4272g3 = c2408e.m4272g(c3381l5.f10541g);
                AbstractC1665j.m2982b(objM4272g3);
                AbstractC0231b.m408s(objM4272g3);
                c3381l5.m5618c((z5 ? (int) (((C3381l) AbstractC0973m.m2012S(arrayList)).m5616a(0) & 4294967295L) : 0) - m5698e(iArr, c3381l5), i5, i6);
                if (z7) {
                    m5702d(c3381l5, true);
                    throw th;
                }
            }
            i9 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList6 = this.f10732g;
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > i9) {
                AbstractC0977q.m2031M(arrayList6, new C3435r(c0793k, 1));
            }
            int size6 = arrayList6.size();
            for (int i22 = 0; i22 < size6; i22++) {
                C3381l c3381l6 = (C3381l) arrayList6.get(i22);
                Object objM4272g4 = c2408e.m4272g(c3381l6.f10541g);
                AbstractC1665j.m2982b(objM4272g4);
                AbstractC0231b.m408s(objM4272g4);
                c3381l6.m5618c((0 - c3381l6.f10546l) + m5698e(iArr, c3381l6), i5, i6);
                if (z7) {
                    m5702d(c3381l6, true);
                    throw th;
                }
            }
        }
        Collections.reverse(arrayList5);
        arrayList.addAll(0, arrayList5);
        arrayList.addAll(arrayList6);
        arrayList4.clear();
        arrayList2.clear();
        arrayList5.clear();
        arrayList6.clear();
        c2409f.m4280b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5701c() {
        C2408E c2408e = this.f10726a;
        if (c2408e.m4275j()) {
            Object[] objArr = c2408e.f7789c;
            long[] jArr = c2408e.f7787a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j5 = jArr[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j5) < 128) {
                                AbstractC0231b.m408s(objArr[(i5 << 3) + i7]);
                                throw null;
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
            c2408e.m4266a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5702d(C3381l c3381l, boolean z5) {
        Object objM4272g = this.f10726a.m4272g(c3381l.f10541g);
        AbstractC1665j.m2982b(objM4272g);
        AbstractC0231b.m408s(objM4272g);
        throw null;
    }
}
