package p203n;

import java.util.Arrays;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p186k.C2438t;
import p186k.C2439u;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: n.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2619B implements InterfaceC2677v {

    /* JADX INFO: renamed from: a */
    public final C2618A f8327a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2619B(C2618A c2618a) {
        this.f8327a = c2618a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2659i
    /* JADX INFO: renamed from: a */
    public final InterfaceC2656g0 mo4572a(C2652e0 c2652e0) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i5;
        C2618A c2618a = this.f8327a;
        C2439u c2439u = c2618a.f8326b;
        C2438t c2438t = new C2438t(c2439u.f7849e + 2);
        C2439u c2439u2 = new C2439u(c2439u.f7849e);
        int[] iArr3 = c2439u.f7846b;
        Object[] objArr3 = c2439u.f7847c;
        long[] jArr = c2439u.f7845a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j5 & 255) < 128) {
                            int i10 = (i6 << 3) + i9;
                            int i11 = iArr3[i10];
                            i5 = i7;
                            C2681z c2681z = (C2681z) objArr3[i10];
                            c2438t.m4334a(i11);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c2439u2.m4344h(i11, new C2664k0((AbstractC2670o) c2652e0.f8459a.mo1h(c2681z.f8550a), c2681z.f8551b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i5 = i7;
                        }
                        j5 >>= i5;
                        i9++;
                        iArr3 = iArr2;
                        i7 = i5;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i8 != i7) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c2439u.m4317a(0)) {
            int i12 = c2438t.f7878b;
            if (i12 < 0) {
                AbstractC2477a.m4423d("Index must be between 0 and size");
                throw null;
            }
            c2438t.m4335b(i12 + 1);
            int[] iArr4 = c2438t.f7877a;
            int i13 = c2438t.f7878b;
            if (i13 != 0) {
                AbstractC0972l.m1991O(iArr4, iArr4, 1, 0, i13);
            }
            iArr4[0] = 0;
            c2438t.f7878b++;
        }
        if (!c2439u.m4317a(c2618a.f8325a)) {
            c2438t.m4334a(c2618a.f8325a);
        }
        int i14 = c2438t.f7878b;
        if (i14 != 0) {
            int[] iArr5 = c2438t.f7877a;
            AbstractC1665j.m2985e(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i14);
        }
        return new C2666l0(c2438t, c2439u2, c2618a.f8325a, AbstractC2676u.f8543b);
    }
}
