package p247qe;

import af.C0083f;
import be.AbstractC0269a;
import be.AbstractC0283h;
import be.C0271b;
import be.C0276d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import md.C2825b;
import md.EnumC2824a;
import me.C2833a;
import mh.AbstractC2846d;
import p000a.AbstractC0000a;
import p007a7.C0019b;
import p038ce.C0560m;
import p038ce.C0561n;
import p066ed.C0910c;
import p083fe.C1214a;
import p199nd.C2965c0;
import p227p4.C3315t;
import p233pd.C3390a;
import p233pd.C3399j;
import p233pd.C3403n;
import p233pd.C3406q;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3499c;
import p246qd.C3503g;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p246qd.EnumC3513q;
import p281t3.AbstractC4106c;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4317m;
import p351xe.AbstractC5790k;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;
import p351xe.C5787h;
import td.C4146b;

/* JADX INFO: renamed from: qe.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3520c extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public final C3531n f11459g = new C3531n();

    /* JADX INFO: renamed from: h */
    public C3541x f11460h;

    /* JADX INFO: renamed from: i */
    public List f11461i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C3520c.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C4305a m7415j(C4305a c4305a) {
        if (!c4305a.f9217g.mo6235a(EnumC2824a.f9159m)) {
            C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
            if (c4320pM57c0 == null) {
                return c4305a;
            }
            if (!C0560m.f1749g.contains(c4320pM57c0.f14396k)) {
                return c4305a;
            }
            List list = c4305a.f14352m;
            if (list.size() == 1) {
                return m7415j((C4305a) list.get(0));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m7416k(C4322r c4322r) {
        Iterator it = c4322r.f14404D.iterator();
        while (it.hasNext()) {
            if (!((AbstractC3506j) ((C3515s) it.next()).f11447l.f10677h).mo7345w()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static int m7417l(C4322r c4322r, C3406q c3406q, boolean z9) {
        EnumC3400k enumC3400k;
        int size = c3406q.f14398m.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C3514r c3514rM7184j0 = c3406q.m7184j0(i10);
            C4305a c4305a = (C4305a) c3406q.f11009o.get(i10);
            C4305a c4305aM7415j = m7415j(c4305a);
            if (c4305aM7415j == null) {
                c4322r.m6380I("Failed to insert an additional move for type inference into block ".concat(String.valueOf(c4305a)));
                return 0;
            }
            C3515s c3515s = c3514rM7184j0.f11440m;
            C4320p c4320pM7394f0 = c3515s.f11444i.m7394f0();
            EnumC3400k enumC3400k2 = EnumC3400k.f10983m;
            if (c4320pM7394f0 == null || ((enumC3400k = c4320pM7394f0.f14396k) != EnumC3400k.f10977g && (enumC3400k != enumC3400k2 || c3515s.f11445j.size() != 1))) {
                i9++;
                if (z9) {
                    C3515s c3515s2 = c3514rM7184j0.f11440m;
                    int i11 = c3514rM7184j0.f11439l;
                    C3514r c3514rM7392d0 = c3514rM7184j0.m7392d0(i11, c3514rM7184j0.f11419i, null);
                    C3515s c3515sM8703b0 = c4322r.m8703b0(c3514rM7392d0);
                    C3514r c3514rM7392d02 = c3514rM7184j0.m7392d0(i11, c3514rM7184j0.f11419i, c3515s2);
                    C4320p c4320p = new C4320p(enumC3400k2, 1);
                    c4320p.m8688d0(c3514rM7392d0);
                    c4320p.mo7178I(c3514rM7392d02);
                    c4320p.m6231w(EnumC2824a.f9159m);
                    c4305aM7415j.f14351l.add(c4320p);
                    c3406q.mo7181b0(c3514rM7184j0, c3514rM7184j0.m7392d0(i11, c3514rM7184j0.f11419i, c3515sM8703b0));
                }
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C3399j m7418m(C4322r c4322r, C3514r c3514r, AbstractC3506j abstractC3506j) {
        EnumC3400k enumC3400k;
        C4305a c4305aM35S;
        C4320p c4320p = c3514r.f11420j;
        if (c4320p == null || (enumC3400k = c4320p.f14396k) == EnumC3400k.f10972X) {
            return null;
        }
        if ((enumC3400k == EnumC3400k.f10992v && c4320p.mo7179S(1).m7383Q()) || (c4305aM35S = AbstractC0000a.m35S(c4322r, c4320p, c4322r.f14425z)) == null) {
            return null;
        }
        C3514r c3514rM7393e0 = c3514r.m7393e0(c4322r);
        C3514r c3514rMo7374H = c3514r.mo7374H();
        C3399j c3399j = new C3399j(EnumC3400k.f10949A, abstractC3506j, 1);
        c3399j.m8688d0(c3514rM7393e0);
        c3399j.mo7178I(c3514rMo7374H);
        c3399j.m6231w(EnumC2824a.f9159m);
        c4320p.mo7181b0(c3514r, c3399j.f14397l.mo7374H());
        int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p);
        if (iM47Y == -1) {
            return null;
        }
        c4305aM35S.f14351l.add(iM47Y, c3399j);
        return c3399j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static List m7419n(AbstractC3506j abstractC3506j, C3515s c3515s) {
        abstractC3506j.getClass();
        if (abstractC3506j instanceof C3497a) {
            ArrayList arrayList = new ArrayList();
            Iterator it = m7419n(abstractC3506j.mo7340g(), null).iterator();
            while (it.hasNext()) {
                arrayList.add(new C3497a((AbstractC3506j) it.next()));
            }
            return arrayList;
        }
        if (c3515s != null) {
            Iterator it2 = ((LinkedHashSet) c3515s.f11447l.f10678i).iterator();
            while (it2.hasNext()) {
                AbstractC3506j type = ((InterfaceC3521d) it2.next()).getType();
                if (type.mo7351v() || (type instanceof C3497a)) {
                    return Collections.EMPTY_LIST;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (EnumC3513q enumC3513q : abstractC3506j.mo7342n()) {
            if (enumC3513q != EnumC3513q.VOID) {
                arrayList2.add(AbstractC3506j.m7357d(enumC3513q));
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m7420q(C4322r c4322r, C3515s c3515s, boolean z9) {
        C4320p c4320p;
        EnumC3400k enumC3400k;
        C3403n c3403n;
        AbstractC3508l abstractC3508lMo7171k0;
        InterfaceC4317m interfaceC4317mM3342g;
        C3399j c3399jM7418m;
        boolean z10;
        if (((AbstractC3506j) c3515s.f11447l.f10677h).mo7345w() || c3515s.m7404i() || (c4320p = c3515s.f11444i.f11420j) == null || !((enumC3400k = c4320p.f14396k) == EnumC3400k.f10959K || enumC3400k == EnumC3400k.f10961M)) {
            return false;
        }
        AbstractC3506j abstractC3506j = c4320p.f14397l.f11419i;
        if (!z9) {
            c3515s.m7409n(abstractC3506j);
            return true;
        }
        Iterator it = c3515s.f11445j.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            C4320p c4320p2 = ((C3514r) it.next()).f11420j;
            if (AbstractC5792m.m10493j(c4320p2, EnumC3400k.f10963O) && (abstractC3508lMo7171k0 = (c3403n = (C3403n) c4320p2).mo7171k0()) != null) {
                if ((abstractC3508lMo7171k0 instanceof C3514r ? Objects.equals(((C3514r) abstractC3508lMo7171k0).f11440m, c3515s) : false) && (interfaceC4317mM3342g = c4322r.f14411l.f14371k.f14442h.m3342g(c3403n)) != null) {
                    int i9 = -1;
                    int i10 = 0;
                    for (AbstractC3508l abstractC3508l : c3403n.f14398m) {
                        if (abstractC3508l != abstractC3508lMo7171k0) {
                            i9++;
                            abstractC3508l.getClass();
                            if (abstractC3508l instanceof C3514r) {
                                AbstractC3506j abstractC3506j2 = (AbstractC3506j) interfaceC4317mM3342g.mo2218c().get(i9);
                                AbstractC3506j abstractC3506jMo7375I = abstractC3508l.mo7375I();
                                AbstractC3506j abstractC3506jM3345l = c4322r.f14411l.f14371k.f14443i.m3345l(abstractC3506j, abstractC3506jMo7375I, abstractC3506j2);
                                if (abstractC3506jM3345l != null && !abstractC3506jM3345l.equals(abstractC3506jMo7375I) && (c3399jM7418m = m7418m(c4322r, (C3514r) abstractC3508l, abstractC3506jM3345l)) != null) {
                                    c3399jM7418m.m6231w(EnumC2824a.f9138X);
                                    i10++;
                                }
                            }
                        }
                    }
                    z10 = i10 > 0;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public final String mo1051e() {
        return "FixTypesVisitor";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        this.f11460h = c4325u.f14441g;
        this.f11459g.mo1052f(c4325u);
        final int i9 = 0;
        final int i10 = 1;
        final int i11 = 2;
        final int i12 = 3;
        final int i13 = 4;
        final int i14 = 5;
        final int i15 = 6;
        final int i16 = 7;
        final int i17 = 8;
        this.f11461i = Arrays.asList(new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i9) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a2 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k2 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k2.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k2);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k2.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k22 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k22.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k22);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k22.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        }, new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i10) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a2 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a2);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a2);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a22 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k22 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k22.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k22);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k22.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k222.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k222);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k222.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        }, new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i11) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a22 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a22);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a22);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k222.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k222);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k222.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k2222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k2222.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k2222);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k2222.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        }, new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i12) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a222);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a222);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a2222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k2222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k2222.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k2222);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k2222.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k22222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k22222.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k22222);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k22222.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        }, new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i13) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a2222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a2222);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a2222);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a22222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k22222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k22222.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k22222);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k22222.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k222222.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k222222);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k222222.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        }, new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i14) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a22222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a22222);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a22222);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a222222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k222222.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k222222);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k222222.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k2222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k2222222.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k2222222);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k2222222.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        }, new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i15) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a222222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a222222);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a222222);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a2222222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k2222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k2222222.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k2222222);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k2222222.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k22222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k22222222.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k22222222);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k22222222.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        }, new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i16) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a2222222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a2222222);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a2222222);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a22222222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k22222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k22222222.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k22222222);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k22222222.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k222222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k222222222.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k222222222);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k222222222.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        }, new C2833a(this), new Function(this) { // from class: qe.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3520c f11457b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11457b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
            
                r16 = r3;
                r17 = r4;
                r9 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:303:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x065e  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i18;
                boolean z9;
                C3399j c3399j;
                C4305a c4305aM35S;
                boolean z10;
                C4305a c4305aM35S2;
                C4320p c4320p;
                C4320p c4320pM10484a;
                C4305a c4305aM35S3;
                boolean z11;
                int i19;
                List list;
                int i20;
                List list2;
                int i21;
                int i22;
                int i23;
                Iterator it;
                int i24;
                C4320p c4320p2;
                EnumC3400k enumC3400k;
                int i25;
                int i26;
                int i27;
                EnumC3400k enumC3400k2;
                switch (i17) {
                    case 0:
                        C4322r c4322r = (C4322r) obj;
                        C3531n c3531n = this.f11457b.f11459g;
                        try {
                            List list3 = c4322r.f14404D;
                            int size = list3.size();
                            int i28 = 0;
                            boolean z12 = false;
                            while (true) {
                                boolean z13 = true;
                                if (i28 >= size) {
                                    if (!z12) {
                                        return Boolean.FALSE;
                                    }
                                    C0271b.m1087W(c4322r);
                                    c3531n.m7440l(c4322r);
                                    c3531n.m7441m(c4322r);
                                    Iterator it2 = c4322r.f14404D.iterator();
                                    while (it2.hasNext()) {
                                        if (C3520c.m7420q(c4322r, (C3515s) it2.next(), false)) {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        c3531n.m7440l(c4322r);
                                        c3531n.m7441m(c4322r);
                                        c4322r.m6383L("Type inference incomplete: some casts might be missing");
                                    }
                                    return Boolean.valueOf(z13);
                                }
                                if (C3520c.m7420q(c4322r, (C3515s) list3.get(i28), true)) {
                                    z12 = true;
                                }
                                i28++;
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Type inference fix 'apply assigned field type' failed", e6);
                            return Boolean.FALSE;
                        }
                        break;
                    case 1:
                        C4322r c4322r2 = (C4322r) obj;
                        C3520c c3520c = this.f11457b;
                        C3531n c3531n2 = c3520c.f11459g;
                        Iterator it3 = c4322r2.f14404D.iterator();
                        boolean z14 = false;
                        int i29 = 0;
                        while (it3.hasNext()) {
                            LinkedHashSet linkedHashSet = (LinkedHashSet) ((C3515s) it3.next()).f11447l.f10678i;
                            if (AbstractC0283h.m1167k(linkedHashSet, new C0561n(21))) {
                                List listM1184v = AbstractC0283h.m1184v(linkedHashSet, new C0561n(22));
                                if (!listM1184v.isEmpty()) {
                                    AbstractC3506j abstractC3506j = (AbstractC3506j) c3520c.m7422o(linkedHashSet).orElse(AbstractC3506j.f11404u);
                                    abstractC3506j.getClass();
                                    if (abstractC3506j instanceof C3499c) {
                                        List listMo7348i = abstractC3506j.mo7348i();
                                        if (listMo7348i.size() == 1) {
                                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7348i.get(0);
                                            Iterator it4 = listM1184v.iterator();
                                            i18 = 0;
                                            while (it4.hasNext()) {
                                                C3523f c3523f = (C3523f) ((InterfaceC3521d) it4.next());
                                                EnumC3529l enumC3529lM7432d = c3520c.f11460h.f11519c.m7432d(abstractC3506j2, c3523f.getType());
                                                if (enumC3529lM7432d.m7434b() || enumC3529lM7432d == EnumC3529l.f11483i) {
                                                    c3523f.f11463b.f10948o = abstractC3506j;
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 0;
                            }
                            i29 += i18;
                        }
                        if (i29 != 0) {
                            c3531n2.m7440l(c4322r2);
                            c3531n2.m7441m(c4322r2);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 2:
                        C4322r c4322r3 = (C4322r) obj;
                        C3531n c3531n3 = this.f11457b.f11459g;
                        List list4 = c4322r3.f14404D;
                        int size2 = list4.size();
                        int i30 = 0;
                        int i31 = 0;
                        while (true) {
                            int i32 = 1;
                            if (i30 >= size2) {
                                if (i31 != 0) {
                                    C0271b.m1087W(c4322r3);
                                    c3531n3.m7440l(c4322r3);
                                    c3531n3.m7441m(c4322r3);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                            C3515s c3515s = (C3515s) list4.get(i30);
                            C3315t c3315t = c3515s.f11447l;
                            if (!((AbstractC3506j) c3315t.f10677h).mo7345w() && !c3515s.m7404i()) {
                                Iterator it5 = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        AbstractC3506j type = ((InterfaceC3521d) it5.next()).getType();
                                        if (type.mo7345w() && !type.equals((AbstractC3506j) c3315t.f10677h) && type.m7365c()) {
                                            c4322r3.f14411l.f14371k.f14443i.getClass();
                                            if (((AbstractC3506j) type.m7363C(new C3540w(C1214a.m3336e(c4322r3), 1))) == null) {
                                                C3514r c3514r = c3515s.f11444i;
                                                C4320p c4320p3 = c3514r.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X || (c4305aM35S = AbstractC0000a.m35S(c4322r3, c4320p3, c4322r3.f14425z)) == null) {
                                                    c3399j = null;
                                                    EnumC2824a enumC2824a22222222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                        c3399j.m6231w(enumC2824a22222222);
                                                    } else {
                                                        ArrayList arrayList = c3515s.f11445j;
                                                        if (!arrayList.isEmpty()) {
                                                            int i33 = 0;
                                                            for (C3514r c3514r2 : new ArrayList(arrayList)) {
                                                                C3399j c3399jM7418m = C3520c.m7418m(c4322r3, c3514r2, c3514r2.f11419i);
                                                                if (c3399jM7418m != null) {
                                                                    c3399jM7418m.m6231w(enumC2824a22222222);
                                                                    i33++;
                                                                }
                                                            }
                                                            i32 = i33;
                                                        }
                                                    }
                                                } else {
                                                    c4320p3.m8688d0(c3514r.m7393e0(c4322r3));
                                                    C3514r c3514rMo7374H = c3514r.mo7374H();
                                                    C3514r c3514rMo7374H2 = c4320p3.f14397l.mo7374H();
                                                    C3399j c3399j2 = new C3399j(EnumC3400k.f10949A, type, 1);
                                                    c3399j2.m8688d0(c3514rMo7374H);
                                                    c3399j2.mo7178I(c3514rMo7374H2);
                                                    c3399j2.m6231w(EnumC2824a.f9159m);
                                                    int iM47Y = AbstractC0000a.m47Y(c4305aM35S, c4320p3);
                                                    if (iM47Y != -1) {
                                                        c4305aM35S.f14351l.add(iM47Y + 1, c3399j2);
                                                        c3399j = c3399j2;
                                                    }
                                                    EnumC2824a enumC2824a222222222 = EnumC2824a.f9139Y;
                                                    if (c3399j == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i32 = 0;
                                i31 += i32;
                            }
                            i30++;
                        }
                        break;
                    case 3:
                        return Boolean.valueOf(this.f11457b.m7423p((C4322r) obj));
                    case 4:
                        C4322r c4322r4 = (C4322r) obj;
                        C3531n c3531n4 = this.f11457b.f11459g;
                        boolean z15 = false;
                        for (C3515s c3515s2 : new ArrayList(c4322r4.f14404D)) {
                            if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w() && !c3515s2.m7404i()) {
                                List list5 = c3515s2.f11446k;
                                if (list5 == null) {
                                    list5 = Collections.EMPTY_LIST;
                                }
                                int size3 = list5.size();
                                EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
                                if (size3 < 2 || (c4320pM10484a = AbstractC5792m.m10484a(c3515s2.f11444i.m7394f0(), enumC3400k3)) == null || (c4305aM35S3 = AbstractC0000a.m35S(c4322r4, c4320pM10484a, c4322r4.f14425z)) == null) {
                                    C3514r c3514r3 = c3515s2.f11444i;
                                    ArrayList arrayList2 = c3515s2.f11445j;
                                    C4320p c4320pM7394f0 = c3514r3.m7394f0();
                                    if (AbstractC5792m.m10493j(c4320pM7394f0, enumC3400k3) && arrayList2.size() >= 2 && (c4305aM35S2 = AbstractC0000a.m35S(c4322r4, c4320pM7394f0, c4322r4.f14425z)) != null) {
                                        c4320pM7394f0.m6227D(EnumC2824a.f9164q);
                                        int iM47Y2 = AbstractC0000a.m47Y(c4305aM35S2, c4320pM7394f0) + 1;
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        int size4 = arrayList3.size();
                                        for (int i34 = 0; i34 < size4; i34++) {
                                            C3514r c3514r4 = (C3514r) arrayList3.get(i34);
                                            c3514r4.m6227D(EnumC2824a.f9165r);
                                            if (i34 != 0 && (c4320p = c3514r4.f11420j) != null) {
                                                C4320p c4320pM8682Q = c4320pM7394f0.m8682Q(c4322r4);
                                                c4305aM35S2.f14351l.add(iM47Y2, c4320pM8682Q);
                                                c4320p.mo7181b0(c3514r4, c4320pM8682Q.f14397l.mo7374H());
                                            }
                                        }
                                    }
                                } else {
                                    List<C3406q> list6 = c3515s2.f11446k;
                                    if (list6 == null) {
                                        list6 = Collections.EMPTY_LIST;
                                    }
                                    boolean z16 = true;
                                    for (C3406q c3406q : list6) {
                                        if (z16) {
                                            z16 = false;
                                        } else {
                                            C4320p c4320pM8682Q2 = c4320pM10484a.m8682Q(c4322r4);
                                            c4320pM8682Q2.m6231w(EnumC2824a.f9159m);
                                            int iM47Y3 = AbstractC0000a.m47Y(c4305aM35S3, c4320pM10484a);
                                            if (iM47Y3 != -1) {
                                                c4305aM35S3.f14351l.add(iM47Y3 + 1, c4320pM8682Q2);
                                            }
                                            List list7 = c3406q.f14398m;
                                            C3514r c3514r5 = null;
                                            if (list7.size() != 0) {
                                                Iterator it6 = list7.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        C3514r c3514r6 = (C3514r) ((AbstractC3508l) it6.next());
                                                        if (c3514r6.f11440m == c3515s2) {
                                                            c3514r5 = c3514r6;
                                                        }
                                                    }
                                                }
                                            }
                                            c3406q.mo7181b0(c3514r5, c4320pM8682Q2.f14397l.mo7374H());
                                        }
                                    }
                                }
                                z15 = true;
                            }
                        }
                        if (z15) {
                            C0271b.m1087W(c4322r4);
                            c3531n4.m7440l(c4322r4);
                            c3531n4.m7441m(c4322r4);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 5:
                        C4322r c4322r5 = (C4322r) obj;
                        C3531n c3531n5 = this.f11457b.f11459g;
                        List list8 = c4322r5.f14404D;
                        int size5 = list8.size();
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 1;
                            if (i36 >= size5) {
                                if (i37 == 0) {
                                    z11 = false;
                                } else {
                                    C0271b.m1087W(c4322r5);
                                    c3531n5.m7440l(c4322r5);
                                    c3531n5.m7441m(c4322r5);
                                    z11 = true;
                                }
                                return Boolean.valueOf(z11);
                            }
                            C3515s c3515s3 = (C3515s) list8.get(i36);
                            C3315t c3315t2 = c3515s3.f11447l;
                            if (((AbstractC3506j) c3315t2.f10677h).mo7345w()) {
                                list = list8;
                                i20 = size5;
                                i19 = i35;
                                i25 = i36;
                                i26 = i37;
                            } else {
                                Iterator it7 = ((LinkedHashSet) c3315t2.f10678i).iterator();
                                int i39 = i35;
                                while (true) {
                                    if (it7.hasNext()) {
                                        InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it7.next();
                                        AbstractC3506j type2 = interfaceC3521d.getType();
                                        int iM8279b = AbstractC4106c.m8279b(interfaceC3521d.mo7424b());
                                        if (iM8279b != 0) {
                                            if (iM8279b == i38) {
                                                if (type2 instanceof C3503g) {
                                                    EnumC3513q enumC3513q = ((C3503g) type2).f11372K;
                                                    enumC3513q.getClass();
                                                    i27 = ((enumC3513q == EnumC3513q.OBJECT || enumC3513q == EnumC3513q.ARRAY) ? i38 : i35) ^ i38;
                                                } else {
                                                    EnumC3513q[] enumC3513qArrMo7342n = type2.mo7342n();
                                                    int length = enumC3513qArrMo7342n.length;
                                                    int i40 = i35;
                                                    while (true) {
                                                        if (i40 < length) {
                                                            EnumC3513q enumC3513q2 = enumC3513qArrMo7342n[i40];
                                                            enumC3513q2.getClass();
                                                            if (enumC3513q2 == EnumC3513q.OBJECT || enumC3513q2 == EnumC3513q.ARRAY) {
                                                                i40++;
                                                            } else {
                                                                i27 = 1;
                                                            }
                                                        } else {
                                                            i27 = i35;
                                                        }
                                                    }
                                                }
                                                if (i27 == 0) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i38 = 1;
                                        } else if (type2.mo7349a(EnumC3513q.BOOLEAN)) {
                                            i39 = 1;
                                            i38 = 1;
                                        }
                                        break;
                                    } else if (i39 != 0) {
                                        Iterator it8 = new ArrayList(c3515s3.f11445j).iterator();
                                        i19 = i35;
                                        while (it8.hasNext()) {
                                            C3514r c3514r7 = (C3514r) it8.next();
                                            AbstractC3506j abstractC3506j3 = c3514r7.f11419i;
                                            C3503g c3503g = AbstractC3506j.f11386c;
                                            if (abstractC3506j3 == c3503g || ((abstractC3506j3.mo7345w() && !(abstractC3506j3 instanceof C3503g)) || (c4320p2 = c3514r7.f11420j) == null || (enumC3400k = c4320p2.f14396k) == EnumC3400k.f10992v)) {
                                                list2 = list8;
                                                i21 = size5;
                                                i22 = i36;
                                                i23 = i37;
                                                it = it8;
                                                i24 = 1;
                                                i35 = 0;
                                            } else {
                                                C4305a c4305aM35S4 = AbstractC0000a.m35S(c4322r5, c4320p2, c4322r5.f14425z);
                                                if (c4305aM35S4 == null) {
                                                    list2 = list8;
                                                    i21 = size5;
                                                    i22 = i36;
                                                    i23 = i37;
                                                    it = it8;
                                                } else {
                                                    list2 = list8;
                                                    ArrayList arrayList4 = c4305aM35S4.f14351l;
                                                    i21 = size5;
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList4, c4320p2, i35);
                                                    if (iM10470a == -1) {
                                                        i22 = i36;
                                                        i23 = i37;
                                                        it = it8;
                                                        i35 = 0;
                                                    } else {
                                                        EnumC3400k enumC3400k4 = EnumC3400k.f10985o;
                                                        i22 = i36;
                                                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                                                        if (enumC3400k == enumC3400k4) {
                                                            C4146b c4146bM1115k = C0276d0.m1115k(c4320p2.f14397l, c3514r7.f11440m.f11444i.mo7374H(), (AbstractC3506j) ((C3399j) c4320p2).f10948o);
                                                            c4146bM1115k.m6231w(enumC2824a3);
                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4146bM1115k);
                                                            i23 = i37;
                                                            it = it8;
                                                            i35 = 1;
                                                        } else {
                                                            if (enumC3400k == EnumC3400k.f10980j) {
                                                                C3390a c3390a = (C3390a) c4320p2;
                                                                i23 = i37;
                                                                if (c3390a.f10928o == 8 && c3390a.f14398m.size() == 2) {
                                                                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                                                                    abstractC3508lMo7179S.getClass();
                                                                    if (abstractC3508lMo7179S instanceof C3510n) {
                                                                        it = it8;
                                                                        if (((C3510n) abstractC3508lMo7179S).f11422l == 1) {
                                                                            i24 = 1;
                                                                            C4320p c4320p4 = new C4320p(EnumC3400k.f10982l, 1);
                                                                            c4320p4.mo7178I(c3514r7.mo7374H());
                                                                            c4320p4.m6231w(enumC2824a3);
                                                                            AbstractC3506j abstractC3506jMo7375I = c3390a.f14397l.mo7375I();
                                                                            EnumC3513q enumC3513q3 = EnumC3513q.BOOLEAN;
                                                                            if (((abstractC3506jMo7375I instanceof C3503g) && ((C3503g) abstractC3506jMo7375I).f11372K == enumC3513q3) || (!abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7349a(enumC3513q3))) {
                                                                                c4320p4.m8688d0(c3390a.f14397l);
                                                                            } else {
                                                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p4);
                                                                                c3509mM7372Z.f11419i = c3503g;
                                                                                c4320p4 = C0276d0.m1115k(c3390a.f14397l, c3509mM7372Z, AbstractC3506j.f11385b);
                                                                                c4320p4.m6231w(enumC2824a3);
                                                                            }
                                                                            AbstractC0000a.m18J0(c4322r5, c4305aM35S4, iM10470a, c4320p4);
                                                                        }
                                                                        i35 = i24;
                                                                    }
                                                                    i24 = 1;
                                                                    C4146b c4146bM1115k222222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                                    c4146bM1115k222222222.m6231w(enumC2824a3);
                                                                    arrayList4.add(iM10470a, c4146bM1115k222222222);
                                                                    c4320p2.mo7181b0(c3514r7, c4146bM1115k222222222.f14397l.mo7374H());
                                                                    i35 = i24;
                                                                }
                                                            } else {
                                                                i23 = i37;
                                                            }
                                                            it = it8;
                                                            i24 = 1;
                                                            C4146b c4146bM1115k2222222222 = C0276d0.m1115k(c3514r7.m7393e0(c4322r5), c3514r7.f11440m.f11444i.mo7374H(), abstractC3506j3);
                                                            c4146bM1115k2222222222.m6231w(enumC2824a3);
                                                            arrayList4.add(iM10470a, c4146bM1115k2222222222);
                                                            c4320p2.mo7181b0(c3514r7, c4146bM1115k2222222222.f14397l.mo7374H());
                                                            i35 = i24;
                                                        }
                                                    }
                                                }
                                                i24 = 1;
                                            }
                                            if (i35 != 0) {
                                                i19 = i24;
                                            }
                                            list8 = list2;
                                            size5 = i21;
                                            i36 = i22;
                                            i37 = i23;
                                            it8 = it;
                                            i35 = 0;
                                        }
                                        list = list8;
                                        i20 = size5;
                                    }
                                }
                                i25 = i36;
                                i26 = i37;
                                i38 = 1;
                            }
                            i37 = i19 != 0 ? i38 : i26;
                            i36 = i25 + 1;
                            list8 = list;
                            size5 = i20;
                            i35 = 0;
                        }
                        break;
                    case 6:
                        C4322r c4322r6 = (C4322r) obj;
                        boolean z17 = false;
                        boolean z18 = false;
                        for (C3515s c3515s4 : c4322r6.f14404D) {
                            if (!((AbstractC3506j) c3515s4.f11447l.f10677h).mo7345w() && c3515s4.m7404i()) {
                                Iterator it9 = c3515s4.f11445j.iterator();
                                while (it9.hasNext()) {
                                    C4320p c4320p5 = ((C3514r) it9.next()).f11420j;
                                    if (c4320p5 != null && ((enumC3400k2 = c4320p5.f14396k) == EnumC3400k.f10955G || enumC3400k2 == EnumC3400k.f10956H)) {
                                        c3515s4.m7409n(c3515s4.m7400d());
                                        z18 = true;
                                    }
                                }
                            }
                        }
                        if (z18) {
                            this.f11457b.f11459g.m7441m(c4322r6);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                    case 7:
                        C4322r c4322r7 = (C4322r) obj;
                        C3520c c3520c2 = this.f11457b;
                        C3531n c3531n6 = c3520c2.f11459g;
                        Iterator it10 = c4322r7.f14425z.iterator();
                        boolean zM7423p = false;
                        int iM7417l = 0;
                        while (it10.hasNext()) {
                            C2965c0 c2965c0 = (C2965c0) ((C4305a) it10.next()).f9217g.mo6237c(C2825b.f9209x);
                            if (c2965c0 != null) {
                                for (C3406q c3406q2 : c2965c0.f9719g) {
                                    Iterator it11 = c3406q2.f14398m.iterator();
                                    AbstractC3506j abstractC3506j4 = null;
                                    AbstractC3506j abstractC3506j5 = null;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            AbstractC3506j abstractC3506jMo7375I2 = ((AbstractC3508l) it11.next()).mo7375I();
                                            if (abstractC3506j5 == null) {
                                                abstractC3506j5 = abstractC3506jMo7375I2;
                                            } else if (!abstractC3506j5.equals(abstractC3506jMo7375I2)) {
                                            }
                                        } else {
                                            abstractC3506j4 = abstractC3506j5;
                                        }
                                    }
                                    iM7417l += ((abstractC3506j4 == null || !abstractC3506j4.mo7345w()) && C3520c.m7417l(c4322r7, c3406q2, false) != 0) ? C3520c.m7417l(c4322r7, c3406q2, true) : 0;
                                }
                            }
                        }
                        if (iM7417l != 0) {
                            C0271b.m1087W(c4322r7);
                            c3531n6.m7440l(c4322r7);
                            c3531n6.m7441m(c4322r7);
                            zM7423p = C3520c.m7416k(c4322r7) ? true : c3520c2.m7423p(c4322r7);
                        }
                        return Boolean.valueOf(zM7423p);
                    default:
                        C4322r c4322r8 = (C4322r) obj;
                        boolean z19 = true;
                        for (C3515s c3515s5 : c4322r8.f14404D) {
                            if (!((AbstractC3506j) c3515s5.f11447l.f10677h).mo7345w() && !c3515s5.m7404i()) {
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                Iterator it12 = ((LinkedHashSet) c3515s5.f11447l.f10678i).iterator();
                                while (it12.hasNext()) {
                                    AbstractC3506j type3 = ((InterfaceC3521d) it12.next()).getType();
                                    if (type3.mo7345w() && type3.mo7351v()) {
                                        linkedHashSet2.add(type3);
                                    }
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    for (AbstractC3506j abstractC3506j6 : linkedHashSet2) {
                                        if (abstractC3506j6.mo7351v() && abstractC3506j6.m7364b()) {
                                            AbstractC3506j abstractC3506jM7360x = abstractC3506j6 instanceof C3499c ? AbstractC3506j.f11394k : AbstractC3506j.m7360x(abstractC3506j6.mo7350l());
                                            C3541x c3541x = this.f11457b.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r8, c3515s5, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                c4322r8.m6380I("Type inference failed for " + c3515s5.m7410o() + ". Raw type applied. Possible types: " + AbstractC5798s.m10516j(linkedHashSet2, ", "));
                                            }
                                        }
                                    }
                                }
                                z19 = false;
                            }
                        }
                        return Boolean.valueOf(z19);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        if (c4322r.f14415p || m7416k(c4322r)) {
            return;
        }
        try {
            Iterator it = this.f11461i.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((Function) it.next()).apply(c4322r)).booleanValue() && m7416k(c4322r)) {
                    return;
                }
            }
        } catch (Exception e6) {
            C5787h.m10468a(c4322r, "Types fix failed", e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m7421i(C4322r c4322r, C3515s c3515s) {
        Optional optionalM7422o = m7422o((LinkedHashSet) c3515s.f11447l.f10678i);
        if (!optionalM7422o.isPresent()) {
            return false;
        }
        AbstractC3506j abstractC3506j = (AbstractC3506j) optionalM7422o.get();
        C3541x c3541x = this.f11460h;
        c3541x.getClass();
        int iM7453c = c3541x.m7453c(c4322r, c3515s, abstractC3506j, C3517a0.f11451b);
        return iM7453c != 1 && iM7453c == 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final Optional m7422o(LinkedHashSet linkedHashSet) {
        return linkedHashSet.stream().map(new C2833a(9)).filter(new C0019b(11)).max(this.f11460h.f11519c.f11479b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7423p(C4322r c4322r) {
        boolean zM7421i;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        for (C3515s c3515s : c4322r.f14404D) {
            boolean zM7404i = c3515s.m7404i();
            C3315t c3315t = c3515s.f11447l;
            if (zM7404i) {
                z11 = false;
            } else {
                AbstractC3506j abstractC3506j = (AbstractC3506j) c3315t.f10677h;
                if (!abstractC3506j.mo7345w()) {
                    try {
                        zM7421i = m7421i(c4322r, c3515s);
                    } catch (C0083f e6) {
                        throw e6;
                    } catch (Exception e7) {
                        c4322r.m6384M("Failed to calculate best type for var: ".concat(String.valueOf(c3515s)), e7);
                        zM7421i = false;
                    }
                    if (!zM7421i) {
                        List<AbstractC3506j> listM7419n = m7419n(abstractC3506j, c3515s);
                        if (listM7419n.isEmpty()) {
                            z9 = false;
                            if (!z9) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Iterator it = ((LinkedHashSet) c3315t.f10678i).iterator();
                                while (it.hasNext()) {
                                    AbstractC3506j type = ((InterfaceC3521d) it.next()).getType();
                                    if (type.mo7345w() && type.mo7351v()) {
                                        linkedHashSet.add(type);
                                    }
                                }
                                if (linkedHashSet.isEmpty()) {
                                    z10 = false;
                                    if (!z10) {
                                    }
                                } else {
                                    C0910c c0910c = c4322r.f14411l.f14371k.f14453s;
                                    Iterator it2 = linkedHashSet.iterator();
                                    while (it2.hasNext()) {
                                        Iterator it3 = c0910c.m2215d(((AbstractC3506j) it2.next()).mo7350l()).iterator();
                                        while (it3.hasNext()) {
                                            AbstractC3506j abstractC3506jM7360x = AbstractC3506j.m7360x((String) it3.next());
                                            C3541x c3541x = this.f11460h;
                                            c3541x.getClass();
                                            if (c3541x.m7453c(c4322r, c3515s, abstractC3506jM7360x, C3517a0.f11452c) == 3) {
                                                z10 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z10 = false;
                                    if (!z10) {
                                    }
                                }
                            }
                        } else {
                            for (AbstractC3506j abstractC3506j2 : listM7419n) {
                                C3541x c3541x2 = this.f11460h;
                                c3541x2.getClass();
                                if (c3541x2.m7453c(c4322r, c3515s, abstractC3506j2, C3517a0.f11451b) == 3) {
                                    z9 = true;
                                    break;
                                }
                            }
                            z9 = false;
                            if (!z9) {
                            }
                        }
                    }
                    z11 = true;
                }
            }
            if (z11) {
                z12 = true;
            }
        }
        return z12;
    }
}
