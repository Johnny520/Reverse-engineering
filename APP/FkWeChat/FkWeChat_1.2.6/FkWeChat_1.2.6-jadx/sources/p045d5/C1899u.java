package p045d5;

import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p309v5.AbstractC8826h;
import p376zd.C9987e;

/* JADX INFO: renamed from: d5.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1899u implements InterfaceC7189d {

    /* JADX INFO: renamed from: q */
    public final int f5281q;

    public C1899u(int i10) {
        if (i10 >= 0) {
            this.f5281q = i10;
        } else {
            C9987e.m38645a("subroutineAddress < 0");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m6840a() {
        return this.f5281q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1899u) && this.f5281q == ((C1899u) obj).f5281q;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return toString();
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23830I;
    }

    public int hashCode() {
        return this.f5281q;
    }

    @Override // p269s5.InterfaceC7189d
    /* JADX INFO: renamed from: i */
    public int mo6841i() {
        return C7188c.f23830I.mo6841i();
    }

    @Override // p269s5.InterfaceC7189d
    /* JADX INFO: renamed from: l */
    public boolean mo6842l() {
        return false;
    }

    @Override // p269s5.InterfaceC7189d
    /* JADX INFO: renamed from: m */
    public int mo6843m() {
        return C7188c.f23830I.mo6843m();
    }

    public String toString() {
        return "<addr:" + AbstractC8826h.m33898g(this.f5281q) + ">";
    }

    @Override // p269s5.InterfaceC7189d
    /* JADX INFO: renamed from: r */
    public InterfaceC7189d mo6844r() {
        return this;
    }
}
