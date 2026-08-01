package p197m;

import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p136b0.C1843e;
import p158f0.C2085q;
import p170h1.C2214e;
import p186k.C2408E;

/* JADX INFO: renamed from: m.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2546f extends AbstractC1666k implements InterfaceC1604f {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2085q f8131e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f8132f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2559s f8133g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1843e f8134h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2546f(C2085q c2085q, Object obj, C2559s c2559s, C1843e c1843e) {
        super(3);
        this.f8131e = c2085q;
        this.f8132f = obj;
        this.f8133g = c2559s;
        this.f8134h = c1843e;
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
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        InterfaceC2564x interfaceC2564x = (InterfaceC2564x) obj;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((C1383r) interfaceC1373m).m2582f(interfaceC2564x) : ((C1383r) interfaceC1373m).m2586h(interfaceC2564x) ? 4 : 2;
        }
        C1383r c1383r = (C1383r) interfaceC1373m;
        if (c1383r.m2560O(iIntValue & 1, (iIntValue & 19) != 18)) {
            C2085q c2085q = this.f8131e;
            boolean zM2582f = c1383r.m2582f(c2085q);
            Object obj4 = this.f8132f;
            boolean zM2586h = zM2582f | c1383r.m2586h(obj4);
            C2559s c2559s = this.f8133g;
            boolean zM2586h2 = zM2586h | c1383r.m2586h(c2559s);
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (zM2586h2 || objM2558L == c1357e) {
                objM2558L = new C2214e(c2085q, obj4, c2559s, 2);
                c1383r.m2585g0(objM2558L);
            }
            AbstractC1385s.m2613c(interfaceC2564x, (InterfaceC1601c) objM2558L, c1383r);
            C2408E c2408e = c2559s.f8174c;
            AbstractC1665j.m2983c(interfaceC2564x, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            c2408e.m4278m(obj4, ((C2565y) interfaceC2564x).f8187a);
            Object objM2558L2 = c1383r.m2558L();
            if (objM2558L2 == c1357e) {
                objM2558L2 = new C2553m();
                c1383r.m2585g0(objM2558L2);
            }
            this.f8134h.mo1949l((C2553m) objM2558L2, obj4, c1383r, 0);
        } else {
            c1383r.m2563R();
        }
        return C0891q.f2780a;
    }
}
