package p000;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: bu */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0068bu extends q43 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1014a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f1015b;

    /* JADX INFO: renamed from: c */
    public final Object f1016c;

    public C0068bu(ue1 ue1Var, gs1 gs1Var) {
        this.f1015b = ue1Var;
        this.f1016c = gs1Var;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        int i = this.f1014a;
        Object obj = this.f1016c;
        Object obj2 = this.f1015b;
        switch (i) {
            case 0:
                if (l41Var.m2814I() == 9) {
                    l41Var.m2810E();
                    return null;
                }
                Collection collection = (Collection) ((gs1) obj).mo2023a();
                l41Var.m2824b();
                while (l41Var.m2832p()) {
                    collection.add(((ue1) obj2).f11258c.mo97b(l41Var));
                }
                l41Var.m2828h();
                return collection;
            default:
                Class cls = (Class) obj2;
                Object objMo97b = ((l53) obj).f5943j.mo97b(l41Var);
                if (objMo97b == null || cls.isInstance(objMo97b)) {
                    return objMo97b;
                }
                throw new t31("Expected a " + cls.getName() + " but was " + objMo97b.getClass().getName() + "; at path " + l41Var.m2831o(true));
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        switch (this.f1014a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    o41Var.m3491c();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((ue1) this.f1015b).mo98c(o41Var, it.next());
                    }
                    o41Var.m3494h();
                } else {
                    o41Var.m3498p();
                }
                break;
            default:
                ((l53) this.f1016c).f5943j.mo98c(o41Var, obj);
                break;
        }
    }

    public C0068bu(l53 l53Var, Class cls) {
        this.f1016c = l53Var;
        this.f1015b = cls;
    }
}
