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

    public C0593Nr(C1044YC c1044yc, C0882Ug c0882Ug, AbstractC0043B abstractC0043B) {
        this.f1923b = c1044yc;
        c0882Ug.getClass();
        this.f1924c = c0882Ug;
        this.f1922a = abstractC0043B;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: a */
    public final void mo1071a(Object obj, C0132D2 c0132d2) {
        this.f1924c.getClass();
        AbstractC0213Ey.m417o(obj);
        throw null;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: b */
    public final int mo1072b(AbstractC2634vj abstractC2634vj) {
        this.f1923b.getClass();
        return abstractC2634vj.unknownFields.hashCode();
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: c */
    public final void mo1073c(Object obj, Object obj2) {
        AbstractC2296nx.m4669w(this.f1923b, obj, obj2);
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: d */
    public final void mo1074d(Object obj) {
        this.f1923b.getClass();
        ((AbstractC2634vj) obj).unknownFields.f3200e = false;
        this.f1924c.getClass();
        AbstractC0213Ey.m417o(obj);
        throw null;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: e */
    public final int mo1075e(AbstractC2634vj abstractC2634vj) {
        this.f1923b.getClass();
        C1001XC c1001xc = abstractC2634vj.unknownFields;
        int i = c1001xc.f3199d;
        if (i != -1) {
            return i;
        }
        int iM4517J = 0;
        for (int i2 = 0; i2 < c1001xc.f3196a; i2++) {
            int i3 = c1001xc.f3197b[i2] >>> 3;
            iM4517J += C2230ma.m4517J(3, (AbstractC2744y6) c1001xc.f3198c[i2]) + C2230ma.m4525R(i3) + C2230ma.m4524Q(2) + (C2230ma.m4524Q(1) * 2);
        }
        c1001xc.f3199d = iM4517J;
        return iM4517J;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: f */
    public final boolean mo1076f(Object obj) {
        this.f1924c.getClass();
        AbstractC0213Ey.m417o(obj);
        throw null;
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: g */
    public final void mo1077g(Object obj, byte[] bArr, int i, int i2, C0091C4 c0091c4) {
        AbstractC2634vj abstractC2634vj = (AbstractC2634vj) obj;
        if (abstractC2634vj.unknownFields == C1001XC.f3195f) {
            abstractC2634vj.unknownFields = C1001XC.m1891c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: h */
    public final boolean mo1078h(AbstractC2634vj abstractC2634vj, AbstractC2634vj abstractC2634vj2) {
        this.f1923b.getClass();
        return abstractC2634vj.unknownFields.equals(abstractC2634vj2.unknownFields);
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: i */
    public final void mo1079i(Object obj, C2187la c2187la, C0839Tg c0839Tg) {
        this.f1923b.getClass();
        C1044YC.m1993a(obj);
        this.f1924c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC2253mx
    /* JADX INFO: renamed from: j */
    public final Object mo1080j() {
        AbstractC0043B abstractC0043B = this.f1922a;
        return abstractC0043B instanceof AbstractC2634vj ? ((AbstractC2634vj) abstractC0043B).m5157q() : abstractC0043B.mo65d().m5036c();
    }
}
