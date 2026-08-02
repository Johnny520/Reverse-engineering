package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bu extends q43 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bu(ue1 ue1Var, gs1 gs1Var) {
        this.b = ue1Var;
        this.c = gs1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (l41Var.I() == 9) {
                    l41Var.E();
                    return null;
                }
                Collection collection = (Collection) ((gs1) obj).a();
                l41Var.b();
                while (l41Var.p()) {
                    collection.add(((ue1) obj2).c.b(l41Var));
                }
                l41Var.h();
                return collection;
            default:
                Class cls = (Class) obj2;
                Object objB = ((l53) obj).j.b(l41Var);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new t31("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + l41Var.o(true));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    o41Var.c();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((ue1) this.b).c(o41Var, it.next());
                    }
                    o41Var.h();
                } else {
                    o41Var.p();
                }
                break;
            default:
                ((l53) this.c).j.c(o41Var, obj);
                break;
        }
    }

    public bu(l53 l53Var, Class cls) {
        this.c = l53Var;
        this.b = cls;
    }
}
