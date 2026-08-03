package p222p;

import gg.AbstractC1416l;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: p.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3243o1 implements InterfaceC3252r1 {

    /* JADX INFO: renamed from: a */
    public final String f10338a;

    /* JADX INFO: renamed from: b */
    public final C1845j1 f10339b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3243o1(C3230k0 c3230k0, String str) {
        this.f10338a = str;
        this.f10339b = AbstractC1874r.m4639u(c3230k0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: a */
    public final int mo6854a(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        return m6931e().f10311c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: b */
    public final int mo6855b(InterfaceC4233c interfaceC4233c) {
        return m6931e().f10312d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: c */
    public final int mo6856c(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        return m6931e().f10309a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: d */
    public final int mo6857d(InterfaceC4233c interfaceC4233c) {
        return m6931e().f10310b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C3230k0 m6931e() {
        return (C3230k0) this.f10339b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3243o1) {
            return AbstractC1416l.m3825a(m6931e(), ((C3243o1) obj).m6931e());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m6932f(C3230k0 c3230k0) {
        this.f10339b.setValue(c3230k0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10338a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10338a);
        sb2.append("(left=");
        sb2.append(m6931e().f10309a);
        sb2.append(", top=");
        sb2.append(m6931e().f10310b);
        sb2.append(", right=");
        sb2.append(m6931e().f10311c);
        sb2.append(", bottom=");
        return AbstractC3199a.m6841n(sb2, m6931e().f10312d, ')');
    }
}
