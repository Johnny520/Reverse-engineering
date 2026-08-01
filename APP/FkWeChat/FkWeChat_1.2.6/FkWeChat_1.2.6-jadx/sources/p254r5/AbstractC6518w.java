package p254r5;

import bsh.C1259t2;

/* JADX INFO: renamed from: r5.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6518w extends AbstractC6500g0 {

    /* JADX INFO: renamed from: q */
    public final C6496e0 f20439q;

    /* JADX INFO: renamed from: r */
    public final C6521z f20440r;

    public AbstractC6518w(C6496e0 c6496e0, C6521z c6521z) {
        if (c6496e0 == null) {
            C1259t2.m5095a("definingClass == null");
            throw null;
        }
        if (c6521z == null) {
            C1259t2.m5095a("nat == null");
            throw null;
        }
        this.f20439q = c6496e0;
        this.f20440r = c6521z;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        AbstractC6518w abstractC6518w = (AbstractC6518w) abstractC6487a;
        int iCompareTo = this.f20439q.compareTo(abstractC6518w.f20439q);
        return iCompareTo != 0 ? iCompareTo : this.f20440r.m25814p().compareTo(abstractC6518w.f20440r.m25814p());
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC6518w abstractC6518w = (AbstractC6518w) obj;
            if (this.f20439q.equals(abstractC6518w.f20439q) && this.f20440r.equals(abstractC6518w.f20440r)) {
                return true;
            }
        }
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public final String mo6828g() {
        return this.f20439q.mo6828g() + '.' + this.f20440r.mo6828g();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public final boolean mo25728h() {
        return false;
    }

    public final int hashCode() {
        return (this.f20439q.hashCode() * 31) ^ this.f20440r.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final C6496e0 m25802k() {
        return this.f20439q;
    }

    /* JADX INFO: renamed from: n */
    public final C6521z m25803n() {
        return this.f20440r;
    }

    public final String toString() {
        return mo25729j() + '{' + mo6828g() + '}';
    }
}
