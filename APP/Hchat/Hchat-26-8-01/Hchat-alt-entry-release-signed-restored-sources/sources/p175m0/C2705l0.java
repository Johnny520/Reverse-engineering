package p175m0;

import java.util.Arrays;
import p020b5.C0190i;
import p080fb.AbstractC1184v0;
import p100h0.C1548s;
import p117i0.InterfaceC1807a;
import p159l0.C2420b;
import p159l0.C2429k;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: m0.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2705l0 extends AbstractC1184v0 {

    /* JADX INFO: renamed from: d */
    public int f8775d;

    /* JADX INFO: renamed from: f */
    public int f8777f;

    /* JADX INFO: renamed from: h */
    public int f8779h;

    /* JADX INFO: renamed from: c */
    public AbstractC2701j0[] f8774c = new AbstractC2701j0[16];

    /* JADX INFO: renamed from: e */
    public int[] f8776e = new int[16];

    /* JADX INFO: renamed from: g */
    public Object[] f8778g = new Object[16];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m6133R() {
        this.f8775d = 0;
        this.f8777f = 0;
        Arrays.fill(this.f8778g, 0, this.f8779h, (Object) null);
        this.f8779h = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: S */
    public final void m6134S(InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        if (this.f8775d != 0) {
            C1548s c1548s = new C1548s(this);
            C2705l0 c2705l0 = (C2705l0) c1548s.f5164e;
            while (true) {
                AbstractC2701j0 abstractC2701j0 = c2705l0.f8774c[c1548s.f5161b];
                C2420b c2420bMo6132b = abstractC2701j0.mo6132b(c1548s);
                InterfaceC1807a interfaceC1807a2 = interfaceC1807a;
                C2429k c2429k2 = c2429k;
                C0190i c0190i2 = c0190i;
                InterfaceC2703k0 interfaceC2703k02 = interfaceC2703k0;
                try {
                    abstractC2701j0.mo6126a(c1548s, interfaceC1807a2, c2429k2, c0190i2, interfaceC2703k02);
                    int i9 = c1548s.f5161b;
                    int i10 = c2705l0.f8775d;
                    if (i9 < i10) {
                        AbstractC2701j0 abstractC2701j02 = c2705l0.f8774c[i9];
                        c1548s.f5162c += abstractC2701j02.f8770a;
                        c1548s.f5163d += abstractC2701j02.f8771b;
                        int i11 = i9 + 1;
                        c1548s.f5161b = i11;
                        if (i11 >= i10) {
                            break;
                        }
                        interfaceC1807a = interfaceC1807a2;
                        c2429k = c2429k2;
                        c0190i = c0190i2;
                        interfaceC2703k0 = interfaceC2703k02;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        m6133R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final boolean m6135T() {
        return this.f8775d == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m6136U(AbstractC2701j0 abstractC2701j0) {
        int i9 = this.f8775d;
        AbstractC2701j0[] abstractC2701j0Arr = this.f8774c;
        if (i9 == abstractC2701j0Arr.length) {
            AbstractC2701j0[] abstractC2701j0Arr2 = new AbstractC2701j0[(i9 > 1024 ? 1024 : i9) + i9];
            System.arraycopy(abstractC2701j0Arr, 0, abstractC2701j0Arr2, 0, i9);
            this.f8774c = abstractC2701j0Arr2;
        }
        int i10 = this.f8777f;
        int i11 = abstractC2701j0.f8770a;
        int i12 = abstractC2701j0.f8771b;
        int i13 = i10 + i11;
        int[] iArr = this.f8776e;
        int length = iArr.length;
        if (i13 > length) {
            int i14 = (length > 1024 ? 1024 : length) + length;
            if (i14 >= i13) {
                i13 = i14;
            }
            int[] iArr2 = new int[i13];
            AbstractC4165l.m8381p0(iArr, iArr2, 0, 0, length);
            this.f8776e = iArr2;
        }
        int i15 = this.f8779h + i12;
        Object[] objArr = this.f8778g;
        int length2 = objArr.length;
        if (i15 > length2) {
            int i16 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i16 >= i15) {
                i15 = i16;
            }
            Object[] objArr2 = new Object[i15];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f8778g = objArr2;
        }
        AbstractC2701j0[] abstractC2701j0Arr3 = this.f8774c;
        int i17 = this.f8775d;
        this.f8775d = i17 + 1;
        abstractC2701j0Arr3[i17] = abstractC2701j0;
        this.f8777f += abstractC2701j0.f8770a;
        this.f8779h += i12;
    }
}
