package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: yt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0935yt extends xs1 {

    /* JADX INFO: renamed from: l */
    public final n30 f13611l;

    /* JADX INFO: renamed from: m */
    public final kj1 f13612m;

    /* JADX INFO: renamed from: n */
    public C0894xp f13613n;

    /* JADX INFO: renamed from: o */
    public final boolean f13614o;

    /* JADX INFO: renamed from: p */
    public final d63 f13615p;

    public C0935yt(n30 n30Var, kj1 kj1Var, boolean z, d63 d63Var) {
        super(4, -1);
        if (n30Var == null) {
            um2.m5516f("ref == null");
            throw null;
        }
        if (kj1Var == null) {
            um2.m5516f("code == null");
            throw null;
        }
        if (d63Var == null) {
            um2.m5516f("throwsList == null");
            throw null;
        }
        this.f13611l = n30Var;
        this.f13612m = kj1Var;
        this.f13614o = z;
        this.f13615p = d63Var;
        this.f13613n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        Object obj = z70Var.f13756g;
        b42 b42Var = (b42) z70Var.f13758i;
        kj1 kj1Var = this.f13612m;
        kj1Var.getClass();
        ((sd0) kj1Var.f5594i).getClass();
        C0058bk c0058bk = (C0058bk) ((C0043b5) ((vu2) kj1Var.f5595j).f12178a).f562i;
        int length = c0058bk.f5590i.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (((kj0) ((C0964zj) c0058bk.m2693e(i)).f13926b.m2426h().mo2240e()).f5590i.length != 0) {
                vu2 vu2Var = (vu2) kj1Var.f5595j;
                vu2Var.getClass();
                HashSet hashSet = new HashSet(20);
                C0058bk c0058bk2 = (C0058bk) ((C0043b5) vu2Var.f12178a).f562i;
                int length2 = c0058bk2.f5590i.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    d63 d63VarMo2240e = ((C0964zj) c0058bk2.m2693e(i2)).f13926b.m2426h().mo2240e();
                    int length3 = ((kj0) d63VarMo2240e).f5590i.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        hashSet.add(d63VarMo2240e.getType(i3));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    b42Var.m405q((o43) it.next());
                }
                this.f13613n = new C0894xp(kj1Var);
            } else {
                i++;
            }
        }
        sd0 sd0Var = (sd0) kj1Var.f5594i;
        sd0Var.getClass();
        HashSet hashSet2 = new HashSet(20);
        for (a40 a40Var : (ArrayList) sd0Var.f10059f) {
            if (a40Var instanceof f30) {
                hashSet2.add(((f30) a40Var).f2751e);
            } else if (a40Var instanceof gc1) {
                throw null;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            z70Var.m6385a((AbstractC0147dz) it2.next());
        }
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_CODE_ITEM;
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: i */
    public final void mo4438i(eh1 eh1Var, int i) {
        TreeMap treeMap;
        int iM3242t;
        z70 z70Var = eh1Var.f5108b;
        C0485n4 c0485n4 = new C0485n4(4, z70Var);
        kj1 kj1Var = this.f13612m;
        for (a40 a40Var : (ArrayList) ((sd0) kj1Var.f5594i).f10059f) {
            if (a40Var instanceof f30) {
                f30 f30Var = (f30) a40Var;
                AbstractC0147dz abstractC0147dz = f30Var.f2751e;
                int iM3242t2 = c0485n4.m3242t(abstractC0147dz);
                if (iM3242t2 >= 0) {
                    f30Var.m1503o(iM3242t2);
                }
                if ((abstractC0147dz instanceof m30) && (iM3242t = c0485n4.m3242t(((m30) abstractC0147dz).f6455h)) >= 0) {
                    f30Var.m1502n(iM3242t);
                }
            }
        }
        C0894xp c0894xp = this.f13613n;
        int length = 0;
        if (c0894xp != null) {
            c0894xp.m6164a();
            b42 b42Var = (b42) z70Var.f13758i;
            int length2 = c0894xp.f13094b.f5590i.length;
            c0894xp.f13097e = new TreeMap();
            int i2 = 0;
            while (true) {
                treeMap = c0894xp.f13097e;
                if (i2 >= length2) {
                    break;
                }
                treeMap.put(((C0931yp) c0894xp.f13094b.m2693e(i2)).f13550j, null);
                i2++;
            }
            if (treeMap.size() > 65535) {
                c80.m676t("too many catch handlers");
                return;
            }
            C0929yn c0929yn = new C0929yn();
            c0894xp.f13096d = c0929yn.m6301m(c0894xp.f13097e.size());
            for (Map.Entry entry : c0894xp.f13097e.entrySet()) {
                C0855wp c0855wp = (C0855wp) entry.getKey();
                Object[] objArr = c0855wp.f5590i;
                int length3 = objArr.length;
                int length4 = objArr.length;
                boolean zEquals = length4 == 0 ? false : ((C0818vp) c0855wp.m2693e(length4 - 1)).f12096h.equals(r30.f9339k);
                entry.setValue(Integer.valueOf(c0929yn.f13526c));
                if (zEquals) {
                    c0929yn.m6300l(-(length3 - 1));
                    length3--;
                } else {
                    c0929yn.m6300l(length3);
                }
                for (int i3 = 0; i3 < length3; i3++) {
                    C0818vp c0818vp = (C0818vp) c0855wp.m2693e(i3);
                    c0929yn.m6301m(b42Var.m401m(c0818vp.f12096h));
                    c0929yn.m6301m(c0818vp.f12097i);
                }
                if (zEquals) {
                    c0929yn.m6301m(((C0818vp) c0855wp.m2693e(length3)).f12097i);
                }
            }
            int i4 = c0929yn.f13526c;
            byte[] bArr = new byte[i4];
            System.arraycopy(c0929yn.f13525b, 0, bArr, 0, i4);
            c0894xp.f13095c = bArr;
            C0894xp c0894xp2 = this.f13613n;
            c0894xp2.m6164a();
            length = (c0894xp2.f13094b.f5590i.length * 8) + c0894xp2.f13095c.length;
        }
        kj1Var.m2713v();
        int iM395h = ((b40) kj1Var.f5597l).m395h();
        if ((iM395h & 1) != 0) {
            iM395h++;
        }
        m6180j((iM395h * 2) + 16 + length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.xs1
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1532k(z70 z70Var, C0929yn c0929yn) {
        int length;
        boolean z;
        int i;
        String string;
        boolean zM6293d = c0929yn.m6293d();
        kj1 kj1Var = this.f13612m;
        kj1Var.m2713v();
        int i2 = ((b40) kj1Var.f5597l).f551j;
        kj1Var.m2713v();
        b40 b40Var = (b40) kj1Var.f5597l;
        int length2 = b40Var.f5590i.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            a40 a40Var = (a40) b40Var.m2693e(i4);
            if (a40Var instanceof f30) {
                AbstractC0147dz abstractC0147dz = ((f30) a40Var).f2751e;
                int iM3232g = abstractC0147dz instanceof n30 ? ((n30) abstractC0147dz).m3232g(a40Var.f46b.f7599b == 113) : 0;
                if (iM3232g > i5) {
                    i5 = iM3232g;
                }
            }
            i4++;
        }
        boolean z2 = this.f13614o;
        n30 n30Var = this.f13611l;
        int iM3232g2 = n30Var.m3232g(z2);
        kj1Var.m2713v();
        int iM395h = ((b40) kj1Var.f5597l).m395h();
        boolean z3 = (iM395h & 1) != 0;
        C0894xp c0894xp = this.f13613n;
        if (c0894xp == null) {
            length = 0;
        } else {
            c0894xp.m6164a();
            length = c0894xp.f13094b.f5590i.length;
        }
        if (zM6293d) {
            c0929yn.m6292c(m6178g() + ' ' + n30Var.mo23b(), 0);
            c0929yn.m6292c("  registers_size: ".concat(pp0.m3898J(i2)), 2);
            c0929yn.m6292c("  ins_size:       ".concat(pp0.m3898J(iM3232g2)), 2);
            c0929yn.m6292c("  outs_size:      ".concat(pp0.m3898J(i5)), 2);
            c0929yn.m6292c("  tries_size:     ".concat(pp0.m3898J(length)), 2);
            c0929yn.m6292c("  debug_off:      ".concat(pp0.m3899K(0)), 4);
            c0929yn.m6292c("  insns_size:     ".concat(pp0.m3899K(iM395h)), 4);
            d63 d63Var = this.f13615p;
            kj0 kj0Var = (kj0) d63Var;
            if (kj0Var.f5590i.length != 0) {
                StringBuilder sb = new StringBuilder("  throws ");
                int length3 = kj0Var.f5590i.length;
                if (length3 == 0) {
                    string = "<empty>";
                    z = zM6293d;
                } else {
                    StringBuilder sb2 = new StringBuilder(100);
                    int i6 = 0;
                    while (i6 < length3) {
                        boolean z4 = zM6293d;
                        if (i6 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(d63Var.getType(i6).mo23b());
                        i6++;
                        zM6293d = z4;
                    }
                    z = zM6293d;
                    string = sb2.toString();
                }
                sb.append(string);
                i3 = 0;
                c0929yn.m6292c(sb.toString(), 0);
            } else {
                z = zM6293d;
            }
        }
        c0929yn.m6299k(i2);
        c0929yn.m6299k(iM3232g2);
        c0929yn.m6299k(i5);
        c0929yn.m6299k(length);
        c0929yn.m6298j(i3);
        c0929yn.m6298j(iM395h);
        kj1Var.m2713v();
        try {
            ((b40) kj1Var.f5597l).m396i(c0929yn);
            if (this.f13613n != null) {
                if (z3) {
                    if (z) {
                        c0929yn.m6292c("  padding: 0", 2);
                    }
                    c0929yn.m6299k(0);
                }
                C0894xp c0894xp2 = this.f13613n;
                c0894xp2.m6164a();
                if (c0929yn.m6293d()) {
                    c0894xp2.m6164a();
                    int length4 = c0894xp2.f13094b.f5590i.length;
                    c0929yn.m6292c("  tries:", 0);
                    for (int i7 = 0; i7 < length4; i7++) {
                        C0931yp c0931yp = (C0931yp) c0894xp2.f13094b.m2693e(i7);
                        C0855wp c0855wp = c0931yp.f13550j;
                        StringBuilder sb3 = new StringBuilder("    try ");
                        int i8 = c0931yp.f13548h;
                        sb3.append(i8 == ((char) i8) ? pp0.m3898J(i8) : pp0.m3899K(i8));
                        sb3.append("..");
                        int i9 = c0931yp.f13549i;
                        sb3.append(i9 == ((char) i9) ? pp0.m3898J(i9) : pp0.m3899K(i9));
                        String string2 = sb3.toString();
                        String strM5949i = c0855wp.m5949i("    ", "");
                        c0929yn.m6292c(string2, 6);
                        c0929yn.m6292c(strM5949i, 2);
                    }
                    i = 0;
                    c0929yn.m6292c("  handlers:", 0);
                    c0929yn.m6292c("    size: ".concat(pp0.m3898J(c0894xp2.f13097e.size())), c0894xp2.f13096d);
                    C0855wp c0855wp2 = null;
                    int i10 = 0;
                    for (Map.Entry entry : c0894xp2.f13097e.entrySet()) {
                        C0855wp c0855wp3 = (C0855wp) entry.getKey();
                        int iIntValue = ((Integer) entry.getValue()).intValue();
                        if (c0855wp2 != null) {
                            c0929yn.m6292c(c0855wp2.m5949i("    ", pp0.m3898J(i10).concat(": ")), iIntValue - i10);
                        }
                        i10 = iIntValue;
                        c0855wp2 = c0855wp3;
                    }
                    c0929yn.m6292c(c0855wp2.m5949i("    ", pp0.m3898J(i10).concat(": ")), c0894xp2.f13095c.length - i10);
                } else {
                    i = 0;
                }
                int length5 = c0894xp2.f13094b.f5590i.length;
                while (i < length5) {
                    C0931yp c0931yp2 = (C0931yp) c0894xp2.f13094b.m2693e(i);
                    int i11 = c0931yp2.f13548h;
                    int i12 = c0931yp2.f13549i;
                    int i13 = i12 - i11;
                    if (i13 >= 65536) {
                        throw new UnsupportedOperationException("bogus exception range: " + pp0.m3899K(i11) + ".." + pp0.m3899K(i12));
                    }
                    c0929yn.m6298j(i11);
                    c0929yn.m6299k(i13);
                    c0929yn.m6299k(((Integer) c0894xp2.f13097e.get(c0931yp2.f13550j)).intValue());
                    i++;
                }
                c0929yn.m6296h(c0894xp2.f13095c);
            }
        } catch (RuntimeException e) {
            throw sg0.m4862a(e, "...while writing instructions for ".concat(n30Var.mo23b()));
        }
    }

    public final String toString() {
        return "CodeItem{" + this.f13611l.mo23b() + "}";
    }
}
