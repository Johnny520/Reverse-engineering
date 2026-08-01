package p316w;

import java.util.List;
import p080f9.AbstractC2368o;
import p172l8.C4700i0;

/* JADX INFO: renamed from: w.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8963l0 {

    /* JADX INFO: renamed from: a */
    public final int f29733a;

    /* JADX INFO: renamed from: b */
    public final C8959j0[] f29734b;

    /* JADX INFO: renamed from: c */
    public final C8979t0 f29735c;

    /* JADX INFO: renamed from: d */
    public final List f29736d;

    /* JADX INFO: renamed from: e */
    public final boolean f29737e;

    /* JADX INFO: renamed from: f */
    public final int f29738f;

    /* JADX INFO: renamed from: g */
    public final int f29739g;

    /* JADX INFO: renamed from: h */
    public final int f29740h;

    public C8963l0(int i10, C8959j0[] c8959j0Arr, C8979t0 c8979t0, List list, boolean z10, int i11) {
        this.f29733a = i10;
        this.f29734b = c8959j0Arr;
        this.f29735c = c8979t0;
        this.f29736d = list;
        this.f29737e = z10;
        this.f29738f = i11;
        int iMax = 0;
        for (C8959j0 c8959j0 : c8959j0Arr) {
            iMax = Math.max(iMax, c8959j0.m34407q());
        }
        this.f29739g = iMax;
        this.f29740h = AbstractC2368o.m8578e(iMax + this.f29738f, 0);
    }

    /* JADX INFO: renamed from: a */
    public final int m34421a() {
        return this.f29733a;
    }

    /* JADX INFO: renamed from: b */
    public final C8959j0[] m34422b() {
        return this.f29734b;
    }

    /* JADX INFO: renamed from: c */
    public final int m34423c() {
        return this.f29739g;
    }

    /* JADX INFO: renamed from: d */
    public final int m34424d() {
        return this.f29740h;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m34425e() {
        return this.f29734b.length == 0;
    }

    /* JADX INFO: renamed from: f */
    public final C8959j0[] m34426f(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        C8959j0[] c8959j0Arr = this.f29734b;
        int length = c8959j0Arr.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            C8959j0 c8959j0 = c8959j0Arr[i17];
            int i20 = i18 + 1;
            int iM34318d = C8937c.m34318d(((C8937c) this.f29736d.get(i18)).m34321g());
            int i21 = this.f29735c.m34454a()[i19];
            boolean z10 = this.f29737e;
            int i22 = z10 ? this.f29733a : i19;
            if (z10) {
                i13 = i19;
                i16 = i10;
                i14 = i11;
                i15 = i12;
            } else {
                i13 = this.f29733a;
                i14 = i11;
                i15 = i12;
                i16 = i10;
            }
            c8959j0.m34409t(i16, i21, i14, i15, i22, i13);
            C4700i0 c4700i0 = C4700i0.f13910a;
            i19 += iM34318d;
            i17++;
            i18 = i20;
        }
        return this.f29734b;
    }
}
