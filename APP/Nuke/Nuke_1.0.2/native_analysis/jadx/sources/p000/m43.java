package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m43 implements bd0 {

    /* JADX INFO: renamed from: a */
    public final int f6472a;

    /* JADX INFO: renamed from: b */
    public final gd0 f6473b;

    public m43(int i, gd0 gd0Var) {
        this.f6472a = i;
        this.f6473b = gd0Var;
    }

    @Override // p000.InterfaceC0273hd
    /* JADX INFO: renamed from: a */
    public final x93 mo512a(n43 n43Var) {
        return new C0133dk(this.f6472a, this.f6473b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m43)) {
            return false;
        }
        m43 m43Var = (m43) obj;
        return m43Var.f6472a == this.f6472a && t11.m5086l(m43Var.f6473b, this.f6473b);
    }

    public final int hashCode() {
        return (this.f6473b.hashCode() + (this.f6472a * 31)) * 31;
    }

    @Override // p000.bd0, p000.InterfaceC0273hd
    /* JADX INFO: renamed from: a */
    public final z93 mo512a(n43 n43Var) {
        return new C0133dk(this.f6472a, this.f6473b);
    }
}
