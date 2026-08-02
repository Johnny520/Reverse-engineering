package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v81 {
    public final zj1 a;
    public final t81 b;
    public final c81 c;
    public final long d;
    public final /* synthetic */ c81 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ pk h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ d91 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v81(long j, t81 t81Var, c81 c81Var, int i, int i2, pk pkVar, int i3, int i4, long j2, d91 d91Var) {
        this.e = c81Var;
        this.f = i;
        this.g = i2;
        this.h = pkVar;
        this.i = i3;
        this.j = i4;
        this.k = j2;
        this.l = d91Var;
        zj1 zj1Var = y01.a;
        this.a = new zj1();
        this.b = t81Var;
        this.c = c81Var;
        this.d = gz.b(0, fz.h(j), 0, Integer.MAX_VALUE, 5);
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
    public final y81 a(long j, int i) {
        long j2;
        List list;
        t81 t81Var = this.b;
        Object objD = t81Var.d(i);
        Object objB = t81Var.b(i);
        zj1 zj1Var = this.a;
        List list2 = (List) zj1Var.b(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            c81 c81Var = this.c;
            t81 t81Var2 = c81Var.j;
            zj1 zj1Var2 = c81Var.k;
            List listI = (List) zj1Var2.b(i);
            if (listI == null) {
                Object objD2 = t81Var2.d(i);
                listI = c81Var.i.I(c81Var.h.a(i, objD2, t81Var2.b(i)), objD2);
                zj1Var2.h(i, listI);
            }
            int size = listI.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((if1) listI.get(i2)).e(j));
            }
            j2 = j;
            zj1Var.h(i, arrayList);
            list = arrayList;
        }
        return new y81(i, list, this.h, this.e.i.getLayoutDirection(), this.i, this.j, i != this.f + (-1) ? this.g : 0, this.k, objD, objB, this.l.n, j2);
    }
}
