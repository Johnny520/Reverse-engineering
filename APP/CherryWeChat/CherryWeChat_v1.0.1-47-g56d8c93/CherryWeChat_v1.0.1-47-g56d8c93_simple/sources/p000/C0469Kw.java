package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: Kw */
/* JADX INFO: loaded from: classes.dex */
public final class C0469Kw extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0469Kw f1524b = null;

    static {
        C2648vx r1 = new C2648vx(AbstractC0295Gu.m625r(-3100966385717L), AbstractC0295Gu.m625r(-3165390895157L), AbstractC0295Gu.m625r(-3204045600821L), null, null, 24);
        f1524b = new C0469Kw(new C1116Zz(AbstractC0295Gu.m625r(-3225520437301L), AbstractC0295Gu.m625r(-3246995273781L), false, AbstractC0295Gu.m625r(-2761663969333L), null, r1, 80));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        C1214bG r0 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-818354478643253L));
        Method r1 = null;
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Method) == false) goto L9;
        r1 = (Method) r02;
    L9:
        C0848Tp r03 = new C0848Tp(20);
        AbstractC0295Gu.m625r(-577819130198069L);
        AbstractC0295Gu.m625r(-577849194969141L);
        new C1538iG(r1).m2917b(r03);
        Method r04 = AbstractC1257cG.m2377e();
        C0848Tp r12 = new C0848Tp(21);
        AbstractC0295Gu.m625r(-577819130198069L);
        AbstractC0295Gu.m625r(-577849194969141L);
        new C1538iG(r04).m2917b(r12);
        return;
    L5:
        r02 = null;
        goto L7
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-2778843838517L);
    }
}
