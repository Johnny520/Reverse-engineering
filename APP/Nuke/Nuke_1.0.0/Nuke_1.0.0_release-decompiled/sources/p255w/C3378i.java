package p255w;

import java.util.ArrayList;
import java.util.List;
import p029F0.InterfaceC0376N;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p169h0.C2197f;
import p186k.AbstractC2429k;
import p186k.C2439u;
import p260x.C3442y;

/* JADX INFO: renamed from: w.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3378i {

    /* JADX INFO: renamed from: a */
    public final C2439u f10499a;

    /* JADX INFO: renamed from: b */
    public final C3377h f10500b;

    /* JADX INFO: renamed from: c */
    public final C3442y f10501c;

    /* JADX INFO: renamed from: d */
    public final long f10502d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3442y f10503e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f10504f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10505g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2197f f10506h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f10507i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f10508j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f10509k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3385p f10510l;

    public C3378i(long j5, C3377h c3377h, C3442y c3442y, int i5, int i6, C2197f c2197f, int i7, int i8, long j6, C3385p c3385p) {
        this.f10503e = c3442y;
        this.f10504f = i5;
        this.f10505g = i6;
        this.f10506h = c2197f;
        this.f10507i = i7;
        this.f10508j = i8;
        this.f10509k = j6;
        this.f10510l = c3385p;
        C2439u c2439u = AbstractC2429k.f7850a;
        this.f10499a = new C2439u();
        this.f10500b = c3377h;
        this.f10501c = c3442y;
        this.f10502d = AbstractC2006b.m3685b(C2005a.m3680h(j5), Integer.MAX_VALUE, 5);
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
    public final C3381l m5613a(long j5, int i5) {
        long j6;
        C3377h c3377h = this.f10500b;
        Object objM5612d = c3377h.m5612d(i5);
        Object objM5610b = c3377h.m5610b(i5);
        C2439u c2439u = this.f10499a;
        List list = (List) c2439u.m4318b(i5);
        if (list != null) {
            j6 = j5;
        } else {
            C3442y c3442y = this.f10501c;
            C3377h c3377h2 = c3442y.f10757f;
            C2439u c2439u2 = c3442y.f10758g;
            List listMo603J = (List) c2439u2.m4318b(i5);
            if (listMo603J == null) {
                Object objM5612d2 = c3377h2.m5612d(i5);
                listMo603J = c3442y.f10756e.mo603J(c3442y.f10755d.m5703a(i5, objM5612d2, c3377h2.m5610b(i5)), objM5612d2);
                c2439u2.m4344h(i5, listMo603J);
            }
            int size = listMo603J.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(((InterfaceC0376N) listMo603J.get(i6)).mo648e(j5));
            }
            j6 = j5;
            c2439u.m4344h(i5, arrayList);
            list = arrayList;
        }
        return new C3381l(i5, list, this.f10506h, this.f10503e.f10756e.getLayoutDirection(), this.f10507i, this.f10508j, i5 != this.f10504f + (-1) ? this.f10505g : 0, this.f10509k, objM5612d, objM5610b, this.f10510l.f10572n, j6);
    }
}
