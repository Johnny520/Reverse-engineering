package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10054a;

    /* JADX INFO: renamed from: b */
    public int f10055b;

    /* JADX INFO: renamed from: c */
    public int f10056c;

    /* JADX INFO: renamed from: d */
    public int f10057d;

    /* JADX INFO: renamed from: e */
    public int f10058e;

    /* JADX INFO: renamed from: f */
    public Object f10059f;

    public sd0(C0690sd c0690sd, long j) {
        this.f10054a = 0;
        String str = c0690sd.f10051i;
        sx1 sx1Var = new sx1();
        sx1Var.f10411d = str;
        sx1Var.f10409b = -1;
        sx1Var.f10410c = -1;
        this.f10059f = sx1Var;
        this.f10055b = f13.m1497f(j);
        this.f10056c = f13.m1496e(j);
        this.f10057d = -1;
        this.f10058e = -1;
        int iM1497f = f13.m1497f(j);
        int iM1496e = f13.m1496e(j);
        if (iM1497f < 0 || iM1497f > str.length()) {
            c80.m673q(vi0.m5695n(iM1497f, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iM1496e < 0 || iM1496e > str.length()) {
            c80.m673q(vi0.m5695n(iM1496e, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iM1497f <= iM1496e) {
            return;
        }
        C0676s.m4651j(vi0.m5689h("Do not set reversed range: ", iM1497f, " > ", iM1496e));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void m4795a(a40 a40Var) {
        ((ArrayList) this.f10059f).add(a40Var);
        a40Var.f47c.getClass();
        if (a40Var instanceof gc1) {
            throw null;
        }
    }

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
    /* JADX INFO: renamed from: b */
    public void m4796b() {
        int iM5598f;
        int size = ((ArrayList) this.f10059f).size();
        int i = this.f10055b + this.f10056c + this.f10057d;
        int i2 = i - this.f10058e;
        C0133dk c0133dk = new C0133dk(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c0133dk.m1035f(i3, i3 + 1);
            } else {
                c0133dk.m1035f(i3, i3);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            a40 a40Var = (a40) ((ArrayList) this.f10059f).get(i4);
            if (!(a40Var instanceof C0898xt)) {
                ArrayList arrayList = (ArrayList) this.f10059f;
                s72 s72Var = a40Var.f48d;
                int length = s72Var.f5590i.length;
                s72 s72Var2 = new s72(length);
                for (int i5 = 0; i5 < length; i5++) {
                    r72 r72VarM4399e = (r72) s72Var.m2693e(i5);
                    r72 r72Var = null;
                    if (r72VarM4399e != null) {
                        try {
                            iM5598f = ((v01) c0133dk.f2082j).m5598f(r72VarM4399e.f9419h);
                        } catch (IndexOutOfBoundsException unused) {
                            iM5598f = -1;
                        }
                        if (iM5598f >= 0) {
                            if (r72VarM4399e.f9419h != iM5598f) {
                                r72VarM4399e = r72.m4399e(iM5598f, r72VarM4399e.f9420i);
                            }
                            r72Var = r72VarM4399e;
                        } else {
                            c80.m667j("no mapping specified for register");
                        }
                    }
                    s72Var2.m2694f(i5, r72Var);
                }
                s72Var2.f11990h = false;
                if (!s72Var2.equals(s72Var)) {
                    s72Var = s72Var2;
                }
                arrayList.set(i4, a40Var.mo66k(s72Var));
            }
        }
        this.f10057d++;
    }

    /* JADX INFO: renamed from: c */
    public void m4797c() {
        int size = ((ArrayList) this.f10059f).size();
        for (int i = 0; i < size; i++) {
            a40 a40Var = (a40) ((ArrayList) this.f10059f).get(i);
            if (!(a40Var instanceof C0898xt)) {
                ((ArrayList) this.f10059f).set(i, a40Var.mo65j(1));
            }
        }
        this.f10056c++;
    }

    /* JADX INFO: renamed from: d */
    public void m4798d(int i, int i2) {
        long jM1636i = fg1.m1636i(i, i2);
        ((sx1) this.f10059f).m5018k("", i, i2);
        long jM4959p0 = sp0.m4959p0(fg1.m1636i(this.f10055b, this.f10056c), jM1636i);
        m4808n(f13.m1497f(jM4959p0));
        m4807m(f13.m1496e(jM4959p0));
        int i3 = this.f10057d;
        if (i3 != -1) {
            long jM4959p02 = sp0.m4959p0(fg1.m1636i(i3, this.f10058e), jM1636i);
            if (f13.m1494c(jM4959p02)) {
                this.f10057d = -1;
                this.f10058e = -1;
            } else {
                this.f10057d = f13.m1497f(jM4959p02);
                this.f10058e = f13.m1496e(jM4959p02);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public oa0 m4799e(a40 a40Var) {
        s72 s72Var = a40Var.f48d;
        oa0 oa0Var = a40Var.f46b;
        oa0 oa0VarM4800f = m4800f(a40Var.mo66k(s72Var.m4748j(oa0Var.f7602e, null)), oa0Var);
        if (oa0VarM4800f != null) {
            return oa0VarM4800f;
        }
        throw new x70(null, "No expanded opcode for " + a40Var);
    }

    /* JADX INFO: renamed from: f */
    public oa0 m4800f(a40 a40Var, oa0 oa0Var) {
        oa0 oa0Var2;
        while (oa0Var != null) {
            if (oa0Var.f7601d.mo3316J(a40Var)) {
                return oa0Var;
            }
            oa0[] oa0VarArr = pa0.f8141a;
            int i = oa0Var.f7600c;
            if (i == -1) {
                oa0Var = null;
            } else {
                try {
                    oa0Var2 = pa0.f8141a[i + 1];
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (oa0Var2 == null) {
                    C0676s.m4651j("bogus opcode");
                    return null;
                }
                oa0Var = oa0Var2;
            }
        }
        return oa0Var;
    }

    /* JADX INFO: renamed from: g */
    public char m4801g(int i) {
        sx1 sx1Var = (sx1) this.f10059f;
        bo0 bo0Var = (bo0) sx1Var.f10412e;
        if (bo0Var == null) {
            return ((String) sx1Var.f10411d).charAt(i);
        }
        if (i < sx1Var.f10409b) {
            return ((String) sx1Var.f10411d).charAt(i);
        }
        int iM577b = bo0Var.f957b - bo0Var.m577b();
        int i2 = sx1Var.f10409b;
        if (i >= iM577b + i2) {
            return ((String) sx1Var.f10411d).charAt(i - ((iM577b - sx1Var.f10410c) + i2));
        }
        int i3 = i - i2;
        int i4 = bo0Var.f958c;
        char[] cArr = (char[]) bo0Var.f960e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + bo0Var.f959d];
    }

    /* JADX INFO: renamed from: h */
    public f13 m4802h() {
        int i = this.f10057d;
        if (i != -1) {
            return new f13(fg1.m1636i(i, this.f10058e));
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m4803i(String str, int i, int i2) {
        sx1 sx1Var = (sx1) this.f10059f;
        if (i < 0 || i > sx1Var.m5009b()) {
            c80.m673q(vi0.m5695n(i, "start (", ") offset is outside of text region "), sx1Var.m5009b());
            return;
        }
        if (i2 < 0 || i2 > sx1Var.m5009b()) {
            c80.m673q(vi0.m5695n(i2, "end (", ") offset is outside of text region "), sx1Var.m5009b());
            return;
        }
        if (i > i2) {
            C0676s.m4651j(vi0.m5689h("Do not set reversed range: ", i, " > ", i2));
            return;
        }
        sx1Var.m5018k(str, i, i2);
        m4808n(str.length() + i);
        m4807m(str.length() + i);
        this.f10057d = -1;
        this.f10058e = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [kj0, s72] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.BitSet] */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
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
    /* JADX INFO: renamed from: j */
    public boolean m4804j(oa0[] oa0VarArr) {
        int i = this.f10056c;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = ((ArrayList) this.f10059f).size();
            int i2 = this.f10056c;
            for (int i3 = 0; i3 < size; i3++) {
                a40 a40Var = (a40) ((ArrayList) this.f10059f).get(i3);
                oa0 oa0Var = oa0VarArr[i3];
                oa0 oa0VarM4800f = m4800f(a40Var, oa0Var);
                if (oa0VarM4800f == null) {
                    ?? Mo3320x = m4799e(a40Var).f7601d.mo3320x(a40Var);
                    boolean z2 = a40Var.f46b.f7602e;
                    ?? r6 = a40Var.f48d;
                    int length = r6.f5590i.length;
                    int iM4400d = (!z2 || Mo3320x.get(0)) ? 0 : ((r72) r6.m2693e(0)).m4400d();
                    int iM4400d2 = 0;
                    for (?? r9 = z2; r9 < length; r9++) {
                        if (!Mo3320x.get(r9)) {
                            iM4400d2 += ((r72) r6.m2693e(r9)).m4400d();
                        }
                    }
                    int iMax = Math.max(iM4400d2, iM4400d);
                    if (iMax > i2) {
                        i2 = iMax;
                    }
                } else {
                    if (oa0Var == oa0VarM4800f) {
                    }
                }
                oa0VarArr[i3] = oa0VarM4800f;
            }
            if (i >= i2) {
                this.f10056c = i;
                return z;
            }
            int i4 = i2 - i;
            int size2 = ((ArrayList) this.f10059f).size();
            for (int i5 = 0; i5 < size2; i5++) {
                a40 a40Var2 = (a40) ((ArrayList) this.f10059f).get(i5);
                if (!(a40Var2 instanceof C0898xt)) {
                    ((ArrayList) this.f10059f).set(i5, a40Var2.mo65j(i4));
                }
            }
            z = true;
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4805k(int i, int i2) {
        sx1 sx1Var = (sx1) this.f10059f;
        if (i < 0 || i > sx1Var.m5009b()) {
            c80.m673q(vi0.m5695n(i, "start (", ") offset is outside of text region "), sx1Var.m5009b());
            return;
        }
        if (i2 < 0 || i2 > sx1Var.m5009b()) {
            c80.m673q(vi0.m5695n(i2, "end (", ") offset is outside of text region "), sx1Var.m5009b());
        } else if (i >= i2) {
            C0676s.m4651j(vi0.m5689h("Do not set reversed or empty range: ", i, " > ", i2));
        } else {
            this.f10057d = i;
            this.f10058e = i2;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m4806l(int i, int i2) {
        sx1 sx1Var = (sx1) this.f10059f;
        if (i < 0 || i > sx1Var.m5009b()) {
            c80.m673q(vi0.m5695n(i, "start (", ") offset is outside of text region "), sx1Var.m5009b());
            return;
        }
        if (i2 < 0 || i2 > sx1Var.m5009b()) {
            c80.m673q(vi0.m5695n(i2, "end (", ") offset is outside of text region "), sx1Var.m5009b());
        } else if (i > i2) {
            C0676s.m4651j(vi0.m5689h("Do not set reversed range: ", i, " > ", i2));
        } else {
            m4808n(i);
            m4807m(i2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4807m(int i) {
        if (!(i >= 0)) {
            lz0.m2988a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f10056c = i;
    }

    /* JADX INFO: renamed from: n */
    public void m4808n(int i) {
        if (!(i >= 0)) {
            lz0.m2988a("Cannot set selectionStart to a negative value: " + i);
        }
        this.f10055b = i;
    }

    public String toString() {
        switch (this.f10054a) {
            case 0:
                return ((sx1) this.f10059f).toString();
            default:
                return super.toString();
        }
    }

    public sd0(C0953z8 c0953z8, int i, int i2, int i3) {
        this.f10054a = 1;
        this.f10055b = i2;
        this.f10059f = new ArrayList(i);
        this.f10056c = -1;
        this.f10058e = i3;
    }
}
