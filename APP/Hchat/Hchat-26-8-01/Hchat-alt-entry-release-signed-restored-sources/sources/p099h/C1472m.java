package p099h;

import java.util.List;
import p293u2.C4242l;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4414o;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: h.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1472m implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: a */
    public final C1486t f4890a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1472m(C1486t c1486t) {
        this.f4890a = c1486t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: a */
    public final int mo3991a(InterfaceC4414o interfaceC4414o, List list, int i9) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC4409m0) list.get(0)).mo8830M(i9));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC4409m0) list.get(i10)).mo8830M(i9));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: c */
    public final int mo3992c(InterfaceC4414o interfaceC4414o, List list, int i9) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC4409m0) list.get(0)).mo8829G(i9));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC4409m0) list.get(i10)).mo8829G(i9));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: g */
    public final int mo3993g(InterfaceC4414o interfaceC4414o, List list, int i9) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC4409m0) list.get(0)).mo8832j(i9));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC4409m0) list.get(i10)).mo8832j(i9));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        AbstractC4377b1 abstractC4377b1;
        int i9;
        AbstractC4377b1 abstractC4377b12;
        int i10;
        int i11;
        int size = list.size();
        AbstractC4377b1[] abstractC4377b1Arr = new AbstractC4377b1[size];
        int size2 = list.size();
        long j4 = 0;
        int i12 = 0;
        while (true) {
            abstractC4377b1 = null;
            i9 = 1;
            if (i12 >= size2) {
                break;
            }
            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list.get(i12);
            Object objMo8824X = interfaceC4409m0.mo8824X();
            C1476o c1476o = objMo8824X instanceof C1476o ? (C1476o) objMo8824X : null;
            if (c1476o != null && ((Boolean) c1476o.f4899a.getValue()).booleanValue()) {
                AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
                long j5 = (((long) abstractC4377b1Mo8831Q.f14594h) & 4294967295L) | (((long) abstractC4377b1Mo8831Q.f14593g) << 32);
                abstractC4377b1Arr[i12] = abstractC4377b1Mo8831Q;
                j4 = j5;
            }
            i12++;
        }
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            InterfaceC4409m0 interfaceC4409m02 = (InterfaceC4409m0) list.get(i13);
            if (abstractC4377b1Arr[i13] == null) {
                abstractC4377b1Arr[i13] = interfaceC4409m02.mo8831Q(j3);
            }
        }
        if (interfaceC4418p0.mo8009u0()) {
            i10 = (int) (j4 >> 32);
        } else {
            if (size == 0) {
                abstractC4377b12 = null;
            } else {
                abstractC4377b12 = abstractC4377b1Arr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = abstractC4377b12 != null ? abstractC4377b12.f14593g : 0;
                    if (1 <= i14) {
                        int i16 = 1;
                        while (true) {
                            AbstractC4377b1 abstractC4377b13 = abstractC4377b1Arr[i16];
                            int i17 = abstractC4377b13 != null ? abstractC4377b13.f14593g : 0;
                            if (i15 < i17) {
                                abstractC4377b12 = abstractC4377b13;
                                i15 = i17;
                            }
                            if (i16 == i14) {
                                break;
                            }
                            i16++;
                        }
                    }
                }
            }
            i10 = abstractC4377b12 != null ? abstractC4377b12.f14593g : 0;
        }
        if (interfaceC4418p0.mo8009u0()) {
            i11 = (int) (j4 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC4377b1 = abstractC4377b1Arr[0];
                int i18 = size - 1;
                if (i18 != 0) {
                    int i19 = abstractC4377b1 != null ? abstractC4377b1.f14594h : 0;
                    if (1 <= i18) {
                        while (true) {
                            AbstractC4377b1 abstractC4377b14 = abstractC4377b1Arr[i9];
                            int i20 = abstractC4377b14 != null ? abstractC4377b14.f14594h : 0;
                            if (i19 < i20) {
                                abstractC4377b1 = abstractC4377b14;
                                i19 = i20;
                            }
                            if (i9 == i18) {
                                break;
                            }
                            i9++;
                        }
                    }
                }
            }
            i11 = abstractC4377b1 != null ? abstractC4377b1.f14594h : 0;
        }
        if (!interfaceC4418p0.mo8009u0()) {
            this.f4890a.f4936b.setValue(new C4242l((((long) i10) << 32) | (((long) i11) & 4294967295L)));
        }
        return interfaceC4418p0.mo8010z(i10, i11, C4174u.f13711g, new C1470l(abstractC4377b1Arr, this, i10, i11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: i */
    public final int mo3995i(InterfaceC4414o interfaceC4414o, List list, int i9) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC4409m0) list.get(0)).mo8833p0(i9));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC4409m0) list.get(i10)).mo8833p0(i9));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
