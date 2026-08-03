package p000;

/* JADX INFO: renamed from: Nr */
/* JADX INFO: loaded from: classes.dex */
public final class C0593Nr implements InterfaceC2253mx {

    /* JADX INFO: renamed from: a */
    public final AbstractC0043B f1922a;

    /* JADX INFO: renamed from: b */
    public final C1044YC f1923b;

    /* JADX INFO: renamed from: c */
    public final C0882Ug f1924c;

    public C0593Nr(C1044YC r1, C0882Ug r2, AbstractC0043B r3) {
        this.f1923b = r1;
        r2.getClass();
        this.f1924c = r2;
        this.f1922a = r3;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: a */
    public final void mo1071a(Object r1, C0132D2 r2) {
        this.f1924c.getClass();
        AbstractC0213Ey.m417o(r1);
        throw null;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: b */
    public final int mo1072b(AbstractC2634vj r2) {
        this.f1923b.getClass();
        return r2.unknownFields.hashCode();
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: c */
    public final void mo1073c(Object r2, Object r3) {
        AbstractC2296nx.m4669w(this.f1923b, r2, r3);
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: d */
    public final void mo1074d(Object r3) {
        this.f1923b.getClass();
        ((AbstractC2634vj) r3).unknownFields.f3200e = false;
        this.f1924c.getClass();
        AbstractC0213Ey.m417o(r3);
        throw null;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: e */
    public final int mo1075e(AbstractC2634vj r8) {
        this.f1923b.getClass();
        C1001XC r82 = r8.unknownFields;
        int r0 = r82.f3199d;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        int r02 = 0;
        int r1 = 0;
    L7:
        if (r02 >= r82.f3196a) goto L9;
        int r2 = r82.f3197b[r02] >>> 3;
        AbstractC2744y6 r4 = (AbstractC2744y6) r82.f3198c[r02];
        r1 = r1 + (C2230ma.m4517J(3, r4) + ((C2230ma.m4525R(r2) + C2230ma.m4524Q(2)) + (C2230ma.m4524Q(1) * 2)));
        r02 = r02 + 1;
        goto L7
    L9:
        r82.f3199d = r1;
        return r1;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: f */
    public final boolean mo1076f(Object r2) {
        this.f1924c.getClass();
        AbstractC0213Ey.m417o(r2);
        throw null;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: g */
    public final void mo1077g(Object r1, byte[] r2, int r3, int r4, C0091C4 r5) {
        AbstractC2634vj r22 = (AbstractC2634vj) r1;
        if (r22.unknownFields != C1001XC.f3195f) goto L5;
        r22.unknownFields = C1001XC.m1891c();
    L5:
        r1.getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: h */
    public final boolean mo1078h(AbstractC2634vj r2, AbstractC2634vj r3) {
        this.f1923b.getClass();
        if (r2.unknownFields.equals(r3.unknownFields) == true) goto L6;
        return false;
    L6:
        return true;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: i */
    public final void mo1079i(Object r1, C2187la r2, C0839Tg r3) {
        this.f1923b.getClass();
        C1044YC.m1993a(r1);
        this.f1924c.getClass();
        r1.getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: j */
    public final Object mo1080j() {
        AbstractC0043B r0 = this.f1922a;
        if ((r0 instanceof AbstractC2634vj) == false) goto L7;
        return ((AbstractC2634vj) r0).m5157q();
    L7:
        return r0.mo65d().m5036c();
    }
}
