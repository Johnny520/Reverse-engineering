package p255r4;

import bsh.C0353j;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;
import p227p4.C3309n;
import p227p4.C3310o;
import p227p4.C3317v;
import p227p4.C3318w;
import p295u4.C4265o;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4476y;
import p326w4.C4681a;
import p326w4.C4682b;
import p326w4.C4683c;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3685n {

    /* JADX INFO: renamed from: a */
    public final C3318w f11973a;

    /* JADX INFO: renamed from: b */
    public final C3310o f11974b;

    /* JADX INFO: renamed from: d */
    public final C3689p f11976d;

    /* JADX INFO: renamed from: e */
    public final int f11977e;

    /* JADX INFO: renamed from: f */
    public final int f11978f;

    /* JADX INFO: renamed from: g */
    public final C4681a f11979g;

    /* JADX INFO: renamed from: h */
    public final boolean f11980h;

    /* JADX INFO: renamed from: k */
    public C6090d f11983k;

    /* JADX INFO: renamed from: l */
    public String f11984l;

    /* JADX INFO: renamed from: m */
    public boolean f11985m;

    /* JADX INFO: renamed from: n */
    public final C3309n[] f11986n;

    /* JADX INFO: renamed from: i */
    public int f11981i = 0;

    /* JADX INFO: renamed from: j */
    public int f11982j = 1;

    /* JADX INFO: renamed from: c */
    public final C6090d f11975c = new C6090d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3685n(C3318w c3318w, C3310o c3310o, C3689p c3689p, int i9, int i10, boolean z9, C4476y c4476y) {
        this.f11973a = c3318w;
        this.f11974b = c3310o;
        this.f11976d = c3689p;
        this.f11979g = c4476y.f14786i;
        this.f11980h = z9;
        this.f11977e = i9;
        this.f11978f = i10;
        this.f11986n = new C3309n[i10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m7685b(int i9, int i10) {
        if (i9 >= -4 && i9 <= 10) {
            return AbstractC3199a.m6834g(i10, 15, i9 - (-4), 10);
        }
        C0353j.m1309g("Parameter out of range");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m7686j(C3309n c3309n) {
        StringBuilder sb2 = new StringBuilder("v");
        C4265o c4265o = c3309n.f10670i;
        sb2.append(c4265o.f13965g);
        sb2.append(' ');
        C4451c0 c4451c0 = c4265o.f13967i.f13958g;
        if (c4451c0 == null) {
            sb2.append("null");
        } else {
            sb2.append(c4451c0.mo4901a());
        }
        sb2.append(' ');
        C4453d0 c4453d0 = c3309n.f10671j;
        if (c4453d0 == null) {
            sb2.append("null");
        } else {
            sb2.append(c4453d0.f14784g.mo4901a());
        }
        C4451c0 c4451c0M6997b = c3309n.m6997b();
        if (c4451c0M6997b != null) {
            sb2.append(' ');
            sb2.append(c4451c0M6997b.mo4901a());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7687a(int i9, String str) {
        if (this.f11984l != null) {
            str = AbstractC0921a.m2255r(new StringBuilder(), this.f11984l, str);
        }
        C6090d c6090d = this.f11983k;
        if (c6090d != null) {
            if (!this.f11985m) {
                i9 = 0;
            }
            c6090d.m10827b(i9, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f0, code lost:
    
        r10.m10834j(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f5, code lost:
    
        if (r18.f11983k != null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f8, code lost:
    
        m7687a(1, "end sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0302, code lost:
    
        return r10.m10832h();
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m7688c() {
        C3689p c3689p;
        C3309n c3309n;
        C3318w c3318w = this.f11973a;
        int length = c3318w == null ? 0 : c3318w.f24601h.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i9 = 0; i9 < length; i9++) {
            arrayList.add((C3317v) c3318w.m10840l(i9));
        }
        Collections.sort(arrayList, new C3683m(0));
        C4681a c4681a = this.f11979g;
        ArrayList arrayList2 = new ArrayList(c4681a.f15571i.f24601h.length);
        int iM9181o = c4681a.f15571i.m9181o();
        int i10 = this.f11978f;
        boolean z9 = this.f11980h;
        int i11 = (i10 - iM9181o) - (!z9 ? 1 : 0);
        BitSet bitSet = new BitSet(i10 - i11);
        C3310o c3310o = this.f11974b;
        int length2 = c3310o.f24601h.length;
        for (int i12 = 0; i12 < length2; i12++) {
            C3309n c3309n2 = (C3309n) c3310o.m10840l(i12);
            int i13 = c3309n2.f10670i.f13965g;
            if (i13 >= i11) {
                int i14 = i13 - i11;
                if (!bitSet.get(i14)) {
                    bitSet.set(i14);
                    arrayList2.add(c3309n2);
                }
            }
        }
        Collections.sort(arrayList2, new C3683m(1));
        boolean z10 = this.f11983k != null;
        C6090d c6090d = this.f11975c;
        int i15 = c6090d.f24596c;
        if (arrayList.size() > 0) {
            this.f11982j = ((C3317v) arrayList.get(0)).f10688b.f14183c;
        }
        c6090d.m10838n(this.f11982j);
        if (z10) {
            m7687a(c6090d.f24596c - i15, "line_start: " + this.f11982j);
        }
        int iM9181o2 = (i10 - c4681a.f15571i.m9181o()) - (!z9 ? 1 : 0);
        C4682b c4682b = c4681a.f15571i;
        int length3 = c4682b.f24601h.length;
        C3309n[] c3309nArr = this.f11986n;
        if (!z9) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3309n c3309n3 = (C3309n) it.next();
                if (iM9181o2 == c3309n3.f10670i.f13965g) {
                    c3309nArr[iM9181o2] = c3309n3;
                    break;
                }
            }
            iM9181o2++;
        }
        int i16 = c6090d.f24596c;
        c6090d.m10838n(length3);
        if (z10) {
            m7687a(c6090d.f24596c - i16, String.format("parameters_size: %04x", Integer.valueOf(length3)));
        }
        for (int i17 = 0; i17 < length3; i17++) {
            C4683c c4683c = (C4683c) c4682b.m10840l(i17);
            int i18 = c6090d.f24596c;
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c3309n = null;
                    break;
                }
                c3309n = (C3309n) it2.next();
                if (iM9181o2 == c3309n.f10670i.f13965g) {
                    if (c3309n.m6997b() != null) {
                        m7693h(null);
                    } else {
                        m7693h(c3309n.f10670i.f13967i.f13958g);
                    }
                    c3309nArr[iM9181o2] = c3309n;
                }
            }
            if (c3309n == null) {
                m7693h(null);
            }
            if (z10) {
                m7687a(c6090d.f24596c - i18, "parameter " + ((c3309n == null || c3309n.m6997b() != null) ? "<unnamed>" : c3309n.f10670i.f13967i.f13958g.mo4901a()) + " v" + iM9181o2);
            }
            iM9181o2 += c4683c.m9188i();
        }
        for (C3309n c3309n4 : c3309nArr) {
            if (c3309n4 != null && c3309n4.m6997b() != null) {
                m7691f(c3309n4);
            }
        }
        c6090d.m10834j(7);
        if (this.f11983k != null) {
            m7687a(1, String.format("%04x: prologue end", Integer.valueOf(this.f11981i)));
        }
        int size = arrayList.size();
        int length4 = c3310o.f24601h.length;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            int length5 = c3310o.f24601h.length;
            while (i19 < length5 && ((C3309n) c3310o.m10840l(i19)).f10668g == this.f11981i) {
                int i21 = i19 + 1;
                C3309n c3309n5 = (C3309n) c3310o.m10840l(i19);
                C4265o c4265o = c3309n5.f10670i;
                int i22 = c4265o.f13965g;
                C3309n c3309n6 = c3309nArr[i22];
                if (c3309n5 != c3309n6) {
                    c3309nArr[i22] = c3309n5;
                    int i23 = c3309n5.f10669h;
                    if (i23 == 1) {
                        if (c3309n6 != null && c4265o.m8560i(c3309n6.f10670i)) {
                            if (c3309n6.f10669h == 1) {
                                C0353j.m1309g("shouldn't happen");
                                return null;
                            }
                            int i24 = c6090d.f24596c;
                            c6090d.m10834j(6);
                            m7694i(i22);
                            if (this.f11983k != null) {
                                m7687a(c6090d.f24596c - i24, String.format("%04x: +local restart %s", Integer.valueOf(this.f11981i), m7686j(c3309n5)));
                            }
                        } else if (c3309n5.m6997b() != null) {
                            m7691f(c3309n5);
                        } else {
                            int i25 = c6090d.f24596c;
                            c6090d.m10834j(3);
                            m7694i(i22);
                            m7693h(c4265o.f13967i.f13958g);
                            C4453d0 c4453d0 = c3309n5.f10671j;
                            if (c4453d0 == null || (c3689p = this.f11976d) == null) {
                                c6090d.m10838n(0);
                            } else {
                                c6090d.m10838n(c3689p.f12005g.m7657m(c4453d0) + 1);
                            }
                            if (this.f11983k != null) {
                                m7687a(c6090d.f24596c - i25, String.format("%04x: +local %s", Integer.valueOf(this.f11981i), m7686j(c3309n5)));
                            }
                        }
                    } else if (i23 != 3) {
                        int i26 = c6090d.f24596c;
                        c6090d.m10834j(5);
                        c6090d.m10838n(i22);
                        if (this.f11983k != null) {
                            m7687a(c6090d.f24596c - i26, String.format("%04x: -local %s", Integer.valueOf(this.f11981i), m7686j(c3309n5)));
                        }
                    }
                }
                i19 = i21;
            }
            int size2 = arrayList.size();
            while (i20 < size2 && ((C3317v) arrayList.get(i20)).f10687a == this.f11981i) {
                m7692g((C3317v) arrayList.get(i20));
                i20++;
            }
            int i27 = i19 < length4 ? ((C3309n) c3310o.m10840l(i19)).f10668g : Integer.MAX_VALUE;
            int i28 = i20 < size ? ((C3317v) arrayList.get(i20)).f10687a : Integer.MAX_VALUE;
            int iMin = Math.min(i28, i27);
            if (iMin == Integer.MAX_VALUE || (iMin == this.f11977e && i27 == Integer.MAX_VALUE && i28 == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == i28) {
                m7692g((C3317v) arrayList.get(i20));
                i20++;
            } else {
                m7690e(iMin - this.f11981i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m7689d(int i9) {
        C6090d c6090d = this.f11975c;
        int i10 = c6090d.f24596c;
        c6090d.m10834j(2);
        c6090d.m10837m(i9);
        int i11 = this.f11982j + i9;
        this.f11982j = i11;
        if (this.f11983k == null) {
            return;
        }
        m7687a(c6090d.f24596c - i10, String.format("line = %d", Integer.valueOf(i11)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m7690e(int i9) {
        C6090d c6090d = this.f11975c;
        int i10 = c6090d.f24596c;
        c6090d.m10834j(1);
        c6090d.m10838n(i9);
        int i11 = this.f11981i + i9;
        this.f11981i = i11;
        if (this.f11983k == null) {
            return;
        }
        m7687a(c6090d.f24596c - i10, String.format("%04x: advance pc", Integer.valueOf(i11)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m7691f(C3309n c3309n) {
        C3689p c3689p;
        C6090d c6090d = this.f11975c;
        int i9 = c6090d.f24596c;
        c6090d.m10834j(4);
        C4265o c4265o = c3309n.f10670i;
        m7694i(c4265o.f13965g);
        m7693h(c4265o.f13967i.f13958g);
        C4453d0 c4453d0 = c3309n.f10671j;
        if (c4453d0 == null || (c3689p = this.f11976d) == null) {
            c6090d.m10838n(0);
        } else {
            c6090d.m10838n(c3689p.f12005g.m7657m(c4453d0) + 1);
        }
        m7693h(c3309n.m6997b());
        if (this.f11983k == null) {
            return;
        }
        m7687a(c6090d.f24596c - i9, String.format("%04x: +localx %s", Integer.valueOf(this.f11981i), m7686j(c3309n)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m7692g(C3317v c3317v) {
        int i9 = c3317v.f10688b.f14183c;
        int i10 = c3317v.f10687a;
        int i11 = i9 - this.f11982j;
        int i12 = i10 - this.f11981i;
        if (i12 < 0) {
            C0353j.m1309g("Position entries must be in ascending address order");
            return;
        }
        int i13 = 0;
        if (i11 < -4 || i11 > 10) {
            m7689d(i11);
            i11 = 0;
        }
        int iM7685b = m7685b(i11, i12);
        if ((iM7685b & (-256)) > 0) {
            m7690e(i12);
            iM7685b = m7685b(i11, 0);
            if ((iM7685b & (-256)) > 0) {
                m7689d(i11);
                iM7685b = m7685b(0, 0);
                i12 = 0;
            } else {
                i12 = 0;
                i13 = i11;
            }
        } else {
            i13 = i11;
        }
        this.f11975c.m10834j(iM7685b);
        this.f11982j += i13;
        int i14 = this.f11981i + i12;
        this.f11981i = i14;
        if (this.f11983k == null) {
            return;
        }
        m7687a(1, String.format("%04x: line %d", Integer.valueOf(i14), Integer.valueOf(this.f11982j)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m7693h(C4451c0 c4451c0) {
        C3689p c3689p;
        C6090d c6090d = this.f11975c;
        if (c4451c0 == null || (c3689p = this.f11976d) == null) {
            c6090d.m10838n(0);
        } else {
            c6090d.m10838n(c3689p.f12004f.m7656l(c4451c0) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m7694i(int i9) {
        if (i9 >= 0) {
            this.f11975c.m10838n(i9);
        } else {
            C0353j.m1309g(AbstractC0921a.m2249l(i9, "Signed value where unsigned required: "));
        }
    }
}
