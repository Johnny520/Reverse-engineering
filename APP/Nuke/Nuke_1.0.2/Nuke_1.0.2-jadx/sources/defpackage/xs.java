package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xs extends iy0 {
    public final r30 i;
    public final int j;
    public final r30 k;
    public f63 l;
    public final q30 m;
    public final vs n;
    public re0 o;
    public final zd p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: d63 */
    /* JADX WARN: Multi-variable type inference failed */
    public xs(r30 r30Var, int i, r30 r30Var2, d63 d63Var, q30 q30Var) {
        if (r30Var == null) {
            um2.f("thisClass == null");
            throw null;
        }
        if (d63Var == 0) {
            um2.f("interfaces == null");
            throw null;
        }
        this.i = r30Var;
        this.j = i;
        this.k = r30Var2;
        this.l = ((kj0) d63Var).i.length == 0 ? null : new f63(d63Var);
        this.m = q30Var;
        this.n = new vs(r30Var);
        this.o = null;
        this.p = new zd(4, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        b42 b42Var = (b42) z70Var.i;
        eh1 eh1Var = (eh1) z70Var.g;
        eh1 eh1Var2 = (eh1) z70Var.c;
        b42 b42Var2 = (b42) z70Var.h;
        b42Var.p(this.i);
        vs vsVar = this.n;
        if (!vsVar.p()) {
            ((eh1) z70Var.f).k(vsVar);
            x20 x20VarO = vsVar.o();
            if (x20VarO != null) {
                this.o = (re0) eh1Var.l(new re0(x20VarO));
            }
        }
        r30 r30Var = this.k;
        if (r30Var != null) {
            b42Var.p(r30Var);
        }
        f63 f63Var = this.l;
        if (f63Var != null) {
            this.l = (f63) eh1Var2.l(f63Var);
        }
        q30 q30Var = this.m;
        if (q30Var != null) {
            b42Var2.o(q30Var);
        }
        this.p.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_CLASS_DEF_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final int c() {
        return 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: d63 */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.f21
    public final void d(z70 z70Var, yn ynVar) {
        boolean zD = ynVar.d();
        b42 b42Var = (b42) z70Var.i;
        r30 r30Var = this.i;
        int iM = b42Var.m(r30Var);
        r30 r30Var2 = this.k;
        int iM2 = r30Var2 == null ? -1 : b42Var.m(r30Var2);
        f63 f63Var = this.l;
        int iF = f63Var == null ? 0 : f63Var.f();
        this.p.getClass();
        q30 q30Var = this.m;
        int iL = q30Var != null ? ((b42) z70Var.h).l(q30Var) : -1;
        vs vsVar = this.n;
        int iF2 = vsVar.p() ? 0 : vsVar.f();
        re0 re0Var = this.o;
        int iF3 = re0Var == null ? 0 : re0Var.f();
        int i = this.j;
        if (zD) {
            ynVar.c(f() + ' ' + r30Var.h.b(), 0);
            ynVar.c("  class_idx:           ".concat(pp0.K(iM)), 4);
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(up0.x(i, 30257, 1));
            ynVar.c(sb.toString(), 4);
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(pp0.K(iM2));
            sb2.append(" // ");
            sb2.append(r30Var2 == null ? "<none>" : r30Var2.h.b());
            ynVar.c(sb2.toString(), 4);
            ynVar.c("  interfaces_off:      ".concat(pp0.K(iF)), 4);
            if (iF != 0) {
                d63 d63Var = this.l.l;
                int length = ((kj0) d63Var).i.length;
                for (int i2 = 0; i2 < length; i2++) {
                    ynVar.c("    " + d63Var.getType(i2).b(), 0);
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(pp0.K(iL));
            sb3.append(" // ");
            sb3.append(q30Var != null ? q30Var.b() : "<none>");
            ynVar.c(sb3.toString(), 4);
            ynVar.c("  annotations_off:     ".concat(pp0.K(0)), 4);
            ynVar.c("  class_data_off:      ".concat(pp0.K(iF2)), 4);
            ynVar.c("  static_values_off:   ".concat(pp0.K(iF3)), 4);
        }
        ynVar.j(iM);
        ynVar.j(i);
        ynVar.j(iM2);
        ynVar.j(iF);
        ynVar.j(iL);
        ynVar.j(0);
        ynVar.j(iF2);
        ynVar.j(iF3);
    }
}
