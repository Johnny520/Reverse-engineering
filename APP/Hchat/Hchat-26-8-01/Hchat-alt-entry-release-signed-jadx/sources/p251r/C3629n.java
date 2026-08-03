package p251r;

import java.util.ArrayList;
import java.util.List;
import p069f.AbstractC0944l;
import p069f.C0965w;
import p265s.C3828f0;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p308v1.InterfaceC4409m0;
import p356y0.C5843e;
import p356y0.C5844f;

/* JADX INFO: renamed from: r.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3629n {

    /* JADX INFO: renamed from: a */
    public final C0965w f11711a;

    /* JADX INFO: renamed from: b */
    public final C3626k f11712b;

    /* JADX INFO: renamed from: c */
    public final C3828f0 f11713c;

    /* JADX INFO: renamed from: d */
    public final long f11714d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f11715e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3828f0 f11716f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11717g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11718h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5843e f11719i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5844f f11720j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f11721k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11722l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f11723m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C3641z f11724n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3629n(long j3, boolean z9, C3626k c3626k, C3828f0 c3828f0, int i9, int i10, C5843e c5843e, C5844f c5844f, int i11, int i12, long j4, C3641z c3641z) {
        this.f11715e = z9;
        this.f11716f = c3828f0;
        this.f11717g = i9;
        this.f11718h = i10;
        this.f11719i = c5843e;
        this.f11720j = c5844f;
        this.f11721k = i11;
        this.f11722l = i12;
        this.f11723m = j4;
        this.f11724n = c3641z;
        C0965w c0965w = AbstractC0944l.f2974a;
        this.f11711a = new C0965w();
        this.f11712b = c3626k;
        this.f11713c = c3828f0;
        this.f11714d = AbstractC4232b.m8509b(0, z9 ? C4231a.m8504h(j3) : Integer.MAX_VALUE, 0, z9 ? Integer.MAX_VALUE : C4231a.m8503g(j3), 5);
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
    /* JADX INFO: renamed from: a */
    public final C3632q m7609a(int i9, long j3) {
        C3626k c3626k = this.f11712b;
        Object objM7608d = c3626k.m7608d(i9);
        Object objM7606b = c3626k.m7606b(i9);
        C0965w c0965w = this.f11711a;
        List list = (List) c0965w.m2313b(i9);
        if (list == null) {
            C3828f0 c3828f0 = this.f11713c;
            C3626k c3626k2 = c3828f0.f12547i;
            C0965w c0965w2 = c3828f0.f12548j;
            List listMo8808N = (List) c0965w2.m2313b(i9);
            if (listMo8808N == null) {
                Object objM7608d2 = c3626k2.m7608d(i9);
                listMo8808N = c3828f0.f12546h.mo8808N(c3828f0.f12545g.m8004a(objM7608d2, i9, c3626k2.m7606b(i9)), objM7608d2);
                c0965w2.m2379h(i9, listMo8808N);
            }
            int size = listMo8808N.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((InterfaceC4409m0) listMo8808N.get(i10)).mo8831Q(j3));
            }
            c0965w.m2379h(i9, arrayList);
            list = arrayList;
        }
        return new C3632q(i9, list, this.f11715e, this.f11719i, this.f11720j, this.f11716f.f12546h.getLayoutDirection(), this.f11721k, this.f11722l, i9 != this.f11717g + (-1) ? this.f11718h : 0, this.f11723m, objM7608d, objM7606b, this.f11724n.f11811o, j3);
    }
}
