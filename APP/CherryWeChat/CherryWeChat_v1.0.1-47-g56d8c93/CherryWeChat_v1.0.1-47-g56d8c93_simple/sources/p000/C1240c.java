package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: classes.dex */
public final class C1240c extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C1240c f4218b = null;

    /* JADX INFO: renamed from: c */
    public static Field f4219c;

    static {
        f4218b = new C1240c(new C1116Zz(AbstractC0295Gu.m625r(-189287798667317L), AbstractC0295Gu.m625r(-189309273503797L), false, AbstractC0295Gu.m625r(-189369403045941L), AbstractC0295Gu.m625r(-189386582915125L), null, 96));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        String r0 = AbstractC0295Gu.m625r(-190035122976821L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r2 = AbstractC1450gG.f5067a;
        C1538iG r1 = new C1538iG(AbstractC1406fG.m2718r0(r0));
        r1.m2921f(AbstractC0295Gu.m625r(-190211216635957L));
        r1.m2917b(new C1197b(0));
        LinkedHashMap r02 = AbstractC1257cG.f4258a;
        C1214bG r12 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-586391884920885L));
        Method r22 = null;
        if (r12 == null) goto L5;
        Object r13 = r12.f4146a;
    L7:
        if ((r13 instanceof Method) == false) goto L9;
        Method r14 = (Method) r13;
    L10:
        C1197b r3 = new C1197b(3);
        AbstractC0295Gu.m625r(-577819130198069L);
        AbstractC0295Gu.m625r(-577849194969141L);
        new C1538iG(r14).m2917b(r3);
        C1214bG r15 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-586507849037877L));
        if (r15 == null) goto L13;
        Object r16 = r15.f4146a;
    L15:
        if ((r16 instanceof Method) == false) goto L17;
        Method r17 = (Method) r16;
    L18:
        Class<?> r18 = r17.getDeclaringClass();
        AbstractC0295Gu.m625r(-189682935658549L);
        C1197b r32 = new C1197b(1);
        AbstractC0295Gu.m625r(-579696030906421L);
        AbstractC0295Gu.m625r(-580275851491381L);
        AbstractC0295Gu.m625r(-579988088682549L);
        C2428qs r8 = new C2428qs(11, r18);
        AbstractC0295Gu.m625r(-578764023003189L);
        r8.f8522c = r32;
        r8.m4866E();
        C1214bG r03 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-586095532177461L));
        if (r03 == null) goto L21;
        Object r04 = r03.f4146a;
    L23:
        if ((r04 instanceof Method) == false) goto L25;
        r22 = (Method) r04;
    L25:
        C1197b r05 = new C1197b(2);
        AbstractC0295Gu.m625r(-577819130198069L);
        AbstractC0295Gu.m625r(-577849194969141L);
        new C1538iG(r22).m2917b(r05);
        return;
    L21:
        r04 = null;
        goto L23
    L17:
        r17 = null;
        goto L18
    L13:
        r16 = null;
        goto L15
    L9:
        r14 = null;
        goto L10
    L5:
        r13 = null;
        goto L7
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-190005058205749L);
    }
}
