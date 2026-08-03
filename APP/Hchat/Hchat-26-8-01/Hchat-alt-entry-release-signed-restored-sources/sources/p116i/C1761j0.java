package p116i;

import java.util.Arrays;
import okio.C3193a;
import p069f.C0964v;
import p069f.C0965w;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: i.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1761j0 implements InterfaceC1803y {

    /* JADX INFO: renamed from: a */
    public final C1758i0 f5885a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1761j0(C1758i0 c1758i0) {
        this.f5885a = c1758i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1763k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1774n1 mo4363a(C1771m1 c1771m1) {
        int[] iArr;
        int[] iArr2;
        int i9;
        C0965w c0965w = this.f5885a.f5870a;
        C0964v c0964v = new C0964v(c0965w.f2967e + 2);
        C0965w c0965w2 = new C0965w(c0965w.f2967e);
        int[] iArr3 = c0965w.f2964b;
        Object[] objArr = c0965w.f2965c;
        long[] jArr = c0965w.f2963a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j3) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr3[i14];
                            C1755h0 c1755h0 = (C1755h0) objArr[i14];
                            c0964v.m2369a(i15);
                            i9 = i11;
                            iArr2 = iArr3;
                            c0965w2.m2379h(i15, new C1789s1((AbstractC1781q) c1771m1.f5912a.invoke(c1755h0.f5864a), c1755h0.f5865b));
                        } else {
                            iArr2 = iArr3;
                            i9 = i11;
                        }
                        j3 >>= i9;
                        i13++;
                        i11 = i9;
                        iArr3 = iArr2;
                    }
                    iArr = iArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr3 = iArr;
            }
        }
        if (!c0965w.m2312a(0)) {
            int i16 = c0964v.f3036b;
            if (i16 < 0) {
                C3193a.m6820i("Index must be between 0 and size");
                return null;
            }
            c0964v.m2370b(i16 + 1);
            int[] iArr4 = c0964v.f3035a;
            int i17 = c0964v.f3036b;
            if (i17 != 0) {
                AbstractC4165l.m8381p0(iArr4, iArr4, 1, 0, i17);
            }
            iArr4[0] = 0;
            c0964v.f3036b++;
        }
        if (!c0965w.m2312a(300)) {
            c0964v.m2369a(300);
        }
        int i18 = c0964v.f3036b;
        if (i18 != 0) {
            int[] iArr5 = c0964v.f3035a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i18);
        }
        return new C1792t1(c0964v, c0965w2, AbstractC1801x.f6011b);
    }
}
