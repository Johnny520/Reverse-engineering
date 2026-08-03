package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: S7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0781S7 extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0781S7 f2467b = null;

    static {
        C2648vx r1 = new C2648vx(AbstractC0295Gu.m625r(-251350076094517L), AbstractC0295Gu.m625r(-251440270407733L), AbstractC0295Gu.m625r(-251448860342325L), AbstractC0295Gu.m625r(-251483220080693L), new ViewOnClickListenerC1079Z4(1));
        f2467b = new C0781S7(new C1116Zz(AbstractC0295Gu.m625r(-249868312377397L), AbstractC0295Gu.m625r(-249889787213877L), false, AbstractC0295Gu.m625r(-249949916756021L), null, r1, 20));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        String r0 = AbstractC0295Gu.m625r(-249640679110709L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r4 = AbstractC1450gG.f5067a;
        C1538iG r3 = new C1538iG(AbstractC1406fG.m2718r0(r0));
        r3.m2921f(AbstractC0295Gu.m625r(-249838247606325L));
        r3.m2916a(new C0223F7(10));
        String r02 = AbstractC0295Gu.m625r(-250456722896949L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r1 = new C1538iG(AbstractC1406fG.m2718r0(r02));
        r1.m2921f(AbstractC0295Gu.m625r(-250645701457973L));
        r1.m2916a(new C0223F7(11));
        LinkedHashMap r03 = AbstractC1257cG.f4258a;
        C1214bG r32 = (C1214bG) r03.get(AbstractC0295Gu.m625r(-585889373747253L));
        Class r42 = null;
        if (r32 == null) goto L5;
        Object r33 = r32.f4146a;
    L7:
        if ((r33 instanceof Class) == false) goto L9;
        Class r34 = (Class) r33;
    L10:
        if (r34 == null) goto L20;
        C1214bG r04 = (C1214bG) r03.get(AbstractC0295Gu.m625r(-585889373747253L));
        if (r04 == null) goto L14;
        Object r05 = r04.f4146a;
    L16:
        if ((r05 instanceof Class) == false) goto L18;
        r42 = (Class) r05;
    L18:
        C1538iG r06 = new C1538iG(r42);
        Class r12 = Boolean.TYPE;
        Class r35 = Integer.TYPE;
        r06.m2922g(new Object[]{String.class, r35, r12, r12});
        r06.m2924i(r35);
        r06.m2916a(new C0223F7(12));
        return;
    L14:
        r05 = null;
        goto L16
    L20:
        return;
    L9:
        r34 = null;
        goto L10
    L5:
        r33 = null;
        goto L7
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-249975686559797L);
    }
}
