package p117i0;

import java.util.ArrayList;
import p069f.C0965w;
import p145k0.C2231a;
import p159l0.C2423e;
import p276sf.C3962i;
import sh.C4021k;

/* JADX INFO: renamed from: i0.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1844j0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6137a;

    /* JADX INFO: renamed from: b */
    public final int f6138b;

    /* JADX INFO: renamed from: c */
    public int f6139c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f6140d;

    /* JADX INFO: renamed from: e */
    public final C0965w f6141e;

    /* JADX INFO: renamed from: f */
    public final C3962i f6142f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1844j0(int i9, ArrayList arrayList) {
        this.f6137a = arrayList;
        this.f6138b = i9;
        if (i9 < 0) {
            AbstractC1861n1.m4583a("Invalid start index");
        }
        this.f6140d = new ArrayList();
        C0965w c0965w = new C0965w();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C2423e c2423e = (C2423e) this.f6137a.get(i11);
            int i12 = c2423e.f7931c;
            int i13 = c2423e.f7932d;
            c0965w.m2379h(i12, new C2231a(i11, i10, i13));
            i10 += i13;
        }
        this.f6141e = c0965w;
        this.f6142f = new C3962i(new C4021k(this, 12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4567a(int i9, int i10) {
        int i11;
        C0965w c0965w = this.f6141e;
        C2231a c2231a = (C2231a) c0965w.m2313b(i9);
        if (c2231a == null) {
            return false;
        }
        int i12 = c2231a.f7392b;
        int i13 = i10 - c2231a.f7393c;
        c2231a.f7393c = i10;
        if (i13 == 0) {
            return true;
        }
        Object[] objArr = c0965w.f2965c;
        long[] jArr = c0965w.f2963a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j3 = jArr[i14];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j3) < 128) {
                        C2231a c2231a2 = (C2231a) objArr[(i14 << 3) + i16];
                        if (c2231a2.f7392b >= i12 && !c2231a2.equals(c2231a) && (i11 = c2231a2.f7392b + i13) >= 0) {
                            c2231a2.f7392b = i11;
                        }
                    }
                    j3 >>= 8;
                }
                if (i15 != 8) {
                    return true;
                }
            }
            if (i14 == length) {
                return true;
            }
            i14++;
        }
    }
}
