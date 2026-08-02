package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zo2 implements yo2, InterfaceC0701so {

    /* JADX INFO: renamed from: a */
    public final yo2 f13998a;

    /* JADX INFO: renamed from: b */
    public final String f13999b;

    /* JADX INFO: renamed from: c */
    public final Set f14000c;

    public zo2(yo2 yo2Var) {
        yo2Var.getClass();
        this.f13998a = yo2Var;
        this.f13999b = yo2Var.mo250b() + '?';
        this.f14000c = AbstractC0738tl.m5314m(yo2Var);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: a */
    public final int mo249a(String str) {
        str.getClass();
        return this.f13998a.mo249a(str);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final String mo250b() {
        return this.f13999b;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: c */
    public final s11 mo251c() {
        return this.f13998a.mo251c();
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final int mo252d() {
        return this.f13998a.mo252d();
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final String mo253e(int i) {
        return this.f13998a.mo253e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zo2) {
            return t11.m5086l(this.f13998a, ((zo2) obj).f13998a);
        }
        return false;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final boolean mo362f() {
        return this.f13998a.mo362f();
    }

    @Override // p000.InterfaceC0701so
    /* JADX INFO: renamed from: g */
    public final Set mo254g() {
        return this.f14000c;
    }

    @Override // p000.yo2
    public final List getAnnotations() {
        return this.f13998a.getAnnotations();
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: h */
    public final boolean mo363h() {
        return true;
    }

    public final int hashCode() {
        return this.f13998a.hashCode() * 31;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: i */
    public final List mo255i(int i) {
        return this.f13998a.mo255i(i);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: j */
    public final yo2 mo256j(int i) {
        return this.f13998a.mo256j(i);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: k */
    public final boolean mo257k(int i) {
        return this.f13998a.mo257k(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13998a);
        sb.append('?');
        return sb.toString();
    }
}
