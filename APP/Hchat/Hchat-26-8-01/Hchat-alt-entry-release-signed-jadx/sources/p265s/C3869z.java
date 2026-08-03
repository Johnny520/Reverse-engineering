package p265s;

import ac.C0058k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p027c0.C0364i;
import p069f.AbstractC0957r0;
import p069f.AbstractC0959s0;
import p069f.C0943k0;
import p069f.C0945l0;
import p071f1.InterfaceC1037z;
import p116i.InterfaceC1803y;
import p118i1.C1902b;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p251r.C3629n;
import p251r.C3632q;
import p293u2.C4231a;
import p293u2.C4240j;
import p308v1.AbstractC4377b1;
import p339x1.AbstractC5618k;
import p356y0.InterfaceC5853o;
import tf.AbstractC4166m;
import tf.AbstractC4170q;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: s.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3869z {

    /* JADX INFO: renamed from: a */
    public final C0943k0 f12684a;

    /* JADX INFO: renamed from: b */
    public C0058k f12685b;

    /* JADX INFO: renamed from: c */
    public int f12686c;

    /* JADX INFO: renamed from: d */
    public final C0945l0 f12687d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f12688e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f12689f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f12690g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f12691h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f12692i;

    /* JADX INFO: renamed from: j */
    public C3863w f12693j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5853o f12694k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3869z() {
        long[] jArr = AbstractC0957r0.f3015a;
        this.f12684a = new C0943k0();
        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
        this.f12687d = new C0945l0();
        this.f12688e = new ArrayList();
        this.f12689f = new ArrayList();
        this.f12690g = new ArrayList();
        this.f12691h = new ArrayList();
        this.f12692i = new ArrayList();
        this.f12694k = new C3861v(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m8041b(C3632q c3632q, int i9, C3865x c3865x) {
        int i10 = 0;
        long jM7614b = c3632q.m7614b(0);
        long jM8527a = c3632q.f11755c ? C4240j.m8527a(0, i9, jM7614b, 1) : C4240j.m8527a(i9, 0, jM7614b, 2);
        C3857t[] c3857tArr = c3865x.f12665a;
        int length = c3857tArr.length;
        int i11 = 0;
        while (i10 < length) {
            C3857t c3857t = c3857tArr[i10];
            int i12 = i11 + 1;
            if (c3857t != null) {
                c3857t.f12641j = C4240j.m8530d(jM8527a, C4240j.m8529c(c3632q.m7614b(i11), jM7614b));
            }
            i10++;
            i11 = i12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m8042g(int[] iArr, C3632q c3632q) {
        c3632q.getClass();
        int i9 = iArr[0] + c3632q.f11769q;
        iArr[0] = i9;
        return Math.max(0, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m8043a() {
        ArrayList arrayList = this.f12692i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C3857t c3857t = (C3857t) arrayList.get(i9);
            C1902b c1902b = c3857t.f12643l;
            if (c1902b != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (c3857t.f12641j >> 32)) + ((int) (c1902b.f6360u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (c3857t.f12641j & 4294967295L)) + ((int) (c1902b.f6360u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8044c(int i9, int i10, int i11, ArrayList arrayList, C0058k c0058k, C3629n c3629n, boolean z9, boolean z10, boolean z11, int i12, int i13, InterfaceC3599t interfaceC3599t, InterfaceC1037z interfaceC1037z) {
        C0943k0 c0943k0;
        Object obj;
        long j3;
        long j4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C0058k c0058k2;
        C0945l0 c0945l0;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i14;
        int i15;
        int i16;
        int i17;
        long[] jArr;
        ArrayList arrayList7;
        Object[] objArr;
        long j5;
        long[] jArr2;
        ArrayList arrayList8;
        int i18;
        ArrayList arrayList9;
        Object[] objArr2;
        int i19;
        int i20;
        int i21;
        int i22;
        ArrayList arrayList10 = arrayList;
        C0058k c0058k3 = this.f12685b;
        this.f12685b = c0058k;
        int size = arrayList10.size();
        int i23 = 0;
        loop0: while (true) {
            c0943k0 = this.f12684a;
            if (i23 < size) {
                C3632q c3632q = (C3632q) arrayList10.get(i23);
                int size2 = c3632q.f11754b.size();
                for (int i24 = 0; i24 < size2; i24++) {
                    Object objMo8824X = ((AbstractC4377b1) c3632q.f11754b.get(i24)).mo8824X();
                    obj = null;
                    if ((objMo8824X instanceof C3841l ? (C3841l) objMo8824X : null) != null) {
                        break loop0;
                    }
                }
                i23++;
            } else {
                obj = null;
                if (c0943k0.m2322i()) {
                    m8045d();
                    return;
                }
            }
        }
        int i25 = this.f12686c;
        C3632q c3632q2 = (C3632q) AbstractC4166m.m8424v1(arrayList10);
        this.f12686c = c3632q2 != null ? c3632q2.f11753a : 0;
        if (z9) {
            j3 = 4294967295L;
            j4 = (((long) i9) & 4294967295L) | (((long) 0) << 32);
        } else {
            j3 = 4294967295L;
            j4 = (((long) i9) << 32) | (((long) 0) & 4294967295L);
        }
        boolean z12 = z10 || !z11;
        Object[] objArr3 = c0943k0.f2969b;
        long[] jArr3 = c0943k0.f2968a;
        int length = jArr3.length - 2;
        C0945l0 c0945l02 = this.f12687d;
        boolean z13 = z12;
        if (length >= 0) {
            int i26 = 0;
            while (true) {
                long j10 = jArr3[i26];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i27 = 8 - ((~(i26 - length)) >>> 31);
                    int i28 = 0;
                    while (i28 < i27) {
                        if ((j10 & 255) < 128) {
                            i22 = i28;
                            c0945l02.m2328a(objArr3[(i26 << 3) + i28]);
                        } else {
                            i22 = i28;
                        }
                        j10 >>= 8;
                        i28 = i22 + 1;
                    }
                    if (i27 != 8) {
                        break;
                    } else if (i26 == length) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
        }
        int size3 = arrayList10.size();
        int i29 = 0;
        while (true) {
            arrayList2 = this.f12692i;
            arrayList3 = this.f12689f;
            arrayList4 = this.f12688e;
            if (i29 >= size3) {
                break;
            }
            C3632q c3632q3 = (C3632q) arrayList10.get(i29);
            Object obj2 = c3632q3.f11763k;
            int i30 = size3;
            List list = c3632q3.f11754b;
            c0945l02.m2339l(obj2);
            int i31 = i29;
            int size4 = list.size();
            int i32 = 0;
            while (true) {
                if (i32 >= size4) {
                    m8046e(obj2);
                    break;
                }
                List list2 = list;
                Object objMo8824X2 = ((AbstractC4377b1) list.get(i32)).mo8824X();
                int i33 = size4;
                if ((objMo8824X2 instanceof C3841l ? (C3841l) objMo8824X2 : obj) != null) {
                    C3865x c3865x = (C3865x) c0943k0.m2320g(obj2);
                    int iM364o = c0058k3 != null ? c0058k3.m364o(obj2) : -1;
                    boolean z14 = iM364o == -1 && c0058k3 != null;
                    if (c3865x == null) {
                        C3865x c3865x2 = new C3865x(this);
                        C3865x.m8034b(c3865x2, c3632q3, interfaceC3599t, interfaceC1037z, i12, i13);
                        c0943k0.m2326m(obj2, c3865x2);
                        if (c3632q3.f11753a == iM364o || iM364o == -1) {
                            long jM7614b = c3632q3.m7614b(0);
                            m8041b(c3632q3, (int) (c3632q3.f11755c ? jM7614b & j3 : jM7614b >> 32), c3865x2);
                            if (z14) {
                                C3857t[] c3857tArr = c3865x2.f12665a;
                                for (C3857t c3857t : c3857tArr) {
                                    if (c3857t != null) {
                                        c3857t.m8028a();
                                    }
                                }
                            }
                        } else if (iM364o < i25) {
                            arrayList4.add(c3632q3);
                        } else {
                            arrayList3.add(c3632q3);
                        }
                    } else if (z13) {
                        C3865x.m8034b(c3865x, c3632q3, interfaceC3599t, interfaceC1037z, i12, i13);
                        C3857t[] c3857tArr2 = c3865x.f12665a;
                        int length2 = c3857tArr2.length;
                        int i34 = 0;
                        while (i34 < length2) {
                            boolean z15 = z14;
                            C3857t c3857t2 = c3857tArr2[i34];
                            C3857t[] c3857tArr3 = c3857tArr2;
                            int i35 = length2;
                            if (c3857t2 != null && !C4240j.m8528b(c3857t2.f12641j, C3857t.f12630q)) {
                                c3857t2.f12641j = C4240j.m8530d(c3857t2.f12641j, j4);
                            }
                            i34++;
                            z14 = z15;
                            c3857tArr2 = c3857tArr3;
                            length2 = i35;
                        }
                        if (z14) {
                            for (C3857t c3857t3 : c3865x.f12665a) {
                                if (c3857t3 != null) {
                                    if (c3857t3.m8029b()) {
                                        arrayList2.remove(c3857t3);
                                        C3863w c3863w = this.f12693j;
                                        if (c3863w != null) {
                                            AbstractC5618k.m10156l(c3863w);
                                        }
                                    }
                                    c3857t3.m8028a();
                                }
                            }
                        }
                        m8047f(c3632q3, false);
                    }
                } else {
                    i32++;
                    size4 = i33;
                    list = list2;
                }
            }
            i29 = i31 + 1;
            arrayList10 = arrayList;
            size3 = i30;
        }
        int[] iArr = new int[1];
        if (z13 && c0058k3 != null) {
            if (arrayList4.isEmpty()) {
                i21 = 1;
            } else {
                if (arrayList4.size() > 1) {
                    AbstractC4170q.m8431g1(arrayList4, new C3867y(c0058k3, 2));
                }
                int size5 = arrayList4.size();
                for (int i36 = 0; i36 < size5; i36++) {
                    C3632q c3632q4 = (C3632q) arrayList4.get(i36);
                    int iM8042g = i12 - m8042g(iArr, c3632q4);
                    Object objM2320g = c0943k0.m2320g(c3632q4.f11763k);
                    objM2320g.getClass();
                    m8041b(c3632q4, iM8042g, (C3865x) objM2320g);
                    m8047f(c3632q4, false);
                }
                i21 = 1;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > i21) {
                    AbstractC4170q.m8431g1(arrayList3, new C3867y(c0058k3, 0));
                }
                int size6 = arrayList3.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    C3632q c3632q5 = (C3632q) arrayList3.get(i37);
                    int iM8042g2 = (m8042g(iArr, c3632q5) + i13) - c3632q5.f11769q;
                    Object objM2320g2 = c0943k0.m2320g(c3632q5.f11763k);
                    objM2320g2.getClass();
                    m8041b(c3632q5, iM8042g2, (C3865x) objM2320g2);
                    m8047f(c3632q5, false);
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
        }
        Object[] objArr4 = c0945l02.f2976b;
        long[] jArr4 = c0945l02.f2975a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList11 = this.f12691h;
        ArrayList arrayList12 = this.f12690g;
        if (length3 >= 0) {
            C0945l0 c0945l03 = c0945l02;
            Object[] objArr5 = objArr4;
            int i38 = 0;
            while (true) {
                long j11 = jArr4[i38];
                c0945l0 = c0945l03;
                arrayList5 = arrayList3;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i39 = 8 - ((~(i38 - length3)) >>> 31);
                    int i40 = 0;
                    while (i40 < i39) {
                        if ((j11 & 255) < 128) {
                            j5 = j11;
                            Object obj3 = objArr5[(i38 << 3) + i40];
                            C3865x c3865x3 = (C3865x) c0943k0.m2320g(obj3);
                            if (c3865x3 != null) {
                                jArr2 = jArr4;
                                i18 = i40;
                                int iM364o2 = c0058k.m364o(obj3);
                                arrayList9 = arrayList4;
                                objArr2 = objArr5;
                                int iMin = Math.min(1, c3865x3.f12669e);
                                c3865x3.f12669e = iMin;
                                c3865x3.f12668d = Math.min(1 - iMin, c3865x3.f12668d);
                                if (iM364o2 == -1) {
                                    C3857t[] c3857tArr4 = c3865x3.f12665a;
                                    int length4 = c3857tArr4.length;
                                    int i41 = 0;
                                    boolean z16 = false;
                                    int i42 = 0;
                                    while (i41 < length4) {
                                        C3857t[] c3857tArr5 = c3857tArr4;
                                        C3857t c3857t4 = c3857tArr5[i41];
                                        int i43 = i42 + 1;
                                        if (c3857t4 != null) {
                                            if (c3857t4.m8029b()) {
                                                i20 = i41;
                                            } else {
                                                i20 = i41;
                                                if (((Boolean) c3857t4.f12640i.getValue()).booleanValue()) {
                                                    c3857t4.m8030c();
                                                    c3865x3.f12665a[i42] = obj;
                                                    arrayList2.remove(c3857t4);
                                                    C3863w c3863w2 = this.f12693j;
                                                    if (c3863w2 != null) {
                                                        AbstractC5618k.m10156l(c3863w2);
                                                    }
                                                } else {
                                                    if (c3857t4.f12643l != null) {
                                                        c3857t4.m8029b();
                                                    }
                                                    if (c3857t4.m8029b()) {
                                                        arrayList2.add(c3857t4);
                                                        C3863w c3863w3 = this.f12693j;
                                                        if (c3863w3 != null) {
                                                            AbstractC5618k.m10156l(c3863w3);
                                                        }
                                                    } else {
                                                        c3857t4.m8030c();
                                                        c3865x3.f12665a[i42] = obj;
                                                    }
                                                }
                                            }
                                            z16 = true;
                                        } else {
                                            i20 = i41;
                                        }
                                        i41 = i20 + 1;
                                        c3857tArr4 = c3857tArr5;
                                        i42 = i43;
                                    }
                                    if (!z16) {
                                        m8046e(obj3);
                                    }
                                    arrayList8 = arrayList2;
                                } else {
                                    C4231a c4231a = c3865x3.f12666b;
                                    c4231a.getClass();
                                    arrayList8 = arrayList2;
                                    C3632q c3632qM7609a = c3629n.m7609a(iM364o2, c4231a.f13903a);
                                    c3632qM7609a.f11771s = true;
                                    C3857t[] c3857tArr6 = c3865x3.f12665a;
                                    int length5 = c3857tArr6.length;
                                    int i44 = 0;
                                    while (true) {
                                        if (i44 < length5) {
                                            int i45 = length5;
                                            C3857t c3857t5 = c3857tArr6[i44];
                                            if (c3857t5 != null) {
                                                i19 = i44;
                                                if (((Boolean) c3857t5.f12637f.getValue()).booleanValue()) {
                                                    break;
                                                }
                                            } else {
                                                i19 = i44;
                                            }
                                            i44 = i19 + 1;
                                            length5 = i45;
                                        } else if (c0058k3 == null || iM364o2 != c0058k3.m364o(obj3)) {
                                            break;
                                        } else {
                                            m8046e(obj3);
                                        }
                                    }
                                    c3865x3.m8035a(c3632qM7609a, interfaceC3599t, interfaceC1037z, i12, i13, c3865x3.f12667c);
                                    if (iM364o2 < this.f12686c) {
                                        arrayList12.add(c3632qM7609a);
                                    } else {
                                        arrayList11.add(c3632qM7609a);
                                    }
                                }
                            }
                            j11 = j5 >> 8;
                            i40 = i18 + 1;
                            jArr4 = jArr2;
                            arrayList2 = arrayList8;
                            arrayList4 = arrayList9;
                            objArr5 = objArr2;
                        } else {
                            j5 = j11;
                        }
                        jArr2 = jArr4;
                        arrayList8 = arrayList2;
                        i18 = i40;
                        arrayList9 = arrayList4;
                        objArr2 = objArr5;
                        j11 = j5 >> 8;
                        i40 = i18 + 1;
                        jArr4 = jArr2;
                        arrayList2 = arrayList8;
                        arrayList4 = arrayList9;
                        objArr5 = objArr2;
                    }
                    jArr = jArr4;
                    arrayList7 = arrayList2;
                    arrayList6 = arrayList4;
                    objArr = objArr5;
                    c0058k2 = c0058k;
                    if (i39 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    arrayList7 = arrayList2;
                    arrayList6 = arrayList4;
                    objArr = objArr5;
                    c0058k2 = c0058k;
                }
                if (i38 == length3) {
                    break;
                }
                i38++;
                arrayList3 = arrayList5;
                c0945l03 = c0945l0;
                jArr4 = jArr;
                arrayList2 = arrayList7;
                arrayList4 = arrayList6;
                objArr5 = objArr;
            }
        } else {
            c0058k2 = c0058k;
            c0945l0 = c0945l02;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
        }
        if (arrayList12.isEmpty()) {
            i14 = i10;
            i15 = i11;
            i16 = 1;
        } else {
            if (arrayList12.size() > 1) {
                AbstractC4170q.m8431g1(arrayList12, new C3867y(c0058k2, 3));
            }
            int size7 = arrayList12.size();
            for (int i46 = 0; i46 < size7; i46++) {
                C3632q c3632q6 = (C3632q) arrayList12.get(i46);
                Object objM2320g3 = c0943k0.m2320g(c3632q6.f11763k);
                objM2320g3.getClass();
                C3865x c3865x4 = (C3865x) objM2320g3;
                int iM8042g3 = m8042g(iArr, c3632q6);
                if (z10) {
                    C3632q c3632q7 = (C3632q) AbstractC4166m.m8422t1(arrayList);
                    long jM7614b2 = c3632q7.m7614b(0);
                    i17 = (int) (c3632q7.f11755c ? jM7614b2 & j3 : jM7614b2 >> 32);
                } else {
                    i17 = c3865x4.f12670f;
                }
                c3632q6.m7616d(i17 - iM8042g3, i10, i11);
                if (z13) {
                    m8047f(c3632q6, true);
                }
            }
            i14 = i10;
            i15 = i11;
            i16 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        if (!arrayList11.isEmpty()) {
            if (arrayList11.size() > i16) {
                AbstractC4170q.m8431g1(arrayList11, new C3867y(c0058k2, 1));
            }
            int size8 = arrayList11.size();
            for (int i47 = 0; i47 < size8; i47++) {
                C3632q c3632q8 = (C3632q) arrayList11.get(i47);
                Object objM2320g4 = c0943k0.m2320g(c3632q8.f11763k);
                objM2320g4.getClass();
                c3632q8.m7616d((((C3865x) objM2320g4).f12671g - c3632q8.f11769q) + m8042g(iArr, c3632q8), i14, i15);
                if (z13) {
                    m8047f(c3632q8, true);
                }
            }
        }
        Collections.reverse(arrayList12);
        arrayList.addAll(0, arrayList12);
        arrayList.addAll(arrayList11);
        arrayList6.clear();
        arrayList5.clear();
        arrayList12.clear();
        arrayList11.clear();
        c0945l0.m2329b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8045d() {
        C0943k0 c0943k0 = this.f12684a;
        if (c0943k0.m2323j()) {
            Object[] objArr = c0943k0.f2970c;
            long[] jArr = c0943k0.f2968a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j3 = jArr[i9];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j3) < 128) {
                                for (C3857t c3857t : ((C3865x) objArr[(i9 << 3) + i11]).f12665a) {
                                    if (c3857t != null) {
                                        c3857t.m8030c();
                                    }
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i9 == length) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
            }
            c0943k0.m2314a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8046e(Object obj) {
        C3865x c3865x = (C3865x) this.f12684a.m2324k(obj);
        if (c3865x != null) {
            for (C3857t c3857t : c3865x.f12665a) {
                if (c3857t != null) {
                    c3857t.m8030c();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8047f(C3632q c3632q, boolean z9) {
        C3632q c3632q2 = c3632q;
        Object objM2320g = this.f12684a.m2320g(c3632q2.f11763k);
        objM2320g.getClass();
        C3857t[] c3857tArr = ((C3865x) objM2320g).f12665a;
        int length = c3857tArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            C3857t c3857t = c3857tArr[i9];
            int i11 = i10 + 1;
            if (c3857t != null) {
                long jM7614b = c3632q2.m7614b(i10);
                long j3 = c3857t.f12641j;
                if (C4240j.m8528b(j3, C3857t.f12630q) || C4240j.m8528b(j3, jM7614b)) {
                    c3857t.f12641j = jM7614b;
                } else {
                    long jM8529c = C4240j.m8529c(jM7614b, j3);
                    InterfaceC1803y interfaceC1803y = c3857t.f12635d;
                    if (interfaceC1803y != null) {
                        long jM8529c2 = C4240j.m8529c(((C4240j) c3857t.f12646o.getValue()).f13912a, jM8529c);
                        c3857t.m8032e(jM8529c2);
                        c3857t.m8031d(true);
                        c3857t.f12636e = z9;
                        AbstractC3603v.m7563q(c3857t.f12632a, null, new C0364i(c3857t, interfaceC1803y, jM8529c2, (InterfaceC5557c) null, 5), 3);
                    }
                    c3857t.f12641j = jM7614b;
                }
            }
            i9++;
            c3632q2 = c3632q;
            i10 = i11;
        }
    }
}
