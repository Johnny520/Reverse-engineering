package p037G2;

import com.bumptech.glide.AbstractC1926h;
import p000A.C0013G0;
import p117X2.AbstractC1665j;
import p153e1.C2015k;
import p153e1.EnumC2017m;
import p176i1.InterfaceC2282C;

/* JADX INFO: renamed from: G2.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0476D implements InterfaceC2282C {

    /* JADX INFO: renamed from: d */
    public final int f1406d;

    /* JADX INFO: renamed from: e */
    public final int f1407e;

    /* JADX INFO: renamed from: f */
    public final C0013G0 f1408f;

    public C0476D(int i5, int i6, C0013G0 c0013g0) {
        this.f1406d = i5;
        this.f1407e = i6;
        this.f1408f = c0013g0;
    }

    @Override // p176i1.InterfaceC2282C
    /* JADX INFO: renamed from: e */
    public final long mo567e(C2015k c2015k, long j5, EnumC2017m enumC2017m, long j6) {
        AbstractC1665j.m2985e(c2015k, "anchorBounds");
        AbstractC1665j.m2985e(enumC2017m, "layoutDirection");
        int i5 = enumC2017m == EnumC2017m.f6742d ? c2015k.f6739c - ((int) (j6 >> 32)) : c2015k.f6737a;
        int i6 = this.f1407e;
        int i7 = (((int) (j5 >> 32)) - ((int) (j6 >> 32))) - i6;
        if (i7 < i6) {
            i7 = i6;
        }
        int iM3568k = AbstractC1926h.m3568k(i5, i6, i7);
        int i8 = c2015k.f6738b;
        int i9 = c2015k.f6740d;
        int i10 = (i8 + i9) / 2;
        int i11 = this.f1406d;
        int i12 = i10 + i11;
        int i13 = (int) (j6 & 4294967295L);
        int i14 = (i10 - i11) - i13;
        int i15 = (int) (j5 & 4294967295L);
        boolean z5 = i12 + i13 <= i15 - i6;
        boolean z6 = i14 >= i6;
        if (!z5) {
            if (z6) {
                i12 = i14;
            } else {
                if (i8 <= i15 - i9) {
                    int i16 = (i15 - i13) - i6;
                    if (i16 >= i6) {
                        i6 = i16;
                    }
                    if (i12 > i6) {
                    }
                } else if (i14 >= i6) {
                    i6 = i14;
                }
                i12 = i6;
            }
        }
        this.f1408f.mo1h(Boolean.valueOf(i12 < i8));
        return (((long) iM3568k) << 32) | (((long) i12) & 4294967295L);
    }
}
