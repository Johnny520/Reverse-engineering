package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: dy */
/* JADX INFO: loaded from: classes.dex */
public final class C1343dy extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C1343dy f4836b = null;

    static {
        f4836b = new C1343dy(new C1116Zz(AbstractC0295Gu.m625r(-17476221925429L), AbstractC0295Gu.m625r(-17497696761909L), true, AbstractC0295Gu.m625r(-17566416238645L), AbstractC0295Gu.m625r(-17046725195829L), null, 96));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        C1214bG r0 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-588788476672053L));
        Method r1 = null;
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Method) == false) goto L9;
        r1 = (Method) r02;
    L9:
        C0556Mx r03 = new C0556Mx(4);
        AbstractC0295Gu.m625r(-577819130198069L);
        AbstractC0295Gu.m625r(-577849194969141L);
        new C1538iG(r1).m2917b(r03);
        return;
    L5:
        r02 = null;
        goto L7
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-17124034607157L);
    }
}
