package p121i4;

import af.C0083f;
import be.C0285i;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import md.C2825b;
import md.EnumC2824a;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p020b5.C0184c;
import p038ce.C0549b;
import p038ce.C0561n;
import p071f1.C1005h;
import p104h4.C1607u;
import p109hb.C1695r;
import p170le.C2553a;
import p170le.C2555c;
import p170le.C2556d;
import p170le.C2558f;
import p199nd.C2969e0;
import p199nd.C2970f;
import p199nd.C2988t;
import p219oh.AbstractC3165h;
import p233pd.C3398i;
import p233pd.C3408s;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3503g;
import p246qd.C3514r;
import p295u4.AbstractC4259i;
import p295u4.AbstractC4269s;
import p295u4.C4252b;
import p302ud.C4305a;
import p302ud.C4319o;
import p302ud.C4320p;
import p302ud.C4322r;
import p350xd.C5775b;
import p350xd.C5776c;
import p350xd.C5777d;
import p350xd.C5778e;
import p351xe.AbstractC5798s;
import p369yd.C6028b;
import p369yd.C6029c;
import p376z4.C6093g;
import p384ze.C6140b;
import p384ze.C6141c;

/* JADX INFO: renamed from: i4.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1984y {

    /* JADX INFO: renamed from: a */
    public int f6713a;

    /* JADX INFO: renamed from: b */
    public int f6714b;

    /* JADX INFO: renamed from: c */
    public final Object f6715c;

    /* JADX INFO: renamed from: d */
    public final Object f6716d;

    /* JADX INFO: renamed from: e */
    public final Object f6717e;

    /* JADX INFO: renamed from: f */
    public final Object f6718f;

    /* JADX INFO: renamed from: g */
    public final Object f6719g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1984y(C4322r c4322r) {
        this.f6715c = c4322r;
        this.f6716d = new C2555c();
        C2553a c2553a = new C2553a(c4322r, this);
        this.f6717e = c2553a;
        this.f6718f = new C0184c(c4322r, this, c2553a);
        this.f6719g = new C6141c(c4322r);
        this.f6713a = c4322r.f14425z.size() * 100;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [z4.g] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public void m4909a(C4252b c4252b) {
        int i9;
        C1005h c1005h;
        C6093g c6093g;
        int i10;
        ArrayList arrayList = (ArrayList) this.f6718f;
        C1985z c1985z = (C1985z) this.f6719g;
        C6093g c6093g2 = c4252b.f13932c;
        int i11 = c4252b.f13930a;
        ?? r62 = 0;
        this.f6714b = c6093g2.m10846n(0);
        int i12 = 1;
        int iM10846n = c4252b.f13932c.m10846n(1);
        this.f6713a = iM10846n;
        int iM4911c = m4911c(iM10846n);
        BitSet bitSet = (BitSet) this.f6716d;
        int iNextSetBit = bitSet.nextSetBit(0);
        while (iNextSetBit >= 0) {
            bitSet.clear(iNextSetBit);
            int iIntValue = ((Integer) ((HashMap) this.f6715c).get(Integer.valueOf(iNextSetBit))).intValue();
            C4252b c4252bM4921j = c1985z.m4921j(iNextSetBit);
            ?? r12 = c4252bM4921j.f13932c;
            if (c1985z.m4919h(c4252bM4921j)) {
                int iM4911c2 = m4911c(r12.m10846n(r62));
                int iM10846n2 = r12.m10846n(i12);
                i9 = i12;
                c6093g = new C6093g(2);
                c6093g.m10844l(iM4911c2);
                c6093g.m10844l(iM10846n2);
                c6093g.f24613g = r62;
                i10 = -1;
            } else {
                i9 = i12;
                C1005h[] c1005hArr = c1985z.f6731l;
                int length = c1005hArr.length - 1;
                while (true) {
                    if (length >= 0) {
                        c1005h = c1005hArr[length];
                        if (c1005h != null && ((BitSet) c1005h.f3183j).get(iNextSetBit)) {
                            break;
                        } else {
                            length--;
                        }
                    } else {
                        c1005h = null;
                        break;
                    }
                }
                if (c1005h != null) {
                    int i13 = c1005h.f3181h;
                    if (i13 != this.f6713a) {
                        throw new RuntimeException("ret instruction returns to label " + AbstractC0000a.m46X0(i13) + " expected: " + AbstractC0000a.m46X0(this.f6713a));
                    }
                    c6093g = C6093g.m10843o(this.f6714b);
                    i10 = this.f6714b;
                } else {
                    int i14 = c4252bM4921j.f13933d;
                    int i15 = r12.f24610i;
                    c6093g = new C6093g(i15);
                    i10 = -1;
                    ?? r63 = r62;
                    while (r63 < i15) {
                        int i16 = i15;
                        int iM10846n3 = r12.m10846n(r63);
                        ?? r18 = r63;
                        int iM4911c3 = m4911c(iM10846n3);
                        c6093g.m10844l(iM4911c3);
                        if (i14 == iM10846n3) {
                            i10 = iM4911c3;
                        }
                        i15 = i16;
                        r63 = (r18 == true ? 1 : 0) + 1;
                    }
                    c6093g.f24613g = false;
                }
            }
            C1607u c1607u = c4252bM4921j.f13931b;
            int length2 = c1607u.f24601h.length;
            int i17 = 0;
            int i18 = 0;
            while (i17 < length2) {
                int i19 = i17;
                int i20 = iM4911c;
                if (((AbstractC4259i) c1607u.m10840l(i17)).f13947g != AbstractC4269s.f14100g) {
                    i18++;
                }
                i17 = i19 + 1;
                iM4911c = i20;
            }
            int i21 = iM4911c;
            if (i18 != length2) {
                C1607u c1607u2 = new C1607u(i18);
                int i22 = 0;
                int i23 = 0;
                while (i22 < length2) {
                    C1607u c1607u3 = c1607u;
                    AbstractC4259i abstractC4259i = (AbstractC4259i) c1607u.m10840l(i22);
                    int i24 = length2;
                    int i25 = i22;
                    if (abstractC4259i.f13947g != AbstractC4269s.f14100g) {
                        c1607u2.m10841m(i23, abstractC4259i);
                        i23++;
                    }
                    i22 = i25 + 1;
                    length2 = i24;
                    c1607u = c1607u3;
                }
                c1607u2.f24613g = false;
                c1607u = c1607u2;
            }
            c1985z.m4913a(new C4252b(iIntValue, c1607u, c6093g, i10), (C6093g) arrayList.get(iIntValue));
            if (c1985z.m4919h(c1985z.m4921j(iNextSetBit))) {
                new C1984y(c1985z, (C1968i) this.f6717e, arrayList).m4909a(c1985z.m4921j(iIntValue));
            }
            r62 = 0;
            iNextSetBit = bitSet.nextSetBit(0);
            i12 = i9;
            iM4911c = i21;
        }
        int i26 = iM4911c;
        C4252b c4252b2 = new C4252b(i11, c4252b.f13931b, C6093g.m10843o(i26), i26);
        C6093g c6093g3 = (C6093g) arrayList.get(i11);
        ArrayList arrayList2 = c1985z.f6728i;
        ArrayList arrayList3 = c1985z.f6727h;
        int iM4922k = c1985z.m4922k(c4252b2.f13930a);
        if (iM4922k >= 0) {
            arrayList3.remove(iM4922k);
            arrayList2.remove(iM4922k);
        }
        arrayList3.add(c4252b2);
        c6093g3.m10856k();
        arrayList2.add(c6093g3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07ab A[LOOP:2: B:25:0x00b4->B:338:0x07ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0638 A[EDGE_INSN: B:368:0x0638->B:267:0x0638 BREAK  A[LOOP:10: B:256:0x05dd->B:266:0x062f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5775b m4910b(C4305a c4305a) {
        boolean z9;
        C4305a c4305aM60d0;
        ArrayList arrayList;
        C5775b c5775b;
        C2825b c2825b;
        ArrayList arrayList2;
        C1984y c1984y;
        C5775b c5775b2;
        C2825b c2825b2;
        ArrayList arrayList3;
        C6141c c6141c;
        LinkedHashMap linkedHashMap;
        C4305a c4305a2;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        Iterator it;
        boolean zHasNext;
        ArrayList arrayList4;
        C5775b c5775bM4910b;
        C4305a c4305a3;
        C4305a c4305aM6015b;
        Iterator it2;
        boolean zIsEmpty;
        int i9;
        C1984y c1984y2 = this;
        C4305a c4305a4 = c4305a;
        C4322r c4322r = (C4322r) c1984y2.f6715c;
        C6141c c6141c2 = (C6141c) c1984y2.f6719g;
        Objects.requireNonNull(c4305a4);
        C2555c c2555c = (C2555c) c1984y2.f6716d;
        C5775b c5775b3 = new C5775b(c2555c.f8287b.f8285b);
        boolean zContains = c2555c.f8287b.f8284a.contains(c4305a4);
        EnumC3400k enumC3400k = EnumC3400k.f10969U;
        C2825b c2825b3 = C2825b.f9174A;
        if (zContains) {
            List listMo6238d = c4305a4.f9217g.mo6238d(c2825b3);
            if (!listMo6238d.isEmpty()) {
                ArrayList arrayList5 = new ArrayList(listMo6238d.size());
                Iterator it3 = listMo6238d.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C4320p c4320p = ((C2970f) it3.next()).f9727i;
                    if (c4320p.f14396k == EnumC3400k.f10968T) {
                        arrayList5.add(c4320p);
                        break;
                    }
                }
                Iterator it4 = listMo6238d.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C4320p c4320p2 = ((C2970f) it4.next()).f9727i;
                    if (c4320p2.f14396k == enumC3400k) {
                        arrayList5.add(c4320p2);
                        break;
                    }
                }
                c5775b3.m10464H(new C4319o(arrayList5));
                return c5775b3;
            }
        } else {
            c6141c2.getClass();
            BitSet bitSet = c6141c2.f24738h;
            int i10 = c4305a4.f14349j;
            boolean z10 = bitSet.get(i10);
            bitSet.set(i10);
            if (z10) {
                c4322r.m6382K("Removed duplicated region for block: " + String.valueOf(c4305a4) + " " + c4305a4.f9217g.toString());
                return c5775b3;
            }
            while (c4305a4 != null) {
                C0184c c0184c = (C0184c) c1984y2.f6718f;
                if (c4305a4.f9217g.mo6235a(EnumC2824a.f9149h)) {
                    c1984y = c1984y2;
                    c5775b = c5775b3;
                    c2825b = c2825b3;
                } else {
                    List<C2988t> listMo6238d2 = c4305a4.f9217g.mo6238d(C2825b.f9211z);
                    int size = listMo6238d2.size();
                    if (size != 0) {
                        if (c4305a4.f9217g.mo6235a(EnumC2824a.f9155k)) {
                            if (size == 1) {
                                c4305aM60d0 = c0184c.m791H(c5775b3, (C2988t) listMo6238d2.get(0), c2555c);
                            } else {
                                for (C2988t c2988t : listMo6238d2) {
                                    if (c2988t.f9755a == c4305a4) {
                                        c4305aM60d0 = c0184c.m791H(c5775b3, c2988t, c2555c);
                                    }
                                }
                                z9 = false;
                                c4305aM60d0 = null;
                                C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a4);
                                arrayList = c5775b3.f23507k;
                                if (z9) {
                                    c5775b = c5775b3;
                                    c2825b = c2825b3;
                                    arrayList2 = arrayList;
                                    c1984y = c1984y2;
                                    if (!z9) {
                                    }
                                    if (c4305aM60d0 != null) {
                                    }
                                }
                            }
                            z9 = true;
                            C4320p c4320pM57c02 = AbstractC0000a.m57c0(c4305a4);
                            arrayList = c5775b3.f23507k;
                            if (z9) {
                            }
                        } else {
                            z9 = false;
                            c4305aM60d0 = null;
                            C4320p c4320pM57c022 = AbstractC0000a.m57c0(c4305a4);
                            arrayList = c5775b3.f23507k;
                            if (z9 || c4320pM57c022 == null) {
                                c5775b = c5775b3;
                                c2825b = c2825b3;
                                arrayList2 = arrayList;
                                c1984y = c1984y2;
                                if (!z9) {
                                    arrayList2.add(c4305a4);
                                    c4305aM60d0 = AbstractC0000a.m60d0(c4305a4);
                                }
                                if (c4305aM60d0 != null && !c2555c.f8287b.f8284a.contains(c4305a4) && !c2555c.f8287b.f8284a.contains(c4305aM60d0)) {
                                    c4305a4 = c4305aM60d0;
                                }
                            } else {
                                int iOrdinal = c4320pM57c022.f14396k.ordinal();
                                EnumC2824a enumC2824a = EnumC2824a.f9173z;
                                if (iOrdinal == 15) {
                                    c5775b2 = c5775b3;
                                    c2825b2 = c2825b3;
                                    arrayList3 = arrayList;
                                    c1984y = c1984y2;
                                    C2553a c2553a = (C2553a) c1984y.f6717e;
                                    C3398i c3398i = (C3398i) c4320pM57c022;
                                    C1984y c1984y3 = c2553a.f8283b;
                                    C4322r c4322r2 = c2553a.f8282a;
                                    if (c4305a4.f9217g.mo6235a(enumC2824a)) {
                                        c4305aM60d0 = c3398i.f10946q;
                                    } else {
                                        C1695r c1695rM6007g = C2553a.m6007g(c4322r2, c4305a4);
                                        if (c1695rM6007g != null) {
                                            C1695r c1695rM6008h = C2553a.m6008h(c1695rM6007g);
                                            if (c1695rM6008h == null) {
                                                c1695rM6008h = C1695r.m4315l(c1695rM6007g);
                                            }
                                            C1695r c1695rM6010j = C2553a.m6010j(c4322r2, c4305a4, c1695rM6008h);
                                            if (c1695rM6010j == null && (((C6141c) c1695rM6008h.f5639d).f24738h.cardinality() <= 1 || (c1695rM6010j = C2553a.m6010j(c4322r2, c4305a4, C2553a.m6007g(c4322r2, c4305a4))) == null)) {
                                                c2825b = c2825b2;
                                                arrayList2 = arrayList3;
                                                c5775b = c5775b2;
                                                c4305aM60d0 = null;
                                            } else {
                                                C6141c c6141c3 = (C6141c) c1695rM6010j.f5639d;
                                                C2553a.m6001a(c1695rM6010j);
                                                c5775b = c5775b2;
                                                C6029c c6029c = new C6029c(c5775b);
                                                c6029c.f24475k = (C6028b) c1695rM6010j.f5638c;
                                                c6029c.f24476l = c6141c3.m10909c();
                                                arrayList2 = arrayList3;
                                                arrayList2.add(c6029c);
                                                C4305a c4305a5 = (C4305a) c1695rM6010j.f5644i;
                                                c2555c.m6013c(c6029c);
                                                c2555c.m6011a(c4305a5);
                                                C4305a c4305a6 = (C4305a) c1695rM6010j.f5640e;
                                                if (c4305a6 == null) {
                                                    c6029c.f24480m = new C5775b(c6029c);
                                                } else {
                                                    c6029c.f24480m = c1984y3.m4910b(c4305a6);
                                                }
                                                C4305a c4305a7 = (C4305a) c1695rM6010j.f5641f;
                                                if (c4305a7 == null || c2555c.f8287b.f8284a.contains(c4305a7)) {
                                                    c6029c.f24481n = null;
                                                } else {
                                                    c6029c.f24481n = c1984y3.m4910b(c4305a7);
                                                }
                                                if (c6029c.f24481n != null || c4305a5 == null) {
                                                    c2825b = c2825b2;
                                                } else {
                                                    c2825b = c2825b2;
                                                    List<C2970f> listMo6238d3 = c4305a5.f9217g.mo6238d(c2825b);
                                                    if (!listMo6238d3.isEmpty()) {
                                                        C5775b c5775b4 = new C5775b(c6029c);
                                                        for (C2970f c2970f : listMo6238d3) {
                                                            if (c2970f.f9726h.equals(c4305a5)) {
                                                                C4305a c4305a8 = c2970f.f9725g;
                                                                Iterator it5 = c6141c3.iterator();
                                                                while (true) {
                                                                    C6140b c6140b = (C6140b) it5;
                                                                    if (!c6140b.hasNext()) {
                                                                        break;
                                                                    }
                                                                    c6141c = c6141c3;
                                                                    if (((C4305a) c6140b.next()).f14353n.contains(c4305a8)) {
                                                                        c5775b4.m10464H(c4305a8);
                                                                        break;
                                                                    }
                                                                    c6141c3 = c6141c;
                                                                }
                                                                c6141c = c6141c3;
                                                            } else {
                                                                c6141c = c6141c3;
                                                            }
                                                            c6141c3 = c6141c;
                                                        }
                                                        c6029c.f24481n = c5775b4;
                                                    }
                                                }
                                                c2555c.m6012b();
                                                c4305aM60d0 = c4305a5;
                                            }
                                            z9 = true;
                                            if (!z9) {
                                            }
                                            if (c4305aM60d0 != null) {
                                            }
                                        }
                                    }
                                } else if (iOrdinal != 16) {
                                    if (iOrdinal == 18) {
                                        C2558f c2558f = new C2558f(c4322r, c1984y2);
                                        C5778e c5778e = new C5778e(c5775b3, c4320pM57c022);
                                        C5775b c5775b5 = c5778e.f23515m;
                                        c5775b5.f23507k.add(c4305a4);
                                        arrayList.add(c5778e);
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        HashSet hashSet = new HashSet();
                                        C2558f.m6014a(c5778e, c4320pM57c022.mo7179S(0), c4305a4, linkedHashSet, hashSet);
                                        Iterator it6 = c5778e.f23514l.iterator();
                                        while (it6.hasNext()) {
                                            C4320p c4320p3 = (C4320p) it6.next();
                                            Iterator it7 = it6;
                                            C4305a c4305aM35S = AbstractC0000a.m35S(c4322r, c4320p3, c4322r.f14425z);
                                            C2825b c2825b4 = c2825b3;
                                            EnumC2824a enumC2824a2 = EnumC2824a.f9166s;
                                            if (c4305aM35S != null) {
                                                c4305aM35S.m6231w(enumC2824a2);
                                            }
                                            c4320p3.mo7180a0(0);
                                            c4320p3.m6231w(enumC2824a2);
                                            it6 = it7;
                                            c2825b3 = c2825b4;
                                        }
                                        C2825b c2825b5 = c2825b3;
                                        C4305a c4305aM60d02 = AbstractC0000a.m60d0(c4305a4);
                                        if (c4305aM60d02 == null) {
                                            c4322r.m6382K("Unexpected end of synchronized block");
                                            c4305aM60d0 = null;
                                        } else {
                                            if (linkedHashSet.size() == 1) {
                                                c4305aM6015b = AbstractC0000a.m60d0((C4305a) linkedHashSet.iterator().next());
                                            } else if (linkedHashSet.size() > 1) {
                                                hashSet.clear();
                                                c4305aM6015b = C2558f.m6015b(c4305aM60d02, linkedHashSet, hashSet);
                                            } else {
                                                c4305aM6015b = null;
                                            }
                                            c2555c.m6013c(c5778e);
                                            if (c4305aM6015b != null) {
                                                c2555c.m6011a(c4305aM6015b);
                                            } else {
                                                Iterator it8 = linkedHashSet.iterator();
                                                while (it8.hasNext()) {
                                                    C4305a c4305a9 = (C4305a) it8.next();
                                                    List listM92u = AbstractC0000a.m92u(c4305a9);
                                                    if (listM92u.isEmpty()) {
                                                        it2 = it8;
                                                    } else {
                                                        C4305a c4305a10 = (C4305a) AbstractC5798s.m10515i(listM92u);
                                                        if (c4305a10 == c4322r.f14403C) {
                                                            it2 = it8;
                                                            zIsEmpty = true;
                                                            if (zIsEmpty) {
                                                            }
                                                        } else {
                                                            List list = c4305a10.f14353n;
                                                            if (!list.isEmpty()) {
                                                                it2 = it8;
                                                                zIsEmpty = list.size() == 1 ? ((C4305a) list.get(0)).f14353n.isEmpty() : false;
                                                            }
                                                            if (zIsEmpty) {
                                                            }
                                                        }
                                                        it8 = it2;
                                                    }
                                                    c2555c.m6011a(c4305a9);
                                                    c4305aM6015b = c4305a9;
                                                    it8 = it2;
                                                }
                                            }
                                            c5775b5.f23507k.add(c2558f.f8294a.m4910b(c4305aM60d02));
                                            c2555c.m6012b();
                                            c4305aM60d0 = c4305aM6015b;
                                        }
                                        c5775b = c5775b3;
                                        arrayList2 = arrayList;
                                        c2825b = c2825b5;
                                        z9 = true;
                                    }
                                    c1984y = c1984y2;
                                    if (!z9) {
                                    }
                                    if (c4305aM60d0 != null) {
                                    }
                                } else {
                                    c2825b2 = c2825b3;
                                    C3408s c3408s = (C3408s) c4320pM57c022;
                                    int length = c3408s.m7188l0().f11012q.length;
                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(length);
                                    C4305a[] c4305aArr = c3408s.f11018t;
                                    int i11 = 0;
                                    while (i11 < length) {
                                        ((List) linkedHashMap5.computeIfAbsent(c4305aArr[i11], new C0640b(27))).add(c3408s.m7187k0(i11));
                                        i11++;
                                        length = length;
                                    }
                                    C4305a c4305a11 = c3408s.f11019u;
                                    if (c4305a11 != null) {
                                        ((List) linkedHashMap5.computeIfAbsent(c4305a11, new C0640b(28))).add(C5777d.f23510m);
                                    }
                                    C5777d c5777d = new C5777d(c5775b3, c4305a4);
                                    c3408s.m6233y(new C2969e0(c5777d));
                                    arrayList.add(c5777d);
                                    c2555c.m6013c(c5777d);
                                    BitSet bitSetM6D0 = AbstractC0000a.m6D0(c4322r);
                                    Iterator it9 = c4305a4.f14354o.iterator();
                                    while (it9.hasNext()) {
                                        C4305a c4305a12 = (C4305a) it9.next();
                                        C4305a c4305a13 = c4305a11;
                                        Iterator it10 = it9;
                                        if (!c4305a12.f9217g.mo6235a(EnumC2824a.f9157l)) {
                                            bitSetM6D0.or(c4305a12.f14357r);
                                        }
                                        c4305a11 = c4305a13;
                                        it9 = it10;
                                    }
                                    C4305a c4305a14 = c4305a11;
                                    bitSetM6D0.clear(c4305a4.f14349j);
                                    bitSetM6D0.clear(c4322r.f14403C.f14349j);
                                    if (bitSetM6D0.cardinality() == 1) {
                                        c4305aM60d0 = AbstractC0000a.m86r(c4322r, bitSetM6D0);
                                        c5775b2 = c5775b3;
                                        linkedHashMap = linkedHashMap5;
                                        arrayList3 = arrayList;
                                    } else {
                                        C2988t c2988tM8696U = c4322r.m8696U(c4305a4);
                                        if (c2988tM8696U != null) {
                                            C4305a c4305a15 = c2988tM8696U.f9756b;
                                            bitSetM6D0.andNot(c2988tM8696U.f9755a.f14356q);
                                            bitSetM6D0.andNot(c4305a15.f14356q);
                                            if (bitSetM6D0.cardinality() == 2 && bitSetM6D0.get(c4305a15.f14349j)) {
                                                List listM84q = AbstractC0000a.m84q(c4322r, bitSetM6D0);
                                                listM84q.remove(c4305a15);
                                                c4305aM60d0 = (C4305a) AbstractC5798s.m10512f(listM84q);
                                                if (c4305aM60d0 != null) {
                                                    Iterator it11 = c4305a4.f14354o.iterator();
                                                    boolean z11 = false;
                                                    while (it11.hasNext()) {
                                                        Iterator it12 = it11;
                                                        C4305a c4305a16 = (C4305a) it11.next();
                                                        ArrayList arrayList6 = arrayList;
                                                        C5775b c5775b6 = c5775b3;
                                                        if (!c4305a16.f14357r.get(c4305a15.f14349j) || c4305a16 == c4305aM60d0) {
                                                            linkedHashMap2 = linkedHashMap5;
                                                        } else {
                                                            ArrayList arrayList7 = new ArrayList();
                                                            linkedHashMap2 = linkedHashMap5;
                                                            AbstractC0000a.m102z(c4305a16, c4305a16, arrayList7, AbstractC0000a.m6D0(c4322r), false);
                                                            HashSet hashSet2 = new HashSet(arrayList7);
                                                            if (!hashSet2.contains(c4305aM60d0) && !c4305aM60d0.f14352m.stream().anyMatch(new C2556d(hashSet2, 0))) {
                                                                Iterator it13 = c4305a15.f14352m.iterator();
                                                                while (true) {
                                                                    if (it13.hasNext()) {
                                                                        C4305a c4305a17 = (C4305a) it13.next();
                                                                        if (hashSet2.contains(c4305a17)) {
                                                                            if (c4305a17.f9217g.mo6235a(EnumC2824a.f9159m)) {
                                                                                c4305a17.f14351l.add(new C4320p(enumC3400k, 0));
                                                                                z11 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList = arrayList6;
                                                        it11 = it12;
                                                        c5775b3 = c5775b6;
                                                        linkedHashMap5 = linkedHashMap2;
                                                    }
                                                    c5775b2 = c5775b3;
                                                    linkedHashMap = linkedHashMap5;
                                                    arrayList3 = arrayList;
                                                    if (z11) {
                                                        bitSetM6D0.clear(c4305a15.f14349j);
                                                    }
                                                    if (bitSetM6D0.isEmpty()) {
                                                    }
                                                }
                                                c4305aM60d0 = null;
                                                if (bitSetM6D0.isEmpty()) {
                                                }
                                            } else {
                                                c5775b2 = c5775b3;
                                                linkedHashMap = linkedHashMap5;
                                                arrayList3 = arrayList;
                                                c4305aM60d0 = null;
                                                if (bitSetM6D0.isEmpty()) {
                                                    c4305a2 = c4322r.f14403C;
                                                    c4305aM60d0 = c4305a2;
                                                    c2555c.m6011a(c4305aM60d0);
                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                    if (c4305aM60d0 == null) {
                                                        Set setKeySet = linkedHashMap.keySet();
                                                        BitSet bitSetM6D02 = AbstractC0000a.m6D0(c4322r);
                                                        Iterator it14 = setKeySet.iterator();
                                                        while (it14.hasNext()) {
                                                            bitSetM6D02.set(((C4305a) it14.next()).f14349j);
                                                        }
                                                        bitSetM6D02.clear(c4305aM60d0.f14349j);
                                                        for (C4305a c4305a18 : c5777d.f23511k.f14353n) {
                                                            BitSet bitSet2 = c4305a18.f14357r;
                                                            if (bitSet2.intersects(bitSetM6D02)) {
                                                                BitSet bitSet3 = new BitSet(c4322r.f14425z.size());
                                                                if (!bitSet2.isEmpty()) {
                                                                    bitSet3.or(bitSet2);
                                                                }
                                                                bitSet3.clear(c4305aM60d0.f14349j);
                                                                bitSet3.and(bitSetM6D02);
                                                                linkedHashMap6.put(c4305a18, AbstractC0000a.m86r(c4322r, bitSet3));
                                                            }
                                                        }
                                                        if (linkedHashMap6.isEmpty()) {
                                                            linkedHashMap3 = linkedHashMap;
                                                        } else {
                                                            linkedHashMap3 = linkedHashMap;
                                                            if (AbstractC3165h.m6753E(linkedHashMap3, linkedHashMap6)) {
                                                                ArrayList<C4305a> arrayList8 = new ArrayList(linkedHashMap3.size());
                                                                arrayList8.addAll(linkedHashMap3.keySet());
                                                                arrayList8.sort(new C0549b(linkedHashMap6, 2));
                                                                LinkedHashMap linkedHashMap7 = new LinkedHashMap(linkedHashMap3.size());
                                                                for (C4305a c4305a19 : arrayList8) {
                                                                    linkedHashMap7.put(c4305a19, (List) linkedHashMap3.get(c4305a19));
                                                                }
                                                                if (AbstractC3165h.m6753E(linkedHashMap7, linkedHashMap6)) {
                                                                    c4322r.m6383L("Can't fix incorrect switch cases order, some code will duplicate");
                                                                    linkedHashMap6.clear();
                                                                } else {
                                                                    linkedHashMap4 = linkedHashMap7;
                                                                    it = linkedHashMap4.entrySet().iterator();
                                                                    while (true) {
                                                                        zHasNext = it.hasNext();
                                                                        arrayList4 = c5777d.f23512l;
                                                                        if (zHasNext) {
                                                                            break;
                                                                        }
                                                                        Map.Entry entry = (Map.Entry) it.next();
                                                                        List list2 = (List) entry.getValue();
                                                                        C4305a c4305a20 = (C4305a) entry.getKey();
                                                                        if (c2555c.f8287b.f8284a.contains(c4305a20)) {
                                                                            c5775bM4910b = new C5775b(c2555c.f8287b.f8285b);
                                                                        } else {
                                                                            C4305a c4305a21 = (C4305a) linkedHashMap6.get(c4305a20);
                                                                            c2555c.m6011a(c4305a21);
                                                                            c5775bM4910b = m4910b(c4305a20);
                                                                            if (c4305a21 != null) {
                                                                                c2555c.f8287b.f8284a.remove(c4305a21);
                                                                            }
                                                                            if (c4305a21 != null) {
                                                                                EnumC2824a enumC2824a3 = EnumC2824a.f9135U;
                                                                                c4305a21.m6231w(enumC2824a3);
                                                                                c5775bM4910b.m6231w(enumC2824a3);
                                                                            }
                                                                        }
                                                                        arrayList4.add(new C5776c(list2, c5775bM4910b));
                                                                    }
                                                                    c1984y = this;
                                                                    if (c4305a14 != null ? true : arrayList4.stream().anyMatch(new C0561n(16))) {
                                                                        arrayList4.removeIf(new C0285i(c3408s, 15));
                                                                    }
                                                                    c2555c.m6012b();
                                                                }
                                                            }
                                                        }
                                                        linkedHashMap4 = linkedHashMap3;
                                                        it = linkedHashMap4.entrySet().iterator();
                                                        while (true) {
                                                            zHasNext = it.hasNext();
                                                            arrayList4 = c5777d.f23512l;
                                                            if (zHasNext) {
                                                            }
                                                            arrayList4.add(new C5776c(list2, c5775bM4910b));
                                                        }
                                                        c1984y = this;
                                                        if (c4305a14 != null ? true : arrayList4.stream().anyMatch(new C0561n(16))) {
                                                        }
                                                        c2555c.m6012b();
                                                    }
                                                }
                                            }
                                        } else {
                                            c5775b2 = c5775b3;
                                            linkedHashMap = linkedHashMap5;
                                            arrayList3 = arrayList;
                                            c4305aM60d0 = null;
                                        }
                                        if (c4305aM60d0 == null) {
                                            c4305aM60d0 = c4305a4.f14359t;
                                            if (!bitSetM6D0.get(c4305aM60d0.f14349j)) {
                                                bitSetM6D0.andNot(c4305a4.f14356q);
                                                c4305aM60d0 = AbstractC0000a.m86r(c4322r, bitSetM6D0);
                                            }
                                        }
                                    }
                                    if (c4305aM60d0 != null && c4322r.m8700Y(c4305aM60d0)) {
                                        c4305aM60d0 = c4322r.f14403C;
                                    }
                                    C4305a c4305a22 = c4305a4.f14359t;
                                    if (c4305aM60d0 == null && c4305a22 == (c4305a3 = c4322r.f14403C)) {
                                        List list3 = c4305a3.f14352m;
                                        int size2 = list3.size();
                                        if (size2 != 1) {
                                            AbstractC3506j abstractC3506j = c4322r.f14419t;
                                            C3503g c3503g = AbstractC3506j.f11393j;
                                            EnumC3400k enumC3400k2 = EnumC3400k.f10986p;
                                            if (abstractC3506j != c3503g) {
                                                ArrayList arrayList9 = new ArrayList();
                                                Iterator it15 = list3.iterator();
                                                while (true) {
                                                    if (it15.hasNext()) {
                                                        C4320p c4320pM57c03 = AbstractC0000a.m57c0((C4305a) it15.next());
                                                        if (c4320pM57c03 == null || c4320pM57c03.f14396k != enumC3400k2) {
                                                            break;
                                                        }
                                                        arrayList9.add(c4320pM57c03.mo7179S(0));
                                                    } else {
                                                        AbstractC3508l abstractC3508l = (AbstractC3508l) arrayList9.get(0);
                                                        abstractC3508l.getClass();
                                                        if (abstractC3508l instanceof C3514r) {
                                                            C3514r c3514r = (C3514r) abstractC3508l;
                                                            for (int i12 = 1; i12 < size2; i12++) {
                                                                AbstractC3508l abstractC3508l2 = (AbstractC3508l) arrayList9.get(1);
                                                                abstractC3508l2.getClass();
                                                                if ((abstractC3508l2 instanceof C3514r) && ((C3514r) abstractC3508l2).m7395g0(c3514r)) {
                                                                }
                                                            }
                                                        } else {
                                                            for (int i13 = 1; i13 < size2; i13++) {
                                                                if (((AbstractC3508l) arrayList9.get(1)).equals(abstractC3508l)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                c4305aM60d0 = c4305a3;
                                                break;
                                            }
                                            Iterator it16 = list3.iterator();
                                            while (it16.hasNext()) {
                                                C4320p c4320pM57c04 = AbstractC0000a.m57c0((C4305a) it16.next());
                                                if (c4320pM57c04 == null || c4320pM57c04.f14396k != enumC3400k2) {
                                                    c4305aM60d0 = c4305a3;
                                                    break;
                                                }
                                            }
                                            Iterator it17 = list3.iterator();
                                            while (it17.hasNext()) {
                                                c2555c.m6011a((C4305a) it17.next());
                                            }
                                            for (int i14 = 1; i14 < size2; i14++) {
                                                C4305a c4305a23 = (C4305a) list3.get(i14);
                                                c4305a23.m6231w(EnumC2824a.f9168u);
                                                c4305a23.m6231w(enumC2824a);
                                            }
                                            c4305a2 = (C4305a) list3.get(0);
                                        } else {
                                            c4305a2 = (C4305a) list3.get(0);
                                        }
                                        c4305aM60d0 = c4305a2;
                                    } else {
                                        if (c4305a22 == c3408s.f11019u && c4305a4.f14354o.contains(c4305a22) && c4305a4.f14357r.get(c4305a22.f14349j)) {
                                            c2555c.m6011a(c4305a22);
                                        }
                                        if (c4305aM60d0 == null) {
                                            c4322r.m6383L("Failed to find 'out' block for switch in " + String.valueOf(c4305a4) + ". Please report as an issue.");
                                            c4305aM60d0 = c4305a4.f14359t;
                                        }
                                        if (c4305aM60d0 != null && bitSet.get(c4305aM60d0.f14349j)) {
                                            C0086a.m452k("Failed to find switch 'out' block (already processed)");
                                            return null;
                                        }
                                    }
                                    c2555c.m6011a(c4305aM60d0);
                                    LinkedHashMap linkedHashMap62 = new LinkedHashMap();
                                    if (c4305aM60d0 == null) {
                                    }
                                }
                                c2825b = c2825b2;
                                arrayList2 = arrayList3;
                                c5775b = c5775b2;
                                z9 = true;
                                if (!z9) {
                                }
                                if (c4305aM60d0 != null) {
                                }
                            }
                        }
                    }
                    i9 = c1984y.f6714b + 1;
                    c1984y.f6714b = i9;
                    if (i9 <= c1984y.f6713a) {
                        throw new C0083f("Regions count limit reached");
                    }
                    c5775b3 = c5775b;
                    c2825b3 = c2825b;
                    c1984y2 = c1984y;
                }
                c4305a4 = null;
                i9 = c1984y.f6714b + 1;
                c1984y.f6714b = i9;
                if (i9 <= c1984y.f6713a) {
                }
            }
        }
        return c5775b3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public int m4911c(int i9) {
        int i10;
        ArrayList arrayList = (ArrayList) this.f6718f;
        HashMap map = (HashMap) this.f6715c;
        Integer num = (Integer) map.get(Integer.valueOf(i9));
        if (num != null) {
            return num.intValue();
        }
        int i11 = this.f6713a;
        C6093g c6093g = (C6093g) arrayList.get(i9);
        if (c6093g == null || (i10 = c6093g.f24610i) <= 0 || c6093g.m10846n(i10 - 1) != i11) {
            return i9;
        }
        int iMo4868k = ((C1968i) this.f6717e).mo4868k();
        ((BitSet) this.f6716d).set(i9);
        map.put(Integer.valueOf(i9), Integer.valueOf(iMo4868k));
        while (arrayList.size() <= iMo4868k) {
            arrayList.add(null);
        }
        arrayList.set(iMo4868k, (C6093g) arrayList.get(i9));
        return iMo4868k;
    }

    public C1984y(C1985z c1985z, C1968i c1968i, ArrayList arrayList) {
        this.f6719g = c1985z;
        this.f6715c = new HashMap();
        this.f6716d = new BitSet(c1985z.f6723d);
        this.f6717e = c1968i;
        this.f6718f = arrayList;
    }
}
