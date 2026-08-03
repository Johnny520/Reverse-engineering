package p000;

import android.content.Context;

/* JADX INFO: renamed from: Y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1036Y4 {

    /* JADX INFO: renamed from: a */
    public static final C1036Y4 f3308a;

    /* JADX INFO: renamed from: b */
    public static boolean f3309b;

    static {
        AbstractC0295Gu.m625r(-388548511397941L);
        f3308a = new C1036Y4();
    }

    /* JADX INFO: renamed from: a */
    public static void m1982a(Context context, InterfaceC1416fj interfaceC1416fj, InterfaceC1416fj interfaceC1416fj2, boolean z) {
        AbstractC0295Gu.m625r(-390056044918837L);
        if (f3309b) {
            AbstractC0295Gu.m625r(-390090404657205L);
            AbstractC0295Gu.m625r(-390163419101237L);
            return;
        }
        if (!z && !m1983b(context)) {
            AbstractC0295Gu.m625r(-390219253676085L);
            AbstractC0295Gu.m625r(-390292268120117L);
            interfaceC1416fj.mo90g(AbstractC0295Gu.m625r(-390322332891189L));
            return;
        }
        String strM2791I = C1456gf.m2791I();
        C2214m0.f7706a.getClass();
        C2171l0 c2171l0M4456c = C2214m0.m4456c(context, strM2791I);
        if (c2171l0M4456c == null) {
            AbstractC0295Gu.m625r(-390326627858485L);
            AbstractC0295Gu.m625r(-389849886488629L);
            interfaceC1416fj2.mo90g(AbstractC0295Gu.m625r(-389931490867253L));
        } else {
            f3309b = true;
            AbstractC0295Gu.m625r(-389983030474805L);
            AbstractC0295Gu.m625r(-388406777477173L);
            C1498hd c1498hd = AbstractC1499he.f5282a;
            AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C0950W4(strM2791I, c2171l0M4456c, interfaceC1416fj, interfaceC1416fj2, (InterfaceC0190Eb) null, 1), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1983b(Context context) {
        boolean z;
        AbstractC0295Gu.m625r(-389686677731381L);
        String strM2791I = C1456gf.m2791I();
        C0183EA.f539a.getClass();
        if (AbstractC0585Nj.m1134a(C0183EA.f540b, strM2791I)) {
            C2214m0.f7706a.getClass();
            z = !C2214m0.m4455b(context, strM2791I);
        }
        AbstractC0295Gu.m625r(-389721037469749L);
        AbstractC0295Gu.m625r(-389244296099893L);
        AbstractC0295Gu.m625r(-389334490413109L);
        AbstractC0295Gu.m625r(-389390324987957L);
        C2214m0.f7706a.getClass();
        C2214m0.m4455b(context, strM2791I);
        AbstractC0295Gu.m625r(-389450454530101L);
        return z;
    }
}
