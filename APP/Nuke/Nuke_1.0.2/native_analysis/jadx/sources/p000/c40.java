package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c40 implements h40, e40 {

    /* JADX INFO: renamed from: h */
    public final List f1127h;

    /* JADX INFO: renamed from: i */
    public final t40 f1128i;

    /* JADX INFO: renamed from: j */
    public final g40 f1129j;

    /* JADX INFO: renamed from: k */
    public int f1130k = -1;

    /* JADX INFO: renamed from: l */
    public a51 f1131l;

    /* JADX INFO: renamed from: m */
    public List f1132m;

    /* JADX INFO: renamed from: n */
    public int f1133n;

    /* JADX INFO: renamed from: o */
    public volatile ih1 f1134o;

    /* JADX INFO: renamed from: p */
    public File f1135p;

    public c40(List list, t40 t40Var, g40 g40Var) {
        this.f1127h = list;
        this.f1128i = t40Var;
        this.f1129j = g40Var;
    }

    @Override // p000.h40
    /* JADX INFO: renamed from: c */
    public final boolean mo634c() {
        while (true) {
            List list = this.f1132m;
            boolean z = false;
            if (list != null && this.f1133n < list.size()) {
                this.f1134o = null;
                while (!z && this.f1133n < this.f1132m.size()) {
                    List list2 = this.f1132m;
                    int i = this.f1133n;
                    this.f1133n = i + 1;
                    jh1 jh1Var = (jh1) list2.get(i);
                    File file = this.f1135p;
                    t40 t40Var = this.f1128i;
                    this.f1134o = jh1Var.mo236b(file, t40Var.f10541e, t40Var.f10542f, t40Var.f10545i);
                    if (this.f1134o != null && this.f1128i.m5118c(this.f1134o.f4618c.mo1371a()) != null) {
                        this.f1134o.f4618c.mo1373c(this.f1128i.f10551o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f1130k + 1;
            this.f1130k = i2;
            if (i2 >= this.f1127h.size()) {
                return false;
            }
            a51 a51Var = (a51) this.f1127h.get(this.f1130k);
            t40 t40Var2 = this.f1128i;
            File fileMo112d = t40Var2.f10544h.m145a().mo112d(new d40(a51Var, t40Var2.f10550n));
            this.f1135p = fileMo112d;
            if (fileMo112d != null) {
                this.f1131l = a51Var;
                this.f1132m = this.f1128i.f10539c.m5748a().m5646f(fileMo112d);
                this.f1133n = 0;
            }
        }
    }

    @Override // p000.h40
    public final void cancel() {
        ih1 ih1Var = this.f1134o;
        if (ih1Var != null) {
            ih1Var.f4618c.cancel();
        }
    }

    @Override // p000.e40
    /* JADX INFO: renamed from: d */
    public final void mo635d(Exception exc) {
        this.f1129j.mo1802b(this.f1131l, exc, this.f1134o.f4618c, 3);
    }

    @Override // p000.e40
    /* JADX INFO: renamed from: h */
    public final void mo636h(Object obj) {
        this.f1129j.mo1801a(this.f1131l, obj, this.f1134o.f4618c, 3, this.f1131l);
    }
}
