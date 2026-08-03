package p000;

import android.content.SharedPreferences;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: M7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0524M7 extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0524M7 f1712b = null;

    /* JADX INFO: renamed from: c */
    public static SimpleDateFormat f1713c;

    static {
        C2648vx r1 = new C2648vx(AbstractC0295Gu.m625r(-254966438557749L), AbstractC0295Gu.m625r(-255078107707445L), AbstractC0295Gu.m625r(-254567006599221L), null, new ViewOnClickListenerC0481L7(0), 8);
        f1712b = new C0524M7(new C1116Zz(AbstractC0295Gu.m625r(-254588481435701L), AbstractC0295Gu.m625r(-254609956272181L), false, AbstractC0295Gu.m625r(-254691560650805L), AbstractC0295Gu.m625r(-254721625421877L), r1, 64));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        if (m2024e() == false) goto L10;
        SharedPreferences r1 = AbstractC0599Nx.f1939a;     // Catch: Throwable -> L7
        f1713c = new SimpleDateFormat(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-254807524767797L), AbstractC0295Gu.m625r(-253269926475829L)), Locale.getDefault());     // Catch: Throwable -> L7
        Method r0 = AbstractC1257cG.m2375c();
        C0223F7 r12 = new C0223F7(7);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r0).m2916a(r12);
        return;
    L11:
        return;
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-254751690192949L);
    }
}
