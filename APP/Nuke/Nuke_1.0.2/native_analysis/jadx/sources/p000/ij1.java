package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ij1 implements f40, e40 {

    /* JADX INFO: renamed from: h */
    public final ArrayList f4650h;

    /* JADX INFO: renamed from: i */
    public final a22 f4651i;

    /* JADX INFO: renamed from: j */
    public int f4652j;

    /* JADX INFO: renamed from: k */
    public i32 f4653k;

    /* JADX INFO: renamed from: l */
    public e40 f4654l;

    /* JADX INFO: renamed from: m */
    public List f4655m;

    /* JADX INFO: renamed from: n */
    public boolean f4656n;

    public ij1(ArrayList arrayList, a22 a22Var) {
        this.f4651i = a22Var;
        if (arrayList.isEmpty()) {
            C0676s.m4651j("Must not be empty.");
            throw null;
        }
        this.f4650h = arrayList;
        this.f4652j = 0;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        return ((f40) this.f4650h.get(0)).mo1371a();
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        List list = this.f4655m;
        if (list != null) {
            this.f4651i.mo18a(list);
        }
        this.f4655m = null;
        Iterator it = this.f4650h.iterator();
        while (it.hasNext()) {
            ((f40) it.next()).mo1372b();
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) {
        this.f4653k = i32Var;
        this.f4654l = e40Var;
        this.f4655m = (List) this.f4651i.mo19c();
        ((f40) this.f4650h.get(this.f4652j)).mo1373c(i32Var, this);
        if (this.f4656n) {
            cancel();
        }
    }

    @Override // p000.f40
    public final void cancel() {
        this.f4656n = true;
        Iterator it = this.f4650h.iterator();
        while (it.hasNext()) {
            ((f40) it.next()).cancel();
        }
    }

    @Override // p000.e40
    /* JADX INFO: renamed from: d */
    public final void mo635d(Exception exc) {
        List list = this.f4655m;
        fg1.m1642q("Argument must not be null", list);
        list.add(exc);
        m2358f();
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        return ((f40) this.f4650h.get(0)).mo1374e();
    }

    /* JADX INFO: renamed from: f */
    public final void m2358f() {
        if (this.f4656n) {
            return;
        }
        if (this.f4652j < this.f4650h.size() - 1) {
            this.f4652j++;
            mo1373c(this.f4653k, this.f4654l);
        } else {
            fg1.m1641p(this.f4655m);
            this.f4654l.mo635d(new xp0("Fetch failed", new ArrayList(this.f4655m)));
        }
    }

    @Override // p000.e40
    /* JADX INFO: renamed from: h */
    public final void mo636h(Object obj) {
        if (obj != null) {
            this.f4654l.mo636h(obj);
        } else {
            m2358f();
        }
    }
}
