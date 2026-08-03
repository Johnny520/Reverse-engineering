package p255r4;

import bsh.C0353j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p020b5.C0184c;
import p071f1.C1005h;
import p073f4.C1064a;
import p121i4.C1957a;
import p136j8.C2104o;
import p174m.C2571a;
import p227p4.AbstractC3303h;
import p227p4.AbstractC3311p;
import p227p4.AbstractC3312q;
import p227p4.C3295b;
import p227p4.C3297c;
import p227p4.C3299d;
import p227p4.C3302g;
import p227p4.C3304i;
import p227p4.C3313r;
import p227p4.C3316u;
import p295u4.C4252b;
import p295u4.C4253c;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4454e;
import p311v4.AbstractC4474w;
import p311v4.C4447a0;
import p311v4.C4453d0;
import p311v4.C4460i;
import p311v4.C4476y;
import p326w4.C4681a;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3681l extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final C4476y f11960k;

    /* JADX INFO: renamed from: l */
    public final C1957a f11961l;

    /* JADX INFO: renamed from: m */
    public C3675i f11962m;

    /* JADX INFO: renamed from: n */
    public final boolean f11963n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4685e f11964o;

    /* JADX INFO: renamed from: p */
    public C3687o f11965p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3681l(C4476y c4476y, C1957a c1957a, boolean z9, InterfaceC4685e interfaceC4685e) {
        super(4, -1);
        if (c4476y == null) {
            C0353j.m1305c("ref == null");
            throw null;
        }
        if (c1957a == null) {
            C0353j.m1305c("code == null");
            throw null;
        }
        if (interfaceC4685e == null) {
            C0353j.m1305c("throwsList == null");
            throw null;
        }
        this.f11960k = c4476y;
        this.f11961l = c1957a;
        this.f11963n = z9;
        this.f11964o = interfaceC4685e;
        this.f11962m = null;
        this.f11965p = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3680k0 c3680k0 = c3689p.f12013o;
        C3674h0 c3674h0 = c3689p.f12005g;
        C1957a c1957a = this.f11961l;
        if ((c1957a.f6622g != 1 && ((C3316u) c1957a.f6623h).f10682d) || ((C3316u) c1957a.f6623h).f10683e) {
            C3687o c3687o = new C3687o(c1957a, this.f11963n, this.f11960k);
            this.f11965p = c3687o;
            c3680k0.m7678k(c3687o);
        }
        C4253c c4253c = (C4253c) ((C1005h) ((C0184c) c1957a.f6624i).f469a).f3182i;
        int length = c4253c.f24601h.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            if (((C4252b) c4253c.m10840l(i9)).f13931b.m4126p().mo8554e().size() != 0) {
                C0184c c0184c = (C0184c) c1957a.f6624i;
                c0184c.getClass();
                HashSet hashSet = new HashSet(20);
                C4253c c4253c2 = (C4253c) ((C1005h) c0184c.f469a).f3182i;
                int length2 = c4253c2.f24601h.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    InterfaceC4685e interfaceC4685eMo8554e = ((C4252b) c4253c2.m10840l(i10)).f13931b.m4126p().mo8554e();
                    int size = interfaceC4685eMo8554e.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        hashSet.add(interfaceC4685eMo8554e.getType(i11));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c3674h0.m7664t((C4683c) it.next());
                }
                this.f11962m = new C3675i(c1957a);
            } else {
                i9++;
            }
        }
        C3316u c3316u = (C3316u) c1957a.f6623h;
        c3316u.getClass();
        HashSet hashSet2 = new HashSet(20);
        for (AbstractC3303h abstractC3303h : c3316u.f10681c) {
            if (abstractC3303h instanceof C3302g) {
                hashSet2.add(((C3302g) abstractC3303h).f10484f);
            } else if (abstractC3303h instanceof C3313r) {
                C3313r c3313r = (C3313r) abstractC3303h;
                int i12 = 0;
                while (true) {
                    AbstractC4446a[] abstractC4446aArr = c3313r.f10673f;
                    if (i12 < abstractC4446aArr.length) {
                        hashSet2.add(abstractC4446aArr[i12]);
                        i12++;
                    }
                }
            } else {
                if (abstractC3303h instanceof AbstractC3311p) {
                    throw null;
                }
                boolean z9 = abstractC3303h instanceof AbstractC3312q;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            c3689p.m7702b((AbstractC4446a) it2.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11894x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0015, code lost:
    
        continue;
     */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        TreeMap treeMap;
        int iM6035q;
        C3689p c3689p = c3680k0.f11995b;
        C2571a c2571a = new C2571a(c3689p, 14);
        C1957a c1957a = this.f11961l;
        Iterator it = ((C3316u) c1957a.f6623h).f10681c.iterator();
        while (true) {
            int length = 0;
            if (!it.hasNext()) {
                C3675i c3675i = this.f11962m;
                if (c3675i != null) {
                    c3675i.m7665a();
                    C3674h0 c3674h0 = c3689p.f12005g;
                    int length2 = c3675i.f11934b.f24601h.length;
                    c3675i.f11937e = new TreeMap();
                    int i10 = 0;
                    while (true) {
                        treeMap = c3675i.f11937e;
                        if (i10 >= length2) {
                            break;
                        }
                        treeMap.put(((C3299d) c3675i.f11934b.m10840l(i10)).f10481i, null);
                        i10++;
                    }
                    if (treeMap.size() > 65535) {
                        C2104o.m5297w("too many catch handlers");
                        return;
                    }
                    C6090d c6090d = new C6090d();
                    c3675i.f11936d = c6090d.m10838n(c3675i.f11937e.size());
                    for (Map.Entry entry : c3675i.f11937e.entrySet()) {
                        C3297c c3297c = (C3297c) entry.getKey();
                        Object[] objArr = c3297c.f24601h;
                        int length3 = objArr.length;
                        int length4 = objArr.length;
                        boolean zEquals = length4 == 0 ? false : ((C3295b) c3297c.m10840l(length4 - 1)).f10475g.equals(C4453d0.f14767j);
                        entry.setValue(Integer.valueOf(c6090d.f24596c));
                        if (zEquals) {
                            c6090d.m10837m(-(length3 - 1));
                            length3--;
                        } else {
                            c6090d.m10837m(length3);
                        }
                        for (int i11 = 0; i11 < length3; i11++) {
                            C3295b c3295b = (C3295b) c3297c.m10840l(i11);
                            c6090d.m10838n(c3674h0.m7657m(c3295b.f10475g));
                            c6090d.m10838n(c3295b.f10476h);
                        }
                        if (zEquals) {
                            c6090d.m10838n(((C3295b) c3297c.m10840l(length3)).f10476h);
                        }
                    }
                    c3675i.f11935c = c6090d.m10832h();
                    C3675i c3675i2 = this.f11962m;
                    c3675i2.m7665a();
                    length = (c3675i2.f11934b.f24601h.length * 8) + c3675i2.f11935c.length;
                }
                c1957a.m4844j();
                int iM6991o = ((C3304i) c1957a.f6628m).m6991o();
                if ((iM6991o & 1) != 0) {
                    iM6991o++;
                }
                m7684k((iM6991o * 2) + 16 + length);
                return;
            }
            AbstractC3303h abstractC3303h = (AbstractC3303h) it.next();
            if (abstractC3303h instanceof C3302g) {
                C3302g c3302g = (C3302g) abstractC3303h;
                AbstractC4446a abstractC4446a = c3302g.f10484f;
                int iM6035q2 = c2571a.m6035q(abstractC4446a);
                if (iM6035q2 >= 0) {
                    c3302g.m6987o(iM6035q2);
                }
                if ((abstractC4446a instanceof AbstractC4474w) && (iM6035q = c2571a.m6035q(((AbstractC4474w) abstractC4446a).f14821g)) >= 0) {
                    c3302g.m6986n(iM6035q);
                }
            } else if (abstractC3303h instanceof C3313r) {
                C3313r c3313r = (C3313r) abstractC3303h;
                while (true) {
                    AbstractC4446a[] abstractC4446aArr = c3313r.f10673f;
                    if (length < abstractC4446aArr.length) {
                        AbstractC4446a abstractC4446a2 = abstractC4446aArr[length];
                        int iM6035q3 = c2571a.m6035q(abstractC4446a2);
                        if (iM6035q3 < 0) {
                            C2104o.m5294t("index < 0");
                            return;
                        }
                        int[] iArr = c3313r.f10674g;
                        if (iArr[length] != -1) {
                            C2104o.m5276A("index already set");
                            return;
                        }
                        iArr[length] = iM6035q3;
                        if (abstractC4446a2 instanceof AbstractC4474w) {
                            int iM6035q4 = c2571a.m6035q(((AbstractC4474w) abstractC4446a2).f14821g);
                            if (iM6035q4 < 0) {
                                C2104o.m5294t("index < 0");
                                return;
                            } else {
                                if (c3313r.f10675h != -1) {
                                    C2104o.m5276A("class index already set");
                                    return;
                                }
                                c3313r.f10675h = iM6035q4;
                            }
                        }
                        length++;
                    }
                }
            } else {
                continue;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return this.f11960k.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a7  */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        boolean z9;
        int length;
        boolean z10;
        C4476y c4476y;
        String string;
        int iM9181o;
        boolean zM10829d = c6090d.m10829d();
        C1957a c1957a = this.f11961l;
        c1957a.m4844j();
        int i9 = ((C3304i) c1957a.f6628m).f10491i;
        c1957a.m4844j();
        C3304i c3304i = (C3304i) c1957a.f6628m;
        int length2 = c3304i.f24601h.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length2) {
                C4476y c4476y2 = this.f11960k;
                C4681a c4681a = c4476y2.f14786i;
                if (!this.f11963n) {
                    if (c4476y2.f14787j == null) {
                        c4476y2.f14787j = c4681a.m9177e(c4476y2.f14821g.f14784g);
                    }
                    c4681a = c4476y2.f14787j;
                }
                int iM9181o2 = c4681a.f15571i.m9181o();
                c1957a.m4844j();
                int iM6991o = ((C3304i) c1957a.f6628m).m6991o();
                z9 = (iM6991o & 1) != 0;
                C3675i c3675i = this.f11962m;
                if (c3675i == null) {
                    length = 0;
                } else {
                    c3675i.m7665a();
                    length = c3675i.f11934b.f24601h.length;
                }
                C3687o c3687o = this.f11965p;
                int iM7681f = c3687o == null ? 0 : c3687o.m7681f();
                if (zM10829d) {
                    c6090d.m10827b(0, m7682g() + ' ' + c4476y2.mo4901a());
                    c6090d.m10827b(2, "  registers_size: ".concat(AbstractC0000a.m46X0(i9)));
                    c6090d.m10827b(2, "  ins_size:       ".concat(AbstractC0000a.m46X0(iM9181o2)));
                    c6090d.m10827b(2, "  outs_size:      ".concat(AbstractC0000a.m46X0(i11)));
                    c6090d.m10827b(2, "  tries_size:     ".concat(AbstractC0000a.m46X0(length)));
                    c6090d.m10827b(4, "  debug_off:      ".concat(AbstractC0000a.m48Y0(iM7681f)));
                    c6090d.m10827b(4, "  insns_size:     ".concat(AbstractC0000a.m48Y0(iM6991o)));
                    InterfaceC4685e interfaceC4685e = this.f11964o;
                    if (interfaceC4685e.size() != 0) {
                        StringBuilder sb2 = new StringBuilder("  throws ");
                        int size = interfaceC4685e.size();
                        if (size == 0) {
                            string = "<empty>";
                            z10 = zM10829d;
                            c4476y = c4476y2;
                        } else {
                            z10 = zM10829d;
                            StringBuilder sb3 = new StringBuilder(100);
                            int i12 = 0;
                            while (i12 < size) {
                                C4476y c4476y3 = c4476y2;
                                if (i12 != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(interfaceC4685e.getType(i12).mo4901a());
                                i12++;
                                c4476y2 = c4476y3;
                            }
                            c4476y = c4476y2;
                            string = sb3.toString();
                        }
                        sb2.append(string);
                        c6090d.m10827b(0, sb2.toString());
                    } else {
                        z10 = zM10829d;
                        c4476y = c4476y2;
                    }
                }
                c6090d.m10836l(i9);
                c6090d.m10836l(iM9181o2);
                c6090d.m10836l(i11);
                c6090d.m10836l(length);
                c6090d.m10835k(iM7681f);
                c6090d.m10835k(iM6991o);
                c1957a.m4844j();
                try {
                    ((C3304i) c1957a.f6628m).m6992p(c6090d);
                    if (this.f11962m != null) {
                        if (z9) {
                            if (z10) {
                                c6090d.m10827b(2, "  padding: 0");
                            }
                            c6090d.m10836l(0);
                        }
                        C3675i c3675i2 = this.f11962m;
                        c3675i2.m7665a();
                        if (c6090d.m10829d()) {
                            c3675i2.m7665a();
                            int length3 = c3675i2.f11934b.f24601h.length;
                            c6090d.m10827b(0, "  tries:");
                            for (int i13 = 0; i13 < length3; i13++) {
                                C3299d c3299d = (C3299d) c3675i2.f11934b.m10840l(i13);
                                C3297c c3297c = c3299d.f10481i;
                                StringBuilder sb4 = new StringBuilder("    try ");
                                int i14 = c3299d.f10479g;
                                sb4.append(i14 == ((char) i14) ? AbstractC0000a.m46X0(i14) : AbstractC0000a.m48Y0(i14));
                                sb4.append("..");
                                int i15 = c3299d.f10480h;
                                sb4.append(i15 == ((char) i15) ? AbstractC0000a.m46X0(i15) : AbstractC0000a.m48Y0(i15));
                                String string2 = sb4.toString();
                                String strM6980p = c3297c.m6980p("    ", HttpUrl.FRAGMENT_ENCODE_SET);
                                c6090d.m10827b(6, string2);
                                c6090d.m10827b(2, strM6980p);
                            }
                            c6090d.m10827b(0, "  handlers:");
                            c6090d.m10827b(c3675i2.f11936d, "    size: ".concat(AbstractC0000a.m46X0(c3675i2.f11937e.size())));
                            C3297c c3297c2 = null;
                            int i16 = 0;
                            for (Map.Entry entry : c3675i2.f11937e.entrySet()) {
                                C3297c c3297c3 = (C3297c) entry.getKey();
                                int iIntValue = ((Integer) entry.getValue()).intValue();
                                if (c3297c2 != null) {
                                    c6090d.m10827b(iIntValue - i16, c3297c2.m6980p("    ", AbstractC0000a.m46X0(i16).concat(": ")));
                                }
                                i16 = iIntValue;
                                c3297c2 = c3297c3;
                            }
                            c6090d.m10827b(c3675i2.f11935c.length - i16, c3297c2.m6980p("    ", AbstractC0000a.m46X0(i16).concat(": ")));
                        }
                        int length4 = c3675i2.f11934b.f24601h.length;
                        for (int i17 = 0; i17 < length4; i17++) {
                            C3299d c3299d2 = (C3299d) c3675i2.f11934b.m10840l(i17);
                            int i18 = c3299d2.f10479g;
                            int i19 = c3299d2.f10480h;
                            int i20 = i19 - i18;
                            if (i20 >= 65536) {
                                throw new UnsupportedOperationException("bogus exception range: " + AbstractC0000a.m48Y0(i18) + ".." + AbstractC0000a.m48Y0(i19));
                            }
                            c6090d.m10835k(i18);
                            c6090d.m10836l(i20);
                            c6090d.m10836l(((Integer) c3675i2.f11937e.get(c3299d2.f10481i)).intValue());
                        }
                        c6090d.m10833i(c3675i2.f11935c);
                    }
                    if (!z10 || this.f11965p == null) {
                        return;
                    }
                    c6090d.m10827b(0, "  debug info");
                    this.f11965p.m7695n(c3689p, "    ", c6090d, false);
                    return;
                } catch (RuntimeException e6) {
                    throw C1064a.m2686b("...while writing instructions for ".concat(c4476y.mo4901a()), e6);
                }
            }
            AbstractC3303h abstractC3303h = (AbstractC3303h) c3304i.m10840l(i10);
            if (abstractC3303h instanceof C3302g) {
                AbstractC4446a abstractC4446a = ((C3302g) abstractC3303h).f10484f;
                if (abstractC4446a instanceof AbstractC4454e) {
                    AbstractC4454e abstractC4454e = (AbstractC4454e) abstractC4446a;
                    z9 = abstractC3303h.f10488b.f10493b == 113;
                    C4681a c4681a2 = abstractC4454e.f14786i;
                    if (!z9) {
                        if (abstractC4454e.f14787j == null) {
                            abstractC4454e.f14787j = c4681a2.m9177e(abstractC4454e.f14821g.f14784g);
                        }
                        c4681a2 = abstractC4454e.f14787j;
                    }
                    iM9181o = c4681a2.f15571i.m9181o();
                } else {
                    iM9181o = abstractC4446a instanceof C4460i ? ((C4460i) abstractC4446a).f14792g.f14812i.f15571i.m9181o() : 0;
                }
            } else if (!(abstractC3303h instanceof C3313r)) {
                continue;
                i10++;
            } else {
                if (abstractC3303h.f10488b.f10493b != 250) {
                    C0353j.m1309g("Expecting invoke-polymorphic");
                    return;
                }
                iM9181o = 1 + ((C4447a0) ((C3313r) abstractC3303h).f10673f[1]).f14757g.f15571i.m9181o();
            }
            if (iM9181o > i11) {
                i11 = iM9181o;
            }
            i10++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CodeItem{" + this.f11960k.mo4901a() + "}";
    }
}
