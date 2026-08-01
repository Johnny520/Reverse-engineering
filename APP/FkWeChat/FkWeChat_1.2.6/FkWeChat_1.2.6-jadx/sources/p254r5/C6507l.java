package p254r5;

import p269s5.C7188c;

/* JADX INFO: renamed from: r5.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6507l extends AbstractC6518w {

    /* JADX INFO: renamed from: s */
    public C6508m f20415s;

    public C6507l(C6521z c6521z) {
        super(new C6496e0(c6521z.m25813n()), c6521z);
        this.f20415s = null;
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return m25802k().m25760n();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "enum";
    }

    /* JADX INFO: renamed from: p */
    public C6508m m25778p() {
        if (this.f20415s == null) {
            this.f20415s = new C6508m(m25802k(), m25803n());
        }
        return this.f20415s;
    }
}
