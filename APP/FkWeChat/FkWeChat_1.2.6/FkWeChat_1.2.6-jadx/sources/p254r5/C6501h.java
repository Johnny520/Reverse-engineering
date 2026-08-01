package p254r5;

import bsh.C1259t2;
import p045d5.C1882d;
import p254r5.C6493d;
import p269s5.C7186a;

/* JADX INFO: renamed from: r5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6501h extends C6493d {
    public C6501h(C6493d.a aVar) {
        super(aVar);
    }

    /* JADX INFO: renamed from: n */
    public static C6501h m25769n(C6519x c6519x, C6521z c6521z, C1882d c1882d) {
        if (c6519x == null) {
            C1259t2.m5095a("bootstrapMethodHandle == null");
            return null;
        }
        if (c6521z == null) {
            C1259t2.m5095a("nat == null");
            return null;
        }
        C6493d.a aVar = new C6493d.a(c1882d.size() + 3);
        aVar.m25748F(0, c6519x);
        aVar.m25748F(1, c6521z.m25814p());
        aVar.m25748F(2, new C6488a0(C7186a.m28378c(c6521z.m25812k().m25741n())));
        for (int i10 = 0; i10 < c1882d.size(); i10++) {
            aVar.m25748F(i10 + 3, c1882d.get(i10));
        }
        aVar.mo6829t();
        return new C6501h(aVar);
    }

    @Override // p254r5.C6493d, p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        return m25746k().compareTo(((C6501h) abstractC6487a).m25746k());
    }

    @Override // p254r5.C6493d
    public boolean equals(Object obj) {
        if (obj instanceof C6501h) {
            return m25746k().equals(((C6501h) obj).m25746k());
        }
        return false;
    }

    @Override // p254r5.C6493d, p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return m25746k().m33884B("{", ", ", "}");
    }

    @Override // p254r5.C6493d, p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    @Override // p254r5.C6493d
    public int hashCode() {
        return m25746k().hashCode();
    }

    @Override // p254r5.C6493d, p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "call site";
    }

    @Override // p254r5.C6493d
    public String toString() {
        return m25746k().m33885C("call site{", ", ", "}");
    }
}
