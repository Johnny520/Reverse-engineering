package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: rs */
/* JADX INFO: loaded from: classes.dex */
public final class C2471rs extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C2471rs f8696b = null;

    static {
        f8696b = new C2471rs(new C1116Zz(AbstractC0295Gu.m625r(-4806068402229L), AbstractC0295Gu.m625r(-4827543238709L), false, AbstractC0295Gu.m625r(-4904852650037L), null, null, 116));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        C1214bG r0 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-818912824391733L));
        Method r1 = null;
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Method) == false) goto L9;
        r1 = (Method) r02;
    L9:
        C0848Tp r03 = new C0848Tp(14);
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
        return AbstractC0295Gu.m625r(-4930622453813L);
    }
}
