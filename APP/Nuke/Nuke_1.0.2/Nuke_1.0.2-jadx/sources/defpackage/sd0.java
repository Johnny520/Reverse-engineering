package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sd0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sd0(sd sdVar, long j) {
        this.a = 0;
        String str = sdVar.i;
        sx1 sx1Var = new sx1();
        sx1Var.d = str;
        sx1Var.b = -1;
        sx1Var.c = -1;
        this.f = sx1Var;
        this.b = f13.f(j);
        this.c = f13.e(j);
        this.d = -1;
        this.e = -1;
        int iF = f13.f(j);
        int iE = f13.e(j);
        if (iF < 0 || iF > str.length()) {
            c80.q(vi0.n(iF, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            c80.q(vi0.n(iE, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        s.j(vi0.h("Do not set reversed range: ", iF, " > ", iE));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(a40 a40Var) {
        ((ArrayList) this.f).add(a40Var);
        a40Var.c.getClass();
        if (a40Var instanceof gc1) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public void b() {
        int iF;
        int size = ((ArrayList) this.f).size();
        int i = this.b + this.c + this.d;
        int i2 = i - this.e;
        dk dkVar = new dk(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                dkVar.f(i3, i3 + 1);
            } else {
                dkVar.f(i3, i3);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            a40 a40Var = (a40) ((ArrayList) this.f).get(i4);
            if (!(a40Var instanceof xt)) {
                ArrayList arrayList = (ArrayList) this.f;
                s72 s72Var = a40Var.d;
                int length = s72Var.i.length;
                s72 s72Var2 = new s72(length);
                for (int i5 = 0; i5 < length; i5++) {
                    r72 r72VarE = (r72) s72Var.e(i5);
                    r72 r72Var = null;
                    if (r72VarE != null) {
                        try {
                            iF = ((v01) dkVar.j).f(r72VarE.h);
                        } catch (IndexOutOfBoundsException unused) {
                            iF = -1;
                        }
                        if (iF >= 0) {
                            if (r72VarE.h != iF) {
                                r72VarE = r72.e(iF, r72VarE.i);
                            }
                            r72Var = r72VarE;
                        } else {
                            c80.j("no mapping specified for register");
                        }
                    }
                    s72Var2.f(i5, r72Var);
                }
                s72Var2.h = false;
                if (!s72Var2.equals(s72Var)) {
                    s72Var = s72Var2;
                }
                arrayList.set(i4, a40Var.k(s72Var));
            }
        }
        this.d++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        int size = ((ArrayList) this.f).size();
        for (int i = 0; i < size; i++) {
            a40 a40Var = (a40) ((ArrayList) this.f).get(i);
            if (!(a40Var instanceof xt)) {
                ((ArrayList) this.f).set(i, a40Var.j(1));
            }
        }
        this.c++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i, int i2) {
        long jI = fg1.i(i, i2);
        ((sx1) this.f).k("", i, i2);
        long jP0 = sp0.p0(fg1.i(this.b, this.c), jI);
        n(f13.f(jP0));
        m(f13.e(jP0));
        int i3 = this.d;
        if (i3 != -1) {
            long jP02 = sp0.p0(fg1.i(i3, this.e), jI);
            if (f13.c(jP02)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = f13.f(jP02);
                this.e = f13.e(jP02);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oa0 e(a40 a40Var) {
        s72 s72Var = a40Var.d;
        oa0 oa0Var = a40Var.b;
        oa0 oa0VarF = f(a40Var.k(s72Var.j(oa0Var.e, null)), oa0Var);
        if (oa0VarF != null) {
            return oa0VarF;
        }
        throw new x70(null, "No expanded opcode for " + a40Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oa0 f(a40 a40Var, oa0 oa0Var) {
        oa0 oa0Var2;
        while (oa0Var != null) {
            if (oa0Var.d.J(a40Var)) {
                return oa0Var;
            }
            oa0[] oa0VarArr = pa0.a;
            int i = oa0Var.c;
            if (i == -1) {
                oa0Var = null;
            } else {
                try {
                    oa0Var2 = pa0.a[i + 1];
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (oa0Var2 == null) {
                    s.j("bogus opcode");
                    return null;
                }
                oa0Var = oa0Var2;
            }
        }
        return oa0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public char g(int i) {
        sx1 sx1Var = (sx1) this.f;
        bo0 bo0Var = (bo0) sx1Var.e;
        if (bo0Var == null) {
            return ((String) sx1Var.d).charAt(i);
        }
        if (i < sx1Var.b) {
            return ((String) sx1Var.d).charAt(i);
        }
        int iB = bo0Var.b - bo0Var.b();
        int i2 = sx1Var.b;
        if (i >= iB + i2) {
            return ((String) sx1Var.d).charAt(i - ((iB - sx1Var.c) + i2));
        }
        int i3 = i - i2;
        int i4 = bo0Var.c;
        char[] cArr = (char[]) bo0Var.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + bo0Var.d];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f13 h() {
        int i = this.d;
        if (i != -1) {
            return new f13(fg1.i(i, this.e));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(String str, int i, int i2) {
        sx1 sx1Var = (sx1) this.f;
        if (i < 0 || i > sx1Var.b()) {
            c80.q(vi0.n(i, "start (", ") offset is outside of text region "), sx1Var.b());
            return;
        }
        if (i2 < 0 || i2 > sx1Var.b()) {
            c80.q(vi0.n(i2, "end (", ") offset is outside of text region "), sx1Var.b());
            return;
        }
        if (i > i2) {
            s.j(vi0.h("Do not set reversed range: ", i, " > ", i2));
            return;
        }
        sx1Var.k(str, i, i2);
        n(str.length() + i);
        m(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public boolean j(oa0[] oa0VarArr) {
        int i = this.c;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = ((ArrayList) this.f).size();
            int i2 = this.c;
            for (int i3 = 0; i3 < size; i3++) {
                a40 a40Var = (a40) ((ArrayList) this.f).get(i3);
                oa0 oa0Var = oa0VarArr[i3];
                oa0 oa0VarF = f(a40Var, oa0Var);
                if (oa0VarF == null) {
                    ?? X = e(a40Var).d.x(a40Var);
                    boolean z2 = a40Var.b.e;
                    ?? r6 = a40Var.d;
                    int length = r6.i.length;
                    int iD = (!z2 || X.get(0)) ? 0 : ((r72) r6.e(0)).d();
                    int iD2 = 0;
                    for (?? r9 = z2; r9 < length; r9++) {
                        if (!X.get(r9)) {
                            iD2 += ((r72) r6.e(r9)).d();
                        }
                    }
                    int iMax = Math.max(iD2, iD);
                    if (iMax > i2) {
                        i2 = iMax;
                    }
                } else {
                    if (oa0Var == oa0VarF) {
                    }
                }
                oa0VarArr[i3] = oa0VarF;
            }
            if (i >= i2) {
                this.c = i;
                return z;
            }
            int i4 = i2 - i;
            int size2 = ((ArrayList) this.f).size();
            for (int i5 = 0; i5 < size2; i5++) {
                a40 a40Var2 = (a40) ((ArrayList) this.f).get(i5);
                if (!(a40Var2 instanceof xt)) {
                    ((ArrayList) this.f).set(i5, a40Var2.j(i4));
                }
            }
            z = true;
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(int i, int i2) {
        sx1 sx1Var = (sx1) this.f;
        if (i < 0 || i > sx1Var.b()) {
            c80.q(vi0.n(i, "start (", ") offset is outside of text region "), sx1Var.b());
            return;
        }
        if (i2 < 0 || i2 > sx1Var.b()) {
            c80.q(vi0.n(i2, "end (", ") offset is outside of text region "), sx1Var.b());
        } else if (i >= i2) {
            s.j(vi0.h("Do not set reversed or empty range: ", i, " > ", i2));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(int i, int i2) {
        sx1 sx1Var = (sx1) this.f;
        if (i < 0 || i > sx1Var.b()) {
            c80.q(vi0.n(i, "start (", ") offset is outside of text region "), sx1Var.b());
            return;
        }
        if (i2 < 0 || i2 > sx1Var.b()) {
            c80.q(vi0.n(i2, "end (", ") offset is outside of text region "), sx1Var.b());
        } else if (i > i2) {
            s.j(vi0.h("Do not set reversed range: ", i, " > ", i2));
        } else {
            n(i);
            m(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m(int i) {
        if (!(i >= 0)) {
            lz0.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void n(int i) {
        if (!(i >= 0)) {
            lz0.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 0:
                return ((sx1) this.f).toString();
            default:
                return super.toString();
        }
    }

    public sd0(z8 z8Var, int i, int i2, int i3) {
        this.a = 1;
        this.b = i2;
        this.f = new ArrayList(i);
        this.c = -1;
        this.e = i3;
    }
}
