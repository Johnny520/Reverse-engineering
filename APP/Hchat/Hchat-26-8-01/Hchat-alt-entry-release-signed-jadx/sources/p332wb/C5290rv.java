package p332wb;

import java.util.ArrayList;
import java.util.Set;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1237r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.rv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5290rv implements InterfaceC1237r {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ArrayList f20546g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f20547h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f20548i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5290rv(InterfaceC1809a1 interfaceC1809a1, ArrayList arrayList, boolean z9) {
        this.f20546g = arrayList;
        this.f20547h = interfaceC1809a1;
        this.f20548i = z9;
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
    @Override // p085fg.InterfaceC1237r
    /* JADX INFO: renamed from: c */
    public final Object mo3355c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i9;
        C3619d c3619d = (C3619d) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1836h0 c1836h0 = (C1836h0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i9 = (c1836h0.m4534f(c3619d) ? 4 : 2) | iIntValue2;
        } else {
            i9 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i9 |= c1836h0.m4530d(iIntValue) ? 32 : 16;
        }
        if (c1836h0.m4516S(i9 & 1, (i9 & 147) != 146)) {
            C5026jv c5026jv = (C5026jv) this.f20546g.get(iIntValue);
            c1836h0.m4525a0(1985782921);
            C5491y2 c5491y2 = C5491y2.f22068p;
            InterfaceC1809a1 interfaceC1809a1 = this.f20547h;
            boolean zContains = ((Set) interfaceC1809a1.getValue()).contains(c5026jv.f18249a);
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4538h(c5026jv);
            boolean z9 = this.f20548i;
            boolean zM4536g = zM4534f | c1836h0.m4536g(z9);
            Object objM4514P = c1836h0.m4514P();
            if (zM4536g || objM4514P == C1851l.f6155a) {
                objM4514P = new C5257qv(c5026jv, z9, interfaceC1809a1);
                c1836h0.m4545k0(objM4514P);
            }
            c5491y2.m9893h(c5026jv, zContains, (InterfaceC1220a) objM4514P, c1836h0, 3072);
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }
}
