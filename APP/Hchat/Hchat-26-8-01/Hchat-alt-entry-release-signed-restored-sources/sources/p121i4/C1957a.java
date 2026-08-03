package p121i4;

import bsh.C0353j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import p020b5.C0184c;
import p071f1.C1005h;
import p104h4.C1607u;
import p136j8.C2104o;
import p227p4.AbstractC3298c0;
import p227p4.AbstractC3303h;
import p227p4.AbstractC3311p;
import p227p4.AbstractC3312q;
import p227p4.C3295b;
import p227p4.C3297c;
import p227p4.C3299d;
import p227p4.C3300e;
import p227p4.C3301f;
import p227p4.C3304i;
import p227p4.C3305j;
import p227p4.C3308m;
import p227p4.C3309n;
import p227p4.C3310o;
import p227p4.C3316u;
import p227p4.C3317v;
import p227p4.C3318w;
import p227p4.C3321z;
import p295u4.C4252b;
import p295u4.C4253c;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4267q;
import p295u4.C4270t;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4474w;
import p311v4.C4447a0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4468q;
import p311v4.C4475x;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;
import p343x6.AbstractC5700d;
import p376z4.C6093g;

/* JADX INFO: renamed from: i4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1957a implements InterfaceC1970k {

    /* JADX INFO: renamed from: g */
    public int f6622g;

    /* JADX INFO: renamed from: h */
    public Object f6623h;

    /* JADX INFO: renamed from: i */
    public Object f6624i;

    /* JADX INFO: renamed from: j */
    public Object f6625j;

    /* JADX INFO: renamed from: k */
    public Object f6626k;

    /* JADX INFO: renamed from: l */
    public Object f6627l;

    /* JADX INFO: renamed from: m */
    public Object f6628m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: a */
    public void mo2567a(int i9, int i10, C4683c c4683c) {
        if (i9 == 108 || i9 == 112) {
            m4845k(i10, 1, true);
            if (c4683c == C4683c.f15641t || c4683c == C4683c.f15642u) {
                m4846l(i10, 1, true);
                return;
            }
            return;
        }
        if (i9 == 172 || i9 == 177) {
            m4845k(i10, 1, false);
            ((C6093g[]) this.f6627l)[i10] = C6093g.f24608k;
            return;
        }
        if (i9 != 190) {
            if (i9 == 191) {
                m4845k(i10, 1, false);
                m4846l(i10, 1, false);
                return;
            } else if (i9 != 194 && i9 != 195) {
                switch (i9) {
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        break;
                    default:
                        switch (i9) {
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                                break;
                            default:
                                m4845k(i10, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m4845k(i10, 1, true);
        m4846l(i10, 1, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: b */
    public void mo2568b(int i9, int i10, int i11, AbstractC4446a abstractC4446a, int i12) {
        m4845k(i10, i11, true);
        if ((abstractC4446a instanceof AbstractC4474w) || (abstractC4446a instanceof C4453d0) || (abstractC4446a instanceof C4451c0) || (abstractC4446a instanceof C4468q) || (abstractC4446a instanceof C4475x) || (abstractC4446a instanceof C4447a0)) {
            m4846l(i10, i11, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: c */
    public void mo2569c(int i9, int i10, C4453d0 c4453d0, ArrayList arrayList) {
        m4845k(i9, i10, true);
        m4846l(i9, i10, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: d */
    public void mo2570d(int i9, int i10) {
        m4845k(i10, 1, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m4843e(int i9, boolean z9) {
        if (!AbstractC5700d.m10299z((int[]) this.f6625j, i9)) {
            AbstractC5700d.m10278g0((int[]) this.f6624i, i9);
        }
        if (z9) {
            AbstractC5700d.m10278g0((int[]) this.f6626k, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: f */
    public int mo2572f() {
        return this.f6622g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: g */
    public void mo2573g(int i9, int i10, C1973n c1973n, int i11) {
        m4845k(i9, i10, false);
        C6093g c6093g = (C6093g) c1973n.f6695k;
        m4843e(c6093g.m10846n(c1973n.f6693i), true);
        int i12 = c1973n.f6693i;
        for (int i13 = 0; i13 < i12; i13++) {
            m4843e(c6093g.m10846n(i13), true);
        }
        ((C6093g[]) this.f6627l)[i9] = c6093g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: h */
    public void mo2574h(int i9, int i10, int i11, int i12) {
        C6093g[] c6093gArr = (C6093g[]) this.f6627l;
        if (i9 != 167) {
            if (i9 == 168) {
                m4843e(i10, true);
            }
            int i13 = i10 + i11;
            m4845k(i10, i11, true);
            m4843e(i13, true);
            C6093g c6093g = new C6093g(2);
            c6093g.m10844l(i13);
            c6093g.m10844l(i12);
            c6093g.f24613g = false;
            c6093gArr[i10] = c6093g;
        } else {
            m4845k(i10, i11, false);
            c6093gArr[i10] = C6093g.m10843o(i12);
        }
        m4843e(i12, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: i */
    public void mo2575i(int i9, int i10, int i11, int i12, C4683c c4683c, int i13) {
        if (i9 != 169) {
            m4845k(i10, i11, true);
        } else {
            m4845k(i10, i11, false);
            ((C6093g[]) this.f6627l)[i10] = C6093g.f24608k;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0212, code lost:
    
        r2 = r5.size();
        r3 = false;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0218, code lost:
    
        if (r4 >= r2) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021a, code lost:
    
        r5 = (p227p4.AbstractC3303h) r1.f10681c.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0224, code lost:
    
        if ((r5 instanceof p227p4.C3296b0) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0227, code lost:
    
        r6 = r5.f10488b;
        r7 = (p227p4.C3296b0) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0232, code lost:
    
        if (r6.f10495d.mo2811f(r7) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0239, code lost:
    
        if (r6.f10493b != 40) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023b, code lost:
    
        r3 = r1.m7036e(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x023f, code lost:
    
        if (r3 == null) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0241, code lost:
    
        r1.f10681c.set(r4, r5.mo6975i(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x024b, code lost:
    
        p136j8.C2104o.m5297w("method too long");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0250, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0251, code lost:
    
        r5 = r4 + 1;
        r3 = (p227p4.C3301f) r1.f10681c.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x025b, code lost:
    
        r1.f10681c.set(r4, new p227p4.C3296b0(p227p4.AbstractC3306k.f10521I, r7.f10489c, p295u4.C4266p.f13968i, r7.f10477f));
        r1.f10681c.add(r4, r7.m6978o(r3));
        r2 = r2 + 1;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0279, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x027b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027e, code lost:
    
        p136j8.C2104o.m5276A("unpaired TargetInsn");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0283, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0284, code lost:
    
        p136j8.C2104o.m5276A("unpaired TargetInsn (dangling)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0289, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a8  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4844j() {
        int i9;
        int i10;
        int i11;
        C3305j[] c3305jArr;
        int i12;
        int i13;
        C4266p c4266p;
        C3308m c3308m;
        C3321z c3321zM6988h;
        boolean z9;
        C3318w c3318w;
        C3310o c3310o;
        C3300e c3300e;
        C4253c c4253c;
        int[] iArr;
        int i14;
        C3297c c3297c;
        C4265o c4265o;
        C4265o c4265oM8572l;
        C4265o c4265oM8572l2;
        if (((C3304i) this.f6628m) != null) {
            return;
        }
        C3316u c3316u = (C3316u) this.f6623h;
        int i15 = c3316u.f10680b;
        if (c3316u.f10684f >= 0) {
            C2104o.m5297w("already processed");
            return;
        }
        int size = c3316u.f10681c.size();
        C3305j[] c3305jArr2 = new C3305j[size];
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            c3305jArr2[i17] = ((AbstractC3303h) c3316u.f10681c.get(i17)).f10488b;
        }
        c3316u.m7037f(c3305jArr2);
        c3316u.f10679a.getClass();
        int i18 = c3316u.f10686h;
        do {
            int i19 = ((c3316u.f10684f + i15) + c3316u.f10685g) - i18;
            Iterator it = c3316u.f10681c.iterator();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (it.hasNext()) {
                C4266p c4266p2 = ((AbstractC3303h) it.next()).f10490d;
                for (int i24 = 0; i24 < c4266p2.f24601h.length; i24++) {
                    C4265o c4265o2 = (C4265o) c4266p2.m10840l(i24);
                    if (c4265o2.f13966h.getType().m9194r()) {
                        int i25 = c4265o2.f13965g;
                        boolean z10 = i25 >= i19;
                        if ((i25 & 1) == 0) {
                            if (z10) {
                                i21++;
                            } else {
                                i23++;
                            }
                        } else if (z10) {
                            i20++;
                        } else {
                            i22++;
                        }
                    }
                }
            }
            if (i20 > i21 && i22 > i23) {
                c3316u.m7034c();
            } else if (i20 <= i21) {
                if (i22 <= i23) {
                    break;
                }
                c3316u.m7034c();
                if (i18 != 0 && i21 > i20) {
                    c3316u.m7033b();
                }
            } else {
                c3316u.m7033b();
            }
        } while (c3316u.m7037f(c3305jArr2));
        int i26 = c3316u.f10684f;
        ArrayList arrayList = c3316u.f10681c;
        if (i26 == 0) {
            int size2 = arrayList.size();
            for (int i27 = 0; i27 < size2; i27++) {
                AbstractC3303h abstractC3303h = (AbstractC3303h) c3316u.f10681c.get(i27);
                C3305j c3305j = abstractC3303h.f10488b;
                C3305j c3305j2 = c3305jArr2[i27];
                if (c3305j != c3305j2) {
                    c3316u.f10681c.set(i27, abstractC3303h.mo6975i(c3305j2));
                }
            }
            i9 = i15;
        } else {
            int size3 = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size3 * 2);
            ArrayList arrayList3 = new ArrayList();
            int i28 = 0;
            while (i28 < size3) {
                AbstractC3303h abstractC3303hMo6971k = (AbstractC3303h) c3316u.f10681c.get(i28);
                C3305j c3305j3 = abstractC3303hMo6971k.f10488b;
                C4270t c4270t = abstractC3303hMo6971k.f10489c;
                C4266p c4266p3 = abstractC3303hMo6971k.f10490d;
                C3305j c3305jM7035d = c3305jArr2[i28];
                if (c3305jM7035d != null) {
                    i10 = i15;
                    i11 = size3;
                    c3305jArr = c3305jArr2;
                    i12 = i28;
                    c3308m = null;
                    c3321zM6988h = null;
                } else {
                    c3305jM7035d = c3316u.m7035d(abstractC3303hMo6971k);
                    BitSet bitSetMo2813m = c3305jM7035d.f10495d.mo2813m(abstractC3303hMo6971k);
                    boolean z11 = bitSetMo2813m.get(i16);
                    i10 = i15;
                    boolean z12 = c3305j3.f10496e;
                    if (z12) {
                        bitSetMo2813m.set(i16);
                    }
                    int length = c4266p3.f24601h.length - bitSetMo2813m.cardinality();
                    if (length == 0) {
                        c4266p = C4266p.f13968i;
                        i11 = size3;
                        c3305jArr = c3305jArr2;
                        i12 = i28;
                        i13 = 0;
                    } else {
                        i11 = size3;
                        C4266p c4266p4 = new C4266p(length);
                        c3305jArr = c3305jArr2;
                        i12 = i28;
                        int i29 = 0;
                        for (int i30 = 0; i30 < c4266p3.f24601h.length; i30++) {
                            if (!bitSetMo2813m.get(i30)) {
                                c4266p4.m10841m(i29, c4266p3.m10840l(i30));
                                i29++;
                            }
                        }
                        if (c4266p3.f24613g) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            c4266p4.f24613g = false;
                        }
                        c4266p = c4266p4;
                    }
                    if (z12) {
                        bitSetMo2813m.set(i13, z11);
                    }
                    c3308m = c4266p.f24601h.length == 0 ? null : new C3308m(c4270t, c4266p);
                    if (!z12 || bitSetMo2813m.get(i13)) {
                        c3321zM6988h = null;
                    } else {
                        C4265o c4265o3 = (C4265o) c4266p3.m10840l(i13);
                        c3321zM6988h = AbstractC3303h.m6988h(c4270t, c4265o3, c4265o3.m8565o(i13));
                    }
                    abstractC3303hMo6971k = abstractC3303hMo6971k.mo6971k(c4266p3.m8570r(z12, bitSetMo2813m));
                }
                if (abstractC3303hMo6971k instanceof C3301f) {
                    C3301f c3301f = (C3301f) abstractC3303hMo6971k;
                    if (c3301f.f10483e) {
                        arrayList3.add(c3301f);
                    } else {
                        if (c3308m != null) {
                            arrayList2.add(c3308m);
                        }
                        if (!(abstractC3303hMo6971k instanceof AbstractC3298c0) && arrayList3.size() > 0) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((C3301f) it2.next());
                            }
                            arrayList3.clear();
                        }
                        if (c3305jM7035d != c3305j3) {
                            abstractC3303hMo6971k = abstractC3303hMo6971k.mo6975i(c3305jM7035d);
                        }
                        arrayList2.add(abstractC3303hMo6971k);
                        if (c3321zM6988h != null) {
                            arrayList2.add(c3321zM6988h);
                        }
                    }
                }
                i28 = i12 + 1;
                i15 = i10;
                size3 = i11;
                c3305jArr2 = c3305jArr;
                i16 = 0;
            }
            i9 = i15;
            c3316u.f10681c = arrayList2;
        }
        do {
            int size4 = c3316u.f10681c.size();
            int i31 = 0;
            int iMo6969b = 0;
            while (true) {
                ArrayList arrayList4 = c3316u.f10681c;
                if (i31 >= size4) {
                    break;
                }
                AbstractC3303h abstractC3303h2 = (AbstractC3303h) arrayList4.get(i31);
                if (iMo6969b < 0) {
                    abstractC3303h2.getClass();
                    C2104o.m5294t("address < 0");
                    return;
                } else {
                    abstractC3303h2.f10487a = iMo6969b;
                    iMo6969b += abstractC3303h2.mo6969b();
                    i31++;
                }
            }
        } while (z9);
        ArrayList arrayList5 = c3316u.f10681c;
        int i32 = c3316u.f10684f + i9 + c3316u.f10685g;
        int size5 = arrayList5.size();
        C3304i c3304i = new C3304i(size5, i32);
        for (int i33 = 0; i33 < size5; i33++) {
            c3304i.m10841m(i33, (AbstractC3303h) arrayList5.get(i33));
        }
        c3304i.f24613g = false;
        this.f6628m = c3304i;
        int i34 = this.f6622g;
        C3318w c3318w2 = C3318w.f10689i;
        if (i34 == 1) {
            c3318w = C3318w.f10689i;
        } else {
            if (i34 != 2 && i34 != 3) {
                C2104o.m5294t("bogus howMuch");
                return;
            }
            Object obj = C4270t.f14180d;
            int length2 = c3304i.f24601h.length;
            C3317v[] c3317vArr = new C3317v[length2];
            C4270t c4270t2 = obj;
            boolean z13 = false;
            int i35 = 0;
            for (int i36 = 0; i36 < length2; i36++) {
                AbstractC3303h abstractC3303h3 = (AbstractC3303h) c3304i.m10840l(i36);
                if (abstractC3303h3 instanceof C3301f) {
                    z13 = true;
                } else {
                    C4270t c4270t3 = abstractC3303h3.f10489c;
                    if (!c4270t3.equals(obj) && c4270t3.f14183c != c4270t2.f14183c && (i34 != 3 || z13)) {
                        c3317vArr[i35] = new C3317v(abstractC3303h3.m6989e(), c4270t3);
                        i35++;
                        c4270t2 = c4270t3;
                        z13 = false;
                    }
                }
            }
            c3318w = new C3318w(i35);
            for (int i37 = 0; i37 < i35; i37++) {
                c3318w.m10841m(i37, c3317vArr[i37]);
            }
            c3318w.f24613g = false;
        }
        this.f6626k = c3318w;
        C3304i c3304i2 = (C3304i) this.f6628m;
        C3310o c3310o2 = C3310o.f10672i;
        int length3 = c3304i2.f24601h.length;
        C1005h c1005h = new C1005h(length3);
        int i38 = 0;
        while (true) {
            Object obj2 = c1005h.f3182i;
            if (i38 >= length3) {
                c1005h.m2571e(Integer.MAX_VALUE, 0);
                ArrayList<C3309n> arrayList6 = (ArrayList) obj2;
                int size6 = arrayList6.size();
                int i39 = size6 - c1005h.f3181h;
                if (i39 == 0) {
                    c3310o = C3310o.f10672i;
                } else {
                    C3309n[] c3309nArr = new C3309n[i39];
                    if (size6 == i39) {
                        arrayList6.toArray(c3309nArr);
                    } else {
                        int i40 = 0;
                        for (C3309n c3309n : arrayList6) {
                            if (c3309n != null) {
                                c3309nArr[i40] = c3309n;
                                i40++;
                            }
                        }
                    }
                    Arrays.sort(c3309nArr);
                    c3310o = new C3310o(i39);
                    for (int i41 = 0; i41 < i39; i41++) {
                        c3310o.m10841m(i41, c3309nArr[i41]);
                    }
                    c3310o.f24613g = false;
                }
                this.f6627l = c3310o;
                C0184c c0184c = (C0184c) this.f6624i;
                C1005h c1005h2 = (C1005h) c0184c.f469a;
                int[] iArr2 = (int[]) c0184c.f470b;
                C0184c c0184c2 = (C0184c) c0184c.f471c;
                int length4 = iArr2.length;
                C4253c c4253c2 = (C4253c) c1005h2.f3182i;
                ArrayList arrayList7 = new ArrayList(length4);
                C3297c c3297c2 = C3297c.f10478i;
                int i42 = 0;
                C4252b c4252b = null;
                C4252b c4252b2 = null;
                while (i42 < length4) {
                    C4252b c4252bM8551s = c4253c2.m8551s(iArr2[i42]);
                    C1607u c1607u = c4252bM8551s.f13931b;
                    if (c1607u.m4126p().f13947g.m8575a()) {
                        C6093g c6093g = c4252bM8551s.f13932c;
                        int i43 = c6093g.f24610i;
                        int i44 = c4252bM8551s.f13933d;
                        InterfaceC4685e interfaceC4685eMo8554e = c1607u.m4126p().mo8554e();
                        int size7 = interfaceC4685eMo8554e.size();
                        if (size7 == 0) {
                            c3297c = C3297c.f10478i;
                            c4253c = c4253c2;
                            iArr = iArr2;
                            i14 = length4;
                        } else {
                            c4253c = c4253c2;
                            if ((i44 == -1 && i43 != size7) || (i44 != -1 && (i43 != size7 + 1 || i44 != c6093g.m10846n(size7)))) {
                                C0353j.m1309g("shouldn't happen: weird successors list");
                                return;
                            }
                            int i45 = 0;
                            while (true) {
                                if (i45 >= size7) {
                                    break;
                                }
                                if (interfaceC4685eMo8554e.getType(i45).equals(C4683c.f15613E)) {
                                    size7 = i45 + 1;
                                    break;
                                }
                                i45++;
                            }
                            C3297c c3297c3 = new C3297c(size7);
                            int i46 = 0;
                            while (i46 < size7) {
                                c3297c3.m10841m(i46, new C3295b(new C4453d0(interfaceC4685eMo8554e.getType(i46)), ((C3301f[]) c0184c2.f469a)[c6093g.m10846n(i46)].m6989e()));
                                i46++;
                                iArr2 = iArr2;
                                length4 = length4;
                            }
                            iArr = iArr2;
                            i14 = length4;
                            c3297c3.f24613g = false;
                            c3297c = c3297c3;
                        }
                        if (c3297c2.f24601h.length != 0) {
                            if (c3297c2.equals(c3297c)) {
                                if (c4252b == null) {
                                    C0353j.m1305c("start == null");
                                    return;
                                } else if (((C3301f[]) c0184c2.f471c)[c4252bM8551s.f13930a].m6989e() - ((C3301f[]) c0184c2.f470b)[c4252b.f13930a].m6989e() <= 65535) {
                                    c4252b2 = c4252bM8551s;
                                }
                            }
                            if (c3297c2.f24601h.length != 0) {
                                arrayList7.add(new C3299d(((C3301f[]) c0184c2.f470b)[c4252b.f13930a].m6989e(), ((C3301f[]) c0184c2.f471c)[c4252b2.f13930a].m6989e(), c3297c2));
                            }
                            c3297c2 = c3297c;
                            c4252b = c4252bM8551s;
                            c4252b2 = c4252b;
                        } else {
                            c3297c2 = c3297c;
                            c4252b = c4252bM8551s;
                            c4252b2 = c4252b;
                        }
                    } else {
                        c4253c = c4253c2;
                        iArr = iArr2;
                        i14 = length4;
                    }
                    i42++;
                    c4253c2 = c4253c;
                    iArr2 = iArr;
                    length4 = i14;
                }
                if (c3297c2.f24601h.length != 0) {
                    arrayList7.add(new C3299d(((C3301f[]) c0184c2.f470b)[c4252b.f13930a].m6989e(), ((C3301f[]) c0184c2.f471c)[c4252b2.f13930a].m6989e(), c3297c2));
                }
                int size8 = arrayList7.size();
                if (size8 == 0) {
                    c3300e = C3300e.f10482i;
                } else {
                    C3300e c3300e2 = new C3300e(size8);
                    for (int i47 = 0; i47 < size8; i47++) {
                        c3300e2.m10841m(i47, (C3299d) arrayList7.get(i47));
                    }
                    c3300e2.f24613g = false;
                    c3300e = c3300e2;
                }
                this.f6625j = c3300e;
                this.f6623h = null;
                this.f6624i = null;
                return;
            }
            AbstractC3303h abstractC3303h4 = (AbstractC3303h) c3304i2.m10840l(i38);
            if (abstractC3303h4 instanceof AbstractC3311p) {
                abstractC3303h4.m6989e();
                throw null;
            }
            if (abstractC3303h4 instanceof AbstractC3312q) {
                int iM6989e = abstractC3303h4.m6989e();
                ArrayList arrayList8 = (ArrayList) obj2;
                C4265o c4265o4 = null;
                int i48 = c4265o4.f13965g;
                C4265o c4265oM2561n = C1005h.m2561n(null);
                c1005h.m2571e(iM6989e, i48);
                C4265o c4265oM8572l3 = ((C4267q) c1005h.f3183j).m8572l(i48);
                if (!c4265oM2561n.m8560i(c4265oM8572l3)) {
                    C4265o[] c4265oArr = ((C4267q) c1005h.f3183j).f13969h;
                    int length5 = c4265oArr.length;
                    int i49 = 0;
                    while (true) {
                        if (i49 >= length5) {
                            c4265o = null;
                            break;
                        }
                        c4265o = c4265oArr[i49];
                        if (c4265o != null && c4265oM2561n.m8562l(c4265o)) {
                            break;
                        } else {
                            i49++;
                        }
                    }
                    if (c4265o != null) {
                        c1005h.m2577k(iM6989e, 4, c4265o);
                    }
                    int i50 = ((int[]) c1005h.f3184k)[i48];
                    if (c4265oM8572l3 != null) {
                        c1005h.m2576j(iM6989e, 3, c4265oM8572l3);
                    } else if (i50 >= 0) {
                        C3309n c3309n2 = (C3309n) arrayList8.get(i50);
                        int i51 = c3309n2.f10668g;
                        C4265o c4265o5 = c3309n2.f10670i;
                        if (i51 == iM6989e) {
                            if (c4265o5.m8560i(c4265oM2561n)) {
                                arrayList8.set(i50, null);
                                c1005h.f3181h++;
                                ((C4267q) c1005h.f3183j).m8573m(c4265oM2561n);
                                ((int[]) c1005h.f3184k)[i48] = -1;
                            } else {
                                if (3 != c3309n2.f10669h) {
                                    c3309n2 = new C3309n(c3309n2.f10668g, 3, c4265o5);
                                }
                                arrayList8.set(i50, c3309n2);
                            }
                        }
                    }
                    if (i48 > 0 && (c4265oM8572l2 = ((C4267q) c1005h.f3183j).m8572l(i48 - 1)) != null && c4265oM8572l2.f13966h.getType().m9194r()) {
                        c1005h.m2577k(iM6989e, 6, c4265oM8572l2);
                    }
                    if (c4265oM2561n.f13966h.getType().m9194r() && (c4265oM8572l = ((C4267q) c1005h.f3183j).m8572l(i48 + 1)) != null) {
                        c1005h.m2577k(iM6989e, 5, c4265oM8572l);
                    }
                    c1005h.m2576j(iM6989e, 1, c4265oM2561n);
                }
            }
            i38++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m4845k(int i9, int i10, boolean z9) {
        AbstractC5700d.m10278g0((int[]) this.f6625j, i9);
        if (z9) {
            m4843e(i9 + i10, false);
        } else {
            AbstractC5700d.m10278g0((int[]) this.f6626k, i9 + i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public void m4846l(int i9, int i10, boolean z9) {
        C1966g c1966g;
        C6093g c6093gM10843o;
        int i11 = i10 + i9;
        if (z9) {
            m4843e(i11, true);
        }
        C1966g c1966g2 = ((C1972m) this.f6623h).f6689c.f5259e;
        int length = c1966g2.f24601h.length;
        C1965f[] c1965fArr = new C1965f[length];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            C1965f c1965f = (C1965f) c1966g2.m10840l(i13);
            if (i9 >= c1965f.f6674a && i9 < c1965f.f6675b) {
                C4453d0 c4453d0 = c1965f.f6677d;
                if (c4453d0 == null) {
                    c4453d0 = C4453d0.f14767j;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= i12) {
                        c1965fArr[i12] = c1965f;
                        i12++;
                        break;
                    }
                    C4453d0 c4453d02 = c1965fArr[i14].f6677d;
                    if (c4453d02 == null) {
                        c4453d02 = C4453d0.f14767j;
                    }
                    if (c4453d02 == c4453d0 || c4453d02 == C4453d0.f14767j) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        if (i12 == 0) {
            c1966g = C1966g.f6678i;
        } else {
            c1966g = new C1966g(i12);
            for (int i15 = 0; i15 < i12; i15++) {
                C1965f c1965f2 = c1965fArr[i15];
                if (c1965f2 == null) {
                    C0353j.m1305c("item == null");
                    return;
                }
                c1966g.m10841m(i15, c1965f2);
            }
            c1966g.f24613g = false;
        }
        ((C1966g[]) this.f6628m)[i9] = c1966g;
        C6093g[] c6093gArr = (C6093g[]) this.f6627l;
        if (!z9) {
            i11 = -1;
        }
        c1966g.getClass();
        if (i11 < -1) {
            C2104o.m5294t("noException < -1");
            return;
        }
        int i16 = i11 < 0 ? 0 : 1;
        int length2 = c1966g.f24601h.length;
        if (length2 == 0) {
            c6093gM10843o = i16 != 0 ? C6093g.m10843o(i11) : C6093g.f24608k;
        } else {
            C6093g c6093g = new C6093g(length2 + i16);
            for (int i17 = 0; i17 < length2; i17++) {
                c6093g.m10844l(((C1965f) c1966g.m10840l(i17)).f6676c);
            }
            if (i16 != 0) {
                c6093g.m10844l(i11);
            }
            c6093g.f24613g = false;
            c6093gM10843o = c6093g;
        }
        c6093gArr[i9] = c6093gM10843o;
    }
}
