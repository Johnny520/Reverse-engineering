package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.C0168s;

/* JADX INFO: renamed from: e.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0049z extends AbstractC0203e {

    /* JADX INFO: renamed from: c */
    public static final C0049z f278c = null;

    static {
        f278c = new C0049z(0);
    }

    /* JADX INFO: renamed from: F */
    public static C0049z m215F(C0034k r4, int r5) {
        if (r5 == 1) goto L23;
        if (r5 != 2) goto L7;
    L11:
        int r52 = r4.m504B();
        AbstractC0048y[] r0 = new AbstractC0048y[r52];
        int r1 = 0;
    L12:
        if (r1 >= r52) goto L20;
        AbstractC0033j r2 = r4.m509l(r1);
        if ((r2 instanceof C0029f) == true) goto L19;
        C0168s r22 = r2.m139l();
        C0168s r3 = C0168s.f681a;
        if (r22.equals(r3) == true) goto L19;
        r3.getClass();
    L19:
        r1 = r1 + 1;
        goto L12
    L20:
        C0049z r42 = new C0049z(0);
        r42.m536g();
        return r42;
    L7:
        if (r5 == 3) goto L11;
        throw new IllegalArgumentException("bogus howMuch");
    L23:
        return f278c;
    }
}
