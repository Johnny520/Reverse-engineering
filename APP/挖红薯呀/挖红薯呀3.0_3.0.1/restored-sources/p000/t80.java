package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class t80 {

    /* JADX INFO: renamed from: a */
    public final ug0 f5941a;

    /* JADX INFO: renamed from: b */
    public final r80 f5942b;

    /* JADX INFO: renamed from: c */
    public final s70 f5943c;

    /* JADX INFO: renamed from: d */
    public final long f5944d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s70 f5945e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f5946f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5947g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0239ga f5948h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5949i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5950j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f5951k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ c90 f5952l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t80(long j, r80 r80Var, s70 s70Var, int i, int i2, C0239ga c0239ga, int i3, int i4, long j2, c90 c90Var) {
        this.f5945e = s70Var;
        this.f5946f = i;
        this.f5947g = i2;
        this.f5948h = c0239ga;
        this.f5949i = i3;
        this.f5950j = i4;
        this.f5951k = j2;
        this.f5952l = c90Var;
        ug0 ug0Var = v20.f6389a;
        this.f5941a = new ug0();
        this.f5942b = r80Var;
        this.f5943c = s70Var;
        this.f5944d = AbstractC0654qj.m3255b(Integer.MAX_VALUE, C0617pj.m3136g(j), 5);
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
    public final w80 m4191a(int i, long j) {
        long j2;
        List list;
        r80 r80Var = this.f5942b;
        Object objMo2793c = r80Var.mo2793c(i);
        Object objMo2794d = r80Var.mo2794d(i);
        ug0 ug0Var = this.f5941a;
        List list2 = (List) ug0Var.m4248b(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            List listM4009a = this.f5943c.m4009a(i);
            int size = listM4009a.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((sd0) listM4009a.get(i2)).mo184e(j));
            }
            j2 = j;
            ug0Var.m4330i(i, arrayList);
            list = arrayList;
        }
        return new w80(i, list, this.f5948h, this.f5945e.f5665e.getLayoutDirection(), this.f5949i, this.f5950j, i != this.f5946f + (-1) ? this.f5947g : 0, this.f5951k, objMo2793c, objMo2794d, this.f5952l.f752n, j2);
    }
}
