package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m30 extends k63 {

    /* JADX INFO: renamed from: h */
    public final r30 f6455h;

    /* JADX INFO: renamed from: i */
    public final o30 f6456i;

    public m30(r30 r30Var, o30 o30Var) {
        if (r30Var == null) {
            um2.m5516f("definingClass == null");
            throw null;
        }
        this.f6455h = r30Var;
        this.f6456i = o30Var;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return this.f6455h.f9342h.mo23b() + '.' + this.f6456i.mo23b();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m30 m30Var = (m30) obj;
        return this.f6455h.equals(m30Var.f6455h) && this.f6456i.equals(m30Var.f6456i);
    }

    public final int hashCode() {
        return this.f6456i.hashCode() ^ (this.f6455h.hashCode() * 31);
    }

    public final String toString() {
        return mo24f() + '{' + mo23b() + '}';
    }
}
