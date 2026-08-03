package p227p4;

import bsh.C0353j;
import java.util.ArrayList;
import p000a.AbstractC0000a;
import p020b5.C0184c;
import p071f1.C1005h;
import p104h4.C1607u;
import p109hb.C1671c;
import p116i.C1795u1;
import p121i4.C1957a;
import p136j8.C2104o;
import p192n4.C2893a;
import p295u4.AbstractC4259i;
import p295u4.C4252b;
import p295u4.C4253c;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4270t;
import p343x6.AbstractC5700d;
import p376z4.C6093g;

/* JADX INFO: renamed from: p4.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3320y {

    /* JADX INFO: renamed from: a */
    public final C1005h f10691a;

    /* JADX INFO: renamed from: b */
    public final int f10692b;

    /* JADX INFO: renamed from: c */
    public final C0184c f10693c;

    /* JADX INFO: renamed from: d */
    public final C3315t f10694d;

    /* JADX INFO: renamed from: e */
    public final C1671c f10695e;

    /* JADX INFO: renamed from: f */
    public final int f10696f;

    /* JADX INFO: renamed from: g */
    public int[] f10697g;

    /* JADX INFO: renamed from: h */
    public final int f10698h;

    /* JADX INFO: renamed from: i */
    public final boolean f10699i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3320y(C1005h c1005h, int i9, int i10, C2893a c2893a) {
        this.f10691a = c1005h;
        this.f10692b = i9;
        C0184c c0184c = new C0184c();
        C4253c c4253c = (C4253c) c1005h.f3182i;
        int iM10851o = c4253c.m10851o();
        c0184c.f469a = new C3301f[iM10851o];
        c0184c.f470b = new C3301f[iM10851o];
        c0184c.f471c = new C3301f[iM10851o];
        int length = c4253c.f24601h.length;
        for (int i11 = 0; i11 < length; i11++) {
            C4252b c4252b = (C4252b) c4253c.m10840l(i11);
            C1607u c1607u = c4252b.f13931b;
            int i12 = c4252b.f13930a;
            ((C3301f[]) c0184c.f469a)[i12] = new C3301f(((AbstractC4259i) c1607u.m10840l(0)).f13948h, false);
            C4270t c4270t = c1607u.m4126p().f13948h;
            ((C3301f[]) c0184c.f470b)[i12] = new C3301f(c4270t, false);
            ((C3301f[]) c0184c.f471c)[i12] = new C3301f(c4270t, false);
        }
        this.f10693c = c0184c;
        this.f10698h = i10;
        this.f10697g = null;
        boolean[] zArr = {true};
        C4253c c4253c2 = (C4253c) c1005h.f3182i;
        C1795u1 c1795u1 = new C1795u1(zArr, c4253c2.m8550r(), i10);
        int length2 = c4253c2.f24601h.length;
        for (int i13 = 0; i13 < length2; i13++) {
            C1607u c1607u2 = ((C4252b) c4253c2.m10840l(i13)).f13931b;
            int length3 = c1607u2.f24601h.length;
            for (int i14 = 0; i14 < length3; i14++) {
                ((AbstractC4259i) c1607u2.m10840l(i14)).mo8553d(c1795u1);
            }
        }
        boolean z9 = zArr[0];
        this.f10699i = z9;
        Object[] objArr = c4253c2.f24601h;
        int length4 = objArr.length * 3;
        int length5 = objArr.length;
        int length6 = 0;
        for (int i15 = 0; i15 < length5; i15++) {
            C4252b c4252b2 = (C4252b) c4253c2.f24601h[i15];
            if (c4252b2 != null) {
                length6 += c4252b2.f13931b.f24601h.length;
            }
        }
        int i16 = length6 + length4;
        int iM8550r = c4253c2.m8550r() + (z9 ? 0 : i10);
        this.f10696f = iM8550r;
        C3315t c3315t = new C3315t(c2893a, i16, length4, iM8550r, i10);
        this.f10694d = c3315t;
        C1671c c1671c = new C1671c();
        c1671c.f5523j = this;
        c1671c.f5520g = c3315t;
        this.f10695e = c1671c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4266p m7039a(AbstractC4259i abstractC4259i, C4265o c4265o) {
        C4266p c4266pM8568q = abstractC4259i.f13950j;
        int i9 = abstractC4259i.f13947g.f13971a;
        if (i9 != 14 && i9 != 16) {
            switch (i9) {
            }
        } else if (c4266pM8568q.f24601h.length == 2 && c4265o.f13965g == ((C4265o) c4266pM8568q.m10840l(1)).f13965g) {
            c4266pM8568q = C4266p.m8568q((C4265o) c4266pM8568q.m10840l(1), (C4265o) c4266pM8568q.m10840l(0));
        }
        if (c4265o == null) {
            return c4266pM8568q;
        }
        int length = c4266pM8568q.f24601h.length;
        C4266p c4266p = new C4266p(length + 1);
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            c4266p.m10841m(i11, c4266pM8568q.m10840l(i10));
            i10 = i11;
        }
        c4266p.m10841m(0, c4265o);
        if (!c4266pM8568q.f24613g) {
            c4266p.f24613g = false;
        }
        return c4266p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1957a m7040b(C1005h c1005h, int i9, int i10, C2893a c2893a) {
        int i11;
        int i12;
        C4252b c4252bM8551s;
        int iM10846n;
        int iM10846n2;
        int i13;
        int i14;
        C6093g c6093g;
        int i15 = c1005h.f3181h;
        C3320y c3320y = new C3320y(c1005h, i9, i10, c2893a);
        C4253c c4253c = (C4253c) c1005h.f3182i;
        int length = c4253c.f24601h.length;
        int iM10851o = c4253c.m10851o();
        int[] iArrM10255L = AbstractC5700d.m10255L(iM10851o);
        int[] iArrM10255L2 = AbstractC5700d.m10255L(iM10851o);
        for (int i16 = 0; i16 < length; i16++) {
            AbstractC5700d.m10278g0(iArrM10255L, ((C4252b) c4253c.m10840l(i16)).f13930a);
        }
        int[] iArr = new int[length];
        int iM10297x = i15;
        int i17 = 0;
        while (iM10297x != -1) {
            while (true) {
                if (((C6093g) c1005h.f3184k) == null) {
                    int iM10851o2 = c4253c.m10851o();
                    C6093g[] c6093gArr = new C6093g[iM10851o2];
                    C6093g c6093g2 = new C6093g(10);
                    int i18 = 0;
                    for (int length2 = c4253c.f24601h.length; i18 < length2; length2 = i13) {
                        C4252b c4252b = (C4252b) c4253c.m10840l(i18);
                        int i19 = i15;
                        int i20 = c4252b.f13930a;
                        C6093g c6093g3 = c4252b.f13932c;
                        int i21 = i18;
                        int i22 = c6093g3.f24610i;
                        if (i22 == 0) {
                            c6093g2.m10844l(i20);
                            i13 = length2;
                        } else {
                            i13 = length2;
                            int i23 = 0;
                            while (i23 < i22) {
                                int iM10846n3 = c6093g3.m10846n(i23);
                                C6093g c6093g4 = c6093gArr[iM10846n3];
                                int i24 = i22;
                                if (c6093g4 == null) {
                                    i14 = i23;
                                    c6093g = new C6093g(10);
                                    c6093gArr[iM10846n3] = c6093g;
                                } else {
                                    i14 = i23;
                                    c6093g = c6093g4;
                                }
                                c6093g.m10844l(i20);
                                i23 = i14 + 1;
                                i22 = i24;
                            }
                        }
                        i18 = i21 + 1;
                        i15 = i19;
                    }
                    i11 = i15;
                    for (int i25 = 0; i25 < iM10851o2; i25++) {
                        C6093g c6093g5 = c6093gArr[i25];
                        if (c6093g5 != null) {
                            c6093g5.m10850s();
                            c6093g5.f24613g = false;
                        }
                    }
                    c6093g2.m10850s();
                    c6093g2.f24613g = false;
                    if (c6093gArr[i11] == null) {
                        c6093gArr[i11] = C6093g.f24608k;
                    }
                    c1005h.f3183j = c6093gArr;
                    c1005h.f3184k = c6093g2;
                } else {
                    i11 = i15;
                }
                C6093g c6093g6 = ((C6093g[]) c1005h.f3183j)[iM10297x];
                if (c6093g6 == null) {
                    C0353j.m1309g("no such block: ".concat(AbstractC0000a.m46X0(iM10297x)));
                    return null;
                }
                int i26 = c6093g6.f24610i;
                for (int i27 = 0; i27 < i26; i27++) {
                    iM10846n2 = c6093g6.m10846n(i27);
                    if (AbstractC5700d.m10299z(iArrM10255L2, iM10846n2)) {
                        break;
                    }
                    if (AbstractC5700d.m10299z(iArrM10255L, iM10846n2) && c4253c.m8551s(iM10846n2).f13933d == iM10297x) {
                        break;
                    }
                }
                break;
                AbstractC5700d.m10278g0(iArrM10255L2, iM10846n2);
                iM10297x = iM10846n2;
                i15 = i11;
            }
            int i28 = -1;
            while (iM10297x != i28) {
                AbstractC5700d.m10290q(iArrM10255L, iM10297x);
                AbstractC5700d.m10290q(iArrM10255L2, iM10297x);
                iArr[i17] = iM10297x;
                i17++;
                C4252b c4252bM8551s2 = c4253c.m8551s(iM10297x);
                C6093g c6093g7 = c4252bM8551s2.f13932c;
                int i29 = c4252bM8551s2.f13933d;
                int i30 = c6093g7.f24610i;
                if (i30 == 0) {
                    i12 = -1;
                    c4252bM8551s = null;
                } else if (i30 != 1) {
                    i12 = -1;
                    c4252bM8551s = i29 != -1 ? c4253c.m8551s(i29) : c4253c.m8551s(c6093g7.m10846n(0));
                } else {
                    i12 = -1;
                    c4252bM8551s = c4253c.m8551s(c6093g7.m10846n(0));
                }
                if (c4252bM8551s == null) {
                    break;
                }
                int i31 = c4252bM8551s.f13930a;
                if (AbstractC5700d.m10299z(iArrM10255L, i31)) {
                    iM10846n = i31;
                } else if (i29 == i31 || i29 < 0 || !AbstractC5700d.m10299z(iArrM10255L, i29)) {
                    int i32 = c6093g7.f24610i;
                    int i33 = 0;
                    while (true) {
                        if (i33 >= i32) {
                            iM10846n = i12;
                            break;
                        }
                        iM10846n = c6093g7.m10846n(i33);
                        if (AbstractC5700d.m10299z(iArrM10255L, iM10846n)) {
                            break;
                        }
                        i33++;
                    }
                } else {
                    iM10846n = i29;
                }
                i28 = i12;
                iM10297x = iM10846n;
            }
            iM10297x = AbstractC5700d.m10297x(iArrM10255L, 0);
            i15 = i11;
        }
        int i34 = -1;
        if (i17 != length) {
            C0353j.m1309g("shouldn't happen");
            return null;
        }
        c3320y.f10697g = iArr;
        int i35 = 0;
        while (true) {
            C3315t c3315t = c3320y.f10694d;
            C0184c c0184c = c3320y.f10693c;
            if (i35 >= length) {
                int[] iArr2 = c3320y.f10697g;
                C0184c c0184c2 = new C0184c();
                if (iArr2 == null) {
                    C0353j.m1305c("order == null");
                    throw null;
                }
                if (c0184c == null) {
                    C0353j.m1305c("addresses == null");
                    throw null;
                }
                c0184c2.f469a = c1005h;
                c0184c2.f470b = iArr2;
                c0184c2.f471c = c0184c;
                C3316u c3316u = (C3316u) c3315t.f10677h;
                ArrayList arrayList = (ArrayList) c3315t.f10678i;
                if (arrayList == null) {
                    C2104o.m5297w("already processed");
                    return null;
                }
                int size = arrayList.size();
                for (int i36 = 0; i36 < size; i36++) {
                    c3316u.m7032a((AbstractC3303h) ((ArrayList) c3315t.f10678i).get(i36));
                }
                c3315t.f10678i = null;
                C1957a c1957a = new C1957a();
                if (c3316u == null) {
                    C0353j.m1305c("unprocessedInsns == null");
                    throw null;
                }
                c1957a.f6622g = c3320y.f10692b;
                c1957a.f6623h = c3316u;
                c1957a.f6624i = c0184c2;
                c1957a.f6625j = null;
                c1957a.f6626k = null;
                c1957a.f6627l = null;
                c1957a.f6628m = null;
                return c1957a;
            }
            int i37 = i35 + 1;
            int i38 = i37 == length ? i34 : iArr[i37];
            C4252b c4252bM8551s3 = c4253c.m8551s(iArr[i35]);
            C3301f[] c3301fArr = (C3301f[]) c0184c.f469a;
            int i39 = c4252bM8551s3.f13930a;
            int i40 = c4252bM8551s3.f13933d;
            C1607u c1607u = c4252bM8551s3.f13931b;
            C3301f c3301f = c3301fArr[i39];
            C3316u c3316u2 = (C3316u) c3315t.f10677h;
            C3316u c3316u3 = (C3316u) c3315t.f10677h;
            c3316u2.m7032a(c3301f);
            C3301f c3301f2 = ((C3301f[]) c0184c.f470b)[i39];
            C1671c c1671c = c3320y.f10695e;
            c1671c.f5521h = c4252bM8551s3;
            c1671c.f5522i = c3301f2;
            int length3 = c1607u.f24601h.length;
            C4253c c4253c2 = c4253c;
            for (int i41 = 0; i41 < length3; i41++) {
                ((AbstractC4259i) c1607u.m10840l(i41)).mo8553d(c1671c);
            }
            c3316u3.m7032a(((C3301f[]) c0184c.f471c)[i39]);
            AbstractC4259i abstractC4259iM4126p = c1607u.m4126p();
            if (i40 >= 0 && i40 != i38) {
                if (abstractC4259iM4126p.f13947g.f13975e == 4) {
                    C6093g c6093g8 = c4252bM8551s3.f13932c;
                    if (c6093g8.f24610i != 2) {
                        C2104o.m5297w("block doesn't have exactly two successors");
                        return null;
                    }
                    int iM10846n4 = c6093g8.m10846n(0);
                    if (iM10846n4 == i40) {
                        iM10846n4 = c6093g8.m10846n(1);
                    }
                    if (iM10846n4 == i38) {
                        C3301f c3301f3 = c3301fArr[i40];
                        int size2 = c3316u3.f10681c.size() - 2;
                        try {
                            c3316u3.f10681c.set(size2, ((C3296b0) c3316u3.f10681c.get(size2)).m6978o(c3301f3));
                        } catch (ClassCastException unused) {
                            C2104o.m5294t("non-reversible instruction");
                            return null;
                        } catch (IndexOutOfBoundsException unused2) {
                            C2104o.m5294t("too few instructions");
                            return null;
                        }
                    }
                }
                c3316u3.m7032a(new C3296b0(AbstractC3306k.f10521I, abstractC4259iM4126p.f13948h, C4266p.f13968i, c3301fArr[i40]));
            }
            i35 = i37;
            c4253c = c4253c2;
            i34 = -1;
        }
    }
}
