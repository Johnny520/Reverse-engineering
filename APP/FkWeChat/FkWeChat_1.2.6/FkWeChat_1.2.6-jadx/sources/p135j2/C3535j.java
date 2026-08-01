package p135j2;

import p121i3.C3173c;

/* JADX INFO: renamed from: j2.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3535j implements InterfaceC3552n0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC3563r f9776q;

    /* JADX INFO: renamed from: r */
    public final EnumC3569t f9777r;

    /* JADX INFO: renamed from: s */
    public final EnumC3572u f9778s;

    public C3535j(InterfaceC3563r interfaceC3563r, EnumC3569t enumC3569t, EnumC3572u enumC3572u) {
        this.f9776q = interfaceC3563r;
        this.f9777r = enumC3569t;
        this.f9778s = enumC3572u;
    }

    @Override // p135j2.InterfaceC3563r
    /* JADX INFO: renamed from: S */
    public int mo13146S(int i10) {
        return this.f9776q.mo13146S(i10);
    }

    @Override // p135j2.InterfaceC3563r
    /* JADX INFO: renamed from: W */
    public int mo13147W(int i10) {
        return this.f9776q.mo13147W(i10);
    }

    @Override // p135j2.InterfaceC3552n0
    /* JADX INFO: renamed from: X */
    public AbstractC3545l1 mo13148X(long j10) {
        EnumC3572u enumC3572u = this.f9778s;
        EnumC3572u enumC3572u2 = EnumC3572u.f9931q;
        EnumC3569t enumC3569t = this.f9777r;
        if (enumC3572u == enumC3572u2) {
            EnumC3569t enumC3569t2 = EnumC3569t.f9927r;
            InterfaceC3563r interfaceC3563r = this.f9776q;
            return new C3543l(enumC3569t == enumC3569t2 ? interfaceC3563r.mo13147W(C3173c.m11972k(j10)) : interfaceC3563r.mo13146S(C3173c.m11972k(j10)), C3173c.m11968g(j10) ? C3173c.m11972k(j10) : 32767);
        }
        EnumC3569t enumC3569t3 = EnumC3569t.f9927r;
        InterfaceC3563r interfaceC3563r2 = this.f9776q;
        return new C3543l(C3173c.m11969h(j10) ? C3173c.m11973l(j10) : 32767, enumC3569t == enumC3569t3 ? interfaceC3563r2.mo13150t(C3173c.m11973l(j10)) : interfaceC3563r2.mo13151z0(C3173c.m11973l(j10)));
    }

    @Override // p135j2.InterfaceC3563r
    /* JADX INFO: renamed from: o */
    public Object mo13149o() {
        return this.f9776q.mo13149o();
    }

    @Override // p135j2.InterfaceC3563r
    /* JADX INFO: renamed from: t */
    public int mo13150t(int i10) {
        return this.f9776q.mo13150t(i10);
    }

    @Override // p135j2.InterfaceC3563r
    /* JADX INFO: renamed from: z0 */
    public int mo13151z0(int i10) {
        return this.f9776q.mo13151z0(i10);
    }
}
