package p254r5;

import p269s5.C7188c;

/* JADX INFO: renamed from: r5.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6508m extends AbstractC6518w {
    public C6508m(C6496e0 c6496e0, C6521z c6521z) {
        super(c6496e0, c6521z);
    }

    /* JADX INFO: renamed from: p */
    public static C6508m m25779p(C7188c c7188c) {
        return new C6508m(C6496e0.m25756k(c7188c), C6521z.f20444s);
    }

    @Override // p254r5.AbstractC6518w, p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        int iMo25727c = super.mo25727c(abstractC6487a);
        return iMo25727c != 0 ? iMo25727c : m25803n().m25812k().compareTo(((C6508m) abstractC6487a).m25803n().m25812k());
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return m25803n().m25813n();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "field";
    }
}
