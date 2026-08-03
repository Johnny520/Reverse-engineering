package p000;

import android.content.Context;

/* JADX INFO: renamed from: Y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1036Y4 {

    /* JADX INFO: renamed from: a */
    public static final C1036Y4 f3308a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f3309b;

    static {
        AbstractC0295Gu.m625r(-388548511397941L);
        f3308a = new C1036Y4();
    }

    /* JADX INFO: renamed from: a */
    public static void m1982a(Context r7, InterfaceC1416fj r8, InterfaceC1416fj r9, boolean r10) {
        AbstractC0295Gu.m625r(-390056044918837L);
        if (f3309b == false) goto L6;
        AbstractC0295Gu.m625r(-390090404657205L);
        AbstractC0295Gu.m625r(-390163419101237L);
        return;
    L6:
        if (r10 == false) goto L8;
    L11:
        String r1 = C1456gf.m2791I();
        C2214m0.f7706a.getClass();
        C2171l0 r2 = C2214m0.m4456c(r7, r1);
        if (r2 != null) goto L15;
        AbstractC0295Gu.m625r(-390326627858485L);
        AbstractC0295Gu.m625r(-389849886488629L);
        r9.mo90g(AbstractC0295Gu.m625r(-389931490867253L));
        return;
    L15:
        f3309b = true;
        AbstractC0295Gu.m625r(-389983030474805L);
        AbstractC0295Gu.m625r(-388406777477173L);
        C1498hd r72 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C0950W4(r1, r2, r8, r9, null, 1), 3);
        return;
    L8:
        if (m1983b(r7) == true) goto L11;
        AbstractC0295Gu.m625r(-390219253676085L);
        AbstractC0295Gu.m625r(-390292268120117L);
        r8.mo90g(AbstractC0295Gu.m625r(-390322332891189L));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1983b(Context r4) {
        AbstractC0295Gu.m625r(-389686677731381L);
        String r0 = C1456gf.m2791I();
        C0183EA.f539a.getClass();
        if (AbstractC0585Nj.m1134a(C0183EA.f540b, r0) == false) goto L8;
        C2214m0.f7706a.getClass();
        if (C2214m0.m4455b(r4, r0) == false) goto L8;
        boolean r1 = false;
    L9:
        AbstractC0295Gu.m625r(-389721037469749L);
        AbstractC0295Gu.m625r(-389244296099893L);
        AbstractC0295Gu.m625r(-389334490413109L);
        AbstractC0295Gu.m625r(-389390324987957L);
        C2214m0.f7706a.getClass();
        C2214m0.m4455b(r4, r0);
        AbstractC0295Gu.m625r(-389450454530101L);
        return r1;
    L8:
        r1 = true;
        goto L9
    }
}
