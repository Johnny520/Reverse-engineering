package p099h;

import gg.AbstractC1417m;
import p016b1.C0167g;
import p069f.C0943k0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p266s0.C3874d;
import p276sf.C3967n;
import p322w0.C4665p;

/* JADX INFO: renamed from: h.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1458g extends AbstractC1417m implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4665p f4839g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4840h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1486t f4841i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3874d f4842j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458g(C4665p c4665p, Object obj, C1486t c1486t, C3874d c3874d) {
        super(3);
        this.f4839g = c4665p;
        this.f4840h = obj;
        this.f4841i = c1486t;
        this.f4842j = c3874d;
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
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        InterfaceC1444b0 interfaceC1444b0 = (InterfaceC1444b0) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? c1836h0.m4534f(interfaceC1444b0) : c1836h0.m4538h(interfaceC1444b0) ? 4 : 2;
        }
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
            C4665p c4665p = this.f4839g;
            boolean zM4534f = c1836h0.m4534f(c4665p);
            Object obj4 = this.f4840h;
            boolean zM4538h = zM4534f | c1836h0.m4538h(obj4);
            C1486t c1486t = this.f4841i;
            boolean zM4538h2 = zM4538h | c1836h0.m4538h(c1486t);
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (zM4538h2 || objM4514P == c1823e) {
                objM4514P = new C0167g(c4665p, obj4, c1486t, 2);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC1874r.m4621c(interfaceC1444b0, (InterfaceC1231l) objM4514P, c1836h0);
            C0943k0 c0943k0 = c1486t.f4937c;
            interfaceC1444b0.getClass();
            c0943k0.m2326m(obj4, ((C1447c0) interfaceC1444b0).f4802a);
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = new C1474n();
                c1836h0.m4545k0(objM4514P2);
            }
            this.f4842j.mo3355c((C1474n) objM4514P2, obj4, c1836h0, 0);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }
}
