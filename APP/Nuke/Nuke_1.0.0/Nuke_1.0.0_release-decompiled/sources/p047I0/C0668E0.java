package p047I0;

import p002A1.AbstractC0122K;
import p095T.InterfaceC1359f;
import p140c0.C1886c;
import p186k.AbstractC2429k;
import p186k.C2404A;
import p186k.C2439u;

/* JADX INFO: renamed from: I0.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0668E0 extends AbstractC0122K {

    /* JADX INFO: renamed from: b */
    public final C2439u f2148b;

    public C0668E0() {
        C2439u c2439u = AbstractC2429k.f7850a;
        this.f2148b = new C2439u();
    }

    @Override // p002A1.AbstractC0122K
    /* JADX INFO: renamed from: b */
    public final void mo174b() {
        C2439u c2439u = this.f2148b;
        int[] iArr = c2439u.f7846b;
        Object[] objArr = c2439u.f7847c;
        long[] jArr = c2439u.f7845a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j5) < 128) {
                        int i9 = (i5 << 3) + i8;
                        int i10 = iArr[i9];
                        C2404A c2404a = (C2404A) objArr[i9];
                        Object[] objArr2 = c2404a.f7766a;
                        int i11 = c2404a.f7767b;
                        int i12 = 0;
                        while (i12 < i11) {
                            C0666D0 c0666d0 = (C0666D0) objArr2[i12];
                            int i13 = i6;
                            InterfaceC1359f interfaceC1359f = c0666d0.f2109d;
                            if (interfaceC1359f != null) {
                                interfaceC1359f.cancel();
                            }
                            c0666d0.f2109d = null;
                            C1886c c1886c = (C1886c) c0666d0.f2106a.f297e;
                            c1886c.f6409e = true;
                            c1886c.f6408d = false;
                            c1886c.m3373a();
                            i12++;
                            i6 = i13;
                        }
                    }
                    int i14 = i6;
                    j5 >>= i14;
                    i8++;
                    i6 = i14;
                }
                if (i7 != i6) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }
}
