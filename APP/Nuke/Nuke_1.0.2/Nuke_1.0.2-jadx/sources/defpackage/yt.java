package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yt extends xs1 {
    public final n30 l;
    public final kj1 m;
    public xp n;
    public final boolean o;
    public final d63 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yt(n30 n30Var, kj1 kj1Var, boolean z, d63 d63Var) {
        super(4, -1);
        if (n30Var == null) {
            um2.f("ref == null");
            throw null;
        }
        if (kj1Var == null) {
            um2.f("code == null");
            throw null;
        }
        if (d63Var == null) {
            um2.f("throwsList == null");
            throw null;
        }
        this.l = n30Var;
        this.m = kj1Var;
        this.o = z;
        this.p = d63Var;
        this.n = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: d63 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        Object obj = z70Var.g;
        b42 b42Var = (b42) z70Var.i;
        kj1 kj1Var = this.m;
        kj1Var.getClass();
        ((sd0) kj1Var.i).getClass();
        bk bkVar = (bk) ((b5) ((vu2) kj1Var.j).a).i;
        int length = bkVar.i.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (((kj0) ((zj) bkVar.e(i)).b.h().e()).i.length != 0) {
                vu2 vu2Var = (vu2) kj1Var.j;
                vu2Var.getClass();
                HashSet hashSet = new HashSet(20);
                bk bkVar2 = (bk) ((b5) vu2Var.a).i;
                int length2 = bkVar2.i.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    d63 d63VarE = ((zj) bkVar2.e(i2)).b.h().e();
                    int length3 = ((kj0) d63VarE).i.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        hashSet.add(d63VarE.getType(i3));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    b42Var.q((o43) it.next());
                }
                this.n = new xp(kj1Var);
            } else {
                i++;
            }
        }
        sd0 sd0Var = (sd0) kj1Var.i;
        sd0Var.getClass();
        HashSet hashSet2 = new HashSet(20);
        for (a40 a40Var : (ArrayList) sd0Var.f) {
            if (a40Var instanceof f30) {
                hashSet2.add(((f30) a40Var).e);
            } else if (a40Var instanceof gc1) {
                throw null;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            z70Var.a((dz) it2.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_CODE_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void i(eh1 eh1Var, int i) {
        TreeMap treeMap;
        int iT;
        z70 z70Var = eh1Var.b;
        n4 n4Var = new n4(4, z70Var);
        kj1 kj1Var = this.m;
        for (a40 a40Var : (ArrayList) ((sd0) kj1Var.i).f) {
            if (a40Var instanceof f30) {
                f30 f30Var = (f30) a40Var;
                dz dzVar = f30Var.e;
                int iT2 = n4Var.t(dzVar);
                if (iT2 >= 0) {
                    f30Var.o(iT2);
                }
                if ((dzVar instanceof m30) && (iT = n4Var.t(((m30) dzVar).h)) >= 0) {
                    f30Var.n(iT);
                }
            }
        }
        xp xpVar = this.n;
        int length = 0;
        if (xpVar != null) {
            xpVar.a();
            b42 b42Var = (b42) z70Var.i;
            int length2 = xpVar.b.i.length;
            xpVar.e = new TreeMap();
            int i2 = 0;
            while (true) {
                treeMap = xpVar.e;
                if (i2 >= length2) {
                    break;
                }
                treeMap.put(((yp) xpVar.b.e(i2)).j, null);
                i2++;
            }
            if (treeMap.size() > 65535) {
                c80.t("too many catch handlers");
                return;
            }
            yn ynVar = new yn();
            xpVar.d = ynVar.m(xpVar.e.size());
            for (Map.Entry entry : xpVar.e.entrySet()) {
                wp wpVar = (wp) entry.getKey();
                Object[] objArr = wpVar.i;
                int length3 = objArr.length;
                int length4 = objArr.length;
                boolean zEquals = length4 == 0 ? false : ((vp) wpVar.e(length4 - 1)).h.equals(r30.k);
                entry.setValue(Integer.valueOf(ynVar.c));
                if (zEquals) {
                    ynVar.l(-(length3 - 1));
                    length3--;
                } else {
                    ynVar.l(length3);
                }
                for (int i3 = 0; i3 < length3; i3++) {
                    vp vpVar = (vp) wpVar.e(i3);
                    ynVar.m(b42Var.m(vpVar.h));
                    ynVar.m(vpVar.i);
                }
                if (zEquals) {
                    ynVar.m(((vp) wpVar.e(length3)).i);
                }
            }
            int i4 = ynVar.c;
            byte[] bArr = new byte[i4];
            System.arraycopy(ynVar.b, 0, bArr, 0, i4);
            xpVar.c = bArr;
            xp xpVar2 = this.n;
            xpVar2.a();
            length = (xpVar2.b.i.length * 8) + xpVar2.c.length;
        }
        kj1Var.v();
        int iH = ((b40) kj1Var.l).h();
        if ((iH & 1) != 0) {
            iH++;
        }
        j((iH * 2) + 16 + length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v14, resolved type: d63 */
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
    @Override // defpackage.xs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(z70 z70Var, yn ynVar) {
        int length;
        boolean z;
        int i;
        String string;
        boolean zD = ynVar.d();
        kj1 kj1Var = this.m;
        kj1Var.v();
        int i2 = ((b40) kj1Var.l).j;
        kj1Var.v();
        b40 b40Var = (b40) kj1Var.l;
        int length2 = b40Var.i.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            a40 a40Var = (a40) b40Var.e(i4);
            if (a40Var instanceof f30) {
                dz dzVar = ((f30) a40Var).e;
                int iG = dzVar instanceof n30 ? ((n30) dzVar).g(a40Var.b.b == 113) : 0;
                if (iG > i5) {
                    i5 = iG;
                }
            }
            i4++;
        }
        boolean z2 = this.o;
        n30 n30Var = this.l;
        int iG2 = n30Var.g(z2);
        kj1Var.v();
        int iH = ((b40) kj1Var.l).h();
        boolean z3 = (iH & 1) != 0;
        xp xpVar = this.n;
        if (xpVar == null) {
            length = 0;
        } else {
            xpVar.a();
            length = xpVar.b.i.length;
        }
        if (zD) {
            ynVar.c(g() + ' ' + n30Var.b(), 0);
            ynVar.c("  registers_size: ".concat(pp0.J(i2)), 2);
            ynVar.c("  ins_size:       ".concat(pp0.J(iG2)), 2);
            ynVar.c("  outs_size:      ".concat(pp0.J(i5)), 2);
            ynVar.c("  tries_size:     ".concat(pp0.J(length)), 2);
            ynVar.c("  debug_off:      ".concat(pp0.K(0)), 4);
            ynVar.c("  insns_size:     ".concat(pp0.K(iH)), 4);
            d63 d63Var = this.p;
            kj0 kj0Var = (kj0) d63Var;
            if (kj0Var.i.length != 0) {
                StringBuilder sb = new StringBuilder("  throws ");
                int length3 = kj0Var.i.length;
                if (length3 == 0) {
                    string = "<empty>";
                    z = zD;
                } else {
                    StringBuilder sb2 = new StringBuilder(100);
                    int i6 = 0;
                    while (i6 < length3) {
                        boolean z4 = zD;
                        if (i6 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(d63Var.getType(i6).b());
                        i6++;
                        zD = z4;
                    }
                    z = zD;
                    string = sb2.toString();
                }
                sb.append(string);
                i3 = 0;
                ynVar.c(sb.toString(), 0);
            } else {
                z = zD;
            }
        }
        ynVar.k(i2);
        ynVar.k(iG2);
        ynVar.k(i5);
        ynVar.k(length);
        ynVar.j(i3);
        ynVar.j(iH);
        kj1Var.v();
        try {
            ((b40) kj1Var.l).i(ynVar);
            if (this.n != null) {
                if (z3) {
                    if (z) {
                        ynVar.c("  padding: 0", 2);
                    }
                    ynVar.k(0);
                }
                xp xpVar2 = this.n;
                xpVar2.a();
                if (ynVar.d()) {
                    xpVar2.a();
                    int length4 = xpVar2.b.i.length;
                    ynVar.c("  tries:", 0);
                    for (int i7 = 0; i7 < length4; i7++) {
                        yp ypVar = (yp) xpVar2.b.e(i7);
                        wp wpVar = ypVar.j;
                        StringBuilder sb3 = new StringBuilder("    try ");
                        int i8 = ypVar.h;
                        sb3.append(i8 == ((char) i8) ? pp0.J(i8) : pp0.K(i8));
                        sb3.append("..");
                        int i9 = ypVar.i;
                        sb3.append(i9 == ((char) i9) ? pp0.J(i9) : pp0.K(i9));
                        String string2 = sb3.toString();
                        String strI = wpVar.i("    ", "");
                        ynVar.c(string2, 6);
                        ynVar.c(strI, 2);
                    }
                    i = 0;
                    ynVar.c("  handlers:", 0);
                    ynVar.c("    size: ".concat(pp0.J(xpVar2.e.size())), xpVar2.d);
                    wp wpVar2 = null;
                    int i10 = 0;
                    for (Map.Entry entry : xpVar2.e.entrySet()) {
                        wp wpVar3 = (wp) entry.getKey();
                        int iIntValue = ((Integer) entry.getValue()).intValue();
                        if (wpVar2 != null) {
                            ynVar.c(wpVar2.i("    ", pp0.J(i10).concat(": ")), iIntValue - i10);
                        }
                        i10 = iIntValue;
                        wpVar2 = wpVar3;
                    }
                    ynVar.c(wpVar2.i("    ", pp0.J(i10).concat(": ")), xpVar2.c.length - i10);
                } else {
                    i = 0;
                }
                int length5 = xpVar2.b.i.length;
                while (i < length5) {
                    yp ypVar2 = (yp) xpVar2.b.e(i);
                    int i11 = ypVar2.h;
                    int i12 = ypVar2.i;
                    int i13 = i12 - i11;
                    if (i13 >= 65536) {
                        throw new UnsupportedOperationException("bogus exception range: " + pp0.K(i11) + ".." + pp0.K(i12));
                    }
                    ynVar.j(i11);
                    ynVar.k(i13);
                    ynVar.k(((Integer) xpVar2.e.get(ypVar2.j)).intValue());
                    i++;
                }
                ynVar.h(xpVar2.c);
            }
        } catch (RuntimeException e) {
            throw sg0.a(e, "...while writing instructions for ".concat(n30Var.b()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CodeItem{" + this.l.b() + "}";
    }
}
