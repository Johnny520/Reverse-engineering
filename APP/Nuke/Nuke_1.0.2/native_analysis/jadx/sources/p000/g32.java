package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g32 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final String f3296a;

    /* JADX INFO: renamed from: b */
    public final f32 f3297b;

    public g32(String str, f32 f32Var) {
        f32Var.getClass();
        this.f3296a = str;
        this.f3297b = f32Var;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: a */
    public final int mo249a(String str) {
        str.getClass();
        m1792g();
        throw null;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final String mo250b() {
        return this.f3296a;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: c */
    public final s11 mo251c() {
        return this.f3297b;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final int mo252d() {
        return 0;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final String mo253e(int i) {
        m1792g();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g32)) {
            return false;
        }
        g32 g32Var = (g32) obj;
        return this.f3296a.equals(g32Var.f3296a) && t11.m5086l(this.f3297b, g32Var.f3297b);
    }

    /* JADX INFO: renamed from: g */
    public final void m1792g() {
        throw new IllegalStateException(hk1.m2211j(new StringBuilder("Primitive descriptor "), this.f3296a, " does not have elements"));
    }

    public final int hashCode() {
        return (this.f3297b.hashCode() * 31) + this.f3296a.hashCode();
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: i */
    public final List mo255i(int i) {
        m1792g();
        throw null;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: j */
    public final yo2 mo256j(int i) {
        m1792g();
        throw null;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: k */
    public final boolean mo257k(int i) {
        m1792g();
        throw null;
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("PrimitiveDescriptor("), this.f3296a, ')');
    }
}
