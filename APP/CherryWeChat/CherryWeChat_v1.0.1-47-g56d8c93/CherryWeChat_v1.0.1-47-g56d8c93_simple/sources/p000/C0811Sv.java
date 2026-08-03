package p000;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: Sv */
/* JADX INFO: loaded from: classes.dex */
public final class C0811Sv extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0811Sv f2565b = null;

    static {
        f2565b = new C0811Sv(new C1116Zz(AbstractC0295Gu.m625r(-2289217566773L), AbstractC0295Gu.m625r(-2310692403253L), false, AbstractC0295Gu.m625r(-2379411879989L), null, null, 116));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        LinkedHashMap r0 = AbstractC1257cG.f4258a;
        C1214bG r1 = (C1214bG) r0.get(AbstractC0295Gu.m625r(-588337505105973L));
        Method r2 = null;
        if (r1 == null) goto L5;
        Object r12 = r1.f4146a;
    L7:
        if ((r12 instanceof Method) == false) goto L9;
        Method r13 = (Method) r12;
    L10:
        C1214bG r3 = (C1214bG) r0.get(AbstractC0295Gu.m625r(-588449174255669L));
        if (r3 == null) goto L13;
        Object r32 = r3.f4146a;
    L15:
        if ((r32 instanceof Method) == false) goto L17;
        Method r33 = (Method) r32;
    L18:
        C1214bG r4 = (C1214bG) r0.get(AbstractC0295Gu.m625r(-589252333140021L));
        if (r4 == null) goto L21;
        Object r42 = r4.f4146a;
    L23:
        if ((r42 instanceof Method) == false) goto L25;
        Method r43 = (Method) r42;
    L26:
        C1214bG r02 = (C1214bG) r0.get(AbstractC0295Gu.m625r(-589119189153845L));
        if (r02 == null) goto L29;
        Object r03 = r02.f4146a;
    L31:
        if ((r03 instanceof Method) == false) goto L33;
        r2 = (Method) r03;
    L33:
        Iterator r04 = AbstractC2496sa.m4977b0(new Method[]{r13, r33, r43, r2}).iterator();
    L35:
        if (r04.hasNext() == false) goto L37;
        Method r14 = (Method) r04.next();
        C0848Tp r22 = new C0848Tp(19);
        AbstractC0295Gu.m625r(-577819130198069L);
        AbstractC0295Gu.m625r(-577849194969141L);
        new C1538iG(r14).m2917b(r22);
        goto L35
    L37:
        return;
    L29:
        r03 = null;
        goto L31
    L25:
        r43 = null;
        goto L26
    L21:
        r42 = null;
        goto L23
    L17:
        r33 = null;
        goto L18
    L13:
        r32 = null;
        goto L15
    L9:
        r13 = null;
        goto L10
    L5:
        r12 = null;
        goto L7
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-2409476651061L);
    }
}
