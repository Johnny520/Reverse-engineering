package p000;

/* JADX INFO: renamed from: dG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1319dG implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object[] f4781b;

    public /* synthetic */ C1319dG(Object[] r1, int r2) {
        this.f4780a = r2;
        this.f4781b = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r7) {
        Class[] r72 = (Class[]) r7;
        switch(this.f4780a) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-576869942425653L);
        int r0 = r72.length;
        Object[] r1 = this.f4781b;
        boolean r3 = false;
        if (r0 != r1.length) goto L20;
        int r02 = r1.length;
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L18;
        Object r4 = r1[r2];
        if (r4 == null) goto L17;
        if ((r4 instanceof Class) == false) goto L13;
        String r42 = ((Class) r4).getName();
    L15:
        if (r42.equals(r72[r2].getName()) == true) goto L17;
    L13:
        r42 = (String) r4;
    L17:
        r2 = r2 + 1;
        goto L7
    L18:
        r3 = true;
    L20:
        return Boolean.valueOf(r3);
    L21:
        AbstractC0295Gu.m625r(-578390360848437L);
        int r03 = r72.length;
        Object[] r12 = this.f4781b;
        boolean r32 = false;
        if (r03 != r12.length) goto L37;
        int r04 = r12.length;
        int r22 = 0;
    L24:
        if (r22 >= r04) goto L35;
        Object r43 = r12[r22];
        if (r43 == null) goto L34;
        if ((r43 instanceof Class) == false) goto L30;
        String r44 = ((Class) r43).getName();
    L32:
        if (r44.equals(r72[r22].getName()) == true) goto L34;
    L30:
        r44 = (String) r43;
    L34:
        r22 = r22 + 1;
        goto L24
    L35:
        r32 = true;
    L37:
        return Boolean.valueOf(r32);
    }
}
