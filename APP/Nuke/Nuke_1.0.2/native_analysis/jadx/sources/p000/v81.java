package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v81 {

    /* JADX INFO: renamed from: a */
    public final zj1 f11821a;

    /* JADX INFO: renamed from: b */
    public final t81 f11822b;

    /* JADX INFO: renamed from: c */
    public final c81 f11823c;

    /* JADX INFO: renamed from: d */
    public final long f11824d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ c81 f11825e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f11826f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11827g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0583pk f11828h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11829i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f11830j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f11831k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ d91 f11832l;

    public v81(long j, t81 t81Var, c81 c81Var, int i, int i2, C0583pk c0583pk, int i3, int i4, long j2, d91 d91Var) {
        this.f11825e = c81Var;
        this.f11826f = i;
        this.f11827g = i2;
        this.f11828h = c0583pk;
        this.f11829i = i3;
        this.f11830j = i4;
        this.f11831k = j2;
        this.f11832l = d91Var;
        zj1 zj1Var = y01.f13265a;
        this.f11821a = new zj1();
        this.f11822b = t81Var;
        this.f11823c = c81Var;
        this.f11824d = AbstractC0258gz.m2028b(0, C0221fz.m1763h(j), 0, Integer.MAX_VALUE, 5);
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
    /* JADX INFO: renamed from: a */
    public final y81 m5654a(long j, int i) {
        long j2;
        List list;
        t81 t81Var = this.f11822b;
        Object objM5134d = t81Var.m5134d(i);
        Object objM5132b = t81Var.m5132b(i);
        zj1 zj1Var = this.f11821a;
        List list2 = (List) zj1Var.m6022b(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            c81 c81Var = this.f11823c;
            t81 t81Var2 = c81Var.f1230j;
            zj1 zj1Var2 = c81Var.f1231k;
            List listMo2409I = (List) zj1Var2.m6022b(i);
            if (listMo2409I == null) {
                Object objM5134d2 = t81Var2.m5134d(i);
                listMo2409I = c81Var.f1229i.mo2409I(c81Var.f1228h.m6387a(i, objM5134d2, t81Var2.m5132b(i)), objM5134d2);
                zj1Var2.m6421h(i, listMo2409I);
            }
            int size = listMo2409I.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((if1) listMo2409I.get(i2)).mo2340e(j));
            }
            j2 = j;
            zj1Var.m6421h(i, arrayList);
            list = arrayList;
        }
        return new y81(i, list, this.f11828h, this.f11825e.f1229i.getLayoutDirection(), this.f11829i, this.f11830j, i != this.f11826f + (-1) ? this.f11827g : 0, this.f11831k, objM5134d, objM5132b, this.f11832l.f1929n, j2);
    }
}
