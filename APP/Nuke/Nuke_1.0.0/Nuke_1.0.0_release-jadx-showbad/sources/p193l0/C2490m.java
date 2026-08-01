package p193l0;

import p011B4.AbstractC0231b;
import p029F0.C0404i;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p169h0.C2194c;
import p169h0.C2199h;
import p204n0.C2686e;
import p211o0.C2753l;
import p239t0.AbstractC3207b;

/* JADX INFO: renamed from: l0.m */
/* JADX INFO: loaded from: classes.dex */
final class C2490m extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3207b f7991a;

    /* JADX INFO: renamed from: b */
    public final C2753l f7992b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2490m(AbstractC3207b abstractC3207b, C2753l c2753l) {
        this.f7991a = abstractC3207b;
        this.f7992b = c2753l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2199h c2199h = C2194c.f7164h;
        C2491n c2491n = new C2491n();
        c2491n.f7993r = this.f7991a;
        c2491n.f7994s = true;
        c2491n.f7995t = c2199h;
        c2491n.f7996u = C0404i.f1228a;
        c2491n.f7997v = 1.0f;
        c2491n.f7998w = this.f7992b;
        return c2491n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2490m)) {
            return false;
        }
        C2490m c2490m = (C2490m) obj;
        if (!AbstractC1665j.m2981a(this.f7991a, c2490m.f7991a)) {
            return false;
        }
        C2199h c2199h = C2194c.f7164h;
        if (!c2199h.equals(c2199h)) {
            return false;
        }
        Object obj2 = C0404i.f1228a;
        return obj2.equals(obj2) && Float.compare(1.0f, 1.0f) == 0 && AbstractC1665j.m2981a(this.f7992b, c2490m.f7992b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2491n c2491n = (C2491n) abstractC2206o;
        boolean z5 = c2491n.f7994s;
        AbstractC3207b abstractC3207b = this.f7991a;
        boolean z6 = (z5 && C2686e.m4661a(c2491n.f7993r.mo5483d(), abstractC3207b.mo5483d())) ? false : true;
        c2491n.f7993r = abstractC3207b;
        c2491n.f7994s = true;
        c2491n.f7995t = C2194c.f7164h;
        c2491n.f7996u = C0404i.f1228a;
        c2491n.f7997v = 1.0f;
        c2491n.f7998w = this.f7992b;
        if (z6) {
            AbstractC0601k.m1035k(c2491n);
        }
        AbstractC0601k.m1034j(c2491n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM390a = AbstractC0231b.m390a(1.0f, (C0404i.f1228a.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + AbstractC0231b.m395f(this.f7991a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C2753l c2753l = this.f7992b;
        return iM390a + (c2753l == null ? 0 : c2753l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PainterElement(painter=" + this.f7991a + ", sizeToIntrinsics=true, alignment=" + C2194c.f7164h + ", contentScale=" + C0404i.f1228a + ", alpha=1.0, colorFilter=" + this.f7992b + ')';
    }
}
