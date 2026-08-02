package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c40 implements h40, e40 {
    public final List h;
    public final t40 i;
    public final g40 j;
    public int k = -1;
    public a51 l;
    public List m;
    public int n;
    public volatile ih1 o;
    public File p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c40(List list, t40 t40Var, g40 g40Var) {
        this.h = list;
        this.i = t40Var;
        this.j = g40Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h40
    public final boolean c() {
        while (true) {
            List list = this.m;
            boolean z = false;
            if (list != null && this.n < list.size()) {
                this.o = null;
                while (!z && this.n < this.m.size()) {
                    List list2 = this.m;
                    int i = this.n;
                    this.n = i + 1;
                    jh1 jh1Var = (jh1) list2.get(i);
                    File file = this.p;
                    t40 t40Var = this.i;
                    this.o = jh1Var.b(file, t40Var.e, t40Var.f, t40Var.i);
                    if (this.o != null && this.i.c(this.o.c.a()) != null) {
                        this.o.c.c(this.i.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.k + 1;
            this.k = i2;
            if (i2 >= this.h.size()) {
                return false;
            }
            a51 a51Var = (a51) this.h.get(this.k);
            t40 t40Var2 = this.i;
            File fileD = t40Var2.h.a().d(new d40(a51Var, t40Var2.n));
            this.p = fileD;
            if (fileD != null) {
                this.l = a51Var;
                this.m = this.i.c.a().f(fileD);
                this.n = 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h40
    public final void cancel() {
        ih1 ih1Var = this.o;
        if (ih1Var != null) {
            ih1Var.c.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e40
    public final void d(Exception exc) {
        this.j.b(this.l, exc, this.o.c, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e40
    public final void h(Object obj) {
        this.j.a(this.l, obj, this.o.c, 3, this.l);
    }
}
