package p000;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: renamed from: ds */
/* JADX INFO: loaded from: classes.dex */
public final class C1337ds extends AbstractC0929Vk {

    /* JADX INFO: renamed from: a */
    public static final C1337ds f4821a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f4822b;

    static {
        AbstractC0295Gu.m625r(-92174293137461L);
        f4821a = new C1337ds();
        f4822b = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static void m2591c(Context context, int i, String str) {
        AbstractC0295Gu.m625r(-96628174223413L);
        int i2 = AbstractC1450gG.f5067a;
        Intent intent = new Intent(context, (Class<?>) AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-96662533961781L)));
        intent.putExtra(AbstractC0295Gu.m625r(-96357591283765L), i);
        if (str != null) {
            intent.putExtra(AbstractC0295Gu.m625r(-96417720825909L), str);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2592d(C1337ds c1337ds, Context context, int i) {
        c1337ds.getClass();
        m2591c(context, i, null);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        String strM625r = AbstractC0295Gu.m625r(-44916767979573L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int i = AbstractC1450gG.f5067a;
        C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
        c1538iG.m2921f(AbstractC0295Gu.m625r(-44611825301557L));
        c1538iG.m2916a(new C0848Tp(5));
        String strM625r2 = AbstractC0295Gu.m625r(-44650480007221L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG c1538iG2 = new C1538iG(AbstractC1406fG.m2718r0(strM625r2));
        c1538iG2.m2921f(AbstractC0295Gu.m625r(-96022583834677L));
        c1538iG2.m2916a(new C0848Tp(6));
        String strM625r3 = AbstractC0295Gu.m625r(-96065533507637L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG c1538iG3 = new C1538iG(AbstractC1406fG.m2718r0(strM625r3));
        c1538iG3.m2921f(AbstractC0295Gu.m625r(-95760590829621L));
        c1538iG3.m2916a(new C0848Tp(7));
        String strM625r4 = AbstractC0295Gu.m625r(-95833605273653L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG c1538iG4 = new C1538iG(AbstractC1406fG.m2718r0(strM625r4));
        C2703x8 c2703x8 = new C2703x8(16, 2);
        AbstractC0295Gu.m625r(-578008108759093L);
        c1538iG4.f5422d = c2703x8;
        C0848Tp c0848Tp = new C0848Tp(8);
        AbstractC0295Gu.m625r(-576599359486005L);
        c1538iG4.f5425g = c0848Tp;
        c1538iG4.m2917b(new C0848Tp(9));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-44238163146805L);
    }
}
