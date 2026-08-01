package p254r5;

import bsh.C1259t2;
import p269s5.C7188c;

/* JADX INFO: renamed from: r5.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6521z extends AbstractC6487a {

    /* JADX INFO: renamed from: s */
    public static final C6521z f20444s = new C6521z(new C6492c0("TYPE"), new C6492c0("Ljava/lang/Class;"));

    /* JADX INFO: renamed from: q */
    public final C6492c0 f20445q;

    /* JADX INFO: renamed from: r */
    public final C6492c0 f20446r;

    public C6521z(C6492c0 c6492c0, C6492c0 c6492c02) {
        if (c6492c0 == null) {
            C1259t2.m5095a("name == null");
            throw null;
        }
        if (c6492c02 == null) {
            C1259t2.m5095a("descriptor == null");
            throw null;
        }
        this.f20445q = c6492c0;
        this.f20446r = c6492c02;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        C6521z c6521z = (C6521z) abstractC6487a;
        int iCompareTo = this.f20445q.compareTo(c6521z.f20445q);
        return iCompareTo != 0 ? iCompareTo : this.f20446r.compareTo(c6521z.f20446r);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6521z)) {
            return false;
        }
        C6521z c6521z = (C6521z) obj;
        return this.f20445q.equals(c6521z.f20445q) && this.f20446r.equals(c6521z.f20446r);
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f20445q.mo6828g() + ':' + this.f20446r.mo6828g();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    public int hashCode() {
        return (this.f20445q.hashCode() * 31) ^ this.f20446r.hashCode();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "nat";
    }

    /* JADX INFO: renamed from: k */
    public C6492c0 m25812k() {
        return this.f20446r;
    }

    /* JADX INFO: renamed from: n */
    public C7188c m25813n() {
        return C7188c.m28404v(this.f20446r.m25741n());
    }

    /* JADX INFO: renamed from: p */
    public C6492c0 m25814p() {
        return this.f20445q;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m25815s() {
        return this.f20445q.m25741n().equals("<clinit>");
    }

    /* JADX INFO: renamed from: t */
    public final boolean m25816t() {
        return this.f20445q.m25741n().equals("<init>");
    }

    public String toString() {
        return "nat{" + mo6828g() + '}';
    }
}
