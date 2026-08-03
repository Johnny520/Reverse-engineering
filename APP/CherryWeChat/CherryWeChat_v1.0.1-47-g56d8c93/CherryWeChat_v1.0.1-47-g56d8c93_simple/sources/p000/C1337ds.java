package p000;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: renamed from: ds */
/* JADX INFO: loaded from: classes.dex */
public final class C1337ds extends AbstractC0929Vk {

    /* JADX INFO: renamed from: a */
    public static final C1337ds f4821a = null;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f4822b = null;

    static {
        AbstractC0295Gu.m625r(-92174293137461L);
        f4821a = new C1337ds();
        f4822b = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static void m2591c(Context r3, int r4, String r5) {
        AbstractC0295Gu.m625r(-96628174223413L);
        int r1 = AbstractC1450gG.f5067a;
        Intent r0 = new Intent(r3, AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-96662533961781L)));
        r0.putExtra(AbstractC0295Gu.m625r(-96357591283765L), r4);
        if (r5 == null) goto L5;
        r0.putExtra(AbstractC0295Gu.m625r(-96417720825909L), r5);
    L5:
        r3.startActivity(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2592d(C1337ds r0, Context r1, int r2) {
        r0.getClass();
        m2591c(r1, r2, null);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        String r0 = AbstractC0295Gu.m625r(-44916767979573L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r4 = AbstractC1450gG.f5067a;
        C1538iG r3 = new C1538iG(AbstractC1406fG.m2718r0(r0));
        r3.m2921f(AbstractC0295Gu.m625r(-44611825301557L));
        r3.m2916a(new C0848Tp(5));
        String r02 = AbstractC0295Gu.m625r(-44650480007221L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r32 = new C1538iG(AbstractC1406fG.m2718r0(r02));
        r32.m2921f(AbstractC0295Gu.m625r(-96022583834677L));
        r32.m2916a(new C0848Tp(6));
        String r03 = AbstractC0295Gu.m625r(-96065533507637L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r33 = new C1538iG(AbstractC1406fG.m2718r0(r03));
        r33.m2921f(AbstractC0295Gu.m625r(-95760590829621L));
        r33.m2916a(new C0848Tp(7));
        String r04 = AbstractC0295Gu.m625r(-95833605273653L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r1 = new C1538iG(AbstractC1406fG.m2718r0(r04));
        C2703x8 r05 = new C2703x8(16, 2);
        AbstractC0295Gu.m625r(-578008108759093L);
        r1.f5422d = r05;
        C0848Tp r06 = new C0848Tp(8);
        AbstractC0295Gu.m625r(-576599359486005L);
        r1.f5425g = r06;
        r1.m2917b(new C0848Tp(9));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-44238163146805L);
    }
}
