package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ij1 implements f40, e40 {
    public final ArrayList h;
    public final a22 i;
    public int j;
    public i32 k;
    public e40 l;
    public List m;
    public boolean n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ij1(ArrayList arrayList, a22 a22Var) {
        this.i = a22Var;
        if (arrayList.isEmpty()) {
            s.j("Must not be empty.");
            throw null;
        }
        this.h = arrayList;
        this.j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final Class a() {
        return ((f40) this.h.get(0)).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void b() {
        List list = this.m;
        if (list != null) {
            this.i.a(list);
        }
        this.m = null;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((f40) it.next()).b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void c(i32 i32Var, e40 e40Var) {
        this.k = i32Var;
        this.l = e40Var;
        this.m = (List) this.i.c();
        ((f40) this.h.get(this.j)).c(i32Var, this);
        if (this.n) {
            cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void cancel() {
        this.n = true;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((f40) it.next()).cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e40
    public final void d(Exception exc) {
        List list = this.m;
        fg1.q("Argument must not be null", list);
        list.add(exc);
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final int e() {
        return ((f40) this.h.get(0)).e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        if (this.n) {
            return;
        }
        if (this.j < this.h.size() - 1) {
            this.j++;
            c(this.k, this.l);
        } else {
            fg1.p(this.m);
            this.l.d(new xp0("Fetch failed", new ArrayList(this.m)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e40
    public final void h(Object obj) {
        if (obj != null) {
            this.l.h(obj);
        } else {
            f();
        }
    }
}
