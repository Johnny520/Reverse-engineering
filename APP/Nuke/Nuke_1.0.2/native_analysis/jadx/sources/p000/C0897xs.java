package p000;

/* JADX INFO: renamed from: xs */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0897xs extends iy0 {

    /* JADX INFO: renamed from: i */
    public final r30 f13147i;

    /* JADX INFO: renamed from: j */
    public final int f13148j;

    /* JADX INFO: renamed from: k */
    public final r30 f13149k;

    /* JADX INFO: renamed from: l */
    public f63 f13150l;

    /* JADX INFO: renamed from: m */
    public final q30 f13151m;

    /* JADX INFO: renamed from: n */
    public final C0821vs f13152n;

    /* JADX INFO: renamed from: o */
    public re0 f13153o;

    /* JADX INFO: renamed from: p */
    public final C0958zd f13154p;

    /* JADX WARN: Multi-variable type inference failed */
    public C0897xs(r30 r30Var, int i, r30 r30Var2, d63 d63Var, q30 q30Var) {
        if (r30Var == null) {
            um2.m5516f("thisClass == null");
            throw null;
        }
        if (d63Var == 0) {
            um2.m5516f("interfaces == null");
            throw null;
        }
        this.f13147i = r30Var;
        this.f13148j = i;
        this.f13149k = r30Var2;
        this.f13150l = ((kj0) d63Var).f5590i.length == 0 ? null : new f63(d63Var);
        this.f13151m = q30Var;
        this.f13152n = new C0821vs(r30Var);
        this.f13153o = null;
        this.f13154p = new C0958zd(4, -1);
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        b42 b42Var = (b42) z70Var.f13758i;
        eh1 eh1Var = (eh1) z70Var.f13756g;
        eh1 eh1Var2 = (eh1) z70Var.f13752c;
        b42 b42Var2 = (b42) z70Var.f13757h;
        b42Var.m404p(this.f13147i);
        C0821vs c0821vs = this.f13152n;
        if (!c0821vs.m5794p()) {
            ((eh1) z70Var.f13755f).m1353k(c0821vs);
            x20 x20VarM5793o = c0821vs.m5793o();
            if (x20VarM5793o != null) {
                this.f13153o = (re0) eh1Var.m1354l(new re0(x20VarM5793o));
            }
        }
        r30 r30Var = this.f13149k;
        if (r30Var != null) {
            b42Var.m404p(r30Var);
        }
        f63 f63Var = this.f13150l;
        if (f63Var != null) {
            this.f13150l = (f63) eh1Var2.m1354l(f63Var);
        }
        q30 q30Var = this.f13151m;
        if (q30Var != null) {
            b42Var2.m403o(q30Var);
        }
        this.f13154p.getClass();
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_CLASS_DEF_ITEM;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: c */
    public final int mo70c() {
        return 32;
    }

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
    @Override // p000.f21
    /* JADX INFO: renamed from: d */
    public final void mo71d(z70 z70Var, C0929yn c0929yn) {
        boolean zM6293d = c0929yn.m6293d();
        b42 b42Var = (b42) z70Var.f13758i;
        r30 r30Var = this.f13147i;
        int iM401m = b42Var.m401m(r30Var);
        r30 r30Var2 = this.f13149k;
        int iM401m2 = r30Var2 == null ? -1 : b42Var.m401m(r30Var2);
        f63 f63Var = this.f13150l;
        int iM6177f = f63Var == null ? 0 : f63Var.m6177f();
        this.f13154p.getClass();
        q30 q30Var = this.f13151m;
        int iM400l = q30Var != null ? ((b42) z70Var.f13757h).m400l(q30Var) : -1;
        C0821vs c0821vs = this.f13152n;
        int iM6177f2 = c0821vs.m5794p() ? 0 : c0821vs.m6177f();
        re0 re0Var = this.f13153o;
        int iM6177f3 = re0Var == null ? 0 : re0Var.m6177f();
        int i = this.f13148j;
        if (zM6293d) {
            c0929yn.m6292c(m2416f() + ' ' + r30Var.f9342h.mo23b(), 0);
            c0929yn.m6292c("  class_idx:           ".concat(pp0.m3899K(iM401m)), 4);
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(up0.m5558x(i, 30257, 1));
            c0929yn.m6292c(sb.toString(), 4);
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(pp0.m3899K(iM401m2));
            sb2.append(" // ");
            sb2.append(r30Var2 == null ? "<none>" : r30Var2.f9342h.mo23b());
            c0929yn.m6292c(sb2.toString(), 4);
            c0929yn.m6292c("  interfaces_off:      ".concat(pp0.m3899K(iM6177f)), 4);
            if (iM6177f != 0) {
                d63 d63Var = this.f13150l.f2823l;
                int length = ((kj0) d63Var).f5590i.length;
                for (int i2 = 0; i2 < length; i2++) {
                    c0929yn.m6292c("    " + d63Var.getType(i2).mo23b(), 0);
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(pp0.m3899K(iM400l));
            sb3.append(" // ");
            sb3.append(q30Var != null ? q30Var.mo23b() : "<none>");
            c0929yn.m6292c(sb3.toString(), 4);
            c0929yn.m6292c("  annotations_off:     ".concat(pp0.m3899K(0)), 4);
            c0929yn.m6292c("  class_data_off:      ".concat(pp0.m3899K(iM6177f2)), 4);
            c0929yn.m6292c("  static_values_off:   ".concat(pp0.m3899K(iM6177f3)), 4);
        }
        c0929yn.m6298j(iM401m);
        c0929yn.m6298j(i);
        c0929yn.m6298j(iM401m2);
        c0929yn.m6298j(iM6177f);
        c0929yn.m6298j(iM400l);
        c0929yn.m6298j(0);
        c0929yn.m6298j(iM6177f2);
        c0929yn.m6298j(iM6177f3);
    }
}
